$(function(){
	$(".menus > ul > li > a").on("click", function(){
		var that = $(this);
		if(that.siblings().is(":hidden")){
			that.find("i").removeClass("triangle_right").addClass("triangle_down");
	    }else{
		   that.find("i").removeClass("triangle_down").addClass("triangle_right");
	    }
		that.siblings().stop().slideToggle(150, "swing", function(){
		   
		})
	})
    $(".menus li a").on("click", function(){
    	var that = $(this);
    	$(".menus li a").removeClass("active");
    	that.addClass("active");
    })
    $(".topNaviLink").on("click", function(){
    	var $con = $(".header-box .userCenter-outer");
    	if($con.is(":hidden")){
    		$con.show();
    		return ;
    	}
    	$con.hide();
    })
    $(".header-box .userCenter-outer").on("click", function(){
    	$(this).hide();
    })
    $(".header-box .userCenter-outer .userCenter").on("click", function(){
    	return false;
    })
    //退出
    $("#logout").on("click", function(){
    	swal({
    		  title: '退出系统',
    		  text: '确认要退出系统吗?',
    		  showCancelButton: true,
    		  confirmButtonText: '确认',
    		  cancelButtonText: '取消'
    	}).then((result) => {
    		  if(result.value){
    			  $.ajax({
    			        url: getBasePath()+"/loginout.html",
    			        async : true,
    			        type: "post",
    			        dataType: "json",
    			        success: function (data) {
    			        	if(data.code != 200){
    			        		showError(data.data);
    			        		return ;
    			        	}
    			        	location.href = getBasePath()+"/login.html";
    			        }
    		    	});
    		  }
    	})
    })
	$("#update_passwd").on("click", function () {
		location.href= getBasePath() + "/user/updatePage.html";
  })
});