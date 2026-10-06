package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_1wwgetfilterdata extends GXProcedure
{
   public devoluciontejido_1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_1wwgetfilterdata.class ), "" );
   }

   public devoluciontejido_1wwgetfilterdata( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      devoluciontejido_1wwgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      devoluciontejido_1wwgetfilterdata.this.AV68DDOName = aP0;
      devoluciontejido_1wwgetfilterdata.this.AV69SearchTxt = aP1;
      devoluciontejido_1wwgetfilterdata.this.AV70SearchTxtTo = aP2;
      devoluciontejido_1wwgetfilterdata.this.aP3 = aP3;
      devoluciontejido_1wwgetfilterdata.this.aP4 = aP4;
      devoluciontejido_1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV58Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV61OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_DEVCRUATID") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUATIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_DEVCRUATCUD") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVCRUATCUDOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_DEVFIRMA4DIG") == 0 )
      {
         /* Execute user subroutine: 'LOADDEVFIRMA4DIGOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV71OptionsJson = AV58Options.toJSonString(false) ;
      AV72OptionsDescJson = AV60OptionsDesc.toJSonString(false) ;
      AV73OptionIndexesJson = AV61OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV63Session.getValue("AlmacenSinDetalle.DevolucionTejido_1WWGridState"), "") == 0 )
      {
         AV65GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.DevolucionTejido_1WWGridState"), null, null);
      }
      else
      {
         AV65GridState.fromxml(AV63Session.getValue("AlmacenSinDetalle.DevolucionTejido_1WWGridState"), null, null);
      }
      AV93GXV1 = 1 ;
      while ( AV93GXV1 <= AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV66GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV1));
         if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUEST_SEL") == 0 )
         {
            AV81TFDevCruEst_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV82TFDevCruEst_Sels.fromJSonString(AV81TFDevCruEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV18TFDevCruSal = localUtil.ctot( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV44TFDevCruAtId = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV45TFDevCruAtId_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATCUD") == 0 )
         {
            AV50TFDevCruATCUD = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATCUD_SEL") == 0 )
         {
            AV51TFDevCruATCUD_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUENVAT_SEL") == 0 )
         {
            AV77TFDevCruEnvAT_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV78TFDevCruEnvAT_Sels.fromJSonString(AV77TFDevCruEnvAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUAT_SEL") == 0 )
         {
            AV83TFDevCruAT_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV84TFDevCruAT_Sels.fromJSonString(AV83TFDevCruAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDTSYS") == 0 )
         {
            AV36TFDevCruDtSys = localUtil.ctot( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVFIRMA4DIG") == 0 )
         {
            AV79TFDevFirma4dig = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVFIRMA4DIG_SEL") == 0 )
         {
            AV80TFDevFirma4dig_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV93GXV1 = (int)(AV93GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDEVCRUATIDOPTIONS' Routine */
      returnInSub = false ;
      AV44TFDevCruAtId = AV69SearchTxt ;
      AV45TFDevCruAtId_Sel = "" ;
      AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV82TFDevCruEst_Sels ;
      AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV18TFDevCruSal ;
      AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV44TFDevCruAtId ;
      AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV45TFDevCruAtId_Sel ;
      AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV50TFDevCruATCUD ;
      AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV51TFDevCruATCUD_Sel ;
      AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV78TFDevCruEnvAT_Sels ;
      AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV84TFDevCruAT_Sels ;
      AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV36TFDevCruDtSys ;
      AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV79TFDevFirma4dig ;
      AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV80TFDevFirma4dig_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A11671DevCruEst) ,
                                           AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                           Byte.valueOf(A11679DevCruEnvA) ,
                                           AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                           A11681DevCruAT ,
                                           AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                           Integer.valueOf(AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels.size()) ,
                                           AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                           AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                           AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                           AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                           AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                           Integer.valueOf(AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels.size()) ,
                                           Integer.valueOf(AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels.size()) ,
                                           AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                           AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                           AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                           Integer.valueOf(AV86DevCruId) ,
                                           Integer.valueOf(AV87Clicod) ,
                                           AV89DevCruFecfrom ,
                                           AV90DevCruFecto ,
                                           A11673DevCruSal ,
                                           A11680DevCruAtId ,
                                           A13983DevCruATCU ,
                                           A11676DevCruDtSy ,
                                           A11674DevCruHash ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A11670DevCruFec ,
                                           A11678DevCruStt ,
                                           AV88DevCruStt ,
                                           A396EmprCod ,
                                           AV85EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid), 20, "%") ;
      lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = GXutil.padr( GXutil.rtrim( AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud), 20, "%") ;
      lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = GXutil.padr( GXutil.rtrim( AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig), 4, "%") ;
      /* Using cursor P09SH2 */
      pr_default.execute(0, new Object[] {AV88DevCruStt, AV88DevCruStt, AV85EmprCod, AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal, lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid, AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel, lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud, AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel, AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys, lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig, AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel, Integer.valueOf(AV86DevCruId), Integer.valueOf(AV87Clicod), AV89DevCruFecfrom, AV90DevCruFecto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9SH2 = false ;
         A396EmprCod = P09SH2_A396EmprCod[0] ;
         A11680DevCruAtId = P09SH2_A11680DevCruAtId[0] ;
         A11678DevCruStt = P09SH2_A11678DevCruStt[0] ;
         A11670DevCruFec = P09SH2_A11670DevCruFec[0] ;
         A252CliCod = P09SH2_A252CliCod[0] ;
         A11669DevCruId = P09SH2_A11669DevCruId[0] ;
         A11676DevCruDtSy = P09SH2_A11676DevCruDtSy[0] ;
         A11681DevCruAT = P09SH2_A11681DevCruAT[0] ;
         A11679DevCruEnvA = P09SH2_A11679DevCruEnvA[0] ;
         A13983DevCruATCU = P09SH2_A13983DevCruATCU[0] ;
         A11673DevCruSal = P09SH2_A11673DevCruSal[0] ;
         A11671DevCruEst = P09SH2_A11671DevCruEst[0] ;
         A11674DevCruHash = P09SH2_A11674DevCruHash[0] ;
         A14375DevFirma4d = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09SH2_A11680DevCruAtId[0], A11680DevCruAtId) == 0 ) )
         {
            brk9SH2 = false ;
            A396EmprCod = P09SH2_A396EmprCod[0] ;
            A11669DevCruId = P09SH2_A11669DevCruId[0] ;
            AV62count = (long)(AV62count+1) ;
            brk9SH2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11680DevCruAtId)==0) )
         {
            AV57Option = A11680DevCruAtId ;
            AV58Options.add(AV57Option, 0);
            AV61OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV58Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9SH2 )
         {
            brk9SH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDEVCRUATCUDOPTIONS' Routine */
      returnInSub = false ;
      AV50TFDevCruATCUD = AV69SearchTxt ;
      AV51TFDevCruATCUD_Sel = "" ;
      AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV82TFDevCruEst_Sels ;
      AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV18TFDevCruSal ;
      AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV44TFDevCruAtId ;
      AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV45TFDevCruAtId_Sel ;
      AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV50TFDevCruATCUD ;
      AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV51TFDevCruATCUD_Sel ;
      AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV78TFDevCruEnvAT_Sels ;
      AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV84TFDevCruAT_Sels ;
      AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV36TFDevCruDtSys ;
      AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV79TFDevFirma4dig ;
      AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV80TFDevFirma4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A11671DevCruEst) ,
                                           AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                           Byte.valueOf(A11679DevCruEnvA) ,
                                           AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                           A11681DevCruAT ,
                                           AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                           Integer.valueOf(AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels.size()) ,
                                           AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                           AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                           AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                           AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                           AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                           Integer.valueOf(AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels.size()) ,
                                           Integer.valueOf(AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels.size()) ,
                                           AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                           AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                           AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                           Integer.valueOf(AV86DevCruId) ,
                                           Integer.valueOf(AV87Clicod) ,
                                           AV89DevCruFecfrom ,
                                           AV90DevCruFecto ,
                                           A11673DevCruSal ,
                                           A11680DevCruAtId ,
                                           A13983DevCruATCU ,
                                           A11676DevCruDtSy ,
                                           A11674DevCruHash ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A11670DevCruFec ,
                                           A11678DevCruStt ,
                                           AV88DevCruStt ,
                                           A396EmprCod ,
                                           AV85EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid), 20, "%") ;
      lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = GXutil.padr( GXutil.rtrim( AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud), 20, "%") ;
      lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = GXutil.padr( GXutil.rtrim( AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig), 4, "%") ;
      /* Using cursor P09SH3 */
      pr_default.execute(1, new Object[] {AV88DevCruStt, AV88DevCruStt, AV85EmprCod, AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal, lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid, AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel, lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud, AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel, AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys, lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig, AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel, Integer.valueOf(AV86DevCruId), Integer.valueOf(AV87Clicod), AV89DevCruFecfrom, AV90DevCruFecto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9SH4 = false ;
         A396EmprCod = P09SH3_A396EmprCod[0] ;
         A13983DevCruATCU = P09SH3_A13983DevCruATCU[0] ;
         A11678DevCruStt = P09SH3_A11678DevCruStt[0] ;
         A11670DevCruFec = P09SH3_A11670DevCruFec[0] ;
         A252CliCod = P09SH3_A252CliCod[0] ;
         A11669DevCruId = P09SH3_A11669DevCruId[0] ;
         A11676DevCruDtSy = P09SH3_A11676DevCruDtSy[0] ;
         A11681DevCruAT = P09SH3_A11681DevCruAT[0] ;
         A11679DevCruEnvA = P09SH3_A11679DevCruEnvA[0] ;
         A11680DevCruAtId = P09SH3_A11680DevCruAtId[0] ;
         A11673DevCruSal = P09SH3_A11673DevCruSal[0] ;
         A11671DevCruEst = P09SH3_A11671DevCruEst[0] ;
         A11674DevCruHash = P09SH3_A11674DevCruHash[0] ;
         A14375DevFirma4d = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09SH3_A13983DevCruATCU[0], A13983DevCruATCU) == 0 ) )
         {
            brk9SH4 = false ;
            A396EmprCod = P09SH3_A396EmprCod[0] ;
            A11669DevCruId = P09SH3_A11669DevCruId[0] ;
            AV62count = (long)(AV62count+1) ;
            brk9SH4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13983DevCruATCU)==0) )
         {
            AV57Option = A13983DevCruATCU ;
            AV58Options.add(AV57Option, 0);
            AV61OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV58Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9SH4 )
         {
            brk9SH4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDEVFIRMA4DIGOPTIONS' Routine */
      returnInSub = false ;
      AV79TFDevFirma4dig = AV69SearchTxt ;
      AV80TFDevFirma4dig_Sel = "" ;
      AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV82TFDevCruEst_Sels ;
      AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV18TFDevCruSal ;
      AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV44TFDevCruAtId ;
      AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV45TFDevCruAtId_Sel ;
      AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV50TFDevCruATCUD ;
      AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV51TFDevCruATCUD_Sel ;
      AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV78TFDevCruEnvAT_Sels ;
      AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV84TFDevCruAT_Sels ;
      AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV36TFDevCruDtSys ;
      AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV79TFDevFirma4dig ;
      AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV80TFDevFirma4dig_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A11671DevCruEst) ,
                                           AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                           Byte.valueOf(A11679DevCruEnvA) ,
                                           AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                           A11681DevCruAT ,
                                           AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                           Integer.valueOf(AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels.size()) ,
                                           AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                           AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                           AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                           AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                           AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                           Integer.valueOf(AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels.size()) ,
                                           Integer.valueOf(AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels.size()) ,
                                           AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                           AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                           AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                           Integer.valueOf(AV86DevCruId) ,
                                           Integer.valueOf(AV87Clicod) ,
                                           AV89DevCruFecfrom ,
                                           AV90DevCruFecto ,
                                           A11673DevCruSal ,
                                           A11680DevCruAtId ,
                                           A13983DevCruATCU ,
                                           A11676DevCruDtSy ,
                                           A11674DevCruHash ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A11670DevCruFec ,
                                           A11678DevCruStt ,
                                           AV88DevCruStt ,
                                           AV85EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid), 20, "%") ;
      lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = GXutil.padr( GXutil.rtrim( AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud), 20, "%") ;
      lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = GXutil.padr( GXutil.rtrim( AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig), 4, "%") ;
      /* Using cursor P09SH4 */
      pr_default.execute(2, new Object[] {AV85EmprCod, AV88DevCruStt, AV88DevCruStt, AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal, lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid, AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel, lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud, AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel, AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys, lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig, AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel, Integer.valueOf(AV86DevCruId), Integer.valueOf(AV87Clicod), AV89DevCruFecfrom, AV90DevCruFecto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A11678DevCruStt = P09SH4_A11678DevCruStt[0] ;
         A11670DevCruFec = P09SH4_A11670DevCruFec[0] ;
         A252CliCod = P09SH4_A252CliCod[0] ;
         A11669DevCruId = P09SH4_A11669DevCruId[0] ;
         A396EmprCod = P09SH4_A396EmprCod[0] ;
         A11676DevCruDtSy = P09SH4_A11676DevCruDtSy[0] ;
         A11681DevCruAT = P09SH4_A11681DevCruAT[0] ;
         A11679DevCruEnvA = P09SH4_A11679DevCruEnvA[0] ;
         A13983DevCruATCU = P09SH4_A13983DevCruATCU[0] ;
         A11680DevCruAtId = P09SH4_A11680DevCruAtId[0] ;
         A11673DevCruSal = P09SH4_A11673DevCruSal[0] ;
         A11671DevCruEst = P09SH4_A11671DevCruEst[0] ;
         A11674DevCruHash = P09SH4_A11674DevCruHash[0] ;
         A14375DevFirma4d = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
         if ( ! (GXutil.strcmp("", A14375DevFirma4d)==0) )
         {
            AV57Option = A14375DevFirma4d ;
            AV56InsertIndex = 1 ;
            while ( ( AV56InsertIndex <= AV58Options.size() ) && ( GXutil.strcmp((String)AV58Options.elementAt(-1+AV56InsertIndex), AV57Option) < 0 ) )
            {
               AV56InsertIndex = (int)(AV56InsertIndex+1) ;
            }
            if ( ( AV56InsertIndex <= AV58Options.size() ) && ( GXutil.strcmp((String)AV58Options.elementAt(-1+AV56InsertIndex), AV57Option) == 0 ) )
            {
               AV62count = GXutil.lval( (String)AV61OptionIndexes.elementAt(-1+AV56InsertIndex)) ;
               AV62count = (long)(AV62count+1) ;
               AV61OptionIndexes.removeItem(AV56InsertIndex);
               AV61OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), AV56InsertIndex);
            }
            else
            {
               AV58Options.add(AV57Option, AV56InsertIndex);
               AV61OptionIndexes.add("1", AV56InsertIndex);
            }
         }
         if ( AV58Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = devoluciontejido_1wwgetfilterdata.this.AV71OptionsJson;
      this.aP4[0] = devoluciontejido_1wwgetfilterdata.this.AV72OptionsDescJson;
      this.aP5[0] = devoluciontejido_1wwgetfilterdata.this.AV73OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV71OptionsJson = "" ;
      AV72OptionsDescJson = "" ;
      AV73OptionIndexesJson = "" ;
      AV58Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63Session = httpContext.getWebSession();
      AV65GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV81TFDevCruEst_SelsJson = "" ;
      AV82TFDevCruEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV18TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV44TFDevCruAtId = "" ;
      AV45TFDevCruAtId_Sel = "" ;
      AV50TFDevCruATCUD = "" ;
      AV51TFDevCruATCUD_Sel = "" ;
      AV77TFDevCruEnvAT_SelsJson = "" ;
      AV78TFDevCruEnvAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV83TFDevCruAT_SelsJson = "" ;
      AV84TFDevCruAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36TFDevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      AV79TFDevFirma4dig = "" ;
      AV80TFDevFirma4dig_Sel = "" ;
      A11680DevCruAtId = "" ;
      AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = "" ;
      AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = "" ;
      AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = "" ;
      AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = "" ;
      AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = GXutil.resetTime( GXutil.nullDate() );
      AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = "" ;
      AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = "" ;
      scmdbuf = "" ;
      lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = "" ;
      lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = "" ;
      lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = "" ;
      A11681DevCruAT = "" ;
      AV89DevCruFecfrom = GXutil.nullDate() ;
      AV90DevCruFecto = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A13983DevCruATCU = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11674DevCruHash = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11678DevCruStt = "" ;
      AV88DevCruStt = "" ;
      A396EmprCod = "" ;
      AV85EmprCod = "" ;
      P09SH2_A396EmprCod = new String[] {""} ;
      P09SH2_A11680DevCruAtId = new String[] {""} ;
      P09SH2_A11678DevCruStt = new String[] {""} ;
      P09SH2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH2_A252CliCod = new int[1] ;
      P09SH2_A11669DevCruId = new int[1] ;
      P09SH2_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH2_A11681DevCruAT = new String[] {""} ;
      P09SH2_A11679DevCruEnvA = new byte[1] ;
      P09SH2_A13983DevCruATCU = new String[] {""} ;
      P09SH2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH2_A11671DevCruEst = new byte[1] ;
      P09SH2_A11674DevCruHash = new String[] {""} ;
      A14375DevFirma4d = "" ;
      AV57Option = "" ;
      P09SH3_A396EmprCod = new String[] {""} ;
      P09SH3_A13983DevCruATCU = new String[] {""} ;
      P09SH3_A11678DevCruStt = new String[] {""} ;
      P09SH3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH3_A252CliCod = new int[1] ;
      P09SH3_A11669DevCruId = new int[1] ;
      P09SH3_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH3_A11681DevCruAT = new String[] {""} ;
      P09SH3_A11679DevCruEnvA = new byte[1] ;
      P09SH3_A11680DevCruAtId = new String[] {""} ;
      P09SH3_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH3_A11671DevCruEst = new byte[1] ;
      P09SH3_A11674DevCruHash = new String[] {""} ;
      P09SH4_A11678DevCruStt = new String[] {""} ;
      P09SH4_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH4_A252CliCod = new int[1] ;
      P09SH4_A11669DevCruId = new int[1] ;
      P09SH4_A396EmprCod = new String[] {""} ;
      P09SH4_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH4_A11681DevCruAT = new String[] {""} ;
      P09SH4_A11679DevCruEnvA = new byte[1] ;
      P09SH4_A13983DevCruATCU = new String[] {""} ;
      P09SH4_A11680DevCruAtId = new String[] {""} ;
      P09SH4_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SH4_A11671DevCruEst = new byte[1] ;
      P09SH4_A11674DevCruHash = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09SH2_A396EmprCod, P09SH2_A11680DevCruAtId, P09SH2_A11678DevCruStt, P09SH2_A11670DevCruFec, P09SH2_A252CliCod, P09SH2_A11669DevCruId, P09SH2_A11676DevCruDtSy, P09SH2_A11681DevCruAT, P09SH2_A11679DevCruEnvA, P09SH2_A13983DevCruATCU,
            P09SH2_A11673DevCruSal, P09SH2_A11671DevCruEst, P09SH2_A11674DevCruHash
            }
            , new Object[] {
            P09SH3_A396EmprCod, P09SH3_A13983DevCruATCU, P09SH3_A11678DevCruStt, P09SH3_A11670DevCruFec, P09SH3_A252CliCod, P09SH3_A11669DevCruId, P09SH3_A11676DevCruDtSy, P09SH3_A11681DevCruAT, P09SH3_A11679DevCruEnvA, P09SH3_A11680DevCruAtId,
            P09SH3_A11673DevCruSal, P09SH3_A11671DevCruEst, P09SH3_A11674DevCruHash
            }
            , new Object[] {
            P09SH4_A11678DevCruStt, P09SH4_A11670DevCruFec, P09SH4_A252CliCod, P09SH4_A11669DevCruId, P09SH4_A396EmprCod, P09SH4_A11676DevCruDtSy, P09SH4_A11681DevCruAT, P09SH4_A11679DevCruEnvA, P09SH4_A13983DevCruATCU, P09SH4_A11680DevCruAtId,
            P09SH4_A11673DevCruSal, P09SH4_A11671DevCruEst, P09SH4_A11674DevCruHash
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private short Gx_err ;
   private int AV93GXV1 ;
   private int AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size ;
   private int AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size ;
   private int AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size ;
   private int AV86DevCruId ;
   private int AV87Clicod ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV56InsertIndex ;
   private long AV62count ;
   private String AV44TFDevCruAtId ;
   private String AV45TFDevCruAtId_Sel ;
   private String AV50TFDevCruATCUD ;
   private String AV51TFDevCruATCUD_Sel ;
   private String AV79TFDevFirma4dig ;
   private String AV80TFDevFirma4dig_Sel ;
   private String A11680DevCruAtId ;
   private String AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ;
   private String AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ;
   private String AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ;
   private String AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ;
   private String AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ;
   private String AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ;
   private String scmdbuf ;
   private String lV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ;
   private String lV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ;
   private String lV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ;
   private String A11681DevCruAT ;
   private String A13983DevCruATCU ;
   private String A11674DevCruHash ;
   private String A11678DevCruStt ;
   private String AV88DevCruStt ;
   private String A396EmprCod ;
   private String AV85EmprCod ;
   private String A14375DevFirma4d ;
   private java.util.Date AV18TFDevCruSal ;
   private java.util.Date AV36TFDevCruDtSys ;
   private java.util.Date AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ;
   private java.util.Date AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date AV89DevCruFecfrom ;
   private java.util.Date AV90DevCruFecto ;
   private java.util.Date A11670DevCruFec ;
   private boolean returnInSub ;
   private boolean brk9SH2 ;
   private boolean brk9SH4 ;
   private String AV71OptionsJson ;
   private String AV72OptionsDescJson ;
   private String AV73OptionIndexesJson ;
   private String AV81TFDevCruEst_SelsJson ;
   private String AV77TFDevCruEnvAT_SelsJson ;
   private String AV83TFDevCruAT_SelsJson ;
   private String AV68DDOName ;
   private String AV69SearchTxt ;
   private String AV70SearchTxtTo ;
   private String AV57Option ;
   private GXSimpleCollection<Byte> AV82TFDevCruEst_Sels ;
   private GXSimpleCollection<Byte> AV78TFDevCruEnvAT_Sels ;
   private GXSimpleCollection<Byte> AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ;
   private GXSimpleCollection<Byte> AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ;
   private com.genexus.webpanels.WebSession AV63Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09SH2_A396EmprCod ;
   private String[] P09SH2_A11680DevCruAtId ;
   private String[] P09SH2_A11678DevCruStt ;
   private java.util.Date[] P09SH2_A11670DevCruFec ;
   private int[] P09SH2_A252CliCod ;
   private int[] P09SH2_A11669DevCruId ;
   private java.util.Date[] P09SH2_A11676DevCruDtSy ;
   private String[] P09SH2_A11681DevCruAT ;
   private byte[] P09SH2_A11679DevCruEnvA ;
   private String[] P09SH2_A13983DevCruATCU ;
   private java.util.Date[] P09SH2_A11673DevCruSal ;
   private byte[] P09SH2_A11671DevCruEst ;
   private String[] P09SH2_A11674DevCruHash ;
   private String[] P09SH3_A396EmprCod ;
   private String[] P09SH3_A13983DevCruATCU ;
   private String[] P09SH3_A11678DevCruStt ;
   private java.util.Date[] P09SH3_A11670DevCruFec ;
   private int[] P09SH3_A252CliCod ;
   private int[] P09SH3_A11669DevCruId ;
   private java.util.Date[] P09SH3_A11676DevCruDtSy ;
   private String[] P09SH3_A11681DevCruAT ;
   private byte[] P09SH3_A11679DevCruEnvA ;
   private String[] P09SH3_A11680DevCruAtId ;
   private java.util.Date[] P09SH3_A11673DevCruSal ;
   private byte[] P09SH3_A11671DevCruEst ;
   private String[] P09SH3_A11674DevCruHash ;
   private String[] P09SH4_A11678DevCruStt ;
   private java.util.Date[] P09SH4_A11670DevCruFec ;
   private int[] P09SH4_A252CliCod ;
   private int[] P09SH4_A11669DevCruId ;
   private String[] P09SH4_A396EmprCod ;
   private java.util.Date[] P09SH4_A11676DevCruDtSy ;
   private String[] P09SH4_A11681DevCruAT ;
   private byte[] P09SH4_A11679DevCruEnvA ;
   private String[] P09SH4_A13983DevCruATCU ;
   private String[] P09SH4_A11680DevCruAtId ;
   private java.util.Date[] P09SH4_A11673DevCruSal ;
   private byte[] P09SH4_A11671DevCruEst ;
   private String[] P09SH4_A11674DevCruHash ;
   private GXSimpleCollection<String> AV84TFDevCruAT_Sels ;
   private GXSimpleCollection<String> AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ;
   private GXSimpleCollection<String> AV58Options ;
   private GXSimpleCollection<String> AV60OptionsDesc ;
   private GXSimpleCollection<String> AV61OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV65GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV66GridStateFilterValue ;
}

final  class devoluciontejido_1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09SH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A11671DevCruEst ,
                                          GXSimpleCollection<Byte> AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                          byte A11679DevCruEnvA ,
                                          GXSimpleCollection<Byte> AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                          String A11681DevCruAT ,
                                          GXSimpleCollection<String> AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                          int AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size ,
                                          java.util.Date AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                          String AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                          String AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                          String AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                          String AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                          int AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size ,
                                          int AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size ,
                                          java.util.Date AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                          String AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                          String AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                          int AV86DevCruId ,
                                          int AV87Clicod ,
                                          java.util.Date AV89DevCruFecfrom ,
                                          java.util.Date AV90DevCruFecto ,
                                          java.util.Date A11673DevCruSal ,
                                          String A11680DevCruAtId ,
                                          String A13983DevCruATCU ,
                                          java.util.Date A11676DevCruDtSy ,
                                          String A11674DevCruHash ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          java.util.Date A11670DevCruFec ,
                                          String A11678DevCruStt ,
                                          String AV88DevCruStt ,
                                          String A396EmprCod ,
                                          String AV85EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, DevCruAtId, DevCruStt, DevCruFec, CliCod, DevCruId, DevCruDtSy, DevCruAT, DevCruEnvA, DevCruATCU, DevCruSal, DevCruEst, DevCruHash FROM TXPDEVCRU" ;
      addWhere(sWhereString, "(DevCruStt = ? or ? = 'T')");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels, "DevCruEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal) )
      {
         addWhere(sWhereString, "(DevCruSal >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(DevCruAtId = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) && ( ! (GXutil.strcmp("", AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DevCruATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) )
      {
         addWhere(sWhereString, "(DevCruATCU = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels, "DevCruEnvA IN (", ")")+")");
      }
      if ( AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels, "DevCruAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys) )
      {
         addWhere(sWhereString, "(DevCruDtSy >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(DevCruHash, 1, 1) || SUBSTR(DevCruHash, 11, 1) || SUBSTR(DevCruHash, 21, 1) || SUBSTR(DevCruHash, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(DevCruHash, 1, 1) || SUBSTR(DevCruHash, 11, 1) || SUBSTR(DevCruHash, 21, 1) || SUBSTR(DevCruHash, 31, 1) = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV86DevCruId) )
      {
         addWhere(sWhereString, "(DevCruId = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Clicod) )
      {
         addWhere(sWhereString, "(CliCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89DevCruFecfrom)) )
      {
         addWhere(sWhereString, "(DevCruFec >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90DevCruFecto)) )
      {
         addWhere(sWhereString, "(DevCruFec <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DevCruAtId" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09SH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A11671DevCruEst ,
                                          GXSimpleCollection<Byte> AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                          byte A11679DevCruEnvA ,
                                          GXSimpleCollection<Byte> AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                          String A11681DevCruAT ,
                                          GXSimpleCollection<String> AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                          int AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size ,
                                          java.util.Date AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                          String AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                          String AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                          String AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                          String AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                          int AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size ,
                                          int AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size ,
                                          java.util.Date AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                          String AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                          String AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                          int AV86DevCruId ,
                                          int AV87Clicod ,
                                          java.util.Date AV89DevCruFecfrom ,
                                          java.util.Date AV90DevCruFecto ,
                                          java.util.Date A11673DevCruSal ,
                                          String A11680DevCruAtId ,
                                          String A13983DevCruATCU ,
                                          java.util.Date A11676DevCruDtSy ,
                                          String A11674DevCruHash ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          java.util.Date A11670DevCruFec ,
                                          String A11678DevCruStt ,
                                          String AV88DevCruStt ,
                                          String A396EmprCod ,
                                          String AV85EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[15];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, DevCruATCU, DevCruStt, DevCruFec, CliCod, DevCruId, DevCruDtSy, DevCruAT, DevCruEnvA, DevCruAtId, DevCruSal, DevCruEst, DevCruHash FROM TXPDEVCRU" ;
      addWhere(sWhereString, "(DevCruStt = ? or ? = 'T')");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels, "DevCruEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal) )
      {
         addWhere(sWhereString, "(DevCruSal >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(DevCruAtId = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) && ( ! (GXutil.strcmp("", AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DevCruATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) )
      {
         addWhere(sWhereString, "(DevCruATCU = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels, "DevCruEnvA IN (", ")")+")");
      }
      if ( AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels, "DevCruAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys) )
      {
         addWhere(sWhereString, "(DevCruDtSy >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(DevCruHash, 1, 1) || SUBSTR(DevCruHash, 11, 1) || SUBSTR(DevCruHash, 21, 1) || SUBSTR(DevCruHash, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(DevCruHash, 1, 1) || SUBSTR(DevCruHash, 11, 1) || SUBSTR(DevCruHash, 21, 1) || SUBSTR(DevCruHash, 31, 1) = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV86DevCruId) )
      {
         addWhere(sWhereString, "(DevCruId = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Clicod) )
      {
         addWhere(sWhereString, "(CliCod = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89DevCruFecfrom)) )
      {
         addWhere(sWhereString, "(DevCruFec >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90DevCruFecto)) )
      {
         addWhere(sWhereString, "(DevCruFec <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DevCruATCU" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09SH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A11671DevCruEst ,
                                          GXSimpleCollection<Byte> AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                          byte A11679DevCruEnvA ,
                                          GXSimpleCollection<Byte> AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                          String A11681DevCruAT ,
                                          GXSimpleCollection<String> AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                          int AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size ,
                                          java.util.Date AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                          String AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                          String AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                          String AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                          String AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                          int AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size ,
                                          int AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size ,
                                          java.util.Date AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                          String AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                          String AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                          int AV86DevCruId ,
                                          int AV87Clicod ,
                                          java.util.Date AV89DevCruFecfrom ,
                                          java.util.Date AV90DevCruFecto ,
                                          java.util.Date A11673DevCruSal ,
                                          String A11680DevCruAtId ,
                                          String A13983DevCruATCU ,
                                          java.util.Date A11676DevCruDtSy ,
                                          String A11674DevCruHash ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          java.util.Date A11670DevCruFec ,
                                          String A11678DevCruStt ,
                                          String AV88DevCruStt ,
                                          String AV85EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT DevCruStt, DevCruFec, CliCod, DevCruId, EmprCod, DevCruDtSy, DevCruAT, DevCruEnvA, DevCruATCU, DevCruAtId, DevCruSal, DevCruEst, DevCruHash FROM TXPDEVCRU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(DevCruStt = ? or ? = 'T')");
      if ( AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV95Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels, "DevCruEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal) )
      {
         addWhere(sWhereString, "(DevCruSal >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV97Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(DevCruAtId = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) && ( ! (GXutil.strcmp("", AV99Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DevCruATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) )
      {
         addWhere(sWhereString, "(DevCruATCU = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels, "DevCruEnvA IN (", ")")+")");
      }
      if ( AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV102Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels, "DevCruAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV103Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys) )
      {
         addWhere(sWhereString, "(DevCruDtSy >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV104Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(DevCruHash, 1, 1) || SUBSTR(DevCruHash, 11, 1) || SUBSTR(DevCruHash, 21, 1) || SUBSTR(DevCruHash, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(DevCruHash, 1, 1) || SUBSTR(DevCruHash, 11, 1) || SUBSTR(DevCruHash, 21, 1) || SUBSTR(DevCruHash, 31, 1) = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV86DevCruId) )
      {
         addWhere(sWhereString, "(DevCruId = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Clicod) )
      {
         addWhere(sWhereString, "(CliCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89DevCruFecfrom)) )
      {
         addWhere(sWhereString, "(DevCruFec >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90DevCruFecto)) )
      {
         addWhere(sWhereString, "(DevCruFec <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P09SH2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P09SH3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_P09SH4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 200);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 200);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 200);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
      }
   }

}

