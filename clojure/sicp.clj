(def car first)
(def cdr rest)
(defn cadr [x] (car (cdr x)))
(defn caddr [x] (car (cdr (cdr x))))
(defn cddr [x] (cdr (cdr x)))
(defn cadr [x] (car (cdr x)))

