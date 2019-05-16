package com.java.algo.general;

import java.util.*;

public class FindMax {

    public static void main(String[] args) {
        Election E = new Election();
        E.addCandidate("Trump");
        E.addCandidate("Hillary");

        for(int i=0; i < 100; i++){
            int ramdomNumer = new Random().nextInt(10);
            if(ramdomNumer%2==0){
                E.addVote("Trump");
            }else{
                E.addVote("Hillary");
            }
        }

        Candidate result = E.findWinner();
        System.out.println("result "+result.getName());
    }
    private static class Election{

        Map<String,Long> candidateList = new HashMap<>();

        Candidate findWinner(){
            Long max = 0l;
            String winner = "";

            Set<Map.Entry<String,Long>> sets = candidateList.entrySet();
            for(Map.Entry<String,Long> eachCandidate:sets){
                if(eachCandidate.getValue()>max){
                    max = eachCandidate.getValue();
                    winner = eachCandidate.getKey();
                }
            }
            Candidate candidateWinner =  new Candidate();
            candidateWinner.setName(winner);
            candidateWinner.setVotes(max);
            return  candidateWinner;
        }
        void addCandidate(String name){
            candidateList.put(name,0L);
        }

        void addVote(String candidate){
            Long currVote = candidateList.get(candidate);
            candidateList.put(candidate,currVote+1);
        }

    }

    private static class Candidate{
        private String name;
        private Long votes;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getVotes() {
            return votes;
        }

        public void setVotes(Long votes) {
            this.votes = votes;
        }
    }
}
