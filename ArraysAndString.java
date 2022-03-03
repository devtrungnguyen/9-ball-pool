package JavaVjpPro;
import java.util.Scanner;

public class ArraysAndString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong hoc sinh la: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] ten = new String[n];
        String[] date = new String[n];
        float[] diem = new float[n];
        int[] mssv = new int[n];
        int i;
        for (i=0;i<n;i++){
            int j = i+1;
            System.out.println("Ten hoc sinh thu " + j +" la: ");
            ten[i]=sc.nextLine();
            System.out.println("Ngay sinh hoc sinh thu " + j +" la: ");
            date[i]=sc.nextLine();
            System.out.println("Diem TB hoc sinh thu " + j +" la: ");
            diem[i]=Float.parseFloat(sc.nextLine());
            System.out.println("Ma sinh vien hoc sinh thu " + j +" la: ");
            mssv[i]=Integer.parseInt(sc.nextLine());
        }
         System.out.print("| Ten HS | Ma HS | Ngay sinh | Diem TB |\n");
         for (i=0;i<n;i++) {
         System.out.print("| " + ten[i] + " | " + mssv[i] + " | "
                           + date[i] + " | " + diem[i] + " |" + "\n");
        }
    }
}