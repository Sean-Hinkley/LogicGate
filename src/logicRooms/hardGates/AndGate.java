package logicRooms.hardGates;

import logicRooms.LogicGate;
import logicRooms.nodes.NodeIn;

public class AndGate extends LogicGate {

	public AndGate(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	public void Action() {
		NodeIn n = this.getNodeIn();
	}

}
