
# Oeuvre d'art

Nous avons voulu créer un projet de A à Z, comprenant la réalisation de tests 
ainsi que l'utilisation de githooks.


## Badges


[![Junit Version](https://img.shields.io/badge/Junit-v.4.11-blue)](https://mvnrepository.com/artifact/junit/junit/4.11)


## Authors

- [@zlahmar](https://github.com/zlahmar)
- [@Pierrechami](https://github.com/Pierrechami)
- [@MatisGalvin](https://github.com/MatisGalvin)

## Étapes de la réalisation du projet
<ol>

<details>
  <summary>Etape 1: GitHooks </summary><ol>
  - Création de la branche dev.<br/>
  - Création des premiers githooks.<br/>
  - Création du commit-msg: Si le commit ne commence pas par " Matis, Zainab ou Pierre", le commit ne passe pas.<br/>
  - Commencer le README. <br/>

  <br/>
 </ol>
</details>

<details>
  <summary>Etape 2: Coder les classes </summary><ol>
    - PaletteDeCouleur<br/>
    - Peinture<br/>
    - Sculpture<br/>
    - Oeuvre<br/>
    - Artist<br/>
    - supportException : Envoie un message d'exception si le support pour la peinture est vide.<br/>
    - Affichable<br/>
    - App (main)<br/>
     <br/>
  </ol>
  Une œuvre est créée par un artiste, une œuvre peut-être une peinture ou une sculpture, une oeuvre a un nom, une année de parution et un prix de vente..<br/>
  Un artiste est connu par son nom, prénom, âge et bien sûr la liste d'oeuvres qu'il a réalisée..<br/>
  <br/>
</details>

<details>
  <summary>Etape 3: Commit </summary><ol>
  Faire un merge request sur la branche de dev, tester les 1er commit et push.<br/>
  <br/>
 </ol>
</details>

<details>
  <summary>Etape 4: Tests unitaires  </summary><ol>
    - Test Enum : PaletteDeCouleur;<br/>
    - Test de la class Artist;<br/>
    - Test de la class Peinture;<br/>
    - Tester une exeption;<br/>
    <br/>
 </ol>
</details>

<details>
  <summary>Etape 5: PRE-PUSH  </summary><ol>
  - Commit, push et merge des tests.<br/>
  - Modifier et tester le Hook du PRE-PUSH ansi que le msg : Poser une condition pour ne pas pouvoir push dans une branche protéger.<br/>   
 </ol>
</details>

<details>
  <summary>Etape 6: La fin </summary><ol>
  Finaliser les dernières touches puis tirer une branche de staging depuis notre branche de dev.<br/>
  <br/>
 </ol>
</details>
</ol>

## Ce que nous avons appris

Il nous a fallut créer notre propre programme, non pas à partir d'un énnoncé mais à partir d'une idée qui nous plaisait.
Détailler le programme en plusieurs classes et construire la logique qui allait les reliées n'a pas non plus été si simple.
L'utilisation des GitHooks a été très utile pour rendre nos commit homogènes.
Nous n'avons pas pu exploiter leur pleine puissance mais il aurait été interessant de lancer nos test à chaques push par exemple.

## Tech Stack

Java, Maven, Junit


## FAQ

#### Pourquoi faire des tests unitaires ?

Le principal intérêt est de s'assurer que le code répond toujours aux besoins même après d'éventuelles modifications.

#### Est-ce que nous avons tout testé ?

Non, il faudrai pousser encore plus loin afin d'assurer une réelle robustesse au niveau de nos classes etc...


## Vous voulez nous faire des retours ?

Si vous avez une question ou des conseils, vous pouvez nous contacter via nos adresses mail EPSI.
