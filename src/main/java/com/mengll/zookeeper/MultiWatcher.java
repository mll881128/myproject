package com.mengll.zookeeper;

import org.apache.zookeeper.WatchedEvent;  
import org.apache.zookeeper.Watcher;  
import org.apache.zookeeper.Watcher.Event.EventType;  
import org.apache.zookeeper.Watcher.Event.KeeperState;  
/** 
 * 提供给多个client使用的watcher 
 * @author ransom 
 * watcher的实现
 */  
public class MultiWatcher implements Watcher{  
    public MultiWatcher(String address)  
    {  
        connectAddress=address;  
    }  
      
    private String connectAddress=null;  
      
    @Override  
    public void process(WatchedEvent event) {  
        // TODO Auto-generated method stub  
        String outputStr="";  
        if(connectAddress!=null){  
            outputStr+="connectIP:"+connectAddress;  
        }  
        outputStr+=",path:"+event.getPath();  
        outputStr+=",state:"+event.getState();  
        outputStr+=",type:"+event.getType();  
          
        System.out.println(outputStr);  
    }  
}  
