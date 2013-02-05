public class Main
{
	public static void main(String[] s) throws Exception{
		Graph g = new Graph();
		Node a = new Node("1");
		Node b = new Node("2");
		Node c = new Node("3");
		Node d = new Node("4");
		Node e = new Node("5");
		Node f = new Node("6");
		g.addNode(a);
		g.addNode(b);
		g.addNode(c);
		g.addNode(d);
		g.addNode(e);
		g.addNode(f);
		g.add(d, f);
		g.add(f, d);
		g.add(b, c);
		g.add(c, d);
		g.add(d, e);
		g.add(e, b);
		g.add(a, e);
		g.add(b, a);
		System.out.println(g);
		System.out.println("2 <-> 3");
		System.out.println(g.adjacent(c, b));
		System.out.println(g.adjacent(b, c));
		System.out.println("add edge 3 -> 2");
		g.add(c, b);
		System.out.println("2 <-> 3");
		System.out.println(g.adjacent(c, b));
		System.out.println(g.adjacent(b, c));
		System.out.println("delete edge 3 -> 2");
		g.delete(c, b);
		System.out.println("2 <-> 3");
		System.out.println(g.adjacent(c, b));
		System.out.println(g.adjacent(b, c));
		System.out.println("neighbors 4:");
		System.out.println(g.neighbors(d));
		System.out.println("delete 4:");
		g.deleteNode(d);
		System.out.println(g);
	}
}