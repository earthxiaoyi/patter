package cn.com.patter.chain.demo;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handlerRequest() {
		// TODO Auto-generated method stub
		boolean someCondition = true;
		if (someCondition) {

			System.out.println("Handler2  处理了");
		} else {
			if (null != this.successor) {
				this.successor.handlerRequest();
			}
		}
	}

}
