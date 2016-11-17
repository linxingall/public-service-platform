package com.ygjt.gdn.psp.controller.common.model;

import java.util.Map;

/**
 * $.ajax后需要接受的JSON
 * 
 * @author
 * 
 */
public class AjaxJson {

	private boolean result = true;// 是否成功
	private boolean valid = true;
	private String msg = "操作成功";// 提示信息
	private Object obj = null;// 其他信息
	private Map<String, Object> attributes;// 其他参数
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "AjaxJson [result=" + result + ", msg=" + msg + ", obj=" + obj + ", attributes=" + attributes + "]";
	}


}
