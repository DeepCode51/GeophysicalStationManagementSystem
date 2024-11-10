$(function(){
	var hander = function(t){
		var $self = $(t);
		var loaded = $self.attr("data-loaded");
		if(loaded == "true"){
			return ;
		}
		var url = $self.attr("data-url");
		var selValue = $self.attr("data-value");
		if(!url){
			if (typeof(selValue) != "undefined")
			    $self.val(selValue);
			return ;
		}
		//注意：不能放到ajax中
    	$self.attr("data-loaded", "true");
		$.ajax({
	        url: url,
	        async : true,
	        type: "post",
	        dataType: "json",
	        success: function (data) {
	        	var html = '';
	        	for(var i in data){
	        		var label = data[i][1];
	        		var value = data[i][0]
	        		html += '<option value="'+value+'" '+(selValue && value==selValue ? "selected":"")+'>'+label+'</option>';
		        }
	        	$self.append(html);
	        }
	    });
	}
	
	$(".page_combox").each(function(){
		hander(this);
	});
});