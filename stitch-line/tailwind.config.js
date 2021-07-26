module.exports = {
  purge: ['./index.html', './src/**/*.{vue,js,ts,jsx,tsx}'],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {},
  },
  variants: {
    extend: {
       colors: {
        "cyan-blueish-blue": "#4460F1",
      },
    },
  },
  plugins: [],
}
