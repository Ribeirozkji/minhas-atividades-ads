
# # # # # 01)
# # # # # def checar_semaforo():
# # # # #   cor = str(input("Escreva A Cor Do Semáforo: "))
# # # # #   if cor == "verde":
# # # # #     print("Siga")
# # # # #   elif cor == "Amarelo":
# # # # #     print("Atenção")
# # # # #   elif cor == "vermelho":
# # # # #     print("Pare")
# # # # #   else:
# # # # #     print("Cor Inválida")
    
# # # # # checar_semaforo()

# # # # 02)
# # # # def calculo_imc():
# # # #     imc = float(input("Digite o valor do IMC: "))
    
# # # #     if  imc < 18.5:
# # # #       print("Abaixo do peso")
# # # #     elif  18.5 <= imc < 24.9:
# # # #       print("Peso Normal")
# # # #     elif  25.0 <= imc < 29.9:
# # # #       print("Sobrepeso")
# # # #     else:
# # # #       print("Obesidade")

# # # # calculo_imc()

# # # # # 03)
# # # # def checar_elegibilidade():
# # # #   renda = int(input("Escreva o Valor da Renda: "))
# # # #   score = int(input("Escreva o Valor do Score: "))
  
# # # #   if renda >= 5000 and score >= 700:
# # # #     print("Cartão Premium Elegível")
# # # #   elif renda >= 2000 and score >= 600:
# # # #     print("Cartão Standard Elegível")
# # # #   else:
# # # #     print("Não elegível no momento")
    
    
# # # # checar_elegibilidade()

# # # # 04)
# # # # def sugerir_roupa():
# # # #   temperatura = int(input("Informe A Temperatura Atual: "))
  
# # # #   if temperatura == 30:
# # # #     print("Muito calor! Use roupas leves.")
# # # #   elif  18 <= temperatura <= 30:
# # # #     print("Clima agradável. Uma camiseta e calça são ideais. ")
# # # #   else:
# # # #     print("Está frio. Vista um casaco!")
    
# # # # sugerir_roupa()

# # # # 05)
# # # def verificar_vencedor():
# # #   placar_time_A = int(input("Escreva o Total De Votos do Time A: "))
# # #   placar_time_B = int(input("Escreva O Total De Votos do Time B: "))
  
# # #   if placar_time_A > placar_time_B:
# # #     print("Time A Venceu!")
# # #   elif placar_time_B > placar_time_A:
# # #     print("TIme B Venceu! ")
# # #   else:
# # #     print("Empate")


# # # verificar_vencedor()

# # 06)
# # def tipo_do_dia():
# #     dia_da_semana = str(input("Digite o dia da semana: "))
# #     dia = dia_da_semana.lower()
    
# #     if dia == "sábado" or dia == "sabado" or dia == "domingo":
# #         print("Fim de Semana 🎉")
# #     else:
# #         print("Dia Útil 💼")


# # tipo_do_dia()


# # 07)
# # def calcular_frete():
# #   valor_pedido = float(input("Escreva o valor do pedido: "))
  
# #   if valor_pedido == 80:
# #     print("Frete Grátis")
# #   else:
# #     print("Frete Fixo")
    
# # calcular_frete()

# # 08)
# # def classificar_avaliacao():
# #   avaliacao = int(input("Informe o valor da sua avaliação: "))
  
# #   if avaliacao == 5:
# #     print("Excelente!")
# #   elif avaliacao == 4:
# #     print("Muito Bom")
# #   elif avaliacao == 3:
# #     print("Satisfatório")
# #   elif avaliacao == 2 or avaliacao == 1:
# #     print("Insatisfatório")
# #   else:
# #     print("Avaliação Inválida")
    
# # classificar_avaliacao()

# 09)
# def identificar_veiculo():
#   placa = str(input("Escreva o primeiro caractere da placa: "))
  
#   if placa == 'A' or placa == 'B' or placa == 'C':
#     print("Carro de Passeio")
#   elif placa == 'M' or placa == 'N' or placa == 'O':
#     print("Motocicleta")
#   else:
#     print("Outro Tipo de Veiculo")
    
# identificar_veiculo()