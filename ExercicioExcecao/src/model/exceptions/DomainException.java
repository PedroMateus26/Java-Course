package model.exceptions;

public class DomainException extends Exception{
	public String msg;
	private static final long serialVersionUID = 1L;
	public DomainException(String msg) {
		super(msg);
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
