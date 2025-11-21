import socket
import random



# Crear el socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# enlazamos el socket a una dirección ip y a un puerto
server_address= ('192.168.10.79', 1025)
server_socket.bind(server_address)

# ponemos el socket en modo escucha
server_socket.listen(5) #permitimos hasta 5 conexiones 
print(f"servidor escuchando en {server_address}")

while True:

# Aceptar conexiones
    client_socket,client_address = server_socket.accept()
    print(f"conexión aceptada de {client_address}")
# Manejar la conexión
    response = "Buenas tardes"
    client_socket.sendall(response.encode('utf-8')) # Enviar respuesta
    data = client_socket.recv(1024).decode('utf-8') #Recibir datos
    print(f"Datos recibidos: {data}")
    

# cerramos la conexión
    client_socket.close()






