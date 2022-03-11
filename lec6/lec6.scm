(define first car)
(define rest cdr)
(define adjoin cons)
(define (fold-right op init lst)
    (if (null? lst)
        init
        (op (first lst) init
            (fold-right op init (rest lst)))))