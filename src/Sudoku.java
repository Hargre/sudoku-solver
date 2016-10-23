
public class Sudoku {
	private int[][] grid;
	private int row, col;
	
	public Sudoku(int[][] grid) {
		setGrid(grid);
	}
	
	void setGrid(int[][] grid) {
		this.grid = grid;
	}
	
	boolean findSolution(int[][] grid) {
		return false;
	}
	
	boolean fullGrid(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	void printSolution() {
		
	}
	
	void findEmpty(int[][] grid) {
		
	}
	
	boolean isValid(int i, int row, int col) {
		return false;
	}
}
