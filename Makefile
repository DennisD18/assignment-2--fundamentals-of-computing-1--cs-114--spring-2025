filename = CountFlips
#filename = PrintVowelsAndNonVowels
#filename = TheTwelveDaysOfChristmas
#filename = OneHundredBottlesOfBeer

all: compile run

compile:
	javac $(filename).java
run:
	java $(filename)
clean:
	rm $(filename).class
