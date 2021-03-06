package window.panels;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JButton;

import start.Const;
import window.HelpFrame;
import window.MainFrame;

import java.awt.Font;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.DebugGraphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * ������ � ����� JTextField'��� ��� ����� ���������� �������������� �
 * ������������. ������ ���������� ��� ������� ���������. ����� checkData()
 * ��������� ������������ �������� ������.
 */

public class SettingsPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField factoryTextField;
	private JTextField mineTextField;

	public SettingsPanel() {
		setBackground(new Color(176, 224, 230));

		JPanel mineInputPanel = new JPanel();
		mineInputPanel.setOpaque(false);
		JPanel factoryInputPanel = new JPanel();
		factoryInputPanel.setOpaque(false);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		add(mineInputPanel);
		mineInputPanel.setLayout(new BorderLayout(0, 0));

		// "���������� ��������������"
		JLabel mineLabel = new JLabel(
				" \u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u0440\u043E\u0438\u0437\u0432\u043E\u0434\u0438\u0442\u0435\u043B\u0435\u0439:");
		mineLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		mineInputPanel.add(mineLabel);

		mineTextField = new JTextField();
		mineTextField.setBackground(new Color(204, 255, 204));
		mineTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		mineTextField
				.setToolTipText("<html><font size=\"4\">\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u0440\u043E\u0438\u0437\u0432\u043E\u0434\u0438\u0442\u0435\u043B\u0435\u0439</font></html");
		mineTextField.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		mineTextField.setColumns(5);
		mineInputPanel.add(mineTextField, BorderLayout.EAST);

		add(factoryInputPanel);
		factoryInputPanel.setLayout(new BorderLayout(0, 0));

		// "���������� ������������"
		JLabel factoryLabel = new JLabel(
				" \u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043B\u0435\u0439:");
		factoryLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		factoryInputPanel.add(factoryLabel, BorderLayout.WEST);

		factoryTextField = new JTextField();
		factoryTextField.setBackground(new Color(204, 255, 204));
		factoryTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		factoryTextField
				.setToolTipText("<html><font size=\"4\">\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043F\u043E\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043B\u0435\u0439</font></html>");
		factoryTextField.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		factoryInputPanel.add(factoryTextField, BorderLayout.EAST);
		factoryTextField.setColumns(5);

		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalGlue_1.setSize(new Dimension(0, 50));
		verticalGlue_1.setPreferredSize(new Dimension(0, 150));
		verticalGlue_1.setMinimumSize(new Dimension(0, 50));
		add(verticalGlue_1);

		JPanel okPanel = new JPanel();
		okPanel.setOpaque(false);
		add(okPanel);
		okPanel.setLayout(new BoxLayout(okPanel, BoxLayout.X_AXIS));

		ImageIcon buttonIcon = new ImageIcon("help.png");

		Component horizontalStrut = Box.createHorizontalStrut(50);
		okPanel.add(horizontalStrut);

		Component horizontalGlue = Box.createHorizontalGlue();
		okPanel.add(horizontalGlue);

		JButton okButton = new JButton("Ok");
		okButton.setMnemonic(KeyEvent.VK_ENTER);
		okButton.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		okButton.setForeground(new Color(250, 250, 210));
		okButton.setBackground(new Color(102, 205, 170));
		okButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		okButton.setToolTipText("<html><font size=\"4\">\u041F\u043E\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u044C \u0432\u0432\u043E\u0434</font></html>");
		okPanel.add(okButton);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		okPanel.add(horizontalGlue_1);
		JButton helpButton = new JButton("");
		helpButton.setMnemonic(KeyEvent.VK_H);
		helpButton.setIconTextGap(0);
		helpButton.setForeground(new Color(250, 250, 210));
		helpButton.setBackground(new Color(102, 205, 170));
		helpButton
				.setToolTipText("<html><font size=\"4\">\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u0441\u043F\u0440\u0430\u0432\u043A\u0443 \u043F\u043E \u0442\u0440\u0430\u043D\u0441\u043F\u043E\u0440\u0442\u043D\u043E\u0439 \u0437\u0430\u0434\u0430\u0447\u0435</font></html>");
		helpButton.setIcon(buttonIcon);
		helpButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		okPanel.add(helpButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				MainFrame.getInstance().createTablesPanel();
			}
		});
		helpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HelpFrame();
			}
		});
	}

	/**
	 * ��������� ������ � ����� ����� � ���������� ��� ������. 0 - ������
	 * �������, � ��������� ������� - ��� ��������������� ������ �� Const.
	 * 
	 * @return ��� ������
	 */
	public int checkData() {
		if (mineTextField.getText().equals("")
				|| factoryTextField.getText().equals(""))
			return Const.NOT_ENOGHT_DATA;
		int mines;
		int factories;
		try {
			mines = Integer.parseInt(mineTextField.getText());
			factories = Integer.parseInt(factoryTextField.getText());
		} catch (NumberFormatException e) {
			return Const.INCORRECT_DATA;
		}
		if (mines < 0 || factories < 0)
			return Const.INCORRECT_DATA;
		else if (mines == 0 || factories == 0)
			return Const.NOT_ENOGHT_DATA;
		else if (mines == 1 || factories == 1)
			return Const.INCORRECT_SETTINGS;
		else
			return Const.NO_ERRORS;
	}

	public int getMineNumber() {
		try {
			int mines = Integer.parseInt(mineTextField.getText());
			return mines;
		} catch (Exception e) {
			return 0;
		}
	}

	public int getFactoriesNumber() {
		try {
			int factories = Integer.parseInt(factoryTextField.getText());
			return factories;
		} catch (Exception e) {
			return 0;
		}
	}
}
