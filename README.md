# 📂 JAVA FILE MANAGEMENT

## 📄 PROJECT DESCRIPTION

This project involves handling directories, reading files, serializing objects. It is structured in progressive levels of complexity.

### 🔹 KEY FEATURES

- ✔ List directory contents alphabetically
- ✔ Recursively scan directory trees
- ✔ Save file information to a `.txt` file
- ✔ Read and display `.txt` file contents
- ✔ Serialize and deserialize Java objects

---

## 💻 TECHNOLOGIES USED

- ✔ Java 17 or higher
- ✔ Apache Commons Configuration (optional)
- ✔ Java Properties files for configuration
- ✔ Maven

---

## 📋 REQUIREMENTS

- ✔ Eclipse, IntelliJ, or any compatible Java IDE
- ✔ Use **relative paths** instead of absolute paths
- ✔ Use `File.separator` for cross-platform compatibility

---

## 🛠️ INSTALLATION & SETUP

1️⃣ Clone the repository:

```bash
git clone <https://github.com/luriguso/TaskS105JavaUtils.git>
2️⃣ Navigate to the project directory:

bash
Copiar
Editar
cd TaskS105JavaUtils
3️⃣ Ensure the directory structure is correct:

css
Copiar
Editar
src/main/java/
src/main/resources/
target/classes/
4️⃣ Install dependencies (if using Maven or Gradle):

bash
Copiar
Editar
# Using Maven
mvn install

# OR using Gradle
gradle build
▶️ EXECUTION INSTRUCTIONS
🔹 LEVEL 1: FILE & DIRECTORY OPERATIONS
✔ List directory contents alphabetically:

bash
Copiar
Editar
java -cp target/classes level1.exercise1.main.MainDirectory  ".\src\level1"
✔ Recursively list directory tree:

bash
Copiar
Editar
java -cp target/classes level1.exercise2.main.Main ".\src\level1"
✔ Save directory listing to a .txt file:

bash
Copiar
Editar
java -cp target/classes level1.exercise3.main.Main  ".\src\level1"
✔ Read and display a .txt file:

bash
Copiar
Editar
java -cp target/classes level1.exercise4.main.Main ".\src\level1\exercise4\files"
✔ Serialize and deserialize a Java object:

bash
Copiar
Editar
java -cp target/classes level1.exercise5.main.Main

java -cp target/classes level1.exercise5.main.Deserialize
🔹 LEVEL 2: CONFIGURATION-BASED EXECUTION
✔ Execute using a .properties config file:

bash
Copiar
Editar
java -cp target/classes level2.exercise1.main.Main
✔ Sample config.properties file:

ini
Copiar
Editar
directory.to.read=src
output.file.name=terminalWriter.txt
output.file.directory=src/level2/exercise1/files

🌐 DEPLOYMENT
✔ Prepare your environment before running

✔ Ensure all input files are present in the correct locations

✔ Store encryption keys securely and never hardcode them

🤝 CONTRIBUTIONS
Contributions are welcome! Follow these steps:

1️⃣ Fork the repository
2️⃣ Create a new branch:

bash
Copiar
Editar
git checkout -b feature/NewFunctionality
3️⃣ Make your changes and commit them:

bash
Copiar
Editar
git commit -m "Add new functionality"
4️⃣ Push your changes:

bash
Copiar
Editar
git push origin feature/NewFunctionality
5️⃣ Submit a pull request

📌 NOTES
✔ Always ensure the input file exists before encryption

✔ Test your code thoroughly before pushing

✔ Follow GitHub contribution best practices

🚀 HAPPY CODING! ✨
