
public class SingletonDemo {
	/*
	 * ����ʽ���,������ص�ʱ��ʹ�������
	 */
//	private SingletonDemo(){}
//	private static SingletonDemo singletonDemo = new SingletonDemo();
//	public SingletonDemo getInstance() {
//		return singletonDemo;
//	}
	/*
	 * ����ʽ��̣��ڵ��÷�����ʱ���ٴ�������
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
