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
	//删除
	$(".delete-btn").on("click", function(){
		var id = $(this).attr("data-id");
		swal({
	  		  title: '删除站台',
	  		  text: '确认要删除该站台吗?',
	  		  showCancelButton: true,
	  		  confirmButtonText: '确认',
	  		  cancelButtonText: '取消'
		  	}).then((result) => {
	  		    if(result.value){
	  		    	$.ajax({
	  			        url: getBasePath() + "/station/delete.html",
	  			        async : true,
	  			        type: "post",
	  			        dataType: "json",
	  			        data: {"id": id},
	  			        success: function (data) {
	  			        	if(data.code == 200){
	  			        		swal({
	  			 	      			   type: 'success',
	  			 	      			   title: "删除成功!",
	  			 	      			   showConfirmButton: false,
	  			 	      			   timer: 3000
	  			 	      		    })
	  			        		setTimeout(function(){
	  			        			$(".search-box button[type=submit]").trigger("click");
	  			        		}, 3000);

	  			        	}else{
	  			        		showError(data.data);
	  			        	}
	  			        }
	  			    });
	  		    }
	    })
	})
});