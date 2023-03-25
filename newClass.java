package mazesolver;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class newClass extends JFrame{
	private int [][] maze = 
	 		{ {1,1,1,1,1,1,1,1,1,1,1,1,1},
			  {1,0,1,0,1,0,1,0,0,0,0,0,1},
			  {1,0,1,0,0,0,1,1,1,1,1,0,1},
			  {1,0,1,0,1,1,1,0,0,0,0,0,1},
			  {1,0,1,0,0,0,0,0,1,1,1,0,1},
			  {1,0,1,0,1,1,1,0,1,0,0,0,1},
			  {1,0,1,0,1,0,0,0,1,1,1,0,1},
			  {1,0,1,0,1,1,1,0,1,0,1,0,1},
			  {1,0,0,0,0,0,0,0,0,0,1,9,1},
			  {1,1,1,1,1,1,1,1,1,1,1,1,1}

			};
	
	public List<Integer> path=new ArrayList<>();
	
	//constructor
	public newClass() {
		dfs.searchPath( maze , 1 , 1 , path );
		//System.out.println(path);
		
		setTitle("Maze Solver");
		setSize(640,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	@Override
	public void paint(Graphics g) {
		g.translate(50,50);
		
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				Color color;
				switch(maze[i][j]) {
				case 1: color=Color.BLACK;break;
				case 9: color=Color.RED;break;
				default: color=Color.WHITE;break;
				}
				g.setColor(color);
				g.fillRect(30*j,i*30, 30, 30);
				g.setColor(Color.RED);
				g.drawRect(30*j,i*30, 30, 30);
			}
		}
		
		for(int i=0;i<path.size();i+=2) {
			g.setColor(Color.GREEN);
			
			
			g.fillRect(30*path.get(i+1),path.get(i)*30, 10, 10);
		}
	}
	
}
