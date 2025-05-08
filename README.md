# UserTrackr 🧭

**UserTrackr** is a simple Java application that demonstrates how to use Hibernate ORM with an H2 embedded database to persist user data. This project is ideal for learning Hibernate basics, JPA annotations, and how to connect Java applications to lightweight in-memory or file-based databases.

---

## 📦 Features

- Java + Hibernate integration
- JPA annotations for ORM mapping
- In-memory and file-based H2 database support
- Automatic schema generation (`hibernate.hbm2ddl.auto=update`)
- Clean and modular structure (Maven)

---

## 🛠️ Tech Stack

- Java 17+
- Hibernate 5.6
- H2 Database
- Maven
- JPA (Jakarta/Javax Persistence API)

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 17 or higher
- Maven 3.6+
- IDE like IntelliJ IDEA or Eclipse (optional but recommended)

### Clone the Repo

```bash
git clone https://github.com/yourusername/UserTrackr.git
cd UserTrackr
Build the Project

mvn clean install
Run the App
You can run the app using your IDE or the terminal:


mvn exec:java -Dexec.mainClass="org.example.MainApp"
📂 Project Structure

src/
└── main/
    ├── java/
    │   └── org.example/
    │       ├── User.java
    │       └── MainApp.java
    └── resources/
        └── hibernate.cfg.xml
🗃️ Database Configuration
You can switch between in-memory and file-based databases in hibernate.cfg.xml:

In-Memory (temporary, disappears on exit)

<property name="hibernate.connection.url">jdbc:h2:mem:testdb</property>
File-Based (persistent, saved in /data)

<property name="hibernate.connection.url">jdbc:h2:./data/mydb</property>
To inspect the database, run:

java -jar ~/.m2/repository/com/h2database/h2/2.1.214/h2-2.1.214.jar
Then use JDBC URL jdbc:h2:./data/mydb and username sa (leave password blank).

✍️ Example Usage

User user = new User("Alice", "alice@example.com");
session.save(user);
🧪 Future Ideas
REST API with Spring Boot

Web interface for managing users

Export to CSV/JSON

Integration tests

📝 License
MIT License. Feel free to fork, modify, and share!
