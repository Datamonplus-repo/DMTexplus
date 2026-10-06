package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultasituacioncoleccion_wcgetfilterdata extends GXProcedure
{
   public consultasituacioncoleccion_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultasituacioncoleccion_wcgetfilterdata.class ), "" );
   }

   public consultasituacioncoleccion_wcgetfilterdata( int remoteHandle ,
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
      consultasituacioncoleccion_wcgetfilterdata.this.aP5 = new String[] {""};
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
      consultasituacioncoleccion_wcgetfilterdata.this.AV180DDOName = aP0;
      consultasituacioncoleccion_wcgetfilterdata.this.AV178SearchTxt = aP1;
      consultasituacioncoleccion_wcgetfilterdata.this.AV179SearchTxtTo = aP2;
      consultasituacioncoleccion_wcgetfilterdata.this.aP3 = aP3;
      consultasituacioncoleccion_wcgetfilterdata.this.aP4 = aP4;
      consultasituacioncoleccion_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV183Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV186OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV188OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_LB_CARTAZ") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_LB_ARTCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_LB_COLNOMC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_LB_COLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_LB_TIPO") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_TIPOOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_LB_LOCAL") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_LOCALOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV180DDOName), "DDO_LB_OBSLB") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_OBSLBOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV184OptionsJson = AV183Options.toJSonString(false) ;
      AV187OptionsDescJson = AV186OptionsDesc.toJSonString(false) ;
      AV189OptionIndexesJson = AV188OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV191Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), "") == 0 )
      {
         AV193GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), null, null);
      }
      else
      {
         AV193GridState.fromxml(AV191Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), null, null);
      }
      AV216GXV1 = 1 ;
      while ( AV216GXV1 <= AV193GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV194GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV193GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV216GXV1));
         if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV196FilterFullText = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV40TFLb_Cartaz = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV41TFLb_Cartaz_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV20TFLb_ArtCod = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV21TFLb_ArtCod_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV36TFLb_ColNomC = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV37TFLb_ColNomC_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV28TFLb_ColNom = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV29TFLb_ColNom_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV30TFLb_ColNum = (int)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFLb_ColNum_To = (int)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV12TFLb_numero = (int)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFLb_numero_To = (int)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV76TFLb_Tipo = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV77TFLb_Tipo_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV212TFLb_EstEns_SelsJson = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV213TFLb_EstEns_Sels.fromJSonString(AV212TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL") == 0 )
         {
            AV100TFLb_Local = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL_SEL") == 0 )
         {
            AV101TFLb_Local_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV42TFLb_FechaE = localUtil.ctod( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV54TFLb_Rb = CommonUtil.decimalVal( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFLb_Rb_To = CommonUtil.decimalVal( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB") == 0 )
         {
            AV176TFLb_obsLb = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB_SEL") == 0 )
         {
            AV177TFLb_obsLb_Sel = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV197Emprcod = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV198Clicod = (int)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ARTCOD") == 0 )
         {
            AV199Lb_Artcod = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV200Lb_numero = (int)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTENS") == 0 )
         {
            AV210Lb_EstEns = (byte)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV202Lb_FechaEfrom = localUtil.ctod( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV203Lb_FechaEto = localUtil.ctod( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV204Lb_Cartaz = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZFFROM") == 0 )
         {
            AV205Lb_cartazffrom = localUtil.ctod( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZFTO") == 0 )
         {
            AV206Lb_cartazfto = localUtil.ctod( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV207Lb_ColNom = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNUM") == 0 )
         {
            AV208Lb_ColNum = (int)(GXutil.lval( AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOMC") == 0 )
         {
            AV209Lb_ColNomC = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_TIPO") == 0 )
         {
            AV211Lb_Tipo = AV194GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV216GXV1 = (int)(AV216GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV178SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL2 */
      pr_default.execute(0, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OL2 = false ;
         A396EmprCod = P09OL2_A396EmprCod[0] ;
         A279CliNom = P09OL2_A279CliNom[0] ;
         A5594Lb_cartazf = P09OL2_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL2_A252CliCod[0] ;
         A10883Lb_obsLb = P09OL2_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OL2_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL2_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OL2_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OL2_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OL2_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09OL2_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OL2_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09OL2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09OL2_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09OL2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OL2_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OL2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9OL2 = false ;
            A396EmprCod = P09OL2_A396EmprCod[0] ;
            A252CliCod = P09OL2_A252CliCod[0] ;
            A5532Lb_numero = P09OL2_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV182Option = A279CliNom ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL2 )
         {
            brk9OL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV40TFLb_Cartaz = AV178SearchTxt ;
      AV41TFLb_Cartaz_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL3 */
      pr_default.execute(1, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OL4 = false ;
         A396EmprCod = P09OL3_A396EmprCod[0] ;
         A5540Lb_Cartaz = P09OL3_A5540Lb_Cartaz[0] ;
         A5594Lb_cartazf = P09OL3_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL3_A252CliCod[0] ;
         A10883Lb_obsLb = P09OL3_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OL3_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL3_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OL3_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OL3_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OL3_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09OL3_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL3_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OL3_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09OL3_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09OL3_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OL3_A279CliNom[0] ;
         A279CliNom = P09OL3_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OL3_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9OL4 = false ;
            A396EmprCod = P09OL3_A396EmprCod[0] ;
            A5532Lb_numero = P09OL3_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5540Lb_Cartaz)==0) )
         {
            AV182Option = A5540Lb_Cartaz ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL4 )
         {
            brk9OL4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFLb_ArtCod = AV178SearchTxt ;
      AV21TFLb_ArtCod_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL4 */
      pr_default.execute(2, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9OL6 = false ;
         A396EmprCod = P09OL4_A396EmprCod[0] ;
         A5533Lb_ArtCod = P09OL4_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09OL4_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL4_A252CliCod[0] ;
         A10883Lb_obsLb = P09OL4_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OL4_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL4_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OL4_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OL4_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OL4_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09OL4_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OL4_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09OL4_A5538Lb_ColNomC[0] ;
         A5540Lb_Cartaz = P09OL4_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OL4_A279CliNom[0] ;
         A279CliNom = P09OL4_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09OL4_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk9OL6 = false ;
            A396EmprCod = P09OL4_A396EmprCod[0] ;
            A5532Lb_numero = P09OL4_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
         {
            AV182Option = A5533Lb_ArtCod ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL6 )
         {
            brk9OL6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_COLNOMCOPTIONS' Routine */
      returnInSub = false ;
      AV36TFLb_ColNomC = AV178SearchTxt ;
      AV37TFLb_ColNomC_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL5 */
      pr_default.execute(3, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9OL8 = false ;
         A396EmprCod = P09OL5_A396EmprCod[0] ;
         A5538Lb_ColNomC = P09OL5_A5538Lb_ColNomC[0] ;
         A5594Lb_cartazf = P09OL5_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL5_A252CliCod[0] ;
         A10883Lb_obsLb = P09OL5_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OL5_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL5_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OL5_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OL5_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OL5_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09OL5_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL5_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OL5_A5536Lb_ColNom[0] ;
         A5533Lb_ArtCod = P09OL5_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09OL5_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OL5_A279CliNom[0] ;
         A279CliNom = P09OL5_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09OL5_A5538Lb_ColNomC[0], A5538Lb_ColNomC) == 0 ) )
         {
            brk9OL8 = false ;
            A396EmprCod = P09OL5_A396EmprCod[0] ;
            A5532Lb_numero = P09OL5_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
         {
            AV182Option = A5538Lb_ColNomC ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL8 )
         {
            brk9OL8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV28TFLb_ColNom = AV178SearchTxt ;
      AV29TFLb_ColNom_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL6 */
      pr_default.execute(4, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9OL10 = false ;
         A396EmprCod = P09OL6_A396EmprCod[0] ;
         A5536Lb_ColNom = P09OL6_A5536Lb_ColNom[0] ;
         A5594Lb_cartazf = P09OL6_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL6_A252CliCod[0] ;
         A10883Lb_obsLb = P09OL6_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OL6_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL6_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OL6_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OL6_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OL6_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09OL6_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL6_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09OL6_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09OL6_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09OL6_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OL6_A279CliNom[0] ;
         A279CliNom = P09OL6_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09OL6_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
         {
            brk9OL10 = false ;
            A396EmprCod = P09OL6_A396EmprCod[0] ;
            A5532Lb_numero = P09OL6_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5536Lb_ColNom)==0) )
         {
            AV182Option = A5536Lb_ColNom ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL10 )
         {
            brk9OL10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADLB_TIPOOPTIONS' Routine */
      returnInSub = false ;
      AV76TFLb_Tipo = AV178SearchTxt ;
      AV77TFLb_Tipo_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL7 */
      pr_default.execute(5, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9OL12 = false ;
         A396EmprCod = P09OL7_A396EmprCod[0] ;
         A5570Lb_Tipo = P09OL7_A5570Lb_Tipo[0] ;
         A5594Lb_cartazf = P09OL7_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL7_A252CliCod[0] ;
         A10883Lb_obsLb = P09OL7_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OL7_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL7_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OL7_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OL7_A5569Lb_EstEns[0] ;
         A5532Lb_numero = P09OL7_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL7_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OL7_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09OL7_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09OL7_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09OL7_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OL7_A279CliNom[0] ;
         A279CliNom = P09OL7_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09OL7_A5570Lb_Tipo[0], A5570Lb_Tipo) == 0 ) )
         {
            brk9OL12 = false ;
            A396EmprCod = P09OL7_A396EmprCod[0] ;
            A5532Lb_numero = P09OL7_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A5570Lb_Tipo)==0) )
         {
            AV182Option = A5570Lb_Tipo ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL12 )
         {
            brk9OL12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADLB_LOCALOPTIONS' Routine */
      returnInSub = false ;
      AV100TFLb_Local = AV178SearchTxt ;
      AV101TFLb_Local_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL8 */
      pr_default.execute(6, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9OL14 = false ;
         A396EmprCod = P09OL8_A396EmprCod[0] ;
         A5701Lb_Local = P09OL8_A5701Lb_Local[0] ;
         A5594Lb_cartazf = P09OL8_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL8_A252CliCod[0] ;
         A10883Lb_obsLb = P09OL8_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OL8_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL8_A5541Lb_FechaE[0] ;
         A5569Lb_EstEns = P09OL8_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OL8_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09OL8_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL8_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OL8_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09OL8_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09OL8_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09OL8_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OL8_A279CliNom[0] ;
         A279CliNom = P09OL8_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09OL8_A5701Lb_Local[0], A5701Lb_Local) == 0 ) )
         {
            brk9OL14 = false ;
            A396EmprCod = P09OL8_A396EmprCod[0] ;
            A5532Lb_numero = P09OL8_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A5701Lb_Local)==0) )
         {
            AV182Option = A5701Lb_Local ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL14 )
         {
            brk9OL14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADLB_OBSLBOPTIONS' Routine */
      returnInSub = false ;
      AV176TFLb_obsLb = AV178SearchTxt ;
      AV177TFLb_obsLb_Sel = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV196FilterFullText ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV18TFCliNom ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV19TFCliNom_Sel ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV40TFLb_Cartaz ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV41TFLb_Cartaz_Sel ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV20TFLb_ArtCod ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV21TFLb_ArtCod_Sel ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV36TFLb_ColNomC ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV37TFLb_ColNomC_Sel ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV28TFLb_ColNom ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV29TFLb_ColNom_Sel ;
      AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV30TFLb_ColNum ;
      AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV31TFLb_ColNum_To ;
      AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV12TFLb_numero ;
      AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV13TFLb_numero_To ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV76TFLb_Tipo ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV77TFLb_Tipo_Sel ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV213TFLb_EstEns_Sels ;
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV100TFLb_Local ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV101TFLb_Local_Sel ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV42TFLb_FechaE ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV54TFLb_Rb ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV55TFLb_Rb_To ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV176TFLb_obsLb ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV177TFLb_obsLb_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV198Clicod) ,
                                           Integer.valueOf(AV200Lb_numero) ,
                                           AV205Lb_cartazffrom ,
                                           AV206Lb_cartazfto ,
                                           AV202Lb_FechaEfrom ,
                                           AV203Lb_FechaEto ,
                                           Integer.valueOf(AV208Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           AV204Lb_Cartaz ,
                                           AV199Lb_Artcod ,
                                           AV209Lb_ColNomC ,
                                           AV207Lb_ColNom ,
                                           Byte.valueOf(AV210Lb_EstEns) ,
                                           AV211Lb_Tipo ,
                                           A396EmprCod ,
                                           AV197Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV204Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV204Lb_Cartaz), 20, "%") ;
      lV199Lb_Artcod = GXutil.padr( GXutil.rtrim( AV199Lb_Artcod), 16, "%") ;
      lV209Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV209Lb_ColNomC), 13, "%") ;
      lV207Lb_ColNom = GXutil.padr( GXutil.rtrim( AV207Lb_ColNom), 13, "%") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OL9 */
      pr_default.execute(7, new Object[] {lV204Lb_Cartaz, AV204Lb_Cartaz, lV199Lb_Artcod, AV199Lb_Artcod, lV209Lb_ColNomC, AV209Lb_ColNomC, lV207Lb_ColNom, AV207Lb_ColNom, Byte.valueOf(AV210Lb_EstEns), Byte.valueOf(AV210Lb_EstEns), AV211Lb_Tipo, AV211Lb_Tipo, AV197Emprcod, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV198Clicod), Integer.valueOf(AV200Lb_numero), AV205Lb_cartazffrom, AV206Lb_cartazfto, AV202Lb_FechaEfrom, AV203Lb_FechaEto, Integer.valueOf(AV208Lb_ColNum)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9OL16 = false ;
         A396EmprCod = P09OL9_A396EmprCod[0] ;
         A10883Lb_obsLb = P09OL9_A10883Lb_obsLb[0] ;
         A5594Lb_cartazf = P09OL9_A5594Lb_cartazf[0] ;
         A252CliCod = P09OL9_A252CliCod[0] ;
         A5547Lb_Rb = P09OL9_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OL9_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OL9_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OL9_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OL9_A5570Lb_Tipo[0] ;
         A5532Lb_numero = P09OL9_A5532Lb_numero[0] ;
         A5537Lb_ColNum = P09OL9_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OL9_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09OL9_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09OL9_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09OL9_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OL9_A279CliNom[0] ;
         A279CliNom = P09OL9_A279CliNom[0] ;
         AV190count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09OL9_A10883Lb_obsLb[0], A10883Lb_obsLb) == 0 ) )
         {
            brk9OL16 = false ;
            A396EmprCod = P09OL9_A396EmprCod[0] ;
            A5532Lb_numero = P09OL9_A5532Lb_numero[0] ;
            AV190count = (long)(AV190count+1) ;
            brk9OL16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A10883Lb_obsLb)==0) )
         {
            AV182Option = A10883Lb_obsLb ;
            AV183Options.add(AV182Option, 0);
            AV188OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV190count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV183Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OL16 )
         {
            brk9OL16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultasituacioncoleccion_wcgetfilterdata.this.AV184OptionsJson;
      this.aP4[0] = consultasituacioncoleccion_wcgetfilterdata.this.AV187OptionsDescJson;
      this.aP5[0] = consultasituacioncoleccion_wcgetfilterdata.this.AV189OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV184OptionsJson = "" ;
      AV187OptionsDescJson = "" ;
      AV189OptionIndexesJson = "" ;
      AV183Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV186OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV188OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV191Session = httpContext.getWebSession();
      AV193GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV194GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV196FilterFullText = "" ;
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV40TFLb_Cartaz = "" ;
      AV41TFLb_Cartaz_Sel = "" ;
      AV20TFLb_ArtCod = "" ;
      AV21TFLb_ArtCod_Sel = "" ;
      AV36TFLb_ColNomC = "" ;
      AV37TFLb_ColNomC_Sel = "" ;
      AV28TFLb_ColNom = "" ;
      AV29TFLb_ColNom_Sel = "" ;
      AV76TFLb_Tipo = "" ;
      AV77TFLb_Tipo_Sel = "" ;
      AV212TFLb_EstEns_SelsJson = "" ;
      AV213TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV100TFLb_Local = "" ;
      AV101TFLb_Local_Sel = "" ;
      AV42TFLb_FechaE = GXutil.nullDate() ;
      AV54TFLb_Rb = DecimalUtil.ZERO ;
      AV55TFLb_Rb_To = DecimalUtil.ZERO ;
      AV176TFLb_obsLb = "" ;
      AV177TFLb_obsLb_Sel = "" ;
      AV197Emprcod = "" ;
      AV199Lb_Artcod = "" ;
      AV202Lb_FechaEfrom = GXutil.nullDate() ;
      AV203Lb_FechaEto = GXutil.nullDate() ;
      AV204Lb_Cartaz = "" ;
      AV205Lb_cartazffrom = GXutil.nullDate() ;
      AV206Lb_cartazfto = GXutil.nullDate() ;
      AV207Lb_ColNom = "" ;
      AV209Lb_ColNomC = "" ;
      AV211Lb_Tipo = "" ;
      A279CliNom = "" ;
      AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = "" ;
      AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = "" ;
      AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = "" ;
      AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = "" ;
      AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = "" ;
      AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = "" ;
      AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = "" ;
      AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = GXutil.nullDate() ;
      AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = DecimalUtil.ZERO ;
      AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = DecimalUtil.ZERO ;
      AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = "" ;
      lV204Lb_Cartaz = "" ;
      lV199Lb_Artcod = "" ;
      lV209Lb_ColNomC = "" ;
      lV207Lb_ColNom = "" ;
      scmdbuf = "" ;
      lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5570Lb_Tipo = "" ;
      A5701Lb_Local = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A10883Lb_obsLb = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09OL2_A396EmprCod = new String[] {""} ;
      P09OL2_A279CliNom = new String[] {""} ;
      P09OL2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL2_A252CliCod = new int[1] ;
      P09OL2_A10883Lb_obsLb = new String[] {""} ;
      P09OL2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL2_A5701Lb_Local = new String[] {""} ;
      P09OL2_A5569Lb_EstEns = new byte[1] ;
      P09OL2_A5570Lb_Tipo = new String[] {""} ;
      P09OL2_A5532Lb_numero = new int[1] ;
      P09OL2_A5537Lb_ColNum = new int[1] ;
      P09OL2_A5536Lb_ColNom = new String[] {""} ;
      P09OL2_A5538Lb_ColNomC = new String[] {""} ;
      P09OL2_A5533Lb_ArtCod = new String[] {""} ;
      P09OL2_A5540Lb_Cartaz = new String[] {""} ;
      AV182Option = "" ;
      P09OL3_A396EmprCod = new String[] {""} ;
      P09OL3_A5540Lb_Cartaz = new String[] {""} ;
      P09OL3_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL3_A252CliCod = new int[1] ;
      P09OL3_A10883Lb_obsLb = new String[] {""} ;
      P09OL3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL3_A5701Lb_Local = new String[] {""} ;
      P09OL3_A5569Lb_EstEns = new byte[1] ;
      P09OL3_A5570Lb_Tipo = new String[] {""} ;
      P09OL3_A5532Lb_numero = new int[1] ;
      P09OL3_A5537Lb_ColNum = new int[1] ;
      P09OL3_A5536Lb_ColNom = new String[] {""} ;
      P09OL3_A5538Lb_ColNomC = new String[] {""} ;
      P09OL3_A5533Lb_ArtCod = new String[] {""} ;
      P09OL3_A279CliNom = new String[] {""} ;
      P09OL4_A396EmprCod = new String[] {""} ;
      P09OL4_A5533Lb_ArtCod = new String[] {""} ;
      P09OL4_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL4_A252CliCod = new int[1] ;
      P09OL4_A10883Lb_obsLb = new String[] {""} ;
      P09OL4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL4_A5701Lb_Local = new String[] {""} ;
      P09OL4_A5569Lb_EstEns = new byte[1] ;
      P09OL4_A5570Lb_Tipo = new String[] {""} ;
      P09OL4_A5532Lb_numero = new int[1] ;
      P09OL4_A5537Lb_ColNum = new int[1] ;
      P09OL4_A5536Lb_ColNom = new String[] {""} ;
      P09OL4_A5538Lb_ColNomC = new String[] {""} ;
      P09OL4_A5540Lb_Cartaz = new String[] {""} ;
      P09OL4_A279CliNom = new String[] {""} ;
      P09OL5_A396EmprCod = new String[] {""} ;
      P09OL5_A5538Lb_ColNomC = new String[] {""} ;
      P09OL5_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL5_A252CliCod = new int[1] ;
      P09OL5_A10883Lb_obsLb = new String[] {""} ;
      P09OL5_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL5_A5701Lb_Local = new String[] {""} ;
      P09OL5_A5569Lb_EstEns = new byte[1] ;
      P09OL5_A5570Lb_Tipo = new String[] {""} ;
      P09OL5_A5532Lb_numero = new int[1] ;
      P09OL5_A5537Lb_ColNum = new int[1] ;
      P09OL5_A5536Lb_ColNom = new String[] {""} ;
      P09OL5_A5533Lb_ArtCod = new String[] {""} ;
      P09OL5_A5540Lb_Cartaz = new String[] {""} ;
      P09OL5_A279CliNom = new String[] {""} ;
      P09OL6_A396EmprCod = new String[] {""} ;
      P09OL6_A5536Lb_ColNom = new String[] {""} ;
      P09OL6_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL6_A252CliCod = new int[1] ;
      P09OL6_A10883Lb_obsLb = new String[] {""} ;
      P09OL6_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL6_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL6_A5701Lb_Local = new String[] {""} ;
      P09OL6_A5569Lb_EstEns = new byte[1] ;
      P09OL6_A5570Lb_Tipo = new String[] {""} ;
      P09OL6_A5532Lb_numero = new int[1] ;
      P09OL6_A5537Lb_ColNum = new int[1] ;
      P09OL6_A5538Lb_ColNomC = new String[] {""} ;
      P09OL6_A5533Lb_ArtCod = new String[] {""} ;
      P09OL6_A5540Lb_Cartaz = new String[] {""} ;
      P09OL6_A279CliNom = new String[] {""} ;
      P09OL7_A396EmprCod = new String[] {""} ;
      P09OL7_A5570Lb_Tipo = new String[] {""} ;
      P09OL7_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL7_A252CliCod = new int[1] ;
      P09OL7_A10883Lb_obsLb = new String[] {""} ;
      P09OL7_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL7_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL7_A5701Lb_Local = new String[] {""} ;
      P09OL7_A5569Lb_EstEns = new byte[1] ;
      P09OL7_A5532Lb_numero = new int[1] ;
      P09OL7_A5537Lb_ColNum = new int[1] ;
      P09OL7_A5536Lb_ColNom = new String[] {""} ;
      P09OL7_A5538Lb_ColNomC = new String[] {""} ;
      P09OL7_A5533Lb_ArtCod = new String[] {""} ;
      P09OL7_A5540Lb_Cartaz = new String[] {""} ;
      P09OL7_A279CliNom = new String[] {""} ;
      P09OL8_A396EmprCod = new String[] {""} ;
      P09OL8_A5701Lb_Local = new String[] {""} ;
      P09OL8_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL8_A252CliCod = new int[1] ;
      P09OL8_A10883Lb_obsLb = new String[] {""} ;
      P09OL8_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL8_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL8_A5569Lb_EstEns = new byte[1] ;
      P09OL8_A5570Lb_Tipo = new String[] {""} ;
      P09OL8_A5532Lb_numero = new int[1] ;
      P09OL8_A5537Lb_ColNum = new int[1] ;
      P09OL8_A5536Lb_ColNom = new String[] {""} ;
      P09OL8_A5538Lb_ColNomC = new String[] {""} ;
      P09OL8_A5533Lb_ArtCod = new String[] {""} ;
      P09OL8_A5540Lb_Cartaz = new String[] {""} ;
      P09OL8_A279CliNom = new String[] {""} ;
      P09OL9_A396EmprCod = new String[] {""} ;
      P09OL9_A10883Lb_obsLb = new String[] {""} ;
      P09OL9_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL9_A252CliCod = new int[1] ;
      P09OL9_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OL9_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OL9_A5701Lb_Local = new String[] {""} ;
      P09OL9_A5569Lb_EstEns = new byte[1] ;
      P09OL9_A5570Lb_Tipo = new String[] {""} ;
      P09OL9_A5532Lb_numero = new int[1] ;
      P09OL9_A5537Lb_ColNum = new int[1] ;
      P09OL9_A5536Lb_ColNom = new String[] {""} ;
      P09OL9_A5538Lb_ColNomC = new String[] {""} ;
      P09OL9_A5533Lb_ArtCod = new String[] {""} ;
      P09OL9_A5540Lb_Cartaz = new String[] {""} ;
      P09OL9_A279CliNom = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OL2_A396EmprCod, P09OL2_A279CliNom, P09OL2_A5594Lb_cartazf, P09OL2_A252CliCod, P09OL2_A10883Lb_obsLb, P09OL2_A5547Lb_Rb, P09OL2_A5541Lb_FechaE, P09OL2_A5701Lb_Local, P09OL2_A5569Lb_EstEns, P09OL2_A5570Lb_Tipo,
            P09OL2_A5532Lb_numero, P09OL2_A5537Lb_ColNum, P09OL2_A5536Lb_ColNom, P09OL2_A5538Lb_ColNomC, P09OL2_A5533Lb_ArtCod, P09OL2_A5540Lb_Cartaz
            }
            , new Object[] {
            P09OL3_A396EmprCod, P09OL3_A5540Lb_Cartaz, P09OL3_A5594Lb_cartazf, P09OL3_A252CliCod, P09OL3_A10883Lb_obsLb, P09OL3_A5547Lb_Rb, P09OL3_A5541Lb_FechaE, P09OL3_A5701Lb_Local, P09OL3_A5569Lb_EstEns, P09OL3_A5570Lb_Tipo,
            P09OL3_A5532Lb_numero, P09OL3_A5537Lb_ColNum, P09OL3_A5536Lb_ColNom, P09OL3_A5538Lb_ColNomC, P09OL3_A5533Lb_ArtCod, P09OL3_A279CliNom
            }
            , new Object[] {
            P09OL4_A396EmprCod, P09OL4_A5533Lb_ArtCod, P09OL4_A5594Lb_cartazf, P09OL4_A252CliCod, P09OL4_A10883Lb_obsLb, P09OL4_A5547Lb_Rb, P09OL4_A5541Lb_FechaE, P09OL4_A5701Lb_Local, P09OL4_A5569Lb_EstEns, P09OL4_A5570Lb_Tipo,
            P09OL4_A5532Lb_numero, P09OL4_A5537Lb_ColNum, P09OL4_A5536Lb_ColNom, P09OL4_A5538Lb_ColNomC, P09OL4_A5540Lb_Cartaz, P09OL4_A279CliNom
            }
            , new Object[] {
            P09OL5_A396EmprCod, P09OL5_A5538Lb_ColNomC, P09OL5_A5594Lb_cartazf, P09OL5_A252CliCod, P09OL5_A10883Lb_obsLb, P09OL5_A5547Lb_Rb, P09OL5_A5541Lb_FechaE, P09OL5_A5701Lb_Local, P09OL5_A5569Lb_EstEns, P09OL5_A5570Lb_Tipo,
            P09OL5_A5532Lb_numero, P09OL5_A5537Lb_ColNum, P09OL5_A5536Lb_ColNom, P09OL5_A5533Lb_ArtCod, P09OL5_A5540Lb_Cartaz, P09OL5_A279CliNom
            }
            , new Object[] {
            P09OL6_A396EmprCod, P09OL6_A5536Lb_ColNom, P09OL6_A5594Lb_cartazf, P09OL6_A252CliCod, P09OL6_A10883Lb_obsLb, P09OL6_A5547Lb_Rb, P09OL6_A5541Lb_FechaE, P09OL6_A5701Lb_Local, P09OL6_A5569Lb_EstEns, P09OL6_A5570Lb_Tipo,
            P09OL6_A5532Lb_numero, P09OL6_A5537Lb_ColNum, P09OL6_A5538Lb_ColNomC, P09OL6_A5533Lb_ArtCod, P09OL6_A5540Lb_Cartaz, P09OL6_A279CliNom
            }
            , new Object[] {
            P09OL7_A396EmprCod, P09OL7_A5570Lb_Tipo, P09OL7_A5594Lb_cartazf, P09OL7_A252CliCod, P09OL7_A10883Lb_obsLb, P09OL7_A5547Lb_Rb, P09OL7_A5541Lb_FechaE, P09OL7_A5701Lb_Local, P09OL7_A5569Lb_EstEns, P09OL7_A5532Lb_numero,
            P09OL7_A5537Lb_ColNum, P09OL7_A5536Lb_ColNom, P09OL7_A5538Lb_ColNomC, P09OL7_A5533Lb_ArtCod, P09OL7_A5540Lb_Cartaz, P09OL7_A279CliNom
            }
            , new Object[] {
            P09OL8_A396EmprCod, P09OL8_A5701Lb_Local, P09OL8_A5594Lb_cartazf, P09OL8_A252CliCod, P09OL8_A10883Lb_obsLb, P09OL8_A5547Lb_Rb, P09OL8_A5541Lb_FechaE, P09OL8_A5569Lb_EstEns, P09OL8_A5570Lb_Tipo, P09OL8_A5532Lb_numero,
            P09OL8_A5537Lb_ColNum, P09OL8_A5536Lb_ColNom, P09OL8_A5538Lb_ColNomC, P09OL8_A5533Lb_ArtCod, P09OL8_A5540Lb_Cartaz, P09OL8_A279CliNom
            }
            , new Object[] {
            P09OL9_A396EmprCod, P09OL9_A10883Lb_obsLb, P09OL9_A5594Lb_cartazf, P09OL9_A252CliCod, P09OL9_A5547Lb_Rb, P09OL9_A5541Lb_FechaE, P09OL9_A5701Lb_Local, P09OL9_A5569Lb_EstEns, P09OL9_A5570Lb_Tipo, P09OL9_A5532Lb_numero,
            P09OL9_A5537Lb_ColNum, P09OL9_A5536Lb_ColNom, P09OL9_A5538Lb_ColNomC, P09OL9_A5533Lb_ArtCod, P09OL9_A5540Lb_Cartaz, P09OL9_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV210Lb_EstEns ;
   private byte A5569Lb_EstEns ;
   private short Gx_err ;
   private int AV216GXV1 ;
   private int AV30TFLb_ColNum ;
   private int AV31TFLb_ColNum_To ;
   private int AV12TFLb_numero ;
   private int AV13TFLb_numero_To ;
   private int AV198Clicod ;
   private int AV200Lb_numero ;
   private int AV208Lb_ColNum ;
   private int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ;
   private int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ;
   private int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ;
   private int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ;
   private int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private long AV190count ;
   private java.math.BigDecimal AV54TFLb_Rb ;
   private java.math.BigDecimal AV55TFLb_Rb_To ;
   private java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ;
   private java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV40TFLb_Cartaz ;
   private String AV41TFLb_Cartaz_Sel ;
   private String AV20TFLb_ArtCod ;
   private String AV21TFLb_ArtCod_Sel ;
   private String AV36TFLb_ColNomC ;
   private String AV37TFLb_ColNomC_Sel ;
   private String AV28TFLb_ColNom ;
   private String AV29TFLb_ColNom_Sel ;
   private String AV76TFLb_Tipo ;
   private String AV77TFLb_Tipo_Sel ;
   private String AV100TFLb_Local ;
   private String AV101TFLb_Local_Sel ;
   private String AV197Emprcod ;
   private String AV199Lb_Artcod ;
   private String AV204Lb_Cartaz ;
   private String AV207Lb_ColNom ;
   private String AV209Lb_ColNomC ;
   private String AV211Lb_Tipo ;
   private String A279CliNom ;
   private String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ;
   private String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ;
   private String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ;
   private String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ;
   private String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ;
   private String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ;
   private String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ;
   private String lV204Lb_Cartaz ;
   private String lV199Lb_Artcod ;
   private String lV209Lb_ColNomC ;
   private String lV207Lb_ColNom ;
   private String scmdbuf ;
   private String lV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String lV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String lV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String lV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String lV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String lV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String lV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5570Lb_Tipo ;
   private String A5701Lb_Local ;
   private String A396EmprCod ;
   private java.util.Date AV42TFLb_FechaE ;
   private java.util.Date AV202Lb_FechaEfrom ;
   private java.util.Date AV203Lb_FechaEto ;
   private java.util.Date AV205Lb_cartazffrom ;
   private java.util.Date AV206Lb_cartazfto ;
   private java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5594Lb_cartazf ;
   private boolean returnInSub ;
   private boolean brk9OL2 ;
   private boolean brk9OL4 ;
   private boolean brk9OL6 ;
   private boolean brk9OL8 ;
   private boolean brk9OL10 ;
   private boolean brk9OL12 ;
   private boolean brk9OL14 ;
   private boolean brk9OL16 ;
   private String AV184OptionsJson ;
   private String AV187OptionsDescJson ;
   private String AV189OptionIndexesJson ;
   private String AV212TFLb_EstEns_SelsJson ;
   private String AV180DDOName ;
   private String AV178SearchTxt ;
   private String AV179SearchTxtTo ;
   private String AV196FilterFullText ;
   private String AV176TFLb_obsLb ;
   private String AV177TFLb_obsLb_Sel ;
   private String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ;
   private String lV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String lV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private String A10883Lb_obsLb ;
   private String AV182Option ;
   private GXSimpleCollection<Byte> AV213TFLb_EstEns_Sels ;
   private GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ;
   private com.genexus.webpanels.WebSession AV191Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09OL2_A396EmprCod ;
   private String[] P09OL2_A279CliNom ;
   private java.util.Date[] P09OL2_A5594Lb_cartazf ;
   private int[] P09OL2_A252CliCod ;
   private String[] P09OL2_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OL2_A5547Lb_Rb ;
   private java.util.Date[] P09OL2_A5541Lb_FechaE ;
   private String[] P09OL2_A5701Lb_Local ;
   private byte[] P09OL2_A5569Lb_EstEns ;
   private String[] P09OL2_A5570Lb_Tipo ;
   private int[] P09OL2_A5532Lb_numero ;
   private int[] P09OL2_A5537Lb_ColNum ;
   private String[] P09OL2_A5536Lb_ColNom ;
   private String[] P09OL2_A5538Lb_ColNomC ;
   private String[] P09OL2_A5533Lb_ArtCod ;
   private String[] P09OL2_A5540Lb_Cartaz ;
   private String[] P09OL3_A396EmprCod ;
   private String[] P09OL3_A5540Lb_Cartaz ;
   private java.util.Date[] P09OL3_A5594Lb_cartazf ;
   private int[] P09OL3_A252CliCod ;
   private String[] P09OL3_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OL3_A5547Lb_Rb ;
   private java.util.Date[] P09OL3_A5541Lb_FechaE ;
   private String[] P09OL3_A5701Lb_Local ;
   private byte[] P09OL3_A5569Lb_EstEns ;
   private String[] P09OL3_A5570Lb_Tipo ;
   private int[] P09OL3_A5532Lb_numero ;
   private int[] P09OL3_A5537Lb_ColNum ;
   private String[] P09OL3_A5536Lb_ColNom ;
   private String[] P09OL3_A5538Lb_ColNomC ;
   private String[] P09OL3_A5533Lb_ArtCod ;
   private String[] P09OL3_A279CliNom ;
   private String[] P09OL4_A396EmprCod ;
   private String[] P09OL4_A5533Lb_ArtCod ;
   private java.util.Date[] P09OL4_A5594Lb_cartazf ;
   private int[] P09OL4_A252CliCod ;
   private String[] P09OL4_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OL4_A5547Lb_Rb ;
   private java.util.Date[] P09OL4_A5541Lb_FechaE ;
   private String[] P09OL4_A5701Lb_Local ;
   private byte[] P09OL4_A5569Lb_EstEns ;
   private String[] P09OL4_A5570Lb_Tipo ;
   private int[] P09OL4_A5532Lb_numero ;
   private int[] P09OL4_A5537Lb_ColNum ;
   private String[] P09OL4_A5536Lb_ColNom ;
   private String[] P09OL4_A5538Lb_ColNomC ;
   private String[] P09OL4_A5540Lb_Cartaz ;
   private String[] P09OL4_A279CliNom ;
   private String[] P09OL5_A396EmprCod ;
   private String[] P09OL5_A5538Lb_ColNomC ;
   private java.util.Date[] P09OL5_A5594Lb_cartazf ;
   private int[] P09OL5_A252CliCod ;
   private String[] P09OL5_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OL5_A5547Lb_Rb ;
   private java.util.Date[] P09OL5_A5541Lb_FechaE ;
   private String[] P09OL5_A5701Lb_Local ;
   private byte[] P09OL5_A5569Lb_EstEns ;
   private String[] P09OL5_A5570Lb_Tipo ;
   private int[] P09OL5_A5532Lb_numero ;
   private int[] P09OL5_A5537Lb_ColNum ;
   private String[] P09OL5_A5536Lb_ColNom ;
   private String[] P09OL5_A5533Lb_ArtCod ;
   private String[] P09OL5_A5540Lb_Cartaz ;
   private String[] P09OL5_A279CliNom ;
   private String[] P09OL6_A396EmprCod ;
   private String[] P09OL6_A5536Lb_ColNom ;
   private java.util.Date[] P09OL6_A5594Lb_cartazf ;
   private int[] P09OL6_A252CliCod ;
   private String[] P09OL6_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OL6_A5547Lb_Rb ;
   private java.util.Date[] P09OL6_A5541Lb_FechaE ;
   private String[] P09OL6_A5701Lb_Local ;
   private byte[] P09OL6_A5569Lb_EstEns ;
   private String[] P09OL6_A5570Lb_Tipo ;
   private int[] P09OL6_A5532Lb_numero ;
   private int[] P09OL6_A5537Lb_ColNum ;
   private String[] P09OL6_A5538Lb_ColNomC ;
   private String[] P09OL6_A5533Lb_ArtCod ;
   private String[] P09OL6_A5540Lb_Cartaz ;
   private String[] P09OL6_A279CliNom ;
   private String[] P09OL7_A396EmprCod ;
   private String[] P09OL7_A5570Lb_Tipo ;
   private java.util.Date[] P09OL7_A5594Lb_cartazf ;
   private int[] P09OL7_A252CliCod ;
   private String[] P09OL7_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OL7_A5547Lb_Rb ;
   private java.util.Date[] P09OL7_A5541Lb_FechaE ;
   private String[] P09OL7_A5701Lb_Local ;
   private byte[] P09OL7_A5569Lb_EstEns ;
   private int[] P09OL7_A5532Lb_numero ;
   private int[] P09OL7_A5537Lb_ColNum ;
   private String[] P09OL7_A5536Lb_ColNom ;
   private String[] P09OL7_A5538Lb_ColNomC ;
   private String[] P09OL7_A5533Lb_ArtCod ;
   private String[] P09OL7_A5540Lb_Cartaz ;
   private String[] P09OL7_A279CliNom ;
   private String[] P09OL8_A396EmprCod ;
   private String[] P09OL8_A5701Lb_Local ;
   private java.util.Date[] P09OL8_A5594Lb_cartazf ;
   private int[] P09OL8_A252CliCod ;
   private String[] P09OL8_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OL8_A5547Lb_Rb ;
   private java.util.Date[] P09OL8_A5541Lb_FechaE ;
   private byte[] P09OL8_A5569Lb_EstEns ;
   private String[] P09OL8_A5570Lb_Tipo ;
   private int[] P09OL8_A5532Lb_numero ;
   private int[] P09OL8_A5537Lb_ColNum ;
   private String[] P09OL8_A5536Lb_ColNom ;
   private String[] P09OL8_A5538Lb_ColNomC ;
   private String[] P09OL8_A5533Lb_ArtCod ;
   private String[] P09OL8_A5540Lb_Cartaz ;
   private String[] P09OL8_A279CliNom ;
   private String[] P09OL9_A396EmprCod ;
   private String[] P09OL9_A10883Lb_obsLb ;
   private java.util.Date[] P09OL9_A5594Lb_cartazf ;
   private int[] P09OL9_A252CliCod ;
   private java.math.BigDecimal[] P09OL9_A5547Lb_Rb ;
   private java.util.Date[] P09OL9_A5541Lb_FechaE ;
   private String[] P09OL9_A5701Lb_Local ;
   private byte[] P09OL9_A5569Lb_EstEns ;
   private String[] P09OL9_A5570Lb_Tipo ;
   private int[] P09OL9_A5532Lb_numero ;
   private int[] P09OL9_A5537Lb_ColNum ;
   private String[] P09OL9_A5536Lb_ColNom ;
   private String[] P09OL9_A5538Lb_ColNomC ;
   private String[] P09OL9_A5533Lb_ArtCod ;
   private String[] P09OL9_A5540Lb_Cartaz ;
   private String[] P09OL9_A279CliNom ;
   private GXSimpleCollection<String> AV183Options ;
   private GXSimpleCollection<String> AV186OptionsDesc ;
   private GXSimpleCollection<String> AV188OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV193GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV194GridStateFilterValue ;
}

final  class consultasituacioncoleccion_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[55];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum, T1.Lb_ColNom," ;
      scmdbuf += " T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_Cartaz FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
         GXv_int2[19] = (byte)(1) ;
         GXv_int2[20] = (byte)(1) ;
         GXv_int2[21] = (byte)(1) ;
         GXv_int2[22] = (byte)(1) ;
         GXv_int2[23] = (byte)(1) ;
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[55];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_Cartaz, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtCod, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
         GXv_int5[14] = (byte)(1) ;
         GXv_int5[15] = (byte)(1) ;
         GXv_int5[16] = (byte)(1) ;
         GXv_int5[17] = (byte)(1) ;
         GXv_int5[18] = (byte)(1) ;
         GXv_int5[19] = (byte)(1) ;
         GXv_int5[20] = (byte)(1) ;
         GXv_int5[21] = (byte)(1) ;
         GXv_int5[22] = (byte)(1) ;
         GXv_int5[23] = (byte)(1) ;
         GXv_int5[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int5[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int5[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int5[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int5[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int5[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int5[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int5[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09OL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[55];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ArtCod, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
         GXv_int8[18] = (byte)(1) ;
         GXv_int8[19] = (byte)(1) ;
         GXv_int8[20] = (byte)(1) ;
         GXv_int8[21] = (byte)(1) ;
         GXv_int8[22] = (byte)(1) ;
         GXv_int8[23] = (byte)(1) ;
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09OL5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[55];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ColNomC, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
         GXv_int11[14] = (byte)(1) ;
         GXv_int11[15] = (byte)(1) ;
         GXv_int11[16] = (byte)(1) ;
         GXv_int11[17] = (byte)(1) ;
         GXv_int11[18] = (byte)(1) ;
         GXv_int11[19] = (byte)(1) ;
         GXv_int11[20] = (byte)(1) ;
         GXv_int11[21] = (byte)(1) ;
         GXv_int11[22] = (byte)(1) ;
         GXv_int11[23] = (byte)(1) ;
         GXv_int11[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09OL6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[55];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ColNom, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
         GXv_int14[14] = (byte)(1) ;
         GXv_int14[15] = (byte)(1) ;
         GXv_int14[16] = (byte)(1) ;
         GXv_int14[17] = (byte)(1) ;
         GXv_int14[18] = (byte)(1) ;
         GXv_int14[19] = (byte)(1) ;
         GXv_int14[20] = (byte)(1) ;
         GXv_int14[21] = (byte)(1) ;
         GXv_int14[22] = (byte)(1) ;
         GXv_int14[23] = (byte)(1) ;
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09OL7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[55];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_Tipo, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_numero, T1.Lb_ColNum, T1.Lb_ColNom," ;
      scmdbuf += " T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
         GXv_int17[14] = (byte)(1) ;
         GXv_int17[15] = (byte)(1) ;
         GXv_int17[16] = (byte)(1) ;
         GXv_int17[17] = (byte)(1) ;
         GXv_int17[18] = (byte)(1) ;
         GXv_int17[19] = (byte)(1) ;
         GXv_int17[20] = (byte)(1) ;
         GXv_int17[21] = (byte)(1) ;
         GXv_int17[22] = (byte)(1) ;
         GXv_int17[23] = (byte)(1) ;
         GXv_int17[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int17[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int17[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int17[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int17[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int17[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09OL8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[55];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_Local, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum, T1.Lb_ColNom," ;
      scmdbuf += " T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
         GXv_int20[14] = (byte)(1) ;
         GXv_int20[15] = (byte)(1) ;
         GXv_int20[16] = (byte)(1) ;
         GXv_int20[17] = (byte)(1) ;
         GXv_int20[18] = (byte)(1) ;
         GXv_int20[19] = (byte)(1) ;
         GXv_int20[20] = (byte)(1) ;
         GXv_int20[21] = (byte)(1) ;
         GXv_int20[22] = (byte)(1) ;
         GXv_int20[23] = (byte)(1) ;
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int20[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int20[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int20[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Local" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09OL9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV198Clicod ,
                                          int AV200Lb_numero ,
                                          java.util.Date AV205Lb_cartazffrom ,
                                          java.util.Date AV206Lb_cartazfto ,
                                          java.util.Date AV202Lb_FechaEfrom ,
                                          java.util.Date AV203Lb_FechaEto ,
                                          int AV208Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          String AV204Lb_Cartaz ,
                                          String AV199Lb_Artcod ,
                                          String AV209Lb_ColNomC ,
                                          String AV207Lb_ColNom ,
                                          byte AV210Lb_EstEns ,
                                          String AV211Lb_Tipo ,
                                          String A396EmprCod ,
                                          String AV197Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[55];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_obsLb, T1.Lb_cartazf, T1.CliCod, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_numero, T1.Lb_ColNum, T1.Lb_ColNom," ;
      scmdbuf += " T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV218Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
         GXv_int23[15] = (byte)(1) ;
         GXv_int23[16] = (byte)(1) ;
         GXv_int23[17] = (byte)(1) ;
         GXv_int23[18] = (byte)(1) ;
         GXv_int23[19] = (byte)(1) ;
         GXv_int23[20] = (byte)(1) ;
         GXv_int23[21] = (byte)(1) ;
         GXv_int23[22] = (byte)(1) ;
         GXv_int23[23] = (byte)(1) ;
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV219Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV220Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV221Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV222Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV223Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV224Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV225Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV227Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV229Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV230Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (0==AV231Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (0==AV232Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV233Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV235Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV236Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV238Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV239Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV240Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV241Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV242Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! (0==AV198Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( ! (0==AV200Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV205Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV206Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV202Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int23[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV203Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int23[53] = (byte)(1) ;
      }
      if ( ! (0==AV208Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int23[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_obsLb" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_P09OL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 1 :
                  return conditional_P09OL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 2 :
                  return conditional_P09OL4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 3 :
                  return conditional_P09OL5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 4 :
                  return conditional_P09OL6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 5 :
                  return conditional_P09OL7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 6 :
                  return conditional_P09OL8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 7 :
                  return conditional_P09OL9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OL5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OL6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OL7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OL8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OL9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
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
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
      }
   }

}

