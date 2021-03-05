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
        public void testMoodAnalysisWhenReturnSad_usingConstructor() {
            String analyse = mood.analyseMood();
            Assertions.assertEquals("SAD", analyse);
        }


    }


