package br.com.nfse.api.exceptionhandler;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageExceptionHandler {
    private Date timestamp;
    private Integer status;
    private String message;

    public MessageExceptionHandler(Date timestamp, Integer status, String message) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
    }
}
