import java.util.Arrays;
import java.util.Scanner;

public class smallestoLargest {
    public static void main(String[] args) {

        System.out.print("Dizinin boyutu n: ");
        Scanner kla=new Scanner(System.in);
        int boyut= kla.nextInt();
        int list[]=new int[boyut];
        int num=0;  int startIndex=0;
        System.out.println("Dizinin elemanlarını girin: ");
        for (int i = 1; i <=boyut ; i++) {
            System.out.print(i+". Elemanı: ");
            num= kla.nextInt();
      list[startIndex++]=num;

        }
        Arrays.sort(list);
//        for (int i = 0; i <list.length ; i++) {
//            System.out.print("Sıralama: "+list[i]);
        System.out.print("Sıralama: ");
        System.out.println(Arrays.toString(list));

        }
    }

