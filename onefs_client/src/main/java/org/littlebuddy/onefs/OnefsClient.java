package org.littlebuddy.onefs;

import org.littlebuddy.onefs.base.OnefsRequest;
import org.littlebuddy.onefs.base.OnefsResponse;


public interface OnefsClient {

   /**
    * onefs client handles the http connection, session and authentication.
  	* e.g. the parameters include endpoint, username, password. This part
  	* is supposed to be very stable across different build.
    *
    * @param the encapsulation of http request
    * @return the encapsulation of http response
    */
    OnefsResponse execute(OnefsRequest request);
}
