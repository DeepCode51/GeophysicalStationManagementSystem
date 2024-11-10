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
		//站台ID
		data.stationId = $.trim($("input[name=stationId]").val());
		//x学科
		data.type = $.trim($("input[name=type]").val());
		//详情内容
		var content = [];
		$(".row input").each(function(){
			content.push([$(this).attr("name"), $.trim($(this).val())]);
		});
		data.content = JSON.stringify(content);
		$.ajax({
	        url: getBasePath() + "/subject/add.html",
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
	 	        		location.href = getBasePath() + "/station/list.html";
	        		}, 3000); 
	        		
	        	}else{
	        		showError(data.data);
	        	}
	        }
	    });
	})
});