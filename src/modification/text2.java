package modification;

import java.util.ArrayList;

//刪除第5筆資料
public class text2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<10; i++){
            arr.add(i);
        }
        int indexRemove = -1;
        for (int k : arr){
            if (k==5){
                //arr.remove(k);
                indexRemove = k;
            }
        }
        arr.remove(indexRemove);

        for (int k : arr)
            System.out.println(k);
    }
}
