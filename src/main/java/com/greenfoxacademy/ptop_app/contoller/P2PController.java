package com.greenfoxacademy.ptop_app.contoller;

import com.greenfoxacademy.ptop_app.model.PeerToPeerModel;
import com.greenfoxacademy.ptop_app.repository.PeerToPeerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class P2PController {

    @Autowired
    PeerToPeerRepo logrepo;

    @PostMapping({"/savemessage"})
    public PeerToPeerModel postMessage (@RequestParam("message")String message){
        PeerToPeerModel firstMessage = new PeerToPeerModel(message);
        logrepo.save(firstMessage);
        return firstMessage;
    }
}

