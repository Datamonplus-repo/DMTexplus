package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recepciondeensayocliente_wcgetfilterdata extends GXProcedure
{
   public recepciondeensayocliente_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recepciondeensayocliente_wcgetfilterdata.class ), "" );
   }

   public recepciondeensayocliente_wcgetfilterdata( int remoteHandle ,
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
      recepciondeensayocliente_wcgetfilterdata.this.aP5 = new String[] {""};
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
      recepciondeensayocliente_wcgetfilterdata.this.AV58DDOName = aP0;
      recepciondeensayocliente_wcgetfilterdata.this.AV56SearchTxt = aP1;
      recepciondeensayocliente_wcgetfilterdata.this.AV57SearchTxtTo = aP2;
      recepciondeensayocliente_wcgetfilterdata.this.aP3 = aP3;
      recepciondeensayocliente_wcgetfilterdata.this.aP4 = aP4;
      recepciondeensayocliente_wcgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_OBSCR") == 0 )
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
      AV62OptionsJson = AV61Options.toJSonString(false) ;
      AV65OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV67OptionIndexesJson = AV66OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), null, null);
      }
      AV104GXV1 = 1 ;
      while ( AV104GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV1));
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
            AV82TFCliCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFCliCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV84TFLb_ArtCod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV85TFLb_ArtCod_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV86TFLb_ColNomC = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV87TFLb_ColNomC_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV100TFLb_ColNum = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV101TFLb_ColNum_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV88TFLb_Rb = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV89TFLb_Rb_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
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
            AV90TFLb_Cartaz = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV91TFLb_Cartaz_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV92TFLb_FechaE = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV18TFLb_FechaEn = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV22TFLb_FechaR = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV94TFLb_Estado_SelsJson = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV95TFLb_Estado_Sels.fromJSonString(AV94TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV52TFLb_ObsCR = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV53TFLb_ObsCR_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV75Emprcod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV76Clicod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV77Lb_Cartaz = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV78Lb_ColNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV79Lb_numero = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV81Lb_fechaR = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTADO") == 0 )
         {
            AV80Lb_estado = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV104GXV1 = (int)(AV104GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV84TFLb_ArtCod = AV56SearchTxt ;
      AV85TFLb_ArtCod_Sel = "" ;
      AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV74FilterFullText ;
      AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV82TFCliCod ;
      AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV83TFCliCod_To ;
      AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV84TFLb_ArtCod ;
      AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV85TFLb_ArtCod_Sel ;
      AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV86TFLb_ColNomC ;
      AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV87TFLb_ColNomC_Sel ;
      AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV100TFLb_ColNum ;
      AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV101TFLb_ColNum_To ;
      AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV88TFLb_Rb ;
      AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV89TFLb_Rb_To ;
      AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV16TFLb_opcion ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV30TFLb_numop ;
      AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV31TFLb_numop_To ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV90TFLb_Cartaz ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV91TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV92TFLb_FechaE ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV18TFLb_FechaEn ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV22TFLb_FechaR ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV52TFLb_ObsCR ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV53TFLb_ObsCR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV76Clicod) ,
                                           AV77Lb_Cartaz ,
                                           AV78Lb_ColNom ,
                                           Integer.valueOf(AV79Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV80Lb_estado) ,
                                           A396EmprCod ,
                                           AV75Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV77Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV77Lb_Cartaz), 20, "%") ;
      lV78Lb_ColNom = GXutil.padr( GXutil.rtrim( AV78Lb_ColNom), 13, "%") ;
      /* Using cursor P09NU2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV80Lb_estado), Byte.valueOf(AV80Lb_estado), AV75Emprcod, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV76Clicod), lV77Lb_Cartaz, lV78Lb_ColNom, Integer.valueOf(AV79Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9NU2 = false ;
         A396EmprCod = P09NU2_A396EmprCod[0] ;
         A5533Lb_ArtCod = P09NU2_A5533Lb_ArtCod[0] ;
         A6461Lb_FecNoa1 = P09NU2_A6461Lb_FecNoa1[0] ;
         A5569Lb_EstEns = P09NU2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU2_A5536Lb_ColNom[0] ;
         A10822Lb_ObsCR = P09NU2_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09NU2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NU2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NU2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NU2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NU2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NU2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NU2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU2_A5538Lb_ColNomC[0] ;
         A252CliCod = P09NU2_A252CliCod[0] ;
         A5532Lb_numero = P09NU2_A5532Lb_numero[0] ;
         A5533Lb_ArtCod = P09NU2_A5533Lb_ArtCod[0] ;
         A5569Lb_EstEns = P09NU2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU2_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NU2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NU2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU2_A5538Lb_ColNomC[0] ;
         A252CliCod = P09NU2_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09NU2_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk9NU2 = false ;
            A396EmprCod = P09NU2_A396EmprCod[0] ;
            A5555Lb_opcion = P09NU2_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09NU2_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9NU2 = true ;
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
         if ( ! brk9NU2 )
         {
            brk9NU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_COLNOMCOPTIONS' Routine */
      returnInSub = false ;
      AV86TFLb_ColNomC = AV56SearchTxt ;
      AV87TFLb_ColNomC_Sel = "" ;
      AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV74FilterFullText ;
      AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV82TFCliCod ;
      AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV83TFCliCod_To ;
      AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV84TFLb_ArtCod ;
      AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV85TFLb_ArtCod_Sel ;
      AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV86TFLb_ColNomC ;
      AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV87TFLb_ColNomC_Sel ;
      AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV100TFLb_ColNum ;
      AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV101TFLb_ColNum_To ;
      AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV88TFLb_Rb ;
      AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV89TFLb_Rb_To ;
      AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV16TFLb_opcion ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV30TFLb_numop ;
      AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV31TFLb_numop_To ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV90TFLb_Cartaz ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV91TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV92TFLb_FechaE ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV18TFLb_FechaEn ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV22TFLb_FechaR ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV52TFLb_ObsCR ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV53TFLb_ObsCR_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV76Clicod) ,
                                           AV77Lb_Cartaz ,
                                           AV78Lb_ColNom ,
                                           Integer.valueOf(AV79Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV80Lb_estado) ,
                                           A396EmprCod ,
                                           AV75Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV77Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV77Lb_Cartaz), 20, "%") ;
      lV78Lb_ColNom = GXutil.padr( GXutil.rtrim( AV78Lb_ColNom), 13, "%") ;
      /* Using cursor P09NU3 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV80Lb_estado), Byte.valueOf(AV80Lb_estado), AV75Emprcod, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV76Clicod), lV77Lb_Cartaz, lV78Lb_ColNom, Integer.valueOf(AV79Lb_numero)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9NU4 = false ;
         A396EmprCod = P09NU3_A396EmprCod[0] ;
         A5538Lb_ColNomC = P09NU3_A5538Lb_ColNomC[0] ;
         A6461Lb_FecNoa1 = P09NU3_A6461Lb_FecNoa1[0] ;
         A5569Lb_EstEns = P09NU3_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU3_A5536Lb_ColNom[0] ;
         A10822Lb_ObsCR = P09NU3_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09NU3_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NU3_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NU3_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NU3_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU3_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NU3_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NU3_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NU3_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU3_A5537Lb_ColNum[0] ;
         A5533Lb_ArtCod = P09NU3_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU3_A252CliCod[0] ;
         A5532Lb_numero = P09NU3_A5532Lb_numero[0] ;
         A5538Lb_ColNomC = P09NU3_A5538Lb_ColNomC[0] ;
         A5569Lb_EstEns = P09NU3_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU3_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NU3_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU3_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NU3_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU3_A5537Lb_ColNum[0] ;
         A5533Lb_ArtCod = P09NU3_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU3_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09NU3_A5538Lb_ColNomC[0], A5538Lb_ColNomC) == 0 ) )
         {
            brk9NU4 = false ;
            A396EmprCod = P09NU3_A396EmprCod[0] ;
            A5555Lb_opcion = P09NU3_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09NU3_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9NU4 = true ;
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
         if ( ! brk9NU4 )
         {
            brk9NU4 = true ;
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
      AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV74FilterFullText ;
      AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV82TFCliCod ;
      AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV83TFCliCod_To ;
      AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV84TFLb_ArtCod ;
      AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV85TFLb_ArtCod_Sel ;
      AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV86TFLb_ColNomC ;
      AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV87TFLb_ColNomC_Sel ;
      AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV100TFLb_ColNum ;
      AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV101TFLb_ColNum_To ;
      AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV88TFLb_Rb ;
      AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV89TFLb_Rb_To ;
      AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV16TFLb_opcion ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV30TFLb_numop ;
      AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV31TFLb_numop_To ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV90TFLb_Cartaz ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV91TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV92TFLb_FechaE ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV18TFLb_FechaEn ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV22TFLb_FechaR ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV52TFLb_ObsCR ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV53TFLb_ObsCR_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV76Clicod) ,
                                           AV77Lb_Cartaz ,
                                           AV78Lb_ColNom ,
                                           Integer.valueOf(AV79Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV80Lb_estado) ,
                                           A396EmprCod ,
                                           AV75Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV77Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV77Lb_Cartaz), 20, "%") ;
      lV78Lb_ColNom = GXutil.padr( GXutil.rtrim( AV78Lb_ColNom), 13, "%") ;
      /* Using cursor P09NU4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV80Lb_estado), Byte.valueOf(AV80Lb_estado), AV75Emprcod, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV76Clicod), lV77Lb_Cartaz, lV78Lb_ColNom, Integer.valueOf(AV79Lb_numero)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9NU6 = false ;
         A396EmprCod = P09NU4_A396EmprCod[0] ;
         A5555Lb_opcion = P09NU4_A5555Lb_opcion[0] ;
         A6461Lb_FecNoa1 = P09NU4_A6461Lb_FecNoa1[0] ;
         A5569Lb_EstEns = P09NU4_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU4_A5536Lb_ColNom[0] ;
         A10822Lb_ObsCR = P09NU4_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09NU4_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NU4_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NU4_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NU4_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU4_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NU4_A5718Lb_numop[0] ;
         A5547Lb_Rb = P09NU4_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU4_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU4_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NU4_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU4_A252CliCod[0] ;
         A5532Lb_numero = P09NU4_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09NU4_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU4_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NU4_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU4_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NU4_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU4_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU4_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NU4_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU4_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09NU4_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) )
         {
            brk9NU6 = false ;
            A396EmprCod = P09NU4_A396EmprCod[0] ;
            A5532Lb_numero = P09NU4_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9NU6 = true ;
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
         if ( ! brk9NU6 )
         {
            brk9NU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV90TFLb_Cartaz = AV56SearchTxt ;
      AV91TFLb_Cartaz_Sel = "" ;
      AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV74FilterFullText ;
      AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV82TFCliCod ;
      AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV83TFCliCod_To ;
      AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV84TFLb_ArtCod ;
      AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV85TFLb_ArtCod_Sel ;
      AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV86TFLb_ColNomC ;
      AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV87TFLb_ColNomC_Sel ;
      AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV100TFLb_ColNum ;
      AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV101TFLb_ColNum_To ;
      AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV88TFLb_Rb ;
      AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV89TFLb_Rb_To ;
      AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV16TFLb_opcion ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV30TFLb_numop ;
      AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV31TFLb_numop_To ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV90TFLb_Cartaz ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV91TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV92TFLb_FechaE ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV18TFLb_FechaEn ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV22TFLb_FechaR ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV52TFLb_ObsCR ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV53TFLb_ObsCR_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV76Clicod) ,
                                           AV77Lb_Cartaz ,
                                           AV78Lb_ColNom ,
                                           Integer.valueOf(AV79Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV80Lb_estado) ,
                                           A396EmprCod ,
                                           AV75Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV77Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV77Lb_Cartaz), 20, "%") ;
      lV78Lb_ColNom = GXutil.padr( GXutil.rtrim( AV78Lb_ColNom), 13, "%") ;
      /* Using cursor P09NU5 */
      pr_default.execute(3, new Object[] {Byte.valueOf(AV80Lb_estado), Byte.valueOf(AV80Lb_estado), AV75Emprcod, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV76Clicod), lV77Lb_Cartaz, lV78Lb_ColNom, Integer.valueOf(AV79Lb_numero)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9NU8 = false ;
         A396EmprCod = P09NU5_A396EmprCod[0] ;
         A5540Lb_Cartaz = P09NU5_A5540Lb_Cartaz[0] ;
         A6461Lb_FecNoa1 = P09NU5_A6461Lb_FecNoa1[0] ;
         A5569Lb_EstEns = P09NU5_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU5_A5536Lb_ColNom[0] ;
         A10822Lb_ObsCR = P09NU5_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09NU5_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NU5_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NU5_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NU5_A5541Lb_FechaE[0] ;
         A5718Lb_numop = P09NU5_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NU5_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NU5_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU5_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU5_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NU5_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU5_A252CliCod[0] ;
         A5532Lb_numero = P09NU5_A5532Lb_numero[0] ;
         A5540Lb_Cartaz = P09NU5_A5540Lb_Cartaz[0] ;
         A5569Lb_EstEns = P09NU5_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU5_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NU5_A5541Lb_FechaE[0] ;
         A5547Lb_Rb = P09NU5_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU5_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU5_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NU5_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU5_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09NU5_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9NU8 = false ;
            A396EmprCod = P09NU5_A396EmprCod[0] ;
            A5555Lb_opcion = P09NU5_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09NU5_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9NU8 = true ;
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
         if ( ! brk9NU8 )
         {
            brk9NU8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_OBSCROPTIONS' Routine */
      returnInSub = false ;
      AV52TFLb_ObsCR = AV56SearchTxt ;
      AV53TFLb_ObsCR_Sel = "" ;
      AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV74FilterFullText ;
      AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV12TFLb_numero ;
      AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV13TFLb_numero_To ;
      AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV82TFCliCod ;
      AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV83TFCliCod_To ;
      AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV84TFLb_ArtCod ;
      AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV85TFLb_ArtCod_Sel ;
      AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV86TFLb_ColNomC ;
      AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV87TFLb_ColNomC_Sel ;
      AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV100TFLb_ColNum ;
      AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV101TFLb_ColNum_To ;
      AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV88TFLb_Rb ;
      AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV89TFLb_Rb_To ;
      AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV16TFLb_opcion ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV17TFLb_opcion_Sel ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV30TFLb_numop ;
      AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV31TFLb_numop_To ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV90TFLb_Cartaz ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV91TFLb_Cartaz_Sel ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV92TFLb_FechaE ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV18TFLb_FechaEn ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV22TFLb_FechaR ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV95TFLb_Estado_Sels ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV52TFLb_ObsCR ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV53TFLb_ObsCR_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV76Clicod) ,
                                           AV77Lb_Cartaz ,
                                           AV78Lb_ColNom ,
                                           Integer.valueOf(AV79Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV80Lb_estado) ,
                                           A396EmprCod ,
                                           AV75Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV77Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV77Lb_Cartaz), 20, "%") ;
      lV78Lb_ColNom = GXutil.padr( GXutil.rtrim( AV78Lb_ColNom), 13, "%") ;
      /* Using cursor P09NU6 */
      pr_default.execute(4, new Object[] {Byte.valueOf(AV80Lb_estado), Byte.valueOf(AV80Lb_estado), AV75Emprcod, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV76Clicod), lV77Lb_Cartaz, lV78Lb_ColNom, Integer.valueOf(AV79Lb_numero)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9NU10 = false ;
         A396EmprCod = P09NU6_A396EmprCod[0] ;
         A10822Lb_ObsCR = P09NU6_A10822Lb_ObsCR[0] ;
         A6461Lb_FecNoa1 = P09NU6_A6461Lb_FecNoa1[0] ;
         A5569Lb_EstEns = P09NU6_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU6_A5536Lb_ColNom[0] ;
         A5566Lb_Estado = P09NU6_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NU6_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NU6_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NU6_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU6_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NU6_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NU6_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NU6_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU6_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU6_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NU6_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU6_A252CliCod[0] ;
         A5532Lb_numero = P09NU6_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09NU6_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NU6_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NU6_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NU6_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NU6_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NU6_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NU6_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NU6_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NU6_A252CliCod[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09NU6_A10822Lb_ObsCR[0], A10822Lb_ObsCR) == 0 ) )
         {
            brk9NU10 = false ;
            A396EmprCod = P09NU6_A396EmprCod[0] ;
            A5555Lb_opcion = P09NU6_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09NU6_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9NU10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A10822Lb_ObsCR)==0) )
         {
            AV60Option = A10822Lb_ObsCR ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NU10 )
         {
            brk9NU10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recepciondeensayocliente_wcgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = recepciondeensayocliente_wcgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = recepciondeensayocliente_wcgetfilterdata.this.AV67OptionIndexesJson;
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
      AV84TFLb_ArtCod = "" ;
      AV85TFLb_ArtCod_Sel = "" ;
      AV86TFLb_ColNomC = "" ;
      AV87TFLb_ColNomC_Sel = "" ;
      AV88TFLb_Rb = DecimalUtil.ZERO ;
      AV89TFLb_Rb_To = DecimalUtil.ZERO ;
      AV16TFLb_opcion = "" ;
      AV17TFLb_opcion_Sel = "" ;
      AV90TFLb_Cartaz = "" ;
      AV91TFLb_Cartaz_Sel = "" ;
      AV92TFLb_FechaE = GXutil.nullDate() ;
      AV18TFLb_FechaEn = GXutil.nullDate() ;
      AV22TFLb_FechaR = GXutil.nullDate() ;
      AV94TFLb_Estado_SelsJson = "" ;
      AV95TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV52TFLb_ObsCR = "" ;
      AV53TFLb_ObsCR_Sel = "" ;
      AV75Emprcod = "" ;
      AV77Lb_Cartaz = "" ;
      AV78Lb_ColNom = "" ;
      AV81Lb_fechaR = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = "" ;
      AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = "" ;
      AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = DecimalUtil.ZERO ;
      AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = DecimalUtil.ZERO ;
      AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = "" ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = "" ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = GXutil.nullDate() ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = GXutil.nullDate() ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = GXutil.nullDate() ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = "" ;
      scmdbuf = "" ;
      lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      lV77Lb_Cartaz = "" ;
      lV78Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A10822Lb_ObsCR = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09NU2_A396EmprCod = new String[] {""} ;
      P09NU2_A5533Lb_ArtCod = new String[] {""} ;
      P09NU2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU2_A5569Lb_EstEns = new byte[1] ;
      P09NU2_A5536Lb_ColNom = new String[] {""} ;
      P09NU2_A10822Lb_ObsCR = new String[] {""} ;
      P09NU2_A5566Lb_Estado = new byte[1] ;
      P09NU2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU2_A5540Lb_Cartaz = new String[] {""} ;
      P09NU2_A5718Lb_numop = new byte[1] ;
      P09NU2_A5555Lb_opcion = new String[] {""} ;
      P09NU2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NU2_A5537Lb_ColNum = new int[1] ;
      P09NU2_A5538Lb_ColNomC = new String[] {""} ;
      P09NU2_A252CliCod = new int[1] ;
      P09NU2_A5532Lb_numero = new int[1] ;
      AV60Option = "" ;
      P09NU3_A396EmprCod = new String[] {""} ;
      P09NU3_A5538Lb_ColNomC = new String[] {""} ;
      P09NU3_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU3_A5569Lb_EstEns = new byte[1] ;
      P09NU3_A5536Lb_ColNom = new String[] {""} ;
      P09NU3_A10822Lb_ObsCR = new String[] {""} ;
      P09NU3_A5566Lb_Estado = new byte[1] ;
      P09NU3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU3_A5540Lb_Cartaz = new String[] {""} ;
      P09NU3_A5718Lb_numop = new byte[1] ;
      P09NU3_A5555Lb_opcion = new String[] {""} ;
      P09NU3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NU3_A5537Lb_ColNum = new int[1] ;
      P09NU3_A5533Lb_ArtCod = new String[] {""} ;
      P09NU3_A252CliCod = new int[1] ;
      P09NU3_A5532Lb_numero = new int[1] ;
      P09NU4_A396EmprCod = new String[] {""} ;
      P09NU4_A5555Lb_opcion = new String[] {""} ;
      P09NU4_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU4_A5569Lb_EstEns = new byte[1] ;
      P09NU4_A5536Lb_ColNom = new String[] {""} ;
      P09NU4_A10822Lb_ObsCR = new String[] {""} ;
      P09NU4_A5566Lb_Estado = new byte[1] ;
      P09NU4_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU4_A5540Lb_Cartaz = new String[] {""} ;
      P09NU4_A5718Lb_numop = new byte[1] ;
      P09NU4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NU4_A5537Lb_ColNum = new int[1] ;
      P09NU4_A5538Lb_ColNomC = new String[] {""} ;
      P09NU4_A5533Lb_ArtCod = new String[] {""} ;
      P09NU4_A252CliCod = new int[1] ;
      P09NU4_A5532Lb_numero = new int[1] ;
      AV63OptionDesc = "" ;
      P09NU5_A396EmprCod = new String[] {""} ;
      P09NU5_A5540Lb_Cartaz = new String[] {""} ;
      P09NU5_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU5_A5569Lb_EstEns = new byte[1] ;
      P09NU5_A5536Lb_ColNom = new String[] {""} ;
      P09NU5_A10822Lb_ObsCR = new String[] {""} ;
      P09NU5_A5566Lb_Estado = new byte[1] ;
      P09NU5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU5_A5718Lb_numop = new byte[1] ;
      P09NU5_A5555Lb_opcion = new String[] {""} ;
      P09NU5_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NU5_A5537Lb_ColNum = new int[1] ;
      P09NU5_A5538Lb_ColNomC = new String[] {""} ;
      P09NU5_A5533Lb_ArtCod = new String[] {""} ;
      P09NU5_A252CliCod = new int[1] ;
      P09NU5_A5532Lb_numero = new int[1] ;
      P09NU6_A396EmprCod = new String[] {""} ;
      P09NU6_A10822Lb_ObsCR = new String[] {""} ;
      P09NU6_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU6_A5569Lb_EstEns = new byte[1] ;
      P09NU6_A5536Lb_ColNom = new String[] {""} ;
      P09NU6_A5566Lb_Estado = new byte[1] ;
      P09NU6_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU6_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU6_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NU6_A5540Lb_Cartaz = new String[] {""} ;
      P09NU6_A5718Lb_numop = new byte[1] ;
      P09NU6_A5555Lb_opcion = new String[] {""} ;
      P09NU6_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NU6_A5537Lb_ColNum = new int[1] ;
      P09NU6_A5538Lb_ColNomC = new String[] {""} ;
      P09NU6_A5533Lb_ArtCod = new String[] {""} ;
      P09NU6_A252CliCod = new int[1] ;
      P09NU6_A5532Lb_numero = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.recepciondeensayocliente_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09NU2_A396EmprCod, P09NU2_A5533Lb_ArtCod, P09NU2_A6461Lb_FecNoa1, P09NU2_A5569Lb_EstEns, P09NU2_A5536Lb_ColNom, P09NU2_A10822Lb_ObsCR, P09NU2_A5566Lb_Estado, P09NU2_A5563Lb_FechaR, P09NU2_A5567Lb_FechaEn, P09NU2_A5541Lb_FechaE,
            P09NU2_A5540Lb_Cartaz, P09NU2_A5718Lb_numop, P09NU2_A5555Lb_opcion, P09NU2_A5547Lb_Rb, P09NU2_A5537Lb_ColNum, P09NU2_A5538Lb_ColNomC, P09NU2_A252CliCod, P09NU2_A5532Lb_numero
            }
            , new Object[] {
            P09NU3_A396EmprCod, P09NU3_A5538Lb_ColNomC, P09NU3_A6461Lb_FecNoa1, P09NU3_A5569Lb_EstEns, P09NU3_A5536Lb_ColNom, P09NU3_A10822Lb_ObsCR, P09NU3_A5566Lb_Estado, P09NU3_A5563Lb_FechaR, P09NU3_A5567Lb_FechaEn, P09NU3_A5541Lb_FechaE,
            P09NU3_A5540Lb_Cartaz, P09NU3_A5718Lb_numop, P09NU3_A5555Lb_opcion, P09NU3_A5547Lb_Rb, P09NU3_A5537Lb_ColNum, P09NU3_A5533Lb_ArtCod, P09NU3_A252CliCod, P09NU3_A5532Lb_numero
            }
            , new Object[] {
            P09NU4_A396EmprCod, P09NU4_A5555Lb_opcion, P09NU4_A6461Lb_FecNoa1, P09NU4_A5569Lb_EstEns, P09NU4_A5536Lb_ColNom, P09NU4_A10822Lb_ObsCR, P09NU4_A5566Lb_Estado, P09NU4_A5563Lb_FechaR, P09NU4_A5567Lb_FechaEn, P09NU4_A5541Lb_FechaE,
            P09NU4_A5540Lb_Cartaz, P09NU4_A5718Lb_numop, P09NU4_A5547Lb_Rb, P09NU4_A5537Lb_ColNum, P09NU4_A5538Lb_ColNomC, P09NU4_A5533Lb_ArtCod, P09NU4_A252CliCod, P09NU4_A5532Lb_numero
            }
            , new Object[] {
            P09NU5_A396EmprCod, P09NU5_A5540Lb_Cartaz, P09NU5_A6461Lb_FecNoa1, P09NU5_A5569Lb_EstEns, P09NU5_A5536Lb_ColNom, P09NU5_A10822Lb_ObsCR, P09NU5_A5566Lb_Estado, P09NU5_A5563Lb_FechaR, P09NU5_A5567Lb_FechaEn, P09NU5_A5541Lb_FechaE,
            P09NU5_A5718Lb_numop, P09NU5_A5555Lb_opcion, P09NU5_A5547Lb_Rb, P09NU5_A5537Lb_ColNum, P09NU5_A5538Lb_ColNomC, P09NU5_A5533Lb_ArtCod, P09NU5_A252CliCod, P09NU5_A5532Lb_numero
            }
            , new Object[] {
            P09NU6_A396EmprCod, P09NU6_A10822Lb_ObsCR, P09NU6_A6461Lb_FecNoa1, P09NU6_A5569Lb_EstEns, P09NU6_A5536Lb_ColNom, P09NU6_A5566Lb_Estado, P09NU6_A5563Lb_FechaR, P09NU6_A5567Lb_FechaEn, P09NU6_A5541Lb_FechaE, P09NU6_A5540Lb_Cartaz,
            P09NU6_A5718Lb_numop, P09NU6_A5555Lb_opcion, P09NU6_A5547Lb_Rb, P09NU6_A5537Lb_ColNum, P09NU6_A5538Lb_ColNomC, P09NU6_A5533Lb_ArtCod, P09NU6_A252CliCod, P09NU6_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30TFLb_numop ;
   private byte AV31TFLb_numop_To ;
   private byte AV80Lb_estado ;
   private byte AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ;
   private byte AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ;
   private byte A5566Lb_Estado ;
   private byte A5718Lb_numop ;
   private byte A5569Lb_EstEns ;
   private short Gx_err ;
   private int AV104GXV1 ;
   private int AV12TFLb_numero ;
   private int AV13TFLb_numero_To ;
   private int AV82TFCliCod ;
   private int AV83TFCliCod_To ;
   private int AV100TFLb_ColNum ;
   private int AV101TFLb_ColNum_To ;
   private int AV76Clicod ;
   private int AV79Lb_numero ;
   private int AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ;
   private int AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ;
   private int AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ;
   private int AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ;
   private int AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ;
   private int AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ;
   private int AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private long AV68count ;
   private java.math.BigDecimal AV88TFLb_Rb ;
   private java.math.BigDecimal AV89TFLb_Rb_To ;
   private java.math.BigDecimal AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ;
   private java.math.BigDecimal AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private String AV84TFLb_ArtCod ;
   private String AV85TFLb_ArtCod_Sel ;
   private String AV86TFLb_ColNomC ;
   private String AV87TFLb_ColNomC_Sel ;
   private String AV16TFLb_opcion ;
   private String AV17TFLb_opcion_Sel ;
   private String AV90TFLb_Cartaz ;
   private String AV91TFLb_Cartaz_Sel ;
   private String AV75Emprcod ;
   private String AV77Lb_Cartaz ;
   private String AV78Lb_ColNom ;
   private String A5533Lb_ArtCod ;
   private String AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ;
   private String AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ;
   private String AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ;
   private String AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String lV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String lV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String lV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String lV77Lb_Cartaz ;
   private String lV78Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String A5536Lb_ColNom ;
   private String A396EmprCod ;
   private java.util.Date AV92TFLb_FechaE ;
   private java.util.Date AV18TFLb_FechaEn ;
   private java.util.Date AV22TFLb_FechaR ;
   private java.util.Date AV81Lb_fechaR ;
   private java.util.Date AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ;
   private java.util.Date AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ;
   private java.util.Date AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean returnInSub ;
   private boolean brk9NU2 ;
   private boolean brk9NU4 ;
   private boolean brk9NU6 ;
   private boolean brk9NU8 ;
   private boolean brk9NU10 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV94TFLb_Estado_SelsJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV74FilterFullText ;
   private String AV52TFLb_ObsCR ;
   private String AV53TFLb_ObsCR_Sel ;
   private String AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private String AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ;
   private String lV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String lV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private String A10822Lb_ObsCR ;
   private String AV60Option ;
   private String AV63OptionDesc ;
   private GXSimpleCollection<Byte> AV95TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09NU2_A396EmprCod ;
   private String[] P09NU2_A5533Lb_ArtCod ;
   private java.util.Date[] P09NU2_A6461Lb_FecNoa1 ;
   private byte[] P09NU2_A5569Lb_EstEns ;
   private String[] P09NU2_A5536Lb_ColNom ;
   private String[] P09NU2_A10822Lb_ObsCR ;
   private byte[] P09NU2_A5566Lb_Estado ;
   private java.util.Date[] P09NU2_A5563Lb_FechaR ;
   private java.util.Date[] P09NU2_A5567Lb_FechaEn ;
   private java.util.Date[] P09NU2_A5541Lb_FechaE ;
   private String[] P09NU2_A5540Lb_Cartaz ;
   private byte[] P09NU2_A5718Lb_numop ;
   private String[] P09NU2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NU2_A5547Lb_Rb ;
   private int[] P09NU2_A5537Lb_ColNum ;
   private String[] P09NU2_A5538Lb_ColNomC ;
   private int[] P09NU2_A252CliCod ;
   private int[] P09NU2_A5532Lb_numero ;
   private String[] P09NU3_A396EmprCod ;
   private String[] P09NU3_A5538Lb_ColNomC ;
   private java.util.Date[] P09NU3_A6461Lb_FecNoa1 ;
   private byte[] P09NU3_A5569Lb_EstEns ;
   private String[] P09NU3_A5536Lb_ColNom ;
   private String[] P09NU3_A10822Lb_ObsCR ;
   private byte[] P09NU3_A5566Lb_Estado ;
   private java.util.Date[] P09NU3_A5563Lb_FechaR ;
   private java.util.Date[] P09NU3_A5567Lb_FechaEn ;
   private java.util.Date[] P09NU3_A5541Lb_FechaE ;
   private String[] P09NU3_A5540Lb_Cartaz ;
   private byte[] P09NU3_A5718Lb_numop ;
   private String[] P09NU3_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NU3_A5547Lb_Rb ;
   private int[] P09NU3_A5537Lb_ColNum ;
   private String[] P09NU3_A5533Lb_ArtCod ;
   private int[] P09NU3_A252CliCod ;
   private int[] P09NU3_A5532Lb_numero ;
   private String[] P09NU4_A396EmprCod ;
   private String[] P09NU4_A5555Lb_opcion ;
   private java.util.Date[] P09NU4_A6461Lb_FecNoa1 ;
   private byte[] P09NU4_A5569Lb_EstEns ;
   private String[] P09NU4_A5536Lb_ColNom ;
   private String[] P09NU4_A10822Lb_ObsCR ;
   private byte[] P09NU4_A5566Lb_Estado ;
   private java.util.Date[] P09NU4_A5563Lb_FechaR ;
   private java.util.Date[] P09NU4_A5567Lb_FechaEn ;
   private java.util.Date[] P09NU4_A5541Lb_FechaE ;
   private String[] P09NU4_A5540Lb_Cartaz ;
   private byte[] P09NU4_A5718Lb_numop ;
   private java.math.BigDecimal[] P09NU4_A5547Lb_Rb ;
   private int[] P09NU4_A5537Lb_ColNum ;
   private String[] P09NU4_A5538Lb_ColNomC ;
   private String[] P09NU4_A5533Lb_ArtCod ;
   private int[] P09NU4_A252CliCod ;
   private int[] P09NU4_A5532Lb_numero ;
   private String[] P09NU5_A396EmprCod ;
   private String[] P09NU5_A5540Lb_Cartaz ;
   private java.util.Date[] P09NU5_A6461Lb_FecNoa1 ;
   private byte[] P09NU5_A5569Lb_EstEns ;
   private String[] P09NU5_A5536Lb_ColNom ;
   private String[] P09NU5_A10822Lb_ObsCR ;
   private byte[] P09NU5_A5566Lb_Estado ;
   private java.util.Date[] P09NU5_A5563Lb_FechaR ;
   private java.util.Date[] P09NU5_A5567Lb_FechaEn ;
   private java.util.Date[] P09NU5_A5541Lb_FechaE ;
   private byte[] P09NU5_A5718Lb_numop ;
   private String[] P09NU5_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NU5_A5547Lb_Rb ;
   private int[] P09NU5_A5537Lb_ColNum ;
   private String[] P09NU5_A5538Lb_ColNomC ;
   private String[] P09NU5_A5533Lb_ArtCod ;
   private int[] P09NU5_A252CliCod ;
   private int[] P09NU5_A5532Lb_numero ;
   private String[] P09NU6_A396EmprCod ;
   private String[] P09NU6_A10822Lb_ObsCR ;
   private java.util.Date[] P09NU6_A6461Lb_FecNoa1 ;
   private byte[] P09NU6_A5569Lb_EstEns ;
   private String[] P09NU6_A5536Lb_ColNom ;
   private byte[] P09NU6_A5566Lb_Estado ;
   private java.util.Date[] P09NU6_A5563Lb_FechaR ;
   private java.util.Date[] P09NU6_A5567Lb_FechaEn ;
   private java.util.Date[] P09NU6_A5541Lb_FechaE ;
   private String[] P09NU6_A5540Lb_Cartaz ;
   private byte[] P09NU6_A5718Lb_numop ;
   private String[] P09NU6_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NU6_A5547Lb_Rb ;
   private int[] P09NU6_A5537Lb_ColNum ;
   private String[] P09NU6_A5538Lb_ColNomC ;
   private String[] P09NU6_A5533Lb_ArtCod ;
   private int[] P09NU6_A252CliCod ;
   private int[] P09NU6_A5532Lb_numero ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class recepciondeensayocliente_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV76Clicod ,
                                          String AV77Lb_Cartaz ,
                                          String AV78Lb_ColNom ,
                                          int AV79Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV80Lb_estado ,
                                          String A396EmprCod ,
                                          String AV75Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.Lb_ArtCod, T1.Lb_FecNoa1, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop," ;
      scmdbuf += " T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ColNomC, T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ArtCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09NU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV76Clicod ,
                                          String AV77Lb_Cartaz ,
                                          String AV78Lb_ColNom ,
                                          int AV79Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV80Lb_estado ,
                                          String A396EmprCod ,
                                          String AV75Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[41];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.Lb_ColNomC, T1.Lb_FecNoa1, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz," ;
      scmdbuf += " T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ColNomC" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09NU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV76Clicod ,
                                          String AV77Lb_Cartaz ,
                                          String AV78Lb_ColNom ,
                                          int AV79Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV80Lb_estado ,
                                          String A396EmprCod ,
                                          String AV75Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_opcion, T1.Lb_FecNoa1, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop," ;
      scmdbuf += " T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_opcion" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09NU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV76Clicod ,
                                          String AV77Lb_Cartaz ,
                                          String AV78Lb_ColNom ,
                                          int AV79Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV80Lb_estado ,
                                          String A396EmprCod ,
                                          String AV75Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[41];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.Lb_Cartaz, T1.Lb_FecNoa1, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T1.Lb_numop, T1.Lb_opcion," ;
      scmdbuf += " T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
         GXv_int11[12] = (byte)(1) ;
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09NU6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV76Clicod ,
                                          String AV77Lb_Cartaz ,
                                          String AV78Lb_ColNom ,
                                          int AV79Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV80Lb_estado ,
                                          String A396EmprCod ,
                                          String AV75Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[41];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ObsCR, T1.Lb_FecNoa1, T2.Lb_EstEns, T2.Lb_ColNom, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion," ;
      scmdbuf += " T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV108Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV121Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV122Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV129Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
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
                  return conditional_P09NU2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 1 :
                  return conditional_P09NU3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 2 :
                  return conditional_P09NU4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 3 :
                  return conditional_P09NU5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 4 :
                  return conditional_P09NU6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).byteValue() , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NU6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
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
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
      }
   }

}

