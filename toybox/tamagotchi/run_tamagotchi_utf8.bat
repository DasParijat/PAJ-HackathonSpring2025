@echo off
cd src\tamagotchi
echo Compiling Tamagotchi (UTF-8)...
javac -encoding UTF-8 *.java
if errorlevel 1 (
    echo Compilation failed.
    pause
    exit /b
)
echo Running Tamagotchi...
java Tamagotchi
pause
