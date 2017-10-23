public class Graph {
	private GraphNode head;
	public DLList<Node<Gnome>> GnomeL;
	private DLList<GraphNode> NodeList;
	private DLList<DLList<GraphEdge>> AdjacencyEdgeList;
	
	public Graph(){
		NodeList = new DLList<GraphNode>();
		AdjacencyEdgeList = new DLList<DLList<GraphEdge>>();
		GnomeL = new DLList<Node<Gnome>>();
	}
	
	public void addNode(GraphNode node){
		if(this.NodeList.length() == 0){
			NodeList.append(node);
			this.head = node;
		}
		else{
			NodeList.append(node);
		}
	}
	public GraphNode getNode()
	{
		String A = null;
		GraphNode temp = new GraphNode(A);
		return temp;
	}
	public void addVillage(GraphNode from, GraphNode to){//add villages
		for(int i = 0; i < NodeList.length(); i++){
			if(NodeList.findByPosition(i).getData().equals(from)){
				GraphNode temp = (GraphNode)NodeList.findByPosition(i).getData();
				temp.addEdge(to);
			}
			
		}
	}
	public void addGnome(Node<Gnome> add)
	{
		GnomeL.append(add);
	}
	public void addAdjacencyList(GraphNode node){
		AdjacencyEdgeList.append(node.getAdjacencyList());
	}
	
	public GraphNode getHead(){
		return this.head;
	}
	public void Print()
	{
		int real = NodeList.length()+1;
		for(int i = 1; i < real; i++){
			System.out.print(NodeList.findByPosition(i).getData());
		}
	}
	
	public void getNodes(GraphEdge temp, GraphEdge comp){
		GraphNode to = temp.getTo();
	    GraphNode from = temp.getFrom();
	    GraphNode sto = comp.getTo();
	    GraphNode sfrom = comp.getFrom();
		System.out.println("Connection made between: " + from + " " + sto);
		}
	}
	


