@echo off
echo 🛠️  Limpando e construindo o projeto...
mvn clean package -DskipTests

echo ✅ Build concluída!

REM Criar diretório de saída
if not exist target mkdir target

REM Mover o JAR gerado
for %%F in (target\*.jar) do (
    if not "%%~nxF"=="original" (
        copy "%%F" target\app.jar
    )
)

echo 🚀 Artefato disponível em target\app.jar
