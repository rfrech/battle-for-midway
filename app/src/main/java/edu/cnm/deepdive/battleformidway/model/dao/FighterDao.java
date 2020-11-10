package edu.cnm.deepdive.battleformidway.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.battleformidway.model.entity.Fighter;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface FighterDao {

  @Insert
  Single<Long> insert(Fighter fighter);

  @Insert
  Single<List<Long>> insert(Fighter...fighters);

  @Insert
  Single<List<Long>> insert(Collection<Fighter> fighters);

  @Delete
  Single<Integer> delete(Fighter fighter);

  @Delete
  Single<Integer> delete(Fighter... fighters);

  @Delete
  Single<Integer> delete(Collection<Fighter> fighters);

  @Query("SELECT name FROM Fighter")
  LiveData<Fighter> select(String name);

  @Query("SELECT strength FROM Fighter")
  LiveData<Fighter> select(int strength);

  @Query("SELECT ship_id FROM Fighter")
  LiveData<Fighter> select(Long id);
}
