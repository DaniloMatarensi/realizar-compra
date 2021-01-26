#language: pt
@RealizarCompra
Funcionalidade: Realizar compra com Débito
  @CompraAVista
  Esquema do Cenário: Validar compra a vista
    Dado que seleciono a opção Debito
    E informo os dados do cartao <numero_cartao>, <nome_titular>, <data_vencimento>, <cod_seguranca>
    Quando clicar em Finalizar Compra
    Entao o sistema informa mensagem “Seu pedido foi realizado com sucesso”

    Exemplos:
      | numero_cartao    | nome_titular   | data_vencimento | cod_seguranca |
      | 5172665886301291 | Carlos Augusto | 10/10/1990      | 597           |
      | 5101354100476835 | Marta Roberta  | 10/05/1987      | 897           |