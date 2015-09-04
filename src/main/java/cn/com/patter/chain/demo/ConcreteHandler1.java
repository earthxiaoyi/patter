package cn.com.patter.chain.demo;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handlerRequest() {
		// TODO Auto-generated method stub
		boolean someCondition = false;
		if (someCondition) {
			System.out.println("handler1 处理了");
		} else {

			if (this.successor != null) {
				this.successor.handlerRequest();
			}

		}
	}

}
