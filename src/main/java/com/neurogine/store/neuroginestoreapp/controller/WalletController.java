package com.neurogine.store.neuroginestoreapp.controller;

import com.neurogine.store.neuroginestoreapp.services.ExternalApiCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    ExternalApiCall externalApiCall;

    @GetMapping("/topup")
    public String topUpWallet() {
        externalApiCall.httpOutboundFlow();
        return "Message sent to the  API";
    }
}
