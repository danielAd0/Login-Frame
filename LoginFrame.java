
package za.ac.tut.ui;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
/**
 *
 * @author Daniel Adoration
 */
public class LoginFrame extends JFrame {
    //panels
    private JPanel headingPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel usernamePasswordCombinedPnl;
    
    //labels
    private  JLabel headingLbl;
    private  JLabel usernameLbl;
    private  JLabel passwordLbl;
    
    //textfields
    private JTextField usernameTxtFld;
    
    //password field
    private JPasswordField passwordFld;
    
    //buttons
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    //construct the frame
    public LoginFrame(){
        //basic frame settings
        setTitle("Login Page");
        setSize(600, 650);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //create panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        usernamePasswordCombinedPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        usernamePasswordCombinedPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Login Details"));
        
        mainPnl = new JPanel(new BorderLayout());
        
        //create labels
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 30));
        headingLbl.setForeground(Color.RED);
        
        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        //create fields
        usernameTxtFld = new JTextField(10);
        usernameTxtFld.setFocusable(true);
        
        passwordFld = new JPasswordField(10);
        
        //create buttons
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add components to respective panels
        headingPnl.add(headingLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordFld);
        
        usernamePasswordCombinedPnl.add(usernamePnl);
        usernamePasswordCombinedPnl.add(passwordPnl);
        
        btnsPnl.add(submitBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(usernamePasswordCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        //add the main panel to the panel of the frame
        add(mainPnl);
        
        //pack the frame
        pack();
        
        //make the frame visible
        setVisible(true);
        
    }
}
