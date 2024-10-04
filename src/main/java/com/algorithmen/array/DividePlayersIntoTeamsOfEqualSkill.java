package com.algorithmen.array;

import java.util.Arrays;

/*You are given a positive integer array skill of even length n where skill[i] denotes the skill of the ith player. Divide the players into n / 2 teams of size 2 such that the total skill of each team is equal.

The chemistry of a team is equal to the product of the skills of the players on that team.

Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams such that the total skill of each team is equal.*/
public class DividePlayersIntoTeamsOfEqualSkill {
    // Runtime beats 70%, memory 80%
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int powerOfGroup = skill[0] + skill[skill.length - 1];
        long totalChemistry = 0;

        for (int i = 0; i < skill.length / 2; i++) {
            int currentPower = skill[i] + skill[skill.length - 1 - i];

            if (powerOfGroup != currentPower) {
                return -1;
            }

            totalChemistry += (long) skill[i] * skill[skill.length - 1 - i];
        }

        return totalChemistry;
    }
}
