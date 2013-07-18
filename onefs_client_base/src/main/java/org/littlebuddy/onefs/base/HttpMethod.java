package org.littlebuddy.onefs.base;

import java.util.HashMap;
import java.util.Map;

public class HttpMethod {
   public static final HttpMethod GET = new HttpMethod("Get");
   public static final HttpMethod POST = new HttpMethod("Post");
   public static final HttpMethod PUT = new HttpMethod("Put");
   public static final HttpMethod DELETE = new HttpMethod("Delete");
   
   private static Map<String, HttpMethod> registry = new HashMap<String, HttpMethod>();
   
   private final String method;
   
   private HttpMethod(String method) {
      this.method = method;

      registry.put(method, this);
   }

   public String getMethod() {
      return method;
   }

   public static HttpMethod fromString(String method) {
      HttpMethod httpMethod = registry.get(method);

      if (httpMethod == null) {
         throw new RuntimeException("HttpMethod " + method + " not found");
      }

      return httpMethod;
   }
}
