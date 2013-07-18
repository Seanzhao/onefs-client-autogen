package org.littlebuddy.onefs.base;

public interface OnefsRequest {

   /**
    * get HttpMethod of the request
    *
    * @return HttpMethod of the request
    */
   public HttpMethod getMethod();

   /**
    * get url of the request
    * 
    * @return request url
    */
   public String getUrl();

   /**
    * Get request body
    * 
    * @return request body
    */
   public OnefsRequestBody getRequestBody();
   
   /**
    * Get the expected response type
    * 
    * @return class type of expected response
    */
   public Class<? extends OnefsResponseBody> getResponseType();
}
