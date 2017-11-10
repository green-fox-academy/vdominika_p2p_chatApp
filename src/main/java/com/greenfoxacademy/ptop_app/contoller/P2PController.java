package com.greenfoxacademy.ptop_app.contoller;

//import com.greenfoxacademy.ptop_app.model.Log;
//import com.greenfoxacademy.ptop_app.repository.PeerToPeerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class P2PController {
//
//    @Autowired
//    PeerToPeerRepo logrepo;
//
//    @PostMapping({"/savemessage"})
//    public Log postMessage (@RequestParam("message") String message){
//        Log firstMessage = new Log(message);
//        logrepo.save(firstMessage);
//        return firstMessage;
//    }

    @GetMapping({"/"})
    public String title (){
        return "Peer to peer chat program";
    }
}

