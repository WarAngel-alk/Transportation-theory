package window.panels.tables;

/**
 * List model for horizontal header for tables. Exactly repeats
 * AbstractRowHeader, but set caption as <������������� i>, where i is row
 * serial number.
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
