package com.intel.tpe.deployment.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@Service
@Slf4j
public class DeploymentService {
    public String runDeployment(Map<String, Object> deploymentRequest) {
        log.info("Request to deploy ledger{}", deploymentRequest);
        deploymentRequest.put("deploymentId", UUID.randomUUID());
        return "Deployment Started for " + deploymentRequest.get("deploymentId");
    }
}
