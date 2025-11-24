(ns funcoes_primeira_ordem.core)

;(defn imposto-retido
;  [salario]
;  (let [imposto-padrao 0.2]
;    (if (< salario 1000)
;       0
;       (* salario imposto-padrao))))

(defn consulta-taxa-padrao-por-http
  "Função imaginária"
  []
  0.30)

(defn consulta-taxa-padrao-fixa
  "Função fixa"
  []
  0.10)

(defn imposto-retido
  [consulta-taxa-padrao salario]
    (if (< salario 1000)
      0
      (* salario (consulta-taxa-padrao))))

;(imposto-retido (consulta-taxa-padrao-por-http) 2000)
(imposto-retido consulta-taxa-padrao-por-http 2000)
(imposto-retido consulta-taxa-padrao-fixa 2000)

;; pt 2

;((minha-taxa-padrao))
;(minha-taxa-padrao)

(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    consulta-taxa-padrao-fixa
    consulta-taxa-padrao-por-http
    )
  )

(imposto-retido (escolhe-consulta-taxa-padrao :teste) 18900)

;; pt 3

;((fn [x] (* 2 x)))
;(#(* 2 %) 5)


























