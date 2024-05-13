# Party Guests Coding Example

Assuming there was a self-made platform where users can type in their names
and vote if they're going to join the upcoming party or not.
The export produced an unsorted CSV file with the time (in ISO format), name and vote.

The goal of this simple program is to return a list of names of those who are coming to the party.

## The Sample Dataset

The sample dataset created is built (timewise) like a truth table for three values, 
where each row corresponds to a person:

| Vote1 | Vote2 | Vote3 |   | Name  |
|-------|-------|-------|---|-------|
| True  | True  | True  |   | Tim   |
| True  | True  | False |   | Lisa  |
| True  | False | True  |   | Steve |
| False | True  | True  |   | Karen |
| True  | False | False |   | Bob   |
| False | True  | False |   | Mai   |
| False | False | True  |   | Joe   |
| False | False | False |   | Jane  |

As the last vote is the deciding one `Tim, Steve, Karen and Joe` are the expected results.

## The Approach

There are multiple ways to solve that problem using various datastructures.
In my approach I figured the main task would be to get the votes in order first and just keep the positive votes afterwards.

Feel free to create your own Solver and datasets, and give feedback to your approach.