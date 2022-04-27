(def car first)
(def cdr rest)
(defn cadr [x] (car (cdr x)))
(defn caddr [x] (car (cdr (cdr x))))
(defn cadddr [x] (car (cdr (cdr (cdr x)))))
(defn cddr [x] (cdr (cdr x)))
(defn cadr [x] (car (cdr x)))

(defn mput [m key value] (do (. m put key value) m))
(defn todict [m] (into {} m))

(import (java.util HashMap))


(defn l-eval [exp env]
  (cond (self-evaluating? exp) exp))