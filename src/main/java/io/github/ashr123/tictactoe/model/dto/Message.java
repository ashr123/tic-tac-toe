package io.github.ashr123.tictactoe.model.dto;

public interface Message {
    String type();
    String gameId();
    String content();
}
