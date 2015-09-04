package cn.com.patter.command.demo;

public class Invoker {
	
	//持有命令对象
	private Command command=null;
	
	public void setCommand(Command command){
		this.command=command;
	}
	
	/**
	 * 执行命令对象
	 */
	public void runCommand(){
		this.command.excute();
	}
}
