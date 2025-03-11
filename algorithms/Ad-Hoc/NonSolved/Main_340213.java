// https://school.programmers.co.kr/learn/courses/30/lessons/340213

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_340213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String video_len = br.readLine();
        int video_int = TimeStringToInt(video_len);

        String pos = br.readLine();
        int pos_int = TimeStringToInt(pos);

        String op_start = br.readLine();
        int op_start_int = TimeStringToInt(op_start);

        String op_end = br.readLine();
        int op_end_int = TimeStringToInt(op_end);

        String commands = br.readLine();
        String[] command_arr = commands.split(" ");

        // 첫 시작시 한번 확인
        pos_int = (op_start_int <= pos_int && pos_int <= op_end_int) ? op_end_int : pos_int;

        for (String command : command_arr) {
            // 시간 계산
            if (command.equals("next")) {
                pos_int = Math.min(pos_int + 10, video_int);
            } else {
                pos_int = Math.max(pos_int - 10, 0);
            }
            // 오프닝 확인
            pos_int = (op_start_int <= pos_int && pos_int <= op_end_int) ? op_end_int : pos_int;
        }
        String result = TimeIntToString(pos_int);
        System.out.println(result);
    }

    public static int TimeStringToInt(String time) {
        String[] split_time = time.split(":");
        int min = Integer.parseInt(split_time[0]);
        int sec = Integer.parseInt(split_time[1]);
        int convert_sec = (min * 60) + sec;

        return convert_sec;
    }

    public static String TimeIntToString(int time) {
        String min = (time / 60 < 10) ? String.format("%02d", time / 60) : Integer.toString(time / 60);
        String sec = (time % 60 < 10) ? String.format("%02d", time % 60) : Integer.toString(time % 60);
        String time_str = min + ":" + sec;

        return time_str;
    }
}
/* 제출 코드
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_int = TimeStringToInt(video_len);
        int pos_int = TimeStringToInt(pos);
        int op_start_int = TimeStringToInt(op_start);
        int op_end_int = TimeStringToInt(op_end);

        pos_int = (op_start_int <= pos_int && pos_int <= op_end_int) ? op_end_int : pos_int;

        for (String command : commands) {
            // 시간 계산
            if (command.equals("next")) {
                pos_int = Math.min(pos_int + 10, video_int);
            } else {
                pos_int = Math.max(pos_int - 10, 0);
            }
            // 오프닝 확인
            pos_int = (op_start_int <= pos_int && pos_int <= op_end_int) ? op_end_int : pos_int;
        }
        String result = TimeIntToString(pos_int);
        return result;
    }

    public static int TimeStringToInt(String time) {
        String[] split_time = time.split(":");
        int min = Integer.parseInt(split_time[0]);
        int sec = Integer.parseInt(split_time[1]);
        int convert_sec = (min * 60) + sec;

        return convert_sec;
    }

    public static String TimeIntToString(int time) {
        String min = (time / 60 < 10) ? String.format("%02d", time / 60) : Integer.toString(time / 60);
        String sec = (time % 60 < 10) ? String.format("%02d", time % 60) : Integer.toString(time % 60);
        String time_str = min + ":" + sec;

        return time_str;
    }

}
 */
