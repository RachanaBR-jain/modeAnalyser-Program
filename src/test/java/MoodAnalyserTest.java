import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    public class MoodAnalyserTest {
        MoodAnalyser mood;
        @BeforeEach
        public void objectMethod(){

            mood = new MoodAnalyser();
        }
        @Test
        public void testMoodAnalysis_ReturnHappy_When_anyMood()  {
            String analyse = mood.analyseMood();
            Assertions.assertEquals("HAPPY", analyse);
        }

    }


