(ns om-tutorial.app-database.exercises)

(def cars-table
  {:cars/by-id
   {1 {:id 1 :make "Nissan"}
    2 {:id 2 :make "Dodge"}
    3 {:id 3 :make "Ford"}}})

(def favorites
  (merge cars-table
    {:favorite-car [:cars/by-id 1]}))

(def ex3-uidb
  {:tools/by-id
    {1 {:id 1 :label "Cut"}
     2 {:id 2 :label "Copy"}}
   :data/by-id
     {5 {:id 5 :x 1 :y 3}}
   :main-panel
     {:toolbar {:tools [[:tools/by-id 1] [:tools/by-id 2]]}
      :canvas {:data [[:data/by-id 5]]}}})
