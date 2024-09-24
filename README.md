# Documentation du Service REST CV24v2
L'application CV24v2 est un service REST développé dans le cadre du projet de Langage Web 2 - XML, pour le module M1 GIL, projet de l'année 2024. L'objectif principal de cette application est de permettre la gestion des documents CV24 conformes à la spécification définie lors dans un fichier XSD, ainsi que la validation de son fonctionnement à l'aide d'une collection de tests Postman.
Bienvenue dans la documentation de l'application CV24v2. Cette documentation fournit des informations sur les configurations principales de l'application.


Le nom de l'application est défini comme cv24v2.
Base de données PostgreSQL

## Configuration

### Remarque 
Il est nécessaire d'avoir la version LTS de JAVA ( java 17).

### Démarrage de l'application
* Pour démarrer l'application avec la base de données sur Docker qui est la configuration de base: 
  taper la commande:
    
    mvn spring-boot:run 


### Base de données PostgreSQL avec Docker

Une configuration alternative pour la base de données PostgreSQL avec Docker est également disponible :

    URL: jdbc:postgresql://localhost:5435/xmldatabase
    Nom d'utilisateur: userxml
    Mot de passe: secretxml

### Paramètres de débogage

Les paramètres de débogage sont configurés comme suit :

    Niveau de journalisation pour les requêtes web: DEBUG
    Inclure la pile d'erreurs dans les réponses d'erreur: Toujours

Remarques

Assurez-vous d'avoir correctement configuré les paramètres de votre base de données avant de lancer l'application.


## Description du service REST
#### I - Fonctionnalités
##### I.1 - Page d'accueil

La page d'accueil affiche les informations suivantes :

* Nom du projet
* Numéro de version
* Noms et prénoms de chaque membre de l'équipe
* Logo de l'Université de Rouen

##### I.2 - Aide

La page d'aide affiche la liste des opérations gérées par le service REST, avec pour chaque opération :

* URL
* Méthode attendue
* Résumé de l'opération

##### I.3 - Liste des CV

* Format XML: Affiche la liste des CV stockés au format XML, avec des informations spécifiques pour chaque CV.
* Format HTML: Affiche la liste des CV stockés au format HTML.

##### I.4 - Détail d'un CV

* Format XML: Affiche le contenu complet d'un CV spécifique au format XML.
* Format HTML: Affiche le contenu complet d'un CV spécifique au format HTML.

##### I.5 - Ajout et Suppression d'un CV dans la base

Permet d'ajouter et de supprimer un CV dans la base de données.

#### II - Réalisation

* Gestion de la persistance des données
* Création des contrôleurs
* Validation XML par le schéma XSD
* Gestion des erreurs
* Validation Postman

#### III - Bonus

Divers bonus peuvent être réalisés, tels que la gestion avancée des erreurs, une API de recherche, et l'implémentation de la sécurité avec Spring Security.

Cette application vise à être complète et fonctionnelle, offrant une gestion efficace des CV24 conformes à la spécification définie.