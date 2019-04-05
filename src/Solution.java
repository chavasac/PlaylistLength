import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String arLength = scanner.nextLine();

        int n = Integer.parseInt(arLength);

        int totalMinues = 0;
        int totalSeconds = 0;
        int totalHours = 0;
        for (int playlistRowItr = 0; playlistRowItr < n; playlistRowItr++) {
            String[] playlistRowItems = scanner.nextLine().split(" ");

            totalMinues += Integer.parseInt(playlistRowItems[0]);
            totalSeconds += Integer.parseInt(playlistRowItems[1]);
        }
        
        totalMinues += (totalSeconds / 60);
        totalHours += (totalMinues / 60);
        System.out.println(totalHours + " " + (totalMinues % 60) + " " + ((totalSeconds % 60)));

        scanner.close();
    }
}
