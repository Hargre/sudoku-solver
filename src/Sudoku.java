
public class Sudoku {
	private int[][] grid;
	private int row;
	private int col;
	
	public Sudoku(int[][] grid) {
		this.grid = grid;
		this.row = 0;
		this.col = 0;
	}
	
	boolean findSolution() {
		if (gridIsFull()) {
			printSolution();
			return true;
		}
		
		for (int i = 1; i <= 9; i++) {
			findEmpty();
			if (isValid(i, this.row, this.col)) {
				int row = this.row;
				int col = this.col;
				
				this.grid[row][col] = i;
				if (findSolution()) {
					return true;
				}
				
				grid[row][col] = 0;
			}
		}
		return false;
	}
	
	boolean gridIsFull() {
		for (int i = 0; i < this.grid.length; i++) {
			for (int j = 0; j < this.grid[i].length; j++) {
				if (this.grid[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	void printSolution() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (j % 3 == 0) {
					System.out.print("| ");
				}
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
			if ((i + 1) % 3 == 0) {
				System.out.println("-----------------------");
			}
		}
	}
	
	void findEmpty() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 0) {
					this.row = i;
					this.col = j;
					return;
				}
			}
		}
	}
	
	boolean isValid(int value, int row, int col) {
		return (isValidRow(value, row) && isValidCol(value, col) && isValidSquare(value, row, col));
	}
	
	boolean isValidRow(int value, int row) {
		for (int j = 0; j < grid[row].length; j++) {
			if (grid[row][j] == value) {
				return false;
			}
		}
		return true;
	}
	
	boolean isValidCol(int value, int col) {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][col] == value) {
				return false;
			}
		}
		return true;
	}
	
	boolean isValidSquare(int value, int row, int col) {
		int startRow = (row/3) * 3;
		int startCol = (col/3) * 3;
		int endRow = startRow + 3;
		int endCol = startCol + 3;
		
		for (int i = startRow; i < endRow; i++) {
			for (int j = startCol; j < endCol; j++) {
				if (grid[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
}
