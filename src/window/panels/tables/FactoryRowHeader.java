package window.panels.tables;


public class FactoryRowHeader extends AbstractRowHeader {

	public FactoryRowHeader(int size) {
		super(size);
	}

	public Object getElementAt(int in) {
//		if(in == 0)
//			return new String("�����������");
//		else if(in == 1)
//			return new String("����������� � ������");
//		else 
//			return null;
		return new String("����������� � ������");
	}
}
