#lang sicp

(define (close? u v) (< (abs (- u v)) 0.001))
(define (fixed-point f i-guess)
    (define (try g)
        (if (close? (f g) g)
            (f g)
            (try (f g))))
    (try i-guess))

(define (average a b)
    (/ (+ a b) 2.0))

(define (average-damp f)
    (lambda (x)
        (average x (f x))))
(define (sqrt x)
    (fixed-point
        (average-damp
            (lambda (y) (/ x y)))
        1))

(define (square x) (* x x))

(square (sqrt 4))
(define (println a) (display a) (display "\n"))


(square 4)