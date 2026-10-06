package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class diferenciarecuentocsv_impl extends GXWebProcedure
{
   public diferenciarecuentocsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV30ImpCod = httpContext.GetPar( "ImpCod") ;
            AV80UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV73Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV74Prdnum2 = httpContext.GetPar( "Prdnum2") ;
            AV8Archivo = httpContext.GetPar( "Archivo") ;
            AV11desvios = httpContext.GetPar( "desvios") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Entra", ""));
      AV25FlagDifN = (byte)(0) ;
      GXv_int1[0] = AV25FlagDifN ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIFNEG", ""), GXv_int1) ;
      diferenciarecuentocsv_impl.this.AV25FlagDifN = GXv_int1[0] ;
      AV26FlagPreMed = (byte)(0) ;
      GXv_int1[0] = AV26FlagPreMed ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
      diferenciarecuentocsv_impl.this.AV26FlagPreMed = GXv_int1[0] ;
      GXt_char2 = AV32Lit0 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2250_", ""), (byte)(99), GXv_char3) ;
      diferenciarecuentocsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV32Lit0 = GXt_char2 ;
      /* Using cursor P09IU2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = P09IU2_A810RecFec[0] ;
         A719PrdNum = P09IU2_A719PrdNum[0] ;
         if ( GXutil.resetTime(A810RecFec).before( GXutil.resetTime( AV80UFecha )) )
         {
            AV70Pfecha = A810RecFec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S121 ();
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
      AV31Linea = " " ;
      AV82ValAlmCol = DecimalUtil.ZERO ;
      AV83ValAlmTot = DecimalUtil.ZERO ;
      AV85ValCCCol = DecimalUtil.ZERO ;
      AV86ValCCTot = DecimalUtil.ZERO ;
      /* Using cursor P09IU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV80UFecha, AV73Prdnum1, AV74Prdnum2});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P09IU3_A719PrdNum[0] ;
         A810RecFec = P09IU3_A810RecFec[0] ;
         A807RecExiRea = P09IU3_A807RecExiRea[0] ;
         A809RecExiTeo = P09IU3_A809RecExiTeo[0] ;
         A724PrdPreAct = P09IU3_A724PrdPreAct[0] ;
         A726PrdPreMed = P09IU3_A726PrdPreMed[0] ;
         A3915EmpNumDec = P09IU3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P09IU3_n3915EmpNumDec[0] ;
         A6573RecPreRec = P09IU3_A6573RecPreRec[0] ;
         A718PrdNom = P09IU3_A718PrdNom[0] ;
         A3915EmpNumDec = P09IU3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P09IU3_n3915EmpNumDec[0] ;
         A724PrdPreAct = P09IU3_A724PrdPreAct[0] ;
         A726PrdPreMed = P09IU3_A726PrdPreMed[0] ;
         A718PrdNom = P09IU3_A718PrdNom[0] ;
         AV12DifAlm = A809RecExiTeo.subtract(A807RecExiRea) ;
         if ( ( AV12DifAlm.doubleValue() < 0 ) && (0==AV25FlagDifN) )
         {
            AV13DifAlm2 = AV12DifAlm.negate() ;
         }
         else
         {
            AV13DifAlm2 = AV12DifAlm ;
         }
         if ( A809RecExiTeo.doubleValue() != 0 )
         {
            AV14DifAlmPor = AV13DifAlm2.multiply(DecimalUtil.doubleToDec(100)).divide(A809RecExiTeo, 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV14DifAlmPor = DecimalUtil.doubleToDec(0) ;
         }
         AV75PreProd = A724PrdPreAct ;
         if ( AV26FlagPreMed == 1 )
         {
            AV75PreProd = A726PrdPreMed ;
         }
         if ( A3915EmpNumDec == 0 )
         {
            AV81ValAlm = GXutil.roundDecimal( AV13DifAlm2.multiply(AV75PreProd), 1) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV81ValAlm = GXutil.roundDecimal( AV13DifAlm2.multiply(AV75PreProd), 2) ;
            }
         }
         if ( ( A807RecExiRea.doubleValue() == 0 ) && ( A809RecExiTeo.doubleValue() == 0 ) )
         {
         }
         else
         {
            AV72PrdNum = A719PrdNum ;
            /* Execute user subroutine: 'ENTALM' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( ( AV12DifAlm.doubleValue() != 0 ) && ( GXutil.strcmp(AV11desvios, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(AV11desvios, httpContext.getMessage( "N", "")) == 0 ) ) )
            {
               AV81ValAlm = GXutil.roundDecimal( A807RecExiRea.multiply(A6573RecPreRec), 2) ;
               AV10DesvioMon = GXutil.roundDecimal( AV12DifAlm.multiply(A6573RecPreRec), 2) ;
               AV72PrdNum = A719PrdNum ;
               /* Execute user subroutine: 'ENTALM' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV71PorComp = DecimalUtil.doubleToDec(0) ;
               if ( AV19EntUnient.doubleValue() > 0 )
               {
                  AV71PorComp = GXutil.roundDecimal( (AV12DifAlm.divide(AV19EntUnient, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) ;
               }
               AV95Textfileline = "" ;
               AV95Textfileline = A719PrdNum + ";" + A718PrdNom + ";" + GXutil.str( A809RecExiTeo, 12, 4) + ";" + GXutil.str( A807RecExiRea, 12, 4) + ";" + GXutil.str( A6573RecPreRec, 14, 5) + ";" + GXutil.str( AV81ValAlm, 12, 2) + ";" + GXutil.str( AV12DifAlm, 12, 4) + ";" + GXutil.str( AV14DifAlmPor, 7, 2) + ";" + GXutil.str( AV10DesvioMon, 12, 2) + ";" ;
               AV95Textfileline += GXutil.str( AV19EntUnient, 9, 2) + ";" + GXutil.str( AV71PorComp, 6, 2) + ";" + localUtil.dtoc( AV21FecIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               if ( GXutil.len( AV95Textfileline) > 0 )
               {
                  AV88TextFile.writeLine(GXutil.substring( AV95Textfileline, 1, -1));
               }
               AV95Textfileline = "" ;
               AV95Textfileline += A719PrdNum ;
               AV95Textfileline += ";" ;
               AV95Textfileline += A718PrdNom ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( A809RecExiTeo, 12, 4) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( A807RecExiRea, 12, 4) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( A6573RecPreRec, 14, 5) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( AV81ValAlm, 12, 2) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( AV12DifAlm, 12, 4) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( AV14DifAlmPor, 7, 2) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( AV10DesvioMon, 12, 2) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( AV19EntUnient, 9, 2) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( AV71PorComp, 6, 2) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += GXutil.str( AV89EntUniRem, 11, 4) ;
               AV95Textfileline += ";" ;
               AV95Textfileline += localUtil.dtoc( AV21FecIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               if ( GXutil.len( AV95Textfileline) > 0 )
               {
                  AV88TextFile.writeLine(GXutil.substring( AV95Textfileline, 2, -1));
               }
            }
            AV82ValAlmCol = AV82ValAlmCol.add(AV81ValAlm) ;
            AV83ValAlmTot = AV83ValAlmTot.add(AV81ValAlm) ;
         }
         AV78TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin proceso", ""));
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ENTALM' Routine */
      returnInSub = false ;
      GXv_decimal4[0] = AV19EntUnient ;
      new app.pcalexi(remoteHandle, context).execute( A396EmprCod, AV72PrdNum, AV21FecIni, AV70Pfecha, AV80UFecha, GXv_decimal4) ;
      diferenciarecuentocsv_impl.this.AV19EntUnient = GXv_decimal4[0] ;
   }

   public void S121( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV96Filename = " " ;
      AV97Random = DecimalUtil.doubleToDec(GXutil.random( )*10000) ;
      AV96Filename = httpContext.getMessage( "C:\\Informes_Acatex\\Diferencias Recuento-", "") + GXutil.trim( GXutil.str( AV97Random, 10, 2)) + ".csv" ;
      AV88TextFile.setSource( AV96Filename );
      AV88TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S131 ();
      if (returnInSub) return;
      AV88TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S131 ();
      if (returnInSub) return;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV95Textfileline = "" ;
      AV95Textfileline = "" ;
      AV95Textfileline += httpContext.getMessage( "Producto", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Descripcion", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Exis Teorica", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Exis Real", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Precio", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Valor Almacen", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Porcentaje", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Desvio", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Cant Entradas", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Porcentaje", "") ;
      AV95Textfileline += ";" ;
      AV95Textfileline += httpContext.getMessage( "Fecha", "") ;
      if ( GXutil.len( AV95Textfileline) > 0 )
      {
         AV88TextFile.writeLine(GXutil.substring( AV95Textfileline, 1, -1));
      }
   }

   public void S131( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV88TextFile.getErrCode() != 0 )
      {
         AV96Filename = "" ;
         AV98Errormessage = AV88TextFile.getErrDescription() ;
         AV88TextFile.close();
         AV90HttpResponse.addString(AV98Errormessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV88TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S131 ();
      if (returnInSub) return;
      if ( AV88TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV90HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV90HttpResponse.addHeader("Content-Disposition", "attachment;filename=DiferenciasRecuento.csv");
         }
         AV90HttpResponse.addFile(AV88TextFile.getAbsoluteName());
      }
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV30ImpCod = "" ;
      AV80UFecha = GXutil.nullDate() ;
      AV73Prdnum1 = "" ;
      AV74Prdnum2 = "" ;
      AV8Archivo = "" ;
      AV11desvios = "" ;
      GXv_int1 = new byte[1] ;
      AV32Lit0 = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P09IU2_A396EmprCod = new String[] {""} ;
      P09IU2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IU2_A719PrdNum = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV70Pfecha = GXutil.nullDate() ;
      AV31Linea = "" ;
      AV82ValAlmCol = DecimalUtil.ZERO ;
      AV83ValAlmTot = DecimalUtil.ZERO ;
      AV85ValCCCol = DecimalUtil.ZERO ;
      AV86ValCCTot = DecimalUtil.ZERO ;
      P09IU3_A396EmprCod = new String[] {""} ;
      P09IU3_A719PrdNum = new String[] {""} ;
      P09IU3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IU3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IU3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IU3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IU3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IU3_A3915EmpNumDec = new byte[1] ;
      P09IU3_n3915EmpNumDec = new boolean[] {false} ;
      P09IU3_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IU3_A718PrdNom = new String[] {""} ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV12DifAlm = DecimalUtil.ZERO ;
      AV13DifAlm2 = DecimalUtil.ZERO ;
      AV14DifAlmPor = DecimalUtil.ZERO ;
      AV75PreProd = DecimalUtil.ZERO ;
      AV81ValAlm = DecimalUtil.ZERO ;
      AV72PrdNum = "" ;
      AV10DesvioMon = DecimalUtil.ZERO ;
      AV71PorComp = DecimalUtil.ZERO ;
      AV19EntUnient = DecimalUtil.ZERO ;
      AV95Textfileline = "" ;
      AV21FecIni = GXutil.nullDate() ;
      AV88TextFile = new com.genexus.util.GXFile();
      AV89EntUniRem = DecimalUtil.ZERO ;
      AV78TipCol = "" ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV96Filename = "" ;
      AV97Random = DecimalUtil.ZERO ;
      AV98Errormessage = "" ;
      AV90HttpResponse = httpContext.getHttpResponse();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.diferenciarecuentocsv__default(),
         new Object[] {
             new Object[] {
            P09IU2_A396EmprCod, P09IU2_A810RecFec, P09IU2_A719PrdNum
            }
            , new Object[] {
            P09IU3_A396EmprCod, P09IU3_A719PrdNum, P09IU3_A810RecFec, P09IU3_A807RecExiRea, P09IU3_A809RecExiTeo, P09IU3_A724PrdPreAct, P09IU3_A726PrdPreMed, P09IU3_A3915EmpNumDec, P09IU3_n3915EmpNumDec, P09IU3_A6573RecPreRec,
            P09IU3_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25FlagDifN ;
   private byte AV26FlagPreMed ;
   private byte GXv_int1[] ;
   private byte A3915EmpNumDec ;
   private short gxcookieaux ;
   private short Gx_err ;
   private java.math.BigDecimal AV82ValAlmCol ;
   private java.math.BigDecimal AV83ValAlmTot ;
   private java.math.BigDecimal AV85ValCCCol ;
   private java.math.BigDecimal AV86ValCCTot ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV12DifAlm ;
   private java.math.BigDecimal AV13DifAlm2 ;
   private java.math.BigDecimal AV14DifAlmPor ;
   private java.math.BigDecimal AV75PreProd ;
   private java.math.BigDecimal AV81ValAlm ;
   private java.math.BigDecimal AV10DesvioMon ;
   private java.math.BigDecimal AV71PorComp ;
   private java.math.BigDecimal AV19EntUnient ;
   private java.math.BigDecimal AV89EntUniRem ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV97Random ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV30ImpCod ;
   private String AV73Prdnum1 ;
   private String AV74Prdnum2 ;
   private String AV8Archivo ;
   private String AV11desvios ;
   private String AV32Lit0 ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String AV31Linea ;
   private String A718PrdNom ;
   private String AV72PrdNum ;
   private String AV95Textfileline ;
   private String AV78TipCol ;
   private String AV96Filename ;
   private String AV98Errormessage ;
   private java.util.Date AV80UFecha ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV70Pfecha ;
   private java.util.Date AV21FecIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private IDataStoreProvider pr_default ;
   private String[] P09IU2_A396EmprCod ;
   private java.util.Date[] P09IU2_A810RecFec ;
   private String[] P09IU2_A719PrdNum ;
   private String[] P09IU3_A396EmprCod ;
   private String[] P09IU3_A719PrdNum ;
   private java.util.Date[] P09IU3_A810RecFec ;
   private java.math.BigDecimal[] P09IU3_A807RecExiRea ;
   private java.math.BigDecimal[] P09IU3_A809RecExiTeo ;
   private java.math.BigDecimal[] P09IU3_A724PrdPreAct ;
   private java.math.BigDecimal[] P09IU3_A726PrdPreMed ;
   private byte[] P09IU3_A3915EmpNumDec ;
   private boolean[] P09IU3_n3915EmpNumDec ;
   private java.math.BigDecimal[] P09IU3_A6573RecPreRec ;
   private String[] P09IU3_A718PrdNom ;
   private com.genexus.internet.HttpResponse AV90HttpResponse ;
   private com.genexus.util.GXFile AV88TextFile ;
}

final  class diferenciarecuentocsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IU2", "SELECT EmprCod, RecFec, PrdNum FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IU3", "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T1.RecExiRea, T1.RecExiTeo, T3.PrdPreAct, T3.PrdPreMed, T2.EmpNumDec, T1.RecPreRec, T3.PrdNom FROM ((TXPRECUEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.RecFec = ? and T1.PrdNum >= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

