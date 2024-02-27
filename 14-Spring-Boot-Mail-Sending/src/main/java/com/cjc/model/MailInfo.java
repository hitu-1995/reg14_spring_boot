package com.cjc.model;

public class MailInfo {

	private String from;
	private String to;
	private String sub;
	private String msg;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MailInfo(String from, String to, String sub, String msg) {
		super();
		this.from = from;
		this.to = to;
		this.sub = sub;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MailInfo [from=" + from + ", to=" + to + ", sub=" + sub + ", msg=" + msg + "]";
	}

	public MailInfo() {
	}

}
