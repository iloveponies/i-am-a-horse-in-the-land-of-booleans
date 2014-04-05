(ns structured-data)

(defn do-a-thing [x]
  (let [xx (+ x x)]
    (Math/pow xx xx)
    )
  )

(defn spiff [v]
  (let [first (get v 0)
        third (get v 2)]
      (if (and first third)
        (+ first third)
        first
        )
    )
  )

(defn cutify [v]
  (conj v "<3")
  )

(defn spiff-destructuring [v]
  (let [[first second third] v]
    (if (and first third)
      (+ first third)
      first
      )
    )
  )

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [ [[x1 y1][x2 y2]] rectangle ]
    (- x2 x1)
    )
  )

(defn height [rectangle]
  (let [ [[x1 y1][x2 y2]] rectangle ]
    (- y2 y1)
    )
  )

(defn square? [rectangle]
  (= (width rectangle) (height rectangle))
  )

(defn area [rectangle]
  (let [rwidth (width rectangle)
        rheight (height rectangle)]
    (* rwidth rheight)
    )
  )

(defn contains-point? [rectangle point]
  (let [ [[x1 y1][x2 y2]] rectangle
         [px py] point]
    (and (<= x1 px x2) (<= y1 py y2))
    )
  )

(defn contains-rectangle? [outer inner]
  (let [[point1 point2] inner]
    (and (contains-point? outer point1)
    (contains-point? outer point2) )
    )
  )

(defn title-length [book]
  (count (:title book) )
  )

(defn author-count [book]
  (count (:authors book))
  )

(defn multiple-authors? [book]
  (< 1 (author-count book) )
  )

(defn add-author [book new-author]
  (assoc book :authors (conj (:authors book) new-author))
  )

(defn alive? [author]
  (not (contains? author :death-year))
  )

(defn element-lengths [collection]
  (map count collection)
  )

(defn second-elements [collection]
  (let [second (fn [vector] (get vector 1))]
    (map second collection)
    )
  )

(defn titles [books]
  (map :title books)
  )

(defn monotonic? [a-seq]
  (if (>=(get a-seq 0) (get a-seq 1))
    (apply >= a-seq)
    (apply <= a-seq)
    )
  )

(defn stars [n]
  (apply str (repeat n "*"))
    )

(defn toggle [a-set elem]
  (if (contains? a-set elem)
    (disj a-set elem)
    (conj a-set elem)
    )
  )

(defn contains-duplicates? [a-seq]
  (not (= (count a-seq) (count (set a-seq))))
  )

(defn old-book->new-book [book]
  (assoc book :authors (set (:authors book)))
  )

(defn has-author? [book author]
  (contains? (:authors book) author)
  )

(defn authors [books]
  (apply clojure.set/union (map :authors books))
  )

(defn all-author-names [books]
  (set (map :name (authors books)))
  )

(defn author->string [author]
  (let [
        name (fn [a]
               (:name a)
               )
        years (fn [a]
                (if (:birth-year a)
                  (str " (" (:birth-year a) " - " (:death-year a) ")")
                  )
                )
        ]

    (str (name author) (years author))

    )
  )

(defn authors->string [authors]
  (apply str (interpose ", "(map author->string authors)))
  )


(defn book->string [book]
  (str (:title book) ", written by " (authors->string (:authors book)))
  )

(defn books->string [books]
  (let [string (fn [book] (if (book->string book)
                            (book->string book)
                            ) )]
    (if (< 0 (count books))
      (if (< 1 (count books))
        (apply str (count books) " books. " (apply str (interpose ". "(map string books))) ".")
        (apply str (count books) " book. " (apply str (map string books)) ".")
        )
      "No books."
      )
    )
  )

(defn books-by-author [author books]
  (let [has-author (fn [book] (contains? (:authors book) author))]
    (filter has-author books)
    )
  )

(defn author-by-name [name authors]
  (let [is-author (fn [author]
                    (= name (:name author))
                    )
        ]
    (first (filter is-author authors))
    )
  )

(defn living-authors [authors]
  (let [is-alive (fn [author] (alive? author))]
    (filter is-alive authors)
    )
  )

(defn has-a-living-author? [book]
  (not (empty? (living-authors (:authors book))))
  )

(defn books-by-living-authors [books]
  (filter has-a-living-author? books)
  )

; %________%
