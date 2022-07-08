import java.util.Scanner;

    public class Queue {
        public static void main(String[] args)
        {
            int d ;
            Scanner sc = new Scanner(System.in);
            Queuell  s = new Queuell();
            int l ;
            do
            {
                System.out.println("Press 1 to enqueue");
                System.out.println("Press 2 to dequeue");
                System.out.println("Press 3 to display");
                System.out.println("Enter your Choice");
                d = sc.nextInt();
                switch (d) {
                    case 1 -> {
                        s.enqueue(sc);
                        break;
                    }
                    case 2 -> {
                        s.dequeue();
                        break;
                    }
                    case 3 -> {
                        s.display();
                        break;
                    }
                }
                System.out.println("Enter 0 to go back to menu ");
                System.out.println("Enter any key to exit ");
                l=sc.nextInt();
            }while(l==0);
            System.out.println("Exit successfully");



        }

    }

