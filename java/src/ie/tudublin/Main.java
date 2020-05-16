package ie.tudublin;

import example.*;

import c18331503.*;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new CubeVisual());
		processing.core.PApplet.runSketch( a, new CubeVisual());		
	}

	public void MusicVisuals()
	{
		String[] a={"MAIN"};
		processing.core.PApplet.runSketch(a, new, MusicVisuals());
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();	
		main.MusicVisuals();		
	}
}