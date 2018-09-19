# Flood_Homework1
An Android Mobile Application that performs two functions. The first randomly picks a color and changes the color of the text in the text field as well as the background color. The function also shows the red, green, and blue values of the color as well as a hexidecimal representation. The second function is a drawing panel with a color picker that allows the user to change the color of the drawing.
## Getting Started
### Prerequisites
Access to an android device or an available virtual device

Android studio installed following the instructions from https://developer.android.com/studio/
### Deployment Instructions
To run this application open the github repository at https://github.com/CourtneyFlood/Flood_Homework1

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(8).png" width="450">

Then press the Clone or Download Button in the top right hand corner of the repository and press DownloadZIP.

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(10).png" width="450">

Open the zipped file

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(11).png" width="450">

Press the ExtractTo button and select the location to store the file

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(12).png" width="450">

Open Android Studio and under file press Open...

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(14).png" width="450">

Go to location of the saved file selected previously

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(15).png" width="450">

Once the program is open press the green triangle (play button) at the top right part of the frame.

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(17).png" width="450">

Select a Connected Device or an Available Virtual Device and press ok. If none are visable press the Create New Virtual Device button and follow the instructions provided. 

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images%202/Screenshot%20(18).png" width="450">

The application will then open on the selected device. 

## Instructions for Operation
### First Function
When the app is initially Opened it will open to the first function of the Application. This allows the user to write in the text field and press a button that will change the color of the text and the background of the layout to a random color. The red, green, and blue values will be displayed for each color change as well as a hexedecimal representation of the color. 
User types a string into the text field.

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images/Screenshot_20180918-200149.png" width="250"><img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images/Screenshot_20180918-200210.png" width="250">

User presses the TAP TO CHANGE COLOR button and text and layout background color randomizes. The red, green, and blue values of the colors are displayed as well as a hexedecimal representation of the color in the format COLOR: 191r, 136g, 4b, #bf8804

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images/Screenshot_20180918-200221.png" width="250"><img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images/Screenshot_20180918-200228.png" width="250">

When the NEXT Button is pressed the Second Function is launched.

### Second Function
The Second Function allows the user to use a drawing panel. The Color Picker button allows the user to select any color. Once the color is selected the user can touch the drawing panel to draw with the chosen color on the screen. 

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images/Screenshot_20180918-200251.png" width="250"><img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images/Screenshot_20180918-200259.png" width="250">

The CLEAR Button clears the drawing panel for the user. 

<img src="https://github.com/CourtneyFlood/Flood_Homework1/blob/master/images/Screenshot_20180918-200309.png" width="250">

## Used Libraries
Android Color Picker aka AmbilWarna library 

Author Randy Sugianto

https://github.com/yukuku/ambilwarna

Android Studio 3.0 and above:

dependencies {

implementation 'com.github.yukuku:ambilwarna:2.0.1'

}


