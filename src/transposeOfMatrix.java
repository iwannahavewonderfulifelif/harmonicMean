public class transposeOfMatrix {
    public static void main(String[] args) {
//        int [][]matris= {
//                {2, 6, 4},
//                {7, 0, 3}
//        };
//        System.out.println("Matris:");
//        for (int i = 0; i <matris.length ; i++) {
//            for (int j = 0; j <matris[i].length ; j++) {
//                System.out.print(matris[i][j]+"  ");
//            }
//            System.out.println();
//        }
//        int rows= matris.length;  int cols= matris[i].length;
//        int [][] transpoze=new int[rows][[cols];
//
//        for (int i = 0; i < transpoze.length; i++) {
//        transpoze[0][i] = matris[i][0];
//    }
//        for (int i = 0; i < transpoze.length ; i++) {
//            transpoze[1][i]=matris[i][1];
//        }
//        for (int i = 0; i < transpoze.length ; i++) {
//            transpoze[2][i]=matris[i][2];
//        }
//        for (int i = 0; i <transpoze.length ; i++) {
//            for (int j = 0; j < transpoze[i].length ; j++) {
//                System.out.print(transpoze[i][j]+" ");
//                System.out.println();
//            }
//        }
//        System.out.println();
//
//
//    }
//}
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Matrisin satır sayısını ve sütun sayısını bulalım
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Yeni bir matris oluşturalım, bu yeni matris ilk sütunun yerini alacak
        int[][] newMatrix = new int[numRows][numCols];

        // İlk sütundaki elemanları yeni satır olarak koy
        for (int i = 0; i < numRows; i++) {
            newMatrix[0][i] = matrix[i][0];
        }

        // Diğer satırları eski matrisin geri kalanını kopyalayalım
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numCols; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }

        // Sonuç matrisini yazdır
        System.out.println("Yeni matris:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

