class TodoItem {
    description: string;
    dueDate: Date;
    isComplete: boolean;

    constructor(description: string, dueDate: Date) {
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = false;
    }

    completeTheTask() {
        this.isComplete = true;
    }
}

class TodoList {
    items: TodoItem[];

    constructor() {
        this.items = [];
    }

    addItem(description: string, dueDate: Date) {
        const newItem = new TodoItem(description, dueDate);
        this.items.push(newItem);
    }

    removeItem(index: number) {
        this.items.splice(index, 1);
    }

    completeTheTask(index: number) {
        const item = this.items[index];
        item.completeTheTask();
    }

    printList() {
        console.log('Todo List:');
        this.items.forEach((item, index) => {
            const status = item.isComplete ? '[+]' : '[ ]';
            console.log(`${index + 1}. ${status} ${item.description} (Due: ${item.dueDate.toLocaleDateString()})`);
        });
    }
}



const todoList = new TodoList();

todoList.addItem('Buy Apples', new Date('2022-05-12'));
todoList.addItem('Commit the typescript typos', new Date('2022-03-30'));
todoList.addItem('Buy Data Cable', new Date('2022-03-30'));

todoList.completeTheTask(0);

todoList.removeItem(1);

todoList.printList();