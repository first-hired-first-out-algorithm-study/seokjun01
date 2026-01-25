class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 1. 모든 시간을 초(second) 단위로 변환
        int video = change(video_len.split(":"));
        int ps = change(pos.split(":"));
        int ss = change(op_start.split(":"));
        int es = change(op_end.split(":"));

        for (String cm : commands) {
            // 명령 실행 전 오프닝 구간이면 점프
            if (ps >= ss && ps <= es) {
                ps = es;
            }

            if (cm.equals("prev")) {
                // 10초 미만이면 0초로, 아니면 -10초
                ps = Math.max(0, ps - 10);
            } else if (cm.equals("next")) {
                // 동영상 길이를 넘지 않도록 +10초
                ps = Math.min(video, ps + 10);
            }

            // 명령 실행 후 오프닝 구간이면 다시 점프
            if (ps >= ss && ps <= es) {
                ps = es;
            }
        }

        // 2. 결과를 "mm:ss" 형식으로 변환
        return String.format("%02d:%02d", ps / 60, ps % 60);
    }

    public static int change(String[] str) {
        int m = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);
        return m * 60 + s;
    }
}