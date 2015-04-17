(ns easy)

(defn last_element [col] (if (or (nil? col) (empty? col)) nil
                           (nth col (- (count col) 1))))

(defn second_to_last [col] (if (or (nil? col) (< (count col) 2)) nil (nth (sort col) (- (count col) 2))))


(defn interleave_seqs [x y] (if (and (not-empty x) (not-empty y)) (concat [(first x) (first y)] (interleave_seqs (rest x) (rest y))) []))


(defn compress_seq [s] (if (> (count s) 1)
                         (if (= (first s) (first (rest s))) (compress_seq (rest s)) (conj (compress_seq (rest s)) (first s))) s))