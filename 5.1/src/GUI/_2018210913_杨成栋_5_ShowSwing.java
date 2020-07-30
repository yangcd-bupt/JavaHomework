package GUI;

import javax.swing.*;

/**
 * 一个显示框架，用来减少冗余代码
 */
public class _2018210913_杨成栋_5_ShowSwing {
    /**
     * flag表示是否为主窗口
     */
    public static void run(final JFrame f,final int width,final int height,boolean flag){
        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {
                f.setTitle(f.getClass().getSimpleName());//通过反射获取类名
                if(flag)
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                else
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setSize(width, height);//设置窗口大小
                f.setLocationRelativeTo(null);//窗口居中
                f.setVisible(true);
            }
        }));
    }
}
