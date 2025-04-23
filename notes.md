# 📓 Hackathon Notepad - Retro Toybox Project

> 🕹️ **Hackathon Theme:** Retro  
> 🗓️ **Duration:** 9am–9pm  

---

## 🎯 Project Overview

We’re creating a **Retro Toybox** — a colorful interface where users can click to open classic-style digital toys:

- **Choose Your Own Adventure Book** — branching story with simple navigation.
- **Furby (Text-Based AI)** — reacts to typed input with moods and fun messages.
- **Dear Diary** — a digital diary that mimics the 90s toy in style and behavior.

---

## 💻 Tech Breakdown

| Toy               | Tech Stack                  | Developers        | Notes |
|------------------|-----------------------------|-------------------|-------|
| Toybox Menu      | HTML + CSS + JS             | Alondra           | Central interface & styling |
| Adventure Book   | Python (Flask or CLI)       | Das               | Text-based story flow |
| Furby            | JavaScript + Python (Flask) | Joanna & Alondra  | JS UI (Alondra), Python logic (Joanna/Das) |
| Dear Diary       | Java + HTML/CSS/JS          | Joanna & Alondra  | Java logic (Joanna), UI/graphics (Alondra) |

---

## 🗂️ Project Structure
```
toybox/
├── index.html           # Main menu interface (Toybox)
├── adventure/
│   └── index.html       # Choose Your Own Adventure toy
├── furby/
│   ├── app.py           # Flask backend for Furby
│   └── templates/
│       └── furby.html   # Furby web interface
├── diary/
│   └── index.html       # Dear Diary toy
├── notes.txt            # Scratchpad file (gitignored)
├── README.md            # Hackathon notes & documentation
└── .gitignore           # Files to exclude from version control
```


---

## 📝 Notes & Ideas

- Each toy can be launched in a new tab or iframe.
- Use `window.open()` or dynamic content switching in JS.
- No animation needed — keep interactions simple and fun.
- Use pixel fonts, bright colors, and sound effects for the retro vibe.

---

## ⏰ Milestones

| Time        | Goal |
|-------------|------|
idk robot buddy, timed goals might be too might pressure.

---

## 💡 Paste ChatGPT Snippets Here

Use this section to copy helpful responses from ChatGPT during development.

---

