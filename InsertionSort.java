import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class InsertionSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<size; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int temp = arr.get(size-1);
        for (int i=size-2; i>=0; i--) {
            if (arr.get(i)>=temp) {
                arr.set(i+1, arr.get(i));
                for (int num: arr) {
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            else {
                arr.set(i+1, temp);
                for (int num: arr) {
                    System.out.print(num+" ");
                }
                System.out.println();
                break;
            }
        }
        if(arr.get(0)==arr.get(1)) {
            arr.set(0, temp);
            for (int num: arr) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        br.close();
    }
}
