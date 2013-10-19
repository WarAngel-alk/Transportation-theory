package window;

import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

/**
 * �����, ���������� ������� �� ������������ ������
 * 
 */
public class HelpFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public HelpFrame() {
		getContentPane().setBackground(new Color(176, 224, 230));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Yandex\\Programing\\Java\\Projects\\Transport\\help.png"));
		
		JLabel label = new JLabel(helpMessage);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		getContentPane().add(label, BorderLayout.CENTER);
		
		JButton btnOk = new JButton("\u042F\u0441\u043D\u043E");
		btnOk.setFocusable(false);
		btnOk.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnOk.setForeground(new Color(102, 205, 170));
		btnOk.setOpaque(false);
		getContentPane().add(btnOk, BorderLayout.SOUTH);

		this.setBounds(100, 100, label.getPreferredSize().width, (int) ((label.getPreferredSize().height + btnOk.getPreferredSize().height) * 1.2));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	
	private String helpMessage = "<html><b>������������ ������</b> ��� �������������� �������� ��������� ����������������. <br>� ���������� ������������ �������� ���: <br><br><i>���� <b>n</b> �����������, ������ �� ������� ����� ��������� ���������� <br>����������� ������ � <b>m</b> ������������, ������� ����� ��������� ���� �����.<br>���������� ����� ����������� ������ ������������� ����� ���� ������������<br>� ������������ ��������� �� ���������.<br></i><br>�������� �������:<ul><li><b>������� ���������</b> - ��������� �������, ������� ���������� ���������<br>��������� ������� ������ �� ���������� ������������� � ���������� �����������.<li><b>������� ���������</b> - �������, � ������� ������� ������� ����������<br>������, ������� ���������� ��������� �� ������������� � �����������.</ul>��������� ����� ����������� ������ ���� ����� ���������� ������, ����� ������<br>���������� ������������������ � �� ��������(��� ������������ ��������������).<br></html>";
}
