# Fichier de commandes

## Fichier original (moyenne.ml)

### Commande pour générer le fichier OCAML
ECHEC : Test 1 (catala ocaml) --> moyenne.ml
```bash
catala ocaml moyenne.catala_fr
```
Test 2 (catala api_web) --> moyenne_api_web.ml
```bash
catala api_web moyenne.catala_fr
```

### Commande pour générer le fichier schéma json
```bash 
 catala json_schema moyenne.catala_fr --scope Moyenne 
```

### Commande pour générer le fichier javascript à partir d'ocaml
#### Conversion du fichier ocaml en bytecode
```bash
ocamlfind ocamlc -package js_of_ocaml -package js_of_ocaml-ppx -linkpkg -o moyenne_api_web.byte moyenne_api_web.ml
```
#### Conversion fichier ocaml bytecode en js
```bash
js_of_ocaml -o moyenne_api_web.js moyenne_api_web.ml
```



## Fichier test (moyenne_test.ml)

### Commande pour générer le fichier OCAML
Test 1 (catala ocaml) --> moyenne_test.ml
```bash
catala ocaml moyenne_test.catala_fr
```
Test 2 (catala api_web) --> moyenne_test_api_web.ml
```bash
catala api_web moyenne_test.catala_fr
```

### Commande pour générer le fichier schéma json
```bash 
catala json_schema moyenne_test.catala_fr --scope Moyenne 
```
