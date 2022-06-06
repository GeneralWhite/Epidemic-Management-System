import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
public class FirstPage {
    /*author:命运的信徒
     * arm:程序的初始页面
     * date:2019/1/19
     */
    private static void firtPage(){
        //1.设置窗体大小和标题
        JFrame jf=new JFrame("矿井管理系统");
        jf.setPreferredSize(new Dimension(700, 700));
        //2.设置关闭窗口就是关闭程序
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //最精准的布局模式空布局
        jf.setLayout(null);
        //设置定位
        JLabel jl=new JLabel("矿井平硐位移监测系统",JLabel.CENTER);
        jl.setPreferredSize(new Dimension(680, 30));
        jf.add(jl);
        jl.setBounds(0,0,690, 30);
        jl.setFont(new Font("宋体", Font.BOLD, 24));
        jl.setForeground(Color.decode("#375a7f"));
        //菜单栏
        //新建一个菜单条
        JMenuBar jb=new JMenuBar();
        jf.add(jb);
        jb.setBounds(0,40, 690, 30);
        jb.setBackground(Color.decode("#65991a"));
        //新建一个菜单选项
        JMenu jmenu=new JMenu("首页");
        jmenu.setPreferredSize(new Dimension(100, 30));
        jmenu.setForeground(Color.white);
        jb.add(jmenu);
        //新建一个菜单项
        //新建一个菜单选项
        JMenu jmenu1=new JMenu("更多");
        jmenu1.setForeground(Color.white);
        jmenu1.setPreferredSize(new Dimension(100, 30));
        jb.add(jmenu1);
        //新建一个菜单项
        JMenuItem jm0=new JMenuItem("退出程序");
        JMenuItem jm1=new JMenuItem("使用教程");
        jmenu1.add(jm0);jmenu1.add(jm1);
        //以下是显示位移的地方
        JLabel jl1=new JLabel("平硐位移");
        jl1.setFont(new Font("宋体", Font.BOLD, 20));
        jf.add(jl1);
        jl1.setBounds(130, 100, 100, 30);

        JLabel jl2=new JLabel("6.1230mm");
        jl2.setFont(new Font("宋体", Font.BOLD, 20));
        jf.add(jl2);
        jl2.setBounds(230, 100, 100, 30);
        //放置图片
        JLabel jl3=new JLabel(new ImageIcon("src/map.png"));
        jf.add(jl3);
        jl3.setBounds(0, 150, 700, 500);
        //3.设置窗体可见
        jf.pack();
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        firtPage();
    }
}