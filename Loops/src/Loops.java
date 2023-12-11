public class Loops {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int count = 1;

        //while loop
        while(count!= 5)
        {
            System.out.println(count);
            count++;
        }


        //for loop
        for (int c=1;c!=5;c++)
        {
            System.out.println(c);
        }

        //do while loop
        int counter=1;
        do {
            System.out.println(counter);
            counter++;
        }while(counter!=5);

    }
}