package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor
public class Transaction {

    private Date initiatedAt;
    private Date completedAt;
    private String from;
    private String to;
    private Double amount;
}
