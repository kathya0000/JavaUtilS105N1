
mvn compile
mvn exec:java -Dexec.mainClass="tu.paquete.Main" -Dexec.args="listDirectory ruta/a/tu/directorio"
mvn exec:java -Dexec.mainClass="tu.paquete.Main" -Dexec.args="listDirectoryTree ruta/a/tu/directorio"
mvn exec:java -Dexec.mainClass="tu.paquete.Main" -Dexec.args="saveDirectoryTree ruta/a/tu/directorio output.txt"
mvn exec:java -Dexec.mainClass="tu.paquete.Main" -Dexec.args="readTextFile ruta/a/tu/archivo.txt"
mvn exec:java -Dexec.mainClass="serializacion.Main" -Dexec.args="ruta/a/tu/archivo.txt"


