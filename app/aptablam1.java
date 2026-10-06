package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablam1 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablam1 pgm = new aptablam1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablam1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablam1.class ), "" );
   }

   public aptablam1( int remoteHandle ,
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
         getPrinter().GxSetDocName("OPTIMIZACION MAQUIN") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h3XY0( false, 46) ;
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
         aptablam1.this.AV24Emprcod = GXv_char1[0] ;
         aptablam1.this.AV23EmprNom = GXv_char2[0] ;
         aptablam1.this.AV25usurcod = GXv_char3[0] ;
         /* Using cursor P03XY2 */
         pr_default.execute(0, new Object[] {AV24Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A602MaqCod = P03XY2_A602MaqCod[0] ;
            n602MaqCod = P03XY2_n602MaqCod[0] ;
            A396EmprCod = P03XY2_A396EmprCod[0] ;
            A606MaqDsc = P03XY2_A606MaqDsc[0] ;
            n606MaqDsc = P03XY2_n606MaqDsc[0] ;
            if ( ( GXutil.strcmp(A602MaqCod, GXutil.space( (short)(8))) >= 0 ) && ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "zzzzzzzz", "")) <= 0 ) )
            {
               AV32Maqcod = A602MaqCod ;
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
                  /* Using cursor P03XY3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  Gx_msg = httpContext.getMessage( "Delete ", "") + A602MaqCod + " " + A606MaqDsc ;
                  System.out.println( Gx_msg );
                  /* Using cursor P03XY4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h3XY0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV30Fin_p, "99/99/99 99:99"), 13, Gx_line+1, 116, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3XY0( true, 0) ;
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
      /* Using cursor P03XY5 */
      pr_default.execute(3, new Object[] {AV24Emprcod, AV32Maqcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P03XY5_A602MaqCod[0] ;
         n602MaqCod = P03XY5_n602MaqCod[0] ;
         A396EmprCod = P03XY5_A396EmprCod[0] ;
         A459FasDec = P03XY5_A459FasDec[0] ;
         n459FasDec = P03XY5_n459FasDec[0] ;
         A457FasCod = P03XY5_A457FasCod[0] ;
         AV21Barpro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h3XY0( boolean bFoot ,
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
      GXutil.refClasses(ptablam1.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablam1");
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
      P03XY2_A602MaqCod = new String[] {""} ;
      P03XY2_n602MaqCod = new boolean[] {false} ;
      P03XY2_A396EmprCod = new String[] {""} ;
      P03XY2_A606MaqDsc = new String[] {""} ;
      P03XY2_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      AV32Maqcod = "" ;
      Gx_msg = "" ;
      AV30Fin_p = GXutil.resetTime( GXutil.nullDate() );
      P03XY5_A602MaqCod = new String[] {""} ;
      P03XY5_n602MaqCod = new boolean[] {false} ;
      P03XY5_A396EmprCod = new String[] {""} ;
      P03XY5_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03XY5_n459FasDec = new boolean[] {false} ;
      P03XY5_A457FasCod = new String[] {""} ;
      A459FasDec = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablam1__default(),
         new Object[] {
             new Object[] {
            P03XY2_A602MaqCod, P03XY2_A396EmprCod, P03XY2_A606MaqDsc, P03XY2_n606MaqDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03XY5_A602MaqCod, P03XY5_n602MaqCod, P03XY5_A396EmprCod, P03XY5_A459FasDec, P03XY5_n459FasDec, P03XY5_A457FasCod
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
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A459FasDec ;
   private String Gx_time ;
   private String AV22Station ;
   private String AV24Emprcod ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String GXv_char2[] ;
   private String AV25usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String AV32Maqcod ;
   private String Gx_msg ;
   private String A457FasCod ;
   private java.util.Date AV29Inicio_p ;
   private java.util.Date AV30Fin_p ;
   private java.util.Date Gx_date ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private boolean n459FasDec ;
   private IDataStoreProvider pr_default ;
   private String[] P03XY2_A602MaqCod ;
   private boolean[] P03XY2_n602MaqCod ;
   private String[] P03XY2_A396EmprCod ;
   private String[] P03XY2_A606MaqDsc ;
   private boolean[] P03XY2_n606MaqDsc ;
   private String[] P03XY5_A602MaqCod ;
   private boolean[] P03XY5_n602MaqCod ;
   private String[] P03XY5_A396EmprCod ;
   private java.math.BigDecimal[] P03XY5_A459FasDec ;
   private boolean[] P03XY5_n459FasDec ;
   private String[] P03XY5_A457FasCod ;
}

final  class aptablam1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03XY2", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (LENGTH(RTRIM(MaqCod)) = 4) ORDER BY EmprCod, MaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03XY3", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUIN")
         ,new UpdateCursor("P03XY4", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUIN")
         ,new ForEachCursor("P03XY5", "SELECT * FROM (SELECT MaqCod, EmprCod, FasDec, FasCod FROM TXPFASPRO WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

