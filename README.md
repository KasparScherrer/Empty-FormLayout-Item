# Empty FormLayout Item

## How to install (maven)
````
<dependency>
   <groupId>ch.carnet.kasparscherrer</groupId>
   <artifactId>emptyformlayoutitem</artifactId>
   <version>1.0.0</version>
</dependency>
````
````
<repository>
   <id>vaadin-addons</id>
   <url>http://maven.vaadin.com/vaadin-addons</url>
</repository>
````

## How to use
Just add `new EmptyFormLayoutItem()` to the formLayout where you want to leave the itemslot empty
````
formLayout.add(new EmptyFormLayoutItem());
````