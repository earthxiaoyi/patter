package cn.com.patter.reactor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

public class Handler implements Runnable {

	private SocketChannel socketChannel;
	private SelectionKey selectionKey;
	
	public Handler(SocketChannel socketChannel, Selector selector) {
		this.socketChannel = socketChannel;
		try {
			socketChannel.configureBlocking(false);
			selectionKey = socketChannel.register(selector, SelectionKey.OP_READ);
			selectionKey.attach(this);
			selectionKey.interestOps(SelectionKey.OP_READ);
			selector.wakeup();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		ByteBuffer inputBuffer = ByteBuffer.allocate(1024);
        inputBuffer.clear();
		try {
			socketChannel.read(inputBuffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void read(){};
	
	public void write(){};
	
}
