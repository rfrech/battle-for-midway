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
  @ColumnInfo(index = true)
  private String name;

  @NonNull
  private int strength;

  @NonNull
  @ColumnInfo(name = "ship_id")
  private Long shipId;


}
