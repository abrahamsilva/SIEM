@Name'1 Failed Login Attempts from the Same Source::Authentication Rule 1'
select *from eParser eventStream.win:time batch(2 minutes)
where (execute_subcheck'Validation_Failed')
group by source ip having count(*) >=5 and count(different username)>=5
