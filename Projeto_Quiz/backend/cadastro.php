<?php 
include("conexao.php");



$nome = $_POST['nome'];
$email = $_POST['email'];
$senha = $_POST['senha'];



$sql = "INSERT into cadastro (nome, email, senha)
values ('$nome', '$email', '$senha')";  




if(mysqli_query($conexao, $sql)){
    echo "Usuário Cadastrado com sucesso";
} else {
    echo "Erro: " . mysqli_error($conexao);
}




mysqli_close($conexao);

?>