package com.benearley.googlefoobar.challenges;

/**
 * Created by 578803 on 12/20/2016.
 */

import org.junit.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 578803 on 12/20/2016.
 */
public class Challenge1Braille {

    @Test
    public void braille(){
        assert generateBraille("Braille").equals("000001110000111010100000010100111000111000100010");
        assert generateBraille("code").equals("100100101010100110100010");
        assert generateBraille("The quick brown fox jumped over the lazy dog").equals("000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100100010100110000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110");
    }

    public String generateBraille(String plaintext){
        Map<Character,Integer> charMap = new HashMap<>();
        int ind = 0;
        for (char c = 'a'; c <= 'z'; c++){
            if (c != 'w') {
                charMap.put(c, ind);
                ind++;
            }
        }
        Map<Integer,Integer> brailleMap = new HashMap<>();
        brailleMap.put(0,100000);
        brailleMap.put(1,110000);
        brailleMap.put(2,100100);
        brailleMap.put(3,100110);
        brailleMap.put(4,100010);
        brailleMap.put(5,110100);
        brailleMap.put(6,110110);
        brailleMap.put(7,110010);
        brailleMap.put(8,10100);
        brailleMap.put(9,10110);

        StringBuilder sb = new StringBuilder();

        NumberFormat formatter = new DecimalFormat("000000");

        for (int i = 0; i< plaintext.length();i++){
            char c = plaintext.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                sb.append("000001");
            }
            c = Character.toLowerCase(c);
            if (c == 'w'){
                sb.append("010111");
            }
            else if (c == ' '){
                sb.append("000000");
            }
            else if (c >= 'a' && c <= 'j'){
                sb.append(formatter.format(brailleMap.get(charMap.get(c))));
            } else if (c >= 'k' && c <= 't'){
                sb.append(formatter.format(brailleMap.get(charMap.get(c) % 10) + 1000));
            } else if (c >= 'u' && c <= 'z'){
                sb.append(formatter.format(brailleMap.get(charMap.get(c) % 10) + 1001));
            }
        }
        return sb.toString();

    }





}

