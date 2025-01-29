// import java.util.Scanner;
// public class Operators{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         sc.close();
//         System.out.println("Arithematic Operations:");
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(a/b);
//         System.out.println("Relational Operators");
//         System.out.println(a>b);
//         System.out.println(a<b);
//         System.out.println(a==b);
//         System.out.println(a!=b);
//         System.out.println("Logical Operations");
//         System.out.println(a>b && a<b);
//         System.out.println(a>b || a<b);
//         System.out.println(!(a<b));
//     }
    
// }

// import java.util.Scanner;
// public class Operators{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         sc.close();
        //    if(a%2==0){
        //        System.out.println("even number");
        //    }
        //    else{
        //        System.out.println("odd number");
        //    }
//         System.out.println(a%2==0?"even":"odd");
//     }
// }

import java.util.Scanner;
public class Operators{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Math.pow(a, b));
        sc.close();
    }
}