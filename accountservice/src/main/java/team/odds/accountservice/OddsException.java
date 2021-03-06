package team.odds.accountservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OddsException extends RuntimeException {
    private String code;
    private String message;
}
