import java.util.Arrays;
import java.util.Scanner;

import static javax.management.Query.or;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x= in.nextInt();
        int[] mas=new int[x];
        for(int i=0;i<mas.length;i++){
            mas[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<mas.length;i++){
            sum+=mas[i];
        }
        for (int i=0;i< mas.length;i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        System.out.println(sum/mas.length);
    }
}