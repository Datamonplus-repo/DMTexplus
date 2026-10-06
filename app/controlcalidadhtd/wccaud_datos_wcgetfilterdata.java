package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccaud_datos_wcgetfilterdata extends GXProcedure
{
   public wccaud_datos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccaud_datos_wcgetfilterdata.class ), "" );
   }

   public wccaud_datos_wcgetfilterdata( int remoteHandle ,
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
      wccaud_datos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      wccaud_datos_wcgetfilterdata.this.AV28DDOName = aP0;
      wccaud_datos_wcgetfilterdata.this.AV29SearchTxt = aP1;
      wccaud_datos_wcgetfilterdata.this.AV30SearchTxtTo = aP2;
      wccaud_datos_wcgetfilterdata.this.aP3 = aP3;
      wccaud_datos_wcgetfilterdata.this.aP4 = aP4;
      wccaud_datos_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CCTLINDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTLINDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CCVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADCCVALOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CCFVALSTD") == 0 )
      {
         /* Execute user subroutine: 'LOADCCFVALSTDOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("ControlCalidadHTD.Wccaud_Datos_WCGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.Wccaud_Datos_WCGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("ControlCalidadHTD.Wccaud_Datos_WCGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV10TFCCTLin = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTLin_To = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV12TFCCTLinDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV13TFCCTLinDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL") == 0 )
         {
            AV14TFCCVal = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL_SEL") == 0 )
         {
            AV15TFCCVal_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFVALSTD") == 0 )
         {
            AV42TFCCfValStd = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFVALSTD_SEL") == 0 )
         {
            AV43TFCCfValStd_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTLINDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTLinDsc = AV29SearchTxt ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin = AV10TFCCTLin ;
      AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = AV14TFCCVal ;
      AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = AV15TFCCVal_Sel ;
      AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = AV42TFCCfValStd ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = AV43TFCCfValStd_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) ,
                                           Short.valueOf(AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) ,
                                           AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                           AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                           AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                           AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A4035CCVal ,
                                           AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                           AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                           A14419CCfValStd } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc), 30, "%") ;
      lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval), 40, "%") ;
      /* Using cursor P0ANU2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin), Short.valueOf(AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to), lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc, AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel, lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval, AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkANU2 = false ;
         A129BarCod = P0ANU2_A129BarCod[0] ;
         A132BarCodReo = P0ANU2_A132BarCodReo[0] ;
         A130BarCodPar = P0ANU2_A130BarCodPar[0] ;
         A4035CCVal = P0ANU2_A4035CCVal[0] ;
         A4043CCTLinDsc = P0ANU2_A4043CCTLinDsc[0] ;
         A136BarColNum = P0ANU2_A136BarColNum[0] ;
         A135BarColNom = P0ANU2_A135BarColNom[0] ;
         A4034CCTLin = P0ANU2_A4034CCTLin[0] ;
         A4031CCTCod = P0ANU2_A4031CCTCod[0] ;
         A212BarSer = P0ANU2_A212BarSer[0] ;
         A252CliCod = P0ANU2_A252CliCod[0] ;
         n252CliCod = P0ANU2_n252CliCod[0] ;
         A396EmprCod = P0ANU2_A396EmprCod[0] ;
         A758ProCod = P0ANU2_A758ProCod[0] ;
         A194BarOrdLin = P0ANU2_A194BarOrdLin[0] ;
         A136BarColNum = P0ANU2_A136BarColNum[0] ;
         A135BarColNom = P0ANU2_A135BarColNom[0] ;
         A212BarSer = P0ANU2_A212BarSer[0] ;
         A252CliCod = P0ANU2_A252CliCod[0] ;
         n252CliCod = P0ANU2_n252CliCod[0] ;
         A4043CCTLinDsc = P0ANU2_A4043CCTLinDsc[0] ;
         GXt_char2 = A14419CCfValStd ;
         GXv_char3[0] = GXt_char2 ;
         new app.controlcalidadhtd.pccstdval(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A4031CCTCod, A4034CCTLin, GXv_char3) ;
         wccaud_datos_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14419CCfValStd = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd)==0) ) ) || ( GXutil.like( GXutil.upper( A14419CCfValStd) , GXutil.padr( "%" + GXutil.upper( AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) || ( ( GXutil.strcmp(A14419CCfValStd, AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel) == 0 ) ) )
            {
               AV22count = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ANU2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ANU2_A4031CCTCod[0] == A4031CCTCod ) && ( P0ANU2_A4034CCTLin[0] == A4034CCTLin ) )
               {
                  brkANU2 = false ;
                  A129BarCod = P0ANU2_A129BarCod[0] ;
                  A132BarCodReo = P0ANU2_A132BarCodReo[0] ;
                  A130BarCodPar = P0ANU2_A130BarCodPar[0] ;
                  A758ProCod = P0ANU2_A758ProCod[0] ;
                  A194BarOrdLin = P0ANU2_A194BarOrdLin[0] ;
                  AV22count = (long)(AV22count+1) ;
                  brkANU2 = true ;
                  pr_default.readNext(0);
               }
               if ( ! (GXutil.strcmp("", A4043CCTLinDsc)==0) )
               {
                  AV17Option = A4043CCTLinDsc ;
                  AV16InsertIndex = 1 ;
                  while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
                  {
                     AV16InsertIndex = (int)(AV16InsertIndex+1) ;
                  }
                  AV18Options.add(AV17Option, AV16InsertIndex);
                  AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), AV16InsertIndex);
               }
               if ( AV18Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkANU2 )
         {
            brkANU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCVALOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCCVal = AV29SearchTxt ;
      AV15TFCCVal_Sel = "" ;
      AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin = AV10TFCCTLin ;
      AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = AV14TFCCVal ;
      AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = AV15TFCCVal_Sel ;
      AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = AV42TFCCfValStd ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = AV43TFCCfValStd_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) ,
                                           Short.valueOf(AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) ,
                                           AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                           AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                           AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                           AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A4035CCVal ,
                                           AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                           AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                           A14419CCfValStd } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc), 30, "%") ;
      lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval), 40, "%") ;
      /* Using cursor P0ANU3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin), Short.valueOf(AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to), lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc, AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel, lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval, AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkANU4 = false ;
         A129BarCod = P0ANU3_A129BarCod[0] ;
         A132BarCodReo = P0ANU3_A132BarCodReo[0] ;
         A130BarCodPar = P0ANU3_A130BarCodPar[0] ;
         A4035CCVal = P0ANU3_A4035CCVal[0] ;
         A4043CCTLinDsc = P0ANU3_A4043CCTLinDsc[0] ;
         A136BarColNum = P0ANU3_A136BarColNum[0] ;
         A135BarColNom = P0ANU3_A135BarColNom[0] ;
         A4034CCTLin = P0ANU3_A4034CCTLin[0] ;
         A4031CCTCod = P0ANU3_A4031CCTCod[0] ;
         A212BarSer = P0ANU3_A212BarSer[0] ;
         A252CliCod = P0ANU3_A252CliCod[0] ;
         n252CliCod = P0ANU3_n252CliCod[0] ;
         A396EmprCod = P0ANU3_A396EmprCod[0] ;
         A758ProCod = P0ANU3_A758ProCod[0] ;
         A194BarOrdLin = P0ANU3_A194BarOrdLin[0] ;
         A136BarColNum = P0ANU3_A136BarColNum[0] ;
         A135BarColNom = P0ANU3_A135BarColNom[0] ;
         A212BarSer = P0ANU3_A212BarSer[0] ;
         A252CliCod = P0ANU3_A252CliCod[0] ;
         n252CliCod = P0ANU3_n252CliCod[0] ;
         A4043CCTLinDsc = P0ANU3_A4043CCTLinDsc[0] ;
         GXt_char2 = A14419CCfValStd ;
         GXv_char3[0] = GXt_char2 ;
         new app.controlcalidadhtd.pccstdval(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A4031CCTCod, A4034CCTLin, GXv_char3) ;
         wccaud_datos_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14419CCfValStd = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd)==0) ) ) || ( GXutil.like( GXutil.upper( A14419CCfValStd) , GXutil.padr( "%" + GXutil.upper( AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) || ( ( GXutil.strcmp(A14419CCfValStd, AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel) == 0 ) ) )
            {
               AV22count = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ANU3_A4035CCVal[0], A4035CCVal) == 0 ) )
               {
                  brkANU4 = false ;
                  A129BarCod = P0ANU3_A129BarCod[0] ;
                  A132BarCodReo = P0ANU3_A132BarCodReo[0] ;
                  A130BarCodPar = P0ANU3_A130BarCodPar[0] ;
                  A4034CCTLin = P0ANU3_A4034CCTLin[0] ;
                  A4031CCTCod = P0ANU3_A4031CCTCod[0] ;
                  A396EmprCod = P0ANU3_A396EmprCod[0] ;
                  A758ProCod = P0ANU3_A758ProCod[0] ;
                  A194BarOrdLin = P0ANU3_A194BarOrdLin[0] ;
                  AV22count = (long)(AV22count+1) ;
                  brkANU4 = true ;
                  pr_default.readNext(1);
               }
               if ( ! (GXutil.strcmp("", A4035CCVal)==0) )
               {
                  AV17Option = A4035CCVal ;
                  AV18Options.add(AV17Option, 0);
                  AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV18Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkANU4 )
         {
            brkANU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCFVALSTDOPTIONS' Routine */
      returnInSub = false ;
      AV42TFCCfValStd = AV29SearchTxt ;
      AV43TFCCfValStd_Sel = "" ;
      AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin = AV10TFCCTLin ;
      AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = AV14TFCCVal ;
      AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = AV15TFCCVal_Sel ;
      AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = AV42TFCCfValStd ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = AV43TFCCfValStd_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) ,
                                           Short.valueOf(AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) ,
                                           AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                           AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                           AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                           AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A4035CCVal ,
                                           AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                           AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                           A14419CCfValStd } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc), 30, "%") ;
      lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval), 40, "%") ;
      /* Using cursor P0ANU4 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin), Short.valueOf(AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to), lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc, AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel, lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval, AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A129BarCod = P0ANU4_A129BarCod[0] ;
         A132BarCodReo = P0ANU4_A132BarCodReo[0] ;
         A130BarCodPar = P0ANU4_A130BarCodPar[0] ;
         A4035CCVal = P0ANU4_A4035CCVal[0] ;
         A4043CCTLinDsc = P0ANU4_A4043CCTLinDsc[0] ;
         A136BarColNum = P0ANU4_A136BarColNum[0] ;
         A135BarColNom = P0ANU4_A135BarColNom[0] ;
         A4034CCTLin = P0ANU4_A4034CCTLin[0] ;
         A4031CCTCod = P0ANU4_A4031CCTCod[0] ;
         A212BarSer = P0ANU4_A212BarSer[0] ;
         A252CliCod = P0ANU4_A252CliCod[0] ;
         n252CliCod = P0ANU4_n252CliCod[0] ;
         A396EmprCod = P0ANU4_A396EmprCod[0] ;
         A758ProCod = P0ANU4_A758ProCod[0] ;
         A194BarOrdLin = P0ANU4_A194BarOrdLin[0] ;
         A136BarColNum = P0ANU4_A136BarColNum[0] ;
         A135BarColNom = P0ANU4_A135BarColNom[0] ;
         A212BarSer = P0ANU4_A212BarSer[0] ;
         A252CliCod = P0ANU4_A252CliCod[0] ;
         n252CliCod = P0ANU4_n252CliCod[0] ;
         A4043CCTLinDsc = P0ANU4_A4043CCTLinDsc[0] ;
         GXt_char2 = A14419CCfValStd ;
         GXv_char3[0] = GXt_char2 ;
         new app.controlcalidadhtd.pccstdval(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A4031CCTCod, A4034CCTLin, GXv_char3) ;
         wccaud_datos_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14419CCfValStd = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd)==0) ) ) || ( GXutil.like( GXutil.upper( A14419CCfValStd) , GXutil.padr( "%" + GXutil.upper( AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) || ( ( GXutil.strcmp(A14419CCfValStd, AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel) == 0 ) ) )
            {
               if ( ! (GXutil.strcmp("", A14419CCfValStd)==0) )
               {
                  AV17Option = A14419CCfValStd ;
                  AV16InsertIndex = 1 ;
                  while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
                  {
                     AV16InsertIndex = (int)(AV16InsertIndex+1) ;
                  }
                  if ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) == 0 ) )
                  {
                     AV22count = GXutil.lval( (String)AV21OptionIndexes.elementAt(-1+AV16InsertIndex)) ;
                     AV22count = (long)(AV22count+1) ;
                     AV21OptionIndexes.removeItem(AV16InsertIndex);
                     AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), AV16InsertIndex);
                  }
                  else
                  {
                     AV18Options.add(AV17Option, AV16InsertIndex);
                     AV21OptionIndexes.add("1", AV16InsertIndex);
                  }
               }
               if ( AV18Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wccaud_datos_wcgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = wccaud_datos_wcgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = wccaud_datos_wcgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFCCTLinDsc = "" ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV14TFCCVal = "" ;
      AV15TFCCVal_Sel = "" ;
      AV42TFCCfValStd = "" ;
      AV43TFCCfValStd_Sel = "" ;
      A4043CCTLinDsc = "" ;
      AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = "" ;
      AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = "" ;
      AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = "" ;
      AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = "" ;
      AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = "" ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = "" ;
      scmdbuf = "" ;
      lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = "" ;
      lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = "" ;
      A4035CCVal = "" ;
      A14419CCfValStd = "" ;
      P0ANU2_A129BarCod = new int[1] ;
      P0ANU2_A132BarCodReo = new byte[1] ;
      P0ANU2_A130BarCodPar = new String[] {""} ;
      P0ANU2_A4035CCVal = new String[] {""} ;
      P0ANU2_A4043CCTLinDsc = new String[] {""} ;
      P0ANU2_A136BarColNum = new int[1] ;
      P0ANU2_A135BarColNom = new String[] {""} ;
      P0ANU2_A4034CCTLin = new short[1] ;
      P0ANU2_A4031CCTCod = new int[1] ;
      P0ANU2_A212BarSer = new String[] {""} ;
      P0ANU2_A252CliCod = new int[1] ;
      P0ANU2_n252CliCod = new boolean[] {false} ;
      P0ANU2_A396EmprCod = new String[] {""} ;
      P0ANU2_A758ProCod = new String[] {""} ;
      P0ANU2_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      AV17Option = "" ;
      P0ANU3_A129BarCod = new int[1] ;
      P0ANU3_A132BarCodReo = new byte[1] ;
      P0ANU3_A130BarCodPar = new String[] {""} ;
      P0ANU3_A4035CCVal = new String[] {""} ;
      P0ANU3_A4043CCTLinDsc = new String[] {""} ;
      P0ANU3_A136BarColNum = new int[1] ;
      P0ANU3_A135BarColNom = new String[] {""} ;
      P0ANU3_A4034CCTLin = new short[1] ;
      P0ANU3_A4031CCTCod = new int[1] ;
      P0ANU3_A212BarSer = new String[] {""} ;
      P0ANU3_A252CliCod = new int[1] ;
      P0ANU3_n252CliCod = new boolean[] {false} ;
      P0ANU3_A396EmprCod = new String[] {""} ;
      P0ANU3_A758ProCod = new String[] {""} ;
      P0ANU3_A194BarOrdLin = new short[1] ;
      P0ANU4_A129BarCod = new int[1] ;
      P0ANU4_A132BarCodReo = new byte[1] ;
      P0ANU4_A130BarCodPar = new String[] {""} ;
      P0ANU4_A4035CCVal = new String[] {""} ;
      P0ANU4_A4043CCTLinDsc = new String[] {""} ;
      P0ANU4_A136BarColNum = new int[1] ;
      P0ANU4_A135BarColNom = new String[] {""} ;
      P0ANU4_A4034CCTLin = new short[1] ;
      P0ANU4_A4031CCTCod = new int[1] ;
      P0ANU4_A212BarSer = new String[] {""} ;
      P0ANU4_A252CliCod = new int[1] ;
      P0ANU4_n252CliCod = new boolean[] {false} ;
      P0ANU4_A396EmprCod = new String[] {""} ;
      P0ANU4_A758ProCod = new String[] {""} ;
      P0ANU4_A194BarOrdLin = new short[1] ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wccaud_datos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ANU2_A129BarCod, P0ANU2_A132BarCodReo, P0ANU2_A130BarCodPar, P0ANU2_A4035CCVal, P0ANU2_A4043CCTLinDsc, P0ANU2_A136BarColNum, P0ANU2_A135BarColNom, P0ANU2_A4034CCTLin, P0ANU2_A4031CCTCod, P0ANU2_A212BarSer,
            P0ANU2_A252CliCod, P0ANU2_n252CliCod, P0ANU2_A396EmprCod, P0ANU2_A758ProCod, P0ANU2_A194BarOrdLin
            }
            , new Object[] {
            P0ANU3_A129BarCod, P0ANU3_A132BarCodReo, P0ANU3_A130BarCodPar, P0ANU3_A4035CCVal, P0ANU3_A4043CCTLinDsc, P0ANU3_A136BarColNum, P0ANU3_A135BarColNom, P0ANU3_A4034CCTLin, P0ANU3_A4031CCTCod, P0ANU3_A212BarSer,
            P0ANU3_A252CliCod, P0ANU3_n252CliCod, P0ANU3_A396EmprCod, P0ANU3_A758ProCod, P0ANU3_A194BarOrdLin
            }
            , new Object[] {
            P0ANU4_A129BarCod, P0ANU4_A132BarCodReo, P0ANU4_A130BarCodPar, P0ANU4_A4035CCVal, P0ANU4_A4043CCTLinDsc, P0ANU4_A136BarColNum, P0ANU4_A135BarColNom, P0ANU4_A4034CCTLin, P0ANU4_A4031CCTCod, P0ANU4_A212BarSer,
            P0ANU4_A252CliCod, P0ANU4_n252CliCod, P0ANU4_A396EmprCod, P0ANU4_A758ProCod, P0ANU4_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV10TFCCTLin ;
   private short AV11TFCCTLin_To ;
   private short AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ;
   private short AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ;
   private short A4034CCTLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int AV16InsertIndex ;
   private long AV22count ;
   private String AV12TFCCTLinDsc ;
   private String AV13TFCCTLinDsc_Sel ;
   private String AV14TFCCVal ;
   private String AV15TFCCVal_Sel ;
   private String AV42TFCCfValStd ;
   private String AV43TFCCfValStd_Sel ;
   private String A4043CCTLinDsc ;
   private String AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ;
   private String AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ;
   private String AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ;
   private String AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ;
   private String AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ;
   private String AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ;
   private String scmdbuf ;
   private String lV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ;
   private String lV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ;
   private String A4035CCVal ;
   private String A14419CCfValStd ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brkANU2 ;
   private boolean n252CliCod ;
   private boolean brkANU4 ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0ANU2_A129BarCod ;
   private byte[] P0ANU2_A132BarCodReo ;
   private String[] P0ANU2_A130BarCodPar ;
   private String[] P0ANU2_A4035CCVal ;
   private String[] P0ANU2_A4043CCTLinDsc ;
   private int[] P0ANU2_A136BarColNum ;
   private String[] P0ANU2_A135BarColNom ;
   private short[] P0ANU2_A4034CCTLin ;
   private int[] P0ANU2_A4031CCTCod ;
   private String[] P0ANU2_A212BarSer ;
   private int[] P0ANU2_A252CliCod ;
   private boolean[] P0ANU2_n252CliCod ;
   private String[] P0ANU2_A396EmprCod ;
   private String[] P0ANU2_A758ProCod ;
   private short[] P0ANU2_A194BarOrdLin ;
   private int[] P0ANU3_A129BarCod ;
   private byte[] P0ANU3_A132BarCodReo ;
   private String[] P0ANU3_A130BarCodPar ;
   private String[] P0ANU3_A4035CCVal ;
   private String[] P0ANU3_A4043CCTLinDsc ;
   private int[] P0ANU3_A136BarColNum ;
   private String[] P0ANU3_A135BarColNom ;
   private short[] P0ANU3_A4034CCTLin ;
   private int[] P0ANU3_A4031CCTCod ;
   private String[] P0ANU3_A212BarSer ;
   private int[] P0ANU3_A252CliCod ;
   private boolean[] P0ANU3_n252CliCod ;
   private String[] P0ANU3_A396EmprCod ;
   private String[] P0ANU3_A758ProCod ;
   private short[] P0ANU3_A194BarOrdLin ;
   private int[] P0ANU4_A129BarCod ;
   private byte[] P0ANU4_A132BarCodReo ;
   private String[] P0ANU4_A130BarCodPar ;
   private String[] P0ANU4_A4035CCVal ;
   private String[] P0ANU4_A4043CCTLinDsc ;
   private int[] P0ANU4_A136BarColNum ;
   private String[] P0ANU4_A135BarColNom ;
   private short[] P0ANU4_A4034CCTLin ;
   private int[] P0ANU4_A4031CCTCod ;
   private String[] P0ANU4_A212BarSer ;
   private int[] P0ANU4_A252CliCod ;
   private boolean[] P0ANU4_n252CliCod ;
   private String[] P0ANU4_A396EmprCod ;
   private String[] P0ANU4_A758ProCod ;
   private short[] P0ANU4_A194BarOrdLin ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class wccaud_datos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ANU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ,
                                          short AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ,
                                          String AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                          String AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                          String AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                          String AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A4035CCVal ,
                                          String AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                          String AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                          String A14419CCfValStd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CCVal, T3.CCTLinDsc, T2.BarColNum, T2.BarColNom, T1.CCTLin, T1.CCTCod, T2.BarSer, T2.CliCod, T1.EmprCod, T1.ProCod," ;
      scmdbuf += " T1.BarOrdLin FROM ((TXPCC1 T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin)" ;
      if ( ! (0==AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (0==AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ANU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ,
                                          short AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ,
                                          String AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                          String AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                          String AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                          String AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A4035CCVal ,
                                          String AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                          String AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                          String A14419CCfValStd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[6];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CCVal, T3.CCTLinDsc, T2.BarColNum, T2.BarColNom, T1.CCTLin, T1.CCTCod, T2.BarSer, T2.CliCod, T1.EmprCod, T1.ProCod," ;
      scmdbuf += " T1.BarOrdLin FROM ((TXPCC1 T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin)" ;
      if ( ! (0==AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCVal" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0ANU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ,
                                          short AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ,
                                          String AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                          String AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                          String AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                          String AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A4035CCVal ,
                                          String AV55Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                          String AV54Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                          String A14419CCfValStd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[6];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CCVal, T3.CCTLinDsc, T2.BarColNum, T2.BarColNom, T1.CCTLin, T1.CCTCod, T2.BarSer, T2.CliCod, T1.EmprCod, T1.ProCod," ;
      scmdbuf += " T1.BarOrdLin FROM ((TXPCC1 T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin)" ;
      if ( ! (0==AV48Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV49Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_wccaud_datos_wcds_5_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin" ;
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
                  return conditional_P0ANU2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_P0ANU3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 2 :
                  return conditional_P0ANU4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ANU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ANU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
               ((short[]) buf[14])[0] = rslt.getShort(14);
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
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

