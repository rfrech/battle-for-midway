package edu.cnm.deepdive.battleformidway.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import edu.cnm.deepdive.battleformidway.model.entity.Ship;

@Entity(
    indices = {
        @Index(value = {"ship_id"}, unique = true),
        @Index(value = {"name"}, unique = true)
    },
    foreignKeys = {
        @ForeignKey(entity = Ship.class, parentColumns = {"ship_id"}, childColumns = {"ship_id"}),
    }
)
public class Fighter {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "fighter_id")
  private long fighterId;

  @NonNull
  private String name;

  @NonNull
  private int strength;

  @NonNull
  @ColumnInfo(name = "ship_id")
  private Long shipId;

  public long getFighterId() {
    return fighterId;
  }

  public void setFighterId(long fighterId) {
    this.fighterId = fighterId;
  }

  @NonNull
  public String getName() {
    return name;
  }

  public void setName(@NonNull String name) {
    this.name = name;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  @NonNull
  public Long getShipId() {
    return shipId;
  }

  public void setShipId(@NonNull Long shipId) {
    this.shipId = shipId;
  }
}
