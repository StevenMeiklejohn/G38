use zoo;
db.dropDatabase();

db.animals.insertMany([
    {
        name: "Janet",
        type: "Polar Bear"
    },
    {
        name: "Zoltar The Destructor",
        type: "Penguin",
        age:5
    }
]);