package cn.com.patter.proxy.demo1;

/**
 * 订单对象的代理
 * 
 * @author JM
 *
 */
public class OrderProxy implements OrderApi {

	/**
	 * 持有被代理的具体的目标对象
	 */
	private Order order = null;

	public OrderProxy(Order order) {
		this.order = order;
	}
	

	@Override
	public String getProductName() {
		return this.order.getProductName();
	}

	@Override
	public void setProductName(String productName, String user) {
		//控制访问权限,只有创建订单的人员才能修改
		if(user!=null && user.equals(this.getOrderUser())){
			order.setProductName(productName, user);
		}else{
			System.out.println(user+",您无权修改");
		}
	}

	@Override
	public int getOrderNum() {
		return this.order.getOrderNum();
	}

	@Override
	public void setOrderNum(int orderNum, String user) {
		if(user!=null && user.equals(this.getOrderUser())){
			order.setOrderNum(orderNum, user);
		}else{
			System.out.println(user+",您无权修改");
		}
	}

	@Override
	public String getOrderUser() {
		return this.order.getOrderUser();
	}

	@Override
	public void setOrderUser(String orderUser, String user) {
		if(user!=null && user.equals(this.getOrderUser())){
			order.setOrderUser(orderUser, user);
		}else{
			System.out.println(user+",您无权修改");
		}
	}

	@Override
	public String toString() {
		return "OrderProxy [order=" + order + "]";
	}
}
