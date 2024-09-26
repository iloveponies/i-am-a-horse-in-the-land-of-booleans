(use 'i-am-a-horse-in-the-land-of-booleans)

(teen? 20)

(abs 22)

(divides? 2 5)



(fizzbuzz 70)


(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true

(not-teen? 13) ;=> false
(not-teen? 25) ;=> true
(not-teen? 12) ;=> true
(not-teen? 19) ;=> false
(not-teen? 20) ;=> true


(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false
