HW04
====
Shrinithi Narayanan; Lusia Lu

PLEASE TAKE NOTE OF WHERE OUR UML DIAGRAMS ARE LOCATED.
We have a main overview of our MVC on the same level as
the source folder, called OverallMVC.umlcd. In the util
package, we have a util.umlcd. In our model package, we
have a Panting.umlcd for the classes related to painting
and we have a Updating.umcld for the classes related to
updating the ball.

This is HW04 for COMP310, where we implement various painting strategies for
our BallWorld, and add command dispatching, on top of what we have for HW03.

In order to run our code, run BallWorldController.java. This
instantiates the view and the model, and starts them.

We were to use IStrategyFacs, in order to "make" these
IPaintStrategies for the balls, which would each have their own
paint, that would change how the ball is painted.

When the view is loaded, the JFrame appears. There are 4 panels,
each containing components, and a button which clears the balls.

In the leftmost panel is a text field to input the type of strategy
you'd like to add to the list, and a button which will actually
add it to the list. You can put in just the word, i.e. Straight,
Color, Breathing, etc, and this can be in any case. We do not support
model.TypeStrategy, just because that's another check, and really, why
would someone want to purposely type out the longer name if the input
will be mapped to model.InputStrategy anyway? If the name is typed
incorrectly, or we do not define a concrete strategy for it, then
it calls the make function of the error strategy factory, which creates
a beep every 25 ticks, as provided.

The middle panel contains a button to make selected ball, 2 drop down
lists, and a combine button. The make selected ball makes a ball with
the update strategy that is create by the strategy factory that is
selected in the top drop down list. The combine button combines the two
strategies that are selected in the drop down lists, and populates that
into to the list. If either of the buttons are clicked, but there is
nothing selected, the function just returns and nothing happens.

The third panel has the buttons to make a switcher ball, and switch their
strategies. Clicking Make Switcher creates a switcher ball, which starts
off as a Straight Strategy. When switch is clicked, it changes the balls
update strategies to whatever is selected in the top drop down list. Then,
when make switcher is called again, whatever type it was changed to will
be made, until the strategy is changed again.

The last button is self-explanatory, and clears the balls from the canvas.

The fourth panel has buttons to make and add paint strategies. The text
field lets you type in Paint Strategies to be added to the JComboBox. You
click the button to add it to the JComboBox, then use the JComboBox for selection.

The strategies we implement are many. We include the basic ones that don't
count towards the rubrics like Straight, Color, and Breathing.

The 5 strategies we made that count towards the rubric are:
Crash 		= the ball changes colors when it bounces from the canvas

Fast 		= the ball increases velocity to a pre defined max

Swell		= the ball increases to a certain size, changes colors,
			  shrinks slowly, and repeats

Teleport		= the ball randomly changes location, and when it does
			  it changes color as well

Wiggle		= the ball randomly changes the direction of its velocity

We made use of anonymous inner classes to make new strategy factories and their
update strategies. We also used Java Generics in order to parameterize the view
and the JComboBoxes, so they could have the items be of type IStrategyFac.

Please see our Java docs for more info on each specific function.

This project has added functionality to what we had for HW03. Now, we also have paint strategies,
that work with the update strategies we have (unless something deals with the color, since we
currently do not support dynamically changing the color of an image)...

The paint strategies we support, as required by the rubric are...

Non-affine transform-based paint strategy, i.e. directly implements IPaintStrategy:
	1) This is BallPaintStrategy, which is just typed in the GUI as 'Ball' without the quotes.
	2) This is SquarePaintStrategy, which is just typed in the GUI as 'Square' without the quotes.
	
Affine transform-based paint strategy:
	Simple geometric shape and/or polygon:
		3) This is EllipsePaintStrategy, which is just typed in the GUI as 'Ellipse' without the quotes.
		4) This is RectanglePaintStrategy, which is just typed in the GUI as 'Rectangle' without the quotes.
	Composite shape that stays upright:
		5) This is RectangleEllipsePaintStrategy, which is just typed in the GUI as 'RectangleEllipse' without the quotes.
	Image:
		6) This is ImagePaintStrategy, which is just typed in the GUI as the image you want to draw starting
		with a capital character, following by 'Image' without the quotes. The currently supported images are
			-EarthImage
			-HumbirdImage
			-JupiterImage
			-MarioImage
			-MarsImage
			-ReefImage
			-SaturnImage
			-SheepImage
			-SoccerImage
			-SonicImage
			-VenusImage
			-MarioMarsImage
			
Please do not try other cases. Those are the supported Paint Strategies. Again, listed in a easy to read list:

Ball
Square
Ellipse
Rectangle
RectangleEllipse
EarthImage
HumbirdImage
JupiterImage
MarioImage
MarsImage
ReefImage
SaturnImage
SheepImage
SoccerImage
SonicImage
VenusImage
MarioMarsImage

Thanks for reading!