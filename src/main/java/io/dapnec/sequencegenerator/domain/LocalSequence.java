package io.dapnec.sequencegenerator.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("localsequence")
public class LocalSequence implements Serializable {


    @Id
    private String aggrigateId;
    private long sequence;

    public LocalSequence() {
    }

    public LocalSequence(String aggrigateId, long sequence) {
        this.aggrigateId = aggrigateId;
        this.sequence = sequence;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }id

    public String getAggrigateId() {
        return aggrigateId;
    }

    public void setAggrigateId(String aggrigateId) {
        this.aggrigateId = aggrigateId;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return String.format("LocalSequence{aggrigateId='%s', sequence=%d}", aggrigateId, sequence);
    }
}
