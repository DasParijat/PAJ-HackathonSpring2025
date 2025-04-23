# app.py for furby
from flask import Flask, render_template, request, jsonify

app = Flask(__name__)

# Furby's mood state
furby_state : dict = {
    "mood": "happy",
    "energy": 100
}

@app.route('/')
def home():
    return render_template('furby.html')

@app.route('/interact', methods=['POST'])
def interact():
    user_input : str = request.json.get('message', '').lower()
    
    # Simple response logic based on keywords
    response : dict = {
        "message": "insert message here",
        "mood": furby_state["mood"]
    }
    
    if "sleep" in user_input:
        furby_state["mood"] = "sleepy"
        response["message"] = "Me sleepy... zzzz"
    elif "food" in user_input or "feed" in user_input:
        furby_state["mood"] = "happy"
        response["message"] = "Yummy! Nom nom nom!"
    elif "play" in user_input:
        furby_state["mood"] = "happy"
        response["message"] = "yo playtime is awesome"
    
    return jsonify(response)

if __name__ == '__main__':
    app.run(debug=True)