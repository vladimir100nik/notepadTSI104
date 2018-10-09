package notepad;

public class Note extends Record {
    private String text;
    private String tag;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() + "," +
                "text='" + text + '\'' +
                ",tag='" + tag + '\'' +
                '}';
    }

    @Override
    public boolean hasSubstring(String str) {
        return text.contains(str) || tag.contains(str);
    }

    @Override
    public void askQuestions() {
        System.out.println("Enter text:");
        text = Main.askString();
        System.out.println("Enter tag:");
        tag = Main.askString();
    }
}
