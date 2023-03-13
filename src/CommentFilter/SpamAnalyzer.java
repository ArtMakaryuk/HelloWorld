package CommentFilter;

public class SpamAnalyzer extends KeywordAnalyzer{

    private String[] keyword;

    public SpamAnalyzer(String[] keyword) {
        this.keyword = keyword;
    }


    @Override
    protected String[] getKeywords() {
        return keyword;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}


