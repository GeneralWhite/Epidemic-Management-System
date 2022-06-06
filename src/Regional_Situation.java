import javax.swing.*;
import java.awt.*;

public class Regional_Situation
{
    private JPanel root;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Regional Situation");
        frame.setContentPane(new Regional_Situation().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 800);
        // 设置窗口相对于指定组件的位置
        // 如果参数为 null，则此窗口将置于屏幕的中央。
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JLabel label1 = new JLabel();
        label1.setIcon(new ImageIcon("src/4.png"));
        frame.add(label1);
        label1.setBounds(50, 50, 481, 350);

        frame.setResizable(false);
    }
}
