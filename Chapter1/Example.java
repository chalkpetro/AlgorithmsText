package Chapter1;

import edu.princeton.cs.algs4.StdIn;



/*
 * Elementary sorting methods
 * Comparable vs Comparator interfaces
 */

public class Example {
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++)
                if(less(a[j], a[i])) min = j;
            exchange(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exchange(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++)
            StdIn.print(a[i] + " ");
        StdOut.ptintln();
    }


    public static void main(String args[]){
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
