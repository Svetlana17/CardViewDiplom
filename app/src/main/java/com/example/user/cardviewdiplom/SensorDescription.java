package com.example.user.cardviewdiplom;

public class SensorDescription {
    String name;
    String type;
    String vendor;
    String version;
    String max;
    String resolution;


    public SensorDescription(String name, String type, String vendor, String version, String max, String resolution) {
        this.name = name;
        this.type = type;
        this.vendor = vendor;
        this.version = version;
        this.max = max;
        this.resolution = resolution;
    }

    public SensorDescription(String магнитометр, int ic_assessment_black_18dp) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }


}
