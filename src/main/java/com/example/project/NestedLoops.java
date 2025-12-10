package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String result = "";
    for (int i = 1; i<=height; i++) {
        for (int o = 1; o<=i; o++) {
            result += "*";
        }
        result += "\n";
    }
     return result.substring(0, result.length() - 1);
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){

    String result = "";
    for (int i = height; i>0; i--) {
        for (int o = 1; o<=i; o++) {
            result += "*";
        }
        result += "\n";
    }
     return result.substring(0, result.length() - 1);
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {

        if (width <= 1 || height <= 1) {
            return "";
        }
        String b = "";
        while (b.length()<width && width > 1) {
            b += "*" ;
        }
        String result = b + "\n";
        
    for (int i = height-2; i>0; i--) {
        for (int o = 1; o<=width; o++) {

            if (o == 1 || o == width) {
            result += "*";
            } else {
            result += " ";
            }
    }
        result += "\n";
    }

    result += b;
     return result;
}

                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String result = "";
        String c= "";
        for (int i = 0; i<rows; i++) {
            for (int e= i%word.length(); e <word.length(); e++){
                c += word.charAt(e);
            }

            for (int r= 0; r <i%word.length(); r++){
                c += word.charAt(r);
            }
            result+=c;
            result += "\n";
            c = "";
        }
        return result.substring(0, result.length() - 1);
    }
}
