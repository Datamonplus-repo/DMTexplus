package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_header_trnwwgetfilterdata extends GXProcedure
{
   public trabajoexterno_header_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_header_trnwwgetfilterdata.class ), "" );
   }

   public trabajoexterno_header_trnwwgetfilterdata( int remoteHandle ,
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
      trabajoexterno_header_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      trabajoexterno_header_trnwwgetfilterdata.this.AV37DDOName = aP0;
      trabajoexterno_header_trnwwgetfilterdata.this.AV38SearchTxt = aP1;
      trabajoexterno_header_trnwwgetfilterdata.this.AV39SearchTxtTo = aP2;
      trabajoexterno_header_trnwwgetfilterdata.this.aP3 = aP3;
      trabajoexterno_header_trnwwgetfilterdata.this.aP4 = aP4;
      trabajoexterno_header_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV37DDOName), "DDO_SALCODEID") == 0 )
      {
         /* Execute user subroutine: 'LOADSALCODEIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV37DDOName), "DDO_SALEXTATCUD") == 0 )
      {
         /* Execute user subroutine: 'LOADSALEXTATCUDOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV37DDOName), "DDO_SALFIRMA4D") == 0 )
      {
         /* Execute user subroutine: 'LOADSALFIRMA4DOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV27Options.toJSonString(false) ;
      AV41OptionsDescJson = AV29OptionsDesc.toJSonString(false) ;
      AV42OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue("TrabajosExternos.TrabajoExterno_Header_TRNWWGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternos.TrabajoExterno_Header_TRNWWGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV32Session.getValue("TrabajosExternos.TrabajoExterno_Header_TRNWWGridState"), null, null);
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTLIS_SEL") == 0 )
         {
            AV45TFSalExtLis_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV46TFSalExtLis_Sels.fromJSonString(AV45TFSalExtLis_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS_SEL") == 0 )
         {
            AV49TFSalSts_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV50TFSalSts_Sels.fromJSonString(AV49TFSalSts_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFECSAL") == 0 )
         {
            AV66TFSalFecSal = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALCODEID") == 0 )
         {
            AV47TFSalCodeID = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALCODEID_SEL") == 0 )
         {
            AV48TFSalCodeID_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTATCUD") == 0 )
         {
            AV23TFSalExtATCUD = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTATCUD_SEL") == 0 )
         {
            AV24TFSalExtATCUD_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALENVAT_SEL") == 0 )
         {
            AV62TFSalEnvAT_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV63TFSalEnvAT_Sels.fromJSonString(AV62TFSalEnvAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTAT_SEL") == 0 )
         {
            AV64TFSalExtAT_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV65TFSalExtAT_Sels.fromJSonString(AV64TFSalExtAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFHH") == 0 )
         {
            AV67TFSalFhh = localUtil.ctot( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFIRMA4D") == 0 )
         {
            AV60TFSalFirma4d = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFIRMA4D_SEL") == 0 )
         {
            AV61TFSalFirma4d_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSALCODEIDOPTIONS' Routine */
      returnInSub = false ;
      AV47TFSalCodeID = AV38SearchTxt ;
      AV48TFSalCodeID_Sel = "" ;
      AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV46TFSalExtLis_Sels ;
      AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV50TFSalSts_Sels ;
      AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV66TFSalFecSal ;
      AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV47TFSalCodeID ;
      AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV48TFSalCodeID_Sel ;
      AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV23TFSalExtATCUD ;
      AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV24TFSalExtATCUD_Sel ;
      AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV63TFSalEnvAT_Sels ;
      AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV65TFSalExtAT_Sels ;
      AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV67TFSalFhh ;
      AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV60TFSalFirma4d ;
      AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV61TFSalFirma4d_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A2258SalExtLis) ,
                                           AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                           A10080SalSts ,
                                           AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                           Byte.valueOf(A10741SalEnvAT) ,
                                           AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                           A10767SalExtAT ,
                                           AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                           Integer.valueOf(AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels.size()) ,
                                           Integer.valueOf(AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels.size()) ,
                                           AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                           AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                           AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                           AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                           AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                           Integer.valueOf(AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels.size()) ,
                                           Integer.valueOf(AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels.size()) ,
                                           AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                           AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                           AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                           Integer.valueOf(AV56SalExtAlb) ,
                                           Short.valueOf(AV57ManCod) ,
                                           AV58SalExtFec ,
                                           AV59SalExtFecTo ,
                                           A14398SalFecSal ,
                                           A10742SalCodeID ,
                                           A14348SalExtATCU ,
                                           A10076SalFhh ,
                                           A10077SalFmd ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A2256SalExtFec ,
                                           AV68SalSts ,
                                           A396EmprCod ,
                                           AV55EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid), 20, "%") ;
      lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud), 20, "%") ;
      lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = GXutil.padr( GXutil.rtrim( AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d), 6, "%") ;
      /* Using cursor P0ABL2 */
      pr_default.execute(0, new Object[] {AV68SalSts, AV68SalSts, AV55EmprCod, AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal, lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid, AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel, lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud, AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel, AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh, lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d, AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel, Integer.valueOf(AV56SalExtAlb), Short.valueOf(AV57ManCod), AV58SalExtFec, AV59SalExtFecTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkABL2 = false ;
         A396EmprCod = P0ABL2_A396EmprCod[0] ;
         A10742SalCodeID = P0ABL2_A10742SalCodeID[0] ;
         A2256SalExtFec = P0ABL2_A2256SalExtFec[0] ;
         A2248ManCod = P0ABL2_A2248ManCod[0] ;
         A2253SalExtAlb = P0ABL2_A2253SalExtAlb[0] ;
         A10076SalFhh = P0ABL2_A10076SalFhh[0] ;
         A10767SalExtAT = P0ABL2_A10767SalExtAT[0] ;
         A10741SalEnvAT = P0ABL2_A10741SalEnvAT[0] ;
         A14348SalExtATCU = P0ABL2_A14348SalExtATCU[0] ;
         A14398SalFecSal = P0ABL2_A14398SalFecSal[0] ;
         A10080SalSts = P0ABL2_A10080SalSts[0] ;
         A2258SalExtLis = P0ABL2_A2258SalExtLis[0] ;
         A10077SalFmd = P0ABL2_A10077SalFmd[0] ;
         A14373SalFirma4d = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
         AV31count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ABL2_A10742SalCodeID[0], A10742SalCodeID) == 0 ) )
         {
            brkABL2 = false ;
            A396EmprCod = P0ABL2_A396EmprCod[0] ;
            A2253SalExtAlb = P0ABL2_A2253SalExtAlb[0] ;
            AV31count = (long)(AV31count+1) ;
            brkABL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A10742SalCodeID)==0) )
         {
            AV26Option = A10742SalCodeID ;
            AV27Options.add(AV26Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV31count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABL2 )
         {
            brkABL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADSALEXTATCUDOPTIONS' Routine */
      returnInSub = false ;
      AV23TFSalExtATCUD = AV38SearchTxt ;
      AV24TFSalExtATCUD_Sel = "" ;
      AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV46TFSalExtLis_Sels ;
      AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV50TFSalSts_Sels ;
      AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV66TFSalFecSal ;
      AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV47TFSalCodeID ;
      AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV48TFSalCodeID_Sel ;
      AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV23TFSalExtATCUD ;
      AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV24TFSalExtATCUD_Sel ;
      AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV63TFSalEnvAT_Sels ;
      AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV65TFSalExtAT_Sels ;
      AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV67TFSalFhh ;
      AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV60TFSalFirma4d ;
      AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV61TFSalFirma4d_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A2258SalExtLis) ,
                                           AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                           A10080SalSts ,
                                           AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                           Byte.valueOf(A10741SalEnvAT) ,
                                           AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                           A10767SalExtAT ,
                                           AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                           Integer.valueOf(AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels.size()) ,
                                           Integer.valueOf(AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels.size()) ,
                                           AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                           AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                           AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                           AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                           AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                           Integer.valueOf(AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels.size()) ,
                                           Integer.valueOf(AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels.size()) ,
                                           AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                           AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                           AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                           Integer.valueOf(AV56SalExtAlb) ,
                                           Short.valueOf(AV57ManCod) ,
                                           AV58SalExtFec ,
                                           AV59SalExtFecTo ,
                                           A14398SalFecSal ,
                                           A10742SalCodeID ,
                                           A14348SalExtATCU ,
                                           A10076SalFhh ,
                                           A10077SalFmd ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A2256SalExtFec ,
                                           AV68SalSts ,
                                           A396EmprCod ,
                                           AV55EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid), 20, "%") ;
      lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud), 20, "%") ;
      lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = GXutil.padr( GXutil.rtrim( AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d), 6, "%") ;
      /* Using cursor P0ABL3 */
      pr_default.execute(1, new Object[] {AV68SalSts, AV68SalSts, AV55EmprCod, AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal, lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid, AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel, lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud, AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel, AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh, lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d, AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel, Integer.valueOf(AV56SalExtAlb), Short.valueOf(AV57ManCod), AV58SalExtFec, AV59SalExtFecTo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkABL4 = false ;
         A396EmprCod = P0ABL3_A396EmprCod[0] ;
         A14348SalExtATCU = P0ABL3_A14348SalExtATCU[0] ;
         A2256SalExtFec = P0ABL3_A2256SalExtFec[0] ;
         A2248ManCod = P0ABL3_A2248ManCod[0] ;
         A2253SalExtAlb = P0ABL3_A2253SalExtAlb[0] ;
         A10076SalFhh = P0ABL3_A10076SalFhh[0] ;
         A10767SalExtAT = P0ABL3_A10767SalExtAT[0] ;
         A10741SalEnvAT = P0ABL3_A10741SalEnvAT[0] ;
         A10742SalCodeID = P0ABL3_A10742SalCodeID[0] ;
         A14398SalFecSal = P0ABL3_A14398SalFecSal[0] ;
         A10080SalSts = P0ABL3_A10080SalSts[0] ;
         A2258SalExtLis = P0ABL3_A2258SalExtLis[0] ;
         A10077SalFmd = P0ABL3_A10077SalFmd[0] ;
         A14373SalFirma4d = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
         AV31count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ABL3_A14348SalExtATCU[0], A14348SalExtATCU) == 0 ) )
         {
            brkABL4 = false ;
            A396EmprCod = P0ABL3_A396EmprCod[0] ;
            A2253SalExtAlb = P0ABL3_A2253SalExtAlb[0] ;
            AV31count = (long)(AV31count+1) ;
            brkABL4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A14348SalExtATCU)==0) )
         {
            AV26Option = A14348SalExtATCU ;
            AV27Options.add(AV26Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV31count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABL4 )
         {
            brkABL4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADSALFIRMA4DOPTIONS' Routine */
      returnInSub = false ;
      AV60TFSalFirma4d = AV38SearchTxt ;
      AV61TFSalFirma4d_Sel = "" ;
      AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV46TFSalExtLis_Sels ;
      AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV50TFSalSts_Sels ;
      AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV66TFSalFecSal ;
      AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV47TFSalCodeID ;
      AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV48TFSalCodeID_Sel ;
      AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV23TFSalExtATCUD ;
      AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV24TFSalExtATCUD_Sel ;
      AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV63TFSalEnvAT_Sels ;
      AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV65TFSalExtAT_Sels ;
      AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV67TFSalFhh ;
      AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV60TFSalFirma4d ;
      AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV61TFSalFirma4d_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A2258SalExtLis) ,
                                           AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                           A10080SalSts ,
                                           AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                           Byte.valueOf(A10741SalEnvAT) ,
                                           AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                           A10767SalExtAT ,
                                           AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                           Integer.valueOf(AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels.size()) ,
                                           Integer.valueOf(AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels.size()) ,
                                           AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                           AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                           AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                           AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                           AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                           Integer.valueOf(AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels.size()) ,
                                           Integer.valueOf(AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels.size()) ,
                                           AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                           AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                           AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                           Integer.valueOf(AV56SalExtAlb) ,
                                           Short.valueOf(AV57ManCod) ,
                                           AV58SalExtFec ,
                                           AV59SalExtFecTo ,
                                           A14398SalFecSal ,
                                           A10742SalCodeID ,
                                           A14348SalExtATCU ,
                                           A10076SalFhh ,
                                           A10077SalFmd ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A2256SalExtFec ,
                                           AV68SalSts ,
                                           AV55EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = GXutil.padr( GXutil.rtrim( AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid), 20, "%") ;
      lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = GXutil.padr( GXutil.rtrim( AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud), 20, "%") ;
      lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = GXutil.padr( GXutil.rtrim( AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d), 6, "%") ;
      /* Using cursor P0ABL4 */
      pr_default.execute(2, new Object[] {AV55EmprCod, AV68SalSts, AV68SalSts, AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal, lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid, AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel, lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud, AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel, AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh, lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d, AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel, Integer.valueOf(AV56SalExtAlb), Short.valueOf(AV57ManCod), AV58SalExtFec, AV59SalExtFecTo});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2256SalExtFec = P0ABL4_A2256SalExtFec[0] ;
         A2248ManCod = P0ABL4_A2248ManCod[0] ;
         A2253SalExtAlb = P0ABL4_A2253SalExtAlb[0] ;
         A396EmprCod = P0ABL4_A396EmprCod[0] ;
         A10076SalFhh = P0ABL4_A10076SalFhh[0] ;
         A10767SalExtAT = P0ABL4_A10767SalExtAT[0] ;
         A10741SalEnvAT = P0ABL4_A10741SalEnvAT[0] ;
         A14348SalExtATCU = P0ABL4_A14348SalExtATCU[0] ;
         A10742SalCodeID = P0ABL4_A10742SalCodeID[0] ;
         A14398SalFecSal = P0ABL4_A14398SalFecSal[0] ;
         A10080SalSts = P0ABL4_A10080SalSts[0] ;
         A2258SalExtLis = P0ABL4_A2258SalExtLis[0] ;
         A10077SalFmd = P0ABL4_A10077SalFmd[0] ;
         A14373SalFirma4d = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
         if ( ! (GXutil.strcmp("", A14373SalFirma4d)==0) )
         {
            AV26Option = A14373SalFirma4d ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            if ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) == 0 ) )
            {
               AV31count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV25InsertIndex)) ;
               AV31count = (long)(AV31count+1) ;
               AV30OptionIndexes.removeItem(AV25InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV31count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
            }
            else
            {
               AV27Options.add(AV26Option, AV25InsertIndex);
               AV30OptionIndexes.add("1", AV25InsertIndex);
            }
         }
         if ( AV27Options.size() == 50 )
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
      this.aP3[0] = trabajoexterno_header_trnwwgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = trabajoexterno_header_trnwwgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = trabajoexterno_header_trnwwgetfilterdata.this.AV42OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV42OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32Session = httpContext.getWebSession();
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV45TFSalExtLis_SelsJson = "" ;
      AV46TFSalExtLis_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV49TFSalSts_SelsJson = "" ;
      AV50TFSalSts_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66TFSalFecSal = GXutil.nullDate() ;
      AV47TFSalCodeID = "" ;
      AV48TFSalCodeID_Sel = "" ;
      AV23TFSalExtATCUD = "" ;
      AV24TFSalExtATCUD_Sel = "" ;
      AV62TFSalEnvAT_SelsJson = "" ;
      AV63TFSalEnvAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV64TFSalExtAT_SelsJson = "" ;
      AV65TFSalExtAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV67TFSalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV60TFSalFirma4d = "" ;
      AV61TFSalFirma4d_Sel = "" ;
      A10742SalCodeID = "" ;
      AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = GXutil.nullDate() ;
      AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = "" ;
      AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = "" ;
      AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = "" ;
      AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = "" ;
      AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = GXutil.resetTime( GXutil.nullDate() );
      AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = "" ;
      AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = "" ;
      scmdbuf = "" ;
      lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = "" ;
      lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = "" ;
      lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = "" ;
      A10080SalSts = "" ;
      A10767SalExtAT = "" ;
      AV58SalExtFec = GXutil.nullDate() ;
      AV59SalExtFecTo = GXutil.nullDate() ;
      A14398SalFecSal = GXutil.nullDate() ;
      A14348SalExtATCU = "" ;
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      A10077SalFmd = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      AV68SalSts = "" ;
      A396EmprCod = "" ;
      AV55EmprCod = "" ;
      P0ABL2_A396EmprCod = new String[] {""} ;
      P0ABL2_A10742SalCodeID = new String[] {""} ;
      P0ABL2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL2_A2248ManCod = new short[1] ;
      P0ABL2_A2253SalExtAlb = new int[1] ;
      P0ABL2_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL2_A10767SalExtAT = new String[] {""} ;
      P0ABL2_A10741SalEnvAT = new byte[1] ;
      P0ABL2_A14348SalExtATCU = new String[] {""} ;
      P0ABL2_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL2_A10080SalSts = new String[] {""} ;
      P0ABL2_A2258SalExtLis = new byte[1] ;
      P0ABL2_A10077SalFmd = new String[] {""} ;
      A14373SalFirma4d = "" ;
      AV26Option = "" ;
      P0ABL3_A396EmprCod = new String[] {""} ;
      P0ABL3_A14348SalExtATCU = new String[] {""} ;
      P0ABL3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL3_A2248ManCod = new short[1] ;
      P0ABL3_A2253SalExtAlb = new int[1] ;
      P0ABL3_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL3_A10767SalExtAT = new String[] {""} ;
      P0ABL3_A10741SalEnvAT = new byte[1] ;
      P0ABL3_A10742SalCodeID = new String[] {""} ;
      P0ABL3_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL3_A10080SalSts = new String[] {""} ;
      P0ABL3_A2258SalExtLis = new byte[1] ;
      P0ABL3_A10077SalFmd = new String[] {""} ;
      P0ABL4_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL4_A2248ManCod = new short[1] ;
      P0ABL4_A2253SalExtAlb = new int[1] ;
      P0ABL4_A396EmprCod = new String[] {""} ;
      P0ABL4_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL4_A10767SalExtAT = new String[] {""} ;
      P0ABL4_A10741SalEnvAT = new byte[1] ;
      P0ABL4_A14348SalExtATCU = new String[] {""} ;
      P0ABL4_A10742SalCodeID = new String[] {""} ;
      P0ABL4_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABL4_A10080SalSts = new String[] {""} ;
      P0ABL4_A2258SalExtLis = new byte[1] ;
      P0ABL4_A10077SalFmd = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ABL2_A396EmprCod, P0ABL2_A10742SalCodeID, P0ABL2_A2256SalExtFec, P0ABL2_A2248ManCod, P0ABL2_A2253SalExtAlb, P0ABL2_A10076SalFhh, P0ABL2_A10767SalExtAT, P0ABL2_A10741SalEnvAT, P0ABL2_A14348SalExtATCU, P0ABL2_A14398SalFecSal,
            P0ABL2_A10080SalSts, P0ABL2_A2258SalExtLis, P0ABL2_A10077SalFmd
            }
            , new Object[] {
            P0ABL3_A396EmprCod, P0ABL3_A14348SalExtATCU, P0ABL3_A2256SalExtFec, P0ABL3_A2248ManCod, P0ABL3_A2253SalExtAlb, P0ABL3_A10076SalFhh, P0ABL3_A10767SalExtAT, P0ABL3_A10741SalEnvAT, P0ABL3_A10742SalCodeID, P0ABL3_A14398SalFecSal,
            P0ABL3_A10080SalSts, P0ABL3_A2258SalExtLis, P0ABL3_A10077SalFmd
            }
            , new Object[] {
            P0ABL4_A2256SalExtFec, P0ABL4_A2248ManCod, P0ABL4_A2253SalExtAlb, P0ABL4_A396EmprCod, P0ABL4_A10076SalFhh, P0ABL4_A10767SalExtAT, P0ABL4_A10741SalEnvAT, P0ABL4_A14348SalExtATCU, P0ABL4_A10742SalCodeID, P0ABL4_A14398SalFecSal,
            P0ABL4_A10080SalSts, P0ABL4_A2258SalExtLis, P0ABL4_A10077SalFmd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2258SalExtLis ;
   private byte A10741SalEnvAT ;
   private short AV57ManCod ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int AV71GXV1 ;
   private int AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size ;
   private int AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size ;
   private int AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size ;
   private int AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size ;
   private int AV56SalExtAlb ;
   private int A2253SalExtAlb ;
   private int AV25InsertIndex ;
   private long AV31count ;
   private String AV47TFSalCodeID ;
   private String AV48TFSalCodeID_Sel ;
   private String AV23TFSalExtATCUD ;
   private String AV24TFSalExtATCUD_Sel ;
   private String AV60TFSalFirma4d ;
   private String AV61TFSalFirma4d_Sel ;
   private String A10742SalCodeID ;
   private String AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ;
   private String AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ;
   private String AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ;
   private String AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ;
   private String AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ;
   private String AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ;
   private String scmdbuf ;
   private String lV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ;
   private String lV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ;
   private String lV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ;
   private String A10080SalSts ;
   private String A10767SalExtAT ;
   private String A14348SalExtATCU ;
   private String A10077SalFmd ;
   private String AV68SalSts ;
   private String A396EmprCod ;
   private String AV55EmprCod ;
   private String A14373SalFirma4d ;
   private java.util.Date AV67TFSalFhh ;
   private java.util.Date AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date AV66TFSalFecSal ;
   private java.util.Date AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ;
   private java.util.Date AV58SalExtFec ;
   private java.util.Date AV59SalExtFecTo ;
   private java.util.Date A14398SalFecSal ;
   private java.util.Date A2256SalExtFec ;
   private boolean returnInSub ;
   private boolean brkABL2 ;
   private boolean brkABL4 ;
   private String AV40OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV42OptionIndexesJson ;
   private String AV45TFSalExtLis_SelsJson ;
   private String AV49TFSalSts_SelsJson ;
   private String AV62TFSalEnvAT_SelsJson ;
   private String AV64TFSalExtAT_SelsJson ;
   private String AV37DDOName ;
   private String AV38SearchTxt ;
   private String AV39SearchTxtTo ;
   private String AV26Option ;
   private GXSimpleCollection<Byte> AV46TFSalExtLis_Sels ;
   private GXSimpleCollection<Byte> AV63TFSalEnvAT_Sels ;
   private GXSimpleCollection<Byte> AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ;
   private GXSimpleCollection<Byte> AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABL2_A396EmprCod ;
   private String[] P0ABL2_A10742SalCodeID ;
   private java.util.Date[] P0ABL2_A2256SalExtFec ;
   private short[] P0ABL2_A2248ManCod ;
   private int[] P0ABL2_A2253SalExtAlb ;
   private java.util.Date[] P0ABL2_A10076SalFhh ;
   private String[] P0ABL2_A10767SalExtAT ;
   private byte[] P0ABL2_A10741SalEnvAT ;
   private String[] P0ABL2_A14348SalExtATCU ;
   private java.util.Date[] P0ABL2_A14398SalFecSal ;
   private String[] P0ABL2_A10080SalSts ;
   private byte[] P0ABL2_A2258SalExtLis ;
   private String[] P0ABL2_A10077SalFmd ;
   private String[] P0ABL3_A396EmprCod ;
   private String[] P0ABL3_A14348SalExtATCU ;
   private java.util.Date[] P0ABL3_A2256SalExtFec ;
   private short[] P0ABL3_A2248ManCod ;
   private int[] P0ABL3_A2253SalExtAlb ;
   private java.util.Date[] P0ABL3_A10076SalFhh ;
   private String[] P0ABL3_A10767SalExtAT ;
   private byte[] P0ABL3_A10741SalEnvAT ;
   private String[] P0ABL3_A10742SalCodeID ;
   private java.util.Date[] P0ABL3_A14398SalFecSal ;
   private String[] P0ABL3_A10080SalSts ;
   private byte[] P0ABL3_A2258SalExtLis ;
   private String[] P0ABL3_A10077SalFmd ;
   private java.util.Date[] P0ABL4_A2256SalExtFec ;
   private short[] P0ABL4_A2248ManCod ;
   private int[] P0ABL4_A2253SalExtAlb ;
   private String[] P0ABL4_A396EmprCod ;
   private java.util.Date[] P0ABL4_A10076SalFhh ;
   private String[] P0ABL4_A10767SalExtAT ;
   private byte[] P0ABL4_A10741SalEnvAT ;
   private String[] P0ABL4_A14348SalExtATCU ;
   private String[] P0ABL4_A10742SalCodeID ;
   private java.util.Date[] P0ABL4_A14398SalFecSal ;
   private String[] P0ABL4_A10080SalSts ;
   private byte[] P0ABL4_A2258SalExtLis ;
   private String[] P0ABL4_A10077SalFmd ;
   private GXSimpleCollection<String> AV50TFSalSts_Sels ;
   private GXSimpleCollection<String> AV65TFSalExtAT_Sels ;
   private GXSimpleCollection<String> AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ;
   private GXSimpleCollection<String> AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV29OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class trabajoexterno_header_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ABL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A2258SalExtLis ,
                                          GXSimpleCollection<Byte> AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                          String A10080SalSts ,
                                          GXSimpleCollection<String> AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                          byte A10741SalEnvAT ,
                                          GXSimpleCollection<Byte> AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                          String A10767SalExtAT ,
                                          GXSimpleCollection<String> AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                          int AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size ,
                                          int AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size ,
                                          java.util.Date AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                          String AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                          String AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                          String AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                          String AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                          int AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size ,
                                          int AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size ,
                                          java.util.Date AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                          String AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                          String AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                          int AV56SalExtAlb ,
                                          short AV57ManCod ,
                                          java.util.Date AV58SalExtFec ,
                                          java.util.Date AV59SalExtFecTo ,
                                          java.util.Date A14398SalFecSal ,
                                          String A10742SalCodeID ,
                                          String A14348SalExtATCU ,
                                          java.util.Date A10076SalFhh ,
                                          String A10077SalFmd ,
                                          int A2253SalExtAlb ,
                                          short A2248ManCod ,
                                          java.util.Date A2256SalExtFec ,
                                          String AV68SalSts ,
                                          String A396EmprCod ,
                                          String AV55EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalCodeID, SalExtFec, ManCod, SalExtAlb, SalFhh, SalExtAT, SalEnvAT, SalExtATCU, SalFecSal, SalSts, SalExtLis, SalFmd FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(SalSts = ? or ? = 'T')");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels, "SalExtLis IN (", ")")+")");
      }
      if ( AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels, "SalSts IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal)) )
      {
         addWhere(sWhereString, "(SalFecSal >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SalCodeID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) )
      {
         addWhere(sWhereString, "(SalCodeID = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SalExtATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) )
      {
         addWhere(sWhereString, "(SalExtATCU = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels, "SalEnvAT IN (", ")")+")");
      }
      if ( AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels, "SalExtAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh) )
      {
         addWhere(sWhereString, "(SalFhh >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(SalFmd, 1, 1) || SUBSTR(SalFmd, 11, 1) || SUBSTR(SalFmd, 21, 1) || SUBSTR(SalFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(SalFmd, 1, 1) || SUBSTR(SalFmd, 11, 1) || SUBSTR(SalFmd, 21, 1) || SUBSTR(SalFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV56SalExtAlb) )
      {
         addWhere(sWhereString, "(SalExtAlb = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV57ManCod) )
      {
         addWhere(sWhereString, "(ManCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58SalExtFec)) )
      {
         addWhere(sWhereString, "(SalExtFec >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59SalExtFecTo)) )
      {
         addWhere(sWhereString, "(SalExtFec <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY SalCodeID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ABL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A2258SalExtLis ,
                                          GXSimpleCollection<Byte> AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                          String A10080SalSts ,
                                          GXSimpleCollection<String> AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                          byte A10741SalEnvAT ,
                                          GXSimpleCollection<Byte> AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                          String A10767SalExtAT ,
                                          GXSimpleCollection<String> AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                          int AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size ,
                                          int AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size ,
                                          java.util.Date AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                          String AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                          String AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                          String AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                          String AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                          int AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size ,
                                          int AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size ,
                                          java.util.Date AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                          String AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                          String AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                          int AV56SalExtAlb ,
                                          short AV57ManCod ,
                                          java.util.Date AV58SalExtFec ,
                                          java.util.Date AV59SalExtFecTo ,
                                          java.util.Date A14398SalFecSal ,
                                          String A10742SalCodeID ,
                                          String A14348SalExtATCU ,
                                          java.util.Date A10076SalFhh ,
                                          String A10077SalFmd ,
                                          int A2253SalExtAlb ,
                                          short A2248ManCod ,
                                          java.util.Date A2256SalExtFec ,
                                          String AV68SalSts ,
                                          String A396EmprCod ,
                                          String AV55EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[15];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, SalExtATCU, SalExtFec, ManCod, SalExtAlb, SalFhh, SalExtAT, SalEnvAT, SalCodeID, SalFecSal, SalSts, SalExtLis, SalFmd FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(SalSts = ? or ? = 'T')");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels, "SalExtLis IN (", ")")+")");
      }
      if ( AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels, "SalSts IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal)) )
      {
         addWhere(sWhereString, "(SalFecSal >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SalCodeID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) )
      {
         addWhere(sWhereString, "(SalCodeID = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SalExtATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) )
      {
         addWhere(sWhereString, "(SalExtATCU = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels, "SalEnvAT IN (", ")")+")");
      }
      if ( AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels, "SalExtAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh) )
      {
         addWhere(sWhereString, "(SalFhh >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(SalFmd, 1, 1) || SUBSTR(SalFmd, 11, 1) || SUBSTR(SalFmd, 21, 1) || SUBSTR(SalFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(SalFmd, 1, 1) || SUBSTR(SalFmd, 11, 1) || SUBSTR(SalFmd, 21, 1) || SUBSTR(SalFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV56SalExtAlb) )
      {
         addWhere(sWhereString, "(SalExtAlb = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV57ManCod) )
      {
         addWhere(sWhereString, "(ManCod = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58SalExtFec)) )
      {
         addWhere(sWhereString, "(SalExtFec >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59SalExtFecTo)) )
      {
         addWhere(sWhereString, "(SalExtFec <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY SalExtATCU" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0ABL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A2258SalExtLis ,
                                          GXSimpleCollection<Byte> AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                          String A10080SalSts ,
                                          GXSimpleCollection<String> AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                          byte A10741SalEnvAT ,
                                          GXSimpleCollection<Byte> AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                          String A10767SalExtAT ,
                                          GXSimpleCollection<String> AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                          int AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size ,
                                          int AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size ,
                                          java.util.Date AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                          String AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                          String AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                          String AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                          String AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                          int AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size ,
                                          int AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size ,
                                          java.util.Date AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                          String AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                          String AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                          int AV56SalExtAlb ,
                                          short AV57ManCod ,
                                          java.util.Date AV58SalExtFec ,
                                          java.util.Date AV59SalExtFecTo ,
                                          java.util.Date A14398SalFecSal ,
                                          String A10742SalCodeID ,
                                          String A14348SalExtATCU ,
                                          java.util.Date A10076SalFhh ,
                                          String A10077SalFmd ,
                                          int A2253SalExtAlb ,
                                          short A2248ManCod ,
                                          java.util.Date A2256SalExtFec ,
                                          String AV68SalSts ,
                                          String AV55EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT SalExtFec, ManCod, SalExtAlb, EmprCod, SalFhh, SalExtAT, SalEnvAT, SalExtATCU, SalCodeID, SalFecSal, SalSts, SalExtLis, SalFmd FROM TXPCEXTSA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(SalSts = ? or ? = 'T')");
      if ( AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels, "SalExtLis IN (", ")")+")");
      }
      if ( AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels, "SalSts IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal)) )
      {
         addWhere(sWhereString, "(SalFecSal >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SalCodeID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) )
      {
         addWhere(sWhereString, "(SalCodeID = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SalExtATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) )
      {
         addWhere(sWhereString, "(SalExtATCU = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels, "SalEnvAT IN (", ")")+")");
      }
      if ( AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels, "SalExtAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV82Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh) )
      {
         addWhere(sWhereString, "(SalFhh >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(SalFmd, 1, 1) || SUBSTR(SalFmd, 11, 1) || SUBSTR(SalFmd, 21, 1) || SUBSTR(SalFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(SalFmd, 1, 1) || SUBSTR(SalFmd, 11, 1) || SUBSTR(SalFmd, 21, 1) || SUBSTR(SalFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV56SalExtAlb) )
      {
         addWhere(sWhereString, "(SalExtAlb = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV57ManCod) )
      {
         addWhere(sWhereString, "(ManCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58SalExtFec)) )
      {
         addWhere(sWhereString, "(SalExtFec >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59SalExtFecTo)) )
      {
         addWhere(sWhereString, "(SalExtFec <= ?)");
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
                  return conditional_P0ABL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).shortValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_P0ABL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).shortValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 2 :
                  return conditional_P0ABL4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).shortValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 200);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 200);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
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
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
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
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
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
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
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
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
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
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
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

