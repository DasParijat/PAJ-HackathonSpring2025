/* password.js - Lock screen and password logic */
//----------------------------------------

function showSetup() {
    document.getElementById("lockScreen").style.display = "none";
    document.getElementById("setupScreen").style.display = "block";
}

function setPassword() {
    const pw = document.getElementById("newPassword").value;
    if (pw.trim().length < 3) {
        updateScreen("Password must be at least 3 characters.");
        return;
    }
    localStorage.setItem("diaryPassword", pw);
    updateScreen("Password saved.");
}

function showLock() {
    document.getElementById("setupScreen").style.display = "none";
    document.getElementById("lockScreen").style.display = "block";
}

function lockDiary() {
    document.getElementById("diaryScreen").style.display = "none";
    document.getElementById("lockScreen").style.display = "block";
}

function unlockDiary() {
    document.getElementById("lockScreen").style.display = "none";
    document.getElementById("diaryScreen").style.display = "block";
    updateDateOnScreen();
}
