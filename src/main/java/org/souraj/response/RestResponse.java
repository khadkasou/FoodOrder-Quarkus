package org.souraj.response;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

public class RestResponse {

    private boolean success;
    private String code;
    private String message;
    private Object result;

    public RestResponse() {
    }

    public RestResponse(boolean success, String code, String message, Object result) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static Response buildResponse(boolean success, String code, String message, Object result) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", success);
        map.put("code", code);
        map.put("message", message);
        map.put("result", result);

        return Response.ok(map, MediaType.APPLICATION_JSON).build();
    }
}
