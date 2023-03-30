var TodoItem = /** @class */ (function () {
    function TodoItem(description, dueDate) {
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = false;
    }
    TodoItem.prototype.completeTheTask = function () {
        this.isComplete = true;
    };
    return TodoItem;
}());
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.items = [];
    }
    TodoList.prototype.addItem = function (description, dueDate) {
        var newItem = new TodoItem(description, dueDate);
        this.items.push(newItem);
    };
    TodoList.prototype.removeItem = function (index) {
        this.items.splice(index, 1);
    };
    TodoList.prototype.completeTheTask = function (index) {
        var item = this.items[index];
        item.completeTheTask();
    };
    TodoList.prototype.printList = function () {
        console.log('Todo List:');
        this.items.forEach(function (item, index) {
            var status = item.isComplete ? '[+]' : '[ ]';
            console.log("".concat(index + 1, ". ").concat(status, " ").concat(item.description, " (Due: ").concat(item.dueDate.toLocaleDateString(), ")"));
        });
    };
    return TodoList;
}());
var todoList = new TodoList();
todoList.addItem('Buy Apples', new Date('2022-05-12'));
todoList.addItem('Commit the typescript typos', new Date('2022-03-30'));
todoList.addItem('Buy Data Cable', new Date('2022-03-30'));
todoList.completeTheTask(0);
todoList.removeItem(1);
todoList.printList();
