package com.coinz.api;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class ObjectTest {

    @JsonProperty
    private String applicationname;

    public ObjectTest(){

    }

    public String getX(){

        return applicationname;
    }

    public void setX(Integer xcoordinate){
        this.applicationname = applicationname;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "appname=" + applicationname +
                '}';
    }


}
