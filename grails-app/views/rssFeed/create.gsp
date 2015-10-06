<!DOCTYPE html>
<html>
    <head>
        <title>Add RSS Feed</title>
    </head>
    <body>
        <g:form controller="rssFeed" action="save">
            <label>RSS Feed: </label>
            <g:textField name="feed"/>
            <g:actionSubmit value="Save"/>
        </g:form>
    </body>
</html>
