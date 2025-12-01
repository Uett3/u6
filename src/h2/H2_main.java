package h2;

public class H2_main {

    public static void main(String[] args) {
       /* int[] asd = {1,2,777,3,4};
        int[] dsa = {1,2,777,3,4};
        System.out.println(compareArrays(asd, dsa));

        */
    }

    public static boolean compareArrays(int[] a, int[] b){

        if (a.length != b.length){
            return false;
        }

        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
