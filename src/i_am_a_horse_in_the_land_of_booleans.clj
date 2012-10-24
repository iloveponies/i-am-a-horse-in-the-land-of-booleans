(ns i-am-a-horse-in-the-land-of-booleans)

; Harjoitus 1
(defn my-boolean
        [x]
        (if (= x nil)
        false
                (if (= x false)
                false
                true))
)



; Harjoitus 3
(defn abs
        [x]
        (if (< x 0)
                (* x -1)
                x))

; Harjoitus 4
(defn divides?
        [divisor n]
        (if (== (mod n divisor) 0)
                true
                false))

; Harjoitus 5
(defn fizzbuzz
        [n]
        (cond
                (== (mod n 15) 0) "gotcha!"
                (== (mod n 3) 0) "fizz"
                (== (mod n 5) 0) "buzz"
                :else ""))

; Harjoitus 2
(defn teen?
        [age]
        (< 12 age 20))

; Harjoitus 7
(defn not-teen?
        [age]
        (not (teen? age)))

; Harjoitus 6
(defn generic-doublificate
        [x]
        (cond
                (number? x) (* x 2)
                (empty? x) nil
                (list? x) (* (count x) 2)
                (vector? x) (* (count x) 2)
                :else true))

; Harjoitus 8
(defn leap-year?
        [year]
        (cond
                (== (mod year 400) 0) true
                (== (mod year 100) 0) false
                (== (mod year 4) 0) true
                :else false))


; '_______'
