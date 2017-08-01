package com.benearley.googlefoobar.challenges;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 578803 on 4/11/2017.
 */
public class Challenge3ElevatorMaintenance {

    @Test
    public void test(){
        assert Arrays.equals(answer(new String[]{"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"}),new String[]{"1.0", "1.0.2", "1.0.12", "1.1.2", "1.3.3"});
        assert Arrays.equals(answer(new String[]{"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"}),new String[]{"0.1", "1.1.1", "1.2", "1.2.1", "1.11", "2", "2.0", "2.0.0"});
    }

    public static String[] answer(String[] l){
        List<String> list = Arrays.asList(l);
        Collections.sort(list,new VersionComparator());
        return list.toArray(new String[list.size()]);
    }

    static class VersionComparator implements Comparator<String>{

        @Override
        public int compare(String s, String t) {
            String[] sParts = s.split("\\.");
            String[] tParts = t.split("\\.");

            //major
            if (Integer.parseInt(sParts[0]) > Integer.parseInt(tParts[0])) return 1;
            else if (Integer.parseInt(sParts[0]) < Integer.parseInt(tParts[0])) return -1;

            //minor
            else if (sParts.length < 2) return -1;
            else if (tParts.length < 2) return 1;
            else if (Integer.parseInt(sParts[1]) > Integer.parseInt(tParts[1])) return 1;
            else if (Integer.parseInt(sParts[1]) < Integer.parseInt(tParts[1])) return -1;

            //revision
            else if (sParts.length < 3) return -1;
            else if (tParts.length < 3) return 1;
            else if (Integer.parseInt(sParts[2]) > Integer.parseInt(tParts[2])) return 1;
            else if (Integer.parseInt(sParts[2]) < Integer.parseInt(tParts[2])) return -1;

            else return 0;
        }
    }


}
