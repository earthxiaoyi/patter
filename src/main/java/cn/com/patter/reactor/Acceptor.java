package cn.com.patter.reactor;

import java.nio.channels.SocketChannel;


public class Acceptor implements Runnable {
	
	private Reactor reactor;
	
	public Acceptor(Reactor reactor){
		this.reactor = reactor;
	}
	
	@Override
	public void run() {
		try {
			SocketChannel socketChannel = reactor.serverSocketChannel.accept();
			if(socketChannel!=null){
				new Handler(socketChannel,reactor.selector);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
