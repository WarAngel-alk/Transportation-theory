package window.panels.tables;

/**
 * ListModel ��� �������������� ���������� ������. � �������� ���������
 * AbstractRowHeader, ����� ��� ����������: <������������� i>, ��� i -
 * ���������� ����� ���������.
 */

public class CostRowHeader extends AbstractRowHeader {
	private static final long serialVersionUID = 1L;

	public CostRowHeader(int size) {
		super(size);
	}

	public String getElementAt(int in) {
		return new String("������������� " + (in + 1));
	}
}
