package day25;

import java.awt.*;
import java.awt.event.*;

public class EventTest1 extends Frame{
	private Button bt;
	
	public EventTest1() {
		bt=new Button("´Ý±â");
		this.add(bt, "South");
		bt.addActionListener(new EventHandler());
	}
	
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}//inner class
	
	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
		f.setSize(300,200);
		f.setVisible(true);
	}
}