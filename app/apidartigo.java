package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apidartigo extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apidartigo pgm = new apidartigo (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};
      short[] aP4 = new short[] {0};
      byte[] aP5 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (short) GXutil.lval( args[4]);
         aP5[0] = (byte) GXutil.lval( args[5]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public apidartigo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apidartigo.class ), "" );
   }

   public apidartigo( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 )
   {
      apidartigo.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      apidartigo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apidartigo.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      apidartigo.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      apidartigo.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      apidartigo.this.AV30BarOrdlin = aP4[0];
      this.aP4 = aP4;
      apidartigo.this.AV36opcion = aP5[0];
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
      M_bot = 22 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("artigo.pdf") ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*22)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV23ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDARTI", ""), GXv_char1) ;
         apidartigo.this.AV23ContDsc = GXv_char1[0] ;
         /* Using cursor P05VP3 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P05VP3_A361DisCod[0] ;
            A252CliCod = P05VP3_A252CliCod[0] ;
            n252CliCod = P05VP3_n252CliCod[0] ;
            A4466BarAcaAnh = P05VP3_A4466BarAcaAnh[0] ;
            A5291BarTipCor = P05VP3_A5291BarTipCor[0] ;
            A2829BarProPer = P05VP3_A2829BarProPer[0] ;
            A11852Nxt_ArtCl2 = P05VP3_A11852Nxt_ArtCl2[0] ;
            A11850Nxt_Mdlo2 = P05VP3_A11850Nxt_Mdlo2[0] ;
            A11851Nxt_Sta2 = P05VP3_A11851Nxt_Sta2[0] ;
            A1909BarGraAca = P05VP3_A1909BarGraAca[0] ;
            A125BarAncAca1 = P05VP3_A125BarAncAca1[0] ;
            A1652BarSerDsc = P05VP3_A1652BarSerDsc[0] ;
            A212BarSer = P05VP3_A212BarSer[0] ;
            A4812BarEncCli = P05VP3_A4812BarEncCli[0] ;
            A1235BarNumCli = P05VP3_A1235BarNumCli[0] ;
            A1234BarNomCli = P05VP3_A1234BarNomCli[0] ;
            A135BarColNom = P05VP3_A135BarColNom[0] ;
            A279CliNom = P05VP3_A279CliNom[0] ;
            A11662BarOrdComp = P05VP3_A11662BarOrdComp[0] ;
            A1503BarPart = P05VP3_A1503BarPart[0] ;
            A9777BarItem3 = P05VP3_A9777BarItem3[0] ;
            A166BarKgm = P05VP3_A166BarKgm[0] ;
            A199BarPie1 = P05VP3_A199BarPie1[0] ;
            A365DisDes = P05VP3_A365DisDes[0] ;
            A898BarPieNDes = P05VP3_A898BarPieNDes[0] ;
            A279CliNom = P05VP3_A279CliNom[0] ;
            A166BarKgm = P05VP3_A166BarKgm[0] ;
            A199BarPie1 = P05VP3_A199BarPie1[0] ;
            A898BarPieNDes = P05VP3_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV8Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_int3[0] = A4466BarAcaAnh ;
            GXv_char4[0] = AV17Tb1_dscfb ;
            new app.pptable2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
            apidartigo.this.A396EmprCod = GXv_char1[0] ;
            apidartigo.this.A252CliCod = GXv_int2[0] ;
            apidartigo.this.A4466BarAcaAnh = GXv_int3[0] ;
            apidartigo.this.AV17Tb1_dscfb = GXv_char4[0] ;
            AV12DisEnt = GXutil.substring( AV17Tb1_dscfb, 1, 30) ;
            AV18i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV9Tab_obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05VP4 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A377DisObsTxt = P05VP4_A377DisObsTxt[0] ;
               A376DisObsLin = P05VP4_A376DisObsLin[0] ;
               if ( AV18i > 4 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV9Tab_obs[AV18i-1] = A377DisObsTxt ;
               AV18i = (byte)(AV18i+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV26Exportacion = ((GXutil.strcmp(A5291BarTipCor, httpContext.getMessage( "SI", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NAO", "")) ;
            AV25Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S111 ();
            if ( returnInSub )
            {
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
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV19Tab_norma[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV20Tab_normanc[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV21Tab_normast[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV37tab_nc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV24j = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV16Tab_normas[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05VP5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13216DisNormDsc = P05VP5_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P05VP5_n13216DisNormDsc[0] ;
               A13215DisNormNC = P05VP5_A13215DisNormNC[0] ;
               A13214DisNormSt = P05VP5_A13214DisNormSt[0] ;
               A13213DisNormID = P05VP5_A13213DisNormID[0] ;
               A13216DisNormDsc = P05VP5_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P05VP5_n13216DisNormDsc[0] ;
               if ( AV24j <= 5 )
               {
                  AV19Tab_norma[AV24j-1] = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                  AV20Tab_normanc[AV24j-1] = ((GXutil.strcmp(A13215DisNormNC, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV37tab_nc[AV24j-1] = httpContext.getMessage( "N/Conforme", "") ;
                  AV21Tab_normast[AV24j-1] = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV22Norma = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                  AV27status = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV16Tab_normas[AV24j-1] = GXutil.padr( GXutil.trim( AV22Norma), 15, " ") + " " + AV27status + " " + httpContext.getMessage( "N/Conforme?: ", "") + ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
               }
               AV24j = (byte)(AV24j+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV10Nxt_artcl2 = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
            AV14lista = ((GXutil.strcmp("", A11850Nxt_Mdlo2)==0) ? httpContext.getMessage( "NAO", "") : GXutil.substring( A11850Nxt_Mdlo2, 1, 3)) ;
            AV15relatorio = ((GXutil.strcmp("", A11851Nxt_Sta2)==0) ? httpContext.getMessage( "NAO", "") : GXutil.substring( A11851Nxt_Sta2, 1, 3)) ;
            AV13Procenom = " " ;
            /* Using cursor P05VP6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A203BarPieKil = P05VP6_A203BarPieKil[0] ;
               A44AlbRecCod = P05VP6_A44AlbRecCod[0] ;
               A200BarPieCod = P05VP6_A200BarPieCod[0] ;
               AV28Albreccod = A44AlbRecCod ;
               /* Execute user subroutine: 'PROCEDENCIA' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
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
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV14lista = GXutil.substring( A11850Nxt_Mdlo2, 1, 3) ;
            AV15relatorio = GXutil.substring( A11851Nxt_Sta2, 1, 3) ;
            h5VP0( false, 122) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 14, Gx_line+14, 240, Gx_line+74) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O. Serviço Nº", ""), 501, Gx_line+58, 578, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Hdr, "")), 589, Gx_line+58, 647, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+81, 759, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "IDENTIFICAÇÃO DO ARTIGO", ""), 289, Gx_line+88, 448, Gx_line+104, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+122) ;
            h5VP0( false, 149) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 14, Gx_line+14, 59, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 81, Gx_line+14, 126, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 135, Gx_line+14, 292, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 433, Gx_line+14, 458, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 488, Gx_line+14, 557, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 569, Gx_line+14, 638, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 650, Gx_line+14, 695, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade:", ""), 14, Gx_line+41, 86, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 108, Gx_line+41, 175, Gx_line+58, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Peças:", ""), 14, Gx_line+68, 67, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 130, Gx_line+68, 175, Gx_line+85, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 14, Gx_line+95, 39, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_obs[1-1], "")), 68, Gx_line+95, 382, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_obs[2-1], "")), 68, Gx_line+110, 382, Gx_line+127, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_obs[3-1], "")), 68, Gx_line+126, 382, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Talao:", ""), 433, Gx_line+33, 484, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 488, Gx_line+33, 593, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 488, Gx_line+54, 572, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 582, Gx_line+54, 718, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 433, Gx_line+54, 469, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Largura:", ""), 433, Gx_line+75, 484, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 486, Gx_line+75, 509, Gx_line+92, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gramagem:", ""), 541, Gx_line+75, 611, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 622, Gx_line+75, 652, Gx_line+92, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+149) ;
            h5VP0( false, 167) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 759, Gx_line+164, 1, 0, 0, 0, 1, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Clear to Wear:", ""), 14, Gx_line+7, 99, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Exportaçao:", ""), 14, Gx_line+29, 86, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Nxt_artcl2, "")), 108, Gx_line+29, 265, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Dsc_Idtx, "")), 108, Gx_line+5, 276, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc Cliente:", ""), 14, Gx_line+51, 99, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9777BarItem3, "")), 108, Gx_line+51, 213, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº da Partida:", ""), 14, Gx_line+73, 94, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")), 108, Gx_line+73, 138, Gx_line+90, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 14, Gx_line+117, 56, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12DisEnt, "")), 108, Gx_line+117, 265, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P.O.:", ""), 14, Gx_line+139, 40, Gx_line+155, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), 108, Gx_line+139, 460, Gx_line+155, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Malheiro:", ""), 14, Gx_line+95, 69, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Procenom, "")), 108, Gx_line+95, 265, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Relatorio de Analide da composição da Malha:", ""), 439, Gx_line+29, 711, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Motivo N/C:", ""), 484, Gx_line+143, 550, Gx_line+159, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15relatorio, "")), 714, Gx_line+28, 756, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_norma[1-1], "")), 484, Gx_line+48, 563, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_norma[2-1], "")), 484, Gx_line+64, 563, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_norma[3-1], "")), 484, Gx_line+79, 563, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_norma[4-1], "")), 484, Gx_line+95, 563, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Tab_norma[5-1], "")), 484, Gx_line+110, 563, Gx_line+127, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Tab_normast[1-1], "")), 572, Gx_line+48, 611, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Tab_normast[2-1], "")), 572, Gx_line+64, 611, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Tab_normast[3-1], "")), 572, Gx_line+79, 611, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Tab_normast[4-1], "")), 572, Gx_line+95, 611, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Tab_normast[4-1], "")), 572, Gx_line+110, 611, Gx_line+127, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_nc[1-1], "")), 641, Gx_line+48, 705, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_nc[2-1], "")), 641, Gx_line+64, 705, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_nc[3-1], "")), 641, Gx_line+79, 705, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_nc[4-1], "")), 641, Gx_line+95, 705, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37tab_nc[5-1], "")), 641, Gx_line+110, 705, Gx_line+127, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Tab_normanc[1-1], "")), 714, Gx_line+48, 756, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Tab_normanc[2-1], "")), 714, Gx_line+64, 756, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Tab_normanc[3-1], "")), 714, Gx_line+79, 756, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Tab_normanc[4-1], "")), 714, Gx_line+95, 756, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Tab_normanc[5-1], "")), 714, Gx_line+110, 756, Gx_line+128, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Motivo, "")), 558, Gx_line+143, 747, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14lista, "")), 714, Gx_line+7, 756, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lista de substâncias Restritas na Fabricação:", ""), 439, Gx_line+7, 710, Gx_line+23, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+167) ;
            if ( ( AV36opcion == 2 ) || ( AV36opcion == 3 ) )
            {
               AV31IniCC = (byte)(0) ;
               AV47GXLvl62 = (byte)(0) ;
               /* Using cursor P05VP7 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV30BarOrdlin)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A194BarOrdLin = P05VP7_A194BarOrdLin[0] ;
                  A4034CCTLin = P05VP7_A4034CCTLin[0] ;
                  A4031CCTCod = P05VP7_A4031CCTCod[0] ;
                  A4035CCVal = P05VP7_A4035CCVal[0] ;
                  A4048CCTLinTpoI = P05VP7_A4048CCTLinTpoI[0] ;
                  A13252CCEspecif = P05VP7_A13252CCEspecif[0] ;
                  A13251CCMetodo = P05VP7_A13251CCMetodo[0] ;
                  A4043CCTLinDsc = P05VP7_A4043CCTLinDsc[0] ;
                  A758ProCod = P05VP7_A758ProCod[0] ;
                  A4048CCTLinTpoI = P05VP7_A4048CCTLinTpoI[0] ;
                  A4043CCTLinDsc = P05VP7_A4043CCTLinDsc[0] ;
                  AV47GXLvl62 = (byte)(1) ;
                  if ( AV31IniCC == 0 )
                  {
                     AV31IniCC = (byte)(1) ;
                     h5VP0( false, 47) ;
                     getPrinter().GxDrawRect(7, Gx_line+7, 759, Gx_line+39, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Metodo", ""), 227, Gx_line+17, 272, Gx_line+32, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Especificação", ""), 374, Gx_line+15, 452, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Resultado", ""), 618, Gx_line+14, 676, Gx_line+29, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(345, Gx_line+7, 345, Gx_line+47, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(526, Gx_line+7, 526, Gx_line+47, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(182, Gx_line+7, 182, Gx_line+47, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(7, Gx_line+38, 7, Gx_line+47, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(758, Gx_line+38, 758, Gx_line+47, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+47) ;
                  }
                  AV35CCTValLin = (byte)(GXutil.lval( A4035CCVal)) ;
                  AV34CCTValDsc = " " ;
                  /* Using cursor P05VP8 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(AV35CCTValLin)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A4049CCTValLin = P05VP8_A4049CCTValLin[0] ;
                     A4050CCTValDsc = P05VP8_A4050CCTValDsc[0] ;
                     AV34CCTValDsc = A4050CCTValDsc ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(5);
                  AV32Ccval = ((GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "L", ""))==0) ? AV34CCTValDsc : A4035CCVal) ;
                  AV39Ccespecifgrid = A13252CCEspecif ;
                  AV40Ccmetodogrid = A13251CCMetodo ;
                  h5VP0( false, 17) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), 25, Gx_line+1, 182, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Ccmetodogrid, "")), 185, Gx_line+1, 342, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Ccespecifgrid, "")), 357, Gx_line+1, 514, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Ccval, "")), 543, Gx_line+1, 752, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(182, Gx_line+0, 182, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(526, Gx_line+0, 526, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(758, Gx_line+0, 758, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+16, 759, Gx_line+16, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               if ( AV47GXLvl62 == 0 )
               {
                  h5VP0( false, 40) ;
                  getPrinter().GxDrawRect(7, Gx_line+6, 759, Gx_line+34, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Parâmetro", ""), 100, Gx_line+11, 165, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(202, Gx_line+6, 202, Gx_line+39, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Dados", ""), 239, Gx_line+11, 278, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Unid.", ""), 708, Gx_line+10, 738, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(657, Gx_line+6, 657, Gx_line+39, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+28, 7, Gx_line+39, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(758, Gx_line+28, 758, Gx_line+39, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(309, Gx_line+6, 309, Gx_line+39, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 323, Gx_line+11, 403, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+40) ;
               }
            }
            if ( AV36opcion == 1 )
            {
               /* Using cursor P05VP9 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV30BarOrdlin)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A194BarOrdLin = P05VP9_A194BarOrdLin[0] ;
                  A3296BarParObs = P05VP9_A3296BarParObs[0] ;
                  A9737BarValPar = P05VP9_A9737BarValPar[0] ;
                  A1665ParFasDsc = P05VP9_A1665ParFasDsc[0] ;
                  n1665ParFasDsc = P05VP9_n1665ParFasDsc[0] ;
                  A1664ParFasCod = P05VP9_A1664ParFasCod[0] ;
                  A758ProCod = P05VP9_A758ProCod[0] ;
                  A1665ParFasDsc = P05VP9_A1665ParFasDsc[0] ;
                  n1665ParFasDsc = P05VP9_n1665ParFasDsc[0] ;
                  h5VP0( false, 19) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), 25, Gx_line+0, 182, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9737BarValPar, "")), 216, Gx_line+0, 300, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(758, Gx_line+0, 758, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(202, Gx_line+0, 202, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(657, Gx_line+0, 657, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+17, 759, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(309, Gx_line+0, 309, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3296BarParObs, "")), 319, Gx_line+0, 633, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5VP0( true, 0) ;
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
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P05VP10 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV25Cod_Idtx});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A10887Cod_Idtx = P05VP10_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P05VP10_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P05VP10_n10888Dsc_Idtx[0] ;
         AV11Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PROCEDENCIA' Routine */
      returnInSub = false ;
      AV13Procenom = " " ;
      /* Using cursor P05VP11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV28Albreccod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A970ProceCod = P05VP11_A970ProceCod[0] ;
         n970ProceCod = P05VP11_n970ProceCod[0] ;
         A44AlbRecCod = P05VP11_A44AlbRecCod[0] ;
         A971ProceNom = P05VP11_A971ProceNom[0] ;
         n971ProceNom = P05VP11_n971ProceNom[0] ;
         A971ProceNom = P05VP11_A971ProceNom[0] ;
         n971ProceNom = P05VP11_n971ProceNom[0] ;
         AV13Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void h5VP0( boolean bFoot ,
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
               if ( AV36opcion == 3 )
               {
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ContDsc, "")), 17, Gx_line+404, 122, Gx_line+420, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Assinatura do", ""), 14, Gx_line+359, 86, Gx_line+374, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Responsavel:", ""), 14, Gx_line+375, 84, Gx_line+390, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(93, Gx_line+389, 271, Gx_line+389, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pag.:", ""), 627, Gx_line+404, 655, Gx_line+419, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 657, Gx_line+404, 702, Gx_line+421, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 705, Gx_line+404, 709, Gx_line+419, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 716, Gx_line+404, 769, Gx_line+419, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 625, Gx_line+375, 653, Gx_line+390, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 658, Gx_line+375, 703, Gx_line+391, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+424) ;
               }
               else
               {
                  getPrinter().GxDrawRect(450, Gx_line+16, 763, Gx_line+40, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RESULTADOS APÓS SECAR", ""), 517, Gx_line+20, 678, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LARGURA (m)", ""), 468, Gx_line+45, 549, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "GRAMAGEM (g/m2)", ""), 468, Gx_line+67, 579, Gx_line+83, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ENCOLHIMENTOS LARG. (%)", ""), 468, Gx_line+91, 632, Gx_line+107, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ENCOLHIMENTOS COMP. (%)", ""), 468, Gx_line+113, 634, Gx_line+129, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(450, Gx_line+16, 763, Gx_line+158, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(450, Gx_line+64, 763, Gx_line+64, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(450, Gx_line+85, 763, Gx_line+85, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(450, Gx_line+108, 763, Gx_line+108, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(450, Gx_line+132, 763, Gx_line+132, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(636, Gx_line+39, 636, Gx_line+158, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ContDsc, "")), 17, Gx_line+311, 122, Gx_line+327, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Assinatura do", ""), 14, Gx_line+267, 86, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Responsavel:", ""), 14, Gx_line+282, 84, Gx_line+297, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(90, Gx_line+296, 268, Gx_line+296, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pag.:", ""), 624, Gx_line+311, 652, Gx_line+326, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 654, Gx_line+311, 699, Gx_line+328, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 702, Gx_line+311, 706, Gx_line+326, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 713, Gx_line+311, 766, Gx_line+326, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 622, Gx_line+282, 650, Gx_line+297, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 655, Gx_line+282, 700, Gx_line+298, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ESPIRALIDADE (%)", ""), 468, Gx_line+135, 576, Gx_line+151, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+332) ;
               }
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pidartigo.class);
      return new app.GXcfg();
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP0[0] = apidartigo.this.A396EmprCod;
      this.aP1[0] = apidartigo.this.A129BarCod;
      this.aP2[0] = apidartigo.this.A132BarCodReo;
      this.aP3[0] = apidartigo.this.A130BarCodPar;
      this.aP4[0] = apidartigo.this.AV30BarOrdlin;
      this.aP5[0] = apidartigo.this.AV36opcion;
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
      AV23ContDsc = "" ;
      scmdbuf = "" ;
      P05VP3_A396EmprCod = new String[] {""} ;
      P05VP3_A129BarCod = new int[1] ;
      P05VP3_A132BarCodReo = new byte[1] ;
      P05VP3_A130BarCodPar = new String[] {""} ;
      P05VP3_A361DisCod = new int[1] ;
      P05VP3_A252CliCod = new int[1] ;
      P05VP3_n252CliCod = new boolean[] {false} ;
      P05VP3_A4466BarAcaAnh = new short[1] ;
      P05VP3_A5291BarTipCor = new String[] {""} ;
      P05VP3_A2829BarProPer = new String[] {""} ;
      P05VP3_A11852Nxt_ArtCl2 = new String[] {""} ;
      P05VP3_A11850Nxt_Mdlo2 = new String[] {""} ;
      P05VP3_A11851Nxt_Sta2 = new String[] {""} ;
      P05VP3_A1909BarGraAca = new short[1] ;
      P05VP3_A125BarAncAca1 = new short[1] ;
      P05VP3_A1652BarSerDsc = new String[] {""} ;
      P05VP3_A212BarSer = new String[] {""} ;
      P05VP3_A4812BarEncCli = new String[] {""} ;
      P05VP3_A1235BarNumCli = new int[1] ;
      P05VP3_A1234BarNomCli = new String[] {""} ;
      P05VP3_A135BarColNom = new String[] {""} ;
      P05VP3_A279CliNom = new String[] {""} ;
      P05VP3_A11662BarOrdComp = new String[] {""} ;
      P05VP3_A1503BarPart = new short[1] ;
      P05VP3_A9777BarItem3 = new String[] {""} ;
      P05VP3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05VP3_A199BarPie1 = new short[1] ;
      P05VP3_A365DisDes = new String[] {""} ;
      P05VP3_A898BarPieNDes = new int[1] ;
      A5291BarTipCor = "" ;
      A2829BarProPer = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A11850Nxt_Mdlo2 = "" ;
      A11851Nxt_Sta2 = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      A11662BarOrdComp = "" ;
      A9777BarItem3 = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV8Hdr = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new short[1] ;
      AV17Tb1_dscfb = "" ;
      GXv_char4 = new String[1] ;
      AV12DisEnt = "" ;
      AV9Tab_obs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV9Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05VP4_A396EmprCod = new String[] {""} ;
      P05VP4_A361DisCod = new int[1] ;
      P05VP4_A377DisObsTxt = new String[] {""} ;
      P05VP4_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV26Exportacion = "" ;
      AV25Cod_Idtx = "" ;
      AV19Tab_norma = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV19Tab_norma[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV20Tab_normanc = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV20Tab_normanc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV21Tab_normast = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV21Tab_normast[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37tab_nc = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV37tab_nc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16Tab_normas = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV16Tab_normas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05VP5_A396EmprCod = new String[] {""} ;
      P05VP5_A361DisCod = new int[1] ;
      P05VP5_A13216DisNormDsc = new String[] {""} ;
      P05VP5_n13216DisNormDsc = new boolean[] {false} ;
      P05VP5_A13215DisNormNC = new String[] {""} ;
      P05VP5_A13214DisNormSt = new String[] {""} ;
      P05VP5_A13213DisNormID = new String[] {""} ;
      A13216DisNormDsc = "" ;
      A13215DisNormNC = "" ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      AV22Norma = "" ;
      AV27status = "" ;
      AV10Nxt_artcl2 = "" ;
      AV14lista = "" ;
      AV15relatorio = "" ;
      AV13Procenom = "" ;
      P05VP6_A396EmprCod = new String[] {""} ;
      P05VP6_A129BarCod = new int[1] ;
      P05VP6_A132BarCodReo = new byte[1] ;
      P05VP6_A130BarCodPar = new String[] {""} ;
      P05VP6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05VP6_A44AlbRecCod = new int[1] ;
      P05VP6_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV11Dsc_Idtx = "" ;
      AV38Motivo = "" ;
      P05VP7_A396EmprCod = new String[] {""} ;
      P05VP7_A129BarCod = new int[1] ;
      P05VP7_A132BarCodReo = new byte[1] ;
      P05VP7_A130BarCodPar = new String[] {""} ;
      P05VP7_A194BarOrdLin = new short[1] ;
      P05VP7_A4034CCTLin = new short[1] ;
      P05VP7_A4031CCTCod = new int[1] ;
      P05VP7_A4035CCVal = new String[] {""} ;
      P05VP7_A4048CCTLinTpoI = new String[] {""} ;
      P05VP7_A13252CCEspecif = new String[] {""} ;
      P05VP7_A13251CCMetodo = new String[] {""} ;
      P05VP7_A4043CCTLinDsc = new String[] {""} ;
      P05VP7_A758ProCod = new String[] {""} ;
      A4035CCVal = "" ;
      A4048CCTLinTpoI = "" ;
      A13252CCEspecif = "" ;
      A13251CCMetodo = "" ;
      A4043CCTLinDsc = "" ;
      A758ProCod = "" ;
      AV34CCTValDsc = "" ;
      P05VP8_A396EmprCod = new String[] {""} ;
      P05VP8_A4031CCTCod = new int[1] ;
      P05VP8_A4034CCTLin = new short[1] ;
      P05VP8_A4049CCTValLin = new byte[1] ;
      P05VP8_A4050CCTValDsc = new String[] {""} ;
      A4050CCTValDsc = "" ;
      AV32Ccval = "" ;
      AV39Ccespecifgrid = "" ;
      AV40Ccmetodogrid = "" ;
      P05VP9_A396EmprCod = new String[] {""} ;
      P05VP9_A129BarCod = new int[1] ;
      P05VP9_A132BarCodReo = new byte[1] ;
      P05VP9_A130BarCodPar = new String[] {""} ;
      P05VP9_A194BarOrdLin = new short[1] ;
      P05VP9_A3296BarParObs = new String[] {""} ;
      P05VP9_A9737BarValPar = new String[] {""} ;
      P05VP9_A1665ParFasDsc = new String[] {""} ;
      P05VP9_n1665ParFasDsc = new boolean[] {false} ;
      P05VP9_A1664ParFasCod = new short[1] ;
      P05VP9_A758ProCod = new String[] {""} ;
      A3296BarParObs = "" ;
      A9737BarValPar = "" ;
      A1665ParFasDsc = "" ;
      P05VP10_A396EmprCod = new String[] {""} ;
      P05VP10_A10887Cod_Idtx = new String[] {""} ;
      P05VP10_A10888Dsc_Idtx = new String[] {""} ;
      P05VP10_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      P05VP11_A970ProceCod = new short[1] ;
      P05VP11_n970ProceCod = new boolean[] {false} ;
      P05VP11_A396EmprCod = new String[] {""} ;
      P05VP11_A44AlbRecCod = new int[1] ;
      P05VP11_A971ProceNom = new String[] {""} ;
      P05VP11_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apidartigo__default(),
         new Object[] {
             new Object[] {
            P05VP3_A396EmprCod, P05VP3_A129BarCod, P05VP3_A132BarCodReo, P05VP3_A130BarCodPar, P05VP3_A361DisCod, P05VP3_A252CliCod, P05VP3_n252CliCod, P05VP3_A4466BarAcaAnh, P05VP3_A5291BarTipCor, P05VP3_A2829BarProPer,
            P05VP3_A11852Nxt_ArtCl2, P05VP3_A11850Nxt_Mdlo2, P05VP3_A11851Nxt_Sta2, P05VP3_A1909BarGraAca, P05VP3_A125BarAncAca1, P05VP3_A1652BarSerDsc, P05VP3_A212BarSer, P05VP3_A4812BarEncCli, P05VP3_A1235BarNumCli, P05VP3_A1234BarNomCli,
            P05VP3_A135BarColNom, P05VP3_A279CliNom, P05VP3_A11662BarOrdComp, P05VP3_A1503BarPart, P05VP3_A9777BarItem3, P05VP3_A166BarKgm, P05VP3_A199BarPie1, P05VP3_A365DisDes, P05VP3_A898BarPieNDes
            }
            , new Object[] {
            P05VP4_A396EmprCod, P05VP4_A361DisCod, P05VP4_A377DisObsTxt, P05VP4_A376DisObsLin
            }
            , new Object[] {
            P05VP5_A396EmprCod, P05VP5_A361DisCod, P05VP5_A13216DisNormDsc, P05VP5_n13216DisNormDsc, P05VP5_A13215DisNormNC, P05VP5_A13214DisNormSt, P05VP5_A13213DisNormID
            }
            , new Object[] {
            P05VP6_A396EmprCod, P05VP6_A129BarCod, P05VP6_A132BarCodReo, P05VP6_A130BarCodPar, P05VP6_A203BarPieKil, P05VP6_A44AlbRecCod, P05VP6_A200BarPieCod
            }
            , new Object[] {
            P05VP7_A396EmprCod, P05VP7_A129BarCod, P05VP7_A132BarCodReo, P05VP7_A130BarCodPar, P05VP7_A194BarOrdLin, P05VP7_A4034CCTLin, P05VP7_A4031CCTCod, P05VP7_A4035CCVal, P05VP7_A4048CCTLinTpoI, P05VP7_A13252CCEspecif,
            P05VP7_A13251CCMetodo, P05VP7_A4043CCTLinDsc, P05VP7_A758ProCod
            }
            , new Object[] {
            P05VP8_A396EmprCod, P05VP8_A4031CCTCod, P05VP8_A4034CCTLin, P05VP8_A4049CCTValLin, P05VP8_A4050CCTValDsc
            }
            , new Object[] {
            P05VP9_A396EmprCod, P05VP9_A129BarCod, P05VP9_A132BarCodReo, P05VP9_A130BarCodPar, P05VP9_A194BarOrdLin, P05VP9_A3296BarParObs, P05VP9_A9737BarValPar, P05VP9_A1665ParFasDsc, P05VP9_n1665ParFasDsc, P05VP9_A1664ParFasCod,
            P05VP9_A758ProCod
            }
            , new Object[] {
            P05VP10_A396EmprCod, P05VP10_A10887Cod_Idtx, P05VP10_A10888Dsc_Idtx, P05VP10_n10888Dsc_Idtx
            }
            , new Object[] {
            P05VP11_A970ProceCod, P05VP11_n970ProceCod, P05VP11_A396EmprCod, P05VP11_A44AlbRecCod, P05VP11_A971ProceNom, P05VP11_n971ProceNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV36opcion ;
   private byte AV18i ;
   private byte A376DisObsLin ;
   private byte AV24j ;
   private byte AV31IniCC ;
   private byte AV47GXLvl62 ;
   private byte AV35CCTValLin ;
   private byte A4049CCTValLin ;
   private short AV30BarOrdlin ;
   private short A4466BarAcaAnh ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A1503BarPart ;
   private short A199BarPie1 ;
   private short GXv_int3[] ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short A1664ParFasCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GXv_int2[] ;
   private int GX_I ;
   private int A44AlbRecCod ;
   private int AV28Albreccod ;
   private int Gx_OldLine ;
   private int A4031CCTCod ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV23ContDsc ;
   private String scmdbuf ;
   private String A5291BarTipCor ;
   private String A2829BarProPer ;
   private String A11852Nxt_ArtCl2 ;
   private String A11850Nxt_Mdlo2 ;
   private String A11851Nxt_Sta2 ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A9777BarItem3 ;
   private String A365DisDes ;
   private String AV8Hdr ;
   private String GXv_char1[] ;
   private String AV17Tb1_dscfb ;
   private String GXv_char4[] ;
   private String AV12DisEnt ;
   private String AV9Tab_obs[] ;
   private String A377DisObsTxt ;
   private String AV26Exportacion ;
   private String AV25Cod_Idtx ;
   private String AV19Tab_norma[] ;
   private String AV20Tab_normanc[] ;
   private String AV21Tab_normast[] ;
   private String AV37tab_nc[] ;
   private String AV16Tab_normas[] ;
   private String A13216DisNormDsc ;
   private String A13215DisNormNC ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String AV22Norma ;
   private String AV27status ;
   private String AV10Nxt_artcl2 ;
   private String AV14lista ;
   private String AV15relatorio ;
   private String AV13Procenom ;
   private String A200BarPieCod ;
   private String AV11Dsc_Idtx ;
   private String AV38Motivo ;
   private String A4035CCVal ;
   private String A4048CCTLinTpoI ;
   private String A13252CCEspecif ;
   private String A13251CCMetodo ;
   private String A4043CCTLinDsc ;
   private String A758ProCod ;
   private String AV34CCTValDsc ;
   private String A4050CCTValDsc ;
   private String AV32Ccval ;
   private String AV39Ccespecifgrid ;
   private String AV40Ccmetodogrid ;
   private String A3296BarParObs ;
   private String A9737BarValPar ;
   private String A1665ParFasDsc ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A971ProceNom ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n13216DisNormDsc ;
   private boolean n1665ParFasDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private String A11662BarOrdComp ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05VP3_A396EmprCod ;
   private int[] P05VP3_A129BarCod ;
   private byte[] P05VP3_A132BarCodReo ;
   private String[] P05VP3_A130BarCodPar ;
   private int[] P05VP3_A361DisCod ;
   private int[] P05VP3_A252CliCod ;
   private boolean[] P05VP3_n252CliCod ;
   private short[] P05VP3_A4466BarAcaAnh ;
   private String[] P05VP3_A5291BarTipCor ;
   private String[] P05VP3_A2829BarProPer ;
   private String[] P05VP3_A11852Nxt_ArtCl2 ;
   private String[] P05VP3_A11850Nxt_Mdlo2 ;
   private String[] P05VP3_A11851Nxt_Sta2 ;
   private short[] P05VP3_A1909BarGraAca ;
   private short[] P05VP3_A125BarAncAca1 ;
   private String[] P05VP3_A1652BarSerDsc ;
   private String[] P05VP3_A212BarSer ;
   private String[] P05VP3_A4812BarEncCli ;
   private int[] P05VP3_A1235BarNumCli ;
   private String[] P05VP3_A1234BarNomCli ;
   private String[] P05VP3_A135BarColNom ;
   private String[] P05VP3_A279CliNom ;
   private String[] P05VP3_A11662BarOrdComp ;
   private short[] P05VP3_A1503BarPart ;
   private String[] P05VP3_A9777BarItem3 ;
   private java.math.BigDecimal[] P05VP3_A166BarKgm ;
   private short[] P05VP3_A199BarPie1 ;
   private String[] P05VP3_A365DisDes ;
   private int[] P05VP3_A898BarPieNDes ;
   private String[] P05VP4_A396EmprCod ;
   private int[] P05VP4_A361DisCod ;
   private String[] P05VP4_A377DisObsTxt ;
   private byte[] P05VP4_A376DisObsLin ;
   private String[] P05VP5_A396EmprCod ;
   private int[] P05VP5_A361DisCod ;
   private String[] P05VP5_A13216DisNormDsc ;
   private boolean[] P05VP5_n13216DisNormDsc ;
   private String[] P05VP5_A13215DisNormNC ;
   private String[] P05VP5_A13214DisNormSt ;
   private String[] P05VP5_A13213DisNormID ;
   private String[] P05VP6_A396EmprCod ;
   private int[] P05VP6_A129BarCod ;
   private byte[] P05VP6_A132BarCodReo ;
   private String[] P05VP6_A130BarCodPar ;
   private java.math.BigDecimal[] P05VP6_A203BarPieKil ;
   private int[] P05VP6_A44AlbRecCod ;
   private String[] P05VP6_A200BarPieCod ;
   private String[] P05VP7_A396EmprCod ;
   private int[] P05VP7_A129BarCod ;
   private byte[] P05VP7_A132BarCodReo ;
   private String[] P05VP7_A130BarCodPar ;
   private short[] P05VP7_A194BarOrdLin ;
   private short[] P05VP7_A4034CCTLin ;
   private int[] P05VP7_A4031CCTCod ;
   private String[] P05VP7_A4035CCVal ;
   private String[] P05VP7_A4048CCTLinTpoI ;
   private String[] P05VP7_A13252CCEspecif ;
   private String[] P05VP7_A13251CCMetodo ;
   private String[] P05VP7_A4043CCTLinDsc ;
   private String[] P05VP7_A758ProCod ;
   private String[] P05VP8_A396EmprCod ;
   private int[] P05VP8_A4031CCTCod ;
   private short[] P05VP8_A4034CCTLin ;
   private byte[] P05VP8_A4049CCTValLin ;
   private String[] P05VP8_A4050CCTValDsc ;
   private String[] P05VP9_A396EmprCod ;
   private int[] P05VP9_A129BarCod ;
   private byte[] P05VP9_A132BarCodReo ;
   private String[] P05VP9_A130BarCodPar ;
   private short[] P05VP9_A194BarOrdLin ;
   private String[] P05VP9_A3296BarParObs ;
   private String[] P05VP9_A9737BarValPar ;
   private String[] P05VP9_A1665ParFasDsc ;
   private boolean[] P05VP9_n1665ParFasDsc ;
   private short[] P05VP9_A1664ParFasCod ;
   private String[] P05VP9_A758ProCod ;
   private String[] P05VP10_A396EmprCod ;
   private String[] P05VP10_A10887Cod_Idtx ;
   private String[] P05VP10_A10888Dsc_Idtx ;
   private boolean[] P05VP10_n10888Dsc_Idtx ;
   private short[] P05VP11_A970ProceCod ;
   private boolean[] P05VP11_n970ProceCod ;
   private String[] P05VP11_A396EmprCod ;
   private int[] P05VP11_A44AlbRecCod ;
   private String[] P05VP11_A971ProceNom ;
   private boolean[] P05VP11_n971ProceNom ;
}

final  class apidartigo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05VP3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.CliCod, T1.BarAcaAnh, T1.BarTipCor, T1.BarProPer, T1.Nxt_ArtCl2, T1.Nxt_Mdlo2, T1.Nxt_Sta2, T1.BarGraAca, T1.BarAncAca1, T1.BarSerDsc, T1.BarSer, T1.BarEncCli, T1.BarNumCli, T1.BarNomCli, T1.BarColNom, T2.CliNom, T1.BarOrdComp, T1.BarPart, T1.BarItem3, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05VP4", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VP5", "SELECT T1.EmprCod, T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormNC, T1.DisNormSt, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VP6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VP7", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.CCTLin, T1.CCTCod, T1.CCVal, T2.CCTLinTpoI, T1.CCEspecif, T1.CCMetodo, T2.CCTLinDsc, T1.ProCod FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VP8", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05VP9", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.BarParObs, T1.BarValPar, T2.ParFasDsc, T1.ParFasCod, T1.ProCod FROM (TXPBarPar T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VP10", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05VP11", "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 2);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 13);
               ((String[]) buf[20])[0] = rslt.getString(20, 13);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((String[]) buf[22])[0] = rslt.getVarchar(22);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 20);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

