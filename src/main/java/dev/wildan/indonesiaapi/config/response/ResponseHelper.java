package dev.wildan.indonesiaapi.config.response;

import dev.wildan.indonesiaapi.wilayah.data.enums.Codes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public class ResponseHelper {
    public static ResponseEntity<Object> successWithData(Codes codes, Object data) {
        ResponseBuilder builder = new ResponseBuilder();
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<>(builder.generateResponse(codes.getCodes(), data, httpStatus), httpStatus);
    }

    public static ResponseEntity<Object> successWithoutData(String message) {
        ResponseBuilder builder = new ResponseBuilder();
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<>(builder.generateResponse(message, new ArrayList<>(), httpStatus), httpStatus);
    }
}
