package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcamcon extends GXProcedure
{
   public pcamcon( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcamcon.class ), "" );
   }

   public pcamcon( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.math.BigDecimal aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.math.BigDecimal aP3 )
   {
      pcamcon.this.A396EmprCod = aP0;
      pcamcon.this.AV49PrdNum = aP1;
      pcamcon.this.AV33PrdNom = aP2;
      pcamcon.this.AV18Factor = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV37station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcamcon.this.GXt_char1 = GXv_char2[0] ;
      AV37station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV39Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV37station, GXv_char2, GXv_char3, GXv_char4) ;
      pcamcon.this.A396EmprCod = GXv_char2[0] ;
      pcamcon.this.AV17EmprNom = GXv_char3[0] ;
      pcamcon.this.AV39Usurcod = GXv_char4[0] ;
      AV23Hhmmss = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV26NomInf = httpContext.getMessage( "CambiodeConcentracion_", "") + GXutil.trim( A719PrdNum) + GXutil.trim( AV33PrdNom) + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV23Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV23Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV23Hhmmss, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV23Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 1, 2)), (short)(2), "0") ;
      AV26NomInf += GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV23Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.ttoc( AV23Hhmmss, 10, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), 7, 4)), (short)(4), "0") ;
      AV46Random = (int)(GXutil.random( )*10000) ;
      AV42Filename = GXutil.trim( AV26NomInf) + "-" + GXutil.trim( GXutil.str( AV46Random, 8, 0)) + ".csv" ;
      AV47File2 = GXutil.trim( AV42Filename) ;
      AV48WebSession.remove(httpContext.getMessage( "!WebWcamcon", ""));
      AV48WebSession.setValue(httpContext.getMessage( "!WebWcamcon", ""), AV47File2);
      AV50TextFile.setSource( AV42Filename );
      AV50TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV50TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV45TextFileLine = httpContext.getMessage( "Cambio Concentracion Producto. ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( AV33PrdNom) + httpContext.getMessage( " Factor = ", "") + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) ;
      if ( GXutil.len( AV45TextFileLine) > 0 )
      {
         AV50TextFile.writeLine(AV45TextFileLine);
      }
      AV45TextFileLine = httpContext.getMessage( "Tabla", "") + ";" + httpContext.getMessage( "N Formula/Proceso", "") + ";" + httpContext.getMessage( "Producto", "") + ";" + httpContext.getMessage( "Factor", "") + ";" + httpContext.getMessage( "Cantidad Inicial", "") + ";" + httpContext.getMessage( "Cantidad Final", "") + ";" + httpContext.getMessage( "Registro", "") ;
      if ( GXutil.len( AV45TextFileLine) > 0 )
      {
         AV50TextFile.writeLine(AV45TextFileLine);
      }
      AV27Nregtos1 = 0 ;
      /* Optimized group. */
      /* Using cursor P002A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV49PrdNum});
      cV27Nregtos1 = P002A2_AV27Nregtos1[0] ;
      pr_default.close(0);
      AV27Nregtos1 = (int)(AV27Nregtos1+cV27Nregtos1*1) ;
      /* End optimized group. */
      AV30NrgtosLdform = 1 ;
      /* Using cursor P002A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV49PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P002A3_A719PrdNum[0] ;
         A309ColLin = P002A3_A309ColLin[0] ;
         A481ForCan = P002A3_A481ForCan[0] ;
         A718PrdNom = P002A3_A718PrdNom[0] ;
         A486ForNumCol = P002A3_A486ForNumCol[0] ;
         A718PrdNom = P002A3_A718PrdNom[0] ;
         AV20ForCan = A481ForCan ;
         A481ForCan = A481ForCan.multiply(AV18Factor) ;
         AV45TextFileLine = httpContext.getMessage( "LDFORM", "") + ";" + GXutil.str( A486ForNumCol, 8, 0) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.str( AV18Factor, 11, 5) + ";" + GXutil.trim( GXutil.str( AV20ForCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( A481ForCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV30NrgtosLdform, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV27Nregtos1, 6, 0)) ;
         if ( GXutil.len( AV45TextFileLine) > 0 )
         {
            AV50TextFile.writeLine(AV45TextFileLine);
         }
         AV30NrgtosLdform = (int)(AV30NrgtosLdform+1) ;
         /* Using cursor P002A4 */
         pr_default.execute(2, new Object[] {A481ForCan, A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV28Nregtos2 = 0 ;
      /* Optimized group. */
      /* Using cursor P002A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV49PrdNum});
      cV28Nregtos2 = P002A5_AV28Nregtos2[0] ;
      pr_default.close(3);
      AV28Nregtos2 = (int)(AV28Nregtos2+cV28Nregtos2*1) ;
      /* End optimized group. */
      AV31Nrgtoslprfor = 1 ;
      /* Using cursor P002A6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV49PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A719PrdNum = P002A6_A719PrdNum[0] ;
         A715PrdLin = P002A6_A715PrdLin[0] ;
         A487ForPrdCan = P002A6_A487ForPrdCan[0] ;
         A718PrdNom = P002A6_A718PrdNom[0] ;
         A486ForNumCol = P002A6_A486ForNumCol[0] ;
         A718PrdNom = P002A6_A718PrdNom[0] ;
         AV22ForPrdCan = A487ForPrdCan ;
         A487ForPrdCan = A487ForPrdCan.multiply(AV18Factor) ;
         AV45TextFileLine = httpContext.getMessage( "LPRFOR", "") + ";" + GXutil.str( A486ForNumCol, 8, 0) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV22ForPrdCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( A487ForPrdCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV31Nrgtoslprfor, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV28Nregtos2, 6, 0)) ;
         if ( GXutil.len( AV45TextFileLine) > 0 )
         {
            AV50TextFile.writeLine(AV45TextFileLine);
         }
         AV31Nrgtoslprfor = (int)(AV31Nrgtoslprfor+1) ;
         /* Using cursor P002A7 */
         pr_default.execute(5, new Object[] {A487ForPrdCan, A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV29Nregtos3 = 0 ;
      /* Optimized group. */
      /* Using cursor P002A8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV49PrdNum});
      cV29Nregtos3 = P002A8_AV29Nregtos3[0] ;
      pr_default.close(6);
      AV29Nregtos3 = (int)(AV29Nregtos3+cV29Nregtos3*1) ;
      /* End optimized group. */
      AV32NrgtosLprofo = 1 ;
      /* Using cursor P002A9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV49PrdNum});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A770ProForPrd = P002A9_A770ProForPrd[0] ;
         A767ProForLin = P002A9_A767ProForLin[0] ;
         A762ProForCan = P002A9_A762ProForCan[0] ;
         A765ProForDes = P002A9_A765ProForDes[0] ;
         A764ProForCod = P002A9_A764ProForCod[0] ;
         AV35ProForCan = A762ProForCan ;
         A762ProForCan = A762ProForCan.multiply(AV18Factor) ;
         AV45TextFileLine = httpContext.getMessage( "LPROFO", "") + ";" + GXutil.trim( A764ProForCod) + ";" + GXutil.trim( A770ProForPrd) + "-" + GXutil.trim( A765ProForDes) + ";" + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV35ProForCan, 12, 5)) + ";" + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + ";" + GXutil.trim( GXutil.str( AV32NrgtosLprofo, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV29Nregtos3, 6, 0)) ;
         if ( GXutil.len( AV45TextFileLine) > 0 )
         {
            AV50TextFile.writeLine(AV45TextFileLine);
         }
         AV32NrgtosLprofo = (int)(AV32NrgtosLprofo+1) ;
         /* Using cursor P002A10 */
         pr_default.execute(8, new Object[] {A762ProForCan, A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         pr_default.readNext(7);
      }
      pr_default.close(7);
      Gx_msg = httpContext.getMessage( "Proceso Finalizado", "") + GXutil.newLine( ) ;
      if ( AV27Nregtos1 > 0 )
      {
         AV30NrgtosLdform = (int)(AV30NrgtosLdform-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LDFORM. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV30NrgtosLdform, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV27Nregtos1, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV28Nregtos2 > 0 )
      {
         AV31Nrgtoslprfor = (int)(AV31Nrgtoslprfor-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LPRFOR. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV31Nrgtoslprfor, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV28Nregtos2, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV29Nregtos3 > 0 )
      {
         AV32NrgtosLprofo = (int)(AV32NrgtosLprofo-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LPROFO. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV32NrgtosLprofo, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV29Nregtos3, 6, 0)) + GXutil.newLine( ) ;
      }
      httpContext.GX_msglist.addItem(Gx_msg);
      AV50TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV50TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV43HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV43HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSituacionProcesoQuimicoExportCSV.csv");
         }
         AV43HttpResponse.addFile(AV50TextFile.getAbsoluteName());
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV50TextFile.getErrCode() != 0 )
      {
         AV42Filename = "" ;
         AV41ErrorMessage = AV50TextFile.getErrDescription() ;
         AV50TextFile.close();
         AV43HttpResponse.addString(AV41ErrorMessage);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pcamcon");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV39Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV23Hhmmss = GXutil.resetTime( GXutil.nullDate() );
      AV26NomInf = "" ;
      A719PrdNum = "" ;
      AV42Filename = "" ;
      AV47File2 = "" ;
      AV48WebSession = httpContext.getWebSession();
      AV50TextFile = new com.genexus.util.GXFile();
      AV45TextFileLine = "" ;
      scmdbuf = "" ;
      P002A2_AV27Nregtos1 = new int[1] ;
      P002A3_A396EmprCod = new String[] {""} ;
      P002A3_A719PrdNum = new String[] {""} ;
      P002A3_A309ColLin = new short[1] ;
      P002A3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002A3_A718PrdNom = new String[] {""} ;
      P002A3_A486ForNumCol = new int[1] ;
      A481ForCan = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV20ForCan = DecimalUtil.ZERO ;
      P002A5_AV28Nregtos2 = new int[1] ;
      P002A6_A396EmprCod = new String[] {""} ;
      P002A6_A719PrdNum = new String[] {""} ;
      P002A6_A715PrdLin = new short[1] ;
      P002A6_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002A6_A718PrdNom = new String[] {""} ;
      P002A6_A486ForNumCol = new int[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV22ForPrdCan = DecimalUtil.ZERO ;
      P002A8_AV29Nregtos3 = new int[1] ;
      P002A9_A396EmprCod = new String[] {""} ;
      P002A9_A770ProForPrd = new String[] {""} ;
      P002A9_A767ProForLin = new short[1] ;
      P002A9_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002A9_A765ProForDes = new String[] {""} ;
      P002A9_A764ProForCod = new String[] {""} ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A765ProForDes = "" ;
      A764ProForCod = "" ;
      AV35ProForCan = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV43HttpResponse = httpContext.getHttpResponse();
      AV41ErrorMessage = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcamcon__default(),
         new Object[] {
             new Object[] {
            P002A2_AV27Nregtos1
            }
            , new Object[] {
            P002A3_A396EmprCod, P002A3_A719PrdNum, P002A3_A309ColLin, P002A3_A481ForCan, P002A3_A718PrdNom, P002A3_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            P002A5_AV28Nregtos2
            }
            , new Object[] {
            P002A6_A396EmprCod, P002A6_A719PrdNum, P002A6_A715PrdLin, P002A6_A487ForPrdCan, P002A6_A718PrdNom, P002A6_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            P002A8_AV29Nregtos3
            }
            , new Object[] {
            P002A9_A396EmprCod, P002A9_A770ProForPrd, P002A9_A767ProForLin, P002A9_A762ProForCan, P002A9_A765ProForDes, P002A9_A764ProForCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A309ColLin ;
   private short A715PrdLin ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int AV46Random ;
   private int AV27Nregtos1 ;
   private int cV27Nregtos1 ;
   private int AV30NrgtosLdform ;
   private int A486ForNumCol ;
   private int AV28Nregtos2 ;
   private int cV28Nregtos2 ;
   private int AV31Nrgtoslprfor ;
   private int AV29Nregtos3 ;
   private int cV29Nregtos3 ;
   private int AV32NrgtosLprofo ;
   private java.math.BigDecimal AV18Factor ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV20ForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV22ForPrdCan ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV35ProForCan ;
   private String A396EmprCod ;
   private String AV49PrdNum ;
   private String AV33PrdNom ;
   private String AV37station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17EmprNom ;
   private String GXv_char3[] ;
   private String AV39Usurcod ;
   private String GXv_char4[] ;
   private String AV26NomInf ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A764ProForCod ;
   private String Gx_msg ;
   private java.util.Date AV23Hhmmss ;
   private boolean returnInSub ;
   private String AV45TextFileLine ;
   private String AV42Filename ;
   private String AV47File2 ;
   private String AV41ErrorMessage ;
   private com.genexus.util.GXFile AV50TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P002A2_AV27Nregtos1 ;
   private String[] P002A3_A396EmprCod ;
   private String[] P002A3_A719PrdNum ;
   private short[] P002A3_A309ColLin ;
   private java.math.BigDecimal[] P002A3_A481ForCan ;
   private String[] P002A3_A718PrdNom ;
   private int[] P002A3_A486ForNumCol ;
   private int[] P002A5_AV28Nregtos2 ;
   private String[] P002A6_A396EmprCod ;
   private String[] P002A6_A719PrdNum ;
   private short[] P002A6_A715PrdLin ;
   private java.math.BigDecimal[] P002A6_A487ForPrdCan ;
   private String[] P002A6_A718PrdNom ;
   private int[] P002A6_A486ForNumCol ;
   private int[] P002A8_AV29Nregtos3 ;
   private String[] P002A9_A396EmprCod ;
   private String[] P002A9_A770ProForPrd ;
   private short[] P002A9_A767ProForLin ;
   private java.math.BigDecimal[] P002A9_A762ProForCan ;
   private String[] P002A9_A765ProForDes ;
   private String[] P002A9_A764ProForCod ;
   private com.genexus.internet.HttpResponse AV43HttpResponse ;
   private com.genexus.webpanels.WebSession AV48WebSession ;
}

final  class pcamcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002A2", "SELECT COUNT(*) FROM TXPLDFORM WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002A3", "SELECT T1.EmprCod, T1.PrdNum, T1.ColLin, T1.ForCan, T2.PrdNom, T1.ForNumCol FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002A4", "UPDATE TXPLDFORM SET ForCan=?  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P002A5", "SELECT COUNT(*) FROM TXPLPRFOR WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002A6", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdLin, T1.ForPrdCan, T2.PrdNom, T1.ForNumCol FROM (TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002A7", "UPDATE TXPLPRFOR SET ForPrdCan=?  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new ForEachCursor("P002A8", "SELECT COUNT(*) FROM TXPLPROFO WHERE EmprCod = ? and ProForPrd = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002A9", "SELECT EmprCod, ProForPrd, ProForLin, ProForCan, ProForDes, ProForCod FROM TXPLPROFO WHERE EmprCod = ? and ProForPrd = ? ORDER BY EmprCod, ProForPrd ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002A10", "UPDATE TXPLPROFO SET ProForCan=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

