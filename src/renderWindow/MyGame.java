package renderWindow;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import roomHandlers.RoomHandler;

import logicRooms.nodes.Link;
public class MyGame extends Game  {
    public static final String TITLE = "Platformer";
    public static final int SCREEN_WIDTH = 1700;
    public static final int SCREEN_HEIGHT = 900;
    
   
    public MyGame() {
    	
    	
    }
    
    public void update() {
    	
    }
    
    public void draw(Graphics pen) {
    	
    }
    
    
        
    public void keyTyped(KeyEvent ke) {}

    public void keyPressed(KeyEvent ke) {

    }

    public void keyReleased(KeyEvent ke) {}

    public void mouseClicked(MouseEvent ke) { 
    	
    	
    }

    public void mousePressed(MouseEvent me) {
    	
    	
    }
    
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {}

    public void mouseExited(MouseEvent me) {}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
    
    
    
    
}
