public class GraphNode {
	private DLList<GraphEdge> adjacencyedge = new DLList<GraphEdge>();
	private String name;
	
	public GraphNode(String name){
		this.name = name;
		DLList<Node<Gnome>> Gnomelist = new DLList<Node<Gnome>>();
	}	
	public String toString(){
		return this.name;
	}
	public DLList<GraphEdge> getAdjacencyList(){
		return this.adjacencyedge;
	}
	public void addEdge(GraphNode to){
		GraphEdge temp = new GraphEdge(this,to);
		GraphEdge reverse = new GraphEdge(to, this);
		adjacencyedge.append(temp);
		adjacencyedge.append(reverse);
	}
	public void addQueue(Queue<GraphNode> queue){
		for(int i = 1; i <= this.adjacencyedge.length(); i++){
			queue.append(this.adjacencyedge.findByPosition(i).getData().getTo());
		}
	}
}
