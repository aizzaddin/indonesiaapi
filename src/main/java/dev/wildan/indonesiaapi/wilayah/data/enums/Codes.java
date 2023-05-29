package dev.wildan.indonesiaapi.wilayah.data.enums;

public enum Codes {
    SUCCESS("Success"),
    FAILED("Failed"),
    ERROR("System Error");

    private String value;
    public String getCodes() {return value;}

    Codes(String value) {
        this.value = value;
    }
}
