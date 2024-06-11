package layouts.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class MenuItem extends Shape{
	
	private String title;
	
	public MenuItem(int w, int h, String tit) {
		super(0,0,w,h);
		
		title = tit;
		
		
	}
	public MenuItem(int w, int h) {
		super(0,0,w,h);
		
		
	}
	
	public void setTitle(String tit) {
		title = tit;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	/*public void draw(Graphics pen) {
		pen.setColor(Color.blue);
		pen.fillRect(getX(), getY(), getW(), getH());
	}*/
	
	
	
	
	public void action() {
		System.out.println(title);
	}
	
	
	
}
