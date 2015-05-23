package cn.com.patter.facade;

public class Client {
	public static void main(String[] args) {
		new Business().generate();
		new Dao().generate();
		new Presentation().generate();
	}
}	
