package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class aprobacioninternaensayo_wcgetfilterdata extends GXProcedure
{
   public aprobacioninternaensayo_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprobacioninternaensayo_wcgetfilterdata.class ), "" );
   }

   public aprobacioninternaensayo_wcgetfilterdata( int remoteHandle ,
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
      aprobacioninternaensayo_wcgetfilterdata.this.aP5 = new String[] {""};
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
      aprobacioninternaensayo_wcgetfilterdata.this.AV36DDOName = aP0;
      aprobacioninternaensayo_wcgetfilterdata.this.AV34SearchTxt = aP1;
      aprobacioninternaensayo_wcgetfilterdata.this.AV35SearchTxtTo = aP2;
      aprobacioninternaensayo_wcgetfilterdata.this.aP3 = aP3;
      aprobacioninternaensayo_wcgetfilterdata.this.aP4 = aP4;
      aprobacioninternaensayo_wcgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LB_OBSCR") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_OBSCROPTIONS' */
         S161 ();
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
      if ( GXutil.strcmp(AV47Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), null, null);
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
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
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPREC") == 0 )
         {
            AV16TFLb_TipRec = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFLb_TipRec_To = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
            AV58TFLb_Estado_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV59TFLb_Estado_Sels.fromJSonString(AV58TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV32TFLb_ObsCR = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV33TFLb_ObsCR_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_OPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLb_opcion = AV34SearchTxt ;
      AV11TFLb_opcion_Sel = "" ;
      AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV16TFLb_TipRec ;
      AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV17TFLb_TipRec_To ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV18TFCliCod ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV19TFCliCod_To ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV20TFCliNom ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV22TFLb_Cartaz ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV24TFLb_cartazf ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV26TFLb_FechaEn ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV28TFLb_FechaR ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV59TFLb_Estado_Sels ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV32TFLb_ObsCR ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV33TFLb_ObsCR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor P09OC2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OC2 = false ;
         A5532Lb_numero = P09OC2_A5532Lb_numero[0] ;
         A396EmprCod = P09OC2_A396EmprCod[0] ;
         A5555Lb_opcion = P09OC2_A5555Lb_opcion[0] ;
         A10822Lb_ObsCR = P09OC2_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OC2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OC2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OC2_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OC2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OC2_A279CliNom[0] ;
         A252CliCod = P09OC2_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC2_A5536Lb_ColNom[0] ;
         A5594Lb_cartazf = P09OC2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC2_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OC2_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC2_A5536Lb_ColNom[0] ;
         A279CliNom = P09OC2_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OC2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09OC2_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(P09OC2_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) )
         {
            brk9OC2 = false ;
            AV46count = (long)(AV46count+1) ;
            brk9OC2 = true ;
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
         if ( ! brk9OC2 )
         {
            brk9OC2 = true ;
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
      AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV16TFLb_TipRec ;
      AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV17TFLb_TipRec_To ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV18TFCliCod ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV19TFCliCod_To ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV20TFCliNom ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV22TFLb_Cartaz ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV24TFLb_cartazf ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV26TFLb_FechaEn ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV28TFLb_FechaR ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV59TFLb_Estado_Sels ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV32TFLb_ObsCR ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV33TFLb_ObsCR_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor P09OC3 */
      pr_default.execute(1, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OC4 = false ;
         A396EmprCod = P09OC3_A396EmprCod[0] ;
         A5532Lb_numero = P09OC3_A5532Lb_numero[0] ;
         A5536Lb_ColNom = P09OC3_A5536Lb_ColNom[0] ;
         A10822Lb_ObsCR = P09OC3_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OC3_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OC3_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OC3_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OC3_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC3_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OC3_A279CliNom[0] ;
         A252CliCod = P09OC3_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC3_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC3_A5537Lb_ColNum[0] ;
         A5555Lb_opcion = P09OC3_A5555Lb_opcion[0] ;
         A5536Lb_ColNom = P09OC3_A5536Lb_ColNom[0] ;
         A5594Lb_cartazf = P09OC3_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC3_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OC3_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC3_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC3_A5537Lb_ColNum[0] ;
         A279CliNom = P09OC3_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OC3_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
         {
            brk9OC4 = false ;
            A396EmprCod = P09OC3_A396EmprCod[0] ;
            A5532Lb_numero = P09OC3_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OC3_A5555Lb_opcion[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9OC4 = true ;
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
         if ( ! brk9OC4 )
         {
            brk9OC4 = true ;
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
      AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV16TFLb_TipRec ;
      AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV17TFLb_TipRec_To ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV18TFCliCod ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV19TFCliCod_To ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV20TFCliNom ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV22TFLb_Cartaz ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV24TFLb_cartazf ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV26TFLb_FechaEn ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV28TFLb_FechaR ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV59TFLb_Estado_Sels ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV32TFLb_ObsCR ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV33TFLb_ObsCR_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor P09OC4 */
      pr_default.execute(2, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9OC6 = false ;
         A396EmprCod = P09OC4_A396EmprCod[0] ;
         A5532Lb_numero = P09OC4_A5532Lb_numero[0] ;
         A279CliNom = P09OC4_A279CliNom[0] ;
         A10822Lb_ObsCR = P09OC4_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OC4_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OC4_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OC4_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OC4_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC4_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OC4_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC4_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC4_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OC4_A5555Lb_opcion[0] ;
         A5594Lb_cartazf = P09OC4_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC4_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OC4_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC4_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC4_A5536Lb_ColNom[0] ;
         A279CliNom = P09OC4_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09OC4_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9OC6 = false ;
            A396EmprCod = P09OC4_A396EmprCod[0] ;
            A5532Lb_numero = P09OC4_A5532Lb_numero[0] ;
            A252CliCod = P09OC4_A252CliCod[0] ;
            A5555Lb_opcion = P09OC4_A5555Lb_opcion[0] ;
            A252CliCod = P09OC4_A252CliCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9OC6 = true ;
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
         if ( ! brk9OC6 )
         {
            brk9OC6 = true ;
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
      AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV16TFLb_TipRec ;
      AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV17TFLb_TipRec_To ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV18TFCliCod ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV19TFCliCod_To ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV20TFCliNom ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV22TFLb_Cartaz ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV24TFLb_cartazf ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV26TFLb_FechaEn ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV28TFLb_FechaR ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV59TFLb_Estado_Sels ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV32TFLb_ObsCR ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV33TFLb_ObsCR_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor P09OC5 */
      pr_default.execute(3, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9OC8 = false ;
         A396EmprCod = P09OC5_A396EmprCod[0] ;
         A5532Lb_numero = P09OC5_A5532Lb_numero[0] ;
         A5540Lb_Cartaz = P09OC5_A5540Lb_Cartaz[0] ;
         A10822Lb_ObsCR = P09OC5_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OC5_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OC5_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OC5_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OC5_A5594Lb_cartazf[0] ;
         A279CliNom = P09OC5_A279CliNom[0] ;
         A252CliCod = P09OC5_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC5_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC5_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC5_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OC5_A5555Lb_opcion[0] ;
         A5540Lb_Cartaz = P09OC5_A5540Lb_Cartaz[0] ;
         A5594Lb_cartazf = P09OC5_A5594Lb_cartazf[0] ;
         A252CliCod = P09OC5_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC5_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC5_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC5_A5536Lb_ColNom[0] ;
         A279CliNom = P09OC5_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09OC5_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9OC8 = false ;
            A396EmprCod = P09OC5_A396EmprCod[0] ;
            A5532Lb_numero = P09OC5_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OC5_A5555Lb_opcion[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9OC8 = true ;
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
         if ( ! brk9OC8 )
         {
            brk9OC8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_OBSCROPTIONS' Routine */
      returnInSub = false ;
      AV32TFLb_ObsCR = AV34SearchTxt ;
      AV33TFLb_ObsCR_Sel = "" ;
      AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV52FilterFullText ;
      AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV53TFLb_numero ;
      AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV54TFLb_numero_To ;
      AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV10TFLb_opcion ;
      AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV12TFLb_ColNom ;
      AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV13TFLb_ColNom_Sel ;
      AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV14TFLb_ColNum ;
      AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV15TFLb_ColNum_To ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV16TFLb_TipRec ;
      AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV17TFLb_TipRec_To ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV18TFCliCod ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV19TFCliCod_To ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV20TFCliNom ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV22TFLb_Cartaz ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV23TFLb_Cartaz_Sel ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV24TFLb_cartazf ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV26TFLb_FechaEn ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV28TFLb_FechaR ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV59TFLb_Estado_Sels ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV32TFLb_ObsCR ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV33TFLb_ObsCR_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56Lb_Numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor P09OC6 */
      pr_default.execute(4, new Object[] {AV55Emprcod, Integer.valueOf(AV56Lb_Numero), lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9OC10 = false ;
         A396EmprCod = P09OC6_A396EmprCod[0] ;
         A5532Lb_numero = P09OC6_A5532Lb_numero[0] ;
         A10822Lb_ObsCR = P09OC6_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OC6_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OC6_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OC6_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OC6_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC6_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OC6_A279CliNom[0] ;
         A252CliCod = P09OC6_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC6_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC6_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC6_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OC6_A5555Lb_opcion[0] ;
         A5594Lb_cartazf = P09OC6_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OC6_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OC6_A252CliCod[0] ;
         A5597Lb_TipRec = P09OC6_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OC6_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OC6_A5536Lb_ColNom[0] ;
         A279CliNom = P09OC6_A279CliNom[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09OC6_A10822Lb_ObsCR[0], A10822Lb_ObsCR) == 0 ) )
         {
            brk9OC10 = false ;
            A396EmprCod = P09OC6_A396EmprCod[0] ;
            A5532Lb_numero = P09OC6_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OC6_A5555Lb_opcion[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9OC10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A10822Lb_ObsCR)==0) )
         {
            AV38Option = A10822Lb_ObsCR ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OC10 )
         {
            brk9OC10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = aprobacioninternaensayo_wcgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = aprobacioninternaensayo_wcgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = aprobacioninternaensayo_wcgetfilterdata.this.AV45OptionIndexesJson;
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
      AV58TFLb_Estado_SelsJson = "" ;
      AV59TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV32TFLb_ObsCR = "" ;
      AV33TFLb_ObsCR_Sel = "" ;
      AV55Emprcod = "" ;
      AV57Lb_fechaR = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = "" ;
      AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = "" ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = "" ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = "" ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = GXutil.nullDate() ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = GXutil.nullDate() ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = "" ;
      scmdbuf = "" ;
      lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A10822Lb_ObsCR = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09OC2_A5532Lb_numero = new int[1] ;
      P09OC2_A396EmprCod = new String[] {""} ;
      P09OC2_A5555Lb_opcion = new String[] {""} ;
      P09OC2_A10822Lb_ObsCR = new String[] {""} ;
      P09OC2_A5566Lb_Estado = new byte[1] ;
      P09OC2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC2_A5540Lb_Cartaz = new String[] {""} ;
      P09OC2_A279CliNom = new String[] {""} ;
      P09OC2_A252CliCod = new int[1] ;
      P09OC2_A5597Lb_TipRec = new byte[1] ;
      P09OC2_A5537Lb_ColNum = new int[1] ;
      P09OC2_A5536Lb_ColNom = new String[] {""} ;
      AV38Option = "" ;
      AV41OptionDesc = "" ;
      P09OC3_A396EmprCod = new String[] {""} ;
      P09OC3_A5532Lb_numero = new int[1] ;
      P09OC3_A5536Lb_ColNom = new String[] {""} ;
      P09OC3_A10822Lb_ObsCR = new String[] {""} ;
      P09OC3_A5566Lb_Estado = new byte[1] ;
      P09OC3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC3_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC3_A5540Lb_Cartaz = new String[] {""} ;
      P09OC3_A279CliNom = new String[] {""} ;
      P09OC3_A252CliCod = new int[1] ;
      P09OC3_A5597Lb_TipRec = new byte[1] ;
      P09OC3_A5537Lb_ColNum = new int[1] ;
      P09OC3_A5555Lb_opcion = new String[] {""} ;
      P09OC4_A396EmprCod = new String[] {""} ;
      P09OC4_A5532Lb_numero = new int[1] ;
      P09OC4_A279CliNom = new String[] {""} ;
      P09OC4_A10822Lb_ObsCR = new String[] {""} ;
      P09OC4_A5566Lb_Estado = new byte[1] ;
      P09OC4_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC4_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC4_A5540Lb_Cartaz = new String[] {""} ;
      P09OC4_A252CliCod = new int[1] ;
      P09OC4_A5597Lb_TipRec = new byte[1] ;
      P09OC4_A5537Lb_ColNum = new int[1] ;
      P09OC4_A5536Lb_ColNom = new String[] {""} ;
      P09OC4_A5555Lb_opcion = new String[] {""} ;
      P09OC5_A396EmprCod = new String[] {""} ;
      P09OC5_A5532Lb_numero = new int[1] ;
      P09OC5_A5540Lb_Cartaz = new String[] {""} ;
      P09OC5_A10822Lb_ObsCR = new String[] {""} ;
      P09OC5_A5566Lb_Estado = new byte[1] ;
      P09OC5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC5_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC5_A279CliNom = new String[] {""} ;
      P09OC5_A252CliCod = new int[1] ;
      P09OC5_A5597Lb_TipRec = new byte[1] ;
      P09OC5_A5537Lb_ColNum = new int[1] ;
      P09OC5_A5536Lb_ColNom = new String[] {""} ;
      P09OC5_A5555Lb_opcion = new String[] {""} ;
      P09OC6_A396EmprCod = new String[] {""} ;
      P09OC6_A5532Lb_numero = new int[1] ;
      P09OC6_A10822Lb_ObsCR = new String[] {""} ;
      P09OC6_A5566Lb_Estado = new byte[1] ;
      P09OC6_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC6_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC6_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OC6_A5540Lb_Cartaz = new String[] {""} ;
      P09OC6_A279CliNom = new String[] {""} ;
      P09OC6_A252CliCod = new int[1] ;
      P09OC6_A5597Lb_TipRec = new byte[1] ;
      P09OC6_A5537Lb_ColNum = new int[1] ;
      P09OC6_A5536Lb_ColNom = new String[] {""} ;
      P09OC6_A5555Lb_opcion = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.aprobacioninternaensayo_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OC2_A5532Lb_numero, P09OC2_A396EmprCod, P09OC2_A5555Lb_opcion, P09OC2_A10822Lb_ObsCR, P09OC2_A5566Lb_Estado, P09OC2_A5563Lb_FechaR, P09OC2_A5567Lb_FechaEn, P09OC2_A5594Lb_cartazf, P09OC2_A5540Lb_Cartaz, P09OC2_A279CliNom,
            P09OC2_A252CliCod, P09OC2_A5597Lb_TipRec, P09OC2_A5537Lb_ColNum, P09OC2_A5536Lb_ColNom
            }
            , new Object[] {
            P09OC3_A396EmprCod, P09OC3_A5532Lb_numero, P09OC3_A5536Lb_ColNom, P09OC3_A10822Lb_ObsCR, P09OC3_A5566Lb_Estado, P09OC3_A5563Lb_FechaR, P09OC3_A5567Lb_FechaEn, P09OC3_A5594Lb_cartazf, P09OC3_A5540Lb_Cartaz, P09OC3_A279CliNom,
            P09OC3_A252CliCod, P09OC3_A5597Lb_TipRec, P09OC3_A5537Lb_ColNum, P09OC3_A5555Lb_opcion
            }
            , new Object[] {
            P09OC4_A396EmprCod, P09OC4_A5532Lb_numero, P09OC4_A279CliNom, P09OC4_A10822Lb_ObsCR, P09OC4_A5566Lb_Estado, P09OC4_A5563Lb_FechaR, P09OC4_A5567Lb_FechaEn, P09OC4_A5594Lb_cartazf, P09OC4_A5540Lb_Cartaz, P09OC4_A252CliCod,
            P09OC4_A5597Lb_TipRec, P09OC4_A5537Lb_ColNum, P09OC4_A5536Lb_ColNom, P09OC4_A5555Lb_opcion
            }
            , new Object[] {
            P09OC5_A396EmprCod, P09OC5_A5532Lb_numero, P09OC5_A5540Lb_Cartaz, P09OC5_A10822Lb_ObsCR, P09OC5_A5566Lb_Estado, P09OC5_A5563Lb_FechaR, P09OC5_A5567Lb_FechaEn, P09OC5_A5594Lb_cartazf, P09OC5_A279CliNom, P09OC5_A252CliCod,
            P09OC5_A5597Lb_TipRec, P09OC5_A5537Lb_ColNum, P09OC5_A5536Lb_ColNom, P09OC5_A5555Lb_opcion
            }
            , new Object[] {
            P09OC6_A396EmprCod, P09OC6_A5532Lb_numero, P09OC6_A10822Lb_ObsCR, P09OC6_A5566Lb_Estado, P09OC6_A5563Lb_FechaR, P09OC6_A5567Lb_FechaEn, P09OC6_A5594Lb_cartazf, P09OC6_A5540Lb_Cartaz, P09OC6_A279CliNom, P09OC6_A252CliCod,
            P09OC6_A5597Lb_TipRec, P09OC6_A5537Lb_ColNum, P09OC6_A5536Lb_ColNom, P09OC6_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFLb_TipRec ;
   private byte AV17TFLb_TipRec_To ;
   private byte AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ;
   private byte AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ;
   private byte A5566Lb_Estado ;
   private byte A5597Lb_TipRec ;
   private short Gx_err ;
   private int AV62GXV1 ;
   private int AV53TFLb_numero ;
   private int AV54TFLb_numero_To ;
   private int AV14TFLb_ColNum ;
   private int AV15TFLb_ColNum_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV56Lb_Numero ;
   private int AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ;
   private int AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ;
   private int AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ;
   private int AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ;
   private int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ;
   private int AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ;
   private int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ;
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
   private String AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ;
   private String AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ;
   private String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ;
   private String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String lV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String lV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A396EmprCod ;
   private java.util.Date AV24TFLb_cartazf ;
   private java.util.Date AV26TFLb_FechaEn ;
   private java.util.Date AV28TFLb_FechaR ;
   private java.util.Date AV57Lb_fechaR ;
   private java.util.Date AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ;
   private java.util.Date AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ;
   private java.util.Date AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private boolean returnInSub ;
   private boolean brk9OC2 ;
   private boolean brk9OC4 ;
   private boolean brk9OC6 ;
   private boolean brk9OC8 ;
   private boolean brk9OC10 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV58TFLb_Estado_SelsJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV32TFLb_ObsCR ;
   private String AV33TFLb_ObsCR_Sel ;
   private String AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ;
   private String lV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private String A10822Lb_ObsCR ;
   private String AV38Option ;
   private String AV41OptionDesc ;
   private GXSimpleCollection<Byte> AV59TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09OC2_A5532Lb_numero ;
   private String[] P09OC2_A396EmprCod ;
   private String[] P09OC2_A5555Lb_opcion ;
   private String[] P09OC2_A10822Lb_ObsCR ;
   private byte[] P09OC2_A5566Lb_Estado ;
   private java.util.Date[] P09OC2_A5563Lb_FechaR ;
   private java.util.Date[] P09OC2_A5567Lb_FechaEn ;
   private java.util.Date[] P09OC2_A5594Lb_cartazf ;
   private String[] P09OC2_A5540Lb_Cartaz ;
   private String[] P09OC2_A279CliNom ;
   private int[] P09OC2_A252CliCod ;
   private byte[] P09OC2_A5597Lb_TipRec ;
   private int[] P09OC2_A5537Lb_ColNum ;
   private String[] P09OC2_A5536Lb_ColNom ;
   private String[] P09OC3_A396EmprCod ;
   private int[] P09OC3_A5532Lb_numero ;
   private String[] P09OC3_A5536Lb_ColNom ;
   private String[] P09OC3_A10822Lb_ObsCR ;
   private byte[] P09OC3_A5566Lb_Estado ;
   private java.util.Date[] P09OC3_A5563Lb_FechaR ;
   private java.util.Date[] P09OC3_A5567Lb_FechaEn ;
   private java.util.Date[] P09OC3_A5594Lb_cartazf ;
   private String[] P09OC3_A5540Lb_Cartaz ;
   private String[] P09OC3_A279CliNom ;
   private int[] P09OC3_A252CliCod ;
   private byte[] P09OC3_A5597Lb_TipRec ;
   private int[] P09OC3_A5537Lb_ColNum ;
   private String[] P09OC3_A5555Lb_opcion ;
   private String[] P09OC4_A396EmprCod ;
   private int[] P09OC4_A5532Lb_numero ;
   private String[] P09OC4_A279CliNom ;
   private String[] P09OC4_A10822Lb_ObsCR ;
   private byte[] P09OC4_A5566Lb_Estado ;
   private java.util.Date[] P09OC4_A5563Lb_FechaR ;
   private java.util.Date[] P09OC4_A5567Lb_FechaEn ;
   private java.util.Date[] P09OC4_A5594Lb_cartazf ;
   private String[] P09OC4_A5540Lb_Cartaz ;
   private int[] P09OC4_A252CliCod ;
   private byte[] P09OC4_A5597Lb_TipRec ;
   private int[] P09OC4_A5537Lb_ColNum ;
   private String[] P09OC4_A5536Lb_ColNom ;
   private String[] P09OC4_A5555Lb_opcion ;
   private String[] P09OC5_A396EmprCod ;
   private int[] P09OC5_A5532Lb_numero ;
   private String[] P09OC5_A5540Lb_Cartaz ;
   private String[] P09OC5_A10822Lb_ObsCR ;
   private byte[] P09OC5_A5566Lb_Estado ;
   private java.util.Date[] P09OC5_A5563Lb_FechaR ;
   private java.util.Date[] P09OC5_A5567Lb_FechaEn ;
   private java.util.Date[] P09OC5_A5594Lb_cartazf ;
   private String[] P09OC5_A279CliNom ;
   private int[] P09OC5_A252CliCod ;
   private byte[] P09OC5_A5597Lb_TipRec ;
   private int[] P09OC5_A5537Lb_ColNum ;
   private String[] P09OC5_A5536Lb_ColNom ;
   private String[] P09OC5_A5555Lb_opcion ;
   private String[] P09OC6_A396EmprCod ;
   private int[] P09OC6_A5532Lb_numero ;
   private String[] P09OC6_A10822Lb_ObsCR ;
   private byte[] P09OC6_A5566Lb_Estado ;
   private java.util.Date[] P09OC6_A5563Lb_FechaR ;
   private java.util.Date[] P09OC6_A5567Lb_FechaEn ;
   private java.util.Date[] P09OC6_A5594Lb_cartazf ;
   private String[] P09OC6_A5540Lb_Cartaz ;
   private String[] P09OC6_A279CliNom ;
   private int[] P09OC6_A252CliCod ;
   private byte[] P09OC6_A5597Lb_TipRec ;
   private int[] P09OC6_A5537Lb_ColNum ;
   private String[] P09OC6_A5536Lb_ColNom ;
   private String[] P09OC6_A5555Lb_opcion ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class aprobacioninternaensayo_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_opcion, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_TipRec," ;
      scmdbuf += " T2.Lb_ColNum, T2.Lb_ColNom FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
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
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[33];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T2.Lb_ColNom, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_TipRec," ;
      scmdbuf += " T2.Lb_ColNum, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
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
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ColNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09OC4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T3.CliNom, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T2.CliCod, T2.Lb_TipRec, T2.Lb_ColNum," ;
      scmdbuf += " T2.Lb_ColNom, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
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
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09OC5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[33];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T2.Lb_Cartaz, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T3.CliNom, T2.CliCod, T2.Lb_TipRec, T2.Lb_ColNum," ;
      scmdbuf += " T2.Lb_ColNom, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
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
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09OC6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV56Lb_Numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[33];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_TipRec, T2.Lb_ColNum," ;
      scmdbuf += " T2.Lb_ColNom, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ObsCR" ;
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
                  return conditional_P09OC2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] );
            case 1 :
                  return conditional_P09OC3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() );
            case 2 :
                  return conditional_P09OC4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() );
            case 3 :
                  return conditional_P09OC5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() );
            case 4 :
                  return conditional_P09OC6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OC4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OC5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OC6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
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
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
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
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
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
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
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
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
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
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
               }
               return;
      }
   }

}

