$(document).ajaxStart(function(){
	// 통신이 성공적으로 이루어졌을 때 이 함수를 타게 된다.
	$('body').prepend('<img src="/resources/images/loading.gif)/>');
});

$(document).ajaxComplete(function(data, textStatus, xhr){
	// 통신이 실패했을 때 이 함수를 타게 된다.
	$('body img[src$="loading.gif"]').remove();
});


$(document).ajaxError(function(xhr, textStatus, error){
	// 통신이 실패했어도 성공했어도 이 함수를 타게 된다.
	console.log(error);
});
