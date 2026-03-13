import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class AIChatbotGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;

    private List<String> questions = new ArrayList<>();
    private List<String> answers = new ArrayList<>();

    public AIChatbotGUI () {

        questions.add("hello");
        answers.add("Hello! How can I help you today?");

        questions.add("hi");
        answers.add("Hi there! Ask me something.");

        questions.add("how are you");
        answers.add("I'm just a chatbot, but I'm doing great!");

        questions.add("what is artificial intelligence");
        answers.add("Artificial Intelligence is the simulation of human intelligence by machines.");

        questions.add("what is ai");
        answers.add("AI stands for Artificial Intelligence.");

        questions.add("what is java");
        answers.add("Java is a popular object-oriented programming language used for building applications.");

        questions.add("what is spring boot");
        answers.add("Spring Boot is a framework used to build Java web applications and microservices.");

        questions.add("what is machine learning");
        answers.add("Machine learning is a branch of AI that allows systems to learn from data.");

        questions.add("thanks");
        answers.add("You're welcome!");

        questions.add("bye");
        answers.add("Goodbye! Have a great day.");

        // Window setup
        setTitle("AI Semantic Chatbot");
        setSize(500,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        inputField = new JTextField();
        add(inputField, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! I am an AI Semantic Chatbot. Ask me about AI or programming.\n\n");

        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String userInput = inputField.getText().toLowerCase().trim();

                chatArea.append("You: " + userInput + "\n");

                String response = getBestResponse(userInput);

                chatArea.append("Bot: " + response + "\n\n");

                inputField.setText("");
            }
        });

        setVisible(true);
    }

    private String getBestResponse(String input) {

        double bestScore = 0;
        int bestIndex = -1;

        for(int i = 0; i < questions.size(); i++) {

            double score = similarity(input, questions.get(i));

            if(score > bestScore) {
                bestScore = score;
                bestIndex = i;
            }
        }

        if(bestScore > 0.2) {
            return answers.get(bestIndex);
        }

        return "Sorry, I don't understand that yet.";
    }
    private double similarity(String a, String b) {

        Set<String> setA = new HashSet<>(Arrays.asList(a.split(" ")));
        Set<String> setB = new HashSet<>(Arrays.asList(b.split(" ")));

        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);

        return (double) intersection.size() / union.size();
    }

    public static void main(String[] args) {
        new AIChatbotGUI ();
    }
}