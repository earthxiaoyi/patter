package cn.com.patter.chain.demo;

public abstract class Handler {
	/**
	 * 持有后续的职责对象
	 */
	protected Handler successor;
	
	public void setSucessor(Handler successor){
		this.successor=successor;
	}
	
	/**
	 * 示意处理请求的方法，虽然这个示意方法是没有传入参数的。
	 * 但是实际可以根据需求来传入参数
	 */
	public abstract void handlerRequest();
}

