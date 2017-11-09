package com.greenfoxacademy.ptop_app.repository;

import com.greenfoxacademy.ptop_app.model.PeerToPeerModel;
import org.springframework.data.repository.CrudRepository;

public interface PeerToPeerRepo extends CrudRepository <PeerToPeerModel, Long> {
}
