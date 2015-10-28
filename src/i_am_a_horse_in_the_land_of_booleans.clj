(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)

      false

      (if (= x false)

      false

      true
)
)
  )
(defn abs [x]

  (if (< x 0)

  (* -1 x)

  (* 1 x)

  )
)

(defn divides? [divisor n]

      (if
          (= 0 (mod n divisor))
        
          true
        
          false 
  
          
      )
)
(defn fizzbuzz [n]

  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""
  )
)
(defn teen? [age]
  (if(< 12 age 20)
    
    true
    
    false

    )
  )

(defn not-teen? [age]
  (not(teen? age))

)

(defn generic-doublificate [x]

  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
  )
)
(defn leap-year? [year]
  
  (if(divides? 4 year)
    
        (if(divides? 100 year)

          (if(divides? 400 year)

          true

          false)
          true)
  false
  )
  
)
; ^_______^
