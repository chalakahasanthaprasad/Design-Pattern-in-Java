const mongoose = require("mongoose");
//Outlet Collection
const address_field = mongoose.Schema(
  {
    address_No: {
      type: String,
      require: true,
    },
    location: [
      {
        latitude: {
          type: Number,
          require: true,
        },
        longitude: { type: Number, require: true },
      },
    ],
    street: {
      type: String,
      require: true,
    },
    city: {
      type: String,
      require: true,
    },
  },
  { _id: false }
);

const OutletSchema = mongoose.Schema({
  outletNo: {
    type: Number,
    require: true,
  },
  name: {
    type: String,
    require: true,
    index: true,
    unique: true,
  },
  address: address_field,
  opening: [
    {
      days: {
        type: String,
        require: true,
      },
      hours: { type: String, require: true },
    },
  ],
  type: {
    type: String,
    require: true,
  },
  rating: {
    type: Number,
    min: 0,
    max: 5,
  },
  email: {
    type: String,
    require: true,
  },
  contactNo: {
    type: Number,
    require: true,
    maxlength: 10,
  },
  description: {
    type: String,
    require: true,
    minlength: 10,
    maxlength: 200,
  },
  imageUrl: {
    type: String,
    require: true,
  },
  isActive: {
    type: Boolean,
    require: true,
  },
  createdDateTime: {
    type: Date,
    default: Date.now,
    require: true,
  },
  //need to test......
  //   timestamps: {
  //     createdAt: "created_at",
  //     updatedAt: "updated_at",
  //   },
});
module.exports = mongoose.model("outlet", OutletSchema);
