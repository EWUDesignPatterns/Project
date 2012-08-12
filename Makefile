all:
	javac -classpath ./src ./src/gui/DungeonsAndDragonsGame.java

run: 
	java -classpath ./src/ gui.DungeonsAndDragonsGame