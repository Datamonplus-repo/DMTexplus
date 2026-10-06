package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informesalidasproductos_0 extends GXProcedure
{
   public informesalidasproductos_0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informesalidasproductos_0.class ), "" );
   }

   public informesalidasproductos_0( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 )
   {
      informesalidasproductos_0.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      informesalidasproductos_0.this.AV32Emprcod = aP0;
      informesalidasproductos_0.this.AV60PrvNumfrom = aP1;
      informesalidasproductos_0.this.AV48PrvNum_to = aP2;
      informesalidasproductos_0.this.AV49CCStkFecfrom = aP3;
      informesalidasproductos_0.this.AV50CCStkFecto = aP4;
      informesalidasproductos_0.this.AV61PrdNumfrom = aP5;
      informesalidasproductos_0.this.AV46PrdNum_to = aP6;
      informesalidasproductos_0.this.AV44Producto = aP7;
      informesalidasproductos_0.this.aP8 = aP8;
      informesalidasproductos_0.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV62ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV62ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV62ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV62ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV62ProgressIndicator.show();
      AV63CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV60PrvNumfrom) ,
                                           Integer.valueOf(AV48PrvNum_to) ,
                                           Integer.valueOf(A795PrvNum) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P09V12 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV60PrvNumfrom), Integer.valueOf(AV48PrvNum_to)});
      cV63CantidadRegistrosAProcesar = P09V12_AV63CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV63CantidadRegistrosAProcesar = (short)(AV63CantidadRegistrosAProcesar+cV63CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV63CantidadRegistrosAProcesar == 0 )
      {
         AV63CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV10CellRow = 2 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10CellRow = 1 ;
      AV9CellCol = 1 ;
      while ( AV9CellCol <= 50 )
      {
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setBold( (short)(1) );
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setColor( 11 );
         AV9CellCol = (int)(AV9CellCol+1) ;
      }
      AV12ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Proveedor", "") );
      AV12ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV12ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV12ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV12ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV12ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV12ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV12ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Nº HDR/Nº Documento", "") );
      AV12ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Tipo Movimiento", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64CantidadRegistrosProcesados = (short)(0) ;
      /* Using cursor P09V13 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV60PrvNumfrom), Integer.valueOf(AV48PrvNum_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P09V13_A396EmprCod[0] ;
         A795PrvNum = P09V13_A795PrvNum[0] ;
         A794PrvNom = P09V13_A794PrvNom[0] ;
         n794PrvNom = P09V13_n794PrvNom[0] ;
         A783PrvCta = P09V13_A783PrvCta[0] ;
         n783PrvCta = P09V13_n783PrvCta[0] ;
         AV47PrvNum = A795PrvNum ;
         AV54PrvNom = A794PrvNom ;
         AV51Cuenta = ((GXutil.strcmp(AV44Producto, httpContext.getMessage( "B", ""))==0) ? GXutil.substring( A783PrvCta, 1, 9) : GXutil.str( AV47PrvNum, 6, 0)) ;
         AV52FlagProv = (short)(0) ;
         AV53TotCant = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P09V14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV47PrvNum), AV61PrdNumfrom, AV46PrdNum_to});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A728PrdRefPrv = P09V14_A728PrdRefPrv[0] ;
            A718PrdNom = P09V14_A718PrdNom[0] ;
            A719PrdNum = P09V14_A719PrdNum[0] ;
            A795PrvNum = P09V14_A795PrvNum[0] ;
            A704PrdExiAlm = P09V14_A704PrdExiAlm[0] ;
            /* Using cursor P09V15 */
            pr_default.execute(3, new Object[] {A396EmprCod, AV61PrdNumfrom, AV49CCStkFecfrom, AV50CCStkFecto, AV46PrdNum_to});
            while ( (pr_default.getStatus(3) != 101) )
            {
               brk9V15 = false ;
               A3839CcoCod = P09V15_A3839CcoCod[0] ;
               A719PrdNum = P09V15_A719PrdNum[0] ;
               A3345TipMovCc = P09V15_A3345TipMovCc[0] ;
               A3344CCStkCanS = P09V15_A3344CCStkCanS[0] ;
               A3349CCStkPre = P09V15_A3349CCStkPre[0] ;
               A3348CCStkFec = P09V15_A3348CCStkFec[0] ;
               A3353CCStkPed = P09V15_A3353CCStkPed[0] ;
               A3840CcoDsc = P09V15_A3840CcoDsc[0] ;
               n3840CcoDsc = P09V15_n3840CcoDsc[0] ;
               A3352CCStkPar = P09V15_A3352CCStkPar[0] ;
               A3351CCStkReo = P09V15_A3351CCStkReo[0] ;
               A3350CCStkBar = P09V15_A3350CCStkBar[0] ;
               A3346TipMovCn = P09V15_A3346TipMovCn[0] ;
               n3346TipMovCn = P09V15_n3346TipMovCn[0] ;
               A3342CCStkLin = P09V15_A3342CCStkLin[0] ;
               A3840CcoDsc = P09V15_A3840CcoDsc[0] ;
               n3840CcoDsc = P09V15_n3840CcoDsc[0] ;
               A3346TipMovCn = P09V15_A3346TipMovCn[0] ;
               n3346TipMovCn = P09V15_n3346TipMovCn[0] ;
               AV45PrdNum = ((GXutil.strcmp(AV44Producto, httpContext.getMessage( "B", ""))==0) ? GXutil.substring( A728PrdRefPrv, 1, 6) : A719PrdNum) ;
               AV55prdnom = A718PrdNom ;
               AV56TotPrd = DecimalUtil.doubleToDec(0) ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09V15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09V15_A719PrdNum[0], A719PrdNum) == 0 ) )
               {
                  brk9V15 = false ;
                  A3839CcoCod = P09V15_A3839CcoCod[0] ;
                  A3345TipMovCc = P09V15_A3345TipMovCc[0] ;
                  A3344CCStkCanS = P09V15_A3344CCStkCanS[0] ;
                  A3349CCStkPre = P09V15_A3349CCStkPre[0] ;
                  A3348CCStkFec = P09V15_A3348CCStkFec[0] ;
                  A3353CCStkPed = P09V15_A3353CCStkPed[0] ;
                  A3840CcoDsc = P09V15_A3840CcoDsc[0] ;
                  n3840CcoDsc = P09V15_n3840CcoDsc[0] ;
                  A3352CCStkPar = P09V15_A3352CCStkPar[0] ;
                  A3351CCStkReo = P09V15_A3351CCStkReo[0] ;
                  A3350CCStkBar = P09V15_A3350CCStkBar[0] ;
                  A3346TipMovCn = P09V15_A3346TipMovCn[0] ;
                  n3346TipMovCn = P09V15_n3346TipMovCn[0] ;
                  A3342CCStkLin = P09V15_A3342CCStkLin[0] ;
                  A3840CcoDsc = P09V15_A3840CcoDsc[0] ;
                  n3840CcoDsc = P09V15_n3840CcoDsc[0] ;
                  A3346TipMovCn = P09V15_A3346TipMovCn[0] ;
                  n3346TipMovCn = P09V15_n3346TipMovCn[0] ;
                  if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
                  {
                     AV12ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setText( AV51Cuenta );
                     AV12ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( AV54PrvNom );
                     AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setText( AV45PrdNum );
                     AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setText( AV55prdnom );
                     AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3344CCStkCanS)) );
                     AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3349CCStkPre)) );
                     GXt_dtime1 = GXutil.resetTime( A3348CCStkFec );
                     AV12ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                     AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setDate( GXt_dtime1 );
                     AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setNumber( A3353CCStkPed );
                     AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setText( A3840CcoDsc );
                  }
                  else
                  {
                     AV12ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setText( AV51Cuenta );
                     AV12ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( AV54PrvNom );
                     AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setText( AV45PrdNum );
                     AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setText( AV55prdnom );
                     AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3344CCStkCanS)) );
                     AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A3349CCStkPre)) );
                     GXt_dtime1 = GXutil.resetTime( A3348CCStkFec );
                     AV12ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                     AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setDate( GXt_dtime1 );
                     AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setText( GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar );
                     AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setText( A3346TipMovCn );
                  }
                  AV10CellRow = (int)(AV10CellRow+1) ;
                  AV56TotPrd = AV56TotPrd.add(A3344CCStkCanS) ;
                  brk9V15 = true ;
                  pr_default.readNext(3);
               }
               AV10CellRow = (int)(AV10CellRow+1) ;
               AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TotPrd)) );
               AV10CellRow = (int)(AV10CellRow+1) ;
               AV53TotCant = AV53TotCant.add(AV56TotPrd) ;
               AV59TotG = AV59TotG.add(AV56TotPrd) ;
               if ( ! brk9V15 )
               {
                  brk9V15 = true ;
                  pr_default.readNext(3);
               }
            }
            pr_default.close(3);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV53TotCant.doubleValue() > 0 )
         {
            AV10CellRow = (int)(AV10CellRow+1) ;
            AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TotPrd)) );
            AV10CellRow = (int)(AV10CellRow+1) ;
         }
         AV64CantidadRegistrosProcesados = (short)(AV64CantidadRegistrosProcesados+1) ;
         AV65Porcentaje = (short)((AV64CantidadRegistrosProcesados/ (double) (AV63CantidadRegistrosAProcesar))*100) ;
         AV62ProgressIndicator.setgxTv_SdtProgress_Value( AV65Porcentaje );
         AV62ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV64CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV63CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( AV47PrvNum, 6, 0)), GXutil.trim( AV54PrvNom), "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV59TotG.doubleValue() > 0 )
      {
         AV10CellRow = (int)(AV10CellRow+1) ;
         AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TotG)) );
      }
      AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV62ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV62ProgressIndicator.hide();
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV12ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV13Filename = "InformeSalidasProductosOpcion_0_Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV12ExcelDocument.Open(AV13Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV12ExcelDocument.Clear();
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV12ExcelDocument.getErrCode() != 0 )
      {
         AV13Filename = "" ;
         AV11ErrorMessage = AV12ExcelDocument.getErrDescription() ;
         AV12ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = informesalidasproductos_0.this.AV13Filename;
      this.aP9[0] = informesalidasproductos_0.this.AV11ErrorMessage;
      CloseOpenCursors();
      AV12ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Filename = "" ;
      AV11ErrorMessage = "" ;
      AV62ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      P09V12_AV63CantidadRegistrosAProcesar = new short[1] ;
      AV12ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      P09V13_A396EmprCod = new String[] {""} ;
      P09V13_A795PrvNum = new int[1] ;
      P09V13_A794PrvNom = new String[] {""} ;
      P09V13_n794PrvNom = new boolean[] {false} ;
      P09V13_A783PrvCta = new String[] {""} ;
      P09V13_n783PrvCta = new boolean[] {false} ;
      A396EmprCod = "" ;
      A794PrvNom = "" ;
      A783PrvCta = "" ;
      AV54PrvNom = "" ;
      AV51Cuenta = "" ;
      AV53TotCant = DecimalUtil.ZERO ;
      P09V14_A396EmprCod = new String[] {""} ;
      P09V14_A728PrdRefPrv = new String[] {""} ;
      P09V14_A718PrdNom = new String[] {""} ;
      P09V14_A719PrdNum = new String[] {""} ;
      P09V14_A795PrvNum = new int[1] ;
      P09V14_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A728PrdRefPrv = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      P09V15_A3839CcoCod = new short[1] ;
      P09V15_A396EmprCod = new String[] {""} ;
      P09V15_A719PrdNum = new String[] {""} ;
      P09V15_A3345TipMovCc = new String[] {""} ;
      P09V15_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V15_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09V15_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09V15_A3353CCStkPed = new int[1] ;
      P09V15_A3840CcoDsc = new String[] {""} ;
      P09V15_n3840CcoDsc = new boolean[] {false} ;
      P09V15_A3352CCStkPar = new String[] {""} ;
      P09V15_A3351CCStkReo = new byte[1] ;
      P09V15_A3350CCStkBar = new int[1] ;
      P09V15_A3346TipMovCn = new String[] {""} ;
      P09V15_n3346TipMovCn = new boolean[] {false} ;
      P09V15_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3840CcoDsc = "" ;
      A3352CCStkPar = "" ;
      A3346TipMovCn = "" ;
      AV45PrdNum = "" ;
      AV55prdnom = "" ;
      AV56TotPrd = DecimalUtil.ZERO ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV59TotG = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informesalidasproductos_0__default(),
         new Object[] {
             new Object[] {
            P09V12_AV63CantidadRegistrosAProcesar
            }
            , new Object[] {
            P09V13_A396EmprCod, P09V13_A795PrvNum, P09V13_A794PrvNom, P09V13_n794PrvNom, P09V13_A783PrvCta, P09V13_n783PrvCta
            }
            , new Object[] {
            P09V14_A396EmprCod, P09V14_A728PrdRefPrv, P09V14_A718PrdNom, P09V14_A719PrdNum, P09V14_A795PrvNum, P09V14_A704PrdExiAlm
            }
            , new Object[] {
            P09V15_A3839CcoCod, P09V15_A396EmprCod, P09V15_A719PrdNum, P09V15_A3345TipMovCc, P09V15_A3344CCStkCanS, P09V15_A3349CCStkPre, P09V15_A3348CCStkFec, P09V15_A3353CCStkPed, P09V15_A3840CcoDsc, P09V15_n3840CcoDsc,
            P09V15_A3352CCStkPar, P09V15_A3351CCStkReo, P09V15_A3350CCStkBar, P09V15_A3346TipMovCn, P09V15_n3346TipMovCn, P09V15_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private short AV63CantidadRegistrosAProcesar ;
   private short cV63CantidadRegistrosAProcesar ;
   private short AV64CantidadRegistrosProcesados ;
   private short AV52FlagProv ;
   private short A3839CcoCod ;
   private short AV65Porcentaje ;
   private short Gx_err ;
   private int AV60PrvNumfrom ;
   private int AV48PrvNum_to ;
   private int A795PrvNum ;
   private int AV10CellRow ;
   private int AV9CellCol ;
   private int AV47PrvNum ;
   private int A3353CCStkPed ;
   private int A3350CCStkBar ;
   private int AV15Random ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV53TotCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal AV56TotPrd ;
   private java.math.BigDecimal AV59TotG ;
   private String AV32Emprcod ;
   private String AV61PrdNumfrom ;
   private String AV46PrdNum_to ;
   private String AV44Producto ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A794PrvNom ;
   private String A783PrvCta ;
   private String AV54PrvNom ;
   private String AV51Cuenta ;
   private String A728PrdRefPrv ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3840CcoDsc ;
   private String A3352CCStkPar ;
   private String A3346TipMovCn ;
   private String AV45PrdNum ;
   private String AV55prdnom ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV49CCStkFecfrom ;
   private java.util.Date AV50CCStkFecto ;
   private java.util.Date A3348CCStkFec ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private boolean n783PrvCta ;
   private boolean brk9V15 ;
   private boolean n3840CcoDsc ;
   private boolean n3346TipMovCn ;
   private String AV13Filename ;
   private String AV11ErrorMessage ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV62ProgressIndicator ;
   private String[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P09V12_AV63CantidadRegistrosAProcesar ;
   private String[] P09V13_A396EmprCod ;
   private int[] P09V13_A795PrvNum ;
   private String[] P09V13_A794PrvNom ;
   private boolean[] P09V13_n794PrvNom ;
   private String[] P09V13_A783PrvCta ;
   private boolean[] P09V13_n783PrvCta ;
   private String[] P09V14_A396EmprCod ;
   private String[] P09V14_A728PrdRefPrv ;
   private String[] P09V14_A718PrdNom ;
   private String[] P09V14_A719PrdNum ;
   private int[] P09V14_A795PrvNum ;
   private java.math.BigDecimal[] P09V14_A704PrdExiAlm ;
   private short[] P09V15_A3839CcoCod ;
   private String[] P09V15_A396EmprCod ;
   private String[] P09V15_A719PrdNum ;
   private String[] P09V15_A3345TipMovCc ;
   private java.math.BigDecimal[] P09V15_A3344CCStkCanS ;
   private java.math.BigDecimal[] P09V15_A3349CCStkPre ;
   private java.util.Date[] P09V15_A3348CCStkFec ;
   private int[] P09V15_A3353CCStkPed ;
   private String[] P09V15_A3840CcoDsc ;
   private boolean[] P09V15_n3840CcoDsc ;
   private String[] P09V15_A3352CCStkPar ;
   private byte[] P09V15_A3351CCStkReo ;
   private int[] P09V15_A3350CCStkBar ;
   private String[] P09V15_A3346TipMovCn ;
   private boolean[] P09V15_n3346TipMovCn ;
   private long[] P09V15_A3342CCStkLin ;
   private com.genexus.gxoffice.ExcelDoc AV12ExcelDocument ;
}

final  class informesalidasproductos_0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09V12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV60PrvNumfrom ,
                                          int AV48PrvNum_to ,
                                          int A795PrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[2];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPPRVGEN" ;
      if ( ! (0==AV60PrvNumfrom) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV48PrvNum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
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
                  return conditional_P09V12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V13", "SELECT EmprCod, PrvNum, PrvNom, PrvCta FROM TXPPRVGEN WHERE PrvNum >= ? and PrvNum <= ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V14", "SELECT EmprCod, PrdRefPrv, PrdNom, PrdNum, PrvNum, PrdExiAlm FROM TXPPRODUC WHERE (EmprCod = ? and PrvNum = ?) AND (PrdNum >= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V15", "SELECT T1.CcoCod, T1.EmprCod, T1.PrdNum, T1.TipMovCc, T1.CCStkCanS, T1.CCStkPre, T1.CCStkFec, T1.CCStkPed, T2.CcoDsc, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T3.TipMovCn, T1.CCStkLin FROM ((TXPCCSTKS T1 INNER JOIN TXPCENTCO T2 ON T2.CcoCod = T1.CcoCod) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) WHERE (T1.EmprCod = ? and T1.PrdNum >= ?) AND (T1.CCStkFec >= ? and T1.CCStkFec <= ?) AND (T1.CCStkCanS > 0) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(14);
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
                  stmt.setInt(sIdx, ((Number) parms[2]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

