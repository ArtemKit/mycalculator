import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
 
 
public class BikeOrder {
    JFrame MainFrame;
    JPanel windowContent;
    JTextField quantityField;
    JButton buttonOrder;
    JComboBox<Object> bikeListBox;
    JPanel textPanel1;
    JLabel label1;
    JLabel label2;
    JLabel test;
    String [] bikes= { "GT", "Giant", "Trek", "Merida", "Scott", "Kellys" };
    String dispFieldText;
 
    int quantity;
    
    BikeOrder(){
        //main window
        windowContent= new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        
        //layout
        GridLayout  b1= new GridLayout (3,2);
        windowContent.setLayout(b1);
        
        //top label
        label1= new JLabel("Choose your bike");
        label2= new JLabel("Quantity");
        test = new JLabel("You ordered "+ quantity);
        
        //listbox
        bikeListBox = new JComboBox<Object>(bikes);
        
        //text field        
        quantityField = new JFormattedTextField();
        quantityField.setHorizontalAlignment(SwingConstants.RIGHT);
        
        
        //order
        buttonOrder=new JButton("Order");
        buttonOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispFieldText=quantityField.getText();
                
                    if (dispFieldText!=""){
                        try {
                        quantity = Integer.parseInt(dispFieldText);
                        test.setText("You ordered "+ quantity);
                        } catch (NumberFormatException e1) {
                      //Will Throw exception!
                      //do something! anything to handle the exception.
                        test.setText("Enter a number");
                            }
                    if  (quantity>10){test.setText("You ordered too much");}
                    }
                    }
                });
        
        
        
 
        
        //add everything
        windowContent.add("East",quantityField);
        windowContent.add(label1);
        windowContent.add(label2);
        windowContent.add(bikeListBox);
        windowContent.add(quantityField);
        windowContent.add(buttonOrder);
        windowContent.add(test);
        
        //build a frame
        MainFrame = new JFrame("BikeShop");
        MainFrame.setContentPane(windowContent);
        MainFrame.setSize(400,300);
        MainFrame.setVisible(true);
    
        }
 
 
 
        public static void main(String[] args) {
            //run app
            BikeOrder BikeOrder = new BikeOrder();
 
        
 
    }
 
                       
}