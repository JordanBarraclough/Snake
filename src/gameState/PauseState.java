package gameState;

import java.awt.*;
import java.awt.event.KeyEvent;

import main.Game;

public class PauseState extends GameState{
	
	//CONSTRUCTOR
	public PauseState(GameStateManager gsm){
		this.gsm = gsm;
	}

	public void initialise() {	
	}

	public void update() {
	}

	public void draw(Graphics2D g) {	
		g.setFont(new Font("Tahoma", Font.PLAIN, 25));
		g.setColor(Color.GREEN);
		String s = "Press Escape to resume play";
		int length = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		g.drawString(s, Game.WIDTH / 2 - length / 2, Game.HEIGHT / 2);
	}

	public void keyPressed(int key) {
		if (key == KeyEvent.VK_ESCAPE) {
			gsm.resume();
		}
	}

	public void keyReleased(int key) {
		
	}
	
}
