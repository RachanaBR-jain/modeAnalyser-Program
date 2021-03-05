import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    public class MoodAnalyserTest {

        MoodAnalyser mood;

        @Test
        public void givenNullThrowException() {
            mood = new MoodAnalyser(null);
            try {
                mood.analyseMood();
            }catch (MoodAnalyserException e) {
                Assertions.assertEquals("Null Mood", e.getMessage());
            }
        }

        @Test
        public void givenEmptyThrowException() {
            mood = new MoodAnalyser("");
            try {
                mood.analyseMood();
            }catch (MoodAnalyserException e) {
                Assertions.assertEquals("Empty Mood", e.getMessage());
            }
        }


    }


