public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {

        try {
            if (message.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY, "Empty Mood");
            }
            if (message.contains("Sad")) {
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch(NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL, "Null Mood");
        }

    }

}


