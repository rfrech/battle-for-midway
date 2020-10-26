# Entity Operations Checklist

## Entity name: Game

## Operations

In the list of operations below, check all the operations that apply. For example, if you know you will need to be able to insert a single instance of the entity at a time into the database, check **Single instance** in the **Create/insert** section.

Note that the pairs of square brackets below are rendered as checkboxes in GitHub Pages. To insert a checkmark, **replace** the single space between the square brackets in the Markdown with an "x" character (uppercase or lowercase; **do not** include the quote characters). To remove a checkmark, **replace** the "x" between the square brackets with a **single** space character. Aside from adding or removing checkmarks, do not modify the formatting or content of the remainder of this section.

### Create/insert
    
* [x] Single instance 
* [ ] Multiple instances 
    
### Read/query/select

* [ ] Single instance 
* [x] Multiple instances 

### Update

* [ ] Single instance 
* [x] Multiple instances 

### Delete

* [x] Single instance 
* [ ] Multiple instances 

## Queries

Select game id to determine game session. Single instance null not valid. game id column

## Queries
//TODO ask nick single multiple
Select turn number to determine turns left. Single instances required null not valid. Turn number
 
returns ascending int.

## Queries

Select Grid number to determine game board composition. Multiple instances required null not valid. 

Grid number returns descending int.

## Queries

Select User name to determine players name. Single instance required null not valid. User name 

single result.

## Queries

Select Win to determine win or loss. Multiple instances required null not valid. win returns boolean
 
 false until true.

### Query: Select turn number

Purpose

: Determines turns left and also determines the boolean win condition.

Cardinality/modality

: Many/Required
 
Filter

: SELECT turn_number FROM Game WHERE game_id = "x";
 
Sort order

: Does not exist

### Query: Select grid number

Purpose

: Determines gameboard composition

Cardinality/modality

: many/required
 
Filter

: Select grid_number FROM Game;
 
Sort order

: grid_number descending

### Query: Select user name

Purpose

: determines players name in the current game

Cardinality/modality

: single/required
 
Filter

: SELECT user_name FROM Game WHERE game_id = "x";
 
Sort order

: does not exist

### Query: SELECT win

Purpose

: win determines if game is won or lost

Cardinality/modality

: multiple/required
 
Filter

: SELECT win FROM Game WHERE game_id = "x";
 
Sort order

: win ascending