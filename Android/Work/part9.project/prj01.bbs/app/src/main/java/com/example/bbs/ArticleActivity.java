package com.example.bbs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class ArticleActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ArticlePagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // TabLayout 설정
        mTabLayout = findViewById(R.id.tab_layout);
        mTabLayout.addTab(mTabLayout.newTab().setIcon(android.R.drawable.ic_dialog_email));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(android.R.drawable.ic_dialog_map));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(android.R.drawable.ic_dialog_dialer));

        mViewPager = findViewById(R.id.view_pager);
        mAdapter = new ArticlePagerAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOffscreenPageLimit(mAdapter.getCount() -1);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab){
                mViewPager.setCurrentItem(tab.getPosition(), true);
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab){

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

    }

    private class ArticlePagerAdapter extends FragmentPagerAdapter{

        private int mTabCount;

        public ArticlePagerAdapter(FragmentManager fm, int numberOfTabs){
            super(fm);
            this.mTabCount = numberOfTabs;
        }
        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return new FragmentArticleFree.newInstance("free", "");
                case 1:
                    return new FragmentArticleQna.newInstance(R.string.TILTE_ARTICLE_QNA, "");
                case 2:
                    return new Fragmentthree();

                default:
                    return null;

            }

        }

        @Override
        public int getCount() {
            return mTabCount;
        }

        @Override
        public Fragment getItem(int position){
            switch (fm);

        }

    }

}
