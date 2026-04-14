import java.util.Arrays;

public class Solution {

    // 1. 定義 Student 類別 (加上 public 以消除導出警告)
    public static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        void printInfo() {
            System.out.print(this.name + ": " + this.score);
        }
    }

    public static void main(String[] args) {
        
        // --- 陣列基礎操作 ---
        
        // 1. Calculate the Average Score
        int[] scores1 = {50, 60, 70}; 
        double avg = (double) sum(scores1) / scores1.length;
        System.out.println("1. Average: " + avg);

        // 2. Find the Maximum Value
        int[] scores2 = {5, 9, 3, 7};
        System.out.println("2. Max value: " + findMax(scores2));

        // 3. Add Bonus Points (+5 pts)
        int[] scores3 = {60, 70};
        addBonus(scores3);
        System.out.println("3. Scores after bonus: " + Arrays.toString(scores3));

        // --- 物件導向操作 ---

        // 4. Create and Print a Student Object
        Student tom = new Student("Tom", 85);
        System.out.print("4. ");
        tom.printInfo();
        System.out.println();

        // 5. Apply Score Curve (If < 60, +10 pts)
        Student tomCurve = new Student("Tom", 55);
        curve(tomCurve);
        System.out.print("5. After curve: ");
        tomCurve.printInfo();
        System.out.println();

        // --- 綜合應用 ---

        // 6. Count Passing Students (>= 60)
        int[] classScores = {45, 60, 80, 59, 100};
        int passCount = 0;
        for (int s : classScores) if (s >= 60) passCount++;
        System.out.println("6. Number of passing students: " + passCount);

        // 7. Sum All Elements
        int[] sumArr = {1, 2, 3, 4};
        System.out.println("7. Sum: " + sum(sumArr));

        // 8. Print an Array of Student Objects
        System.out.println("8. Student List: ");
        Student[] students = {
            new Student("Tom", 85),
            new Student("Mary", 90),
            new Student("John", 78)
        };
        for (Student s : students) {
            System.out.print("   - ");
            s.printInfo();
            System.out.println();
        }

        // 9. Update a Student's Score
        Student tomUpdate = new Student("Tom", 85);
        updateScore(tomUpdate, 95);
        System.out.print("9. After update: ");
        tomUpdate.printInfo();
        System.out.println();

        // 10. Find the Minimum Score
        int[] minScores = {70, 85, 62, 90, 58};
        System.out.println("10. Min score: " + findMin(minScores));
    }

    // --- 各功能方法 (Methods) ---

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static void addBonus(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5;
        }
    }

    public static void curve(Student s) {
        if (s.score < 60) {
            s.score += 10;
        }
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    public static void updateScore(Student s, int newScore) {
        s.score = newScore;
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }
}