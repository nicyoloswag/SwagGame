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

	private int x = 50;
	private int y = 75;
	private int radius = 10;
	private int speed = 10;

	public static void main(String[] args) throws SlickException{
		AppGameContainer gc = new AppGameContainer(new Swerve());
		gc.setDisplayMode(WIDTH, HEIGHT, false);
		gc.setTargetFrameRate(60);
		gc.start();
	}

	public Swerve() {
		super("SWAG");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics graphics) throws SlickException {
		graphics.setBackground(Color.white);
		graphics.setColor(Color.blue);
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
			y += speed;
		}
		if(input.isKeyDown(Input.KEY_W)){
			y -= speed;
		}
		if(input.isKeyDown(Input.KEY_A)){
			x -= speed;
		}
		if(input.isKeyDown(Input.KEY_D)){
			x += speed;
		}

		if(x < 0){
			x = 0;
		}
		else if(x+radius*2 > WIDTH){
			x = WIDTH-radius*2;
		}
		if(y < 0){
			y = 0;
		}
		else if(y+radius*2 > HEIGHT){
			y = HEIGHT-radius*2;
		}
	}

}
