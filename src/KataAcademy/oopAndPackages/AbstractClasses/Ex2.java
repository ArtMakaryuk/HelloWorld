package KataAcademy.oopAndPackages.AbstractClasses;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String text = "Это проверяемая строка  строка reklama";
        String[] spam1 = {"Reklama", "reklama", "reklamka"};
        String[] spam2 = {"Akcya", "akcya"};

        TextAnalyzer t1 = new TooLongTextAnalyzer(90);
        TextAnalyzer t2 = new NegativeTextAnalyzer();
        TextAnalyzer t3 = new SpamAnalyzer(spam1);
        TextAnalyzer t4 = new SpamAnalyzer(spam2);

        TextAnalyzer[] analyzers = {t1, t2, t3, t4};

        System.out.println(checkLabels(analyzers, text));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer ta : analyzers) {
            Label label = ta.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}

interface TextAnalyzer {
    Label processText(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeyword() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}

class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private static final String[] KEYWORDS = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeyword() {
        return KEYWORDS;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }
}

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeyword();

    protected abstract Label getLabel();
    public Label processText(String text) {
        for (String keyword : getKeyword()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
