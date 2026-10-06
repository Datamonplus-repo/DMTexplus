package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class reticol extends GXReport
{
   public reticol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reticol.class ), "" );
   }

   public reticol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      reticol.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      reticol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      reticol.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      reticol.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      reticol.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      reticol.this.AV8BarPieCod = aP4[0];
      this.aP4 = aP4;
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETICOL", "", 2, 1, 256, 5040, 4032, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("ETIQUETA COLORETTO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV19vxlotid = (int)(GXutil.lval( AV8BarPieCod)) ;
         AV20vxrapcod = 0 ;
         AV21vxrapdsc = "" ;
         AV15Calidad = A396EmprCod ;
         AV15Calidad = httpContext.getMessage( "A", "") ;
         if ( AV14Bartrocal == 2 )
         {
            AV15Calidad = httpContext.getMessage( "B", "") ;
         }
         /* Using cursor P07GW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV8BarPieCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A44AlbRecCod = P07GW2_A44AlbRecCod[0] ;
            A252CliCod = P07GW2_A252CliCod[0] ;
            A200BarPieCod = P07GW2_A200BarPieCod[0] ;
            A1691BarPieAnc = P07GW2_A1691BarPieAnc[0] ;
            n1691BarPieAnc = P07GW2_n1691BarPieAnc[0] ;
            A212BarSer = P07GW2_A212BarSer[0] ;
            A8707BapieObs = P07GW2_A8707BapieObs[0] ;
            n8707BapieObs = P07GW2_n8707BapieObs[0] ;
            A217BarTipArt = P07GW2_A217BarTipArt[0] ;
            n217BarTipArt = P07GW2_n217BarTipArt[0] ;
            A3275BarKgsAut = P07GW2_A3275BarKgsAut[0] ;
            n3275BarKgsAut = P07GW2_n3275BarKgsAut[0] ;
            A3276BarMtsAut = P07GW2_A3276BarMtsAut[0] ;
            n3276BarMtsAut = P07GW2_n3276BarMtsAut[0] ;
            A279CliNom = P07GW2_A279CliNom[0] ;
            A1003BarFecLan = P07GW2_A1003BarFecLan[0] ;
            n1003BarFecLan = P07GW2_n1003BarFecLan[0] ;
            A4812BarEncCli = P07GW2_A4812BarEncCli[0] ;
            A1234BarNomCli = P07GW2_A1234BarNomCli[0] ;
            A135BarColNom = P07GW2_A135BarColNom[0] ;
            A252CliCod = P07GW2_A252CliCod[0] ;
            A279CliNom = P07GW2_A279CliNom[0] ;
            A212BarSer = P07GW2_A212BarSer[0] ;
            A217BarTipArt = P07GW2_A217BarTipArt[0] ;
            n217BarTipArt = P07GW2_n217BarTipArt[0] ;
            A1003BarFecLan = P07GW2_A1003BarFecLan[0] ;
            n1003BarFecLan = P07GW2_n1003BarFecLan[0] ;
            A4812BarEncCli = P07GW2_A4812BarEncCli[0] ;
            A1234BarNomCli = P07GW2_A1234BarNomCli[0] ;
            A135BarColNom = P07GW2_A135BarColNom[0] ;
            AV16barPieAnc = GXutil.str( A1691BarPieAnc, 3, 0) ;
            AV16barPieAnc += " " + httpContext.getMessage( "cm", "") ;
            AV16barPieAnc = GXutil.trim( AV16barPieAnc) ;
            AV18BarSer_12 = GXutil.substring( A212BarSer, 1, 16) ;
            AV9PieCod = "*" + AV8BarPieCod + "*" ;
            AV22Bapieobs = A8707BapieObs ;
            AV23Hdr = GXutil.str( A129BarCod, 8, 0) ;
            AV23Hdr = GXutil.trim( AV23Hdr) ;
            AV25bARtIPaRT = A217BarTipArt ;
            AV24TipARtDsc = "" ;
            /* Execute user subroutine: 'TIPART' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
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
            AV26ArtRen = DecimalUtil.doubleToDec(0) ;
            if ( A3275BarKgsAut.doubleValue() > 0 )
            {
               AV26ArtRen = A3276BarMtsAut.divide(A3275BarKgsAut, 18, java.math.RoundingMode.DOWN) ;
            }
            AV27Clinom = A279CliNom ;
            h7GW0( false, 302) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LOTE", ""), 11, Gx_line+38, 41, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 11, Gx_line+59, 63, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "COLOR", ""), 11, Gx_line+81, 48, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REFER", ""), 11, Gx_line+126, 48, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FIBRA", ""), 11, Gx_line+148, 48, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PESO SALIDA", ""), 11, Gx_line+170, 92, Gx_line+185, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RENDIMIENTO", ""), 11, Gx_line+192, 92, Gx_line+207, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 11, Gx_line+214, 56, Gx_line+229, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 11, Gx_line+235, 48, Gx_line+250, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REMISION", ""), 11, Gx_line+257, 70, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA", ""), 11, Gx_line+278, 48, Gx_line+293, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16barPieAnc, "")), 97, Gx_line+232, 153, Gx_line+252, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3275BarKgsAut, "ZZZZZ9.99")), 97, Gx_line+167, 173, Gx_line+185, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3276BarMtsAut, "ZZZZZ9.99")), 97, Gx_line+211, 173, Gx_line+229, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Clinom, "")), 97, Gx_line+57, 265, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18BarSer_12, "")), 97, Gx_line+124, 231, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 97, Gx_line+79, 206, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Hdr, "")), 97, Gx_line+35, 190, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "COLOR CLI", ""), 11, Gx_line+103, 78, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 97, Gx_line+101, 206, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TipARtDsc, "")), 97, Gx_line+146, 265, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 97, Gx_line+255, 265, Gx_line+273, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26ArtRen, "ZZ9.99")), 97, Gx_line+190, 148, Gx_line+208, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A1003BarFecLan, "99/99/99"), 97, Gx_line+276, 165, Gx_line+294, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "94f9496c-fa10-415a-b168-d3d6d027aea7", "", context.getHttpContext().getTheme( )), 20, Gx_line+8, 205, Gx_line+31) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+302) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7GW0( true, 0) ;
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
      /* 'TIPART' Routine */
      returnInSub = false ;
      /* Using cursor P07GW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV25bARtIPaRT)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A829TipArtCod = P07GW3_A829TipArtCod[0] ;
         A830TipArtDsc = P07GW3_A830TipArtDsc[0] ;
         n830TipArtDsc = P07GW3_n830TipArtDsc[0] ;
         AV24TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void h7GW0( boolean bFoot ,
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
      this.aP0[0] = reticol.this.A396EmprCod;
      this.aP1[0] = reticol.this.A129BarCod;
      this.aP2[0] = reticol.this.A132BarCodReo;
      this.aP3[0] = reticol.this.A130BarCodPar;
      this.aP4[0] = reticol.this.AV8BarPieCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21vxrapdsc = "" ;
      AV15Calidad = "" ;
      scmdbuf = "" ;
      P07GW2_A44AlbRecCod = new int[1] ;
      P07GW2_A252CliCod = new int[1] ;
      P07GW2_A396EmprCod = new String[] {""} ;
      P07GW2_A129BarCod = new int[1] ;
      P07GW2_A132BarCodReo = new byte[1] ;
      P07GW2_A130BarCodPar = new String[] {""} ;
      P07GW2_A200BarPieCod = new String[] {""} ;
      P07GW2_A1691BarPieAnc = new short[1] ;
      P07GW2_n1691BarPieAnc = new boolean[] {false} ;
      P07GW2_A212BarSer = new String[] {""} ;
      P07GW2_A8707BapieObs = new String[] {""} ;
      P07GW2_n8707BapieObs = new boolean[] {false} ;
      P07GW2_A217BarTipArt = new short[1] ;
      P07GW2_n217BarTipArt = new boolean[] {false} ;
      P07GW2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07GW2_n3275BarKgsAut = new boolean[] {false} ;
      P07GW2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07GW2_n3276BarMtsAut = new boolean[] {false} ;
      P07GW2_A279CliNom = new String[] {""} ;
      P07GW2_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P07GW2_n1003BarFecLan = new boolean[] {false} ;
      P07GW2_A4812BarEncCli = new String[] {""} ;
      P07GW2_A1234BarNomCli = new String[] {""} ;
      P07GW2_A135BarColNom = new String[] {""} ;
      A200BarPieCod = "" ;
      A212BarSer = "" ;
      A8707BapieObs = "" ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      AV16barPieAnc = "" ;
      AV18BarSer_12 = "" ;
      AV9PieCod = "" ;
      AV22Bapieobs = "" ;
      AV23Hdr = "" ;
      AV24TipARtDsc = "" ;
      AV26ArtRen = DecimalUtil.ZERO ;
      AV27Clinom = "" ;
      P07GW3_A396EmprCod = new String[] {""} ;
      P07GW3_A829TipArtCod = new short[1] ;
      P07GW3_A830TipArtDsc = new String[] {""} ;
      P07GW3_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reticol__default(),
         new Object[] {
             new Object[] {
            P07GW2_A44AlbRecCod, P07GW2_A252CliCod, P07GW2_A396EmprCod, P07GW2_A129BarCod, P07GW2_A132BarCodReo, P07GW2_A130BarCodPar, P07GW2_A200BarPieCod, P07GW2_A1691BarPieAnc, P07GW2_n1691BarPieAnc, P07GW2_A212BarSer,
            P07GW2_A8707BapieObs, P07GW2_n8707BapieObs, P07GW2_A217BarTipArt, P07GW2_n217BarTipArt, P07GW2_A3275BarKgsAut, P07GW2_n3275BarKgsAut, P07GW2_A3276BarMtsAut, P07GW2_n3276BarMtsAut, P07GW2_A279CliNom, P07GW2_A1003BarFecLan,
            P07GW2_n1003BarFecLan, P07GW2_A4812BarEncCli, P07GW2_A1234BarNomCli, P07GW2_A135BarColNom
            }
            , new Object[] {
            P07GW3_A396EmprCod, P07GW3_A829TipArtCod, P07GW3_A830TipArtDsc, P07GW3_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV14Bartrocal ;
   private short A1691BarPieAnc ;
   private short A217BarTipArt ;
   private short AV25bARtIPaRT ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV19vxlotid ;
   private int AV20vxrapcod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal AV26ArtRen ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarPieCod ;
   private String AV21vxrapdsc ;
   private String AV15Calidad ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A212BarSer ;
   private String A8707BapieObs ;
   private String A279CliNom ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String AV16barPieAnc ;
   private String AV18BarSer_12 ;
   private String AV9PieCod ;
   private String AV22Bapieobs ;
   private String AV23Hdr ;
   private String AV24TipARtDsc ;
   private String AV27Clinom ;
   private String A830TipArtDsc ;
   private java.util.Date A1003BarFecLan ;
   private boolean n1691BarPieAnc ;
   private boolean n8707BapieObs ;
   private boolean n217BarTipArt ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n1003BarFecLan ;
   private boolean returnInSub ;
   private boolean n830TipArtDsc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P07GW2_A44AlbRecCod ;
   private int[] P07GW2_A252CliCod ;
   private String[] P07GW2_A396EmprCod ;
   private int[] P07GW2_A129BarCod ;
   private byte[] P07GW2_A132BarCodReo ;
   private String[] P07GW2_A130BarCodPar ;
   private String[] P07GW2_A200BarPieCod ;
   private short[] P07GW2_A1691BarPieAnc ;
   private boolean[] P07GW2_n1691BarPieAnc ;
   private String[] P07GW2_A212BarSer ;
   private String[] P07GW2_A8707BapieObs ;
   private boolean[] P07GW2_n8707BapieObs ;
   private short[] P07GW2_A217BarTipArt ;
   private boolean[] P07GW2_n217BarTipArt ;
   private java.math.BigDecimal[] P07GW2_A3275BarKgsAut ;
   private boolean[] P07GW2_n3275BarKgsAut ;
   private java.math.BigDecimal[] P07GW2_A3276BarMtsAut ;
   private boolean[] P07GW2_n3276BarMtsAut ;
   private String[] P07GW2_A279CliNom ;
   private java.util.Date[] P07GW2_A1003BarFecLan ;
   private boolean[] P07GW2_n1003BarFecLan ;
   private String[] P07GW2_A4812BarEncCli ;
   private String[] P07GW2_A1234BarNomCli ;
   private String[] P07GW2_A135BarColNom ;
   private String[] P07GW3_A396EmprCod ;
   private short[] P07GW3_A829TipArtCod ;
   private String[] P07GW3_A830TipArtDsc ;
   private boolean[] P07GW3_n830TipArtDsc ;
}

final  class reticol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07GW2", "SELECT T1.AlbRecCod, T2.CliCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarPieAnc, T4.BarSer, T1.BapieObs, T4.BarTipArt, T1.BarKgsAut, T1.BarMtsAut, T3.CliNom, T4.BarFecLan, T4.BarEncCli, T4.BarNomCli, T4.BarColNom FROM (((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07GW3", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 20);
               ((String[]) buf[22])[0] = rslt.getString(17, 13);
               ((String[]) buf[23])[0] = rslt.getString(18, 13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

