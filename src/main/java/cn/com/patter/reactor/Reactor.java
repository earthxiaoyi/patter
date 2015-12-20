package cn.com.patter.reactor;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * reactor 模式
 * @author JM
 */
public class Reactor implements Runnable{
	
	public final Selector selector;
	public final ServerSocketChannel serverSocketChannel;
	
	public Reactor(int port) throws IOException{
		selector = Selector.open();//打开选择器
		serverSocketChannel = ServerSocketChannel.open();//打开socketchannel通道
		serverSocketChannel.configureBlocking(false);//设置为非阻塞模式
		InetSocketAddress inetSocketAddress = new InetSocketAddress(
				InetAddress.getLocalHost(),port);
		serverSocketChannel.socket().bind(inetSocketAddress);//绑定监听端口
		SelectionKey selectionKey = serverSocketChannel.register(selector, 
				SelectionKey.OP_ACCEPT);	//向selector上面注册accept通道
		selectionKey.attach(new Acceptor(this));//附加接受处理对象
	}

	@Override
	public void run() {
		try {
			while(!Thread.interrupted()){
				selector.select();
				Set<SelectionKey> selectedKeys = selector.selectedKeys();
				Iterator<SelectionKey> it = selectedKeys.iterator();
				while(it.hasNext()){
					SelectionKey selectionKey = it.next();
					//传递给调度方法
					dispatch((Runnable)selectionKey.attachment());
				}
				selectedKeys.clear();//清除所有的SelectionKey
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 通知处理线程处理数据
	 * @param run
	 */
	public void dispatch(Runnable run){
		if(run!=null){
			run.run();
		}
	}
	
}
