const path = require('path');

module.exports = {
    entry: './src/main/resources/static/js/application.js',
    output:  {
        path: path.resolve(__dirname, 'target/classes/static/js'),
        filename: 'app.bundle.js'
    }
}