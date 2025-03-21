The `String` class in Java is part of `java.lang` and provides many useful methods for handling and manipulating
strings.

### **1. Creation & Basic Info**

```java
String str = "Hello, World!";
```

- `length()` – Returns the number of characters in the string.
  ```java
  int len = str.length();  // 13
  ```
- `isEmpty()` – Checks if the string is empty (`""`).
  ```java
  boolean empty = str.isEmpty();  // false
  ```
- `isBlank()` – Checks if the string is empty or contains only white spaces (Java 11+).
  ```java
  boolean blank = "   ".isBlank();  // true
  ```

### **2. Accessing Characters**

- `charAt(int index)` – Returns the character at a specific index.
  ```java
  char ch = str.charAt(1);  // 'e'
  ```
- `toCharArray()` – Converts the string into a character array.
  ```java
  char[] chars = str.toCharArray();
  ```

### **3. Case Conversion**

- `toLowerCase()` – Converts to lowercase.
  ```java
  String lower = str.toLowerCase();  // "hello, world!"
  ```
- `toUpperCase()` – Converts to uppercase.
  ```java
  String upper = str.toUpperCase();  // "HELLO, WORLD!"
  ```

### **4. Searching & Matching**

- `contains(CharSequence seq)` – Checks if a sequence is in the string.
  ```java
  boolean hasHello = str.contains("Hello");  // true
  ```
- `startsWith(String prefix)` – Checks if it starts with a given prefix.
  ```java
  boolean starts = str.startsWith("Hello");  // true
  ```
- `endsWith(String suffix)` – Checks if it ends with a given suffix.
  ```java
  boolean ends = str.endsWith("World!");  // true
  ```
- `indexOf(String str)` – Returns the first index of the substring.
  ```java
  int index = str.indexOf("o");  // 4
  ```
- `lastIndexOf(String str)` – Returns the last index of the substring.
  ```java
  int lastIndex = str.lastIndexOf("o");  // 8
  ```
- `matches(String regex)` – Checks if the string matches a regular expression.
  ```java
  boolean match = str.matches(".*World!");  // true
  ```

### **5. Substring Extraction**

- `substring(int beginIndex)` – Extracts from `beginIndex` to end.
  ```java
  String sub = str.substring(7);  // "World!"
  ```
- `substring(int beginIndex, int endIndex)` – Extracts from `beginIndex` to `endIndex - 1`.
  ```java
  String sub = str.substring(0, 5);  // "Hello"
  ```

### **6. Modification**

- `replace(char oldChar, char newChar)` – Replaces characters.
  ```java
  String replaced = str.replace('o', 'x');  // "Hellx, Wxrld!"
  ```
- `replaceAll(String regex, String replacement)` – Replaces substrings using regex.
  ```java
  String replacedAll = str.replaceAll("o", "x");  // "Hellx, Wxrld!"
  ```
- `trim()` – Removes leading and trailing whitespace.
  ```java
  String trimmed = "  Hello  ".trim();  // "Hello"
  ```
- `strip()` – Removes leading/trailing white spaces (Unicode-aware, Java 11+).
  ```java
  String stripped = "  Hello  ".strip();  // "Hello"
  ```

### **7. Splitting & Joining**

- `split(String regex)` – Splits the string into an array.
  ```java
  String[] parts = str.split(", ");  // ["Hello", "World!"]
  ```
- `join(CharSequence delimiter, CharSequence... elements)` – Joins elements with a delimiter.
  ```java
  String joined = String.join("-", "Java", "String", "Methods");  // "Java-String-Methods"
  ```

### **8. Comparison**

- `equals(Object anotherString)` – Checks for equality.
  ```java
  boolean eq = str.equals("Hello, World!");  // true
  ```
- `equalsIgnoreCase(String anotherString)` – Case-insensitive comparison.
  ```java
  boolean eqIgnore = str.equalsIgnoreCase("hello, world!");  // true
  ```
- `compareTo(String anotherString)` – Lexicographic comparison.
  ```java
  int cmp = "abc".compareTo("abd");  // -1
  ```
- `compareToIgnoreCase(String anotherString)` – Case-insensitive lexicographic comparison.
  ```java
  int cmpIgnore = "abc".compareToIgnoreCase("ABC");  // 0
  ```

### **9. Formatting**

- `format(String format, Object... args)` – Formats a string.
  ```java
  String formatted = String.format("Age: %d", 25);  // "Age: 25"
  ```

Java's `String` class has several **static methods** that perform operations without requiring an instance of `String`.
Here are the key static methods:

---

### **1. `String.valueOf()` – Convert to String**

Converts different data types to a `String`.

```java
String str1 = String.valueOf(123);     // "123"
String str2 = String.valueOf(3.14);    // "3.14"
String str3 = String.valueOf(true);    // "true"
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String str4 = String.valueOf(chars);   // "Hello"
```

---

### **2. `String.format()` – Formatting Strings**

Formats a string using placeholders.

```java
String formatted = String.format("Name: %s, Age: %d", "Alice", 25);
// "Name: Alice, Age: 25"
```

- `%s` → String
- `%d` → Integer
- `%f` → Floating point
- `%.2f` → Two decimal places

---

### **3. `String.join()` – Join Strings with Delimiter**

Joins multiple strings with a separator.

```java
String joined = String.join("-", "Java", "String", "Methods");
// "Java-String-Methods"
```

### **4. `String.valueOf()` vs `toString()`**

- `String.valueOf(null)` → `"null"` (safe, doesn't throw exception)
- `null.toString()` → Throws `NullPointerException`

```java
Object obj = null;
System.out.println(String.valueOf(obj));  // "null"
// System.out.println(obj.toString());   // Throws NullPointerException
```

### **5. `String.compareTo()` (Not Static, but Important)**

This is an **instance method**, but important for comparisons.

- **Returns `0`** if strings are equal.
- **Returns negative** if the calling string is smaller.
- **Returns positive** if the calling string is greater.

```java
int result = "apple".compareTo("banana");  // Negative (-1)
int result2 = "banana".compareTo("apple"); // Positive (1)
int result3 = "apple".compareTo("apple");  // Zero (0)
```

For **case-insensitive comparison**, use:

```java
int result4 = "Apple".compareToIgnoreCase("apple");  // 0
```
