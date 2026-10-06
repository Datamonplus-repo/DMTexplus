package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionlabdipenviados_y_o_aceptados_wcgetfilterdata extends GXProcedure
{
   public impresionlabdipenviados_y_o_aceptados_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.class ), "" );
   }

   public impresionlabdipenviados_y_o_aceptados_wcgetfilterdata( int remoteHandle ,
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
      impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.aP5 = new String[] {""};
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
      impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.AV58DDOName = aP0;
      impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.AV56SearchTxt = aP1;
      impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.AV57SearchTxtTo = aP2;
      impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.aP3 = aP3;
      impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.aP4 = aP4;
      impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_COLNOMC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_OPCION") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_OPCIONOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_CARTAZ") == 0 )
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
      AV62OptionsJson = AV61Options.toJSonString(false) ;
      AV65OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV67OptionIndexesJson = AV66OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), null, null);
      }
      AV101GXV1 = 1 ;
      while ( AV101GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV74FilterFullText = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV12TFLb_numero = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFLb_numero_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV96TFCliCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV97TFCliCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV75TFLb_ArtCod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV76TFLb_ArtCod_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV77TFLb_ColNomC = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV78TFLb_ColNomC_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV79TFLb_Rb = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV80TFLb_Rb_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV16TFLb_opcion = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV17TFLb_opcion_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV30TFLb_numop = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFLb_numop_To = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV81TFLb_Cartaz = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV82TFLb_Cartaz_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV83TFLb_FechaE = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV18TFLb_FechaEn = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV94TFLb_Estado_SelsJson = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV95TFLb_Estado_Sels.fromJSonString(AV94TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV85Emprcod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV86Clicod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV87Lb_Cartaz = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV88Lb_ColNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV89Lb_numero = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV90Lb_FechaEfrom = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV91Lb_FechaEto = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEN") == 0 )
         {
            AV92Lb_fechaEn = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTADO") == 0 )
         {
            AV93Lb_estado = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV101GXV1 = (int)(AV101GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV75TFLb_ArtCod = AV56SearchTxt ;
      AV76TFLb_ArtCod_Sel = "" ;
      AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = AV74FilterFullText ;
      AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod = AV96TFCliCod ;
      AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to = AV97TFCliCod_To ;
      AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = AV75TFLb_ArtCod ;
      AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = AV76TFLb_ArtCod_Sel ;
      AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = AV79TFLb_Rb ;
      AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = AV80TFLb_Rb_To ;
      AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = AV16TFLb_opcion ;
      AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop = AV30TFLb_numop ;
      AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to = AV31TFLb_numop_To ;
      AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = AV81TFLb_Cartaz ;
      AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = AV82TFLb_Cartaz_Sel ;
      AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = AV83TFLb_FechaE ;
      AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = AV18TFLb_FechaEn ;
      AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                           AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) ,
                                           AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                           AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                           AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                           AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                           AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                           AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                           AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                           AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) ,
                                           AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                           AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                           AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                           AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV86Clicod) ,
                                           AV87Lb_Cartaz ,
                                           AV88Lb_ColNom ,
                                           Integer.valueOf(AV89Lb_numero) ,
                                           AV90Lb_FechaEfrom ,
                                           AV91Lb_FechaEto ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A396EmprCod ,
                                           AV85Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod), 16, "%") ;
      lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc), 13, "%") ;
      lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion), 1, "%") ;
      lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz), 20, "%") ;
      lV87Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV87Lb_Cartaz), 20, "%") ;
      lV88Lb_ColNom = GXutil.padr( GXutil.rtrim( AV88Lb_ColNom), 13, "%") ;
      /* Using cursor P09UM2 */
      pr_default.execute(0, new Object[] {AV85Emprcod, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero), Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to), Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod), Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to), lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod, AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel, lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc, AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to, lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion, AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel, Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop), Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to), lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz, AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel, AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae, AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen, Integer.valueOf(AV86Clicod), lV87Lb_Cartaz, lV88Lb_ColNom, Integer.valueOf(AV89Lb_numero), AV90Lb_FechaEfrom, AV91Lb_FechaEto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9UM2 = false ;
         A396EmprCod = P09UM2_A396EmprCod[0] ;
         A5533Lb_ArtCod = P09UM2_A5533Lb_ArtCod[0] ;
         A5569Lb_EstEns = P09UM2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM2_A5536Lb_ColNom[0] ;
         A5566Lb_Estado = P09UM2_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P09UM2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09UM2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UM2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09UM2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09UM2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09UM2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UM2_A5538Lb_ColNomC[0] ;
         A252CliCod = P09UM2_A252CliCod[0] ;
         A5532Lb_numero = P09UM2_A5532Lb_numero[0] ;
         A5533Lb_ArtCod = P09UM2_A5533Lb_ArtCod[0] ;
         A5569Lb_EstEns = P09UM2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM2_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09UM2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UM2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09UM2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UM2_A5538Lb_ColNomC[0] ;
         A252CliCod = P09UM2_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09UM2_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk9UM2 = false ;
            A396EmprCod = P09UM2_A396EmprCod[0] ;
            A5555Lb_opcion = P09UM2_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09UM2_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9UM2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
         {
            AV60Option = A5533Lb_ArtCod ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UM2 )
         {
            brk9UM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_COLNOMCOPTIONS' Routine */
      returnInSub = false ;
      AV77TFLb_ColNomC = AV56SearchTxt ;
      AV78TFLb_ColNomC_Sel = "" ;
      AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = AV74FilterFullText ;
      AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod = AV96TFCliCod ;
      AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to = AV97TFCliCod_To ;
      AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = AV75TFLb_ArtCod ;
      AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = AV76TFLb_ArtCod_Sel ;
      AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = AV79TFLb_Rb ;
      AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = AV80TFLb_Rb_To ;
      AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = AV16TFLb_opcion ;
      AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop = AV30TFLb_numop ;
      AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to = AV31TFLb_numop_To ;
      AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = AV81TFLb_Cartaz ;
      AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = AV82TFLb_Cartaz_Sel ;
      AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = AV83TFLb_FechaE ;
      AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = AV18TFLb_FechaEn ;
      AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                           AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) ,
                                           AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                           AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                           AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                           AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                           AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                           AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                           AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                           AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) ,
                                           AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                           AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                           AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                           AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV86Clicod) ,
                                           AV87Lb_Cartaz ,
                                           AV88Lb_ColNom ,
                                           Integer.valueOf(AV89Lb_numero) ,
                                           AV90Lb_FechaEfrom ,
                                           AV91Lb_FechaEto ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A396EmprCod ,
                                           AV85Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod), 16, "%") ;
      lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc), 13, "%") ;
      lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion), 1, "%") ;
      lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz), 20, "%") ;
      lV87Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV87Lb_Cartaz), 20, "%") ;
      lV88Lb_ColNom = GXutil.padr( GXutil.rtrim( AV88Lb_ColNom), 13, "%") ;
      /* Using cursor P09UM3 */
      pr_default.execute(1, new Object[] {AV85Emprcod, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero), Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to), Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod), Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to), lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod, AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel, lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc, AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to, lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion, AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel, Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop), Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to), lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz, AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel, AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae, AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen, Integer.valueOf(AV86Clicod), lV87Lb_Cartaz, lV88Lb_ColNom, Integer.valueOf(AV89Lb_numero), AV90Lb_FechaEfrom, AV91Lb_FechaEto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9UM4 = false ;
         A396EmprCod = P09UM3_A396EmprCod[0] ;
         A5538Lb_ColNomC = P09UM3_A5538Lb_ColNomC[0] ;
         A5569Lb_EstEns = P09UM3_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM3_A5536Lb_ColNom[0] ;
         A5566Lb_Estado = P09UM3_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P09UM3_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09UM3_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UM3_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09UM3_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09UM3_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09UM3_A5547Lb_Rb[0] ;
         A5533Lb_ArtCod = P09UM3_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UM3_A252CliCod[0] ;
         A5532Lb_numero = P09UM3_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09UM3_A5538Lb_ColNomC[0] ;
         A5569Lb_EstEns = P09UM3_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM3_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09UM3_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UM3_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09UM3_A5547Lb_Rb[0] ;
         A5533Lb_ArtCod = P09UM3_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UM3_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09UM3_A5538Lb_ColNomC[0], A5538Lb_ColNomC) == 0 ) )
         {
            brk9UM4 = false ;
            A396EmprCod = P09UM3_A396EmprCod[0] ;
            A5555Lb_opcion = P09UM3_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09UM3_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9UM4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
         {
            AV60Option = A5538Lb_ColNomC ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UM4 )
         {
            brk9UM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_OPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV16TFLb_opcion = AV56SearchTxt ;
      AV17TFLb_opcion_Sel = "" ;
      AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = AV74FilterFullText ;
      AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod = AV96TFCliCod ;
      AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to = AV97TFCliCod_To ;
      AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = AV75TFLb_ArtCod ;
      AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = AV76TFLb_ArtCod_Sel ;
      AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = AV79TFLb_Rb ;
      AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = AV80TFLb_Rb_To ;
      AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = AV16TFLb_opcion ;
      AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop = AV30TFLb_numop ;
      AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to = AV31TFLb_numop_To ;
      AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = AV81TFLb_Cartaz ;
      AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = AV82TFLb_Cartaz_Sel ;
      AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = AV83TFLb_FechaE ;
      AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = AV18TFLb_FechaEn ;
      AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                           AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) ,
                                           AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                           AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                           AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                           AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                           AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                           AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                           AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                           AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) ,
                                           AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                           AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                           AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                           AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV86Clicod) ,
                                           AV87Lb_Cartaz ,
                                           AV88Lb_ColNom ,
                                           Integer.valueOf(AV89Lb_numero) ,
                                           AV90Lb_FechaEfrom ,
                                           AV91Lb_FechaEto ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A396EmprCod ,
                                           AV85Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod), 16, "%") ;
      lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc), 13, "%") ;
      lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion), 1, "%") ;
      lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz), 20, "%") ;
      lV87Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV87Lb_Cartaz), 20, "%") ;
      lV88Lb_ColNom = GXutil.padr( GXutil.rtrim( AV88Lb_ColNom), 13, "%") ;
      /* Using cursor P09UM4 */
      pr_default.execute(2, new Object[] {AV85Emprcod, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero), Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to), Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod), Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to), lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod, AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel, lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc, AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to, lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion, AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel, Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop), Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to), lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz, AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel, AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae, AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen, Integer.valueOf(AV86Clicod), lV87Lb_Cartaz, lV88Lb_ColNom, Integer.valueOf(AV89Lb_numero), AV90Lb_FechaEfrom, AV91Lb_FechaEto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9UM6 = false ;
         A396EmprCod = P09UM4_A396EmprCod[0] ;
         A5555Lb_opcion = P09UM4_A5555Lb_opcion[0] ;
         A5569Lb_EstEns = P09UM4_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM4_A5536Lb_ColNom[0] ;
         A5566Lb_Estado = P09UM4_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P09UM4_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09UM4_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UM4_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09UM4_A5718Lb_numop[0] ;
         A5547Lb_Rb = P09UM4_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UM4_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UM4_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UM4_A252CliCod[0] ;
         A5532Lb_numero = P09UM4_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09UM4_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM4_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09UM4_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UM4_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09UM4_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UM4_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UM4_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UM4_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09UM4_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) )
         {
            brk9UM6 = false ;
            A396EmprCod = P09UM4_A396EmprCod[0] ;
            A5532Lb_numero = P09UM4_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9UM6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5555Lb_opcion)==0) )
         {
            AV60Option = A5555Lb_opcion ;
            AV63OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))) ;
            AV61Options.add(AV60Option, 0);
            AV64OptionsDesc.add(AV63OptionDesc, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UM6 )
         {
            brk9UM6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV81TFLb_Cartaz = AV56SearchTxt ;
      AV82TFLb_Cartaz_Sel = "" ;
      AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = AV74FilterFullText ;
      AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod = AV96TFCliCod ;
      AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to = AV97TFCliCod_To ;
      AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = AV75TFLb_ArtCod ;
      AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = AV76TFLb_ArtCod_Sel ;
      AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = AV77TFLb_ColNomC ;
      AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = AV78TFLb_ColNomC_Sel ;
      AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = AV79TFLb_Rb ;
      AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = AV80TFLb_Rb_To ;
      AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = AV16TFLb_opcion ;
      AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop = AV30TFLb_numop ;
      AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to = AV31TFLb_numop_To ;
      AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = AV81TFLb_Cartaz ;
      AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = AV82TFLb_Cartaz_Sel ;
      AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = AV83TFLb_FechaE ;
      AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = AV18TFLb_FechaEn ;
      AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                           AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) ,
                                           AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                           AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                           AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                           AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                           AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                           AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                           AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                           AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) ,
                                           AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                           AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                           AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                           AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV86Clicod) ,
                                           AV87Lb_Cartaz ,
                                           AV88Lb_ColNom ,
                                           Integer.valueOf(AV89Lb_numero) ,
                                           AV90Lb_FechaEfrom ,
                                           AV91Lb_FechaEto ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A396EmprCod ,
                                           AV85Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod), 16, "%") ;
      lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc), 13, "%") ;
      lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion), 1, "%") ;
      lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz), 20, "%") ;
      lV87Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV87Lb_Cartaz), 20, "%") ;
      lV88Lb_ColNom = GXutil.padr( GXutil.rtrim( AV88Lb_ColNom), 13, "%") ;
      /* Using cursor P09UM5 */
      pr_default.execute(3, new Object[] {AV85Emprcod, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, Integer.valueOf(AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero), Integer.valueOf(AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to), Integer.valueOf(AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod), Integer.valueOf(AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to), lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod, AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel, lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc, AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to, lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion, AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel, Byte.valueOf(AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop), Byte.valueOf(AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to), lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz, AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel, AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae, AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen, Integer.valueOf(AV86Clicod), lV87Lb_Cartaz, lV88Lb_ColNom, Integer.valueOf(AV89Lb_numero), AV90Lb_FechaEfrom, AV91Lb_FechaEto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9UM8 = false ;
         A396EmprCod = P09UM5_A396EmprCod[0] ;
         A5540Lb_Cartaz = P09UM5_A5540Lb_Cartaz[0] ;
         A5569Lb_EstEns = P09UM5_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM5_A5536Lb_ColNom[0] ;
         A5566Lb_Estado = P09UM5_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P09UM5_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09UM5_A5541Lb_FechaE[0] ;
         A5718Lb_numop = P09UM5_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09UM5_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09UM5_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UM5_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UM5_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UM5_A252CliCod[0] ;
         A5532Lb_numero = P09UM5_A5532Lb_numero[0] ;
         A5540Lb_Cartaz = P09UM5_A5540Lb_Cartaz[0] ;
         A5569Lb_EstEns = P09UM5_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UM5_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09UM5_A5541Lb_FechaE[0] ;
         A5547Lb_Rb = P09UM5_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UM5_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UM5_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UM5_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09UM5_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9UM8 = false ;
            A396EmprCod = P09UM5_A396EmprCod[0] ;
            A5555Lb_opcion = P09UM5_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09UM5_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9UM8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5540Lb_Cartaz)==0) )
         {
            AV60Option = A5540Lb_Cartaz ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UM8 )
         {
            brk9UM8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = impresionlabdipenviados_y_o_aceptados_wcgetfilterdata.this.AV67OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62OptionsJson = "" ;
      AV65OptionsDescJson = "" ;
      AV67OptionIndexesJson = "" ;
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV69Session = httpContext.getWebSession();
      AV71GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV72GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV74FilterFullText = "" ;
      AV75TFLb_ArtCod = "" ;
      AV76TFLb_ArtCod_Sel = "" ;
      AV77TFLb_ColNomC = "" ;
      AV78TFLb_ColNomC_Sel = "" ;
      AV79TFLb_Rb = DecimalUtil.ZERO ;
      AV80TFLb_Rb_To = DecimalUtil.ZERO ;
      AV16TFLb_opcion = "" ;
      AV17TFLb_opcion_Sel = "" ;
      AV81TFLb_Cartaz = "" ;
      AV82TFLb_Cartaz_Sel = "" ;
      AV83TFLb_FechaE = GXutil.nullDate() ;
      AV18TFLb_FechaEn = GXutil.nullDate() ;
      AV94TFLb_Estado_SelsJson = "" ;
      AV95TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV85Emprcod = "" ;
      AV87Lb_Cartaz = "" ;
      AV88Lb_ColNom = "" ;
      AV90Lb_FechaEfrom = GXutil.nullDate() ;
      AV91Lb_FechaEto = GXutil.nullDate() ;
      AV92Lb_fechaEn = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = "" ;
      AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = "" ;
      AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = "" ;
      AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = "" ;
      AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = "" ;
      AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = DecimalUtil.ZERO ;
      AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = DecimalUtil.ZERO ;
      AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = "" ;
      AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = "" ;
      AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = "" ;
      AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = "" ;
      AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = GXutil.nullDate() ;
      AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = "" ;
      lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = "" ;
      lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = "" ;
      lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = "" ;
      lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = "" ;
      lV87Lb_Cartaz = "" ;
      lV88Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      A396EmprCod = "" ;
      P09UM2_A396EmprCod = new String[] {""} ;
      P09UM2_A5533Lb_ArtCod = new String[] {""} ;
      P09UM2_A5569Lb_EstEns = new byte[1] ;
      P09UM2_A5536Lb_ColNom = new String[] {""} ;
      P09UM2_A5566Lb_Estado = new byte[1] ;
      P09UM2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM2_A5540Lb_Cartaz = new String[] {""} ;
      P09UM2_A5718Lb_numop = new byte[1] ;
      P09UM2_A5555Lb_opcion = new String[] {""} ;
      P09UM2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UM2_A5538Lb_ColNomC = new String[] {""} ;
      P09UM2_A252CliCod = new int[1] ;
      P09UM2_A5532Lb_numero = new int[1] ;
      AV60Option = "" ;
      P09UM3_A396EmprCod = new String[] {""} ;
      P09UM3_A5538Lb_ColNomC = new String[] {""} ;
      P09UM3_A5569Lb_EstEns = new byte[1] ;
      P09UM3_A5536Lb_ColNom = new String[] {""} ;
      P09UM3_A5566Lb_Estado = new byte[1] ;
      P09UM3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM3_A5540Lb_Cartaz = new String[] {""} ;
      P09UM3_A5718Lb_numop = new byte[1] ;
      P09UM3_A5555Lb_opcion = new String[] {""} ;
      P09UM3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UM3_A5533Lb_ArtCod = new String[] {""} ;
      P09UM3_A252CliCod = new int[1] ;
      P09UM3_A5532Lb_numero = new int[1] ;
      P09UM4_A396EmprCod = new String[] {""} ;
      P09UM4_A5555Lb_opcion = new String[] {""} ;
      P09UM4_A5569Lb_EstEns = new byte[1] ;
      P09UM4_A5536Lb_ColNom = new String[] {""} ;
      P09UM4_A5566Lb_Estado = new byte[1] ;
      P09UM4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM4_A5540Lb_Cartaz = new String[] {""} ;
      P09UM4_A5718Lb_numop = new byte[1] ;
      P09UM4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UM4_A5538Lb_ColNomC = new String[] {""} ;
      P09UM4_A5533Lb_ArtCod = new String[] {""} ;
      P09UM4_A252CliCod = new int[1] ;
      P09UM4_A5532Lb_numero = new int[1] ;
      AV63OptionDesc = "" ;
      P09UM5_A396EmprCod = new String[] {""} ;
      P09UM5_A5540Lb_Cartaz = new String[] {""} ;
      P09UM5_A5569Lb_EstEns = new byte[1] ;
      P09UM5_A5536Lb_ColNom = new String[] {""} ;
      P09UM5_A5566Lb_Estado = new byte[1] ;
      P09UM5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09UM5_A5718Lb_numop = new byte[1] ;
      P09UM5_A5555Lb_opcion = new String[] {""} ;
      P09UM5_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UM5_A5538Lb_ColNomC = new String[] {""} ;
      P09UM5_A5533Lb_ArtCod = new String[] {""} ;
      P09UM5_A252CliCod = new int[1] ;
      P09UM5_A5532Lb_numero = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09UM2_A396EmprCod, P09UM2_A5533Lb_ArtCod, P09UM2_A5569Lb_EstEns, P09UM2_A5536Lb_ColNom, P09UM2_A5566Lb_Estado, P09UM2_A5567Lb_FechaEn, P09UM2_A5541Lb_FechaE, P09UM2_A5540Lb_Cartaz, P09UM2_A5718Lb_numop, P09UM2_A5555Lb_opcion,
            P09UM2_A5547Lb_Rb, P09UM2_A5538Lb_ColNomC, P09UM2_A252CliCod, P09UM2_A5532Lb_numero
            }
            , new Object[] {
            P09UM3_A396EmprCod, P09UM3_A5538Lb_ColNomC, P09UM3_A5569Lb_EstEns, P09UM3_A5536Lb_ColNom, P09UM3_A5566Lb_Estado, P09UM3_A5567Lb_FechaEn, P09UM3_A5541Lb_FechaE, P09UM3_A5540Lb_Cartaz, P09UM3_A5718Lb_numop, P09UM3_A5555Lb_opcion,
            P09UM3_A5547Lb_Rb, P09UM3_A5533Lb_ArtCod, P09UM3_A252CliCod, P09UM3_A5532Lb_numero
            }
            , new Object[] {
            P09UM4_A396EmprCod, P09UM4_A5555Lb_opcion, P09UM4_A5569Lb_EstEns, P09UM4_A5536Lb_ColNom, P09UM4_A5566Lb_Estado, P09UM4_A5567Lb_FechaEn, P09UM4_A5541Lb_FechaE, P09UM4_A5540Lb_Cartaz, P09UM4_A5718Lb_numop, P09UM4_A5547Lb_Rb,
            P09UM4_A5538Lb_ColNomC, P09UM4_A5533Lb_ArtCod, P09UM4_A252CliCod, P09UM4_A5532Lb_numero
            }
            , new Object[] {
            P09UM5_A396EmprCod, P09UM5_A5540Lb_Cartaz, P09UM5_A5569Lb_EstEns, P09UM5_A5536Lb_ColNom, P09UM5_A5566Lb_Estado, P09UM5_A5567Lb_FechaEn, P09UM5_A5541Lb_FechaE, P09UM5_A5718Lb_numop, P09UM5_A5555Lb_opcion, P09UM5_A5547Lb_Rb,
            P09UM5_A5538Lb_ColNomC, P09UM5_A5533Lb_ArtCod, P09UM5_A252CliCod, P09UM5_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30TFLb_numop ;
   private byte AV31TFLb_numop_To ;
   private byte AV93Lb_estado ;
   private byte AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ;
   private byte AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ;
   private byte A5566Lb_Estado ;
   private byte A5718Lb_numop ;
   private byte A5569Lb_EstEns ;
   private short Gx_err ;
   private int AV101GXV1 ;
   private int AV12TFLb_numero ;
   private int AV13TFLb_numero_To ;
   private int AV96TFCliCod ;
   private int AV97TFCliCod_To ;
   private int AV86Clicod ;
   private int AV89Lb_numero ;
   private int AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ;
   private int AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ;
   private int AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ;
   private int AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ;
   private int AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private long AV68count ;
   private java.math.BigDecimal AV79TFLb_Rb ;
   private java.math.BigDecimal AV80TFLb_Rb_To ;
   private java.math.BigDecimal AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ;
   private java.math.BigDecimal AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private String AV75TFLb_ArtCod ;
   private String AV76TFLb_ArtCod_Sel ;
   private String AV77TFLb_ColNomC ;
   private String AV78TFLb_ColNomC_Sel ;
   private String AV16TFLb_opcion ;
   private String AV17TFLb_opcion_Sel ;
   private String AV81TFLb_Cartaz ;
   private String AV82TFLb_Cartaz_Sel ;
   private String AV85Emprcod ;
   private String AV87Lb_Cartaz ;
   private String AV88Lb_ColNom ;
   private String A5533Lb_ArtCod ;
   private String AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ;
   private String AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ;
   private String AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ;
   private String AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ;
   private String AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ;
   private String AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ;
   private String AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ;
   private String AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ;
   private String lV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ;
   private String lV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ;
   private String lV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ;
   private String lV87Lb_Cartaz ;
   private String lV88Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String A5536Lb_ColNom ;
   private String A396EmprCod ;
   private java.util.Date AV83TFLb_FechaE ;
   private java.util.Date AV18TFLb_FechaEn ;
   private java.util.Date AV90Lb_FechaEfrom ;
   private java.util.Date AV91Lb_FechaEto ;
   private java.util.Date AV92Lb_fechaEn ;
   private java.util.Date AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ;
   private java.util.Date AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private boolean returnInSub ;
   private boolean brk9UM2 ;
   private boolean brk9UM4 ;
   private boolean brk9UM6 ;
   private boolean brk9UM8 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV94TFLb_Estado_SelsJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV74FilterFullText ;
   private String AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ;
   private String lV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ;
   private String AV60Option ;
   private String AV63OptionDesc ;
   private GXSimpleCollection<Byte> AV95TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09UM2_A396EmprCod ;
   private String[] P09UM2_A5533Lb_ArtCod ;
   private byte[] P09UM2_A5569Lb_EstEns ;
   private String[] P09UM2_A5536Lb_ColNom ;
   private byte[] P09UM2_A5566Lb_Estado ;
   private java.util.Date[] P09UM2_A5567Lb_FechaEn ;
   private java.util.Date[] P09UM2_A5541Lb_FechaE ;
   private String[] P09UM2_A5540Lb_Cartaz ;
   private byte[] P09UM2_A5718Lb_numop ;
   private String[] P09UM2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09UM2_A5547Lb_Rb ;
   private String[] P09UM2_A5538Lb_ColNomC ;
   private int[] P09UM2_A252CliCod ;
   private int[] P09UM2_A5532Lb_numero ;
   private String[] P09UM3_A396EmprCod ;
   private String[] P09UM3_A5538Lb_ColNomC ;
   private byte[] P09UM3_A5569Lb_EstEns ;
   private String[] P09UM3_A5536Lb_ColNom ;
   private byte[] P09UM3_A5566Lb_Estado ;
   private java.util.Date[] P09UM3_A5567Lb_FechaEn ;
   private java.util.Date[] P09UM3_A5541Lb_FechaE ;
   private String[] P09UM3_A5540Lb_Cartaz ;
   private byte[] P09UM3_A5718Lb_numop ;
   private String[] P09UM3_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09UM3_A5547Lb_Rb ;
   private String[] P09UM3_A5533Lb_ArtCod ;
   private int[] P09UM3_A252CliCod ;
   private int[] P09UM3_A5532Lb_numero ;
   private String[] P09UM4_A396EmprCod ;
   private String[] P09UM4_A5555Lb_opcion ;
   private byte[] P09UM4_A5569Lb_EstEns ;
   private String[] P09UM4_A5536Lb_ColNom ;
   private byte[] P09UM4_A5566Lb_Estado ;
   private java.util.Date[] P09UM4_A5567Lb_FechaEn ;
   private java.util.Date[] P09UM4_A5541Lb_FechaE ;
   private String[] P09UM4_A5540Lb_Cartaz ;
   private byte[] P09UM4_A5718Lb_numop ;
   private java.math.BigDecimal[] P09UM4_A5547Lb_Rb ;
   private String[] P09UM4_A5538Lb_ColNomC ;
   private String[] P09UM4_A5533Lb_ArtCod ;
   private int[] P09UM4_A252CliCod ;
   private int[] P09UM4_A5532Lb_numero ;
   private String[] P09UM5_A396EmprCod ;
   private String[] P09UM5_A5540Lb_Cartaz ;
   private byte[] P09UM5_A5569Lb_EstEns ;
   private String[] P09UM5_A5536Lb_ColNom ;
   private byte[] P09UM5_A5566Lb_Estado ;
   private java.util.Date[] P09UM5_A5567Lb_FechaEn ;
   private java.util.Date[] P09UM5_A5541Lb_FechaE ;
   private byte[] P09UM5_A5718Lb_numop ;
   private String[] P09UM5_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09UM5_A5547Lb_Rb ;
   private String[] P09UM5_A5538Lb_ColNomC ;
   private String[] P09UM5_A5533Lb_ArtCod ;
   private int[] P09UM5_A252CliCod ;
   private int[] P09UM5_A5532Lb_numero ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class impresionlabdipenviados_y_o_aceptados_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                          String AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                          int AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ,
                                          int AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ,
                                          int AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ,
                                          int AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ,
                                          String AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                          String AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                          String AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                          String AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                          String AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                          String AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                          byte AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ,
                                          byte AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ,
                                          String AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                          String AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                          java.util.Date AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                          java.util.Date AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                          int AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ,
                                          int AV86Clicod ,
                                          String AV87Lb_Cartaz ,
                                          String AV88Lb_ColNom ,
                                          int AV89Lb_numero ,
                                          java.util.Date AV90Lb_FechaEfrom ,
                                          java.util.Date AV91Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          String A396EmprCod ,
                                          String AV85Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.Lb_ArtCod, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNomC," ;
      scmdbuf += " T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado <= 2)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV86Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV89Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ArtCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09UM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                          String AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                          int AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ,
                                          int AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ,
                                          int AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ,
                                          int AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ,
                                          String AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                          String AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                          String AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                          String AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                          String AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                          String AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                          byte AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ,
                                          byte AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ,
                                          String AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                          String AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                          java.util.Date AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                          java.util.Date AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                          int AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ,
                                          int AV86Clicod ,
                                          String AV87Lb_Cartaz ,
                                          String AV88Lb_ColNom ,
                                          int AV89Lb_numero ,
                                          java.util.Date AV90Lb_FechaEfrom ,
                                          java.util.Date AV91Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          String A396EmprCod ,
                                          String AV85Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[34];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.Lb_ColNomC, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ArtCod," ;
      scmdbuf += " T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado <= 2)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV86Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV89Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ColNomC" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09UM4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                          String AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                          int AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ,
                                          int AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ,
                                          int AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ,
                                          int AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ,
                                          String AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                          String AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                          String AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                          String AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                          String AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                          String AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                          byte AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ,
                                          byte AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ,
                                          String AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                          String AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                          java.util.Date AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                          java.util.Date AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                          int AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ,
                                          int AV86Clicod ,
                                          String AV87Lb_Cartaz ,
                                          String AV88Lb_ColNom ,
                                          int AV89Lb_numero ,
                                          java.util.Date AV90Lb_FechaEfrom ,
                                          java.util.Date AV91Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          String A396EmprCod ,
                                          String AV85Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_opcion, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T2.Lb_Rb, T2.Lb_ColNomC, T2.Lb_ArtCod," ;
      scmdbuf += " T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado <= 2)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
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
      if ( ! (0==AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV86Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV89Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_opcion" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09UM5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                          String AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                          int AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ,
                                          int AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ,
                                          int AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ,
                                          int AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ,
                                          String AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                          String AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                          String AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                          String AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                          String AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                          String AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                          byte AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ,
                                          byte AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ,
                                          String AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                          String AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                          java.util.Date AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                          java.util.Date AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                          int AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ,
                                          int AV86Clicod ,
                                          String AV87Lb_Cartaz ,
                                          String AV88Lb_ColNom ,
                                          int AV89Lb_numero ,
                                          java.util.Date AV90Lb_FechaEfrom ,
                                          java.util.Date AV91Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          String A396EmprCod ,
                                          String AV85Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[34];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.Lb_Cartaz, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNomC, T2.Lb_ArtCod," ;
      scmdbuf += " T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado <= 2)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV122Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV86Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV89Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
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
                  return conditional_P09UM2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 1 :
                  return conditional_P09UM3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 2 :
                  return conditional_P09UM4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 3 :
                  return conditional_P09UM5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UM4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UM5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               return;
      }
   }

}

