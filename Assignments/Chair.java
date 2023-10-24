package assignment;

public class Chair
{
	private String color;
	private String material;
	private float height;
	private float weight;
	
	public void initDetails()
	{
		color = "white";
		material = "leather";
		height = 80.5f;
		weight = 5.5f;
	}
	
	public void showDetals()
	{
		System.out.println("DEtails:\nColor="+color+"\nMaterial="+material+"\nHeight="+height+"\nWeight="+weight+"\n");
	}
	
	public void setcolor(String abc)
	{
		color = abc;
	}
	public String getcolor()
	{
		return color;
	}
	
	public void setmaterial(String abc)
	{
		material = abc;
	}
	public String getmaterial()
	{
		return material;
	}
	
	public void setheight(float h)
	{
		height = h;
	}
	public float getheight()
	{
		return height;
	}
	
	public void setweight(float w)
	{
		weight = w;
	}
	public float getweight()
	{
		return weight;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


