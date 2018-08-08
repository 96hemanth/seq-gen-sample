package io.dapnec.sequencegenerator.controller;

import io.dapnec.sequencegenerator.domain.LocalSequence;
import io.dapnec.sequencegenerator.entity.LocalSequenceDTO;
import io.dapnec.sequencegenerator.service.LocalSequenceService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SequenceController {

    @Autowired
    private LocalSequenceService service;

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public List<LocalSequence> get(@RequestBody LocalSequenceDTO data){
        service.add(new LocalSequence(data.getAggregateId(),data.getSequence()));

        return service.findAllLocalSequenceNumbers();
    }

}
