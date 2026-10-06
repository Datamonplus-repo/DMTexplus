package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class retiref extends GXReport
{
   public retiref( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( retiref.class ), "" );
   }

   public retiref( int remoteHandle ,
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
      retiref.this.aP5 = new short[] {0};
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
      retiref.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      retiref.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      retiref.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      retiref.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      retiref.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      retiref.this.A3858BarTroCod = aP5[0];
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIREF", "", 2, 1, 256, 4320, 7200, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Etiquetas Refugio") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06SA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4991BarTroOpeC = P06SA2_A4991BarTroOpeC[0] ;
            n4991BarTroOpeC = P06SA2_n4991BarTroOpeC[0] ;
            A212BarSer = P06SA2_A212BarSer[0] ;
            A4990BarTroCal = P06SA2_A4990BarTroCal[0] ;
            n4990BarTroCal = P06SA2_n4990BarTroCal[0] ;
            A3860BarTroMet = P06SA2_A3860BarTroMet[0] ;
            n3860BarTroMet = P06SA2_n3860BarTroMet[0] ;
            A44AlbRecCod = P06SA2_A44AlbRecCod[0] ;
            A58AlbRUniEnt = P06SA2_A58AlbRUniEnt[0] ;
            A3859BarTroFec = P06SA2_A3859BarTroFec[0] ;
            n3859BarTroFec = P06SA2_n3859BarTroFec[0] ;
            A4989BarTroOpeN = P06SA2_A4989BarTroOpeN[0] ;
            n4989BarTroOpeN = P06SA2_n4989BarTroOpeN[0] ;
            A182BarMat = P06SA2_A182BarMat[0] ;
            A125BarAncAca1 = P06SA2_A125BarAncAca1[0] ;
            A1652BarSerDsc = P06SA2_A1652BarSerDsc[0] ;
            A4989BarTroOpeN = P06SA2_A4989BarTroOpeN[0] ;
            n4989BarTroOpeN = P06SA2_n4989BarTroOpeN[0] ;
            A212BarSer = P06SA2_A212BarSer[0] ;
            A182BarMat = P06SA2_A182BarMat[0] ;
            A125BarAncAca1 = P06SA2_A125BarAncAca1[0] ;
            A1652BarSerDsc = P06SA2_A1652BarSerDsc[0] ;
            A44AlbRecCod = P06SA2_A44AlbRecCod[0] ;
            A58AlbRUniEnt = P06SA2_A58AlbRUniEnt[0] ;
            AV8Barras = "*" ;
            AV8Barras += GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") ;
            AV8Barras += GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") ;
            AV8Barras += GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "%") ;
            AV8Barras += GXutil.padl( GXutil.trim( GXutil.str( A3858BarTroCod, 10, 0)), (short)(3), "0") ;
            AV8Barras += "*" ;
            AV12Barras1 = "*" ;
            AV12Barras1 += GXutil.padr( GXutil.trim( A212BarSer), 16, "%") ;
            AV12Barras1 += GXutil.padl( GXutil.trim( GXutil.str( A4990BarTroCal, 10, 0)), (short)(1), "0") ;
            AV12Barras1 += GXutil.padl( GXutil.trim( GXutil.str( GXutil.Int( DecimalUtil.decToDouble(A3860BarTroMet)), 10, 0)), (short)(3), "0") ;
            AV12Barras1 += "." ;
            AV12Barras1 += GXutil.padl( GXutil.trim( GXutil.str( (A3860BarTroMet.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A3860BarTroMet))))).multiply(DecimalUtil.doubleToDec(100)), 10, 0)), (short)(2), "0") ;
            AV12Barras1 += "*" ;
            AV16LenTalla = (byte)(GXutil.len( GXutil.trim( A212BarSer))) ;
            AV18AlbRecCod = A44AlbRecCod ;
            /* Execute user subroutine: 'PROCED' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
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
            AV15Talla = GXutil.substring( A212BarSer, AV16LenTalla, 1) ;
            /* Using cursor P06SA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1056DisComCod = P06SA3_A1056DisComCod[0] ;
               A30AlbProCod = P06SA3_A30AlbProCod[0] ;
               A2524DisComLin = P06SA3_A2524DisComLin[0] ;
               A1032FonCod = P06SA3_A1032FonCod[0] ;
               AV9DisComCod = A1056DisComCod ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( A4990BarTroCal == 1 )
            {
               AV10Calidad = httpContext.getMessage( "Primera", "") ;
            }
            else
            {
               if ( A4990BarTroCal == 2 )
               {
                  AV10Calidad = httpContext.getMessage( "Segunda", "") ;
               }
               else
               {
                  AV10Calidad = httpContext.getMessage( "Pendiente", "") ;
               }
            }
            AV11BarTroMet = A3860BarTroMet ;
            AV14Num_Def = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 8 )
            {
               AV13BarDefNMtr[GX_I-1] = AV13BarDefNMtr[1-1] ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P06SA4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5008BarTroDeNM = P06SA4_A5008BarTroDeNM[0] ;
               n5008BarTroDeNM = P06SA4_n5008BarTroDeNM[0] ;
               A4993BarTroDef = P06SA4_A4993BarTroDef[0] ;
               AV13BarDefNMtr[AV14Num_Def-1] = A5008BarTroDeNM ;
               AV14Num_Def = (byte)(AV14Num_Def+1) ;
               if ( AV14Num_Def == 9 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV17AlbRUniEnt = A58AlbRUniEnt ;
            h6SA0( false, 261) ;
            getPrinter().GxAttris("3 of 9 Barcode", 36, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Barras, "")), 0, Gx_line+0, 439, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4990BarTroCal), "9")), 430, Gx_line+45, 447, Gx_line+77, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Diseño   :", ""), 1, Gx_line+40, 85, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Talla    : ", ""), 1, Gx_line+58, 94, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho    :", ""), 1, Gx_line+78, 85, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Tela:", ""), 1, Gx_line+98, 85, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proveedor:", ""), 1, Gx_line+118, 85, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Remesa   :", ""), 1, Gx_line+135, 85, Gx_line+153, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "No.Orden :", ""), 0, Gx_line+155, 84, Gx_line+173, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Revisador:", ""), 1, Gx_line+194, 85, Gx_line+212, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 89, Gx_line+41, 307, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 89, Gx_line+79, 115, Gx_line+97, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A182BarMat, "")), 89, Gx_line+99, 223, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 89, Gx_line+156, 157, Gx_line+174, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 174, Gx_line+156, 183, Gx_line+174, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 159, Gx_line+156, 168, Gx_line+174, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9")), 264, Gx_line+81, 332, Gx_line+114, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11BarTroMet, "ZZ9.99")), 350, Gx_line+82, 451, Gx_line+115, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4989BarTroOpeN, "")), 89, Gx_line+195, 340, Gx_line+213, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A3859BarTroFec, "99/99/99"), 89, Gx_line+176, 157, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Barras1, "")), 0, Gx_line+217, 444, Gx_line+241, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubic. Defec.", ""), 342, Gx_line+119, 456, Gx_line+138, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[1-1], "ZZZ.ZZ")), 344, Gx_line+139, 395, Gx_line+157, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[4-1], "ZZZ.ZZ")), 344, Gx_line+186, 395, Gx_line+204, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[3-1], "ZZZ.ZZ")), 344, Gx_line+170, 395, Gx_line+188, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[2-1], "ZZZ.ZZ")), 344, Gx_line+154, 395, Gx_line+172, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[5-1], "ZZZ.ZZ")), 402, Gx_line+139, 453, Gx_line+157, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[6-1], "ZZZ.ZZ")), 402, Gx_line+154, 453, Gx_line+172, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[7-1], "ZZZ.ZZ")), 402, Gx_line+170, 453, Gx_line+188, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13BarDefNMtr[8-1], "ZZZ.ZZ")), 402, Gx_line+186, 453, Gx_line+204, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(397, Gx_line+135, 397, Gx_line+205, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(340, Gx_line+135, 456, Gx_line+205, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Calidad", ""), 352, Gx_line+50, 419, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.Rollo", ""), 264, Gx_line+61, 331, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Talla, "")), 89, Gx_line+59, 98, Gx_line+77, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(254, Gx_line+78, 338, Gx_line+118, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha    :", ""), 1, Gx_line+175, 85, Gx_line+193, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20ProceNom, "")), 89, Gx_line+119, 340, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Barras1, "")), 156, Gx_line+242, 287, Gx_line+258, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17AlbRUniEnt, "ZZZZZ9.99")), 89, Gx_line+138, 165, Gx_line+156, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+261) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6SA0( true, 0) ;
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
      /* 'PROCED' Routine */
      returnInSub = false ;
      /* Using cursor P06SA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18AlbRecCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A970ProceCod = P06SA5_A970ProceCod[0] ;
         n970ProceCod = P06SA5_n970ProceCod[0] ;
         A44AlbRecCod = P06SA5_A44AlbRecCod[0] ;
         A971ProceNom = P06SA5_A971ProceNom[0] ;
         n971ProceNom = P06SA5_n971ProceNom[0] ;
         A971ProceNom = P06SA5_A971ProceNom[0] ;
         n971ProceNom = P06SA5_n971ProceNom[0] ;
         AV20ProceNom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h6SA0( boolean bFoot ,
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
      this.aP0[0] = retiref.this.A396EmprCod;
      this.aP1[0] = retiref.this.A129BarCod;
      this.aP2[0] = retiref.this.A132BarCodReo;
      this.aP3[0] = retiref.this.A130BarCodPar;
      this.aP4[0] = retiref.this.A200BarPieCod;
      this.aP5[0] = retiref.this.A3858BarTroCod;
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
      P06SA2_A4991BarTroOpeC = new int[1] ;
      P06SA2_n4991BarTroOpeC = new boolean[] {false} ;
      P06SA2_A396EmprCod = new String[] {""} ;
      P06SA2_A129BarCod = new int[1] ;
      P06SA2_A132BarCodReo = new byte[1] ;
      P06SA2_A130BarCodPar = new String[] {""} ;
      P06SA2_A200BarPieCod = new String[] {""} ;
      P06SA2_A3858BarTroCod = new short[1] ;
      P06SA2_A212BarSer = new String[] {""} ;
      P06SA2_A4990BarTroCal = new byte[1] ;
      P06SA2_n4990BarTroCal = new boolean[] {false} ;
      P06SA2_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06SA2_n3860BarTroMet = new boolean[] {false} ;
      P06SA2_A44AlbRecCod = new int[1] ;
      P06SA2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06SA2_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06SA2_n3859BarTroFec = new boolean[] {false} ;
      P06SA2_A4989BarTroOpeN = new String[] {""} ;
      P06SA2_n4989BarTroOpeN = new boolean[] {false} ;
      P06SA2_A182BarMat = new String[] {""} ;
      P06SA2_A125BarAncAca1 = new short[1] ;
      P06SA2_A1652BarSerDsc = new String[] {""} ;
      A212BarSer = "" ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A3859BarTroFec = GXutil.nullDate() ;
      A4989BarTroOpeN = "" ;
      A182BarMat = "" ;
      A1652BarSerDsc = "" ;
      AV8Barras = "" ;
      AV12Barras1 = "" ;
      AV15Talla = "" ;
      P06SA3_A396EmprCod = new String[] {""} ;
      P06SA3_A129BarCod = new int[1] ;
      P06SA3_A132BarCodReo = new byte[1] ;
      P06SA3_A130BarCodPar = new String[] {""} ;
      P06SA3_A1056DisComCod = new String[] {""} ;
      P06SA3_A30AlbProCod = new long[1] ;
      P06SA3_A2524DisComLin = new byte[1] ;
      P06SA3_A1032FonCod = new String[] {""} ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      AV9DisComCod = "" ;
      AV10Calidad = "" ;
      AV11BarTroMet = DecimalUtil.ZERO ;
      AV13BarDefNMtr = new java.math.BigDecimal[8] ;
      GX_I = 1 ;
      while ( GX_I <= 8 )
      {
         AV13BarDefNMtr[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P06SA4_A396EmprCod = new String[] {""} ;
      P06SA4_A129BarCod = new int[1] ;
      P06SA4_A132BarCodReo = new byte[1] ;
      P06SA4_A130BarCodPar = new String[] {""} ;
      P06SA4_A200BarPieCod = new String[] {""} ;
      P06SA4_A3858BarTroCod = new short[1] ;
      P06SA4_A5008BarTroDeNM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06SA4_n5008BarTroDeNM = new boolean[] {false} ;
      P06SA4_A4993BarTroDef = new short[1] ;
      A5008BarTroDeNM = DecimalUtil.ZERO ;
      AV17AlbRUniEnt = DecimalUtil.ZERO ;
      AV20ProceNom = "" ;
      P06SA5_A970ProceCod = new short[1] ;
      P06SA5_n970ProceCod = new boolean[] {false} ;
      P06SA5_A396EmprCod = new String[] {""} ;
      P06SA5_A44AlbRecCod = new int[1] ;
      P06SA5_A971ProceNom = new String[] {""} ;
      P06SA5_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.retiref__default(),
         new Object[] {
             new Object[] {
            P06SA2_A4991BarTroOpeC, P06SA2_n4991BarTroOpeC, P06SA2_A396EmprCod, P06SA2_A129BarCod, P06SA2_A132BarCodReo, P06SA2_A130BarCodPar, P06SA2_A200BarPieCod, P06SA2_A3858BarTroCod, P06SA2_A212BarSer, P06SA2_A4990BarTroCal,
            P06SA2_n4990BarTroCal, P06SA2_A3860BarTroMet, P06SA2_n3860BarTroMet, P06SA2_A44AlbRecCod, P06SA2_A58AlbRUniEnt, P06SA2_A3859BarTroFec, P06SA2_n3859BarTroFec, P06SA2_A4989BarTroOpeN, P06SA2_n4989BarTroOpeN, P06SA2_A182BarMat,
            P06SA2_A125BarAncAca1, P06SA2_A1652BarSerDsc
            }
            , new Object[] {
            P06SA3_A396EmprCod, P06SA3_A129BarCod, P06SA3_A132BarCodReo, P06SA3_A130BarCodPar, P06SA3_A1056DisComCod, P06SA3_A30AlbProCod, P06SA3_A2524DisComLin, P06SA3_A1032FonCod
            }
            , new Object[] {
            P06SA4_A396EmprCod, P06SA4_A129BarCod, P06SA4_A132BarCodReo, P06SA4_A130BarCodPar, P06SA4_A200BarPieCod, P06SA4_A3858BarTroCod, P06SA4_A5008BarTroDeNM, P06SA4_n5008BarTroDeNM, P06SA4_A4993BarTroDef
            }
            , new Object[] {
            P06SA5_A970ProceCod, P06SA5_n970ProceCod, P06SA5_A396EmprCod, P06SA5_A44AlbRecCod, P06SA5_A971ProceNom, P06SA5_n971ProceNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A4990BarTroCal ;
   private byte AV16LenTalla ;
   private byte A2524DisComLin ;
   private byte AV14Num_Def ;
   private short A3858BarTroCod ;
   private short A125BarAncAca1 ;
   private short A4993BarTroDef ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4991BarTroOpeC ;
   private int A44AlbRecCod ;
   private int AV18AlbRecCod ;
   private int GX_I ;
   private int Gx_OldLine ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV11BarTroMet ;
   private java.math.BigDecimal AV13BarDefNMtr[] ;
   private java.math.BigDecimal A5008BarTroDeNM ;
   private java.math.BigDecimal AV17AlbRUniEnt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A4989BarTroOpeN ;
   private String A182BarMat ;
   private String A1652BarSerDsc ;
   private String AV8Barras ;
   private String AV12Barras1 ;
   private String AV15Talla ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String AV9DisComCod ;
   private String AV10Calidad ;
   private String AV20ProceNom ;
   private String A971ProceNom ;
   private java.util.Date A3859BarTroFec ;
   private boolean n4991BarTroOpeC ;
   private boolean n4990BarTroCal ;
   private boolean n3860BarTroMet ;
   private boolean n3859BarTroFec ;
   private boolean n4989BarTroOpeN ;
   private boolean returnInSub ;
   private boolean n5008BarTroDeNM ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P06SA2_A4991BarTroOpeC ;
   private boolean[] P06SA2_n4991BarTroOpeC ;
   private String[] P06SA2_A396EmprCod ;
   private int[] P06SA2_A129BarCod ;
   private byte[] P06SA2_A132BarCodReo ;
   private String[] P06SA2_A130BarCodPar ;
   private String[] P06SA2_A200BarPieCod ;
   private short[] P06SA2_A3858BarTroCod ;
   private String[] P06SA2_A212BarSer ;
   private byte[] P06SA2_A4990BarTroCal ;
   private boolean[] P06SA2_n4990BarTroCal ;
   private java.math.BigDecimal[] P06SA2_A3860BarTroMet ;
   private boolean[] P06SA2_n3860BarTroMet ;
   private int[] P06SA2_A44AlbRecCod ;
   private java.math.BigDecimal[] P06SA2_A58AlbRUniEnt ;
   private java.util.Date[] P06SA2_A3859BarTroFec ;
   private boolean[] P06SA2_n3859BarTroFec ;
   private String[] P06SA2_A4989BarTroOpeN ;
   private boolean[] P06SA2_n4989BarTroOpeN ;
   private String[] P06SA2_A182BarMat ;
   private short[] P06SA2_A125BarAncAca1 ;
   private String[] P06SA2_A1652BarSerDsc ;
   private String[] P06SA3_A396EmprCod ;
   private int[] P06SA3_A129BarCod ;
   private byte[] P06SA3_A132BarCodReo ;
   private String[] P06SA3_A130BarCodPar ;
   private String[] P06SA3_A1056DisComCod ;
   private long[] P06SA3_A30AlbProCod ;
   private byte[] P06SA3_A2524DisComLin ;
   private String[] P06SA3_A1032FonCod ;
   private String[] P06SA4_A396EmprCod ;
   private int[] P06SA4_A129BarCod ;
   private byte[] P06SA4_A132BarCodReo ;
   private String[] P06SA4_A130BarCodPar ;
   private String[] P06SA4_A200BarPieCod ;
   private short[] P06SA4_A3858BarTroCod ;
   private java.math.BigDecimal[] P06SA4_A5008BarTroDeNM ;
   private boolean[] P06SA4_n5008BarTroDeNM ;
   private short[] P06SA4_A4993BarTroDef ;
   private short[] P06SA5_A970ProceCod ;
   private boolean[] P06SA5_n970ProceCod ;
   private String[] P06SA5_A396EmprCod ;
   private int[] P06SA5_A44AlbRecCod ;
   private String[] P06SA5_A971ProceNom ;
   private boolean[] P06SA5_n971ProceNom ;
}

final  class retiref__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06SA2", "SELECT T1.BarTroOpeC AS BarTroOpeC, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarTroCod, T3.BarSer, T1.BarTroCal, T1.BarTroMet, T4.AlbRecCod, T5.AlbRUniEnt, T1.BarTroFec, T2.OpeNom AS BarTroOpeN, T3.BarMat, T3.BarAncAca1, T3.BarSerDsc FROM ((((TXPBARTRO T1 LEFT JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.BarTroOpeC) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPBARPIE T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.BarPieCod = T1.BarPieCod) LEFT JOIN TXPALBREC T5 ON T5.EmprCod = T1.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? and T1.BarTroCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06SA3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComCod, AlbProCod, DisComLin, FonCod FROM TXPALBEST WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06SA4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDeNM, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06SA5", "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 9);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

