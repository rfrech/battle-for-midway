package edu.cnm.deepdive.battleformidway.service;

import android.content.Context;
import edu.cnm.deepdive.battleformidway.model.dao.FighterDao;
import edu.cnm.deepdive.battleformidway.model.entity.Fighter;
import io.reactivex.Completable;

public class FighterRepository {

  private final Context context;
  private final FighterDao fighterDao;

  public FighterRepository(Context context) {
    this.context = context;
    BattleForMidwayDatabase database = BattleForMidwayDatabase.getInstance();
    fighterDao = database.getFighterDao();
  }

  public Completable save(Fighter fighter) {
    return (fighter.getFighterId() == 0)
        ? fighterDao.insert(fighter)
        .doAfterSuccess(fighter::setFighterId)
        .ignoreElement()
        : fighterDao.update(fighter)
            .ignoreElement();
  }

  public Completable delete(Fighter fighter) {
    return (fighter.getFighterId() == 0)
        ? Completable.complete()
        : fighterDao.delete(fighter)
            .ignoreElement();
  }

}