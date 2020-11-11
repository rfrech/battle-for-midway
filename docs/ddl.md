    CREATE TABLE IF NOT EXISTS `Game`
    (
        `game_id`     INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
        `turn_number` INTEGER                           NOT NULL,
        `grid_number` INTEGER                           NOT NULL,
        `user_name`   TEXT                              NOT NULL,
        `win`         INTEGER
    );
    
    CREATE INDEX IF NOT EXISTS `index_Game_turn_number` ON `Game` (`turn_number`);
    
    CREATE TABLE IF NOT EXISTS `Fighter`
    (
        `fighter_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
        `name`       TEXT                              NOT NULL,
        `strength`   INTEGER                           NOT NULL,
        `ship_id`    INTEGER                           NOT NULL,
        FOREIGN KEY (`ship_id`) REFERENCES `Ship` (`ship_id`) ON UPDATE NO ACTION ON DELETE NO ACTION
    );
    
    CREATE UNIQUE INDEX IF NOT EXISTS `index_Fighter_ship_id` ON `Fighter` (`ship_id`);
    
    CREATE UNIQUE INDEX IF NOT EXISTS `index_Fighter_name` ON `Fighter` (`name`);
    
    CREATE TABLE IF NOT EXISTS `Ship`
    (
        `ship_id`  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
        `strength` INTEGER                           NOT NULL,
        `position` INTEGER                           NOT NULL,
        `game_id`  INTEGER                           NOT NULL,
        `name`     INTEGER                           NOT NULL,
        `type`     INTEGER                           NOT NULL,
        FOREIGN KEY (`game_id`) REFERENCES `Game` (`game_id`) ON UPDATE NO ACTION ON DELETE CASCADE
    );
    
    CREATE UNIQUE INDEX IF NOT EXISTS `index_Ship_game_id` ON `Ship` (`game_id`);
    
    CREATE UNIQUE INDEX IF NOT EXISTS `index_Ship_strength` ON `Ship` (`strength`);
    
    CREATE UNIQUE INDEX IF NOT EXISTS `index_Ship_name` ON `Ship` (`name`);
    
    CREATE UNIQUE INDEX IF NOT EXISTS `index_Ship_type` ON `Ship` (`type`);

* [DDL Github](https://github.com/rfrech/battle-for-midway/blob/master/docs/ddl.sql)


> [Return to previous page](data-model-implementation.md#data-definition-language)