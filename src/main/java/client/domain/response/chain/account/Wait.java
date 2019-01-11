package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wait {

    private Long waitSec;

    private Long weight;

    public Long getWaitSec() {
        return waitSec;
    }

    @JsonProperty("weight_sec")
    public void setWaitSec(Long waitSec) {
        this.waitSec = waitSec;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
