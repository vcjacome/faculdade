# Comandos do Git

1. git branch -a // listar branchs já criada.
2. git checkout -b "<branch-x>" // para criar a branch.
3. git pull // atualizar a branch, baixa atualizações já feitas e sincroniza os arquivos com a branch remota.
3. git merge develop // mergear a develop com a branch já selecionada.
4. git add . // preparar staged.
5. git commit -m "<breve descrição da alteração>" // realizar o commit, gravar a atualização.
6. git push origin <branch-x> // subir o commit na branch selecionada para o Bitbucket.
7. Sequenciar no Github. Criar pull request e aprovar o deploy para a main.

Bônus:

1. git status // verificar qual branch você está selecionada.
2. git config --edit // editar configurações de login.
3. git log // listar commits já realizados.
4. git reset --hard HEAD~ // apagar o commit anterior, segundo o git log.
