package cn.com.patter.observer.demo;

public class Reader implements Observer {
	
	//读者的姓名
	private  String name;
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println(name+" 收到报纸了，阅读他。内容是："+((NewsPaper)subject).getContent());
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}
