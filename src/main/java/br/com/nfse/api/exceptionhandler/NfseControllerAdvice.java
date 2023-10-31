package br.com.nfse.api.exceptionHandler;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "br.com.nfse.api.controller")
public class NfseControllerAdvice {
    
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MessageExceptionHandler> argumentsNotValid(MethodArgumentNotValidException notValid) {
        BindingResult result = notValid.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();

        StringBuilder sb = new StringBuilder("Os seguintes campos estão inválidos ou não preenchidos: ");
        for (FieldError fieldError : fieldErrors) {
            sb.append(" | ");
            sb.append(fieldError.getField());
            sb.append(" Valor: ");
            sb.append(fieldError.getRejectedValue());
            sb.append(" | ");
        }

        MessageExceptionHandler error = new MessageExceptionHandler(new Date(), HttpStatus.BAD_REQUEST.value(), sb.toString());
        return new ResponseEntity<MessageExceptionHandler>(error, HttpStatus.BAD_REQUEST);
    }
}
