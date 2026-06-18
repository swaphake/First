DS4K902655       SHAKE        QTC 15JUN26 254: DI_131_E_QTCSV: SPA/Bid/Agreement Validatio
DS4K902699 100   SHAKE        QTC 15JUN26 254: DI_131 SPA/Bid/Agreement Validation TVARVC

100ZSD_S_131_CONDITION_RECORD    S0000
 Class (ABAP Objects)

     ZCL_SD_131_SPA_BID_VALIDATION

 Data Definition Language Source

     ZR_SD_CONDITION_CONTRACTS
     


DI_131_E_QTCSV: SPA/Bid/Agreement Validation

==========================================================================================================
 companycode                   TYPE bukrs,
            plant                         TYPE ewerk,
            purchaseorganization          TYPE ekorg,
            supplier                      TYPE lifnr,
            forcastmonth                  TYPE lfmon,
            forcastyear                   TYPE lfgja,
            forcastdate                   TYPE dats,
            budgetedsalesdollars          TYPE bprei,
            budgetedsalesunits            TYPE bstmg,
            budgetedreceiptdollars        TYPE bprei,
            budgetedreceiptunits          TYPE bstmg,
            budgetedsupplierreturndollars TYPE bprei,
            budgetedsupplierreturnunits   TYPE bstmg,
            budgetedcustomerreturndollars TYPE bprei,
            budgetedcustomerreturnunits   TYPE bstmg,
            budgetedinventorycost         TYPE bprei,
            budgetedinventoryunits        TYPE bstmg,
            
Custom Field

    ZZ1_CUSTOMERREFERENCE
    ZZ1_RMA_NUMBER
    ZZ1_STATUSREASONCODE

 TVARVC

     100ZFI_S_317_STATUS_CODE         S0000
     100ZFI_S_317_STATUS_CODE         S0001
     100ZFI_S_317_STATUS_CODE         S0002
     100ZFI_S_317_STATUS_CODE         S0003
     100ZFI_S_317_STATUS_CODE         S0004
     100ZFI_S_317_STATUS_CODE         S0005
     100ZFI_S_317_STATUS_CODE         S0006
     100ZFI_S_317_STATUS_CODE         S0007
     100ZFI_S_317_STATUS_CODE         S0008

     
    
Cust : DS4K902167 100   SHAKE        RTR 27MAY26 440: DI_317_E_RTR: Mass upd - TVARVC & Services
DS4K902643       SHAKE        RTR 16Jun26 - Custom Fields RTR Area
DS4K902070       SHAKE        RTR 27MAY26 440: DI_317_E_RTR: Mass field update


API Release State of Objects

    ZR_FI_STATUSREASONCODE_VH           DDLS

Behavior Definition

    ZC_FI_MANAGE_DISPUTE_CASES
    ZI_FI_MANAGE_DISPUTE_CASES

Class (ABAP Objects)

    ZCL_FI_317_MANAGE_DISPUTE_CASE

Data Definition Language Source

    ZAB_317_EDITPARAMETERS
    ZAB_317_FILEUPLOAD
    ZC_FI_MANAGE_DISPUTE_CASES
    ZI_FI_MANAGE_DISPUTE_CASES
    ZR_FI_STATUSREASONCODE_VH

CDS metadata extension

    ZC_FI_MANAGE_DISPUTE_CASES_EXT
 Function Group

     ZFI_317_DISPUTE_ATTR_CHNG

 SAP Gateway OData V4 Backend Service Group & Assignments
 Service Binding

     ZUI_C_MANAGE_DISPUTE_CASES_V4

 Service Definition

     ZUI_C_MANAGE_DISPUTE_CASES

 Assignment: Service   > Authorization Objects
 Table

     ZFI_DISPCASE_D
     ZFI_S_DISPUTECASE

 Table Type

     ZFI_TT_DISPUTECASE
    
=-----------------------------------------------------=================================

ZZ1_3616EEF453EB
ZZ1_644B6ECCA934
ZZ1_6B2AFE01CCB1
ZZ1_88ABD52B8794
ZZ1_96A89CF22961
ZZ1_A7C64FB8C262
ZZ1_D0A3B53ACE77
ZZ1_DC290269E0EF

Just Demo


ZZ1_2OAFU6ICCUQQ52KLZQM6XORUTA
ZZ1_4Z74TKZPXTWNLAM3Q2EG5YJG7Q
ZZ1_64WZOPTWHM7Y7CPA42NAR3I254
ZZ1_HGHKGUWEMD3O7VSMBDI2IS4LD4
ZZ1_IYBSKDFK6HRRJRLHQOIDHP34TE
ZZ1_JRBA7AWX6KQO2Y73G4OTBBTOCA
ZZ1_NNODNAFTQ5LULY2GGQJ3JMQA5U
ZZ1_NTH4EMGXTSJ3O6OZDHVS7WYO2M
ZZ1_P2NY4PMZST3KN7CJBDLTXIQZGM
ZZ1_PA6NYMJHK42WCOR5OS6HWSYI7A
ZZ1_SI3PP6PPSAA263W7YYY75NDQ5M
ZZ1_SZBGTERYD7SG2YJ37J65L2KHCE
ZZ1_TCJJOOERQWY77YM6BTN6Z5MO4Y
ZZ1_VK6NV4BQ2DQYEBLE5D2LK24WYI
ZZ1_VWMTV7NZ67DNFURZ7ACH4BB4WE

/sap/opu/odata4/sap/zui_c_manage_dispute_cases_v4/srvd/sap/zui_c_manage_dispute_cases/0001/

DisputeCase


https://vhdhbds4ci.sap.dandh.net:44300/sap/bc/ui2/flp?sap-client=100&sap-language=EN&saml2=disabled#Shell-home
SCMG_T_CASE_ATTR
 
UDMCASEATTR00
UDMO_S_DISPUTE_INCL  - Structure

 https://fioriappslibrary.hana.ondemand.com/sap/fix/externalViewer/#/detail/Apps('F0702')/S12OP
 https://help.sap.com/docs/SAP_S4HANA_ON-PREMISE/3eb1567cf97543c08087efb0936964e6/122a0456337d787fe10000000a441470.html?version=1809.000

DI_317_E_RTR: Mass field update 

This enhancement is for the creation of a program that will be used to mass update fields in dispute cases created against a chargeback document and an extension of custom fields into the Manage dispute case Fiori tile. 

A template should be used to mass update.  

Upon downloading the template, all Case ID of disputed items should be available for edit.  

If upload has empty fields, no change to the original value.  

Custom Fields required to be extended.  

Status reason code:- User defined reason codes which will be provided by D&H – New Field not currently in SAP.  

Customer reference field: Customer PO number: Ref key3 in sap - Created at the time of cash application:  --Dependency on ESKER evaluation. ( XREF3 Field)   -  

RMA number – sales order (Assignment) -- Assignment Field   - BSID-ZUONR 

Standard available fields to edit in the Manage dispute case Fiori app 

Processor 

Coordinator 

Person Responsible 

Priority 

Processing Deadline 

Planned Close Date 

External Reference 

Case Title 

Available to be edited: 

External Reference 

Status 

Category 

Reason Code 

Contact Person ID 

Contact Person Name 

Email 

Telephone No. 

Fax Number 
DI_529_CALM_3_4987_Open_to_Buy_Analytics_Report 

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
