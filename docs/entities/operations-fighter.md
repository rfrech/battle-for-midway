# Entity Operations Checklist

## Entity name: Fighter

## Operations

In the list of operations below, check all the operations that apply. For example, if you know you will need to be able to insert a single instance of the entity at a time into the database, check **Single instance** in the **Create/insert** section.

Note that the pairs of square brackets below are rendered as checkboxes in GitHub Pages. To insert a checkmark, **replace** the single space between the square brackets in the Markdown with an "x" character (uppercase or lowercase; **do not** include the quote characters). To remove a checkmark, **replace** the "x" between the square brackets with a **single** space character. Aside from adding or removing checkmarks, do not modify the formatting or content of the remainder of this section.

### Create/insert
    
* [ ] Single instance 
* [x] Multiple instances 
    
### Read/query/select

* [ ] Single instance 
* [x] Multiple instances 

### Update

* [ ] Single instance 
* [x] Multiple instances 

### Delete

* [ ] Single instance 
* [x] Multiple instances 


## Queries

Select fighter id to determine which fighter is committed. Multiple instances required null not valid.
fighter id column sorted by strength.

## Queries

Select name to display to user. Multiple instances required null not valid. name column sorted by strength.

## Queries

Select strength to give fighters their fighting power. Multiple instances required null not valid.
strength column sorted by ascending

## Queries

Select ship id to commit fighters to attack a ship. Single instances required null not valid.
ship id column

### Query: SELECT name

Purpose

: Determines name of the fighter.

Cardinality/modality

: multiple/required
 
Filter

: SELECT name FROM Fighter;
 
Sort order

: "strength, descending"

### Query: SELECT strength

Purpose

: strength determines damage of a fighter

Cardinality/modality

: many/required
 
Filter

: SELECT strength FROM Fighter;
 
Sort order

: "strength, ascending"

### Query: SELECT ship_id

Purpose

: commits fighters to attack a ship

Cardinality/modality

: single/required
 
Filter

: SELECT ship_id FROM fighter;
 
Sort order

: does not exist