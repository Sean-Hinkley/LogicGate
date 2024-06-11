package logicRooms;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.ArrayList;

import logicRooms.nodes.*;


public class LogicGate extends Ping implements Serializable  {
	
	private static final long serialVersionUID = 123;
	transient String password; //transient values are ignored
	String name;
	public LogicGate(String name) {
		this.name = name;
		status = false;
		next = null;
		
		
		
		
		this.setNext(new Link());
		Ping tmp = this.next;
		tmp.setNext(new Node());
		this.recieve(true);
		this.Action();
	}
	
	public void Action() {
		status = !(status);
		
		send();
	}
	
	
	
	
	
	
	
	public void saveFile() {
		try {
	    	  File myObj = new File(this.name + ".ser");
	          if (myObj.createNewFile()) {
	            System.out.println("File created: " + myObj.getName());
	          } else {
	            System.out.println("File already exists.");
	          }
	         FileOutputStream fileOut = new FileOutputStream("D:\\All\\RolePlayGame\\src\\savedObjs\\"+ this.name + ".ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(this);
	         
	         out.close();
	         fileOut.close();
	         System.out.println("Object saved!");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	      
	      long serialVersionUID = ObjectStreamClass.lookup(this.getClass()).getSerialVersionUID();
	      System.out.println("serialVersionUID: "+serialVersionUID);
	}
}
	