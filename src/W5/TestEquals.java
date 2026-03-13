package W5;

public class TestEquals {
    public static void main(String[] args) {

        int[] a = new int[3];
        int[] b = new int[3];
        setArray(a);
        setArray(b);

        if(b == a)
            System.out.println("주소 동일");
        else System.out.println("주소 동일하지 않음");

        if(equals(b,a)) System.out.println("배열 요소 동일");
        else System.out.println("배열 요소 동일하지 않음");

    }

    public static void setArray(int[] array){
        for(int i = 0; i < array.length; i ++){
            array[i] = i;
        }
    }

    public static boolean equals(int[] a, int[] b){
        boolean elementsMatch = true;
        if(a.length !=b.length)
            elementsMatch = false;
        else {
            int i = 0;
            while (elementsMatch && (i < a.length)){
                if(a[i] != b[i])
                    elementsMatch = false;
                i++;
            }
        }

        return elementsMatch;
}




}


