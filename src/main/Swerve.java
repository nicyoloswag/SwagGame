package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Swerve extends org.newdawn.slick.BasicGame{

	public static void main(String[] args) throws SlickException{
		AppGameContainer gc = new AppGameContainer(new Swerve());
		gc.setTargetFrameRate(60);
		gc.start();
	}

	public Swerve() {
		super("SWAG");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

}
