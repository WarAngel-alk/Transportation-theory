package window;

import javax.swing.JFrame;
import java.awt.Toolkit;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import window.panels.HelpPanel;

/**
 * �����, ���������� ������� �� ������������ ������
 */
public class HelpFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private HelpPanel helpPanel;

	public HelpFrame() {
		getContentPane().setBackground(new Color(176, 224, 230));
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"D:\\Yandex\\Programing\\Java\\Projects\\Transport\\help.png"));
		setTitle("������");

		helpPanel = new HelpPanel();
		getContentPane().add(helpPanel, BorderLayout.CENTER);

		helpPanel.getOkButton().addActionListener(this);
		helpPanel.getRabbitButton().addActionListener(this);

		setLocation(100, 100);
		setSize((int) (helpPanel.getSize().width * 1.05),
				(int) (helpPanel.getSize().height * 1.05));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ev) {
		if (((JButton) ev.getSource()).getText().equals("����")) {
			this.dispose();
		} else {
			if (helpPanel.getRabbitStatus()) {
				helpPanel.remove(helpPanel.getRabbitLabel());
				helpPanel.add(helpPanel.getHelpLabel(), BorderLayout.CENTER);
				helpPanel.setRabbitStatus(false);

				// ������ revalidate() ��� Java 1.5
				setSize(getSize().width + 1, getSize().height);
			} else {
				helpPanel.remove(helpPanel.getHelpLabel());
				helpPanel.add(helpPanel.getRabbitLabel(), BorderLayout.CENTER);
				helpPanel.setRabbitStatus(true);

				// ������ revalidate() ��� Java 1.5
				setSize(getSize().width - 1, getSize().height);
			}
			this.repaint();
		}
	}

}
