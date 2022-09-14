public class ArrayManager {
    
    private int arraySize;
    private int winningNumber;

    private int[][] gameArray;
	
    public ArrayManager (int arraySize, int winningNumber) {
        gameArray = new int[arraySize][arraySize];
		winningNumberSet(winningNumber);
		arraySizeSet(arraySize);
    }

	public ArrayManager (int arraySize) {
		this(arraySize, 2048);
	}








	//Getters and setters:
	//#region

    public int arraySizeGet() {
		return arraySize;
	}
	public void arraySizeSet(int x) {
		arraySize = x;
	}

	public int winningNumberGet() {
		return winningNumber;
	}
	public void winningNumberSet(int x) {
		winningNumber = x;
	}

    public int[][] gameArrayGetFull() {
        return gameArray;
    }
    public int[] gameArrayGet(int row) {
        return gameArray[row];
    }
    public int gameArrayGet(int row, int col) {
        return gameArray[row][col];
    }




	//#endregion

}
