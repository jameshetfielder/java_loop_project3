import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, count = 0;
        num = input.nextInt();
        for (int i = 4; i <= num; i*=4){
            count++;
            System.out.println(count + "-) " + i);
            }
        System.out.println("_____");
        count = 0;
        for (int j = 5; j <= num; j*=5){
            count++;
            System.out.println(count+ "-)" + j );
        }
        }

    }