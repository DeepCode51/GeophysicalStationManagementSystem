$(function(){
    
    //显示错误信息
	var showError = function(msg){
		swal({
			  type: 'error',
			  title: msg,
			  showConfirmButton: false,
			  timer: 2000
		})
	}
	//提交
	$(".sub-btn").on("click", function(){
		var basePath = getBasePath();
		var data = {};
		//账号
		data.loginId = $.trim($("input[name=loginId]").val());
		if(data.loginId == ''){
			showError('请输入账号!');
			return ;
		}
		//密码
		data.password = $.trim($("input[name=password]").val());
		if(data.password == ''){
			showError('请输入密码!');
			return ;
		}
		$.ajax({
	        url: getBasePath() + "/admin/add.html",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        	if(data.code == 200){
	        		swal({
	 	      			   type: 'success',
	 	      			   title: "创建成功!",
	 	      			   showConfirmButton: false,
	 	      			   timer: 3000
	 	      		    })
	        		setTimeout(function(){
	 	        		location.href = getBasePath() + "/admin/list.html";
	        		}, 3000); 
	        		
	        	}else{
	        		showError(data.data);
	        	}
	        }
	    });
	})
});