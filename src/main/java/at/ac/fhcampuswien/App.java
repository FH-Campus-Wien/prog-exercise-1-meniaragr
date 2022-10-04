package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println( "Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char nom = 'Z';
        long phrase = 0xface;
        int chiffre = 012;
        long nmb = 80L;
        float moin = 44e-1f;
        float doub = 5.5f;
        double mdr =  8.88e1;
        double x = 99.9;


        int Trans =(int)nom;
        int Ltrans = (int)phrase;
        int Ctrans = (int)chiffre;
        int ntrans = (int)nmb;
        int mtrans = (int)moin;
        int dtrans = (int)doub;
        int mdtrans =(int)mdr;
        int xtrans = (int)x;

        int summe = Trans + Ltrans + Ctrans + ntrans + mtrans + dtrans + mdtrans + xtrans ;
                System.out.println(summe);




    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int somme= x+y;

        System.out.println(somme);
    }


    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        System.out.println("Before Swap:");
        Scanner a = new Scanner(System.in);
        System.out.print("x: ");
        int x = a.nextInt();
        System.out.print("y: ");
        int y = a.nextInt();
        x = x + y;
        y = x-y;
        x= x - y;
        System.out.println("After Swap:");
        System.out.println("x: " +x);
        System.out.println("y: " +y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner n = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = n.nextInt();
        System.out.print("n2:");
        int n2 = n.nextInt();
        if(n1 > n2) {
            System.out.println(" n1 > n2");
        }
        else if (n1<n2){
            System.out.println(" n2 > n1");
        }
        else {
            System.out.println(" n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner x = new Scanner(System.in);
        System.out.print("Enter annual Revenue:");
        int rev = x.nextInt();
        if (0<= rev && rev <20000){
            System.out.println(" Poor Sales Revenue");
        }
        else if (20000<= rev && rev <50000){
            System.out.println(" Average Sales Revenue");
        }
        else if (50000<= rev && rev <80000) {
            System.out.println(" Good Sales Revenue");
        }
        else if (80000<= rev && rev <100000) {
            System.out.println(" Excellent Sales Revenue:");
        }
        else {
            System.out.println(" Invalid Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        Scanner p = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int pro = p.nextInt();

        switch (pro) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;

        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner lp = new Scanner(System.in);
        System.out.print("Year: ");

        int lpyear = lp.nextInt();

        boolean lpy =( (lpyear % 4== 0 ) && ( lpyear % 100 !=0) || (lpyear % 400 == 0));
        if (lpy){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int nbr, r = 0;
        Scanner n = new Scanner(System.in);
        System.out.print( "Number: ");
        nbr = n.nextInt();
        while(nbr != 0)
        {
            r = r * 10;
            r = r + nbr%10;
            nbr = nbr/10;
        }
        System.out.println( nbr + r);
    }






    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}