### **3. Running the RMI Application**
#### **Step 1: Compile all Java files**
```sh
javac RemoteInterface.java RemoteObject.java Server.java Client.java
```

#### **Step 2: Start the RMI Registry**
```sh
rmiregistry
```
_(Run this command in the background before starting the server)_

#### **Step 3: Run the Server**
```sh
java Server
```

#### **Step 4: Run the Client**
```sh
java Client
```
### **If you're using IntelliJ just run the Server & Client diretctly**  

---

### **4. Expected Output**
On the client side, the output will be:
```sh
Response from server: Hello from the remote server!
```

