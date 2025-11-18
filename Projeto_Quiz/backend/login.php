<?php
include("conexao.php");


$email = $_POST['email'];
$senha = $_POST['senha'];



$sql = "INSERT into login ( email, senha)
values ('$email', '$senha')";  



if(mysqli_query($conexao, $sql)){
    echo "Usuário Logou com sucesso";
} else {
    echo "Erro: " . mysqli_error($conexao);
}




mysqli_close($conexao);
?>