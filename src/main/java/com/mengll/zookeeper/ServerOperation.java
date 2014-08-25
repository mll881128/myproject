package com.mengll.zookeeper;

import java.io.IOException;  
import java.util.List;  
import org.apache.zookeeper.KeeperException;  
/** 
 * zookeeper的操作封装接口，实现了常用的操作 
 * 创建、销毁、写入、修改、查询等。 
 * @author ransom 
 * zookeeper封装的接口：
 */  
public interface ServerOperation {  
    void init(String address,String serverName) throws IOException;  
    void destroy() throws InterruptedException;  
    List<String> getChilds(String path) throws KeeperException,  
            InterruptedException;  
    String getData(String path) throws KeeperException, InterruptedException;  
    void changeData(String path, String data) throws KeeperException,  
            InterruptedException;  
    void delData(String path) throws KeeperException, InterruptedException;  
    void apendTempNode(String path, String data) throws KeeperException,  
            InterruptedException;  
    void apendPresistentNode(String path, String data) throws KeeperException,  
    InterruptedException;  
      
    void delNode(String path) throws KeeperException, InterruptedException;  
    boolean exist(String path) throws KeeperException, InterruptedException;  
} 