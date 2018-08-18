package cn.johnyu.mocker.collector;

public class CollectorFactory {
	private static Collector collector;
	public static Collector getInstance() {
		if(collector==null) {
			collector=new NetCollector();
		}
		return collector;
	}
	
	public  Collector getInstance1() {
		return  new NetCollector();
	}
}
