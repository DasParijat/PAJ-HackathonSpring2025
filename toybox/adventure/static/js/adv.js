// Adventure Game JavaScript
async function adventureClick() {
    const input = document.getElementById('message-input');
    const response = document.getElementById('response');

    try {
        const res = await fetch('/interact', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ message: input.value })
        });
        
        const data = await res.json();
        response.textContent = data.message;
        
        input.value = '';
    } catch (error) {
        response.textContent = 'what the scallop';
    }
}

// Allow Enter key to submit
document.getElementById('message-input').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        adventureClick();
    }
});