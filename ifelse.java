1.import java.util.*;
public class Main{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   if(num1==num2){
     System.out.print("Two inputs are eaqual");
   }
   else{
     System.out.print("Two inputs are not  eaqual");
   }
   }
}


2.import java.util.*;
public class Main{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int num=sc.nextInt();
   if(num%2==0){
    System.out.print(" Number is even");
   else
    System.out.print(" Number is odd");
   }
}

3.import java.util.*;
  public class Main{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int num=sc.nextInt();
   int remainder = num%3;
   if(remainder==0){
      System.out.print("Number is Divisible by 3");
   else
      System.out.print("Number is not Divisible by  3 and the remainder is ,+remainder");
   }
}



4. import java.util.*;
   public class Main{
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int num=sc.nextInt();
     if(num>0){
        System.out.print("Number is Positive");}
     elif(num<0){
        System.out.print("Number is Negative");}
     else{
        System.out.print("Number is Zero");}
    }
}


5.import java.util.*;
   public class Main{
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     char ch=sc.next().charAt(0);
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||){
         System.out.print("Vowels");}
     else{
         System.out.print("Consonants");}
    }
}


     
























       




























