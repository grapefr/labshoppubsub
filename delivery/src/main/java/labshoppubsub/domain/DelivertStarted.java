package labshoppubsub.domain;

import java.time.LocalDate;
import java.util.*;
import labshoppubsub.domain.*;
import labshoppubsub.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DelivertStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private String status;

    public DelivertStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DelivertStarted() {
        super();
    }
}
//>>> DDD / Domain Event
