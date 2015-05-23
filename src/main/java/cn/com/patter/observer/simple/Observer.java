package cn.com.patter.observer.simple;
/**
 * 观察者对象
 * @author admin
 *
 */
public interface Observer {
	/**
	 * 更新的接口
	 * @param subject 传入目标对象，方便获取相应的目标对象的状态
	 */
	public void update(Subject subject);

}
