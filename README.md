# Project Name
> AlbumList

## Table of contents
* [General Information](#general-information)
* [Technologies](#technologies)
* [Features](#features)
* [Screenshots](#screenshots)
* [Code Examples](#code-examples)
* [Setup](#setup)
* [Status](#status)
* [Contact](#contact)

## General Information
The program is a simple mobile application that lists track titles, artists and photo of the album. 
Its main function is the ability to play a given song from the list.

## Technologies
Project is created with:
- Android Studio version: 4.1.1
- Java version: 16

## Features
The main function of the application is the ability to play a given song from the list of given songs.

**To Do:**
- The ability to add and remove songs from the list

## Screenshots
Example screenshot showing the operation of the mobile application:

The appearance of the application:<br>
![Random population](/images/menu.png)

## Code Examples
The code represents the logic of the "GRAJ" button:
```
button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button.getText().equals("GRAJ")) {
                    albums.get(position).start();
                    button.setText("STOP");
                } else {
                    albums.get(position).stop();
                    button.setText("GRAJ");
                }
            }
        });
```

## Setup
To run the application, you must download the [Android Studio](https://developer.android.com/studio) and [Java](https://www.oracle.com/pl/java/technologies/javase-jdk11-downloads.html) environment. 
Download the project and run it.

## Status
Project is: *in progress*.

## Contact
Created by [Dominika Szypulska](https://github.com/DominikaSzypulska).
<br>E-mail: dominikaszypulska@onet.pl -feel free to contact me!
