package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccsta_wpgetfilterdata extends GXProcedure
{
   public controlcalidad_ccsta_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccsta_wpgetfilterdata.class ), "" );
   }

   public controlcalidad_ccsta_wpgetfilterdata( int remoteHandle ,
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
      controlcalidad_ccsta_wpgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidad_ccsta_wpgetfilterdata.this.AV46DDOName = aP0;
      controlcalidad_ccsta_wpgetfilterdata.this.AV47SearchTxt = aP1;
      controlcalidad_ccsta_wpgetfilterdata.this.AV48SearchTxtTo = aP2;
      controlcalidad_ccsta_wpgetfilterdata.this.aP3 = aP3;
      controlcalidad_ccsta_wpgetfilterdata.this.aP4 = aP4;
      controlcalidad_ccsta_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CCTLINDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CCSMETODO") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSMETODOOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CCSESPECIF") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSESPECIFOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CCSMIN") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSMINOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CCSVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSVALOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CCSMAX") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSMAXOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV49OptionsJson = AV36Options.toJSonString(false) ;
      AV50OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV39OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("ControlCalidadHTD.ControlCalidad_CCSTA_WPGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CCSTA_WPGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("ControlCalidadHTD.ControlCalidad_CCSTA_WPGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV10TFCCTLin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTLin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV12TFCCTLinDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV13TFCCTLinDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMETODO") == 0 )
         {
            AV30TFCCSMetodo = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMETODO_SEL") == 0 )
         {
            AV31TFCCSMetodo_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSESPECIF") == 0 )
         {
            AV32TFCCSEspecif = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSESPECIF_SEL") == 0 )
         {
            AV33TFCCSEspecif_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSAUTO") == 0 )
         {
            AV26TFCCSAuto = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFCCSAuto_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSVTOL") == 0 )
         {
            AV28TFCCSVTol = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFCCSVTol_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMIN") == 0 )
         {
            AV22TFCCSMin = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMIN_SEL") == 0 )
         {
            AV23TFCCSMin_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSVAL") == 0 )
         {
            AV20TFCCSVal = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSVAL_SEL") == 0 )
         {
            AV21TFCCSVal_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMAX") == 0 )
         {
            AV24TFCCSMax = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSMAX_SEL") == 0 )
         {
            AV25TFCCSMax_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTLINDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTLinDsc = AV47SearchTxt ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV30TFCCSMetodo ;
      AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV31TFCCSMetodo_Sel ;
      AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV26TFCCSAuto ;
      AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV27TFCCSAuto_To ;
      AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV28TFCCSVTol ;
      AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV29TFCCSVTol_To ;
      AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV22TFCCSMin ;
      AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV23TFCCSMin_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV20TFCCSVal ;
      AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV21TFCCSVal_Sel ;
      AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV24TFCCSMax ;
      AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV25TFCCSMax_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                           AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                           AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                           AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                           AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                           Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                           Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                           AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                           AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                           AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                           AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                           AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                           AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                           AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                           AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A13247CCSMetodo ,
                                           A13248CCSEspecif ,
                                           Byte.valueOf(A11530CCSAuto) ,
                                           A11532CCSVTol ,
                                           A11482CCSMin ,
                                           A4060CCSVal ,
                                           A11483CCSMax ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV53Clicod) ,
                                           A65ArtCod ,
                                           AV54Artcod ,
                                           A4058CCFColNom ,
                                           AV55CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(AV56CCFColNum) ,
                                           AV52EmprCod ,
                                           Integer.valueOf(AV57CCTCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4031CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
      lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
      lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
      lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
      lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
      /* Using cursor P0AON2 */
      pr_default.execute(0, new Object[] {AV52EmprCod, Integer.valueOf(AV57CCTCod), Integer.valueOf(AV53Clicod), AV54Artcod, AV55CCFColNom, Integer.valueOf(AV56CCFColNum), Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAON2 = false ;
         A4034CCTLin = P0AON2_A4034CCTLin[0] ;
         A4031CCTCod = P0AON2_A4031CCTCod[0] ;
         A396EmprCod = P0AON2_A396EmprCod[0] ;
         A4059CCFColNum = P0AON2_A4059CCFColNum[0] ;
         A4058CCFColNom = P0AON2_A4058CCFColNom[0] ;
         A65ArtCod = P0AON2_A65ArtCod[0] ;
         A252CliCod = P0AON2_A252CliCod[0] ;
         A11483CCSMax = P0AON2_A11483CCSMax[0] ;
         n11483CCSMax = P0AON2_n11483CCSMax[0] ;
         A4060CCSVal = P0AON2_A4060CCSVal[0] ;
         n4060CCSVal = P0AON2_n4060CCSVal[0] ;
         A11482CCSMin = P0AON2_A11482CCSMin[0] ;
         n11482CCSMin = P0AON2_n11482CCSMin[0] ;
         A11532CCSVTol = P0AON2_A11532CCSVTol[0] ;
         A11530CCSAuto = P0AON2_A11530CCSAuto[0] ;
         A13248CCSEspecif = P0AON2_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P0AON2_n13248CCSEspecif[0] ;
         A13247CCSMetodo = P0AON2_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P0AON2_n13247CCSMetodo[0] ;
         A4043CCTLinDsc = P0AON2_A4043CCTLinDsc[0] ;
         A4043CCTLinDsc = P0AON2_A4043CCTLinDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AON2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AON2_A4031CCTCod[0] == A4031CCTCod ) && ( P0AON2_A4034CCTLin[0] == A4034CCTLin ) )
         {
            brkAON2 = false ;
            A4059CCFColNum = P0AON2_A4059CCFColNum[0] ;
            A4058CCFColNom = P0AON2_A4058CCFColNom[0] ;
            A65ArtCod = P0AON2_A65ArtCod[0] ;
            A252CliCod = P0AON2_A252CliCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAON2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4043CCTLinDsc)==0) )
         {
            AV35Option = A4043CCTLinDsc ;
            AV34InsertIndex = 1 ;
            while ( ( AV34InsertIndex <= AV36Options.size() ) && ( GXutil.strcmp((String)AV36Options.elementAt(-1+AV34InsertIndex), AV35Option) < 0 ) )
            {
               AV34InsertIndex = (int)(AV34InsertIndex+1) ;
            }
            AV36Options.add(AV35Option, AV34InsertIndex);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV34InsertIndex);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAON2 )
         {
            brkAON2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCSMETODOOPTIONS' Routine */
      returnInSub = false ;
      AV30TFCCSMetodo = AV47SearchTxt ;
      AV31TFCCSMetodo_Sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV30TFCCSMetodo ;
      AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV31TFCCSMetodo_Sel ;
      AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV26TFCCSAuto ;
      AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV27TFCCSAuto_To ;
      AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV28TFCCSVTol ;
      AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV29TFCCSVTol_To ;
      AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV22TFCCSMin ;
      AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV23TFCCSMin_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV20TFCCSVal ;
      AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV21TFCCSVal_Sel ;
      AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV24TFCCSMax ;
      AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV25TFCCSMax_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                           AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                           AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                           AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                           AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                           Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                           Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                           AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                           AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                           AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                           AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                           AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                           AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                           AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                           AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A13247CCSMetodo ,
                                           A13248CCSEspecif ,
                                           Byte.valueOf(A11530CCSAuto) ,
                                           A11532CCSVTol ,
                                           A11482CCSMin ,
                                           A4060CCSVal ,
                                           A11483CCSMax ,
                                           A396EmprCod ,
                                           AV52EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV53Clicod) ,
                                           A65ArtCod ,
                                           AV54Artcod ,
                                           A4058CCFColNom ,
                                           AV55CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(AV56CCFColNum) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV57CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
      lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
      lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
      lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
      lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
      /* Using cursor P0AON3 */
      pr_default.execute(1, new Object[] {AV52EmprCod, Integer.valueOf(AV53Clicod), AV54Artcod, AV55CCFColNom, Integer.valueOf(AV56CCFColNum), Integer.valueOf(AV57CCTCod), Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAON4 = false ;
         A396EmprCod = P0AON3_A396EmprCod[0] ;
         A252CliCod = P0AON3_A252CliCod[0] ;
         A65ArtCod = P0AON3_A65ArtCod[0] ;
         A4058CCFColNom = P0AON3_A4058CCFColNom[0] ;
         A4059CCFColNum = P0AON3_A4059CCFColNum[0] ;
         A4031CCTCod = P0AON3_A4031CCTCod[0] ;
         A13247CCSMetodo = P0AON3_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P0AON3_n13247CCSMetodo[0] ;
         A11483CCSMax = P0AON3_A11483CCSMax[0] ;
         n11483CCSMax = P0AON3_n11483CCSMax[0] ;
         A4060CCSVal = P0AON3_A4060CCSVal[0] ;
         n4060CCSVal = P0AON3_n4060CCSVal[0] ;
         A11482CCSMin = P0AON3_A11482CCSMin[0] ;
         n11482CCSMin = P0AON3_n11482CCSMin[0] ;
         A11532CCSVTol = P0AON3_A11532CCSVTol[0] ;
         A11530CCSAuto = P0AON3_A11530CCSAuto[0] ;
         A13248CCSEspecif = P0AON3_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P0AON3_n13248CCSEspecif[0] ;
         A4043CCTLinDsc = P0AON3_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AON3_A4034CCTLin[0] ;
         A4043CCTLinDsc = P0AON3_A4043CCTLinDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AON3_A13247CCSMetodo[0], A13247CCSMetodo) == 0 ) )
         {
            brkAON4 = false ;
            A396EmprCod = P0AON3_A396EmprCod[0] ;
            A252CliCod = P0AON3_A252CliCod[0] ;
            A65ArtCod = P0AON3_A65ArtCod[0] ;
            A4058CCFColNom = P0AON3_A4058CCFColNom[0] ;
            A4059CCFColNum = P0AON3_A4059CCFColNum[0] ;
            A4031CCTCod = P0AON3_A4031CCTCod[0] ;
            A4034CCTLin = P0AON3_A4034CCTLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAON4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13247CCSMetodo)==0) )
         {
            AV35Option = A13247CCSMetodo ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAON4 )
         {
            brkAON4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCSESPECIFOPTIONS' Routine */
      returnInSub = false ;
      AV32TFCCSEspecif = AV47SearchTxt ;
      AV33TFCCSEspecif_Sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV30TFCCSMetodo ;
      AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV31TFCCSMetodo_Sel ;
      AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV26TFCCSAuto ;
      AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV27TFCCSAuto_To ;
      AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV28TFCCSVTol ;
      AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV29TFCCSVTol_To ;
      AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV22TFCCSMin ;
      AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV23TFCCSMin_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV20TFCCSVal ;
      AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV21TFCCSVal_Sel ;
      AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV24TFCCSMax ;
      AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV25TFCCSMax_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                           AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                           AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                           AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                           AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                           Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                           Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                           AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                           AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                           AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                           AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                           AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                           AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                           AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                           AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A13247CCSMetodo ,
                                           A13248CCSEspecif ,
                                           Byte.valueOf(A11530CCSAuto) ,
                                           A11532CCSVTol ,
                                           A11482CCSMin ,
                                           A4060CCSVal ,
                                           A11483CCSMax ,
                                           A396EmprCod ,
                                           AV52EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV53Clicod) ,
                                           A65ArtCod ,
                                           AV54Artcod ,
                                           A4058CCFColNom ,
                                           AV55CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(AV56CCFColNum) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV57CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
      lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
      lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
      lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
      lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
      /* Using cursor P0AON4 */
      pr_default.execute(2, new Object[] {AV52EmprCod, Integer.valueOf(AV53Clicod), AV54Artcod, AV55CCFColNom, Integer.valueOf(AV56CCFColNum), Integer.valueOf(AV57CCTCod), Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAON6 = false ;
         A396EmprCod = P0AON4_A396EmprCod[0] ;
         A252CliCod = P0AON4_A252CliCod[0] ;
         A65ArtCod = P0AON4_A65ArtCod[0] ;
         A4058CCFColNom = P0AON4_A4058CCFColNom[0] ;
         A4059CCFColNum = P0AON4_A4059CCFColNum[0] ;
         A4031CCTCod = P0AON4_A4031CCTCod[0] ;
         A13248CCSEspecif = P0AON4_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P0AON4_n13248CCSEspecif[0] ;
         A11483CCSMax = P0AON4_A11483CCSMax[0] ;
         n11483CCSMax = P0AON4_n11483CCSMax[0] ;
         A4060CCSVal = P0AON4_A4060CCSVal[0] ;
         n4060CCSVal = P0AON4_n4060CCSVal[0] ;
         A11482CCSMin = P0AON4_A11482CCSMin[0] ;
         n11482CCSMin = P0AON4_n11482CCSMin[0] ;
         A11532CCSVTol = P0AON4_A11532CCSVTol[0] ;
         A11530CCSAuto = P0AON4_A11530CCSAuto[0] ;
         A13247CCSMetodo = P0AON4_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P0AON4_n13247CCSMetodo[0] ;
         A4043CCTLinDsc = P0AON4_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AON4_A4034CCTLin[0] ;
         A4043CCTLinDsc = P0AON4_A4043CCTLinDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AON4_A13248CCSEspecif[0], A13248CCSEspecif) == 0 ) )
         {
            brkAON6 = false ;
            A396EmprCod = P0AON4_A396EmprCod[0] ;
            A252CliCod = P0AON4_A252CliCod[0] ;
            A65ArtCod = P0AON4_A65ArtCod[0] ;
            A4058CCFColNom = P0AON4_A4058CCFColNom[0] ;
            A4059CCFColNum = P0AON4_A4059CCFColNum[0] ;
            A4031CCTCod = P0AON4_A4031CCTCod[0] ;
            A4034CCTLin = P0AON4_A4034CCTLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAON6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A13248CCSEspecif)==0) )
         {
            AV35Option = A13248CCSEspecif ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAON6 )
         {
            brkAON6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCCSMINOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCCSMin = AV47SearchTxt ;
      AV23TFCCSMin_Sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV30TFCCSMetodo ;
      AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV31TFCCSMetodo_Sel ;
      AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV26TFCCSAuto ;
      AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV27TFCCSAuto_To ;
      AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV28TFCCSVTol ;
      AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV29TFCCSVTol_To ;
      AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV22TFCCSMin ;
      AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV23TFCCSMin_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV20TFCCSVal ;
      AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV21TFCCSVal_Sel ;
      AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV24TFCCSMax ;
      AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV25TFCCSMax_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                           AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                           AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                           AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                           AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                           Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                           Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                           AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                           AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                           AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                           AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                           AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                           AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                           AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                           AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A13247CCSMetodo ,
                                           A13248CCSEspecif ,
                                           Byte.valueOf(A11530CCSAuto) ,
                                           A11532CCSVTol ,
                                           A11482CCSMin ,
                                           A4060CCSVal ,
                                           A11483CCSMax ,
                                           A396EmprCod ,
                                           AV52EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV53Clicod) ,
                                           A65ArtCod ,
                                           AV54Artcod ,
                                           A4058CCFColNom ,
                                           AV55CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(AV56CCFColNum) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV57CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
      lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
      lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
      lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
      lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
      /* Using cursor P0AON5 */
      pr_default.execute(3, new Object[] {AV52EmprCod, Integer.valueOf(AV53Clicod), AV54Artcod, AV55CCFColNom, Integer.valueOf(AV56CCFColNum), Integer.valueOf(AV57CCTCod), Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAON8 = false ;
         A396EmprCod = P0AON5_A396EmprCod[0] ;
         A252CliCod = P0AON5_A252CliCod[0] ;
         A65ArtCod = P0AON5_A65ArtCod[0] ;
         A4058CCFColNom = P0AON5_A4058CCFColNom[0] ;
         A4059CCFColNum = P0AON5_A4059CCFColNum[0] ;
         A4031CCTCod = P0AON5_A4031CCTCod[0] ;
         A11482CCSMin = P0AON5_A11482CCSMin[0] ;
         n11482CCSMin = P0AON5_n11482CCSMin[0] ;
         A11483CCSMax = P0AON5_A11483CCSMax[0] ;
         n11483CCSMax = P0AON5_n11483CCSMax[0] ;
         A4060CCSVal = P0AON5_A4060CCSVal[0] ;
         n4060CCSVal = P0AON5_n4060CCSVal[0] ;
         A11532CCSVTol = P0AON5_A11532CCSVTol[0] ;
         A11530CCSAuto = P0AON5_A11530CCSAuto[0] ;
         A13248CCSEspecif = P0AON5_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P0AON5_n13248CCSEspecif[0] ;
         A13247CCSMetodo = P0AON5_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P0AON5_n13247CCSMetodo[0] ;
         A4043CCTLinDsc = P0AON5_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AON5_A4034CCTLin[0] ;
         A4043CCTLinDsc = P0AON5_A4043CCTLinDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AON5_A11482CCSMin[0], A11482CCSMin) == 0 ) )
         {
            brkAON8 = false ;
            A396EmprCod = P0AON5_A396EmprCod[0] ;
            A252CliCod = P0AON5_A252CliCod[0] ;
            A65ArtCod = P0AON5_A65ArtCod[0] ;
            A4058CCFColNom = P0AON5_A4058CCFColNom[0] ;
            A4059CCFColNum = P0AON5_A4059CCFColNum[0] ;
            A4031CCTCod = P0AON5_A4031CCTCod[0] ;
            A4034CCTLin = P0AON5_A4034CCTLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAON8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A11482CCSMin)==0) )
         {
            AV35Option = A11482CCSMin ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAON8 )
         {
            brkAON8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCCSVALOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCCSVal = AV47SearchTxt ;
      AV21TFCCSVal_Sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV30TFCCSMetodo ;
      AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV31TFCCSMetodo_Sel ;
      AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV26TFCCSAuto ;
      AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV27TFCCSAuto_To ;
      AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV28TFCCSVTol ;
      AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV29TFCCSVTol_To ;
      AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV22TFCCSMin ;
      AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV23TFCCSMin_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV20TFCCSVal ;
      AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV21TFCCSVal_Sel ;
      AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV24TFCCSMax ;
      AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV25TFCCSMax_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                           AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                           AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                           AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                           AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                           Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                           Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                           AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                           AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                           AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                           AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                           AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                           AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                           AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                           AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A13247CCSMetodo ,
                                           A13248CCSEspecif ,
                                           Byte.valueOf(A11530CCSAuto) ,
                                           A11532CCSVTol ,
                                           A11482CCSMin ,
                                           A4060CCSVal ,
                                           A11483CCSMax ,
                                           A396EmprCod ,
                                           AV52EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV53Clicod) ,
                                           A65ArtCod ,
                                           AV54Artcod ,
                                           A4058CCFColNom ,
                                           AV55CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(AV56CCFColNum) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV57CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
      lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
      lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
      lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
      lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
      /* Using cursor P0AON6 */
      pr_default.execute(4, new Object[] {AV52EmprCod, Integer.valueOf(AV53Clicod), AV54Artcod, AV55CCFColNom, Integer.valueOf(AV56CCFColNum), Integer.valueOf(AV57CCTCod), Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAON10 = false ;
         A396EmprCod = P0AON6_A396EmprCod[0] ;
         A252CliCod = P0AON6_A252CliCod[0] ;
         A65ArtCod = P0AON6_A65ArtCod[0] ;
         A4058CCFColNom = P0AON6_A4058CCFColNom[0] ;
         A4059CCFColNum = P0AON6_A4059CCFColNum[0] ;
         A4031CCTCod = P0AON6_A4031CCTCod[0] ;
         A4060CCSVal = P0AON6_A4060CCSVal[0] ;
         n4060CCSVal = P0AON6_n4060CCSVal[0] ;
         A11483CCSMax = P0AON6_A11483CCSMax[0] ;
         n11483CCSMax = P0AON6_n11483CCSMax[0] ;
         A11482CCSMin = P0AON6_A11482CCSMin[0] ;
         n11482CCSMin = P0AON6_n11482CCSMin[0] ;
         A11532CCSVTol = P0AON6_A11532CCSVTol[0] ;
         A11530CCSAuto = P0AON6_A11530CCSAuto[0] ;
         A13248CCSEspecif = P0AON6_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P0AON6_n13248CCSEspecif[0] ;
         A13247CCSMetodo = P0AON6_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P0AON6_n13247CCSMetodo[0] ;
         A4043CCTLinDsc = P0AON6_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AON6_A4034CCTLin[0] ;
         A4043CCTLinDsc = P0AON6_A4043CCTLinDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AON6_A4060CCSVal[0], A4060CCSVal) == 0 ) )
         {
            brkAON10 = false ;
            A396EmprCod = P0AON6_A396EmprCod[0] ;
            A252CliCod = P0AON6_A252CliCod[0] ;
            A65ArtCod = P0AON6_A65ArtCod[0] ;
            A4058CCFColNom = P0AON6_A4058CCFColNom[0] ;
            A4059CCFColNum = P0AON6_A4059CCFColNum[0] ;
            A4031CCTCod = P0AON6_A4031CCTCod[0] ;
            A4034CCTLin = P0AON6_A4034CCTLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAON10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A4060CCSVal)==0) )
         {
            AV35Option = A4060CCSVal ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAON10 )
         {
            brkAON10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADCCSMAXOPTIONS' Routine */
      returnInSub = false ;
      AV24TFCCSMax = AV47SearchTxt ;
      AV25TFCCSMax_Sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = AV30TFCCSMetodo ;
      AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = AV31TFCCSMetodo_Sel ;
      AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = AV32TFCCSEspecif ;
      AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = AV33TFCCSEspecif_Sel ;
      AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto = AV26TFCCSAuto ;
      AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to = AV27TFCCSAuto_To ;
      AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = AV28TFCCSVTol ;
      AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = AV29TFCCSVTol_To ;
      AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = AV22TFCCSMin ;
      AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = AV23TFCCSMin_Sel ;
      AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = AV20TFCCSVal ;
      AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = AV21TFCCSVal_Sel ;
      AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = AV24TFCCSMax ;
      AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = AV25TFCCSMax_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) ,
                                           AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                           AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                           AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                           AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                           Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) ,
                                           Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) ,
                                           AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                           AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                           AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                           AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                           AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                           AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                           AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                           AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A13247CCSMetodo ,
                                           A13248CCSEspecif ,
                                           Byte.valueOf(A11530CCSAuto) ,
                                           A11532CCSVTol ,
                                           A11482CCSMin ,
                                           A4060CCSVal ,
                                           A11483CCSMax ,
                                           A396EmprCod ,
                                           AV52EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV53Clicod) ,
                                           A65ArtCod ,
                                           AV54Artcod ,
                                           A4058CCFColNom ,
                                           AV55CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(AV56CCFColNum) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV57CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc), 30, "%") ;
      lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif), 30, "%") ;
      lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = GXutil.padr( GXutil.rtrim( AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin), 40, "%") ;
      lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = GXutil.padr( GXutil.rtrim( AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval), 40, "%") ;
      lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = GXutil.padr( GXutil.rtrim( AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax), 40, "%") ;
      /* Using cursor P0AON7 */
      pr_default.execute(5, new Object[] {AV52EmprCod, Integer.valueOf(AV53Clicod), AV54Artcod, AV55CCFColNom, Integer.valueOf(AV56CCFColNum), Integer.valueOf(AV57CCTCod), Short.valueOf(AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin), Short.valueOf(AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to), lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc, AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel, lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo, AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel, lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif, AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel, Byte.valueOf(AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto), Byte.valueOf(AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to), AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to, lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin, AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel, lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval, AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel, lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax, AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAON12 = false ;
         A396EmprCod = P0AON7_A396EmprCod[0] ;
         A252CliCod = P0AON7_A252CliCod[0] ;
         A65ArtCod = P0AON7_A65ArtCod[0] ;
         A4058CCFColNom = P0AON7_A4058CCFColNom[0] ;
         A4059CCFColNum = P0AON7_A4059CCFColNum[0] ;
         A4031CCTCod = P0AON7_A4031CCTCod[0] ;
         A11483CCSMax = P0AON7_A11483CCSMax[0] ;
         n11483CCSMax = P0AON7_n11483CCSMax[0] ;
         A4060CCSVal = P0AON7_A4060CCSVal[0] ;
         n4060CCSVal = P0AON7_n4060CCSVal[0] ;
         A11482CCSMin = P0AON7_A11482CCSMin[0] ;
         n11482CCSMin = P0AON7_n11482CCSMin[0] ;
         A11532CCSVTol = P0AON7_A11532CCSVTol[0] ;
         A11530CCSAuto = P0AON7_A11530CCSAuto[0] ;
         A13248CCSEspecif = P0AON7_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P0AON7_n13248CCSEspecif[0] ;
         A13247CCSMetodo = P0AON7_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P0AON7_n13247CCSMetodo[0] ;
         A4043CCTLinDsc = P0AON7_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AON7_A4034CCTLin[0] ;
         A4043CCTLinDsc = P0AON7_A4043CCTLinDsc[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AON7_A11483CCSMax[0], A11483CCSMax) == 0 ) )
         {
            brkAON12 = false ;
            A396EmprCod = P0AON7_A396EmprCod[0] ;
            A252CliCod = P0AON7_A252CliCod[0] ;
            A65ArtCod = P0AON7_A65ArtCod[0] ;
            A4058CCFColNom = P0AON7_A4058CCFColNom[0] ;
            A4059CCFColNum = P0AON7_A4059CCFColNum[0] ;
            A4031CCTCod = P0AON7_A4031CCTCod[0] ;
            A4034CCTLin = P0AON7_A4034CCTLin[0] ;
            AV40count = (long)(AV40count+1) ;
            brkAON12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A11483CCSMax)==0) )
         {
            AV35Option = A11483CCSMax ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAON12 )
         {
            brkAON12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccsta_wpgetfilterdata.this.AV49OptionsJson;
      this.aP4[0] = controlcalidad_ccsta_wpgetfilterdata.this.AV50OptionsDescJson;
      this.aP5[0] = controlcalidad_ccsta_wpgetfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49OptionsJson = "" ;
      AV50OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFCCTLinDsc = "" ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV30TFCCSMetodo = "" ;
      AV31TFCCSMetodo_Sel = "" ;
      AV32TFCCSEspecif = "" ;
      AV33TFCCSEspecif_Sel = "" ;
      AV28TFCCSVTol = DecimalUtil.ZERO ;
      AV29TFCCSVTol_To = DecimalUtil.ZERO ;
      AV22TFCCSMin = "" ;
      AV23TFCCSMin_Sel = "" ;
      AV20TFCCSVal = "" ;
      AV21TFCCSVal_Sel = "" ;
      AV24TFCCSMax = "" ;
      AV25TFCCSMax_Sel = "" ;
      A4043CCTLinDsc = "" ;
      AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = "" ;
      AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel = "" ;
      AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = "" ;
      AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel = "" ;
      AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = "" ;
      AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel = "" ;
      AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol = DecimalUtil.ZERO ;
      AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to = DecimalUtil.ZERO ;
      AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = "" ;
      AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel = "" ;
      AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = "" ;
      AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel = "" ;
      AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = "" ;
      AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel = "" ;
      scmdbuf = "" ;
      lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc = "" ;
      lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo = "" ;
      lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif = "" ;
      lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin = "" ;
      lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval = "" ;
      lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax = "" ;
      A13247CCSMetodo = "" ;
      A13248CCSEspecif = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A11482CCSMin = "" ;
      A4060CCSVal = "" ;
      A11483CCSMax = "" ;
      A65ArtCod = "" ;
      AV54Artcod = "" ;
      A4058CCFColNom = "" ;
      AV55CCFColNom = "" ;
      AV52EmprCod = "" ;
      A396EmprCod = "" ;
      P0AON2_A4034CCTLin = new short[1] ;
      P0AON2_A4031CCTCod = new int[1] ;
      P0AON2_A396EmprCod = new String[] {""} ;
      P0AON2_A4059CCFColNum = new int[1] ;
      P0AON2_A4058CCFColNom = new String[] {""} ;
      P0AON2_A65ArtCod = new String[] {""} ;
      P0AON2_A252CliCod = new int[1] ;
      P0AON2_A11483CCSMax = new String[] {""} ;
      P0AON2_n11483CCSMax = new boolean[] {false} ;
      P0AON2_A4060CCSVal = new String[] {""} ;
      P0AON2_n4060CCSVal = new boolean[] {false} ;
      P0AON2_A11482CCSMin = new String[] {""} ;
      P0AON2_n11482CCSMin = new boolean[] {false} ;
      P0AON2_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AON2_A11530CCSAuto = new byte[1] ;
      P0AON2_A13248CCSEspecif = new String[] {""} ;
      P0AON2_n13248CCSEspecif = new boolean[] {false} ;
      P0AON2_A13247CCSMetodo = new String[] {""} ;
      P0AON2_n13247CCSMetodo = new boolean[] {false} ;
      P0AON2_A4043CCTLinDsc = new String[] {""} ;
      AV35Option = "" ;
      P0AON3_A396EmprCod = new String[] {""} ;
      P0AON3_A252CliCod = new int[1] ;
      P0AON3_A65ArtCod = new String[] {""} ;
      P0AON3_A4058CCFColNom = new String[] {""} ;
      P0AON3_A4059CCFColNum = new int[1] ;
      P0AON3_A4031CCTCod = new int[1] ;
      P0AON3_A13247CCSMetodo = new String[] {""} ;
      P0AON3_n13247CCSMetodo = new boolean[] {false} ;
      P0AON3_A11483CCSMax = new String[] {""} ;
      P0AON3_n11483CCSMax = new boolean[] {false} ;
      P0AON3_A4060CCSVal = new String[] {""} ;
      P0AON3_n4060CCSVal = new boolean[] {false} ;
      P0AON3_A11482CCSMin = new String[] {""} ;
      P0AON3_n11482CCSMin = new boolean[] {false} ;
      P0AON3_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AON3_A11530CCSAuto = new byte[1] ;
      P0AON3_A13248CCSEspecif = new String[] {""} ;
      P0AON3_n13248CCSEspecif = new boolean[] {false} ;
      P0AON3_A4043CCTLinDsc = new String[] {""} ;
      P0AON3_A4034CCTLin = new short[1] ;
      P0AON4_A396EmprCod = new String[] {""} ;
      P0AON4_A252CliCod = new int[1] ;
      P0AON4_A65ArtCod = new String[] {""} ;
      P0AON4_A4058CCFColNom = new String[] {""} ;
      P0AON4_A4059CCFColNum = new int[1] ;
      P0AON4_A4031CCTCod = new int[1] ;
      P0AON4_A13248CCSEspecif = new String[] {""} ;
      P0AON4_n13248CCSEspecif = new boolean[] {false} ;
      P0AON4_A11483CCSMax = new String[] {""} ;
      P0AON4_n11483CCSMax = new boolean[] {false} ;
      P0AON4_A4060CCSVal = new String[] {""} ;
      P0AON4_n4060CCSVal = new boolean[] {false} ;
      P0AON4_A11482CCSMin = new String[] {""} ;
      P0AON4_n11482CCSMin = new boolean[] {false} ;
      P0AON4_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AON4_A11530CCSAuto = new byte[1] ;
      P0AON4_A13247CCSMetodo = new String[] {""} ;
      P0AON4_n13247CCSMetodo = new boolean[] {false} ;
      P0AON4_A4043CCTLinDsc = new String[] {""} ;
      P0AON4_A4034CCTLin = new short[1] ;
      P0AON5_A396EmprCod = new String[] {""} ;
      P0AON5_A252CliCod = new int[1] ;
      P0AON5_A65ArtCod = new String[] {""} ;
      P0AON5_A4058CCFColNom = new String[] {""} ;
      P0AON5_A4059CCFColNum = new int[1] ;
      P0AON5_A4031CCTCod = new int[1] ;
      P0AON5_A11482CCSMin = new String[] {""} ;
      P0AON5_n11482CCSMin = new boolean[] {false} ;
      P0AON5_A11483CCSMax = new String[] {""} ;
      P0AON5_n11483CCSMax = new boolean[] {false} ;
      P0AON5_A4060CCSVal = new String[] {""} ;
      P0AON5_n4060CCSVal = new boolean[] {false} ;
      P0AON5_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AON5_A11530CCSAuto = new byte[1] ;
      P0AON5_A13248CCSEspecif = new String[] {""} ;
      P0AON5_n13248CCSEspecif = new boolean[] {false} ;
      P0AON5_A13247CCSMetodo = new String[] {""} ;
      P0AON5_n13247CCSMetodo = new boolean[] {false} ;
      P0AON5_A4043CCTLinDsc = new String[] {""} ;
      P0AON5_A4034CCTLin = new short[1] ;
      P0AON6_A396EmprCod = new String[] {""} ;
      P0AON6_A252CliCod = new int[1] ;
      P0AON6_A65ArtCod = new String[] {""} ;
      P0AON6_A4058CCFColNom = new String[] {""} ;
      P0AON6_A4059CCFColNum = new int[1] ;
      P0AON6_A4031CCTCod = new int[1] ;
      P0AON6_A4060CCSVal = new String[] {""} ;
      P0AON6_n4060CCSVal = new boolean[] {false} ;
      P0AON6_A11483CCSMax = new String[] {""} ;
      P0AON6_n11483CCSMax = new boolean[] {false} ;
      P0AON6_A11482CCSMin = new String[] {""} ;
      P0AON6_n11482CCSMin = new boolean[] {false} ;
      P0AON6_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AON6_A11530CCSAuto = new byte[1] ;
      P0AON6_A13248CCSEspecif = new String[] {""} ;
      P0AON6_n13248CCSEspecif = new boolean[] {false} ;
      P0AON6_A13247CCSMetodo = new String[] {""} ;
      P0AON6_n13247CCSMetodo = new boolean[] {false} ;
      P0AON6_A4043CCTLinDsc = new String[] {""} ;
      P0AON6_A4034CCTLin = new short[1] ;
      P0AON7_A396EmprCod = new String[] {""} ;
      P0AON7_A252CliCod = new int[1] ;
      P0AON7_A65ArtCod = new String[] {""} ;
      P0AON7_A4058CCFColNom = new String[] {""} ;
      P0AON7_A4059CCFColNum = new int[1] ;
      P0AON7_A4031CCTCod = new int[1] ;
      P0AON7_A11483CCSMax = new String[] {""} ;
      P0AON7_n11483CCSMax = new boolean[] {false} ;
      P0AON7_A4060CCSVal = new String[] {""} ;
      P0AON7_n4060CCSVal = new boolean[] {false} ;
      P0AON7_A11482CCSMin = new String[] {""} ;
      P0AON7_n11482CCSMin = new boolean[] {false} ;
      P0AON7_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AON7_A11530CCSAuto = new byte[1] ;
      P0AON7_A13248CCSEspecif = new String[] {""} ;
      P0AON7_n13248CCSEspecif = new boolean[] {false} ;
      P0AON7_A13247CCSMetodo = new String[] {""} ;
      P0AON7_n13247CCSMetodo = new boolean[] {false} ;
      P0AON7_A4043CCTLinDsc = new String[] {""} ;
      P0AON7_A4034CCTLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AON2_A4034CCTLin, P0AON2_A4031CCTCod, P0AON2_A396EmprCod, P0AON2_A4059CCFColNum, P0AON2_A4058CCFColNom, P0AON2_A65ArtCod, P0AON2_A252CliCod, P0AON2_A11483CCSMax, P0AON2_n11483CCSMax, P0AON2_A4060CCSVal,
            P0AON2_n4060CCSVal, P0AON2_A11482CCSMin, P0AON2_n11482CCSMin, P0AON2_A11532CCSVTol, P0AON2_A11530CCSAuto, P0AON2_A13248CCSEspecif, P0AON2_n13248CCSEspecif, P0AON2_A13247CCSMetodo, P0AON2_n13247CCSMetodo, P0AON2_A4043CCTLinDsc
            }
            , new Object[] {
            P0AON3_A396EmprCod, P0AON3_A252CliCod, P0AON3_A65ArtCod, P0AON3_A4058CCFColNom, P0AON3_A4059CCFColNum, P0AON3_A4031CCTCod, P0AON3_A13247CCSMetodo, P0AON3_n13247CCSMetodo, P0AON3_A11483CCSMax, P0AON3_n11483CCSMax,
            P0AON3_A4060CCSVal, P0AON3_n4060CCSVal, P0AON3_A11482CCSMin, P0AON3_n11482CCSMin, P0AON3_A11532CCSVTol, P0AON3_A11530CCSAuto, P0AON3_A13248CCSEspecif, P0AON3_n13248CCSEspecif, P0AON3_A4043CCTLinDsc, P0AON3_A4034CCTLin
            }
            , new Object[] {
            P0AON4_A396EmprCod, P0AON4_A252CliCod, P0AON4_A65ArtCod, P0AON4_A4058CCFColNom, P0AON4_A4059CCFColNum, P0AON4_A4031CCTCod, P0AON4_A13248CCSEspecif, P0AON4_n13248CCSEspecif, P0AON4_A11483CCSMax, P0AON4_n11483CCSMax,
            P0AON4_A4060CCSVal, P0AON4_n4060CCSVal, P0AON4_A11482CCSMin, P0AON4_n11482CCSMin, P0AON4_A11532CCSVTol, P0AON4_A11530CCSAuto, P0AON4_A13247CCSMetodo, P0AON4_n13247CCSMetodo, P0AON4_A4043CCTLinDsc, P0AON4_A4034CCTLin
            }
            , new Object[] {
            P0AON5_A396EmprCod, P0AON5_A252CliCod, P0AON5_A65ArtCod, P0AON5_A4058CCFColNom, P0AON5_A4059CCFColNum, P0AON5_A4031CCTCod, P0AON5_A11482CCSMin, P0AON5_n11482CCSMin, P0AON5_A11483CCSMax, P0AON5_n11483CCSMax,
            P0AON5_A4060CCSVal, P0AON5_n4060CCSVal, P0AON5_A11532CCSVTol, P0AON5_A11530CCSAuto, P0AON5_A13248CCSEspecif, P0AON5_n13248CCSEspecif, P0AON5_A13247CCSMetodo, P0AON5_n13247CCSMetodo, P0AON5_A4043CCTLinDsc, P0AON5_A4034CCTLin
            }
            , new Object[] {
            P0AON6_A396EmprCod, P0AON6_A252CliCod, P0AON6_A65ArtCod, P0AON6_A4058CCFColNom, P0AON6_A4059CCFColNum, P0AON6_A4031CCTCod, P0AON6_A4060CCSVal, P0AON6_n4060CCSVal, P0AON6_A11483CCSMax, P0AON6_n11483CCSMax,
            P0AON6_A11482CCSMin, P0AON6_n11482CCSMin, P0AON6_A11532CCSVTol, P0AON6_A11530CCSAuto, P0AON6_A13248CCSEspecif, P0AON6_n13248CCSEspecif, P0AON6_A13247CCSMetodo, P0AON6_n13247CCSMetodo, P0AON6_A4043CCTLinDsc, P0AON6_A4034CCTLin
            }
            , new Object[] {
            P0AON7_A396EmprCod, P0AON7_A252CliCod, P0AON7_A65ArtCod, P0AON7_A4058CCFColNom, P0AON7_A4059CCFColNum, P0AON7_A4031CCTCod, P0AON7_A11483CCSMax, P0AON7_n11483CCSMax, P0AON7_A4060CCSVal, P0AON7_n4060CCSVal,
            P0AON7_A11482CCSMin, P0AON7_n11482CCSMin, P0AON7_A11532CCSVTol, P0AON7_A11530CCSAuto, P0AON7_A13248CCSEspecif, P0AON7_n13248CCSEspecif, P0AON7_A13247CCSMetodo, P0AON7_n13247CCSMetodo, P0AON7_A4043CCTLinDsc, P0AON7_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26TFCCSAuto ;
   private byte AV27TFCCSAuto_To ;
   private byte AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ;
   private byte AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ;
   private byte A11530CCSAuto ;
   private short AV10TFCCTLin ;
   private short AV11TFCCTLin_To ;
   private short AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ;
   private short AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int A252CliCod ;
   private int AV53Clicod ;
   private int A4059CCFColNum ;
   private int AV56CCFColNum ;
   private int AV57CCTCod ;
   private int A4031CCTCod ;
   private int AV34InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV28TFCCSVTol ;
   private java.math.BigDecimal AV29TFCCSVTol_To ;
   private java.math.BigDecimal AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ;
   private java.math.BigDecimal AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ;
   private java.math.BigDecimal A11532CCSVTol ;
   private String AV12TFCCTLinDsc ;
   private String AV13TFCCTLinDsc_Sel ;
   private String AV30TFCCSMetodo ;
   private String AV31TFCCSMetodo_Sel ;
   private String AV32TFCCSEspecif ;
   private String AV33TFCCSEspecif_Sel ;
   private String AV22TFCCSMin ;
   private String AV23TFCCSMin_Sel ;
   private String AV20TFCCSVal ;
   private String AV21TFCCSVal_Sel ;
   private String AV24TFCCSMax ;
   private String AV25TFCCSMax_Sel ;
   private String A4043CCTLinDsc ;
   private String AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ;
   private String AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ;
   private String AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ;
   private String AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ;
   private String AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ;
   private String AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ;
   private String AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ;
   private String AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ;
   private String AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ;
   private String AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ;
   private String AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ;
   private String AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ;
   private String scmdbuf ;
   private String lV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ;
   private String lV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ;
   private String lV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ;
   private String lV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ;
   private String lV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ;
   private String lV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ;
   private String A13247CCSMetodo ;
   private String A13248CCSEspecif ;
   private String A11482CCSMin ;
   private String A4060CCSVal ;
   private String A11483CCSMax ;
   private String A65ArtCod ;
   private String AV54Artcod ;
   private String A4058CCFColNom ;
   private String AV55CCFColNom ;
   private String AV52EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAON2 ;
   private boolean n11483CCSMax ;
   private boolean n4060CCSVal ;
   private boolean n11482CCSMin ;
   private boolean n13248CCSEspecif ;
   private boolean n13247CCSMetodo ;
   private boolean brkAON4 ;
   private boolean brkAON6 ;
   private boolean brkAON8 ;
   private boolean brkAON10 ;
   private boolean brkAON12 ;
   private String AV49OptionsJson ;
   private String AV50OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV46DDOName ;
   private String AV47SearchTxt ;
   private String AV48SearchTxtTo ;
   private String AV35Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AON2_A4034CCTLin ;
   private int[] P0AON2_A4031CCTCod ;
   private String[] P0AON2_A396EmprCod ;
   private int[] P0AON2_A4059CCFColNum ;
   private String[] P0AON2_A4058CCFColNom ;
   private String[] P0AON2_A65ArtCod ;
   private int[] P0AON2_A252CliCod ;
   private String[] P0AON2_A11483CCSMax ;
   private boolean[] P0AON2_n11483CCSMax ;
   private String[] P0AON2_A4060CCSVal ;
   private boolean[] P0AON2_n4060CCSVal ;
   private String[] P0AON2_A11482CCSMin ;
   private boolean[] P0AON2_n11482CCSMin ;
   private java.math.BigDecimal[] P0AON2_A11532CCSVTol ;
   private byte[] P0AON2_A11530CCSAuto ;
   private String[] P0AON2_A13248CCSEspecif ;
   private boolean[] P0AON2_n13248CCSEspecif ;
   private String[] P0AON2_A13247CCSMetodo ;
   private boolean[] P0AON2_n13247CCSMetodo ;
   private String[] P0AON2_A4043CCTLinDsc ;
   private String[] P0AON3_A396EmprCod ;
   private int[] P0AON3_A252CliCod ;
   private String[] P0AON3_A65ArtCod ;
   private String[] P0AON3_A4058CCFColNom ;
   private int[] P0AON3_A4059CCFColNum ;
   private int[] P0AON3_A4031CCTCod ;
   private String[] P0AON3_A13247CCSMetodo ;
   private boolean[] P0AON3_n13247CCSMetodo ;
   private String[] P0AON3_A11483CCSMax ;
   private boolean[] P0AON3_n11483CCSMax ;
   private String[] P0AON3_A4060CCSVal ;
   private boolean[] P0AON3_n4060CCSVal ;
   private String[] P0AON3_A11482CCSMin ;
   private boolean[] P0AON3_n11482CCSMin ;
   private java.math.BigDecimal[] P0AON3_A11532CCSVTol ;
   private byte[] P0AON3_A11530CCSAuto ;
   private String[] P0AON3_A13248CCSEspecif ;
   private boolean[] P0AON3_n13248CCSEspecif ;
   private String[] P0AON3_A4043CCTLinDsc ;
   private short[] P0AON3_A4034CCTLin ;
   private String[] P0AON4_A396EmprCod ;
   private int[] P0AON4_A252CliCod ;
   private String[] P0AON4_A65ArtCod ;
   private String[] P0AON4_A4058CCFColNom ;
   private int[] P0AON4_A4059CCFColNum ;
   private int[] P0AON4_A4031CCTCod ;
   private String[] P0AON4_A13248CCSEspecif ;
   private boolean[] P0AON4_n13248CCSEspecif ;
   private String[] P0AON4_A11483CCSMax ;
   private boolean[] P0AON4_n11483CCSMax ;
   private String[] P0AON4_A4060CCSVal ;
   private boolean[] P0AON4_n4060CCSVal ;
   private String[] P0AON4_A11482CCSMin ;
   private boolean[] P0AON4_n11482CCSMin ;
   private java.math.BigDecimal[] P0AON4_A11532CCSVTol ;
   private byte[] P0AON4_A11530CCSAuto ;
   private String[] P0AON4_A13247CCSMetodo ;
   private boolean[] P0AON4_n13247CCSMetodo ;
   private String[] P0AON4_A4043CCTLinDsc ;
   private short[] P0AON4_A4034CCTLin ;
   private String[] P0AON5_A396EmprCod ;
   private int[] P0AON5_A252CliCod ;
   private String[] P0AON5_A65ArtCod ;
   private String[] P0AON5_A4058CCFColNom ;
   private int[] P0AON5_A4059CCFColNum ;
   private int[] P0AON5_A4031CCTCod ;
   private String[] P0AON5_A11482CCSMin ;
   private boolean[] P0AON5_n11482CCSMin ;
   private String[] P0AON5_A11483CCSMax ;
   private boolean[] P0AON5_n11483CCSMax ;
   private String[] P0AON5_A4060CCSVal ;
   private boolean[] P0AON5_n4060CCSVal ;
   private java.math.BigDecimal[] P0AON5_A11532CCSVTol ;
   private byte[] P0AON5_A11530CCSAuto ;
   private String[] P0AON5_A13248CCSEspecif ;
   private boolean[] P0AON5_n13248CCSEspecif ;
   private String[] P0AON5_A13247CCSMetodo ;
   private boolean[] P0AON5_n13247CCSMetodo ;
   private String[] P0AON5_A4043CCTLinDsc ;
   private short[] P0AON5_A4034CCTLin ;
   private String[] P0AON6_A396EmprCod ;
   private int[] P0AON6_A252CliCod ;
   private String[] P0AON6_A65ArtCod ;
   private String[] P0AON6_A4058CCFColNom ;
   private int[] P0AON6_A4059CCFColNum ;
   private int[] P0AON6_A4031CCTCod ;
   private String[] P0AON6_A4060CCSVal ;
   private boolean[] P0AON6_n4060CCSVal ;
   private String[] P0AON6_A11483CCSMax ;
   private boolean[] P0AON6_n11483CCSMax ;
   private String[] P0AON6_A11482CCSMin ;
   private boolean[] P0AON6_n11482CCSMin ;
   private java.math.BigDecimal[] P0AON6_A11532CCSVTol ;
   private byte[] P0AON6_A11530CCSAuto ;
   private String[] P0AON6_A13248CCSEspecif ;
   private boolean[] P0AON6_n13248CCSEspecif ;
   private String[] P0AON6_A13247CCSMetodo ;
   private boolean[] P0AON6_n13247CCSMetodo ;
   private String[] P0AON6_A4043CCTLinDsc ;
   private short[] P0AON6_A4034CCTLin ;
   private String[] P0AON7_A396EmprCod ;
   private int[] P0AON7_A252CliCod ;
   private String[] P0AON7_A65ArtCod ;
   private String[] P0AON7_A4058CCFColNom ;
   private int[] P0AON7_A4059CCFColNum ;
   private int[] P0AON7_A4031CCTCod ;
   private String[] P0AON7_A11483CCSMax ;
   private boolean[] P0AON7_n11483CCSMax ;
   private String[] P0AON7_A4060CCSVal ;
   private boolean[] P0AON7_n4060CCSVal ;
   private String[] P0AON7_A11482CCSMin ;
   private boolean[] P0AON7_n11482CCSMin ;
   private java.math.BigDecimal[] P0AON7_A11532CCSVTol ;
   private byte[] P0AON7_A11530CCSAuto ;
   private String[] P0AON7_A13248CCSEspecif ;
   private boolean[] P0AON7_n13248CCSEspecif ;
   private String[] P0AON7_A13247CCSMetodo ;
   private boolean[] P0AON7_n13247CCSMetodo ;
   private String[] P0AON7_A4043CCTLinDsc ;
   private short[] P0AON7_A4034CCTLin ;
   private GXSimpleCollection<String> AV36Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV39OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class controlcalidad_ccsta_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AON2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          int A252CliCod ,
                                          int AV53Clicod ,
                                          String A65ArtCod ,
                                          String AV54Artcod ,
                                          String A4058CCFColNom ,
                                          String AV55CCFColNom ,
                                          int A4059CCFColNum ,
                                          int AV56CCFColNum ,
                                          String AV52EmprCod ,
                                          int AV57CCTCod ,
                                          String A396EmprCod ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CCTLin, T1.CCTCod, T1.EmprCod, T1.CCFColNum, T1.CCFColNom, T1.ArtCod, T1.CliCod, T1.CCSMax, T1.CCSVal, T1.CCSMin, T1.CCSVTol, T1.CCSAuto, T1.CCSEspecif," ;
      scmdbuf += " T1.CCSMetodo, T2.CCTLinDsc FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CCTCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.CCFColNom = ?)");
      addWhere(sWhereString, "(T1.CCFColNum = ?)");
      if ( ! (0==AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AON3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          String A396EmprCod ,
                                          String AV52EmprCod ,
                                          int A252CliCod ,
                                          int AV53Clicod ,
                                          String A65ArtCod ,
                                          String AV54Artcod ,
                                          String A4058CCFColNom ,
                                          String AV55CCFColNom ,
                                          int A4059CCFColNum ,
                                          int AV56CCFColNum ,
                                          int A4031CCTCod ,
                                          int AV57CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCSMetodo, T1.CCSMax, T1.CCSVal, T1.CCSMin, T1.CCSVTol, T1.CCSAuto, T1.CCSEspecif," ;
      scmdbuf += " T2.CCTLinDsc, T1.CCTLin FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.CCFColNom = ?)");
      addWhere(sWhereString, "(T1.CCFColNum = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCSMetodo" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AON4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          String A396EmprCod ,
                                          String AV52EmprCod ,
                                          int A252CliCod ,
                                          int AV53Clicod ,
                                          String A65ArtCod ,
                                          String AV54Artcod ,
                                          String A4058CCFColNom ,
                                          String AV55CCFColNom ,
                                          int A4059CCFColNum ,
                                          int AV56CCFColNum ,
                                          int A4031CCTCod ,
                                          int AV57CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCSEspecif, T1.CCSMax, T1.CCSVal, T1.CCSMin, T1.CCSVTol, T1.CCSAuto, T1.CCSMetodo," ;
      scmdbuf += " T2.CCTLinDsc, T1.CCTLin FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.CCFColNom = ?)");
      addWhere(sWhereString, "(T1.CCFColNum = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCSEspecif" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AON5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          String A396EmprCod ,
                                          String AV52EmprCod ,
                                          int A252CliCod ,
                                          int AV53Clicod ,
                                          String A65ArtCod ,
                                          String AV54Artcod ,
                                          String A4058CCFColNom ,
                                          String AV55CCFColNom ,
                                          int A4059CCFColNum ,
                                          int AV56CCFColNum ,
                                          int A4031CCTCod ,
                                          int AV57CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCSMin, T1.CCSMax, T1.CCSVal, T1.CCSVTol, T1.CCSAuto, T1.CCSEspecif, T1.CCSMetodo," ;
      scmdbuf += " T2.CCTLinDsc, T1.CCTLin FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.CCFColNom = ?)");
      addWhere(sWhereString, "(T1.CCFColNum = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCSMin" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AON6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          String A396EmprCod ,
                                          String AV52EmprCod ,
                                          int A252CliCod ,
                                          int AV53Clicod ,
                                          String A65ArtCod ,
                                          String AV54Artcod ,
                                          String A4058CCFColNom ,
                                          String AV55CCFColNom ,
                                          int A4059CCFColNum ,
                                          int AV56CCFColNum ,
                                          int A4031CCTCod ,
                                          int AV57CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[24];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCSVal, T1.CCSMax, T1.CCSMin, T1.CCSVTol, T1.CCSAuto, T1.CCSEspecif, T1.CCSMetodo," ;
      scmdbuf += " T2.CCTLinDsc, T1.CCTLin FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.CCFColNom = ?)");
      addWhere(sWhereString, "(T1.CCFColNum = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCSVal" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AON7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin ,
                                          short AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to ,
                                          String AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo ,
                                          String AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel ,
                                          String AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif ,
                                          byte AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto ,
                                          byte AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to ,
                                          java.math.BigDecimal AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol ,
                                          java.math.BigDecimal AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to ,
                                          String AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel ,
                                          String AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin ,
                                          String AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel ,
                                          String AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval ,
                                          String AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel ,
                                          String AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A13247CCSMetodo ,
                                          String A13248CCSEspecif ,
                                          byte A11530CCSAuto ,
                                          java.math.BigDecimal A11532CCSVTol ,
                                          String A11482CCSMin ,
                                          String A4060CCSVal ,
                                          String A11483CCSMax ,
                                          String A396EmprCod ,
                                          String AV52EmprCod ,
                                          int A252CliCod ,
                                          int AV53Clicod ,
                                          String A65ArtCod ,
                                          String AV54Artcod ,
                                          String A4058CCFColNom ,
                                          String AV55CCFColNom ,
                                          int A4059CCFColNum ,
                                          int AV56CCFColNum ,
                                          int A4031CCTCod ,
                                          int AV57CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[24];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCSMax, T1.CCSVal, T1.CCSMin, T1.CCSVTol, T1.CCSAuto, T1.CCSEspecif, T1.CCSMetodo," ;
      scmdbuf += " T2.CCTLinDsc, T1.CCTLin FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.CCFColNom = ?)");
      addWhere(sWhereString, "(T1.CCFColNum = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV62Controlcalidadhtd_controlcalidad_ccsta_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidad_ccsta_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_ccsta_wpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_ccsta_wpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccsta_wpds_5_tfccsmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccsta_wpds_6_tfccsmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMetodo = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidad_ccsta_wpds_7_tfccsespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidad_ccsta_wpds_8_tfccsespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSEspecif = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV70Controlcalidadhtd_controlcalidad_ccsta_wpds_9_tfccsauto) )
      {
         addWhere(sWhereString, "(T1.CCSAuto >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV71Controlcalidadhtd_controlcalidad_ccsta_wpds_10_tfccsauto_to) )
      {
         addWhere(sWhereString, "(T1.CCSAuto <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Controlcalidadhtd_controlcalidad_ccsta_wpds_11_tfccsvtol)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Controlcalidadhtd_controlcalidad_ccsta_wpds_12_tfccsvtol_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVTol <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) && ( ! (GXutil.strcmp("", AV74Controlcalidadhtd_controlcalidad_ccsta_wpds_13_tfccsmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Controlcalidadhtd_controlcalidad_ccsta_wpds_14_tfccsmin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMin = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlcalidadhtd_controlcalidad_ccsta_wpds_15_tfccsval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlcalidadhtd_controlcalidad_ccsta_wpds_16_tfccsval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSVal = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) && ( ! (GXutil.strcmp("", AV78Controlcalidadhtd_controlcalidad_ccsta_wpds_17_tfccsmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCSMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Controlcalidadhtd_controlcalidad_ccsta_wpds_18_tfccsmax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCSMax = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCSMax" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P0AON2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() );
            case 1 :
                  return conditional_P0AON3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() );
            case 2 :
                  return conditional_P0AON4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() );
            case 3 :
                  return conditional_P0AON5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() );
            case 4 :
                  return conditional_P0AON6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() );
            case 5 :
                  return conditional_P0AON7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AON2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AON3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AON4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AON5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AON6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AON7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((short[]) buf[19])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
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
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 40);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
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
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 40);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
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
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 40);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
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
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 40);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
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
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 40);
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
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
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
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 40);
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

