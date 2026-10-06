package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class retiita2 extends GXReport
{
   public retiita2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( retiita2.class ), "" );
   }

   public retiita2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      retiita2.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      retiita2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      retiita2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      retiita2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      retiita2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      retiita2.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      retiita2.this.A3858BarTroCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 1 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIQUETAS", "", 2, 2, 256, 4075, 5760, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiquetas Italcolore (BarTro)") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P075U2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P075U2_A361DisCod[0] ;
            A44AlbRecCod = P075U2_A44AlbRecCod[0] ;
            A46AlbREnt = P075U2_A46AlbREnt[0] ;
            A4990BarTroCal = P075U2_A4990BarTroCal[0] ;
            n4990BarTroCal = P075U2_n4990BarTroCal[0] ;
            A6556BarTroKil = P075U2_A6556BarTroKil[0] ;
            n6556BarTroKil = P075U2_n6556BarTroKil[0] ;
            A3860BarTroMet = P075U2_A3860BarTroMet[0] ;
            n3860BarTroMet = P075U2_n3860BarTroMet[0] ;
            A392DisUniMed = P075U2_A392DisUniMed[0] ;
            A252CliCod = P075U2_A252CliCod[0] ;
            n252CliCod = P075U2_n252CliCod[0] ;
            A1235BarNumCli = P075U2_A1235BarNumCli[0] ;
            A1234BarNomCli = P075U2_A1234BarNomCli[0] ;
            A1652BarSerDsc = P075U2_A1652BarSerDsc[0] ;
            A212BarSer = P075U2_A212BarSer[0] ;
            A125BarAncAca1 = P075U2_A125BarAncAca1[0] ;
            A136BarColNum = P075U2_A136BarColNum[0] ;
            A361DisCod = P075U2_A361DisCod[0] ;
            A252CliCod = P075U2_A252CliCod[0] ;
            n252CliCod = P075U2_n252CliCod[0] ;
            A1235BarNumCli = P075U2_A1235BarNumCli[0] ;
            A1234BarNomCli = P075U2_A1234BarNomCli[0] ;
            A1652BarSerDsc = P075U2_A1652BarSerDsc[0] ;
            A212BarSer = P075U2_A212BarSer[0] ;
            A125BarAncAca1 = P075U2_A125BarAncAca1[0] ;
            A136BarColNum = P075U2_A136BarColNum[0] ;
            A392DisUniMed = P075U2_A392DisUniMed[0] ;
            A44AlbRecCod = P075U2_A44AlbRecCod[0] ;
            A46AlbREnt = P075U2_A46AlbREnt[0] ;
            AV12CodPieza = GXutil.trim( A46AlbREnt) + " " + GXutil.trim( A200BarPieCod) + " " + GXutil.trim( GXutil.str( A3858BarTroCod, 10, 0)) ;
            AV14LitCal = httpContext.getMessage( "PRIMERA", "") ;
            if ( A4990BarTroCal == 2 )
            {
               AV14LitCal = httpContext.getMessage( "SEGUNDA", "") ;
            }
            AV16Rend = A3860BarTroMet.divide(A6556BarTroKil, 18, java.math.RoundingMode.DOWN) ;
            AV8Barcode = "*" + GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + A130BarCodPar + GXutil.padl( GXutil.trim( A200BarPieCod), (short)(9), " ") + GXutil.padl( GXutil.trim( GXutil.str( A3858BarTroCod, 10, 0)), (short)(3), " ") + "*" ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               h75U0( false, 156) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6556BarTroKil, "ZZZZZ9.99")), 233, Gx_line+100, 275, Gx_line+115, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 43, Gx_line+38, 88, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12CodPieza, "")), 95, Gx_line+38, 233, Gx_line+58, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 43, Gx_line+58, 90, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 250, Gx_line+80, 284, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 285, Gx_line+80, 304, Gx_line+95, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 206, Gx_line+100, 232, Gx_line+115, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3860BarTroMet, "ZZZZZ9.99")), 94, Gx_line+99, 160, Gx_line+116, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Largo", ""), 44, Gx_line+99, 78, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14LitCal, "")), 293, Gx_line+100, 344, Gx_line+115, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Rend, "9.99")), 319, Gx_line+80, 344, Gx_line+95, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R:", ""), 306, Gx_line+80, 317, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 94, Gx_line+60, 177, Gx_line+76, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 182, Gx_line+60, 343, Gx_line+75, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 140, Gx_line+79, 247, Gx_line+96, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 94, Gx_line+79, 138, Gx_line+96, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 43, Gx_line+79, 75, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 322, Gx_line+41, 329, Gx_line+58, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 331, Gx_line+41, 345, Gx_line+58, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 256, Gx_line+41, 319, Gx_line+58, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HR", ""), 235, Gx_line+41, 255, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 182, Gx_line+99, 199, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 277, Gx_line+100, 292, Gx_line+115, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Verdana", 20, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ITALCOLORE S.A.", ""), 45, Gx_line+4, 319, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Barcode, "")), 14, Gx_line+121, 381, Gx_line+129, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Barcode, "")), 14, Gx_line+140, 381, Gx_line+150, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Barcode, "")), 14, Gx_line+130, 381, Gx_line+138, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 322, Gx_line+4, 367, Gx_line+22, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+156) ;
            }
            else if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               h75U0( false, 156) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6556BarTroKil, "ZZZZZ9.99")), 94, Gx_line+99, 160, Gx_line+116, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 45, Gx_line+99, 77, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3860BarTroMet, "ZZZZZ9.99")), 233, Gx_line+100, 275, Gx_line+115, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Largo", ""), 202, Gx_line+100, 232, Gx_line+115, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 182, Gx_line+99, 200, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 279, Gx_line+100, 291, Gx_line+115, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pieza", ""), 44, Gx_line+38, 89, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12CodPieza, "")), 95, Gx_line+38, 233, Gx_line+58, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 44, Gx_line+58, 91, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 250, Gx_line+80, 284, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 285, Gx_line+80, 304, Gx_line+95, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14LitCal, "")), 293, Gx_line+100, 344, Gx_line+115, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Rend, "9.99")), 319, Gx_line+80, 344, Gx_line+95, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R:", ""), 306, Gx_line+80, 317, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 95, Gx_line+60, 178, Gx_line+76, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 183, Gx_line+60, 344, Gx_line+75, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 141, Gx_line+79, 248, Gx_line+96, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 95, Gx_line+79, 139, Gx_line+96, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 44, Gx_line+79, 76, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 322, Gx_line+42, 329, Gx_line+59, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 331, Gx_line+42, 345, Gx_line+59, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 256, Gx_line+42, 319, Gx_line+59, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HR", ""), 235, Gx_line+42, 255, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Verdana", 20, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ITALCOLORE S.A.", ""), 46, Gx_line+4, 320, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 18, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Barcode, "")), 14, Gx_line+121, 381, Gx_line+129, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Barcode, "")), 14, Gx_line+140, 381, Gx_line+150, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Barcode, "")), 14, Gx_line+130, 381, Gx_line+138, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 322, Gx_line+4, 367, Gx_line+22, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+156) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h75U0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h75U0( boolean bFoot ,
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
      this.aP0[0] = retiita2.this.A396EmprCod;
      this.aP1[0] = retiita2.this.A129BarCod;
      this.aP2[0] = retiita2.this.A132BarCodReo;
      this.aP3[0] = retiita2.this.A130BarCodPar;
      this.aP4[0] = retiita2.this.A200BarPieCod;
      this.aP5[0] = retiita2.this.A3858BarTroCod;
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
      P075U2_A361DisCod = new int[1] ;
      P075U2_A44AlbRecCod = new int[1] ;
      P075U2_A396EmprCod = new String[] {""} ;
      P075U2_A129BarCod = new int[1] ;
      P075U2_A132BarCodReo = new byte[1] ;
      P075U2_A130BarCodPar = new String[] {""} ;
      P075U2_A200BarPieCod = new String[] {""} ;
      P075U2_A3858BarTroCod = new short[1] ;
      P075U2_A46AlbREnt = new String[] {""} ;
      P075U2_A4990BarTroCal = new byte[1] ;
      P075U2_n4990BarTroCal = new boolean[] {false} ;
      P075U2_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P075U2_n6556BarTroKil = new boolean[] {false} ;
      P075U2_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P075U2_n3860BarTroMet = new boolean[] {false} ;
      P075U2_A392DisUniMed = new String[] {""} ;
      P075U2_A252CliCod = new int[1] ;
      P075U2_n252CliCod = new boolean[] {false} ;
      P075U2_A1235BarNumCli = new int[1] ;
      P075U2_A1234BarNomCli = new String[] {""} ;
      P075U2_A1652BarSerDsc = new String[] {""} ;
      P075U2_A212BarSer = new String[] {""} ;
      P075U2_A125BarAncAca1 = new short[1] ;
      P075U2_A136BarColNum = new int[1] ;
      A46AlbREnt = "" ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      AV12CodPieza = "" ;
      AV14LitCal = "" ;
      AV16Rend = DecimalUtil.ZERO ;
      AV8Barcode = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.retiita2__default(),
         new Object[] {
             new Object[] {
            P075U2_A361DisCod, P075U2_A44AlbRecCod, P075U2_A396EmprCod, P075U2_A129BarCod, P075U2_A132BarCodReo, P075U2_A130BarCodPar, P075U2_A200BarPieCod, P075U2_A3858BarTroCod, P075U2_A46AlbREnt, P075U2_A4990BarTroCal,
            P075U2_n4990BarTroCal, P075U2_A6556BarTroKil, P075U2_n6556BarTroKil, P075U2_A3860BarTroMet, P075U2_n3860BarTroMet, P075U2_A392DisUniMed, P075U2_A252CliCod, P075U2_n252CliCod, P075U2_A1235BarNumCli, P075U2_A1234BarNomCli,
            P075U2_A1652BarSerDsc, P075U2_A212BarSer, P075U2_A125BarAncAca1, P075U2_A136BarColNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A4990BarTroCal ;
   private short A3858BarTroCod ;
   private short A125BarAncAca1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A6556BarTroKil ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal AV16Rend ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String A46AlbREnt ;
   private String A392DisUniMed ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String AV12CodPieza ;
   private String AV14LitCal ;
   private String AV8Barcode ;
   private boolean n4990BarTroCal ;
   private boolean n6556BarTroKil ;
   private boolean n3860BarTroMet ;
   private boolean n252CliCod ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P075U2_A361DisCod ;
   private int[] P075U2_A44AlbRecCod ;
   private String[] P075U2_A396EmprCod ;
   private int[] P075U2_A129BarCod ;
   private byte[] P075U2_A132BarCodReo ;
   private String[] P075U2_A130BarCodPar ;
   private String[] P075U2_A200BarPieCod ;
   private short[] P075U2_A3858BarTroCod ;
   private String[] P075U2_A46AlbREnt ;
   private byte[] P075U2_A4990BarTroCal ;
   private boolean[] P075U2_n4990BarTroCal ;
   private java.math.BigDecimal[] P075U2_A6556BarTroKil ;
   private boolean[] P075U2_n6556BarTroKil ;
   private java.math.BigDecimal[] P075U2_A3860BarTroMet ;
   private boolean[] P075U2_n3860BarTroMet ;
   private String[] P075U2_A392DisUniMed ;
   private int[] P075U2_A252CliCod ;
   private boolean[] P075U2_n252CliCod ;
   private int[] P075U2_A1235BarNumCli ;
   private String[] P075U2_A1234BarNomCli ;
   private String[] P075U2_A1652BarSerDsc ;
   private String[] P075U2_A212BarSer ;
   private short[] P075U2_A125BarAncAca1 ;
   private int[] P075U2_A136BarColNum ;
}

final  class retiita2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P075U2", "SELECT T2.DisCod, T4.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarTroCod, T5.AlbREnt, T1.BarTroCal, T1.BarTroKil, T1.BarTroMet, T3.DisUniMed, T2.CliCod, T2.BarNumCli, T2.BarNomCli, T2.BarSerDsc, T2.BarSer, T2.BarAncAca1, T2.BarColNum FROM ((((TXPBARTRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) INNER JOIN TXPBARPIE T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.BarPieCod = T1.BarPieCod) LEFT JOIN TXPALBREC T5 ON T5.EmprCod = T1.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? and T1.BarTroCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 13);
               ((String[]) buf[20])[0] = rslt.getString(17, 26);
               ((String[]) buf[21])[0] = rslt.getString(18, 16);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((int[]) buf[23])[0] = rslt.getInt(20);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

