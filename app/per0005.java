package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class per0005 extends GXProcedure
{
   public per0005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( per0005.class ), "" );
   }

   public per0005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     java.util.Date[] aP1 )
   {
      per0005.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 )
   {
      per0005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      per0005.this.AV111Fec1 = aP1[0];
      this.aP1 = aP1;
      per0005.this.AV112Fec2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P047C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV111Fec1, AV112Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1195DisNomCli = P047C2_A1195DisNomCli[0] ;
         A369DisFec = P047C2_A369DisFec[0] ;
         A361DisCod = P047C2_A361DisCod[0] ;
         AV106Discod = A361DisCod ;
         AV108DisFec = A369DisFec ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV114HayInf = (byte)(0) ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV146Tab_vl[GX_I-1] = (byte)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV148Tab_vv[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV147Tab_vm[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV145Tab_vk[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV116i = (byte)(1) ;
      /* Using cursor P047C13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV106Discod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1234BarNomCli = P047C13_A1234BarNomCli[0] ;
         A213BarSit = P047C13_A213BarSit[0] ;
         A361DisCod = P047C13_A361DisCod[0] ;
         A130BarCodPar = P047C13_A130BarCodPar[0] ;
         A132BarCodReo = P047C13_A132BarCodReo[0] ;
         A129BarCod = P047C13_A129BarCod[0] ;
         A212BarSer = P047C13_A212BarSer[0] ;
         A1798BarDibCli = P047C13_A1798BarDibCli[0] ;
         A2010BarTipDis = P047C13_A2010BarTipDis[0] ;
         A159BarFecGen = P047C13_A159BarFecGen[0] ;
         A135BarColNom = P047C13_A135BarColNom[0] ;
         A136BarColNum = P047C13_A136BarColNum[0] ;
         A228BarUniMed = P047C13_A228BarUniMed[0] ;
         A211BarRdt = P047C13_A211BarRdt[0] ;
         A864BarPes = P047C13_A864BarPes[0] ;
         A252CliCod = P047C13_A252CliCod[0] ;
         n252CliCod = P047C13_n252CliCod[0] ;
         A279CliNom = P047C13_A279CliNom[0] ;
         A1500BarNMtr = P047C13_A1500BarNMtr[0] ;
         A146BarEst = P047C13_A146BarEst[0] ;
         A151BarFasCod = P047C13_A151BarFasCod[0] ;
         n151BarFasCod = P047C13_n151BarFasCod[0] ;
         A156BarFecCum = P047C13_A156BarFecCum[0] ;
         n156BarFecCum = P047C13_n156BarFecCum[0] ;
         A1955BarFasSig = P047C13_A1955BarFasSig[0] ;
         n1955BarFasSig = P047C13_n1955BarFasSig[0] ;
         A279CliNom = P047C13_A279CliNom[0] ;
         A151BarFasCod = P047C13_A151BarFasCod[0] ;
         n151BarFasCod = P047C13_n151BarFasCod[0] ;
         A156BarFecCum = P047C13_A156BarFecCum[0] ;
         n156BarFecCum = P047C13_n156BarFecCum[0] ;
         A1955BarFasSig = P047C13_A1955BarFasSig[0] ;
         n1955BarFasSig = P047C13_n1955BarFasSig[0] ;
         AV115Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV160Hdrr = A129BarCod ;
         AV161R = A132BarCodReo ;
         AV162P = A130BarCodPar ;
         AV79BarCod = A129BarCod ;
         AV81BarCodreo = A132BarCodReo ;
         AV80Barcodpar = A130BarCodPar ;
         AV94BarSer = A212BarSer ;
         AV84BarDibCli = A1798BarDibCli ;
         if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) != 0 )
         {
            AV84BarDibCli = GXutil.trim( A1234BarNomCli) ;
         }
         AV88Barfecgen = A159BarFecGen ;
         AV82Barcolnom = A135BarColNom ;
         AV83Barcolnum = A136BarColNum ;
         AV91BarNomcli = A1234BarNomCli ;
         AV95BarTipDis = A2010BarTipDis ;
         AV96BarUnimed = A228BarUniMed ;
         AV93BarRdt = A211BarRdt ;
         AV92BarPes = A864BarPes ;
         AV100Clicod = A252CliCod ;
         AV101CliNom = A279CliNom ;
         AV151vN1 = GXutil.substring( A1500BarNMtr, 1, 2) ;
         AV152vN2 = GXutil.substring( A1500BarNMtr, 3, 2) ;
         AV153vN3 = GXutil.substring( A1500BarNMtr, 5, 2) ;
         AV154vN4 = GXutil.substring( A1500BarNMtr, 7, 2) ;
         AV164Barest = A146BarEst ;
         AV163Barsit = A213BarSit ;
         /* Execute user subroutine: 'ARTICU' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV93BarRdt.doubleValue() == 0 ) && ( AV77ArtRen.doubleValue() > 0 ) )
         {
            AV93BarRdt = AV77ArtRen ;
         }
         if ( ( AV92BarPes == 0 ) && ( AV76ArtPml > 0 ) )
         {
            AV92BarPes = AV76ArtPml ;
         }
         if ( GXutil.strcmp(A2010BarTipDis, "") == 0 )
         {
            AV95BarTipDis = httpContext.getMessage( "T", "") ;
         }
         else
         {
            AV95BarTipDis = httpContext.getMessage( "E", "") ;
         }
         AV85Barfascod = A151BarFasCod ;
         AV87Barfeccum = A156BarFecCum ;
         AV86BarFasSig = A1955BarFasSig ;
         AV159vTexto = GXutil.trim( localUtil.dtoc( AV87Barfeccum, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
         /* Execute user subroutine: 'BARPIE' */
         S133 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV89BarKgm.doubleValue() == 0 ) && ( AV90BarMtr.doubleValue() == 0 ) )
         {
         }
         else
         {
            AV114HayInf = (byte)(1) ;
            if ( GXutil.strcmp(AV95BarTipDis, httpContext.getMessage( "E", "")) == 0 )
            {
               /* Execute user subroutine: 'BARCOM' */
               S143 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  if (true) return;
               }
            }
            else
            {
               AV146Tab_vl[1-1] = (byte)(1) ;
               AV148Tab_vv[1-1] = GXutil.trim( GXutil.str( AV83Barcolnum, 6, 0)) ;
               AV147Tab_vm[1-1] = AV90BarMtr ;
               AV145Tab_vk[1-1] = AV89BarKgm ;
            }
            AV116i = (byte)(1) ;
            while ( AV116i <= 10 )
            {
               if ( AV146Tab_vl[AV116i-1] == 0 )
               {
                  if (true) break;
               }
               AV157Vtel = AV146Tab_vl[AV116i-1] ;
               AV155VteD = AV148Tab_vv[AV116i-1] ;
               AV158VteM = AV147Tab_vm[AV116i-1] ;
               AV156VteK = AV145Tab_vk[AV116i-1] ;
               AV138Marca = AV144Tab_vf[AV116i-1] ;
               Gx_msg = httpContext.getMessage( "Procesando..... ", "") + AV115Hdr ;
               System.out.println( Gx_msg );
               /* Execute user subroutine: 'INUP' */
               S153 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  if (true) return;
               }
               AV116i = (byte)(AV116i+1) ;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S133( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      AV141Npartidas = " " ;
      AV165Er_arts = " " ;
      AV166Er_artd = " " ;
      AV170Er_arta = " " ;
      AV89BarKgm = DecimalUtil.doubleToDec(0) ;
      AV90BarMtr = DecimalUtil.doubleToDec(0) ;
      AV171LasrRecep = 0 ;
      AV172LastRef = " " ;
      /* Using cursor P047C14 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV79BarCod), Byte.valueOf(AV81BarCodreo), AV80Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk47C4 = false ;
         A44AlbRecCod = P047C14_A44AlbRecCod[0] ;
         A130BarCodPar = P047C14_A130BarCodPar[0] ;
         A132BarCodReo = P047C14_A132BarCodReo[0] ;
         A129BarCod = P047C14_A129BarCod[0] ;
         A252CliCod = P047C14_A252CliCod[0] ;
         n252CliCod = P047C14_n252CliCod[0] ;
         A45AlbRef = P047C14_A45AlbRef[0] ;
         A3613AlbRefDsc = P047C14_A3613AlbRefDsc[0] ;
         A4921AlbRAnc = P047C14_A4921AlbRAnc[0] ;
         A200BarPieCod = P047C14_A200BarPieCod[0] ;
         A252CliCod = P047C14_A252CliCod[0] ;
         n252CliCod = P047C14_n252CliCod[0] ;
         A45AlbRef = P047C14_A45AlbRef[0] ;
         A3613AlbRefDsc = P047C14_A3613AlbRefDsc[0] ;
         A4921AlbRAnc = P047C14_A4921AlbRAnc[0] ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P047C14_A396EmprCod[0], A396EmprCod) == 0 ) && ( P047C14_A129BarCod[0] == A129BarCod ) && ( P047C14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P047C14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P047C14_A44AlbRecCod[0] == A44AlbRecCod ) ) )
            {
               if (true) break;
            }
            brk47C4 = false ;
            A200BarPieCod = P047C14_A200BarPieCod[0] ;
            brk47C4 = true ;
            pr_default.readNext(2);
         }
         AV167Clicodr = A252CliCod ;
         AV168Artcoda = A45AlbRef ;
         /* Execute user subroutine: 'REFART' */
         S164 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV172LastRef, A45AlbRef) != 0 )
         {
            if ( GXutil.strcmp(AV141Npartidas, "") == 0 )
            {
               AV141Npartidas = GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) ;
               AV165Er_arts = GXutil.trim( GXutil.substring( A45AlbRef, 1, 5)) ;
               if ( GXutil.strcmp(A3613AlbRefDsc, " ") == 0 )
               {
                  AV166Er_artd = GXutil.trim( GXutil.substring( AV169AlbRefdsc, 1, 20)) ;
               }
               else
               {
                  AV166Er_artd = GXutil.trim( GXutil.substring( A3613AlbRefDsc, 1, 20)) ;
               }
               AV170Er_arta = GXutil.trim( GXutil.str( A4921AlbRAnc, 4, 0)) ;
            }
            else
            {
               AV141Npartidas += "/" + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) ;
               AV165Er_arts += "/" + GXutil.trim( GXutil.substring( A45AlbRef, 1, 5)) ;
               if ( GXutil.strcmp(A3613AlbRefDsc, " ") == 0 )
               {
                  AV166Er_artd += "/" + GXutil.trim( GXutil.substring( AV169AlbRefdsc, 1, 20)) ;
               }
               else
               {
                  AV166Er_artd += "/" + GXutil.trim( GXutil.substring( A3613AlbRefDsc, 1, 20)) ;
               }
               AV170Er_arta += "/" + GXutil.trim( GXutil.str( A4921AlbRAnc, 4, 0)) ;
            }
         }
         AV171LasrRecep = A44AlbRecCod ;
         AV172LastRef = A45AlbRef ;
         if ( ! brk47C4 )
         {
            brk47C4 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
      /* Optimized group. */
      /* Using cursor P047C15 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV79BarCod), Byte.valueOf(AV81BarCodreo), AV80Barcodpar});
      c203BarPieKil = P047C15_A203BarPieKil[0] ;
      c205BarPieMet = P047C15_A205BarPieMet[0] ;
      pr_default.close(3);
      AV89BarKgm = AV89BarKgm.add(c203BarPieKil) ;
      AV90BarMtr = AV90BarMtr.add(c205BarPieMet) ;
      /* End optimized group. */
   }

   public void S143( )
   {
      /* 'BARCOM' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV146Tab_vl[GX_I-1] = (byte)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV148Tab_vv[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV147Tab_vm[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV145Tab_vk[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV144Tab_vf[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV116i = (byte)(1) ;
      AV139MtsVte = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P047C16 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV79BarCod), Byte.valueOf(AV81BarCodreo), AV80Barcodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = P047C16_A130BarCodPar[0] ;
         A132BarCodReo = P047C16_A132BarCodReo[0] ;
         A129BarCod = P047C16_A129BarCod[0] ;
         A1056DisComCod = P047C16_A1056DisComCod[0] ;
         A1541BarComMtr = P047C16_A1541BarComMtr[0] ;
         n1541BarComMtr = P047C16_n1541BarComMtr[0] ;
         A2524DisComLin = P047C16_A2524DisComLin[0] ;
         A1032FonCod = P047C16_A1032FonCod[0] ;
         AV146Tab_vl[AV116i-1] = A2524DisComLin ;
         AV148Tab_vv[AV116i-1] = A1056DisComCod ;
         AV147Tab_vm[AV116i-1] = A1541BarComMtr ;
         if ( ( GXutil.strcmp(AV96BarUnimed, httpContext.getMessage( "K", "")) == 0 ) && ( AV93BarRdt.doubleValue() > 0 ) )
         {
            AV145Tab_vk[AV116i-1] = A1541BarComMtr.divide(AV93BarRdt, 18, java.math.RoundingMode.DOWN) ;
         }
         if ( GXutil.strcmp(AV96BarUnimed, httpContext.getMessage( "M", "")) == 0 )
         {
            AV145Tab_vk[AV116i-1] = A1541BarComMtr.multiply(DecimalUtil.doubleToDec(AV92BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         AV116i = (byte)(AV116i+1) ;
         AV139MtsVte = AV139MtsVte.add(A1541BarComMtr) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV139MtsVte.doubleValue() == 0 )
      {
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV146Tab_vl[GX_I-1] = (byte)(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV148Tab_vv[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV147Tab_vm[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV145Tab_vk[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 10 )
         {
            AV144Tab_vf[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         AV116i = (byte)(1) ;
         AV139MtsVte = DecimalUtil.doubleToDec(0) ;
         AV107Discomlin = (byte)(0) ;
         /* Using cursor P047C17 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV79BarCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1541BarComMtr = P047C17_A1541BarComMtr[0] ;
            n1541BarComMtr = P047C17_n1541BarComMtr[0] ;
            A129BarCod = P047C17_A129BarCod[0] ;
            A1056DisComCod = P047C17_A1056DisComCod[0] ;
            A2524DisComLin = P047C17_A2524DisComLin[0] ;
            A130BarCodPar = P047C17_A130BarCodPar[0] ;
            A132BarCodReo = P047C17_A132BarCodReo[0] ;
            A1032FonCod = P047C17_A1032FonCod[0] ;
            AV146Tab_vl[AV116i-1] = A2524DisComLin ;
            AV148Tab_vv[AV116i-1] = A1056DisComCod ;
            AV147Tab_vm[AV116i-1] = A1541BarComMtr ;
            if ( ( GXutil.strcmp(AV96BarUnimed, httpContext.getMessage( "K", "")) == 0 ) && ( AV93BarRdt.doubleValue() > 0 ) )
            {
               AV145Tab_vk[AV116i-1] = A1541BarComMtr.divide(AV93BarRdt, 18, java.math.RoundingMode.DOWN) ;
            }
            if ( GXutil.strcmp(AV96BarUnimed, httpContext.getMessage( "M", "")) == 0 )
            {
               AV145Tab_vk[AV116i-1] = A1541BarComMtr.multiply(DecimalUtil.doubleToDec(AV92BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
            AV144Tab_vf[AV116i-1] = A130BarCodPar ;
            AV116i = (byte)(AV116i+1) ;
            AV139MtsVte = AV139MtsVte.add(A1541BarComMtr) ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
   }

   public void S123( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV142PtoPlan = "" ;
      AV99Clasdsc = "" ;
      AV76ArtPml = (short)(0) ;
      AV77ArtRen = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P047C18 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV100Clicod), AV94BarSer});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4295ClasCod = P047C18_A4295ClasCod[0] ;
         n4295ClasCod = P047C18_n4295ClasCod[0] ;
         A65ArtCod = P047C18_A65ArtCod[0] ;
         A252CliCod = P047C18_A252CliCod[0] ;
         n252CliCod = P047C18_n252CliCod[0] ;
         A4296ClasDsc = P047C18_A4296ClasDsc[0] ;
         n4296ClasDsc = P047C18_n4296ClasDsc[0] ;
         A7778ArtUnd = P047C18_A7778ArtUnd[0] ;
         n7778ArtUnd = P047C18_n7778ArtUnd[0] ;
         A1148ArtPml = P047C18_A1148ArtPml[0] ;
         n1148ArtPml = P047C18_n1148ArtPml[0] ;
         A95ArtRen = P047C18_A95ArtRen[0] ;
         n95ArtRen = P047C18_n95ArtRen[0] ;
         A4296ClasDsc = P047C18_A4296ClasDsc[0] ;
         n4296ClasDsc = P047C18_n4296ClasDsc[0] ;
         AV142PtoPlan = "*" ;
         AV99Clasdsc = A4296ClasDsc ;
         if ( GXutil.strcmp(A7778ArtUnd, httpContext.getMessage( "K", "")) == 0 )
         {
            AV142PtoPlan = httpContext.getMessage( "PUNTO", "") ;
         }
         if ( GXutil.strcmp(A7778ArtUnd, httpContext.getMessage( "M", "")) == 0 )
         {
            AV142PtoPlan = httpContext.getMessage( "PLANA", "") ;
         }
         AV76ArtPml = A1148ArtPml ;
         AV77ArtRen = A95ArtRen ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S153( )
   {
      /* 'INUP' Routine */
      returnInSub = false ;
      AV184GXLvl251 = (byte)(0) ;
      n10976Er_Arta = false ;
      n10974Er_Arts = false ;
      n10975Er_Artd = false ;
      n10890Er_Est = false ;
      n10889Er_St = false ;
      n10849Er_ToE = false ;
      n10871Er_Ultf = false ;
      n10870Er_vN4 = false ;
      n10869Er_vN3 = false ;
      n10868Er_vN2 = false ;
      n10867Er_vN1 = false ;
      n10866Er_Um = false ;
      n10865Er_Clas = false ;
      n10864Er_TArt = false ;
      n10863Er_FsSg = false ;
      n10862Er_FsUltF = false ;
      n10861Er_FsUlt = false ;
      n10860Er_FecD = false ;
      n10859Er_FecH = false ;
      n10858Er_Pdas = false ;
      n10857Er_Mts = false ;
      n10856Er_Kgs = false ;
      n10855Er_Vte = false ;
      n10854Er_Dib = false ;
      n10853Er_Clav = false ;
      n10852Er_Color = false ;
      n10851Er_Arti = false ;
      n10850Er_Clicod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P047C19 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n10976Er_Arta), AV170Er_arta, Boolean.valueOf(n10974Er_Arts), AV165Er_arts, Boolean.valueOf(n10975Er_Artd), AV166Er_artd, Boolean.valueOf(n10890Er_Est), Byte.valueOf(AV164Barest), Boolean.valueOf(n10889Er_St), Byte.valueOf(AV163Barsit), Boolean.valueOf(n10849Er_ToE), AV95BarTipDis, Boolean.valueOf(n10870Er_vN4), AV154vN4, Boolean.valueOf(n10869Er_vN3), AV153vN3, Boolean.valueOf(n10868Er_vN2), AV152vN2, Boolean.valueOf(n10867Er_vN1), AV151vN1, Boolean.valueOf(n10866Er_Um), AV96BarUnimed, AV99Clasdsc, Boolean.valueOf(n10864Er_TArt), AV142PtoPlan, Boolean.valueOf(n10863Er_FsSg), AV86BarFasSig, Boolean.valueOf(n10862Er_FsUltF), AV87Barfeccum, Boolean.valueOf(n10861Er_FsUlt), AV85Barfascod, Boolean.valueOf(n10860Er_FecD), AV108DisFec, Boolean.valueOf(n10859Er_FecH), AV88Barfecgen, Boolean.valueOf(n10858Er_Pdas), AV141Npartidas, Boolean.valueOf(n10857Er_Mts), AV158VteM, Boolean.valueOf(n10856Er_Kgs), AV156VteK, Boolean.valueOf(n10855Er_Vte), AV155VteD, Boolean.valueOf(n10854Er_Dib), AV84BarDibCli, Boolean.valueOf(n10853Er_Clav), AV91BarNomcli, Boolean.valueOf(n10852Er_Color), AV82Barcolnom, Boolean.valueOf(n10851Er_Arti), AV94BarSer, Boolean.valueOf(n10850Er_Clicod), Integer.valueOf(AV100Clicod), A396EmprCod, Integer.valueOf(AV160Hdrr), Byte.valueOf(AV161R), AV162P, Byte.valueOf(AV157Vtel)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         AV184GXLvl251 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERPROD");
      /* End optimized UPDATE. */
      if ( AV184GXLvl251 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPERPROD

         */
         A10872Er_Hdr = AV160Hdrr ;
         A10873Er_Hdrr = AV161R ;
         A10874Er_hdrp = AV162P ;
         A10875Er_LinV = AV157Vtel ;
         A10850Er_Clicod = AV100Clicod ;
         n10850Er_Clicod = false ;
         A10851Er_Arti = AV94BarSer ;
         n10851Er_Arti = false ;
         A10852Er_Color = AV82Barcolnom ;
         n10852Er_Color = false ;
         A10853Er_Clav = AV91BarNomcli ;
         n10853Er_Clav = false ;
         A10854Er_Dib = AV84BarDibCli ;
         n10854Er_Dib = false ;
         A10855Er_Vte = AV155VteD ;
         n10855Er_Vte = false ;
         A10856Er_Kgs = AV156VteK ;
         n10856Er_Kgs = false ;
         A10857Er_Mts = AV158VteM ;
         n10857Er_Mts = false ;
         A10858Er_Pdas = AV141Npartidas ;
         n10858Er_Pdas = false ;
         A10859Er_FecH = AV88Barfecgen ;
         n10859Er_FecH = false ;
         A10860Er_FecD = AV108DisFec ;
         n10860Er_FecD = false ;
         A10861Er_FsUlt = AV85Barfascod ;
         n10861Er_FsUlt = false ;
         A10862Er_FsUltF = AV87Barfeccum ;
         n10862Er_FsUltF = false ;
         A10863Er_FsSg = AV86BarFasSig ;
         n10863Er_FsSg = false ;
         A10864Er_TArt = AV142PtoPlan ;
         n10864Er_TArt = false ;
         A10865Er_Clas = GXutil.substring( AV99Clasdsc, 1, 30) ;
         n10865Er_Clas = false ;
         A10866Er_Um = AV96BarUnimed ;
         n10866Er_Um = false ;
         A10867Er_vN1 = AV151vN1 ;
         n10867Er_vN1 = false ;
         A10868Er_vN2 = AV152vN2 ;
         n10868Er_vN2 = false ;
         A10869Er_vN3 = AV153vN3 ;
         n10869Er_vN3 = false ;
         A10870Er_vN4 = AV154vN4 ;
         n10870Er_vN4 = false ;
         A10871Er_Ultf = (short)(0) ;
         n10871Er_Ultf = false ;
         A10849Er_ToE = AV95BarTipDis ;
         n10849Er_ToE = false ;
         A10889Er_St = AV163Barsit ;
         n10889Er_St = false ;
         A10890Er_Est = AV164Barest ;
         n10890Er_Est = false ;
         A10975Er_Artd = AV166Er_artd ;
         n10975Er_Artd = false ;
         A10974Er_Arts = AV165Er_arts ;
         n10974Er_Arts = false ;
         A10976Er_Arta = AV170Er_arta ;
         n10976Er_Arta = false ;
         /* Using cursor P047C20 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV), Boolean.valueOf(n10849Er_ToE), A10849Er_ToE, Boolean.valueOf(n10850Er_Clicod), Integer.valueOf(A10850Er_Clicod), Boolean.valueOf(n10851Er_Arti), A10851Er_Arti, Boolean.valueOf(n10852Er_Color), A10852Er_Color, Boolean.valueOf(n10853Er_Clav), A10853Er_Clav, Boolean.valueOf(n10854Er_Dib), A10854Er_Dib, Boolean.valueOf(n10855Er_Vte), A10855Er_Vte, Boolean.valueOf(n10856Er_Kgs), A10856Er_Kgs, Boolean.valueOf(n10857Er_Mts), A10857Er_Mts, Boolean.valueOf(n10858Er_Pdas), A10858Er_Pdas, Boolean.valueOf(n10859Er_FecH), A10859Er_FecH, Boolean.valueOf(n10860Er_FecD), A10860Er_FecD, Boolean.valueOf(n10861Er_FsUlt), A10861Er_FsUlt, Boolean.valueOf(n10862Er_FsUltF), A10862Er_FsUltF, Boolean.valueOf(n10863Er_FsSg), A10863Er_FsSg, Boolean.valueOf(n10864Er_TArt), A10864Er_TArt, Boolean.valueOf(n10865Er_Clas), A10865Er_Clas, Boolean.valueOf(n10866Er_Um), A10866Er_Um, Boolean.valueOf(n10867Er_vN1), A10867Er_vN1, Boolean.valueOf(n10868Er_vN2), A10868Er_vN2, Boolean.valueOf(n10869Er_vN3), A10869Er_vN3, Boolean.valueOf(n10870Er_vN4), A10870Er_vN4, Boolean.valueOf(n10871Er_Ultf), Short.valueOf(A10871Er_Ultf), Boolean.valueOf(n10889Er_St), Byte.valueOf(A10889Er_St), Boolean.valueOf(n10890Er_Est), Byte.valueOf(A10890Er_Est), Boolean.valueOf(n10974Er_Arts), A10974Er_Arts, Boolean.valueOf(n10975Er_Artd), A10975Er_Artd, Boolean.valueOf(n10976Er_Arta), A10976Er_Arta});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERPROD");
         if ( (pr_default.getStatus(8) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S164( )
   {
      /* 'REFART' Routine */
      returnInSub = false ;
      AV169AlbRefdsc = " " ;
      /* Using cursor P047C21 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV167Clicodr), AV168Artcoda});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A65ArtCod = P047C21_A65ArtCod[0] ;
         A252CliCod = P047C21_A252CliCod[0] ;
         n252CliCod = P047C21_n252CliCod[0] ;
         A69ArtDsc = P047C21_A69ArtDsc[0] ;
         n69ArtDsc = P047C21_n69ArtDsc[0] ;
         AV169AlbRefdsc = A69ArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      if ( GXutil.strcmp(AV169AlbRefdsc, " ") == 0 )
      {
         /* Using cursor P047C22 */
         pr_default.execute(10, new Object[] {A396EmprCod, AV168Artcoda});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A65ArtCod = P047C22_A65ArtCod[0] ;
            A252CliCod = P047C22_A252CliCod[0] ;
            n252CliCod = P047C22_n252CliCod[0] ;
            A69ArtDsc = P047C22_A69ArtDsc[0] ;
            n69ArtDsc = P047C22_n69ArtDsc[0] ;
            AV169AlbRefdsc = A69ArtDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = per0005.this.A396EmprCod;
      this.aP1[0] = per0005.this.AV111Fec1;
      this.aP2[0] = per0005.this.AV112Fec2;
      Application.commitDataStores(context, remoteHandle, pr_default, "per0005");
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
      P047C2_A396EmprCod = new String[] {""} ;
      P047C2_A1195DisNomCli = new String[] {""} ;
      P047C2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P047C2_A361DisCod = new int[1] ;
      A1195DisNomCli = "" ;
      A369DisFec = GXutil.nullDate() ;
      AV108DisFec = GXutil.nullDate() ;
      A10851Er_Arti = "" ;
      A10852Er_Color = "" ;
      A10853Er_Clav = "" ;
      A10854Er_Dib = "" ;
      A10855Er_Vte = "" ;
      A10856Er_Kgs = DecimalUtil.ZERO ;
      A10857Er_Mts = DecimalUtil.ZERO ;
      A10858Er_Pdas = "" ;
      A10859Er_FecH = GXutil.nullDate() ;
      A10860Er_FecD = GXutil.nullDate() ;
      A10861Er_FsUlt = "" ;
      A10862Er_FsUltF = GXutil.nullDate() ;
      A10863Er_FsSg = "" ;
      A10864Er_TArt = "" ;
      A10865Er_Clas = "" ;
      A10866Er_Um = "" ;
      A10867Er_vN1 = "" ;
      A10868Er_vN2 = "" ;
      A10869Er_vN3 = "" ;
      A10870Er_vN4 = "" ;
      A10849Er_ToE = "" ;
      A10975Er_Artd = "" ;
      A10974Er_Arts = "" ;
      A10976Er_Arta = "" ;
      A10874Er_hdrp = "" ;
      AV146Tab_vl = new byte[10] ;
      AV148Tab_vv = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV148Tab_vv[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV147Tab_vm = new java.math.BigDecimal[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV147Tab_vm[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV145Tab_vk = new java.math.BigDecimal[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV145Tab_vk[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P047C13_A396EmprCod = new String[] {""} ;
      P047C13_A1234BarNomCli = new String[] {""} ;
      P047C13_A213BarSit = new byte[1] ;
      P047C13_A361DisCod = new int[1] ;
      P047C13_A130BarCodPar = new String[] {""} ;
      P047C13_A132BarCodReo = new byte[1] ;
      P047C13_A129BarCod = new int[1] ;
      P047C13_A212BarSer = new String[] {""} ;
      P047C13_A1798BarDibCli = new String[] {""} ;
      P047C13_A2010BarTipDis = new String[] {""} ;
      P047C13_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P047C13_A135BarColNom = new String[] {""} ;
      P047C13_A136BarColNum = new int[1] ;
      P047C13_A228BarUniMed = new String[] {""} ;
      P047C13_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P047C13_A864BarPes = new short[1] ;
      P047C13_A252CliCod = new int[1] ;
      P047C13_n252CliCod = new boolean[] {false} ;
      P047C13_A279CliNom = new String[] {""} ;
      P047C13_A1500BarNMtr = new String[] {""} ;
      P047C13_A146BarEst = new byte[1] ;
      P047C13_A151BarFasCod = new String[] {""} ;
      P047C13_n151BarFasCod = new boolean[] {false} ;
      P047C13_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P047C13_n156BarFecCum = new boolean[] {false} ;
      P047C13_A1955BarFasSig = new String[] {""} ;
      P047C13_n1955BarFasSig = new boolean[] {false} ;
      A1234BarNomCli = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1798BarDibCli = "" ;
      A2010BarTipDis = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A228BarUniMed = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A1500BarNMtr = "" ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      A1955BarFasSig = "" ;
      AV115Hdr = "" ;
      AV162P = "" ;
      AV80Barcodpar = "" ;
      AV94BarSer = "" ;
      AV84BarDibCli = "" ;
      AV88Barfecgen = GXutil.nullDate() ;
      AV82Barcolnom = "" ;
      AV91BarNomcli = "" ;
      AV95BarTipDis = "" ;
      AV96BarUnimed = "" ;
      AV93BarRdt = DecimalUtil.ZERO ;
      AV101CliNom = "" ;
      AV151vN1 = "" ;
      AV152vN2 = "" ;
      AV153vN3 = "" ;
      AV154vN4 = "" ;
      AV77ArtRen = DecimalUtil.ZERO ;
      AV85Barfascod = "" ;
      AV87Barfeccum = GXutil.nullDate() ;
      AV86BarFasSig = "" ;
      AV159vTexto = "" ;
      AV89BarKgm = DecimalUtil.ZERO ;
      AV90BarMtr = DecimalUtil.ZERO ;
      AV155VteD = "" ;
      AV158VteM = DecimalUtil.ZERO ;
      AV156VteK = DecimalUtil.ZERO ;
      AV138Marca = "" ;
      AV144Tab_vf = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV144Tab_vf[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      Gx_msg = "" ;
      AV141Npartidas = "" ;
      AV165Er_arts = "" ;
      AV166Er_artd = "" ;
      AV170Er_arta = "" ;
      AV172LastRef = "" ;
      P047C14_A396EmprCod = new String[] {""} ;
      P047C14_A44AlbRecCod = new int[1] ;
      P047C14_A130BarCodPar = new String[] {""} ;
      P047C14_A132BarCodReo = new byte[1] ;
      P047C14_A129BarCod = new int[1] ;
      P047C14_A252CliCod = new int[1] ;
      P047C14_n252CliCod = new boolean[] {false} ;
      P047C14_A45AlbRef = new String[] {""} ;
      P047C14_A3613AlbRefDsc = new String[] {""} ;
      P047C14_A4921AlbRAnc = new short[1] ;
      P047C14_A200BarPieCod = new String[] {""} ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A200BarPieCod = "" ;
      AV168Artcoda = "" ;
      AV169AlbRefdsc = "" ;
      c203BarPieKil = DecimalUtil.ZERO ;
      c205BarPieMet = DecimalUtil.ZERO ;
      P047C15_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P047C15_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV139MtsVte = DecimalUtil.ZERO ;
      P047C16_A396EmprCod = new String[] {""} ;
      P047C16_A130BarCodPar = new String[] {""} ;
      P047C16_A132BarCodReo = new byte[1] ;
      P047C16_A129BarCod = new int[1] ;
      P047C16_A1056DisComCod = new String[] {""} ;
      P047C16_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P047C16_n1541BarComMtr = new boolean[] {false} ;
      P047C16_A2524DisComLin = new byte[1] ;
      P047C16_A1032FonCod = new String[] {""} ;
      A1056DisComCod = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      P047C17_A396EmprCod = new String[] {""} ;
      P047C17_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P047C17_n1541BarComMtr = new boolean[] {false} ;
      P047C17_A129BarCod = new int[1] ;
      P047C17_A1056DisComCod = new String[] {""} ;
      P047C17_A2524DisComLin = new byte[1] ;
      P047C17_A130BarCodPar = new String[] {""} ;
      P047C17_A132BarCodReo = new byte[1] ;
      P047C17_A1032FonCod = new String[] {""} ;
      AV142PtoPlan = "" ;
      AV99Clasdsc = "" ;
      P047C18_A4295ClasCod = new short[1] ;
      P047C18_n4295ClasCod = new boolean[] {false} ;
      P047C18_A396EmprCod = new String[] {""} ;
      P047C18_A65ArtCod = new String[] {""} ;
      P047C18_A252CliCod = new int[1] ;
      P047C18_n252CliCod = new boolean[] {false} ;
      P047C18_A4296ClasDsc = new String[] {""} ;
      P047C18_n4296ClasDsc = new boolean[] {false} ;
      P047C18_A7778ArtUnd = new String[] {""} ;
      P047C18_n7778ArtUnd = new boolean[] {false} ;
      P047C18_A1148ArtPml = new short[1] ;
      P047C18_n1148ArtPml = new boolean[] {false} ;
      P047C18_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P047C18_n95ArtRen = new boolean[] {false} ;
      A65ArtCod = "" ;
      A4296ClasDsc = "" ;
      A7778ArtUnd = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P047C21_A396EmprCod = new String[] {""} ;
      P047C21_A65ArtCod = new String[] {""} ;
      P047C21_A252CliCod = new int[1] ;
      P047C21_n252CliCod = new boolean[] {false} ;
      P047C21_A69ArtDsc = new String[] {""} ;
      P047C21_n69ArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      P047C22_A396EmprCod = new String[] {""} ;
      P047C22_A65ArtCod = new String[] {""} ;
      P047C22_A252CliCod = new int[1] ;
      P047C22_n252CliCod = new boolean[] {false} ;
      P047C22_A69ArtDsc = new String[] {""} ;
      P047C22_n69ArtDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.per0005__default(),
         new Object[] {
             new Object[] {
            P047C2_A396EmprCod, P047C2_A1195DisNomCli, P047C2_A369DisFec, P047C2_A361DisCod
            }
            , new Object[] {
            P047C13_A396EmprCod, P047C13_A1234BarNomCli, P047C13_A213BarSit, P047C13_A361DisCod, P047C13_A130BarCodPar, P047C13_A132BarCodReo, P047C13_A129BarCod, P047C13_A212BarSer, P047C13_A1798BarDibCli, P047C13_A2010BarTipDis,
            P047C13_A159BarFecGen, P047C13_A135BarColNom, P047C13_A136BarColNum, P047C13_A228BarUniMed, P047C13_A211BarRdt, P047C13_A864BarPes, P047C13_A252CliCod, P047C13_n252CliCod, P047C13_A279CliNom, P047C13_A1500BarNMtr,
            P047C13_A146BarEst, P047C13_A151BarFasCod, P047C13_n151BarFasCod, P047C13_A156BarFecCum, P047C13_n156BarFecCum, P047C13_A1955BarFasSig, P047C13_n1955BarFasSig
            }
            , new Object[] {
            P047C14_A396EmprCod, P047C14_A44AlbRecCod, P047C14_A130BarCodPar, P047C14_A132BarCodReo, P047C14_A129BarCod, P047C14_A252CliCod, P047C14_A45AlbRef, P047C14_A3613AlbRefDsc, P047C14_A4921AlbRAnc, P047C14_A200BarPieCod
            }
            , new Object[] {
            P047C15_A203BarPieKil, P047C15_A205BarPieMet
            }
            , new Object[] {
            P047C16_A396EmprCod, P047C16_A130BarCodPar, P047C16_A132BarCodReo, P047C16_A129BarCod, P047C16_A1056DisComCod, P047C16_A1541BarComMtr, P047C16_n1541BarComMtr, P047C16_A2524DisComLin, P047C16_A1032FonCod
            }
            , new Object[] {
            P047C17_A396EmprCod, P047C17_A1541BarComMtr, P047C17_n1541BarComMtr, P047C17_A129BarCod, P047C17_A1056DisComCod, P047C17_A2524DisComLin, P047C17_A130BarCodPar, P047C17_A132BarCodReo, P047C17_A1032FonCod
            }
            , new Object[] {
            P047C18_A4295ClasCod, P047C18_n4295ClasCod, P047C18_A396EmprCod, P047C18_A65ArtCod, P047C18_A252CliCod, P047C18_A4296ClasDsc, P047C18_n4296ClasDsc, P047C18_A7778ArtUnd, P047C18_n7778ArtUnd, P047C18_A1148ArtPml,
            P047C18_n1148ArtPml, P047C18_A95ArtRen, P047C18_n95ArtRen
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P047C21_A396EmprCod, P047C21_A65ArtCod, P047C21_A252CliCod, P047C21_A69ArtDsc, P047C21_n69ArtDsc
            }
            , new Object[] {
            P047C22_A396EmprCod, P047C22_A65ArtCod, P047C22_A252CliCod, P047C22_A69ArtDsc, P047C22_n69ArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10889Er_St ;
   private byte A10890Er_Est ;
   private byte A10873Er_Hdrr ;
   private byte A10875Er_LinV ;
   private byte AV114HayInf ;
   private byte AV146Tab_vl[] ;
   private byte AV116i ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A146BarEst ;
   private byte AV161R ;
   private byte AV81BarCodreo ;
   private byte AV164Barest ;
   private byte AV163Barsit ;
   private byte AV157Vtel ;
   private byte A2524DisComLin ;
   private byte AV107Discomlin ;
   private byte AV184GXLvl251 ;
   private short A10871Er_Ultf ;
   private short A864BarPes ;
   private short AV92BarPes ;
   private short AV76ArtPml ;
   private short A4921AlbRAnc ;
   private short A4295ClasCod ;
   private short A1148ArtPml ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV106Discod ;
   private int A10850Er_Clicod ;
   private int A10872Er_Hdr ;
   private int GX_I ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV160Hdrr ;
   private int AV79BarCod ;
   private int AV83Barcolnum ;
   private int AV100Clicod ;
   private int AV171LasrRecep ;
   private int A44AlbRecCod ;
   private int AV167Clicodr ;
   private int GX_INS1449 ;
   private java.math.BigDecimal A10856Er_Kgs ;
   private java.math.BigDecimal A10857Er_Mts ;
   private java.math.BigDecimal AV147Tab_vm[] ;
   private java.math.BigDecimal AV145Tab_vk[] ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal AV93BarRdt ;
   private java.math.BigDecimal AV77ArtRen ;
   private java.math.BigDecimal AV89BarKgm ;
   private java.math.BigDecimal AV90BarMtr ;
   private java.math.BigDecimal AV158VteM ;
   private java.math.BigDecimal AV156VteK ;
   private java.math.BigDecimal c203BarPieKil ;
   private java.math.BigDecimal c205BarPieMet ;
   private java.math.BigDecimal AV139MtsVte ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A95ArtRen ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1195DisNomCli ;
   private String A10851Er_Arti ;
   private String A10852Er_Color ;
   private String A10853Er_Clav ;
   private String A10854Er_Dib ;
   private String A10855Er_Vte ;
   private String A10858Er_Pdas ;
   private String A10861Er_FsUlt ;
   private String A10863Er_FsSg ;
   private String A10864Er_TArt ;
   private String A10865Er_Clas ;
   private String A10866Er_Um ;
   private String A10867Er_vN1 ;
   private String A10868Er_vN2 ;
   private String A10869Er_vN3 ;
   private String A10870Er_vN4 ;
   private String A10849Er_ToE ;
   private String A10975Er_Artd ;
   private String A10974Er_Arts ;
   private String A10976Er_Arta ;
   private String A10874Er_hdrp ;
   private String AV148Tab_vv[] ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String A2010BarTipDis ;
   private String A135BarColNom ;
   private String A228BarUniMed ;
   private String A279CliNom ;
   private String A1500BarNMtr ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String AV115Hdr ;
   private String AV162P ;
   private String AV80Barcodpar ;
   private String AV94BarSer ;
   private String AV84BarDibCli ;
   private String AV82Barcolnom ;
   private String AV91BarNomcli ;
   private String AV95BarTipDis ;
   private String AV96BarUnimed ;
   private String AV101CliNom ;
   private String AV151vN1 ;
   private String AV152vN2 ;
   private String AV153vN3 ;
   private String AV154vN4 ;
   private String AV85Barfascod ;
   private String AV86BarFasSig ;
   private String AV159vTexto ;
   private String AV155VteD ;
   private String AV138Marca ;
   private String AV144Tab_vf[] ;
   private String Gx_msg ;
   private String AV141Npartidas ;
   private String AV165Er_arts ;
   private String AV166Er_artd ;
   private String AV170Er_arta ;
   private String AV172LastRef ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A200BarPieCod ;
   private String AV168Artcoda ;
   private String AV169AlbRefdsc ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String AV142PtoPlan ;
   private String AV99Clasdsc ;
   private String A65ArtCod ;
   private String A4296ClasDsc ;
   private String A7778ArtUnd ;
   private String Gx_emsg ;
   private String A69ArtDsc ;
   private java.util.Date AV111Fec1 ;
   private java.util.Date AV112Fec2 ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV108DisFec ;
   private java.util.Date A10859Er_FecH ;
   private java.util.Date A10860Er_FecD ;
   private java.util.Date A10862Er_FsUltF ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A156BarFecCum ;
   private java.util.Date AV88Barfecgen ;
   private java.util.Date AV87Barfeccum ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n156BarFecCum ;
   private boolean n1955BarFasSig ;
   private boolean brk47C4 ;
   private boolean n1541BarComMtr ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n7778ArtUnd ;
   private boolean n1148ArtPml ;
   private boolean n95ArtRen ;
   private boolean n10976Er_Arta ;
   private boolean n10974Er_Arts ;
   private boolean n10975Er_Artd ;
   private boolean n10890Er_Est ;
   private boolean n10889Er_St ;
   private boolean n10849Er_ToE ;
   private boolean n10871Er_Ultf ;
   private boolean n10870Er_vN4 ;
   private boolean n10869Er_vN3 ;
   private boolean n10868Er_vN2 ;
   private boolean n10867Er_vN1 ;
   private boolean n10866Er_Um ;
   private boolean n10865Er_Clas ;
   private boolean n10864Er_TArt ;
   private boolean n10863Er_FsSg ;
   private boolean n10862Er_FsUltF ;
   private boolean n10861Er_FsUlt ;
   private boolean n10860Er_FecD ;
   private boolean n10859Er_FecH ;
   private boolean n10858Er_Pdas ;
   private boolean n10857Er_Mts ;
   private boolean n10856Er_Kgs ;
   private boolean n10855Er_Vte ;
   private boolean n10854Er_Dib ;
   private boolean n10853Er_Clav ;
   private boolean n10852Er_Color ;
   private boolean n10851Er_Arti ;
   private boolean n10850Er_Clicod ;
   private boolean n69ArtDsc ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P047C2_A396EmprCod ;
   private String[] P047C2_A1195DisNomCli ;
   private java.util.Date[] P047C2_A369DisFec ;
   private int[] P047C2_A361DisCod ;
   private String[] P047C13_A396EmprCod ;
   private String[] P047C13_A1234BarNomCli ;
   private byte[] P047C13_A213BarSit ;
   private int[] P047C13_A361DisCod ;
   private String[] P047C13_A130BarCodPar ;
   private byte[] P047C13_A132BarCodReo ;
   private int[] P047C13_A129BarCod ;
   private String[] P047C13_A212BarSer ;
   private String[] P047C13_A1798BarDibCli ;
   private String[] P047C13_A2010BarTipDis ;
   private java.util.Date[] P047C13_A159BarFecGen ;
   private String[] P047C13_A135BarColNom ;
   private int[] P047C13_A136BarColNum ;
   private String[] P047C13_A228BarUniMed ;
   private java.math.BigDecimal[] P047C13_A211BarRdt ;
   private short[] P047C13_A864BarPes ;
   private int[] P047C13_A252CliCod ;
   private boolean[] P047C13_n252CliCod ;
   private String[] P047C13_A279CliNom ;
   private String[] P047C13_A1500BarNMtr ;
   private byte[] P047C13_A146BarEst ;
   private String[] P047C13_A151BarFasCod ;
   private boolean[] P047C13_n151BarFasCod ;
   private java.util.Date[] P047C13_A156BarFecCum ;
   private boolean[] P047C13_n156BarFecCum ;
   private String[] P047C13_A1955BarFasSig ;
   private boolean[] P047C13_n1955BarFasSig ;
   private String[] P047C14_A396EmprCod ;
   private int[] P047C14_A44AlbRecCod ;
   private String[] P047C14_A130BarCodPar ;
   private byte[] P047C14_A132BarCodReo ;
   private int[] P047C14_A129BarCod ;
   private int[] P047C14_A252CliCod ;
   private boolean[] P047C14_n252CliCod ;
   private String[] P047C14_A45AlbRef ;
   private String[] P047C14_A3613AlbRefDsc ;
   private short[] P047C14_A4921AlbRAnc ;
   private String[] P047C14_A200BarPieCod ;
   private java.math.BigDecimal[] P047C15_A203BarPieKil ;
   private java.math.BigDecimal[] P047C15_A205BarPieMet ;
   private String[] P047C16_A396EmprCod ;
   private String[] P047C16_A130BarCodPar ;
   private byte[] P047C16_A132BarCodReo ;
   private int[] P047C16_A129BarCod ;
   private String[] P047C16_A1056DisComCod ;
   private java.math.BigDecimal[] P047C16_A1541BarComMtr ;
   private boolean[] P047C16_n1541BarComMtr ;
   private byte[] P047C16_A2524DisComLin ;
   private String[] P047C16_A1032FonCod ;
   private String[] P047C17_A396EmprCod ;
   private java.math.BigDecimal[] P047C17_A1541BarComMtr ;
   private boolean[] P047C17_n1541BarComMtr ;
   private int[] P047C17_A129BarCod ;
   private String[] P047C17_A1056DisComCod ;
   private byte[] P047C17_A2524DisComLin ;
   private String[] P047C17_A130BarCodPar ;
   private byte[] P047C17_A132BarCodReo ;
   private String[] P047C17_A1032FonCod ;
   private short[] P047C18_A4295ClasCod ;
   private boolean[] P047C18_n4295ClasCod ;
   private String[] P047C18_A396EmprCod ;
   private String[] P047C18_A65ArtCod ;
   private int[] P047C18_A252CliCod ;
   private boolean[] P047C18_n252CliCod ;
   private String[] P047C18_A4296ClasDsc ;
   private boolean[] P047C18_n4296ClasDsc ;
   private String[] P047C18_A7778ArtUnd ;
   private boolean[] P047C18_n7778ArtUnd ;
   private short[] P047C18_A1148ArtPml ;
   private boolean[] P047C18_n1148ArtPml ;
   private java.math.BigDecimal[] P047C18_A95ArtRen ;
   private boolean[] P047C18_n95ArtRen ;
   private String[] P047C21_A396EmprCod ;
   private String[] P047C21_A65ArtCod ;
   private int[] P047C21_A252CliCod ;
   private boolean[] P047C21_n252CliCod ;
   private String[] P047C21_A69ArtDsc ;
   private boolean[] P047C21_n69ArtDsc ;
   private String[] P047C22_A396EmprCod ;
   private String[] P047C22_A65ArtCod ;
   private int[] P047C22_A252CliCod ;
   private boolean[] P047C22_n252CliCod ;
   private String[] P047C22_A69ArtDsc ;
   private boolean[] P047C22_n69ArtDsc ;
}

final  class per0005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P047C2", "SELECT EmprCod, DisNomCli, DisFec, DisCod FROM TXPDISPOS WHERE (EmprCod = ? and DisFec >= ?) AND (DisNomCli <> '99' and DisNomCli <> '98') AND (DisFec <= ?) ORDER BY EmprCod, DisFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P047C13", "SELECT T1.EmprCod, T1.BarNomCli, T1.BarSit, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSer, T1.BarDibCli, T1.BarTipDis, T1.BarFecGen, T1.BarColNom, T1.BarColNum, T1.BarUniMed, T1.BarRdt, T1.BarPes, T1.CliCod, T2.CliNom, T1.BarNMtr, T1.BarEst, COALESCE( T3.BarFasCod, ' ') AS BarFasCod, COALESCE( T4.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T5.BarFasCod, ' ') AS BarFasSig FROM ((((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasCod, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar FROM (TXPBARFAS T6 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T7.GXC1) AND (T6.BarFasEst <> 0) GROUP BY T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T6.BarFecRea) AS BarFecCum, COALESCE( T7.BarProCod, '') AS BarProCod, COALESCE( T8.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MIN(T9.ProCod) AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE T9.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE T6.ProCod = COALESCE( T7.BarProCod, '') and T6.BarOrdLin = COALESCE( T8.BarFasLin, 0) GROUP BY T7.BarProCod, T8.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T6.FasCod) AS BarFasCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar FROM ((TXPBARFAS T6 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T6.EmprCod AND T7.BarCod = T6.BarCod AND T7.BarCodReo = T6.BarCodReo AND T7.BarCodPar = T6.BarCodPar) INNER JOIN (SELECT MIN(T9.BarOrdLin) AS GXC2, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin >= 0) AND (T9.BarOrdLin > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod = T6.EmprCod AND T8.BarCod = T6.BarCod AND T8.BarCodReo = T6.BarCodReo AND T8.BarCodPar = T6.BarCodPar) WHERE (T6.BarOrdLin = T8.GXC2) AND (T6.BarOrdLin >= 0) AND (T6.BarOrdLin > COALESCE( T7.BarFasLin, 0)) AND (T6.BarFasEst = 0) GROUP BY T7.BarFasLin, T6.EmprCod, T6.BarCod, T6.BarCodReo, T6.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T1.BarSit <= 6) AND (T1.BarNomCli <> '99' and T1.BarNomCli <> '98') ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P047C14", "SELECT T1.EmprCod, T1.AlbRecCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.CliCod, T2.AlbRef, T2.AlbRefDsc, T2.AlbRAnc, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P047C15", "SELECT SUM(BarPieKil), SUM(BarPieMet) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P047C16", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, DisComCod, BarComMtr, DisComLin, FonCod FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P047C17", "SELECT EmprCod, BarComMtr, BarCod, DisComCod, DisComLin, BarCodPar, BarCodReo, FonCod FROM TXPBARCOM WHERE (EmprCod = ? and BarCod = ?) AND (BarComMtr > 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P047C18", "SELECT T1.ClasCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T2.ClasDsc, T1.ArtUnd, T1.ArtPml, T1.ArtRen FROM (TXPARTICU T1 LEFT JOIN TXPCLAPEN T2 ON T2.EmprCod = T1.EmprCod AND T2.ClasCod = T1.ClasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P047C19", "UPDATE TXPERPROD SET Er_Arta=?, Er_Arts=?, Er_Artd=?, Er_Est=?, Er_St=?, Er_ToE=?, Er_Ultf=0, Er_vN4=?, Er_vN3=?, Er_vN2=?, Er_vN1=?, Er_Um=?, Er_Clas=SUBSTR(?, 1, 30), Er_TArt=?, Er_FsSg=?, Er_FsUltF=?, Er_FsUlt=?, Er_FecD=?, Er_FecH=?, Er_Pdas=?, Er_Mts=?, Er_Kgs=?, Er_Vte=?, Er_Dib=?, Er_Clav=?, Er_Color=?, Er_Arti=?, Er_Clicod=?  WHERE EmprCod = ? and Er_Hdr = ? and Er_Hdrr = ? and Er_hdrp = ? and Er_LinV = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPERPROD")
         ,new UpdateCursor("P047C20", "INSERT INTO TXPERPROD(EmprCod, Er_Hdr, Er_Hdrr, Er_hdrp, Er_LinV, Er_ToE, Er_Clicod, Er_Arti, Er_Color, Er_Clav, Er_Dib, Er_Vte, Er_Kgs, Er_Mts, Er_Pdas, Er_FecH, Er_FecD, Er_FsUlt, Er_FsUltF, Er_FsSg, Er_TArt, Er_Clas, Er_Um, Er_vN1, Er_vN2, Er_vN3, Er_vN4, Er_Ultf, Er_St, Er_Est, Er_Arts, Er_Artd, Er_Arta, Er_Nhdrs, Er_Discod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPERPROD")
         ,new ForEachCursor("P047C21", "SELECT EmprCod, ArtCod, CliCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P047C22", "SELECT EmprCod, ArtCod, CliCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = 1 and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 30);
               ((String[]) buf[19])[0] = rslt.getString(19, 10);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               stmt.setString(12, (String)parms[22], 40);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 30);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 8);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[28]);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 8);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[32]);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DATE );
               }
               else
               {
                  stmt.setDate(18, (java.util.Date)parms[34]);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 30);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 12);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 16);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 13);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 13);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 16);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[52]).intValue());
               }
               stmt.setString(28, (String)parms[53], 3);
               stmt.setInt(29, ((Number) parms[54]).intValue());
               stmt.setByte(30, ((Number) parms[55]).byteValue());
               stmt.setString(31, (String)parms[56], 1);
               stmt.setByte(32, ((Number) parms[57]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 16);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 12);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 30);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[26]);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[28]);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[30], 8);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[32]);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[34], 8);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[36], 30);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[38], 30);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[50]).shortValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[52]).byteValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[54]).byteValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[56], 30);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[58], 100);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[60], 30);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               return;
      }
   }

}

