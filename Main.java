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
        System.out.println(a.concatenatedStrings(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}, 1));
        System.out.println(a.concatenatedStrings(new String[][]{{"one", "two", "three"}, {"uno", "dos", "tres"}}, 2));
        System.out.println(a.concatenatedStrings(new String[][]{{"a", "b", "c"}, {"A", "B", "C"}}, 0));
    }
}
