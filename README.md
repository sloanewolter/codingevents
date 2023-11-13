# codingevents

Purpose of the app:
This app allows users to catalog a list of tech events and record useful information about each event.

Current state of the app:
Currently, users can enter the following information about each event:
1) Name
2) Description
3) Contact Email
4) Location
5) Number of Attendees
6) Whether users must register
7) Date of Event
8) Category of Event.

Users can also set the categories available for events. Users can view all the events or can view events by category. 

Future Improvements:
The next step for this app is adding the ability to create a user profile to keep track of events of interest. 

  A person class will be added with the following fields:
    1)userId(int)
    2)password(String)
    2)email(String)
    3)name(String)

    The class will have getters and setters for these fields except for id

  There would also need to be a PersonProfile class to store the information about each user. Additionally, there would need to be lists storing events created and events saved for each user. There would be a many-to-many relationship 
  with eventsSaved, because multiple users could store multiple events. There would be a one-to-many relationship with eventsCreated, because one user could create multiple events. 
