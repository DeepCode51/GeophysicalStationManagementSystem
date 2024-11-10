package com.earth.station.common.tags;
import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.earth.station.common.StringUtil;

public class Pagelink extends TagSupport{
	@Override
	public int doStartTag() throws JspException {
		return 2;
	}
	   
	@Override
	public int doEndTag() throws JspException {
	    try {
	    	ServletRequest request = pageContext.getRequest();	    	
	    	StringBuffer strBuffer = new StringBuffer();
	    	
	    	int pageNo = Integer.parseInt(request.getAttribute("pageNo").toString());
	    	int totalCount = Integer.parseInt(request.getAttribute("totalCount").toString());//记录数
	    	int pageSize = Integer.parseInt(request.getAttribute("pageSize").toString());
	    	String params = StringUtil.format(request.getAttribute("params"));
	    	String domain = request.getAttribute("domain").toString();
	    	String link = request.getAttribute("link").toString();
	    	
	    	int pageTotal = totalCount / pageSize;
	    	if(totalCount % pageSize != 0) {
				pageTotal++;
			}
	    	if(pageTotal==1){
	    		strBuffer.append("<span class='current'>1</span>");
	    		pageContext.getOut().write(strBuffer.toString());
				return EVAL_PAGE;
			}
			String href = null;			
			if(params == null || params == "") {
				href = domain + "/" + link + "?p=";
			} else {
				href = domain + "/" + link + "?" + params + "&p=";
			}
				
			//固定9页
			if(pageTotal<=9){
				for(int i =1;i<=pageTotal;i++){
				  if(i == pageNo){
					  strBuffer.append("<span class='current'>"+i+"</span>");
				  }else{
					  strBuffer.append("<a href='"+href+i+"'>"+i+"</a>");
				  }
			   }
			   pageContext.getOut().write(strBuffer.toString());
			   return EVAL_PAGE;
			}
			if(pageNo <= 5){//当前页<=5
			   for(int i =1; i<=9; i++){
				  if(i == pageNo){
					  strBuffer.append("<span class='current'>"+i+"</span>");
				  }else{
					  strBuffer.append("<a href='"+href+i+"'>"+i+"</a>");
				  }
				}
			    strBuffer.append("<a class='next' href='"+href +(pageNo+1)+"'>下一页</a>");
			    pageContext.getOut().write(strBuffer.toString());
				return EVAL_PAGE;
			}
			if((pageNo+4)>=pageTotal){
				strBuffer.append("<a class='last' href='"+href +(pageNo-1)+"'>上一页</a>");			
			    for(int i =(pageTotal-8);i<=pageTotal;i++){
				   if(i == pageNo){
					   strBuffer.append("<span class='current'>"+i+"</span>");
				   }else{
					   strBuffer.append("<a href='"+href+i+"'>"+i+"</a>");
				   }
			    }
			    pageContext.getOut().write(strBuffer.toString());
				return EVAL_PAGE;
			 }
			 strBuffer.append("<a class='last' href='"+href+(pageNo-1)+"'>上一页</a>");					
			 for(int i =(pageNo-4);i<=(pageNo+4);i++){
			    if(i == pageNo){
			    	strBuffer.append("<span class='current'>"+i+"</span>");
			    }else{
			    	strBuffer.append("<a href='"+href+i+"'>"+i+"</a>");
			    }
			  }
			  strBuffer.append("<a class='next' href='"+href +(pageNo+1)+"'>下一页</a>");
			  pageContext.getOut().write(strBuffer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return EVAL_PAGE;
	}
	   
	@Override
	public void release() {
	    super.release();
	}
}

