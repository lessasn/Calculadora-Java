import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame{
    private JPanel mainPainel;
    private JTextField displayTextField;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divideButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton plusButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton minusButton;
    private JButton dotButton;
    private JButton a0Button;
    private JButton resultButton;
    private JButton addButton;
    private JButton a3Button;
    private JButton cleanButton;
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(displayTextField.getText());
        displayTextField.setText("");

    }

    public CalculatorGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPainel);
        this.pack();

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = displayTextField.getText() + a1Button.getText();
                displayTextField.setText(btnOneText);


            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTwoText = displayTextField.getText() + a2Button.getText();
                displayTextField.setText(btnTwoText);

            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText = displayTextField.getText() + a3Button.getText();
                displayTextField.setText(btnThreeText);

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText = displayTextField.getText() + a4Button.getText();
                displayTextField.setText(btnFourText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText = displayTextField.getText() + a5Button.getText();
                displayTextField.setText(btnFiveText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText = displayTextField.getText() + a6Button.getText();
                displayTextField.setText(btnSixText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText = displayTextField.getText() + a7Button.getText();
                displayTextField.setText(btnSevenText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText = displayTextField.getText() + a8Button.getText();
                displayTextField.setText(btnEightText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText = displayTextField.getText() + a9Button.getText();
                displayTextField.setText(btnNineText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnZeroText = displayTextField.getText() + a0Button.getText();
                displayTextField.setText(btnZeroText);

            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            String button_text = addButton.getText();
            getOperator(button_text);
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = minusButton.getText();
                getOperator((button_text));
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = plusButton.getText();
                getOperator(button_text);

            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = divideButton.getText();
                getOperator(button_text);
            }
        });
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            switch(math_operator){
                case '+': total2 = total1 + Double.parseDouble(displayTextField.getText());break;
                case '-': total2 = total1 - Double.parseDouble(displayTextField.getText());break;
                case '*': total2 = total1 * Double.parseDouble(displayTextField.getText());break;
                case '/': total2 = total1 / Double.parseDouble(displayTextField.getText());break;
            }
            displayTextField.setText(Double.toString(total2));
            total1 = 0.0;
            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            total2 = 0;
            displayTextField.setText("");
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String dotButtonText = displayTextField.getText() + dotButton.getText();
                displayTextField.setText(dotButtonText);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new CalculatorGUI("My First Java Project");
        frame.setVisible(true);
    }
}
