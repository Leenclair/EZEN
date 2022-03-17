package day25;

import java.awt.*;
import java.awt.event.*;

public class EventTest2 extends Frame{
	private Button bt;
	
	public EventTest2() {
		bt=new Button("´Ý±â");
		this.add(bt, "South");
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		EventTest2 f = new EventTest2();
		f.setSize(300,200);
		f.setVisible(true);
	}
}