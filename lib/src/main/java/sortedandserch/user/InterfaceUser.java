package sortedandserch.user;

public interface InterfaceUser {
	
	public <U extends Number> void sorted(U[] array);
	public <T extends Number> int serchElement(T t);
	
	public void printArray();
	
}
