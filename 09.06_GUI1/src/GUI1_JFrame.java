import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창 이름");
        JLabel label = new JLabel("아싸 어쩌다 금요일");

        frame.add(label);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // X 버튼 누르면 종료
    }
}