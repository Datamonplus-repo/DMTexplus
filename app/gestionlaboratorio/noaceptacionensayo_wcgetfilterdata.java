package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class noaceptacionensayo_wcgetfilterdata extends GXProcedure
{
   public noaceptacionensayo_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( noaceptacionensayo_wcgetfilterdata.class ), "" );
   }

   public noaceptacionensayo_wcgetfilterdata( int remoteHandle ,
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
      noaceptacionensayo_wcgetfilterdata.this.aP5 = new String[] {""};
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
      noaceptacionensayo_wcgetfilterdata.this.AV36DDOName = aP0;
      noaceptacionensayo_wcgetfilterdata.this.AV34SearchTxt = aP1;
      noaceptacionensayo_wcgetfilterdata.this.AV35SearchTxtTo = aP2;
      noaceptacionensayo_wcgetfilterdata.this.aP3 = aP3;
      noaceptacionensayo_wcgetfilterdata.this.aP4 = aP4;
      noaceptacionensayo_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_OPCION") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_OPCIONOPTIONS' */
         S121 ();
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_CARTAZ") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_CARTAZOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV47Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), null, null);
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV53TFLb_numero = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFLb_numero_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV10TFLb_opcion = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV11TFLb_opcion_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV12TFLb_ColNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV13TFLb_ColNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV14TFLb_ColNum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFLb_ColNum_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV22TFLb_Cartaz = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV23TFLb_Cartaz_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV24TFLb_cartazf = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV26TFLb_FechaEn = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV28TFLb_FechaR = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV63TFLb_Estado_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFLb_Estado_Sels.fromJSonString(AV63TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV58TFLb_FecNoa1 = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV60TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV56Lb_Numero = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV57Lb_fechaR = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_OBSCR") == 0 )
         {
            AV62Lb_ObsCR = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_OPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLb_opcion = AV34SearchTxt ;
      AV11TFLb_opcion_Sel = "" ;
      AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV18TFCliCod ;
      AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV19TFCliCod_To ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV20TFCliNom ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV21TFCliNom_Sel ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV22TFLb_Cartaz ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV24TFLb_cartazf ;
      AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV26TFLb_FechaEn ;
      AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV28TFLb_FechaR ;
      AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV58TFLb_FecNoa1 ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV60TFLb_hhnoa1 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                           AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                           AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                           AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                           AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                           Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                           AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                           AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                           AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                           AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                           AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                           AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                           AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                           Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                           AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                           AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
      lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
      /* Using cursor P09OF2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OF2 = false ;
         A5532Lb_numero = P09OF2_A5532Lb_numero[0] ;
         A396EmprCod = P09OF2_A396EmprCod[0] ;
         A5555Lb_opcion = P09OF2_A5555Lb_opcion[0] ;
         A10082Lb_hhnoa1 = P09OF2_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OF2_A6461Lb_FecNoa1[0] ;
         A5566Lb_Estado = P09OF2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OF2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OF2_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OF2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OF2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OF2_A279CliNom[0] ;
         A252CliCod = P09OF2_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OF2_A5536Lb_ColNom[0] ;
         A5594Lb_cartazf = P09OF2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OF2_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OF2_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OF2_A5536Lb_ColNom[0] ;
         A279CliNom = P09OF2_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OF2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09OF2_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(P09OF2_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) )
         {
            brk9OF2 = false ;
            AV46count = (long)(AV46count+1) ;
            brk9OF2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5555Lb_opcion)==0) )
         {
            AV38Option = A5555Lb_opcion ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))) ;
            AV39Options.add(AV38Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OF2 )
         {
            brk9OF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFLb_ColNom = AV34SearchTxt ;
      AV13TFLb_ColNom_Sel = "" ;
      AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV18TFCliCod ;
      AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV19TFCliCod_To ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV20TFCliNom ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV21TFCliNom_Sel ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV22TFLb_Cartaz ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV24TFLb_cartazf ;
      AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV26TFLb_FechaEn ;
      AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV28TFLb_FechaR ;
      AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV58TFLb_FecNoa1 ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV60TFLb_hhnoa1 ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                           AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                           AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                           AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                           AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                           Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                           AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                           AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                           AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                           AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                           AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                           AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                           AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                           Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                           AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                           AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
      lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
      /* Using cursor P09OF3 */
      pr_default.execute(1, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OF4 = false ;
         A396EmprCod = P09OF3_A396EmprCod[0] ;
         A5532Lb_numero = P09OF3_A5532Lb_numero[0] ;
         A5566Lb_Estado = P09OF3_A5566Lb_Estado[0] ;
         A5536Lb_ColNom = P09OF3_A5536Lb_ColNom[0] ;
         A10082Lb_hhnoa1 = P09OF3_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OF3_A6461Lb_FecNoa1[0] ;
         A5563Lb_FechaR = P09OF3_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OF3_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OF3_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OF3_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OF3_A279CliNom[0] ;
         A252CliCod = P09OF3_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF3_A5537Lb_ColNum[0] ;
         A5555Lb_opcion = P09OF3_A5555Lb_opcion[0] ;
         A5536Lb_ColNom = P09OF3_A5536Lb_ColNom[0] ;
         A5594Lb_cartazf = P09OF3_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OF3_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OF3_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF3_A5537Lb_ColNum[0] ;
         A279CliNom = P09OF3_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OF3_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
         {
            brk9OF4 = false ;
            A396EmprCod = P09OF3_A396EmprCod[0] ;
            A5532Lb_numero = P09OF3_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OF3_A5555Lb_opcion[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9OF4 = true ;
            pr_default.readNext(1);
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
         if ( ! brk9OF4 )
         {
            brk9OF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliNom = AV34SearchTxt ;
      AV21TFCliNom_Sel = "" ;
      AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV18TFCliCod ;
      AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV19TFCliCod_To ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV20TFCliNom ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV21TFCliNom_Sel ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV22TFLb_Cartaz ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV24TFLb_cartazf ;
      AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV26TFLb_FechaEn ;
      AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV28TFLb_FechaR ;
      AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV58TFLb_FecNoa1 ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV60TFLb_hhnoa1 ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                           AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                           AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                           AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                           AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                           Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                           AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                           AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                           AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                           AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                           AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                           AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                           AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                           Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                           AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                           AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
      lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
      /* Using cursor P09OF4 */
      pr_default.execute(2, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9OF6 = false ;
         A396EmprCod = P09OF4_A396EmprCod[0] ;
         A5532Lb_numero = P09OF4_A5532Lb_numero[0] ;
         A5566Lb_Estado = P09OF4_A5566Lb_Estado[0] ;
         A279CliNom = P09OF4_A279CliNom[0] ;
         A10082Lb_hhnoa1 = P09OF4_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OF4_A6461Lb_FecNoa1[0] ;
         A5563Lb_FechaR = P09OF4_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OF4_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OF4_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OF4_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OF4_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OF4_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OF4_A5555Lb_opcion[0] ;
         A5594Lb_cartazf = P09OF4_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OF4_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OF4_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OF4_A5536Lb_ColNom[0] ;
         A279CliNom = P09OF4_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09OF4_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9OF6 = false ;
            A396EmprCod = P09OF4_A396EmprCod[0] ;
            A5532Lb_numero = P09OF4_A5532Lb_numero[0] ;
            A252CliCod = P09OF4_A252CliCod[0] ;
            A5555Lb_opcion = P09OF4_A5555Lb_opcion[0] ;
            A252CliCod = P09OF4_A252CliCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9OF6 = true ;
            pr_default.readNext(2);
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
         if ( ! brk9OF6 )
         {
            brk9OF6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLb_Cartaz = AV34SearchTxt ;
      AV23TFLb_Cartaz_Sel = "" ;
      AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV18TFCliCod ;
      AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV19TFCliCod_To ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV20TFCliNom ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV21TFCliNom_Sel ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV22TFLb_Cartaz ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV24TFLb_cartazf ;
      AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV26TFLb_FechaEn ;
      AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV28TFLb_FechaR ;
      AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV58TFLb_FecNoa1 ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV60TFLb_hhnoa1 ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                           AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                           AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                           AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                           AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                           AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                           Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                           AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                           AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                           AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                           AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                           AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                           AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                           AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                           Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                           AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                           AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
      lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
      /* Using cursor P09OF5 */
      pr_default.execute(3, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9OF8 = false ;
         A396EmprCod = P09OF5_A396EmprCod[0] ;
         A5532Lb_numero = P09OF5_A5532Lb_numero[0] ;
         A5566Lb_Estado = P09OF5_A5566Lb_Estado[0] ;
         A5540Lb_Cartaz = P09OF5_A5540Lb_Cartaz[0] ;
         A10082Lb_hhnoa1 = P09OF5_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OF5_A6461Lb_FecNoa1[0] ;
         A5563Lb_FechaR = P09OF5_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OF5_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OF5_A5594Lb_cartazf[0] ;
         A279CliNom = P09OF5_A279CliNom[0] ;
         A252CliCod = P09OF5_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF5_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OF5_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OF5_A5555Lb_opcion[0] ;
         A5540Lb_Cartaz = P09OF5_A5540Lb_Cartaz[0] ;
         A5594Lb_cartazf = P09OF5_A5594Lb_cartazf[0] ;
         A252CliCod = P09OF5_A252CliCod[0] ;
         A5537Lb_ColNum = P09OF5_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OF5_A5536Lb_ColNom[0] ;
         A279CliNom = P09OF5_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09OF5_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9OF8 = false ;
            A396EmprCod = P09OF5_A396EmprCod[0] ;
            A5532Lb_numero = P09OF5_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OF5_A5555Lb_opcion[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9OF8 = true ;
            pr_default.readNext(3);
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
         if ( ! brk9OF8 )
         {
            brk9OF8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = noaceptacionensayo_wcgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = noaceptacionensayo_wcgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = noaceptacionensayo_wcgetfilterdata.this.AV45OptionIndexesJson;
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
      AV10TFLb_opcion = "" ;
      AV11TFLb_opcion_Sel = "" ;
      AV12TFLb_ColNom = "" ;
      AV13TFLb_ColNom_Sel = "" ;
      AV20TFCliNom = "" ;
      AV21TFCliNom_Sel = "" ;
      AV22TFLb_Cartaz = "" ;
      AV23TFLb_Cartaz_Sel = "" ;
      AV24TFLb_cartazf = GXutil.nullDate() ;
      AV26TFLb_FechaEn = GXutil.nullDate() ;
      AV28TFLb_FechaR = GXutil.nullDate() ;
      AV63TFLb_Estado_SelsJson = "" ;
      AV64TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV58TFLb_FecNoa1 = GXutil.nullDate() ;
      AV60TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV55Emprcod = "" ;
      AV57Lb_fechaR = GXutil.nullDate() ;
      AV62Lb_ObsCR = "" ;
      A5555Lb_opcion = "" ;
      AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = "" ;
      AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = "" ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = "" ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = "" ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = GXutil.nullDate() ;
      AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = GXutil.nullDate() ;
      AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = GXutil.nullDate() ;
      AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = GXutil.nullDate() ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P09OF2_A5532Lb_numero = new int[1] ;
      P09OF2_A396EmprCod = new String[] {""} ;
      P09OF2_A5555Lb_opcion = new String[] {""} ;
      P09OF2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF2_A5566Lb_Estado = new byte[1] ;
      P09OF2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF2_A5540Lb_Cartaz = new String[] {""} ;
      P09OF2_A279CliNom = new String[] {""} ;
      P09OF2_A252CliCod = new int[1] ;
      P09OF2_A5537Lb_ColNum = new int[1] ;
      P09OF2_A5536Lb_ColNom = new String[] {""} ;
      AV38Option = "" ;
      AV41OptionDesc = "" ;
      P09OF3_A396EmprCod = new String[] {""} ;
      P09OF3_A5532Lb_numero = new int[1] ;
      P09OF3_A5566Lb_Estado = new byte[1] ;
      P09OF3_A5536Lb_ColNom = new String[] {""} ;
      P09OF3_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF3_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF3_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF3_A5540Lb_Cartaz = new String[] {""} ;
      P09OF3_A279CliNom = new String[] {""} ;
      P09OF3_A252CliCod = new int[1] ;
      P09OF3_A5537Lb_ColNum = new int[1] ;
      P09OF3_A5555Lb_opcion = new String[] {""} ;
      P09OF4_A396EmprCod = new String[] {""} ;
      P09OF4_A5532Lb_numero = new int[1] ;
      P09OF4_A5566Lb_Estado = new byte[1] ;
      P09OF4_A279CliNom = new String[] {""} ;
      P09OF4_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF4_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF4_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF4_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF4_A5540Lb_Cartaz = new String[] {""} ;
      P09OF4_A252CliCod = new int[1] ;
      P09OF4_A5537Lb_ColNum = new int[1] ;
      P09OF4_A5536Lb_ColNom = new String[] {""} ;
      P09OF4_A5555Lb_opcion = new String[] {""} ;
      P09OF5_A396EmprCod = new String[] {""} ;
      P09OF5_A5532Lb_numero = new int[1] ;
      P09OF5_A5566Lb_Estado = new byte[1] ;
      P09OF5_A5540Lb_Cartaz = new String[] {""} ;
      P09OF5_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF5_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF5_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OF5_A279CliNom = new String[] {""} ;
      P09OF5_A252CliCod = new int[1] ;
      P09OF5_A5537Lb_ColNum = new int[1] ;
      P09OF5_A5536Lb_ColNom = new String[] {""} ;
      P09OF5_A5555Lb_opcion = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.noaceptacionensayo_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OF2_A5532Lb_numero, P09OF2_A396EmprCod, P09OF2_A5555Lb_opcion, P09OF2_A10082Lb_hhnoa1, P09OF2_A6461Lb_FecNoa1, P09OF2_A5566Lb_Estado, P09OF2_A5563Lb_FechaR, P09OF2_A5567Lb_FechaEn, P09OF2_A5594Lb_cartazf, P09OF2_A5540Lb_Cartaz,
            P09OF2_A279CliNom, P09OF2_A252CliCod, P09OF2_A5537Lb_ColNum, P09OF2_A5536Lb_ColNom
            }
            , new Object[] {
            P09OF3_A396EmprCod, P09OF3_A5532Lb_numero, P09OF3_A5566Lb_Estado, P09OF3_A5536Lb_ColNom, P09OF3_A10082Lb_hhnoa1, P09OF3_A6461Lb_FecNoa1, P09OF3_A5563Lb_FechaR, P09OF3_A5567Lb_FechaEn, P09OF3_A5594Lb_cartazf, P09OF3_A5540Lb_Cartaz,
            P09OF3_A279CliNom, P09OF3_A252CliCod, P09OF3_A5537Lb_ColNum, P09OF3_A5555Lb_opcion
            }
            , new Object[] {
            P09OF4_A396EmprCod, P09OF4_A5532Lb_numero, P09OF4_A5566Lb_Estado, P09OF4_A279CliNom, P09OF4_A10082Lb_hhnoa1, P09OF4_A6461Lb_FecNoa1, P09OF4_A5563Lb_FechaR, P09OF4_A5567Lb_FechaEn, P09OF4_A5594Lb_cartazf, P09OF4_A5540Lb_Cartaz,
            P09OF4_A252CliCod, P09OF4_A5537Lb_ColNum, P09OF4_A5536Lb_ColNom, P09OF4_A5555Lb_opcion
            }
            , new Object[] {
            P09OF5_A396EmprCod, P09OF5_A5532Lb_numero, P09OF5_A5566Lb_Estado, P09OF5_A5540Lb_Cartaz, P09OF5_A10082Lb_hhnoa1, P09OF5_A6461Lb_FecNoa1, P09OF5_A5563Lb_FechaR, P09OF5_A5567Lb_FechaEn, P09OF5_A5594Lb_cartazf, P09OF5_A279CliNom,
            P09OF5_A252CliCod, P09OF5_A5537Lb_ColNum, P09OF5_A5536Lb_ColNom, P09OF5_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int AV67GXV1 ;
   private int AV53TFLb_numero ;
   private int AV54TFLb_numero_To ;
   private int AV14TFLb_ColNum ;
   private int AV15TFLb_ColNum_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV56Lb_Numero ;
   private int AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ;
   private int AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ;
   private int AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ;
   private int AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ;
   private int AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ;
   private int AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ;
   private int AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private long AV46count ;
   private String AV10TFLb_opcion ;
   private String AV11TFLb_opcion_Sel ;
   private String AV12TFLb_ColNom ;
   private String AV13TFLb_ColNom_Sel ;
   private String AV20TFCliNom ;
   private String AV21TFCliNom_Sel ;
   private String AV22TFLb_Cartaz ;
   private String AV23TFLb_Cartaz_Sel ;
   private String AV55Emprcod ;
   private String A5555Lb_opcion ;
   private String AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ;
   private String AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ;
   private String AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ;
   private String AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String lV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String lV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String lV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A396EmprCod ;
   private java.util.Date AV60TFLb_hhnoa1 ;
   private java.util.Date AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV24TFLb_cartazf ;
   private java.util.Date AV26TFLb_FechaEn ;
   private java.util.Date AV28TFLb_FechaR ;
   private java.util.Date AV58TFLb_FecNoa1 ;
   private java.util.Date AV57Lb_fechaR ;
   private java.util.Date AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ;
   private java.util.Date AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ;
   private java.util.Date AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ;
   private java.util.Date AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean returnInSub ;
   private boolean brk9OF2 ;
   private boolean brk9OF4 ;
   private boolean brk9OF6 ;
   private boolean brk9OF8 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV63TFLb_Estado_SelsJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV62Lb_ObsCR ;
   private String AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String lV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String AV38Option ;
   private String AV41OptionDesc ;
   private GXSimpleCollection<Byte> AV64TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09OF2_A5532Lb_numero ;
   private String[] P09OF2_A396EmprCod ;
   private String[] P09OF2_A5555Lb_opcion ;
   private java.util.Date[] P09OF2_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OF2_A6461Lb_FecNoa1 ;
   private byte[] P09OF2_A5566Lb_Estado ;
   private java.util.Date[] P09OF2_A5563Lb_FechaR ;
   private java.util.Date[] P09OF2_A5567Lb_FechaEn ;
   private java.util.Date[] P09OF2_A5594Lb_cartazf ;
   private String[] P09OF2_A5540Lb_Cartaz ;
   private String[] P09OF2_A279CliNom ;
   private int[] P09OF2_A252CliCod ;
   private int[] P09OF2_A5537Lb_ColNum ;
   private String[] P09OF2_A5536Lb_ColNom ;
   private String[] P09OF3_A396EmprCod ;
   private int[] P09OF3_A5532Lb_numero ;
   private byte[] P09OF3_A5566Lb_Estado ;
   private String[] P09OF3_A5536Lb_ColNom ;
   private java.util.Date[] P09OF3_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OF3_A6461Lb_FecNoa1 ;
   private java.util.Date[] P09OF3_A5563Lb_FechaR ;
   private java.util.Date[] P09OF3_A5567Lb_FechaEn ;
   private java.util.Date[] P09OF3_A5594Lb_cartazf ;
   private String[] P09OF3_A5540Lb_Cartaz ;
   private String[] P09OF3_A279CliNom ;
   private int[] P09OF3_A252CliCod ;
   private int[] P09OF3_A5537Lb_ColNum ;
   private String[] P09OF3_A5555Lb_opcion ;
   private String[] P09OF4_A396EmprCod ;
   private int[] P09OF4_A5532Lb_numero ;
   private byte[] P09OF4_A5566Lb_Estado ;
   private String[] P09OF4_A279CliNom ;
   private java.util.Date[] P09OF4_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OF4_A6461Lb_FecNoa1 ;
   private java.util.Date[] P09OF4_A5563Lb_FechaR ;
   private java.util.Date[] P09OF4_A5567Lb_FechaEn ;
   private java.util.Date[] P09OF4_A5594Lb_cartazf ;
   private String[] P09OF4_A5540Lb_Cartaz ;
   private int[] P09OF4_A252CliCod ;
   private int[] P09OF4_A5537Lb_ColNum ;
   private String[] P09OF4_A5536Lb_ColNom ;
   private String[] P09OF4_A5555Lb_opcion ;
   private String[] P09OF5_A396EmprCod ;
   private int[] P09OF5_A5532Lb_numero ;
   private byte[] P09OF5_A5566Lb_Estado ;
   private String[] P09OF5_A5540Lb_Cartaz ;
   private java.util.Date[] P09OF5_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OF5_A6461Lb_FecNoa1 ;
   private java.util.Date[] P09OF5_A5563Lb_FechaR ;
   private java.util.Date[] P09OF5_A5567Lb_FechaEn ;
   private java.util.Date[] P09OF5_A5594Lb_cartazf ;
   private String[] P09OF5_A279CliNom ;
   private int[] P09OF5_A252CliCod ;
   private int[] P09OF5_A5537Lb_ColNum ;
   private String[] P09OF5_A5536Lb_ColNom ;
   private String[] P09OF5_A5555Lb_opcion ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class noaceptacionensayo_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_opcion, T1.Lb_hhnoa1, T1.Lb_FecNoa1, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod," ;
      scmdbuf += " T2.Lb_ColNum, T2.Lb_ColNom FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[29];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_Estado, T2.Lb_ColNom, T1.Lb_hhnoa1, T1.Lb_FecNoa1, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod," ;
      scmdbuf += " T2.Lb_ColNum, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ColNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09OF4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_Estado, T3.CliNom, T1.Lb_hhnoa1, T1.Lb_FecNoa1, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T2.CliCod, T2.Lb_ColNum," ;
      scmdbuf += " T2.Lb_ColNom, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09OF5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[29];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_Estado, T2.Lb_Cartaz, T1.Lb_hhnoa1, T1.Lb_FecNoa1, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T3.CliNom, T2.CliCod, T2.Lb_ColNum," ;
      scmdbuf += " T2.Lb_ColNom, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P09OF2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] );
            case 1 :
                  return conditional_P09OF3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() );
            case 2 :
                  return conditional_P09OF4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() );
            case 3 :
                  return conditional_P09OF5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OF4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OF5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], true);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], true);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], true);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], true);
               }
               return;
      }
   }

}

