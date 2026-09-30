import java.util.Stack;
import java.util.Scanner;
public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c != '('&&
                c != ')'&&
                c != '['&&
                c != ']'&&
                c != '{'&&
                c != '}'
            ) {continue;}
            if (c == '('||c=='['||c=='{') {
                stack.push(c);
            }
            else if (c == ')'||c==']'||c=='}') {
                if (stack.isEmpty()) {return "NO";}
                char top = stack.pop();
                if(c ==')' && top!='('||
                    c ==']' && top!='['||
                    c =='}' && top!='{'
                ) {return "NO";}
            }
        }
        if (stack.isEmpty()) {return "YES";}
        else {return "NO";}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
        sc.close();
    }
}
