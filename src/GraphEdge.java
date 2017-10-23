
public class GraphEdge {
	private GraphNode from;
	private GraphNode to;
	
	public GraphEdge(GraphNode from, GraphNode to){
		this.from = from;
		this.to = to;
	}
	
	public GraphNode getFrom(){
		return this.from;
	}
	
	public GraphNode getTo(){
		return this.to;
	}
	
	public void Print()
	{
		System.out.print(this.to);
		System.out.print(this.from);
	}
}
