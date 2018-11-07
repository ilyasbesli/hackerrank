package interviewPreparation.warmupChallenges;

import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int altitude = 0, countingValley = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (altitude == 0 && c == 'D')
                countingValley++;

            if (c == 'D')
                altitude--;
            else
                altitude++;

        }
        return countingValley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println("result:" + result);

        scanner.close();
    }
}
