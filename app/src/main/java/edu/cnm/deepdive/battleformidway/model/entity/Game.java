package edu.cnm.deepdive.battleformidway.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
  indices = {
      @Index(value = "turn_number")
  }
)
public class Game {

  @ColumnInfo(name = "game_id")
  @PrimaryKey(autoGenerate = true)
  private long gameId;

  @ColumnInfo(name = "turn_number")
  @NonNull
  private int turnNumber;

  @ColumnInfo(name = "grid_number")
  @NonNull
  private int gridNumber;

  @ColumnInfo(name = "user_name")
  @NonNull
  private String userName;

  private Boolean win;

  public long getGameId() {
    return gameId;
  }

  public void setGameId(long gameId) {
    this.gameId = gameId;
  }

  public int getTurnNumber() {
    return turnNumber;
  }

  public void setTurnNumber(int turnNumber) {
    this.turnNumber = turnNumber;
  }

  public int getGridNumber() {
    return gridNumber;
  }

  public void setGridNumber(int gridNumber) {
    this.gridNumber = gridNumber;
  }

  @NonNull
  public String getUserName() {
    return userName;
  }

  public void setUserName(@NonNull String userName) {
    this.userName = userName;
  }

  public Boolean getWin() {
    return win;
  }

  public void setWin(Boolean win) {
    this.win = win;
  }
}