package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apetcarvitinprinter extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apetcarvitinprinter pgm = new apetcarvitinprinter (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      short[] aP2 = new short[] {0};
      String[] aP3 = new String[] {""};
      java.math.BigDecimal[] aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      byte[] aP5 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (short) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[4]);
         aP5[0] = (byte) GXutil.lval( args[5]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public apetcarvitinprinter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apetcarvitinprinter.class ), "" );
   }

   public apetcarvitinprinter( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 )
   {
      apetcarvitinprinter.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 )
   {
      apetcarvitinprinter.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apetcarvitinprinter.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      apetcarvitinprinter.this.A597LinEnt = aP2[0];
      this.aP2 = aP2;
      apetcarvitinprinter.this.AV9numcaja = aP3[0];
      this.aP3 = aP3;
      apetcarvitinprinter.this.AV10Cant = aP4[0];
      this.aP4 = aP4;
      apetcarvitinprinter.this.AV17tipoEtiqueta = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      setPrintAtClient("ETIQUETA_IMPRESORA_001");
      try
      {
         Gx_out = "FIL";
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIQUETA_IMPRESORA_001", "", 2, 1, 256, 4291, 6998, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P08RO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P08RO2_A407EmprNom[0] ;
            n407EmprNom = P08RO2_n407EmprNom[0] ;
            A5686EntLotN = P08RO2_A5686EntLotN[0] ;
            A6156EntPrvNum = P08RO2_A6156EntPrvNum[0] ;
            n6156EntPrvNum = P08RO2_n6156EntPrvNum[0] ;
            A415EntFecEnt = P08RO2_A415EntFecEnt[0] ;
            A658PedCod = P08RO2_A658PedCod[0] ;
            n658PedCod = P08RO2_n658PedCod[0] ;
            A718PrdNom = P08RO2_A718PrdNom[0] ;
            A407EmprNom = P08RO2_A407EmprNom[0] ;
            n407EmprNom = P08RO2_n407EmprNom[0] ;
            A718PrdNom = P08RO2_A718PrdNom[0] ;
            AV18EmprNom = ((GXutil.strcmp("", AV18EmprNom)==0) ? A407EmprNom : AV18EmprNom) ;
            AV19lote20 = GXutil.trim( GXutil.substring( A5686EntLotN, 1, 20)) ;
            AV22lote15 = GXutil.trim( GXutil.substring( A5686EntLotN, 1, 15)) ;
            AV24codebarLote = AV22lote15 ;
            AV25codebarLote20 = GXutil.trim( AV19lote20) ;
            GXt_char1 = AV8PrvNom ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A6156EntPrvNum ;
            GXv_char4[0] = GXt_char1 ;
            new app.pprvnom(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            apetcarvitinprinter.this.A396EmprCod = GXv_char2[0] ;
            apetcarvitinprinter.this.A6156EntPrvNum = GXv_int3[0] ;
            apetcarvitinprinter.this.GXt_char1 = GXv_char4[0] ;
            AV8PrvNom = GXt_char1 ;
            AV19lote20 = GXutil.trim( AV19lote20) ;
            AV21CodeBar3OF9 = "*" + A719PrdNum + "*" ;
            AV11CodeBar = "*" + AV19lote20 + "*" ;
            AV23CodeBar15 = "*" + AV22lote15 + "*" ;
            AV26code12820 = AV11CodeBar ;
            h8RO0( false, 306) ;
            getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21CodeBar3OF9, "")), 193, Gx_line+83, 277, Gx_line+98, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 139, Gx_line+107, 330, Gx_line+124, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Compra:", ""), 92, Gx_line+133, 158, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 175, Gx_line+133, 234, Gx_line+150, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data de Compra:", ""), 92, Gx_line+157, 188, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A415EntFecEnt, "99/99/99"), 200, Gx_line+157, 257, Gx_line+174, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fornecedor:", ""), 92, Gx_line+181, 161, Gx_line+199, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Lote:", ""), 92, Gx_line+205, 136, Gx_line+223, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19lote20, "")), 150, Gx_line+205, 297, Gx_line+222, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8PrvNom, "")), 167, Gx_line+181, 387, Gx_line+198, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 28, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21CodeBar3OF9, "")), 150, Gx_line+17, 326, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 48, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26code12820, "")), 47, Gx_line+229, 631, Gx_line+306, 1+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+306) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h8RO0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h8RO0( boolean bFoot ,
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(petcarvitinprinter.class);
      return new app.GXcfg();
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP0[0] = apetcarvitinprinter.this.A396EmprCod;
      this.aP1[0] = apetcarvitinprinter.this.A719PrdNum;
      this.aP2[0] = apetcarvitinprinter.this.A597LinEnt;
      this.aP3[0] = apetcarvitinprinter.this.AV9numcaja;
      this.aP4[0] = apetcarvitinprinter.this.AV10Cant;
      this.aP5[0] = apetcarvitinprinter.this.AV17tipoEtiqueta;
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
      scmdbuf = "" ;
      P08RO2_A396EmprCod = new String[] {""} ;
      P08RO2_A719PrdNum = new String[] {""} ;
      P08RO2_A597LinEnt = new short[1] ;
      P08RO2_A407EmprNom = new String[] {""} ;
      P08RO2_n407EmprNom = new boolean[] {false} ;
      P08RO2_A5686EntLotN = new String[] {""} ;
      P08RO2_A6156EntPrvNum = new int[1] ;
      P08RO2_n6156EntPrvNum = new boolean[] {false} ;
      P08RO2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08RO2_A658PedCod = new int[1] ;
      P08RO2_n658PedCod = new boolean[] {false} ;
      P08RO2_A718PrdNom = new String[] {""} ;
      A407EmprNom = "" ;
      A5686EntLotN = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A718PrdNom = "" ;
      AV18EmprNom = "" ;
      AV19lote20 = "" ;
      AV22lote15 = "" ;
      AV24codebarLote = "" ;
      AV25codebarLote20 = "" ;
      AV8PrvNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      AV21CodeBar3OF9 = "" ;
      AV11CodeBar = "" ;
      AV23CodeBar15 = "" ;
      AV26code12820 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apetcarvitinprinter__default(),
         new Object[] {
             new Object[] {
            P08RO2_A396EmprCod, P08RO2_A719PrdNum, P08RO2_A597LinEnt, P08RO2_A407EmprNom, P08RO2_n407EmprNom, P08RO2_A5686EntLotN, P08RO2_A6156EntPrvNum, P08RO2_n6156EntPrvNum, P08RO2_A415EntFecEnt, P08RO2_A658PedCod,
            P08RO2_n658PedCod, P08RO2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV17tipoEtiqueta ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int GXv_int3[] ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV10Cant ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV9numcaja ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A5686EntLotN ;
   private String A718PrdNom ;
   private String AV18EmprNom ;
   private String AV19lote20 ;
   private String AV22lote15 ;
   private String AV24codebarLote ;
   private String AV25codebarLote20 ;
   private String AV8PrvNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV21CodeBar3OF9 ;
   private String AV11CodeBar ;
   private String AV23CodeBar15 ;
   private String AV26code12820 ;
   private java.util.Date A415EntFecEnt ;
   private boolean n407EmprNom ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08RO2_A396EmprCod ;
   private String[] P08RO2_A719PrdNum ;
   private short[] P08RO2_A597LinEnt ;
   private String[] P08RO2_A407EmprNom ;
   private boolean[] P08RO2_n407EmprNom ;
   private String[] P08RO2_A5686EntLotN ;
   private int[] P08RO2_A6156EntPrvNum ;
   private boolean[] P08RO2_n6156EntPrvNum ;
   private java.util.Date[] P08RO2_A415EntFecEnt ;
   private int[] P08RO2_A658PedCod ;
   private boolean[] P08RO2_n658PedCod ;
   private String[] P08RO2_A718PrdNom ;
}

final  class apetcarvitinprinter__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RO2", "SELECT T1.EmprCod, T1.PrdNum, T1.LinEnt, T2.EmprNom, T1.EntLotN, T1.EntPrvNum, T1.EntFecEnt, T1.PedCod, T3.PrdNom FROM ((TXPENTALM T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.LinEnt = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.LinEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

