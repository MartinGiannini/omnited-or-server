package coop.bancocredicoop.omnited.service.rabbit;

public interface MessageHandler {
    void handle(String jsonPayload) throws Exception;
}