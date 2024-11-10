package com.earth.station.common;

import java.util.List;

/**
 * 分页工具类
 * 
 * @author Zongqian
 */
public class PageUtil<T> {

	private int index; // 起始索引
	private int currentPage; // 当前页
	private int pageSize; // 每页显示数量
	private int totalCount; // 总记录数
	private int totalPage; // 总页数
	private List<T> result; // 返回结果集

	public PageUtil(int currentPage, int pageSize) {
		this.index = (currentPage - 1) * pageSize;
		this.pageSize = pageSize;
	}

	public PageUtil(int index, int currentPage, int pageSize, int totalCount, int totalPage, List<T> result) {
		super();
		this.index = index;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.result = result;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage() {
		this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize + 1);
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
}
