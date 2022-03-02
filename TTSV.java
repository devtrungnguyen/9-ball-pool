package JavaVjpPro;

import java.util.Scanner;

public class TTSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã sinh viên:");
        String mssv = scanner.nextLine();
        System.out.print("Tên:");
        String ten = scanner.nextLine();
        System.out.print("Tuổi:");
        int tuoi = scanner.nextInt();
//      tu kieu String chuyen sang int thi khong can scanner.nextLine(), con nguoc lai thi can
        scanner.nextLine();
        System.out.print("Địa chỉ:");
        String diachi = scanner.nextLine();
        System.out.print("Ngày sinh:");
        String date = scanner.nextLine();
        System.out.print("Điểm trung bình:");
        float diem = scanner.nextFloat();
        System.out.println("Thông tin sinh viên:");
        System.out.println("Mã sinh viên: " + mssv + "\nTên: " + ten + "\nTuổi: "
                + tuoi + "\nĐịa chỉ: " + diachi + "\nNgày sinh: " + date + "\nĐiểm trung bình: " + diem);
    }
}
