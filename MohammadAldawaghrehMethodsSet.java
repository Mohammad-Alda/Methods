import java.util.*;

public class MohammadAldawaghrehMethodsSet {
    static Scanner sc = new Scanner( System.in );
    //calculates area of circle
    public static double areaCircle (double radius)
    {
        double area;
        area = Math.PI * Math.pow(radius, 2.0);
        return area;
    }
    //determines if double given is odd or even using a boolean variable
    public static boolean odd (double num)
    {
        if ( num % 2 != 0)
        {
           return true;
        }
        else 
        return false;  
    }
    //calculates area of circle using areaCircle method and determines whether its odd or even using odd method
    public static void circleArea ()
    {
        Scanner  sc = new Scanner (System.in);
        
        double radius;

        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();

        if (odd(radius))//uses odd method **method overload...
            System.out.println("The radius is odd");
        else
            System.out.println("The radius is even");

        System.out.format("Area = %.4f", areaCircle(radius));
        System.out.println(" square units");
        System.out.println();
    }
    //determines month name using an array
    public static String monthName (int month)
    {
        String monthname;//assigns month names to respective indexes
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if(month < 0 && month >12) {
            return "Invalid";
        }
        else 
        {
            monthname = months[month - 1];
            return monthname;
        }
    }
    //uses an array to determine the number of days in a month number entered by user
    public static int daysInMonth (int monthNumber)
    {
        int [] monthDays = {31, 28, 31,30,31,30,31,31,30,31,30,31};

        if (monthNumber > 0 && monthNumber <13 )
        return monthDays[monthNumber-1]; 
        else
        return 0;
    }
    //generates random integer in range entered by user
    public static int random (int max, int min)
    {
        Random ran = new Random();

        int roll;
        int diff = max - min;
        roll = ran.nextInt(diff)+min;
        return roll;
    }
    //generates heads or tails using the random method
    public static char flip ()
    {
        if (random(2,0) == 1)
            return 'h';
        else
            return 't';
    }
    //generates a random letter using ascii
    public static char randomLetter ()
    {
        int num = random(90,65);
        char ascii = (char)num;
        return ascii;
    }
    //displays all the months and the number of days in each month
    public static void monthDays ()
    {
        Scanner sc = new Scanner (System.in);

        System.out.format("%-5s","Month:");
        System.out.format("%8s%n","Days:");
        System.out.println("--------------");
        for (int x = 1;  x < 13; x++)
        {
            System.out.format ("%-10s", monthName(x));
            System.out.println (daysInMonth(x));
        }
        System.out.println();
    }
    
    public static void flipsAndLetters()
    {
        //generates 10 heads and tails at random and calculates tails percentage
        double tails = 0;
        double percent;
        for(int x = 1; x <= 10; x++)
        {
            char temp = flip();
            if(temp == 't')
                tails++;
            System.out.print(temp);
        }

        percent = ((tails/10)*100);
        System.out.println("  " + percent + "% tails");
        System.out.println();
        
        //generates 4 random letters 5 times
        for (int x = 1; x <= 5; x++)
        {
            for (int i = 1; i <= 4; i++)
            {
                System.out.print(randomLetter());
            }
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    public static void main (String[] args)
    {
        Scanner  sc = new Scanner (System.in);
        int choice;
        do
        {
            System.out.println("------Methods Set Menu------");
            System.out.println("1. Circle Area");
            System.out.println("2. Month Days");
            System.out.println("3. Random Flips and Letters");
            System.out.println("0. Quit");
            choice = sc.nextInt();
            System.out.println();

            if (choice == 1)
            {
                circleArea();
            }
            else if (choice == 2)
            {
                monthDays();
            }
            else if (choice == 3)
            {
                flipsAndLetters();
            }
        }
        while (choice != 0);
        System.out.print('\u000c');
    }
}