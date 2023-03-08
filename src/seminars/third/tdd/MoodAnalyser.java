package seminars.third.tdd;

public class MoodAnalyser {
    public static String analyze(String str) {
        if(str.contains("хорошее"))
            return "Happy";
        if(str.contains("плохое"))
            return "Sad";
        return "medium mood";
    }
}
