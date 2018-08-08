package io.dapnec.sequencegenerator.repository;

import io.dapnec.sequencegenerator.domain.LocalSequence;
import org.springframework.data.repository.CrudRepository;

public interface LocalSequenceRepository extends CrudRepository<LocalSequence, String> {

}
