package org.littlebuddy.onefs;

import org.littlebuddy.onefs.base.OnefsRequest;
import org.littlebuddy.onefs.base.OnefsResponse;

public final class DefaultOnefsClient implements OnefsClient {

	protected String endpoint;

	/*
	 * Why is char[] preferred over String
	 * http://stackoverflow.com/questions/8881291/why-is-char-preferred-over-string-for-passwords
	 */
	protected char[] username;

	protected char[] password;

	public DefaultOnefsClient(String endpoint, char[] username, char[] password) {
		this.endpoint = endpoint;
		System.arraycopy(username, 0, this.username, 0, username.length);
		System.arraycopy(password, 0, this.password, 0, username.length);
	}

	public OnefsResponse execute(OnefsRequest request) {
		//TODO: Implementation of execute
		return new OnefsResponse() {
		};
	}
}