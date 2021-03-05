import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    public class MoodAnalyserTest {


        /*
        @Test
        public void testMoodAnalysis_ReturnHappy_When_anyMood()  {
            String analyse = mood.analyseMood();
            Assertions.assertEquals("HAPPY", analyse);
        }

        @Test
        public void testMoodAnalysisWhenReturnHappy_usingConstructor(){
            String analyseMood= mood.analyseMood();
            Assertions.assertEquals("SAD", analyseMood);
        }

         */

        @Test
        public void HandleException_WhenInvalidInput(){
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            String mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY",mood);
        }


    }


