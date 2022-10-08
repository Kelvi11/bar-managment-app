import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tables3  extends JFrame{
    JComboBox box;
    JPanel panel;
    JPanel listSection;
    JButton button;
    JButton button1;

    Tables3(){
        this.setTitle("TABLE 3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        listSection = new JPanel(new GridLayout(1,2));

        String[] items = {"beer","cola","water"};
        box = new JComboBox(items);

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==box){
                }
            }
        });


        panel = new JPanel();

        panel.add(box);
        panel.add(listSection);
        panel.setLayout(new FlowLayout());

        button = new JButton("Add");

        button.setBackground(Color.BLUE);
        button.setFocusable(false);


        button.addActionListener(actionEvent -> {
            if (actionEvent.getSource()== button){
                JLabel label = new JLabel(box.getSelectedItem()+" ");
                Button button1 = new Button("Remove");
                button1.addActionListener(actionEvent1 -> {
                    if (actionEvent1.getSource()==button1){
                        listSection.remove(label);
                        listSection.remove(button1);
                        listSection.revalidate();
                    }
                });

                listSection.add(label);
                listSection.add(button1);
                listSection.revalidate();

            }

        });
        button1 = new JButton("Make Order");
        button1.setFocusable(false);
        button1.addActionListener(actionEvent -> {
            Order order = new Order();


            Tables tables = new Tables();

            tables.button3.setBackground(Color.red);


        });

        this.add(box);
        this.add(panel);
        this.add(listSection);
        this.add(button);
        this.add(button1);

        this.setSize(400,400);
        this.setVisible(true);




    }



}