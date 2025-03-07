## **🔹 Steps in a Typical RMI Application**

### **1️⃣ Create a Remote Interface**
- Defines methods that clients can call remotely.
- Extends `java.rmi.Remote`.
- Each method must throw `RemoteException`.

### **2️⃣ Implement the Remote Object**
- Implements the remote interface.
- Extends `UnicastRemoteObject` to enable remote access.

### **3️⃣ Create the RMI Server**
- Creates an instance of the remote object.
- Registers it with the **RMI Registry** under a unique name.

### **4️⃣ Create the RMI Client**
- Looks up the remote object from the **RMI Registry**.
- Uses the **stub** (a proxy for the remote object).
- Calls methods on the stub as if it were a local object.

---

## **🔗 The RMI Workflow**
1. **Server registers a remote object**  
   → The remote object is bound to the **RMI registry**.  
2. **Client looks up the remote object**  
   → It gets a **stub** (a proxy for the remote object).  
3. **Client invokes methods on the stub**  
   → The stub forwards the request to the real object on the server.  
4. **Server processes the request**  
   → Executes the method and sends back the result.  
5. **Client receives the response**  
   → Uses the returned data just like a local method call.

---

### **Running this RMI Application**
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

### **Expected Output**
On the client side, the output will be:
```sh
Response from server: Hello from the remote server!
```

