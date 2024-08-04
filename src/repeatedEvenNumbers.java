import java.util.Arrays;

public class repeatedEvenNumbers {
        static boolean isFind(int[] arr,int value){
            for (int i:arr){
                if(i==value) {
                    return true;
                }

            }
            return false;
        }

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 2, 4, 7, 4, 7, 8, 8, 9, 9, 0, 0};

        int[] duplicate = new int[list.length];
        int startIndex = 0;

        // duplicate dizisini -1 ile doldur
        for (int i = 0; i < duplicate.length; i++) {
            duplicate[i] = -1; //0 olursa sıkıntı oluyor(tekrar eden sayı 0 old için)
        }



        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if(!isFind(duplicate,list[i])) {
                    duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

//        for (int value : duplicate){
//            if(value !=-1 && value%2==0){
//                System.out.println("Tekrar eden çift sayılar: "+value);
//         Tekrar eden çift sayıları bir kez yazdır
        for (int i = 0; i < startIndex; i++) {
            if (duplicate[i] != -1 && duplicate[i] % 2 == 0) {
                System.out.println("Tekrar eden çift sayı: " + duplicate[i]);
            }
        }
    }}


//public class repeatedEvenNumbers {
//    static boolean isFind(int[] arr, int value) {
//        for (int i : arr) {
//            if (i == value) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] list = {1, 2, 3, 2, 4, 7, 4, 7, 8, 8, 9, 9, 0, 0};
//
//        int[] duplicate = new int[list.length];
//        int startIndex = 0;
//        // duplicate dizisini -1 ile doldur
//        for (int i = 0; i < duplicate.length; i++) {
//            duplicate[i] = -1;
//
//        }

//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length; j++) {
//                if (i != j && list[i] == list[j]) {
//                    if (!isFind(duplicate, list[i])) {
//                        duplicate[startIndex++] = list[i];
//                    }
//                    break;
//                }
//            }
//        }
//
//        // Tekrar eden çift sayıları bir kez yazdır
//        for (int i = 0; i < startIndex; i++) {
//            if (duplicate[i] != -1 && duplicate[i] % 2 == 0) {
//                System.out.println("Tekrar eden çift sayı: " + duplicate[i]);
//            }
//        }
//    }
//}