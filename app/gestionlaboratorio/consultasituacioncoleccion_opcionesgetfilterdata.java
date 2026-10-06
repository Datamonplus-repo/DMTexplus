package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultasituacioncoleccion_opcionesgetfilterdata extends GXProcedure
{
   public consultasituacioncoleccion_opcionesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultasituacioncoleccion_opcionesgetfilterdata.class ), "" );
   }

   public consultasituacioncoleccion_opcionesgetfilterdata( int remoteHandle ,
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
      consultasituacioncoleccion_opcionesgetfilterdata.this.aP5 = new String[] {""};
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
      consultasituacioncoleccion_opcionesgetfilterdata.this.AV28DDOName = aP0;
      consultasituacioncoleccion_opcionesgetfilterdata.this.AV26SearchTxt = aP1;
      consultasituacioncoleccion_opcionesgetfilterdata.this.AV27SearchTxtTo = aP2;
      consultasituacioncoleccion_opcionesgetfilterdata.this.aP3 = aP3;
      consultasituacioncoleccion_opcionesgetfilterdata.this.aP4 = aP4;
      consultasituacioncoleccion_opcionesgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_LB_OPCION") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_LB_PROVDEF") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_PROVDEFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_LB_OBSCR") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_OBSCROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_OpcionesGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ConsultaSituacionColeccion_OpcionesGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_OpcionesGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV10TFLb_opcion = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV11TFLb_opcion_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV12TFLb_FechaEn = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAEN") == 0 )
         {
            AV14TFLb_HoraEn = GXutil.resetDate(localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV16TFLb_FechaR = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAR") == 0 )
         {
            AV18TFLb_HoraR = GXutil.resetDate(localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COSTEE") == 0 )
         {
            AV20TFLb_CosteE = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFLb_CosteE_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COSTEC") == 0 )
         {
            AV51TFLb_CosteC = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFLb_CosteC_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV47TFLb_FecNoa1 = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV49TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV57TFLb_Estado_SelsJson = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV58TFLb_Estado_Sels.fromJSonString(AV57TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PROVDEF") == 0 )
         {
            AV53TFLb_ProvDef = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PROVDEF_SEL") == 0 )
         {
            AV54TFLb_ProvDef_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV55TFLb_ObsCR = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV56TFLb_ObsCR_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV46Lb_numero = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_OPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLb_opcion = AV26SearchTxt ;
      AV11TFLb_opcion_Sel = "" ;
      AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV10TFLb_opcion ;
      AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV12TFLb_FechaEn ;
      AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV14TFLb_HoraEn ;
      AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV16TFLb_FechaR ;
      AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV18TFLb_HoraR ;
      AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV20TFLb_CosteE ;
      AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV21TFLb_CosteE_To ;
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV51TFLb_CosteC ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV52TFLb_CosteC_To ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV47TFLb_FecNoa1 ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV49TFLb_hhnoa1 ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV58TFLb_Estado_Sels ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV53TFLb_ProvDef ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV54TFLb_ProvDef_Sel ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV55TFLb_ObsCR ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV56TFLb_ObsCR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                           AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                           AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                           AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                           AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                           AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                           AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                           AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                           AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                           AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                           AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                           AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                           Integer.valueOf(AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels.size()) ,
                                           AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                           AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                           AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                           AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                           A5555Lb_opcion ,
                                           A5567Lb_FechaEn ,
                                           A5568Lb_HoraEn ,
                                           A5563Lb_FechaR ,
                                           A5564Lb_HoraR ,
                                           A5565Lb_CosteE ,
                                           A1127Lb_CosteC ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           A6631Lb_ProvDef ,
                                           A10822Lb_ObsCR ,
                                           AV45Emprcod ,
                                           Integer.valueOf(AV46Lb_numero) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion), 1, "%") ;
      lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = GXutil.padr( GXutil.rtrim( AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef), 1, "%") ;
      lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr), "%", "") ;
      /* Using cursor P09OO2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, Integer.valueOf(AV46Lb_numero), lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion, AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel, AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen, AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen, AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar, AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar, AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee, AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to, AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to, AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1, AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1, lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef, AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel, lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr, AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OO2 = false ;
         A5532Lb_numero = P09OO2_A5532Lb_numero[0] ;
         A396EmprCod = P09OO2_A396EmprCod[0] ;
         A5555Lb_opcion = P09OO2_A5555Lb_opcion[0] ;
         A10822Lb_ObsCR = P09OO2_A10822Lb_ObsCR[0] ;
         A6631Lb_ProvDef = P09OO2_A6631Lb_ProvDef[0] ;
         A5566Lb_Estado = P09OO2_A5566Lb_Estado[0] ;
         A10082Lb_hhnoa1 = P09OO2_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OO2_A6461Lb_FecNoa1[0] ;
         A1127Lb_CosteC = P09OO2_A1127Lb_CosteC[0] ;
         A5565Lb_CosteE = P09OO2_A5565Lb_CosteE[0] ;
         A5564Lb_HoraR = P09OO2_A5564Lb_HoraR[0] ;
         A5563Lb_FechaR = P09OO2_A5563Lb_FechaR[0] ;
         A5568Lb_HoraEn = P09OO2_A5568Lb_HoraEn[0] ;
         A5567Lb_FechaEn = P09OO2_A5567Lb_FechaEn[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OO2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09OO2_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(P09OO2_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) )
         {
            brk9OO2 = false ;
            AV38count = (long)(AV38count+1) ;
            brk9OO2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5555Lb_opcion)==0) )
         {
            AV30Option = A5555Lb_opcion ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))) ;
            AV31Options.add(AV30Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OO2 )
         {
            brk9OO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_PROVDEFOPTIONS' Routine */
      returnInSub = false ;
      AV53TFLb_ProvDef = AV26SearchTxt ;
      AV54TFLb_ProvDef_Sel = "" ;
      AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV10TFLb_opcion ;
      AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV12TFLb_FechaEn ;
      AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV14TFLb_HoraEn ;
      AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV16TFLb_FechaR ;
      AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV18TFLb_HoraR ;
      AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV20TFLb_CosteE ;
      AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV21TFLb_CosteE_To ;
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV51TFLb_CosteC ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV52TFLb_CosteC_To ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV47TFLb_FecNoa1 ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV49TFLb_hhnoa1 ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV58TFLb_Estado_Sels ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV53TFLb_ProvDef ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV54TFLb_ProvDef_Sel ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV55TFLb_ObsCR ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV56TFLb_ObsCR_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                           AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                           AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                           AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                           AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                           AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                           AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                           AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                           AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                           AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                           AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                           AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                           Integer.valueOf(AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels.size()) ,
                                           AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                           AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                           AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                           AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                           A5555Lb_opcion ,
                                           A5567Lb_FechaEn ,
                                           A5568Lb_HoraEn ,
                                           A5563Lb_FechaR ,
                                           A5564Lb_HoraR ,
                                           A5565Lb_CosteE ,
                                           A1127Lb_CosteC ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           A6631Lb_ProvDef ,
                                           A10822Lb_ObsCR ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV46Lb_numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion), 1, "%") ;
      lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = GXutil.padr( GXutil.rtrim( AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef), 1, "%") ;
      lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr), "%", "") ;
      /* Using cursor P09OO3 */
      pr_default.execute(1, new Object[] {AV45Emprcod, Integer.valueOf(AV46Lb_numero), lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion, AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel, AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen, AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen, AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar, AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar, AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee, AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to, AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to, AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1, AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1, lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef, AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel, lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr, AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OO4 = false ;
         A396EmprCod = P09OO3_A396EmprCod[0] ;
         A5532Lb_numero = P09OO3_A5532Lb_numero[0] ;
         A6631Lb_ProvDef = P09OO3_A6631Lb_ProvDef[0] ;
         A10822Lb_ObsCR = P09OO3_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OO3_A5566Lb_Estado[0] ;
         A10082Lb_hhnoa1 = P09OO3_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OO3_A6461Lb_FecNoa1[0] ;
         A1127Lb_CosteC = P09OO3_A1127Lb_CosteC[0] ;
         A5565Lb_CosteE = P09OO3_A5565Lb_CosteE[0] ;
         A5564Lb_HoraR = P09OO3_A5564Lb_HoraR[0] ;
         A5563Lb_FechaR = P09OO3_A5563Lb_FechaR[0] ;
         A5568Lb_HoraEn = P09OO3_A5568Lb_HoraEn[0] ;
         A5567Lb_FechaEn = P09OO3_A5567Lb_FechaEn[0] ;
         A5555Lb_opcion = P09OO3_A5555Lb_opcion[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OO3_A6631Lb_ProvDef[0], A6631Lb_ProvDef) == 0 ) )
         {
            brk9OO4 = false ;
            A396EmprCod = P09OO3_A396EmprCod[0] ;
            A5532Lb_numero = P09OO3_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OO3_A5555Lb_opcion[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9OO4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6631Lb_ProvDef)==0) )
         {
            AV30Option = A6631Lb_ProvDef ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OO4 )
         {
            brk9OO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_OBSCROPTIONS' Routine */
      returnInSub = false ;
      AV55TFLb_ObsCR = AV26SearchTxt ;
      AV56TFLb_ObsCR_Sel = "" ;
      AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = AV10TFLb_opcion ;
      AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = AV12TFLb_FechaEn ;
      AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = AV14TFLb_HoraEn ;
      AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = AV16TFLb_FechaR ;
      AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = AV18TFLb_HoraR ;
      AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = AV20TFLb_CosteE ;
      AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = AV21TFLb_CosteE_To ;
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = AV51TFLb_CosteC ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = AV52TFLb_CosteC_To ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = AV47TFLb_FecNoa1 ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = AV49TFLb_hhnoa1 ;
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = AV58TFLb_Estado_Sels ;
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = AV53TFLb_ProvDef ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = AV54TFLb_ProvDef_Sel ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = AV55TFLb_ObsCR ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = AV56TFLb_ObsCR_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                           AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                           AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                           AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                           AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                           AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                           AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                           AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                           AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                           AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                           AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                           AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                           AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                           Integer.valueOf(AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels.size()) ,
                                           AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                           AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                           AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                           AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                           A5555Lb_opcion ,
                                           A5567Lb_FechaEn ,
                                           A5568Lb_HoraEn ,
                                           A5563Lb_FechaR ,
                                           A5564Lb_HoraR ,
                                           A5565Lb_CosteE ,
                                           A1127Lb_CosteC ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           A6631Lb_ProvDef ,
                                           A10822Lb_ObsCR ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV46Lb_numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion), 1, "%") ;
      lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = GXutil.padr( GXutil.rtrim( AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef), 1, "%") ;
      lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr), "%", "") ;
      /* Using cursor P09OO4 */
      pr_default.execute(2, new Object[] {AV45Emprcod, Integer.valueOf(AV46Lb_numero), lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion, AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel, AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen, AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen, AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar, AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar, AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee, AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to, AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to, AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1, AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1, lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef, AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel, lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr, AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9OO6 = false ;
         A396EmprCod = P09OO4_A396EmprCod[0] ;
         A5532Lb_numero = P09OO4_A5532Lb_numero[0] ;
         A10822Lb_ObsCR = P09OO4_A10822Lb_ObsCR[0] ;
         A6631Lb_ProvDef = P09OO4_A6631Lb_ProvDef[0] ;
         A5566Lb_Estado = P09OO4_A5566Lb_Estado[0] ;
         A10082Lb_hhnoa1 = P09OO4_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OO4_A6461Lb_FecNoa1[0] ;
         A1127Lb_CosteC = P09OO4_A1127Lb_CosteC[0] ;
         A5565Lb_CosteE = P09OO4_A5565Lb_CosteE[0] ;
         A5564Lb_HoraR = P09OO4_A5564Lb_HoraR[0] ;
         A5563Lb_FechaR = P09OO4_A5563Lb_FechaR[0] ;
         A5568Lb_HoraEn = P09OO4_A5568Lb_HoraEn[0] ;
         A5567Lb_FechaEn = P09OO4_A5567Lb_FechaEn[0] ;
         A5555Lb_opcion = P09OO4_A5555Lb_opcion[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09OO4_A10822Lb_ObsCR[0], A10822Lb_ObsCR) == 0 ) )
         {
            brk9OO6 = false ;
            A396EmprCod = P09OO4_A396EmprCod[0] ;
            A5532Lb_numero = P09OO4_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09OO4_A5555Lb_opcion[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9OO6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A10822Lb_ObsCR)==0) )
         {
            AV30Option = A10822Lb_ObsCR ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OO6 )
         {
            brk9OO6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultasituacioncoleccion_opcionesgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = consultasituacioncoleccion_opcionesgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = consultasituacioncoleccion_opcionesgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFLb_opcion = "" ;
      AV11TFLb_opcion_Sel = "" ;
      AV12TFLb_FechaEn = GXutil.nullDate() ;
      AV14TFLb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV16TFLb_FechaR = GXutil.nullDate() ;
      AV18TFLb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV20TFLb_CosteE = DecimalUtil.ZERO ;
      AV21TFLb_CosteE_To = DecimalUtil.ZERO ;
      AV51TFLb_CosteC = DecimalUtil.ZERO ;
      AV52TFLb_CosteC_To = DecimalUtil.ZERO ;
      AV47TFLb_FecNoa1 = GXutil.nullDate() ;
      AV49TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV57TFLb_Estado_SelsJson = "" ;
      AV58TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV53TFLb_ProvDef = "" ;
      AV54TFLb_ProvDef_Sel = "" ;
      AV55TFLb_ObsCR = "" ;
      AV56TFLb_ObsCR_Sel = "" ;
      AV45Emprcod = "" ;
      A5555Lb_opcion = "" ;
      AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = "" ;
      AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel = "" ;
      AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen = GXutil.nullDate() ;
      AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen = GXutil.resetTime( GXutil.nullDate() );
      AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar = GXutil.nullDate() ;
      AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar = GXutil.resetTime( GXutil.nullDate() );
      AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee = DecimalUtil.ZERO ;
      AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to = DecimalUtil.ZERO ;
      AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec = DecimalUtil.ZERO ;
      AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to = DecimalUtil.ZERO ;
      AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 = GXutil.nullDate() ;
      AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = "" ;
      AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel = "" ;
      AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = "" ;
      AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel = "" ;
      scmdbuf = "" ;
      lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion = "" ;
      lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef = "" ;
      lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A1127Lb_CosteC = DecimalUtil.ZERO ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A6631Lb_ProvDef = "" ;
      A10822Lb_ObsCR = "" ;
      A396EmprCod = "" ;
      P09OO2_A5532Lb_numero = new int[1] ;
      P09OO2_A396EmprCod = new String[] {""} ;
      P09OO2_A5555Lb_opcion = new String[] {""} ;
      P09OO2_A10822Lb_ObsCR = new String[] {""} ;
      P09OO2_A6631Lb_ProvDef = new String[] {""} ;
      P09OO2_A5566Lb_Estado = new byte[1] ;
      P09OO2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO2_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OO2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OO2_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO2_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      AV30Option = "" ;
      AV33OptionDesc = "" ;
      P09OO3_A396EmprCod = new String[] {""} ;
      P09OO3_A5532Lb_numero = new int[1] ;
      P09OO3_A6631Lb_ProvDef = new String[] {""} ;
      P09OO3_A10822Lb_ObsCR = new String[] {""} ;
      P09OO3_A5566Lb_Estado = new byte[1] ;
      P09OO3_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO3_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO3_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OO3_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OO3_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO3_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO3_A5555Lb_opcion = new String[] {""} ;
      P09OO4_A396EmprCod = new String[] {""} ;
      P09OO4_A5532Lb_numero = new int[1] ;
      P09OO4_A10822Lb_ObsCR = new String[] {""} ;
      P09OO4_A6631Lb_ProvDef = new String[] {""} ;
      P09OO4_A5566Lb_Estado = new byte[1] ;
      P09OO4_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO4_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO4_A1127Lb_CosteC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OO4_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OO4_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO4_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO4_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OO4_A5555Lb_opcion = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.consultasituacioncoleccion_opcionesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OO2_A5532Lb_numero, P09OO2_A396EmprCod, P09OO2_A5555Lb_opcion, P09OO2_A10822Lb_ObsCR, P09OO2_A6631Lb_ProvDef, P09OO2_A5566Lb_Estado, P09OO2_A10082Lb_hhnoa1, P09OO2_A6461Lb_FecNoa1, P09OO2_A1127Lb_CosteC, P09OO2_A5565Lb_CosteE,
            P09OO2_A5564Lb_HoraR, P09OO2_A5563Lb_FechaR, P09OO2_A5568Lb_HoraEn, P09OO2_A5567Lb_FechaEn
            }
            , new Object[] {
            P09OO3_A396EmprCod, P09OO3_A5532Lb_numero, P09OO3_A6631Lb_ProvDef, P09OO3_A10822Lb_ObsCR, P09OO3_A5566Lb_Estado, P09OO3_A10082Lb_hhnoa1, P09OO3_A6461Lb_FecNoa1, P09OO3_A1127Lb_CosteC, P09OO3_A5565Lb_CosteE, P09OO3_A5564Lb_HoraR,
            P09OO3_A5563Lb_FechaR, P09OO3_A5568Lb_HoraEn, P09OO3_A5567Lb_FechaEn, P09OO3_A5555Lb_opcion
            }
            , new Object[] {
            P09OO4_A396EmprCod, P09OO4_A5532Lb_numero, P09OO4_A10822Lb_ObsCR, P09OO4_A6631Lb_ProvDef, P09OO4_A5566Lb_Estado, P09OO4_A10082Lb_hhnoa1, P09OO4_A6461Lb_FecNoa1, P09OO4_A1127Lb_CosteC, P09OO4_A5565Lb_CosteE, P09OO4_A5564Lb_HoraR,
            P09OO4_A5563Lb_FechaR, P09OO4_A5568Lb_HoraEn, P09OO4_A5567Lb_FechaEn, P09OO4_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV46Lb_numero ;
   private int AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size ;
   private int A5532Lb_numero ;
   private long AV38count ;
   private java.math.BigDecimal AV20TFLb_CosteE ;
   private java.math.BigDecimal AV21TFLb_CosteE_To ;
   private java.math.BigDecimal AV51TFLb_CosteC ;
   private java.math.BigDecimal AV52TFLb_CosteC_To ;
   private java.math.BigDecimal AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ;
   private java.math.BigDecimal AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ;
   private java.math.BigDecimal AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ;
   private java.math.BigDecimal AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal A1127Lb_CosteC ;
   private String AV10TFLb_opcion ;
   private String AV11TFLb_opcion_Sel ;
   private String AV53TFLb_ProvDef ;
   private String AV54TFLb_ProvDef_Sel ;
   private String AV45Emprcod ;
   private String A5555Lb_opcion ;
   private String AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ;
   private String AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ;
   private String AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ;
   private String AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ;
   private String scmdbuf ;
   private String lV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ;
   private String lV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ;
   private String A6631Lb_ProvDef ;
   private String A396EmprCod ;
   private java.util.Date AV14TFLb_HoraEn ;
   private java.util.Date AV18TFLb_HoraR ;
   private java.util.Date AV49TFLb_hhnoa1 ;
   private java.util.Date AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ;
   private java.util.Date AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ;
   private java.util.Date AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV12TFLb_FechaEn ;
   private java.util.Date AV16TFLb_FechaR ;
   private java.util.Date AV47TFLb_FecNoa1 ;
   private java.util.Date AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ;
   private java.util.Date AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ;
   private java.util.Date AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean returnInSub ;
   private boolean brk9OO2 ;
   private boolean brk9OO4 ;
   private boolean brk9OO6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV57TFLb_Estado_SelsJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV55TFLb_ObsCR ;
   private String AV56TFLb_ObsCR_Sel ;
   private String AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ;
   private String AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ;
   private String lV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ;
   private String A10822Lb_ObsCR ;
   private String AV30Option ;
   private String AV33OptionDesc ;
   private GXSimpleCollection<Byte> AV58TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09OO2_A5532Lb_numero ;
   private String[] P09OO2_A396EmprCod ;
   private String[] P09OO2_A5555Lb_opcion ;
   private String[] P09OO2_A10822Lb_ObsCR ;
   private String[] P09OO2_A6631Lb_ProvDef ;
   private byte[] P09OO2_A5566Lb_Estado ;
   private java.util.Date[] P09OO2_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OO2_A6461Lb_FecNoa1 ;
   private java.math.BigDecimal[] P09OO2_A1127Lb_CosteC ;
   private java.math.BigDecimal[] P09OO2_A5565Lb_CosteE ;
   private java.util.Date[] P09OO2_A5564Lb_HoraR ;
   private java.util.Date[] P09OO2_A5563Lb_FechaR ;
   private java.util.Date[] P09OO2_A5568Lb_HoraEn ;
   private java.util.Date[] P09OO2_A5567Lb_FechaEn ;
   private String[] P09OO3_A396EmprCod ;
   private int[] P09OO3_A5532Lb_numero ;
   private String[] P09OO3_A6631Lb_ProvDef ;
   private String[] P09OO3_A10822Lb_ObsCR ;
   private byte[] P09OO3_A5566Lb_Estado ;
   private java.util.Date[] P09OO3_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OO3_A6461Lb_FecNoa1 ;
   private java.math.BigDecimal[] P09OO3_A1127Lb_CosteC ;
   private java.math.BigDecimal[] P09OO3_A5565Lb_CosteE ;
   private java.util.Date[] P09OO3_A5564Lb_HoraR ;
   private java.util.Date[] P09OO3_A5563Lb_FechaR ;
   private java.util.Date[] P09OO3_A5568Lb_HoraEn ;
   private java.util.Date[] P09OO3_A5567Lb_FechaEn ;
   private String[] P09OO3_A5555Lb_opcion ;
   private String[] P09OO4_A396EmprCod ;
   private int[] P09OO4_A5532Lb_numero ;
   private String[] P09OO4_A10822Lb_ObsCR ;
   private String[] P09OO4_A6631Lb_ProvDef ;
   private byte[] P09OO4_A5566Lb_Estado ;
   private java.util.Date[] P09OO4_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OO4_A6461Lb_FecNoa1 ;
   private java.math.BigDecimal[] P09OO4_A1127Lb_CosteC ;
   private java.math.BigDecimal[] P09OO4_A5565Lb_CosteE ;
   private java.util.Date[] P09OO4_A5564Lb_HoraR ;
   private java.util.Date[] P09OO4_A5563Lb_FechaR ;
   private java.util.Date[] P09OO4_A5568Lb_HoraEn ;
   private java.util.Date[] P09OO4_A5567Lb_FechaEn ;
   private String[] P09OO4_A5555Lb_opcion ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class consultasituacioncoleccion_opcionesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                          String AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                          java.util.Date AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                          java.util.Date AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                          java.util.Date AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                          java.util.Date AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                          java.math.BigDecimal AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                          java.math.BigDecimal AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                          java.math.BigDecimal AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                          java.math.BigDecimal AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                          java.util.Date AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                          java.util.Date AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                          int AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size ,
                                          String AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                          String AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                          String AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                          String AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                          String A5555Lb_opcion ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.math.BigDecimal A1127Lb_CosteC ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A6631Lb_ProvDef ,
                                          String A10822Lb_ObsCR ,
                                          String AV45Emprcod ,
                                          int AV46Lb_numero ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Lb_numero, EmprCod, Lb_opcion, Lb_ObsCR, Lb_ProvDef, Lb_Estado, Lb_hhnoa1, Lb_FecNoa1, Lb_CosteC, Lb_CosteE, Lb_HoraR, Lb_FechaR, Lb_HoraEn, Lb_FechaEn FROM" ;
      scmdbuf += " TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ? and Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_opcion = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen) )
      {
         addWhere(sWhereString, "(Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar) )
      {
         addWhere(sWhereString, "(Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels, "Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ProvDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ProvDef = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_numero, Lb_opcion" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                          String AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                          java.util.Date AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                          java.util.Date AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                          java.util.Date AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                          java.util.Date AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                          java.math.BigDecimal AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                          java.math.BigDecimal AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                          java.math.BigDecimal AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                          java.math.BigDecimal AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                          java.util.Date AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                          java.util.Date AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                          int AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size ,
                                          String AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                          String AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                          String AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                          String AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                          String A5555Lb_opcion ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.math.BigDecimal A1127Lb_CosteC ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A6631Lb_ProvDef ,
                                          String A10822Lb_ObsCR ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          int A5532Lb_numero ,
                                          int AV46Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[18];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_ProvDef, Lb_ObsCR, Lb_Estado, Lb_hhnoa1, Lb_FecNoa1, Lb_CosteC, Lb_CosteE, Lb_HoraR, Lb_FechaR, Lb_HoraEn, Lb_FechaEn, Lb_opcion FROM" ;
      scmdbuf += " TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_opcion = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen) )
      {
         addWhere(sWhereString, "(Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar) )
      {
         addWhere(sWhereString, "(Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels, "Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ProvDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ProvDef = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Lb_ProvDef" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09OO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels ,
                                          String AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel ,
                                          String AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion ,
                                          java.util.Date AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen ,
                                          java.util.Date AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen ,
                                          java.util.Date AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar ,
                                          java.util.Date AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar ,
                                          java.math.BigDecimal AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee ,
                                          java.math.BigDecimal AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to ,
                                          java.math.BigDecimal AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec ,
                                          java.math.BigDecimal AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to ,
                                          java.util.Date AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1 ,
                                          java.util.Date AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1 ,
                                          int AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size ,
                                          String AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel ,
                                          String AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef ,
                                          String AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel ,
                                          String AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr ,
                                          String A5555Lb_opcion ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.math.BigDecimal A1127Lb_CosteC ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String A6631Lb_ProvDef ,
                                          String A10822Lb_ObsCR ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          int A5532Lb_numero ,
                                          int AV46Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, Lb_numero, Lb_ObsCR, Lb_ProvDef, Lb_Estado, Lb_hhnoa1, Lb_FecNoa1, Lb_CosteC, Lb_CosteE, Lb_HoraR, Lb_FechaR, Lb_HoraEn, Lb_FechaEn, Lb_opcion FROM" ;
      scmdbuf += " TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_consultasituacioncoleccion_opcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_consultasituacioncoleccion_opcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_opcion = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Gestionlaboratorio_consultasituacioncoleccion_opcionesds_3_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV66Gestionlaboratorio_consultasituacioncoleccion_opcionesds_4_tflb_horaen) )
      {
         addWhere(sWhereString, "(Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Gestionlaboratorio_consultasituacioncoleccion_opcionesds_5_tflb_fechar)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV68Gestionlaboratorio_consultasituacioncoleccion_opcionesds_6_tflb_horar) )
      {
         addWhere(sWhereString, "(Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Gestionlaboratorio_consultasituacioncoleccion_opcionesds_7_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Gestionlaboratorio_consultasituacioncoleccion_opcionesds_8_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Gestionlaboratorio_consultasituacioncoleccion_opcionesds_9_tflb_costec)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Gestionlaboratorio_consultasituacioncoleccion_opcionesds_10_tflb_costec_to)==0) )
      {
         addWhere(sWhereString, "(Lb_CosteC <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Gestionlaboratorio_consultasituacioncoleccion_opcionesds_11_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Gestionlaboratorio_consultasituacioncoleccion_opcionesds_12_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV75Gestionlaboratorio_consultasituacioncoleccion_opcionesds_13_tflb_estado_sels, "Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_consultasituacioncoleccion_opcionesds_14_tflb_provdef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ProvDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_consultasituacioncoleccion_opcionesds_15_tflb_provdef_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ProvDef = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_consultasituacioncoleccion_opcionesds_16_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_consultasituacioncoleccion_opcionesds_17_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Lb_ObsCR" ;
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
                  return conditional_P09OO2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() );
            case 1 :
                  return conditional_P09OO3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() );
            case 2 :
                  return conditional_P09OO4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(11));
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(13));
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = GXutil.resetDate(rslt.getGXDateTime(12));
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = GXutil.resetDate(rslt.getGXDateTime(12));
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], true);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 300);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 300);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], true);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 300);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 300);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[25], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], true);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 300);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 300);
               }
               return;
      }
   }

}

