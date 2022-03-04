package Objects;
import java.util.Scanner;

public class DoiTuong {
    public static void main (String[] args){
        class BlackBear {
            String name;
            int namsinh;
            char rank;
        }
        BlackBear member = new BlackBear();
        member.name = "Linh";
        member.namsinh = 99;
        member.rank = 'G';
        System.out.println("Anh " + member.name + ", sinh nam " + member.namsinh
                + ", hang " + member.rank + "a`");
    }
}
