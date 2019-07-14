package core.languageset;

public class SlovakLanguageSet extends LanguageSet {

    private String[] firstDigits = {"nula", "jeden", "dva", "tri", "štyry", "päť", "šesť", "sedem", "osem", "deväť", "desať", "jedenásť", "dvanásť", "trinásť", "štrnásť", "päťnásť", "šesťnásť", "sedemnásť", "osemnásť", "deväťnásť" };
    private String[] tensMultiplyDigits = {"", "", "dvadsať", "tridsať", "štyrydsať", "päťdesiat", "šesťdesiat", "sedemdesiat", "osemdesiat", "deväťdesiat" };
    private String[] prefixes = {"sto", "tisíc", "milion", "miliarda", "bilion", "biliarda"};
    private String[] prefixesAcsent = {"sto", "tisíc", "milion", "miliarda", "bilion", "biliarda"};


    public String[] getSingleDigits() {
        return firstDigits;
    }

    public String[] getTensMltiplyGidits() {
        return tensMultiplyDigits;
    }

    @Override
    public String[] getPrefixes() {
        return prefixes;
    }

    @Override
    public String getHundreds(int number){
        String numberOfHundreds;
        StringBuilder sb = new StringBuilder();
        numberOfHundreds = number == 1 ? "" : getSingleDigits()[number];
        sb.append(numberOfHundreds);
        sb.append(prefixes[0]);
        return sb.toString();
    }
}
