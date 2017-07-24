(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
      [x]
      (if x
        "true"
        "false"
      )
)

(defn teen?
  [age]

  (if (and (<= 13 age) (<= age 19))
    "true"
    "false"
    )
  )

(defn abs
    [x]
    (if (< x 0)
      (- x)
      x
  )
)

(defn divides?
  [divisor n]
  ( if (= 0 (mod n divisor))
    "true"
    "false"
  )
)

(defn fizzbuzz [n]
  ":(")

(defn not-teen? [age]
  ":(")




(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
