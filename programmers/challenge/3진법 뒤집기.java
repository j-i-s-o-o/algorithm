package programmers.challenge;
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
// 3진법 뒤집기

class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp = "";
        while(n != 0) {
            tmp += n%3;
            n /= 3;
        }
        answer = Integer.parseInt(tmp, 3);
        return answer;

//        int answer = 0;
//        String tmp = Integer.toString(n, 3);
//        StringBuilder sb = new StringBuilder(tmp);
//        String reversedSb = sb.reverse().toString();
//
//        answer = Integer.parseInt(reversedSb, 3);
//        return answer;
    }
}
