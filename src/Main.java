import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Kiwi", "Melon", "Watermelon", "Strawberry", "Pineapple",
            "Grape","Pear", "Peach"};
        String[] food = Arrays.copyOf(fruits, fruits.length);

        for (String value : food) {
            System.out.println(value);
        }

        int[][] score = new int[3][4];
        score = new int[][]{
                {10, 11, 12, 13},
                {20, 21, 22, 23},
                {30, 31, 32, 33}
        };

        int[] result = new int[3];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i] += score[i][j];
            }
        }

        System.out.print("Result array is: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}