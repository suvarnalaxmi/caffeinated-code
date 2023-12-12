public class Conditions {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        int a = 1000;
        //int a = 2500;
        if(a<2000)
        {
            System.out.println("Less than 2000");
        }
        else
            if(a>2000)
        {
            System.out.println("Greater than 2000");
        }

        int day = 4;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}