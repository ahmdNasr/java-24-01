import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[]{
                new Question("Was ist 1x1?", new String[]{ "1", "2", "3", "4" }, new String[]{ "1" }),
                new Question("Was ist 3x5?", new String[]{ "10", "15", "30" }, new String[]{ "15" }),
                new Question("Was ist die Wurzel aus 4?", new String[]{ "4", "2", "-2", "1", "0" }, new String[]{ "2", "-2" }),
                new Question("Was ist x^0?", new String[]{ "1", "2", "3", "4" }, new String[]{ "1" }),
                new Question("Wie lautet der Satz von Pythagoras?", new String[]{ "a^2 + b^2 = c^2", "a^3 + b^3 = c^3", "sqrt(a^2 + b^2)=c", "a+b=c" }, new String[]{ "a^2 + b^2 = c^2", "sqrt(a^2 + b^2)=c" }),
        };



        // anz der fragen mit mind 2 richtigen Antwortmöglichkeiten
        List<Question> result = new ArrayList<>();
        for(Question q : questions) {
            if(q.getCorrectChoices().length >= 2) result.add(q);
        }
        System.out.println(result.size());
//
//        long streamResult = List.of(questions)
//                .stream()
//                .filter((q) -> q.getCorrectChoices().length >= 2) // stream mit 5 questions ===> filter ====> streams mit <=5 questions
//                .count();

        List<Question> streamResult = List.of(questions)
                .stream()
                .filter((q) -> q.getCorrectChoices().length >= 2) // stream mit 5 questions ===> filter ====> streams mit <=5 questions
                .collect(Collectors.toList());

        System.out.println(streamResult);


        int totalQuestionLength = 0;
        for(int i = 0; i < questions.length; i++) {
            int questionLength = questions[i].getDescription().length();
            totalQuestionLength += questionLength;
        }
        System.out.println(totalQuestionLength/questions.length);
//         Imperative Programming (WIE)
//         Declarative Programming (WAS)
//
//         Stream --> "Fluss"

        double avgQuestionLength = List.of(questions)
                .stream()
                .mapToInt((question) -> question.getDescription().length())
                .peek((descriptionLength) -> System.out.print(descriptionLength + " - "))
                .average()
                .getAsDouble();

        System.out.println();
        System.out.println(avgQuestionLength);

        Question questionWithMaxChoices = List.of(questions)
                .stream()
                .min(Comparator.comparingInt(q -> q.getChoices().length)) // (q1, q2) -> q1.getChoices.length - q2.getChoices.length
                .get();
        System.out.println(questionWithMaxChoices);


        int totalChoicesLength = 0;
        int countChoices = 0;
        for(Question q : questions) {
            countChoices += q.getChoices().length;
            for(String choice : q.getChoices()) {
                totalChoicesLength += choice.length();
            }
        }
        System.out.println( ((double) totalChoicesLength / countChoices));

        // [ { choices: [...] }, { choices: [...] }, { choices: [...] }, { choices: [...] }, ...]
        // map: [[...], [...], [...], [...], ... ]
        // flatmap: [., ., ., ., ., ., ]

        double avgCoice = List.of(questions)
                .stream()
                .flatMap(question -> List.of(question.getChoices()).stream())
                .mapToInt(choice -> choice.length())
                .average()
                .getAsDouble();
        System.out.println(avgCoice);


        List.of(questions)
                .stream()
                .filter((q) -> q.getDescription().length() < 15)
                .forEach(System.out::println); // method reference
//                .forEach((q) -> System.out.println(q));

    }
}

// List.of(array).stream()

// filter
// count
// map
// min, max
// flatmap
// forEach
// peek

// collect(Collectors.toList())
