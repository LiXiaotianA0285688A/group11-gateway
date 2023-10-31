package com.example.gatewaywithmysql.dao;

import com.example.gatewaywithmysql.entity.GatewayRout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GatewayRouteRepository extends JpaRepository<GatewayRout, Long> {
    List<GatewayRout> findGatewayRoutsByIsDelete(Integer isDelete);
    GatewayRout findByRouteIdAndIsDelete(String routeId, Integer isDelete);
    GatewayRout findByRouteId(String routeId);
}
