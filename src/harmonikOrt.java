import java.util.Scanner;

public class harmonikOrt{
  /*                                      (patika java101 eğitiminden)

      Ödev : Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

      Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
   */


    public static void main(String[] args) {

        /* Harmonik ort bulan program(istenen):

        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=1/numbers[i];
            System.out.println("Toplamı: "+sum);//işlemin doğru gitme durumunu kontrol etmek için
        }

        System.out.println("Harmonik Ortalaması: "+numbers.length/sum);

    }}*/

//Biraz daha geliştirdim.Buda kullanıcıdan array alıp onun harmonik ort hesaplayan program:
        double sum = 0;
        System.out.println("Kaç elemanlı dizi gireceksiniz?");
        Scanner kla=new Scanner(System.in);
        double range= kla.nextDouble();
        System.out.println("dizinizi girin:");
        for (int i = 0; i <range ; i++) {
         double numbers=kla.nextDouble();
         sum+=1/numbers;


        }
        System.out.println("Harmonik Ortalaması: "+range/sum);
    }}





