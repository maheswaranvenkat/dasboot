package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gdcuser on 7/3/17.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
