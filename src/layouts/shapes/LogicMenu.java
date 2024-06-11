package layouts.shapes;

public class LogicMenu extends Menu {
	public LogicMenu() {
		super(3,15,15);
		
		int[] sizes = this.getItemSizes();
		
		this.assignMenuItem(0, new MenuItem(sizes[0],sizes[1],"First"));
		
		this.assignMenuItem(1, new MenuItem(sizes[0],sizes[1],"Second"));
		
		
		
		
	}
}
