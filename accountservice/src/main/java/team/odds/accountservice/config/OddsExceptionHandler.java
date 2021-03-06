package team.odds.accountservice.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import team.odds.accountservice.OddsException;
import team.odds.accountservice.models.ErrorStatus;

@ControllerAdvice
public class OddsExceptionHandler {
    @ExceptionHandler({OddsException.class})
    public ResponseEntity<ErrorStatus> handleOddsException(final Exception e, final WebRequest request) {
        ErrorStatus errorStatus = new ErrorStatus();
        errorStatus.setCode("999999");
        errorStatus.setMessage(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorStatus);
    }
}
