package notepad;

import java.time.LocalDate;

public class Reminder extends Note {
    private LocalDate date;
    private String time;

    @Override
    public void askQuestions() {
        super.askQuestions();
        System.out.println("Enter reminder date");
        date = Main.askDate();
        System.out.println("Enter reminder time");
        time = Main.askString();
    }

    @Override
    public boolean hasSubstring(String str) {
        return super.hasSubstring(str)
                || date.format(Main.DATE_FORMATTER).contains(str)
                || time.contains(str);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() + ", " +
                "text='" + getText() + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
