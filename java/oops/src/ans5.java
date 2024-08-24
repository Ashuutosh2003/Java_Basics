import java.util.Scanner;

public class ans5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("enter a number to get day:");
        int a = myObj.nextInt();

        if (a==1)
        {
            System.out.println("Sun");
        }

        else if (a==2)
        {
            System.out.println("mon");
        }

        else if (a==3)
        {
            System.out.println("Tue");
        }

        else if (a==4)
        {
            System.out.println("Wed");
        }

        else if (a==5)
        {
            System.out.println("Thu");
        }

        else if (a==6)
        {
            System.out.println("Fri");
        }

        else if (a==7)
        {
            System.out.println("Sat");
        }

    }


}
