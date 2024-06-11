package layouts.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Shape {
	private int ShapeX;
	private int ShapeY;
	private int ShapeW;
	private int ShapeH;
	
	
	
	
	public Shape(int x, int y, int w, int h) {
		ShapeX = x;
		ShapeY = y;
		ShapeW = w;
		ShapeH = h;
		
	}
	
	public void setX(int x) {
		ShapeX = x;
	}
	
	public int getX() {
		return ShapeX;
	}
	
	public void setY(int y) {
		ShapeY = y;
	}
	
	public int getY() {
		return ShapeY;
	}
	
	public void setW(int w) {
		ShapeW = w;
	}
	
	public int getW() {
		return ShapeW;
	}
	
	public void setH(int h) {
		ShapeH = h;
	}
	
	public int getH() {
		return ShapeH;
	}
	
	
	public void draw(Graphics pen) {
		pen.setColor(Color.gray);
		pen.fillRect(ShapeX, ShapeY, ShapeW, ShapeH);
		
	}
	
	public void update() {
		
	}
	
	public boolean isTouching(int x, int y) {
		
		if(x>getX() && x<getX()+getW() && y>getY() && y<getY()+getH()) {
			
			//System.out.println("ThisX: " + getX() + "  |  ThisY: " + getY());
			//System.out.println("ThisW: " + getW() + "  |  ThisH: " + getH());
			//System.out.println("ThatX: " + x + "  |  ThatY: " + x);
			return true;
		}
		
		
		
		return false;
	}
	
	
	public void move(int x, int y) {
		ShapeX = x;
		ShapeY = y;
	}
	
	public void size(int w, int h) {
		ShapeW = w;
		ShapeH = h;
	}
	
	
	
	public void action() {
		
	}
	
	public void mouseClicked(MouseEvent ke) {
		
		boolean tmp = this.isTouching(ke.getX(), ke.getY());
		
		
		if(tmp==true) {
			
			action();
		}
	}
}
