# app.py for adventure
from flask import Flask, render_template, request, jsonify

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('adv.html')

@app.route('/interact', methods=['POST'])
def interact():
    user_input : str = request.json.get('message', '').lower()
    
    # Simple response logic based on keywords
    response : dict = {
        "message": "insert message here",
    }
    
    if "start" in user_input:
        response["message"] = "You find yourself in a dark forest. What do you want to do?"
    elif "explore" in user_input:
        response["message"] = "You explore the forest and find a treasure chest!"
    elif "open" in user_input:
        response["message"] = "You open the chest and find a pile of gold coins!"
    elif "leave" in user_input:
        response["message"] = "You leave the forest with your treasure."
    
    return jsonify(response)

if __name__ == '__main__':
    app.run(debug=True)