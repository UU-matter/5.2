/**
 * Created by Александр on 24.02.2015.
 */
public class Proga5_2 {
    public static int [] concat(int[] x, int[] y) {

        int a=x.length+y.length;
        int[] z=new int[a];
        for( int i=0; i<z.length; i++) {
            if (i<x.length)
                z[i]=x[i];
            else z[i]=y[i-x.length];
        }
        return z;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {6, 7, 8};
        int[] V=concat(x,y);
        for( int i=0; i<V.length; i++) {
            System.out.println(V[i]);
        }
    }
}
