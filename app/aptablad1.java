package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablad1 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablad1 pgm = new aptablad1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablad1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablad1.class ), "" );
   }

   public aptablad1( int remoteHandle ,
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
         getPrinter().GxSetDocName("OPTIMIZACION ARTICU,DELETE") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h38K0( false, 46) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 669, Gx_line+21, 714, Gx_line+38, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 655, Gx_line+2, 714, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 592, Gx_line+2, 651, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Optimizacion Tablas", ""), 38, Gx_line+2, 158, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(18, Gx_line+39, 749, Gx_line+39, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV29Inicio_p, "99/99/99 99:99"), 166, Gx_line+1, 269, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+46) ;
         AV22Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV24Emprcod ;
         GXv_char2[0] = AV23EmprNom ;
         GXv_char3[0] = AV25usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char1, GXv_char2, GXv_char3) ;
         aptablad1.this.AV24Emprcod = GXv_char1[0] ;
         aptablad1.this.AV23EmprNom = GXv_char2[0] ;
         aptablad1.this.AV25usurcod = GXv_char3[0] ;
         /* Using cursor P038K2 */
         pr_default.execute(0, new Object[] {AV24Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P038K2_A65ArtCod[0] ;
            A252CliCod = P038K2_A252CliCod[0] ;
            n252CliCod = P038K2_n252CliCod[0] ;
            A396EmprCod = P038K2_A396EmprCod[0] ;
            AV27Clicod = A252CliCod ;
            AV28Artcod = A65ArtCod ;
            /* Execute user subroutine: 'BARCAD' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV21Barpro == 0 )
            {
               /* Optimized DELETE. */
               /* Using cursor P038K3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
               /* End optimized DELETE. */
               Gx_msg = httpContext.getMessage( "Delete ", "") + GXutil.str( A252CliCod, 6, 0) + " " + A65ArtCod ;
               System.out.println( Gx_msg );
               /* Using cursor P038K4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h38K0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV30Fin_p, "99/99/99 99:99"), 13, Gx_line+1, 116, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h38K0( true, 0) ;
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
      AV21Barpro = (byte)(0) ;
      /* Using cursor P038K5 */
      pr_default.execute(3, new Object[] {AV24Emprcod, Integer.valueOf(AV27Clicod), AV28Artcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A212BarSer = P038K5_A212BarSer[0] ;
         A252CliCod = P038K5_A252CliCod[0] ;
         n252CliCod = P038K5_n252CliCod[0] ;
         A396EmprCod = P038K5_A396EmprCod[0] ;
         A129BarCod = P038K5_A129BarCod[0] ;
         A132BarCodReo = P038K5_A132BarCodReo[0] ;
         A130BarCodPar = P038K5_A130BarCodPar[0] ;
         AV21Barpro = (byte)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h38K0( boolean bFoot ,
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
      GXutil.refClasses(ptablad1.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablad1");
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
      AV29Inicio_p = GXutil.resetTime( GXutil.nullDate() );
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV22Station = "" ;
      AV24Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV25usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P038K2_A65ArtCod = new String[] {""} ;
      P038K2_A252CliCod = new int[1] ;
      P038K2_n252CliCod = new boolean[] {false} ;
      P038K2_A396EmprCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      AV28Artcod = "" ;
      Gx_msg = "" ;
      AV30Fin_p = GXutil.resetTime( GXutil.nullDate() );
      P038K5_A212BarSer = new String[] {""} ;
      P038K5_A252CliCod = new int[1] ;
      P038K5_n252CliCod = new boolean[] {false} ;
      P038K5_A396EmprCod = new String[] {""} ;
      P038K5_A129BarCod = new int[1] ;
      P038K5_A132BarCodReo = new byte[1] ;
      P038K5_A130BarCodPar = new String[] {""} ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablad1__default(),
         new Object[] {
             new Object[] {
            P038K2_A65ArtCod, P038K2_A252CliCod, P038K2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P038K5_A212BarSer, P038K5_A252CliCod, P038K5_n252CliCod, P038K5_A396EmprCod, P038K5_A129BarCod, P038K5_A132BarCodReo, P038K5_A130BarCodPar
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

   private byte AV21Barpro ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private int AV27Clicod ;
   private int A129BarCod ;
   private String Gx_time ;
   private String AV22Station ;
   private String AV24Emprcod ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String GXv_char2[] ;
   private String AV25usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String AV28Artcod ;
   private String Gx_msg ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private java.util.Date AV29Inicio_p ;
   private java.util.Date AV30Fin_p ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P038K2_A65ArtCod ;
   private int[] P038K2_A252CliCod ;
   private boolean[] P038K2_n252CliCod ;
   private String[] P038K2_A396EmprCod ;
   private String[] P038K5_A212BarSer ;
   private int[] P038K5_A252CliCod ;
   private boolean[] P038K5_n252CliCod ;
   private String[] P038K5_A396EmprCod ;
   private int[] P038K5_A129BarCod ;
   private byte[] P038K5_A132BarCodReo ;
   private String[] P038K5_A130BarCodPar ;
}

final  class aptablad1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038K2", "SELECT ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod > 0 ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P038K3", "DELETE FROM TXPModels  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModels")
         ,new UpdateCursor("P038K4", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new ForEachCursor("P038K5", "SELECT BarSer, CliCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and CliCod = ? and BarSer = ? ORDER BY EmprCod, CliCod, BarSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

