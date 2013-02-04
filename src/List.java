class List{
	private ListNode head;

	public List(){
		head = null;
	}

	public List(ListNode n){
		head = n;
	}

	public ListNode getHead(){
		return head;
	}

	public void add(Object o){
		ListNode nHead = new ListNode(head, o);
		head = nHead;
	}

	public void append(Object o){
		if(head == null) this.add(o);
		else head.append(new ListNode(null, o));
	}

	public String toString(){
		String s = "(";
		ListNode next = head;
		while(next != null){
			if(next.next() == null) s = s + next.toString();
			else                  s = s + (next.toString() + ", ");
			next = next.next();
		}
		return (s + ")");
	}

	public List reverse(){
		List l = new List();
		ListNode next = head;
		while(next !=  null){
			l.add(next);
			next = next.next();
		}
		return l;
	}

	public Object head(){
		return head.getDatum();
	}

	public List tail(){
		if(this.length() < 2) return new List();
		else return new List(head.next());
	}

	public Object last(){
		ListNode next = head;
		while(next != null){
			if(next.next() == null) return next.getDatum();
			next = next.next();
		}
		return null;
	}

	public List init(){
		return this.reverse().tail().reverse();
	}

	public Boolean nil(){
		if(head == null) return true;
		else return false;
	}

	public int length(){
		ListNode next = head;
		int i = 0;
		while(next != null){
			i++;
			next = next.next();
		}
		return i;
	}

	public void linkf(List l){
		l.getHead().append(head);
		head = l.getHead();
	}

	public void linkb(List l){
		getHead().append(l.getHead());
	}
}