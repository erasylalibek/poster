(function(window,undefined){"use strict";observer.subscribe("product/configuration/updated",function(obj){if(obj.key=="illustration"){$('[data-key="labelOne"]').val(page.product.options.illustration[obj.value].headline);$('[data-key="labelTwo"]').val(page.product.options.illustration[obj.value].description);page.product.variation.labelOne=page.product.options.illustration[obj.value].headline;page.product.variation.labelTwo=page.product.options.illustration[obj.value].description;observer.publish("labels/change")}})})(this)