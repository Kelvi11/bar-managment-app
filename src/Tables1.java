import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tables1 extends JFrame{
    public Tables1(){




        JComboBox box = getItemsComboBox();

        JButton addButton = createAddButton(box);

        JButton makeOrderButton = createMakeOrderButton();

//        JPanel listSection = new JPanel(new GridLayout(1,2));

//        JPanel panel = new JPanel();

//        panel.add(box);
//        panel.add(listSection);
//        panel.setLayout(new FlowLayout());





//        this.add(panel);
        //this.add(listSection);



        this.setTitle("TABLE 1");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(box);
        this.add(addButton);
        this.add(makeOrderButton);

        this.setSize(400,400);
        this.setVisible(true);

    }

    private static JComboBox getItemsComboBox() {
        String[] items = {"beer","cola","water"};

        JComboBox box = new JComboBox(items);

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==box){
                }
            }
        });
        return box;
    }

    private static JButton createAddButton(JComboBox box) {
        JButton button = new JButton("Add");

        button.setBackground(Color.BLUE);
        button.setFocusable(false);


        button.addActionListener(actionEvent -> {
            if (actionEvent.getSource()== button){
                JLabel label = new JLabel(box.getSelectedItem()+" ");
                Button button1 = new Button("Remove");
                button1.addActionListener(actionEvent1 -> {
                    if (actionEvent1.getSource()==button1){
//                        listSection.remove(label);
//                        listSection.remove(button1);
//                        listSection.revalidate();
                    }
                });
//
//                listSection.add(label);
//                listSection.add(button1);
//                listSection.revalidate();

            }

        });
        return button;
    }

    private static JButton createMakeOrderButton() {
        JButton button1 = new JButton("Make Order");
        button1.setFocusable(false);
        button1.addActionListener(actionEvent -> {
            Order order = new Order();
            Tables tables = new Tables();

            tables.button1.setBackground(Color.red);


        });
        return button1;
    }


}


