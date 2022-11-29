package UserStories_String;
/*
UserStory_4:
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

Example:
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/

import java.util.Scanner;

public class nonStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str.substring(1) + str2.substring(1));

    }

    // TO DO:
    // uncomment the lines below and write your method to solve this Task:

//    public String nonStart(String a, String b) {
//
//    }
}
