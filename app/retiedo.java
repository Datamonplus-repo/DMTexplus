package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class retiedo extends GXReport
{
   public retiedo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( retiedo.class ), "" );
   }

   public retiedo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 )
   {
      retiedo.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      retiedo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      retiedo.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      retiedo.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      retiedo.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      retiedo.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      retiedo.this.A3621AlbPckLin = aP5[0];
      this.aP5 = aP5;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIEDO", "", 2, 1, 256, 14299, 3686, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiquetas Edolan") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P077L2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P077L2_A361DisCod[0] ;
            A966PartCod = P077L2_A966PartCod[0] ;
            n966PartCod = P077L2_n966PartCod[0] ;
            A3623AlbPckKn = P077L2_A3623AlbPckKn[0] ;
            n3623AlbPckKn = P077L2_n3623AlbPckKn[0] ;
            A3624AlbPckKb = P077L2_A3624AlbPckKb[0] ;
            n3624AlbPckKb = P077L2_n3624AlbPckKb[0] ;
            A1652BarSerDsc = P077L2_A1652BarSerDsc[0] ;
            A2311BarCliDes = P077L2_A2311BarCliDes[0] ;
            A3622AlbPckCaj = P077L2_A3622AlbPckCaj[0] ;
            n3622AlbPckCaj = P077L2_n3622AlbPckCaj[0] ;
            A34AlbProfch = P077L2_A34AlbProfch[0] ;
            A3626AlbPckUni = P077L2_A3626AlbPckUni[0] ;
            n3626AlbPckUni = P077L2_n3626AlbPckUni[0] ;
            A136BarColNum = P077L2_A136BarColNum[0] ;
            A34AlbProfch = P077L2_A34AlbProfch[0] ;
            A361DisCod = P077L2_A361DisCod[0] ;
            A1652BarSerDsc = P077L2_A1652BarSerDsc[0] ;
            A2311BarCliDes = P077L2_A2311BarCliDes[0] ;
            A136BarColNum = P077L2_A136BarColNum[0] ;
            A966PartCod = P077L2_A966PartCod[0] ;
            n966PartCod = P077L2_n966PartCod[0] ;
            AV8PartCod = GXutil.substring( A966PartCod, 1, 4) ;
            AV9Kilos = A3624AlbPckKb.subtract(A3623AlbPckKn) ;
            AV12BarSerDSc = GXutil.trim( A1652BarSerDsc) ;
            AV10CliCod = A2311BarCliDes ;
            /* Execute user subroutine: 'CLIDES' */
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
            AV13BarCode = "*" + GXutil.trim( A3622AlbPckCaj) + "*" ;
            if ( 0 == 1 )
            {
               h77L0( false, 367) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarCode, "")), 8, Gx_line+317, 235, Gx_line+336, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarCode, "")), 8, Gx_line+341, 235, Gx_line+360, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliNom, "")), 8, Gx_line+209, 235, Gx_line+223, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12BarSerDSc, "")), 8, Gx_line+78, 235, Gx_line+92, 1, 0, 0, 0) ;
               getPrinter().GxDrawRect(8, Gx_line+1, 235, Gx_line+367, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EDOLAN SAIC", ""), 9, Gx_line+7, 236, Gx_line+40, 1, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+46, 235, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Caja :", ""), 14, Gx_line+53, 84, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3622AlbPckCaj, "")), 128, Gx_line+53, 229, Gx_line+73, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 154, Gx_line+97, 230, Gx_line+118, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Partida :", ""), 14, Gx_line+123, 118, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color :", ""), 14, Gx_line+97, 95, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote :", ""), 14, Gx_line+148, 84, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8PartCod, "")), 179, Gx_line+123, 230, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 89, Gx_line+148, 190, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 202, Gx_line+148, 216, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 217, Gx_line+148, 231, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+174, 235, Gx_line+174, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Conos :", ""), 14, Gx_line+180, 88, Gx_line+197, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3626AlbPckUni), "ZZZ9")), 89, Gx_line+180, 136, Gx_line+198, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+202, 235, Gx_line+202, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(134, Gx_line+175, 134, Gx_line+202, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 138, Gx_line+180, 231, Gx_line+198, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+228, 235, Gx_line+228, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Bruto :", ""), 14, Gx_line+232, 95, Gx_line+252, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3624AlbPckKb, "ZZZZZ9.99")), 117, Gx_line+235, 231, Gx_line+256, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Kilos, "ZZZZZ9.99")), 117, Gx_line+261, 231, Gx_line+282, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tara :", ""), 14, Gx_line+265, 84, Gx_line+285, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3623AlbPckKn, "ZZZZZ9.99")), 93, Gx_line+286, 235, Gx_line+312, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Neto :", ""), 14, Gx_line+286, 109, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(0, Gx_line+0, 104, Gx_line+86, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+367) ;
            }
            else
            {
               h77L0( false, 367) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarCode, "")), 8, Gx_line+317, 235, Gx_line+336, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13BarCode, "")), 8, Gx_line+341, 235, Gx_line+360, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliNom, "")), 8, Gx_line+209, 235, Gx_line+223, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12BarSerDSc, "")), 8, Gx_line+78, 235, Gx_line+92, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EDOLAN SAIC", ""), 9, Gx_line+7, 236, Gx_line+40, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Caja :", ""), 14, Gx_line+53, 84, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3622AlbPckCaj, "")), 128, Gx_line+53, 229, Gx_line+73, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 154, Gx_line+97, 230, Gx_line+118, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Partida :", ""), 14, Gx_line+123, 118, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color :", ""), 14, Gx_line+97, 95, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote :", ""), 14, Gx_line+148, 84, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8PartCod, "")), 179, Gx_line+123, 230, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 89, Gx_line+148, 190, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 202, Gx_line+148, 216, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 217, Gx_line+148, 231, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Conos :", ""), 14, Gx_line+180, 88, Gx_line+197, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3626AlbPckUni), "ZZZ9")), 89, Gx_line+180, 136, Gx_line+198, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 138, Gx_line+180, 231, Gx_line+198, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Bruto :", ""), 14, Gx_line+232, 95, Gx_line+252, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3624AlbPckKb, "ZZZZZ9.99")), 117, Gx_line+235, 231, Gx_line+256, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Kilos, "ZZZZZ9.99")), 117, Gx_line+261, 231, Gx_line+282, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tara :", ""), 14, Gx_line+265, 84, Gx_line+285, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3623AlbPckKn, "ZZZZZ9.99")), 93, Gx_line+286, 235, Gx_line+312, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Neto :", ""), 14, Gx_line+286, 109, Gx_line+311, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+367) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h77L0( true, 0) ;
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
      /* 'CLIDES' Routine */
      returnInSub = false ;
      /* Using cursor P077L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P077L3_A252CliCod[0] ;
         A279CliNom = P077L3_A279CliNom[0] ;
         AV11CliNom = GXutil.trim( A279CliNom) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void h77L0( boolean bFoot ,
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
      this.aP0[0] = retiedo.this.A396EmprCod;
      this.aP1[0] = retiedo.this.A30AlbProCod;
      this.aP2[0] = retiedo.this.A129BarCod;
      this.aP3[0] = retiedo.this.A132BarCodReo;
      this.aP4[0] = retiedo.this.A130BarCodPar;
      this.aP5[0] = retiedo.this.A3621AlbPckLin;
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
      P077L2_A361DisCod = new int[1] ;
      P077L2_A396EmprCod = new String[] {""} ;
      P077L2_A30AlbProCod = new long[1] ;
      P077L2_A129BarCod = new int[1] ;
      P077L2_A132BarCodReo = new byte[1] ;
      P077L2_A130BarCodPar = new String[] {""} ;
      P077L2_A3621AlbPckLin = new short[1] ;
      P077L2_A966PartCod = new String[] {""} ;
      P077L2_n966PartCod = new boolean[] {false} ;
      P077L2_A3623AlbPckKn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077L2_n3623AlbPckKn = new boolean[] {false} ;
      P077L2_A3624AlbPckKb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077L2_n3624AlbPckKb = new boolean[] {false} ;
      P077L2_A1652BarSerDsc = new String[] {""} ;
      P077L2_A2311BarCliDes = new int[1] ;
      P077L2_A3622AlbPckCaj = new String[] {""} ;
      P077L2_n3622AlbPckCaj = new boolean[] {false} ;
      P077L2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P077L2_A3626AlbPckUni = new short[1] ;
      P077L2_n3626AlbPckUni = new boolean[] {false} ;
      P077L2_A136BarColNum = new int[1] ;
      A966PartCod = "" ;
      A3623AlbPckKn = DecimalUtil.ZERO ;
      A3624AlbPckKb = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A3622AlbPckCaj = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV8PartCod = "" ;
      AV9Kilos = DecimalUtil.ZERO ;
      AV12BarSerDSc = "" ;
      AV13BarCode = "" ;
      AV11CliNom = "" ;
      P077L3_A396EmprCod = new String[] {""} ;
      P077L3_A252CliCod = new int[1] ;
      P077L3_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.retiedo__default(),
         new Object[] {
             new Object[] {
            P077L2_A361DisCod, P077L2_A396EmprCod, P077L2_A30AlbProCod, P077L2_A129BarCod, P077L2_A132BarCodReo, P077L2_A130BarCodPar, P077L2_A3621AlbPckLin, P077L2_A966PartCod, P077L2_n966PartCod, P077L2_A3623AlbPckKn,
            P077L2_n3623AlbPckKn, P077L2_A3624AlbPckKb, P077L2_n3624AlbPckKb, P077L2_A1652BarSerDsc, P077L2_A2311BarCliDes, P077L2_A3622AlbPckCaj, P077L2_n3622AlbPckCaj, P077L2_A34AlbProfch, P077L2_A3626AlbPckUni, P077L2_n3626AlbPckUni,
            P077L2_A136BarColNum
            }
            , new Object[] {
            P077L3_A396EmprCod, P077L3_A252CliCod, P077L3_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A3621AlbPckLin ;
   private short A3626AlbPckUni ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A2311BarCliDes ;
   private int A136BarColNum ;
   private int AV10CliCod ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A3623AlbPckKn ;
   private java.math.BigDecimal A3624AlbPckKb ;
   private java.math.BigDecimal AV9Kilos ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A1652BarSerDsc ;
   private String A3622AlbPckCaj ;
   private String AV8PartCod ;
   private String AV12BarSerDSc ;
   private String AV13BarCode ;
   private String AV11CliNom ;
   private String A279CliNom ;
   private java.util.Date A34AlbProfch ;
   private boolean n966PartCod ;
   private boolean n3623AlbPckKn ;
   private boolean n3624AlbPckKb ;
   private boolean n3622AlbPckCaj ;
   private boolean n3626AlbPckUni ;
   private boolean returnInSub ;
   private short[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P077L2_A361DisCod ;
   private String[] P077L2_A396EmprCod ;
   private long[] P077L2_A30AlbProCod ;
   private int[] P077L2_A129BarCod ;
   private byte[] P077L2_A132BarCodReo ;
   private String[] P077L2_A130BarCodPar ;
   private short[] P077L2_A3621AlbPckLin ;
   private String[] P077L2_A966PartCod ;
   private boolean[] P077L2_n966PartCod ;
   private java.math.BigDecimal[] P077L2_A3623AlbPckKn ;
   private boolean[] P077L2_n3623AlbPckKn ;
   private java.math.BigDecimal[] P077L2_A3624AlbPckKb ;
   private boolean[] P077L2_n3624AlbPckKb ;
   private String[] P077L2_A1652BarSerDsc ;
   private int[] P077L2_A2311BarCliDes ;
   private String[] P077L2_A3622AlbPckCaj ;
   private boolean[] P077L2_n3622AlbPckCaj ;
   private java.util.Date[] P077L2_A34AlbProfch ;
   private short[] P077L2_A3626AlbPckUni ;
   private boolean[] P077L2_n3626AlbPckUni ;
   private int[] P077L2_A136BarColNum ;
   private String[] P077L3_A396EmprCod ;
   private int[] P077L3_A252CliCod ;
   private String[] P077L3_A279CliNom ;
}

final  class retiedo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P077L2", "SELECT T3.DisCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPckLin, T4.PartCod, T1.AlbPckKn, T1.AlbPckKb, T3.BarSerDsc, T3.BarCliDes, T1.AlbPckCaj, T2.AlbProfch, T1.AlbPckUni, T3.BarColNum FROM (((TXPALBPCK T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T3.DisCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.AlbPckLin = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPckLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077L3", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

