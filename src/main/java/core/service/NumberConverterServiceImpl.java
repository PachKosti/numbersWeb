package core.service;

import core.languageset.LanguageSet;
import core.languageset.SlovakLanguageSet;
import org.springframework.stereotype.Service;

@Service
public class NumberConverterServiceImpl implements NumberConverterService {

    public String convert2Words(int num, String language) {
        LanguageSet languageSet = new SlovakLanguageSet();

        StringBuilder sb = new StringBuilder();

        char[] digits = String.valueOf(num).toCharArray();

        return languageSet.convertNumber2String(sb, digits);
    }
}
