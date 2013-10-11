package window.panels.tables;

/**
 * ListModel ��� �������������� ���������� ������. � �������� ���������
 * AbstractRowHeader, ����� ��� ���������: <����������� � ������>
 */

public class FactoryRowHeader extends AbstractRowHeader {
	private static final long serialVersionUID = 1L;

	public FactoryRowHeader(int size) {
		super(size);
	}

	public String getElementAt(int in) {
		return new String("����������� � ������");
	}
}
