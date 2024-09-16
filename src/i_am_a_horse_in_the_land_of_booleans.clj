(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (cond
                    (nil? x) false
                    (= false x) false
                    true true)
  )

(defn abs [x] (if (< x 0) (- x) x)
  )

(defn divides? [divisor n] (if (= (mod n divisor) 0) true false)
 )

(defn fizzbuzz [n] (cond
                     (= (mod n 15) 0) "gotcha!"
                     (= (mod n 3) 0) "fizz"
                     (= (mod n 5) 0) "buzz"
                     :else ""
                     ))

(defn teen? [age] (if (and (>= age 13) (<= age 19)) true false))

(defn not-teen? [age] (not (teen? age))
  )

(defn generic-doublificate [x] (cond
                                 (number? x) (* 2 x)
                                 (empty? x)  nil
                                 (or (list? x) (vector? x)) (* 2 (count x))
                                 :else true
  ))

(defn leap-year? [year] (cond 
                          (= (mod year 400) 0) true
                          (= (mod year 100) 0) false
                          (= (mod year 4) 0) true
                          :else false

  ))

; '_______'

;(boolean :f)
;(teen? 19)
;(abs 0)
;(divides? 5 10)
;(fizzbuzz 47)

;(generic-doublificate 1)        ;=> 2
;(generic-doublificate [1 2])    ;=> 4
;(generic-doublificate '(65 21)) ;=> 4
;(generic-doublificate {})       ;=> nil
;(generic-doublificate [])       ;=> nil
;(generic-doublificate {:a 1})   ;=> true

;(not-teen? 13) ;=> false
;(not-teen? 25) ;=> true
;(not-teen? 12) ;=> true
;(not-teen? 19) ;=> false
;(not-teen? 20) ;=> true

;(leap-year? 100) ;=> false
;(leap-year? 200) ;=> false
;(leap-year? 400) ;=> true
;(leap-year? 12)  ;=> true
;(leap-year? 20)  ;=> true
;(leap-year? 15)  ;=> false

;(fizzbuzz 2)  ;=> ""
;(fizzbuzz 45) ;=> "gotcha!"
;(fizzbuzz 48) ;=> "fizz"
;(fizzbuzz 70) ;=> "buzz"
