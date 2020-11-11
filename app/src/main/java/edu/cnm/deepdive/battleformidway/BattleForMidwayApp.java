package edu.cnm.deepdive.battleformidway;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.battleformidway.service.BattleForMidwayDatabase;
import io.reactivex.schedulers.Schedulers;

public class BattleForMidwayApp extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
    BattleForMidwayDatabase.setContext(this);
    BattleForMidwayDatabase.getInstance().getGameDao().delete()
        .subscribeOn(Schedulers.io())
        .subscribe();
  }
}
