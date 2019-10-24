package orz.doublexi.list;

public class ArrayList  implements Collection{ 
	private Object[] objects=new Object[10];
	private int index=-1;
	public void add(Object o) {
		if(index==objects.length) {
			Object[] newObjects=new Object[objects.length*2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
		}
		index++;
		objects[index]=o;
	}
	public int size() {
		return index+1;
	}
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	
	
	private class ArrayListIterator implements Iterator{
private int currentIndex=-1;
		@Override
		public Object next() {
currentIndex++;
return objects[currentIndex];
		}

		@Override
		public boolean hasNext() {
			if(currentIndex+1>index) {
				return false;
			}
			return true;
		}
		
	}
}
