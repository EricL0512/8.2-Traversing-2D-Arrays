public class Algorithm {
    public int contains(String[][] str2D, String str) {
        int count = 0;
        for (String[] indexArr: str2D) {
            for (String index: indexArr) {
                if (index.contains(str)) {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean hasInteger(int[][] int2D, int integer) {
        for (int[] indexArr: int2D) {
            for (int index: indexArr) {
                if (integer == index) return true;
            }
        }
        return false;
    }
    public int[] indexOfOccurrence(int[][] int2D, int integer) {
        for (int indexArr = 0; indexArr < int2D.length; indexArr++) {
            for (int index = 0; index < int2D[indexArr].length; index++) {
                if (int2D[indexArr][index] == integer) return new int[] {indexArr, index};
            }
        }
        return new int[] {-1, -1};
    }
    // Not sure if this is what the method is asking for
    public int[] diagonalArray(int[][] int2D) {
        return new int[] {int2D[0][0], int2D[1][1]};
    }
    public String concatenatedStrings(String[][] str2D, int column) {
        return str2D[0][column] + " " + str2D[1][column];
    }
}
