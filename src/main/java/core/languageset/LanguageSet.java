package core.languageset;

import java.util.Arrays;

public abstract class LanguageSet {

    public abstract String[] getSingleDigits();
    public abstract String[] getTensMltiplyGidits();
    public abstract String[] getPrefixes();

    public String getHundreds(int number){
        String numberOfHundreds;
        StringBuilder sb = new StringBuilder();
        numberOfHundreds = getSingleDigits()[number];
        sb.append(numberOfHundreds);
        sb.append(getPrefixes()[0]);
        return sb.toString();
    }


    public String convertNumber2String(StringBuilder sb, char[] numbers){
        char[] digits = numbers;
        if(digits.length > 3){
            //position of prefix
            int prefixPosition = (digits.length - 1) / 3;
            int restAfterDevidePosition = ((digits.length - 1) % 3) + 1;

            char[] restOfDigits = Arrays.copyOfRange(digits, restAfterDevidePosition, digits.length);
            char[] numbersUnderThousand= Arrays.copyOfRange(digits, 0, restAfterDevidePosition);

            int numberUnderThousand = Integer.parseInt(new String(numbersUnderThousand));

            //convert number before prefix
            sb.append(convertNumberUnderThousand(numberUnderThousand));
            sb.append(getPrefixes()[prefixPosition]);
            //recursively call method
            convertNumber2String(sb, restOfDigits);

        }else{
            //convert number beyond thousand
            int numberUnderThousand = Integer.parseInt(new String(digits));

            sb.append(convertNumberUnderThousand(numberUnderThousand));
            return sb.toString();
        }
        return sb.toString();

    }

    public String convertNumberUnderThousand(int num) {
        StringBuilder sb = new StringBuilder();

        char[] digits = String.valueOf(num).toCharArray();

        if (num == 0){
            return getSingleDigits()[0];
        }
        if (num < 20) {
            return getSingleDigits()[num];
        }
        int digitPossition = digits.length;

        for (char digit : digits) {
            int valueOfDigit = Character.getNumericValue(digit);

            //hundreds
            if (digitPossition == 3) {
                sb.append(getHundreds(valueOfDigit));
            }
            //tens
            if (digitPossition == 2) {
                sb.append(getTensMltiplyGidits()[valueOfDigit]);
            }
            //single and teens number
            if ( digitPossition == 1 && valueOfDigit != 0 ) {
                sb.append(getSingleDigits()[valueOfDigit]);
                return sb.toString();
            }

            digitPossition--;

        }
        return sb.toString();
    }


}
