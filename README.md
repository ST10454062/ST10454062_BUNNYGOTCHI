IMAD5112 Assignment 2 06/05/2024

ST10454062 Jolandri Cilliers

**Tamagotchi**

|     | Name | pg  |
| --- | --- | --- |
| 1   | Purpose | 2   |
| 2   | Design considerations | 2-8 |
| 3   | First round of planning | 2-3 |
| 4   | Second round of planning and Finalization | 4-7 |
| 5   | General design | 7   |
| 6   | Intuitive design | 7-8 |
| 7   | Content prioritisation | 8   |
| 8   | Legible Text Content | 8   |
| 9   | Make Interface Elements Clearly Visible | 8   |
| 10  | Hand Position Controls | 8   |
| 11  | Images | 8   |
| 12  | Github and github actions | 9   |
| 13  | Youtube link | 10  |
| 14  | Code | 10-20 |
| 15  | Reference list | 21  |

\------------------------------------------------------------------------------------------------------------

**BUNNYGOTCHI**

**1\. Purpose**

The purpose of the Tamagotchi app is to entertain the user with playing with an animal. The app is mostly for entertainment purposes, attracting attention from all ages. The app isn’t targeted to specific demographic however children would find it the most interesting. The app could also be used as a form of education, in terms of taking care of something. The children will learn a sense of responsibility by feeding, cleaning, and playing with the animal.

**2\. Design Considerations**

**First round of planning**

Firstly, I will start with the planning of my app. The first page will have one textview for the title, one imageview for the main image, and one button that will direct the user to the second page.

The planning for the second page was a little challenging. The goal was to make it simplistic but also have all the components on the page. I had a few designs that i wanted to try but decided to go with one.

)

The third page has a textview and imageview. At the bottom of the page it has two button redirecting to the first and second activity pages.

**Second round of planning and Finalization**

Activity page 1:

The main image is just a picture of the bunny’s ears. This is to create suspense and have the user excited to see how the bunny would look like. Three colours were used to make it simple and not to overwhelm the user.

This is the finalization for MainActivity

Activity Page 2:

This is how it looks when you click the button to jump to the second page. There are three progress bars, each being for feeding, cleaning, and playing. Three button are at the bottom for the same things. One imageview is in the middle of the page. It is responsible for change the images.

The final image is what I ended up deciding for my app. The progressbars are all the same colour of the background to make it blend in more smoothly. Final image2 displays what it will look like if all three buttons are pressed.

The next two images are for the feed button. Image 1 shows what happens when the button is clicked immediately. The image changes to a bunny that eats and the textview on top changes to “eating...”. The progress bar fills up all the way and the textview under it displays the percentage. Image 2 show what happens when the button resets. The progress bar jumps back to the left and the textview under it displays the 0 percent. The textview under the image displays what the bunny wants next.

The final image is what I decided for the finalization of the feed button.

The next two images are for the clean button. Image 1 shows what happens when the button is clicked immediately. The image changes to a bunny is cleaning and the textview on top changes to “cleaning...”. The progress bar fills up all the way and the textview under it displays the percentage. Image 2 show what happens when the button resets. The progress bar jumps back to the left and the textview under it displays the 0 percent. The textview under the image displays what the bunny wants next.

The final image is what I decided for the finalization of the clean button.

The next two images are for the play button. Image 1 shows what happens when the button is clicked immediately. The image changes to a bunny is playing and the textview on top changes to “playing...”. The progress bar fills up all the way and the textview under it displays the percentage. Image 2 show what happens when the button resets. The progress bar jumps back to the left and the textview under it displays the 0 percent. The textview under the image displays what the bunny wants next.

The final image is what I decided for the finalization of the play button.

Activity page 3:

This image displays a textview and image of the bunny that died. There are two buttons. The try again button takes you back to the second activity page and the home button will take you to the first activity page.

**General design**

The main audience of this app will be children, it is important to attract their attention as quick as possible. The app should be colourful but not overbearing. The Bunnygotchi app follows a very plain approach using only 3 colours on the first activity page and 3-4 on the second activity page. The third activity page follows the same concept of the first activity page.

**Intuitive design**

Starting with the first activity page, The design is very basic, the title is on the very top of the page with the imageview following underneath. The button is placed on the bottom of the page for the user’s comfort.

The second page has 3 progress bars at the top with their corresponding textviews that will display the percentage. The progressbars change colours depending on what percentages they display. Starting from 0 the progressbars will display red to yellow to green until it gets to 100. It wil do the same but in reverse going back to 0. Another textview is placed at the top that show what the bunny is doing at that moment. The imageview displays and changes the images with the press of a button. Under the imageview the three button are placed.

The third activity page begin with a textview displaying that the bunny died. An imageview follows underneath showing a ghost and at the bottom there are two buttons dedirecting you to the first and second activity page.

**Content prioritisation**

The essential content and components are on the pages. The buttons are used to control the app, the imageview displays and changes the images of the bunny, and the progress bars shows the progress of what the bunny is doing.

**Legible Text Content**

The font is very easy to read, it is important to cater to all age groups. The description that appears at the bottom of the page after clicking the button is the biggest. This textview is supposed to grab the user’s attention. The percentages at the top of the page are not that important because there is already a progress bar that goes with it.

**Make Interface Elements Clearly Visible**

All the component all clearly visible and placed in such a way to give the user a pleasant experience. White space it used to create the look of the app not being crowded. The progress bars could be a little too close to each other but I thought that this is the best way to space them.

**Hand Position Controls**

All the buttons are placed at the bottom to maximize the hand position placements. It is easy to reach them with either hand or both at the same time. I decided not to place any button at the top for the same reason.

**Images**

I chose these pictures of the bunny because they brought a sense of joy when looking at them. They also have a very simple design that is not overbearing in a way. They all look the same which completes the look of the animal and gives the user the feeling that it is the same bunny in all the pictures.

**3) GitHub and GitHub Actions**

4) YouTube Link

<https://www.youtube.com/watch?v=viZ_uNzxsf4>

5) Code

**MainActivity:**

package com.example.st10454062.gif

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.widget.Button

class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)

setContentView(R.layout.activity_main)

val startButton = findViewById&lt;Button&gt;(R.id.button)

startButton.setOnClickListener{

val intent = Intent(this,MainActivity2::class.java)

// by pressing the button the activity will change to the second

// activity which is MainActivity2

startActivity(intent)

}

}

}

**MainActivity2:**

package com.example.st10454062.gif

import android.annotation.SuppressLint

import android.content.Intent

import android.content.res.ColorStateList

import android.graphics.Color

import android.os.Bundle

import android.os.Handler

import android.os.Looper

import android.widget.Button

import android.widget.ImageView

import android.widget.ProgressBar

import android.widget.TextView

import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.ViewCompat

import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

private var feedProgressCount: Int = 0 //initializing the counter for the progressbar

private var cleanProgressCount: Int = 0

private var playProgressCount: Int = 0

private val handler = Handler(Looper.getMainLooper())

private val delayMax: Long = 5000//5 seconds delay

@SuppressLint("MissingInflatedId")

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)

enableEdgeToEdge()

setContentView(R.layout.activity_main2)

ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->

val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

insets

}

val feed_progressbar = findViewById&lt;ProgressBar&gt;(R.id.feed_progressbar)

val clean_progressbar = findViewById&lt;ProgressBar&gt;(R.id.clean_progressbar)

val play_progressbar = findViewById&lt;ProgressBar&gt;(R.id.play_progressbar)

val play_btn = findViewById&lt;Button&gt;(R.id.play_btn)

val clean_btn = findViewById&lt;Button&gt;(R.id.clean_btn)

val feed_btn = findViewById&lt;Button&gt;(R.id.feed_btn)

val feed_txt = findViewById&lt;TextView&gt;(R.id.feed_txt)

val clean_txt = findViewById&lt;TextView&gt;(R.id.clean_txt)

val play_txt = findViewById&lt;TextView&gt;(R.id.play_txt)

val imageView = findViewById&lt;ImageView&gt;(R.id.imageView)

val feedProgress = findViewById&lt;TextView&gt;(R.id.feedProgress)

val cleanProgress = findViewById&lt;TextView&gt;(R.id.cleanProgress)

val playProgress = findViewById&lt;TextView&gt;(R.id.playProgress)

imageView.setImageResource(R.drawable.peace)

feed_btn.setOnClickListener {

imageView.setImageResource(R.drawable.carrot)

Thread {

while (feedProgressCount < 100) {

feedProgressCount++

try {

Thread.sleep(40)

} catch (e: InterruptedException) {

e.printStackTrace()

} //(Stack Overflow, 2012) <https://stackoverflow.com/questions/10317041/exception-handling-in-case-of-thread-sleep-and-wait-method-in-case-of-threads>

handler.post { //(Stack Overflow, 2013) <https://stackoverflow.com/questions/15136199/when-to-use-handler-post-when-to-new-thread>

feed_progressbar.progress = feedProgressCount

feed_txt.text = "$feedProgressCount%"

if (feedProgressCount <= 35){

feed_progressbar.progressTintList= ColorStateList.valueOf(Color.RED) // (Stack Overflow, 2012) <https://stackoverflow.com/questions/10951978/change-progressbar-color-through-code-only-in-android>

}

if (feedProgressCount >= 36 && feedProgressCount <= 75)run {

feed_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)

}

if (feedProgressCount >= 76 && feedProgressCount <= 100)run {

feed_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)

}

feedProgress.text = "eating..."

if (feedProgressCount == feed_progressbar.max) {

handler.postDelayed({

feed_progressbar.progressTintList= ColorStateList.valueOf(Color.GREEN)

}, delayMax)

}

}

}

while (feedProgressCount > 0) {

feedProgressCount--

try {

Thread.sleep(80)

} catch (e: InterruptedException) {

e.printStackTrace()

}

handler.post {

feed_progressbar.progress = feedProgressCount

feed_txt.text = "$feedProgressCount%"

feedProgress.text = ""

if (feedProgressCount >= 76 && feedProgressCount <= 100)run {

feed_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)

}

if (feedProgressCount >= 36 && feedProgressCount <= 75)run {

feed_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)

}

if (feedProgressCount <= 35){

feed_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

}

if (feedProgressCount == feed_progressbar.min) {

feed_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

feed_txt.text =""

feedProgress.text = ""

if (feedProgressCount == feed_progressbar.min && cleanProgressCount == clean_progressbar.min && playProgressCount == play_progressbar.min){

val intent = Intent(this,MainActivity3::class.java)

startActivity(intent)

}

}

}

}

}.start()

}

clean_btn.setOnClickListener {

imageView.setImageResource(R.drawable.clean)

Thread {

while (cleanProgressCount < 100) {

cleanProgressCount++

try {

Thread.sleep(40)

} catch (e: InterruptedException) {

e.printStackTrace()

}

handler.post {

clean_progressbar.progress = cleanProgressCount

clean_txt.text = "$cleanProgressCount%"

if (cleanProgressCount <= 35){

clean_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

}

if (cleanProgressCount >= 36 && cleanProgressCount <= 75)run {

clean_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)

}

if (cleanProgressCount >= 76 && cleanProgressCount <= 100)run {

clean_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)

}

cleanProgress.text = "cleaning..."

if (cleanProgressCount == clean_progressbar.max) {

handler.postDelayed({

clean_progressbar.progressTintList= ColorStateList.valueOf(Color.GREEN)

}, delayMax)

}

}

}

while (cleanProgressCount > 0) {

cleanProgressCount--

try {

Thread.sleep(80)

} catch (e: InterruptedException) {

e.printStackTrace()

}

handler.post {

clean_progressbar.progress = cleanProgressCount

clean_txt.text = "$cleanProgressCount%"

cleanProgress.text = ""

if (cleanProgressCount >= 76 && cleanProgressCount <= 100)run {

clean_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)

}

if (cleanProgressCount >= 36 && cleanProgressCount <= 75)run {

clean_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)

}

if (cleanProgressCount <= 35){

clean_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

}

if (cleanProgressCount == clean_progressbar.min) {

clean_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

clean_txt.text =""

cleanProgress.text = ""

if (feedProgressCount == feed_progressbar.min && cleanProgressCount == clean_progressbar.min && playProgressCount == play_progressbar.min){

val intent = Intent(this,MainActivity3::class.java)

startActivity(intent)

}

}

}

}

}.start()

}

play_btn.setOnClickListener {

imageView.setImageResource(R.drawable.computer)

Thread {

while (playProgressCount < 100) {

playProgressCount++

try {

Thread.sleep(40)

} catch (e: InterruptedException) {

e.printStackTrace()

}

handler.post {

play_progressbar.progress = playProgressCount

play_txt.text = "$playProgressCount%"

if (playProgressCount <= 35){

play_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

}

if (playProgressCount >= 36 && playProgressCount <= 75)run {

play_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)

}

if (playProgressCount >= 76 && playProgressCount <= 100)run {

play_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)

}

playProgress.text = "playing..."

if (playProgressCount == play_progressbar.max) {

handler.postDelayed({

play_progressbar.progressTintList= ColorStateList.valueOf(Color.GREEN)

}, delayMax)

}

}

}

while (playProgressCount > 0) {

playProgressCount--

try {

Thread.sleep(80)

} catch (e: InterruptedException) {

e.printStackTrace()

}

handler.post {

play_progressbar.progress = playProgressCount

play_txt.text = "$playProgressCount%"

playProgress.text = ""

if (playProgressCount >= 76 && playProgressCount <= 100)run {

play_progressbar.progressTintList = ColorStateList.valueOf(Color.GREEN)

}

if (playProgressCount >= 36 && playProgressCount <= 75)run {

play_progressbar.progressTintList = ColorStateList.valueOf(Color.YELLOW)

}

if (playProgressCount <= 35){

play_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

}

if (playProgressCount == play_progressbar.min) {

play_progressbar.progressTintList= ColorStateList.valueOf(Color.RED)

play_txt.text =""

playProgress.text = ""

if (feedProgressCount == feed_progressbar.min && cleanProgressCount == clean_progressbar.min && playProgressCount == play_progressbar.min){

val intent = Intent(this,MainActivity3::class.java)

startActivity(intent)

}

}

}

}

}.start()

}

}

}

**MainActivity3:**

package com.example.st10454062.gif

import android.annotation.SuppressLint

import android.content.Intent

import android.os.Bundle

import android.widget.Button

import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.ViewCompat

import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

@SuppressLint("MissingInflatedId")

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)

enableEdgeToEdge()

setContentView(R.layout.activity_main3)

ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->

val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

insets

}

val tryButton = findViewById&lt;Button&gt;(R.id.try_btn)

tryButton.setOnClickListener{

val intent = Intent(this,MainActivity2::class.java)

//pressing the try again button will redirect it to the second activity page

startActivity(intent)

}

val homeButton = findViewById&lt;Button&gt;(R.id.home_btn)

homeButton.setOnClickListener{

val intent = Intent(this,MainActivity::class.java)

//pressing the start button will redirect it to the first activity page

startActivity(intent)

}

}

}  

**6) References:**

Abu Experience, 2017. 10 Mobile UX Design Principles You Should Know. \[Online\] Available at: <http://uxbert.com/10-mobile-ux-design-principles/> \[Accessed 23 April 2024\]. Creative Bloq, 2012.

Fakia, A. (2019). Pet Sitting App UX Case Study - SitMyPet. \[Online\]. Available at: <https://www.behance.net/gallery/93979981/Pet-Sitting-App-UX-Case-Study-SitMyPet> (Accessed: April 23, 2024).

SoluteLabs, 2022. Mobile UX Design Principles. \[Online\] Available at: <https://www.solutelabs.com/blog/mobile-ux-design-principles> \[Accessed 23 April 2024\].

Stack Overflow. (2012). Exception handling in case of Thread.sleep() and wait() method in case of threads. Retrieved from <https://stackoverflow.com/questions/10317041/exception-handling-in-case-of-thread-sleep-and-wait-method-in-case-of-threads>

Stack Overflow. (2013). When to use Handler.post() when to new Thread(). Retrieved from <https://stackoverflow.com/questions/15136199/when-to-use-handler-post-when-to-new-thread>

Stack Overflow. (2012). Change ProgressBar color through code only in Android. Retrieved from <https://stackoverflow.com/questions/10951978/change-progressbar-color-through-code-only-in-android>

Stack Overflow. (2014). Android ImageButton - How to change the image when button is clicked. Retrieved from <https://stackoverflow.com/questions/24755849/android-imagebutton-how-to-change-the-image-when-button-is-clicked>
