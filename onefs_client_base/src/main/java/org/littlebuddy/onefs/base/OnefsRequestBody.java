package org.littlebuddy.onefs.base;

public interface OnefsRequestBody {

   /**
    * Generate the encoded message body of the specific entity. In Onefs, it should be a
    * json message.
    * 
    * @return a http body message that represents the entity
    */
   public String getBody();
}
