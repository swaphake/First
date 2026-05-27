DS4K901747       SHAKE        PTP 07MAY26 689: DI_529_Purchasing-Analytics - Open To Buy
 DS4K901776 100   SHAKE        PTP 07MAY26 689: DI_529_Purchasing - UI Service

Behaviou def
ZC_MM_OPEN_TO_BUY
ZR_MM_OPEN_TO_BUY

class (ABAP Objects)

ZCL_MM_ANALYTICS_CALC
ZCL_MM_OPEN_TO_BUY

 Definition Language Source

ZAB_FILEUPLOAD
ZC_MM_OPEN_TO_BUY
ZI_MM_ANALYTICS_ACT_CUST_RET
ZI_MM_ANALYTICS_ACT_FD_SALES
ZI_MM_ANALYTICS_ACT_INV_COST
ZI_MM_ANALYTICS_ACT_RECP_COST
ZI_MM_ANALYTICS_ACT_SALES
ZI_MM_ANALYTICS_PER_SUPPLIER
ZI_MM_ANALYT_ACT_OPEN_CUST_RET
ZI_MM_C_ANALYTICS_PER_SUPPLIER
ZR_MM_OPEN_TO_BUY
ZR_MM_PO_DATA
ZR_MM_PO_DATA_THIRD_PARTY

    CDS metadata extension

        ZC_MM_OPEN_TO_BUY
        ZI_MM_C_ANALYTICS_PER_SUPPLIER_MDE

    SAP Gateway OData V4 Backend Service Group & Assignments
    Service Binding

        ZUI_C_ANALYTICS_PER_SUPP_O4
        ZUI_MM_OPEN_TO_BUY_O4

    Service Definition

        ZUI_C_ANALYTICS_PER_SUPPLIER
        ZUI_MM_OPEN_TO_BUY_O4

    Assignment: Service   > Authorization Objects
    Table

        ZMM_OPEN_TO_BUY
        ZMM_OPEN_TO_BUYD


========================================================================================================================================
  https://stackoverflow.com/questions/79291764/multiple-for-groups-let-reduce-aggregations-with-abap-7-57
  t_data = VALUE #( FOR GROUPS g1 OF ls_row IN gt_data GROUP BY ( wadat = ls_row-wadat
                                                                  werks = ls_row-werks
                                                                  land1 = ls_row-land1
                                                                  "erdat = ls_row-erdat
                                                               )
                     LET sum = REDUCE #( INIT line TYPE ty_sum_line
                                         FOR members_g1 IN GROUP g1
                                         NEXT line-wadat = members_g1-wadat
                                              line-werks = members_g1-werks
                                              line-land1 = members_g1-land1
                                              line-lfimg = line-lfimg + members_g1-lfimg
                                        )
                  IN ( wadat = g1-wadat
                       werks = g1-werks
                       land1 = g1-land1
                       lfimg = sum-lfimg
                       "lfimg_t0
                       "lfimg_older
                       "lfimg_abc
                      )
                   ).


/sap/opu/odata4/sap/zui_c_analytics_per_supp_o4/srvd/sap/zui_c_analytics_per_supplier/0001/

AnalyticsPerSupplier

DS4K901898 100   SHAKE        Standard V4 Service Activation Service Group CDI_CDS

define view entity ZI_CASP_GR
  as select from ekbe
{
    key ebeln,
    key ebelp,
    key belnr,
    key gjahr,
    key buzei,

        matnr,
        werks,

        budat,

        bwart,
        vgabe,

        menge,

        @Semantics.amount.currencyCode: 'Waers'
        dmbtr,

        waers
}
where
      vgabe = '1'
  and bwart in ( '101', '102', '161' )

DS4K901776 100   SHAKE        PTP-07May26-689-DI_529_Purchasing - UI Service
DS4K901130 100   SHAKE        RTR-30Apr26-434-R311_Check Form TVARVC entries


DS4K901747       SHAKE        PTP-07May26-689-DI_529_Purchasing - Analytics - Open To Buy
DS4K900881       SHAKE        RTR-11Mar26-434_R311_Check Form

\
\\Budgeted sales dollars.  ZCDOB - BSALED 

Budgeted sales units.  ZCDOB - BSALEU 

Budgeted receipt dollars from Purchase orders for the supplier. ZCDOB - BPORD 

Budgeted receipt units from the supplier. ZCDOB - BPORU 

Budgeted supplier returns in dollars. ZCDOB - BRPOD 

Budgeted supplier returns in units. ZCDOB - BRPOU 

Budgeted Customer returns dollars. ZCDOB - BCRD 

Budgeted Customer returns in units. ZCDOB – BCRU 

Budgeted Inventory cost for supplier material. ZCDOB - BICS 

Budgeted Inventory Units for supplier materials. ZCDOB - BICU 

/sap/opu/odata4/sap/zui_mm_open_to_buy_o4/srvd/sap/zui_mm_open_to_buy_o4/0001/

/sap/opu/odata4/sap/zui_c_cre_deb_memo_settletp_o4/srvd/sap/zui_c_cred_deb_memo_settletp/0001/

SD-01Apr26-1376-974_E_QTCSV_Additional custom fields for QTC
DATA(lv_group_id) = 1.

  LOOP AT ct_calculated_data ASSIGNING FIELD-SYMBOL(<fs_data>)
       GROUP BY ( assignment = <fs_data>-assignment
                  reference  = <fs_data>-reference )
       ASCENDING.

    " Count records in group
    DATA(lv_count) = lines( GROUP <fs_data> ).

    IF lv_count > 1.

      LOOP AT GROUP <fs_data> ASSIGNING FIELD-SYMBOL(<fs_item>).
        <fs_item>-groupid = lv_group_id.
      ENDLOOP.

      lv_group_id = lv_group_id + 1.

    ENDIF.

  ENDLOOP.

row_number( )
        over(
          partition by _Open.zuonr, _Open.xblnr
          order by _Open.belnr, _Open.buzei
        ) as Counter,


DATA: lt_je_deep TYPE TABLE FOR ACTION IMPORT i_journalentrytp~post,
lv_cid TYPE abp_behv_cid.

TRY.
lv_cid = to_upper( cl_uuid_factory=>create_system_uuid( )->create_uuid_x16( ) ).
CATCH cx_uuid_error.
ASSERT 1 = 0.
ENDTRY.

APPEND INITIAL LINE TO lt_je_deep ASSIGNING FIELD-SYMBOL(je_deep).
je_deep-%cid = lv_cid.
je_deep-%param = VALUE #(
companycode = 'F001' " Success
documentreferenceid = 'BKPFF'
createdbyuser = 'TESTER'
businesstransactiontype = 'RFBU'
accountingdocumenttype = 'SA'
documentdate = sy-datlo
postingdate = sy-datlo
accountingdocumentheadertext = 'RAP rules'
_glitems = VALUE #( ( glaccountlineitem = |001| glaccount = '0000400000' _currencyamount = VALUE #( ( currencyrole = '00' journalentryitemamount = '-100.55' currency = 'JPY' ) ) )
( glaccountlineitem = |002| glaccount = '0000400000' _currencyamount = VALUE #( ( currencyrole = '00' journalentryitemamount = '100.55' currency = 'JPY' ) ) ) )

).

MODIFY ENTITIES OF i_journalentrytp
ENTITY journalentry
EXECUTE post FROM lt_je_deep
FAILED DATA(ls_failed_deep)
REPORTED DATA(ls_reported_deep)
MAPPED DATA(ls_mapped_deep).

IF ls_failed_deep IS NOT INITIAL.

LOOP AT ls_reported_deep-journalentry ASSIGNING FIELD-SYMBOL(ls_reported_deep).
DATA(lv_result) = ls_reported_deep-%msg->if_message~get_text( ).
...
ENDLOOP.
ELSE.

COMMIT ENTITIES BEGIN
RESPONSE OF i_journalentrytp
FAILED DATA(lt_commit_failed)
REPORTED DATA(lt_commit_reported).
...
COMMIT ENTITIES END.
ENDIF.


@Consumption.semanticObject: 'BillingDocument'
@ui.lineItem : [ { position: 10, label: 'Billing Document'},
{type : #FOR_INTENT_BASED_NAVIGATION, semanticObjectAction: 'display'}]

AccountingDocument

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
