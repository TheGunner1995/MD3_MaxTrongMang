import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size vào đây ");
            size = scanner.nextInt();
            if (size>4){
                System.out.println("dài quá");
            }
        }while (size>4);
        num = new int[size];
        for (int i = 0; i < num.length; i++) {
            int input = scanner.nextInt();
            num[i]= input;

        }
        int max = 0;
        for (int k = 0; k < num.length; k++) {

            if (max<num[k]){
                max=num[k];
            }

        }
        System.out.println(max);
    }
}