package io.dapnec.sequencegenerator.entity;

public class LocalSequenceDTO {
    public String getAggregateId() {
        return aggregateId;
    }

    public void setAggregateId(String aggregateId) {
        this.aggregateId = aggregateId;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    private String aggregateId;
    private long sequence;
}
