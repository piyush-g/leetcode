/**
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
public class MatchParantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (stack.isEmpty() && (c == '}' || c == ']' || c == ')')) return false;
            else
                if (!stack.isEmpty() && isMatched(stack.peek(), c)) stack.pop();
                else
                    stack.push(c);
        }
        if (stack.isEmpty()) return true;
        else return false;
    }

    public boolean isMatched(char a, char b){
        if (a == '(' && b == ')') return true;
        if (a == '[' && b == ']') return true;
        if (a == '{' && b == '}') return true;
        return false;
    }
}