Feature: Meeting room presence
In order to find someone I want to meet with
As a co-worker
I want to discover a co-workers location.

Scenario: Finding meeting room occupant
Given 'Kevin Bacon' is in meeting room 'Annapolis L2-Sacajawea-10'
When listing everyone in 'Annapolis L2-Sacajawea-10'
Then 'Kevin Bacon' is listed. 

Scenario: Not finding meeting room occupant 
Given 'Kevin Bacon' is in meeting room 'Annapolis L2-Sacajawea-10'
When listing everyone in 'Annapolis L1-Clark-8'
Then 'Kevin Bacon' is not listed.

Scenario: Nonexistent meeting room
Given 'Kevin Bacon' is in meeting room 'Annapolis L2-Sacajawea-10'
When listing everyone in 'non-existent meeting room'
Then message 'no such room'