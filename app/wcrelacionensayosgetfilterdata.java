package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrelacionensayosgetfilterdata extends GXProcedure
{
   public wcrelacionensayosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrelacionensayosgetfilterdata.class ), "" );
   }

   public wcrelacionensayosgetfilterdata( int remoteHandle ,
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
      wcrelacionensayosgetfilterdata.this.aP5 = new String[] {""};
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
      wcrelacionensayosgetfilterdata.this.AV30DDOName = aP0;
      wcrelacionensayosgetfilterdata.this.AV28SearchTxt = aP1;
      wcrelacionensayosgetfilterdata.this.AV29SearchTxtTo = aP2;
      wcrelacionensayosgetfilterdata.this.aP3 = aP3;
      wcrelacionensayosgetfilterdata.this.aP4 = aP4;
      wcrelacionensayosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_LB_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_LB_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_LB_COLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("WCRelacionEnsayosGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRelacionEnsayosGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("WCRelacionEnsayosGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV10TFLb_numero = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLb_numero_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV16TFLb_ArtCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV17TFLb_ArtCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV18TFLb_ArtDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV19TFLb_ArtDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV20TFLb_ColNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV21TFLb_ColNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV22TFLb_ColNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFLb_ColNum_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV24TFTipColCod = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFTipColCod_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV26TFTipColDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV27TFTipColDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV46Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPROCOD") == 0 )
         {
            AV47MacProCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPRODSC") == 0 )
         {
            AV48MacProDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV28SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV54Wcrelacionensayosds_1_filterfulltext = AV49FilterFullText ;
      AV55Wcrelacionensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV56Wcrelacionensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV57Wcrelacionensayosds_4_tfclicod = AV12TFCliCod ;
      AV58Wcrelacionensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV59Wcrelacionensayosds_6_tfclinom = AV14TFCliNom ;
      AV60Wcrelacionensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV61Wcrelacionensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV62Wcrelacionensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV63Wcrelacionensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV64Wcrelacionensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV65Wcrelacionensayosds_12_tflb_colnom = AV20TFLb_ColNom ;
      AV66Wcrelacionensayosds_13_tflb_colnom_sel = AV21TFLb_ColNom_Sel ;
      AV67Wcrelacionensayosds_14_tflb_colnum = AV22TFLb_ColNum ;
      AV68Wcrelacionensayosds_15_tflb_colnum_to = AV23TFLb_ColNum_To ;
      AV69Wcrelacionensayosds_16_tftipcolcod = AV24TFTipColCod ;
      AV70Wcrelacionensayosds_17_tftipcolcod_to = AV25TFTipColCod_To ;
      AV71Wcrelacionensayosds_18_tftipcoldsc = AV26TFTipColDsc ;
      AV72Wcrelacionensayosds_19_tftipcoldsc_sel = AV27TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Wcrelacionensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to) ,
                                           AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                           AV59Wcrelacionensayosds_6_tfclinom ,
                                           AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                           AV61Wcrelacionensayosds_8_tflb_artcod ,
                                           AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                           AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                           AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                           AV65Wcrelacionensayosds_12_tflb_colnom ,
                                           Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum) ,
                                           Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod) ,
                                           Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to) ,
                                           AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                           AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           A1514MacProCod ,
                                           AV47MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV59Wcrelacionensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV59Wcrelacionensayosds_6_tfclinom), 30, "%") ;
      lV61Wcrelacionensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV61Wcrelacionensayosds_8_tflb_artcod), 16, "%") ;
      lV63Wcrelacionensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV63Wcrelacionensayosds_10_tflb_artdsc), 26, "%") ;
      lV65Wcrelacionensayosds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV65Wcrelacionensayosds_12_tflb_colnom), 13, "%") ;
      lV71Wcrelacionensayosds_18_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV71Wcrelacionensayosds_18_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HS2 */
      pr_default.execute(0, new Object[] {AV46Emprcod, AV47MacProCod, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero), Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to), Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod), Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to), lV59Wcrelacionensayosds_6_tfclinom, AV60Wcrelacionensayosds_7_tfclinom_sel, lV61Wcrelacionensayosds_8_tflb_artcod, AV62Wcrelacionensayosds_9_tflb_artcod_sel, lV63Wcrelacionensayosds_10_tflb_artdsc, AV64Wcrelacionensayosds_11_tflb_artdsc_sel, lV65Wcrelacionensayosds_12_tflb_colnom, AV66Wcrelacionensayosds_13_tflb_colnom_sel, Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum), Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to), Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod), Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to), lV71Wcrelacionensayosds_18_tftipcoldsc, AV72Wcrelacionensayosds_19_tftipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8HS2 = false ;
         A396EmprCod = P08HS2_A396EmprCod[0] ;
         A1514MacProCod = P08HS2_A1514MacProCod[0] ;
         n1514MacProCod = P08HS2_n1514MacProCod[0] ;
         A279CliNom = P08HS2_A279CliNom[0] ;
         A832TipColDsc = P08HS2_A832TipColDsc[0] ;
         n832TipColDsc = P08HS2_n832TipColDsc[0] ;
         A831TipColCod = P08HS2_A831TipColCod[0] ;
         n831TipColCod = P08HS2_n831TipColCod[0] ;
         A5537Lb_ColNum = P08HS2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P08HS2_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P08HS2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P08HS2_A5533Lb_ArtCod[0] ;
         A252CliCod = P08HS2_A252CliCod[0] ;
         A5532Lb_numero = P08HS2_A5532Lb_numero[0] ;
         A832TipColDsc = P08HS2_A832TipColDsc[0] ;
         n832TipColDsc = P08HS2_n832TipColDsc[0] ;
         A279CliNom = P08HS2_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08HS2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8HS2 = false ;
            A396EmprCod = P08HS2_A396EmprCod[0] ;
            A252CliCod = P08HS2_A252CliCod[0] ;
            A5532Lb_numero = P08HS2_A5532Lb_numero[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8HS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV32Option = A279CliNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HS2 )
         {
            brk8HS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFLb_ArtCod = AV28SearchTxt ;
      AV17TFLb_ArtCod_Sel = "" ;
      AV54Wcrelacionensayosds_1_filterfulltext = AV49FilterFullText ;
      AV55Wcrelacionensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV56Wcrelacionensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV57Wcrelacionensayosds_4_tfclicod = AV12TFCliCod ;
      AV58Wcrelacionensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV59Wcrelacionensayosds_6_tfclinom = AV14TFCliNom ;
      AV60Wcrelacionensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV61Wcrelacionensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV62Wcrelacionensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV63Wcrelacionensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV64Wcrelacionensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV65Wcrelacionensayosds_12_tflb_colnom = AV20TFLb_ColNom ;
      AV66Wcrelacionensayosds_13_tflb_colnom_sel = AV21TFLb_ColNom_Sel ;
      AV67Wcrelacionensayosds_14_tflb_colnum = AV22TFLb_ColNum ;
      AV68Wcrelacionensayosds_15_tflb_colnum_to = AV23TFLb_ColNum_To ;
      AV69Wcrelacionensayosds_16_tftipcolcod = AV24TFTipColCod ;
      AV70Wcrelacionensayosds_17_tftipcolcod_to = AV25TFTipColCod_To ;
      AV71Wcrelacionensayosds_18_tftipcoldsc = AV26TFTipColDsc ;
      AV72Wcrelacionensayosds_19_tftipcoldsc_sel = AV27TFTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Wcrelacionensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to) ,
                                           AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                           AV59Wcrelacionensayosds_6_tfclinom ,
                                           AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                           AV61Wcrelacionensayosds_8_tflb_artcod ,
                                           AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                           AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                           AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                           AV65Wcrelacionensayosds_12_tflb_colnom ,
                                           Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum) ,
                                           Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod) ,
                                           Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to) ,
                                           AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                           AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           A1514MacProCod ,
                                           AV47MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV59Wcrelacionensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV59Wcrelacionensayosds_6_tfclinom), 30, "%") ;
      lV61Wcrelacionensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV61Wcrelacionensayosds_8_tflb_artcod), 16, "%") ;
      lV63Wcrelacionensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV63Wcrelacionensayosds_10_tflb_artdsc), 26, "%") ;
      lV65Wcrelacionensayosds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV65Wcrelacionensayosds_12_tflb_colnom), 13, "%") ;
      lV71Wcrelacionensayosds_18_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV71Wcrelacionensayosds_18_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HS3 */
      pr_default.execute(1, new Object[] {AV46Emprcod, AV47MacProCod, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero), Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to), Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod), Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to), lV59Wcrelacionensayosds_6_tfclinom, AV60Wcrelacionensayosds_7_tfclinom_sel, lV61Wcrelacionensayosds_8_tflb_artcod, AV62Wcrelacionensayosds_9_tflb_artcod_sel, lV63Wcrelacionensayosds_10_tflb_artdsc, AV64Wcrelacionensayosds_11_tflb_artdsc_sel, lV65Wcrelacionensayosds_12_tflb_colnom, AV66Wcrelacionensayosds_13_tflb_colnom_sel, Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum), Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to), Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod), Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to), lV71Wcrelacionensayosds_18_tftipcoldsc, AV72Wcrelacionensayosds_19_tftipcoldsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8HS4 = false ;
         A396EmprCod = P08HS3_A396EmprCod[0] ;
         A1514MacProCod = P08HS3_A1514MacProCod[0] ;
         n1514MacProCod = P08HS3_n1514MacProCod[0] ;
         A5533Lb_ArtCod = P08HS3_A5533Lb_ArtCod[0] ;
         A832TipColDsc = P08HS3_A832TipColDsc[0] ;
         n832TipColDsc = P08HS3_n832TipColDsc[0] ;
         A831TipColCod = P08HS3_A831TipColCod[0] ;
         n831TipColCod = P08HS3_n831TipColCod[0] ;
         A5537Lb_ColNum = P08HS3_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P08HS3_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P08HS3_A5534Lb_ArtDsc[0] ;
         A279CliNom = P08HS3_A279CliNom[0] ;
         A252CliCod = P08HS3_A252CliCod[0] ;
         A5532Lb_numero = P08HS3_A5532Lb_numero[0] ;
         A832TipColDsc = P08HS3_A832TipColDsc[0] ;
         n832TipColDsc = P08HS3_n832TipColDsc[0] ;
         A279CliNom = P08HS3_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08HS3_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk8HS4 = false ;
            A396EmprCod = P08HS3_A396EmprCod[0] ;
            A5532Lb_numero = P08HS3_A5532Lb_numero[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8HS4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
         {
            AV32Option = A5533Lb_ArtCod ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HS4 )
         {
            brk8HS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_ARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFLb_ArtDsc = AV28SearchTxt ;
      AV19TFLb_ArtDsc_Sel = "" ;
      AV54Wcrelacionensayosds_1_filterfulltext = AV49FilterFullText ;
      AV55Wcrelacionensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV56Wcrelacionensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV57Wcrelacionensayosds_4_tfclicod = AV12TFCliCod ;
      AV58Wcrelacionensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV59Wcrelacionensayosds_6_tfclinom = AV14TFCliNom ;
      AV60Wcrelacionensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV61Wcrelacionensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV62Wcrelacionensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV63Wcrelacionensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV64Wcrelacionensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV65Wcrelacionensayosds_12_tflb_colnom = AV20TFLb_ColNom ;
      AV66Wcrelacionensayosds_13_tflb_colnom_sel = AV21TFLb_ColNom_Sel ;
      AV67Wcrelacionensayosds_14_tflb_colnum = AV22TFLb_ColNum ;
      AV68Wcrelacionensayosds_15_tflb_colnum_to = AV23TFLb_ColNum_To ;
      AV69Wcrelacionensayosds_16_tftipcolcod = AV24TFTipColCod ;
      AV70Wcrelacionensayosds_17_tftipcolcod_to = AV25TFTipColCod_To ;
      AV71Wcrelacionensayosds_18_tftipcoldsc = AV26TFTipColDsc ;
      AV72Wcrelacionensayosds_19_tftipcoldsc_sel = AV27TFTipColDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV54Wcrelacionensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to) ,
                                           AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                           AV59Wcrelacionensayosds_6_tfclinom ,
                                           AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                           AV61Wcrelacionensayosds_8_tflb_artcod ,
                                           AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                           AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                           AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                           AV65Wcrelacionensayosds_12_tflb_colnom ,
                                           Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum) ,
                                           Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod) ,
                                           Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to) ,
                                           AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                           AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           A1514MacProCod ,
                                           AV47MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV59Wcrelacionensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV59Wcrelacionensayosds_6_tfclinom), 30, "%") ;
      lV61Wcrelacionensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV61Wcrelacionensayosds_8_tflb_artcod), 16, "%") ;
      lV63Wcrelacionensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV63Wcrelacionensayosds_10_tflb_artdsc), 26, "%") ;
      lV65Wcrelacionensayosds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV65Wcrelacionensayosds_12_tflb_colnom), 13, "%") ;
      lV71Wcrelacionensayosds_18_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV71Wcrelacionensayosds_18_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HS4 */
      pr_default.execute(2, new Object[] {AV46Emprcod, AV47MacProCod, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero), Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to), Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod), Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to), lV59Wcrelacionensayosds_6_tfclinom, AV60Wcrelacionensayosds_7_tfclinom_sel, lV61Wcrelacionensayosds_8_tflb_artcod, AV62Wcrelacionensayosds_9_tflb_artcod_sel, lV63Wcrelacionensayosds_10_tflb_artdsc, AV64Wcrelacionensayosds_11_tflb_artdsc_sel, lV65Wcrelacionensayosds_12_tflb_colnom, AV66Wcrelacionensayosds_13_tflb_colnom_sel, Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum), Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to), Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod), Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to), lV71Wcrelacionensayosds_18_tftipcoldsc, AV72Wcrelacionensayosds_19_tftipcoldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8HS6 = false ;
         A396EmprCod = P08HS4_A396EmprCod[0] ;
         A1514MacProCod = P08HS4_A1514MacProCod[0] ;
         n1514MacProCod = P08HS4_n1514MacProCod[0] ;
         A5534Lb_ArtDsc = P08HS4_A5534Lb_ArtDsc[0] ;
         A832TipColDsc = P08HS4_A832TipColDsc[0] ;
         n832TipColDsc = P08HS4_n832TipColDsc[0] ;
         A831TipColCod = P08HS4_A831TipColCod[0] ;
         n831TipColCod = P08HS4_n831TipColCod[0] ;
         A5537Lb_ColNum = P08HS4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P08HS4_A5536Lb_ColNom[0] ;
         A5533Lb_ArtCod = P08HS4_A5533Lb_ArtCod[0] ;
         A279CliNom = P08HS4_A279CliNom[0] ;
         A252CliCod = P08HS4_A252CliCod[0] ;
         A5532Lb_numero = P08HS4_A5532Lb_numero[0] ;
         A832TipColDsc = P08HS4_A832TipColDsc[0] ;
         n832TipColDsc = P08HS4_n832TipColDsc[0] ;
         A279CliNom = P08HS4_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08HS4_A5534Lb_ArtDsc[0], A5534Lb_ArtDsc) == 0 ) )
         {
            brk8HS6 = false ;
            A396EmprCod = P08HS4_A396EmprCod[0] ;
            A5532Lb_numero = P08HS4_A5532Lb_numero[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8HS6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5534Lb_ArtDsc)==0) )
         {
            AV32Option = A5534Lb_ArtDsc ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HS6 )
         {
            brk8HS6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFLb_ColNom = AV28SearchTxt ;
      AV21TFLb_ColNom_Sel = "" ;
      AV54Wcrelacionensayosds_1_filterfulltext = AV49FilterFullText ;
      AV55Wcrelacionensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV56Wcrelacionensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV57Wcrelacionensayosds_4_tfclicod = AV12TFCliCod ;
      AV58Wcrelacionensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV59Wcrelacionensayosds_6_tfclinom = AV14TFCliNom ;
      AV60Wcrelacionensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV61Wcrelacionensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV62Wcrelacionensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV63Wcrelacionensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV64Wcrelacionensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV65Wcrelacionensayosds_12_tflb_colnom = AV20TFLb_ColNom ;
      AV66Wcrelacionensayosds_13_tflb_colnom_sel = AV21TFLb_ColNom_Sel ;
      AV67Wcrelacionensayosds_14_tflb_colnum = AV22TFLb_ColNum ;
      AV68Wcrelacionensayosds_15_tflb_colnum_to = AV23TFLb_ColNum_To ;
      AV69Wcrelacionensayosds_16_tftipcolcod = AV24TFTipColCod ;
      AV70Wcrelacionensayosds_17_tftipcolcod_to = AV25TFTipColCod_To ;
      AV71Wcrelacionensayosds_18_tftipcoldsc = AV26TFTipColDsc ;
      AV72Wcrelacionensayosds_19_tftipcoldsc_sel = AV27TFTipColDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV54Wcrelacionensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to) ,
                                           AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                           AV59Wcrelacionensayosds_6_tfclinom ,
                                           AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                           AV61Wcrelacionensayosds_8_tflb_artcod ,
                                           AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                           AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                           AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                           AV65Wcrelacionensayosds_12_tflb_colnom ,
                                           Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum) ,
                                           Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod) ,
                                           Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to) ,
                                           AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                           AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A396EmprCod ,
                                           AV46Emprcod ,
                                           A1514MacProCod ,
                                           AV47MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV59Wcrelacionensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV59Wcrelacionensayosds_6_tfclinom), 30, "%") ;
      lV61Wcrelacionensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV61Wcrelacionensayosds_8_tflb_artcod), 16, "%") ;
      lV63Wcrelacionensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV63Wcrelacionensayosds_10_tflb_artdsc), 26, "%") ;
      lV65Wcrelacionensayosds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV65Wcrelacionensayosds_12_tflb_colnom), 13, "%") ;
      lV71Wcrelacionensayosds_18_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV71Wcrelacionensayosds_18_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HS5 */
      pr_default.execute(3, new Object[] {AV46Emprcod, AV47MacProCod, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero), Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to), Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod), Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to), lV59Wcrelacionensayosds_6_tfclinom, AV60Wcrelacionensayosds_7_tfclinom_sel, lV61Wcrelacionensayosds_8_tflb_artcod, AV62Wcrelacionensayosds_9_tflb_artcod_sel, lV63Wcrelacionensayosds_10_tflb_artdsc, AV64Wcrelacionensayosds_11_tflb_artdsc_sel, lV65Wcrelacionensayosds_12_tflb_colnom, AV66Wcrelacionensayosds_13_tflb_colnom_sel, Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum), Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to), Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod), Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to), lV71Wcrelacionensayosds_18_tftipcoldsc, AV72Wcrelacionensayosds_19_tftipcoldsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8HS8 = false ;
         A396EmprCod = P08HS5_A396EmprCod[0] ;
         A1514MacProCod = P08HS5_A1514MacProCod[0] ;
         n1514MacProCod = P08HS5_n1514MacProCod[0] ;
         A5536Lb_ColNom = P08HS5_A5536Lb_ColNom[0] ;
         A832TipColDsc = P08HS5_A832TipColDsc[0] ;
         n832TipColDsc = P08HS5_n832TipColDsc[0] ;
         A831TipColCod = P08HS5_A831TipColCod[0] ;
         n831TipColCod = P08HS5_n831TipColCod[0] ;
         A5537Lb_ColNum = P08HS5_A5537Lb_ColNum[0] ;
         A5534Lb_ArtDsc = P08HS5_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P08HS5_A5533Lb_ArtCod[0] ;
         A279CliNom = P08HS5_A279CliNom[0] ;
         A252CliCod = P08HS5_A252CliCod[0] ;
         A5532Lb_numero = P08HS5_A5532Lb_numero[0] ;
         A832TipColDsc = P08HS5_A832TipColDsc[0] ;
         n832TipColDsc = P08HS5_n832TipColDsc[0] ;
         A279CliNom = P08HS5_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08HS5_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
         {
            brk8HS8 = false ;
            A396EmprCod = P08HS5_A396EmprCod[0] ;
            A5532Lb_numero = P08HS5_A5532Lb_numero[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8HS8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5536Lb_ColNom)==0) )
         {
            AV32Option = A5536Lb_ColNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HS8 )
         {
            brk8HS8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFTipColDsc = AV28SearchTxt ;
      AV27TFTipColDsc_Sel = "" ;
      AV54Wcrelacionensayosds_1_filterfulltext = AV49FilterFullText ;
      AV55Wcrelacionensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV56Wcrelacionensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV57Wcrelacionensayosds_4_tfclicod = AV12TFCliCod ;
      AV58Wcrelacionensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV59Wcrelacionensayosds_6_tfclinom = AV14TFCliNom ;
      AV60Wcrelacionensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV61Wcrelacionensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV62Wcrelacionensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV63Wcrelacionensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV64Wcrelacionensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV65Wcrelacionensayosds_12_tflb_colnom = AV20TFLb_ColNom ;
      AV66Wcrelacionensayosds_13_tflb_colnom_sel = AV21TFLb_ColNom_Sel ;
      AV67Wcrelacionensayosds_14_tflb_colnum = AV22TFLb_ColNum ;
      AV68Wcrelacionensayosds_15_tflb_colnum_to = AV23TFLb_ColNum_To ;
      AV69Wcrelacionensayosds_16_tftipcolcod = AV24TFTipColCod ;
      AV70Wcrelacionensayosds_17_tftipcolcod_to = AV25TFTipColCod_To ;
      AV71Wcrelacionensayosds_18_tftipcoldsc = AV26TFTipColDsc ;
      AV72Wcrelacionensayosds_19_tftipcoldsc_sel = AV27TFTipColDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV54Wcrelacionensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to) ,
                                           AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                           AV59Wcrelacionensayosds_6_tfclinom ,
                                           AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                           AV61Wcrelacionensayosds_8_tflb_artcod ,
                                           AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                           AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                           AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                           AV65Wcrelacionensayosds_12_tflb_colnom ,
                                           Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum) ,
                                           Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod) ,
                                           Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to) ,
                                           AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                           AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV47MacProCod ,
                                           AV46Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV54Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV59Wcrelacionensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV59Wcrelacionensayosds_6_tfclinom), 30, "%") ;
      lV61Wcrelacionensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV61Wcrelacionensayosds_8_tflb_artcod), 16, "%") ;
      lV63Wcrelacionensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV63Wcrelacionensayosds_10_tflb_artdsc), 26, "%") ;
      lV65Wcrelacionensayosds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV65Wcrelacionensayosds_12_tflb_colnom), 13, "%") ;
      lV71Wcrelacionensayosds_18_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV71Wcrelacionensayosds_18_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HS6 */
      pr_default.execute(4, new Object[] {AV46Emprcod, AV47MacProCod, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, lV54Wcrelacionensayosds_1_filterfulltext, Integer.valueOf(AV55Wcrelacionensayosds_2_tflb_numero), Integer.valueOf(AV56Wcrelacionensayosds_3_tflb_numero_to), Integer.valueOf(AV57Wcrelacionensayosds_4_tfclicod), Integer.valueOf(AV58Wcrelacionensayosds_5_tfclicod_to), lV59Wcrelacionensayosds_6_tfclinom, AV60Wcrelacionensayosds_7_tfclinom_sel, lV61Wcrelacionensayosds_8_tflb_artcod, AV62Wcrelacionensayosds_9_tflb_artcod_sel, lV63Wcrelacionensayosds_10_tflb_artdsc, AV64Wcrelacionensayosds_11_tflb_artdsc_sel, lV65Wcrelacionensayosds_12_tflb_colnom, AV66Wcrelacionensayosds_13_tflb_colnom_sel, Integer.valueOf(AV67Wcrelacionensayosds_14_tflb_colnum), Integer.valueOf(AV68Wcrelacionensayosds_15_tflb_colnum_to), Byte.valueOf(AV69Wcrelacionensayosds_16_tftipcolcod), Byte.valueOf(AV70Wcrelacionensayosds_17_tftipcolcod_to), lV71Wcrelacionensayosds_18_tftipcoldsc, AV72Wcrelacionensayosds_19_tftipcoldsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8HS10 = false ;
         A831TipColCod = P08HS6_A831TipColCod[0] ;
         n831TipColCod = P08HS6_n831TipColCod[0] ;
         A396EmprCod = P08HS6_A396EmprCod[0] ;
         A1514MacProCod = P08HS6_A1514MacProCod[0] ;
         n1514MacProCod = P08HS6_n1514MacProCod[0] ;
         A832TipColDsc = P08HS6_A832TipColDsc[0] ;
         n832TipColDsc = P08HS6_n832TipColDsc[0] ;
         A5537Lb_ColNum = P08HS6_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P08HS6_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P08HS6_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P08HS6_A5533Lb_ArtCod[0] ;
         A279CliNom = P08HS6_A279CliNom[0] ;
         A252CliCod = P08HS6_A252CliCod[0] ;
         A5532Lb_numero = P08HS6_A5532Lb_numero[0] ;
         A832TipColDsc = P08HS6_A832TipColDsc[0] ;
         n832TipColDsc = P08HS6_n832TipColDsc[0] ;
         A279CliNom = P08HS6_A279CliNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08HS6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08HS6_A831TipColCod[0] == A831TipColCod ) )
         {
            brk8HS10 = false ;
            A5532Lb_numero = P08HS6_A5532Lb_numero[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8HS10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
         {
            AV32Option = A832TipColDsc ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            AV33Options.add(AV32Option, AV31InsertIndex);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HS10 )
         {
            brk8HS10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcrelacionensayosgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = wcrelacionensayosgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = wcrelacionensayosgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49FilterFullText = "" ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV16TFLb_ArtCod = "" ;
      AV17TFLb_ArtCod_Sel = "" ;
      AV18TFLb_ArtDsc = "" ;
      AV19TFLb_ArtDsc_Sel = "" ;
      AV20TFLb_ColNom = "" ;
      AV21TFLb_ColNom_Sel = "" ;
      AV26TFTipColDsc = "" ;
      AV27TFTipColDsc_Sel = "" ;
      AV46Emprcod = "" ;
      AV47MacProCod = "" ;
      AV48MacProDsc = "" ;
      A279CliNom = "" ;
      AV54Wcrelacionensayosds_1_filterfulltext = "" ;
      AV59Wcrelacionensayosds_6_tfclinom = "" ;
      AV60Wcrelacionensayosds_7_tfclinom_sel = "" ;
      AV61Wcrelacionensayosds_8_tflb_artcod = "" ;
      AV62Wcrelacionensayosds_9_tflb_artcod_sel = "" ;
      AV63Wcrelacionensayosds_10_tflb_artdsc = "" ;
      AV64Wcrelacionensayosds_11_tflb_artdsc_sel = "" ;
      AV65Wcrelacionensayosds_12_tflb_colnom = "" ;
      AV66Wcrelacionensayosds_13_tflb_colnom_sel = "" ;
      AV71Wcrelacionensayosds_18_tftipcoldsc = "" ;
      AV72Wcrelacionensayosds_19_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV54Wcrelacionensayosds_1_filterfulltext = "" ;
      lV59Wcrelacionensayosds_6_tfclinom = "" ;
      lV61Wcrelacionensayosds_8_tflb_artcod = "" ;
      lV63Wcrelacionensayosds_10_tflb_artdsc = "" ;
      lV65Wcrelacionensayosds_12_tflb_colnom = "" ;
      lV71Wcrelacionensayosds_18_tftipcoldsc = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A832TipColDsc = "" ;
      A396EmprCod = "" ;
      A1514MacProCod = "" ;
      P08HS2_A396EmprCod = new String[] {""} ;
      P08HS2_A1514MacProCod = new String[] {""} ;
      P08HS2_n1514MacProCod = new boolean[] {false} ;
      P08HS2_A279CliNom = new String[] {""} ;
      P08HS2_A832TipColDsc = new String[] {""} ;
      P08HS2_n832TipColDsc = new boolean[] {false} ;
      P08HS2_A831TipColCod = new byte[1] ;
      P08HS2_n831TipColCod = new boolean[] {false} ;
      P08HS2_A5537Lb_ColNum = new int[1] ;
      P08HS2_A5536Lb_ColNom = new String[] {""} ;
      P08HS2_A5534Lb_ArtDsc = new String[] {""} ;
      P08HS2_A5533Lb_ArtCod = new String[] {""} ;
      P08HS2_A252CliCod = new int[1] ;
      P08HS2_A5532Lb_numero = new int[1] ;
      AV32Option = "" ;
      P08HS3_A396EmprCod = new String[] {""} ;
      P08HS3_A1514MacProCod = new String[] {""} ;
      P08HS3_n1514MacProCod = new boolean[] {false} ;
      P08HS3_A5533Lb_ArtCod = new String[] {""} ;
      P08HS3_A832TipColDsc = new String[] {""} ;
      P08HS3_n832TipColDsc = new boolean[] {false} ;
      P08HS3_A831TipColCod = new byte[1] ;
      P08HS3_n831TipColCod = new boolean[] {false} ;
      P08HS3_A5537Lb_ColNum = new int[1] ;
      P08HS3_A5536Lb_ColNom = new String[] {""} ;
      P08HS3_A5534Lb_ArtDsc = new String[] {""} ;
      P08HS3_A279CliNom = new String[] {""} ;
      P08HS3_A252CliCod = new int[1] ;
      P08HS3_A5532Lb_numero = new int[1] ;
      P08HS4_A396EmprCod = new String[] {""} ;
      P08HS4_A1514MacProCod = new String[] {""} ;
      P08HS4_n1514MacProCod = new boolean[] {false} ;
      P08HS4_A5534Lb_ArtDsc = new String[] {""} ;
      P08HS4_A832TipColDsc = new String[] {""} ;
      P08HS4_n832TipColDsc = new boolean[] {false} ;
      P08HS4_A831TipColCod = new byte[1] ;
      P08HS4_n831TipColCod = new boolean[] {false} ;
      P08HS4_A5537Lb_ColNum = new int[1] ;
      P08HS4_A5536Lb_ColNom = new String[] {""} ;
      P08HS4_A5533Lb_ArtCod = new String[] {""} ;
      P08HS4_A279CliNom = new String[] {""} ;
      P08HS4_A252CliCod = new int[1] ;
      P08HS4_A5532Lb_numero = new int[1] ;
      P08HS5_A396EmprCod = new String[] {""} ;
      P08HS5_A1514MacProCod = new String[] {""} ;
      P08HS5_n1514MacProCod = new boolean[] {false} ;
      P08HS5_A5536Lb_ColNom = new String[] {""} ;
      P08HS5_A832TipColDsc = new String[] {""} ;
      P08HS5_n832TipColDsc = new boolean[] {false} ;
      P08HS5_A831TipColCod = new byte[1] ;
      P08HS5_n831TipColCod = new boolean[] {false} ;
      P08HS5_A5537Lb_ColNum = new int[1] ;
      P08HS5_A5534Lb_ArtDsc = new String[] {""} ;
      P08HS5_A5533Lb_ArtCod = new String[] {""} ;
      P08HS5_A279CliNom = new String[] {""} ;
      P08HS5_A252CliCod = new int[1] ;
      P08HS5_A5532Lb_numero = new int[1] ;
      P08HS6_A831TipColCod = new byte[1] ;
      P08HS6_n831TipColCod = new boolean[] {false} ;
      P08HS6_A396EmprCod = new String[] {""} ;
      P08HS6_A1514MacProCod = new String[] {""} ;
      P08HS6_n1514MacProCod = new boolean[] {false} ;
      P08HS6_A832TipColDsc = new String[] {""} ;
      P08HS6_n832TipColDsc = new boolean[] {false} ;
      P08HS6_A5537Lb_ColNum = new int[1] ;
      P08HS6_A5536Lb_ColNom = new String[] {""} ;
      P08HS6_A5534Lb_ArtDsc = new String[] {""} ;
      P08HS6_A5533Lb_ArtCod = new String[] {""} ;
      P08HS6_A279CliNom = new String[] {""} ;
      P08HS6_A252CliCod = new int[1] ;
      P08HS6_A5532Lb_numero = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrelacionensayosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08HS2_A396EmprCod, P08HS2_A1514MacProCod, P08HS2_n1514MacProCod, P08HS2_A279CliNom, P08HS2_A832TipColDsc, P08HS2_n832TipColDsc, P08HS2_A831TipColCod, P08HS2_n831TipColCod, P08HS2_A5537Lb_ColNum, P08HS2_A5536Lb_ColNom,
            P08HS2_A5534Lb_ArtDsc, P08HS2_A5533Lb_ArtCod, P08HS2_A252CliCod, P08HS2_A5532Lb_numero
            }
            , new Object[] {
            P08HS3_A396EmprCod, P08HS3_A1514MacProCod, P08HS3_n1514MacProCod, P08HS3_A5533Lb_ArtCod, P08HS3_A832TipColDsc, P08HS3_n832TipColDsc, P08HS3_A831TipColCod, P08HS3_n831TipColCod, P08HS3_A5537Lb_ColNum, P08HS3_A5536Lb_ColNom,
            P08HS3_A5534Lb_ArtDsc, P08HS3_A279CliNom, P08HS3_A252CliCod, P08HS3_A5532Lb_numero
            }
            , new Object[] {
            P08HS4_A396EmprCod, P08HS4_A1514MacProCod, P08HS4_n1514MacProCod, P08HS4_A5534Lb_ArtDsc, P08HS4_A832TipColDsc, P08HS4_n832TipColDsc, P08HS4_A831TipColCod, P08HS4_n831TipColCod, P08HS4_A5537Lb_ColNum, P08HS4_A5536Lb_ColNom,
            P08HS4_A5533Lb_ArtCod, P08HS4_A279CliNom, P08HS4_A252CliCod, P08HS4_A5532Lb_numero
            }
            , new Object[] {
            P08HS5_A396EmprCod, P08HS5_A1514MacProCod, P08HS5_n1514MacProCod, P08HS5_A5536Lb_ColNom, P08HS5_A832TipColDsc, P08HS5_n832TipColDsc, P08HS5_A831TipColCod, P08HS5_n831TipColCod, P08HS5_A5537Lb_ColNum, P08HS5_A5534Lb_ArtDsc,
            P08HS5_A5533Lb_ArtCod, P08HS5_A279CliNom, P08HS5_A252CliCod, P08HS5_A5532Lb_numero
            }
            , new Object[] {
            P08HS6_A831TipColCod, P08HS6_n831TipColCod, P08HS6_A396EmprCod, P08HS6_A1514MacProCod, P08HS6_n1514MacProCod, P08HS6_A832TipColDsc, P08HS6_n832TipColDsc, P08HS6_A5537Lb_ColNum, P08HS6_A5536Lb_ColNom, P08HS6_A5534Lb_ArtDsc,
            P08HS6_A5533Lb_ArtCod, P08HS6_A279CliNom, P08HS6_A252CliCod, P08HS6_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24TFTipColCod ;
   private byte AV25TFTipColCod_To ;
   private byte AV69Wcrelacionensayosds_16_tftipcolcod ;
   private byte AV70Wcrelacionensayosds_17_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV10TFLb_numero ;
   private int AV11TFLb_numero_To ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV22TFLb_ColNum ;
   private int AV23TFLb_ColNum_To ;
   private int AV55Wcrelacionensayosds_2_tflb_numero ;
   private int AV56Wcrelacionensayosds_3_tflb_numero_to ;
   private int AV57Wcrelacionensayosds_4_tfclicod ;
   private int AV58Wcrelacionensayosds_5_tfclicod_to ;
   private int AV67Wcrelacionensayosds_14_tflb_colnum ;
   private int AV68Wcrelacionensayosds_15_tflb_colnum_to ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV16TFLb_ArtCod ;
   private String AV17TFLb_ArtCod_Sel ;
   private String AV18TFLb_ArtDsc ;
   private String AV19TFLb_ArtDsc_Sel ;
   private String AV20TFLb_ColNom ;
   private String AV21TFLb_ColNom_Sel ;
   private String AV26TFTipColDsc ;
   private String AV27TFTipColDsc_Sel ;
   private String AV46Emprcod ;
   private String AV47MacProCod ;
   private String AV48MacProDsc ;
   private String A279CliNom ;
   private String AV59Wcrelacionensayosds_6_tfclinom ;
   private String AV60Wcrelacionensayosds_7_tfclinom_sel ;
   private String AV61Wcrelacionensayosds_8_tflb_artcod ;
   private String AV62Wcrelacionensayosds_9_tflb_artcod_sel ;
   private String AV63Wcrelacionensayosds_10_tflb_artdsc ;
   private String AV64Wcrelacionensayosds_11_tflb_artdsc_sel ;
   private String AV65Wcrelacionensayosds_12_tflb_colnom ;
   private String AV66Wcrelacionensayosds_13_tflb_colnom_sel ;
   private String AV71Wcrelacionensayosds_18_tftipcoldsc ;
   private String AV72Wcrelacionensayosds_19_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV59Wcrelacionensayosds_6_tfclinom ;
   private String lV61Wcrelacionensayosds_8_tflb_artcod ;
   private String lV63Wcrelacionensayosds_10_tflb_artdsc ;
   private String lV65Wcrelacionensayosds_12_tflb_colnom ;
   private String lV71Wcrelacionensayosds_18_tftipcoldsc ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A832TipColDsc ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private boolean returnInSub ;
   private boolean brk8HS2 ;
   private boolean n1514MacProCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private boolean brk8HS4 ;
   private boolean brk8HS6 ;
   private boolean brk8HS8 ;
   private boolean brk8HS10 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV49FilterFullText ;
   private String AV54Wcrelacionensayosds_1_filterfulltext ;
   private String lV54Wcrelacionensayosds_1_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HS2_A396EmprCod ;
   private String[] P08HS2_A1514MacProCod ;
   private boolean[] P08HS2_n1514MacProCod ;
   private String[] P08HS2_A279CliNom ;
   private String[] P08HS2_A832TipColDsc ;
   private boolean[] P08HS2_n832TipColDsc ;
   private byte[] P08HS2_A831TipColCod ;
   private boolean[] P08HS2_n831TipColCod ;
   private int[] P08HS2_A5537Lb_ColNum ;
   private String[] P08HS2_A5536Lb_ColNom ;
   private String[] P08HS2_A5534Lb_ArtDsc ;
   private String[] P08HS2_A5533Lb_ArtCod ;
   private int[] P08HS2_A252CliCod ;
   private int[] P08HS2_A5532Lb_numero ;
   private String[] P08HS3_A396EmprCod ;
   private String[] P08HS3_A1514MacProCod ;
   private boolean[] P08HS3_n1514MacProCod ;
   private String[] P08HS3_A5533Lb_ArtCod ;
   private String[] P08HS3_A832TipColDsc ;
   private boolean[] P08HS3_n832TipColDsc ;
   private byte[] P08HS3_A831TipColCod ;
   private boolean[] P08HS3_n831TipColCod ;
   private int[] P08HS3_A5537Lb_ColNum ;
   private String[] P08HS3_A5536Lb_ColNom ;
   private String[] P08HS3_A5534Lb_ArtDsc ;
   private String[] P08HS3_A279CliNom ;
   private int[] P08HS3_A252CliCod ;
   private int[] P08HS3_A5532Lb_numero ;
   private String[] P08HS4_A396EmprCod ;
   private String[] P08HS4_A1514MacProCod ;
   private boolean[] P08HS4_n1514MacProCod ;
   private String[] P08HS4_A5534Lb_ArtDsc ;
   private String[] P08HS4_A832TipColDsc ;
   private boolean[] P08HS4_n832TipColDsc ;
   private byte[] P08HS4_A831TipColCod ;
   private boolean[] P08HS4_n831TipColCod ;
   private int[] P08HS4_A5537Lb_ColNum ;
   private String[] P08HS4_A5536Lb_ColNom ;
   private String[] P08HS4_A5533Lb_ArtCod ;
   private String[] P08HS4_A279CliNom ;
   private int[] P08HS4_A252CliCod ;
   private int[] P08HS4_A5532Lb_numero ;
   private String[] P08HS5_A396EmprCod ;
   private String[] P08HS5_A1514MacProCod ;
   private boolean[] P08HS5_n1514MacProCod ;
   private String[] P08HS5_A5536Lb_ColNom ;
   private String[] P08HS5_A832TipColDsc ;
   private boolean[] P08HS5_n832TipColDsc ;
   private byte[] P08HS5_A831TipColCod ;
   private boolean[] P08HS5_n831TipColCod ;
   private int[] P08HS5_A5537Lb_ColNum ;
   private String[] P08HS5_A5534Lb_ArtDsc ;
   private String[] P08HS5_A5533Lb_ArtCod ;
   private String[] P08HS5_A279CliNom ;
   private int[] P08HS5_A252CliCod ;
   private int[] P08HS5_A5532Lb_numero ;
   private byte[] P08HS6_A831TipColCod ;
   private boolean[] P08HS6_n831TipColCod ;
   private String[] P08HS6_A396EmprCod ;
   private String[] P08HS6_A1514MacProCod ;
   private boolean[] P08HS6_n1514MacProCod ;
   private String[] P08HS6_A832TipColDsc ;
   private boolean[] P08HS6_n832TipColDsc ;
   private int[] P08HS6_A5537Lb_ColNum ;
   private String[] P08HS6_A5536Lb_ColNom ;
   private String[] P08HS6_A5534Lb_ArtDsc ;
   private String[] P08HS6_A5533Lb_ArtCod ;
   private String[] P08HS6_A279CliNom ;
   private int[] P08HS6_A252CliCod ;
   private int[] P08HS6_A5532Lb_numero ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class wcrelacionensayosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Wcrelacionensayosds_1_filterfulltext ,
                                          int AV55Wcrelacionensayosds_2_tflb_numero ,
                                          int AV56Wcrelacionensayosds_3_tflb_numero_to ,
                                          int AV57Wcrelacionensayosds_4_tfclicod ,
                                          int AV58Wcrelacionensayosds_5_tfclicod_to ,
                                          String AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                          String AV59Wcrelacionensayosds_6_tfclinom ,
                                          String AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                          String AV61Wcrelacionensayosds_8_tflb_artcod ,
                                          String AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                          String AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                          String AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                          String AV65Wcrelacionensayosds_12_tflb_colnom ,
                                          int AV67Wcrelacionensayosds_14_tflb_colnum ,
                                          int AV68Wcrelacionensayosds_15_tflb_colnum_to ,
                                          byte AV69Wcrelacionensayosds_16_tftipcolcod ,
                                          byte AV70Wcrelacionensayosds_17_tftipcolcod_to ,
                                          String AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                          String AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String A1514MacProCod ,
                                          String AV47MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T3.CliNom, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.CliCod, T1.Lb_numero FROM ((TXPENS001" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Wcrelacionensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV55Wcrelacionensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Wcrelacionensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Wcrelacionensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcrelacionensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelacionensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelacionensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcrelacionensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcrelacionensayosds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrelacionensayosds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrelacionensayosds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrelacionensayosds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrelacionensayosds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrelacionensayosds_18_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08HS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Wcrelacionensayosds_1_filterfulltext ,
                                          int AV55Wcrelacionensayosds_2_tflb_numero ,
                                          int AV56Wcrelacionensayosds_3_tflb_numero_to ,
                                          int AV57Wcrelacionensayosds_4_tfclicod ,
                                          int AV58Wcrelacionensayosds_5_tfclicod_to ,
                                          String AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                          String AV59Wcrelacionensayosds_6_tfclinom ,
                                          String AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                          String AV61Wcrelacionensayosds_8_tflb_artcod ,
                                          String AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                          String AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                          String AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                          String AV65Wcrelacionensayosds_12_tflb_colnom ,
                                          int AV67Wcrelacionensayosds_14_tflb_colnum ,
                                          int AV68Wcrelacionensayosds_15_tflb_colnum_to ,
                                          byte AV69Wcrelacionensayosds_16_tftipcolcod ,
                                          byte AV70Wcrelacionensayosds_17_tftipcolcod_to ,
                                          String AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                          String AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String A1514MacProCod ,
                                          String AV47MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.Lb_ArtCod, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T3.CliNom, T1.CliCod, T1.Lb_numero FROM ((TXPENS001" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Wcrelacionensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV55Wcrelacionensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Wcrelacionensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Wcrelacionensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcrelacionensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelacionensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelacionensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcrelacionensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcrelacionensayosds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrelacionensayosds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrelacionensayosds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrelacionensayosds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrelacionensayosds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrelacionensayosds_18_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08HS4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Wcrelacionensayosds_1_filterfulltext ,
                                          int AV55Wcrelacionensayosds_2_tflb_numero ,
                                          int AV56Wcrelacionensayosds_3_tflb_numero_to ,
                                          int AV57Wcrelacionensayosds_4_tfclicod ,
                                          int AV58Wcrelacionensayosds_5_tfclicod_to ,
                                          String AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                          String AV59Wcrelacionensayosds_6_tfclinom ,
                                          String AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                          String AV61Wcrelacionensayosds_8_tflb_artcod ,
                                          String AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                          String AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                          String AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                          String AV65Wcrelacionensayosds_12_tflb_colnom ,
                                          int AV67Wcrelacionensayosds_14_tflb_colnum ,
                                          int AV68Wcrelacionensayosds_15_tflb_colnum_to ,
                                          byte AV69Wcrelacionensayosds_16_tftipcolcod ,
                                          byte AV70Wcrelacionensayosds_17_tftipcolcod_to ,
                                          String AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                          String AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String A1514MacProCod ,
                                          String AV47MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.Lb_ArtDsc, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtCod, T3.CliNom, T1.CliCod, T1.Lb_numero FROM ((TXPENS001" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Wcrelacionensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV55Wcrelacionensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Wcrelacionensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Wcrelacionensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcrelacionensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelacionensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelacionensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcrelacionensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcrelacionensayosds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrelacionensayosds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrelacionensayosds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrelacionensayosds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrelacionensayosds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrelacionensayosds_18_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08HS5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Wcrelacionensayosds_1_filterfulltext ,
                                          int AV55Wcrelacionensayosds_2_tflb_numero ,
                                          int AV56Wcrelacionensayosds_3_tflb_numero_to ,
                                          int AV57Wcrelacionensayosds_4_tfclicod ,
                                          int AV58Wcrelacionensayosds_5_tfclicod_to ,
                                          String AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                          String AV59Wcrelacionensayosds_6_tfclinom ,
                                          String AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                          String AV61Wcrelacionensayosds_8_tflb_artcod ,
                                          String AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                          String AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                          String AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                          String AV65Wcrelacionensayosds_12_tflb_colnom ,
                                          int AV67Wcrelacionensayosds_14_tflb_colnum ,
                                          int AV68Wcrelacionensayosds_15_tflb_colnum_to ,
                                          byte AV69Wcrelacionensayosds_16_tftipcolcod ,
                                          byte AV70Wcrelacionensayosds_17_tftipcolcod_to ,
                                          String AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                          String AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A396EmprCod ,
                                          String AV46Emprcod ,
                                          String A1514MacProCod ,
                                          String AV47MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.Lb_ColNom, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod, T1.Lb_numero FROM ((TXPENS001" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Wcrelacionensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV55Wcrelacionensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Wcrelacionensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Wcrelacionensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcrelacionensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelacionensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelacionensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcrelacionensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcrelacionensayosds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrelacionensayosds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrelacionensayosds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrelacionensayosds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrelacionensayosds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrelacionensayosds_18_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08HS6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Wcrelacionensayosds_1_filterfulltext ,
                                          int AV55Wcrelacionensayosds_2_tflb_numero ,
                                          int AV56Wcrelacionensayosds_3_tflb_numero_to ,
                                          int AV57Wcrelacionensayosds_4_tfclicod ,
                                          int AV58Wcrelacionensayosds_5_tfclicod_to ,
                                          String AV60Wcrelacionensayosds_7_tfclinom_sel ,
                                          String AV59Wcrelacionensayosds_6_tfclinom ,
                                          String AV62Wcrelacionensayosds_9_tflb_artcod_sel ,
                                          String AV61Wcrelacionensayosds_8_tflb_artcod ,
                                          String AV64Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                          String AV63Wcrelacionensayosds_10_tflb_artdsc ,
                                          String AV66Wcrelacionensayosds_13_tflb_colnom_sel ,
                                          String AV65Wcrelacionensayosds_12_tflb_colnom ,
                                          int AV67Wcrelacionensayosds_14_tflb_colnum ,
                                          int AV68Wcrelacionensayosds_15_tflb_colnum_to ,
                                          byte AV69Wcrelacionensayosds_16_tftipcolcod ,
                                          byte AV70Wcrelacionensayosds_17_tftipcolcod_to ,
                                          String AV72Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                          String AV71Wcrelacionensayosds_18_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV47MacProCod ,
                                          String AV46Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[29];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.TipColCod, T1.EmprCod, T1.MacProCod, T2.TipColDsc, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod, T1.Lb_numero FROM ((TXPENS001" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Wcrelacionensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV55Wcrelacionensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Wcrelacionensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Wcrelacionensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcrelacionensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcrelacionensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcrelacionensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcrelacionensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcrelacionensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Wcrelacionensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Wcrelacionensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcrelacionensayosds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcrelacionensayosds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrelacionensayosds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrelacionensayosds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrelacionensayosds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrelacionensayosds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrelacionensayosds_18_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrelacionensayosds_19_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipColCod" ;
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
                  return conditional_P08HS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 1 :
                  return conditional_P08HS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 2 :
                  return conditional_P08HS4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 3 :
                  return conditional_P08HS5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 4 :
                  return conditional_P08HS6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HS4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HS5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HS6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               return;
      }
   }

}

