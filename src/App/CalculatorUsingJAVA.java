package App;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class CalculatorUsingJAVA implements ActionListener{

    double input, result;
    String operator;

    //Frame and Label
    static JFrame frame;
    static JLabel label = new JLabel();
    static JTextField textView = new JTextField();

    // CLR, DEL, Multiplication, Division Button
     static JButton symCLR = new JButton("CLR");
     static JButton symDEL = new JButton("DEL");
     static JButton symMultiply = new JButton("*");
     static JButton symDivision = new JButton("/");

     // 7 , 8 , 9 , Subtraction Button
     static JButton numSeven = new JButton("7");
     static JButton numEight = new JButton("8");
     static JButton numNine = new JButton("9");
     static JButton symSubtraction = new JButton("-");

     // 4 ,5 , 6 , Addition Button
     static JButton numFour = new JButton("4");
     static JButton numFive = new JButton("5");
     static JButton numSix = new JButton("6");
     static JButton symAddition = new JButton("+");

     //1 ,2 , 3 , Equal To Button
    static JButton numOne = new JButton("1");
    static JButton numTwo = new JButton("2");
    static JButton numThree = new JButton("3");
    static JButton symEqualTo = new JButton("=");

    // 0 , Dot(Point) Button
    static JButton power = new JButton("^");
    static JButton numZero = new JButton("0");
    static JButton symDot = new JButton(".");


    // Creating USER Interface
    public static void createInterface(){
        frame = new JFrame();
        frame.setTitle("CalculatorUsingSwing");
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    // Components of Calculator
    public static void interfaceComponent(){

        //Output Row is completed.
        label.setBounds(20,0,160,50);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(label);

        // For Showing the Input entered by the User.
        textView.setBounds(10,40,270,60);
        textView.setEditable(false);
        textView.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textView);

        //Row 1 Buttons
        symCLR.setBounds(10,110,60,40);
        frame.add(symCLR);
        symDEL.setBounds(80,110,60,40);
        frame.add(symDEL);
        symMultiply.setBounds(150,110,60,40);
        frame.add(symMultiply);
        symDivision.setBounds(220,110,60,40);
        frame.add(symDivision);

        //Row 2 Buttons
        numSeven.setBounds(10,160,60,40);
        frame.add(numSeven);
        numEight.setBounds(80,160,60,40);
        frame.add(numEight);
        numNine.setBounds(150,160,60,40);
        frame.add(numNine);
        symSubtraction.setBounds(220,160,60,40);
        frame.add(symSubtraction);

        //Row 3 Buttons
        numFour.setBounds(10,210,60,40);
        frame.add(numFour);
        numFive.setBounds(80,210,60,40);
        frame.add(numFive);
        numSix.setBounds(150,210,60,40);
        frame.add(numSix);
        symAddition.setBounds(220,210,60,40);
        frame.add(symAddition);

        //Row 4 Buttons
        numOne.setBounds(10,260,60,40);
        frame.add(numOne);
        numTwo.setBounds(80,260,60,40);
        frame.add(numTwo);
        numThree.setBounds(150,260,60,40);
        frame.add(numThree);
        symEqualTo.setBounds(220,260,60,90);
        frame.add(symEqualTo);

        //Row 5 Buttons
        power.setBounds(10,310,60,40);
        frame.add(power);
        numZero.setBounds(80,310,60,40);
        frame.add(numZero);
        symDot.setBounds(150,310,60,40);
        frame.add(symDot);

        
    }

    // When a user clicks a button, an ActionEvent is triggered.
    //Since "this" is passed as the listener, the class must implement ActionListener and
    // override actionPerformed(ActionEvent e)
    public void addInterfaceEventListener(){
        //Row 1
        symCLR.addActionListener(this);
        symDEL.addActionListener(this);
        symMultiply.addActionListener(this);
        symDivision.addActionListener(this);
        //Row 2
        numSeven.addActionListener(this);
        numEight.addActionListener(this);
        numNine.addActionListener(this);
        symSubtraction.addActionListener(this);
        //Row 3
        numFour.addActionListener(this);
        numFive.addActionListener(this);
        numSix.addActionListener(this);
        symAddition.addActionListener(this);
        // Row 4
        numOne.addActionListener(this);
        numTwo.addActionListener(this);
        numThree.addActionListener(this);
        symEqualTo.addActionListener(this);
        //Row 5
        power.addActionListener(this);
        numZero.addActionListener(this);
        symDot.addActionListener(this);
    }


    public static void Calculator(){
        createInterface();
        interfaceComponent();
        CalculatorUsingJAVA c = new CalculatorUsingJAVA();
        c.addInterfaceEventListener();
    }

    //This function is used to perform some action after user click on buttons.
     @Override
     public void actionPerformed(ActionEvent e) {
         Object event = e.getSource();
         //Input Values
         if(event == numZero){
             if(textView.getText().equals("0"))
             {
                 textView.setText("0");
             }
             else{
                 textView.setText(textView.getText()+"0");
             }
         }else if(event == numOne){
             textView.setText(textView.getText()+"1");
         }else if(event == numTwo){
             textView.setText(textView.getText()+"2");
         }else if(event == numThree){
             textView.setText(textView.getText()+"3");
         }else if(event == numFour){
             textView.setText(textView.getText()+"4");
         }else if(event == numFive){
             textView.setText(textView.getText()+"5");
         }else if(event == numSix){
             textView.setText(textView.getText()+"6");
         }else if(event == numSeven){
             textView.setText(textView.getText()+"7");
         }else if(event == numEight){
             textView.setText(textView.getText()+"8");
         }else if(event == numNine){
             textView.setText(textView.getText()+"9");
         }else if(event == symCLR){
             label.setText("");
             textView.setText("");
         }else if(event == symDEL){
             String currentText = textView.getText();
             int length = currentText.length();
             if(length>0){
                StringBuilder numString = new StringBuilder(currentText);
                numString.deleteCharAt(length-1);
                textView.setText(numString.toString());
            }
            if(textView.getText().endsWith("")){
                label.setText("");
            }
         } else if(event == symDot){
             if(textView.getText().contains(".")){
                 return;
             }else{
                 textView.setText(textView.getText()+".");
             }
         } else if(event == symMultiply){
             String presentNum = textView.getText();
             input = Double.parseDouble(textView.getText());
             textView.setText("");
             label.setText(presentNum+" * ");
             operator = "*";
         }else if(event == symDivision){
             String presentNum = textView.getText();
             input = Double.parseDouble(textView.getText());
             textView.setText("");
             label.setText(presentNum+" / ");
             operator = "/";
         }else if(event == symSubtraction){
             String presentNum = textView.getText();
             input = Double.parseDouble(textView.getText());
             textView.setText("");
             label.setText(presentNum+" - ");
             operator = "-";
         }else if(event == symAddition){
             String presentNum = textView.getText();
             input = Double.parseDouble(textView.getText());
             textView.setText("");
             label.setText(presentNum+" + ");
             operator = "+";
         } else if (event == power) {
             String presentNum = textView.getText();
             input = Double.parseDouble(textView.getText());
             textView.setText("");
             label.setText(presentNum+" ^ ");
             operator = "^";
         }else if (event==symEqualTo) {
             switch (operator){
                 case "^":
                     result=Math.pow(input,Double.parseDouble(textView.getText()));
                     if(Double.toString(result).endsWith(".0")){
                         textView.setText(Double.toString(result).replace(".0",""));
                     }else{
                         textView.setText(Double.toString(result));
                     }
                     label.setText("");
                     break;
                 case "*":
                     result=input*(Double.parseDouble(textView.getText()));
                     if(Double.toString(result).endsWith(".0")){
                         textView.setText(Double.toString(result).replace(".0",""));
                     }else{
                         textView.setText(Double.toString(result));
                     }
                     label.setText("");
                     break;
                 case "/":
                     result=input/(Double.parseDouble(textView.getText()));
                     if(Double.toString(result).endsWith(".0")){
                         textView.setText(Double.toString(result).replace(".0",""));
                     }else{
                         textView.setText(Double.toString(result));
                     }
                     label.setText("");
                     break;
                 case "-":
                     result=input-(Double.parseDouble(textView.getText()));
                     if(Double.toString(result).endsWith(".0")){
                         textView.setText(Double.toString(result).replace(".0",""));
                     }else{
                         textView.setText(Double.toString(result));
                     }
                     label.setText("");
                     break;
                 case "+":
                     result=input+(Double.parseDouble(textView.getText()));
                     if(Double.toString(result).endsWith(".0")){
                         textView.setText(Double.toString(result).replace(".0",""));
                     }else{
                         textView.setText(Double.toString(result));
                     }
                     label.setText("");
                     break;
             }
         }
     }

     public static void main(String[] args) {
          Calculator();
     }
 }







