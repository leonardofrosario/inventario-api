package br.com.codgestao.api.dto;

public class LoginResponse {
    private String status;
    private String message;
    private String username;

    public LoginResponse(String status, String message, String username) {
        this.status = status;
        this.message = message;
        this.username = username;
    }

    public String getStatus() { return status; }
    public String getMessage() { return message; }
    public String getUsername() { return username; }
}
