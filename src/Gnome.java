public class Gnome {
	private static int num_created = 1;
	private int ID;;
	public Gnome(){
		this.ID = num_created;
		num_created++;
	}	
	public int ID()
	{
		return this.ID;
	}
}
