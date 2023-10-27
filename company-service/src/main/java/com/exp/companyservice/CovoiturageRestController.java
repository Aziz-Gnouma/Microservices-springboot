package com.exp.companyservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class CovoiturageRestController {

    @Value("${xParam}")
    private int xParam;
    @Value("${yParam}")
    private int yParam;
    @Value("${me}")
    private String me;
    @GetMapping("/myConfig")
    public Map<String, Object> myConfig(){
        Map<String, Object> params=new HashMap<>();
        params.put("xParam", xParam);
        params.put("yParam", yParam);
        params.put("me", me);
        params.put("threadName", Thread.currentThread().getName());
        return params;
    }
    @Autowired
    private CovoiturageRepository CovoiturageRepository;

    @GetMapping("/com")
    public Long getAllcom() {
        Long x = CovoiturageRepository.count();
        return x;
    }
    @GetMapping("/covoiturages")
    public List<Covoiturage> getAllcovs() {
        return CovoiturageRepository.findAll();

    }
    @PostMapping("/Covoiturage")
    public Covoiturage create(@RequestBody Covoiturage Covoiturage) {
        return CovoiturageRepository.save(Covoiturage);
    }





}