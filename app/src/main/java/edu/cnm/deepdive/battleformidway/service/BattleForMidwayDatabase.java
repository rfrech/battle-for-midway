package edu.cnm.deepdive.battleformidway.service;

import android.app.Application;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import edu.cnm.deepdive.battleformidway.model.dao.FighterDao;
import edu.cnm.deepdive.battleformidway.model.dao.GameDao;
import edu.cnm.deepdive.battleformidway.model.dao.ShipDao;
import edu.cnm.deepdive.battleformidway.model.entity.Fighter;
import edu.cnm.deepdive.battleformidway.model.entity.Game;
import edu.cnm.deepdive.battleformidway.model.entity.Ship;
import java.nio.ByteBuffer;
import java.util.UUID;

@Database(entities = {Game.class, Fighter.class, Ship.class}, version = 1, exportSchema = true)
@TypeConverters(value = {Ship.Name.class, Ship.Type.class})
public abstract class BattleForMidwayDatabase extends RoomDatabase {

  private static final String DB_NAME = "battle_for_midway_db";

  private static Application context;

  public static void setContext(Application context) {
    BattleForMidwayDatabase.context = context;
  }

  public static BattleForMidwayDatabase getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public abstract GameDao getGameDao();

  public abstract FighterDao getFighterDao();

  public abstract ShipDao getShipDao();

  private static class InstanceHolder {
    private static final BattleForMidwayDatabase INSTANCE =
        Room.databaseBuilder(context, BattleForMidwayDatabase.class, DB_NAME)
        .build();
  }

}
