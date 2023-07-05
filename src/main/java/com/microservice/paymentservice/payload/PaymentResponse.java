package com.microservice.paymentservice.payload;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.microservice.paymentservice.Utils.paymentMode;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentResponse {
    private long paymentId;
    private String status;
    private paymentMode paymentMode;
    private long amount;
    private Instant paymentDate;
    private long appointmentId;
}
