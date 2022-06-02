import javax.swing.*;
import java.awt.*;

public class TestMain
{
    public TestMain()
    {
        final JFrame jf = new JFrame("NCZ");
        jf.setLayout(new FlowLayout(2, 5, 5));
        jf.setSize(360, 360);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        Container container = jf.getContentPane();
        JLabel jLabel = new JLabel("Welcome! ! !");
        jLabel.setBackground(Color.BLUE);
        container.add(jLabel);
        container.setBackground(Color.black);


        jf.setVisible(true);

    }
    public static void main(String[] args)
    {
        new TestMain();
    }
}
