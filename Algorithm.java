import java.util.*;

import static java.util.Arrays.*;

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
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < int2D.length; i++) {
            integerArrayList.add(int2D[i][i]);
        }
        Integer[] result = integerArrayList.toArray(new Integer[0]);
        return toPrimitiveArray(result);
    }
    public int[] toPrimitiveArray(Integer[] wrappedArray) {
        int[] array = new int[wrappedArray.length];
        for (int i = 0; i < wrappedArray.length; i++) {
            array[i] = wrappedArray[i];
        }
        return array;
    }
    public String[] toPrimitiveArray(String[] wrappedArray) {
        String[] array = new String[wrappedArray.length];
        System.arraycopy(wrappedArray, 0, array, 0, wrappedArray.length);
        return array;
    }
    public String concatenatedStrings(String[][] str2D, int column) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        String result = "";
        for (int i = 0; i < str2D.length; i++) {
            stringArrayList.add(str2D[i][column]);
        }
        for (String str: stringArrayList) result = result + " " + str;
        result = result.substring(1);
        return result;
    }
    public int min2D (int[][] int2D) {
        int min = Integer.MAX_VALUE;
        for (int[] row: int2D) {
            for (int i: row) {
                if (i < min) min = i;
            }
        }
        return min;
    }
    public int max2D (int[][] int2D) {
        int min = Integer.MIN_VALUE;
        for (int[] row: int2D) {
            for (int i: row) {
                if (i > min) min = i;
            }
        }
        return min;
    }
    public String min2D (String[][] string2D) {
        String min = string2D[0][0];
        for (String[] row: string2D)
            for (String str: row) {
                if (str.length() < min.length()) min = str;
            }
        return min;
    }
    public String max2D (String[][] string2D) {
        String max = string2D[0][0];
        for (String[] row : string2D)
            for (String str : row) {
                if (str.length() > max.length()) max = str;
            }
        return max;
    }
    public int largestDifference (int[][] first, int[][] second) {
        int difference;
        int result = Math.abs(first[0][0] - second[0][0]);
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                difference = Math.abs(first[i][j] - second[i][j]);
                if (difference > result) result = difference;
            }
        }
        return result;
    }
    public double meanAverage (double[][] double2D) {
        double total = 0;
        int elements = 0;
        for (double[] row: double2D)
            for (double d: row) {
                total += d;
                elements++;
            }
        return total/elements;
    }
    public boolean containsSame(int[][] int2D) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < int2D.length; i++) {
            for (int j = 0; j < int2D[0].length; j++) {
                integers.add(int2D[i][j]);
            }
        }
        Set<Integer> removed = new HashSet<>(integers);
        return removed.size() != integers.size();
    }
    public String lastAlphabetically (String[][] string2D) {
        String last = string2D[0][0];
        for (String[] row : string2D)
            for (String str : row) {
                if (str.compareToIgnoreCase(last) > 0) last = str;
            }
        return last;
    }
}
