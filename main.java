import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Table extends JPanel implements ActionListener {
    private JButton shuffleButton;

    static public void main(String[] args) {
        Table t = new Table();
        JFrame f = new JFrame();
        f.setTitle("Card Table");
        f.setSize(1000,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
        f.add(t);
        f.setVisible(true);
    }
    public Table() {
        JPanel panel = new JPanel();
        JButton shuffleButton = new JButton();
        shuffleButton.setPreferredSize(new Dimension(1000,25));
        shuffleButton.setText("Shuffle");
        shuffleButton.addActionListener(this);
        shuffleButton.setVisible(true);
        panel.add(shuffleButton);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.SOUTH);
        //add(shuffleButton);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(40,122,2));
        g2.fillRect(0,0,this.getWidth(), this.getHeight());
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
