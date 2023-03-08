package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    /**
     * Нужно написать (TDD) класс MoodAnalyser, который оценивает фразы по настроению
     */
    @Test
    void testMoodAnalysisHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String str = "хорошее настроение";
        assertThat(MoodAnalyser.analyze(str)).isEqualTo("Happy");
    }
 @Test
    void testMoodAnalysisSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String str = "плохое настроение";
        assertThat(MoodAnalyser.analyze(str)).isEqualTo("Sad");
    }
@Test
    void testMoodAnalysisSoso() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String str = "нейтральное настроение";
        assertThat(MoodAnalyser.analyze(str)).isEqualTo("medium mood");
    }

}