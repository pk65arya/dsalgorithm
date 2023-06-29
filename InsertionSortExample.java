package algorithm;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortExample {
    public static void main(String[] args)
    {
        String[]s = new String[] {"bob", "charlie", "mike",
                "lola", "arnold","alpha"};

        sort(s[5]);
    }

    public static void sort(String s)
    {
        String temp = null;
        for(int i = 1; i<s.length(); i++)
        {
            char next= s.charAt(i);

            int j=i;
            while (j > 0 && s.charAt(j-1)>next)
            {
                temp = s.substring(0, i) + s.charAt(j-1) + s.substring(i+1);
                System.out.println(temp);
                j--;
            }

            //this is where the problem seems to be happening:
            temp= s.substring(0,i)+next+s.substring(i+1);
            s=temp;
        }
        System.out.println(s);
    }

}
