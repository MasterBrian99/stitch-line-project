<template>
  <div class="flex items-center mt-3">
    <input type="radio" id="one" value="admin" v-model="picked" class="mr-2" />
    <label for="admin" class="pr-8 text-gray-600 text-xl">Admin</label>
    <input
      type="radio"
      id="two"
      value="customer"
      v-model="picked"
      class="mr-2"
    />
    <label for="customer" class="text-gray-600 text-xl">Customer</label>
  </div>
  <div class="mt-4">
    <div
      :class="{ error: v$.fullName.$errors.length }"
      class="
        w-100
        ml-2
        mr-2
        2xl:ml-0 2xl:mr-0
        xl:ml-0 xl:mr-0
        md:ml-2 md:mr-2
        sm:ml-2 sm:mr-2
      "
    >
      <input
        @blur="v$.fullName.$touch"
        v-model="v$.fullName.$model"
        placeholder="Full Name"
        class="
          bg-blue-100 bg-opacity-50
          w-full
          text-lg
          pt-2
          pb-2
          pl-2
          rounded-lg
          border border-opacity-50 border-blue-400
          text-gray-500
          focus:outline-none focus:border-blue-800
        "
      />
      <div
        class="input-errors"
        v-for="error of v$.fullName.$errors"
        :key="error.$uid"
      >
        <div class="error-msg text-red-700">{{ error.$message }}</div>
      </div>
    </div>
    <!--  -->
    <div
      :class="{ error: v$.email.$errors.length }"
      class="
        w-100
        ml-2
        mr-2
        2xl:ml-0 2xl:mr-0
        xl:ml-0 xl:mr-0
        md:ml-2 md:mr-2
        sm:ml-2 sm:mr-2
      "
    >
      <input
        @blur="v$.email.$touch"
        v-model="v$.email.$model"
        placeholder="Email"
        class="
          bg-blue-100 bg-opacity-50
          w-full
          text-lg
          pt-2
          pb-2
          pl-2
          rounded-lg
          border border-opacity-50 border-blue-400
          text-gray-500
          focus:outline-none focus:border-blue-800
          mt-4
        "
      />
      <div
        class="input-errors"
        v-for="error of v$.email.$errors"
        :key="error.$uid"
      >
        <div class="error-msg text-red-700">{{ error.$message }}</div>
      </div>
    </div>
    <!--  -->
    <div
      :class="{ error: v$.mobile.$errors.length }"
      class="
        w-100
        ml-2
        mr-2
        2xl:ml-0 2xl:mr-0
        xl:ml-0 xl:mr-0
        md:ml-2 md:mr-2
        sm:ml-2 sm:mr-2
      "
    >
      <input
        @blur="v$.mobile.$touch"
        v-model="v$.mobile.$model"
        placeholder="Mobile Number"
        class="
          bg-blue-100 bg-opacity-50
          w-full
          text-lg
          pt-2
          pb-2
          pl-2
          rounded-lg
          border border-opacity-50 border-blue-400
          text-gray-500
          focus:outline-none focus:border-blue-800
          mt-4
        "
      />
      <div
        class="input-errors"
        v-for="error of v$.mobile.$errors"
        :key="error.$uid"
      >
        <div class="error-msg text-red-700">{{ error.$message }}</div>
      </div>
    </div>

    <div
      class="
        flex flex-col
        justify-between
        2xl:flex-row
        xl:flex-row
        md:flex-col
        sm:flex-col
        ml-2
        mr-2
        2xl:ml-0 2xl:mr-0
        xl:ml-0 xl:mr-0
        md:ml-2 md:mr-2
        sm:ml-2 sm:mr-2
      "
    >
      <!--  -->

      <div :class="{ error: v$.username.$errors.length }" class="w-100">
        <input
          @blur="v$.username.$touch"
          v-model="v$.username.$model"
          placeholder="Username"
          class="
            mr-1
            bg-blue-100 bg-opacity-50
            w-full
            text-lg
            pt-2
            pb-2
            pl-2
            rounded-lg
            border border-opacity-50 border-blue-400
            text-gray-500
            focus:outline-none focus:border-blue-800
            mt-4
          "
        />
        <div
          class="input-errors"
          v-for="error of v$.username.$errors"
          :key="error.$uid"
        >
          <div class="error-msg text-red-700">{{ error.$message }}</div>
        </div>
      </div>
      <!--  -->
      <div
        :class="{ error: v$.password.$errors.length }"
        class="w-100 relative"
      >
        <input
          @blur="v$.password.$touch"
          v-model="v$.password.$model"
          placeholder="Password"
          type="password"
          class="
            ml-1
            bg-blue-100 bg-opacity-50
            w-full
            text-lg
            pt-2
            pb-2
            pl-2
            rounded-lg
            border border-opacity-50 border-blue-400
            text-gray-500
            focus:outline-none focus:border-blue-800
            mt-4
          "
        />

        <div
          class="input-errors"
          v-for="error of v$.password.$errors"
          :key="error.$uid"
        >
          <div class="error-msg text-red-700">{{ error.$message }}</div>
        </div>
      </div>
      <!--  -->
    </div>
    <div
      :class="[
        { error: v$.address.$errors.length },
        picked == 'customer' ? '' : 'hidden',
      ]"
      class="w-100 relative"
    >
      <textarea
        @blur="v$.address.$touch"
        v-model="v$.address.$model"
        placeholder="Address"
        class="
          resize-none
          bg-blue-100 bg-opacity-50
          w-full
          text-lg
          pt-2
          pb-2
          pl-2
          rounded-lg
          border border-opacity-50 border-blue-400
          text-gray-500
          focus:outline-none focus:border-blue-800
          mt-4
        "
      ></textarea>

      <div
        class="input-errors"
        v-for="error of v$.address.$errors"
        :key="error.$uid"
      >
        <div class="error-msg text-red-700">{{ error.$message }}</div>
      </div>
    </div>
    <!--  -->

    <div
      class="
        flex
        justify-between
        flex-col
        2xl:flex-row
        xl:flex-row
        md:flex-col
        sm:flex-col
        ml-2
        mr-2
        2xl:ml-0 2xl:mr-0
        xl:ml-0 xl:mr-0
        md:ml-2 md:mr-2
        sm:ml-2 sm:mr-2
      "
      :class="picked == 'admin' ? '' : 'hidden'"
    >
      <!--  -->
      <div :class="{ error: v$.nic.$errors.length }" class="w-100 relative">
        <input
          @blur="v$.nic.$touch"
          v-model="v$.nic.$model"
          placeholder="NIC"
          class="
            mr-1
            bg-blue-100 bg-opacity-50
            w-full
            text-lg
            pt-2
            pb-2
            pl-2
            rounded-lg
            border border-opacity-50 border-blue-400
            text-gray-500
            focus:outline-none focus:border-blue-800
            mt-4
          "
        />

        <div
          class="input-errors"
          v-for="error of v$.nic.$errors"
          :key="error.$uid"
        >
          <div class="error-msg text-red-700">{{ error.$message }}</div>
        </div>
      </div>
      <!--  -->
      <div
        :class="{ error: v$.employeeNumber.$errors.length }"
        class="w-100 relative"
      >
        <input
          @blur="v$.employeeNumber.$touch"
          v-model="v$.employeeNumber.$model"
          placeholder="Employee Number"
          class="
            ml-1
            bg-blue-100 bg-opacity-50
            w-full
            text-lg
            pt-2
            pb-2
            pl-2
            rounded-lg
            border border-opacity-50 border-blue-400
            text-gray-500
            focus:outline-none focus:border-blue-800
            mt-4
          "
        />

        <div
          class="input-errors"
          v-for="error of v$.employeeNumber.$errors"
          :key="error.$uid"
        >
          <div class="error-msg text-red-700">{{ error.$message }}</div>
        </div>
      </div>
    </div>
    <button
      class="
        bg-blue-800
        p-4
        mt-4
        rounded-2xl
        shadow-xl
        disabled:opacity-50
        ml-2
      "
      @click="onClicked"
    >
      <img src="../../assets/icons8-right-50.png" alt="" class="w-8" />
    </button>
  </div>
</template>

<script>
import useVuelidate from "@vuelidate/core";
import axios from "axios";
import { useToast } from "vue-toastification";
import { apiUrl } from "../../data/data";
import {
  required,
  email,
  maxLength,
  helpers,
  minLength,
  numeric,
  alpha,
} from "@vuelidate/validators";

export default {
  name: "SignUpForm",

  setup() {
    const toast = useToast();
    return { v$: useVuelidate(), toast };
  },
  mounted() {},
  data() {
    return {
      picked: "admin",
      fullName: "",
      email: "",
      mobile: "",
      username: "",
      password: "",
      address: "",
      nic: "",
      employeeNumber: "",
      setFieldInfo: false,
    };
  },
  validations: {
    picked: {
      required,
    },
    fullName: {
      required: helpers.withMessage(
        "Full Name field cannot be empty",
        required
      ),
      // minLength: helpers.withMessage("Min Lengh ", minLength(3)),
    },
    email: {
      required: helpers.withMessage("Email field cannot be empty", required),
      email: helpers.withMessage("Invalid email Address", email),
    },
    mobile: {
      required: helpers.withMessage(
        "Mobile Number field cannot be empty",
        required
      ),
      numeric: helpers.withMessage("Numeric value expected", numeric),
    },
    username: {
      required: helpers.withMessage("Username cannot be empty", required),
    },
    password: {
      required: helpers.withMessage("Password cannot be empty", required),
    },
    address: {
      required: helpers.withMessage("Address cannot be empty", required),
    },
    nic: {
      required: helpers.withMessage("NIC cannot be empty", required),
    },
    employeeNumber: {
      required: helpers.withMessage(
        "Employee Number cannot be empty",
        required
      ),
    },
  },

  methods: {
    onClicked: function () {
      this.axios
        .post(`${apiUrl}/user`, {
          username: this.username,
          fullName: this.fullName,
          picked: this.picked,
          email: this.email,
          mobile: this.mobile,
          password: this.password,
          address: this.address,
          nic: this.nic,
          employeeNumber: this.employeeNumber,
        })
        .then((response) => {
          if (response.data.code == "400") {
            this.toast.error(response.data.message);
          }
          if (response.data.code == "404") {
            this.toast.error(response.data.message);
          }
          if (response.data.code == "201") {
            this.toast.success(response.data.message);
            this.$store.commit("setAuthenticated", true);
            if (response.data.data.picked == "admin") {
              this.$router.push(`/profile/admin`);
            }
            if (response.data.data.picked == "customer") {
              this.$router.push(`/profile/customer`);
            }
          }
          console.log(response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>

<style scoped></style>
