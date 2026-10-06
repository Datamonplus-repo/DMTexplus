package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln032 extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln032 pgm = new apjln032 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln032( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln032.class ), "" );
   }

   public apjln032( int remoteHandle ,
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Utilidad...varios") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV21Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = AV22EmprCod ;
         GXv_char2[0] = AV23EmprNom ;
         GXv_char3[0] = AV24UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char1, GXv_char2, GXv_char3) ;
         apjln032.this.AV22EmprCod = GXv_char1[0] ;
         apjln032.this.AV23EmprNom = GXv_char2[0] ;
         apjln032.this.AV24UsurCod = GXv_char3[0] ;
         AV32Num_rgtos = 0 ;
         /* Using cursor P01GU2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P01GU2_A65ArtCod[0] ;
            A829TipArtCod = P01GU2_A829TipArtCod[0] ;
            A252CliCod = P01GU2_A252CliCod[0] ;
            n252CliCod = P01GU2_n252CliCod[0] ;
            A396EmprCod = P01GU2_A396EmprCod[0] ;
            AV35CliCod = A252CliCod ;
            AV36ArtCod = A65ArtCod ;
            AV37F_barcad = (byte)(0) ;
            /* Using cursor P01GU3 */
            pr_default.execute(1, new Object[] {AV22EmprCod, Integer.valueOf(AV35CliCod), AV36ArtCod, Short.valueOf(A829TipArtCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A217BarTipArt = P01GU3_A217BarTipArt[0] ;
               n217BarTipArt = P01GU3_n217BarTipArt[0] ;
               A212BarSer = P01GU3_A212BarSer[0] ;
               A252CliCod = P01GU3_A252CliCod[0] ;
               n252CliCod = P01GU3_n252CliCod[0] ;
               A396EmprCod = P01GU3_A396EmprCod[0] ;
               A129BarCod = P01GU3_A129BarCod[0] ;
               A132BarCodReo = P01GU3_A132BarCodReo[0] ;
               A130BarCodPar = P01GU3_A130BarCodPar[0] ;
               AV37F_barcad = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV37F_barcad == 0 )
            {
               AV32Num_rgtos = (int)(AV32Num_rgtos+1) ;
               Gx_msg = httpContext.getMessage( "Numero de registros eliminados Artlin =", "") + GXutil.str( AV32Num_rgtos, 6, 0) ;
               System.out.println( Gx_msg );
               /* Using cursor P01GU4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  gxt1GU4 = (byte)(0) ;
                  A758ProCod = P01GU4_A758ProCod[0] ;
                  /* Using cursor P01GU5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                  gxt1GU4 = (byte)(1) ;
                  if ( gxt1GU4 == 1 )
                  {
                     Application.commitDataStores(context, remoteHandle, pr_default, "apjln032");
                  }
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         Application.commitDataStores(context, remoteHandle, pr_default, "apjln032");
         /* Using cursor P01GU6 */
         pr_default.execute(4);
         while ( (pr_default.getStatus(4) != 101) )
         {
            gxt1GU5 = (byte)(0) ;
            A829TipArtCod = P01GU6_A829TipArtCod[0] ;
            A65ArtCod = P01GU6_A65ArtCod[0] ;
            A252CliCod = P01GU6_A252CliCod[0] ;
            n252CliCod = P01GU6_n252CliCod[0] ;
            A396EmprCod = P01GU6_A396EmprCod[0] ;
            AV35CliCod = A252CliCod ;
            AV36ArtCod = A65ArtCod ;
            AV37F_barcad = (byte)(0) ;
            /* Using cursor P01GU7 */
            pr_default.execute(5, new Object[] {AV22EmprCod, Integer.valueOf(AV35CliCod), AV36ArtCod, Short.valueOf(A829TipArtCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A217BarTipArt = P01GU7_A217BarTipArt[0] ;
               n217BarTipArt = P01GU7_n217BarTipArt[0] ;
               A212BarSer = P01GU7_A212BarSer[0] ;
               A252CliCod = P01GU7_A252CliCod[0] ;
               n252CliCod = P01GU7_n252CliCod[0] ;
               A396EmprCod = P01GU7_A396EmprCod[0] ;
               A129BarCod = P01GU7_A129BarCod[0] ;
               A132BarCodReo = P01GU7_A132BarCodReo[0] ;
               A130BarCodPar = P01GU7_A130BarCodPar[0] ;
               AV37F_barcad = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV37F_barcad == 0 )
            {
               AV32Num_rgtos = (int)(AV32Num_rgtos+1) ;
               Gx_msg = httpContext.getMessage( "Numero de registros eliminados Articu =", "") + GXutil.str( AV32Num_rgtos, 6, 0) ;
               System.out.println( Gx_msg );
               /* Using cursor P01GU8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
               gxt1GU5 = (byte)(1) ;
            }
            if ( gxt1GU5 == 1 )
            {
               Application.commitDataStores(context, remoteHandle, pr_default, "apjln032");
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV43Msg_l = httpContext.getMessage( "Nº Eliminados,Tablas ARTICU,ARTLIN=", "") + GXutil.str( AV32Num_rgtos, 6, 0) ;
         h1GU0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Msg_l, "")), 0, Gx_line+0, 730, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1GU0( true, 0) ;
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
      /* 'PROLIN' Routine */
      returnInSub = false ;
      /* Using cursor P01GU9 */
      pr_default.execute(7, new Object[] {AV22EmprCod, AV44FasCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A457FasCod = P01GU9_A457FasCod[0] ;
         A396EmprCod = P01GU9_A396EmprCod[0] ;
         A774ProNumLin = P01GU9_A774ProNumLin[0] ;
         A758ProCod = P01GU9_A758ProCod[0] ;
         AV38Flag_f = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARPRO' Routine */
      returnInSub = false ;
      /* Using cursor P01GU10 */
      pr_default.execute(8, new Object[] {AV22EmprCod, AV29ProCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A758ProCod = P01GU10_A758ProCod[0] ;
         A396EmprCod = P01GU10_A396EmprCod[0] ;
         A761ProFasLin = P01GU10_A761ProFasLin[0] ;
         n761ProFasLin = P01GU10_n761ProFasLin[0] ;
         A129BarCod = P01GU10_A129BarCod[0] ;
         A132BarCodReo = P01GU10_A132BarCodReo[0] ;
         A130BarCodPar = P01GU10_A130BarCodPar[0] ;
         AV38Flag_f = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P01GU11 */
      pr_default.execute(9, new Object[] {AV22EmprCod, Integer.valueOf(AV35CliCod), AV39BarSer, AV40BarColNom, Integer.valueOf(AV41BarColNum), Byte.valueOf(AV42BarTipCol)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A218BarTipCol = P01GU11_A218BarTipCol[0] ;
         A136BarColNum = P01GU11_A136BarColNum[0] ;
         A135BarColNom = P01GU11_A135BarColNom[0] ;
         A212BarSer = P01GU11_A212BarSer[0] ;
         A252CliCod = P01GU11_A252CliCod[0] ;
         n252CliCod = P01GU11_n252CliCod[0] ;
         A396EmprCod = P01GU11_A396EmprCod[0] ;
         A129BarCod = P01GU11_A129BarCod[0] ;
         A132BarCodReo = P01GU11_A132BarCodReo[0] ;
         A130BarCodPar = P01GU11_A130BarCodPar[0] ;
         AV38Flag_f = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      /* Using cursor P01GU12 */
      pr_default.execute(10, new Object[] {AV22EmprCod, Integer.valueOf(AV35CliCod), AV36ArtCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A65ArtCod = P01GU12_A65ArtCod[0] ;
         A252CliCod = P01GU12_A252CliCod[0] ;
         n252CliCod = P01GU12_n252CliCod[0] ;
         A396EmprCod = P01GU12_A396EmprCod[0] ;
         AV38Flag_f = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void h1GU0( boolean bFoot ,
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
      GXutil.refClasses(pjln032.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln032");
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
      AV21Station = "" ;
      AV22EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV24UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P01GU2_A65ArtCod = new String[] {""} ;
      P01GU2_A829TipArtCod = new short[1] ;
      P01GU2_A252CliCod = new int[1] ;
      P01GU2_n252CliCod = new boolean[] {false} ;
      P01GU2_A396EmprCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      AV36ArtCod = "" ;
      P01GU3_A217BarTipArt = new short[1] ;
      P01GU3_n217BarTipArt = new boolean[] {false} ;
      P01GU3_A212BarSer = new String[] {""} ;
      P01GU3_A252CliCod = new int[1] ;
      P01GU3_n252CliCod = new boolean[] {false} ;
      P01GU3_A396EmprCod = new String[] {""} ;
      P01GU3_A129BarCod = new int[1] ;
      P01GU3_A132BarCodReo = new byte[1] ;
      P01GU3_A130BarCodPar = new String[] {""} ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      Gx_msg = "" ;
      P01GU4_A396EmprCod = new String[] {""} ;
      P01GU4_A252CliCod = new int[1] ;
      P01GU4_n252CliCod = new boolean[] {false} ;
      P01GU4_A65ArtCod = new String[] {""} ;
      P01GU4_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P01GU6_A829TipArtCod = new short[1] ;
      P01GU6_A65ArtCod = new String[] {""} ;
      P01GU6_A252CliCod = new int[1] ;
      P01GU6_n252CliCod = new boolean[] {false} ;
      P01GU6_A396EmprCod = new String[] {""} ;
      P01GU7_A217BarTipArt = new short[1] ;
      P01GU7_n217BarTipArt = new boolean[] {false} ;
      P01GU7_A212BarSer = new String[] {""} ;
      P01GU7_A252CliCod = new int[1] ;
      P01GU7_n252CliCod = new boolean[] {false} ;
      P01GU7_A396EmprCod = new String[] {""} ;
      P01GU7_A129BarCod = new int[1] ;
      P01GU7_A132BarCodReo = new byte[1] ;
      P01GU7_A130BarCodPar = new String[] {""} ;
      AV43Msg_l = "" ;
      AV44FasCod = "" ;
      P01GU9_A457FasCod = new String[] {""} ;
      P01GU9_A396EmprCod = new String[] {""} ;
      P01GU9_A774ProNumLin = new short[1] ;
      P01GU9_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      AV29ProCod = "" ;
      P01GU10_A758ProCod = new String[] {""} ;
      P01GU10_A396EmprCod = new String[] {""} ;
      P01GU10_A761ProFasLin = new short[1] ;
      P01GU10_n761ProFasLin = new boolean[] {false} ;
      P01GU10_A129BarCod = new int[1] ;
      P01GU10_A132BarCodReo = new byte[1] ;
      P01GU10_A130BarCodPar = new String[] {""} ;
      AV39BarSer = "" ;
      AV40BarColNom = "" ;
      P01GU11_A218BarTipCol = new byte[1] ;
      P01GU11_A136BarColNum = new int[1] ;
      P01GU11_A135BarColNom = new String[] {""} ;
      P01GU11_A212BarSer = new String[] {""} ;
      P01GU11_A252CliCod = new int[1] ;
      P01GU11_n252CliCod = new boolean[] {false} ;
      P01GU11_A396EmprCod = new String[] {""} ;
      P01GU11_A129BarCod = new int[1] ;
      P01GU11_A132BarCodReo = new byte[1] ;
      P01GU11_A130BarCodPar = new String[] {""} ;
      A135BarColNom = "" ;
      P01GU12_A65ArtCod = new String[] {""} ;
      P01GU12_A252CliCod = new int[1] ;
      P01GU12_n252CliCod = new boolean[] {false} ;
      P01GU12_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.apjln032__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.apjln032__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.apjln032__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln032__default(),
         new Object[] {
             new Object[] {
            P01GU2_A65ArtCod, P01GU2_A829TipArtCod, P01GU2_A252CliCod, P01GU2_A396EmprCod
            }
            , new Object[] {
            P01GU3_A217BarTipArt, P01GU3_n217BarTipArt, P01GU3_A212BarSer, P01GU3_A252CliCod, P01GU3_n252CliCod, P01GU3_A396EmprCod, P01GU3_A129BarCod, P01GU3_A132BarCodReo, P01GU3_A130BarCodPar
            }
            , new Object[] {
            P01GU4_A396EmprCod, P01GU4_A252CliCod, P01GU4_A65ArtCod, P01GU4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01GU6_A829TipArtCod, P01GU6_A65ArtCod, P01GU6_A252CliCod, P01GU6_A396EmprCod
            }
            , new Object[] {
            P01GU7_A217BarTipArt, P01GU7_n217BarTipArt, P01GU7_A212BarSer, P01GU7_A252CliCod, P01GU7_n252CliCod, P01GU7_A396EmprCod, P01GU7_A129BarCod, P01GU7_A132BarCodReo, P01GU7_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            P01GU9_A457FasCod, P01GU9_A396EmprCod, P01GU9_A774ProNumLin, P01GU9_A758ProCod
            }
            , new Object[] {
            P01GU10_A758ProCod, P01GU10_A396EmprCod, P01GU10_A761ProFasLin, P01GU10_n761ProFasLin, P01GU10_A129BarCod, P01GU10_A132BarCodReo, P01GU10_A130BarCodPar
            }
            , new Object[] {
            P01GU11_A218BarTipCol, P01GU11_A136BarColNum, P01GU11_A135BarColNom, P01GU11_A212BarSer, P01GU11_A252CliCod, P01GU11_n252CliCod, P01GU11_A396EmprCod, P01GU11_A129BarCod, P01GU11_A132BarCodReo, P01GU11_A130BarCodPar
            }
            , new Object[] {
            P01GU12_A65ArtCod, P01GU12_A252CliCod, P01GU12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV37F_barcad ;
   private byte A132BarCodReo ;
   private byte gxt1GU4 ;
   private byte gxt1GU5 ;
   private byte AV38Flag_f ;
   private byte AV42BarTipCol ;
   private byte A218BarTipCol ;
   private short A829TipArtCod ;
   private short A217BarTipArt ;
   private short A774ProNumLin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV32Num_rgtos ;
   private int A252CliCod ;
   private int AV35CliCod ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private int AV41BarColNum ;
   private int A136BarColNum ;
   private String AV21Station ;
   private String AV22EmprCod ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String GXv_char2[] ;
   private String AV24UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String AV36ArtCod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String A758ProCod ;
   private String AV43Msg_l ;
   private String AV44FasCod ;
   private String A457FasCod ;
   private String AV29ProCod ;
   private String AV39BarSer ;
   private String AV40BarColNom ;
   private String A135BarColNom ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private IDataStoreProvider pr_default ;
   private String[] P01GU2_A65ArtCod ;
   private short[] P01GU2_A829TipArtCod ;
   private int[] P01GU2_A252CliCod ;
   private boolean[] P01GU2_n252CliCod ;
   private String[] P01GU2_A396EmprCod ;
   private short[] P01GU3_A217BarTipArt ;
   private boolean[] P01GU3_n217BarTipArt ;
   private String[] P01GU3_A212BarSer ;
   private int[] P01GU3_A252CliCod ;
   private boolean[] P01GU3_n252CliCod ;
   private String[] P01GU3_A396EmprCod ;
   private int[] P01GU3_A129BarCod ;
   private byte[] P01GU3_A132BarCodReo ;
   private String[] P01GU3_A130BarCodPar ;
   private String[] P01GU4_A396EmprCod ;
   private int[] P01GU4_A252CliCod ;
   private boolean[] P01GU4_n252CliCod ;
   private String[] P01GU4_A65ArtCod ;
   private String[] P01GU4_A758ProCod ;
   private short[] P01GU6_A829TipArtCod ;
   private String[] P01GU6_A65ArtCod ;
   private int[] P01GU6_A252CliCod ;
   private boolean[] P01GU6_n252CliCod ;
   private String[] P01GU6_A396EmprCod ;
   private short[] P01GU7_A217BarTipArt ;
   private boolean[] P01GU7_n217BarTipArt ;
   private String[] P01GU7_A212BarSer ;
   private int[] P01GU7_A252CliCod ;
   private boolean[] P01GU7_n252CliCod ;
   private String[] P01GU7_A396EmprCod ;
   private int[] P01GU7_A129BarCod ;
   private byte[] P01GU7_A132BarCodReo ;
   private String[] P01GU7_A130BarCodPar ;
   private String[] P01GU9_A457FasCod ;
   private String[] P01GU9_A396EmprCod ;
   private short[] P01GU9_A774ProNumLin ;
   private String[] P01GU9_A758ProCod ;
   private String[] P01GU10_A758ProCod ;
   private String[] P01GU10_A396EmprCod ;
   private short[] P01GU10_A761ProFasLin ;
   private boolean[] P01GU10_n761ProFasLin ;
   private int[] P01GU10_A129BarCod ;
   private byte[] P01GU10_A132BarCodReo ;
   private String[] P01GU10_A130BarCodPar ;
   private byte[] P01GU11_A218BarTipCol ;
   private int[] P01GU11_A136BarColNum ;
   private String[] P01GU11_A135BarColNom ;
   private String[] P01GU11_A212BarSer ;
   private int[] P01GU11_A252CliCod ;
   private boolean[] P01GU11_n252CliCod ;
   private String[] P01GU11_A396EmprCod ;
   private int[] P01GU11_A129BarCod ;
   private byte[] P01GU11_A132BarCodReo ;
   private String[] P01GU11_A130BarCodPar ;
   private String[] P01GU12_A65ArtCod ;
   private int[] P01GU12_A252CliCod ;
   private boolean[] P01GU12_n252CliCod ;
   private String[] P01GU12_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class apjln032__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class apjln032__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class apjln032__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class apjln032__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01GU2", "SELECT ArtCod, TipArtCod, CliCod, EmprCod FROM TXPARTICU ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01GU3", "SELECT * FROM (SELECT BarTipArt, BarSer, CliCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = ? and CliCod = ? and BarSer = ?) AND (BarTipArt = ?) ORDER BY EmprCod, CliCod, BarSer) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01GU4", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01GU5", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new ForEachCursor("P01GU6", "SELECT TipArtCod, ArtCod, CliCod, EmprCod FROM TXPARTICU ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01GU7", "SELECT * FROM (SELECT BarTipArt, BarSer, CliCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = ? and CliCod = ? and BarSer = ?) AND (BarTipArt = ?) ORDER BY EmprCod, CliCod, BarSer) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01GU8", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new ForEachCursor("P01GU9", "SELECT * FROM (SELECT FasCod, EmprCod, ProNumLin, ProCod FROM TXPPROLIN WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01GU10", "SELECT * FROM (SELECT ProCod, EmprCod, ProFasLin, BarCod, BarCodReo, BarCodPar FROM TXPBARPRO WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01GU11", "SELECT * FROM (SELECT BarTipCol, BarColNum, BarColNom, BarSer, CliCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = ? and CliCod = ? and BarSer = ? and BarColNom = ? and BarColNum = ?) AND (BarTipCol = ?) ORDER BY EmprCod, CliCod, BarSer, BarColNom, BarColNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01GU12", "SELECT ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

