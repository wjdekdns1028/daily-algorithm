package cote.pro_72410;

class Solution {
    public String solution(String new_id) {
        String answer = new_id;

        // 소문자로 변환
        answer = answer.toLowerCase();

        // 허용된 문자 이외의 것들을 제거
        StringBuilder sb = new StringBuilder();
        for(char c : answer.toCharArray()){
            if(Character.isLowerCase(c) || Character.isDigit(c) ||
                    c == '-' || c == '_' || c == '.'){
                sb.append(c);
            }
        }
        answer = sb.toString();

        // 마침표 2번을 한번으로 수정
        answer = answer.replaceAll("\\.+" , "."); // 정규식 사용(||.+은 마침표 1개 이상)

        // 마침표가 처음이나 끝이면 제거
        if(answer.startsWith(".")){
            answer = answer.substring(1);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }

        // 빈 문자열이면 answer에 a 대입
        if(answer.isEmpty()){
            answer = "a";
        }

        // 길이가 16자 이상이면 첫 15개를 제외한 나머지 문자 모두 제거, 제거 후 마침표가 끝에 위치한다면 마침표 제거
        if(answer.length() >= 16){
            answer = answer.substring(0,15);
            if(answer.endsWith(".")){
                answer = answer.substring(0, answer.length()-1);
            }
        }

        // 길이가 2 이하면 길이가 3이 될때까지 마지막 문자 붙이기
        if(answer.length() <= 2){
            while(answer.length() < 3){
                answer = answer + answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution.solution("z-+.^."));
        System.out.println(solution.solution("=.="));
        System.out.println(solution.solution("123_.def"));
        System.out.println(solution.solution("abcdefghijklmn.p"));
    }
}
