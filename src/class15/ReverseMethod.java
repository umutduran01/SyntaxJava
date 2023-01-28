package class15;

public class ReverseMethod {

    String reverseStr(String str){
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    //OR

    String reverseStr2(String str2){
        return new StringBuilder(str2).reverse().toString();
    }

    //OR

    String reverseStr3(String str3){
        StringBuilder stringBuilder = new StringBuilder(str3);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
