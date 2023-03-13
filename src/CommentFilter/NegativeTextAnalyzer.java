package CommentFilter;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private static final String[] KEYWORD = {":(", "=(", ":|"};
    @Override
    protected String[] getKeywords() {
        return KEYWORD;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
