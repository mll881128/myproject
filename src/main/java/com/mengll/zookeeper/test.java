package com.mengll.zookeeper;

import java.io.IOException;

public class test {
	public static void main(String[] args) {
		ServerConnector  operationCient= new ServerConnector();  
		  try {
			operationCient.init("192.168.137.100:2181","server1");
			operationCient.changeData("/test", "111");
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
}
