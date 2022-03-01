package Java.Console.Basic;

import java.io.Console;
import java.util.Scanner;

public class FirstJava {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Xin hay nhap ten cua ban:");
         String name = scanner.nextLine();
         System.out.println("Xin chao " + name);
    }
}
