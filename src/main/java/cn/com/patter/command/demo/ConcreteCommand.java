package cn.com.patter.command.demo;

public class ConcreteCommand implements Command {

	/**
	 * 持有相应的接受者对象
	 */
	private Receiver receiver=null;
	/**
	 * 命令对象自己有自己的状态
	 */
	private String state;
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		receiver.action();
	}
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	

}
