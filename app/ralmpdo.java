package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralmpdo extends GXReport
{
   public ralmpdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralmpdo.class ), "" );
   }

   public ralmpdo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      ralmpdo.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      ralmpdo.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ralmpdo.this.AV16PartCod = aP1[0];
      this.aP1 = aP1;
      ralmpdo.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      ralmpdo.this.AV18PartLin = aP3[0];
      this.aP3 = aP3;
      ralmpdo.this.AV19ImpCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("DOCUMENTO ALMACEN ENTRADA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P067X2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P067X2_A407EmprNom[0] ;
            n407EmprNom = P067X2_n407EmprNom[0] ;
            A396EmprCod = P067X2_A396EmprCod[0] ;
            AV20NomEmp = A407EmprNom ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P067X3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1457ParNMtr = P067X3_A1457ParNMtr[0] ;
            n1457ParNMtr = P067X3_n1457ParNMtr[0] ;
            A1456ParArtCod = P067X3_A1456ParArtCod[0] ;
            n1456ParArtCod = P067X3_n1456ParArtCod[0] ;
            A279CliNom = P067X3_A279CliNom[0] ;
            A252CliCod = P067X3_A252CliCod[0] ;
            A966PartCod = P067X3_A966PartCod[0] ;
            A396EmprCod = P067X3_A396EmprCod[0] ;
            A279CliNom = P067X3_A279CliNom[0] ;
            AV22ParArtcod = A1456ParArtCod ;
            /* Execute user subroutine: 'LEOART' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P067X4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(AV18PartLin)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A979PartLin = P067X4_A979PartLin[0] ;
               A1877PartLoc = P067X4_A1877PartLoc[0] ;
               n1877PartLoc = P067X4_n1877PartLoc[0] ;
               A985ConEnt = P067X4_A985ConEnt[0] ;
               n985ConEnt = P067X4_n985ConEnt[0] ;
               A984KilEnt = P067X4_A984KilEnt[0] ;
               n984KilEnt = P067X4_n984KilEnt[0] ;
               A981PartAlbDis = P067X4_A981PartAlbDis[0] ;
               n981PartAlbDis = P067X4_n981PartAlbDis[0] ;
               A983PartFecMov = P067X4_A983PartFecMov[0] ;
               n983PartFecMov = P067X4_n983PartFecMov[0] ;
               h67X0( false, 1050) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Numero Partida:", ""), 15, Gx_line+33, 141, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 80, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A966PartCod, "")), 17, Gx_line+70, 750, Gx_line+244, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 15, Gx_line+300, 83, Gx_line+317, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 44, Gx_line+367, 764, Gx_line+426, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Serie:", ""), 15, Gx_line+500, 60, Gx_line+517, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1456ParArtCod, "")), 44, Gx_line+533, 428, Gx_line+592, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composicion                             N. Metrico:", ""), 15, Gx_line+650, 441, Gx_line+667, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 28, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Materia, "")), 36, Gx_line+683, 337, Gx_line+730, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1457ParNMtr, "")), 457, Gx_line+685, 646, Gx_line+732, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada :   ", ""), 15, Gx_line+783, 166, Gx_line+800, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Albaran       :    ", ""), 15, Gx_line+833, 174, Gx_line+850, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A983PartFecMov, "99/99/99"), 211, Gx_line+783, 345, Gx_line+816, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos Entrados:   ", ""), 15, Gx_line+883, 166, Gx_line+900, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A981PartAlbDis), "ZZZZZZZ9")), 211, Gx_line+833, 345, Gx_line+866, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Conos Entrados:    ", ""), 15, Gx_line+933, 174, Gx_line+950, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A984KilEnt, "ZZZZZ9.99")), 211, Gx_line+883, 362, Gx_line+916, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion     :    ", ""), 15, Gx_line+983, 174, Gx_line+1000, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A985ConEnt), "ZZZ9")), 211, Gx_line+933, 279, Gx_line+966, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1877PartLoc, "")), 211, Gx_line+983, 379, Gx_line+1016, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+17, 754, Gx_line+268, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+283, 754, Gx_line+467, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+483, 754, Gx_line+617, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+633, 754, Gx_line+767, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+777, 754, Gx_line+1030, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1050) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h67X0( true, 0) ;
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
      /* 'LEOART' Routine */
      returnInSub = false ;
      AV21Materia = "" ;
      /* Using cursor P067X5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV17CliCod), AV22ParArtcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P067X5_A65ArtCod[0] ;
         A252CliCod = P067X5_A252CliCod[0] ;
         A396EmprCod = P067X5_A396EmprCod[0] ;
         A87ArtMat = P067X5_A87ArtMat[0] ;
         n87ArtMat = P067X5_n87ArtMat[0] ;
         AV21Materia = A87ArtMat ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h67X0( boolean bFoot ,
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

   protected void cleanup( )
   {
      this.aP0[0] = ralmpdo.this.AV15EmprCod;
      this.aP1[0] = ralmpdo.this.AV16PartCod;
      this.aP2[0] = ralmpdo.this.AV17CliCod;
      this.aP3[0] = ralmpdo.this.AV18PartLin;
      this.aP4[0] = ralmpdo.this.AV19ImpCod;
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
      P067X2_A407EmprNom = new String[] {""} ;
      P067X2_n407EmprNom = new boolean[] {false} ;
      P067X2_A396EmprCod = new String[] {""} ;
      A407EmprNom = "" ;
      A396EmprCod = "" ;
      AV20NomEmp = "" ;
      P067X3_A1457ParNMtr = new String[] {""} ;
      P067X3_n1457ParNMtr = new boolean[] {false} ;
      P067X3_A1456ParArtCod = new String[] {""} ;
      P067X3_n1456ParArtCod = new boolean[] {false} ;
      P067X3_A279CliNom = new String[] {""} ;
      P067X3_A252CliCod = new int[1] ;
      P067X3_A966PartCod = new String[] {""} ;
      P067X3_A396EmprCod = new String[] {""} ;
      A1457ParNMtr = "" ;
      A1456ParArtCod = "" ;
      A279CliNom = "" ;
      A966PartCod = "" ;
      AV22ParArtcod = "" ;
      P067X4_A396EmprCod = new String[] {""} ;
      P067X4_A966PartCod = new String[] {""} ;
      P067X4_A252CliCod = new int[1] ;
      P067X4_A979PartLin = new int[1] ;
      P067X4_A1877PartLoc = new String[] {""} ;
      P067X4_n1877PartLoc = new boolean[] {false} ;
      P067X4_A985ConEnt = new short[1] ;
      P067X4_n985ConEnt = new boolean[] {false} ;
      P067X4_A984KilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P067X4_n984KilEnt = new boolean[] {false} ;
      P067X4_A981PartAlbDis = new int[1] ;
      P067X4_n981PartAlbDis = new boolean[] {false} ;
      P067X4_A983PartFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P067X4_n983PartFecMov = new boolean[] {false} ;
      A1877PartLoc = "" ;
      A984KilEnt = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      AV21Materia = "" ;
      P067X5_A65ArtCod = new String[] {""} ;
      P067X5_A252CliCod = new int[1] ;
      P067X5_A396EmprCod = new String[] {""} ;
      P067X5_A87ArtMat = new String[] {""} ;
      P067X5_n87ArtMat = new boolean[] {false} ;
      A65ArtCod = "" ;
      A87ArtMat = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralmpdo__default(),
         new Object[] {
             new Object[] {
            P067X2_A407EmprNom, P067X2_n407EmprNom, P067X2_A396EmprCod
            }
            , new Object[] {
            P067X3_A1457ParNMtr, P067X3_n1457ParNMtr, P067X3_A1456ParArtCod, P067X3_n1456ParArtCod, P067X3_A279CliNom, P067X3_A252CliCod, P067X3_A966PartCod, P067X3_A396EmprCod
            }
            , new Object[] {
            P067X4_A396EmprCod, P067X4_A966PartCod, P067X4_A252CliCod, P067X4_A979PartLin, P067X4_A1877PartLoc, P067X4_n1877PartLoc, P067X4_A985ConEnt, P067X4_n985ConEnt, P067X4_A984KilEnt, P067X4_n984KilEnt,
            P067X4_A981PartAlbDis, P067X4_n981PartAlbDis, P067X4_A983PartFecMov, P067X4_n983PartFecMov
            }
            , new Object[] {
            P067X5_A65ArtCod, P067X5_A252CliCod, P067X5_A396EmprCod, P067X5_A87ArtMat, P067X5_n87ArtMat
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short A985ConEnt ;
   private short Gx_err ;
   private int AV17CliCod ;
   private int AV18PartLin ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A984KilEnt ;
   private String AV15EmprCod ;
   private String AV16PartCod ;
   private String AV19ImpCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A396EmprCod ;
   private String AV20NomEmp ;
   private String A1457ParNMtr ;
   private String A1456ParArtCod ;
   private String A279CliNom ;
   private String A966PartCod ;
   private String AV22ParArtcod ;
   private String A1877PartLoc ;
   private String AV21Materia ;
   private String A65ArtCod ;
   private String A87ArtMat ;
   private java.util.Date A983PartFecMov ;
   private boolean n407EmprNom ;
   private boolean n1457ParNMtr ;
   private boolean n1456ParArtCod ;
   private boolean returnInSub ;
   private boolean n1877PartLoc ;
   private boolean n985ConEnt ;
   private boolean n984KilEnt ;
   private boolean n981PartAlbDis ;
   private boolean n983PartFecMov ;
   private boolean n87ArtMat ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P067X2_A407EmprNom ;
   private boolean[] P067X2_n407EmprNom ;
   private String[] P067X2_A396EmprCod ;
   private String[] P067X3_A1457ParNMtr ;
   private boolean[] P067X3_n1457ParNMtr ;
   private String[] P067X3_A1456ParArtCod ;
   private boolean[] P067X3_n1456ParArtCod ;
   private String[] P067X3_A279CliNom ;
   private int[] P067X3_A252CliCod ;
   private String[] P067X3_A966PartCod ;
   private String[] P067X3_A396EmprCod ;
   private String[] P067X4_A396EmprCod ;
   private String[] P067X4_A966PartCod ;
   private int[] P067X4_A252CliCod ;
   private int[] P067X4_A979PartLin ;
   private String[] P067X4_A1877PartLoc ;
   private boolean[] P067X4_n1877PartLoc ;
   private short[] P067X4_A985ConEnt ;
   private boolean[] P067X4_n985ConEnt ;
   private java.math.BigDecimal[] P067X4_A984KilEnt ;
   private boolean[] P067X4_n984KilEnt ;
   private int[] P067X4_A981PartAlbDis ;
   private boolean[] P067X4_n981PartAlbDis ;
   private java.util.Date[] P067X4_A983PartFecMov ;
   private boolean[] P067X4_n983PartFecMov ;
   private String[] P067X5_A65ArtCod ;
   private int[] P067X5_A252CliCod ;
   private String[] P067X5_A396EmprCod ;
   private String[] P067X5_A87ArtMat ;
   private boolean[] P067X5_n87ArtMat ;
}

final  class ralmpdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P067X2", "SELECT EmprNom, EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P067X3", "SELECT T1.ParNMtr, T1.ParArtCod, T2.CliNom, T1.CliCod, T1.PartCod, T1.EmprCod FROM (TXPCPARTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.PartCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.PartCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P067X4", "SELECT EmprCod, PartCod, CliCod, PartLin, PartLoc, ConEnt, KilEnt, PartAlbDis, PartFecMov FROM TXPLPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? and PartLin = ? ORDER BY EmprCod, PartCod, CliCod, PartLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P067X5", "SELECT ArtCod, CliCod, EmprCod, ArtMat FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

