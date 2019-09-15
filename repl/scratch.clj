;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(use 'i-am-a-horse-in-the-land-of-booleans)

(boolean 1)
(boolean 0)
(boolean 'something)
(boolean "aThing")
(boolean true)
(boolean false)
(boolean :aKey)


(abs -144/64)

(teen? 19)

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(sign (- 12 34))

(def z 34)

(defn divides2? [divisor n]
  (== (mod n divisor) 0))

(divides? 30 30)

(= 0(mod 30 3) )

(fizzbuzz 60)

(generic-doublificate2 1)        ;=> 2
(generic-doublificate2 [1 2])    ;=> 4
(generic-doublificate2 '(65 21)) ;=> 4
(generic-doublificate2 {})       ;=> nil
(generic-doublificate2 [])       ;=> nil
(generic-doublificate2 {:a 1})   ;=> true

;; Write the function (leap-year? year), which returns true if year is a leap year, otherwise false.
;; A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is
;; a leap year if it is divisible by 400.
(leap-year2? 100) ;=> false
(leap-year2? 200) ;=> false
(leap-year2? 400) ;=> true
(leap-year2? 12)  ;=> true
(leap-year2? 20)  ;=> true
(leap-year2? 15)  ;=> false

(defn leap-year2? [year]
  (cond (divides? 400 year) true
        (divides? 4 year)
          (if (divides? 100 year) false true)
        :else false)
  )


