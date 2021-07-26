<template>
  <BackgroundCircle />
  <div class="main flex flex-col items-center">
    <Navigation :navName="navName" :navLink="navLink" />
    <div
      class="
        container
        flex flex-col
        justify-center
        pt-28
        2xl:flex-row
        xl:flex-row
        md:flex-col
        sm:flex-col
        2xl:justify-between
        xl:justify-between
        md:justify-center
        sm:justify-center
      "
    >
      <div class="main-content">
        <SignCard :title="title" :info="info" />
        <SignInFrom />
      </div>
      <MainImage />
    </div>
  </div>
</template>

<script>
import BackgroundCircle from "../components/BackgroundCircle/BackgroundCircle.vue";
import Navigation from "../components/Navigation/Navigation.vue";
import SignInFrom from "../components/Form/SignInFrom.vue";
import MainImage from "../components/MainImage/MainImage.vue";
import SignCard from "../components/SignCard/SignCard.vue";

export default {
  name: "Signin",
  data() {
    return {
      title: "Sign In",
      info: "Sign in as",
      navName: "Register",
      navLink: "Signup",
    };
  },
  components: {
    BackgroundCircle,
    Navigation,
    SignInFrom,
    MainImage,
    SignCard,
  },
};
</script>

<style></style>
