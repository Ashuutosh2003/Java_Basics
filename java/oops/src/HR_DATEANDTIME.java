
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {


// IN HACKER RANK ONLY THIS LINE OF CODE NEEDED

// -------START-----
    public static String findDay(int month, int day, int year) {
        String[] DAY_OF_WEEK = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "Thursday", "Friday", "Saturday"};

        Calendar cal = Calendar.getInstance();

        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        return DAY_OF_WEEK[dayOfWeek-1];
        //-------END---------
    }


}

//---GIVEN----

public class HR_DATEANDTIME {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
