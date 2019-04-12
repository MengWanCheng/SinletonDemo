
public class SingletonDemo {
	/*
	 * 饿汉式编程,在类加载的时候就创建对象
	 */
//	private SingletonDemo(){}
//	private static SingletonDemo singletonDemo = new SingletonDemo();
//	public SingletonDemo getInstance() {
//		return singletonDemo;
//	}
	/*
	 * 懒汉式编程，在调用方法的时候再创建对象
	 */
	private static SingletonDemo singletonDemo= null;
	private SingletonDemo() {}
	public SingletonDemo getInstance() {
		if(singletonDemo == null) {
			synchronized(SingletonDemo.class) {
				if(singletonDemo == null) {
					singletonDemo = new SingletonDemo();
				}
			}
		}
		return singletonDemo;
	}
}
