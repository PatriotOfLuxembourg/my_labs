import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        // 1 ЗАДАЧА  
        /* for(int x = 1; x < 500; x++){
            if ((x % 5 == 0) && (x % 7 == 0)) {
                System.out.println("x: " + x +" fizzbuzz");
                }
            if (x % 5 == 0) {
                System.out.println("x: " + x + " fizz");
                }
            if (x % 7 == 0) {
                System.out.println("x: " + x +" buzz");
                }
            }   */     

//----------------------------------------------------------

        // 2 ЗАДАЧА 
        /* String booba = "make install";
        for (int i = booba.length()-1; i >= 0; i--) {
            System.out.print(booba.charAt(i));
        } */
       
//----------------------------------------------------------
        
        // 3 ЗАДАЧА
        /* double a, b, c, x, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        a = scanner.nextInt();
        System.out.print("Input b: ");
        b = scanner.nextInt();
        System.out.print("Input c: ");
        c = scanner.nextInt();

        double D = Math.pow(b, 2) - 4*a*c;
        if (D < 0) {
            System.out.println("Kornei net :(");
        }
        else if (D == 0) {
            x = -b / (2 * a);
            System.out.println("1 koren: " + x);
        }
        else {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("1 koren: " + x1);
            System.out.println("2 koren: " + x2);
        } */
       

//----------------------------------------------------------
        // 4 ЗАДАЧА
        /* double n = 2;
        double res = 1 / (Math.pow(n, 2) + n - 2);
        System.out.println(res);
        while (res > Math.pow(10, -6)){
            n = n + 1;
            res = 1 / (Math.pow(n, 2) + n - 2);
            System.out.println(res);
        }
        */

//----------------------------------------------------------
        
        // 5 ЗАДАЧА
        /* Scanner booba = new Scanner(System.in);
        System.out.println("Input string: ");
        String a = booba.nextLine();
        booba.close();
        for (int i = 0; i < (a.length() / 2); i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)){
            System.out.println("ne palindrom");
            break;
        }
        System.out.println("palindrom");
        break;
        }
        */
}
}