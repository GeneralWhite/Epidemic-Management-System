import javax.swing.*;

public class Regional_Situation
{
    private JPanel root;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Regional Situation");
        frame.setContentPane(new Regional_Situation().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        // 设置窗口相对于指定组件的位置
        // 如果参数为 null，则此窗口将置于屏幕的中央。
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
