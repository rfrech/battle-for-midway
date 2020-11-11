package edu.cnm.deepdive.battleformidway.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

@Entity(
    indices = {
        @Index(value = {"game_id"}, unique = true),
        @Index(value = {"strength"}, unique = true),
        @Index(value = {"name"}, unique = true),
        @Index(value = {"type"}, unique = true)
    },
    foreignKeys = {
        @ForeignKey(entity = edu.cnm.deepdive.battleformidway.model.entity.Game.class, parentColumns = {"game_id"}, childColumns = {"game_id"},
            onDelete = ForeignKey.CASCADE),
    }
)
public class Ship {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "ship_id")
  private long shipId;

  private int strength;

  private int position;

  @ColumnInfo(name = "game_id")
  private long gameId;

  @NonNull
  private Name name;

  @NonNull
  private Type type;

  public long getShipId() {
    return shipId;
  }

  public void setShipId(long shipId) {
    this.shipId = shipId;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public long getGameId() {
    return gameId;
  }

  public void setGameId(long gameId) {
    this.gameId = gameId;
  }

  @NonNull
  public Name getName() {
    return name;
  }

  public void setName(@NonNull Name name) {
    this.name = name;
  }

  @NonNull
  public Type getType() {
    return type;
  }

  public void setType(@NonNull Type type) {
    this.type = type;
  }

  public enum Name {
    YAMATO, KIRISHIMA, AKAGI, HIRYU, KAGA, SORYU, MOGAMI, MIKUMA, ZUIHO, HOSHO;

    @TypeConverter
    public static Integer nameToInteger(Name value) {
      return (value != null) ? value.ordinal() : null;
    }

    @TypeConverter
    public static Name integerToName(Integer value) {
      return (value !=null) ? Name.values()[value] : null;
    }
  };

  public enum Type {
    BATTLESHIP, AIRCRAFT_CARRIER, CRUISER, LIGHT_FLEET_CARRIER;

    @TypeConverter
    public static Integer typeToInteger(Type value) {
      return (value != null) ? value.ordinal() : null;
    }

    @TypeConverter
    public static Type integerToType(Integer value) {
      return (value !=null) ? Type.values()[value] : null;
    }
  }
}
