// class Hello{
//     public static void main(String[] args){
//         System.out.println("Hello World");
//     }
// }

// class Hello{
//     public static void main(String args[]){
//         System.out.println(5+2);
//     }
// }

// class Hello{
//     public static void main(String args[]){
//         int num=4;
//         System.out.println(num);
//     }
// }

// class Hello{
//     public static void main(String args[]){
//         int num1=18;
//         int num2=45;
//         int result=num1+num2;
//         System.out.println(result);
//     }
// }

// class Hello{
//     public static void main(String args[]){
//         int num1=12;
//         int num2=3;
//         int result=num1*num2;
//         System.out.println(result);
//     }
// }

// class Hello{
//     public static void main(String args[]){
//         String name="Rajesh";
//         System.out.println(name);
//     }
// }

import java.util.Scanner;
class Hello{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=reader.nextInt();
        System.out.println("You entered: "+number);
    }
}

class Hello{
    public static void main(String[] args){
        float first = 1.20f,second = 2.45f;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

import java.util.Scanner;
class Hello{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
         else
            System.out.println(num + " is odd");
         }
}