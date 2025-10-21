function funcionarios (Dias_trabalhados, calcular_salario, Valor_salario) {
const Dias_trabalhados = 30;

 const calcular_salario = (Dias_trabalhados * 31.25);

 const Valor_salario = calcular_salario - (calcular_salario * 0.09) - (calcular_salario * 0.02);

  console.log("Salário líquido: R$", Valor_salario.toFixed(2));
}
module.exports = funcionarios;