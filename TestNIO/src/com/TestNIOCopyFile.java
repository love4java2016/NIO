package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestNIOCopyFile {

	public static void copyFile(String sourceFile,String destinationFile) throws IOException{
		FileInputStream fis = new FileInputStream(new File(sourceFile));
		FileOutputStream fos = new FileOutputStream(new File(destinationFile));
		FileChannel readChannel = fis.getChannel();
		FileChannel writeChannel = fos.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		while(true){
			byteBuffer.clear();
			int len = readChannel.read(byteBuffer);
			if(len == -1)break;
			byteBuffer.flip();
			writeChannel.write(byteBuffer);
		}
		readChannel.close();
		writeChannel.close();
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws IOException {
		copyFile("D:\\IMG_6445.JPG", "D:\\IMG_6446.JPG");
	}

}
