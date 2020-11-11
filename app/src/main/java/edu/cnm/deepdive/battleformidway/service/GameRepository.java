package edu.cnm.deepdive.battleformidway.service;

import android.content.Context;
import androidx.lifecycle.LiveData;
import edu.cnm.deepdive.battleformidway.model.dao.GameDao;
import edu.cnm.deepdive.battleformidway.model.entity.Game;
import io.reactivex.Completable;
import java.util.List;

public class GameRepository {

  private final Context context;
  private final GameDao gameDao;

  public GameRepository(Context context) {
    this.context = context;
    BattleForMidwayDatabase database = BattleForMidwayDatabase.getInstance();
    gameDao = database.getGameDao();
  }

  public Completable save(Game game) {
    return (game.getGameId() == 0)
        ? gameDao.insert(game)
        .doAfterSuccess(game::setGameId)
        .ignoreElement()
        : gameDao.update(game)
            .ignoreElement();
  }

  public Completable delete(Game game) {
    return (game.getGameId() == 0)
        ? Completable.complete()
        : gameDao.delete(game)
            .ignoreElement();
  }

  public LiveData<Game> get(long gameId) {
    return gameDao.select(gameId);
  }

}

