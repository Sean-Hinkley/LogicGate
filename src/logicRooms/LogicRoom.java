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


public class LogicRoom implements Serializable {
	
	private static final long serialVersionUID = 123;
	transient String password; //transient values are ignored
	String name;
	private ArrayList<Node> startingNodes;
	public LogicRoom(String name, int x, int y) {
		this.name = name;
		
		startingNodes = new ArrayList<Node>();
		
		
		
	}
	//adds node
	public void addNode(Node n) {
		startingNodes.add(n);
	}
	//removes node at selected index
	public void removeNode(int n) {
		startingNodes.remove(n);
	}
	//removes last node
	public void removeNode() {
		startingNodes.remove(startingNodes.size()-1);
	}	

	
	
	
	
	
	
	
	
	public void saveFile() {
		try {
	    	  File myObj = new File(this.name + ".ser");
	          if (myObj.createNewFile()) {
	            System.out.println("File created: " + myObj.getName());
	          } else {
	            System.out.println("File already exists.");
	          }
	         FileOutputStream fileOut = new FileOutputStream("src/savedrooms/"+ this.name + ".ser");
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
