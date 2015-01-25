package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Swerve extends org.newdawn.slick.BasicGame{
	private static final int WIDTH = 750;
	private static final int HEIGHT = 650;

	private int x = 40;
	private int y = 60;
	private int radius = 42;
	private int diameter = radius*2;
	private int speed = 10;


	public static void main(String[] args) throws SlickException{
		AppGameContainer gc = new AppGameContainer(new Swerve());
		gc.setTargetFrameRate(60);
		gc.setDisplayMode(WIDTH, HEIGHT, false);
		gc.start();
	}

	public Swerve() {
		super("SWAG");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics graphics) throws SlickException {
		// TODO Auto-generated method stub
		graphics.setBackground(Color.white);
		graphics.setColor(Color.cyan);
		graphics.fillOval(x, y, radius*2, radius*2);

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GameContainer gc, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		Input input = gc.getInput();
		if(input.isKeyDown(Input.KEY_S)){
			y = y+speed;
		}
		if(input.isKeyDown(Input.KEY_W)){
			y = y-speed;
		}
		if(input.isKeyDown(Input.KEY_A)){
			x = x-speed;
		}
		if(input.isKeyDown(Input.KEY_D)){
			x = x+speed;
		}

		if(x < 0){
			x = 0;
		}
		else if(x+diameter > WIDTH){
			x = WIDTH - diameter;
		}
		if(y < 0){
			y = 0;
		}
		else if(y+ diameter > HEIGHT){
			y = HEIGHT - diameter;
		}
	}

}
