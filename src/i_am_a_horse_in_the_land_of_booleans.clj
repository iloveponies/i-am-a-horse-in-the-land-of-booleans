(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (nil? x)
    false  ; if true
    ( if (false? x)
            false
            true
        
    )
  )
)

(defn abs [x]
    (if ( < x 0 )
        (- x)
        x
    )
)

(defn divides? [divisor n]
    (if (= 0 (mod n divisor ) )
        true
        false
    )
)

(defn fizzbuzz [n]
  
  (cond
    ( divides? 15 n ) "gotcha!"
    ( divides? 5 n ) "buzz"
    ( divides? 3 n ) "fizz"
    :else         "")

)

(defn teen? [age]
    (if ( >= age 13 )
        (if ( <= age 19 )
            true
            false
        )
        false
    )
)

(defn not-teen? [age]
    (not (teen? age) )
)

(defn generic-doublificate [x]
  (cond
    ( number? x ) (* x 2)
    ( empty? x ) nil
    ( list? x ) (* 2 (count x) )
    ( vector? x ) (* 2 (count x) )
    :else         true)
)

(defn leap-year? [year]
    
    (cond
    ( divides? 400 year ) true
    ( and (not (divides? 400 year))  (divides? 100 year) ) false
    ( and (not (divides? 100 year))  (divides? 4 year) ) true
    :else         false)
    
)

; '_______'