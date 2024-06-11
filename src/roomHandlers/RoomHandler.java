package roomHandlers;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.File;

import logicRooms.Deserialize;
import logicRooms.LogicGate;
import logicRooms.LogicRoom;

public class RoomHandler {
	Deserialize des;
	
	
	public RoomHandler() {
		des = new Deserialize();
	}
	
	
	public void draw() {
		
		
		
	}
	
	public void update() {
		
	}
	
	
	
	
	public void loadRoom() {
		
	}
	
	public void deLoad() {
		
	}
	
	
	public void mouseClicked(MouseEvent ke) { 
		
		
		
		
    }
	
	public void getFiles() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("pick a File");
		int myint = keyboard.nextInt();
		
		if(myint<des.list.length) {
			
			System.out.println(des.list[myint]);
			
			LogicRoom f = des.GetFile(des.list[myint].getPath());
		}
	}
	
	
	
	public static void main(String[] args) {
		RoomHandler x = new RoomHandler();
		
		LogicGate tmp = new LogicGate("Basic");
		
		
		
	}
	
	
	
	
	
	
}
