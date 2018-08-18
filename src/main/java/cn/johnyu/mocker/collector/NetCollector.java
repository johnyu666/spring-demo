package cn.johnyu.mocker.collector;

public class NetCollector implements Collector{
	public NetCollector() {
		System.out.println("net collector construct...");
	}
	@Override
	public void collect() {
		System.out.println("NetCollector：从《网络》抓取数据,");
		
	}
	
}
