### 1. **Compile the Java files**

   ```shell
   javac -d out -cp src src/*.java
   ```

- `javac` → Java compiler.
- `-d out` → Specifies the output directory for compiled class files.
- `-cp src` → Sets the classpath to `src` (if there are dependencies within the source folder).
- `src/*.java` → Compiles all Java files in the `src` directory.

### 2. **Run the compiled Java program**

   ```shell
   java -cp out Program
   ```

- `java` → Java runtime.
- `-cp out` → Specifies the classpath to the compiled files.
- `Program` → The main class containing `public static void main(String[] args)`.

### 3. **Create a JAR file**

Manifest file correctness
Create `MANIFEST.MF` in project root directory with the following content:

   ```
   Manifest-Version: 1.0
   Main-Class: Program
   ```

(Make sure that a `Program` Class exists in src and it contains `public static void main(String[] args)`)

   ```shell
   jar cvfm myapp.jar MANIFEST.MF -C out .
   ```

- `jar` → JAR utility to package the application.
- `c` → Create a new JAR file.
- `v` → Verbose mode (lists files being added).
- `f` → Specifies the output filename (`myapp.jar`).
- `m` → Specifies the manifest file (`MANIFEST.MF`).
- `-C out .` → Changes to the `out` directory and adds all files inside.

### 4. **Run the JAR file**

   ```shell
   java -jar myapp.jar
   ```

- Runs the application using the JAR file.