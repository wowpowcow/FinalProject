package game;

import display.Window;

//thread is like a mini program runs class seperately from program

public class Game implements Runnable
{
	private Window window;
	public int width, height;
	
	private Thread thread;
	private boolean running =false;
	
	public Game(String t, int w, int h)
	{
		width = w;
		height = h;
		window = new Window(t, width,height);
	}
	private void init()
	{
		//initialized all the graphics
	}
	
	private void update()
	{
		
	}
	
	private void render()
	{
		
	}
	public void run()
	{
		init();
		while(running)
		{
			update();
			render();
		}
		stop();
	}
	// only use synch when you are using thread so nothing get messed up
	public synchronized void start()
	{
		running = true;
		thread = new Thread(this);
		//calls run method
		thread.start();
	}
	
	public synchronized void stop()
	{
		//closes thread properly
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
