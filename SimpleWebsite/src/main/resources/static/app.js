fetch('/api/users')
    .then(response => response.json())
    .then(data => {
        const userList = document.getElementById('userList');
        data.forEach(user => {
            const userElement = document.createElement('p');
            userElement.textContent = `${user.name} (${user.email})`;
            userList.appendChild(userElement);
        });
    })
    .catch(error => console.error('Error:', error));
