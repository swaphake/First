READ ENTITIES OF zi_leave_request IN LOCAL MODE
  ENTITY zi_leave_request
  ALL FIELDS WITH CORRESPONDING #( keys )
  RESULT DATA(lt_result).
  LOOP AT lt_result INTO DATA(ls_result).
   APPEND VALUE #(
      %tky = ls_result-%tky
      %action-approve   = COND #( WHEN ls_result-Status = 'S'
                              THEN if_abap_behv=>fc-o-enabled
                              ELSE if_abap_behv=>fc-o-disabled )
      %action-reject   = COND #( WHEN ls_result-Status = 'S'
                              THEN if_abap_behv=>fc-o-enabled
                              ELSE if_abap_behv=>fc-o-disabled )
           ) TO result.
  ENDLOOP.



# First
Programs



this repositery contains simple jaava programs,
programs include
printing pyramid in java
printing different sequences


    @ui.facet: [{ 
purpose: #STANDARD, 
position: 10, 
label: 'Header', 
type: #IDENTIFICATION_REFERENCE 
}, 
{ 
purpose: #STANDARD, 
position: 20, 
label: 'Item', 
type: #LINEITEM_REFERENCE, 
targetElement: '_item' 
}] 

@AbapCatalog.sqlViewName: 'ZBSID_DUPKEY'
@AccessControl.authorizationCheck: #NOT_REQUIRED
@EndUserText.label: 'Duplicate Keys for BSID'

define view Z_CDS_BSID_DUPKEY as
  select from bsid
{
  xblnr,
  zuonr,
  count(*) as cnt
}
group by xblnr, zuonr
having count(*) > 1


@AbapCatalog.sqlViewName: 'ZBSID_DUPREC'
@AccessControl.authorizationCheck: #NOT_REQUIRED
@EndUserText.label: 'BSID Duplicate Records'

define view Z_CDS_BSID_DUPREC as
  select from bsid as a
  inner join Z_CDS_BSID_DUPKEY as b
    on  a.xblnr = b.xblnr
    and a.zuonr = b.zuonr
{
  a.bukrs,
  a.kunnr,
  a.belnr,
  a.gjahr,
  a.buzei,
  a.xblnr,
  a.zuonr,
  a.dmbtr,
  a.shkzg
}
