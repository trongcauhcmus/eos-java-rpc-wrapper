package client.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionTrace {

    private Act act;

    private String console;

    private Long cpuUsage;

    private Long elapsed;

    private List<Object> inlineTraces = null;

    private Receipt receipt;

    private Long totalCpuUsage;

    private String trxId;

    private boolean contextFree;

    private long blockNum;

    private String blockTime;

    private String producerBlockId;

    private Object[] accountRamDeltas;

    private String trxStatus;

    private String createdAt;

    public Act getAct() {
        return act;
    }

    @JsonProperty("act")
    public void setAct(Act act) {
        this.act = act;
    }

    public String getConsole() {
        return console;
    }

    @JsonProperty("console")
    public void setConsole(String console) {
        this.console = console;
    }

    public Long getCpuUsage() {
        return cpuUsage;
    }

    @JsonProperty("cpu_usage")
    public void setCpuUsage(Long cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Long getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(Long elapsed) {
        this.elapsed = elapsed;
    }

    public List<Object> getInlineTraces() {
        return inlineTraces;
    }

    @JsonProperty("inline_traces")
    public void setInlineTraces(List<Object> inlineTraces) {
        this.inlineTraces = inlineTraces;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    @JsonProperty("receipt")
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Long getTotalCpuUsage() {
        return totalCpuUsage;
    }

    @JsonProperty("total_cpu_usage")
    public void setTotalCpuUsage(Long totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
    }

    public String getTrxId() {
        return trxId;
    }

    @JsonProperty("trx_id")
    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public boolean isContextFree() {
        return contextFree;
    }

    @JsonProperty("context_free")
    public void setContextFree(boolean contextFree) {
        this.contextFree = contextFree;
    }

    public long getBlockNum() {
        return blockNum;
    }

    @JsonProperty("block_num")
    public void setBlockNum(long blockNum) {
        this.blockNum = blockNum;
    }

    public String getBlockTime() {
        return blockTime;
    }

    @JsonProperty("block_time")
    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public String getProducerBlockId() {
        return producerBlockId;
    }

    @JsonProperty("producer_block_id")
    public void setProducerBlockId(String producerBlockId) {
        this.producerBlockId = producerBlockId;
    }

    public Object[] getAccountRamDeltas() {
        return accountRamDeltas;
    }

    @JsonProperty("account_ram_deltas")
    public void setAccountRamDeltas(Object[] accountRamDeltas) {
        this.accountRamDeltas = accountRamDeltas;
    }

    public String getTrxStatus() {
        return trxStatus;
    }

    @JsonProperty("trx_status")
    public void setTrxStatus(String trxStatus) {
        this.trxStatus = trxStatus;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
