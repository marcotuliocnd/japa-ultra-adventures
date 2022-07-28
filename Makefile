build:
	javac -d ./bin ./src/*.java -classpath ./bin

run:
	java -cp ./bin Main

clean:
	rm -rf ./bin/*.class

dev: clean build run