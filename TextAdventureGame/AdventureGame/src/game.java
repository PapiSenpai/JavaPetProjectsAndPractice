/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Final Project
*/



import javax.swing.JFrame; // used to frame a panel
import javax.swing.JLabel;
import javax.swing.JPanel; // used to display a panel
import javax.swing.JButton;// used to make buttons interactable
import javax.swing.JTextArea; // used fot outputing text

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color; // used to get colors
import java.awt.Font; // For custom font
import java.awt.Container; // used to make textboxs and buttons
import java.awt.GridLayout;


public class game {
//Create JFrame object
JFrame window; //command to make window
Container con; // A container us like a base and you can place a panel, a textbox or a button, etc.

//
JPanel TitlePanel, StartButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel; // makes a panel

// Makes a lable
JLabel TitleName; // lets you type name of game
JLabel hpLabel;
JLabel hpLableNumber;
JLabel weaponLable;
JLabel weaponLableName;

// Font
Font TitleFont = new Font("Times New Roman", Font.PLAIN, 90); // Created custom font for title
Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);

// buttons
JButton StartButton; // Make start button
JButton choice1, choice2, choice3,choice4; // make buttons for battle

//For the Text
JTextArea mainTextArea;

// Creates objects for classes
TitleScreenHandler tsHandler = new TitleScreenHandler();
ChoiceHandler choiceHandler = new ChoiceHandler();

// Varibles
int playerHP;
int monsterHP;
int silverRing;
String weapon;
String postion; // used to change position of text

//Driver Class
public static void main(String[] args){

    new game();
}
    public game(){

        // Making the Window for game
        window = new JFrame(); // object for Window
        window.setSize(800, 600); // set window size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes app terminate when closed 
        window.getContentPane().setBackground(Color.black); // Set background color
        window.setLayout(null); // We want to use a custom so this disables the defualt layout
        window.setVisible(true); // lets you see the window
        con = window.getContentPane(); // place window in container

        // Make a Panel for the title name
        TitlePanel = new JPanel();
        // Ex.) TitleName.setBounds(x-axis, y-axis, textbox width, textbox height)
        TitlePanel.setBounds(100, 100, 600, 150); // Creates space for the text box
        TitlePanel.setBackground(Color.black);
        // Make title name text
        TitleName = new JLabel("TextAdventure"); // Input title name
        TitleName.setForeground(Color.white); // Makes text color
        TitleName.setFont(TitleFont); // implemets custom font from line 14 

        // make START button panel
        StartButtonPanel = new JPanel();
        StartButtonPanel.setBounds(300, 400, 200, 100);
        StartButtonPanel.setBackground(Color.black);
        // text for start button
        StartButton = new JButton("START"); // Input button name
        StartButton.setBackground(Color.black); // 
        StartButton.setForeground(Color.white); // makes text color
        StartButton.setFont(normalFont); // sets font of text
        StartButton.addActionListener(tsHandler); // calls function to TitleScreenHandler
        StartButton.setFocusPainted(false); // makes white box line go away

        // outputs panles
        TitlePanel.add(TitleName); // put title name into panel
        StartButtonPanel.add(StartButton); // put start button text on panel
        //new text boxes
        con.add(StartButtonPanel);
        con.add(TitlePanel); 
    }

// method to make text appear
public void createGameplayScreen(){

    // Makes old text go away
    TitlePanel.setVisible(false);
    StartButtonPanel.setVisible(false);

    // Panel for gameplay text
    mainTextPanel = new JPanel();    // makes new object for gameplay text
    mainTextPanel.setBounds(100, 100, 600, 250);
    mainTextPanel.setBackground(Color.black);
    con.add(mainTextPanel);

    mainTextArea = new JTextArea("This is the main text area."); // enter text here
    mainTextArea.setBounds(100,100,600,250);
    mainTextArea.setBackground(Color.black);
    mainTextArea.setForeground(Color.white);
    mainTextArea.setFont(normalFont);
    mainTextArea.setLineWrap(true); // this means that text wraps automatically
    mainTextPanel.add(mainTextArea);

    // makes button objects
    choiceButtonPanel = new JPanel();
    choiceButtonPanel.setBounds(250, 350, 300, 200);
    choiceButtonPanel.setBackground(Color.black);
    choiceButtonPanel.setLayout(new GridLayout(4,1));
    con.add(choiceButtonPanel);
    // set the buttons for battle
    choice1 = new JButton("Choice1"); //Enter text
    choice1.setBackground(Color.black);
    choice1.setForeground(Color.white);
    choice1.setFont(normalFont);
    choiceButtonPanel.add(choice1);
    choice1.setFocusPainted(false); // makes white box line go away
    choice1.addActionListener(choiceHandler); // calls function ChoiceHandler
    choice1.setActionCommand("c1"); // lets button have an action when clicked
    // 
    choice2 = new JButton("Choice2"); //Enter text
    choice2.setBackground(Color.black);
    choice2.setForeground(Color.white);
    choice2.setFont(normalFont);
    choiceButtonPanel.add(choice2);
    choice2.setFocusPainted(false); // makes white box line go away
    choice2.addActionListener(choiceHandler); // calls function 
    choice2.setActionCommand("c2"); // lets button have an action when clicked
    //
    choice3 = new JButton("Choice3"); //Enter text
    choice3.setBackground(Color.black);
    choice3.setForeground(Color.white);
    choice3.setFont(normalFont);
    choiceButtonPanel.add(choice3);
    choice3.setFocusPainted(false); // makes white box line go away
    choice3.addActionListener(choiceHandler); // calls function ChoiceHandler
    choice3.setActionCommand("c3"); // lets button have an action when clicked
    //
    choice4 = new JButton("choice4"); //Enter text
    choice4.setBackground(Color.black);
    choice4.setForeground(Color.white);
    choice4.setFont(normalFont);
    choiceButtonPanel.add(choice4);
    choice4.setFocusPainted(false); // makes white box line go away
    choice4.addActionListener(choiceHandler); // calls function ChoiceHandler
    choice4.setActionCommand("c4"); // lets button have an action when clicked

    // Create panel for player interaction
    playerPanel = new JPanel();
    playerPanel.setBounds(100, 15, 600, 50);
    playerPanel.setBackground(Color.black);
    playerPanel.setLayout(new GridLayout(1,4)); // row of 4 for 4 buttons
    con.add(playerPanel);
    //
    hpLabel = new JLabel("HP: ");
    hpLabel.setFont(normalFont);
    hpLabel.setForeground(Color.white);
    playerPanel.add(hpLabel);
    //
    hpLableNumber = new JLabel();
    hpLableNumber.setFont(normalFont);
    hpLableNumber.setForeground(Color.white);
    playerPanel.add(hpLableNumber);
    //
    weaponLable = new JLabel("Weapon: ");
    weaponLable.setFont(normalFont);
    weaponLable.setForeground(Color.white);
    playerPanel.add(weaponLable);
    //
    weaponLableName = new JLabel();
    weaponLableName.setFont(normalFont);
    weaponLableName.setForeground(Color.white);
    playerPanel.add(weaponLableName);

    playerSetup(); // method call
}

// method to make paramters for the player
public void playerSetup(){
    // Text for player hp planel
    playerHP = 20;
    hpLableNumber.setText("" + playerHP); // do this way to display interger  

    townGate(); // method call
}

// method thats used after start button is clicked
public void townGate(){

    // lets program now the position
    postion = "townGate";

    mainTextArea.setText("You are trying to go into town but theres's\n"
                        + "a Guard." ); 
                        
    // set text for button choices
    choice1.setText("Talk to Guard");
    choice2.setText("Attack Guard");
    choice3.setText("Leave");
    choice4.setText("");

    choice2.setVisible(true);
    choice3.setVisible(true);
    choice4.setVisible(false);
}

// Method thats used whem choice1 button in townGate method is clicked
public void talkGuard(){

    // lets program now the position
    postion = "talkGuard";

    // changes text on main textbox
    mainTextArea.setText("Guard: You best not cross if you know what good for ya.");

    // set text for button choices
    choice1.setText("<Back Away>");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);
}

// Method thats used whem choice2 button in townGate method is clicked
public void fightGuard(){
    
    // lets program now the position
    postion = "fightGuard";

    // var
    int guardDamage = 0;
    guardDamage = new java.util.Random().nextInt(8);

    // changes text on main textbox
    mainTextArea.setText("Guard: Don't be dumb.\n "
                        + " (Guard attacks. You recieve damage " + guardDamage + ")");

    // take away hp
    playerHP = playerHP - guardDamage; // subtract 3 from playerHP
    hpLableNumber.setText("" + playerHP);

    // set text for button choices
    choice1.setText("<Continue>");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");

    choice3.setVisible(false);    
    choice4.setVisible(false);

}

// Method thats used whem choice3 button in townGate method is clicked
public void crossRoad(){

    // lets program now the position
    postion = "crossRoad";

    // changes text on main textbox
    mainTextArea.setText("You are at a crossroad.\n Go south to go back to the town.\n What will you do?");

    // set text for button choices
    choice1.setText("Go North");
    choice2.setText("Go South");
    choice3.setText("Go East");
    choice4.setText("Go West");
    //Resets to true
    choice1.setVisible(true);
    choice2.setVisible(true);    
    choice3.setVisible(true);
    choice4.setVisible(true);

}

public void North(){
     // lets program now the position
    postion = "North";

    // changes text on main textbox
    mainTextArea.setText("There is a river. You choose to rest at the\n"
                        + "riverside. You gain your Health back. (+3 HP)\n There was a Knife laying around and you pick it up\n (+3 Damage)");
    
    // Text for player weapon name
    weapon = "Knife";
    weaponLableName.setText(weapon);
    
    //calculation for adding health
    playerHP = playerHP + 3;
    hpLableNumber.setText("" + playerHP);

    // set text for button choices
    choice1.setText("Go to back to crossroads.");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");

    choice2.setVisible(false);
    choice3.setVisible(false);    
    choice4.setVisible(false);
}

public void East(){
    // lets program now the position
   postion = "East";

   // changes text on main textbox
   mainTextArea.setText("You walked into the forest and found a\n Long Sword");
   
    // Since new weapon was recived you must change old lable for weapon
    weapon = "Long Sword";
    weaponLableName.setText(weapon);

   // set text for button choices
   choice1.setText("Go West");
   choice2.setText("Go back");
   choice3.setText("");
   choice4.setText("");

   choice3.setVisible(false);    
   choice4.setVisible(false);
}


public void West(){

    // Monster HP 
    monsterHP = 20;

    // lets program now the position
   postion = "West";

   // changes text on main textbox
   mainTextArea.setText("Theres a Minion!\n What will you do?");
   
   // set text for button choices
   choice1.setText("Fight");
   choice2.setText("Run");
   choice3.setText("");
   choice4.setText("");

   choice3.setVisible(false);    
   choice4.setVisible(false);
}

// method for the fight sequence
public void fight(){

    // lets program now the position
    postion = "fight";

    // changes text on main textbox
    mainTextArea.setText("Monster HP: " + monsterHP + "\n\n What will you do?");

    // set text for button choices
    choice1.setText("Fight");
    choice2.setText("Run");
    choice3.setText("");
    choice4.setText("");

    choice2.setVisible(true);
    choice3.setVisible(false);    
    choice4.setVisible(false);
}

 // method for the fight sequence
public void playerAttack(){

    // lets program now the position
    postion = "playerAttack";

    // Varibles
    int playerDamage = 0;

    // if statement utulized to check what weapon you have
    if(weapon.equals("Knife")){
        // Makes damage given to monster random from 0-5
        playerDamage = new java.util.Random().nextInt(5);
    }
    else if(weapon.equals("Long Sword")){
         // Makes damage given to monster random from 0-9
        playerDamage = new java.util.Random().nextInt(10); 
    }
    else{
        playerDamage = new java.util.Random().nextInt(3);
    }

    // changes text on main textbox
    mainTextArea.setText("You attack the monster and gave " + playerDamage + "damage!");

    // calculation for hp lost since monster was attacked it lost hp
    monsterHP = monsterHP - playerDamage;

    // set text for button choices
    choice1.setText("<Continue>");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");

    choice2.setVisible(false);
    choice3.setVisible(false);    
    choice4.setVisible(false);
}

// method for monster attack after player attack
public void monsterAttack(){

     // lets program now the position
     postion = "monsterAttack";

     // Var
     int monsterDamage = 0;

     // Random number from 0-4
     monsterDamage = new java.util.Random().nextInt(5);

     // changes text on main textbox
     mainTextArea.setText("The monster attacked you and gave " + monsterDamage + " damage!");
 
    //reduce player HP
    playerHP = playerHP - monsterDamage;
    hpLableNumber.setText("" + playerHP);

     // set text for button choices
     choice1.setText("<Continue>");
     choice2.setText("");
     choice3.setText("");
     choice4.setText("");

     choice2.setVisible(false);
     choice3.setVisible(false);    
     choice4.setVisible(false);
}

// method thats used when you die
public void lose(){

    // lets program now the position
    postion = "lose";

    mainTextArea.setText("You Died\n\n<GAMEOVER>"); 
                        
    // set text for button choices
    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    // Make buttons invisable
    choice1.setVisible(false);
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);

}

// method thats used when you win
public void win(){

    // lets program now the position
    postion = "win";

    // sets main text
    mainTextArea.setText("You deafeated the monster!\n The monster dropped a silver\n ring."); 
               
    // gain the silver ring
    silverRing = 1;

    // set text for button choices
    choice1.setText("Go East");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
}

// method used to finish game
public void ending(){

    // lets program now the position
    postion = "ending";

    // sets main text
    mainTextArea.setText("You beat the monster! You are a hero! Come into town.\n\n <YOU WIN>");
    
    // set text for button choices
    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    // Make buttons invisable
    choice1.setVisible(false);
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);
    
                   
}


// subclasses that calls abstract interface ActionListner.
public class TitleScreenHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){
        createGameplayScreen(); // calls the method createGameplayScreen
    }

}

public class ChoiceHandler implements ActionListener{
    public void actionPerformed(ActionEvent event){
        
        // lets code now which button was clicked
        String yourChoice = event.getActionCommand();

        // switch statement to access text for button clicked 
        switch(postion){
        case "townGate":
            switch(yourChoice){
            case "c1": 
                    if(silverRing == 1){
                        ending(); //calls talkGuard method
                    }
                    else {
                        talkGuard();//calls talkGuard method
                    }
            break;
            case "c2": fightGuard(); // calls attackGuard method
            break;
            case "c3": crossRoad(); // calls crossRoad method
            break;
            case "c4": 
            break;
            default:
            }
        break;
        case "talkGuard":
            switch(yourChoice){
                case "c1": townGate(); // goes back to townGate method
                break;
                default:
            }
        break;
        case "fightGuard":
            switch(yourChoice){
                case "c1": townGate();; // goes back to townGate method
                break;
                default:
            }
        break;
        case "crossRoad":
            switch(yourChoice){
                case "c1": North(); // goes to North method
                break;
                case "c2": townGate(); // goes back to townGate method
                break;
                case "c3": East(); // goes to East method
                break;
                case "c4": West(); // goes to West method
                break;
                default:
            }
            break;
        case "North":
            switch(yourChoice){
                case "c1": crossRoad();
                break; 
                default:
            }
            break;
        case "East":
            switch(yourChoice){
                case "c1": West();
                break;
                case "c2": crossRoad();
                break;
                default:
            }
            break;
        case "West":
            switch(yourChoice){
                case "c1": fight();
                break;
                case "c2": crossRoad();
                break;
                default:
            }
            break;
        case "fight":
            switch(yourChoice){
                case "c1":playerAttack();
                break;
                case "c2": crossRoad();
                break;
                default:
            }
            break;
        case "playerAttack":
            switch(yourChoice){
                case "c1": 
                    if(monsterHP < 1){ //if statement used to see if monster is dead
                        win();
                    }
                    else{
                        monsterAttack();
                    }
                break;
                default:
            }
            break;
        case "monsterAttack":
            switch(yourChoice){
                case "c1": 
                    if (playerHP < 1){ //if statement used to see if you are dead
                        lose();
                    }
                    else {
                        fight();
                    }
                break;
                default:
            }
            break;
        case "win":
            switch(yourChoice){
                case "c1":crossRoad();
                break;
                default:
            }
            break;
        default:
        }
        
    }
}



}