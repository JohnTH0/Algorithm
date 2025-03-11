package implement.programmers;

public class Main_12919 {
    public static void main(String[] args) {
        int x = 0;
        String[] seoul = new String[]{"Kim","ZxCvBnMaSdFgHjKl","QaZwSxEdCrFvTgBy"};
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        System.out.printf("김서방은 %d에 있다", x);
        }
    }


/* 제출코드
class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        return String.format("김서방은 %d에 있다", x);
    }
}
 */
