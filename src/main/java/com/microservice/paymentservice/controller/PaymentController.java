package com.microservice.paymentservice.controller;

import com.microservice.paymentservice.payload.PaymentRequest;
import com.microservice.paymentservice.payload.PaymentResponse;
import com.microservice.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
@Log4j2
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest) {

        log.info("PaymentController | doPayment is called");

        log.info("PaymentController | doPayment | paymentRequest : " + paymentRequest.toString());

        return new ResponseEntity<>(
                paymentService.doPayment(paymentRequest),
                HttpStatus.OK
        );
    }

    @GetMapping("/appointment/{appointmentId}")
    public ResponseEntity<PaymentResponse> getPaymentDetailsByAppoinmentId(@PathVariable long appointmentId) {

        log.info("PaymentController | doPayment is called");

        log.info("PaymentController | doPayment | orderId : " + appointmentId);

        return new ResponseEntity<>(
                paymentService.getPaymentDetailsByAppointmentId(appointmentId),
                HttpStatus.OK
        );
    }

    @GetMapping("/all")
    public ResponseEntity<List<PaymentResponse>> getAllPaymentDetails() {

        log.info("PaymentController | getAllPaymentDetails is called");

        List<PaymentResponse> paymentResponses = paymentService.getAllPaymentDetails();

        return new ResponseEntity<>(paymentResponses, HttpStatus.OK);
    }
}
