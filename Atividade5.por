programa {
  funcao inicio() {
    inteiro maior = 0
    inteiro n[8], i, numero /* o numero 8 representa o numero de elementos e nao do ultimo indice */

      para(i = 0; i < 8; i++){
      escreva("Qual o valor do índice: ",i,"?\n")
      leia(n[i])
      }

      para(i = 0; i < 8; i++){
        se(n[i] > maior){
          maior = n[i]
        }
      }

      escreva("O maior valor é: ",maior)
      escreva("O seu índice é de: ")

  }
}
