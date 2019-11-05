package com.java.algo.arrays;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ActivityTracker {

    public static void main(String[] args) {
        int [] [] A = {{0,6},{3,4},{1,2},{5,8},{5,7},{8,9}};
        ActivityTracker instance = new ActivityTracker();
        int max = instance.findMaxActivities(A);
        System.out.println(max);
    }

    private class Event{
        int startTime = Integer.MAX_VALUE;
        int endTime = Integer.MIN_VALUE;

        public Event() {
        }

        public Event(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }
    private int findMaxActivities(int[][] A) {
        int totalEvents = 0;
        // sort events by end time
        Set<Event>  events = new TreeSet<Event>(Comparator.comparing(Event::getEndTime));
        for(int [] eachArr : A){
            events.add(new Event(eachArr[0],eachArr[1]));
        }
        // loop through events find the total activities
        Event lastEvent = new Event();
        for(Event eachEvent : events ){
                if(eachEvent.getStartTime() > lastEvent.getEndTime()) {
                    totalEvents++;
                    lastEvent = eachEvent;
                }
        }
        return totalEvents;
    }

}
