class Edge{
	private Node d;
	private double v;

	public Edge(Node destination){
		d = destination;
		v = 0.0;
	}

	public Edge(Node destination, double value){
		d = destination;
		v = value;
	}

	public Node getDest(){
		return d;
	}

	public void setDest(Node destination){
		d = destination;
	}

	public double getValue(){
		return v;
	}

	public void setValue(double value){
		v = value;
	}

	public String toString(){
		return "-(" + String.valueOf(v) + ")> " + d.getName();
	}
}