import socket
import random



# Crear el socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Conectar al servidor en localhost y puerto 5000
client_socket.connect(('192.168.10.32', 2001))

# Recibir el mensaje del servidor (solicitud de nombre)
message = client_socket.recv(1024).decode('utf-8')
print(message)


# Enviar el nombre al servidor
name = input("")
client_socket.sendall(name.encode('utf-8'))

# Recibir el saludo del servidor
greeting = client_socket.recv(1024).decode('utf-8')
print(greeting)

# Cerrar la conexión
client_socket.close()




