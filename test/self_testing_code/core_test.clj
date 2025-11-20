(ns self-testing-code.core-test
  (:require [clojure.test :refer :all]
            [self-testing-code.core :refer :all]))

(deftest taxa-de-entrega-test
  (testing "Dado um valor abaixo de 100 reais, então a taxa de entrega deve ser 15 reais"
    (is (= 15 (taxa-de-entrega 1)))
    (is (= 15 (taxa-de-entrega 100))))
  (testing "Dado um valor entre 100 e 200 reais, então a taxa de entrega deve ser 5 reais"
    (is (= 5 (taxa-de-entrega 100.01)))
    (is (= 5 (taxa-de-entrega 200))))
  (testing "Dado um valor entre 200 reais, então a taxa de entrega deve ser 0 reais"
    (is (= 0 (taxa-de-entrega 200.01)))))
