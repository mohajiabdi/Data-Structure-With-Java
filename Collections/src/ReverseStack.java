import java.util.Stack;



public class ReverseStack {
    public static void main(String[] args) {
        System.out.println(reverse("somalia"));

    }
    static String reverse (String input){
        Stack <Character> s1 = new Stack<Character>();
        for(int i=0; i<input.length(); i++){
            s1.push(input.charAt(i));
        }
        StringBuilder buffer = new StringBuilder();
        while(!s1.isEmpty()){
            buffer.append(s1.pop());
        }
        return buffer.toString();
    }
}
