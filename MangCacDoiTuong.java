package Objects;
import java.util.Scanner;
import java.lang.String;

public class MangCacDoiTuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        class BlackBear {
            String name;
            char rank;

            BlackBear(String name, char rank) {
                this.name = name;
                this.rank = rank;
            }
        }
        System.out.println("So luong thanh vien cau lac bo la:");
        int n = Integer.parseInt(scanner.nextLine());
        BlackBear[] members = new BlackBear[n];
        int i;
        for (i=0;i<n;i++) {
            String name = scanner.nextLine();
            char rank = scanner.next().charAt(0);
            members[i] = new BlackBear(name, rank);
            scanner.nextLine();
        }
        for (i=0;i<n;i++){
            System.out.println(members[i].name + ", hang " + members[i].rank);
        }
    }
}



