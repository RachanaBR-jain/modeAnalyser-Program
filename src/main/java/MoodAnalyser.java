public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {
        this.message = "I am in happy Mood";
    }

    public String analyseMood() {
        if (message.contains("happy")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }


}
