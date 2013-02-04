class ListNode{
	private ListNode reference;
	private Object datum;

	public ListNode(ListNode ref, Object dat){
		reference = ref;
		datum = dat;
	}

	public String toString(){
		return datum.toString();
	}

	public ListNode next(){
		return reference;
	}

	public Object getDatum(){
		return datum;
	}

	public void setReference(ListNode n){
		reference = n;
	}

	public void append(ListNode n){
		if(reference == null){
			reference = n;
		}
		else reference.append(n);
	}
}