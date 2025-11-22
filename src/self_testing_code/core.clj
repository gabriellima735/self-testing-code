(ns self-testing-code.core)

(defn taxa-de-entrega
  "Se o valor da compra for até 100, deve-se cobrar 15 reais de taxa de entrega.
  Se for maior que 100 e menor que 200, 5 reais.
  Se for acima de 200, a taxa é gratuita."
  [valor-da-compra]
  (if (<= valor-da-compra 100)
    15 (if (<= valor-da-compra 200)
         5 0 )))
; ADD in array
(conj ["Batata" "arroz" "Feijão"] "Banana")

; REMOVE in array
(pop ["Batata" "arroz" "Feijão"])

(defn desistir-ultima-compra
  [compras]
  (pop compras))
(desistir-ultima-compra ["Batata" "arroz" "Feijão"])













