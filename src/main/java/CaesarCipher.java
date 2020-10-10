public class CaesarCipher {

    private String subjectText;
    private int key;

    public CaesarCipher(String subjectText, int key) {
        this.subjectText = subjectText;
        this.key = key;
    }

    public String getSubjectText() {
        return subjectText;
    }

    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }

    public int getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String encrypt(){
        return "I work";
    }

    public String decrypt(){
        return "I work";
    }


}
