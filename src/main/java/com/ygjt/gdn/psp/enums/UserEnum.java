/**
 * 
 */
package com.ygjt.gdn.psp.enums;


public class UserEnum {
	
	public enum USER_TYPE {
		COMPANY("1","企业"),
		MANAGE("2","管理员");

		private String name;
		private String  value;


		USER_TYPE( String value,String name) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public static USER_TYPE parse(int value) {
			for (USER_TYPE type : USER_TYPE.values()) {
				if (type.value.equals(value)) {
					return type;
				}
			}
			return null;
		}
	}

	public enum USER_STAT {
		YES("1","激活"),
		NO("0","未激活");

		private String name;
		private String  value;


		USER_STAT( String value,String name) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public static USER_STAT parse(int value) {
			for (USER_STAT type : USER_STAT.values()) {
				if (type.value.equals(value)) {
					return type;
				}
			}
			return null;
		}
	}


}
