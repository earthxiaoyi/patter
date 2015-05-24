package cn.com.patter.decoration.demo1;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建计算基本奖金的类,这是被装饰的对象
		Component c1 = new ConcreteComponent();
		
		Decoration d1 = new MonthPrizeDecorator(c1);
		Decoration d2 = new SumPrizeDecorator(d1);
		
		double zs = d2.calcPrize("张三", null, null);
		System.out.println("======张三应得奖金"+zs);
		
		double ls = d2.calcPrize("李四", null, null);
		System.out.println("======李四应得奖金"+ls);
		
	}

}
