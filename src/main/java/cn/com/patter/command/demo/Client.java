package cn.com.patter.command.demo;

public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command com = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.setCommand(com);
		invoker.runCommand();
	}

}
