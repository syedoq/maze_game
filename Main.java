import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Main{
	
	public static void main(String[] args){
		gameLoop();
	}
	static void gameLoop(){
		
		JFrame jframe = new JFrame("Game");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Board board = new Board();
        jframe.add(board);
        
		jframe.pack();
		jframe.setResizable(false);
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null);
		
		jframe.addKeyListener(new KeyAdapter() {	//arguement
			public void keyPressed(KeyEvent e){
				super.keyPressed(e);	//to call parent class
				int key = e.getKeyCode();
							
				if(key == KeyEvent.VK_LEFT){
					board.move(1);
				}else if(key == KeyEvent.VK_RIGHT){
					board.move(2);
					
				}else if(key == KeyEvent.VK_UP){
					board.move(3);
					
				}else if(key == KeyEvent.VK_DOWN){
					board.move(4);
				}
				board.repaint();	//defined function of class jpanel
			}
		});
	}
};