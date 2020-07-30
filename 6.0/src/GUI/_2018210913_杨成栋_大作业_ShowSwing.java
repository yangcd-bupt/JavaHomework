package GUI;

import javax.swing.*;

public class _2018210913_杨成栋_大作业_ShowSwing {
    public static void run(final JFrame f,final int width,final int height){
        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {
                f.setTitle(f.getClass().getSimpleName());
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(width, height);
                f.setLocationRelativeTo(null);//窗口居中
                f.setVisible(true);
            }
        }));
    }
}
