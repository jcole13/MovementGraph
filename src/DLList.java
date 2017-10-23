public class DLList<E> {
	private Node<E> head;
	private Node<E> back;
	private int length;
	
	public DLList(){
		this.head = null;
		this.back = null;
		this.length = 0;
	}
	
	public boolean isEmpty(){
		if(length == 0){return true;}
		else{return false;}
	}
	
	public Node<E> findByPosition(int position){
		Node<E> temp = this.head;
		for(int i = 1; i < position; i++){
			temp = temp.getNext();
		}//end of for loop
		return temp;
	}//end of findByPosition
	
	public String[] toStringArray(){
		String [] output = new String[this.length];
		for(int i = 1; i <= this.length; i++){
			String temp = this.findByPosition(i).getData().toString();
			output[i-1] = temp;
		}
		return output;
	}
	
	public int length(){
		return this.length;
	}
	public void append(E data){
		Node<E> temp = new Node<E>(data);
		if(this.isEmpty()){
			this.head = temp;
			this.back = this.head;
			length++;
		}
		else{
			this.back.setNext(temp);
			temp.setPrevious(this.back);
			this.back = temp;
			length++;
		}
	}
	
	public void setFirst(E data){
		Node<E> temp = new Node<E>(data);
		temp.setNext(this.head);
		this.head.setPrevious(temp);
		this.head = temp;
		length++;
	}
	public boolean isHead(Node<E> node){
		if(this.head == node){return true;}
		else{return false;}
	}
	
	public boolean isBack(Node<E> node){
		if(this.back == node){return true;}
		else{return false;}
	}
}
