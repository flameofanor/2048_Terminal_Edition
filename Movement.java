public class Movement {
    
    private int[][] gameArray;

    private enum Direction {
        UP (0), 
        DOWN (1), 
        LEFT (2), 
        RIGHT (3);

        private int index;

        Direction(int index) {
            this.index = index;
        }

        public int indexGetter() {
            return index;
        }
        
    }
    private char[] moveChars = {'w', 's', 'a', 'd'};

    public Movement(char move) {
        
    }


    public char[] moveCharsGetter() {
        return moveChars;
    }

    public char moveCharGetter(int index) {
        return moveChars[index];
    }

}
