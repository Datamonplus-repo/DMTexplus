package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablaop extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablaop pgm = new aptablaop (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablaop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablaop.class ), "" );
   }

   public aptablaop( int remoteHandle ,
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
         getPrinter().GxSetDocName("OPTIMIZACION TABLAS PROCES....") ;
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
         aptablaop.this.AV12Emprcod = GXv_char1[0] ;
         aptablaop.this.AV11EmprNom = GXv_char2[0] ;
         aptablaop.this.AV13usurcod = GXv_char3[0] ;
         /* Using cursor P038I2 */
         pr_default.execute(0, new Object[] {AV12Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A758ProCod = P038I2_A758ProCod[0] ;
            A396EmprCod = P038I2_A396EmprCod[0] ;
            A759ProDsc = P038I2_A759ProDsc[0] ;
            if ( ( GXutil.strcmp(A758ProCod, GXutil.space( (short)(8))) >= 0 ) && ( GXutil.strcmp(A758ProCod, httpContext.getMessage( "ZZZZZZZZ", "")) <= 0 ) )
            {
               AV8Procod = A758ProCod ;
               /* Execute user subroutine: 'BARPRO' */
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
               /* Execute user subroutine: 'MODELS' */
               S121 ();
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
               if ( AV9Barpro == 0 )
               {
                  h38I0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 18, Gx_line+0, 77, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 83, Gx_line+0, 376, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "No existe en Barpro", ""), 485, Gx_line+1, 603, Gx_line+15, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Using cursor P038I3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A774ProNumLin = P038I3_A774ProNumLin[0] ;
                     /* Using cursor P038I4 */
                     pr_default.execute(2, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                     while ( (pr_default.getStatus(2) != 101) )
                     {
                        A7897Dtp_Ordl = P038I4_A7897Dtp_Ordl[0] ;
                        /* Optimized DELETE. */
                        /* Using cursor P038I5 */
                        pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
                        /* End optimized DELETE. */
                        /* Using cursor P038I6 */
                        pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
                        pr_default.readNext(2);
                     }
                     pr_default.close(2);
                     /* Using cursor P038I7 */
                     pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  /* Using cursor P038I8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
               }
               if ( AV14Models == 0 )
               {
                  h38I0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 18, Gx_line+0, 77, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 83, Gx_line+0, 376, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "No existe en Models", ""), 485, Gx_line+0, 606, Gx_line+14, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Using cursor P038I9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A774ProNumLin = P038I9_A774ProNumLin[0] ;
                     /* Using cursor P038I10 */
                     pr_default.execute(8, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                     while ( (pr_default.getStatus(8) != 101) )
                     {
                        A7897Dtp_Ordl = P038I10_A7897Dtp_Ordl[0] ;
                        /* Optimized DELETE. */
                        /* Using cursor P038I11 */
                        pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0021");
                        /* End optimized DELETE. */
                        /* Using cursor P038I12 */
                        pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT002");
                        pr_default.readNext(8);
                     }
                     pr_default.close(8);
                     /* Using cursor P038I13 */
                     pr_default.execute(11, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
                  /* Using cursor P038I14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h38I0( true, 0) ;
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
      /* 'BARPRO' Routine */
      returnInSub = false ;
      AV9Barpro = (byte)(0) ;
      /* Using cursor P038I15 */
      pr_default.execute(13, new Object[] {AV12Emprcod, AV8Procod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A758ProCod = P038I15_A758ProCod[0] ;
         A396EmprCod = P038I15_A396EmprCod[0] ;
         A761ProFasLin = P038I15_A761ProFasLin[0] ;
         n761ProFasLin = P038I15_n761ProFasLin[0] ;
         A129BarCod = P038I15_A129BarCod[0] ;
         A132BarCodReo = P038I15_A132BarCodReo[0] ;
         A130BarCodPar = P038I15_A130BarCodPar[0] ;
         AV9Barpro = (byte)(1) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'MODELS' Routine */
      returnInSub = false ;
      AV14Models = (byte)(0) ;
      /* Using cursor P038I16 */
      pr_default.execute(14, new Object[] {AV12Emprcod, AV8Procod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A396EmprCod = P038I16_A396EmprCod[0] ;
         A4658MdlCod = P038I16_A4658MdlCod[0] ;
         A252CliCod = P038I16_A252CliCod[0] ;
         A65ArtCod = P038I16_A65ArtCod[0] ;
         AV14Models = (byte)(1) ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void h38I0( boolean bFoot ,
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
      GXutil.refClasses(ptablaop.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablaop");
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
      P038I2_A758ProCod = new String[] {""} ;
      P038I2_A396EmprCod = new String[] {""} ;
      P038I2_A759ProDsc = new String[] {""} ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      A759ProDsc = "" ;
      AV8Procod = "" ;
      P038I3_A396EmprCod = new String[] {""} ;
      P038I3_A758ProCod = new String[] {""} ;
      P038I3_A774ProNumLin = new short[1] ;
      P038I4_A396EmprCod = new String[] {""} ;
      P038I4_A758ProCod = new String[] {""} ;
      P038I4_A774ProNumLin = new short[1] ;
      P038I4_A7897Dtp_Ordl = new short[1] ;
      P038I9_A396EmprCod = new String[] {""} ;
      P038I9_A758ProCod = new String[] {""} ;
      P038I9_A774ProNumLin = new short[1] ;
      P038I10_A396EmprCod = new String[] {""} ;
      P038I10_A758ProCod = new String[] {""} ;
      P038I10_A774ProNumLin = new short[1] ;
      P038I10_A7897Dtp_Ordl = new short[1] ;
      P038I15_A758ProCod = new String[] {""} ;
      P038I15_A396EmprCod = new String[] {""} ;
      P038I15_A761ProFasLin = new short[1] ;
      P038I15_n761ProFasLin = new boolean[] {false} ;
      P038I15_A129BarCod = new int[1] ;
      P038I15_A132BarCodReo = new byte[1] ;
      P038I15_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      P038I16_A396EmprCod = new String[] {""} ;
      P038I16_A4658MdlCod = new String[] {""} ;
      P038I16_A252CliCod = new int[1] ;
      P038I16_A65ArtCod = new String[] {""} ;
      A4658MdlCod = "" ;
      A65ArtCod = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablaop__default(),
         new Object[] {
             new Object[] {
            P038I2_A758ProCod, P038I2_A396EmprCod, P038I2_A759ProDsc
            }
            , new Object[] {
            P038I3_A396EmprCod, P038I3_A758ProCod, P038I3_A774ProNumLin
            }
            , new Object[] {
            P038I4_A396EmprCod, P038I4_A758ProCod, P038I4_A774ProNumLin, P038I4_A7897Dtp_Ordl
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
            P038I9_A396EmprCod, P038I9_A758ProCod, P038I9_A774ProNumLin
            }
            , new Object[] {
            P038I10_A396EmprCod, P038I10_A758ProCod, P038I10_A774ProNumLin, P038I10_A7897Dtp_Ordl
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
            P038I15_A758ProCod, P038I15_A396EmprCod, P038I15_A761ProFasLin, P038I15_n761ProFasLin, P038I15_A129BarCod, P038I15_A132BarCodReo, P038I15_A130BarCodPar
            }
            , new Object[] {
            P038I16_A396EmprCod, P038I16_A4658MdlCod, P038I16_A252CliCod, P038I16_A65ArtCod
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
   private byte AV14Models ;
   private byte A132BarCodReo ;
   private short A774ProNumLin ;
   private short A7897Dtp_Ordl ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A129BarCod ;
   private int A252CliCod ;
   private String AV10Station ;
   private String AV12Emprcod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV13usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private String A759ProDsc ;
   private String AV8Procod ;
   private String A130BarCodPar ;
   private String A4658MdlCod ;
   private String A65ArtCod ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private IDataStoreProvider pr_default ;
   private String[] P038I2_A758ProCod ;
   private String[] P038I2_A396EmprCod ;
   private String[] P038I2_A759ProDsc ;
   private String[] P038I3_A396EmprCod ;
   private String[] P038I3_A758ProCod ;
   private short[] P038I3_A774ProNumLin ;
   private String[] P038I4_A396EmprCod ;
   private String[] P038I4_A758ProCod ;
   private short[] P038I4_A774ProNumLin ;
   private short[] P038I4_A7897Dtp_Ordl ;
   private String[] P038I9_A396EmprCod ;
   private String[] P038I9_A758ProCod ;
   private short[] P038I9_A774ProNumLin ;
   private String[] P038I10_A396EmprCod ;
   private String[] P038I10_A758ProCod ;
   private short[] P038I10_A774ProNumLin ;
   private short[] P038I10_A7897Dtp_Ordl ;
   private String[] P038I15_A758ProCod ;
   private String[] P038I15_A396EmprCod ;
   private short[] P038I15_A761ProFasLin ;
   private boolean[] P038I15_n761ProFasLin ;
   private int[] P038I15_A129BarCod ;
   private byte[] P038I15_A132BarCodReo ;
   private String[] P038I15_A130BarCodPar ;
   private String[] P038I16_A396EmprCod ;
   private String[] P038I16_A4658MdlCod ;
   private int[] P038I16_A252CliCod ;
   private String[] P038I16_A65ArtCod ;
}

final  class aptablaop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038I2", "SELECT ProCod, EmprCod, ProDsc FROM TXPPROCES WHERE EmprCod = ? ORDER BY EmprCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P038I3", "SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P038I4", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P038I5", "DELETE FROM TXPDT0021  WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0021")
         ,new UpdateCursor("P038I6", "DELETE FROM TXPDT002  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT002")
         ,new UpdateCursor("P038I7", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new UpdateCursor("P038I8", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P038I9", "SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P038I10", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P038I11", "DELETE FROM TXPDT0021  WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0021")
         ,new UpdateCursor("P038I12", "DELETE FROM TXPDT002  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? AND Dtp_Ordl = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT002")
         ,new UpdateCursor("P038I13", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
         ,new UpdateCursor("P038I14", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROCES")
         ,new ForEachCursor("P038I15", "SELECT ProCod, EmprCod, ProFasLin, BarCod, BarCodReo, BarCodPar FROM TXPBARPRO WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P038I16", "SELECT EmprCod, MdlCod, CliCod, ArtCod FROM TXPModels WHERE EmprCod = ? and MdlCod = ? ORDER BY EmprCod, MdlCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

