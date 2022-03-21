<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>错误页面-500</title>
</head>
<body>
<div>
    ${errMsg}
</div>

<script type="text/javascript">
    var baseUrl = <#if baseUrl??>${baseUrl}<#else >''</#if>;
    alert(baseUrl);
</script>
</body>

</html>