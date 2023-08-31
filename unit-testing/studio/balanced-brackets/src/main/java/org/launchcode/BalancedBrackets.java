package org.launchcode;
public class BalancedBrackets {

    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
//                if (brackets>1){
//                    return false;
//                }
            } else if (ch == ']') {
                brackets--;
                if (brackets< 0 || brackets> 1) {
                    return false;
                }
            }
        }
        return brackets == 0;
    }
}