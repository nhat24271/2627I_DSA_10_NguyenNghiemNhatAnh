import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class w4Baitap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] list = new int[total];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<total; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            }
        Arrays.sort(list);
        for (int i=total-1; i>=0; i--) {
            if (list[i]>=cnt) {
                cnt+=1;
            }
            else {break;}
        }
        System.out.println(cnt);
    }
}