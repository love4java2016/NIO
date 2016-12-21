package com;

import java.nio.ByteBuffer;

public class TestByteBuffer {

	public static void main(String[] args) {
		ByteBuffer b = ByteBuffer.allocate(15);
		System.out.println(b.limit() + ":" + b.capacity() + ":" + b.position());
		for(int i=0;i<10;i++){
			b.put((byte) i);
		}
		b.flip();
		System.out.println(b.limit() + ":" + b.capacity() + ":" + b.position());
		for(int i=0;i<5;i++){
			System.out.println(b.get());
		}
		System.out.println(b.limit() + ":" + b.capacity() + ":" + b.position());
		b.flip();
		System.out.println(b.limit() + ":" + b.capacity() + ":" + b.position());
		
	}

}
