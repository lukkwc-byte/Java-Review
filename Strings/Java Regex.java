class myRegex{
    String pat = "(\\d{1,2}|(0|1)\\d{2}|2[0-5]{2})";
    public String pattern = "^" + pat + "\\." + pat + "\\." + pat + "\\."  + pat + "$";
}