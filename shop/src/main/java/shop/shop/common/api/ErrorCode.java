package shop.shop.common.api;

import org.springframework.http.HttpStatusCode;

public class ErrorCode extends RuntimeException {
    
    Integer code;
    String message;
    HttpStatusCode statusCode;
}
