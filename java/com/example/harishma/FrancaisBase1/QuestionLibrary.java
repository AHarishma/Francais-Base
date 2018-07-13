package com.example.harishma.FrancaisBase1;




public class QuestionLibrary {
    private String mQuestions[]={
            "WHAT IS YOUR NAME",
            "HOW ARE YOU",
            "MY NAME IS",
            "HOW TO SAY 'FATHER' IN FRENCH?",
            "HOW TO SAY 'DAUGHTER' IN FRENCH?",
            "HOW TO SAY 'TUESDAY' IN FRENCH?",
            "HOW TO SAY 'SUNDAY' IN FRENCH?"
    };
    private String mChoices[][]={
            {"comment vous applez-vous","mon nom est","merci"},
            {"comment allez vous","je suis","je vais bien"},
            {"felicitation","mon nom est","tout est bien"},
            {"mere","pere","fils"},
            {"grand-pere","soeur ainee","fille"},
            {"jeudi","mercredi","samedi"},
            {"samedi","lundi","vendredi"}
    };
    private String mCorrectAnswers[]={"comment vous applez-vous","comment allez vous","mon nom est","pere","fille","mercredi","lundi"};
    public String getQuestions(int a){
        String question=mQuestions[a];
        return question;
    }
    public  String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public  String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public  String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public  String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
