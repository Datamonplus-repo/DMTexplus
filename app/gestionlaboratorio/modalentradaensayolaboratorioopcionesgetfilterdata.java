package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class modalentradaensayolaboratorioopcionesgetfilterdata extends GXProcedure
{
   public modalentradaensayolaboratorioopcionesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( modalentradaensayolaboratorioopcionesgetfilterdata.class ), "" );
   }

   public modalentradaensayolaboratorioopcionesgetfilterdata( int remoteHandle ,
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
      modalentradaensayolaboratorioopcionesgetfilterdata.this.aP5 = new String[] {""};
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
      modalentradaensayolaboratorioopcionesgetfilterdata.this.AV52DDOName = aP0;
      modalentradaensayolaboratorioopcionesgetfilterdata.this.AV50SearchTxt = aP1;
      modalentradaensayolaboratorioopcionesgetfilterdata.this.AV51SearchTxtTo = aP2;
      modalentradaensayolaboratorioopcionesgetfilterdata.this.aP3 = aP3;
      modalentradaensayolaboratorioopcionesgetfilterdata.this.aP4 = aP4;
      modalentradaensayolaboratorioopcionesgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_LB_OPCION") == 0 )
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
      AV56OptionsJson = AV55Options.toJSonString(false) ;
      AV59OptionsDescJson = AV58OptionsDesc.toJSonString(false) ;
      AV61OptionIndexesJson = AV60OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV63Session.getValue("GestionLaboratorio.ModalEntradaEnsayoLaboratorioOpcionesGridState"), "") == 0 )
      {
         AV65GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ModalEntradaEnsayoLaboratorioOpcionesGridState"), null, null);
      }
      else
      {
         AV65GridState.fromxml(AV63Session.getValue("GestionLaboratorio.ModalEntradaEnsayoLaboratorioOpcionesGridState"), null, null);
      }
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV66GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
         if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV10TFLb_opcion = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV11TFLb_opcion_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV24TFLb_numop = (byte)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFLb_numop_To = (byte)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV12TFLb_FechaEn = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAEN") == 0 )
         {
            AV14TFLb_HoraEn = GXutil.resetDate(localUtil.ctot( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV16TFLb_FechaR = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAR") == 0 )
         {
            AV18TFLb_HoraR = GXutil.resetDate(localUtil.ctot( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV32TFLb_FecNoa1 = localUtil.ctod( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV42TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV84TFLb_Estado_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV85TFLb_Estado_Sels.fromJSonString(AV84TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV69Emprcod = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV70Lb_Numero = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_RB") == 0 )
         {
            AV71Lb_Rb = CommonUtil.decimalVal( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_OPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLb_opcion = AV50SearchTxt ;
      AV11TFLb_opcion_Sel = "" ;
      AV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion = AV10TFLb_opcion ;
      AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel = AV11TFLb_opcion_Sel ;
      AV92Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_3_tflb_numop = AV24TFLb_numop ;
      AV93Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_4_tflb_numop_to = AV25TFLb_numop_To ;
      AV94Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_5_tflb_fechaen = AV12TFLb_FechaEn ;
      AV95Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_6_tflb_horaen = AV14TFLb_HoraEn ;
      AV96Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_7_tflb_fechar = AV16TFLb_FechaR ;
      AV97Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_8_tflb_horar = AV18TFLb_HoraR ;
      AV98Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_9_tflb_fecnoa1 = AV32TFLb_FecNoa1 ;
      AV99Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_10_tflb_hhnoa1 = AV42TFLb_hhnoa1 ;
      AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels = AV85TFLb_Estado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels ,
                                           AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel ,
                                           AV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion ,
                                           Byte.valueOf(AV92Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_3_tflb_numop) ,
                                           Byte.valueOf(AV93Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_4_tflb_numop_to) ,
                                           AV94Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_5_tflb_fechaen ,
                                           AV95Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_6_tflb_horaen ,
                                           AV96Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_7_tflb_fechar ,
                                           AV97Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_8_tflb_horar ,
                                           AV98Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_9_tflb_fecnoa1 ,
                                           AV99Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_10_tflb_hhnoa1 ,
                                           Integer.valueOf(AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels.size()) ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5567Lb_FechaEn ,
                                           A5568Lb_HoraEn ,
                                           A5563Lb_FechaR ,
                                           A5564Lb_HoraR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           AV69Emprcod ,
                                           Integer.valueOf(AV70Lb_Numero) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion = GXutil.padr( GXutil.rtrim( AV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion), 1, "%") ;
      /* Using cursor P0ADR2 */
      pr_default.execute(0, new Object[] {AV69Emprcod, Integer.valueOf(AV70Lb_Numero), lV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion, AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel, Byte.valueOf(AV92Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_3_tflb_numop), Byte.valueOf(AV93Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_4_tflb_numop_to), AV94Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_5_tflb_fechaen, AV95Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_6_tflb_horaen, AV96Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_7_tflb_fechar, AV97Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_8_tflb_horar, AV98Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_9_tflb_fecnoa1, AV99Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_10_tflb_hhnoa1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkADR2 = false ;
         A5532Lb_numero = P0ADR2_A5532Lb_numero[0] ;
         A396EmprCod = P0ADR2_A396EmprCod[0] ;
         A5555Lb_opcion = P0ADR2_A5555Lb_opcion[0] ;
         A5566Lb_Estado = P0ADR2_A5566Lb_Estado[0] ;
         A10082Lb_hhnoa1 = P0ADR2_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P0ADR2_A6461Lb_FecNoa1[0] ;
         A5564Lb_HoraR = P0ADR2_A5564Lb_HoraR[0] ;
         A5563Lb_FechaR = P0ADR2_A5563Lb_FechaR[0] ;
         A5568Lb_HoraEn = P0ADR2_A5568Lb_HoraEn[0] ;
         A5567Lb_FechaEn = P0ADR2_A5567Lb_FechaEn[0] ;
         A5718Lb_numop = P0ADR2_A5718Lb_numop[0] ;
         AV62count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ADR2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ADR2_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(P0ADR2_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) )
         {
            brkADR2 = false ;
            AV62count = (long)(AV62count+1) ;
            brkADR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5555Lb_opcion)==0) )
         {
            AV54Option = A5555Lb_opcion ;
            AV57OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))) ;
            AV55Options.add(AV54Option, 0);
            AV58OptionsDesc.add(AV57OptionDesc, 0);
            AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV55Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADR2 )
         {
            brkADR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = modalentradaensayolaboratorioopcionesgetfilterdata.this.AV56OptionsJson;
      this.aP4[0] = modalentradaensayolaboratorioopcionesgetfilterdata.this.AV59OptionsDescJson;
      this.aP5[0] = modalentradaensayolaboratorioopcionesgetfilterdata.this.AV61OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV56OptionsJson = "" ;
      AV59OptionsDescJson = "" ;
      AV61OptionIndexesJson = "" ;
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63Session = httpContext.getWebSession();
      AV65GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFLb_opcion = "" ;
      AV11TFLb_opcion_Sel = "" ;
      AV12TFLb_FechaEn = GXutil.nullDate() ;
      AV14TFLb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV16TFLb_FechaR = GXutil.nullDate() ;
      AV18TFLb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV32TFLb_FecNoa1 = GXutil.nullDate() ;
      AV42TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV84TFLb_Estado_SelsJson = "" ;
      AV85TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV69Emprcod = "" ;
      AV71Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      AV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion = "" ;
      AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel = "" ;
      AV94Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_5_tflb_fechaen = GXutil.nullDate() ;
      AV95Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_6_tflb_horaen = GXutil.resetTime( GXutil.nullDate() );
      AV96Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_7_tflb_fechar = GXutil.nullDate() ;
      AV97Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_8_tflb_horar = GXutil.resetTime( GXutil.nullDate() );
      AV98Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_9_tflb_fecnoa1 = GXutil.nullDate() ;
      AV99Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_10_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P0ADR2_A5532Lb_numero = new int[1] ;
      P0ADR2_A396EmprCod = new String[] {""} ;
      P0ADR2_A5555Lb_opcion = new String[] {""} ;
      P0ADR2_A5566Lb_Estado = new byte[1] ;
      P0ADR2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P0ADR2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P0ADR2_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P0ADR2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P0ADR2_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P0ADR2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P0ADR2_A5718Lb_numop = new byte[1] ;
      AV54Option = "" ;
      AV57OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.modalentradaensayolaboratorioopcionesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADR2_A5532Lb_numero, P0ADR2_A396EmprCod, P0ADR2_A5555Lb_opcion, P0ADR2_A5566Lb_Estado, P0ADR2_A10082Lb_hhnoa1, P0ADR2_A6461Lb_FecNoa1, P0ADR2_A5564Lb_HoraR, P0ADR2_A5563Lb_FechaR, P0ADR2_A5568Lb_HoraEn, P0ADR2_A5567Lb_FechaEn,
            P0ADR2_A5718Lb_numop
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24TFLb_numop ;
   private byte AV25TFLb_numop_To ;
   private byte AV92Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_3_tflb_numop ;
   private byte AV93Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_4_tflb_numop_to ;
   private byte A5566Lb_Estado ;
   private byte A5718Lb_numop ;
   private short Gx_err ;
   private int AV88GXV1 ;
   private int AV70Lb_Numero ;
   private int AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels_size ;
   private int A5532Lb_numero ;
   private long AV62count ;
   private java.math.BigDecimal AV71Lb_Rb ;
   private String AV10TFLb_opcion ;
   private String AV11TFLb_opcion_Sel ;
   private String AV69Emprcod ;
   private String A5555Lb_opcion ;
   private String AV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion ;
   private String AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel ;
   private String scmdbuf ;
   private String lV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion ;
   private String A396EmprCod ;
   private java.util.Date AV14TFLb_HoraEn ;
   private java.util.Date AV18TFLb_HoraR ;
   private java.util.Date AV42TFLb_hhnoa1 ;
   private java.util.Date AV95Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_6_tflb_horaen ;
   private java.util.Date AV97Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_8_tflb_horar ;
   private java.util.Date AV99Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_10_tflb_hhnoa1 ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV12TFLb_FechaEn ;
   private java.util.Date AV16TFLb_FechaR ;
   private java.util.Date AV32TFLb_FecNoa1 ;
   private java.util.Date AV94Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_5_tflb_fechaen ;
   private java.util.Date AV96Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_7_tflb_fechar ;
   private java.util.Date AV98Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_9_tflb_fecnoa1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean returnInSub ;
   private boolean brkADR2 ;
   private String AV56OptionsJson ;
   private String AV59OptionsDescJson ;
   private String AV61OptionIndexesJson ;
   private String AV84TFLb_Estado_SelsJson ;
   private String AV52DDOName ;
   private String AV50SearchTxt ;
   private String AV51SearchTxtTo ;
   private String AV54Option ;
   private String AV57OptionDesc ;
   private GXSimpleCollection<Byte> AV85TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV63Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0ADR2_A5532Lb_numero ;
   private String[] P0ADR2_A396EmprCod ;
   private String[] P0ADR2_A5555Lb_opcion ;
   private byte[] P0ADR2_A5566Lb_Estado ;
   private java.util.Date[] P0ADR2_A10082Lb_hhnoa1 ;
   private java.util.Date[] P0ADR2_A6461Lb_FecNoa1 ;
   private java.util.Date[] P0ADR2_A5564Lb_HoraR ;
   private java.util.Date[] P0ADR2_A5563Lb_FechaR ;
   private java.util.Date[] P0ADR2_A5568Lb_HoraEn ;
   private java.util.Date[] P0ADR2_A5567Lb_FechaEn ;
   private byte[] P0ADR2_A5718Lb_numop ;
   private GXSimpleCollection<String> AV55Options ;
   private GXSimpleCollection<String> AV58OptionsDesc ;
   private GXSimpleCollection<String> AV60OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV65GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV66GridStateFilterValue ;
}

final  class modalentradaensayolaboratorioopcionesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels ,
                                          String AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel ,
                                          String AV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion ,
                                          byte AV92Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_3_tflb_numop ,
                                          byte AV93Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_4_tflb_numop_to ,
                                          java.util.Date AV94Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_5_tflb_fechaen ,
                                          java.util.Date AV95Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_6_tflb_horaen ,
                                          java.util.Date AV96Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_7_tflb_fechar ,
                                          java.util.Date AV97Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_8_tflb_horar ,
                                          java.util.Date AV98Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_9_tflb_fecnoa1 ,
                                          java.util.Date AV99Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_10_tflb_hhnoa1 ,
                                          int AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels_size ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5568Lb_HoraEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A5564Lb_HoraR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          String AV69Emprcod ,
                                          int AV70Lb_Numero ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Lb_numero, EmprCod, Lb_opcion, Lb_Estado, Lb_hhnoa1, Lb_FecNoa1, Lb_HoraR, Lb_FechaR, Lb_HoraEn, Lb_FechaEn, Lb_numop FROM TXPENS002" ;
      addWhere(sWhereString, "(EmprCod = ? and Lb_numero = ?)");
      if ( (GXutil.strcmp("", AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_1_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_2_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_opcion = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV92Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_3_tflb_numop) )
      {
         addWhere(sWhereString, "(Lb_numop >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_4_tflb_numop_to) )
      {
         addWhere(sWhereString, "(Lb_numop <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_5_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_6_tflb_horaen) )
      {
         addWhere(sWhereString, "(Lb_HoraEn >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_7_tflb_fechar)) )
      {
         addWhere(sWhereString, "(Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_8_tflb_horar) )
      {
         addWhere(sWhereString, "(Lb_HoraR >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_9_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_10_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Gestionlaboratorio_modalentradaensayolaboratorioopcionesds_11_tflb_estado_sels, "Lb_Estado IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Lb_numero, Lb_opcion" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P0ADR2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], true);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[21], true);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               return;
      }
   }

}

