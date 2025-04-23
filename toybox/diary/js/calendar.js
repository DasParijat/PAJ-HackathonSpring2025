// calendar.js - Date selection and display
//----------------------------------------

let currentDate = new Date();

function formatDate(date) {
    return date.toISOString().split('T')[0];
}

function updateDateOnScreen() {
    const dateStr = formatDate(currentDate);
    const key = "diaryEntry_" + dateStr;
    const saved = localStorage.getItem(key);
    if (saved !== null) {
        updateScreen(dateStr + "\n\n" + saved);
    } else {
        updateScreen(dateStr + "\n\nNo entry.");
    }
}

function previousDate() {
    currentDate.setDate(currentDate.getDate() - 1);
    updateDateOnScreen();
}

function nextDate() {
    currentDate.setDate(currentDate.getDate() + 1);
    updateDateOnScreen();
}

function searchDate() {
    updateDateOnScreen();
}
