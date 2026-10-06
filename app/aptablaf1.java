package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablaf1 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablaf1 pgm = new aptablaf1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablaf1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablaf1.class ), "" );
   }

   public aptablaf1( int remoteHandle ,
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
         getPrinter().GxSetDocName("OPTIMIZACION FASPRO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h3XX0( false, 46) ;
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
         aptablaf1.this.AV24Emprcod = GXv_char1[0] ;
         aptablaf1.this.AV23EmprNom = GXv_char2[0] ;
         aptablaf1.this.AV25usurcod = GXv_char3[0] ;
         /* Using cursor P03XX2 */
         pr_default.execute(0, new Object[] {AV24Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A457FasCod = P03XX2_A457FasCod[0] ;
            A396EmprCod = P03XX2_A396EmprCod[0] ;
            A460FasDsc = P03XX2_A460FasDsc[0] ;
            if ( ( GXutil.strcmp(A457FasCod, GXutil.space( (short)(8))) >= 0 ) && ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "zzzzzzzz", "")) <= 0 ) )
            {
               AV31Fascod = A457FasCod ;
               /* Execute user subroutine: 'PROCES' */
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
                  /* Using cursor P03XX3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
                  Gx_msg = httpContext.getMessage( "Delete ", "") + A457FasCod + " " + A460FasDsc ;
                  System.out.println( Gx_msg );
                  /* Using cursor P03XX4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h3XX0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV30Fin_p, "99/99/99 99:99"), 13, Gx_line+1, 116, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3XX0( true, 0) ;
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
      /* 'PROCES' Routine */
      returnInSub = false ;
      AV21Barpro = (byte)(0) ;
      /* Using cursor P03XX5 */
      pr_default.execute(3, new Object[] {AV24Emprcod, AV31Fascod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A457FasCod = P03XX5_A457FasCod[0] ;
         A396EmprCod = P03XX5_A396EmprCod[0] ;
         A774ProNumLin = P03XX5_A774ProNumLin[0] ;
         A758ProCod = P03XX5_A758ProCod[0] ;
         AV21Barpro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h3XX0( boolean bFoot ,
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
      GXutil.refClasses(ptablaf1.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablaf1");
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
      P03XX2_A457FasCod = new String[] {""} ;
      P03XX2_A396EmprCod = new String[] {""} ;
      P03XX2_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      AV31Fascod = "" ;
      Gx_msg = "" ;
      AV30Fin_p = GXutil.resetTime( GXutil.nullDate() );
      P03XX5_A457FasCod = new String[] {""} ;
      P03XX5_A396EmprCod = new String[] {""} ;
      P03XX5_A774ProNumLin = new short[1] ;
      P03XX5_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablaf1__default(),
         new Object[] {
             new Object[] {
            P03XX2_A457FasCod, P03XX2_A396EmprCod, P03XX2_A460FasDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03XX5_A457FasCod, P03XX5_A396EmprCod, P03XX5_A774ProNumLin, P03XX5_A758ProCod
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
   private short A774ProNumLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String Gx_time ;
   private String AV22Station ;
   private String AV24Emprcod ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String GXv_char2[] ;
   private String AV25usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String AV31Fascod ;
   private String Gx_msg ;
   private String A758ProCod ;
   private java.util.Date AV29Inicio_p ;
   private java.util.Date AV30Fin_p ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P03XX2_A457FasCod ;
   private String[] P03XX2_A396EmprCod ;
   private String[] P03XX2_A460FasDsc ;
   private String[] P03XX5_A457FasCod ;
   private String[] P03XX5_A396EmprCod ;
   private short[] P03XX5_A774ProNumLin ;
   private String[] P03XX5_A758ProCod ;
}

final  class aptablaf1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03XX2", "SELECT FasCod, EmprCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? ORDER BY EmprCod, FasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03XX3", "DELETE FROM TXPFASPRO  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPRO")
         ,new UpdateCursor("P03XX4", "DELETE FROM TXPFASPRO  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPRO")
         ,new ForEachCursor("P03XX5", "SELECT * FROM (SELECT FasCod, EmprCod, ProNumLin, ProCod FROM TXPPROLIN WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

