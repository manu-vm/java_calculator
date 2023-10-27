import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
boolean isCperatorClicked=false;
float oldValueF,newValueF,Result;
String oldValue,newValue;
int operator,flag=0;
JFrame frame;
JLabel label;
JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,multiButton;
    JButton divisionButton,additionButton,clearButton,minusButton,equalButton,dotButton,zeroButton;
public Calculator() {
frame=new JFrame();
frame.setLayout(null);
frame.setTitle("Calculator");
frame.setSize(460,500);
frame.setLocation(700,0);
frame.setVisible(true);

label=new JLabel();
label.setFont(new Font("",Font.BOLD, 40));
label.setBounds(20,10, 420,80);
label.setBackground(Color.lightGray);
label.setForeground(Color.BLACK);
label.setHorizontalAlignment(SwingConstants.RIGHT);
frame.add(label);
label.setOpaque(true);


sevenButton=new JButton("7");
sevenButton.setFont(new Font("sf",Font.BOLD,50));
sevenButton.setBounds(20, 100, 80, 80);
sevenButton.addActionListener(this);
frame.add(sevenButton);

eightButton=new JButton("8");
eightButton.setFont(new Font("sf",Font.BOLD,50));
eightButton.setBounds(100, 100, 80, 80);
eightButton.addActionListener(this);
frame.add(eightButton);

nineButton=new JButton("9");
nineButton.setFont(new Font("sf",Font.BOLD,50));
nineButton.setBounds(180, 100, 80, 80);
nineButton.addActionListener(this);
frame.add(nineButton);

fourButton=new JButton("4");
fourButton.setFont(new Font("sf",Font.BOLD,50));
fourButton.setBounds(20, 190, 80, 80);
fourButton.addActionListener(this);
frame.add(fourButton);

   fiveButton=new JButton("5");
fiveButton.setFont(new Font("sf",Font.BOLD,50));
fiveButton.setBounds(100, 190, 80, 80);
fiveButton.addActionListener(this);
frame.add(fiveButton);

sixButton=new JButton("6");
sixButton.setFont(new Font("sf",Font.BOLD,50));
sixButton.setBounds(180, 190, 80, 80);
sixButton.addActionListener(this);
frame.add(sixButton);

oneButton=new JButton("1");
oneButton.setFont(new Font("sf",Font.BOLD,50));
oneButton.setBounds(20, 280, 80, 80);
oneButton.addActionListener(this);
frame.add(oneButton);

twoButton=new JButton("2");
twoButton.setFont(new Font("sf",Font.BOLD,50));
twoButton.setBounds(100, 280, 80, 80);
twoButton.addActionListener(this);
frame.add(twoButton);

threeButton=new JButton("3");
threeButton.setFont(new Font("sf",Font.BOLD,50));
threeButton.setBounds(180, 280, 80, 80);
threeButton.addActionListener(this);
frame.add(threeButton);

dotButton=new JButton(".");
dotButton.setFont(new Font("sf",Font.BOLD,50));
dotButton.setBounds(100, 370, 80, 80);
dotButton.addActionListener(this);
frame.add(dotButton);

zeroButton=new JButton("0");
zeroButton.setFont(new Font("sf",Font.BOLD,50));
zeroButton.setBounds(20, 370, 80, 80);
zeroButton.addActionListener(this);
frame.add(zeroButton);

clearButton=new JButton("Clear");
clearButton.setFont(new Font("sf",Font.BOLD,15));
clearButton.setBounds(270, 100, 170, 80);
clearButton.addActionListener(this);
frame.add(clearButton);

multiButton=new JButton("x");
multiButton.setFont(new Font("sf",Font.PLAIN,30));
multiButton.setBounds(360,190, 80, 80);
multiButton.addActionListener(this);
frame.add(multiButton);

minusButton=new JButton("-");
minusButton.setFont(new Font("sf",Font.BOLD,30));
minusButton.setBounds(270, 280, 80, 80);
minusButton.addActionListener(this);
frame.add(minusButton);

additionButton=new JButton("+");
additionButton.setFont(new Font("sf",Font.BOLD,30));
additionButton.setBounds(270, 190, 80, 80);
additionButton.addActionListener(this);
frame.add(additionButton);

divisionButton=new JButton("÷");
divisionButton.setFont(new Font("sf",Font.BOLD,30));
divisionButton.setBounds(360,280, 80, 80);
divisionButton.addActionListener(this);
frame.add(divisionButton);

equalButton=new JButton("=");
equalButton.setFont(new Font("sf",Font.BOLD,30));
equalButton.setBounds(190,370,250,80);
equalButton.addActionListener(this);
frame.add(equalButton);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
        public static void main(String[] args) {
new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource()==sevenButton) {
if(isCperatorClicked) {
flag=0;
label.setText("7");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"7");
}

}else if(e.getSource()==eightButton){
if(isCperatorClicked) {
flag=0;
label.setText("8");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"8");
}
}else if(e.getSource()==nineButton){
if(isCperatorClicked) {
flag=0;
label.setText("9");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"9");
}
}else if(e.getSource()==fourButton){

if(isCperatorClicked) {
flag=0;
label.setText("4");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"4");
}
}else if(e.getSource()==fiveButton){
if(isCperatorClicked) {
flag=0;
label.setText("5");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"5");
}
}else if(e.getSource()==sixButton) {
if(isCperatorClicked) {
flag=0;
label.setText("6");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"6");
}
}else if(e.getSource()==oneButton) {
if(isCperatorClicked) {
flag=0;
label.setText("1");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"1");
}
}else if(e.getSource()==twoButton) {
if(isCperatorClicked) {
flag=0;
label.setText("2");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"1");
}
}else if(e.getSource()==threeButton) {
if(isCperatorClicked) {
flag=0;
label.setText("3");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"3");
}
}else if(e.getSource()==zeroButton) {
if(isCperatorClicked) {
flag=0;
label.setText("0");
isCperatorClicked=false;
}else {
label.setText(label.getText()+"0");
}
}else if(e.getSource()==dotButton){
if(isCperatorClicked) {
flag=0;
label.setText(".");
isCperatorClicked=false;
}else if(flag==0){
label.setText(label.getText()+".");
flag=1;
}
}else if(e.getSource()==additionButton) {
isCperatorClicked=true;
oldValue=label.getText();
operator=1;
}else if(e.getSource()==multiButton) {
isCperatorClicked=true;
oldValue=label.getText();
operator=2;
}else if(e.getSource()==minusButton) {
isCperatorClicked=true;
oldValue=label.getText();
operator=3;
}else if(e.getSource()==divisionButton){
isCperatorClicked=true;
oldValue=label.getText();
operator=4;
}else if(e.getSource()==clearButton) {
label.setText("");
flag=0;
}else if(e.getSource()==equalButton) {
flag=1;
   switch(operator) {
   case 1:
    newValue=label.getText();
   oldValueF=Float.parseFloat(oldValue);
   newValueF=Float.parseFloat(newValue);
   Result=oldValueF+newValueF;
   label.setText(Result+"");
    break;
   case 2:
    newValue=label.getText();
   float oldValueF=Float.parseFloat(oldValue);
   float newValueF=Float.parseFloat(newValue);
   float Result=oldValueF*newValueF;
   label.setText(Result+"");
    break;
   case 3:
    newValue=label.getText();
    oldValueF=Float.parseFloat(oldValue);
    newValueF=Float.parseFloat(newValue);
    Result=oldValueF-newValueF;
   label.setText(Result+"");
    break;
   case 4:
    newValue=label.getText();
    oldValueF=Float.parseFloat(oldValue);
    newValueF=Float.parseFloat(newValue);
    Result=oldValueF/newValueF;
   label.setText(Result+"");
    break;
}

       }
     }
}
