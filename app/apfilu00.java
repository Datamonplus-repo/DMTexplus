package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apfilu00 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apfilu00 pgm = new apfilu00 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apfilu00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apfilu00.class ), "" );
   }

   public apfilu00( int remoteHandle ,
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("UTILIDAD OR GO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P03K83 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P03K83_A396EmprCod[0] ;
            A148BarEstReo = P03K83_A148BarEstReo[0] ;
            A130BarCodPar = P03K83_A130BarCodPar[0] ;
            A132BarCodReo = P03K83_A132BarCodReo[0] ;
            A129BarCod = P03K83_A129BarCod[0] ;
            A213BarSit = P03K83_A213BarSit[0] ;
            A166BarKgm = P03K83_A166BarKgm[0] ;
            n166BarKgm = P03K83_n166BarKgm[0] ;
            A166BarKgm = P03K83_A166BarKgm[0] ;
            n166BarKgm = P03K83_n166BarKgm[0] ;
            h3K80( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 0, Gx_line+0, 59, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 67, Gx_line+1, 75, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 82, Gx_line+1, 90, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 163, Gx_line+1, 230, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")), 248, Gx_line+0, 264, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Using cursor P03K84 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4442BarFasDTI = P03K84_A4442BarFasDTI[0] ;
               n4442BarFasDTI = P03K84_n4442BarFasDTI[0] ;
               A4443BarFasDTF = P03K84_A4443BarFasDTF[0] ;
               n4443BarFasDTF = P03K84_n4443BarFasDTF[0] ;
               A6173BarFasSec = P03K84_A6173BarFasSec[0] ;
               n6173BarFasSec = P03K84_n6173BarFasSec[0] ;
               A153BarFasEst = P03K84_A153BarFasEst[0] ;
               A457FasCod = P03K84_A457FasCod[0] ;
               A194BarOrdLin = P03K84_A194BarOrdLin[0] ;
               A758ProCod = P03K84_A758ProCod[0] ;
               h3K80( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 58, Gx_line+1, 88, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 99, Gx_line+1, 158, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")), 170, Gx_line+1, 178, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6173BarFasSec, "")), 190, Gx_line+1, 206, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"), 352, Gx_line+1, 477, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"), 217, Gx_line+1, 342, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3K80( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h3K80( boolean bFoot ,
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
      GXutil.refClasses(pfilu00.class);
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
      P03K83_A396EmprCod = new String[] {""} ;
      P03K83_A148BarEstReo = new byte[1] ;
      P03K83_A130BarCodPar = new String[] {""} ;
      P03K83_A132BarCodReo = new byte[1] ;
      P03K83_A129BarCod = new int[1] ;
      P03K83_A213BarSit = new byte[1] ;
      P03K83_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03K83_n166BarKgm = new boolean[] {false} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      P03K84_A396EmprCod = new String[] {""} ;
      P03K84_A129BarCod = new int[1] ;
      P03K84_A132BarCodReo = new byte[1] ;
      P03K84_A130BarCodPar = new String[] {""} ;
      P03K84_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P03K84_n4442BarFasDTI = new boolean[] {false} ;
      P03K84_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P03K84_n4443BarFasDTF = new boolean[] {false} ;
      P03K84_A6173BarFasSec = new String[] {""} ;
      P03K84_n6173BarFasSec = new boolean[] {false} ;
      P03K84_A153BarFasEst = new byte[1] ;
      P03K84_A457FasCod = new String[] {""} ;
      P03K84_A194BarOrdLin = new short[1] ;
      P03K84_A758ProCod = new String[] {""} ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A6173BarFasSec = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apfilu00__default(),
         new Object[] {
             new Object[] {
            P03K83_A396EmprCod, P03K83_A148BarEstReo, P03K83_A130BarCodPar, P03K83_A132BarCodReo, P03K83_A129BarCod, P03K83_A213BarSit, P03K83_A166BarKgm, P03K83_n166BarKgm
            }
            , new Object[] {
            P03K84_A396EmprCod, P03K84_A129BarCod, P03K84_A132BarCodReo, P03K84_A130BarCodPar, P03K84_A4442BarFasDTI, P03K84_n4442BarFasDTI, P03K84_A4443BarFasDTF, P03K84_n4443BarFasDTF, P03K84_A6173BarFasSec, P03K84_n6173BarFasSec,
            P03K84_A153BarFasEst, P03K84_A457FasCod, P03K84_A194BarOrdLin, P03K84_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A166BarKgm ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6173BarFasSec ;
   private String A457FasCod ;
   private String A758ProCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private boolean n166BarKgm ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n6173BarFasSec ;
   private IDataStoreProvider pr_default ;
   private String[] P03K83_A396EmprCod ;
   private byte[] P03K83_A148BarEstReo ;
   private String[] P03K83_A130BarCodPar ;
   private byte[] P03K83_A132BarCodReo ;
   private int[] P03K83_A129BarCod ;
   private byte[] P03K83_A213BarSit ;
   private java.math.BigDecimal[] P03K83_A166BarKgm ;
   private boolean[] P03K83_n166BarKgm ;
   private String[] P03K84_A396EmprCod ;
   private int[] P03K84_A129BarCod ;
   private byte[] P03K84_A132BarCodReo ;
   private String[] P03K84_A130BarCodPar ;
   private java.util.Date[] P03K84_A4442BarFasDTI ;
   private boolean[] P03K84_n4442BarFasDTI ;
   private java.util.Date[] P03K84_A4443BarFasDTF ;
   private boolean[] P03K84_n4443BarFasDTF ;
   private String[] P03K84_A6173BarFasSec ;
   private boolean[] P03K84_n6173BarFasSec ;
   private byte[] P03K84_A153BarFasEst ;
   private String[] P03K84_A457FasCod ;
   private short[] P03K84_A194BarOrdLin ;
   private String[] P03K84_A758ProCod ;
}

final  class apfilu00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03K83", "SELECT T1.EmprCod, T1.BarEstReo, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSit, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = '001' and T1.BarEstReo = 1) AND (COALESCE( T2.BarKgm, 0) > 0) AND (T1.BarSit <= 6) ORDER BY T1.EmprCod, T1.BarEstReo, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03K84", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasDTI, BarFasDTF, BarFasSec, BarFasEst, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
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

