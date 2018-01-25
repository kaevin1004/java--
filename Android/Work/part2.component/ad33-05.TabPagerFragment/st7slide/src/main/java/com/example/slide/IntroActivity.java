package com.example.slide;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private LinearLayout mLayoutDots;
    private Button mBtnSkip;
    private Button mBtnNext;

    private PrefManager mPref;
    private int[] mLayouts = {R.layout.welcome_slide1
                            , R.layout.welcome_slide2
                            , R.layout.welcome_slide3
                            , R.layout.welcome_slide4};
    private SlidePagerAdapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPref = new PrefManager(IntroActivity.this);

        if (mPref.isFirstTimeLaunch()){
            // intro 화면, 4개를 모두 본 경우에는 다시 IntroActivity가 출력되지 않게.

            launchmain();
        }

        setContentView(R.layout.activity_intro);

        mViewPager = findViewById(R.id.view_pager);
        mLayoutDots = findViewById(R.id.layout_dots);
        mBtnSkip = findViewById(R.id.btn_skip);
        mBtnNext = findViewById(R.id.btn_next);

        madapter = new SlidePagerAdapter(IntroActivity.this);
        mViewPager.setAdapter(madapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                addBottomDots(position);

                if (position == mLayouts.length -1){
                    mBtnNext.setText(R.string.end);

                }
                else {
                    mBtnNext.setText(R.string.next);

                }

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ButtonListener blistener = new ButtonListener();
        mBtnSkip.setOnClickListener(blistener);
        mBtnNext.setOnClickListener(blistener);


        addBottomDots(0);

    }

    private void addBottomDots(int currentPage) {
        TextView[] dots = new TextView[mLayouts.length];

        int [] colorActive = getResources().getIntArray(R.array.array_dot_active);
        int [] colorInactive = getResources().getIntArray(R.array.array_dot_inactive);

        mLayoutDots.removeAllViews();

        for(int i=0; i < mLayouts.length; i=i+1){
            dots[i] = new TextView(IntroActivity.this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorInactive[i]);
            mLayoutDots.addView(dots[i]);
        }
        dots[currentPage].setTextColor(colorActive[currentPage]);
    }

    private void launchmain() {
        mPref.setFirstTimeLaunch(true);
        android.content.Intent i = new android.content.Intent(IntroActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }

    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_skip:
                    launchmain();
                    break;
                case R.id.btn_next:
                    int current = mViewPager.getCurrentItem() + 1;
                    if (current < mLayouts.length){
                        mViewPager.setCurrentItem(current);
                    }
                    else{
                        launchmain();
                    }
                    break;
            }
        }
    }

    private  class SlidePagerAdapter extends PagerAdapter{

        private final LayoutInflater inflater;

        public SlidePagerAdapter(Context context){
            inflater = LayoutInflater.from(context);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position){

            View view = inflater.inflate(mLayouts[position], container, false);
            container.addView(view);
            return view;

        }

        @Override
        public int getCount() {
            return mLayouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object){
            container.removeView((View) object);
        }
    }


}
