(ns PCA.core
  (:require [datomic.api :refer [q db] :as d]) )

(def uri "datomic:dev://localhost:4334/PCA")

;(d/create-database uri)

(def conn (d/connect uri))

; create partition concept (id=63)
;@(d/transact conn [{:db/id (d/tempid :db.part/db)
;                    :db/ident :db.part/concept
;                    :db.install/_partition :db.part/db}])

; create partition SWC214P (id=64)
;@(d/transact conn [{:db/id (d/tempid :db.part/db)
;                    :db/ident :db.part/SWC2014P
;                    :db.install/_partition :db.part/db}])

