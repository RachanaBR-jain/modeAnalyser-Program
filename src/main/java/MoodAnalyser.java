public class MoodAnalyser {
        public String message="Im in Any mood";
        public String analyseMood() {

                if (message.contains("sad")) {
                    return "SAD";
                } else {
                    return "HAPPY";
                }
            }

}
