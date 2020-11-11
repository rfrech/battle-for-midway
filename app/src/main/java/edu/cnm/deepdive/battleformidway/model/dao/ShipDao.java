package edu.cnm.deepdive.battleformidway.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.battleformidway.model.entity.Game;
import edu.cnm.deepdive.battleformidway.model.entity.Ship;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface ShipDao {

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<Long> insert(Ship ship);

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<List<Long>> insert(Ship...ships);

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<List<Long>> insert(Collection<Ship> ships);

  @Update
  Single<Integer> update(Ship ship);

  @Update
  Single <Integer> update(Ship...ships);

  @Update
  Single<Integer> update(Collection<Ship> ships);

  @Delete
  Single<Integer> delete(Ship ship);

  @Delete
  Single<Integer> delete(Ship...ships);

  @Delete
  Single<Integer> delete(Collection<Ship> ships);

  @Query("SELECT * FROM Ship WHERE ship_id = :shipId")
  LiveData<Ship> select (long shipId);

  @Query("SELECT * FROM Ship ORDER BY strength DESC")
  LiveData<Ship> selectAll();

//  @Query("SELECT name FROM Ship")
//  LiveData<Ship> select(String name);
//
//  @Query("SELECT type FROM Ship")
//  LiveData<List<Ship>> select(Enum type);
//
//  @Query("SELECT strength FROM Ship")
//  LiveData<List<Ship>> select(int strength);
//
//  @Query("SELECT position FROM Ship")
//  LiveData<Ship> selectPosition(int position);
//
//  @Query("SELECT game_id FROM Ship WHERE game_id = :gameId")
//  LiveData<Ship> select(long gameId);

}
