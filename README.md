# Comandos do Git

1. git branch -a // listar branchs já criadas.
2. git branch -d branch-test // apagar a branch selecionada.
3. git checkout -b branch-test // para criar a branch e acessá-la em seguida.
4. git checkout branch-test // para acessar uma branch já criada.
5. git pull // atualizar a branch atual, baixa atualizações já feitas e sincroniza os arquivos com a branch remota.
**Recomendado desenvolver neste momento**
6. git merge develop // mergear a branch develop com a branch atual.
7. git add . // preparar staged.
8. git commit -m "breve descrição da alteração" // realizar o commit, grava as atualizações na branch atual.
9. git push origin branch-test // "publicar" os commits realizados para o repositório remoto.
10. Sequenciar no Github. Criar pull request e aprovar o merge para a main.

Bônus:

1. git status // verificar estado dos arquivos/diretórios, e qual branch você está.
2. git config --edit // editar configurações de login.
3. git log // listar histório de commits já realizados.
4. git reset --hard HEAD~ // apagar o commit mais recente, segundo o histórico (git log).
