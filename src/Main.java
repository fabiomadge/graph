public class Main
{
	public static void main(String[] s) throws Exception{
		Graph g = new Graph();
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node ge = new Node("G");
		g.addNode(a);
		g.addNode(b);
		g.addNode(c);
		g.addNode(d);
		g.addNode(e);
		g.addNode(f);
		g.addNode(ge);
		g.add(a, b);
		g.add(a, ge);
		g.add(b, a);
		g.add(b, c);
		g.add(b, d);
		g.add(c, b);
		g.add(c, d);
		g.add(c, f);
		g.add(d, b);
		g.add(d, c);
		g.add(d, e);
		g.add(e, d);
		g.add(e, f);
		g.add(f, c);
		g.add(f, e);
		g.add(f, ge);
		g.add(ge, a);
		g.add(ge, f);
		System.out.println(g);
		System.out.println("C <-> G");
		System.out.println(g.adjacent(c, ge));
		System.out.println(g.adjacent(ge, c));
		System.out.println("add edge C -> G");
		g.add(c, ge);
		System.out.println("C <-> G");
		System.out.println(g.adjacent(c, ge));
		System.out.println(g.adjacent(ge, c));
		System.out.println("delete edge C -> G");
		g.delete(c, ge);
		System.out.println("C <-> G");
		System.out.println(g.adjacent(c, ge));
		System.out.println(g.adjacent(ge, c));
		System.out.println("neighbors 4:");
		System.out.println(g.neighbors(d));
		System.out.println("delete 4:");
		g.deleteNode(d);
		System.out.println(g);
		System.out.println("A -> F");
		System.out.println(g.breadthFirst(a, f));
	}
}