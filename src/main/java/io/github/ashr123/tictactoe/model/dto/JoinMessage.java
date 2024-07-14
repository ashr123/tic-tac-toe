package io.github.ashr123.tictactoe.model.dto;

public record JoinMessage(String type,
                          String gameId,
                          String player,
                          String content) implements Message {
}
