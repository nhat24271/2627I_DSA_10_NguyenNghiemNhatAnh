import java.util.Scanner;
import java.util.Stack;

public class w3_tailop_25021632 {
    static int quyUocDau(char dau) {
        switch (dau) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    public static String chuyenDoi(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack= new Stack<>();
        for (int i=0; i<exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c=='(') {
                stack.push(c);
            }
            else if (c==')') {
                while (!stack.isEmpty() && stack.peek()!='(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (quyUocDau(c)<=quyUocDau(stack.peek()) && !stack.isEmpty()) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        String result = chuyenDoi(exp);
        System.out.println(result);
        sc.close();
    }
}
