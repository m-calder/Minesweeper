import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;

    private JButton button;
    private JButton button1;
    private JFrame frame;
    private JPanel panel;


    public GUI() {

        frame = new JFrame();
        panel = new JPanel();

        button = new JButton("Click me");
        button.addActionListener(this);
        button1 = new JButton("Number of Clicks: 0");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("Clicks: " + count);
            }
        });


        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout());
        panel.add(button);
        panel.add(button1);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Minesweeper!");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        button.setText("Clicks: " + count);
    }
}
