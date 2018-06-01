package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.SwingUtilities;

import fr.exia.insanevehicles.controller.UserOrder;
import showboard.BoardFrame;

public class View implements Runnable, KeyListener{

	// ATTRIBUTS
	private final int squareSize = 50;
	private final int roadView = 10;
	private int view;
	private Rectangle closeView;
	private IMap map;
	private IMbobile mobile;
	
	
	// METHODES
	public View(final IMap map, IMobile mobile) throws IOException{
		this.setView(roadView);
        this.setMap(map);
        this.setMobile(mobile);
        this.getMobile().getSprite().loadImage();
        this.setCloseView(new Rectangle(0, this.getMobile().getY(), this.getMap().getWidth(), roadView));
        SwingUtilities.invokeLater(this);
	}
	
	public final void run() {
		final BoardFrame boardFrame = new BoardFrame("Close view");
        boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);

        for (int x = 0; x < this.getMap().getWidth(); x++) {
            for (int y = 0; y < this.getMap().getHeight(); y++) {
                boardFrame.addSquare(this.map.getOnTheRoadXY(x, y), x, y);
            }
        }
        boardFrame.addPawn(this.getMobile());

        this.getMap().getObservable().addObserver(boardFrame.getObserver());

        boardFrame.setVisible(true);
	}
	
	public void show(int yStart) {
		int y = yStart % this.getMap().getHeight();
        for (int view = 0; view < this.getView(); view++) {
            for (int x = 0; x < this.getMap().getWidth(); x++) {
                if ((x == this.getMobile().getX()) && (y == yStart)) {
                    System.out.print(this.getMobile().getSprite().getConsoleImage());
                } else {
                    System.out.print(this.getMap().getOnTheRoadXY(x, y).getSprite().getConsoleImage());
                }
            }
            y = (y + 1) % this.getMap().getHeight();
            System.out.print("\n");
        }
	}
    
	private static UserOrder keyCodeToUserOrder(final int keyCode) {
		
	}
	
	public int getView() {
		
	}
	
	private void setView(final int view) {
		
	}
	
	private Rectangle getCloseView() {
		
	}
	
	private void setCloseView(Rectangle closeView) {
	
	}
	
	public IMobile getMobile() {
		
	}
	
	public void setMobile(IMobile mobile) {
		
	}
	
	public IMap getMap() {
		
	}
	
	public void setMap(IMap map) {
		
	}
	
	public void keyTyped(KeyEvent keyEvent) {
		
	}
	
	public void keyPressed(KeyEvent keyEvent) {
		
	}
	
	public void keyReleased(KeyEvent keyEvent) {
		
	}
}
