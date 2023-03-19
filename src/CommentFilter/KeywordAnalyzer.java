package CommentFilter;

public abstract class KeywordAnalyzer implements TextAnalyzer{

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
//        String[] str = getKeywords();
        for (String at: getKeywords()){
            if (text.contains(at)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
