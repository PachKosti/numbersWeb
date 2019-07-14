package core.languageset;

public class EnglishLanguageSet extends LanguageSet {

    private String[] firstDigits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private String[] tensMultiplyDigits = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private String[] prefixes = {" hundred and ", " thousand, ", " million,  "};

    public String[] getSingleDigits() {
        return firstDigits;
    }

    public String[] getTensMltiplyGidits() {
        return tensMultiplyDigits;
    }

    public String[] getPrefixes(){
        return prefixes;
    }
}
