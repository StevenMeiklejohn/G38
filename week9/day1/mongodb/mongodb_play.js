use zoo;

const id = ObjectId('65118f6c831d991f5d771982')
db.animals.findOne({_id: id})

db.animals.updateOne(
    {_id: id},
    {$set: {name: "Gary"}}
);

db.animals.deleteOne({_id: id});
