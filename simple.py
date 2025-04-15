from flask import Flask,request,jsonify

app = Flask(__name__)

converstionrate = 0.13

@app.route('/convert',methods=['GET'])
def converter():
    inr = request.args.get('inr')
    if inr:
        inr_val = float(inr)
        usd_val = inr_val * converstionrate
    return jsonify({"inr":inr_val,"USD":usd_val})



if __name__== '__main__':
    app.run(debug=True)
