@echo off
set JAVA_HOME="C:\Program Files\Java\jre-9\bin"

%JAVA_HOME%\java --module-path ./libs --module soat.vending.machine.gui/fr.soat.vending.machine.VendingMachine

echo -- With automatic module
%JAVA_HOME%\java --module-path "./libs;./libs-legacy" --module soat.vending.machine.gui/fr.soat.vending.machine.VendingMachine

echo -- With unnamed module
%JAVA_HOME%\java --module-path ./libs --class-path ./libs-legacy/tea-maker-legacy-1.0-SNAPSHOT.jar --module soat.vending.machine.gui/fr.soat.vending.machine.VendingMachine

pause