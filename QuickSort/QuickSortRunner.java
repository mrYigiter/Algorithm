package QuickSort;

import java.util.Arrays;

public class QuickSortRunner {
    /*
    * Mantık : Verilen bir dizinin herhangi bir yerinden bir pivot eleman seçer ve
pivottan büyük elemanları sağa, küçük elemanları sola kaydırır.
Bu işlemi yaptıktan sonra , pivot elemanın solundaki ve sağındaki
dizilerden ayrı ayrı pivot eleman seçilir ve o dizileri kendi
içerisinde tekrar aynı işleme  tabi tutar. Bu şekilde Rekürsiv bir yapı
da çalışarak diziyi tamamen sıralı hale getirir

Time Complexity : en kötü O(n^2)  // ortalamada O(nlogn)
Memory Usage: en kötü durum  O(n) ---> recursive*/

    public static void main(String[] args) {
        int[] arr ={5,3,6,2,9};
        System.out.println("QuickSort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("QuickSort işlemi sonrası : ");
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");
    }

}
