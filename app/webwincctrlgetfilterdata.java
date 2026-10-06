package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwincctrlgetfilterdata extends GXProcedure
{
   public webwincctrlgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwincctrlgetfilterdata.class ), "" );
   }

   public webwincctrlgetfilterdata( int remoteHandle ,
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
      webwincctrlgetfilterdata.this.aP5 = new String[] {""};
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
      webwincctrlgetfilterdata.this.AV28DDOName = aP0;
      webwincctrlgetfilterdata.this.AV26SearchTxt = aP1;
      webwincctrlgetfilterdata.this.AV27SearchTxtTo = aP2;
      webwincctrlgetfilterdata.this.aP3 = aP3;
      webwincctrlgetfilterdata.this.aP4 = aP4;
      webwincctrlgetfilterdata.this.aP5 = aP5;
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
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("WebWIncCtrlGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWIncCtrlGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WebWIncCtrlGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "INC_DIA") == 0 )
         {
            AV68Inc_Dia = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV69Inc_Dia_To = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
            AV24TFInc_Hdr = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV25TFInc_Hdr_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADINC_USUARIOOPTIONS' Routine */
      returnInSub = false ;
      AV16TFInc_Usuario = AV26SearchTxt ;
      AV17TFInc_Usuario_Sel = "" ;
      AV74Webwincctrlds_1_inc_dia = AV68Inc_Dia ;
      AV75Webwincctrlds_2_inc_dia_to = AV69Inc_Dia_To ;
      AV76Webwincctrlds_3_filterfulltext = AV67FilterFullText ;
      AV77Webwincctrlds_4_tfinc_dia = AV10TFInc_Dia ;
      AV78Webwincctrlds_5_tfinc_linea = AV12TFInc_Linea ;
      AV79Webwincctrlds_6_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV80Webwincctrlds_7_tfinc_hora = AV14TFInc_Hora ;
      AV81Webwincctrlds_8_tfinc_usuario = AV16TFInc_Usuario ;
      AV82Webwincctrlds_9_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV83Webwincctrlds_10_tfinc_terminal = AV18TFInc_Terminal ;
      AV84Webwincctrlds_11_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV85Webwincctrlds_12_tfinc_prog = AV20TFInc_Prog ;
      AV86Webwincctrlds_13_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV87Webwincctrlds_14_tfinc_hdr = AV24TFInc_Hdr ;
      AV88Webwincctrlds_15_tfinc_hdr_sel = AV25TFInc_Hdr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV74Webwincctrlds_1_inc_dia ,
                                           AV75Webwincctrlds_2_inc_dia_to ,
                                           AV77Webwincctrlds_4_tfinc_dia ,
                                           Long.valueOf(AV78Webwincctrlds_5_tfinc_linea) ,
                                           Long.valueOf(AV79Webwincctrlds_6_tfinc_linea_to) ,
                                           AV80Webwincctrlds_7_tfinc_hora ,
                                           AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                           AV81Webwincctrlds_8_tfinc_usuario ,
                                           AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                           AV83Webwincctrlds_10_tfinc_terminal ,
                                           AV86Webwincctrlds_13_tfinc_prog_sel ,
                                           AV85Webwincctrlds_12_tfinc_prog ,
                                           AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                           AV87Webwincctrlds_14_tfinc_hdr ,
                                           A4929Inc_Dia ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           AV76Webwincctrlds_3_filterfulltext ,
                                           A4936Inc_Obs ,
                                           A13713Inc_Hdr } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P089K2 */
      pr_default.execute(0, new Object[] {AV74Webwincctrlds_1_inc_dia, AV75Webwincctrlds_2_inc_dia_to, AV77Webwincctrlds_4_tfinc_dia});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk89K2 = false ;
         A4929Inc_Dia = P089K2_A4929Inc_Dia[0] ;
         A396EmprCod = P089K2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV76Webwincctrlds_3_filterfulltext)==0) || ( ( GXutil.like( localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4931Inc_Linea, 10, 0) , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4933Inc_Usuari) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4934Inc_Termin) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4935Inc_Prog) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4936Inc_Obs) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13713Inc_Hdr) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV38count = 0 ;
            while ( (pr_default.getStatus(0) != 101) )
            {
               brk89K2 = false ;
               A4929Inc_Dia = P089K2_A4929Inc_Dia[0] ;
               A396EmprCod = P089K2_A396EmprCod[0] ;
               AV38count = (long)(AV38count+1) ;
               brk89K2 = true ;
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
         }
         if ( ! brk89K2 )
         {
            brk89K2 = true ;
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
      AV74Webwincctrlds_1_inc_dia = AV68Inc_Dia ;
      AV75Webwincctrlds_2_inc_dia_to = AV69Inc_Dia_To ;
      AV76Webwincctrlds_3_filterfulltext = AV67FilterFullText ;
      AV77Webwincctrlds_4_tfinc_dia = AV10TFInc_Dia ;
      AV78Webwincctrlds_5_tfinc_linea = AV12TFInc_Linea ;
      AV79Webwincctrlds_6_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV80Webwincctrlds_7_tfinc_hora = AV14TFInc_Hora ;
      AV81Webwincctrlds_8_tfinc_usuario = AV16TFInc_Usuario ;
      AV82Webwincctrlds_9_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV83Webwincctrlds_10_tfinc_terminal = AV18TFInc_Terminal ;
      AV84Webwincctrlds_11_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV85Webwincctrlds_12_tfinc_prog = AV20TFInc_Prog ;
      AV86Webwincctrlds_13_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV87Webwincctrlds_14_tfinc_hdr = AV24TFInc_Hdr ;
      AV88Webwincctrlds_15_tfinc_hdr_sel = AV25TFInc_Hdr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV74Webwincctrlds_1_inc_dia ,
                                           AV75Webwincctrlds_2_inc_dia_to ,
                                           AV77Webwincctrlds_4_tfinc_dia ,
                                           Long.valueOf(AV78Webwincctrlds_5_tfinc_linea) ,
                                           Long.valueOf(AV79Webwincctrlds_6_tfinc_linea_to) ,
                                           AV80Webwincctrlds_7_tfinc_hora ,
                                           AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                           AV81Webwincctrlds_8_tfinc_usuario ,
                                           AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                           AV83Webwincctrlds_10_tfinc_terminal ,
                                           AV86Webwincctrlds_13_tfinc_prog_sel ,
                                           AV85Webwincctrlds_12_tfinc_prog ,
                                           AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                           AV87Webwincctrlds_14_tfinc_hdr ,
                                           A4929Inc_Dia ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           AV76Webwincctrlds_3_filterfulltext ,
                                           A4936Inc_Obs ,
                                           A13713Inc_Hdr } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P089K3 */
      pr_default.execute(1, new Object[] {AV74Webwincctrlds_1_inc_dia, AV75Webwincctrlds_2_inc_dia_to, AV77Webwincctrlds_4_tfinc_dia});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk89K4 = false ;
         A4929Inc_Dia = P089K3_A4929Inc_Dia[0] ;
         A396EmprCod = P089K3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV76Webwincctrlds_3_filterfulltext)==0) || ( ( GXutil.like( localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4931Inc_Linea, 10, 0) , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4933Inc_Usuari) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4934Inc_Termin) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4935Inc_Prog) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4936Inc_Obs) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13713Inc_Hdr) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV38count = 0 ;
            while ( (pr_default.getStatus(1) != 101) )
            {
               brk89K4 = false ;
               A4929Inc_Dia = P089K3_A4929Inc_Dia[0] ;
               A396EmprCod = P089K3_A396EmprCod[0] ;
               AV38count = (long)(AV38count+1) ;
               brk89K4 = true ;
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
         }
         if ( ! brk89K4 )
         {
            brk89K4 = true ;
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
      AV74Webwincctrlds_1_inc_dia = AV68Inc_Dia ;
      AV75Webwincctrlds_2_inc_dia_to = AV69Inc_Dia_To ;
      AV76Webwincctrlds_3_filterfulltext = AV67FilterFullText ;
      AV77Webwincctrlds_4_tfinc_dia = AV10TFInc_Dia ;
      AV78Webwincctrlds_5_tfinc_linea = AV12TFInc_Linea ;
      AV79Webwincctrlds_6_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV80Webwincctrlds_7_tfinc_hora = AV14TFInc_Hora ;
      AV81Webwincctrlds_8_tfinc_usuario = AV16TFInc_Usuario ;
      AV82Webwincctrlds_9_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV83Webwincctrlds_10_tfinc_terminal = AV18TFInc_Terminal ;
      AV84Webwincctrlds_11_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV85Webwincctrlds_12_tfinc_prog = AV20TFInc_Prog ;
      AV86Webwincctrlds_13_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV87Webwincctrlds_14_tfinc_hdr = AV24TFInc_Hdr ;
      AV88Webwincctrlds_15_tfinc_hdr_sel = AV25TFInc_Hdr_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV74Webwincctrlds_1_inc_dia ,
                                           AV75Webwincctrlds_2_inc_dia_to ,
                                           AV77Webwincctrlds_4_tfinc_dia ,
                                           Long.valueOf(AV78Webwincctrlds_5_tfinc_linea) ,
                                           Long.valueOf(AV79Webwincctrlds_6_tfinc_linea_to) ,
                                           AV80Webwincctrlds_7_tfinc_hora ,
                                           AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                           AV81Webwincctrlds_8_tfinc_usuario ,
                                           AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                           AV83Webwincctrlds_10_tfinc_terminal ,
                                           AV86Webwincctrlds_13_tfinc_prog_sel ,
                                           AV85Webwincctrlds_12_tfinc_prog ,
                                           AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                           AV87Webwincctrlds_14_tfinc_hdr ,
                                           A4929Inc_Dia ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           AV76Webwincctrlds_3_filterfulltext ,
                                           A4936Inc_Obs ,
                                           A13713Inc_Hdr } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P089K4 */
      pr_default.execute(2, new Object[] {AV74Webwincctrlds_1_inc_dia, AV75Webwincctrlds_2_inc_dia_to, AV77Webwincctrlds_4_tfinc_dia});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk89K6 = false ;
         A4929Inc_Dia = P089K4_A4929Inc_Dia[0] ;
         A396EmprCod = P089K4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV76Webwincctrlds_3_filterfulltext)==0) || ( ( GXutil.like( localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4931Inc_Linea, 10, 0) , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4933Inc_Usuari) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4934Inc_Termin) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4935Inc_Prog) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4936Inc_Obs) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13713Inc_Hdr) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV38count = 0 ;
            while ( (pr_default.getStatus(2) != 101) )
            {
               brk89K6 = false ;
               A4929Inc_Dia = P089K4_A4929Inc_Dia[0] ;
               A396EmprCod = P089K4_A396EmprCod[0] ;
               AV38count = (long)(AV38count+1) ;
               brk89K6 = true ;
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
         }
         if ( ! brk89K6 )
         {
            brk89K6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADINC_HDROPTIONS' Routine */
      returnInSub = false ;
      AV24TFInc_Hdr = AV26SearchTxt ;
      AV25TFInc_Hdr_Sel = "" ;
      AV74Webwincctrlds_1_inc_dia = AV68Inc_Dia ;
      AV75Webwincctrlds_2_inc_dia_to = AV69Inc_Dia_To ;
      AV76Webwincctrlds_3_filterfulltext = AV67FilterFullText ;
      AV77Webwincctrlds_4_tfinc_dia = AV10TFInc_Dia ;
      AV78Webwincctrlds_5_tfinc_linea = AV12TFInc_Linea ;
      AV79Webwincctrlds_6_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV80Webwincctrlds_7_tfinc_hora = AV14TFInc_Hora ;
      AV81Webwincctrlds_8_tfinc_usuario = AV16TFInc_Usuario ;
      AV82Webwincctrlds_9_tfinc_usuario_sel = AV17TFInc_Usuario_Sel ;
      AV83Webwincctrlds_10_tfinc_terminal = AV18TFInc_Terminal ;
      AV84Webwincctrlds_11_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV85Webwincctrlds_12_tfinc_prog = AV20TFInc_Prog ;
      AV86Webwincctrlds_13_tfinc_prog_sel = AV21TFInc_Prog_Sel ;
      AV87Webwincctrlds_14_tfinc_hdr = AV24TFInc_Hdr ;
      AV88Webwincctrlds_15_tfinc_hdr_sel = AV25TFInc_Hdr_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV74Webwincctrlds_1_inc_dia ,
                                           AV75Webwincctrlds_2_inc_dia_to ,
                                           AV77Webwincctrlds_4_tfinc_dia ,
                                           Long.valueOf(AV78Webwincctrlds_5_tfinc_linea) ,
                                           Long.valueOf(AV79Webwincctrlds_6_tfinc_linea_to) ,
                                           AV80Webwincctrlds_7_tfinc_hora ,
                                           AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                           AV81Webwincctrlds_8_tfinc_usuario ,
                                           AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                           AV83Webwincctrlds_10_tfinc_terminal ,
                                           AV86Webwincctrlds_13_tfinc_prog_sel ,
                                           AV85Webwincctrlds_12_tfinc_prog ,
                                           AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                           AV87Webwincctrlds_14_tfinc_hdr ,
                                           A4929Inc_Dia ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           AV76Webwincctrlds_3_filterfulltext ,
                                           A4936Inc_Obs ,
                                           A13713Inc_Hdr } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P089K5 */
      pr_default.execute(3, new Object[] {AV74Webwincctrlds_1_inc_dia, AV75Webwincctrlds_2_inc_dia_to, AV77Webwincctrlds_4_tfinc_dia});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4929Inc_Dia = P089K5_A4929Inc_Dia[0] ;
         A396EmprCod = P089K5_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV76Webwincctrlds_3_filterfulltext)==0) || ( ( GXutil.like( localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4931Inc_Linea, 10, 0) , GXutil.padr( "%" + AV76Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4933Inc_Usuari) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4934Inc_Termin) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4935Inc_Prog) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4936Inc_Obs) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13713Inc_Hdr) , GXutil.padr( "%" + GXutil.upper( AV76Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
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
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwincctrlgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = webwincctrlgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = webwincctrlgetfilterdata.this.AV37OptionIndexesJson;
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
      AV68Inc_Dia = GXutil.nullDate() ;
      AV69Inc_Dia_To = GXutil.nullDate() ;
      AV67FilterFullText = "" ;
      AV10TFInc_Dia = GXutil.nullDate() ;
      AV14TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV16TFInc_Usuario = "" ;
      AV17TFInc_Usuario_Sel = "" ;
      AV18TFInc_Terminal = "" ;
      AV19TFInc_Terminal_Sel = "" ;
      AV20TFInc_Prog = "" ;
      AV21TFInc_Prog_Sel = "" ;
      AV24TFInc_Hdr = "" ;
      AV25TFInc_Hdr_Sel = "" ;
      A4933Inc_Usuari = "" ;
      AV74Webwincctrlds_1_inc_dia = GXutil.nullDate() ;
      AV75Webwincctrlds_2_inc_dia_to = GXutil.nullDate() ;
      AV76Webwincctrlds_3_filterfulltext = "" ;
      AV77Webwincctrlds_4_tfinc_dia = GXutil.nullDate() ;
      AV80Webwincctrlds_7_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV81Webwincctrlds_8_tfinc_usuario = "" ;
      AV82Webwincctrlds_9_tfinc_usuario_sel = "" ;
      AV83Webwincctrlds_10_tfinc_terminal = "" ;
      AV84Webwincctrlds_11_tfinc_terminal_sel = "" ;
      AV85Webwincctrlds_12_tfinc_prog = "" ;
      AV86Webwincctrlds_13_tfinc_prog_sel = "" ;
      AV87Webwincctrlds_14_tfinc_hdr = "" ;
      AV88Webwincctrlds_15_tfinc_hdr_sel = "" ;
      lV76Webwincctrlds_3_filterfulltext = "" ;
      scmdbuf = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A13713Inc_Hdr = "" ;
      P089K2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089K2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      AV33OptionDesc = "" ;
      P089K3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089K3_A396EmprCod = new String[] {""} ;
      P089K4_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089K4_A396EmprCod = new String[] {""} ;
      P089K5_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089K5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwincctrlgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P089K2_A4929Inc_Dia, P089K2_A396EmprCod
            }
            , new Object[] {
            P089K3_A4929Inc_Dia, P089K3_A396EmprCod
            }
            , new Object[] {
            P089K4_A4929Inc_Dia, P089K4_A396EmprCod
            }
            , new Object[] {
            P089K5_A4929Inc_Dia, P089K5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5300Inc_BarReo ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int A5299Inc_Barcod ;
   private int AV29InsertIndex ;
   private long AV12TFInc_Linea ;
   private long AV13TFInc_Linea_To ;
   private long AV78Webwincctrlds_5_tfinc_linea ;
   private long AV79Webwincctrlds_6_tfinc_linea_to ;
   private long A4931Inc_Linea ;
   private long AV38count ;
   private String AV16TFInc_Usuario ;
   private String AV17TFInc_Usuario_Sel ;
   private String AV18TFInc_Terminal ;
   private String AV19TFInc_Terminal_Sel ;
   private String AV20TFInc_Prog ;
   private String AV21TFInc_Prog_Sel ;
   private String AV24TFInc_Hdr ;
   private String AV25TFInc_Hdr_Sel ;
   private String A4933Inc_Usuari ;
   private String AV81Webwincctrlds_8_tfinc_usuario ;
   private String AV82Webwincctrlds_9_tfinc_usuario_sel ;
   private String AV83Webwincctrlds_10_tfinc_terminal ;
   private String AV84Webwincctrlds_11_tfinc_terminal_sel ;
   private String AV85Webwincctrlds_12_tfinc_prog ;
   private String AV86Webwincctrlds_13_tfinc_prog_sel ;
   private String AV87Webwincctrlds_14_tfinc_hdr ;
   private String AV88Webwincctrlds_15_tfinc_hdr_sel ;
   private String scmdbuf ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A13713Inc_Hdr ;
   private String A396EmprCod ;
   private java.util.Date AV14TFInc_Hora ;
   private java.util.Date AV80Webwincctrlds_7_tfinc_hora ;
   private java.util.Date AV68Inc_Dia ;
   private java.util.Date AV69Inc_Dia_To ;
   private java.util.Date AV10TFInc_Dia ;
   private java.util.Date AV74Webwincctrlds_1_inc_dia ;
   private java.util.Date AV75Webwincctrlds_2_inc_dia_to ;
   private java.util.Date AV77Webwincctrlds_4_tfinc_dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean returnInSub ;
   private boolean brk89K2 ;
   private boolean brk89K4 ;
   private boolean brk89K6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV67FilterFullText ;
   private String AV76Webwincctrlds_3_filterfulltext ;
   private String lV76Webwincctrlds_3_filterfulltext ;
   private String A4936Inc_Obs ;
   private String AV30Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P089K2_A4929Inc_Dia ;
   private String[] P089K2_A396EmprCod ;
   private java.util.Date[] P089K3_A4929Inc_Dia ;
   private String[] P089K3_A396EmprCod ;
   private java.util.Date[] P089K4_A4929Inc_Dia ;
   private String[] P089K4_A396EmprCod ;
   private java.util.Date[] P089K5_A4929Inc_Dia ;
   private String[] P089K5_A396EmprCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class webwincctrlgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P089K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV74Webwincctrlds_1_inc_dia ,
                                          java.util.Date AV75Webwincctrlds_2_inc_dia_to ,
                                          java.util.Date AV77Webwincctrlds_4_tfinc_dia ,
                                          long AV78Webwincctrlds_5_tfinc_linea ,
                                          long AV79Webwincctrlds_6_tfinc_linea_to ,
                                          java.util.Date AV80Webwincctrlds_7_tfinc_hora ,
                                          String AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                          String AV81Webwincctrlds_8_tfinc_usuario ,
                                          String AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                          String AV83Webwincctrlds_10_tfinc_terminal ,
                                          String AV86Webwincctrlds_13_tfinc_prog_sel ,
                                          String AV85Webwincctrlds_12_tfinc_prog ,
                                          String AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                          String AV87Webwincctrlds_14_tfinc_hdr ,
                                          java.util.Date A4929Inc_Dia ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String AV76Webwincctrlds_3_filterfulltext ,
                                          String A4936Inc_Obs ,
                                          String A13713Inc_Hdr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[3];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Webwincctrlds_1_inc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Webwincctrlds_2_inc_dia_to)) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwincctrlds_4_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P089K3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV74Webwincctrlds_1_inc_dia ,
                                          java.util.Date AV75Webwincctrlds_2_inc_dia_to ,
                                          java.util.Date AV77Webwincctrlds_4_tfinc_dia ,
                                          long AV78Webwincctrlds_5_tfinc_linea ,
                                          long AV79Webwincctrlds_6_tfinc_linea_to ,
                                          java.util.Date AV80Webwincctrlds_7_tfinc_hora ,
                                          String AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                          String AV81Webwincctrlds_8_tfinc_usuario ,
                                          String AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                          String AV83Webwincctrlds_10_tfinc_terminal ,
                                          String AV86Webwincctrlds_13_tfinc_prog_sel ,
                                          String AV85Webwincctrlds_12_tfinc_prog ,
                                          String AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                          String AV87Webwincctrlds_14_tfinc_hdr ,
                                          java.util.Date A4929Inc_Dia ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String AV76Webwincctrlds_3_filterfulltext ,
                                          String A4936Inc_Obs ,
                                          String A13713Inc_Hdr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[3];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Webwincctrlds_1_inc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Webwincctrlds_2_inc_dia_to)) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwincctrlds_4_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P089K4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV74Webwincctrlds_1_inc_dia ,
                                          java.util.Date AV75Webwincctrlds_2_inc_dia_to ,
                                          java.util.Date AV77Webwincctrlds_4_tfinc_dia ,
                                          long AV78Webwincctrlds_5_tfinc_linea ,
                                          long AV79Webwincctrlds_6_tfinc_linea_to ,
                                          java.util.Date AV80Webwincctrlds_7_tfinc_hora ,
                                          String AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                          String AV81Webwincctrlds_8_tfinc_usuario ,
                                          String AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                          String AV83Webwincctrlds_10_tfinc_terminal ,
                                          String AV86Webwincctrlds_13_tfinc_prog_sel ,
                                          String AV85Webwincctrlds_12_tfinc_prog ,
                                          String AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                          String AV87Webwincctrlds_14_tfinc_hdr ,
                                          java.util.Date A4929Inc_Dia ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String AV76Webwincctrlds_3_filterfulltext ,
                                          String A4936Inc_Obs ,
                                          String A13713Inc_Hdr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[3];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Webwincctrlds_1_inc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Webwincctrlds_2_inc_dia_to)) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwincctrlds_4_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P089K5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV74Webwincctrlds_1_inc_dia ,
                                          java.util.Date AV75Webwincctrlds_2_inc_dia_to ,
                                          java.util.Date AV77Webwincctrlds_4_tfinc_dia ,
                                          long AV78Webwincctrlds_5_tfinc_linea ,
                                          long AV79Webwincctrlds_6_tfinc_linea_to ,
                                          java.util.Date AV80Webwincctrlds_7_tfinc_hora ,
                                          String AV82Webwincctrlds_9_tfinc_usuario_sel ,
                                          String AV81Webwincctrlds_8_tfinc_usuario ,
                                          String AV84Webwincctrlds_11_tfinc_terminal_sel ,
                                          String AV83Webwincctrlds_10_tfinc_terminal ,
                                          String AV86Webwincctrlds_13_tfinc_prog_sel ,
                                          String AV85Webwincctrlds_12_tfinc_prog ,
                                          String AV88Webwincctrlds_15_tfinc_hdr_sel ,
                                          String AV87Webwincctrlds_14_tfinc_hdr ,
                                          java.util.Date A4929Inc_Dia ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String AV76Webwincctrlds_3_filterfulltext ,
                                          String A4936Inc_Obs ,
                                          String A13713Inc_Hdr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[3];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Webwincctrlds_1_inc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Webwincctrlds_2_inc_dia_to)) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77Webwincctrlds_4_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Inc_Dia" ;
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
                  return conditional_P089K2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
            case 1 :
                  return conditional_P089K3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
            case 2 :
                  return conditional_P089K4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
            case 3 :
                  return conditional_P089K5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P089K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P089K3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P089K4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P089K5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[3]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[4]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[3]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[4]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[3]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[4]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[3]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[4]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               return;
      }
   }

}

