<#-- @ftlvariable name="" type="gs.nick.dwbb.views.BaseView" -->

<!DOCTYPE html>
<html>
    <head>
        <title>Index</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
        <!--[if lte IE 8]>
            <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-old-ie-min.css">
        <![endif]-->
        <!--[if gt IE 8]><!-->
        <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/grids-responsive-min.css">
        <!--<![endif]-->
        <style>
            .button-warning {
                background: rgb(202, 60, 60); /* this is an orange */
            }
        </style>
    </head>
    <body>
        <h1>DWBB</h1>
        <form class="pure-form pure-form-aligned">
            <fieldset>
                <div class="pure-control-group">
                    <label for="name">Your Name</label>
                    <input id="name" type="text" placeholder="Name">
                </div>


                <div class="pure-control-group">
                    <label for="email">Email Address</label>
                    <input id="email" type="email" placeholder="Email Address" required>
                </div>

                <div class="pure-control-group">
                    <label for="date">When to deliver?</label>
                    <select id="date" name="date">
                        <option value="1">1 Week</option>
                        <option value="2">2 Week</option>
                        <option value="4">4 Week</option>
                        <option value="8">8 Week - 2 month</option>
                        <option value="16">16 Week - 4 month</option>
                        <option value="24">24 Week - 6 month</option>
                        <option value="52">52 Week - 1 year</option>
                    </select>
                </div>

                <div class="pure-control-group">
                    <label for="body">The Message</label>
                    <textarea id="body"></textarea>
                </div>

                <div class="pure-controls">
                    <button type="submit" class="pure-button pure-button-primary">Submit</button>
                    <button type="reset" class="pure-button button-warning">Clear</button>
                </div>
            </fieldset>
        </form>
    </body>
</html>
