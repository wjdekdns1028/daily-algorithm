package cote.pro_42579;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        ArrayList<Integer> bestAlbum = new ArrayList<>();

        HashMap<String, Integer> totalPlays = new HashMap<>(); // 장르명, 총 재생 횟수
        HashMap<String, HashMap<Integer, Integer>> numPlays = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            totalPlays.put(genres[i], totalPlays.getOrDefault(genres[i], 0) + plays[i]); // 장르 별로 재생횟수 더하기

            // 키가 있으면 해당 value map을 반환해서 put하고 없으면 새롭게 map 만들기 -> 장르명, (고유 번호, 재생 횟수)
            numPlays.computeIfAbsent(genres[i], key -> new HashMap<>()).put(i, plays[i]);
        }

        // 가장 많이 재생된 장르 먼저 정렬
        List<String> totalSort = new ArrayList<>(totalPlays.keySet());
        totalSort.sort((a, b) -> totalPlays.get(b) - totalPlays.get(a)); // 내림차순으로

        for(String g : totalSort){ // 정렬된 장르를 돌면서
            List<Integer> numSort = new ArrayList<>(numPlays.get(g).keySet()); // map안 속 map(고유 번호, 재생 횟수)에서 고유번호 꺼냄
            numSort.sort((a, b) -> { // 정렬
                if(numPlays.get(g).get(a).equals(numPlays.get(g).get(b))){ // 재생 횟수 같으면
                    return a - b; // 고유번호 오름차순
                } else { // 다르면
                    return numPlays.get(g).get(b) - numPlays.get(g).get(a); // 재생 횟수대로 내림차순
                }
            });

            bestAlbum.add(numSort.get(0)); // 1곡만 있으면 하나만
            if(numSort.size() >= 2) { // 2곡 이상이면 2개까지
                bestAlbum.add(numSort.get(1));
            }
        }

        return bestAlbum.stream().mapToInt(Integer::intValue).toArray();
    }
}
