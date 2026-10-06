package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class artestgrabisa extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      artestgrabisa pgm = new artestgrabisa (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public artestgrabisa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( artestgrabisa.class ), "" );
   }

   public artestgrabisa( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("TESTGRABISA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P073J3 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P073J3_A396EmprCod[0] ;
            A159BarFecGen = P073J3_A159BarFecGen[0] ;
            A211BarRdt = P073J3_A211BarRdt[0] ;
            A132BarCodReo = P073J3_A132BarCodReo[0] ;
            A130BarCodPar = P073J3_A130BarCodPar[0] ;
            A129BarCod = P073J3_A129BarCod[0] ;
            A138BarConReo = P073J3_A138BarConReo[0] ;
            A166BarKgm = P073J3_A166BarKgm[0] ;
            A184BarMtr = P073J3_A184BarMtr[0] ;
            A166BarKgm = P073J3_A166BarKgm[0] ;
            A184BarMtr = P073J3_A184BarMtr[0] ;
            AV8BarKgm = A166BarKgm ;
            AV9BarMtr = A184BarMtr ;
            AV10BarConReo = A138BarConReo ;
            AV11BarRdt = A211BarRdt ;
            if ( ( ( DecimalUtil.compareTo((AV8BarKgm.multiply(A211BarRdt)), AV9BarMtr) != 0 ) ) && ( A211BarRdt.doubleValue() != 0 ) )
            {
               /* Using cursor P073J4 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A44AlbRecCod = P073J4_A44AlbRecCod[0] ;
                  A205BarPieMet = P073J4_A205BarPieMet[0] ;
                  A203BarPieKil = P073J4_A203BarPieKil[0] ;
                  A48AlbRFecUlt = P073J4_A48AlbRFecUlt[0] ;
                  A200BarPieCod = P073J4_A200BarPieCod[0] ;
                  A48AlbRFecUlt = P073J4_A48AlbRFecUlt[0] ;
                  if ( ( A203BarPieKil.doubleValue() > 0 ) && ( A205BarPieMet.doubleValue() > 0 ) && ( AV10BarConReo > 0 ) )
                  {
                     if ( DecimalUtil.compareTo(A205BarPieMet, (A203BarPieKil.multiply(AV11BarRdt))) != 0 )
                     {
                        AV12marca = httpContext.getMessage( "I", "") ;
                     }
                     else
                     {
                        AV12marca = httpContext.getMessage( "C", "") ;
                     }
                     h73J0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 26, Gx_line+0, 85, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 117, Gx_line+0, 125, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 95, Gx_line+1, 103, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 156, Gx_line+0, 223, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A211BarRdt, "ZZ9.99")), 249, Gx_line+0, 294, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 314, Gx_line+0, 381, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10BarConReo), "9")), 451, Gx_line+1, 459, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12marca, "")), 511, Gx_line+1, 519, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A48AlbRFecUlt, "99/99/99"), 542, Gx_line+1, 601, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 616, Gx_line+0, 675, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  pr_default.readNext(1);
               }
               pr_default.close(1);
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h73J0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h73J0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(rtestgrabisa.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      if (Application.realMainProgram == this)	waitPrinterEnd();
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P073J3_A396EmprCod = new String[] {""} ;
      P073J3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P073J3_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P073J3_A132BarCodReo = new byte[1] ;
      P073J3_A130BarCodPar = new String[] {""} ;
      P073J3_A129BarCod = new int[1] ;
      P073J3_A138BarConReo = new byte[1] ;
      P073J3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P073J3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A211BarRdt = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV8BarKgm = DecimalUtil.ZERO ;
      AV9BarMtr = DecimalUtil.ZERO ;
      AV11BarRdt = DecimalUtil.ZERO ;
      P073J4_A44AlbRecCod = new int[1] ;
      P073J4_A396EmprCod = new String[] {""} ;
      P073J4_A129BarCod = new int[1] ;
      P073J4_A132BarCodReo = new byte[1] ;
      P073J4_A130BarCodPar = new String[] {""} ;
      P073J4_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P073J4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P073J4_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P073J4_A200BarPieCod = new String[] {""} ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      AV12marca = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.artestgrabisa__default(),
         new Object[] {
             new Object[] {
            P073J3_A396EmprCod, P073J3_A159BarFecGen, P073J3_A211BarRdt, P073J3_A132BarCodReo, P073J3_A130BarCodPar, P073J3_A129BarCod, P073J3_A138BarConReo, P073J3_A166BarKgm, P073J3_A184BarMtr
            }
            , new Object[] {
            P073J4_A44AlbRecCod, P073J4_A396EmprCod, P073J4_A129BarCod, P073J4_A132BarCodReo, P073J4_A130BarCodPar, P073J4_A205BarPieMet, P073J4_A203BarPieKil, P073J4_A48AlbRFecUlt, P073J4_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A138BarConReo ;
   private byte AV10BarConReo ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV8BarKgm ;
   private java.math.BigDecimal AV9BarMtr ;
   private java.math.BigDecimal AV11BarRdt ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV12marca ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A48AlbRFecUlt ;
   private IDataStoreProvider pr_default ;
   private String[] P073J3_A396EmprCod ;
   private java.util.Date[] P073J3_A159BarFecGen ;
   private java.math.BigDecimal[] P073J3_A211BarRdt ;
   private byte[] P073J3_A132BarCodReo ;
   private String[] P073J3_A130BarCodPar ;
   private int[] P073J3_A129BarCod ;
   private byte[] P073J3_A138BarConReo ;
   private java.math.BigDecimal[] P073J3_A166BarKgm ;
   private java.math.BigDecimal[] P073J3_A184BarMtr ;
   private int[] P073J4_A44AlbRecCod ;
   private String[] P073J4_A396EmprCod ;
   private int[] P073J4_A129BarCod ;
   private byte[] P073J4_A132BarCodReo ;
   private String[] P073J4_A130BarCodPar ;
   private java.math.BigDecimal[] P073J4_A205BarPieMet ;
   private java.math.BigDecimal[] P073J4_A203BarPieKil ;
   private java.util.Date[] P073J4_A48AlbRFecUlt ;
   private String[] P073J4_A200BarPieCod ;
}

final  class artestgrabisa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P073J3", "SELECT T1.EmprCod, T1.BarFecGen, T1.BarRdt, T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.BarConReo, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P073J4", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieMet, T1.BarPieKil, T2.AlbRFecUlt, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

