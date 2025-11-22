(ns banco.imposto.logic)

(defn- estra-na-faixa-insencao?
  [valor]
  (< valor 1000))

(defn imposto-retido-na-fonte
  [valor]
  (if (estra-na-faixa-insencao? valor)
    0  (* valor 0.1)))

