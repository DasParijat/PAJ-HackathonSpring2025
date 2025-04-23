// diary.js - Entry save/load by date
//----------------------------------------

function saveEntry() {
    const dateStr = formatDate(currentDate);
    const text = document.getElementById("diaryText").value;
    const key = "diaryEntry_" + dateStr;
    localStorage.setItem(key, text);
    updateScreen(dateStr + "\n\n" + text);
}

function loadEntry() {
    const dateStr = formatDate(currentDate);
    const key = "diaryEntry_" + dateStr;
    const saved = localStorage.getItem(key);
    if (saved !== null) {
        document.getElementById("diaryText").value = saved;
        updateScreen(dateStr + "\n\n" + saved);
    } else {
        document.getElementById("diaryText").value = "";
        updateScreen(dateStr + "\n\nNo entry.");
    }
}