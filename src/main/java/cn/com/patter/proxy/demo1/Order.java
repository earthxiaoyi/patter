package cn.com.patter.proxy.demo1;

public class Order implements OrderApi {

	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 订单数量
	 */
	private int orderNum;

	/**
	 * 创建订单的人员
	 */
	private String orderUser;
	
	/**
	 * 传递构建所需要的数据
	 * @param productName	产品名称
	 * @param orderNum	订购的数量
	 * @param orderUser	创建订单的人员
	 */
	public Order(String productName,int orderNum,String orderUser){
		this.productName=productName;
		this.orderNum=orderNum;
		this.orderUser=orderUser;
	}
	
	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return productName;
	}

	@Override
	public void setProductName(String productName, String user) {
		// TODO Auto-generated method stub
		this.productName=productName;
	}

	@Override
	public int getOrderNum() {
		// TODO Auto-generated method stub
		return orderNum;
	}

	@Override
	public void setOrderNum(int orderNum, String user) {
		// TODO Auto-generated method stub
		this.orderNum=orderNum;
	}

	@Override
	public String getOrderUser() {
		// TODO Auto-generated method stub
		return orderUser;
	}

	@Override
	public void setOrderUser(String orderUser, String user) {
		// TODO Auto-generated method stub
		this.orderUser=orderUser;
	}

	@Override
	public String toString() {
		return "Order [productName=" + productName + ", orderNum=" + orderNum
				+ ", orderUser=" + orderUser + "]";
	}
}
