import java.util.Scanner;

// 1 ЗАДАЧА-----------------------------------------------------


class Triangle {
    void triangle(int a, int b, int c){
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("Не треугольник");
        }
        else {
            System.out.println("Треугольник");
        }
}
}

public class Laba2 {
        
        public static void main(String[] args) {
            Triangle treugolnik = new Triangle();
            int a, b, c;
            Scanner abc = new Scanner(System.in);
            System.out.print("Input a number 'a': ");
            a = abc.nextInt();
            System.out.print("Input a number 'b': ");
            b = abc.nextInt();
            System.out.print("Input a number 'c': ");
            c = abc.nextInt();
            abc.close();
            treugolnik.triangle(a, b, c);
    }
}


// 2 ЗАДАЧА-----------------------------------------------------

/*
class Pifagor {
    void distance(int x1, int y1, int x2, int y2){
        System.out.println(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
    }
}

public class Laba2 {
        
    public static void main(String[] args) {
        Pifagor distance = new Pifagor();
        int x1, x2, y1, y2;
        Scanner abc = new Scanner(System.in);
            System.out.print("Input a number 'x1': ");
            x1 = abc.nextInt();
            System.out.print("Input a number 'y1': ");
            y1 = abc.nextInt();
            System.out.print("Input a number 'x2': ");
            x2 = abc.nextInt();
            System.out.print("Input a number 'y2': ");
            y2 = abc.nextInt();
        abc.close();
        distance.distance(x1, y1, x2, y2);
}
}
*/

// 3 ЗАДАЧА-----------------------------------------------------

/*
    class Power {
        void poweri(int a, int n){
            int k=1;
            while (n != 0) {
                k *= a;
                n = n - 1;
            }
        System.out.println(k);
        }
    }
    public class Laba2 {
    public static void main(String[] args) {
        Power power = new Power();
        int a, n;
        Scanner abc = new Scanner(System.in);
        System.out.print("Input a number 'a': ");
        a = abc.nextInt();
        System.out.print("Input a number 'n': ");
        n = abc.nextInt();
        abc.close();
        power.poweri(a, n);
    }
}
*/

// 4 ЗАДАЧА-----------------------------------------------------

/*
public class Power {
    public static int power(int a, int n) {
        // Базовый случай
        if (n == 0) {
            return 1;
        }
        // Рекурсия: a^n = a * a^(n-1)
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        int a, n;
        Scanner abc = new Scanner(System.in);
        System.out.print("Input a number 'a': ");
        a = abc.nextInt();
        System.out.print("Input a number 'n': ");
        n = abc.nextInt();
        System.out.println(a + "^" + n + " = " + power(a, n));
    }
}
*/

// 5 ЗАДАЧА------------------------------------------------------

/*

public class Tribonacci {
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void main(String[] args) {
        int a, n;
        Scanner abc = new Scanner(System.in);
        System.out.print("Input a number 'a': ");
        a = abc.nextInt();
        System.out.print("Input a number 'n': ");
        n = abc.nextInt();
        System.out.println("tribonacci(" + n + ") = " + tribonacci(n));
    }
}

 */