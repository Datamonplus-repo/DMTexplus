package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablao1 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablao1 pgm = new aptablao1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablao1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablao1.class ), "" );
   }

   public aptablao1( int remoteHandle ,
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
         getPrinter().GxSetDocName("OPTIMIZACION ARTICU") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV10Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV12Emprcod ;
         GXv_char2[0] = AV11EmprNom ;
         GXv_char3[0] = AV13usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char1, GXv_char2, GXv_char3) ;
         aptablao1.this.AV12Emprcod = GXv_char1[0] ;
         aptablao1.this.AV11EmprNom = GXv_char2[0] ;
         aptablao1.this.AV13usurcod = GXv_char3[0] ;
         /* Using cursor P038J2 */
         pr_default.execute(0, new Object[] {AV12Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P038J2_A252CliCod[0] ;
            n252CliCod = P038J2_n252CliCod[0] ;
            A396EmprCod = P038J2_A396EmprCod[0] ;
            A69ArtDsc = P038J2_A69ArtDsc[0] ;
            n69ArtDsc = P038J2_n69ArtDsc[0] ;
            A279CliNom = P038J2_A279CliNom[0] ;
            A65ArtCod = P038J2_A65ArtCod[0] ;
            A279CliNom = P038J2_A279CliNom[0] ;
            AV15Clicod = A252CliCod ;
            AV16Artcod = A65ArtCod ;
            /* Execute user subroutine: 'BARCAD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV9Barpro == 0 )
            {
               h38J0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 32, Gx_line+0, 77, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 82, Gx_line+1, 302, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 309, Gx_line+1, 427, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 433, Gx_line+1, 624, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "No BARCAD", ""), 673, Gx_line+2, 747, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h38J0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV9Barpro = (byte)(0) ;
      /* Using cursor P038J3 */
      pr_default.execute(1, new Object[] {AV12Emprcod, Integer.valueOf(AV15Clicod), AV16Artcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A212BarSer = P038J3_A212BarSer[0] ;
         A252CliCod = P038J3_A252CliCod[0] ;
         n252CliCod = P038J3_n252CliCod[0] ;
         A396EmprCod = P038J3_A396EmprCod[0] ;
         A129BarCod = P038J3_A129BarCod[0] ;
         A132BarCodReo = P038J3_A132BarCodReo[0] ;
         A130BarCodPar = P038J3_A130BarCodPar[0] ;
         AV9Barpro = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void h38J0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 669, Gx_line+21, 714, Gx_line+38, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 655, Gx_line+2, 714, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 592, Gx_line+2, 651, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Optimizacion Tablas", ""), 38, Gx_line+2, 158, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(18, Gx_line+39, 749, Gx_line+39, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+46) ;
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
      GXutil.refClasses(ptablao1.class);
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
      AV10Station = "" ;
      AV12Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV13usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P038J2_A252CliCod = new int[1] ;
      P038J2_n252CliCod = new boolean[] {false} ;
      P038J2_A396EmprCod = new String[] {""} ;
      P038J2_A69ArtDsc = new String[] {""} ;
      P038J2_n69ArtDsc = new boolean[] {false} ;
      P038J2_A279CliNom = new String[] {""} ;
      P038J2_A65ArtCod = new String[] {""} ;
      A396EmprCod = "" ;
      A69ArtDsc = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      AV16Artcod = "" ;
      P038J3_A212BarSer = new String[] {""} ;
      P038J3_A252CliCod = new int[1] ;
      P038J3_n252CliCod = new boolean[] {false} ;
      P038J3_A396EmprCod = new String[] {""} ;
      P038J3_A129BarCod = new int[1] ;
      P038J3_A132BarCodReo = new byte[1] ;
      P038J3_A130BarCodPar = new String[] {""} ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablao1__default(),
         new Object[] {
             new Object[] {
            P038J2_A252CliCod, P038J2_A396EmprCod, P038J2_A69ArtDsc, P038J2_n69ArtDsc, P038J2_A279CliNom, P038J2_A65ArtCod
            }
            , new Object[] {
            P038J3_A212BarSer, P038J3_A252CliCod, P038J3_n252CliCod, P038J3_A396EmprCod, P038J3_A129BarCod, P038J3_A132BarCodReo, P038J3_A130BarCodPar
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV9Barpro ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV15Clicod ;
   private int Gx_OldLine ;
   private int A129BarCod ;
   private String AV10Station ;
   private String AV12Emprcod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV13usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A69ArtDsc ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String AV16Artcod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private int[] P038J2_A252CliCod ;
   private boolean[] P038J2_n252CliCod ;
   private String[] P038J2_A396EmprCod ;
   private String[] P038J2_A69ArtDsc ;
   private boolean[] P038J2_n69ArtDsc ;
   private String[] P038J2_A279CliNom ;
   private String[] P038J2_A65ArtCod ;
   private String[] P038J3_A212BarSer ;
   private int[] P038J3_A252CliCod ;
   private boolean[] P038J3_n252CliCod ;
   private String[] P038J3_A396EmprCod ;
   private int[] P038J3_A129BarCod ;
   private byte[] P038J3_A132BarCodReo ;
   private String[] P038J3_A130BarCodPar ;
}

final  class aptablao1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038J2", "SELECT T1.CliCod, T1.EmprCod, T1.ArtDsc, T2.CliNom, T1.ArtCod FROM (TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod > 0 ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P038J3", "SELECT BarSer, CliCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and CliCod = ? and BarSer = ? ORDER BY EmprCod, CliCod, BarSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

