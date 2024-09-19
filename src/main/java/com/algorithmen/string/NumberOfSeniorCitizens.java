package com.algorithmen.string;

/*You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:

The first ten characters consist of the phone number of passengers.
The next character denotes the gender of the person.
The following two characters are used to indicate the age of the person.
The last two characters determine the seat allotted to that person.
Return the number of passengers who are strictly more than 60 years old.*/
public class NumberOfSeniorCitizens {
    //runtime beats 76%, memory 96%
    //time complexity O(n), space complexity O(1)
    public int countSeniorsSecondSolution(String[] details) {
        if (details.length == 0) {
            return 0;
        }

        int count = 0;
        for (String detail : details) {
            boolean isCitizen = detail.charAt(10) == 'F' || detail.charAt(10) == 'M' || detail.charAt(10) == 'O';
            int age = (detail.charAt(11) - '0') * 10 + detail.charAt(12) - '0';
            if (age > 60 && isCitizen && detail.length() == 15) {
                count++;
            }
        }
        return count;
    }

    //runtime beats 76%, memory 15%
    //time complexity O(n), space complexity O(n)
    public int countSeniors(String[] details) {
        if (details.length == 0) {
            return 0;
        }

        int count = 0;

        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            boolean isCitizen = detail.charAt(10) == 'F' || detail.charAt(10) == 'M' || detail.charAt(10) == 'O';
            if (age >= 60 && isCitizen && detail.length() == 15) {
                count++;
            }
        }
        return count;
    }
}
