import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuTest {

	@Test
	public void testFullGrid() {
		int [][] gridFull = {{1,2,3},{1,2,3},{1,2,3}};
		int [][] gridNotFull = {{1,2,0},{1,2,3},{1,2,3}};
		Sudoku testFull = new Sudoku(gridFull);
		Sudoku testNotFull = new Sudoku(gridNotFull);
		assertEquals(testFull.gridIsFull(), true);
		assertEquals(testNotFull.gridIsFull(), false);
	}
	
	@Test
	public void testPrintSolution() {
		int [][] testGrid = {{1,2,3},{1,2,3},{1,2,3}};
		Sudoku testPrint = new Sudoku(testGrid);
		testPrint.printSolution();
	}
	
	@Test
	public void testIsValidRow() {
		int [][] testGrid = {{1,1,1},{2,2,2},{3,3,3}};
		Sudoku testRow = new Sudoku(testGrid);
		assertEquals(testRow.isValidRow(1, 0), false);
		assertEquals(testRow.isValidRow(1, 1), true);
	}
	
	@Test
	public void testIsValidCol() {
		int [][] testGrid = {{1,2,3},{1,2,3},{1,2,3}};
		Sudoku testRow = new Sudoku(testGrid);
		assertEquals(testRow.isValidCol(1, 0), false);
		assertEquals(testRow.isValidCol(1, 1), true);
	}
	
	@Test
	public void testIsValidSquare() {
		int [][] testGrid = {{1,1,1, 2,2,2, 3,3,3},
							 {1,1,1, 2,2,2, 3,3,3},
							 {1,1,1, 2,2,2, 3,3,3},
							 
							 {4,4,4, 5,5,5, 6,6,6},
							 {4,4,4, 5,5,5, 6,6,6},
							 {4,4,4, 5,5,5, 6,6,6},
							 
							 {7,7,7, 8,8,8, 9,9,9},
							 {7,7,7, 8,8,8, 9,9,9},
							 {7,7,7, 8,8,8, 9,9,9}};
		
		Sudoku testSquare = new Sudoku(testGrid);
		assertEquals(testSquare.isValidSquare(1, 0, 0), false);
		assertEquals(testSquare.isValidSquare(1, 3, 3), true);
	}
	
	@Test
	public void testSolver() {
		int [][] testGrid = {{5,3,0, 0,7,0, 0,0,0},
				  			 {6,0,0, 1,9,5, 0,0,0},
							 {0,9,8, 0,0,0, 0,6,0},
							 
							 {8,0,0, 0,6,0, 0,0,3},
							 {4,0,0, 8,0,3, 0,0,1},
						     {7,0,0, 0,2,0, 0,0,6},
						     
							 {0,6,0, 0,0,0, 2,8,0},
							 {0,0,0, 4,1,9, 0,0,5},
							 {0,0,0, 0,8,0, 0,7,9}};
		
		Sudoku testSolver = new Sudoku(testGrid);
		testSolver.findSolution();
	}
}
