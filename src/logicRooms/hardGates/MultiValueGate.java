package logicRooms.hardGates;

import java.util.ArrayList;

import logicRooms.LogicGate;
import logicRooms.nodes.Node;

public class MultiValueGate extends LogicGate {
	private ArrayList<Node> input;
	private ArrayList<Node> output;
	public MultiValueGate(String name) {
		super(name);
		
		input = new ArrayList<Node>();
		output = new ArrayList<Node>();
		
	}
	
	public void addInput(Node n) {
		
	}
	
	public void AddOutput(Node n) {
		
	}
	
	public Node removeInput(int ind) {
		return null;
	}
	
	public Node removeOutput(int ind) {
		return null;
	}
	
	public void recieve(boolean b, int ind) {
		output.get(ind).recieve(input.get(ind).send());
	}
	
	public void Action() {
		for(int x = 0; x < input.size(); x++) {
			this.recieve(output.get(x).send(), x);
		}
	}

}
