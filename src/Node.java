
import java.util.ArrayList;

public class Node {
	protected boolean isLeafNode;
	protected ArrayList<Integer> keys;

	public boolean isOverflowed() {
		return keys.size() > 3;
	}

	public boolean isUnderflowed() {
		return keys.size() < 4;
	}

}
