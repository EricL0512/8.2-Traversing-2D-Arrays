public class Main {
    public static void print(int[] integers) {
        for (int i: integers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Algorithm a = new Algorithm();
        System.out.println("Contains String");
        System.out.println(a.contains(new String[][] {{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}}, "e"));
        System.out.println(a.contains(new String[][] {{"apples", "are","amazing"}, {"bananas", "are", "amazing"}}, "amazing"));
        System.out.println(a.contains(new String[][] {{"one", "two", "three"}, {"uno", "due", "tre"}}, "dos"));
        System.out.println("Has Integer");
        System.out.println(a.hasInteger(new int[][] {{1, 2},{3, 4}}, 5));
        System.out.println(a.hasInteger(new int[][] {{10, 20},{30, 40}}, 10));
        System.out.println(a.hasInteger(new int[][] {{-1, 0},{2, 3}}, 1));
        System.out.println("Index of Occurrence");
        print(a.indexOfOccurrence(new int[][] {{1, 2},{3, 4}}, 3));
        print(a.indexOfOccurrence(new int[][] {{5, 6},{7, 8}}, 9));
        print(a.indexOfOccurrence(new int[][] {{-4, -3},{-2, -1}}, -1));
        System.out.println("Diagonal elements");
        print(a.diagonalArray(new int[][] {{1, 2},{3, 4}}));
        print(a.diagonalArray(new int[][] {{5, 6},{7, 8}}));
        print(a.diagonalArray(new int[][] {{0, 0},{0, 0}}));
        System.out.println("Concatenated Strings Column");
        System.out.println(a.concatenatedStrings(new String[][] {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}, 1));
        System.out.println(a.concatenatedStrings(new String[][] {{"one", "two", "three"}, {"uno", "dos", "tres"}}, 2));
        System.out.println(a.concatenatedStrings(new String[][] {{"a", "b", "c"}, {"A", "B", "C"}}, 0));
        System.out.println("Maximum Integer");
        System.out.println(a.max2D(new int[][] {{3, 2, 1}, {4, 5, 6}}));
        System.out.println(a.max2D(new int[][] {{-10, -9, -8}, {8, 9, 10}}));
        System.out.println(a.max2D(new int[][] {{0, 0, 1}, {1, 0, 2}}));
        System.out.println("Minimum Integer");
        System.out.println(a.min2D(new int[][] {{3, 2, 1}, {4, 5, 6}}));
        System.out.println(a.min2D(new int[][] {{-10, -9, -8}, {8, 9, 10}}));
        System.out.println(a.min2D(new int[][] {{0, 0, 1}, {1, 0, 2}}));
        System.out.println("Shortest String");
        System.out.println(a.min2D(new String[][] {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}));
        System.out.println(a.min2D(new String[][] {{"The", "quick", "brown"}, {"Fox", "is", "jumping"}}));
        System.out.println(a.min2D(new String[][] {{"A", "BB", "CCC"}, {"DDDD", "EEEEE", "FFFFFF"}}));
        System.out.println("Longest String");
        System.out.println(a.max2D(new String[][] {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}));
        System.out.println(a.max2D(new String[][] {{"The", "quick", "brown"}, {"Fox", "is", "jumping"}}));
        System.out.println(a.max2D(new String[][] {{"A", "BB", "CCC"}, {"DDDD", "EEEEE", "FFFFFF"}}));
        System.out.println("Largest Corresponding Absolute Difference");
        System.out.println(a.largestDifference(new int[][] {{2, 3, 4}, {-1, -2, -3}}, new int[][] {{1, 2, 3}, {4, 5, 6}}));
        System.out.println(a.largestDifference(new int[][] {{1, 2, 3}, {4, 5, 6}}, new int[][] {{2, 4, 6}, {8, 10, 12}}));
        System.out.println(a.largestDifference(new int[][] {{-10, -9, -8}, {-7, -6, -5}}, new int[][] {{5, 6, 7}, {8, 9, 11}}));
        System.out.println("Mean Average");
        System.out.println(a.meanAverage(new double[][] {{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}}));
        System.out.println(a.meanAverage(new double[][] {{1.5, 3, 3.5}, {6, 4.5, 5}}));
        System.out.println(a.meanAverage(new double[][] {{1, 2, 3}, {4, 5, 6}}));
        System.out.println("Contains Duplicates");
        System.out.println(a.containsSame(new int[][] {{1, 2}, {3, 2}}));
        System.out.println(a.containsSame(new int[][] {{5, 6, 7}, {8, 9, 10}}));
        System.out.println(a.containsSame(new int[][] {{1, 1, 1}, {2, 2, 2}}));
        System.out.println("Last Alphabetically");
        System.out.println(a.lastAlphabetically(new String[][] {{"bravo", "charlie"}, {"zebra", "alpha"}}));
        System.out.println(a.lastAlphabetically(new String[][] {{"a", "b", "c"}, {"e", "d", "f"}}));
        System.out.println(a.lastAlphabetically(new String[][] {{"Hello", "Hi"}, {"Hey", "Yo"}}));
    }
}
