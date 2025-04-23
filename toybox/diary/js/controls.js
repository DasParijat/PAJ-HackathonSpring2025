// controls.js - Arrow key/button handlers
//----------------------------------------

function searchUp() {
    menuUp();
}

function searchDown() {
    menuDown();
}

function arrowUp() {
    menuUp();
}

function arrowDown() {
    menuDown();
}

function arrowLeft() {
    previousDate();
}

function arrowRight() {
    nextDate();
}

function exePress() {
    menuSelect(); // Reuse this for now — update as new contexts added
}