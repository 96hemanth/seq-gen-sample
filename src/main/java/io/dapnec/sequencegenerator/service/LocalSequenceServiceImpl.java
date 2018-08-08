package io.dapnec.sequencegenerator.service;

import io.dapnec.sequencegenerator.domain.LocalSequence;
import io.dapnec.sequencegenerator.repository.LocalSequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LocalSequenceServiceImpl implements LocalSequenceService{

    @Autowired
    private LocalSequenceRepository repo;

    public List<LocalSequence> findAllLocalSequenceNumbers(){


         List<LocalSequence> list = new ArrayList();
         repo.findAll().forEach(list::add);

         return list;
    }


    public void add(LocalSequence seq){
        repo.save(seq);
    }
}
