(ns i-am-a-horse-in-the-land-of-booleans)

(defn fizzbuzz [n]
  (if (= (mod n 15) 0)
	"gotcha!"
    (if (= (mod n 3) 0)
      "fizz"
      (if (= (mod n 5) 0)
        "buzz"
        ""))))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn teen? [age]
  ":(")

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")