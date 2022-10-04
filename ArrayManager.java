import java.security.InvalidAlgorithmParameterException;
import java.lang.reflect.Parameter;
import java.math.*;

public class ArrayManager {
    
    private int arraySize;
    private int winningNumber;

    private int[][] gameArray;
	
    public ArrayManager (int arraySize, int winningNumber, int baseNum) throws Exception {
        if (!checkIfValidWinningNumber(winningNumber, baseNum)) throw new Exception("winNum or baseNum are not valid. to be valid " +
                                                                                    "the winning number must be at least basenum * basenum " + 
                                                                                    "* basenum, and logBase:baseNum of x, x|x is a positive " +
                                                                                    "int returns an int (for example, logBase:2(2048) " +
                                                                                    "equals 11, a positive int (2^11 = 2048))" +
                                                                                    "\n if you have questions, post an issue on github " +
                                                                                    "or discord flame_of_anor#2679 (main author)");
        gameArray = new int[arraySize][arraySize];
		winningNumberSet(winningNumber);
		arraySizeSet(arraySize);
    }

	public ArrayManager (int arraySize) throws Exception {
		this(arraySize, 2048, 2);
	}

    public void initialize() {
        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray[i].length; j++) {
                gameArray[i][j] = 0;
            }
        }
    }

    public boolean checkIfValidWinningNumber(int winNum, int baseNum){ //more efficent by using logs?
        if (winNum < baseNum * baseNum * baseNum || baseNum < 2) return false;
        while(winNum % baseNum == 0) {
            if (winNum % baseNum == 0) {
                winNum = winNum / baseNum;
                if (winNum == 1) return true;
            }
        }
        return false;
    }








	//Stuff:
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
    public int[] gameArrayGetRow(int row) {
        return gameArray[row];
    }
    public int[] gameArrayGetCol(int col) {
        int[] temp = new int[arraySize];
        for (int i = 0; i < gameArray.length; i++) {
            temp[i] = gameArray[i][col];
        }
        return temp;
    }
    public int gameArrayGet(int row, int col) {
        return gameArray[row][col];
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < gameArray.length; i++) {
            temp += "[";
            for (int j = 0; j < gameArray[i].length; j++) {
                temp += "" + gameArray[i][j];
                if (j + 1 < arraySize) temp += ", ";
            }
            temp += "]";
            temp += "\n";
        }
        return temp;
    }




	//#endregion

}
