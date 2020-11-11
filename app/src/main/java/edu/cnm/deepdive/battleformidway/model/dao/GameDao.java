package edu.cnm.deepdive.battleformidway.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.battleformidway.model.entity.Game;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface GameDao {

  @Insert
  Single<Long> insert(Game game);

  @Insert
  Single<List<Long>> insert(Game... games);

  @Insert
  Single<List<Long>> insert(Collection<Game> games);

  @Update
  Single<Integer> update(Game game);

  @Update
  Single <Integer> update(Game...games);

  @Update
  Single<Integer> update(Collection<Game> games);

  @Delete
  Single<Integer> delete(Game game);

  @Delete
  Single<Integer> delete(Game... games);

  @Delete
  Single<Integer> delete(Collection<Game> games);

  @Query("SELECT * FROM Game WHERE game_id = :gameId")
  LiveData<Game> select (long gameId);

  @Query("SELECT * FROM Game ORDER BY user_name")
  LiveData<Game> selectAll();
/*  @Query("SELECT 'turnNumber' FROM Game")
  LiveData<Game> select (int turnNumber);

  @Query("SELECT 'gridNumber' FROM Game")
  LiveData<Game> selectGrid (int gridNumber);

  @Query("SELECT 'userName' FROM Game")
  LiveData<Game> select (String userName);*/

//  @Query("SELECT win FROM Game")
//  LiveData<Game> select(boolean win);
}
