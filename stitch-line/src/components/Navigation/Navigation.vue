<template>
  <div
    class="
      container
      pt-2
      pb-8
      hidden
      justify-between
      items-center
      sm:flex
      md:flex
      lg:flex
      xl:flex
      2xl:flex
    "
  >
    <img src="../../assets/logo-main.png" alt="" class="w-40" />

    <div>
      <ul class="inline-flex">
        <li class="pl-4 text-blue-600">
          <router-link :to="{ name: 'Home' }">Home</router-link>
        </li>
      </ul>
      <router-link
        :to="{ name: `${navLink}` }"
        class="
          bg-white
          pt-2
          pb-2
          pl-4
          pr-4
          ml-4
          rounded-3xl
          w-32
          text-blue-900
          font-bold
          shadow-xl
        "
      >
        {{ navName }}
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: "Navigation",
  props: {
    navName: {
      String,
    },
    navLink: {
      String,
      default: "Home",
    },
  },
};
</script>

<style scoped>
.logo {
  width: 100px;
}
</style>
