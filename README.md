## Database Setup
* Download/Install XAMPP if not installed already
* Open XAMPP Control Panel
* Click 'Start' for both Apache and MySQL
* Click 'Admin' next to 'Start' on the MySQL Column
* On the left side click 'New' and create a database called 'jokes'

## Running the application
### Option 1 - Download Project:
* Download the project & open in an IDE that is capable of running a java application
* Run the 'JokesappApplication' class in: src > main > java > com.example.jokesapp
* Open a browser and go to localhost:8080

### Option 2 - Execute .jar file (Requires Java Runtime installed):
* Run the jokesapp-1.0.jar file located at: src > main > resources
* Open a command line of your choice and navigate to where the .jar file is
* Type & Enter: java -jar jokesapp-1.0.jar
* Wait for the boot up to finish (command line will stop writing new lines)
* Open a browser and go to localhost:8080

## Using the application
* Click anywhere on the screen to reveal the punchline for the joke that is currently visible
* Click again when both the joke & punchline are visible to get the next joke
* Choose a specific category by clicking a category on the top navigation bar
