build:
	javac -d ./bin ./src/Main.java

run:
	java -cp ./bin Main

clean:
	rm -rf ./bin/*.class

dev: build run