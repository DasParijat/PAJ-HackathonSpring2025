
function saveEntry() {
    const text = document.getElementById("diaryText").value;
    localStorage.setItem("diaryEntry", text);
    alert("✅ Entry saved!");
}

function loadEntry() {
    const saved = localStorage.getItem("diaryEntry");
    if (saved !== null) {
        document.getElementById("diaryText").value = saved;
        alert("📖 Entry loaded!");
    } else {
        alert("📭 No entry saved yet.");
    }
}
