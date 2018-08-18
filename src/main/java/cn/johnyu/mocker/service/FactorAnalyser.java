package cn.johnyu.mocker.service;

import org.springframework.beans.factory.BeanNameAware;

import cn.johnyu.mocker.collector.Collector;
import cn.johnyu.mocker.collector.NetCollector;

public class FactorAnalyser implements Analyser,BeanNameAware{
	private Collector collector;
	
	public FactorAnalyser() {

	}

	public FactorAnalyser(Collector collector) {
		super();
		this.collector = collector;
	}

	public void setCollector(Collector collector) {
		this.collector = collector;
	}

	@Override
	public void analyse() {
		collector.collect();
		System.out.println("FactoryAnalyser:进行《因素分析》,");
	}

	@Override
	public void setBeanName(String name) {
		//this.name=name;
		System.out.println(name);
		
	}
}
