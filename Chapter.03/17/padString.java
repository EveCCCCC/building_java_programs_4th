public static String padString(String s, int limit){
    int lengthOfString = s.length();
    while(lengthOfString < limit){
        s = " " + s;
        lengthOfString = s.length();
    }
    return s;
}
