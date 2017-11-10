package com.greenfoxacademy.ptop_app.repository;

import com.greenfoxacademy.ptop_app.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface PeerToPeerRepo extends CrudRepository <Log, Long> {
}
