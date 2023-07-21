package com.intel.tpe.deployment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/deployment")
public class DeploymentController {

    @PostMapping("/deploy")
    public ResponseEntity<?> runDeployment(@RequestBody Map<String, Object> deploymentRequest) {
        log.info("Request to deploy ledger{}", deploymentRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
