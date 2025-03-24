package cs.satyam.SpringApp1.model;

//{
//        "type": "multiple",
//        "difficulty": "easy",
//        "category": "Sports",
//        "question": "This Canadian television sportscaster is known for his &quot;Hockey Night in Canada&quot; role, a commentary show during hockey games.",
//        "correct_answer": "Don Cherry",
//        "incorrect_answers": [
//        "Don McKellar",
//        "Don Taylor ",
//        "Donald Sutherland"
//        ]
//        }

import java.util.List;

public class Question {
    public Question(String type, String difficulty, String question, String category, String correct_answers, List<String> incorrect_answers) {
        this.type = type;
        this.difficulty = difficulty;
        this.question = question;
        this.category = category;
        this.correct_answers = correct_answers;
        this.incorrect_answers = incorrect_answers;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrect_answers() {
        return correct_answers;
    }

    public List<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    private String type;

    private String difficulty;

    private String category;

    private String question;

    private String correct_answers;

    private List <String> incorrect_answers;


    public void setType(String type) {
        this.type = type;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrect_answers(String correct_answers) {
        this.correct_answers = correct_answers;
    }

    public void setIncorrect_answers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
