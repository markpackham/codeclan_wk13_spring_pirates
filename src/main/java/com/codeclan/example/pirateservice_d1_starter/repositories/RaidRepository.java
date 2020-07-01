package com.codeclan.example.pirateservice_d1_starter.repositories;

import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {
           List<Raid> findRaidsByLocation(String location);
           List<Raid> countRaidsByLocation(String location);
           List<Raid> findRaidsByPiratesShipId(Long id);
           List<Raid> findByPiratesShip(Ship ship);
}
