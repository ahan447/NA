onmessage = function(e){
	var sum = 0
	for(idx=1; idx<=1000000000; idx= idx + 1){
		sum = sum + idx;
	}		
	postMessage(sum);
};