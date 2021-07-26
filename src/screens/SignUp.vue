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

        <SignUpForm />
      </div>
      <MainImage />
    </div>
  </div>
</template>

<script>
import BackgroundCircle from "../components/BackgroundCircle/BackgroundCircle.vue";
import Navigation from "../components/Navigation/Navigation.vue";
import SignUpForm from "../components/Form/SignUpForm.vue";
import MainImage from "../components/MainImage/MainImage.vue";
import SignCard from "../components/SignCard/SignCard.vue";
export default {
  name: "Signup",
  data() {
    return {
      title: "Sign Up",
      info: "Sign up as",
      navName: "Login",
      navLink: "Signin",
    };
  },
  components: {
    SignUpForm,
    BackgroundCircle,
    Navigation,
    MainImage,
    SignCard,
  },
};
</script>

<style></style>
