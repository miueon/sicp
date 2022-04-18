(defn close? [u v] (< (Math/abs (- u v)) 0.001))
(defn fixed-point [f i-guess] 
  (defn try [g]
    (if (close? (f g) g) 
      (f g)
      (println g(try (f g))))) 
  (try i-guess))


(defn average [a b] 
  (/ (+ a b) 2))
;(average 10 5)
(defn average-damp [f]
  (fn [x] (average x (f x))))
;((average-damp (fn [x] (+ 1 x))) 1)  
(defn sqrt [x]
  (fixed-point (average-damp (fn [y] ((println "fuck") (/ x y)))) 1))


(sqrt 4)