import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("nhap vao diem svien");
        Scanner scanner = new Scanner(System.in);
        int diem= scanner.nextInt();
        if (diem<=10&&diem>=8.5){
            System.out.println("Hoc sinh gioi");
        }else{
            System.out.println("so diem khong hop le");
        }
    }
}
