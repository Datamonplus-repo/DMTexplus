package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablah1 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablah1 pgm = new aptablah1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablah1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablah1.class ), "" );
   }

   public aptablah1( int remoteHandle ,
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
         getPrinter().GxSetDocName("UPTIMICACION REPROCESOS") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h3XZ0( false, 46) ;
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
         aptablah1.this.AV24Emprcod = GXv_char1[0] ;
         aptablah1.this.AV23EmprNom = GXv_char2[0] ;
         aptablah1.this.AV25usurcod = GXv_char3[0] ;
         /* Using cursor P03XZ2 */
         pr_default.execute(0, new Object[] {AV24Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5061Hl_hdrp = P03XZ2_A5061Hl_hdrp[0] ;
            A5060Hl_hdrr = P03XZ2_A5060Hl_hdrr[0] ;
            A5059Hl_hdr = P03XZ2_A5059Hl_hdr[0] ;
            A396EmprCod = P03XZ2_A396EmprCod[0] ;
            AV31Barcod = A5059Hl_hdr ;
            AV32Barcodreo = A5060Hl_hdrr ;
            AV33barcodpar = A5061Hl_hdrp ;
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
               /* Using cursor P03XZ3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A5069Hl_hdrp_o = P03XZ3_A5069Hl_hdrp_o[0] ;
                  A5068Hl_hdrr_o = P03XZ3_A5068Hl_hdrr_o[0] ;
                  A5067Hl_hdr_o = P03XZ3_A5067Hl_hdr_o[0] ;
                  /* Using cursor P03XZ4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp, Integer.valueOf(A5067Hl_hdr_o), Byte.valueOf(A5068Hl_hdrr_o), A5069Hl_hdrp_o});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A5076Hl_OrdLin = P03XZ4_A5076Hl_OrdLin[0] ;
                     A5074Hl_Procod = P03XZ4_A5074Hl_Procod[0] ;
                     /* Optimized DELETE. */
                     /* Using cursor P03XZ5 */
                     pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp, Integer.valueOf(A5067Hl_hdr_o), Byte.valueOf(A5068Hl_hdrr_o), A5069Hl_hdrp_o, A5074Hl_Procod, Short.valueOf(A5076Hl_OrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREO3");
                     /* End optimized DELETE. */
                     /* Using cursor P03XZ6 */
                     pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp, Integer.valueOf(A5067Hl_hdr_o), Byte.valueOf(A5068Hl_hdrr_o), A5069Hl_hdrp_o, A5074Hl_Procod, Short.valueOf(A5076Hl_OrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREO2");
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
                  /* Using cursor P03XZ7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp, Integer.valueOf(A5067Hl_hdr_o), Byte.valueOf(A5068Hl_hdrr_o), A5069Hl_hdrp_o});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREO1");
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               /* Optimized DELETE. */
               /* Using cursor P03XZ8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLRPRP");
               /* End optimized DELETE. */
               /* Using cursor P03XZ9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREOP");
               Gx_msg = httpContext.getMessage( "Delete ", "") + GXutil.str( A5059Hl_hdr, 8, 0) + GXutil.str( A5060Hl_hdrr, 1, 0) + A5061Hl_hdrp ;
               System.out.println( Gx_msg );
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV29Inicio_p = GXutil.serverNow( context, remoteHandle, pr_default) ;
         h3XZ0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV30Fin_p, "99/99/99 99:99"), 13, Gx_line+1, 116, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3XZ0( true, 0) ;
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
      /* Using cursor P03XZ10 */
      pr_default.execute(8, new Object[] {AV24Emprcod, Integer.valueOf(AV31Barcod), Byte.valueOf(AV32Barcodreo), AV33barcodpar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P03XZ10_A130BarCodPar[0] ;
         A132BarCodReo = P03XZ10_A132BarCodReo[0] ;
         A129BarCod = P03XZ10_A129BarCod[0] ;
         A396EmprCod = P03XZ10_A396EmprCod[0] ;
         AV21Barpro = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void h3XZ0( boolean bFoot ,
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
      GXutil.refClasses(ptablah1.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablah1");
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
      P03XZ2_A5061Hl_hdrp = new String[] {""} ;
      P03XZ2_A5060Hl_hdrr = new byte[1] ;
      P03XZ2_A5059Hl_hdr = new int[1] ;
      P03XZ2_A396EmprCod = new String[] {""} ;
      A5061Hl_hdrp = "" ;
      A396EmprCod = "" ;
      AV33barcodpar = "" ;
      P03XZ3_A396EmprCod = new String[] {""} ;
      P03XZ3_A5059Hl_hdr = new int[1] ;
      P03XZ3_A5060Hl_hdrr = new byte[1] ;
      P03XZ3_A5061Hl_hdrp = new String[] {""} ;
      P03XZ3_A5069Hl_hdrp_o = new String[] {""} ;
      P03XZ3_A5068Hl_hdrr_o = new byte[1] ;
      P03XZ3_A5067Hl_hdr_o = new int[1] ;
      A5069Hl_hdrp_o = "" ;
      P03XZ4_A396EmprCod = new String[] {""} ;
      P03XZ4_A5059Hl_hdr = new int[1] ;
      P03XZ4_A5060Hl_hdrr = new byte[1] ;
      P03XZ4_A5061Hl_hdrp = new String[] {""} ;
      P03XZ4_A5067Hl_hdr_o = new int[1] ;
      P03XZ4_A5068Hl_hdrr_o = new byte[1] ;
      P03XZ4_A5069Hl_hdrp_o = new String[] {""} ;
      P03XZ4_A5076Hl_OrdLin = new short[1] ;
      P03XZ4_A5074Hl_Procod = new String[] {""} ;
      A5074Hl_Procod = "" ;
      Gx_msg = "" ;
      AV30Fin_p = GXutil.resetTime( GXutil.nullDate() );
      P03XZ10_A130BarCodPar = new String[] {""} ;
      P03XZ10_A132BarCodReo = new byte[1] ;
      P03XZ10_A129BarCod = new int[1] ;
      P03XZ10_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablah1__default(),
         new Object[] {
             new Object[] {
            P03XZ2_A5061Hl_hdrp, P03XZ2_A5060Hl_hdrr, P03XZ2_A5059Hl_hdr, P03XZ2_A396EmprCod
            }
            , new Object[] {
            P03XZ3_A396EmprCod, P03XZ3_A5059Hl_hdr, P03XZ3_A5060Hl_hdrr, P03XZ3_A5061Hl_hdrp, P03XZ3_A5069Hl_hdrp_o, P03XZ3_A5068Hl_hdrr_o, P03XZ3_A5067Hl_hdr_o
            }
            , new Object[] {
            P03XZ4_A396EmprCod, P03XZ4_A5059Hl_hdr, P03XZ4_A5060Hl_hdrr, P03XZ4_A5061Hl_hdrp, P03XZ4_A5067Hl_hdr_o, P03XZ4_A5068Hl_hdrr_o, P03XZ4_A5069Hl_hdrp_o, P03XZ4_A5076Hl_OrdLin, P03XZ4_A5074Hl_Procod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03XZ10_A130BarCodPar, P03XZ10_A132BarCodReo, P03XZ10_A129BarCod, P03XZ10_A396EmprCod
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

   private byte A5060Hl_hdrr ;
   private byte AV32Barcodreo ;
   private byte AV21Barpro ;
   private byte A5068Hl_hdrr_o ;
   private byte A132BarCodReo ;
   private short A5076Hl_OrdLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A5059Hl_hdr ;
   private int AV31Barcod ;
   private int A5067Hl_hdr_o ;
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
   private String A5061Hl_hdrp ;
   private String A396EmprCod ;
   private String AV33barcodpar ;
   private String A5069Hl_hdrp_o ;
   private String A5074Hl_Procod ;
   private String Gx_msg ;
   private String A130BarCodPar ;
   private java.util.Date AV29Inicio_p ;
   private java.util.Date AV30Fin_p ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P03XZ2_A5061Hl_hdrp ;
   private byte[] P03XZ2_A5060Hl_hdrr ;
   private int[] P03XZ2_A5059Hl_hdr ;
   private String[] P03XZ2_A396EmprCod ;
   private String[] P03XZ3_A396EmprCod ;
   private int[] P03XZ3_A5059Hl_hdr ;
   private byte[] P03XZ3_A5060Hl_hdrr ;
   private String[] P03XZ3_A5061Hl_hdrp ;
   private String[] P03XZ3_A5069Hl_hdrp_o ;
   private byte[] P03XZ3_A5068Hl_hdrr_o ;
   private int[] P03XZ3_A5067Hl_hdr_o ;
   private String[] P03XZ4_A396EmprCod ;
   private int[] P03XZ4_A5059Hl_hdr ;
   private byte[] P03XZ4_A5060Hl_hdrr ;
   private String[] P03XZ4_A5061Hl_hdrp ;
   private int[] P03XZ4_A5067Hl_hdr_o ;
   private byte[] P03XZ4_A5068Hl_hdrr_o ;
   private String[] P03XZ4_A5069Hl_hdrp_o ;
   private short[] P03XZ4_A5076Hl_OrdLin ;
   private String[] P03XZ4_A5074Hl_Procod ;
   private String[] P03XZ10_A130BarCodPar ;
   private byte[] P03XZ10_A132BarCodReo ;
   private int[] P03XZ10_A129BarCod ;
   private String[] P03XZ10_A396EmprCod ;
}

final  class aptablah1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03XZ2", "SELECT Hl_hdrp, Hl_hdrr, Hl_hdr, EmprCod FROM TXPHLREOP WHERE EmprCod = ? and Hl_hdr > 0 ORDER BY EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03XZ3", "SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp, Hl_hdrp_o, Hl_hdrr_o, Hl_hdr_o FROM TXPHLREO1 WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ? ORDER BY EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp, Hl_hdr_o, Hl_hdrr_o, Hl_hdrp_o ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03XZ4", "SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp, Hl_hdr_o, Hl_hdrr_o, Hl_hdrp_o, Hl_OrdLin, Hl_Procod FROM TXPHLREO2 WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ? and Hl_hdr_o = ? and Hl_hdrr_o = ? and Hl_hdrp_o = ? ORDER BY EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp, Hl_hdr_o, Hl_hdrr_o, Hl_hdrp_o, Hl_Procod, Hl_OrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03XZ5", "DELETE FROM TXPHLREO3  WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ? and Hl_hdr_o = ? and Hl_hdrr_o = ? and Hl_hdrp_o = ? and Hl_Procod = ? and Hl_OrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREO3")
         ,new UpdateCursor("P03XZ6", "DELETE FROM TXPHLREO2  WHERE EmprCod = ? AND Hl_hdr = ? AND Hl_hdrr = ? AND Hl_hdrp = ? AND Hl_hdr_o = ? AND Hl_hdrr_o = ? AND Hl_hdrp_o = ? AND Hl_Procod = ? AND Hl_OrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREO2")
         ,new UpdateCursor("P03XZ7", "DELETE FROM TXPHLREO1  WHERE EmprCod = ? AND Hl_hdr = ? AND Hl_hdrr = ? AND Hl_hdrp = ? AND Hl_hdr_o = ? AND Hl_hdrr_o = ? AND Hl_hdrp_o = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREO1")
         ,new UpdateCursor("P03XZ8", "DELETE FROM TXPHLRPRP  WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLRPRP")
         ,new UpdateCursor("P03XZ9", "DELETE FROM TXPHLREOP  WHERE EmprCod = ? AND Hl_hdr = ? AND Hl_hdrr = ? AND Hl_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREOP")
         ,new ForEachCursor("P03XZ10", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

