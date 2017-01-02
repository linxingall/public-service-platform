package com.ygjt.gdn.psp.utils;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * 分页类
 * @param <T>
 */
public class SPage<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1788930291936520317L;
	private int rows =10;//每页显示条数
	private int pageNo =1;//当前页
	private long records;//总记录数
	private int total;//总页数
	private String sord;
	private String sidx;
	private List<T> result;//结果
	
	public SPage(){
	}

	
	public SPage(List<T> list) {
		 if (list instanceof Page) {
	            Page<T> page = (Page<T>) list;
	            this.pageNo = page.getPageNum();
	            this.rows = page.getPageSize();

	            this.total = page.getPages();
	            this.records = page.getTotal();
	            this.result=list;
	        }
	}
	
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int page) {
		this.pageNo = page;
	}

	public long getRecords() {
		return records;
	}


	public void setRecords(long records) {
		this.records = records;
	}


	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public String getSord() {
		return sord;
	}
	public void setSord(String sord) {
		this.sord = sord;
	}
	public String getSidx() {
		return sidx;
	}
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}


	public List<T> getResult() {
		return result;
	}


	public void setResult(List<T> result) {
		this.result = result;
	}
	
	
	
}
