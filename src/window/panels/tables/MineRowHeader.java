package window.panels.tables;

/**
 * ListModel ��� �������������� ���������� ������. � �������� ���������
 * AbstractRowHeader, ����� ��� ���������: <���������� ������>
 */

public class MineRowHeader extends AbstractRowHeader {
	private static final long serialVersionUID = 1L;

	public MineRowHeader(int size) {
		super(size);
	}

	public String getElementAt(int in) {
		return new String("���������� ������");
	}
}
