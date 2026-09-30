import java.io.*;
import java.util.*;

public class SimpleTextEditor {
    public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder text = new StringBuilder();
        Stack<String> history = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i=0; i<q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            switch (type) {
                case 1:
                    history.push(text.toString());
                    text.append(st.nextToken());
                    break;
                case 2:
                    history.push(text.toString());
                    text.delete(text.length() - Integer.parseInt(st.nextToken()), text.length());
                    break;
                case 3:
                    output.append(text.charAt(Integer.parseInt(st.nextToken())-1)).append("\n");
                    break;
                case 4:
                    if (!history.isEmpty()) {
                        text = new StringBuilder(history.pop());
                    }
                    break;
            }
        }
        System.out.println(output);
        br.close();
    }
}
