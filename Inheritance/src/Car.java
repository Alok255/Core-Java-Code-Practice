
class Car extends Machine{

		
	public void start() {
		// TODO Auto-generated method stub
			System.out.println("Hello Car Start! Override");
	}
	/*
	public void carname() {
		System.out.println("The car name :" + name);//can't acces variable name because its private
	}
	*/
	public void carname() {
		System.out.println("The car name :" + name1);//can't acces variable name because its private
	}
}
