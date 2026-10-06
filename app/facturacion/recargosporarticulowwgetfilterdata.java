package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recargosporarticulowwgetfilterdata extends GXProcedure
{
   public recargosporarticulowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recargosporarticulowwgetfilterdata.class ), "" );
   }

   public recargosporarticulowwgetfilterdata( int remoteHandle ,
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
      recargosporarticulowwgetfilterdata.this.aP5 = new String[] {""};
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
      recargosporarticulowwgetfilterdata.this.AV36DDOName = aP0;
      recargosporarticulowwgetfilterdata.this.AV37SearchTxt = aP1;
      recargosporarticulowwgetfilterdata.this.AV38SearchTxtTo = aP2;
      recargosporarticulowwgetfilterdata.this.aP3 = aP3;
      recargosporarticulowwgetfilterdata.this.aP4 = aP4;
      recargosporarticulowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_ARTCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("Facturacion.RecargosporArticuloWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.RecargosporArticuloWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("Facturacion.RecargosporArticuloWWGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV14TFArtCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV15TFArtCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV18TFArtDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV19TFArtDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV20TFEmprNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV21TFEmprNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFULINREC") == 0 )
         {
            AV22TFULinRec = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFULinRec_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV37SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV47Facturacion_recargosporarticulowwds_1_filterfulltext = AV42FilterFullText ;
      AV48Facturacion_recargosporarticulowwds_2_tfemprcod = AV10TFEmprCod ;
      AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV50Facturacion_recargosporarticulowwds_4_tfclicod = AV12TFCliCod ;
      AV51Facturacion_recargosporarticulowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV52Facturacion_recargosporarticulowwds_6_tfartcod = AV14TFArtCod ;
      AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV54Facturacion_recargosporarticulowwds_8_tfclinom = AV16TFCliNom ;
      AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Facturacion_recargosporarticulowwds_10_tfartdsc = AV18TFArtDsc ;
      AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel = AV19TFArtDsc_Sel ;
      AV58Facturacion_recargosporarticulowwds_12_tfemprnom = AV20TFEmprNom ;
      AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel = AV21TFEmprNom_Sel ;
      AV60Facturacion_recargosporarticulowwds_14_tfulinrec = AV22TFULinRec ;
      AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to = AV23TFULinRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                           AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                           AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                           Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod) ,
                                           Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) ,
                                           AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                           AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                           AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                           AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                           AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                           AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                           AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                           AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                           Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec) ,
                                           Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A279CliNom ,
                                           A69ArtDsc ,
                                           A407EmprNom ,
                                           Byte.valueOf(A845ULinRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV48Facturacion_recargosporarticulowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV48Facturacion_recargosporarticulowwds_2_tfemprcod), 3, "%") ;
      lV52Facturacion_recargosporarticulowwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV52Facturacion_recargosporarticulowwds_6_tfartcod), 16, "%") ;
      lV54Facturacion_recargosporarticulowwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV54Facturacion_recargosporarticulowwds_8_tfclinom), 30, "%") ;
      lV56Facturacion_recargosporarticulowwds_10_tfartdsc = GXutil.padr( GXutil.rtrim( AV56Facturacion_recargosporarticulowwds_10_tfartdsc), 26, "%") ;
      lV58Facturacion_recargosporarticulowwds_12_tfemprnom = GXutil.padr( GXutil.rtrim( AV58Facturacion_recargosporarticulowwds_12_tfemprnom), 30, "%") ;
      /* Using cursor P0ALT2 */
      pr_default.execute(0, new Object[] {lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV48Facturacion_recargosporarticulowwds_2_tfemprcod, AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel, Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod), Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to), lV52Facturacion_recargosporarticulowwds_6_tfartcod, AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel, lV54Facturacion_recargosporarticulowwds_8_tfclinom, AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel, lV56Facturacion_recargosporarticulowwds_10_tfartdsc, AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel, lV58Facturacion_recargosporarticulowwds_12_tfemprnom, AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel, Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec), Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkALT2 = false ;
         A396EmprCod = P0ALT2_A396EmprCod[0] ;
         A845ULinRec = P0ALT2_A845ULinRec[0] ;
         n845ULinRec = P0ALT2_n845ULinRec[0] ;
         A407EmprNom = P0ALT2_A407EmprNom[0] ;
         n407EmprNom = P0ALT2_n407EmprNom[0] ;
         A69ArtDsc = P0ALT2_A69ArtDsc[0] ;
         n69ArtDsc = P0ALT2_n69ArtDsc[0] ;
         A279CliNom = P0ALT2_A279CliNom[0] ;
         A65ArtCod = P0ALT2_A65ArtCod[0] ;
         A252CliCod = P0ALT2_A252CliCod[0] ;
         A407EmprNom = P0ALT2_A407EmprNom[0] ;
         n407EmprNom = P0ALT2_n407EmprNom[0] ;
         A279CliNom = P0ALT2_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ALT2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brkALT2 = false ;
            A65ArtCod = P0ALT2_A65ArtCod[0] ;
            A252CliCod = P0ALT2_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkALT2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV25Option = A396EmprCod ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALT2 )
         {
            brkALT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtCod = AV37SearchTxt ;
      AV15TFArtCod_Sel = "" ;
      AV47Facturacion_recargosporarticulowwds_1_filterfulltext = AV42FilterFullText ;
      AV48Facturacion_recargosporarticulowwds_2_tfemprcod = AV10TFEmprCod ;
      AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV50Facturacion_recargosporarticulowwds_4_tfclicod = AV12TFCliCod ;
      AV51Facturacion_recargosporarticulowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV52Facturacion_recargosporarticulowwds_6_tfartcod = AV14TFArtCod ;
      AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV54Facturacion_recargosporarticulowwds_8_tfclinom = AV16TFCliNom ;
      AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Facturacion_recargosporarticulowwds_10_tfartdsc = AV18TFArtDsc ;
      AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel = AV19TFArtDsc_Sel ;
      AV58Facturacion_recargosporarticulowwds_12_tfemprnom = AV20TFEmprNom ;
      AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel = AV21TFEmprNom_Sel ;
      AV60Facturacion_recargosporarticulowwds_14_tfulinrec = AV22TFULinRec ;
      AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to = AV23TFULinRec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                           AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                           AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                           Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod) ,
                                           Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) ,
                                           AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                           AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                           AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                           AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                           AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                           AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                           AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                           AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                           Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec) ,
                                           Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A279CliNom ,
                                           A69ArtDsc ,
                                           A407EmprNom ,
                                           Byte.valueOf(A845ULinRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV48Facturacion_recargosporarticulowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV48Facturacion_recargosporarticulowwds_2_tfemprcod), 3, "%") ;
      lV52Facturacion_recargosporarticulowwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV52Facturacion_recargosporarticulowwds_6_tfartcod), 16, "%") ;
      lV54Facturacion_recargosporarticulowwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV54Facturacion_recargosporarticulowwds_8_tfclinom), 30, "%") ;
      lV56Facturacion_recargosporarticulowwds_10_tfartdsc = GXutil.padr( GXutil.rtrim( AV56Facturacion_recargosporarticulowwds_10_tfartdsc), 26, "%") ;
      lV58Facturacion_recargosporarticulowwds_12_tfemprnom = GXutil.padr( GXutil.rtrim( AV58Facturacion_recargosporarticulowwds_12_tfemprnom), 30, "%") ;
      /* Using cursor P0ALT3 */
      pr_default.execute(1, new Object[] {lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV48Facturacion_recargosporarticulowwds_2_tfemprcod, AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel, Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod), Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to), lV52Facturacion_recargosporarticulowwds_6_tfartcod, AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel, lV54Facturacion_recargosporarticulowwds_8_tfclinom, AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel, lV56Facturacion_recargosporarticulowwds_10_tfartdsc, AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel, lV58Facturacion_recargosporarticulowwds_12_tfemprnom, AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel, Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec), Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkALT4 = false ;
         A65ArtCod = P0ALT3_A65ArtCod[0] ;
         A845ULinRec = P0ALT3_A845ULinRec[0] ;
         n845ULinRec = P0ALT3_n845ULinRec[0] ;
         A407EmprNom = P0ALT3_A407EmprNom[0] ;
         n407EmprNom = P0ALT3_n407EmprNom[0] ;
         A69ArtDsc = P0ALT3_A69ArtDsc[0] ;
         n69ArtDsc = P0ALT3_n69ArtDsc[0] ;
         A279CliNom = P0ALT3_A279CliNom[0] ;
         A252CliCod = P0ALT3_A252CliCod[0] ;
         A396EmprCod = P0ALT3_A396EmprCod[0] ;
         A407EmprNom = P0ALT3_A407EmprNom[0] ;
         n407EmprNom = P0ALT3_n407EmprNom[0] ;
         A279CliNom = P0ALT3_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ALT3_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brkALT4 = false ;
            A252CliCod = P0ALT3_A252CliCod[0] ;
            A396EmprCod = P0ALT3_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkALT4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV25Option = A65ArtCod ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALT4 )
         {
            brkALT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV37SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV47Facturacion_recargosporarticulowwds_1_filterfulltext = AV42FilterFullText ;
      AV48Facturacion_recargosporarticulowwds_2_tfemprcod = AV10TFEmprCod ;
      AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV50Facturacion_recargosporarticulowwds_4_tfclicod = AV12TFCliCod ;
      AV51Facturacion_recargosporarticulowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV52Facturacion_recargosporarticulowwds_6_tfartcod = AV14TFArtCod ;
      AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV54Facturacion_recargosporarticulowwds_8_tfclinom = AV16TFCliNom ;
      AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Facturacion_recargosporarticulowwds_10_tfartdsc = AV18TFArtDsc ;
      AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel = AV19TFArtDsc_Sel ;
      AV58Facturacion_recargosporarticulowwds_12_tfemprnom = AV20TFEmprNom ;
      AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel = AV21TFEmprNom_Sel ;
      AV60Facturacion_recargosporarticulowwds_14_tfulinrec = AV22TFULinRec ;
      AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to = AV23TFULinRec_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                           AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                           AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                           Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod) ,
                                           Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) ,
                                           AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                           AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                           AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                           AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                           AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                           AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                           AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                           AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                           Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec) ,
                                           Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A279CliNom ,
                                           A69ArtDsc ,
                                           A407EmprNom ,
                                           Byte.valueOf(A845ULinRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV48Facturacion_recargosporarticulowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV48Facturacion_recargosporarticulowwds_2_tfemprcod), 3, "%") ;
      lV52Facturacion_recargosporarticulowwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV52Facturacion_recargosporarticulowwds_6_tfartcod), 16, "%") ;
      lV54Facturacion_recargosporarticulowwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV54Facturacion_recargosporarticulowwds_8_tfclinom), 30, "%") ;
      lV56Facturacion_recargosporarticulowwds_10_tfartdsc = GXutil.padr( GXutil.rtrim( AV56Facturacion_recargosporarticulowwds_10_tfartdsc), 26, "%") ;
      lV58Facturacion_recargosporarticulowwds_12_tfemprnom = GXutil.padr( GXutil.rtrim( AV58Facturacion_recargosporarticulowwds_12_tfemprnom), 30, "%") ;
      /* Using cursor P0ALT4 */
      pr_default.execute(2, new Object[] {lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV48Facturacion_recargosporarticulowwds_2_tfemprcod, AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel, Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod), Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to), lV52Facturacion_recargosporarticulowwds_6_tfartcod, AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel, lV54Facturacion_recargosporarticulowwds_8_tfclinom, AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel, lV56Facturacion_recargosporarticulowwds_10_tfartdsc, AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel, lV58Facturacion_recargosporarticulowwds_12_tfemprnom, AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel, Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec), Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkALT6 = false ;
         A279CliNom = P0ALT4_A279CliNom[0] ;
         A845ULinRec = P0ALT4_A845ULinRec[0] ;
         n845ULinRec = P0ALT4_n845ULinRec[0] ;
         A407EmprNom = P0ALT4_A407EmprNom[0] ;
         n407EmprNom = P0ALT4_n407EmprNom[0] ;
         A69ArtDsc = P0ALT4_A69ArtDsc[0] ;
         n69ArtDsc = P0ALT4_n69ArtDsc[0] ;
         A65ArtCod = P0ALT4_A65ArtCod[0] ;
         A252CliCod = P0ALT4_A252CliCod[0] ;
         A396EmprCod = P0ALT4_A396EmprCod[0] ;
         A407EmprNom = P0ALT4_A407EmprNom[0] ;
         n407EmprNom = P0ALT4_n407EmprNom[0] ;
         A279CliNom = P0ALT4_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ALT4_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkALT6 = false ;
            A65ArtCod = P0ALT4_A65ArtCod[0] ;
            A252CliCod = P0ALT4_A252CliCod[0] ;
            A396EmprCod = P0ALT4_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkALT6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV25Option = A279CliNom ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALT6 )
         {
            brkALT6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFArtDsc = AV37SearchTxt ;
      AV19TFArtDsc_Sel = "" ;
      AV47Facturacion_recargosporarticulowwds_1_filterfulltext = AV42FilterFullText ;
      AV48Facturacion_recargosporarticulowwds_2_tfemprcod = AV10TFEmprCod ;
      AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV50Facturacion_recargosporarticulowwds_4_tfclicod = AV12TFCliCod ;
      AV51Facturacion_recargosporarticulowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV52Facturacion_recargosporarticulowwds_6_tfartcod = AV14TFArtCod ;
      AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV54Facturacion_recargosporarticulowwds_8_tfclinom = AV16TFCliNom ;
      AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Facturacion_recargosporarticulowwds_10_tfartdsc = AV18TFArtDsc ;
      AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel = AV19TFArtDsc_Sel ;
      AV58Facturacion_recargosporarticulowwds_12_tfemprnom = AV20TFEmprNom ;
      AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel = AV21TFEmprNom_Sel ;
      AV60Facturacion_recargosporarticulowwds_14_tfulinrec = AV22TFULinRec ;
      AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to = AV23TFULinRec_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                           AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                           AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                           Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod) ,
                                           Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) ,
                                           AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                           AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                           AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                           AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                           AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                           AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                           AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                           AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                           Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec) ,
                                           Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A279CliNom ,
                                           A69ArtDsc ,
                                           A407EmprNom ,
                                           Byte.valueOf(A845ULinRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV48Facturacion_recargosporarticulowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV48Facturacion_recargosporarticulowwds_2_tfemprcod), 3, "%") ;
      lV52Facturacion_recargosporarticulowwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV52Facturacion_recargosporarticulowwds_6_tfartcod), 16, "%") ;
      lV54Facturacion_recargosporarticulowwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV54Facturacion_recargosporarticulowwds_8_tfclinom), 30, "%") ;
      lV56Facturacion_recargosporarticulowwds_10_tfartdsc = GXutil.padr( GXutil.rtrim( AV56Facturacion_recargosporarticulowwds_10_tfartdsc), 26, "%") ;
      lV58Facturacion_recargosporarticulowwds_12_tfemprnom = GXutil.padr( GXutil.rtrim( AV58Facturacion_recargosporarticulowwds_12_tfemprnom), 30, "%") ;
      /* Using cursor P0ALT5 */
      pr_default.execute(3, new Object[] {lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV48Facturacion_recargosporarticulowwds_2_tfemprcod, AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel, Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod), Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to), lV52Facturacion_recargosporarticulowwds_6_tfartcod, AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel, lV54Facturacion_recargosporarticulowwds_8_tfclinom, AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel, lV56Facturacion_recargosporarticulowwds_10_tfartdsc, AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel, lV58Facturacion_recargosporarticulowwds_12_tfemprnom, AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel, Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec), Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkALT8 = false ;
         A69ArtDsc = P0ALT5_A69ArtDsc[0] ;
         n69ArtDsc = P0ALT5_n69ArtDsc[0] ;
         A845ULinRec = P0ALT5_A845ULinRec[0] ;
         n845ULinRec = P0ALT5_n845ULinRec[0] ;
         A407EmprNom = P0ALT5_A407EmprNom[0] ;
         n407EmprNom = P0ALT5_n407EmprNom[0] ;
         A279CliNom = P0ALT5_A279CliNom[0] ;
         A65ArtCod = P0ALT5_A65ArtCod[0] ;
         A252CliCod = P0ALT5_A252CliCod[0] ;
         A396EmprCod = P0ALT5_A396EmprCod[0] ;
         A407EmprNom = P0ALT5_A407EmprNom[0] ;
         n407EmprNom = P0ALT5_n407EmprNom[0] ;
         A279CliNom = P0ALT5_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0ALT5_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brkALT8 = false ;
            A65ArtCod = P0ALT5_A65ArtCod[0] ;
            A252CliCod = P0ALT5_A252CliCod[0] ;
            A396EmprCod = P0ALT5_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkALT8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV25Option = A69ArtDsc ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALT8 )
         {
            brkALT8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFEmprNom = AV37SearchTxt ;
      AV21TFEmprNom_Sel = "" ;
      AV47Facturacion_recargosporarticulowwds_1_filterfulltext = AV42FilterFullText ;
      AV48Facturacion_recargosporarticulowwds_2_tfemprcod = AV10TFEmprCod ;
      AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV50Facturacion_recargosporarticulowwds_4_tfclicod = AV12TFCliCod ;
      AV51Facturacion_recargosporarticulowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV52Facturacion_recargosporarticulowwds_6_tfartcod = AV14TFArtCod ;
      AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV54Facturacion_recargosporarticulowwds_8_tfclinom = AV16TFCliNom ;
      AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV56Facturacion_recargosporarticulowwds_10_tfartdsc = AV18TFArtDsc ;
      AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel = AV19TFArtDsc_Sel ;
      AV58Facturacion_recargosporarticulowwds_12_tfemprnom = AV20TFEmprNom ;
      AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel = AV21TFEmprNom_Sel ;
      AV60Facturacion_recargosporarticulowwds_14_tfulinrec = AV22TFULinRec ;
      AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to = AV23TFULinRec_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                           AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                           AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                           Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod) ,
                                           Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) ,
                                           AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                           AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                           AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                           AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                           AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                           AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                           AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                           AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                           Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec) ,
                                           Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A279CliNom ,
                                           A69ArtDsc ,
                                           A407EmprNom ,
                                           Byte.valueOf(A845ULinRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV48Facturacion_recargosporarticulowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV48Facturacion_recargosporarticulowwds_2_tfemprcod), 3, "%") ;
      lV52Facturacion_recargosporarticulowwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV52Facturacion_recargosporarticulowwds_6_tfartcod), 16, "%") ;
      lV54Facturacion_recargosporarticulowwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV54Facturacion_recargosporarticulowwds_8_tfclinom), 30, "%") ;
      lV56Facturacion_recargosporarticulowwds_10_tfartdsc = GXutil.padr( GXutil.rtrim( AV56Facturacion_recargosporarticulowwds_10_tfartdsc), 26, "%") ;
      lV58Facturacion_recargosporarticulowwds_12_tfemprnom = GXutil.padr( GXutil.rtrim( AV58Facturacion_recargosporarticulowwds_12_tfemprnom), 30, "%") ;
      /* Using cursor P0ALT6 */
      pr_default.execute(4, new Object[] {lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV47Facturacion_recargosporarticulowwds_1_filterfulltext, lV48Facturacion_recargosporarticulowwds_2_tfemprcod, AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel, Integer.valueOf(AV50Facturacion_recargosporarticulowwds_4_tfclicod), Integer.valueOf(AV51Facturacion_recargosporarticulowwds_5_tfclicod_to), lV52Facturacion_recargosporarticulowwds_6_tfartcod, AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel, lV54Facturacion_recargosporarticulowwds_8_tfclinom, AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel, lV56Facturacion_recargosporarticulowwds_10_tfartdsc, AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel, lV58Facturacion_recargosporarticulowwds_12_tfemprnom, AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel, Byte.valueOf(AV60Facturacion_recargosporarticulowwds_14_tfulinrec), Byte.valueOf(AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkALT10 = false ;
         A407EmprNom = P0ALT6_A407EmprNom[0] ;
         n407EmprNom = P0ALT6_n407EmprNom[0] ;
         A845ULinRec = P0ALT6_A845ULinRec[0] ;
         n845ULinRec = P0ALT6_n845ULinRec[0] ;
         A69ArtDsc = P0ALT6_A69ArtDsc[0] ;
         n69ArtDsc = P0ALT6_n69ArtDsc[0] ;
         A279CliNom = P0ALT6_A279CliNom[0] ;
         A65ArtCod = P0ALT6_A65ArtCod[0] ;
         A252CliCod = P0ALT6_A252CliCod[0] ;
         A396EmprCod = P0ALT6_A396EmprCod[0] ;
         A407EmprNom = P0ALT6_A407EmprNom[0] ;
         n407EmprNom = P0ALT6_n407EmprNom[0] ;
         A279CliNom = P0ALT6_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0ALT6_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brkALT10 = false ;
            A65ArtCod = P0ALT6_A65ArtCod[0] ;
            A252CliCod = P0ALT6_A252CliCod[0] ;
            A396EmprCod = P0ALT6_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkALT10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV25Option = A407EmprNom ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALT10 )
         {
            brkALT10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recargosporarticulowwgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = recargosporarticulowwgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = recargosporarticulowwgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV14TFArtCod = "" ;
      AV15TFArtCod_Sel = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFArtDsc = "" ;
      AV19TFArtDsc_Sel = "" ;
      AV20TFEmprNom = "" ;
      AV21TFEmprNom_Sel = "" ;
      A396EmprCod = "" ;
      AV47Facturacion_recargosporarticulowwds_1_filterfulltext = "" ;
      AV48Facturacion_recargosporarticulowwds_2_tfemprcod = "" ;
      AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel = "" ;
      AV52Facturacion_recargosporarticulowwds_6_tfartcod = "" ;
      AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel = "" ;
      AV54Facturacion_recargosporarticulowwds_8_tfclinom = "" ;
      AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel = "" ;
      AV56Facturacion_recargosporarticulowwds_10_tfartdsc = "" ;
      AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel = "" ;
      AV58Facturacion_recargosporarticulowwds_12_tfemprnom = "" ;
      AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel = "" ;
      scmdbuf = "" ;
      lV47Facturacion_recargosporarticulowwds_1_filterfulltext = "" ;
      lV48Facturacion_recargosporarticulowwds_2_tfemprcod = "" ;
      lV52Facturacion_recargosporarticulowwds_6_tfartcod = "" ;
      lV54Facturacion_recargosporarticulowwds_8_tfclinom = "" ;
      lV56Facturacion_recargosporarticulowwds_10_tfartdsc = "" ;
      lV58Facturacion_recargosporarticulowwds_12_tfemprnom = "" ;
      A65ArtCod = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A407EmprNom = "" ;
      P0ALT2_A396EmprCod = new String[] {""} ;
      P0ALT2_A845ULinRec = new byte[1] ;
      P0ALT2_n845ULinRec = new boolean[] {false} ;
      P0ALT2_A407EmprNom = new String[] {""} ;
      P0ALT2_n407EmprNom = new boolean[] {false} ;
      P0ALT2_A69ArtDsc = new String[] {""} ;
      P0ALT2_n69ArtDsc = new boolean[] {false} ;
      P0ALT2_A279CliNom = new String[] {""} ;
      P0ALT2_A65ArtCod = new String[] {""} ;
      P0ALT2_A252CliCod = new int[1] ;
      AV25Option = "" ;
      AV27OptionDesc = "" ;
      P0ALT3_A65ArtCod = new String[] {""} ;
      P0ALT3_A845ULinRec = new byte[1] ;
      P0ALT3_n845ULinRec = new boolean[] {false} ;
      P0ALT3_A407EmprNom = new String[] {""} ;
      P0ALT3_n407EmprNom = new boolean[] {false} ;
      P0ALT3_A69ArtDsc = new String[] {""} ;
      P0ALT3_n69ArtDsc = new boolean[] {false} ;
      P0ALT3_A279CliNom = new String[] {""} ;
      P0ALT3_A252CliCod = new int[1] ;
      P0ALT3_A396EmprCod = new String[] {""} ;
      P0ALT4_A279CliNom = new String[] {""} ;
      P0ALT4_A845ULinRec = new byte[1] ;
      P0ALT4_n845ULinRec = new boolean[] {false} ;
      P0ALT4_A407EmprNom = new String[] {""} ;
      P0ALT4_n407EmprNom = new boolean[] {false} ;
      P0ALT4_A69ArtDsc = new String[] {""} ;
      P0ALT4_n69ArtDsc = new boolean[] {false} ;
      P0ALT4_A65ArtCod = new String[] {""} ;
      P0ALT4_A252CliCod = new int[1] ;
      P0ALT4_A396EmprCod = new String[] {""} ;
      P0ALT5_A69ArtDsc = new String[] {""} ;
      P0ALT5_n69ArtDsc = new boolean[] {false} ;
      P0ALT5_A845ULinRec = new byte[1] ;
      P0ALT5_n845ULinRec = new boolean[] {false} ;
      P0ALT5_A407EmprNom = new String[] {""} ;
      P0ALT5_n407EmprNom = new boolean[] {false} ;
      P0ALT5_A279CliNom = new String[] {""} ;
      P0ALT5_A65ArtCod = new String[] {""} ;
      P0ALT5_A252CliCod = new int[1] ;
      P0ALT5_A396EmprCod = new String[] {""} ;
      P0ALT6_A407EmprNom = new String[] {""} ;
      P0ALT6_n407EmprNom = new boolean[] {false} ;
      P0ALT6_A845ULinRec = new byte[1] ;
      P0ALT6_n845ULinRec = new boolean[] {false} ;
      P0ALT6_A69ArtDsc = new String[] {""} ;
      P0ALT6_n69ArtDsc = new boolean[] {false} ;
      P0ALT6_A279CliNom = new String[] {""} ;
      P0ALT6_A65ArtCod = new String[] {""} ;
      P0ALT6_A252CliCod = new int[1] ;
      P0ALT6_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.recargosporarticulowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ALT2_A396EmprCod, P0ALT2_A845ULinRec, P0ALT2_n845ULinRec, P0ALT2_A407EmprNom, P0ALT2_n407EmprNom, P0ALT2_A69ArtDsc, P0ALT2_n69ArtDsc, P0ALT2_A279CliNom, P0ALT2_A65ArtCod, P0ALT2_A252CliCod
            }
            , new Object[] {
            P0ALT3_A65ArtCod, P0ALT3_A845ULinRec, P0ALT3_n845ULinRec, P0ALT3_A407EmprNom, P0ALT3_n407EmprNom, P0ALT3_A69ArtDsc, P0ALT3_n69ArtDsc, P0ALT3_A279CliNom, P0ALT3_A252CliCod, P0ALT3_A396EmprCod
            }
            , new Object[] {
            P0ALT4_A279CliNom, P0ALT4_A845ULinRec, P0ALT4_n845ULinRec, P0ALT4_A407EmprNom, P0ALT4_n407EmprNom, P0ALT4_A69ArtDsc, P0ALT4_n69ArtDsc, P0ALT4_A65ArtCod, P0ALT4_A252CliCod, P0ALT4_A396EmprCod
            }
            , new Object[] {
            P0ALT5_A69ArtDsc, P0ALT5_n69ArtDsc, P0ALT5_A845ULinRec, P0ALT5_n845ULinRec, P0ALT5_A407EmprNom, P0ALT5_n407EmprNom, P0ALT5_A279CliNom, P0ALT5_A65ArtCod, P0ALT5_A252CliCod, P0ALT5_A396EmprCod
            }
            , new Object[] {
            P0ALT6_A407EmprNom, P0ALT6_n407EmprNom, P0ALT6_A845ULinRec, P0ALT6_n845ULinRec, P0ALT6_A69ArtDsc, P0ALT6_n69ArtDsc, P0ALT6_A279CliNom, P0ALT6_A65ArtCod, P0ALT6_A252CliCod, P0ALT6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFULinRec ;
   private byte AV23TFULinRec_To ;
   private byte AV60Facturacion_recargosporarticulowwds_14_tfulinrec ;
   private byte AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to ;
   private byte A845ULinRec ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV50Facturacion_recargosporarticulowwds_4_tfclicod ;
   private int AV51Facturacion_recargosporarticulowwds_5_tfclicod_to ;
   private int A252CliCod ;
   private long AV30count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV14TFArtCod ;
   private String AV15TFArtCod_Sel ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFArtDsc ;
   private String AV19TFArtDsc_Sel ;
   private String AV20TFEmprNom ;
   private String AV21TFEmprNom_Sel ;
   private String A396EmprCod ;
   private String AV48Facturacion_recargosporarticulowwds_2_tfemprcod ;
   private String AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ;
   private String AV52Facturacion_recargosporarticulowwds_6_tfartcod ;
   private String AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ;
   private String AV54Facturacion_recargosporarticulowwds_8_tfclinom ;
   private String AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ;
   private String AV56Facturacion_recargosporarticulowwds_10_tfartdsc ;
   private String AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ;
   private String AV58Facturacion_recargosporarticulowwds_12_tfemprnom ;
   private String AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV48Facturacion_recargosporarticulowwds_2_tfemprcod ;
   private String lV52Facturacion_recargosporarticulowwds_6_tfartcod ;
   private String lV54Facturacion_recargosporarticulowwds_8_tfclinom ;
   private String lV56Facturacion_recargosporarticulowwds_10_tfartdsc ;
   private String lV58Facturacion_recargosporarticulowwds_12_tfemprnom ;
   private String A65ArtCod ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String A407EmprNom ;
   private boolean returnInSub ;
   private boolean brkALT2 ;
   private boolean n845ULinRec ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean brkALT4 ;
   private boolean brkALT6 ;
   private boolean brkALT8 ;
   private boolean brkALT10 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV47Facturacion_recargosporarticulowwds_1_filterfulltext ;
   private String lV47Facturacion_recargosporarticulowwds_1_filterfulltext ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALT2_A396EmprCod ;
   private byte[] P0ALT2_A845ULinRec ;
   private boolean[] P0ALT2_n845ULinRec ;
   private String[] P0ALT2_A407EmprNom ;
   private boolean[] P0ALT2_n407EmprNom ;
   private String[] P0ALT2_A69ArtDsc ;
   private boolean[] P0ALT2_n69ArtDsc ;
   private String[] P0ALT2_A279CliNom ;
   private String[] P0ALT2_A65ArtCod ;
   private int[] P0ALT2_A252CliCod ;
   private String[] P0ALT3_A65ArtCod ;
   private byte[] P0ALT3_A845ULinRec ;
   private boolean[] P0ALT3_n845ULinRec ;
   private String[] P0ALT3_A407EmprNom ;
   private boolean[] P0ALT3_n407EmprNom ;
   private String[] P0ALT3_A69ArtDsc ;
   private boolean[] P0ALT3_n69ArtDsc ;
   private String[] P0ALT3_A279CliNom ;
   private int[] P0ALT3_A252CliCod ;
   private String[] P0ALT3_A396EmprCod ;
   private String[] P0ALT4_A279CliNom ;
   private byte[] P0ALT4_A845ULinRec ;
   private boolean[] P0ALT4_n845ULinRec ;
   private String[] P0ALT4_A407EmprNom ;
   private boolean[] P0ALT4_n407EmprNom ;
   private String[] P0ALT4_A69ArtDsc ;
   private boolean[] P0ALT4_n69ArtDsc ;
   private String[] P0ALT4_A65ArtCod ;
   private int[] P0ALT4_A252CliCod ;
   private String[] P0ALT4_A396EmprCod ;
   private String[] P0ALT5_A69ArtDsc ;
   private boolean[] P0ALT5_n69ArtDsc ;
   private byte[] P0ALT5_A845ULinRec ;
   private boolean[] P0ALT5_n845ULinRec ;
   private String[] P0ALT5_A407EmprNom ;
   private boolean[] P0ALT5_n407EmprNom ;
   private String[] P0ALT5_A279CliNom ;
   private String[] P0ALT5_A65ArtCod ;
   private int[] P0ALT5_A252CliCod ;
   private String[] P0ALT5_A396EmprCod ;
   private String[] P0ALT6_A407EmprNom ;
   private boolean[] P0ALT6_n407EmprNom ;
   private byte[] P0ALT6_A845ULinRec ;
   private boolean[] P0ALT6_n845ULinRec ;
   private String[] P0ALT6_A69ArtDsc ;
   private boolean[] P0ALT6_n69ArtDsc ;
   private String[] P0ALT6_A279CliNom ;
   private String[] P0ALT6_A65ArtCod ;
   private int[] P0ALT6_A252CliCod ;
   private String[] P0ALT6_A396EmprCod ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class recargosporarticulowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ALT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                          String AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                          String AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                          int AV50Facturacion_recargosporarticulowwds_4_tfclicod ,
                                          int AV51Facturacion_recargosporarticulowwds_5_tfclicod_to ,
                                          String AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                          String AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                          String AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                          String AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                          String AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                          String AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                          String AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                          String AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                          byte AV60Facturacion_recargosporarticulowwds_14_tfulinrec ,
                                          byte AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A279CliNom ,
                                          String A69ArtDsc ,
                                          String A407EmprNom ,
                                          byte A845ULinRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ULinRec, T2.EmprNom, T1.ArtDsc, T3.CliNom, T1.ArtCod, T1.CliCod FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV47Facturacion_recargosporarticulowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ULinRec,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_recargosporarticulowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV50Facturacion_recargosporarticulowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_recargosporarticulowwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_recargosporarticulowwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_recargosporarticulowwds_10_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_recargosporarticulowwds_12_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Facturacion_recargosporarticulowwds_14_tfulinrec) )
      {
         addWhere(sWhereString, "(T1.ULinRec >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) )
      {
         addWhere(sWhereString, "(T1.ULinRec <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ALT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                          String AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                          String AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                          int AV50Facturacion_recargosporarticulowwds_4_tfclicod ,
                                          int AV51Facturacion_recargosporarticulowwds_5_tfclicod_to ,
                                          String AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                          String AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                          String AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                          String AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                          String AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                          String AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                          String AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                          String AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                          byte AV60Facturacion_recargosporarticulowwds_14_tfulinrec ,
                                          byte AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A279CliNom ,
                                          String A69ArtDsc ,
                                          String A407EmprNom ,
                                          byte A845ULinRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[21];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ArtCod, T1.ULinRec, T2.EmprNom, T1.ArtDsc, T3.CliNom, T1.CliCod, T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV47Facturacion_recargosporarticulowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ULinRec,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_recargosporarticulowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV50Facturacion_recargosporarticulowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_recargosporarticulowwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_recargosporarticulowwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_recargosporarticulowwds_10_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_recargosporarticulowwds_12_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Facturacion_recargosporarticulowwds_14_tfulinrec) )
      {
         addWhere(sWhereString, "(T1.ULinRec >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) )
      {
         addWhere(sWhereString, "(T1.ULinRec <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ALT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                          String AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                          String AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                          int AV50Facturacion_recargosporarticulowwds_4_tfclicod ,
                                          int AV51Facturacion_recargosporarticulowwds_5_tfclicod_to ,
                                          String AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                          String AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                          String AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                          String AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                          String AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                          String AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                          String AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                          String AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                          byte AV60Facturacion_recargosporarticulowwds_14_tfulinrec ,
                                          byte AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A279CliNom ,
                                          String A69ArtDsc ,
                                          String A407EmprNom ,
                                          byte A845ULinRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.CliNom, T1.ULinRec, T2.EmprNom, T1.ArtDsc, T1.ArtCod, T1.CliCod, T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV47Facturacion_recargosporarticulowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ULinRec,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_recargosporarticulowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV50Facturacion_recargosporarticulowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_recargosporarticulowwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_recargosporarticulowwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_recargosporarticulowwds_10_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_recargosporarticulowwds_12_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Facturacion_recargosporarticulowwds_14_tfulinrec) )
      {
         addWhere(sWhereString, "(T1.ULinRec >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) )
      {
         addWhere(sWhereString, "(T1.ULinRec <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0ALT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                          String AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                          String AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                          int AV50Facturacion_recargosporarticulowwds_4_tfclicod ,
                                          int AV51Facturacion_recargosporarticulowwds_5_tfclicod_to ,
                                          String AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                          String AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                          String AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                          String AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                          String AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                          String AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                          String AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                          String AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                          byte AV60Facturacion_recargosporarticulowwds_14_tfulinrec ,
                                          byte AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A279CliNom ,
                                          String A69ArtDsc ,
                                          String A407EmprNom ,
                                          byte A845ULinRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[21];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ArtDsc, T1.ULinRec, T2.EmprNom, T3.CliNom, T1.ArtCod, T1.CliCod, T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV47Facturacion_recargosporarticulowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ULinRec,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_recargosporarticulowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV50Facturacion_recargosporarticulowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_recargosporarticulowwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_recargosporarticulowwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_recargosporarticulowwds_10_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_recargosporarticulowwds_12_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Facturacion_recargosporarticulowwds_14_tfulinrec) )
      {
         addWhere(sWhereString, "(T1.ULinRec >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) )
      {
         addWhere(sWhereString, "(T1.ULinRec <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0ALT6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                          String AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                          String AV48Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                          int AV50Facturacion_recargosporarticulowwds_4_tfclicod ,
                                          int AV51Facturacion_recargosporarticulowwds_5_tfclicod_to ,
                                          String AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                          String AV52Facturacion_recargosporarticulowwds_6_tfartcod ,
                                          String AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                          String AV54Facturacion_recargosporarticulowwds_8_tfclinom ,
                                          String AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                          String AV56Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                          String AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                          String AV58Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                          byte AV60Facturacion_recargosporarticulowwds_14_tfulinrec ,
                                          byte AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A279CliNom ,
                                          String A69ArtDsc ,
                                          String A407EmprNom ,
                                          byte A845ULinRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[21];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.ULinRec, T1.ArtDsc, T3.CliNom, T1.ArtCod, T1.CliCod, T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV47Facturacion_recargosporarticulowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ULinRec,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_recargosporarticulowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV50Facturacion_recargosporarticulowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Facturacion_recargosporarticulowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_recargosporarticulowwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_recargosporarticulowwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_recargosporarticulowwds_10_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_recargosporarticulowwds_12_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Facturacion_recargosporarticulowwds_14_tfulinrec) )
      {
         addWhere(sWhereString, "(T1.ULinRec >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_recargosporarticulowwds_15_tfulinrec_to) )
      {
         addWhere(sWhereString, "(T1.ULinRec <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
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
                  return conditional_P0ALT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() );
            case 1 :
                  return conditional_P0ALT3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() );
            case 2 :
                  return conditional_P0ALT4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() );
            case 3 :
                  return conditional_P0ALT5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() );
            case 4 :
                  return conditional_P0ALT6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALT6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

