package JavaVjpPro;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i=1;i<=3;i++) {
            System.out.print("Ten:");
            String ten = scanner.nextLine();
            System.out.print("Diem trung binh:");
            float diem = Float.parseFloat(scanner.nextLine());
        }
        int j = 0;
        while (j < 3) {
            j++;
            System.out.print("Ten:");
            String ten = scanner.nextLine();
            System.out.print("Diem trung binh:");
            float diem = Float.parseFloat(scanner.nextLine());
        }
        int k=0;
        do {
            System.out.print("Ten:");
            String ten = scanner.nextLine();
            System.out.print("Diem trung binh:");
            float diem = Float.parseFloat(scanner.nextLine());
            k++;
        }
        while (k<3);
    }
}

