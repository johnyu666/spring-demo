package cn.johnyu.mocker.collector;

public class UsbCollector implements Collector{
	@Override
	public void collect() {
		System.out.println("UsbCollector：从《U盘》抓取数据,");
	}
}
