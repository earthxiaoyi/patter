package cn.com.patter.proxy.demo2;

public class Order {

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
	
	
	
	public Order() {
	}

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
	
	public String getProductName() {
		// TODO Auto-generated method stub
		return productName;
	}

	public void setProductName(String productName, String user) {
		// TODO Auto-generated method stub
		this.productName=productName;
	}

	public int getOrderNum() {
		// TODO Auto-generated method stub
		return orderNum;
	}

	public void setOrderNum(int orderNum, String user) {
		// TODO Auto-generated method stub
		this.orderNum=orderNum;
	}

	public String getOrderUser() {
		// TODO Auto-generated method stub
		return orderUser;
	}

	public void setOrderUser(String orderUser, String user) {
		// TODO Auto-generated method stub
		this.orderUser=orderUser;
	}

	public String toString() {
		return "Order [productName=" + productName + ", orderNum=" + orderNum
				+ ", orderUser=" + orderUser + "]";
	}
}
