package io.dapnec.sequencegenerator.service;

import io.dapnec.sequencegenerator.domain.LocalSequence;

import java.util.List;

public interface LocalSequenceService {

    public void add(LocalSequence seq);
    public List<LocalSequence> findAllLocalSequenceNumbers();
}
