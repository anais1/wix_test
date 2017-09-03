public class WixUrlsUnificationUtility {


    public String pageUrlSubstringUtility(String inputString,
                                          int subStringLength){

        int length = inputString.length();
        if(length <= subStringLength){
            return inputString;
        }
        int startIndex = length-subStringLength;
        return inputString.substring(startIndex);

    }
}


