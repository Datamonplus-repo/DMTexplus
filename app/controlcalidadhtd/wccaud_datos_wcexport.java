package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccaud_datos_wcexport extends GXProcedure
{
   public wccaud_datos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccaud_datos_wcexport.class ), "" );
   }

   public wccaud_datos_wcexport( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wccaud_datos_wcexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      wccaud_datos_wcexport.this.aP0 = aP0;
      wccaud_datos_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "Wccaud_Datos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      if ( ! ( (0==AV34TFCCTLin) && (0==AV35TFCCTLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFCCTLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFCCTLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFCCTLinDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFCCTLinDsc_Sel, GXv_char5) ;
         wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFCCTLinDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFCCTLinDsc, GXv_char5) ;
            wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFCCVal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCCVal_Sel, GXv_char5) ;
         wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFCCVal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFCCVal, GXv_char5) ;
            wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFCCfValStd_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Standar", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFCCfValStd_Sel, GXv_char5) ;
         wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFCCfValStd)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Standar", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wccaud_datos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCCfValStd, GXv_char5) ;
            wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( "#" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Descripción", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Standar", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin = AV34TFCCTLin ;
      AV54Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to = AV35TFCCTLin_To ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = AV36TFCCTLinDsc ;
      AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = AV37TFCCTLinDsc_Sel ;
      AV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = AV39TFCCVal ;
      AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = AV40TFCCVal_Sel ;
      AV59Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = AV48TFCCfValStd ;
      AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = AV49TFCCfValStd_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV53Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) ,
                                           Short.valueOf(AV54Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) ,
                                           AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                           AV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                           AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                           AV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A4035CCVal ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                           AV59Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                           A14419CCfValStd } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc), 30, "%") ;
      lV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = GXutil.padr( GXutil.rtrim( AV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval), 40, "%") ;
      /* Using cursor P0ANS2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV53Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin), Short.valueOf(AV54Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to), lV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc, AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel, lV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval, AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4035CCVal = P0ANS2_A4035CCVal[0] ;
         A4043CCTLinDsc = P0ANS2_A4043CCTLinDsc[0] ;
         A194BarOrdLin = P0ANS2_A194BarOrdLin[0] ;
         A758ProCod = P0ANS2_A758ProCod[0] ;
         A130BarCodPar = P0ANS2_A130BarCodPar[0] ;
         A132BarCodReo = P0ANS2_A132BarCodReo[0] ;
         A129BarCod = P0ANS2_A129BarCod[0] ;
         A136BarColNum = P0ANS2_A136BarColNum[0] ;
         A135BarColNom = P0ANS2_A135BarColNom[0] ;
         A4034CCTLin = P0ANS2_A4034CCTLin[0] ;
         A4031CCTCod = P0ANS2_A4031CCTCod[0] ;
         A212BarSer = P0ANS2_A212BarSer[0] ;
         A252CliCod = P0ANS2_A252CliCod[0] ;
         n252CliCod = P0ANS2_n252CliCod[0] ;
         A396EmprCod = P0ANS2_A396EmprCod[0] ;
         A136BarColNum = P0ANS2_A136BarColNum[0] ;
         A135BarColNom = P0ANS2_A135BarColNom[0] ;
         A212BarSer = P0ANS2_A212BarSer[0] ;
         A252CliCod = P0ANS2_A252CliCod[0] ;
         n252CliCod = P0ANS2_n252CliCod[0] ;
         A4043CCTLinDsc = P0ANS2_A4043CCTLinDsc[0] ;
         GXt_char4 = A14419CCfValStd ;
         GXv_char5[0] = GXt_char4 ;
         new app.controlcalidadhtd.pccstdval(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A4031CCTCod, A4034CCTLin, GXv_char5) ;
         wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         A14419CCfValStd = GXt_char4 ;
         if ( ! ( (GXutil.strcmp("", AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) && ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd)==0) ) ) || ( GXutil.like( GXutil.upper( A14419CCfValStd) , GXutil.padr( "%" + GXutil.upper( AV59Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel)==0) || ( ( GXutil.strcmp(A14419CCfValStd, AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel) == 0 ) ) )
            {
               AV13CellRow = (int)(AV13CellRow+1) ;
               /* Execute user subroutine: 'BEFOREWRITELINE' */
               S162 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( A4034CCTLin );
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4043CCTLinDsc, GXv_char5) ;
               wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4035CCVal, GXv_char5) ;
               wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14419CCfValStd, GXv_char5) ;
               wccaud_datos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( GXt_char4 );
               /* Execute user subroutine: 'AFTERWRITELINE' */
               S172 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.Wccaud_Datos_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.Wccaud_Datos_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ControlCalidadHTD.Wccaud_Datos_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV34TFCCTLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCCTLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV36TFCCTLinDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV37TFCCTLinDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL") == 0 )
         {
            AV39TFCCVal = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL_SEL") == 0 )
         {
            AV40TFCCVal_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFVALSTD") == 0 )
         {
            AV48TFCCfValStd = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFVALSTD_SEL") == 0 )
         {
            AV49TFCCfValStd_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = wccaud_datos_wcexport.this.AV11Filename;
      this.aP1[0] = wccaud_datos_wcexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV37TFCCTLinDsc_Sel = "" ;
      AV36TFCCTLinDsc = "" ;
      AV40TFCCVal_Sel = "" ;
      AV39TFCCVal = "" ;
      AV49TFCCfValStd_Sel = "" ;
      AV48TFCCfValStd = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A4043CCTLinDsc = "" ;
      A4035CCVal = "" ;
      A14419CCfValStd = "" ;
      AV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = "" ;
      AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel = "" ;
      AV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = "" ;
      AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel = "" ;
      AV59Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd = "" ;
      AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel = "" ;
      scmdbuf = "" ;
      lV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc = "" ;
      lV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval = "" ;
      P0ANS2_A4035CCVal = new String[] {""} ;
      P0ANS2_A4043CCTLinDsc = new String[] {""} ;
      P0ANS2_A194BarOrdLin = new short[1] ;
      P0ANS2_A758ProCod = new String[] {""} ;
      P0ANS2_A130BarCodPar = new String[] {""} ;
      P0ANS2_A132BarCodReo = new byte[1] ;
      P0ANS2_A129BarCod = new int[1] ;
      P0ANS2_A136BarColNum = new int[1] ;
      P0ANS2_A135BarColNom = new String[] {""} ;
      P0ANS2_A4034CCTLin = new short[1] ;
      P0ANS2_A4031CCTCod = new int[1] ;
      P0ANS2_A212BarSer = new String[] {""} ;
      P0ANS2_A252CliCod = new int[1] ;
      P0ANS2_n252CliCod = new boolean[] {false} ;
      P0ANS2_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A396EmprCod = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wccaud_datos_wcexport__default(),
         new Object[] {
             new Object[] {
            P0ANS2_A4035CCVal, P0ANS2_A4043CCTLinDsc, P0ANS2_A194BarOrdLin, P0ANS2_A758ProCod, P0ANS2_A130BarCodPar, P0ANS2_A132BarCodReo, P0ANS2_A129BarCod, P0ANS2_A136BarColNum, P0ANS2_A135BarColNom, P0ANS2_A4034CCTLin,
            P0ANS2_A4031CCTCod, P0ANS2_A212BarSer, P0ANS2_A252CliCod, P0ANS2_n252CliCod, P0ANS2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV34TFCCTLin ;
   private short AV35TFCCTLin_To ;
   private short GXv_int3[] ;
   private short A4034CCTLin ;
   private short AV53Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ;
   private short AV54Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ;
   private short AV16OrderedBy ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int AV61GXV1 ;
   private String AV37TFCCTLinDsc_Sel ;
   private String AV36TFCCTLinDsc ;
   private String AV40TFCCVal_Sel ;
   private String AV39TFCCVal ;
   private String AV49TFCCfValStd_Sel ;
   private String AV48TFCCfValStd ;
   private String A4043CCTLinDsc ;
   private String A4035CCVal ;
   private String A14419CCfValStd ;
   private String AV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ;
   private String AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ;
   private String AV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ;
   private String AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ;
   private String AV59Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ;
   private String AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ;
   private String scmdbuf ;
   private String lV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ;
   private String lV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n252CliCod ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANS2_A4035CCVal ;
   private String[] P0ANS2_A4043CCTLinDsc ;
   private short[] P0ANS2_A194BarOrdLin ;
   private String[] P0ANS2_A758ProCod ;
   private String[] P0ANS2_A130BarCodPar ;
   private byte[] P0ANS2_A132BarCodReo ;
   private int[] P0ANS2_A129BarCod ;
   private int[] P0ANS2_A136BarColNum ;
   private String[] P0ANS2_A135BarColNom ;
   private short[] P0ANS2_A4034CCTLin ;
   private int[] P0ANS2_A4031CCTCod ;
   private String[] P0ANS2_A212BarSer ;
   private int[] P0ANS2_A252CliCod ;
   private boolean[] P0ANS2_n252CliCod ;
   private String[] P0ANS2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class wccaud_datos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ANS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV53Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin ,
                                          short AV54Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to ,
                                          String AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel ,
                                          String AV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc ,
                                          String AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel ,
                                          String AV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A4035CCVal ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV60Controlcalidadhtd_wccaud_datos_wcds_8_tfccfvalstd_sel ,
                                          String AV59Controlcalidadhtd_wccaud_datos_wcds_7_tfccfvalstd ,
                                          String A14419CCfValStd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[6];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.CCVal, T3.CCTLinDsc, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarColNum, T2.BarColNom, T1.CCTLin, T1.CCTCod, T2.BarSer, T2.CliCod," ;
      scmdbuf += " T1.EmprCod FROM ((TXPCC1 T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin)" ;
      if ( ! (0==AV53Controlcalidadhtd_wccaud_datos_wcds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlcalidadhtd_wccaud_datos_wcds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_wccaud_datos_wcds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_wccaud_datos_wcds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_wccaud_datos_wcds_5_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_wccaud_datos_wcds_6_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTLin" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CCTLinDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CCTLinDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCVal" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCVal DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0ANS2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
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
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

