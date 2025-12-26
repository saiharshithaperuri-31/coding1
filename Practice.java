import java.util.*;
class Practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();   
        int sum = 0;
        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);
            if (ch != '5') {
                sum += ch - '0';
                i++;
            } 
            else {
                int num = 0;
                while (i < input.length()) {
                    num = num * 10 + (input.charAt(i) - '0');
                    if (input.charAt(i) == '8') {
                        break;
                    }
                    i++;
                }
                sum += num;
                i++; // move past 8
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
