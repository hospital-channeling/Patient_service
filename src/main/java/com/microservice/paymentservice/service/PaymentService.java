package com.microservice.paymentservice.service;

import com.microservice.paymentservice.payload.PaymentRequest;
import com.microservice.paymentservice.payload.PaymentResponse;

import java.util.List;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    List<PaymentResponse> getAllPaymentDetails();

    PaymentResponse getPaymentDetailsByAppointmentId(long appointmentId);
}
