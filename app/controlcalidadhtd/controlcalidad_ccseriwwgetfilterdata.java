package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccseriwwgetfilterdata extends GXProcedure
{
   public controlcalidad_ccseriwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccseriwwgetfilterdata.class ), "" );
   }

   public controlcalidad_ccseriwwgetfilterdata( int remoteHandle ,
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
      controlcalidad_ccseriwwgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidad_ccseriwwgetfilterdata.this.AV34DDOName = aP0;
      controlcalidad_ccseriwwgetfilterdata.this.AV35SearchTxt = aP1;
      controlcalidad_ccseriwwgetfilterdata.this.AV36SearchTxtTo = aP2;
      controlcalidad_ccseriwwgetfilterdata.this.aP3 = aP3;
      controlcalidad_ccseriwwgetfilterdata.this.aP4 = aP4;
      controlcalidad_ccseriwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_CCFCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCCFCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("ControlCalidadHTD.ControlCalidad_CCSeriWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CCSeriWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("ControlCalidadHTD.ControlCalidad_CCSeriWWGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV14TFArtCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV15TFArtCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV16TFArtDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV17TFArtDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFCOLNOM") == 0 )
         {
            AV18TFCCFColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFCOLNOM_SEL") == 0 )
         {
            AV19TFCCFColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFCOLNUM") == 0 )
         {
            AV20TFCCFColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCCFColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV35SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = AV40FilterFullText ;
      AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod = AV10TFCliCod ;
      AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = AV12TFCliNom ;
      AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = AV14TFArtCod ;
      AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = AV16TFArtDsc ;
      AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = AV18TFCCFColNom ;
      AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel = AV19TFCCFColNom_Sel ;
      AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum = AV20TFCCFColNum ;
      AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to = AV21TFCCFColNum_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                           Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) ,
                                           Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) ,
                                           AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                           AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                           AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                           AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                           AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                           AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                           AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                           Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) ,
                                           Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom), 30, "%") ;
      lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod), 16, "%") ;
      lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc), 26, "%") ;
      lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom), 13, "%") ;
      /* Using cursor P0AOG2 */
      pr_default.execute(0, new Object[] {lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod), Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to), lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom, AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel, lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod, AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel, lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc, AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel, lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom, AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel, Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum), Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAOG2 = false ;
         A396EmprCod = P0AOG2_A396EmprCod[0] ;
         A279CliNom = P0AOG2_A279CliNom[0] ;
         A4059CCFColNum = P0AOG2_A4059CCFColNum[0] ;
         A4058CCFColNom = P0AOG2_A4058CCFColNom[0] ;
         A69ArtDsc = P0AOG2_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG2_n69ArtDsc[0] ;
         A65ArtCod = P0AOG2_A65ArtCod[0] ;
         A252CliCod = P0AOG2_A252CliCod[0] ;
         A279CliNom = P0AOG2_A279CliNom[0] ;
         A69ArtDsc = P0AOG2_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG2_n69ArtDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AOG2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkAOG2 = false ;
            A396EmprCod = P0AOG2_A396EmprCod[0] ;
            A4059CCFColNum = P0AOG2_A4059CCFColNum[0] ;
            A4058CCFColNom = P0AOG2_A4058CCFColNom[0] ;
            A65ArtCod = P0AOG2_A65ArtCod[0] ;
            A252CliCod = P0AOG2_A252CliCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAOG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV23Option = A279CliNom ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAOG2 )
         {
            brkAOG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtCod = AV35SearchTxt ;
      AV15TFArtCod_Sel = "" ;
      AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = AV40FilterFullText ;
      AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod = AV10TFCliCod ;
      AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = AV12TFCliNom ;
      AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = AV14TFArtCod ;
      AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = AV16TFArtDsc ;
      AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = AV18TFCCFColNom ;
      AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel = AV19TFCCFColNom_Sel ;
      AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum = AV20TFCCFColNum ;
      AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to = AV21TFCCFColNum_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                           Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) ,
                                           Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) ,
                                           AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                           AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                           AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                           AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                           AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                           AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                           AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                           Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) ,
                                           Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom), 30, "%") ;
      lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod), 16, "%") ;
      lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc), 26, "%") ;
      lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom), 13, "%") ;
      /* Using cursor P0AOG3 */
      pr_default.execute(1, new Object[] {lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod), Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to), lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom, AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel, lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod, AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel, lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc, AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel, lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom, AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel, Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum), Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAOG4 = false ;
         A396EmprCod = P0AOG3_A396EmprCod[0] ;
         A65ArtCod = P0AOG3_A65ArtCod[0] ;
         A4059CCFColNum = P0AOG3_A4059CCFColNum[0] ;
         A4058CCFColNom = P0AOG3_A4058CCFColNom[0] ;
         A69ArtDsc = P0AOG3_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG3_n69ArtDsc[0] ;
         A279CliNom = P0AOG3_A279CliNom[0] ;
         A252CliCod = P0AOG3_A252CliCod[0] ;
         A279CliNom = P0AOG3_A279CliNom[0] ;
         A69ArtDsc = P0AOG3_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG3_n69ArtDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AOG3_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brkAOG4 = false ;
            A396EmprCod = P0AOG3_A396EmprCod[0] ;
            A4059CCFColNum = P0AOG3_A4059CCFColNum[0] ;
            A4058CCFColNom = P0AOG3_A4058CCFColNom[0] ;
            A252CliCod = P0AOG3_A252CliCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAOG4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV23Option = A65ArtCod ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAOG4 )
         {
            brkAOG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFArtDsc = AV35SearchTxt ;
      AV17TFArtDsc_Sel = "" ;
      AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = AV40FilterFullText ;
      AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod = AV10TFCliCod ;
      AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = AV12TFCliNom ;
      AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = AV14TFArtCod ;
      AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = AV16TFArtDsc ;
      AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = AV18TFCCFColNom ;
      AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel = AV19TFCCFColNom_Sel ;
      AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum = AV20TFCCFColNum ;
      AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to = AV21TFCCFColNum_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                           Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) ,
                                           Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) ,
                                           AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                           AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                           AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                           AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                           AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                           AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                           AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                           Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) ,
                                           Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom), 30, "%") ;
      lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod), 16, "%") ;
      lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc), 26, "%") ;
      lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom), 13, "%") ;
      /* Using cursor P0AOG4 */
      pr_default.execute(2, new Object[] {lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod), Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to), lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom, AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel, lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod, AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel, lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc, AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel, lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom, AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel, Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum), Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAOG6 = false ;
         A65ArtCod = P0AOG4_A65ArtCod[0] ;
         A252CliCod = P0AOG4_A252CliCod[0] ;
         A396EmprCod = P0AOG4_A396EmprCod[0] ;
         A4059CCFColNum = P0AOG4_A4059CCFColNum[0] ;
         A4058CCFColNom = P0AOG4_A4058CCFColNom[0] ;
         A69ArtDsc = P0AOG4_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG4_n69ArtDsc[0] ;
         A279CliNom = P0AOG4_A279CliNom[0] ;
         A279CliNom = P0AOG4_A279CliNom[0] ;
         A69ArtDsc = P0AOG4_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG4_n69ArtDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AOG4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AOG4_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P0AOG4_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brkAOG6 = false ;
            A4059CCFColNum = P0AOG4_A4059CCFColNum[0] ;
            A4058CCFColNom = P0AOG4_A4058CCFColNom[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAOG6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV23Option = A69ArtDsc ;
            AV22InsertIndex = 1 ;
            while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
            {
               AV22InsertIndex = (int)(AV22InsertIndex+1) ;
            }
            AV24Options.add(AV23Option, AV22InsertIndex);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAOG6 )
         {
            brkAOG6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCCFCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCCFColNom = AV35SearchTxt ;
      AV19TFCCFColNom_Sel = "" ;
      AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = AV40FilterFullText ;
      AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod = AV10TFCliCod ;
      AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = AV12TFCliNom ;
      AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = AV14TFArtCod ;
      AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = AV16TFArtDsc ;
      AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = AV18TFCCFColNom ;
      AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel = AV19TFCCFColNom_Sel ;
      AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum = AV20TFCCFColNum ;
      AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to = AV21TFCCFColNum_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                           Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) ,
                                           Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) ,
                                           AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                           AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                           AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                           AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                           AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                           AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                           AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                           AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                           Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) ,
                                           Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom), 30, "%") ;
      lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod), 16, "%") ;
      lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc), 26, "%") ;
      lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom), 13, "%") ;
      /* Using cursor P0AOG5 */
      pr_default.execute(3, new Object[] {lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, Integer.valueOf(AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod), Integer.valueOf(AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to), lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom, AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel, lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod, AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel, lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc, AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel, lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom, AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel, Integer.valueOf(AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum), Integer.valueOf(AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAOG8 = false ;
         A396EmprCod = P0AOG5_A396EmprCod[0] ;
         A4058CCFColNom = P0AOG5_A4058CCFColNom[0] ;
         A4059CCFColNum = P0AOG5_A4059CCFColNum[0] ;
         A69ArtDsc = P0AOG5_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG5_n69ArtDsc[0] ;
         A65ArtCod = P0AOG5_A65ArtCod[0] ;
         A279CliNom = P0AOG5_A279CliNom[0] ;
         A252CliCod = P0AOG5_A252CliCod[0] ;
         A279CliNom = P0AOG5_A279CliNom[0] ;
         A69ArtDsc = P0AOG5_A69ArtDsc[0] ;
         n69ArtDsc = P0AOG5_n69ArtDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AOG5_A4058CCFColNom[0], A4058CCFColNom) == 0 ) )
         {
            brkAOG8 = false ;
            A396EmprCod = P0AOG5_A396EmprCod[0] ;
            A4059CCFColNum = P0AOG5_A4059CCFColNum[0] ;
            A65ArtCod = P0AOG5_A65ArtCod[0] ;
            A252CliCod = P0AOG5_A252CliCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAOG8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4058CCFColNom)==0) )
         {
            AV23Option = A4058CCFColNom ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAOG8 )
         {
            brkAOG8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccseriwwgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = controlcalidad_ccseriwwgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = controlcalidad_ccseriwwgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFArtCod = "" ;
      AV15TFArtCod_Sel = "" ;
      AV16TFArtDsc = "" ;
      AV17TFArtDsc_Sel = "" ;
      AV18TFCCFColNom = "" ;
      AV19TFCCFColNom_Sel = "" ;
      A279CliNom = "" ;
      AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = "" ;
      AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = "" ;
      AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel = "" ;
      AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = "" ;
      AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel = "" ;
      AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = "" ;
      AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel = "" ;
      AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = "" ;
      AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel = "" ;
      scmdbuf = "" ;
      lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = "" ;
      lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = "" ;
      lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = "" ;
      lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = "" ;
      lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A4058CCFColNom = "" ;
      P0AOG2_A396EmprCod = new String[] {""} ;
      P0AOG2_A279CliNom = new String[] {""} ;
      P0AOG2_A4059CCFColNum = new int[1] ;
      P0AOG2_A4058CCFColNom = new String[] {""} ;
      P0AOG2_A69ArtDsc = new String[] {""} ;
      P0AOG2_n69ArtDsc = new boolean[] {false} ;
      P0AOG2_A65ArtCod = new String[] {""} ;
      P0AOG2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV23Option = "" ;
      P0AOG3_A396EmprCod = new String[] {""} ;
      P0AOG3_A65ArtCod = new String[] {""} ;
      P0AOG3_A4059CCFColNum = new int[1] ;
      P0AOG3_A4058CCFColNom = new String[] {""} ;
      P0AOG3_A69ArtDsc = new String[] {""} ;
      P0AOG3_n69ArtDsc = new boolean[] {false} ;
      P0AOG3_A279CliNom = new String[] {""} ;
      P0AOG3_A252CliCod = new int[1] ;
      P0AOG4_A65ArtCod = new String[] {""} ;
      P0AOG4_A252CliCod = new int[1] ;
      P0AOG4_A396EmprCod = new String[] {""} ;
      P0AOG4_A4059CCFColNum = new int[1] ;
      P0AOG4_A4058CCFColNom = new String[] {""} ;
      P0AOG4_A69ArtDsc = new String[] {""} ;
      P0AOG4_n69ArtDsc = new boolean[] {false} ;
      P0AOG4_A279CliNom = new String[] {""} ;
      P0AOG5_A396EmprCod = new String[] {""} ;
      P0AOG5_A4058CCFColNom = new String[] {""} ;
      P0AOG5_A4059CCFColNum = new int[1] ;
      P0AOG5_A69ArtDsc = new String[] {""} ;
      P0AOG5_n69ArtDsc = new boolean[] {false} ;
      P0AOG5_A65ArtCod = new String[] {""} ;
      P0AOG5_A279CliNom = new String[] {""} ;
      P0AOG5_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseriwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AOG2_A396EmprCod, P0AOG2_A279CliNom, P0AOG2_A4059CCFColNum, P0AOG2_A4058CCFColNom, P0AOG2_A69ArtDsc, P0AOG2_n69ArtDsc, P0AOG2_A65ArtCod, P0AOG2_A252CliCod
            }
            , new Object[] {
            P0AOG3_A396EmprCod, P0AOG3_A65ArtCod, P0AOG3_A4059CCFColNum, P0AOG3_A4058CCFColNom, P0AOG3_A69ArtDsc, P0AOG3_n69ArtDsc, P0AOG3_A279CliNom, P0AOG3_A252CliCod
            }
            , new Object[] {
            P0AOG4_A65ArtCod, P0AOG4_A252CliCod, P0AOG4_A396EmprCod, P0AOG4_A4059CCFColNum, P0AOG4_A4058CCFColNom, P0AOG4_A69ArtDsc, P0AOG4_n69ArtDsc, P0AOG4_A279CliNom
            }
            , new Object[] {
            P0AOG5_A396EmprCod, P0AOG5_A4058CCFColNom, P0AOG5_A4059CCFColNum, P0AOG5_A69ArtDsc, P0AOG5_n69ArtDsc, P0AOG5_A65ArtCod, P0AOG5_A279CliNom, P0AOG5_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV20TFCCFColNum ;
   private int AV21TFCCFColNum_To ;
   private int AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod ;
   private int AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to ;
   private int AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum ;
   private int AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int AV22InsertIndex ;
   private long AV28count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFArtCod ;
   private String AV15TFArtCod_Sel ;
   private String AV16TFArtDsc ;
   private String AV17TFArtDsc_Sel ;
   private String AV18TFCCFColNom ;
   private String AV19TFCCFColNom_Sel ;
   private String A279CliNom ;
   private String AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ;
   private String AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ;
   private String AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ;
   private String AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ;
   private String AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ;
   private String AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ;
   private String AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ;
   private String AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ;
   private String scmdbuf ;
   private String lV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ;
   private String lV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ;
   private String lV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ;
   private String lV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A4058CCFColNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAOG2 ;
   private boolean n69ArtDsc ;
   private boolean brkAOG4 ;
   private boolean brkAOG6 ;
   private boolean brkAOG8 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ;
   private String lV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOG2_A396EmprCod ;
   private String[] P0AOG2_A279CliNom ;
   private int[] P0AOG2_A4059CCFColNum ;
   private String[] P0AOG2_A4058CCFColNom ;
   private String[] P0AOG2_A69ArtDsc ;
   private boolean[] P0AOG2_n69ArtDsc ;
   private String[] P0AOG2_A65ArtCod ;
   private int[] P0AOG2_A252CliCod ;
   private String[] P0AOG3_A396EmprCod ;
   private String[] P0AOG3_A65ArtCod ;
   private int[] P0AOG3_A4059CCFColNum ;
   private String[] P0AOG3_A4058CCFColNom ;
   private String[] P0AOG3_A69ArtDsc ;
   private boolean[] P0AOG3_n69ArtDsc ;
   private String[] P0AOG3_A279CliNom ;
   private int[] P0AOG3_A252CliCod ;
   private String[] P0AOG4_A65ArtCod ;
   private int[] P0AOG4_A252CliCod ;
   private String[] P0AOG4_A396EmprCod ;
   private int[] P0AOG4_A4059CCFColNum ;
   private String[] P0AOG4_A4058CCFColNom ;
   private String[] P0AOG4_A69ArtDsc ;
   private boolean[] P0AOG4_n69ArtDsc ;
   private String[] P0AOG4_A279CliNom ;
   private String[] P0AOG5_A396EmprCod ;
   private String[] P0AOG5_A4058CCFColNom ;
   private int[] P0AOG5_A4059CCFColNum ;
   private String[] P0AOG5_A69ArtDsc ;
   private boolean[] P0AOG5_n69ArtDsc ;
   private String[] P0AOG5_A65ArtCod ;
   private String[] P0AOG5_A279CliNom ;
   private int[] P0AOG5_A252CliCod ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class controlcalidad_ccseriwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AOG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                          int AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod ,
                                          int AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to ,
                                          String AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                          String AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                          String AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                          String AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                          String AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                          String AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                          String AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                          int AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum ,
                                          int AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.CCFColNum, T1.CCFColNom, T3.ArtDsc, T1.ArtCod, T1.CliCod FROM ((TXPCCSeri T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCFColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCFColNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCFColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCFColNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) )
      {
         addWhere(sWhereString, "(T1.CCFColNum >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) )
      {
         addWhere(sWhereString, "(T1.CCFColNum <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AOG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                          int AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod ,
                                          int AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to ,
                                          String AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                          String AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                          String AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                          String AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                          String AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                          String AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                          String AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                          int AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum ,
                                          int AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtCod, T1.CCFColNum, T1.CCFColNom, T3.ArtDsc, T2.CliNom, T1.CliCod FROM ((TXPCCSeri T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCFColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCFColNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCFColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCFColNom = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) )
      {
         addWhere(sWhereString, "(T1.CCFColNum >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) )
      {
         addWhere(sWhereString, "(T1.CCFColNum <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AOG4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                          int AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod ,
                                          int AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to ,
                                          String AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                          String AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                          String AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                          String AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                          String AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                          String AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                          String AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                          int AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum ,
                                          int AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T1.CCFColNum, T1.CCFColNom, T3.ArtDsc, T2.CliNom FROM ((TXPCCSeri T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCFColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCFColNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCFColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCFColNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) )
      {
         addWhere(sWhereString, "(T1.CCFColNum >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) )
      {
         addWhere(sWhereString, "(T1.CCFColNum <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AOG5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                          int AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod ,
                                          int AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to ,
                                          String AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                          String AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                          String AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                          String AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                          String AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                          String AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                          String AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                          String AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                          int AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum ,
                                          int AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCFColNom, T1.CCFColNum, T3.ArtDsc, T1.ArtCod, T2.CliNom, T1.CliCod FROM ((TXPCCSeri T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCFColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCFColNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV46Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV47Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCFColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCFColNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV56Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) )
      {
         addWhere(sWhereString, "(T1.CCFColNum >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV57Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) )
      {
         addWhere(sWhereString, "(T1.CCFColNum <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCFColNom" ;
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
                  return conditional_P0AOG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() );
            case 1 :
                  return conditional_P0AOG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() );
            case 2 :
                  return conditional_P0AOG4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() );
            case 3 :
                  return conditional_P0AOG5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOG4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOG5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
      }
   }

}

