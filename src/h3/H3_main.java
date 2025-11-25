package h3;

public class H3_main {

    public static void main(String[] args) {
        int[] asd = {1,2,3,4,1,1,1,2,9,9,7,7};
        int[] dsa = {1,2,3,4,1,2,1,1,7,7,9,9};
        System.out.println(compareArraysVal(asd, dsa));
    }

    public static boolean compareArraysVal(int a[], int[]b){

        if (a.length != b.length){
            return false;
        }

        int[] copyB = new int[b.length +1];

        for (int i = 0; i < a.length; i++){
            copyB[i] = b[i];
        }

        int gelöschteZahlen = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - i; j++){
                if (a[i] == copyB[j]){
                    for (int k = j; k < a.length - i; k++){
                        copyB[k] = copyB[k+1];

                    }
                    gelöschteZahlen++;
                    break;
                }


            }
        }

        if (gelöschteZahlen == a.length){
            return true;
        }

        return false;
    }
}
