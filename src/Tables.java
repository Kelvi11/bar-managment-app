import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Tables extends JFrame {

    JButton button1;
    JButton button2;
    JButton button3;
    JLabel label;
    String name = "Ergin";
    String surname = "Rusheku";



    Tables(){

        this.setTitle("BAR RESTAURANT JAVA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000,1000));
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        label = new JLabel();
        label.setText("Welcome " + name +" "+ surname);
        label.setSize(200,200);
        label.setVerticalAlignment(JLabel.TOP);


        button1 = createTableButton("Table 1", 20, 20);
        button1.addActionListener(e -> {
            if (e.getSource() == button1) {
                Tables1 tables1 = new Tables1();
            }
        });

        button2 = createTableButton("Table 2", 200, 20);
        button2.addActionListener(e -> {
            if (e.getSource() == button2) {
                Tables2 tables2 = new Tables2();
            }
        });

        button3 = createTableButton("Table 3", 400, 20);
        button3.addActionListener(e -> {
            if (e.getSource() == button3) {
                Tables3 tables3 = new Tables3();
            }
        });


        this.add(label);
        this.add(button1);
        this.add(button2);
        this.add(button3);


        this.setVisible(true);

    }

    private JButton createTableButton(String label, int locationX, int locationY){
        JButton button = new JButton(label);
        button.setSize(100,100);
        button.setLocation(locationX, locationY);
        button.setFocusable(false);
        return button;
    }
}

