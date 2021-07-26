<template>
  <BackgroundCircle />
  <div class="main flex flex-col items-center">
    <Navigation :navName="navName" :navLink="navLink" />
  </div>
</template>

<script>
import Navigation from "../components/Navigation/Navigation.vue";
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
    Navigation,
    BackgroundCircle,
  },
};
</script>

<style></style>
