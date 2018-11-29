package client.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Receipt {

    private Long abiSequence;

    private String actDigest;

    private List<List<String>> authSequence = null;

    private Long codeSequence;

    private Long globalSequence;

    private String receiver;

    private Long recvSequence;

    public Long getAbiSequence() {
        return abiSequence;
    }

    @JsonProperty("abi_sequence")
    public void setAbiSequence(Long abiSequence) {
        this.abiSequence = abiSequence;
    }

    public String getActDigest() {
        return actDigest;
    }

    @JsonProperty("act_digest")
    public void setActDigest(String actDigest) {
        this.actDigest = actDigest;
    }

    public List<List<String>> getAuthSequence() {
        return authSequence;
    }

    @JsonProperty("auth_sequence")
    public void setAuthSequence(List<List<String>> authSequence) {
        this.authSequence = authSequence;
    }

    public Long getCodeSequence() {
        return codeSequence;
    }

    @JsonProperty("code_sequence")
    public void setCodeSequence(Long codeSequence) {
        this.codeSequence = codeSequence;
    }

    public Long getGlobalSequence() {
        return globalSequence;
    }

    @JsonProperty("global_sequence")
    public void setGlobalSequence(Long globalSequence) {
        this.globalSequence = globalSequence;
    }

    public String getReceiver() {
        return receiver;
    }

    @JsonProperty("receiver")
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Long getRecvSequence() {
        return recvSequence;
    }

    @JsonProperty("recv_sequence")
    public void setRecvSequence(Long recvSequence) {
        this.recvSequence = recvSequence;
    }

}
