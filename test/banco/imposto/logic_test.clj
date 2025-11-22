(ns banco.imposto.logic_test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :refer [imposto-retido-na-fonte]]))

; Solicitação do Cliente
; Valores abaixo de 1000 reais não tem imposto retido na fonte
; Acima disso pagam 10% de imposto

(deftest imposto-retido-na-fonte-test
  (testing "Dado um valor abaixo de 1000 reais então não deve ter imposto retido na fonte"
    (is (= 0 (imposto-retido-na-fonte 1)))
    (is (= 0 (imposto-retido-na-fonte 999.99)))
  (testing "Dado um valor acima de 1000 reais então deve ter um imposto de 10%"
    (is (= 100.00 (imposto-retido-na-fonte 1000))))))