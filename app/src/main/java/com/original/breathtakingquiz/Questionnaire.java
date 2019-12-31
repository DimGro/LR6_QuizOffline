package com.original.breathtakingquiz;

public class Questionnaire {

    public static String[] questions = {
            "Which is a best Programing Language?",
            "Programing language JAVA works best for use in?",
            "Pogaluista, postavte horoshuyu oczenky na ekzamene",
            "Question?"
    };

    public String choices[][] = {
            {"HTML", "Russian", "CSS", "JAVA"},
            {"IDK", "Killing people", "Somewhere else", "Fourth answer"},
            {"Ok(No)", "Sure(No)", "Breathtaking!", "Yes.(No.)"},
            {"Right answer", "Wrong answer", "Wrong answer", "Wrong answer"}
    };

    public String correctAnswer[] = {
            "JAVA",
            "Killing people",
            "Breathtaking!",
            "Right answer"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
