
public class Sudoku {
	private int[][] grid;
	private int row, col;
	
	public Sudoku(int[][] grid) {
		setGrid(grid);
		findSolution(this.grid);
	}
	
	void setGrid(int[][] grid) {
		this.grid = grid;
	}
	
	boolean findSolution(int[][] grid) {
		return false;
	}
	
	boolean fullGrid(int[][] grid) {
		return false;
	}
	
	void printSolution() {
		
	}
	
	void findEmpty(int[][] grid) {
		
	}
	
	boolean isValid(int i, int row, int col) {
		return false;
	}
}
