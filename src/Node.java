class Node{
	public String n;
	public double v;
	public List dests;

	public Node(String name){
		n = name;
		v = 1.0;
		dests = new List();
	}

	public double getValue(){
		return v;
	}

	public void setValue(double value){
		v = value;
	}

	public void add(Edge e){
		if(adjacent(e.getDest())){
			throw new IllegalStateException("there is already a connection");
		}
		dests.add(e);
	}

	public void delete(Node y){
		ListNode next = dests.getHead();
		while(next != null){
			if(((Edge)next.getDatum()).getDest() == y) dests.delete(next.getDatum());
			next = next.next();
		}
	}

	public boolean adjacent(Node y){
		if(getEdge(y) == null){
			return false;
		}
		else{
			return true;
		}
	}

	public List neighbors(){
		List t = new List();
		ListNode next = dests.getHead();
		while(next != null){
			t.add(((Edge)next.getDatum()).getDest());
			next = next.next();
		}
		return t;
	}

	public Edge getEdge(Node y){
		dests.inList(y);
		ListNode next = dests.getHead();
		while(next != null){
			if(((Edge)next.getDatum()).getDest() == y) return (Edge) next.getDatum();
			next = next.next();
		}
		return null;
	}

	public String getName(){
		return n;
	}

	public String toString(){
		return n + " (" + String.valueOf(v) + ") " + dests.toString();
	}
}