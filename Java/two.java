// Convert Roman number into numbers

import java.util.*;

class RomanToNumber {
    int value(char roman) {
        if (roman == 'I')
            return 1;
        if (roman == 'V')
            return 5;
        if (roman == 'X')
            return 10;
        if (roman == 'L')
            return 50;
        if (roman == 'C')
            return 100;
        if (roman == 'D')
            return 500;
        if (roman == 'M')
            return 1000;
        return -1;
    }

    int romanToDecimal(String str) {
        
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
           
            int s1 = value(str.charAt(i));

           
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                
                if (s1 >= s2) {
                   
                    res = res + s1;
                } else {
                    
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }

        return res;
    }

   // Main Method
    public static void main(String args[]) {
        RomanToNumber ob = new RomanToNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a roman number : ");
        String str;
        str = sc.nextLine();
        System.out.println(
                "Integer form of Roman Numeral" +
                        " is " + ob.romanToDecimal(str));
    }
}
