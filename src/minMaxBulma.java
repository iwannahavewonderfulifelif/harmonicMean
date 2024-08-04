import java.util.Scanner;
import java.util.Arrays;

public class minMaxBulma {

    public static void main(String[] args) {


                //girilen sayıya yakın dizideki en küçük ve en büyük eleman
                int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};
                System.out.println(Arrays.toString(list2));
                int num;
                Scanner input = new Scanner(System.in);
                System.out.print("Bir sayı girin: ");
                num = input.nextInt();

                int min1 = list2[0];
                int max2 = list2[0];

                for (int j : list2)
                {
                    if (j < min1)
                    {
                        min1 = j; //dizinin min değeri bulundu
                    }
                    if (j > max2)
                    {
                        max2 = j; //dizinin max değeri bulunda
                    }
                }
                for (int j : list2)
                {
                    if (j > num)
                    { //dizinin elemanları girilen elemandan büyük mü
                        if (j <= max2)
                        { //dizideki büyük elemanların  girilen sayıdan  max'tan küçük ya da eşit olanı= en yakın max

                            max2 = j; //en yakın max bulundu
                        }
                    }

                    if (j < num)
                    { //dizinin elemanları girilen elemandan küçük mü
                        if (j >= min1)
                        {
                            min1 = j; //en yakın min bulundu
                        }
                    }
                }

                System.out.println("Girilen sayıdıan küçük en yakın değer: " + min1);
                System.out.println("Girilen sayıdan büyük en yakın değer: " + max2);

            }

        }

    /*   farklı bir algoritma ama bunda dizinin elemanıyla aynı girince maxı aynı sayı alıyor orası sıkıntı.
     int [] dizi={15,12,788,1,-1,-778,2,0};

        System.out.print("Girilen sayı: " );
        Scanner kla=new Scanner(System.in);
        int num= kla.nextInt();
        dizi = new int[]{15, 12, 788, 1, -1, -778, 2, 0, num};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int indis= Arrays.binarySearch(dizi,num);
        int minIndis=indis-1; int maxIndis=indis+1;

        System.out.println("Girilen sayıdan küçük en yakın sayı : "+dizi[minIndis]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+dizi[maxIndis]); }}
*/

