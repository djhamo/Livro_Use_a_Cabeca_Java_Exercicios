import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea1 {
	JTextArea text;
	
	public static void main(String[] args) {
		TextArea1 gui = new TextArea1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JButton button = new JButton("Just Click It");
		MyAction action = new MyAction();
		
		button.addActionListener(action);
		text = new JTextArea(10,20);
		text.setLineWrap(true);
		
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(350, 300);
		frame.setVisible(true);
		
	}
	
	class MyAction implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			text.append("Click no Bot�o \n");
		}
	}
}