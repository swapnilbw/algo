package com.java.algo.general;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FindMax {

    public static void main(String[] args) {
        Election E = new Election();
        E.addCandidate("Trump");
        E.addCandidate("Hillary");
        int TC = 0;
        int HC = 0;

        for (int i = 0; i < 100; i++) {
            int ramdomNumer = new Random().nextInt(10);
            if (ramdomNumer % 2 == 0) {
                E.addVote("Trump");
                TC ++;
            } else {
                E.addVote("Hillary");
                HC++;
            }
        }
        System.out.println("Hillary count "+HC+" Trump count "+TC);
        Candidate result = E.findWinner();
        System.out.println("result " + result.getName());
    }

    private static class Election {

        Map<String, Candidate> candidates = new ConcurrentHashMap<>();

        Candidate findWinner() {
            List<Candidate> candidateList = new ArrayList<>(candidates.values());
            Candidate candidateWinner = Collections.max(candidateList, Comparator.comparing(Candidate::getVotes));
            return candidateWinner;
        }

        void addCandidate(String name) {
            candidates.put(name, new Candidate(name));
        }

        void addVote(String candidate) {
            Candidate currCandidate = candidates.get(candidate);
            currCandidate.setVotes(currCandidate.getVotes() + 1);
        }

    }

    private static class Candidate {
        private String name;
        private Long votes;


        Candidate(String name) {
            this.name = name;
            this.votes = 0L;
        }

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
