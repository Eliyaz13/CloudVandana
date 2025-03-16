document.addEventListener("DOMContentLoaded", () => {
    const taskInput = document.getElementById("taskInput");
    const addButton = document.getElementById("add");
    const taskList = document.getElementById("taskList");

    add.addEventListener("click", () => {
        const taskText = taskInput.value.trim();
        if (taskText !== "") {
            const listItem = document.createElement("li");
            listItem.textContent = taskText;
            
            const removeButton = document.createElement("button");
            removeButton.textContent = "Remove";
            removeButton.addEventListener("click", () => {
                taskList.removeChild(listItem);
            });
            
            listItem.appendChild(removeButton);
            taskList.appendChild(listItem);
            taskInput.value = "";
        }
    });
});