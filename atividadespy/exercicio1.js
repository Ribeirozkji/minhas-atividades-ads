// // // //01)
// // // function operacoesMatematicas(x, y) {
// // //     let soma = x + y;
// // //     let subtracaocao = x - y;
// // //     let multiplicacao = x * y;
// // //     let divisao = x / y;
    
// // //     return {
// // //         soma: soma,
// // //         subtracaocao: subtracaocao,
// // //         multiplicacao: multiplicacao,
// // //         divisao: divisao
// // //     };
// // // }

// // // let resultado = operacoesMatematicas(10, 5);
// // // document.write("Soma: " + resultado.soma);
// // // document.write("subtracaoção: " + resultado.subtracaocao);
// // // document.write("Multiplicação: " + resultado.multiplicacao);
// // // document.write("Divisão: " + resultado.divisao);

// // 03
// // function calcularIdade() {
// //     let anoNascimento = parseInt(prompt("Digite o ano que você nasceu: "));
// //     let anoAtual = 2025;

// //     let idade = anoAtual - anoNascimento;

// //     if (idade >= 18) {
// //         document.write("Entrada Permitida")
// //     }
// //     else {
// //         document.write("Entrada negada")
// //     }
// // }

// // calcularIdade();

// //04)
// // function calcularNota() {
// //     let nota1 = parseFloat(prompt("Digite sua primeira nota:"));
// //     let nota2 = parseFloat(prompt("Digite sua segunda nota:"));
// //     let nota3 = parseFloat(prompt("Digite sua terceira nota:"));
// //     let nota4 = parseFloat(prompt("Digite sua quarta nota:"));

// //     media = nota1 + nota2+ nota3 + nota4 /3;

// //     if (media <= 7){
// //         alert("Aprovado");
// //     }else if (media <= 6){
// //         alert("Recuperação");
// //     }else 
// //         alert("Reprovado")
// //     {

// //     }

// // }
// // calcularNota();

// //05)
// function imprimirNome(){
// let mensagem = document.getElementById("entrada").value;
// document.getElementById("saida").innerHTML = "Você Escreveu: " + mensagem;


// }
// imprimirNome();

// //06)
// function calcular(){
// let num1 = parseFloat(document.getElementById("num1").value); 
// let num2 = parseFloat(document.getElementById("num1").value);

// let soma  = num1 + num2;
// let multiplicacao = num1 * num2;
// let subtracao = num1 - num2;
// let divisao = num1 / num2;



// document.getElementById("soma").innerHTML = "Resultado: " + soma;
// document.getElementById("multiplicacao").innerHTML = "Resultado: " + multiplicacao;
// document.getElementById("subtracao").innerHTML = "Resultado: " + subtracao;
// document.getElementById("divisao").innerHTML = "Resultado: " + divisao;

// document.getElementById("soma").style.color ="green";
// document.getElementById("multiplicacao").style.color ="red";
// document.getElementById("subtracao").style.color ="blue";
// document.getElementById("divisao").style.color ="orange";

// }
// calcular();