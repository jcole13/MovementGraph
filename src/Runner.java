public class Runner {
	public static void main (String[] args){
		Graph HTF = new Graph();
		myGraph(HTF);
		//HTF.Print();
		BFS(HTF);
	}
	
	public static void myGraph(Graph HTF){
		GraphNode A = new GraphNode("A");
		GraphNode B = new GraphNode("B");
		GraphNode C = new GraphNode("C");
		GraphNode D = new GraphNode("D");
		GraphNode E = new GraphNode("E");
		GraphNode F = new GraphNode("F");
		GraphNode G = new GraphNode("G");
		GraphNode H = new GraphNode("H");
		Node<Gnome> Alpha = new Node<Gnome>();
		Node<Gnome> Beta = new Node<Gnome>();
		Node<Gnome> Gamma = new Node<Gnome>();
		Node<Gnome> Delta = new Node<Gnome>();
		Node<Gnome> Epsilon = new Node<Gnome>();
		Node<Gnome>  Zeta = new Node<Gnome>();
		Node<Gnome> Eta = new Node<Gnome>();
		Node<Gnome> Theta = new Node<Gnome>();
		Node<Gnome> Iota = new Node<Gnome>();
		HTF.addNode(A); HTF.addNode(B);
		HTF.addNode(C);
		HTF.addNode(D);
		HTF.addNode(E);
		HTF.addNode(F);
		HTF.addNode(G);
		HTF.addNode(H);
		HTF.addVillage(A, C);
		HTF.addVillage(A, D);
		HTF.addVillage(B, D);
		HTF.addVillage(C, B);
		HTF.addVillage(C, E);
		HTF.addVillage(C, F);
		HTF.addVillage(D, E);
		HTF.addVillage(D, H);
		HTF.addVillage(E, F);
		HTF.addVillage(F, G);
		HTF.addVillage(E, H);
		HTF.addAdjacencyList(H);
		HTF.addAdjacencyList(G);
		HTF.addAdjacencyList(F);
		HTF.addAdjacencyList(E);
		HTF.addAdjacencyList(D);
		HTF.addAdjacencyList(C);
		HTF.addAdjacencyList(B);
		HTF.addAdjacencyList(A);
		HTF.addGnome(Alpha);
		HTF.addGnome(Beta);
		HTF.addGnome(Gamma);
		HTF.addGnome(Delta);
		HTF.addGnome(Epsilon);
		HTF.addGnome(Zeta);
		HTF.addGnome(Eta);
		HTF.addGnome(Theta);
		HTF.addGnome(Iota);
		
	}
	public static void BFS(Graph HTF){//Queue sort
		GraphNode head = HTF.getHead();
		Queue<GraphNode> nodequeue = new Queue<GraphNode>();
		Queue<GraphNode> appearred = new Queue<GraphNode>();
		System.out.println(head);
		head.addQueue(nodequeue);
		appearred.append(head);
		while(nodequeue.getLength() != 0){
			while(!appearred.isExist(nodequeue.findByPosition(0).getData())){//checks if empty
				GraphNode temp = nodequeue.findByPosition(1).getData();
				System.out.println(temp);//prints queue
				appearred.append(temp);
				nodequeue.deleteFirst();
				temp.addQueue(nodequeue);
			}
			nodequeue.deleteFirst();
		}
	}
}
