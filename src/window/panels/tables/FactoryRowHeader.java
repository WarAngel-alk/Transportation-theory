package window.panels.tables;

/**
 * List model for horizontal header for tables. Exactly repeats 
 * AbstractRowHeader, but set caption as <����������� � ������>
 */
public class FactoryRowHeader extends AbstractRowHeader {

	public FactoryRowHeader(int size) {
		super(size);
	}

	public Object getElementAt(int in) {
		return new String("����������� � ������");
	}
}
