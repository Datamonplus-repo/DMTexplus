package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tforacacopy1wwgetfilterdata extends GXProcedure
{
   public tforacacopy1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforacacopy1wwgetfilterdata.class ), "" );
   }

   public tforacacopy1wwgetfilterdata( int remoteHandle ,
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
      tforacacopy1wwgetfilterdata.this.aP5 = new String[] {""};
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
      tforacacopy1wwgetfilterdata.this.AV34DDOName = aP0;
      tforacacopy1wwgetfilterdata.this.AV32SearchTxt = aP1;
      tforacacopy1wwgetfilterdata.this.AV33SearchTxtTo = aP2;
      tforacacopy1wwgetfilterdata.this.aP3 = aP3;
      tforacacopy1wwgetfilterdata.this.aP4 = aP4;
      tforacacopy1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_FASFORMUL") == 0 )
      {
         /* Execute user subroutine: 'LOADFASFORMULOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("TFORACACopy1WWGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFORACACopy1WWGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("TFORACACopy1WWGridState"), null, null);
      }
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV61FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV14TFArtCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV15TFArtCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV16TFArtDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV17TFArtDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV18TFProCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV19TFProCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV20TFProDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV21TFProDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV22TFFasCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV23TFFasCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV24TFFasDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV25TFFasDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV26TFFasForMul = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV27TFFasForMul_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPROULIN") == 0 )
         {
            AV28TFArtProULin = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFArtProULin_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPROFAC") == 0 )
         {
            AV30TFArtProFac = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFArtProFac_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV32SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF2 */
      pr_default.execute(0, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8GF2 = false ;
         A396EmprCod = P08GF2_A396EmprCod[0] ;
         A279CliNom = P08GF2_A279CliNom[0] ;
         A4896ArtProFac = P08GF2_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF2_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF2_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF2_n4894ArtProULin[0] ;
         A4286FasForMul = P08GF2_A4286FasForMul[0] ;
         n4286FasForMul = P08GF2_n4286FasForMul[0] ;
         A460FasDsc = P08GF2_A460FasDsc[0] ;
         A457FasCod = P08GF2_A457FasCod[0] ;
         A759ProDsc = P08GF2_A759ProDsc[0] ;
         A758ProCod = P08GF2_A758ProCod[0] ;
         A69ArtDsc = P08GF2_A69ArtDsc[0] ;
         n69ArtDsc = P08GF2_n69ArtDsc[0] ;
         A65ArtCod = P08GF2_A65ArtCod[0] ;
         A252CliCod = P08GF2_A252CliCod[0] ;
         A4286FasForMul = P08GF2_A4286FasForMul[0] ;
         n4286FasForMul = P08GF2_n4286FasForMul[0] ;
         A460FasDsc = P08GF2_A460FasDsc[0] ;
         A759ProDsc = P08GF2_A759ProDsc[0] ;
         A279CliNom = P08GF2_A279CliNom[0] ;
         A69ArtDsc = P08GF2_A69ArtDsc[0] ;
         n69ArtDsc = P08GF2_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08GF2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8GF2 = false ;
            A396EmprCod = P08GF2_A396EmprCod[0] ;
            A457FasCod = P08GF2_A457FasCod[0] ;
            A758ProCod = P08GF2_A758ProCod[0] ;
            A65ArtCod = P08GF2_A65ArtCod[0] ;
            A252CliCod = P08GF2_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV36Option = A279CliNom ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF2 )
         {
            brk8GF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtCod = AV32SearchTxt ;
      AV15TFArtCod_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF3 */
      pr_default.execute(1, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8GF4 = false ;
         A396EmprCod = P08GF3_A396EmprCod[0] ;
         A65ArtCod = P08GF3_A65ArtCod[0] ;
         A4896ArtProFac = P08GF3_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF3_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF3_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF3_n4894ArtProULin[0] ;
         A4286FasForMul = P08GF3_A4286FasForMul[0] ;
         n4286FasForMul = P08GF3_n4286FasForMul[0] ;
         A460FasDsc = P08GF3_A460FasDsc[0] ;
         A457FasCod = P08GF3_A457FasCod[0] ;
         A759ProDsc = P08GF3_A759ProDsc[0] ;
         A758ProCod = P08GF3_A758ProCod[0] ;
         A69ArtDsc = P08GF3_A69ArtDsc[0] ;
         n69ArtDsc = P08GF3_n69ArtDsc[0] ;
         A279CliNom = P08GF3_A279CliNom[0] ;
         A252CliCod = P08GF3_A252CliCod[0] ;
         A4286FasForMul = P08GF3_A4286FasForMul[0] ;
         n4286FasForMul = P08GF3_n4286FasForMul[0] ;
         A460FasDsc = P08GF3_A460FasDsc[0] ;
         A759ProDsc = P08GF3_A759ProDsc[0] ;
         A279CliNom = P08GF3_A279CliNom[0] ;
         A69ArtDsc = P08GF3_A69ArtDsc[0] ;
         n69ArtDsc = P08GF3_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08GF3_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brk8GF4 = false ;
            A396EmprCod = P08GF3_A396EmprCod[0] ;
            A457FasCod = P08GF3_A457FasCod[0] ;
            A758ProCod = P08GF3_A758ProCod[0] ;
            A252CliCod = P08GF3_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV36Option = A65ArtCod ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF4 )
         {
            brk8GF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFArtDsc = AV32SearchTxt ;
      AV17TFArtDsc_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF4 */
      pr_default.execute(2, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8GF6 = false ;
         A396EmprCod = P08GF4_A396EmprCod[0] ;
         A69ArtDsc = P08GF4_A69ArtDsc[0] ;
         n69ArtDsc = P08GF4_n69ArtDsc[0] ;
         A4896ArtProFac = P08GF4_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF4_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF4_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF4_n4894ArtProULin[0] ;
         A4286FasForMul = P08GF4_A4286FasForMul[0] ;
         n4286FasForMul = P08GF4_n4286FasForMul[0] ;
         A460FasDsc = P08GF4_A460FasDsc[0] ;
         A457FasCod = P08GF4_A457FasCod[0] ;
         A759ProDsc = P08GF4_A759ProDsc[0] ;
         A758ProCod = P08GF4_A758ProCod[0] ;
         A65ArtCod = P08GF4_A65ArtCod[0] ;
         A279CliNom = P08GF4_A279CliNom[0] ;
         A252CliCod = P08GF4_A252CliCod[0] ;
         A4286FasForMul = P08GF4_A4286FasForMul[0] ;
         n4286FasForMul = P08GF4_n4286FasForMul[0] ;
         A460FasDsc = P08GF4_A460FasDsc[0] ;
         A759ProDsc = P08GF4_A759ProDsc[0] ;
         A279CliNom = P08GF4_A279CliNom[0] ;
         A69ArtDsc = P08GF4_A69ArtDsc[0] ;
         n69ArtDsc = P08GF4_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08GF4_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brk8GF6 = false ;
            A396EmprCod = P08GF4_A396EmprCod[0] ;
            A457FasCod = P08GF4_A457FasCod[0] ;
            A758ProCod = P08GF4_A758ProCod[0] ;
            A65ArtCod = P08GF4_A65ArtCod[0] ;
            A252CliCod = P08GF4_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV36Option = A69ArtDsc ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF6 )
         {
            brk8GF6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFProCod = AV32SearchTxt ;
      AV19TFProCod_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF5 */
      pr_default.execute(3, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8GF8 = false ;
         A396EmprCod = P08GF5_A396EmprCod[0] ;
         A758ProCod = P08GF5_A758ProCod[0] ;
         A4896ArtProFac = P08GF5_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF5_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF5_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF5_n4894ArtProULin[0] ;
         A4286FasForMul = P08GF5_A4286FasForMul[0] ;
         n4286FasForMul = P08GF5_n4286FasForMul[0] ;
         A460FasDsc = P08GF5_A460FasDsc[0] ;
         A457FasCod = P08GF5_A457FasCod[0] ;
         A759ProDsc = P08GF5_A759ProDsc[0] ;
         A69ArtDsc = P08GF5_A69ArtDsc[0] ;
         n69ArtDsc = P08GF5_n69ArtDsc[0] ;
         A65ArtCod = P08GF5_A65ArtCod[0] ;
         A279CliNom = P08GF5_A279CliNom[0] ;
         A252CliCod = P08GF5_A252CliCod[0] ;
         A759ProDsc = P08GF5_A759ProDsc[0] ;
         A4286FasForMul = P08GF5_A4286FasForMul[0] ;
         n4286FasForMul = P08GF5_n4286FasForMul[0] ;
         A460FasDsc = P08GF5_A460FasDsc[0] ;
         A279CliNom = P08GF5_A279CliNom[0] ;
         A69ArtDsc = P08GF5_A69ArtDsc[0] ;
         n69ArtDsc = P08GF5_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08GF5_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk8GF8 = false ;
            A396EmprCod = P08GF5_A396EmprCod[0] ;
            A457FasCod = P08GF5_A457FasCod[0] ;
            A65ArtCod = P08GF5_A65ArtCod[0] ;
            A252CliCod = P08GF5_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV36Option = A758ProCod ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF8 )
         {
            brk8GF8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFProDsc = AV32SearchTxt ;
      AV21TFProDsc_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF6 */
      pr_default.execute(4, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8GF10 = false ;
         A396EmprCod = P08GF6_A396EmprCod[0] ;
         A759ProDsc = P08GF6_A759ProDsc[0] ;
         A4896ArtProFac = P08GF6_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF6_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF6_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF6_n4894ArtProULin[0] ;
         A4286FasForMul = P08GF6_A4286FasForMul[0] ;
         n4286FasForMul = P08GF6_n4286FasForMul[0] ;
         A460FasDsc = P08GF6_A460FasDsc[0] ;
         A457FasCod = P08GF6_A457FasCod[0] ;
         A758ProCod = P08GF6_A758ProCod[0] ;
         A69ArtDsc = P08GF6_A69ArtDsc[0] ;
         n69ArtDsc = P08GF6_n69ArtDsc[0] ;
         A65ArtCod = P08GF6_A65ArtCod[0] ;
         A279CliNom = P08GF6_A279CliNom[0] ;
         A252CliCod = P08GF6_A252CliCod[0] ;
         A4286FasForMul = P08GF6_A4286FasForMul[0] ;
         n4286FasForMul = P08GF6_n4286FasForMul[0] ;
         A460FasDsc = P08GF6_A460FasDsc[0] ;
         A759ProDsc = P08GF6_A759ProDsc[0] ;
         A279CliNom = P08GF6_A279CliNom[0] ;
         A69ArtDsc = P08GF6_A69ArtDsc[0] ;
         n69ArtDsc = P08GF6_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08GF6_A759ProDsc[0], A759ProDsc) == 0 ) )
         {
            brk8GF10 = false ;
            A396EmprCod = P08GF6_A396EmprCod[0] ;
            A457FasCod = P08GF6_A457FasCod[0] ;
            A758ProCod = P08GF6_A758ProCod[0] ;
            A65ArtCod = P08GF6_A65ArtCod[0] ;
            A252CliCod = P08GF6_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV36Option = A759ProDsc ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF10 )
         {
            brk8GF10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV22TFFasCod = AV32SearchTxt ;
      AV23TFFasCod_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF7 */
      pr_default.execute(5, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8GF12 = false ;
         A396EmprCod = P08GF7_A396EmprCod[0] ;
         A457FasCod = P08GF7_A457FasCod[0] ;
         A4896ArtProFac = P08GF7_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF7_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF7_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF7_n4894ArtProULin[0] ;
         A4286FasForMul = P08GF7_A4286FasForMul[0] ;
         n4286FasForMul = P08GF7_n4286FasForMul[0] ;
         A460FasDsc = P08GF7_A460FasDsc[0] ;
         A759ProDsc = P08GF7_A759ProDsc[0] ;
         A758ProCod = P08GF7_A758ProCod[0] ;
         A69ArtDsc = P08GF7_A69ArtDsc[0] ;
         n69ArtDsc = P08GF7_n69ArtDsc[0] ;
         A65ArtCod = P08GF7_A65ArtCod[0] ;
         A279CliNom = P08GF7_A279CliNom[0] ;
         A252CliCod = P08GF7_A252CliCod[0] ;
         A4286FasForMul = P08GF7_A4286FasForMul[0] ;
         n4286FasForMul = P08GF7_n4286FasForMul[0] ;
         A460FasDsc = P08GF7_A460FasDsc[0] ;
         A759ProDsc = P08GF7_A759ProDsc[0] ;
         A279CliNom = P08GF7_A279CliNom[0] ;
         A69ArtDsc = P08GF7_A69ArtDsc[0] ;
         n69ArtDsc = P08GF7_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08GF7_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8GF12 = false ;
            A396EmprCod = P08GF7_A396EmprCod[0] ;
            A758ProCod = P08GF7_A758ProCod[0] ;
            A65ArtCod = P08GF7_A65ArtCod[0] ;
            A252CliCod = P08GF7_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV36Option = A457FasCod ;
            AV39OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV37Options.add(AV36Option, 0);
            AV40OptionsDesc.add(AV39OptionDesc, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF12 )
         {
            brk8GF12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFFasDsc = AV32SearchTxt ;
      AV25TFFasDsc_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF8 */
      pr_default.execute(6, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8GF14 = false ;
         A396EmprCod = P08GF8_A396EmprCod[0] ;
         A460FasDsc = P08GF8_A460FasDsc[0] ;
         A4896ArtProFac = P08GF8_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF8_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF8_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF8_n4894ArtProULin[0] ;
         A4286FasForMul = P08GF8_A4286FasForMul[0] ;
         n4286FasForMul = P08GF8_n4286FasForMul[0] ;
         A457FasCod = P08GF8_A457FasCod[0] ;
         A759ProDsc = P08GF8_A759ProDsc[0] ;
         A758ProCod = P08GF8_A758ProCod[0] ;
         A69ArtDsc = P08GF8_A69ArtDsc[0] ;
         n69ArtDsc = P08GF8_n69ArtDsc[0] ;
         A65ArtCod = P08GF8_A65ArtCod[0] ;
         A279CliNom = P08GF8_A279CliNom[0] ;
         A252CliCod = P08GF8_A252CliCod[0] ;
         A460FasDsc = P08GF8_A460FasDsc[0] ;
         A4286FasForMul = P08GF8_A4286FasForMul[0] ;
         n4286FasForMul = P08GF8_n4286FasForMul[0] ;
         A759ProDsc = P08GF8_A759ProDsc[0] ;
         A279CliNom = P08GF8_A279CliNom[0] ;
         A69ArtDsc = P08GF8_A69ArtDsc[0] ;
         n69ArtDsc = P08GF8_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08GF8_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brk8GF14 = false ;
            A396EmprCod = P08GF8_A396EmprCod[0] ;
            A457FasCod = P08GF8_A457FasCod[0] ;
            A758ProCod = P08GF8_A758ProCod[0] ;
            A65ArtCod = P08GF8_A65ArtCod[0] ;
            A252CliCod = P08GF8_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV36Option = A460FasDsc ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF14 )
         {
            brk8GF14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFASFORMULOPTIONS' Routine */
      returnInSub = false ;
      AV26TFFasForMul = AV32SearchTxt ;
      AV27TFFasForMul_Sel = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = AV61FilterFullText ;
      AV67Tforacacopy1wwds_2_tfclicod = AV10TFCliCod ;
      AV68Tforacacopy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV69Tforacacopy1wwds_4_tfclinom = AV12TFCliNom ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV71Tforacacopy1wwds_6_tfartcod = AV14TFArtCod ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV73Tforacacopy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV75Tforacacopy1wwds_10_tfprocod = AV18TFProCod ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV77Tforacacopy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV79Tforacacopy1wwds_14_tffascod = AV22TFFasCod ;
      AV80Tforacacopy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV81Tforacacopy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      AV83Tforacacopy1wwds_18_tffasformul = AV26TFFasForMul ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = AV27TFFasForMul_Sel ;
      AV85Tforacacopy1wwds_20_tfartproulin = AV28TFArtProULin ;
      AV86Tforacacopy1wwds_21_tfartproulin_to = AV29TFArtProULin_To ;
      AV87Tforacacopy1wwds_22_tfartprofac = AV30TFArtProFac ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = AV31TFArtProFac_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV66Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV69Tforacacopy1wwds_4_tfclinom ,
                                           AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV71Tforacacopy1wwds_6_tfartcod ,
                                           AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV73Tforacacopy1wwds_8_tfartdsc ,
                                           AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV75Tforacacopy1wwds_10_tfprocod ,
                                           AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV77Tforacacopy1wwds_12_tfprodsc ,
                                           AV80Tforacacopy1wwds_15_tffascod_sel ,
                                           AV79Tforacacopy1wwds_14_tffascod ,
                                           AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV81Tforacacopy1wwds_16_tffasdsc ,
                                           AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV83Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV87Tforacacopy1wwds_22_tfartprofac ,
                                           AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV66Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV69Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV69Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV71Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV71Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV73Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV73Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV75Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV75Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV77Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV77Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV79Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV79Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV81Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV83Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV83Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GF9 */
      pr_default.execute(7, new Object[] {lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, lV66Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV67Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV68Tforacacopy1wwds_3_tfclicod_to), lV69Tforacacopy1wwds_4_tfclinom, AV70Tforacacopy1wwds_5_tfclinom_sel, lV71Tforacacopy1wwds_6_tfartcod, AV72Tforacacopy1wwds_7_tfartcod_sel, lV73Tforacacopy1wwds_8_tfartdsc, AV74Tforacacopy1wwds_9_tfartdsc_sel, lV75Tforacacopy1wwds_10_tfprocod, AV76Tforacacopy1wwds_11_tfprocod_sel, lV77Tforacacopy1wwds_12_tfprodsc, AV78Tforacacopy1wwds_13_tfprodsc_sel, lV79Tforacacopy1wwds_14_tffascod, AV80Tforacacopy1wwds_15_tffascod_sel, lV81Tforacacopy1wwds_16_tffasdsc, AV82Tforacacopy1wwds_17_tffasdsc_sel, lV83Tforacacopy1wwds_18_tffasformul, AV84Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV85Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV86Tforacacopy1wwds_21_tfartproulin_to), AV87Tforacacopy1wwds_22_tfartprofac, AV88Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8GF16 = false ;
         A396EmprCod = P08GF9_A396EmprCod[0] ;
         A4286FasForMul = P08GF9_A4286FasForMul[0] ;
         n4286FasForMul = P08GF9_n4286FasForMul[0] ;
         A4896ArtProFac = P08GF9_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GF9_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GF9_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GF9_n4894ArtProULin[0] ;
         A460FasDsc = P08GF9_A460FasDsc[0] ;
         A457FasCod = P08GF9_A457FasCod[0] ;
         A759ProDsc = P08GF9_A759ProDsc[0] ;
         A758ProCod = P08GF9_A758ProCod[0] ;
         A69ArtDsc = P08GF9_A69ArtDsc[0] ;
         n69ArtDsc = P08GF9_n69ArtDsc[0] ;
         A65ArtCod = P08GF9_A65ArtCod[0] ;
         A279CliNom = P08GF9_A279CliNom[0] ;
         A252CliCod = P08GF9_A252CliCod[0] ;
         A4286FasForMul = P08GF9_A4286FasForMul[0] ;
         n4286FasForMul = P08GF9_n4286FasForMul[0] ;
         A460FasDsc = P08GF9_A460FasDsc[0] ;
         A759ProDsc = P08GF9_A759ProDsc[0] ;
         A279CliNom = P08GF9_A279CliNom[0] ;
         A69ArtDsc = P08GF9_A69ArtDsc[0] ;
         n69ArtDsc = P08GF9_n69ArtDsc[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08GF9_A4286FasForMul[0], A4286FasForMul) == 0 ) )
         {
            brk8GF16 = false ;
            A396EmprCod = P08GF9_A396EmprCod[0] ;
            A457FasCod = P08GF9_A457FasCod[0] ;
            A758ProCod = P08GF9_A758ProCod[0] ;
            A65ArtCod = P08GF9_A65ArtCod[0] ;
            A252CliCod = P08GF9_A252CliCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8GF16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A4286FasForMul)==0) )
         {
            AV36Option = A4286FasForMul ;
            AV39OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4286FasForMul, "@!"))) ;
            AV37Options.add(AV36Option, 0);
            AV40OptionsDesc.add(AV39OptionDesc, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GF16 )
         {
            brk8GF16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tforacacopy1wwgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = tforacacopy1wwgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = tforacacopy1wwgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFArtCod = "" ;
      AV15TFArtCod_Sel = "" ;
      AV16TFArtDsc = "" ;
      AV17TFArtDsc_Sel = "" ;
      AV18TFProCod = "" ;
      AV19TFProCod_Sel = "" ;
      AV20TFProDsc = "" ;
      AV21TFProDsc_Sel = "" ;
      AV22TFFasCod = "" ;
      AV23TFFasCod_Sel = "" ;
      AV24TFFasDsc = "" ;
      AV25TFFasDsc_Sel = "" ;
      AV26TFFasForMul = "" ;
      AV27TFFasForMul_Sel = "" ;
      AV30TFArtProFac = DecimalUtil.ZERO ;
      AV31TFArtProFac_To = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV66Tforacacopy1wwds_1_filterfulltext = "" ;
      AV69Tforacacopy1wwds_4_tfclinom = "" ;
      AV70Tforacacopy1wwds_5_tfclinom_sel = "" ;
      AV71Tforacacopy1wwds_6_tfartcod = "" ;
      AV72Tforacacopy1wwds_7_tfartcod_sel = "" ;
      AV73Tforacacopy1wwds_8_tfartdsc = "" ;
      AV74Tforacacopy1wwds_9_tfartdsc_sel = "" ;
      AV75Tforacacopy1wwds_10_tfprocod = "" ;
      AV76Tforacacopy1wwds_11_tfprocod_sel = "" ;
      AV77Tforacacopy1wwds_12_tfprodsc = "" ;
      AV78Tforacacopy1wwds_13_tfprodsc_sel = "" ;
      AV79Tforacacopy1wwds_14_tffascod = "" ;
      AV80Tforacacopy1wwds_15_tffascod_sel = "" ;
      AV81Tforacacopy1wwds_16_tffasdsc = "" ;
      AV82Tforacacopy1wwds_17_tffasdsc_sel = "" ;
      AV83Tforacacopy1wwds_18_tffasformul = "" ;
      AV84Tforacacopy1wwds_19_tffasformul_sel = "" ;
      AV87Tforacacopy1wwds_22_tfartprofac = DecimalUtil.ZERO ;
      AV88Tforacacopy1wwds_23_tfartprofac_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV66Tforacacopy1wwds_1_filterfulltext = "" ;
      lV69Tforacacopy1wwds_4_tfclinom = "" ;
      lV71Tforacacopy1wwds_6_tfartcod = "" ;
      lV73Tforacacopy1wwds_8_tfartdsc = "" ;
      lV75Tforacacopy1wwds_10_tfprocod = "" ;
      lV77Tforacacopy1wwds_12_tfprodsc = "" ;
      lV79Tforacacopy1wwds_14_tffascod = "" ;
      lV81Tforacacopy1wwds_16_tffasdsc = "" ;
      lV83Tforacacopy1wwds_18_tffasformul = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4286FasForMul = "" ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      P08GF2_A396EmprCod = new String[] {""} ;
      P08GF2_A279CliNom = new String[] {""} ;
      P08GF2_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF2_n4896ArtProFac = new boolean[] {false} ;
      P08GF2_A4894ArtProULin = new short[1] ;
      P08GF2_n4894ArtProULin = new boolean[] {false} ;
      P08GF2_A4286FasForMul = new String[] {""} ;
      P08GF2_n4286FasForMul = new boolean[] {false} ;
      P08GF2_A460FasDsc = new String[] {""} ;
      P08GF2_A457FasCod = new String[] {""} ;
      P08GF2_A759ProDsc = new String[] {""} ;
      P08GF2_A758ProCod = new String[] {""} ;
      P08GF2_A69ArtDsc = new String[] {""} ;
      P08GF2_n69ArtDsc = new boolean[] {false} ;
      P08GF2_A65ArtCod = new String[] {""} ;
      P08GF2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV36Option = "" ;
      P08GF3_A396EmprCod = new String[] {""} ;
      P08GF3_A65ArtCod = new String[] {""} ;
      P08GF3_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF3_n4896ArtProFac = new boolean[] {false} ;
      P08GF3_A4894ArtProULin = new short[1] ;
      P08GF3_n4894ArtProULin = new boolean[] {false} ;
      P08GF3_A4286FasForMul = new String[] {""} ;
      P08GF3_n4286FasForMul = new boolean[] {false} ;
      P08GF3_A460FasDsc = new String[] {""} ;
      P08GF3_A457FasCod = new String[] {""} ;
      P08GF3_A759ProDsc = new String[] {""} ;
      P08GF3_A758ProCod = new String[] {""} ;
      P08GF3_A69ArtDsc = new String[] {""} ;
      P08GF3_n69ArtDsc = new boolean[] {false} ;
      P08GF3_A279CliNom = new String[] {""} ;
      P08GF3_A252CliCod = new int[1] ;
      P08GF4_A396EmprCod = new String[] {""} ;
      P08GF4_A69ArtDsc = new String[] {""} ;
      P08GF4_n69ArtDsc = new boolean[] {false} ;
      P08GF4_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF4_n4896ArtProFac = new boolean[] {false} ;
      P08GF4_A4894ArtProULin = new short[1] ;
      P08GF4_n4894ArtProULin = new boolean[] {false} ;
      P08GF4_A4286FasForMul = new String[] {""} ;
      P08GF4_n4286FasForMul = new boolean[] {false} ;
      P08GF4_A460FasDsc = new String[] {""} ;
      P08GF4_A457FasCod = new String[] {""} ;
      P08GF4_A759ProDsc = new String[] {""} ;
      P08GF4_A758ProCod = new String[] {""} ;
      P08GF4_A65ArtCod = new String[] {""} ;
      P08GF4_A279CliNom = new String[] {""} ;
      P08GF4_A252CliCod = new int[1] ;
      P08GF5_A396EmprCod = new String[] {""} ;
      P08GF5_A758ProCod = new String[] {""} ;
      P08GF5_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF5_n4896ArtProFac = new boolean[] {false} ;
      P08GF5_A4894ArtProULin = new short[1] ;
      P08GF5_n4894ArtProULin = new boolean[] {false} ;
      P08GF5_A4286FasForMul = new String[] {""} ;
      P08GF5_n4286FasForMul = new boolean[] {false} ;
      P08GF5_A460FasDsc = new String[] {""} ;
      P08GF5_A457FasCod = new String[] {""} ;
      P08GF5_A759ProDsc = new String[] {""} ;
      P08GF5_A69ArtDsc = new String[] {""} ;
      P08GF5_n69ArtDsc = new boolean[] {false} ;
      P08GF5_A65ArtCod = new String[] {""} ;
      P08GF5_A279CliNom = new String[] {""} ;
      P08GF5_A252CliCod = new int[1] ;
      P08GF6_A396EmprCod = new String[] {""} ;
      P08GF6_A759ProDsc = new String[] {""} ;
      P08GF6_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF6_n4896ArtProFac = new boolean[] {false} ;
      P08GF6_A4894ArtProULin = new short[1] ;
      P08GF6_n4894ArtProULin = new boolean[] {false} ;
      P08GF6_A4286FasForMul = new String[] {""} ;
      P08GF6_n4286FasForMul = new boolean[] {false} ;
      P08GF6_A460FasDsc = new String[] {""} ;
      P08GF6_A457FasCod = new String[] {""} ;
      P08GF6_A758ProCod = new String[] {""} ;
      P08GF6_A69ArtDsc = new String[] {""} ;
      P08GF6_n69ArtDsc = new boolean[] {false} ;
      P08GF6_A65ArtCod = new String[] {""} ;
      P08GF6_A279CliNom = new String[] {""} ;
      P08GF6_A252CliCod = new int[1] ;
      P08GF7_A396EmprCod = new String[] {""} ;
      P08GF7_A457FasCod = new String[] {""} ;
      P08GF7_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF7_n4896ArtProFac = new boolean[] {false} ;
      P08GF7_A4894ArtProULin = new short[1] ;
      P08GF7_n4894ArtProULin = new boolean[] {false} ;
      P08GF7_A4286FasForMul = new String[] {""} ;
      P08GF7_n4286FasForMul = new boolean[] {false} ;
      P08GF7_A460FasDsc = new String[] {""} ;
      P08GF7_A759ProDsc = new String[] {""} ;
      P08GF7_A758ProCod = new String[] {""} ;
      P08GF7_A69ArtDsc = new String[] {""} ;
      P08GF7_n69ArtDsc = new boolean[] {false} ;
      P08GF7_A65ArtCod = new String[] {""} ;
      P08GF7_A279CliNom = new String[] {""} ;
      P08GF7_A252CliCod = new int[1] ;
      AV39OptionDesc = "" ;
      P08GF8_A396EmprCod = new String[] {""} ;
      P08GF8_A460FasDsc = new String[] {""} ;
      P08GF8_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF8_n4896ArtProFac = new boolean[] {false} ;
      P08GF8_A4894ArtProULin = new short[1] ;
      P08GF8_n4894ArtProULin = new boolean[] {false} ;
      P08GF8_A4286FasForMul = new String[] {""} ;
      P08GF8_n4286FasForMul = new boolean[] {false} ;
      P08GF8_A457FasCod = new String[] {""} ;
      P08GF8_A759ProDsc = new String[] {""} ;
      P08GF8_A758ProCod = new String[] {""} ;
      P08GF8_A69ArtDsc = new String[] {""} ;
      P08GF8_n69ArtDsc = new boolean[] {false} ;
      P08GF8_A65ArtCod = new String[] {""} ;
      P08GF8_A279CliNom = new String[] {""} ;
      P08GF8_A252CliCod = new int[1] ;
      P08GF9_A396EmprCod = new String[] {""} ;
      P08GF9_A4286FasForMul = new String[] {""} ;
      P08GF9_n4286FasForMul = new boolean[] {false} ;
      P08GF9_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GF9_n4896ArtProFac = new boolean[] {false} ;
      P08GF9_A4894ArtProULin = new short[1] ;
      P08GF9_n4894ArtProULin = new boolean[] {false} ;
      P08GF9_A460FasDsc = new String[] {""} ;
      P08GF9_A457FasCod = new String[] {""} ;
      P08GF9_A759ProDsc = new String[] {""} ;
      P08GF9_A758ProCod = new String[] {""} ;
      P08GF9_A69ArtDsc = new String[] {""} ;
      P08GF9_n69ArtDsc = new boolean[] {false} ;
      P08GF9_A65ArtCod = new String[] {""} ;
      P08GF9_A279CliNom = new String[] {""} ;
      P08GF9_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08GF2_A396EmprCod, P08GF2_A279CliNom, P08GF2_A4896ArtProFac, P08GF2_n4896ArtProFac, P08GF2_A4894ArtProULin, P08GF2_n4894ArtProULin, P08GF2_A4286FasForMul, P08GF2_n4286FasForMul, P08GF2_A460FasDsc, P08GF2_A457FasCod,
            P08GF2_A759ProDsc, P08GF2_A758ProCod, P08GF2_A69ArtDsc, P08GF2_n69ArtDsc, P08GF2_A65ArtCod, P08GF2_A252CliCod
            }
            , new Object[] {
            P08GF3_A396EmprCod, P08GF3_A65ArtCod, P08GF3_A4896ArtProFac, P08GF3_n4896ArtProFac, P08GF3_A4894ArtProULin, P08GF3_n4894ArtProULin, P08GF3_A4286FasForMul, P08GF3_n4286FasForMul, P08GF3_A460FasDsc, P08GF3_A457FasCod,
            P08GF3_A759ProDsc, P08GF3_A758ProCod, P08GF3_A69ArtDsc, P08GF3_n69ArtDsc, P08GF3_A279CliNom, P08GF3_A252CliCod
            }
            , new Object[] {
            P08GF4_A396EmprCod, P08GF4_A69ArtDsc, P08GF4_n69ArtDsc, P08GF4_A4896ArtProFac, P08GF4_n4896ArtProFac, P08GF4_A4894ArtProULin, P08GF4_n4894ArtProULin, P08GF4_A4286FasForMul, P08GF4_n4286FasForMul, P08GF4_A460FasDsc,
            P08GF4_A457FasCod, P08GF4_A759ProDsc, P08GF4_A758ProCod, P08GF4_A65ArtCod, P08GF4_A279CliNom, P08GF4_A252CliCod
            }
            , new Object[] {
            P08GF5_A396EmprCod, P08GF5_A758ProCod, P08GF5_A4896ArtProFac, P08GF5_n4896ArtProFac, P08GF5_A4894ArtProULin, P08GF5_n4894ArtProULin, P08GF5_A4286FasForMul, P08GF5_n4286FasForMul, P08GF5_A460FasDsc, P08GF5_A457FasCod,
            P08GF5_A759ProDsc, P08GF5_A69ArtDsc, P08GF5_n69ArtDsc, P08GF5_A65ArtCod, P08GF5_A279CliNom, P08GF5_A252CliCod
            }
            , new Object[] {
            P08GF6_A396EmprCod, P08GF6_A759ProDsc, P08GF6_A4896ArtProFac, P08GF6_n4896ArtProFac, P08GF6_A4894ArtProULin, P08GF6_n4894ArtProULin, P08GF6_A4286FasForMul, P08GF6_n4286FasForMul, P08GF6_A460FasDsc, P08GF6_A457FasCod,
            P08GF6_A758ProCod, P08GF6_A69ArtDsc, P08GF6_n69ArtDsc, P08GF6_A65ArtCod, P08GF6_A279CliNom, P08GF6_A252CliCod
            }
            , new Object[] {
            P08GF7_A396EmprCod, P08GF7_A457FasCod, P08GF7_A4896ArtProFac, P08GF7_n4896ArtProFac, P08GF7_A4894ArtProULin, P08GF7_n4894ArtProULin, P08GF7_A4286FasForMul, P08GF7_n4286FasForMul, P08GF7_A460FasDsc, P08GF7_A759ProDsc,
            P08GF7_A758ProCod, P08GF7_A69ArtDsc, P08GF7_n69ArtDsc, P08GF7_A65ArtCod, P08GF7_A279CliNom, P08GF7_A252CliCod
            }
            , new Object[] {
            P08GF8_A396EmprCod, P08GF8_A460FasDsc, P08GF8_A4896ArtProFac, P08GF8_n4896ArtProFac, P08GF8_A4894ArtProULin, P08GF8_n4894ArtProULin, P08GF8_A4286FasForMul, P08GF8_n4286FasForMul, P08GF8_A457FasCod, P08GF8_A759ProDsc,
            P08GF8_A758ProCod, P08GF8_A69ArtDsc, P08GF8_n69ArtDsc, P08GF8_A65ArtCod, P08GF8_A279CliNom, P08GF8_A252CliCod
            }
            , new Object[] {
            P08GF9_A396EmprCod, P08GF9_A4286FasForMul, P08GF9_n4286FasForMul, P08GF9_A4896ArtProFac, P08GF9_n4896ArtProFac, P08GF9_A4894ArtProULin, P08GF9_n4894ArtProULin, P08GF9_A460FasDsc, P08GF9_A457FasCod, P08GF9_A759ProDsc,
            P08GF9_A758ProCod, P08GF9_A69ArtDsc, P08GF9_n69ArtDsc, P08GF9_A65ArtCod, P08GF9_A279CliNom, P08GF9_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV28TFArtProULin ;
   private short AV29TFArtProULin_To ;
   private short AV85Tforacacopy1wwds_20_tfartproulin ;
   private short AV86Tforacacopy1wwds_21_tfartproulin_to ;
   private short A4894ArtProULin ;
   private short Gx_err ;
   private int AV64GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV67Tforacacopy1wwds_2_tfclicod ;
   private int AV68Tforacacopy1wwds_3_tfclicod_to ;
   private int A252CliCod ;
   private long AV44count ;
   private java.math.BigDecimal AV30TFArtProFac ;
   private java.math.BigDecimal AV31TFArtProFac_To ;
   private java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ;
   private java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ;
   private java.math.BigDecimal A4896ArtProFac ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFArtCod ;
   private String AV15TFArtCod_Sel ;
   private String AV16TFArtDsc ;
   private String AV17TFArtDsc_Sel ;
   private String AV18TFProCod ;
   private String AV19TFProCod_Sel ;
   private String AV20TFProDsc ;
   private String AV21TFProDsc_Sel ;
   private String AV22TFFasCod ;
   private String AV23TFFasCod_Sel ;
   private String AV24TFFasDsc ;
   private String AV25TFFasDsc_Sel ;
   private String AV26TFFasForMul ;
   private String AV27TFFasForMul_Sel ;
   private String A279CliNom ;
   private String AV69Tforacacopy1wwds_4_tfclinom ;
   private String AV70Tforacacopy1wwds_5_tfclinom_sel ;
   private String AV71Tforacacopy1wwds_6_tfartcod ;
   private String AV72Tforacacopy1wwds_7_tfartcod_sel ;
   private String AV73Tforacacopy1wwds_8_tfartdsc ;
   private String AV74Tforacacopy1wwds_9_tfartdsc_sel ;
   private String AV75Tforacacopy1wwds_10_tfprocod ;
   private String AV76Tforacacopy1wwds_11_tfprocod_sel ;
   private String AV77Tforacacopy1wwds_12_tfprodsc ;
   private String AV78Tforacacopy1wwds_13_tfprodsc_sel ;
   private String AV79Tforacacopy1wwds_14_tffascod ;
   private String AV80Tforacacopy1wwds_15_tffascod_sel ;
   private String AV81Tforacacopy1wwds_16_tffasdsc ;
   private String AV82Tforacacopy1wwds_17_tffasdsc_sel ;
   private String AV83Tforacacopy1wwds_18_tffasformul ;
   private String AV84Tforacacopy1wwds_19_tffasformul_sel ;
   private String scmdbuf ;
   private String lV69Tforacacopy1wwds_4_tfclinom ;
   private String lV71Tforacacopy1wwds_6_tfartcod ;
   private String lV73Tforacacopy1wwds_8_tfartdsc ;
   private String lV75Tforacacopy1wwds_10_tfprocod ;
   private String lV77Tforacacopy1wwds_12_tfprodsc ;
   private String lV79Tforacacopy1wwds_14_tffascod ;
   private String lV81Tforacacopy1wwds_16_tffasdsc ;
   private String lV83Tforacacopy1wwds_18_tffasformul ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A4286FasForMul ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8GF2 ;
   private boolean n4896ArtProFac ;
   private boolean n4894ArtProULin ;
   private boolean n4286FasForMul ;
   private boolean n69ArtDsc ;
   private boolean brk8GF4 ;
   private boolean brk8GF6 ;
   private boolean brk8GF8 ;
   private boolean brk8GF10 ;
   private boolean brk8GF12 ;
   private boolean brk8GF14 ;
   private boolean brk8GF16 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV61FilterFullText ;
   private String AV66Tforacacopy1wwds_1_filterfulltext ;
   private String lV66Tforacacopy1wwds_1_filterfulltext ;
   private String AV36Option ;
   private String AV39OptionDesc ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GF2_A396EmprCod ;
   private String[] P08GF2_A279CliNom ;
   private java.math.BigDecimal[] P08GF2_A4896ArtProFac ;
   private boolean[] P08GF2_n4896ArtProFac ;
   private short[] P08GF2_A4894ArtProULin ;
   private boolean[] P08GF2_n4894ArtProULin ;
   private String[] P08GF2_A4286FasForMul ;
   private boolean[] P08GF2_n4286FasForMul ;
   private String[] P08GF2_A460FasDsc ;
   private String[] P08GF2_A457FasCod ;
   private String[] P08GF2_A759ProDsc ;
   private String[] P08GF2_A758ProCod ;
   private String[] P08GF2_A69ArtDsc ;
   private boolean[] P08GF2_n69ArtDsc ;
   private String[] P08GF2_A65ArtCod ;
   private int[] P08GF2_A252CliCod ;
   private String[] P08GF3_A396EmprCod ;
   private String[] P08GF3_A65ArtCod ;
   private java.math.BigDecimal[] P08GF3_A4896ArtProFac ;
   private boolean[] P08GF3_n4896ArtProFac ;
   private short[] P08GF3_A4894ArtProULin ;
   private boolean[] P08GF3_n4894ArtProULin ;
   private String[] P08GF3_A4286FasForMul ;
   private boolean[] P08GF3_n4286FasForMul ;
   private String[] P08GF3_A460FasDsc ;
   private String[] P08GF3_A457FasCod ;
   private String[] P08GF3_A759ProDsc ;
   private String[] P08GF3_A758ProCod ;
   private String[] P08GF3_A69ArtDsc ;
   private boolean[] P08GF3_n69ArtDsc ;
   private String[] P08GF3_A279CliNom ;
   private int[] P08GF3_A252CliCod ;
   private String[] P08GF4_A396EmprCod ;
   private String[] P08GF4_A69ArtDsc ;
   private boolean[] P08GF4_n69ArtDsc ;
   private java.math.BigDecimal[] P08GF4_A4896ArtProFac ;
   private boolean[] P08GF4_n4896ArtProFac ;
   private short[] P08GF4_A4894ArtProULin ;
   private boolean[] P08GF4_n4894ArtProULin ;
   private String[] P08GF4_A4286FasForMul ;
   private boolean[] P08GF4_n4286FasForMul ;
   private String[] P08GF4_A460FasDsc ;
   private String[] P08GF4_A457FasCod ;
   private String[] P08GF4_A759ProDsc ;
   private String[] P08GF4_A758ProCod ;
   private String[] P08GF4_A65ArtCod ;
   private String[] P08GF4_A279CliNom ;
   private int[] P08GF4_A252CliCod ;
   private String[] P08GF5_A396EmprCod ;
   private String[] P08GF5_A758ProCod ;
   private java.math.BigDecimal[] P08GF5_A4896ArtProFac ;
   private boolean[] P08GF5_n4896ArtProFac ;
   private short[] P08GF5_A4894ArtProULin ;
   private boolean[] P08GF5_n4894ArtProULin ;
   private String[] P08GF5_A4286FasForMul ;
   private boolean[] P08GF5_n4286FasForMul ;
   private String[] P08GF5_A460FasDsc ;
   private String[] P08GF5_A457FasCod ;
   private String[] P08GF5_A759ProDsc ;
   private String[] P08GF5_A69ArtDsc ;
   private boolean[] P08GF5_n69ArtDsc ;
   private String[] P08GF5_A65ArtCod ;
   private String[] P08GF5_A279CliNom ;
   private int[] P08GF5_A252CliCod ;
   private String[] P08GF6_A396EmprCod ;
   private String[] P08GF6_A759ProDsc ;
   private java.math.BigDecimal[] P08GF6_A4896ArtProFac ;
   private boolean[] P08GF6_n4896ArtProFac ;
   private short[] P08GF6_A4894ArtProULin ;
   private boolean[] P08GF6_n4894ArtProULin ;
   private String[] P08GF6_A4286FasForMul ;
   private boolean[] P08GF6_n4286FasForMul ;
   private String[] P08GF6_A460FasDsc ;
   private String[] P08GF6_A457FasCod ;
   private String[] P08GF6_A758ProCod ;
   private String[] P08GF6_A69ArtDsc ;
   private boolean[] P08GF6_n69ArtDsc ;
   private String[] P08GF6_A65ArtCod ;
   private String[] P08GF6_A279CliNom ;
   private int[] P08GF6_A252CliCod ;
   private String[] P08GF7_A396EmprCod ;
   private String[] P08GF7_A457FasCod ;
   private java.math.BigDecimal[] P08GF7_A4896ArtProFac ;
   private boolean[] P08GF7_n4896ArtProFac ;
   private short[] P08GF7_A4894ArtProULin ;
   private boolean[] P08GF7_n4894ArtProULin ;
   private String[] P08GF7_A4286FasForMul ;
   private boolean[] P08GF7_n4286FasForMul ;
   private String[] P08GF7_A460FasDsc ;
   private String[] P08GF7_A759ProDsc ;
   private String[] P08GF7_A758ProCod ;
   private String[] P08GF7_A69ArtDsc ;
   private boolean[] P08GF7_n69ArtDsc ;
   private String[] P08GF7_A65ArtCod ;
   private String[] P08GF7_A279CliNom ;
   private int[] P08GF7_A252CliCod ;
   private String[] P08GF8_A396EmprCod ;
   private String[] P08GF8_A460FasDsc ;
   private java.math.BigDecimal[] P08GF8_A4896ArtProFac ;
   private boolean[] P08GF8_n4896ArtProFac ;
   private short[] P08GF8_A4894ArtProULin ;
   private boolean[] P08GF8_n4894ArtProULin ;
   private String[] P08GF8_A4286FasForMul ;
   private boolean[] P08GF8_n4286FasForMul ;
   private String[] P08GF8_A457FasCod ;
   private String[] P08GF8_A759ProDsc ;
   private String[] P08GF8_A758ProCod ;
   private String[] P08GF8_A69ArtDsc ;
   private boolean[] P08GF8_n69ArtDsc ;
   private String[] P08GF8_A65ArtCod ;
   private String[] P08GF8_A279CliNom ;
   private int[] P08GF8_A252CliCod ;
   private String[] P08GF9_A396EmprCod ;
   private String[] P08GF9_A4286FasForMul ;
   private boolean[] P08GF9_n4286FasForMul ;
   private java.math.BigDecimal[] P08GF9_A4896ArtProFac ;
   private boolean[] P08GF9_n4896ArtProFac ;
   private short[] P08GF9_A4894ArtProULin ;
   private boolean[] P08GF9_n4894ArtProULin ;
   private String[] P08GF9_A460FasDsc ;
   private String[] P08GF9_A457FasCod ;
   private String[] P08GF9_A759ProDsc ;
   private String[] P08GF9_A758ProCod ;
   private String[] P08GF9_A69ArtDsc ;
   private boolean[] P08GF9_n69ArtDsc ;
   private String[] P08GF9_A65ArtCod ;
   private String[] P08GF9_A279CliNom ;
   private int[] P08GF9_A252CliCod ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class tforacacopy1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T4.CliNom, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
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
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08GF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[33];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtCod, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
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
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08GF4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T5.ArtDsc, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
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
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.ArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08GF5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T1.ArtProFac, T1.ArtProULin, T3.FasForMul, T3.FasDsc, T1.FasCod, T2.ProDsc, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)) or ( UPPER(T3.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
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
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasForMul = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08GF6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[33];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.ProDsc, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T2.FasDsc, T1.FasCod, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
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
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.ProDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08GF7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[33];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T2.FasDsc, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08GF8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[33];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FasDsc, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
         GXv_int14[1] = (byte)(1) ;
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08GF9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Tforacacopy1wwds_1_filterfulltext ,
                                          int AV67Tforacacopy1wwds_2_tfclicod ,
                                          int AV68Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV70Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV69Tforacacopy1wwds_4_tfclinom ,
                                          String AV72Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV71Tforacacopy1wwds_6_tfartcod ,
                                          String AV74Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV73Tforacacopy1wwds_8_tfartdsc ,
                                          String AV76Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV75Tforacacopy1wwds_10_tfprocod ,
                                          String AV78Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV77Tforacacopy1wwds_12_tfprodsc ,
                                          String AV80Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV79Tforacacopy1wwds_14_tffascod ,
                                          String AV82Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV81Tforacacopy1wwds_16_tffasdsc ,
                                          String AV84Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV83Tforacacopy1wwds_18_tffasformul ,
                                          short AV85Tforacacopy1wwds_20_tfartproulin ,
                                          short AV86Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV87Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV88Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[33];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FasForMul, T1.ArtProFac, T1.ArtProULin, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV66Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
         GXv_int16[1] = (byte)(1) ;
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV67Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV69Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV83Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV85Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasForMul" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P08GF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
            case 1 :
                  return conditional_P08GF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
            case 2 :
                  return conditional_P08GF4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
            case 3 :
                  return conditional_P08GF5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
            case 4 :
                  return conditional_P08GF6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
            case 5 :
                  return conditional_P08GF7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
            case 6 :
                  return conditional_P08GF8(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
            case 7 :
                  return conditional_P08GF9(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GF4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GF5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GF6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GF7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GF8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GF9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 28);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((String[]) buf[10])[0] = rslt.getString(8, 40);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 28);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((String[]) buf[10])[0] = rslt.getString(8, 40);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 28);
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((String[]) buf[11])[0] = rslt.getString(8, 40);
               ((String[]) buf[12])[0] = rslt.getString(9, 8);
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 28);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((String[]) buf[10])[0] = rslt.getString(8, 40);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 28);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 28);
               ((String[]) buf[9])[0] = rslt.getString(7, 40);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((String[]) buf[9])[0] = rslt.getString(7, 40);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 28);
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((String[]) buf[9])[0] = rslt.getString(7, 40);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
      }
   }

}

