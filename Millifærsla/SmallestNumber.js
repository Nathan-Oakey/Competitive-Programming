// Nathan Oakey

process.stdin.on('data', (data) => {
    const lines = data.toString().trim().split('\n');
    const [a, b, c] = lines.map(Number);

    if (Math.min(a, b, c) === a) {
        console.log("Monnei");
    } else if (Math.min(b, c) === b) {
        console.log("Fjee");
    } else {
        console.log("Dolladollabilljoll");
    }
});


