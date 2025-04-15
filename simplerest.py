from flask import Flask,request,jsonify

app = Flask(__name__)
@app.route('/add',methods=['GET'])
def add():
    num1 = float(request.args.get('num1'))
    num2 = float(request.args.get('num2'))
    result = num1+num2
    return jsonify({"Result":result})

if __name__ == '__main__':
    app.run(debug=True)

# if __name__ == '__main__':
#     app.run(debug=True)
