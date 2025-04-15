from flask import Flask, jsonify, request


app = Flask(__name__)


# In-memory "database"
tasks = []


# Home route
@app.route('/')
def home():
    return "Simple CRUD REST API"


# CREATE
@app.route('/tasks', methods=['POST'])
def create_task():
    data = request.get_json()
    task = {
        'id': len(tasks) + 1,
        'title': data.get('title'),
        'done': False
    }
    tasks.append(task)
    return jsonify(task), 201


# READ
@app.route('/tasks', methods=['GET'])
def get_tasks():
    return jsonify(tasks)


# UPDATE
@app.route('/tasks/<int:task_id>', methods=['PUT'])
def update_task(task_id):
    for task in tasks:
        if task['id'] == task_id:
            data = request.get_json()
            task['title'] = data.get('title', task['title'])
            task['done'] = data.get('done', task['done'])
            return jsonify(task)
    return jsonify({'error': 'Task not found'}), 404


# DELETE
@app.route('/tasks/<int:task_id>', methods=['DELETE'])
def delete_task(task_id):
    global tasks
    tasks = [task for task in tasks if task['id'] != task_id]
    return jsonify({'message': 'Task deleted'})


# Run the app
if __name__ == '__main__':
    app.run(debug=True)
