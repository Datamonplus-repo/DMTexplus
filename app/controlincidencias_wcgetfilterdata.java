package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlincidencias_wcgetfilterdata extends GXProcedure
{
   public controlincidencias_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlincidencias_wcgetfilterdata.class ), "" );
   }

   public controlincidencias_wcgetfilterdata( int remoteHandle ,
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
      controlincidencias_wcgetfilterdata.this.aP5 = new String[] {""};
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
      controlincidencias_wcgetfilterdata.this.AV28DDOName = aP0;
      controlincidencias_wcgetfilterdata.this.AV26SearchTxt = aP1;
      controlincidencias_wcgetfilterdata.this.AV27SearchTxtTo = aP2;
      controlincidencias_wcgetfilterdata.this.aP3 = aP3;
      controlincidencias_wcgetfilterdata.this.aP4 = aP4;
      controlincidencias_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_INC_USUARIO") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_USUARIOOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_INC_TERMINAL") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_TERMINALOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_INC_PROG") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_PROGOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_INC_HDR") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_HDROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_INC_OBSTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_OBSTXTOPTIONS' */
         S161 ();
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
      if ( GXutil.strcmp(AV39Session.getValue("ControlIncidencias_WCGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlIncidencias_WCGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("ControlIncidencias_WCGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV10TFInc_Dia = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV12TFInc_Linea = GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV13TFInc_Linea_To = GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV14TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV16TFInc_Usuario = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV17TFInc_Usuario_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV18TFInc_Terminal = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV19TFInc_Terminal_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV20TFInc_Prog = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV21TFInc_Prog_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV22TFInc_Hdr = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV23TFInc_Hdr_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT") == 0 )
         {
            AV24TFInc_obsTxt = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT_SEL") == 0 )
         {
            AV25TFInc_obsTxt_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA") == 0 )
         {
            AV46Inc_dia = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA_TO") == 0 )
         {
            AV47Inc_dia_to = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADINC_USUARIOOPTIONS' Routine */
      returnInSub = false ;
      AV16TFInc_Usuario = AV26SearchTxt ;
      AV17TFInc_Usuario_Sel = "" ;
      AV52Controlincidencias_wcds_1_filterfulltext = AV44FilterFullText ;
      AV53Controlincidencias_wcds_2_tfinc_dia = AV10TFInc_Dia ;
      AV54Controlincidencias_wcds_3_tfinc_linea = AV12TFInc_Linea ;
      AV55Controlincidencias_wcds_4_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV56Controlincidencias_wcds_5_tfinc_hora = AV14TFInc_Hora ;
      AV57Controlincidencias_wcds_6_tfinc_usuario = AV16TFInc_Usuario ;
      AV58Controlincidencias_wcds_7_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV59Controlincidencias_wcds_8_tfinc_terminal = AV18TFInc_Terminal ;
      AV60Controlincidencias_wcds_9_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV61Controlincidencias_wcds_10_tfinc_prog = AV20TFInc_Prog ;
      AV62Controlincidencias_wcds_11_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV63Controlincidencias_wcds_12_tfinc_hdr = AV22TFInc_Hdr ;
      AV64Controlincidencias_wcds_13_tfinc_hdr_sel = AV23TFInc_Hdr_Sel ;
      AV65Controlincidencias_wcds_14_tfinc_obstxt = AV24TFInc_obsTxt ;
      AV66Controlincidencias_wcds_15_tfinc_obstxt_sel = AV25TFInc_obsTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Controlincidencias_wcds_1_filterfulltext ,
                                           AV53Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV56Controlincidencias_wcds_5_tfinc_hora ,
                                           AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV61Controlincidencias_wcds_10_tfinc_prog ,
                                           AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           AV46Inc_dia ,
                                           AV47Inc_dia_to ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV57Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV59Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV59Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV61Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV61Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV63Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV63Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV65Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV65Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P094C2 */
      pr_default.execute(0, new Object[] {AV46Inc_dia, AV47Inc_dia_to, AV45Emprcod, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, AV53Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to), AV56Controlincidencias_wcds_5_tfinc_hora, lV57Controlincidencias_wcds_6_tfinc_usuario, AV58Controlincidencias_wcds_7_tfinc_usuario_sel, lV59Controlincidencias_wcds_8_tfinc_terminal, AV60Controlincidencias_wcds_9_tfinc_terminal_sel, lV61Controlincidencias_wcds_10_tfinc_prog, AV62Controlincidencias_wcds_11_tfinc_prog_sel, lV63Controlincidencias_wcds_12_tfinc_hdr, AV64Controlincidencias_wcds_13_tfinc_hdr_sel, lV65Controlincidencias_wcds_14_tfinc_obstxt, AV66Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk94C2 = false ;
         A396EmprCod = P094C2_A396EmprCod[0] ;
         A4933Inc_Usuari = P094C2_A4933Inc_Usuari[0] ;
         A4935Inc_Prog = P094C2_A4935Inc_Prog[0] ;
         A4934Inc_Termin = P094C2_A4934Inc_Termin[0] ;
         A4932Inc_Hora = P094C2_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P094C2_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P094C2_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P094C2_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P094C2_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P094C2_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P094C2_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P094C2_A4933Inc_Usuari[0], A4933Inc_Usuari) == 0 ) )
         {
            brk94C2 = false ;
            A396EmprCod = P094C2_A396EmprCod[0] ;
            A4931Inc_Linea = P094C2_A4931Inc_Linea[0] ;
            A4929Inc_Dia = P094C2_A4929Inc_Dia[0] ;
            AV38count = (long)(AV38count+1) ;
            brk94C2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4933Inc_Usuari)==0) )
         {
            AV30Option = A4933Inc_Usuari ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!"))) ;
            AV31Options.add(AV30Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94C2 )
         {
            brk94C2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADINC_TERMINALOPTIONS' Routine */
      returnInSub = false ;
      AV18TFInc_Terminal = AV26SearchTxt ;
      AV19TFInc_Terminal_Sel = "" ;
      AV52Controlincidencias_wcds_1_filterfulltext = AV44FilterFullText ;
      AV53Controlincidencias_wcds_2_tfinc_dia = AV10TFInc_Dia ;
      AV54Controlincidencias_wcds_3_tfinc_linea = AV12TFInc_Linea ;
      AV55Controlincidencias_wcds_4_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV56Controlincidencias_wcds_5_tfinc_hora = AV14TFInc_Hora ;
      AV57Controlincidencias_wcds_6_tfinc_usuario = AV16TFInc_Usuario ;
      AV58Controlincidencias_wcds_7_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV59Controlincidencias_wcds_8_tfinc_terminal = AV18TFInc_Terminal ;
      AV60Controlincidencias_wcds_9_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV61Controlincidencias_wcds_10_tfinc_prog = AV20TFInc_Prog ;
      AV62Controlincidencias_wcds_11_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV63Controlincidencias_wcds_12_tfinc_hdr = AV22TFInc_Hdr ;
      AV64Controlincidencias_wcds_13_tfinc_hdr_sel = AV23TFInc_Hdr_Sel ;
      AV65Controlincidencias_wcds_14_tfinc_obstxt = AV24TFInc_obsTxt ;
      AV66Controlincidencias_wcds_15_tfinc_obstxt_sel = AV25TFInc_obsTxt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Controlincidencias_wcds_1_filterfulltext ,
                                           AV53Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV56Controlincidencias_wcds_5_tfinc_hora ,
                                           AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV61Controlincidencias_wcds_10_tfinc_prog ,
                                           AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           AV46Inc_dia ,
                                           AV47Inc_dia_to ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV57Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV59Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV59Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV61Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV61Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV63Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV63Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV65Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV65Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P094C3 */
      pr_default.execute(1, new Object[] {AV46Inc_dia, AV47Inc_dia_to, AV45Emprcod, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, AV53Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to), AV56Controlincidencias_wcds_5_tfinc_hora, lV57Controlincidencias_wcds_6_tfinc_usuario, AV58Controlincidencias_wcds_7_tfinc_usuario_sel, lV59Controlincidencias_wcds_8_tfinc_terminal, AV60Controlincidencias_wcds_9_tfinc_terminal_sel, lV61Controlincidencias_wcds_10_tfinc_prog, AV62Controlincidencias_wcds_11_tfinc_prog_sel, lV63Controlincidencias_wcds_12_tfinc_hdr, AV64Controlincidencias_wcds_13_tfinc_hdr_sel, lV65Controlincidencias_wcds_14_tfinc_obstxt, AV66Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk94C4 = false ;
         A396EmprCod = P094C3_A396EmprCod[0] ;
         A4934Inc_Termin = P094C3_A4934Inc_Termin[0] ;
         A4935Inc_Prog = P094C3_A4935Inc_Prog[0] ;
         A4933Inc_Usuari = P094C3_A4933Inc_Usuari[0] ;
         A4932Inc_Hora = P094C3_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P094C3_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P094C3_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P094C3_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P094C3_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P094C3_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P094C3_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P094C3_A4934Inc_Termin[0], A4934Inc_Termin) == 0 ) )
         {
            brk94C4 = false ;
            A396EmprCod = P094C3_A396EmprCod[0] ;
            A4931Inc_Linea = P094C3_A4931Inc_Linea[0] ;
            A4929Inc_Dia = P094C3_A4929Inc_Dia[0] ;
            AV38count = (long)(AV38count+1) ;
            brk94C4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4934Inc_Termin)==0) )
         {
            AV30Option = A4934Inc_Termin ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94C4 )
         {
            brk94C4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADINC_PROGOPTIONS' Routine */
      returnInSub = false ;
      AV20TFInc_Prog = AV26SearchTxt ;
      AV21TFInc_Prog_Sel = "" ;
      AV52Controlincidencias_wcds_1_filterfulltext = AV44FilterFullText ;
      AV53Controlincidencias_wcds_2_tfinc_dia = AV10TFInc_Dia ;
      AV54Controlincidencias_wcds_3_tfinc_linea = AV12TFInc_Linea ;
      AV55Controlincidencias_wcds_4_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV56Controlincidencias_wcds_5_tfinc_hora = AV14TFInc_Hora ;
      AV57Controlincidencias_wcds_6_tfinc_usuario = AV16TFInc_Usuario ;
      AV58Controlincidencias_wcds_7_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV59Controlincidencias_wcds_8_tfinc_terminal = AV18TFInc_Terminal ;
      AV60Controlincidencias_wcds_9_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV61Controlincidencias_wcds_10_tfinc_prog = AV20TFInc_Prog ;
      AV62Controlincidencias_wcds_11_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV63Controlincidencias_wcds_12_tfinc_hdr = AV22TFInc_Hdr ;
      AV64Controlincidencias_wcds_13_tfinc_hdr_sel = AV23TFInc_Hdr_Sel ;
      AV65Controlincidencias_wcds_14_tfinc_obstxt = AV24TFInc_obsTxt ;
      AV66Controlincidencias_wcds_15_tfinc_obstxt_sel = AV25TFInc_obsTxt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV52Controlincidencias_wcds_1_filterfulltext ,
                                           AV53Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV56Controlincidencias_wcds_5_tfinc_hora ,
                                           AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV61Controlincidencias_wcds_10_tfinc_prog ,
                                           AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           AV46Inc_dia ,
                                           AV47Inc_dia_to ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV57Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV59Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV59Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV61Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV61Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV63Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV63Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV65Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV65Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P094C4 */
      pr_default.execute(2, new Object[] {AV46Inc_dia, AV47Inc_dia_to, AV45Emprcod, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, AV53Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to), AV56Controlincidencias_wcds_5_tfinc_hora, lV57Controlincidencias_wcds_6_tfinc_usuario, AV58Controlincidencias_wcds_7_tfinc_usuario_sel, lV59Controlincidencias_wcds_8_tfinc_terminal, AV60Controlincidencias_wcds_9_tfinc_terminal_sel, lV61Controlincidencias_wcds_10_tfinc_prog, AV62Controlincidencias_wcds_11_tfinc_prog_sel, lV63Controlincidencias_wcds_12_tfinc_hdr, AV64Controlincidencias_wcds_13_tfinc_hdr_sel, lV65Controlincidencias_wcds_14_tfinc_obstxt, AV66Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk94C6 = false ;
         A396EmprCod = P094C4_A396EmprCod[0] ;
         A4935Inc_Prog = P094C4_A4935Inc_Prog[0] ;
         A4934Inc_Termin = P094C4_A4934Inc_Termin[0] ;
         A4933Inc_Usuari = P094C4_A4933Inc_Usuari[0] ;
         A4932Inc_Hora = P094C4_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P094C4_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P094C4_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P094C4_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P094C4_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P094C4_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P094C4_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P094C4_A4935Inc_Prog[0], A4935Inc_Prog) == 0 ) )
         {
            brk94C6 = false ;
            A396EmprCod = P094C4_A396EmprCod[0] ;
            A4931Inc_Linea = P094C4_A4931Inc_Linea[0] ;
            A4929Inc_Dia = P094C4_A4929Inc_Dia[0] ;
            AV38count = (long)(AV38count+1) ;
            brk94C6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4935Inc_Prog)==0) )
         {
            AV30Option = A4935Inc_Prog ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94C6 )
         {
            brk94C6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADINC_HDROPTIONS' Routine */
      returnInSub = false ;
      AV22TFInc_Hdr = AV26SearchTxt ;
      AV23TFInc_Hdr_Sel = "" ;
      AV52Controlincidencias_wcds_1_filterfulltext = AV44FilterFullText ;
      AV53Controlincidencias_wcds_2_tfinc_dia = AV10TFInc_Dia ;
      AV54Controlincidencias_wcds_3_tfinc_linea = AV12TFInc_Linea ;
      AV55Controlincidencias_wcds_4_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV56Controlincidencias_wcds_5_tfinc_hora = AV14TFInc_Hora ;
      AV57Controlincidencias_wcds_6_tfinc_usuario = AV16TFInc_Usuario ;
      AV58Controlincidencias_wcds_7_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV59Controlincidencias_wcds_8_tfinc_terminal = AV18TFInc_Terminal ;
      AV60Controlincidencias_wcds_9_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV61Controlincidencias_wcds_10_tfinc_prog = AV20TFInc_Prog ;
      AV62Controlincidencias_wcds_11_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV63Controlincidencias_wcds_12_tfinc_hdr = AV22TFInc_Hdr ;
      AV64Controlincidencias_wcds_13_tfinc_hdr_sel = AV23TFInc_Hdr_Sel ;
      AV65Controlincidencias_wcds_14_tfinc_obstxt = AV24TFInc_obsTxt ;
      AV66Controlincidencias_wcds_15_tfinc_obstxt_sel = AV25TFInc_obsTxt_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV52Controlincidencias_wcds_1_filterfulltext ,
                                           AV53Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV56Controlincidencias_wcds_5_tfinc_hora ,
                                           AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV61Controlincidencias_wcds_10_tfinc_prog ,
                                           AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           AV45Emprcod ,
                                           AV46Inc_dia ,
                                           A396EmprCod ,
                                           AV47Inc_dia_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV57Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV59Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV59Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV61Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV61Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV63Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV63Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV65Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV65Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P094C5 */
      pr_default.execute(3, new Object[] {AV45Emprcod, AV46Inc_dia, AV47Inc_dia_to, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, AV53Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to), AV56Controlincidencias_wcds_5_tfinc_hora, lV57Controlincidencias_wcds_6_tfinc_usuario, AV58Controlincidencias_wcds_7_tfinc_usuario_sel, lV59Controlincidencias_wcds_8_tfinc_terminal, AV60Controlincidencias_wcds_9_tfinc_terminal_sel, lV61Controlincidencias_wcds_10_tfinc_prog, AV62Controlincidencias_wcds_11_tfinc_prog_sel, lV63Controlincidencias_wcds_12_tfinc_hdr, AV64Controlincidencias_wcds_13_tfinc_hdr_sel, lV65Controlincidencias_wcds_14_tfinc_obstxt, AV66Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P094C5_A396EmprCod[0] ;
         A4935Inc_Prog = P094C5_A4935Inc_Prog[0] ;
         A4934Inc_Termin = P094C5_A4934Inc_Termin[0] ;
         A4933Inc_Usuari = P094C5_A4933Inc_Usuari[0] ;
         A4932Inc_Hora = P094C5_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P094C5_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P094C5_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P094C5_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P094C5_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P094C5_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P094C5_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         if ( ! (GXutil.strcmp("", A13713Inc_Hdr)==0) )
         {
            AV30Option = A13713Inc_Hdr ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            if ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) == 0 ) )
            {
               AV38count = GXutil.lval( (String)AV36OptionIndexes.elementAt(-1+AV29InsertIndex)) ;
               AV38count = (long)(AV38count+1) ;
               AV36OptionIndexes.removeItem(AV29InsertIndex);
               AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
            }
            else
            {
               AV31Options.add(AV30Option, AV29InsertIndex);
               AV36OptionIndexes.add("1", AV29InsertIndex);
            }
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADINC_OBSTXTOPTIONS' Routine */
      returnInSub = false ;
      AV24TFInc_obsTxt = AV26SearchTxt ;
      AV25TFInc_obsTxt_Sel = "" ;
      AV52Controlincidencias_wcds_1_filterfulltext = AV44FilterFullText ;
      AV53Controlincidencias_wcds_2_tfinc_dia = AV10TFInc_Dia ;
      AV54Controlincidencias_wcds_3_tfinc_linea = AV12TFInc_Linea ;
      AV55Controlincidencias_wcds_4_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV56Controlincidencias_wcds_5_tfinc_hora = AV14TFInc_Hora ;
      AV57Controlincidencias_wcds_6_tfinc_usuario = AV16TFInc_Usuario ;
      AV58Controlincidencias_wcds_7_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV59Controlincidencias_wcds_8_tfinc_terminal = AV18TFInc_Terminal ;
      AV60Controlincidencias_wcds_9_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV61Controlincidencias_wcds_10_tfinc_prog = AV20TFInc_Prog ;
      AV62Controlincidencias_wcds_11_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV63Controlincidencias_wcds_12_tfinc_hdr = AV22TFInc_Hdr ;
      AV64Controlincidencias_wcds_13_tfinc_hdr_sel = AV23TFInc_Hdr_Sel ;
      AV65Controlincidencias_wcds_14_tfinc_obstxt = AV24TFInc_obsTxt ;
      AV66Controlincidencias_wcds_15_tfinc_obstxt_sel = AV25TFInc_obsTxt_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV52Controlincidencias_wcds_1_filterfulltext ,
                                           AV53Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV56Controlincidencias_wcds_5_tfinc_hora ,
                                           AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV61Controlincidencias_wcds_10_tfinc_prog ,
                                           AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           AV45Emprcod ,
                                           AV46Inc_dia ,
                                           A396EmprCod ,
                                           AV47Inc_dia_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV52Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV57Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV59Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV59Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV61Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV61Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV63Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV63Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV65Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV65Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P094C6 */
      pr_default.execute(4, new Object[] {AV45Emprcod, AV46Inc_dia, AV47Inc_dia_to, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, lV52Controlincidencias_wcds_1_filterfulltext, AV53Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV54Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV55Controlincidencias_wcds_4_tfinc_linea_to), AV56Controlincidencias_wcds_5_tfinc_hora, lV57Controlincidencias_wcds_6_tfinc_usuario, AV58Controlincidencias_wcds_7_tfinc_usuario_sel, lV59Controlincidencias_wcds_8_tfinc_terminal, AV60Controlincidencias_wcds_9_tfinc_terminal_sel, lV61Controlincidencias_wcds_10_tfinc_prog, AV62Controlincidencias_wcds_11_tfinc_prog_sel, lV63Controlincidencias_wcds_12_tfinc_hdr, AV64Controlincidencias_wcds_13_tfinc_hdr_sel, lV65Controlincidencias_wcds_14_tfinc_obstxt, AV66Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P094C6_A396EmprCod[0] ;
         A4935Inc_Prog = P094C6_A4935Inc_Prog[0] ;
         A4934Inc_Termin = P094C6_A4934Inc_Termin[0] ;
         A4933Inc_Usuari = P094C6_A4933Inc_Usuari[0] ;
         A4932Inc_Hora = P094C6_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P094C6_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P094C6_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P094C6_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P094C6_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P094C6_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P094C6_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         if ( ! (GXutil.strcmp("", A13712Inc_obsTxt)==0) )
         {
            AV30Option = A13712Inc_obsTxt ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            if ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) == 0 ) )
            {
               AV38count = GXutil.lval( (String)AV36OptionIndexes.elementAt(-1+AV29InsertIndex)) ;
               AV38count = (long)(AV38count+1) ;
               AV36OptionIndexes.removeItem(AV29InsertIndex);
               AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
            }
            else
            {
               AV31Options.add(AV30Option, AV29InsertIndex);
               AV36OptionIndexes.add("1", AV29InsertIndex);
            }
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlincidencias_wcgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = controlincidencias_wcgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = controlincidencias_wcgetfilterdata.this.AV37OptionIndexesJson;
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
      AV44FilterFullText = "" ;
      AV10TFInc_Dia = GXutil.nullDate() ;
      AV14TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV16TFInc_Usuario = "" ;
      AV17TFInc_Usuario_Sel = "" ;
      AV18TFInc_Terminal = "" ;
      AV19TFInc_Terminal_Sel = "" ;
      AV20TFInc_Prog = "" ;
      AV21TFInc_Prog_Sel = "" ;
      AV22TFInc_Hdr = "" ;
      AV23TFInc_Hdr_Sel = "" ;
      AV24TFInc_obsTxt = "" ;
      AV25TFInc_obsTxt_Sel = "" ;
      AV45Emprcod = "" ;
      AV46Inc_dia = GXutil.nullDate() ;
      AV47Inc_dia_to = GXutil.nullDate() ;
      A4933Inc_Usuari = "" ;
      AV52Controlincidencias_wcds_1_filterfulltext = "" ;
      AV53Controlincidencias_wcds_2_tfinc_dia = GXutil.nullDate() ;
      AV56Controlincidencias_wcds_5_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV57Controlincidencias_wcds_6_tfinc_usuario = "" ;
      AV58Controlincidencias_wcds_7_tfinc_usuario_sel = "" ;
      AV59Controlincidencias_wcds_8_tfinc_terminal = "" ;
      AV60Controlincidencias_wcds_9_tfinc_terminal_sel = "" ;
      AV61Controlincidencias_wcds_10_tfinc_prog = "" ;
      AV62Controlincidencias_wcds_11_tfinc_prog_sel = "" ;
      AV63Controlincidencias_wcds_12_tfinc_hdr = "" ;
      AV64Controlincidencias_wcds_13_tfinc_hdr_sel = "" ;
      AV65Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      AV66Controlincidencias_wcds_15_tfinc_obstxt_sel = "" ;
      scmdbuf = "" ;
      lV52Controlincidencias_wcds_1_filterfulltext = "" ;
      lV57Controlincidencias_wcds_6_tfinc_usuario = "" ;
      lV59Controlincidencias_wcds_8_tfinc_terminal = "" ;
      lV61Controlincidencias_wcds_10_tfinc_prog = "" ;
      lV63Controlincidencias_wcds_12_tfinc_hdr = "" ;
      lV65Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A5301Inc_BarPar = "" ;
      A4936Inc_Obs = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P094C2_A396EmprCod = new String[] {""} ;
      P094C2_A4933Inc_Usuari = new String[] {""} ;
      P094C2_A4935Inc_Prog = new String[] {""} ;
      P094C2_A4934Inc_Termin = new String[] {""} ;
      P094C2_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P094C2_A4931Inc_Linea = new long[1] ;
      P094C2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094C2_A5301Inc_BarPar = new String[] {""} ;
      P094C2_A5300Inc_BarReo = new byte[1] ;
      P094C2_A5299Inc_Barcod = new int[1] ;
      P094C2_A4936Inc_Obs = new String[] {""} ;
      A13712Inc_obsTxt = "" ;
      A13713Inc_Hdr = "" ;
      AV30Option = "" ;
      AV33OptionDesc = "" ;
      P094C3_A396EmprCod = new String[] {""} ;
      P094C3_A4934Inc_Termin = new String[] {""} ;
      P094C3_A4935Inc_Prog = new String[] {""} ;
      P094C3_A4933Inc_Usuari = new String[] {""} ;
      P094C3_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P094C3_A4931Inc_Linea = new long[1] ;
      P094C3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094C3_A5301Inc_BarPar = new String[] {""} ;
      P094C3_A5300Inc_BarReo = new byte[1] ;
      P094C3_A5299Inc_Barcod = new int[1] ;
      P094C3_A4936Inc_Obs = new String[] {""} ;
      P094C4_A396EmprCod = new String[] {""} ;
      P094C4_A4935Inc_Prog = new String[] {""} ;
      P094C4_A4934Inc_Termin = new String[] {""} ;
      P094C4_A4933Inc_Usuari = new String[] {""} ;
      P094C4_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P094C4_A4931Inc_Linea = new long[1] ;
      P094C4_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094C4_A5301Inc_BarPar = new String[] {""} ;
      P094C4_A5300Inc_BarReo = new byte[1] ;
      P094C4_A5299Inc_Barcod = new int[1] ;
      P094C4_A4936Inc_Obs = new String[] {""} ;
      P094C5_A396EmprCod = new String[] {""} ;
      P094C5_A4935Inc_Prog = new String[] {""} ;
      P094C5_A4934Inc_Termin = new String[] {""} ;
      P094C5_A4933Inc_Usuari = new String[] {""} ;
      P094C5_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P094C5_A4931Inc_Linea = new long[1] ;
      P094C5_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094C5_A5301Inc_BarPar = new String[] {""} ;
      P094C5_A5300Inc_BarReo = new byte[1] ;
      P094C5_A5299Inc_Barcod = new int[1] ;
      P094C5_A4936Inc_Obs = new String[] {""} ;
      P094C6_A396EmprCod = new String[] {""} ;
      P094C6_A4935Inc_Prog = new String[] {""} ;
      P094C6_A4934Inc_Termin = new String[] {""} ;
      P094C6_A4933Inc_Usuari = new String[] {""} ;
      P094C6_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P094C6_A4931Inc_Linea = new long[1] ;
      P094C6_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094C6_A5301Inc_BarPar = new String[] {""} ;
      P094C6_A5300Inc_BarReo = new byte[1] ;
      P094C6_A5299Inc_Barcod = new int[1] ;
      P094C6_A4936Inc_Obs = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlincidencias_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P094C2_A396EmprCod, P094C2_A4933Inc_Usuari, P094C2_A4935Inc_Prog, P094C2_A4934Inc_Termin, P094C2_A4932Inc_Hora, P094C2_A4931Inc_Linea, P094C2_A4929Inc_Dia, P094C2_A5301Inc_BarPar, P094C2_A5300Inc_BarReo, P094C2_A5299Inc_Barcod,
            P094C2_A4936Inc_Obs
            }
            , new Object[] {
            P094C3_A396EmprCod, P094C3_A4934Inc_Termin, P094C3_A4935Inc_Prog, P094C3_A4933Inc_Usuari, P094C3_A4932Inc_Hora, P094C3_A4931Inc_Linea, P094C3_A4929Inc_Dia, P094C3_A5301Inc_BarPar, P094C3_A5300Inc_BarReo, P094C3_A5299Inc_Barcod,
            P094C3_A4936Inc_Obs
            }
            , new Object[] {
            P094C4_A396EmprCod, P094C4_A4935Inc_Prog, P094C4_A4934Inc_Termin, P094C4_A4933Inc_Usuari, P094C4_A4932Inc_Hora, P094C4_A4931Inc_Linea, P094C4_A4929Inc_Dia, P094C4_A5301Inc_BarPar, P094C4_A5300Inc_BarReo, P094C4_A5299Inc_Barcod,
            P094C4_A4936Inc_Obs
            }
            , new Object[] {
            P094C5_A396EmprCod, P094C5_A4935Inc_Prog, P094C5_A4934Inc_Termin, P094C5_A4933Inc_Usuari, P094C5_A4932Inc_Hora, P094C5_A4931Inc_Linea, P094C5_A4929Inc_Dia, P094C5_A5301Inc_BarPar, P094C5_A5300Inc_BarReo, P094C5_A5299Inc_Barcod,
            P094C5_A4936Inc_Obs
            }
            , new Object[] {
            P094C6_A396EmprCod, P094C6_A4935Inc_Prog, P094C6_A4934Inc_Termin, P094C6_A4933Inc_Usuari, P094C6_A4932Inc_Hora, P094C6_A4931Inc_Linea, P094C6_A4929Inc_Dia, P094C6_A5301Inc_BarPar, P094C6_A5300Inc_BarReo, P094C6_A5299Inc_Barcod,
            P094C6_A4936Inc_Obs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5300Inc_BarReo ;
   private short Gx_err ;
   private int AV50GXV1 ;
   private int A5299Inc_Barcod ;
   private int AV29InsertIndex ;
   private long AV12TFInc_Linea ;
   private long AV13TFInc_Linea_To ;
   private long AV54Controlincidencias_wcds_3_tfinc_linea ;
   private long AV55Controlincidencias_wcds_4_tfinc_linea_to ;
   private long A4931Inc_Linea ;
   private long AV38count ;
   private String AV16TFInc_Usuario ;
   private String AV17TFInc_Usuario_Sel ;
   private String AV18TFInc_Terminal ;
   private String AV19TFInc_Terminal_Sel ;
   private String AV20TFInc_Prog ;
   private String AV21TFInc_Prog_Sel ;
   private String AV22TFInc_Hdr ;
   private String AV23TFInc_Hdr_Sel ;
   private String AV45Emprcod ;
   private String A4933Inc_Usuari ;
   private String AV57Controlincidencias_wcds_6_tfinc_usuario ;
   private String AV58Controlincidencias_wcds_7_tfinc_usuario_sel ;
   private String AV59Controlincidencias_wcds_8_tfinc_terminal ;
   private String AV60Controlincidencias_wcds_9_tfinc_terminal_sel ;
   private String AV61Controlincidencias_wcds_10_tfinc_prog ;
   private String AV62Controlincidencias_wcds_11_tfinc_prog_sel ;
   private String AV63Controlincidencias_wcds_12_tfinc_hdr ;
   private String AV64Controlincidencias_wcds_13_tfinc_hdr_sel ;
   private String scmdbuf ;
   private String lV57Controlincidencias_wcds_6_tfinc_usuario ;
   private String lV59Controlincidencias_wcds_8_tfinc_terminal ;
   private String lV61Controlincidencias_wcds_10_tfinc_prog ;
   private String lV63Controlincidencias_wcds_12_tfinc_hdr ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A5301Inc_BarPar ;
   private String A396EmprCod ;
   private String A13713Inc_Hdr ;
   private java.util.Date AV14TFInc_Hora ;
   private java.util.Date AV56Controlincidencias_wcds_5_tfinc_hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV10TFInc_Dia ;
   private java.util.Date AV46Inc_dia ;
   private java.util.Date AV47Inc_dia_to ;
   private java.util.Date AV53Controlincidencias_wcds_2_tfinc_dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean returnInSub ;
   private boolean brk94C2 ;
   private boolean brk94C4 ;
   private boolean brk94C6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV24TFInc_obsTxt ;
   private String AV25TFInc_obsTxt_Sel ;
   private String AV52Controlincidencias_wcds_1_filterfulltext ;
   private String AV65Controlincidencias_wcds_14_tfinc_obstxt ;
   private String AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ;
   private String lV52Controlincidencias_wcds_1_filterfulltext ;
   private String lV65Controlincidencias_wcds_14_tfinc_obstxt ;
   private String A4936Inc_Obs ;
   private String A13712Inc_obsTxt ;
   private String AV30Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P094C2_A396EmprCod ;
   private String[] P094C2_A4933Inc_Usuari ;
   private String[] P094C2_A4935Inc_Prog ;
   private String[] P094C2_A4934Inc_Termin ;
   private java.util.Date[] P094C2_A4932Inc_Hora ;
   private long[] P094C2_A4931Inc_Linea ;
   private java.util.Date[] P094C2_A4929Inc_Dia ;
   private String[] P094C2_A5301Inc_BarPar ;
   private byte[] P094C2_A5300Inc_BarReo ;
   private int[] P094C2_A5299Inc_Barcod ;
   private String[] P094C2_A4936Inc_Obs ;
   private String[] P094C3_A396EmprCod ;
   private String[] P094C3_A4934Inc_Termin ;
   private String[] P094C3_A4935Inc_Prog ;
   private String[] P094C3_A4933Inc_Usuari ;
   private java.util.Date[] P094C3_A4932Inc_Hora ;
   private long[] P094C3_A4931Inc_Linea ;
   private java.util.Date[] P094C3_A4929Inc_Dia ;
   private String[] P094C3_A5301Inc_BarPar ;
   private byte[] P094C3_A5300Inc_BarReo ;
   private int[] P094C3_A5299Inc_Barcod ;
   private String[] P094C3_A4936Inc_Obs ;
   private String[] P094C4_A396EmprCod ;
   private String[] P094C4_A4935Inc_Prog ;
   private String[] P094C4_A4934Inc_Termin ;
   private String[] P094C4_A4933Inc_Usuari ;
   private java.util.Date[] P094C4_A4932Inc_Hora ;
   private long[] P094C4_A4931Inc_Linea ;
   private java.util.Date[] P094C4_A4929Inc_Dia ;
   private String[] P094C4_A5301Inc_BarPar ;
   private byte[] P094C4_A5300Inc_BarReo ;
   private int[] P094C4_A5299Inc_Barcod ;
   private String[] P094C4_A4936Inc_Obs ;
   private String[] P094C5_A396EmprCod ;
   private String[] P094C5_A4935Inc_Prog ;
   private String[] P094C5_A4934Inc_Termin ;
   private String[] P094C5_A4933Inc_Usuari ;
   private java.util.Date[] P094C5_A4932Inc_Hora ;
   private long[] P094C5_A4931Inc_Linea ;
   private java.util.Date[] P094C5_A4929Inc_Dia ;
   private String[] P094C5_A5301Inc_BarPar ;
   private byte[] P094C5_A5300Inc_BarReo ;
   private int[] P094C5_A5299Inc_Barcod ;
   private String[] P094C5_A4936Inc_Obs ;
   private String[] P094C6_A396EmprCod ;
   private String[] P094C6_A4935Inc_Prog ;
   private String[] P094C6_A4934Inc_Termin ;
   private String[] P094C6_A4933Inc_Usuari ;
   private java.util.Date[] P094C6_A4932Inc_Hora ;
   private long[] P094C6_A4931Inc_Linea ;
   private java.util.Date[] P094C6_A4929Inc_Dia ;
   private String[] P094C6_A5301Inc_BarPar ;
   private byte[] P094C6_A5300Inc_BarReo ;
   private int[] P094C6_A5299Inc_Barcod ;
   private String[] P094C6_A4936Inc_Obs ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class controlincidencias_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV53Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV54Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV55Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV56Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV61Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          java.util.Date AV46Inc_dia ,
                                          java.util.Date AV47Inc_dia_to ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Usuari, Inc_Prog, Inc_Termin, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV56Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV57Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV59Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV61Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Inc_Usuari" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P094C3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV53Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV54Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV55Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV56Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV61Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          java.util.Date AV46Inc_dia ,
                                          java.util.Date AV47Inc_dia_to ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[23];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Termin, Inc_Prog, Inc_Usuari, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV56Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV57Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV59Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV61Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Inc_Termin" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P094C4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV53Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV54Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV55Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV56Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV61Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          java.util.Date AV46Inc_dia ,
                                          java.util.Date AV47Inc_dia_to ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Prog, Inc_Termin, Inc_Usuari, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV52Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV56Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV57Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV59Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV61Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Inc_Prog" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P094C5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV53Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV54Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV55Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV56Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV61Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          String AV45Emprcod ,
                                          java.util.Date AV46Inc_dia ,
                                          String A396EmprCod ,
                                          java.util.Date AV47Inc_dia_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[23];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Prog, Inc_Termin, Inc_Usuari, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(EmprCod = ? and Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      if ( ! (GXutil.strcmp("", AV52Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV56Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV57Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV59Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV61Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P094C6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV53Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV54Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV55Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV56Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV58Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV57Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV60Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV59Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV62Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV61Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV64Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV63Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV66Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV65Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          String AV45Emprcod ,
                                          java.util.Date AV46Inc_dia ,
                                          String A396EmprCod ,
                                          java.util.Date AV47Inc_dia_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[23];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Prog, Inc_Termin, Inc_Usuari, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(EmprCod = ? and Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      if ( ! (GXutil.strcmp("", AV52Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV56Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV57Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV59Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV61Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
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
                  return conditional_P094C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 1 :
                  return conditional_P094C3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 2 :
                  return conditional_P094C4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 3 :
                  return conditional_P094C5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
            case 4 :
                  return conditional_P094C6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094C3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094C4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094C5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094C6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
      }
   }

}

