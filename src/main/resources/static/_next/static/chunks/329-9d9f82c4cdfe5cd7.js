(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[329],{880:function(e,t,r){"use strict";r.d(t,{Z:function(){return f}});var o=r(9499),n=r(5115),a=r.n(n),s=r(1664),c=r.n(s),u=r(7294),i=r(5893);function l(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);t&&(o=o.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,o)}return r}function f(e){var t=(0,u.useState)(""),r=t[0],n=t[1];return(0,u.useEffect)((function(){fetch("/api/users/user").then((function(e){return e.json()})).then((function(e){n(function(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?l(Object(r),!0).forEach((function(t){(0,o.Z)(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):l(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}({},e))})).catch((function(e){return console.log(e)}))}),[]),(0,i.jsxs)("div",{className:a().container,children:[(0,i.jsxs)("header",{className:a().header,children:[(0,i.jsx)(c(),{href:"/",children:(0,i.jsx)("a",{children:(0,i.jsx)("img",{src:"/img/favicon.png",alt:"logo",className:a().logo})})}),(0,i.jsxs)("form",{action:"#",className:a().search,children:[(0,i.jsx)("input",{onChange:function(t){return e.change(t)},type:"text",className:a().search__input,placeholder:"Search books"}),(0,i.jsx)("button",{className:a().search__button,children:(0,i.jsx)("svg",{className:a().search__icon,children:(0,i.jsx)("use",{href:"/img/sprite.svg#icon-magnifying-glass"})})})]}),(0,i.jsxs)("nav",{className:a().userNav,children:[(0,i.jsxs)("div",{className:a().userNav__iconBox,children:[(0,i.jsx)("svg",{className:a().userNav__icon,children:(0,i.jsx)("use",{href:"/img/sprite.svg#icon-bookmark"})}),(0,i.jsx)("span",{className:a().userNav__notification,children:"1"})]}),(0,i.jsxs)("div",{className:a().userNav__user,children:[(0,i.jsx)("img",{src:"/img/userIcon.png",alt:"User photo",className:a().userNav__userPhoto}),(0,i.jsx)("span",{className:a().userNav__userName,children:0==r.length?"Log in":r.username})]})]})]}),e.children]})}},7913:function(e,t,r){"use strict";var o=r(5696);Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var n,a=(n=r(7294))&&n.__esModule?n:{default:n},s=r(2199),c=r(1587),u=r(7215);function i(e,t){if(null==e)return{};var r,o,n=function(e,t){if(null==e)return{};var r,o,n={},a=Object.keys(e);for(o=0;o<a.length;o++)r=a[o],t.indexOf(r)>=0||(n[r]=e[r]);return n}(e,t);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);for(o=0;o<a.length;o++)r=a[o],t.indexOf(r)>=0||Object.prototype.propertyIsEnumerable.call(e,r)&&(n[r]=e[r])}return n}var l={};function f(e,t,r,o){if(e&&s.isLocalURL(t)){e.prefetch(t,r,o).catch((function(e){0}));var n=o&&"undefined"!==typeof o.locale?o.locale:e&&e.locale;l[t+"%"+r+(n?"%"+n:"")]=!0}}var _=a.default.forwardRef((function(e,t){var r,n=e.legacyBehavior,_=void 0===n?!0!==Boolean(!1):n,d=e.href,p=e.as,h=e.children,v=e.prefetch,g=e.passHref,y=e.replace,b=e.shallow,m=e.scroll,j=e.locale,k=e.onClick,O=e.onMouseEnter,N=i(e,["href","as","children","prefetch","passHref","replace","shallow","scroll","locale","onClick","onMouseEnter"]);r=h,_&&"string"===typeof r&&(r=a.default.createElement("a",null,r));var x,L=!1!==v,B=c.useRouter(),w=a.default.useMemo((function(){var e=s.resolveHref(B,d,!0),t=o(e,2),r=t[0],n=t[1];return{href:r,as:p?s.resolveHref(B,p):n||r}}),[B,d,p]),E=w.href,P=w.as,C=a.default.useRef(E),M=a.default.useRef(P);_&&(x=a.default.Children.only(r));var R=_?x&&"object"===typeof x&&x.ref:t,I=u.useIntersection({rootMargin:"200px"}),S=o(I,3),D=S[0],H=S[1],K=S[2],U=a.default.useCallback((function(e){M.current===P&&C.current===E||(K(),M.current=P,C.current=E),D(e),R&&("function"===typeof R?R(e):"object"===typeof R&&(R.current=e))}),[P,R,E,K,D]);a.default.useEffect((function(){var e=H&&L&&s.isLocalURL(E),t="undefined"!==typeof j?j:B&&B.locale,r=l[E+"%"+P+(t?"%"+t:"")];e&&!r&&f(B,E,P,{locale:t})}),[P,E,H,j,L,B]);var T={ref:U,onClick:function(e){_||"function"!==typeof k||k(e),_&&x.props&&"function"===typeof x.props.onClick&&x.props.onClick(e),e.defaultPrevented||function(e,t,r,o,n,a,c,u){("A"!==e.currentTarget.nodeName.toUpperCase()||!function(e){var t=e.currentTarget.target;return t&&"_self"!==t||e.metaKey||e.ctrlKey||e.shiftKey||e.altKey||e.nativeEvent&&2===e.nativeEvent.which}(e)&&s.isLocalURL(r))&&(e.preventDefault(),t[n?"replace":"push"](r,o,{shallow:a,locale:u,scroll:c}))}(e,B,E,P,y,b,m,j)},onMouseEnter:function(e){_||"function"!==typeof O||O(e),_&&x.props&&"function"===typeof x.props.onMouseEnter&&x.props.onMouseEnter(e),s.isLocalURL(E)&&f(B,E,P,{priority:!0})}};if(!_||g||"a"===x.type&&!("href"in x.props)){var Z="undefined"!==typeof j?j:B&&B.locale,Q=B&&B.isLocaleDomain&&s.getDomainLocale(P,Z,B&&B.locales,B&&B.domainLocales);T.href=Q||s.addBasePath(s.addLocale(P,Z,B&&B.defaultLocale))}return _?a.default.cloneElement(x,T):a.default.createElement("a",Object.assign({},N,T),r)}));t.default=_,("function"===typeof t.default||"object"===typeof t.default&&null!==t.default)&&(Object.assign(t.default,t),e.exports=t.default)},7215:function(e,t,r){"use strict";var o=r(5696);Object.defineProperty(t,"__esModule",{value:!0}),t.useIntersection=function(e){var t=e.rootRef,r=e.rootMargin,i=e.disabled||!s,l=n.useRef(),f=n.useState(!1),_=o(f,2),d=_[0],p=_[1],h=n.useState(t?t.current:null),v=o(h,2),g=v[0],y=v[1],b=n.useCallback((function(e){l.current&&(l.current(),l.current=void 0),i||d||e&&e.tagName&&(l.current=function(e,t,r){var o=function(e){var t,r={root:e.root||null,margin:e.rootMargin||""},o=u.find((function(e){return e.root===r.root&&e.margin===r.margin}));o?t=c.get(o):(t=c.get(r),u.push(r));if(t)return t;var n=new Map,a=new IntersectionObserver((function(e){e.forEach((function(e){var t=n.get(e.target),r=e.isIntersecting||e.intersectionRatio>0;t&&r&&t(r)}))}),e);return c.set(r,t={id:r,observer:a,elements:n}),t}(r),n=o.id,a=o.observer,s=o.elements;return s.set(e,t),a.observe(e),function(){if(s.delete(e),a.unobserve(e),0===s.size){a.disconnect(),c.delete(n);var t=u.findIndex((function(e){return e.root===n.root&&e.margin===n.margin}));t>-1&&u.splice(t,1)}}}(e,(function(e){return e&&p(e)}),{root:g,rootMargin:r}))}),[i,g,r,d]),m=n.useCallback((function(){p(!1)}),[]);return n.useEffect((function(){if(!s&&!d){var e=a.requestIdleCallback((function(){return p(!0)}));return function(){return a.cancelIdleCallback(e)}}}),[d]),n.useEffect((function(){t&&y(t.current)}),[t]),[b,d,m]};var n=r(7294),a=r(8065),s="undefined"!==typeof IntersectionObserver;var c=new Map,u=[];("function"===typeof t.default||"object"===typeof t.default&&null!==t.default)&&(Object.assign(t.default,t),e.exports=t.default)},5115:function(e){e.exports={header:"BookLayout_header__OQp1s",container:"BookLayout_container__oxCK0",logo:"BookLayout_logo__abvOR",search:"BookLayout_search__OZV4r",search__input:"BookLayout_search__input__wmadQ",search__button:"BookLayout_search__button__TIgKa",search__icon:"BookLayout_search__icon__Oim6H",userNav:"BookLayout_userNav__HR4uD",userNav__iconBox:"BookLayout_userNav__iconBox__S8VSw",userNav__icon:"BookLayout_userNav__icon__8OjYr",userNav__notification:"BookLayout_userNav__notification__STL90",userNav__userPhoto:"BookLayout_userNav__userPhoto__Z_uVq"}},6705:function(e){e.exports={books:"Books_books__cTtsP",book:"Books_book__9scIG",detail:"Books_detail__QJzob",description:"Books_description__0GR1H",heading4:"Books_heading4__ce_2D"}},1664:function(e,t,r){e.exports=r(7913)}}]);