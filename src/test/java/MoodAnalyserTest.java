import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    public class MoodAnalyserTest {
        MoodAnalyser mood;

        @BeforeEach
        public void objectMethod(){

            mood = new MoodAnalyser();
        }

        @Test
        public void testHappyMood(){

            System.out.println(mood.analyseMood("I am in sad mood"));

        }

    }


