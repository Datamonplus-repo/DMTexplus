package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ppalrxeti extends GXReport
{
   public ppalrxeti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppalrxeti.class ), "" );
   }

   public ppalrxeti( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      ppalrxeti.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      ppalrxeti.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppalrxeti.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      ppalrxeti.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      ppalrxeti.this.A981PartAlbDis = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 2 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIRX", "", 2, 2, 256, 5760, 7488, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiquetas de palets Rontaltex") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         if ( GXutil.strcmp(new app.sask(remoteHandle, context).executeUdp( httpContext.getMessage( "Imprimir la Etiqueta?", ""), httpContext.getMessage( "Sn", ""), "?"), httpContext.getMessage( "S", "")) == 0 )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            /* Using cursor P024J2 */
            pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A5874CruCod = P024J2_A5874CruCod[0] ;
               n5874CruCod = P024J2_n5874CruCod[0] ;
               A970ProceCod = P024J2_A970ProceCod[0] ;
               n970ProceCod = P024J2_n970ProceCod[0] ;
               A971ProceNom = P024J2_A971ProceNom[0] ;
               n971ProceNom = P024J2_n971ProceNom[0] ;
               A983PartFecMov = P024J2_A983PartFecMov[0] ;
               n983PartFecMov = P024J2_n983PartFecMov[0] ;
               A968PartFec = P024J2_A968PartFec[0] ;
               n968PartFec = P024J2_n968PartFec[0] ;
               A279CliNom = P024J2_A279CliNom[0] ;
               A2022PartPesCo = P024J2_A2022PartPesCo[0] ;
               n2022PartPesCo = P024J2_n2022PartPesCo[0] ;
               A985ConEnt = P024J2_A985ConEnt[0] ;
               n985ConEnt = P024J2_n985ConEnt[0] ;
               A5875CruDsc = P024J2_A5875CruDsc[0] ;
               n5875CruDsc = P024J2_n5875CruDsc[0] ;
               A5916PartTarPal = P024J2_A5916PartTarPal[0] ;
               n5916PartTarPal = P024J2_n5916PartTarPal[0] ;
               A5915PartTarCja = P024J2_A5915PartTarCja[0] ;
               n5915PartTarCja = P024J2_n5915PartTarCja[0] ;
               A5914PartCja = P024J2_A5914PartCja[0] ;
               n5914PartCja = P024J2_n5914PartCja[0] ;
               A984KilEnt = P024J2_A984KilEnt[0] ;
               n984KilEnt = P024J2_n984KilEnt[0] ;
               A979PartLin = P024J2_A979PartLin[0] ;
               A279CliNom = P024J2_A279CliNom[0] ;
               A5874CruCod = P024J2_A5874CruCod[0] ;
               n5874CruCod = P024J2_n5874CruCod[0] ;
               A970ProceCod = P024J2_A970ProceCod[0] ;
               n970ProceCod = P024J2_n970ProceCod[0] ;
               A968PartFec = P024J2_A968PartFec[0] ;
               n968PartFec = P024J2_n968PartFec[0] ;
               A5875CruDsc = P024J2_A5875CruDsc[0] ;
               n5875CruDsc = P024J2_n5875CruDsc[0] ;
               A971ProceNom = P024J2_A971ProceNom[0] ;
               n971ProceNom = P024J2_n971ProceNom[0] ;
               AV15CodBar = "*" + GXutil.padr( GXutil.trim( A966PartCod), 16, " ") + GXutil.padl( GXutil.trim( GXutil.str( A252CliCod, 10, 0)), (short)(6), "0") + GXutil.padl( GXutil.trim( GXutil.str( A981PartAlbDis, 10, 0)), (short)(3), "0") + "*" ;
               h24J0( false, 379) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15CodBar, "")), 70, Gx_line+14, 352, Gx_line+41, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos Netos", ""), 14, Gx_line+186, 129, Gx_line+210, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Taras ", ""), 14, Gx_line+217, 75, Gx_line+241, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Caja", ""), 372, Gx_line+256, 417, Gx_line+280, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Palet", ""), 14, Gx_line+256, 65, Gx_line+280, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cono", ""), 178, Gx_line+256, 230, Gx_line+280, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cajas", ""), 386, Gx_line+186, 441, Gx_line+210, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Conos", ""), 260, Gx_line+186, 322, Gx_line+210, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 14, Gx_line+295, 59, Gx_line+319, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A984KilEnt, "ZZZZZ9.99")), 133, Gx_line+186, 256, Gx_line+211, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5914PartCja), "ZZZZ9")), 447, Gx_line+186, 516, Gx_line+211, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5915PartTarCja, "Z9.999")), 433, Gx_line+256, 515, Gx_line+281, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5916PartTarPal, "Z9.999")), 81, Gx_line+256, 163, Gx_line+281, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5875CruDsc, "")), 149, Gx_line+295, 515, Gx_line+319, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Totales", ""), 14, Gx_line+155, 88, Gx_line+179, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A985ConEnt), "ZZZ9")), 328, Gx_line+186, 383, Gx_line+211, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2022PartPesCo, "ZZZZ9.99")), 247, Gx_line+256, 356, Gx_line+281, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Datos", ""), 14, Gx_line+65, 55, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A966PartCod, "")), 68, Gx_line+60, 271, Gx_line+84, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 14, Gx_line+91, 328, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A968PartFec, "99/99/99"), 284, Gx_line+60, 393, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A983PartFecMov, "99/99/99"), 217, Gx_line+117, 326, Gx_line+142, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Palet", ""), 14, Gx_line+117, 65, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A981PartAlbDis), "ZZZZZZZ9")), 81, Gx_line+117, 190, Gx_line+142, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15CodBar, "")), 148, Gx_line+36, 367, Gx_line+53, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 14, Gx_line+325, 135, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 149, Gx_line+325, 515, Gx_line+349, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+147, 515, Gx_line+147, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+247, 515, Gx_line+247, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+286, 515, Gx_line+286, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+379) ;
               pr_default.readNext(0);
            }
            pr_default.close(0);
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h24J0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h24J0( boolean bFoot ,
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
      this.aP0[0] = ppalrxeti.this.A396EmprCod;
      this.aP1[0] = ppalrxeti.this.A966PartCod;
      this.aP2[0] = ppalrxeti.this.A252CliCod;
      this.aP3[0] = ppalrxeti.this.A981PartAlbDis;
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
      P024J2_A5874CruCod = new int[1] ;
      P024J2_n5874CruCod = new boolean[] {false} ;
      P024J2_A970ProceCod = new short[1] ;
      P024J2_n970ProceCod = new boolean[] {false} ;
      P024J2_A396EmprCod = new String[] {""} ;
      P024J2_A966PartCod = new String[] {""} ;
      P024J2_A252CliCod = new int[1] ;
      P024J2_A981PartAlbDis = new int[1] ;
      P024J2_n981PartAlbDis = new boolean[] {false} ;
      P024J2_A971ProceNom = new String[] {""} ;
      P024J2_n971ProceNom = new boolean[] {false} ;
      P024J2_A983PartFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P024J2_n983PartFecMov = new boolean[] {false} ;
      P024J2_A968PartFec = new java.util.Date[] {GXutil.nullDate()} ;
      P024J2_n968PartFec = new boolean[] {false} ;
      P024J2_A279CliNom = new String[] {""} ;
      P024J2_A2022PartPesCo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024J2_n2022PartPesCo = new boolean[] {false} ;
      P024J2_A985ConEnt = new short[1] ;
      P024J2_n985ConEnt = new boolean[] {false} ;
      P024J2_A5875CruDsc = new String[] {""} ;
      P024J2_n5875CruDsc = new boolean[] {false} ;
      P024J2_A5916PartTarPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024J2_n5916PartTarPal = new boolean[] {false} ;
      P024J2_A5915PartTarCja = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024J2_n5915PartTarCja = new boolean[] {false} ;
      P024J2_A5914PartCja = new int[1] ;
      P024J2_n5914PartCja = new boolean[] {false} ;
      P024J2_A984KilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024J2_n984KilEnt = new boolean[] {false} ;
      P024J2_A979PartLin = new int[1] ;
      A971ProceNom = "" ;
      A983PartFecMov = GXutil.nullDate() ;
      A968PartFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A2022PartPesCo = DecimalUtil.ZERO ;
      A5875CruDsc = "" ;
      A5916PartTarPal = DecimalUtil.ZERO ;
      A5915PartTarCja = DecimalUtil.ZERO ;
      A984KilEnt = DecimalUtil.ZERO ;
      AV15CodBar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppalrxeti__default(),
         new Object[] {
             new Object[] {
            P024J2_A5874CruCod, P024J2_n5874CruCod, P024J2_A970ProceCod, P024J2_n970ProceCod, P024J2_A396EmprCod, P024J2_A966PartCod, P024J2_A252CliCod, P024J2_A981PartAlbDis, P024J2_n981PartAlbDis, P024J2_A971ProceNom,
            P024J2_n971ProceNom, P024J2_A983PartFecMov, P024J2_n983PartFecMov, P024J2_A968PartFec, P024J2_n968PartFec, P024J2_A279CliNom, P024J2_A2022PartPesCo, P024J2_n2022PartPesCo, P024J2_A985ConEnt, P024J2_n985ConEnt,
            P024J2_A5875CruDsc, P024J2_n5875CruDsc, P024J2_A5916PartTarPal, P024J2_n5916PartTarPal, P024J2_A5915PartTarCja, P024J2_n5915PartTarCja, P024J2_A5914PartCja, P024J2_n5914PartCja, P024J2_A984KilEnt, P024J2_n984KilEnt,
            P024J2_A979PartLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short A970ProceCod ;
   private short A985ConEnt ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A981PartAlbDis ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A5874CruCod ;
   private int A5914PartCja ;
   private int A979PartLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A2022PartPesCo ;
   private java.math.BigDecimal A5916PartTarPal ;
   private java.math.BigDecimal A5915PartTarCja ;
   private java.math.BigDecimal A984KilEnt ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private String A971ProceNom ;
   private String A279CliNom ;
   private String A5875CruDsc ;
   private String AV15CodBar ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A968PartFec ;
   private boolean Cond_result ;
   private boolean n981PartAlbDis ;
   private boolean n5874CruCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n983PartFecMov ;
   private boolean n968PartFec ;
   private boolean n2022PartPesCo ;
   private boolean n985ConEnt ;
   private boolean n5875CruDsc ;
   private boolean n5916PartTarPal ;
   private boolean n5915PartTarCja ;
   private boolean n5914PartCja ;
   private boolean n984KilEnt ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P024J2_A5874CruCod ;
   private boolean[] P024J2_n5874CruCod ;
   private short[] P024J2_A970ProceCod ;
   private boolean[] P024J2_n970ProceCod ;
   private String[] P024J2_A396EmprCod ;
   private String[] P024J2_A966PartCod ;
   private int[] P024J2_A252CliCod ;
   private int[] P024J2_A981PartAlbDis ;
   private boolean[] P024J2_n981PartAlbDis ;
   private String[] P024J2_A971ProceNom ;
   private boolean[] P024J2_n971ProceNom ;
   private java.util.Date[] P024J2_A983PartFecMov ;
   private boolean[] P024J2_n983PartFecMov ;
   private java.util.Date[] P024J2_A968PartFec ;
   private boolean[] P024J2_n968PartFec ;
   private String[] P024J2_A279CliNom ;
   private java.math.BigDecimal[] P024J2_A2022PartPesCo ;
   private boolean[] P024J2_n2022PartPesCo ;
   private short[] P024J2_A985ConEnt ;
   private boolean[] P024J2_n985ConEnt ;
   private String[] P024J2_A5875CruDsc ;
   private boolean[] P024J2_n5875CruDsc ;
   private java.math.BigDecimal[] P024J2_A5916PartTarPal ;
   private boolean[] P024J2_n5916PartTarPal ;
   private java.math.BigDecimal[] P024J2_A5915PartTarCja ;
   private boolean[] P024J2_n5915PartTarCja ;
   private int[] P024J2_A5914PartCja ;
   private boolean[] P024J2_n5914PartCja ;
   private java.math.BigDecimal[] P024J2_A984KilEnt ;
   private boolean[] P024J2_n984KilEnt ;
   private int[] P024J2_A979PartLin ;
}

final  class ppalrxeti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024J2", "SELECT T3.CruCod, T3.ProceCod, T1.EmprCod, T1.PartCod, T1.CliCod, T1.PartAlbDis, T5.ProceNom, T1.PartFecMov, T3.PartFec, T2.CliNom, T1.PartPesCo, T1.ConEnt, T4.CruDsc, T1.PartTarPal, T1.PartTarCja, T1.PartCja, T1.KilEnt, T1.PartLin FROM ((((TXPLPARTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T1.PartCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCruTip T4 ON T4.EmprCod = T1.EmprCod AND T4.CruCod = T3.CruCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T3.ProceCod) WHERE (T1.EmprCod = ? and T1.PartCod = ? and T1.CliCod = ?) AND (T1.PartAlbDis = ?) ORDER BY T1.EmprCod, T1.PartCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 30);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(18);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
      }
   }

}

