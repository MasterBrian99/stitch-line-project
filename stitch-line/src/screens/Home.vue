<template>
  <BackgroundCircle />
  <div class="main flex flex-col items-center justify-center">
    <h1 class="text-3xl font-bold">Home Page</h1>
    <router-link :to="{ name: 'Signin' }" class="underline text-red-700"
      >Click Here</router-link
    >
  </div>
</template>

<script>
import BackgroundCircle from "../components/BackgroundCircle/BackgroundCircle.vue";
export default {
  name: "Home",
  data() {
    return {
      navName: "Register",
      navLink: "Signup",
    };
  },
  components: {
    BackgroundCircle,
  },
};
</script>

<style></style>
