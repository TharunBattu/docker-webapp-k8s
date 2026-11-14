package com.visualpathit.account.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Components {
	
	@Value("${memcached.active.host}")
    private String activeHost;
	@Value("${memcached.active.port}")
    private String activePort;
	@Value("${memcached.standBy.host}")
    private String standByHost;
	@Value("${memcached.standBy.port}")
    private String standByPort;
	
	
	@Value("${elasticsearch.host}")
    private String elasticsearchHost;
	@Value("${elasticsearch.port}")
    private String elasticsearchPort;
	@Value("${elasticsearch.cluster}")
    private String elasticsearchCluster;
	@Value("${elasticsearch.node}")
    private String elasticsearchNode;
	
	
	public String getActiveHost() {
		return activeHost;
	}
	public String getActivePort() {
		return activePort;
	}
	public String getStandByHost() {
		return standByHost;
	}
	public String getStandByPort() {
		return standByPort;
	}
	public void setActiveHost(String activeHost) {
		this.activeHost = activeHost;
	}
	public void setActivePort(String activePort) {
		this.activePort = activePort;
	}
	public void setStandByHost(String standByHost) {
		this.standByHost = standByHost;
	}
	public void setStandByPort(String standByPort) {
		this.standByPort = standByPort;
	}
	
	public String getElasticsearchHost() {
		return elasticsearchHost;
	}
	public void setElasticsearchHost(String elasticsearchHost) {
		this.elasticsearchHost = elasticsearchHost;
	}
	public String getElasticsearchPort() {
		return elasticsearchPort;
	}
	public void setElasticsearchPort(String elasticsearchPort) {
		this.elasticsearchPort = elasticsearchPort;
	}
	public String getElasticsearchCluster() {
		return elasticsearchCluster;
	}
	public void setElasticsearchCluster(String elasticsearchCluster) {
		this.elasticsearchCluster = elasticsearchCluster;
	}
	public String getElasticsearchNode() {
		return elasticsearchNode;
	}
	public void setElasticsearchNode(String elasticsearchNode) {
		this.elasticsearchNode = elasticsearchNode;
	}
	
	
}
