 (ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> 0 x) (* -1 x) x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false)




  )

(defn fizzbuzz [n]

  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""



 ))

(defn teen? [age]
   (if (< 12 age 20) true false


  )
)


(defn not-teen? [age]
  (cond
   (teen? age) false
   :else true
   ))



(defn generic-doublificate [x]

(cond
 (number? x) (* 2 x)
 (empty? x) (or)
 (list? x) (* 2 (count x))
 (vector? x) (* 2 (count x))
 :else true

)
)




(defn leap-year? [year]

  (cond
   (and (divides? 100 year) (divides? 400 year) (divides? 4 year)) true
   (and (divides? 100 year) (not (divides? 400 year))) false
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false



))
; '_______'
