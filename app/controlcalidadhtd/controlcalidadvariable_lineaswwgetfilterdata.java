package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidadvariable_lineaswwgetfilterdata extends GXProcedure
{
   public controlcalidadvariable_lineaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadvariable_lineaswwgetfilterdata.class ), "" );
   }

   public controlcalidadvariable_lineaswwgetfilterdata( int remoteHandle ,
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
      controlcalidadvariable_lineaswwgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidadvariable_lineaswwgetfilterdata.this.AV38DDOName = aP0;
      controlcalidadvariable_lineaswwgetfilterdata.this.AV39SearchTxt = aP1;
      controlcalidadvariable_lineaswwgetfilterdata.this.AV40SearchTxtTo = aP2;
      controlcalidadvariable_lineaswwgetfilterdata.this.aP3 = aP3;
      controlcalidadvariable_lineaswwgetfilterdata.this.aP4 = aP4;
      controlcalidadvariable_lineaswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_CCTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_CCTVALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTVALDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_CCTVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTVALOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV41OptionsJson = AV28Options.toJSonString(false) ;
      AV42OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV31OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV14TFCCTCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCCTCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV16TFCCTDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV17TFCCTDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV18TFCCTLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCCTLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALLIN") == 0 )
         {
            AV20TFCCTValLin = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCCTValLin_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC") == 0 )
         {
            AV22TFCCTValDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC_SEL") == 0 )
         {
            AV23TFCCTValDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL") == 0 )
         {
            AV24TFCCTVal = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL_SEL") == 0 )
         {
            AV25TFCCTVal_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV39SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV44FilterFullText ;
      AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV10TFEmprCod ;
      AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV12TFEmprNom ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV14TFCCTCod ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV15TFCCTCod_To ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV16TFCCTDsc ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV17TFCCTDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV18TFCCTLin ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV19TFCCTLin_To ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV20TFCCTValLin ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV21TFCCTValLin_To ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV22TFCCTValDsc ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV23TFCCTValDsc_Sel ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV24TFCCTVal ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV25TFCCTVal_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB22 */
      pr_default.execute(0, new Object[] {lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAB22 = false ;
         A396EmprCod = P0AB22_A396EmprCod[0] ;
         A4051CCTVal = P0AB22_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AB22_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0AB22_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB22_A4034CCTLin[0] ;
         A4036CCTDsc = P0AB22_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB22_A4031CCTCod[0] ;
         A407EmprNom = P0AB22_A407EmprNom[0] ;
         n407EmprNom = P0AB22_n407EmprNom[0] ;
         A407EmprNom = P0AB22_A407EmprNom[0] ;
         n407EmprNom = P0AB22_n407EmprNom[0] ;
         A4036CCTDsc = P0AB22_A4036CCTDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AB22_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brkAB22 = false ;
            A4049CCTValLin = P0AB22_A4049CCTValLin[0] ;
            A4034CCTLin = P0AB22_A4034CCTLin[0] ;
            A4031CCTCod = P0AB22_A4031CCTCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAB22 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV27Option = A396EmprCod ;
            AV29OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV28Options.add(AV27Option, 0);
            AV30OptionsDesc.add(AV29OptionDesc, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAB22 )
         {
            brkAB22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV39SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV44FilterFullText ;
      AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV10TFEmprCod ;
      AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV12TFEmprNom ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV14TFCCTCod ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV15TFCCTCod_To ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV16TFCCTDsc ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV17TFCCTDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV18TFCCTLin ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV19TFCCTLin_To ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV20TFCCTValLin ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV21TFCCTValLin_To ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV22TFCCTValDsc ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV23TFCCTValDsc_Sel ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV24TFCCTVal ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV25TFCCTVal_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB23 */
      pr_default.execute(1, new Object[] {lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAB24 = false ;
         A407EmprNom = P0AB23_A407EmprNom[0] ;
         n407EmprNom = P0AB23_n407EmprNom[0] ;
         A4051CCTVal = P0AB23_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AB23_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0AB23_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB23_A4034CCTLin[0] ;
         A4036CCTDsc = P0AB23_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB23_A4031CCTCod[0] ;
         A396EmprCod = P0AB23_A396EmprCod[0] ;
         A407EmprNom = P0AB23_A407EmprNom[0] ;
         n407EmprNom = P0AB23_n407EmprNom[0] ;
         A4036CCTDsc = P0AB23_A4036CCTDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AB23_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brkAB24 = false ;
            A4049CCTValLin = P0AB23_A4049CCTValLin[0] ;
            A4034CCTLin = P0AB23_A4034CCTLin[0] ;
            A4031CCTCod = P0AB23_A4031CCTCod[0] ;
            A396EmprCod = P0AB23_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAB24 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV27Option = A407EmprNom ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAB24 )
         {
            brkAB24 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCCTDsc = AV39SearchTxt ;
      AV17TFCCTDsc_Sel = "" ;
      AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV44FilterFullText ;
      AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV10TFEmprCod ;
      AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV12TFEmprNom ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV14TFCCTCod ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV15TFCCTCod_To ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV16TFCCTDsc ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV17TFCCTDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV18TFCCTLin ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV19TFCCTLin_To ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV20TFCCTValLin ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV21TFCCTValLin_To ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV22TFCCTValDsc ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV23TFCCTValDsc_Sel ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV24TFCCTVal ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV25TFCCTVal_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB24 */
      pr_default.execute(2, new Object[] {lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAB26 = false ;
         A4036CCTDsc = P0AB24_A4036CCTDsc[0] ;
         A4051CCTVal = P0AB24_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AB24_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0AB24_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB24_A4034CCTLin[0] ;
         A4031CCTCod = P0AB24_A4031CCTCod[0] ;
         A407EmprNom = P0AB24_A407EmprNom[0] ;
         n407EmprNom = P0AB24_n407EmprNom[0] ;
         A396EmprCod = P0AB24_A396EmprCod[0] ;
         A407EmprNom = P0AB24_A407EmprNom[0] ;
         n407EmprNom = P0AB24_n407EmprNom[0] ;
         A4036CCTDsc = P0AB24_A4036CCTDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AB24_A4036CCTDsc[0], A4036CCTDsc) == 0 ) )
         {
            brkAB26 = false ;
            A4049CCTValLin = P0AB24_A4049CCTValLin[0] ;
            A4034CCTLin = P0AB24_A4034CCTLin[0] ;
            A4031CCTCod = P0AB24_A4031CCTCod[0] ;
            A396EmprCod = P0AB24_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAB26 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4036CCTDsc)==0) )
         {
            AV27Option = A4036CCTDsc ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAB26 )
         {
            brkAB26 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCCTVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCCTValDsc = AV39SearchTxt ;
      AV23TFCCTValDsc_Sel = "" ;
      AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV44FilterFullText ;
      AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV10TFEmprCod ;
      AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV12TFEmprNom ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV14TFCCTCod ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV15TFCCTCod_To ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV16TFCCTDsc ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV17TFCCTDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV18TFCCTLin ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV19TFCCTLin_To ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV20TFCCTValLin ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV21TFCCTValLin_To ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV22TFCCTValDsc ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV23TFCCTValDsc_Sel ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV24TFCCTVal ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV25TFCCTVal_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB25 */
      pr_default.execute(3, new Object[] {lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAB28 = false ;
         A4050CCTValDsc = P0AB25_A4050CCTValDsc[0] ;
         A4051CCTVal = P0AB25_A4051CCTVal[0] ;
         A4049CCTValLin = P0AB25_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB25_A4034CCTLin[0] ;
         A4036CCTDsc = P0AB25_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB25_A4031CCTCod[0] ;
         A407EmprNom = P0AB25_A407EmprNom[0] ;
         n407EmprNom = P0AB25_n407EmprNom[0] ;
         A396EmprCod = P0AB25_A396EmprCod[0] ;
         A407EmprNom = P0AB25_A407EmprNom[0] ;
         n407EmprNom = P0AB25_n407EmprNom[0] ;
         A4036CCTDsc = P0AB25_A4036CCTDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AB25_A4050CCTValDsc[0], A4050CCTValDsc) == 0 ) )
         {
            brkAB28 = false ;
            A4049CCTValLin = P0AB25_A4049CCTValLin[0] ;
            A4034CCTLin = P0AB25_A4034CCTLin[0] ;
            A4031CCTCod = P0AB25_A4031CCTCod[0] ;
            A396EmprCod = P0AB25_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAB28 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4050CCTValDsc)==0) )
         {
            AV27Option = A4050CCTValDsc ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAB28 )
         {
            brkAB28 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCCTVALOPTIONS' Routine */
      returnInSub = false ;
      AV24TFCCTVal = AV39SearchTxt ;
      AV25TFCCTVal_Sel = "" ;
      AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV44FilterFullText ;
      AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV10TFEmprCod ;
      AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV12TFEmprNom ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV14TFCCTCod ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV15TFCCTCod_To ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV16TFCCTDsc ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV17TFCCTDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV18TFCCTLin ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV19TFCCTLin_To ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV20TFCCTValLin ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV21TFCCTValLin_To ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV22TFCCTValDsc ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV23TFCCTValDsc_Sel ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV24TFCCTVal ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV25TFCCTVal_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB26 */
      pr_default.execute(4, new Object[] {lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAB210 = false ;
         A4051CCTVal = P0AB26_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AB26_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0AB26_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB26_A4034CCTLin[0] ;
         A4036CCTDsc = P0AB26_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB26_A4031CCTCod[0] ;
         A407EmprNom = P0AB26_A407EmprNom[0] ;
         n407EmprNom = P0AB26_n407EmprNom[0] ;
         A396EmprCod = P0AB26_A396EmprCod[0] ;
         A407EmprNom = P0AB26_A407EmprNom[0] ;
         n407EmprNom = P0AB26_n407EmprNom[0] ;
         A4036CCTDsc = P0AB26_A4036CCTDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AB26_A4051CCTVal[0], A4051CCTVal) == 0 ) )
         {
            brkAB210 = false ;
            A4049CCTValLin = P0AB26_A4049CCTValLin[0] ;
            A4034CCTLin = P0AB26_A4034CCTLin[0] ;
            A4031CCTCod = P0AB26_A4031CCTCod[0] ;
            A396EmprCod = P0AB26_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAB210 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A4051CCTVal)==0) )
         {
            AV27Option = A4051CCTVal ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAB210 )
         {
            brkAB210 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidadvariable_lineaswwgetfilterdata.this.AV41OptionsJson;
      this.aP4[0] = controlcalidadvariable_lineaswwgetfilterdata.this.AV42OptionsDescJson;
      this.aP5[0] = controlcalidadvariable_lineaswwgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV41OptionsJson = "" ;
      AV42OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV16TFCCTDsc = "" ;
      AV17TFCCTDsc_Sel = "" ;
      AV22TFCCTValDsc = "" ;
      AV23TFCCTValDsc_Sel = "" ;
      AV24TFCCTVal = "" ;
      AV25TFCCTVal_Sel = "" ;
      A396EmprCod = "" ;
      AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = "" ;
      AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = "" ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = "" ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = "" ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = "" ;
      scmdbuf = "" ;
      lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      A407EmprNom = "" ;
      A4036CCTDsc = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      P0AB22_A396EmprCod = new String[] {""} ;
      P0AB22_A4051CCTVal = new String[] {""} ;
      P0AB22_A4050CCTValDsc = new String[] {""} ;
      P0AB22_A4049CCTValLin = new byte[1] ;
      P0AB22_A4034CCTLin = new short[1] ;
      P0AB22_A4036CCTDsc = new String[] {""} ;
      P0AB22_A4031CCTCod = new int[1] ;
      P0AB22_A407EmprNom = new String[] {""} ;
      P0AB22_n407EmprNom = new boolean[] {false} ;
      AV27Option = "" ;
      AV29OptionDesc = "" ;
      P0AB23_A407EmprNom = new String[] {""} ;
      P0AB23_n407EmprNom = new boolean[] {false} ;
      P0AB23_A4051CCTVal = new String[] {""} ;
      P0AB23_A4050CCTValDsc = new String[] {""} ;
      P0AB23_A4049CCTValLin = new byte[1] ;
      P0AB23_A4034CCTLin = new short[1] ;
      P0AB23_A4036CCTDsc = new String[] {""} ;
      P0AB23_A4031CCTCod = new int[1] ;
      P0AB23_A396EmprCod = new String[] {""} ;
      P0AB24_A4036CCTDsc = new String[] {""} ;
      P0AB24_A4051CCTVal = new String[] {""} ;
      P0AB24_A4050CCTValDsc = new String[] {""} ;
      P0AB24_A4049CCTValLin = new byte[1] ;
      P0AB24_A4034CCTLin = new short[1] ;
      P0AB24_A4031CCTCod = new int[1] ;
      P0AB24_A407EmprNom = new String[] {""} ;
      P0AB24_n407EmprNom = new boolean[] {false} ;
      P0AB24_A396EmprCod = new String[] {""} ;
      P0AB25_A4050CCTValDsc = new String[] {""} ;
      P0AB25_A4051CCTVal = new String[] {""} ;
      P0AB25_A4049CCTValLin = new byte[1] ;
      P0AB25_A4034CCTLin = new short[1] ;
      P0AB25_A4036CCTDsc = new String[] {""} ;
      P0AB25_A4031CCTCod = new int[1] ;
      P0AB25_A407EmprNom = new String[] {""} ;
      P0AB25_n407EmprNom = new boolean[] {false} ;
      P0AB25_A396EmprCod = new String[] {""} ;
      P0AB26_A4051CCTVal = new String[] {""} ;
      P0AB26_A4050CCTValDsc = new String[] {""} ;
      P0AB26_A4049CCTValLin = new byte[1] ;
      P0AB26_A4034CCTLin = new short[1] ;
      P0AB26_A4036CCTDsc = new String[] {""} ;
      P0AB26_A4031CCTCod = new int[1] ;
      P0AB26_A407EmprNom = new String[] {""} ;
      P0AB26_n407EmprNom = new boolean[] {false} ;
      P0AB26_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AB22_A396EmprCod, P0AB22_A4051CCTVal, P0AB22_A4050CCTValDsc, P0AB22_A4049CCTValLin, P0AB22_A4034CCTLin, P0AB22_A4036CCTDsc, P0AB22_A4031CCTCod, P0AB22_A407EmprNom, P0AB22_n407EmprNom
            }
            , new Object[] {
            P0AB23_A407EmprNom, P0AB23_n407EmprNom, P0AB23_A4051CCTVal, P0AB23_A4050CCTValDsc, P0AB23_A4049CCTValLin, P0AB23_A4034CCTLin, P0AB23_A4036CCTDsc, P0AB23_A4031CCTCod, P0AB23_A396EmprCod
            }
            , new Object[] {
            P0AB24_A4036CCTDsc, P0AB24_A4051CCTVal, P0AB24_A4050CCTValDsc, P0AB24_A4049CCTValLin, P0AB24_A4034CCTLin, P0AB24_A4031CCTCod, P0AB24_A407EmprNom, P0AB24_n407EmprNom, P0AB24_A396EmprCod
            }
            , new Object[] {
            P0AB25_A4050CCTValDsc, P0AB25_A4051CCTVal, P0AB25_A4049CCTValLin, P0AB25_A4034CCTLin, P0AB25_A4036CCTDsc, P0AB25_A4031CCTCod, P0AB25_A407EmprNom, P0AB25_n407EmprNom, P0AB25_A396EmprCod
            }
            , new Object[] {
            P0AB26_A4051CCTVal, P0AB26_A4050CCTValDsc, P0AB26_A4049CCTValLin, P0AB26_A4034CCTLin, P0AB26_A4036CCTDsc, P0AB26_A4031CCTCod, P0AB26_A407EmprNom, P0AB26_n407EmprNom, P0AB26_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFCCTValLin ;
   private byte AV21TFCCTValLin_To ;
   private byte AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ;
   private byte AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ;
   private byte A4049CCTValLin ;
   private short AV18TFCCTLin ;
   private short AV19TFCCTLin_To ;
   private short AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ;
   private short AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV14TFCCTCod ;
   private int AV15TFCCTCod_To ;
   private int AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ;
   private int AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ;
   private int A4031CCTCod ;
   private long AV32count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV16TFCCTDsc ;
   private String AV17TFCCTDsc_Sel ;
   private String AV22TFCCTValDsc ;
   private String AV23TFCCTValDsc_Sel ;
   private String AV24TFCCTVal ;
   private String AV25TFCCTVal_Sel ;
   private String A396EmprCod ;
   private String AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ;
   private String AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ;
   private String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ;
   private String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ;
   private String AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ;
   private String scmdbuf ;
   private String lV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String lV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String lV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String lV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String A407EmprNom ;
   private String A4036CCTDsc ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private boolean returnInSub ;
   private boolean brkAB22 ;
   private boolean n407EmprNom ;
   private boolean brkAB24 ;
   private boolean brkAB26 ;
   private boolean brkAB28 ;
   private boolean brkAB210 ;
   private String AV41OptionsJson ;
   private String AV42OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV39SearchTxt ;
   private String AV40SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private String lV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private String AV27Option ;
   private String AV29OptionDesc ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AB22_A396EmprCod ;
   private String[] P0AB22_A4051CCTVal ;
   private String[] P0AB22_A4050CCTValDsc ;
   private byte[] P0AB22_A4049CCTValLin ;
   private short[] P0AB22_A4034CCTLin ;
   private String[] P0AB22_A4036CCTDsc ;
   private int[] P0AB22_A4031CCTCod ;
   private String[] P0AB22_A407EmprNom ;
   private boolean[] P0AB22_n407EmprNom ;
   private String[] P0AB23_A407EmprNom ;
   private boolean[] P0AB23_n407EmprNom ;
   private String[] P0AB23_A4051CCTVal ;
   private String[] P0AB23_A4050CCTValDsc ;
   private byte[] P0AB23_A4049CCTValLin ;
   private short[] P0AB23_A4034CCTLin ;
   private String[] P0AB23_A4036CCTDsc ;
   private int[] P0AB23_A4031CCTCod ;
   private String[] P0AB23_A396EmprCod ;
   private String[] P0AB24_A4036CCTDsc ;
   private String[] P0AB24_A4051CCTVal ;
   private String[] P0AB24_A4050CCTValDsc ;
   private byte[] P0AB24_A4049CCTValLin ;
   private short[] P0AB24_A4034CCTLin ;
   private int[] P0AB24_A4031CCTCod ;
   private String[] P0AB24_A407EmprNom ;
   private boolean[] P0AB24_n407EmprNom ;
   private String[] P0AB24_A396EmprCod ;
   private String[] P0AB25_A4050CCTValDsc ;
   private String[] P0AB25_A4051CCTVal ;
   private byte[] P0AB25_A4049CCTValLin ;
   private short[] P0AB25_A4034CCTLin ;
   private String[] P0AB25_A4036CCTDsc ;
   private int[] P0AB25_A4031CCTCod ;
   private String[] P0AB25_A407EmprNom ;
   private boolean[] P0AB25_n407EmprNom ;
   private String[] P0AB25_A396EmprCod ;
   private String[] P0AB26_A4051CCTVal ;
   private String[] P0AB26_A4050CCTValDsc ;
   private byte[] P0AB26_A4049CCTValLin ;
   private short[] P0AB26_A4034CCTLin ;
   private String[] P0AB26_A4036CCTDsc ;
   private int[] P0AB26_A4031CCTCod ;
   private String[] P0AB26_A407EmprNom ;
   private boolean[] P0AB26_n407EmprNom ;
   private String[] P0AB26_A396EmprCod ;
   private GXSimpleCollection<String> AV28Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV31OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class controlcalidadvariable_lineaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AB22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTVal, T1.CCTValDsc, T1.CCTValLin, T1.CCTLin, T3.CCTDsc, T1.CCTCod, T2.EmprNom FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AB23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.CCTVal, T1.CCTValDsc, T1.CCTValLin, T1.CCTLin, T3.CCTDsc, T1.CCTCod, T1.EmprCod FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AB24( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.CCTDsc, T1.CCTVal, T1.CCTValDsc, T1.CCTValLin, T1.CCTLin, T1.CCTCod, T2.EmprNom, T1.EmprCod FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CCTDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AB25( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.CCTValDsc, T1.CCTVal, T1.CCTValLin, T1.CCTLin, T3.CCTDsc, T1.CCTCod, T2.EmprNom, T1.EmprCod FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCTValDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AB26( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[24];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.CCTVal, T1.CCTValDsc, T1.CCTValLin, T1.CCTLin, T3.CCTDsc, T1.CCTCod, T2.EmprNom, T1.EmprCod FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCTVal" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P0AB22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P0AB23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P0AB24(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 3 :
                  return conditional_P0AB25(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 4 :
                  return conditional_P0AB26(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AB22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AB23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AB24", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AB25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AB26", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
      }
   }

}

