package com.cop.mobi.common;

/**
 * 
 * @author chris.liu
 * 
 */
public class MobiClient {
	private String client;
	private String version;
	private Mobi mobi;

	public MobiClient(String client, String version, Mobi mobi) {
		this.client = client;
		this.version = version;
		this.mobi = mobi;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Mobi getMobi() {
		return mobi;
	}

	public void setMobi(Mobi mobi) {
		this.mobi = mobi;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s", client, version, mobi);
	}
}
