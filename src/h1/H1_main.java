package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] asd = {1,2,3,4,1};
        int[] dsa = {1,4,3,2,1};
        System.out.println(isMirrorArray(asd, dsa));
    }

    public static boolean isMirrorArray(int a[], int[]b){

        if (a.length != b.length){
            return false;
        }

            for (int i = 0; i < a.length; i++){
                if (a[i] != b[a.length - i -1]){
                    return false;
                }
            }
        return true;
    }
}
