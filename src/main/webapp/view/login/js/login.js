$(function(){
	var userName = $.cookie('userName');
	var password = $.cookie('password');
	$("input[name=userName]").val(userName);
	$("input[name=password]").val(password);
	if(!password)
		$('input[name=remember]').prop('checked',true);
	//按回车登录
	$(document).keydown(function(e){ 
		var curKey = e.which; 
	    if(curKey == 13){ 
	    	$(".sub-btn").click(); 
	        return false; 
	    } 
    }); 
	//提交
	$(".sub-btn").on("click", function(){
		var userName = $.trim($("input[name=userName]").val());
		var password = $.trim($("input[name=password]").val());
		if(!userName){
			alert('请输入登录账号');
			return ;
		}
		if(!password){
			alert('请输入登录密码');
			return ;
		}
		
		$.ajax({
	        url: getBasePath()+"/doLogin.html",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: {"userName":userName, "pwd":password},
	        success: function (data) {
	        	if(data.code != 200){
	        		alert(data.data);
	        		return ;
	        	}
	        	$.cookie('userName', userName);
	        	if($('input[name=remember]').is(':checked')) {
	        		$.cookie('password', password);
	        	}else{
	        		$.cookie('password', '');
	        	}
	        	location.href = getBasePath()+"/index.html";
	        }
    	});
	})
});