#!/bin/bash
TARGET_DIRECTORY="tetris-3-jar/target"
if [ -d "$TARGET_DIRECTORY" ]; then
  # target directory exists
  cd $TARGET_DIRECTORY
  java -jar tetris-3-jar-1.0-SNAPSHOT-jar-with-dependencies.jar
else
  # no directory
  echo "Directory: ${TARGET_DIRECTORY} not exists, build project before run"
fi