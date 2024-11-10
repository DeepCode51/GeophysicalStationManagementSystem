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
	$("#submit").on("click", function(){
		var basePath = getBasePath();
		var data = {};
		//站台编号
		data.stationNo = $.trim($("input[name=stationNo]").val());
		if (!data.stationNo) {
			showError("请输入站台编号!")
			return;
		}
		//站台名称
		data.name = $.trim($("input[name=name]").val());
		if(!data.name ){
			showError('请输入站台名称!');
			return ;
		}
		//站台级别
		data.level = $.trim($("input[name=level]").val());

		//是否有人值守
		data.hasWatch = $.trim($("input[name=hasWatch]").val());
		//纬度
		data.lat = $.trim($("input[name=lat]").val());
		//经度
		data.lng = $.trim($("input[name=lng]").val());
		//高程
		data.elevation = $.trim($("input[name=elevation]").val());
		//建成时间
    data.buildTime = $.trim($("input[name=buildTime]").val());
		$.ajax({
	        url: getBasePath() + "/station/add.html",
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