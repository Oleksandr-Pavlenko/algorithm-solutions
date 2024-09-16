package com.algorithmen.string;

import java.util.Arrays;
import java.util.List;

/*Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes difference between any two
time-points in the list.*/
public class MinimumTimeDifference {
    //runtime beats 67%, memory 72%
    public int findMinDifference(List<String> timePoints) {
        if (timePoints == null || timePoints.size() < 2) {
            return 0;
        }

        // convert input to minutes
        int[] timePointsInMinutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(3));
            timePointsInMinutes[i] = hours * 60 + minutes;
        }

        Arrays.sort(timePointsInMinutes);

        // find minimum difference across adjacent elements
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < timePointsInMinutes.length - 1; i++) {
            ans = Math.min(ans, timePointsInMinutes[i + 1] - timePointsInMinutes[i]);
        }

        //["23:59","00:00"] is 1 not 1439
        return Math.min(
                ans,
                24 * 60 - timePointsInMinutes[timePointsInMinutes.length - 1] + timePointsInMinutes[0]
        );
    }
}
