import java.util.Scanner;

public class ans7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Physics:");
        int p = myObj.nextInt();

        System.out.println("Chemistry:");
        int ch = myObj.nextInt();

        System.out.println("Biology:");
        int b = myObj.nextInt();

        System.out.println("Maths:");
        int m = myObj.nextInt();

        System.out.println("Computer:");
        int c = myObj.nextInt();

        //for physics

        if (p>=90)
        {
            System.out.println("Physics:Grade A");
        }
        else if (p>=80)
        {
            System.out.println("Physics:Grade B");
        }
        else if (p>=70)
        {
            System.out.println("Physics:Grade C");
        }
        else if (p>=60)
        {
            System.out.println("Physics:Grade D");
        }
        else if (p>=40)
        {
            System.out.println("Physics:Grade E");
        }
        else if (p<40)
        {
            System.out.println("Physics:Grade F");
        }

       // for chemistry:

        if (ch>=90)
        {
            System.out.println("chemistry: Grade A");
        }
        else if (ch>=80)
        {
            System.out.println("chemistry: Grade B");
        }
        else if (ch>=70)
        {
            System.out.println("chemistry: Grade C");
        }
        else if (ch>=60)
        {
            System.out.println("chemistry: Grade D");
        }
        else if (ch>=40)
        {
            System.out.println("chemistry: Grade E");
        }
        else if (ch<40)
        {
            System.out.println("chemistry: Grade F");
        }

       //for biology:

        if (b>=90)
        {
            System.out.println("biology:  Grade A");
        }
        else if (b>=80)
        {
            System.out.println("biology: Grade B");
        }
        else if (b>=70)
        {
            System.out.println("biology: Grade C");
        }
        else if (b>=60)
        {
            System.out.println("biology: Grade D");
        }
        else if (b>=40)
        {
            System.out.println("biology: Grade E");
        }
        else if (b<40)
        {
            System.out.println("biology: Grade F");
        }

        //for maths:
        if (m>=90)
        {
            System.out.println("maths: Grade A");
        }
        else if (m>=80)
        {
            System.out.println("maths: Grade B");
        }
        else if (m>=70)
        {
            System.out.println("maths: Grade C");
        }
        else if (m>=60)
        {
            System.out.println("maths: Grade D");
        }
        else if (m>=40)
        {
            System.out.println("maths: Grade E");
        }
        else if (m<40)
        {
            System.out.println("maths: Grade F");
        }

        //for computer:

        if (c>=90)
        {
            System.out.println(" computer: Grade A");
        }
        else if (c>=80)
        {
            System.out.println("computer: Grade B");
        }
        else if (c>=70)
        {
            System.out.println("computer: Grade C");
        }
        else if (c>=60)
        {
            System.out.println("computer: Grade D");
        }
        else if (c>=40)
        {
            System.out.println("computer: Grade E");
        }
        else if (c<40)
        {
            System.out.println("computer: Grade F");
        }

        int re=(p+ch+b+m+c)/500*100;
        System.out.println(re+"% total obtained");
    }


}
