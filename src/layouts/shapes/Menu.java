package layouts.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Menu extends Shape {
	boolean visible;
	int OffsetX;
	int OffsetY;
	MenuItem[] items;
	public Menu(int size,int x,int y) {
		super(0,0,0,0);
		visible = false;
		OffsetX = x;
		OffsetY = y;
		items = new MenuItem[size];
		
		setW(250);
		
		setH((OffsetY*3) + (items.length*OffsetY));
	}
	
	public int[] getOffsets() {
		return new int[] {OffsetX,OffsetY};
	}
	public void assignMenuItem(int index, MenuItem item) {
		items[index] = item;
		Sort();
	}
	
	
	public void Sort() {
		int Count = 0;
		MenuItem[] tmp = new MenuItem[items.length];
		for(MenuItem n : items) {
			if(n!=null) {
				tmp[Count] = n;
				Count++;
				
				
			}
			
		}
		
		
		items = tmp;
	}
	
	
	public void menuAlign() {
		for(int x = 0; x < items.length; x++) {
			MenuItem n = items[x];
			if(n!=null) {
				n.move(getX() + OffsetX, (getY()+OffsetY) + (32*x));
				
			} else {
				break;
			}
		}
	}
	
	
	
	
	
	public void draw(Graphics pen) {
		if(visible == true) {
			pen.setColor(Color.RED);
			//System.out.println(getX());
			pen.fillRect(getX(),getY(),getW(),getH());
			
			for(MenuItem n: items) {
				if(n!=null) {
					n.draw(pen);
				}
			}
			
		}
	}
	
	public int[] getItemSizes() {
		int[] tmp = new int[] {220, 25 };
		
		
		return tmp;
	}
	
	
	public void mouseClicked(MouseEvent ke) {
		if(ke.getButton()==3) {
			visible = true;
			move(ke.getX()-8, ke.getY()-32);
			
			
		} else if (visible){
			if(isTouching(ke.getX()-8, ke.getY()-32)==true) {
				for(int x = 0; x < items.length; x++) {
					MenuItem n = items[x];
					if(n!=null) {
						//System.out.println("Worked");
						n.mouseClicked(ke);
					}
				}
			}
			
			else {
				visible=false;
			}
		}
	}
	
	
	
	public void move(int x, int y) {
		setX(x);
		setY(y);
		
		menuAlign();
	}
	
	
	
	
	
	
}
