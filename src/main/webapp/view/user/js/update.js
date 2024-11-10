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
		//密码
		data.password = $.trim($("input[name=password]").val());
		if(data.password == ''){
			showError('请输入密码!');
			return ;
		}
		//状态
		data.id = $.trim($("input[name=id]").val());
		$.ajax({
	        url: getBasePath() + "/user/update.html",
	        async : true,
	        type: "post",
	        dataType: "json",
	        data: data,
	        success: function (data) {
	        	if(data.code == 200){
	        		swal({
	 	      			   type: 'success',
	 	      			   title: "修改成功!",
	 	      			   showConfirmButton: false,
	 	      			   timer: 3000
	 	      		    })
	        		setTimeout(function(){
	 	        		location.href = getBasePath() + "/login.html";
	        		}, 3000); 
	        		
	        	}else{
	        		showError(data.data);
	        	}
	        }
	    });
	})
    bindDelEventForBranch();
});