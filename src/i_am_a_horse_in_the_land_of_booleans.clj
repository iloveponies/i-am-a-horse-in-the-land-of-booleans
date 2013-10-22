(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs
  [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn
  divides?
  [divisor n]
  (if (== (mod n divisor) 0 )
     true
     false))

(defn
  fizzbuzz
  [n]
  (if (== (mod n 15) 0)
    "gotcha!"
    (if (== (mod n 3) 0)
      "fizz"
      (if (== (mod n 5) 0)
        "buzz"
        ""))))

(defn
  teen?
  [age]
  (if (< 12 age 20)
    true
    false))

(defn
  not-teen?
  [age]
  (if (= (teen? age) true)
    false
    true)
  )

(defn
  generic-doublificate
  [x]
  (if (=(number? x) true)
    (* x 2)
    (if (=(empty? x) true)
      nil
      (if (=(list? x) true)
        (* (count x) 2)
        (if (=(vector? x) true)
          (* (count x) 2)
          true ))))
    )

(defn
  leap-year?
  [year]
  (if (== (mod year 4) 0)
    (if (== (mod year 100) 0)
            (if (== (mod year 400) 0)
              true
              false)
         true)
      false))

; '_______'

