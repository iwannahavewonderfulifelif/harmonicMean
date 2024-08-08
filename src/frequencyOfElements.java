
import java.util.Arrays;

public class frequencyOfElements {

    public static void main(String[] args) {
            int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
            System.out.print("Dizi: ");
            System.out.println(Arrays.toString(arr));

            int[] frequency = new int[arr.length];

            boolean[] visited = new boolean[arr.length];


            for (int i = 0; i < arr.length; i++) {
                if (visited[i])
                    continue;

                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                frequency[i] = count;

            }

            System.out.println("Element ve Frekansları:");
            for (int i = 0; i < arr.length; i++) {

                if (!visited[i]) {
                    System.out.println(arr[i] + " sayısı " + frequency[i] + " kez tekrar ediyor.");
                }
            }
        }
    }
    /*
Adım Adım Açıklama:
Dizi ve Yardımcı Dizilerin Tanımlanması:

int[] frequency = new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0]
boolean[] visited = new boolean[arr.length]; // [false, false, false, false, false, false, false, false]
İlk Eleman (10) İçin Frekans Hesaplama:

i = 0, arr[0] = 10
visited[0] = false, bu yüzden kontrol edilecek.
count = 1 (başlangıç frekansı)
İç döngü:

j = 1, arr[1] = 20 (eşit değil)
j = 2, arr[2] = 20 (eşit değil)
j = 3, arr[3] = 10 (eşit), visited[3] = true, count = 2
j = 4, arr[4] = 10 (eşit), visited[4] = true, count = 3
j = 5, arr[5] = 20 (eşit değil)
j = 6, arr[6] = 5 (eşit değil)
j = 7, arr[7] = 20 (eşit değil)
Sonuç:


frequency[0] = 3; // [3, 0, 0, 0, 0, 0, 0, 0]
visited = [false, false, false, true, true, false, false, false]
İkinci Eleman (20) İçin Frekans Hesaplama:

i = 1, arr[1] = 20
visited[1] = false, bu yüzden kontrol edilecek.
count = 1 (başlangıç frekansı)
İç döngü:

j = 2, arr[2] = 20 (eşit), visited[2] = true, count = 2
j = 3, visited[3] = true (zaten ziyaret edildi, atla)
j = 4, visited[4] = true (zaten ziyaret edildi, atla)
j = 5, arr[5] = 20 (eşit), visited[5] = true, count = 3
j = 6, arr[6] = 5 (eşit değil)
j = 7, arr[7] = 20 (eşit), visited[7] = true, count = 4
Sonuç:

frequency[1] = 4; // [3, 4, 0, 0, 0, 0, 0, 0]
visited = [false, false, true, true, true, true, false, true]
Üçüncü Eleman (20) İçin Frekans Hesaplama:

i = 2, arr[2] = 20
visited[2] = true, bu yüzden atlanacak.
        Dördüncü Eleman (10) İçin Frekans Hesaplama:

i = 3, arr[3] = 10
visited[3] = true, bu yüzden atlanacak.
        Beşinci Eleman (10) İçin Frekans Hesaplama:

i = 4, arr[4] = 10
visited[4] = true, bu yüzden atlanacak.
        Altıncı Eleman (20) İçin Frekans Hesaplama:

i = 5, arr[5] = 20
visited[5] = true, bu yüzden atlanacak.
        Yedinci Eleman (5) İçin Frekans Hesaplama:

i = 6, arr[6] = 5
visited[6] = false, bu yüzden kontrol edilecek.
count = 1 (başlangıç frekansı)
İç döngü:

j = 7, arr[7] = 20 (eşit değil)
Sonuç:

frequency[6] = 1; // [3, 4, 0, 0, 0, 0, 1, 0]
visited = [false, false, true, true, true, true, false, true]
Sekizinci Eleman (20) İçin Frekans Hesaplama:

i = 7, arr[7] = 20
visited[7] = true, bu yüzden atlanacak.
Sonuçları Yazdırma:
Sonuçları yazdırırken sadece visited değeri false olan elemanları yazdırırız:


System.out.println("Element ve Frekansları:");
for (int i = 0; i < arr.length; i++) {
        if (!visited[i]) {
        System.out.println(arr[i] + " sayısı " + frequency[i] + " kez tekrar ediyor.");
    }
            }
Çıktı:

Element ve Frekansları:
        10 sayısı 3 kez tekrar ediyor.
20 sayısı 4 kez tekrar ediyor.
5 sayısı 1 kez tekrar ediyor.
        Bu şekilde, dizideki her elemanın kaç kez tekrar ettiğini doğru bir şekilde hesaplayıp yazdırmış oluruz.*/







