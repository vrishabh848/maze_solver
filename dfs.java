package mazesolver;

import java.util.List;

public class dfs {
	public static int[] dr=new int[] {0,-1,1,0};
	public static int[] dc=new int[] {1,0,0,-1};
	public static boolean searchPath(int[][] maze,int x,int y, List<Integer> path) {
		if(maze[x][y]==9) {
			path.add(x);
			path.add(y);
			return true;
		}
		if(maze[x][y]==0){
			maze[x][y]=2;
			int dr=-1;
			int dc=0;
			
			if(searchPath(maze,x+dr,y+dc,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
			
			dr=1;
			dc=0;
			
			if(searchPath(maze,x+dr,y+dc,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
			
			dr=0;
			dc=-1;
			if(searchPath(maze,x+dr,y+dc,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
			
			dr=0;
			dc=1;
			if(searchPath(maze,x+dr,y+dc,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
			
			if(searchPath(maze,x+dr,y+dc,path)) {
				path.add(x);
				path.add(y);
				return true;
			}
		}
		
		
		
		return false;
	}
}
