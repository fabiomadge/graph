class Graph{
	private List nodes;

	public Graph(){
		nodes = new List();
	}

	public boolean adjacent(Node x, Node y){
		return x.adjacent(y);
	}

	public List neighbors(Node x){
		return x.neighbors();
	}

	public void add(Node x, Node y){
		x.add(new Edge(y));
	}

	public void delete(Node x, Node y){
		x.delete(y);
	}

	public double getNodeValue(Node x){
		return x.getValue();
	}

	public void setNodeValue(Node x, double value){
		x.setValue(value);
	}

	public double getEdgeValue(Node x, Node y){
		return x.getEdge(y).getValue();
	}

	public void setEdgeValue(Node x, Node y, double value){
		x.getEdge(y).setValue(value);
	}

	public List depthFirst(Node x, Node y){
		//ToDo
		return new List();
	}

	public List breadthFirst(Node x, Node y){
		//ToDo
		return new List();
	}

	public void addNode(Node x){
		nodes.add(x);
	}

	public void deleteNode(Node x){
		ListNode next = nodes.getHead();
		while(next != null){
			delete(((Node)next.getDatum()), x);
			next = next.next();
		}
		nodes.delete(x);
	}

	public String toString(){
		String s = "";
		ListNode next = nodes.getHead();
		while(next != null){
			if(next.next() == null) s = s + next.toString();
			else                  s = s + (next.toString() + "\n");
			next = next.next();
		}
		return s;
	}
}