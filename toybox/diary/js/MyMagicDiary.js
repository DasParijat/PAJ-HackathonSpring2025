// MyMagicDiary.js - System boot and screen output function
//----------------------------------------

function updateScreen(message) {
    const screen = document.getElementById("screenOutput");
    screen.textContent = message;
}

// Optional: boot directly into main menu
window.onload = function () {
    showMainMenu();
};
