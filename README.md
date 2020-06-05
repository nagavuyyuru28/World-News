# World-News

*Created as part of Udacity's Android Basics by Google Nanodegree Program*
____________

The goal is to create a News Feed app which gives a user regularly-updated news from the internet related to a particular topic, person, or location. The presentation of the information as well as the topic is up to you.
____________

# Project Specifications

## Layout

1. **Main Screen**. App contains a main screen which displays multiple news stories.
2. **List Item Contents**.
	* Each list item on the main screen displays relevant text and information about the story.
	* The title of the article and the name of the section that it belongs to are required field.
	* If available, author name and date published should be included. Please note not all responses will contain these pieces of data, but it is required to include them if they are present.

3. **Best practices**. The code adheres to all of the following best practices:
   * Text sizes are defined in sp.
   * Lengths are defined in dp.
   * Padding and margin is used appropriately, such that the views are not crammed up against each other.
   
## Functionality

 **Main Screen Updates** - Stories shown on the main screen update properly whenever new news data is fetched from the API.
 **Story Intents** - Clicking on a story uses an intent to open the story in the user’s browser.
 **API Query** - App queries the content.guardianapis.com api to fetch news stories related to the topic chosen by the student, using either the ‘test’ api key or the student’s key.
 **JSON Parsing** - The JSON response is parsed correctly, and relevant information is stored in the app.
 **No Data Message** - When there is no data to display, the app shows a default TextView that informs the user how to populate the list.
 **Response Validation** - The app checks whether the device is connected to the internet and responds appropriately. The result of the request is validated to account for a bad server response or lack of server response.
 **Use of Loaders** - Networking operations are done using a Loader rather than an AsyncTask.
 
 ____________
 
<p float="left">
  <img src="images/article.png" height="500"/>
  <img src="images/articlegroup.png" height="500"/> 
  <img src="images/articlegroup.png" height="500"/>
</p>

 

