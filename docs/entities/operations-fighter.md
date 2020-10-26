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

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with a sentence or two summarizing the purpose of the query.}

Cardinality/modality

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the expected query cardinality & modality. Cardinality should be either "one" or "many", and modality should be either "required" or "optional". For example, a query intended to return all scores of a game has a cardinality/modality combination of "many/optional".}
 
Filter

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the list of fields of the entity that will be used to filter the query. For example, if this is a `Comment` entity, with a `posted` field that holds the date a comment was recorded, and you intend to include a query that shows only the last 30 days of comments, you would filter on that `posted` field.}
 
Sort order

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the list of fields of the entity that will be used to sort the query, along with an indicator of ascending or descending order. For example, if the entity is `Task` in a to-do list application, and `Task` has a `dueDate` field, you might want to say "dueDate, ascending".}

### Query: SELECT strength

Purpose

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with a sentence or two summarizing the purpose of the query.}

Cardinality/modality

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the expected query cardinality & modality. Cardinality should be either "one" or "many", and modality should be either "required" or "optional". For example, a query intended to return all scores of a game has a cardinality/modality combination of "many/optional".}
 
Filter

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the list of fields of the entity that will be used to filter the query. For example, if this is a `Comment` entity, with a `posted` field that holds the date a comment was recorded, and you intend to include a query that shows only the last 30 days of comments, you would filter on that `posted` field.}
 
Sort order

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the list of fields of the entity that will be used to sort the query, along with an indicator of ascending or descending order. For example, if the entity is `Task` in a to-do list application, and `Task` has a `dueDate` field, you might want to say "dueDate, ascending".}

### Query: SELECT ship_id

Purpose

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with a sentence or two summarizing the purpose of the query.}

Cardinality/modality

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the expected query cardinality & modality. Cardinality should be either "one" or "many", and modality should be either "required" or "optional". For example, a query intended to return all scores of a game has a cardinality/modality combination of "many/optional".}
 
Filter

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the list of fields of the entity that will be used to filter the query. For example, if this is a `Comment` entity, with a `posted` field that holds the date a comment was recorded, and you intend to include a query that shows only the last 30 days of comments, you would filter on that `posted` field.}
 
Sort order

: {Replace this placeholder---but not the colon character and the space that precede the placeholder---with the list of fields of the entity that will be used to sort the query, along with an indicator of ascending or descending order. For example, if the entity is `Task` in a to-do list application, and `Task` has a `dueDate` field, you might want to say "dueDate, ascending".}