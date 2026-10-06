package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayospendientesenvio_wcgetfilterdata extends GXProcedure
{
   public ensayospendientesenvio_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayospendientesenvio_wcgetfilterdata.class ), "" );
   }

   public ensayospendientesenvio_wcgetfilterdata( int remoteHandle ,
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
      ensayospendientesenvio_wcgetfilterdata.this.aP5 = new String[] {""};
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
      ensayospendientesenvio_wcgetfilterdata.this.AV42DDOName = aP0;
      ensayospendientesenvio_wcgetfilterdata.this.AV43SearchTxt = aP1;
      ensayospendientesenvio_wcgetfilterdata.this.AV44SearchTxtTo = aP2;
      ensayospendientesenvio_wcgetfilterdata.this.aP3 = aP3;
      ensayospendientesenvio_wcgetfilterdata.this.aP4 = aP4;
      ensayospendientesenvio_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LB_CARTAZ") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LB_ARTCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LB_ARTDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LB_COLNOMC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LB_COLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LB_TIPO") == 0 )
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
      AV45OptionsJson = AV32Options.toJSonString(false) ;
      AV46OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV35OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV10TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV11TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV12TFLb_numero = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFLb_numero_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV14TFLb_Cartaz = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV15TFLb_Cartaz_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV16TFLb_cartazf = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV18TFLb_ArtCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV19TFLb_ArtCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV20TFLb_ArtDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV21TFLb_ArtDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV22TFLb_ColNomC = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV23TFLb_ColNomC_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV24TFLb_ColNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV25TFLb_ColNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV26TFLb_ColNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFLb_ColNum_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV28TFLb_FechaE = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV55TFLb_Tipo = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV56TFLb_Tipo_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV52Clicod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV53Lb_fechaefrom = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV54Lb_fechaeto = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFCliNom = AV43SearchTxt ;
      AV11TFCliNom_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV48FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV10TFCliNom ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV12TFLb_numero ;
      AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV13TFLb_numero_To ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV18TFLb_ArtCod ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV19TFLb_ArtCod_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV20TFLb_ArtDsc ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV21TFLb_ArtDsc_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV22TFLb_ColNomC ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV23TFLb_ColNomC_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV24TFLb_ColNom ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV26TFLb_ColNum ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV28TFLb_FechaE ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV55TFLb_Tipo ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV56TFLb_Tipo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53Lb_fechaefrom ,
                                           AV54Lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PO2 */
      pr_default.execute(0, new Object[] {AV51Emprcod, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV52Clicod), AV53Lb_fechaefrom, AV54Lb_fechaeto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9PO2 = false ;
         A5569Lb_EstEns = P09PO2_A5569Lb_EstEns[0] ;
         A279CliNom = P09PO2_A279CliNom[0] ;
         A252CliCod = P09PO2_A252CliCod[0] ;
         A5570Lb_Tipo = P09PO2_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PO2_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PO2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PO2_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09PO2_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = P09PO2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09PO2_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PO2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PO2_A5540Lb_Cartaz[0] ;
         A5532Lb_numero = P09PO2_A5532Lb_numero[0] ;
         A396EmprCod = P09PO2_A396EmprCod[0] ;
         A279CliNom = P09PO2_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09PO2_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk9PO2 = false ;
               A252CliCod = P09PO2_A252CliCod[0] ;
               A5532Lb_numero = P09PO2_A5532Lb_numero[0] ;
               A396EmprCod = P09PO2_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk9PO2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV31Option = A279CliNom ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PO2 )
         {
            brk9PO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV14TFLb_Cartaz = AV43SearchTxt ;
      AV15TFLb_Cartaz_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV48FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV10TFCliNom ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV12TFLb_numero ;
      AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV13TFLb_numero_To ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV18TFLb_ArtCod ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV19TFLb_ArtCod_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV20TFLb_ArtDsc ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV21TFLb_ArtDsc_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV22TFLb_ColNomC ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV23TFLb_ColNomC_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV24TFLb_ColNom ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV26TFLb_ColNum ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV28TFLb_FechaE ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV55TFLb_Tipo ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV56TFLb_Tipo_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53Lb_fechaefrom ,
                                           AV54Lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PO3 */
      pr_default.execute(1, new Object[] {AV51Emprcod, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV52Clicod), AV53Lb_fechaefrom, AV54Lb_fechaeto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9PO4 = false ;
         A5569Lb_EstEns = P09PO3_A5569Lb_EstEns[0] ;
         A5540Lb_Cartaz = P09PO3_A5540Lb_Cartaz[0] ;
         A252CliCod = P09PO3_A252CliCod[0] ;
         A5570Lb_Tipo = P09PO3_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PO3_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PO3_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PO3_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09PO3_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = P09PO3_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09PO3_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PO3_A5594Lb_cartazf[0] ;
         A279CliNom = P09PO3_A279CliNom[0] ;
         A5532Lb_numero = P09PO3_A5532Lb_numero[0] ;
         A396EmprCod = P09PO3_A396EmprCod[0] ;
         A279CliNom = P09PO3_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09PO3_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
            {
               brk9PO4 = false ;
               A5532Lb_numero = P09PO3_A5532Lb_numero[0] ;
               A396EmprCod = P09PO3_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk9PO4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A5540Lb_Cartaz)==0) )
            {
               AV31Option = A5540Lb_Cartaz ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PO4 )
         {
            brk9PO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFLb_ArtCod = AV43SearchTxt ;
      AV19TFLb_ArtCod_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV48FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV10TFCliNom ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV12TFLb_numero ;
      AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV13TFLb_numero_To ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV18TFLb_ArtCod ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV19TFLb_ArtCod_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV20TFLb_ArtDsc ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV21TFLb_ArtDsc_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV22TFLb_ColNomC ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV23TFLb_ColNomC_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV24TFLb_ColNom ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV26TFLb_ColNum ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV28TFLb_FechaE ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV55TFLb_Tipo ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV56TFLb_Tipo_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53Lb_fechaefrom ,
                                           AV54Lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PO4 */
      pr_default.execute(2, new Object[] {AV51Emprcod, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV52Clicod), AV53Lb_fechaefrom, AV54Lb_fechaeto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9PO6 = false ;
         A5569Lb_EstEns = P09PO4_A5569Lb_EstEns[0] ;
         A5533Lb_ArtCod = P09PO4_A5533Lb_ArtCod[0] ;
         A252CliCod = P09PO4_A252CliCod[0] ;
         A5570Lb_Tipo = P09PO4_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PO4_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PO4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PO4_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09PO4_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = P09PO4_A5534Lb_ArtDsc[0] ;
         A5594Lb_cartazf = P09PO4_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PO4_A5540Lb_Cartaz[0] ;
         A279CliNom = P09PO4_A279CliNom[0] ;
         A5532Lb_numero = P09PO4_A5532Lb_numero[0] ;
         A396EmprCod = P09PO4_A396EmprCod[0] ;
         A279CliNom = P09PO4_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09PO4_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
            {
               brk9PO6 = false ;
               A5532Lb_numero = P09PO4_A5532Lb_numero[0] ;
               A396EmprCod = P09PO4_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk9PO6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
            {
               AV31Option = A5533Lb_ArtCod ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PO6 )
         {
            brk9PO6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_ARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFLb_ArtDsc = AV43SearchTxt ;
      AV21TFLb_ArtDsc_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV48FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV10TFCliNom ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV12TFLb_numero ;
      AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV13TFLb_numero_To ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV18TFLb_ArtCod ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV19TFLb_ArtCod_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV20TFLb_ArtDsc ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV21TFLb_ArtDsc_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV22TFLb_ColNomC ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV23TFLb_ColNomC_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV24TFLb_ColNom ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV26TFLb_ColNum ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV28TFLb_FechaE ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV55TFLb_Tipo ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV56TFLb_Tipo_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53Lb_fechaefrom ,
                                           AV54Lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PO5 */
      pr_default.execute(3, new Object[] {AV51Emprcod, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV52Clicod), AV53Lb_fechaefrom, AV54Lb_fechaeto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9PO8 = false ;
         A5569Lb_EstEns = P09PO5_A5569Lb_EstEns[0] ;
         A5534Lb_ArtDsc = P09PO5_A5534Lb_ArtDsc[0] ;
         A252CliCod = P09PO5_A252CliCod[0] ;
         A5570Lb_Tipo = P09PO5_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PO5_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PO5_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PO5_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09PO5_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09PO5_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PO5_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PO5_A5540Lb_Cartaz[0] ;
         A279CliNom = P09PO5_A279CliNom[0] ;
         A5532Lb_numero = P09PO5_A5532Lb_numero[0] ;
         A396EmprCod = P09PO5_A396EmprCod[0] ;
         A279CliNom = P09PO5_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09PO5_A5534Lb_ArtDsc[0], A5534Lb_ArtDsc) == 0 ) )
            {
               brk9PO8 = false ;
               A5532Lb_numero = P09PO5_A5532Lb_numero[0] ;
               A396EmprCod = P09PO5_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk9PO8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A5534Lb_ArtDsc)==0) )
            {
               AV31Option = A5534Lb_ArtDsc ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PO8 )
         {
            brk9PO8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_COLNOMCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLb_ColNomC = AV43SearchTxt ;
      AV23TFLb_ColNomC_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV48FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV10TFCliNom ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV12TFLb_numero ;
      AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV13TFLb_numero_To ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV18TFLb_ArtCod ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV19TFLb_ArtCod_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV20TFLb_ArtDsc ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV21TFLb_ArtDsc_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV22TFLb_ColNomC ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV23TFLb_ColNomC_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV24TFLb_ColNom ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV26TFLb_ColNum ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV28TFLb_FechaE ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV55TFLb_Tipo ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV56TFLb_Tipo_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53Lb_fechaefrom ,
                                           AV54Lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PO6 */
      pr_default.execute(4, new Object[] {AV51Emprcod, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV52Clicod), AV53Lb_fechaefrom, AV54Lb_fechaeto});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9PO10 = false ;
         A5569Lb_EstEns = P09PO6_A5569Lb_EstEns[0] ;
         A5538Lb_ColNomC = P09PO6_A5538Lb_ColNomC[0] ;
         A252CliCod = P09PO6_A252CliCod[0] ;
         A5570Lb_Tipo = P09PO6_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PO6_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PO6_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PO6_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09PO6_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09PO6_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PO6_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PO6_A5540Lb_Cartaz[0] ;
         A279CliNom = P09PO6_A279CliNom[0] ;
         A5532Lb_numero = P09PO6_A5532Lb_numero[0] ;
         A396EmprCod = P09PO6_A396EmprCod[0] ;
         A279CliNom = P09PO6_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09PO6_A5538Lb_ColNomC[0], A5538Lb_ColNomC) == 0 ) )
            {
               brk9PO10 = false ;
               A5532Lb_numero = P09PO6_A5532Lb_numero[0] ;
               A396EmprCod = P09PO6_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk9PO10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
            {
               AV31Option = A5538Lb_ColNomC ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PO10 )
         {
            brk9PO10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADLB_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFLb_ColNom = AV43SearchTxt ;
      AV25TFLb_ColNom_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV48FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV10TFCliNom ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV12TFLb_numero ;
      AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV13TFLb_numero_To ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV18TFLb_ArtCod ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV19TFLb_ArtCod_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV20TFLb_ArtDsc ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV21TFLb_ArtDsc_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV22TFLb_ColNomC ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV23TFLb_ColNomC_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV24TFLb_ColNom ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV26TFLb_ColNum ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV28TFLb_FechaE ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV55TFLb_Tipo ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV56TFLb_Tipo_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53Lb_fechaefrom ,
                                           AV54Lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PO7 */
      pr_default.execute(5, new Object[] {AV51Emprcod, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV52Clicod), AV53Lb_fechaefrom, AV54Lb_fechaeto});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9PO12 = false ;
         A5569Lb_EstEns = P09PO7_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09PO7_A5536Lb_ColNom[0] ;
         A252CliCod = P09PO7_A252CliCod[0] ;
         A5570Lb_Tipo = P09PO7_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PO7_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PO7_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09PO7_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = P09PO7_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09PO7_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PO7_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PO7_A5540Lb_Cartaz[0] ;
         A279CliNom = P09PO7_A279CliNom[0] ;
         A5532Lb_numero = P09PO7_A5532Lb_numero[0] ;
         A396EmprCod = P09PO7_A396EmprCod[0] ;
         A279CliNom = P09PO7_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09PO7_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
            {
               brk9PO12 = false ;
               A5532Lb_numero = P09PO7_A5532Lb_numero[0] ;
               A396EmprCod = P09PO7_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk9PO12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A5536Lb_ColNom)==0) )
            {
               AV31Option = A5536Lb_ColNom ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PO12 )
         {
            brk9PO12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADLB_TIPOOPTIONS' Routine */
      returnInSub = false ;
      AV55TFLb_Tipo = AV43SearchTxt ;
      AV56TFLb_Tipo_Sel = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV48FilterFullText ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV10TFCliNom ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV12TFLb_numero ;
      AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV13TFLb_numero_To ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV14TFLb_Cartaz ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV15TFLb_Cartaz_Sel ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV16TFLb_cartazf ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV18TFLb_ArtCod ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV19TFLb_ArtCod_Sel ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV20TFLb_ArtDsc ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV21TFLb_ArtDsc_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV22TFLb_ColNomC ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV23TFLb_ColNomC_Sel ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV24TFLb_ColNom ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV26TFLb_ColNum ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV28TFLb_FechaE ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV55TFLb_Tipo ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV56TFLb_Tipo_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV52Clicod) ,
                                           AV53Lb_fechaefrom ,
                                           AV54Lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV51Emprcod ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PO8 */
      pr_default.execute(6, new Object[] {AV51Emprcod, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV52Clicod), AV53Lb_fechaefrom, AV54Lb_fechaeto});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9PO14 = false ;
         A5569Lb_EstEns = P09PO8_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09PO8_A5570Lb_Tipo[0] ;
         A252CliCod = P09PO8_A252CliCod[0] ;
         A5541Lb_FechaE = P09PO8_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PO8_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PO8_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09PO8_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = P09PO8_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09PO8_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PO8_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PO8_A5540Lb_Cartaz[0] ;
         A279CliNom = P09PO8_A279CliNom[0] ;
         A5532Lb_numero = P09PO8_A5532Lb_numero[0] ;
         A396EmprCod = P09PO8_A396EmprCod[0] ;
         A279CliNom = P09PO8_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09PO8_A5570Lb_Tipo[0], A5570Lb_Tipo) == 0 ) )
            {
               brk9PO14 = false ;
               A5532Lb_numero = P09PO8_A5532Lb_numero[0] ;
               A396EmprCod = P09PO8_A396EmprCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk9PO14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A5570Lb_Tipo)==0) )
            {
               AV31Option = A5570Lb_Tipo ;
               AV32Options.add(AV31Option, 0);
               AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV32Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PO14 )
         {
            brk9PO14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ensayospendientesenvio_wcgetfilterdata.this.AV45OptionsJson;
      this.aP4[0] = ensayospendientesenvio_wcgetfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = ensayospendientesenvio_wcgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45OptionsJson = "" ;
      AV46OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV10TFCliNom = "" ;
      AV11TFCliNom_Sel = "" ;
      AV14TFLb_Cartaz = "" ;
      AV15TFLb_Cartaz_Sel = "" ;
      AV16TFLb_cartazf = GXutil.nullDate() ;
      AV18TFLb_ArtCod = "" ;
      AV19TFLb_ArtCod_Sel = "" ;
      AV20TFLb_ArtDsc = "" ;
      AV21TFLb_ArtDsc_Sel = "" ;
      AV22TFLb_ColNomC = "" ;
      AV23TFLb_ColNomC_Sel = "" ;
      AV24TFLb_ColNom = "" ;
      AV25TFLb_ColNom_Sel = "" ;
      AV28TFLb_FechaE = GXutil.nullDate() ;
      AV55TFLb_Tipo = "" ;
      AV56TFLb_Tipo_Sel = "" ;
      AV51Emprcod = "" ;
      AV53Lb_fechaefrom = GXutil.nullDate() ;
      AV54Lb_fechaeto = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = "" ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = "" ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = GXutil.nullDate() ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = "" ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = "" ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = "" ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = "" ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = GXutil.nullDate() ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = "" ;
      scmdbuf = "" ;
      lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5570Lb_Tipo = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09PO2_A5569Lb_EstEns = new byte[1] ;
      P09PO2_A279CliNom = new String[] {""} ;
      P09PO2_A252CliCod = new int[1] ;
      P09PO2_A5570Lb_Tipo = new String[] {""} ;
      P09PO2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO2_A5537Lb_ColNum = new int[1] ;
      P09PO2_A5536Lb_ColNom = new String[] {""} ;
      P09PO2_A5538Lb_ColNomC = new String[] {""} ;
      P09PO2_A5534Lb_ArtDsc = new String[] {""} ;
      P09PO2_A5533Lb_ArtCod = new String[] {""} ;
      P09PO2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO2_A5540Lb_Cartaz = new String[] {""} ;
      P09PO2_A5532Lb_numero = new int[1] ;
      P09PO2_A396EmprCod = new String[] {""} ;
      AV31Option = "" ;
      P09PO3_A5569Lb_EstEns = new byte[1] ;
      P09PO3_A5540Lb_Cartaz = new String[] {""} ;
      P09PO3_A252CliCod = new int[1] ;
      P09PO3_A5570Lb_Tipo = new String[] {""} ;
      P09PO3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO3_A5537Lb_ColNum = new int[1] ;
      P09PO3_A5536Lb_ColNom = new String[] {""} ;
      P09PO3_A5538Lb_ColNomC = new String[] {""} ;
      P09PO3_A5534Lb_ArtDsc = new String[] {""} ;
      P09PO3_A5533Lb_ArtCod = new String[] {""} ;
      P09PO3_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO3_A279CliNom = new String[] {""} ;
      P09PO3_A5532Lb_numero = new int[1] ;
      P09PO3_A396EmprCod = new String[] {""} ;
      P09PO4_A5569Lb_EstEns = new byte[1] ;
      P09PO4_A5533Lb_ArtCod = new String[] {""} ;
      P09PO4_A252CliCod = new int[1] ;
      P09PO4_A5570Lb_Tipo = new String[] {""} ;
      P09PO4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO4_A5537Lb_ColNum = new int[1] ;
      P09PO4_A5536Lb_ColNom = new String[] {""} ;
      P09PO4_A5538Lb_ColNomC = new String[] {""} ;
      P09PO4_A5534Lb_ArtDsc = new String[] {""} ;
      P09PO4_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO4_A5540Lb_Cartaz = new String[] {""} ;
      P09PO4_A279CliNom = new String[] {""} ;
      P09PO4_A5532Lb_numero = new int[1] ;
      P09PO4_A396EmprCod = new String[] {""} ;
      P09PO5_A5569Lb_EstEns = new byte[1] ;
      P09PO5_A5534Lb_ArtDsc = new String[] {""} ;
      P09PO5_A252CliCod = new int[1] ;
      P09PO5_A5570Lb_Tipo = new String[] {""} ;
      P09PO5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO5_A5537Lb_ColNum = new int[1] ;
      P09PO5_A5536Lb_ColNom = new String[] {""} ;
      P09PO5_A5538Lb_ColNomC = new String[] {""} ;
      P09PO5_A5533Lb_ArtCod = new String[] {""} ;
      P09PO5_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO5_A5540Lb_Cartaz = new String[] {""} ;
      P09PO5_A279CliNom = new String[] {""} ;
      P09PO5_A5532Lb_numero = new int[1] ;
      P09PO5_A396EmprCod = new String[] {""} ;
      P09PO6_A5569Lb_EstEns = new byte[1] ;
      P09PO6_A5538Lb_ColNomC = new String[] {""} ;
      P09PO6_A252CliCod = new int[1] ;
      P09PO6_A5570Lb_Tipo = new String[] {""} ;
      P09PO6_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO6_A5537Lb_ColNum = new int[1] ;
      P09PO6_A5536Lb_ColNom = new String[] {""} ;
      P09PO6_A5534Lb_ArtDsc = new String[] {""} ;
      P09PO6_A5533Lb_ArtCod = new String[] {""} ;
      P09PO6_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO6_A5540Lb_Cartaz = new String[] {""} ;
      P09PO6_A279CliNom = new String[] {""} ;
      P09PO6_A5532Lb_numero = new int[1] ;
      P09PO6_A396EmprCod = new String[] {""} ;
      P09PO7_A5569Lb_EstEns = new byte[1] ;
      P09PO7_A5536Lb_ColNom = new String[] {""} ;
      P09PO7_A252CliCod = new int[1] ;
      P09PO7_A5570Lb_Tipo = new String[] {""} ;
      P09PO7_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO7_A5537Lb_ColNum = new int[1] ;
      P09PO7_A5538Lb_ColNomC = new String[] {""} ;
      P09PO7_A5534Lb_ArtDsc = new String[] {""} ;
      P09PO7_A5533Lb_ArtCod = new String[] {""} ;
      P09PO7_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO7_A5540Lb_Cartaz = new String[] {""} ;
      P09PO7_A279CliNom = new String[] {""} ;
      P09PO7_A5532Lb_numero = new int[1] ;
      P09PO7_A396EmprCod = new String[] {""} ;
      P09PO8_A5569Lb_EstEns = new byte[1] ;
      P09PO8_A5570Lb_Tipo = new String[] {""} ;
      P09PO8_A252CliCod = new int[1] ;
      P09PO8_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO8_A5537Lb_ColNum = new int[1] ;
      P09PO8_A5536Lb_ColNom = new String[] {""} ;
      P09PO8_A5538Lb_ColNomC = new String[] {""} ;
      P09PO8_A5534Lb_ArtDsc = new String[] {""} ;
      P09PO8_A5533Lb_ArtCod = new String[] {""} ;
      P09PO8_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PO8_A5540Lb_Cartaz = new String[] {""} ;
      P09PO8_A279CliNom = new String[] {""} ;
      P09PO8_A5532Lb_numero = new int[1] ;
      P09PO8_A396EmprCod = new String[] {""} ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayospendientesenvio_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09PO2_A5569Lb_EstEns, P09PO2_A279CliNom, P09PO2_A252CliCod, P09PO2_A5570Lb_Tipo, P09PO2_A5541Lb_FechaE, P09PO2_A5537Lb_ColNum, P09PO2_A5536Lb_ColNom, P09PO2_A5538Lb_ColNomC, P09PO2_A5534Lb_ArtDsc, P09PO2_A5533Lb_ArtCod,
            P09PO2_A5594Lb_cartazf, P09PO2_A5540Lb_Cartaz, P09PO2_A5532Lb_numero, P09PO2_A396EmprCod
            }
            , new Object[] {
            P09PO3_A5569Lb_EstEns, P09PO3_A5540Lb_Cartaz, P09PO3_A252CliCod, P09PO3_A5570Lb_Tipo, P09PO3_A5541Lb_FechaE, P09PO3_A5537Lb_ColNum, P09PO3_A5536Lb_ColNom, P09PO3_A5538Lb_ColNomC, P09PO3_A5534Lb_ArtDsc, P09PO3_A5533Lb_ArtCod,
            P09PO3_A5594Lb_cartazf, P09PO3_A279CliNom, P09PO3_A5532Lb_numero, P09PO3_A396EmprCod
            }
            , new Object[] {
            P09PO4_A5569Lb_EstEns, P09PO4_A5533Lb_ArtCod, P09PO4_A252CliCod, P09PO4_A5570Lb_Tipo, P09PO4_A5541Lb_FechaE, P09PO4_A5537Lb_ColNum, P09PO4_A5536Lb_ColNom, P09PO4_A5538Lb_ColNomC, P09PO4_A5534Lb_ArtDsc, P09PO4_A5594Lb_cartazf,
            P09PO4_A5540Lb_Cartaz, P09PO4_A279CliNom, P09PO4_A5532Lb_numero, P09PO4_A396EmprCod
            }
            , new Object[] {
            P09PO5_A5569Lb_EstEns, P09PO5_A5534Lb_ArtDsc, P09PO5_A252CliCod, P09PO5_A5570Lb_Tipo, P09PO5_A5541Lb_FechaE, P09PO5_A5537Lb_ColNum, P09PO5_A5536Lb_ColNom, P09PO5_A5538Lb_ColNomC, P09PO5_A5533Lb_ArtCod, P09PO5_A5594Lb_cartazf,
            P09PO5_A5540Lb_Cartaz, P09PO5_A279CliNom, P09PO5_A5532Lb_numero, P09PO5_A396EmprCod
            }
            , new Object[] {
            P09PO6_A5569Lb_EstEns, P09PO6_A5538Lb_ColNomC, P09PO6_A252CliCod, P09PO6_A5570Lb_Tipo, P09PO6_A5541Lb_FechaE, P09PO6_A5537Lb_ColNum, P09PO6_A5536Lb_ColNom, P09PO6_A5534Lb_ArtDsc, P09PO6_A5533Lb_ArtCod, P09PO6_A5594Lb_cartazf,
            P09PO6_A5540Lb_Cartaz, P09PO6_A279CliNom, P09PO6_A5532Lb_numero, P09PO6_A396EmprCod
            }
            , new Object[] {
            P09PO7_A5569Lb_EstEns, P09PO7_A5536Lb_ColNom, P09PO7_A252CliCod, P09PO7_A5570Lb_Tipo, P09PO7_A5541Lb_FechaE, P09PO7_A5537Lb_ColNum, P09PO7_A5538Lb_ColNomC, P09PO7_A5534Lb_ArtDsc, P09PO7_A5533Lb_ArtCod, P09PO7_A5594Lb_cartazf,
            P09PO7_A5540Lb_Cartaz, P09PO7_A279CliNom, P09PO7_A5532Lb_numero, P09PO7_A396EmprCod
            }
            , new Object[] {
            P09PO8_A5569Lb_EstEns, P09PO8_A5570Lb_Tipo, P09PO8_A252CliCod, P09PO8_A5541Lb_FechaE, P09PO8_A5537Lb_ColNum, P09PO8_A5536Lb_ColNom, P09PO8_A5538Lb_ColNomC, P09PO8_A5534Lb_ArtDsc, P09PO8_A5533Lb_ArtCod, P09PO8_A5594Lb_cartazf,
            P09PO8_A5540Lb_Cartaz, P09PO8_A279CliNom, P09PO8_A5532Lb_numero, P09PO8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private byte A14098Lb_Enviado ;
   private byte GXt_int2 ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int AV12TFLb_numero ;
   private int AV13TFLb_numero_To ;
   private int AV26TFLb_ColNum ;
   private int AV27TFLb_ColNum_To ;
   private int AV52Clicod ;
   private int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ;
   private int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ;
   private int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ;
   private int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int GXv_int4[] ;
   private long AV36count ;
   private String AV10TFCliNom ;
   private String AV11TFCliNom_Sel ;
   private String AV14TFLb_Cartaz ;
   private String AV15TFLb_Cartaz_Sel ;
   private String AV18TFLb_ArtCod ;
   private String AV19TFLb_ArtCod_Sel ;
   private String AV20TFLb_ArtDsc ;
   private String AV21TFLb_ArtDsc_Sel ;
   private String AV22TFLb_ColNomC ;
   private String AV23TFLb_ColNomC_Sel ;
   private String AV24TFLb_ColNom ;
   private String AV25TFLb_ColNom_Sel ;
   private String AV55TFLb_Tipo ;
   private String AV56TFLb_Tipo_Sel ;
   private String AV51Emprcod ;
   private String A279CliNom ;
   private String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ;
   private String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ;
   private String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ;
   private String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ;
   private String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ;
   private String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ;
   private String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ;
   private String scmdbuf ;
   private String lV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String lV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String lV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String lV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String lV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String lV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String lV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5570Lb_Tipo ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private java.util.Date AV16TFLb_cartazf ;
   private java.util.Date AV28TFLb_FechaE ;
   private java.util.Date AV53Lb_fechaefrom ;
   private java.util.Date AV54Lb_fechaeto ;
   private java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ;
   private java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean returnInSub ;
   private boolean brk9PO2 ;
   private boolean brk9PO4 ;
   private boolean brk9PO6 ;
   private boolean brk9PO8 ;
   private boolean brk9PO10 ;
   private boolean brk9PO12 ;
   private boolean brk9PO14 ;
   private String AV45OptionsJson ;
   private String AV46OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV43SearchTxt ;
   private String AV44SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private String lV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private String AV31Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09PO2_A5569Lb_EstEns ;
   private String[] P09PO2_A279CliNom ;
   private int[] P09PO2_A252CliCod ;
   private String[] P09PO2_A5570Lb_Tipo ;
   private java.util.Date[] P09PO2_A5541Lb_FechaE ;
   private int[] P09PO2_A5537Lb_ColNum ;
   private String[] P09PO2_A5536Lb_ColNom ;
   private String[] P09PO2_A5538Lb_ColNomC ;
   private String[] P09PO2_A5534Lb_ArtDsc ;
   private String[] P09PO2_A5533Lb_ArtCod ;
   private java.util.Date[] P09PO2_A5594Lb_cartazf ;
   private String[] P09PO2_A5540Lb_Cartaz ;
   private int[] P09PO2_A5532Lb_numero ;
   private String[] P09PO2_A396EmprCod ;
   private byte[] P09PO3_A5569Lb_EstEns ;
   private String[] P09PO3_A5540Lb_Cartaz ;
   private int[] P09PO3_A252CliCod ;
   private String[] P09PO3_A5570Lb_Tipo ;
   private java.util.Date[] P09PO3_A5541Lb_FechaE ;
   private int[] P09PO3_A5537Lb_ColNum ;
   private String[] P09PO3_A5536Lb_ColNom ;
   private String[] P09PO3_A5538Lb_ColNomC ;
   private String[] P09PO3_A5534Lb_ArtDsc ;
   private String[] P09PO3_A5533Lb_ArtCod ;
   private java.util.Date[] P09PO3_A5594Lb_cartazf ;
   private String[] P09PO3_A279CliNom ;
   private int[] P09PO3_A5532Lb_numero ;
   private String[] P09PO3_A396EmprCod ;
   private byte[] P09PO4_A5569Lb_EstEns ;
   private String[] P09PO4_A5533Lb_ArtCod ;
   private int[] P09PO4_A252CliCod ;
   private String[] P09PO4_A5570Lb_Tipo ;
   private java.util.Date[] P09PO4_A5541Lb_FechaE ;
   private int[] P09PO4_A5537Lb_ColNum ;
   private String[] P09PO4_A5536Lb_ColNom ;
   private String[] P09PO4_A5538Lb_ColNomC ;
   private String[] P09PO4_A5534Lb_ArtDsc ;
   private java.util.Date[] P09PO4_A5594Lb_cartazf ;
   private String[] P09PO4_A5540Lb_Cartaz ;
   private String[] P09PO4_A279CliNom ;
   private int[] P09PO4_A5532Lb_numero ;
   private String[] P09PO4_A396EmprCod ;
   private byte[] P09PO5_A5569Lb_EstEns ;
   private String[] P09PO5_A5534Lb_ArtDsc ;
   private int[] P09PO5_A252CliCod ;
   private String[] P09PO5_A5570Lb_Tipo ;
   private java.util.Date[] P09PO5_A5541Lb_FechaE ;
   private int[] P09PO5_A5537Lb_ColNum ;
   private String[] P09PO5_A5536Lb_ColNom ;
   private String[] P09PO5_A5538Lb_ColNomC ;
   private String[] P09PO5_A5533Lb_ArtCod ;
   private java.util.Date[] P09PO5_A5594Lb_cartazf ;
   private String[] P09PO5_A5540Lb_Cartaz ;
   private String[] P09PO5_A279CliNom ;
   private int[] P09PO5_A5532Lb_numero ;
   private String[] P09PO5_A396EmprCod ;
   private byte[] P09PO6_A5569Lb_EstEns ;
   private String[] P09PO6_A5538Lb_ColNomC ;
   private int[] P09PO6_A252CliCod ;
   private String[] P09PO6_A5570Lb_Tipo ;
   private java.util.Date[] P09PO6_A5541Lb_FechaE ;
   private int[] P09PO6_A5537Lb_ColNum ;
   private String[] P09PO6_A5536Lb_ColNom ;
   private String[] P09PO6_A5534Lb_ArtDsc ;
   private String[] P09PO6_A5533Lb_ArtCod ;
   private java.util.Date[] P09PO6_A5594Lb_cartazf ;
   private String[] P09PO6_A5540Lb_Cartaz ;
   private String[] P09PO6_A279CliNom ;
   private int[] P09PO6_A5532Lb_numero ;
   private String[] P09PO6_A396EmprCod ;
   private byte[] P09PO7_A5569Lb_EstEns ;
   private String[] P09PO7_A5536Lb_ColNom ;
   private int[] P09PO7_A252CliCod ;
   private String[] P09PO7_A5570Lb_Tipo ;
   private java.util.Date[] P09PO7_A5541Lb_FechaE ;
   private int[] P09PO7_A5537Lb_ColNum ;
   private String[] P09PO7_A5538Lb_ColNomC ;
   private String[] P09PO7_A5534Lb_ArtDsc ;
   private String[] P09PO7_A5533Lb_ArtCod ;
   private java.util.Date[] P09PO7_A5594Lb_cartazf ;
   private String[] P09PO7_A5540Lb_Cartaz ;
   private String[] P09PO7_A279CliNom ;
   private int[] P09PO7_A5532Lb_numero ;
   private String[] P09PO7_A396EmprCod ;
   private byte[] P09PO8_A5569Lb_EstEns ;
   private String[] P09PO8_A5570Lb_Tipo ;
   private int[] P09PO8_A252CliCod ;
   private java.util.Date[] P09PO8_A5541Lb_FechaE ;
   private int[] P09PO8_A5537Lb_ColNum ;
   private String[] P09PO8_A5536Lb_ColNom ;
   private String[] P09PO8_A5538Lb_ColNomC ;
   private String[] P09PO8_A5534Lb_ArtDsc ;
   private String[] P09PO8_A5533Lb_ArtCod ;
   private java.util.Date[] P09PO8_A5594Lb_cartazf ;
   private String[] P09PO8_A5540Lb_Cartaz ;
   private String[] P09PO8_A279CliNom ;
   private int[] P09PO8_A5532Lb_numero ;
   private String[] P09PO8_A396EmprCod ;
   private GXSimpleCollection<String> AV32Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV35OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class ensayospendientesenvio_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV52Clicod ,
                                          java.util.Date AV53Lb_fechaefrom ,
                                          java.util.Date AV54Lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T2.CliNom, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09PO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV52Clicod ,
                                          java.util.Date AV53Lb_fechaefrom ,
                                          java.util.Date AV54Lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.Lb_Cartaz, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09PO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV52Clicod ,
                                          java.util.Date AV53Lb_fechaefrom ,
                                          java.util.Date AV54Lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[33];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.Lb_ArtCod, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09PO5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV52Clicod ,
                                          java.util.Date AV53Lb_fechaefrom ,
                                          java.util.Date AV54Lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[33];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.Lb_ArtDsc, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09PO6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV52Clicod ,
                                          java.util.Date AV53Lb_fechaefrom ,
                                          java.util.Date AV54Lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[33];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.Lb_ColNomC, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09PO7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV52Clicod ,
                                          java.util.Date AV53Lb_fechaefrom ,
                                          java.util.Date AV54Lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[33];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.Lb_ColNom, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P09PO8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV52Clicod ,
                                          java.util.Date AV53Lb_fechaefrom ,
                                          java.util.Date AV54Lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV51Emprcod ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[33];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.Lb_Tipo, T1.CliCod, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
         GXv_int18[5] = (byte)(1) ;
         GXv_int18[6] = (byte)(1) ;
         GXv_int18[7] = (byte)(1) ;
         GXv_int18[8] = (byte)(1) ;
         GXv_int18[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_P09PO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 1 :
                  return conditional_P09PO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 2 :
                  return conditional_P09PO4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 3 :
                  return conditional_P09PO5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 4 :
                  return conditional_P09PO6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 5 :
                  return conditional_P09PO7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
            case 6 :
                  return conditional_P09PO8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PO5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PO6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PO7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PO8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
      }
   }

}

