import java.util.ArrayList;
import java.util.List;

public class Getremovableindex{
    public static List<Integer> solution(String str1, String str2){
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            String temp = str1.substring(0, i)+str1.substring(i+1);

            if(temp.equals(str2)){
                res.add(i);
            }
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
    public static void main(String[] args) {

        String str1 = "abdgggda";
        String str2 = "abdggda";
        System.out.println(solution(str1,str2));

    }
}

/*
Given two strings, str1, and str2, where str1 contains exactly one character more than str2, find the indices of the characters in str1 that can be removed to make str1 equal to str2. Return the array of indices in increasing order. If it is not possible, return the array \[-1\]. 

**Note:** Use 0-based indexing.

**Example**

str1 = "abdgggda"

str2 = "abdggda"

Any "g" character at positions 3, 4, or 5 can be deleted to obtain str2. Return \[3, 4, 5\].
*/