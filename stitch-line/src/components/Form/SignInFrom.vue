<template>
  <div>
    <div class="flex items-center mt-3">
      <input
        type="radio"
        id="one"
        value="admin"
        v-model="picked"
        class="mr-2"
      />
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
    <div :class="{ error: v$.password.$errors.length }" class="w-100 relative">
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
  </div>
  <button
    class="bg-blue-800 p-4 mt-4 rounded-2xl shadow-xl disabled:opacity-50 ml-2"
    @click="onClicked"
  >
    <img src="../../assets/icons8-right-50.png" alt="" class="w-8" />
  </button>
</template>

<script>
import useVuelidate from "@vuelidate/core";
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
  name: "SignInFrom",

  setup() {
    const toast = useToast();
    return { v$: useVuelidate(), toast };
  },

  data() {
    return {
      picked: "admin",
      username: "",
      password: "",
    };
  },
  validations: {
    picked: {
      required,
    },
    username: {
      required: helpers.withMessage("Username cannot be empty", required),
    },
    password: {
      required: helpers.withMessage("Password cannot be empty", required),
    },
  },
  methods: {
    onClicked: function () {
      this.axios
        .post(`${apiUrl}/find`, {
          username: this.username,
          password: this.password,
        })
        .then((response) => {
          if (response.data.code == "400") {
            this.toast.error(response.data.message);
          }
          if (response.data.code == "200") {
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

<style></style>
