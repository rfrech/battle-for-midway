package edu.cnm.deepdive.battleformidway.service;

import android.content.Context;
import androidx.lifecycle.LiveData;
import edu.cnm.deepdive.battleformidway.model.dao.GameDao;
import edu.cnm.deepdive.battleformidway.model.dao.ShipDao;
import edu.cnm.deepdive.battleformidway.model.entity.Game;
import edu.cnm.deepdive.battleformidway.model.entity.Ship;
import io.reactivex.Completable;
import java.util.List;

public class ShipRepository {

  private final Context context;
  private final ShipDao shipDao;

  public ShipRepository(Context context) {
    this.context = context;
    BattleForMidwayDatabase database = BattleForMidwayDatabase.getInstance();
    shipDao = database.getShipDao();
  }

  public Completable save(Ship ship) {
    return (ship.getShipId() == 0)
        ? shipDao.insert(ship)
        .doAfterSuccess(ship::setShipId)
        .ignoreElement()
        : shipDao.update(ship)
            .ignoreElement();
  }

  public Completable delete(Ship ship) {
    return (ship.getShipId() == 0)
        ? Completable.complete()
        : shipDao.delete(ship)
            .ignoreElement();
  }

  public LiveData<Ship> get(long shipId) {
    return shipDao.select(shipId);
  }

}