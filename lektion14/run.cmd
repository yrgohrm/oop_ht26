@echo off
java -cp "lib\slf4j-api-2.0.20.jar;lib\slf4j-simple-2.0.20.jar;bin" -Dorg.slf4j.simpleLogger.defaultLogLevel=warn -Dorg.slf4j.simpleLogger.showDateTime=true -Dorg.slf4j.simpleLogger.dateTimeFormat="yyyy-M-d hh:mm" LogExample
rem java -cp "lib\slf4j-api-2.0.20.jar;lib\slf4j-simple-2.0.20.jar;bin" LogExample
