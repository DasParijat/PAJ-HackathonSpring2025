// menu.js - Main menu rendering and navigation
//----------------------------------------

const menuOptions = ["DIARY", "PASSWORD"];
let selectedOptionIndex = 0;


//Main Menu
function showMainMenu() {
    let output = "MAIN MENU\n\n";
    for (let i = 0; i < menuOptions.length; i++) {
        const prefix = (i === selectedOptionIndex) ? "> " : "  ";
        output += prefix + menuOptions[i] + "\n";
    }
    updateScreen(output);
}

function menuUp() {
    if (selectedOptionIndex > 0) {
        selectedOptionIndex--;
        showMainMenu();
    }
}

function menuDown() {
    if (selectedOptionIndex < menuOptions.length - 1) {
        selectedOptionIndex++;
        showMainMenu();
    }
}

function menuSelect() {
    const selected = menuOptions[selectedOptionIndex];
    if (selected === "DIARY") {
        document.getElementById("diaryScreen").style.display = "block";
        updateDateOnScreen();
    } else if (selected === "PASSWORD") {
        showSetup();
    }
}