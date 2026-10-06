package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayospendientes_wcgetfilterdata extends GXProcedure
{
   public ensayospendientes_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayospendientes_wcgetfilterdata.class ), "" );
   }

   public ensayospendientes_wcgetfilterdata( int remoteHandle ,
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
      ensayospendientes_wcgetfilterdata.this.aP5 = new String[] {""};
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
      ensayospendientes_wcgetfilterdata.this.AV36DDOName = aP0;
      ensayospendientes_wcgetfilterdata.this.AV34SearchTxt = aP1;
      ensayospendientes_wcgetfilterdata.this.AV35SearchTxtTo = aP2;
      ensayospendientes_wcgetfilterdata.this.aP3 = aP3;
      ensayospendientes_wcgetfilterdata.this.aP4 = aP4;
      ensayospendientes_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_CARTAZ") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_CARTAZOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_COLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_COLNOMC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_TIPO") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_TIPOOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV39Options.toJSonString(false) ;
      AV43OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV44OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("GestionLaboratorio.EnsayosPendientes_WCGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EnsayosPendientes_WCGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("GestionLaboratorio.EnsayosPendientes_WCGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV14TFLb_Cartaz = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV15TFLb_Cartaz_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV16TFLb_cartazf = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV18TFLb_FechaE = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV20TFLb_ArtCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV21TFLb_ArtCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV22TFLb_ArtDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV23TFLb_ArtDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV24TFLb_ColNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV25TFLb_ColNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV26TFLb_ColNum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFLb_ColNum_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV28TFLb_ColNomC = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV29TFLb_ColNomC_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV30TFLb_numero = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFLb_numero_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV32TFLb_Tipo = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV33TFLb_Tipo_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV53Emprcod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV54Clicod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV55Lb_FechaEfrom = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV56Lb_FechaEto = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV34SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV52FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV10TFCliCod ;
      AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV12TFCliNom ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV18TFLb_FechaE ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV20TFLb_ArtCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV22TFLb_ArtDsc ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV23TFLb_ArtDsc_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV24TFLb_ColNom ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV26TFLb_ColNum ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV28TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV29TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV30TFLb_numero ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV31TFLb_numero_To ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV32TFLb_Tipo ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV33TFLb_Tipo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV55Lb_FechaEfrom ,
                                           AV56Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O92 */
      pr_default.execute(0, new Object[] {AV53Emprcod, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV54Clicod), AV55Lb_FechaEfrom, AV56Lb_FechaEto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9O92 = false ;
         A396EmprCod = P09O92_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O92_A5569Lb_EstEns[0] ;
         A279CliNom = P09O92_A279CliNom[0] ;
         A5570Lb_Tipo = P09O92_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09O92_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09O92_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O92_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O92_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09O92_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09O92_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O92_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O92_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O92_A5540Lb_Cartaz[0] ;
         A252CliCod = P09O92_A252CliCod[0] ;
         A279CliNom = P09O92_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09O92_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9O92 = false ;
            A396EmprCod = P09O92_A396EmprCod[0] ;
            A5532Lb_numero = P09O92_A5532Lb_numero[0] ;
            A252CliCod = P09O92_A252CliCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9O92 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV38Option = A279CliNom ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9O92 )
         {
            brk9O92 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV14TFLb_Cartaz = AV34SearchTxt ;
      AV15TFLb_Cartaz_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV52FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV10TFCliCod ;
      AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV12TFCliNom ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV18TFLb_FechaE ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV20TFLb_ArtCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV22TFLb_ArtDsc ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV23TFLb_ArtDsc_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV24TFLb_ColNom ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV26TFLb_ColNum ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV28TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV29TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV30TFLb_numero ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV31TFLb_numero_To ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV32TFLb_Tipo ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV33TFLb_Tipo_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV55Lb_FechaEfrom ,
                                           AV56Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O93 */
      pr_default.execute(1, new Object[] {AV53Emprcod, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV54Clicod), AV55Lb_FechaEfrom, AV56Lb_FechaEto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9O94 = false ;
         A396EmprCod = P09O93_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O93_A5569Lb_EstEns[0] ;
         A5540Lb_Cartaz = P09O93_A5540Lb_Cartaz[0] ;
         A5570Lb_Tipo = P09O93_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09O93_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09O93_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O93_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O93_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09O93_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09O93_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O93_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O93_A5594Lb_cartazf[0] ;
         A279CliNom = P09O93_A279CliNom[0] ;
         A252CliCod = P09O93_A252CliCod[0] ;
         A279CliNom = P09O93_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09O93_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9O94 = false ;
            A396EmprCod = P09O93_A396EmprCod[0] ;
            A5532Lb_numero = P09O93_A5532Lb_numero[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9O94 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5540Lb_Cartaz)==0) )
         {
            AV38Option = A5540Lb_Cartaz ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9O94 )
         {
            brk9O94 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFLb_ArtCod = AV34SearchTxt ;
      AV21TFLb_ArtCod_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV52FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV10TFCliCod ;
      AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV12TFCliNom ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV18TFLb_FechaE ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV20TFLb_ArtCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV22TFLb_ArtDsc ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV23TFLb_ArtDsc_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV24TFLb_ColNom ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV26TFLb_ColNum ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV28TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV29TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV30TFLb_numero ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV31TFLb_numero_To ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV32TFLb_Tipo ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV33TFLb_Tipo_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV55Lb_FechaEfrom ,
                                           AV56Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O94 */
      pr_default.execute(2, new Object[] {AV53Emprcod, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV54Clicod), AV55Lb_FechaEfrom, AV56Lb_FechaEto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9O96 = false ;
         A396EmprCod = P09O94_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O94_A5569Lb_EstEns[0] ;
         A5533Lb_ArtCod = P09O94_A5533Lb_ArtCod[0] ;
         A5570Lb_Tipo = P09O94_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09O94_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09O94_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O94_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O94_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09O94_A5534Lb_ArtDsc[0] ;
         A5541Lb_FechaE = P09O94_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O94_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O94_A5540Lb_Cartaz[0] ;
         A279CliNom = P09O94_A279CliNom[0] ;
         A252CliCod = P09O94_A252CliCod[0] ;
         A279CliNom = P09O94_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09O94_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk9O96 = false ;
            A396EmprCod = P09O94_A396EmprCod[0] ;
            A5532Lb_numero = P09O94_A5532Lb_numero[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9O96 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
         {
            AV38Option = A5533Lb_ArtCod ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9O96 )
         {
            brk9O96 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_ARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLb_ArtDsc = AV34SearchTxt ;
      AV23TFLb_ArtDsc_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV52FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV10TFCliCod ;
      AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV12TFCliNom ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV18TFLb_FechaE ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV20TFLb_ArtCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV22TFLb_ArtDsc ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV23TFLb_ArtDsc_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV24TFLb_ColNom ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV26TFLb_ColNum ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV28TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV29TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV30TFLb_numero ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV31TFLb_numero_To ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV32TFLb_Tipo ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV33TFLb_Tipo_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV55Lb_FechaEfrom ,
                                           AV56Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O95 */
      pr_default.execute(3, new Object[] {AV53Emprcod, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV54Clicod), AV55Lb_FechaEfrom, AV56Lb_FechaEto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9O98 = false ;
         A396EmprCod = P09O95_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O95_A5569Lb_EstEns[0] ;
         A5534Lb_ArtDsc = P09O95_A5534Lb_ArtDsc[0] ;
         A5570Lb_Tipo = P09O95_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09O95_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09O95_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O95_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O95_A5536Lb_ColNom[0] ;
         A5533Lb_ArtCod = P09O95_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O95_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O95_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O95_A5540Lb_Cartaz[0] ;
         A279CliNom = P09O95_A279CliNom[0] ;
         A252CliCod = P09O95_A252CliCod[0] ;
         A279CliNom = P09O95_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09O95_A5534Lb_ArtDsc[0], A5534Lb_ArtDsc) == 0 ) )
         {
            brk9O98 = false ;
            A396EmprCod = P09O95_A396EmprCod[0] ;
            A5532Lb_numero = P09O95_A5532Lb_numero[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9O98 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5534Lb_ArtDsc)==0) )
         {
            AV38Option = A5534Lb_ArtDsc ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9O98 )
         {
            brk9O98 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFLb_ColNom = AV34SearchTxt ;
      AV25TFLb_ColNom_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV52FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV10TFCliCod ;
      AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV12TFCliNom ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV18TFLb_FechaE ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV20TFLb_ArtCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV22TFLb_ArtDsc ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV23TFLb_ArtDsc_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV24TFLb_ColNom ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV26TFLb_ColNum ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV28TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV29TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV30TFLb_numero ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV31TFLb_numero_To ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV32TFLb_Tipo ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV33TFLb_Tipo_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV55Lb_FechaEfrom ,
                                           AV56Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O96 */
      pr_default.execute(4, new Object[] {AV53Emprcod, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV54Clicod), AV55Lb_FechaEfrom, AV56Lb_FechaEto});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9O910 = false ;
         A396EmprCod = P09O96_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O96_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09O96_A5536Lb_ColNom[0] ;
         A5570Lb_Tipo = P09O96_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09O96_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09O96_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O96_A5537Lb_ColNum[0] ;
         A5534Lb_ArtDsc = P09O96_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09O96_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O96_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O96_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O96_A5540Lb_Cartaz[0] ;
         A279CliNom = P09O96_A279CliNom[0] ;
         A252CliCod = P09O96_A252CliCod[0] ;
         A279CliNom = P09O96_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09O96_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
         {
            brk9O910 = false ;
            A396EmprCod = P09O96_A396EmprCod[0] ;
            A5532Lb_numero = P09O96_A5532Lb_numero[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9O910 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5536Lb_ColNom)==0) )
         {
            AV38Option = A5536Lb_ColNom ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9O910 )
         {
            brk9O910 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADLB_COLNOMCOPTIONS' Routine */
      returnInSub = false ;
      AV28TFLb_ColNomC = AV34SearchTxt ;
      AV29TFLb_ColNomC_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV52FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV10TFCliCod ;
      AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV12TFCliNom ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV18TFLb_FechaE ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV20TFLb_ArtCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV22TFLb_ArtDsc ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV23TFLb_ArtDsc_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV24TFLb_ColNom ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV26TFLb_ColNum ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV28TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV29TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV30TFLb_numero ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV31TFLb_numero_To ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV32TFLb_Tipo ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV33TFLb_Tipo_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV55Lb_FechaEfrom ,
                                           AV56Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O97 */
      pr_default.execute(5, new Object[] {AV53Emprcod, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV54Clicod), AV55Lb_FechaEfrom, AV56Lb_FechaEto});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9O912 = false ;
         A396EmprCod = P09O97_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O97_A5569Lb_EstEns[0] ;
         A5538Lb_ColNomC = P09O97_A5538Lb_ColNomC[0] ;
         A5570Lb_Tipo = P09O97_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09O97_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09O97_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O97_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09O97_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09O97_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O97_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O97_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O97_A5540Lb_Cartaz[0] ;
         A279CliNom = P09O97_A279CliNom[0] ;
         A252CliCod = P09O97_A252CliCod[0] ;
         A279CliNom = P09O97_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09O97_A5538Lb_ColNomC[0], A5538Lb_ColNomC) == 0 ) )
         {
            brk9O912 = false ;
            A396EmprCod = P09O97_A396EmprCod[0] ;
            A5532Lb_numero = P09O97_A5532Lb_numero[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9O912 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
         {
            AV38Option = A5538Lb_ColNomC ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9O912 )
         {
            brk9O912 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADLB_TIPOOPTIONS' Routine */
      returnInSub = false ;
      AV32TFLb_Tipo = AV34SearchTxt ;
      AV33TFLb_Tipo_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV52FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV10TFCliCod ;
      AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV12TFCliNom ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV18TFLb_FechaE ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV20TFLb_ArtCod ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV22TFLb_ArtDsc ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV23TFLb_ArtDsc_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV24TFLb_ColNom ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV26TFLb_ColNum ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV28TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV29TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV30TFLb_numero ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV31TFLb_numero_To ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV32TFLb_Tipo ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV33TFLb_Tipo_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV55Lb_FechaEfrom ,
                                           AV56Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O98 */
      pr_default.execute(6, new Object[] {AV53Emprcod, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV54Clicod), AV55Lb_FechaEfrom, AV56Lb_FechaEto});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9O914 = false ;
         A396EmprCod = P09O98_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O98_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09O98_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09O98_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09O98_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O98_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O98_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09O98_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09O98_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O98_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O98_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O98_A5540Lb_Cartaz[0] ;
         A279CliNom = P09O98_A279CliNom[0] ;
         A252CliCod = P09O98_A252CliCod[0] ;
         A279CliNom = P09O98_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09O98_A5570Lb_Tipo[0], A5570Lb_Tipo) == 0 ) )
         {
            brk9O914 = false ;
            A396EmprCod = P09O98_A396EmprCod[0] ;
            A5532Lb_numero = P09O98_A5532Lb_numero[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9O914 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A5570Lb_Tipo)==0) )
         {
            AV38Option = A5570Lb_Tipo ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9O914 )
         {
            brk9O914 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ensayospendientes_wcgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = ensayospendientes_wcgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = ensayospendientes_wcgetfilterdata.this.AV45OptionIndexesJson;
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
      AV43OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFLb_Cartaz = "" ;
      AV15TFLb_Cartaz_Sel = "" ;
      AV16TFLb_cartazf = GXutil.nullDate() ;
      AV18TFLb_FechaE = GXutil.nullDate() ;
      AV20TFLb_ArtCod = "" ;
      AV21TFLb_ArtCod_Sel = "" ;
      AV22TFLb_ArtDsc = "" ;
      AV23TFLb_ArtDsc_Sel = "" ;
      AV24TFLb_ColNom = "" ;
      AV25TFLb_ColNom_Sel = "" ;
      AV28TFLb_ColNomC = "" ;
      AV29TFLb_ColNomC_Sel = "" ;
      AV32TFLb_Tipo = "" ;
      AV33TFLb_Tipo_Sel = "" ;
      AV53Emprcod = "" ;
      AV55Lb_FechaEfrom = GXutil.nullDate() ;
      AV56Lb_FechaEto = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = "" ;
      AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = "" ;
      AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = "" ;
      AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = "" ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = "" ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = GXutil.nullDate() ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = GXutil.nullDate() ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = "" ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = "" ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = "" ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = "" ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = "" ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = "" ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = "" ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = "" ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = "" ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = "" ;
      scmdbuf = "" ;
      lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = "" ;
      lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = "" ;
      lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = "" ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = "" ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = "" ;
      lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = "" ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = "" ;
      lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = "" ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5570Lb_Tipo = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09O92_A396EmprCod = new String[] {""} ;
      P09O92_A5569Lb_EstEns = new byte[1] ;
      P09O92_A279CliNom = new String[] {""} ;
      P09O92_A5570Lb_Tipo = new String[] {""} ;
      P09O92_A5532Lb_numero = new int[1] ;
      P09O92_A5538Lb_ColNomC = new String[] {""} ;
      P09O92_A5537Lb_ColNum = new int[1] ;
      P09O92_A5536Lb_ColNom = new String[] {""} ;
      P09O92_A5534Lb_ArtDsc = new String[] {""} ;
      P09O92_A5533Lb_ArtCod = new String[] {""} ;
      P09O92_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O92_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O92_A5540Lb_Cartaz = new String[] {""} ;
      P09O92_A252CliCod = new int[1] ;
      AV38Option = "" ;
      P09O93_A396EmprCod = new String[] {""} ;
      P09O93_A5569Lb_EstEns = new byte[1] ;
      P09O93_A5540Lb_Cartaz = new String[] {""} ;
      P09O93_A5570Lb_Tipo = new String[] {""} ;
      P09O93_A5532Lb_numero = new int[1] ;
      P09O93_A5538Lb_ColNomC = new String[] {""} ;
      P09O93_A5537Lb_ColNum = new int[1] ;
      P09O93_A5536Lb_ColNom = new String[] {""} ;
      P09O93_A5534Lb_ArtDsc = new String[] {""} ;
      P09O93_A5533Lb_ArtCod = new String[] {""} ;
      P09O93_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O93_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O93_A279CliNom = new String[] {""} ;
      P09O93_A252CliCod = new int[1] ;
      P09O94_A396EmprCod = new String[] {""} ;
      P09O94_A5569Lb_EstEns = new byte[1] ;
      P09O94_A5533Lb_ArtCod = new String[] {""} ;
      P09O94_A5570Lb_Tipo = new String[] {""} ;
      P09O94_A5532Lb_numero = new int[1] ;
      P09O94_A5538Lb_ColNomC = new String[] {""} ;
      P09O94_A5537Lb_ColNum = new int[1] ;
      P09O94_A5536Lb_ColNom = new String[] {""} ;
      P09O94_A5534Lb_ArtDsc = new String[] {""} ;
      P09O94_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O94_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O94_A5540Lb_Cartaz = new String[] {""} ;
      P09O94_A279CliNom = new String[] {""} ;
      P09O94_A252CliCod = new int[1] ;
      P09O95_A396EmprCod = new String[] {""} ;
      P09O95_A5569Lb_EstEns = new byte[1] ;
      P09O95_A5534Lb_ArtDsc = new String[] {""} ;
      P09O95_A5570Lb_Tipo = new String[] {""} ;
      P09O95_A5532Lb_numero = new int[1] ;
      P09O95_A5538Lb_ColNomC = new String[] {""} ;
      P09O95_A5537Lb_ColNum = new int[1] ;
      P09O95_A5536Lb_ColNom = new String[] {""} ;
      P09O95_A5533Lb_ArtCod = new String[] {""} ;
      P09O95_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O95_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O95_A5540Lb_Cartaz = new String[] {""} ;
      P09O95_A279CliNom = new String[] {""} ;
      P09O95_A252CliCod = new int[1] ;
      P09O96_A396EmprCod = new String[] {""} ;
      P09O96_A5569Lb_EstEns = new byte[1] ;
      P09O96_A5536Lb_ColNom = new String[] {""} ;
      P09O96_A5570Lb_Tipo = new String[] {""} ;
      P09O96_A5532Lb_numero = new int[1] ;
      P09O96_A5538Lb_ColNomC = new String[] {""} ;
      P09O96_A5537Lb_ColNum = new int[1] ;
      P09O96_A5534Lb_ArtDsc = new String[] {""} ;
      P09O96_A5533Lb_ArtCod = new String[] {""} ;
      P09O96_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O96_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O96_A5540Lb_Cartaz = new String[] {""} ;
      P09O96_A279CliNom = new String[] {""} ;
      P09O96_A252CliCod = new int[1] ;
      P09O97_A396EmprCod = new String[] {""} ;
      P09O97_A5569Lb_EstEns = new byte[1] ;
      P09O97_A5538Lb_ColNomC = new String[] {""} ;
      P09O97_A5570Lb_Tipo = new String[] {""} ;
      P09O97_A5532Lb_numero = new int[1] ;
      P09O97_A5537Lb_ColNum = new int[1] ;
      P09O97_A5536Lb_ColNom = new String[] {""} ;
      P09O97_A5534Lb_ArtDsc = new String[] {""} ;
      P09O97_A5533Lb_ArtCod = new String[] {""} ;
      P09O97_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O97_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O97_A5540Lb_Cartaz = new String[] {""} ;
      P09O97_A279CliNom = new String[] {""} ;
      P09O97_A252CliCod = new int[1] ;
      P09O98_A396EmprCod = new String[] {""} ;
      P09O98_A5569Lb_EstEns = new byte[1] ;
      P09O98_A5570Lb_Tipo = new String[] {""} ;
      P09O98_A5532Lb_numero = new int[1] ;
      P09O98_A5538Lb_ColNomC = new String[] {""} ;
      P09O98_A5537Lb_ColNum = new int[1] ;
      P09O98_A5536Lb_ColNom = new String[] {""} ;
      P09O98_A5534Lb_ArtDsc = new String[] {""} ;
      P09O98_A5533Lb_ArtCod = new String[] {""} ;
      P09O98_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O98_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O98_A5540Lb_Cartaz = new String[] {""} ;
      P09O98_A279CliNom = new String[] {""} ;
      P09O98_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayospendientes_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09O92_A396EmprCod, P09O92_A5569Lb_EstEns, P09O92_A279CliNom, P09O92_A5570Lb_Tipo, P09O92_A5532Lb_numero, P09O92_A5538Lb_ColNomC, P09O92_A5537Lb_ColNum, P09O92_A5536Lb_ColNom, P09O92_A5534Lb_ArtDsc, P09O92_A5533Lb_ArtCod,
            P09O92_A5541Lb_FechaE, P09O92_A5594Lb_cartazf, P09O92_A5540Lb_Cartaz, P09O92_A252CliCod
            }
            , new Object[] {
            P09O93_A396EmprCod, P09O93_A5569Lb_EstEns, P09O93_A5540Lb_Cartaz, P09O93_A5570Lb_Tipo, P09O93_A5532Lb_numero, P09O93_A5538Lb_ColNomC, P09O93_A5537Lb_ColNum, P09O93_A5536Lb_ColNom, P09O93_A5534Lb_ArtDsc, P09O93_A5533Lb_ArtCod,
            P09O93_A5541Lb_FechaE, P09O93_A5594Lb_cartazf, P09O93_A279CliNom, P09O93_A252CliCod
            }
            , new Object[] {
            P09O94_A396EmprCod, P09O94_A5569Lb_EstEns, P09O94_A5533Lb_ArtCod, P09O94_A5570Lb_Tipo, P09O94_A5532Lb_numero, P09O94_A5538Lb_ColNomC, P09O94_A5537Lb_ColNum, P09O94_A5536Lb_ColNom, P09O94_A5534Lb_ArtDsc, P09O94_A5541Lb_FechaE,
            P09O94_A5594Lb_cartazf, P09O94_A5540Lb_Cartaz, P09O94_A279CliNom, P09O94_A252CliCod
            }
            , new Object[] {
            P09O95_A396EmprCod, P09O95_A5569Lb_EstEns, P09O95_A5534Lb_ArtDsc, P09O95_A5570Lb_Tipo, P09O95_A5532Lb_numero, P09O95_A5538Lb_ColNomC, P09O95_A5537Lb_ColNum, P09O95_A5536Lb_ColNom, P09O95_A5533Lb_ArtCod, P09O95_A5541Lb_FechaE,
            P09O95_A5594Lb_cartazf, P09O95_A5540Lb_Cartaz, P09O95_A279CliNom, P09O95_A252CliCod
            }
            , new Object[] {
            P09O96_A396EmprCod, P09O96_A5569Lb_EstEns, P09O96_A5536Lb_ColNom, P09O96_A5570Lb_Tipo, P09O96_A5532Lb_numero, P09O96_A5538Lb_ColNomC, P09O96_A5537Lb_ColNum, P09O96_A5534Lb_ArtDsc, P09O96_A5533Lb_ArtCod, P09O96_A5541Lb_FechaE,
            P09O96_A5594Lb_cartazf, P09O96_A5540Lb_Cartaz, P09O96_A279CliNom, P09O96_A252CliCod
            }
            , new Object[] {
            P09O97_A396EmprCod, P09O97_A5569Lb_EstEns, P09O97_A5538Lb_ColNomC, P09O97_A5570Lb_Tipo, P09O97_A5532Lb_numero, P09O97_A5537Lb_ColNum, P09O97_A5536Lb_ColNom, P09O97_A5534Lb_ArtDsc, P09O97_A5533Lb_ArtCod, P09O97_A5541Lb_FechaE,
            P09O97_A5594Lb_cartazf, P09O97_A5540Lb_Cartaz, P09O97_A279CliNom, P09O97_A252CliCod
            }
            , new Object[] {
            P09O98_A396EmprCod, P09O98_A5569Lb_EstEns, P09O98_A5570Lb_Tipo, P09O98_A5532Lb_numero, P09O98_A5538Lb_ColNomC, P09O98_A5537Lb_ColNum, P09O98_A5536Lb_ColNom, P09O98_A5534Lb_ArtDsc, P09O98_A5533Lb_ArtCod, P09O98_A5541Lb_FechaE,
            P09O98_A5594Lb_cartazf, P09O98_A5540Lb_Cartaz, P09O98_A279CliNom, P09O98_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV26TFLb_ColNum ;
   private int AV27TFLb_ColNum_To ;
   private int AV30TFLb_numero ;
   private int AV31TFLb_numero_To ;
   private int AV54Clicod ;
   private int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ;
   private int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ;
   private int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ;
   private int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ;
   private int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ;
   private int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private long AV46count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFLb_Cartaz ;
   private String AV15TFLb_Cartaz_Sel ;
   private String AV20TFLb_ArtCod ;
   private String AV21TFLb_ArtCod_Sel ;
   private String AV22TFLb_ArtDsc ;
   private String AV23TFLb_ArtDsc_Sel ;
   private String AV24TFLb_ColNom ;
   private String AV25TFLb_ColNom_Sel ;
   private String AV28TFLb_ColNomC ;
   private String AV29TFLb_ColNomC_Sel ;
   private String AV32TFLb_Tipo ;
   private String AV33TFLb_Tipo_Sel ;
   private String AV53Emprcod ;
   private String A279CliNom ;
   private String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ;
   private String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ;
   private String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ;
   private String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ;
   private String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ;
   private String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ;
   private String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ;
   private String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ;
   private String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ;
   private String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ;
   private String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ;
   private String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ;
   private String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ;
   private String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ;
   private String scmdbuf ;
   private String lV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ;
   private String lV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ;
   private String lV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ;
   private String lV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ;
   private String lV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ;
   private String lV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ;
   private String lV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5570Lb_Tipo ;
   private String A396EmprCod ;
   private java.util.Date AV16TFLb_cartazf ;
   private java.util.Date AV18TFLb_FechaE ;
   private java.util.Date AV55Lb_FechaEfrom ;
   private java.util.Date AV56Lb_FechaEto ;
   private java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ;
   private java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean returnInSub ;
   private boolean brk9O92 ;
   private boolean brk9O94 ;
   private boolean brk9O96 ;
   private boolean brk9O98 ;
   private boolean brk9O910 ;
   private boolean brk9O912 ;
   private boolean brk9O914 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ;
   private String lV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09O92_A396EmprCod ;
   private byte[] P09O92_A5569Lb_EstEns ;
   private String[] P09O92_A279CliNom ;
   private String[] P09O92_A5570Lb_Tipo ;
   private int[] P09O92_A5532Lb_numero ;
   private String[] P09O92_A5538Lb_ColNomC ;
   private int[] P09O92_A5537Lb_ColNum ;
   private String[] P09O92_A5536Lb_ColNom ;
   private String[] P09O92_A5534Lb_ArtDsc ;
   private String[] P09O92_A5533Lb_ArtCod ;
   private java.util.Date[] P09O92_A5541Lb_FechaE ;
   private java.util.Date[] P09O92_A5594Lb_cartazf ;
   private String[] P09O92_A5540Lb_Cartaz ;
   private int[] P09O92_A252CliCod ;
   private String[] P09O93_A396EmprCod ;
   private byte[] P09O93_A5569Lb_EstEns ;
   private String[] P09O93_A5540Lb_Cartaz ;
   private String[] P09O93_A5570Lb_Tipo ;
   private int[] P09O93_A5532Lb_numero ;
   private String[] P09O93_A5538Lb_ColNomC ;
   private int[] P09O93_A5537Lb_ColNum ;
   private String[] P09O93_A5536Lb_ColNom ;
   private String[] P09O93_A5534Lb_ArtDsc ;
   private String[] P09O93_A5533Lb_ArtCod ;
   private java.util.Date[] P09O93_A5541Lb_FechaE ;
   private java.util.Date[] P09O93_A5594Lb_cartazf ;
   private String[] P09O93_A279CliNom ;
   private int[] P09O93_A252CliCod ;
   private String[] P09O94_A396EmprCod ;
   private byte[] P09O94_A5569Lb_EstEns ;
   private String[] P09O94_A5533Lb_ArtCod ;
   private String[] P09O94_A5570Lb_Tipo ;
   private int[] P09O94_A5532Lb_numero ;
   private String[] P09O94_A5538Lb_ColNomC ;
   private int[] P09O94_A5537Lb_ColNum ;
   private String[] P09O94_A5536Lb_ColNom ;
   private String[] P09O94_A5534Lb_ArtDsc ;
   private java.util.Date[] P09O94_A5541Lb_FechaE ;
   private java.util.Date[] P09O94_A5594Lb_cartazf ;
   private String[] P09O94_A5540Lb_Cartaz ;
   private String[] P09O94_A279CliNom ;
   private int[] P09O94_A252CliCod ;
   private String[] P09O95_A396EmprCod ;
   private byte[] P09O95_A5569Lb_EstEns ;
   private String[] P09O95_A5534Lb_ArtDsc ;
   private String[] P09O95_A5570Lb_Tipo ;
   private int[] P09O95_A5532Lb_numero ;
   private String[] P09O95_A5538Lb_ColNomC ;
   private int[] P09O95_A5537Lb_ColNum ;
   private String[] P09O95_A5536Lb_ColNom ;
   private String[] P09O95_A5533Lb_ArtCod ;
   private java.util.Date[] P09O95_A5541Lb_FechaE ;
   private java.util.Date[] P09O95_A5594Lb_cartazf ;
   private String[] P09O95_A5540Lb_Cartaz ;
   private String[] P09O95_A279CliNom ;
   private int[] P09O95_A252CliCod ;
   private String[] P09O96_A396EmprCod ;
   private byte[] P09O96_A5569Lb_EstEns ;
   private String[] P09O96_A5536Lb_ColNom ;
   private String[] P09O96_A5570Lb_Tipo ;
   private int[] P09O96_A5532Lb_numero ;
   private String[] P09O96_A5538Lb_ColNomC ;
   private int[] P09O96_A5537Lb_ColNum ;
   private String[] P09O96_A5534Lb_ArtDsc ;
   private String[] P09O96_A5533Lb_ArtCod ;
   private java.util.Date[] P09O96_A5541Lb_FechaE ;
   private java.util.Date[] P09O96_A5594Lb_cartazf ;
   private String[] P09O96_A5540Lb_Cartaz ;
   private String[] P09O96_A279CliNom ;
   private int[] P09O96_A252CliCod ;
   private String[] P09O97_A396EmprCod ;
   private byte[] P09O97_A5569Lb_EstEns ;
   private String[] P09O97_A5538Lb_ColNomC ;
   private String[] P09O97_A5570Lb_Tipo ;
   private int[] P09O97_A5532Lb_numero ;
   private int[] P09O97_A5537Lb_ColNum ;
   private String[] P09O97_A5536Lb_ColNom ;
   private String[] P09O97_A5534Lb_ArtDsc ;
   private String[] P09O97_A5533Lb_ArtCod ;
   private java.util.Date[] P09O97_A5541Lb_FechaE ;
   private java.util.Date[] P09O97_A5594Lb_cartazf ;
   private String[] P09O97_A5540Lb_Cartaz ;
   private String[] P09O97_A279CliNom ;
   private int[] P09O97_A252CliCod ;
   private String[] P09O98_A396EmprCod ;
   private byte[] P09O98_A5569Lb_EstEns ;
   private String[] P09O98_A5570Lb_Tipo ;
   private int[] P09O98_A5532Lb_numero ;
   private String[] P09O98_A5538Lb_ColNomC ;
   private int[] P09O98_A5537Lb_ColNum ;
   private String[] P09O98_A5536Lb_ColNom ;
   private String[] P09O98_A5534Lb_ArtDsc ;
   private String[] P09O98_A5533Lb_ArtCod ;
   private java.util.Date[] P09O98_A5541Lb_FechaE ;
   private java.util.Date[] P09O98_A5594Lb_cartazf ;
   private String[] P09O98_A5540Lb_Cartaz ;
   private String[] P09O98_A279CliNom ;
   private int[] P09O98_A252CliCod ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class ensayospendientes_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09O92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV54Clicod ,
                                          java.util.Date AV55Lb_FechaEfrom ,
                                          java.util.Date AV56Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[36];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_EstEns, T2.CliNom, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf," ;
      scmdbuf += " T1.Lb_Cartaz, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09O93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV54Clicod ,
                                          java.util.Date AV55Lb_FechaEfrom ,
                                          java.util.Date AV56Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[36];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_EstEns, T1.Lb_Cartaz, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09O94( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV54Clicod ,
                                          java.util.Date AV55Lb_FechaEfrom ,
                                          java.util.Date AV56Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[36];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_EstEns, T1.Lb_ArtCod, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_FechaE, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09O95( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV54Clicod ,
                                          java.util.Date AV55Lb_FechaEfrom ,
                                          java.util.Date AV56Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[36];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_EstEns, T1.Lb_ArtDsc, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09O96( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV54Clicod ,
                                          java.util.Date AV55Lb_FechaEfrom ,
                                          java.util.Date AV56Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[36];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_EstEns, T1.Lb_ColNom, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09O97( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV54Clicod ,
                                          java.util.Date AV55Lb_FechaEfrom ,
                                          java.util.Date AV56Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[36];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_EstEns, T1.Lb_ColNomC, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09O98( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV54Clicod ,
                                          java.util.Date AV55Lb_FechaEfrom ,
                                          java.util.Date AV56Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV53Emprcod ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[36];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV62Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV63Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P09O92(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
            case 1 :
                  return conditional_P09O93(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
            case 2 :
                  return conditional_P09O94(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
            case 3 :
                  return conditional_P09O95(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
            case 4 :
                  return conditional_P09O96(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
            case 5 :
                  return conditional_P09O97(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
            case 6 :
                  return conditional_P09O98(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09O92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O94", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O95", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O96", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O97", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O98", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
      }
   }

}

