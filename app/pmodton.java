package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodton extends GXProcedure
{
   public pmodton( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodton.class ), "" );
   }

   public pmodton( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pmodton.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pmodton.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodton.this.AV15ResCodChar = aP1[0];
      this.aP1 = aP1;
      pmodton.this.AV25ResParCod = aP2[0];
      this.aP2 = aP2;
      pmodton.this.AV27Forzado = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26ResCod = (int)(GXutil.lval( AV15ResCodChar)) ;
      GXt_int1 = AV24MedTie ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = "030400" ;
      GXv_int4[0] = GXt_int1 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pmodton.this.A396EmprCod = GXv_char2[0] ;
      pmodton.this.GXt_int1 = GXv_int4[0] ;
      AV24MedTie = GXt_int1 ;
      GXt_int5 = AV17SoloMtr ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTRPLN", ""), GXv_int6) ;
      pmodton.this.GXt_int5 = GXv_int6[0] ;
      AV17SoloMtr = GXt_int5 ;
      GXt_int5 = AV18SoloKgm ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILPLN", ""), GXv_int6) ;
      pmodton.this.GXt_int5 = GXv_int6[0] ;
      AV18SoloKgm = GXt_int5 ;
      GXt_int1 = AV19MinTint ;
      GXv_int4[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MINTIN", ""), GXv_int4) ;
      pmodton.this.GXt_int1 = GXv_int4[0] ;
      AV19MinTint = (short)(GXt_int1) ;
      AV19MinTint = (short)(((AV19MinTint==0) ? 480 : AV19MinTint)) ;
      Gx_msg = "" ;
      /* Using cursor P00NZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV26ResCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10452ResKgm = P00NZ2_A10452ResKgm[0] ;
         n10452ResKgm = P00NZ2_n10452ResKgm[0] ;
         A10453ResMtr = P00NZ2_A10453ResMtr[0] ;
         n10453ResMtr = P00NZ2_n10453ResMtr[0] ;
         A10454ResPie = P00NZ2_A10454ResPie[0] ;
         n10454ResPie = P00NZ2_n10454ResPie[0] ;
         A10433ResCod = P00NZ2_A10433ResCod[0] ;
         A10456ResPar = P00NZ2_A10456ResPar[0] ;
         n10456ResPar = P00NZ2_n10456ResPar[0] ;
         if ( A10456ResPar == 1 )
         {
            Gx_msg += httpContext.getMessage( "Tiene Particiones", "") + GXutil.newLine( ) ;
            /* Using cursor P00NZ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A10457ResParCod = P00NZ3_A10457ResParCod[0] ;
               A10475ResFasDec = P00NZ3_A10475ResFasDec[0] ;
               n10475ResFasDec = P00NZ3_n10475ResFasDec[0] ;
               A10464ResLin = P00NZ3_A10464ResLin[0] ;
               Gx_msg += httpContext.getMessage( "-> Hay fases de la partición base.", "") + GXutil.newLine( ) ;
               /* Using cursor P00NZ4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFas");
               pr_default.readNext(1);
            }
            pr_default.close(1);
            Gx_msg += httpContext.getMessage( "Tiene Particiones", "") + GXutil.newLine( ) ;
            /* Using cursor P00NZ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A10457ResParCod = P00NZ5_A10457ResParCod[0] ;
               Gx_msg += httpContext.getMessage( "-> Hay particion base.", "") + GXutil.newLine( ) ;
               /* Using cursor P00NZ6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
         }
         else
         {
            Gx_msg += httpContext.getMessage( "NO tiene Particiones", "") + GXutil.newLine( ) ;
            AV35GXLvl28 = (byte)(0) ;
            /* Using cursor P00NZ7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A10457ResParCod = P00NZ7_A10457ResParCod[0] ;
               AV35GXLvl28 = (byte)(1) ;
               Gx_msg += httpContext.getMessage( "-> Hay particion base.", "") + GXutil.newLine( ) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
            if ( AV35GXLvl28 == 0 )
            {
               Gx_msg += httpContext.getMessage( "-> NO hay particion base.", "") + GXutil.newLine( ) ;
               /*
                  INSERT RECORD ON TABLE TXPResPar

               */
               Gx_msg += httpContext.getMessage( "--> CREO particion base.", "") + GXutil.newLine( ) ;
               A10457ResParCod = " " ;
               A10458ResParKgm = A10452ResKgm ;
               n10458ResParKgm = false ;
               A10459ResParMtr = A10453ResMtr ;
               n10459ResParMtr = false ;
               A10460ResParPie = A10454ResPie ;
               n10460ResParPie = false ;
               /* Using cursor P00NZ8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Boolean.valueOf(n10458ResParKgm), A10458ResParKgm, Boolean.valueOf(n10459ResParMtr), A10459ResParMtr, Boolean.valueOf(n10460ResParPie), Integer.valueOf(A10460ResParPie)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResPar");
               if ( (pr_default.getStatus(6) == 1) )
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
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Gx_msg += httpContext.getMessage( "Buscando Reserva : ", "") + AV15ResCodChar + "/\"" + AV25ResParCod + "\"" + GXutil.newLine( ) ;
      /* Using cursor P00NZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV26ResCod), AV25ResParCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A10458ResParKgm = P00NZ9_A10458ResParKgm[0] ;
         n10458ResParKgm = P00NZ9_n10458ResParKgm[0] ;
         A10459ResParMtr = P00NZ9_A10459ResParMtr[0] ;
         n10459ResParMtr = P00NZ9_n10459ResParMtr[0] ;
         A10455ResUni = P00NZ9_A10455ResUni[0] ;
         n10455ResUni = P00NZ9_n10455ResUni[0] ;
         A10460ResParPie = P00NZ9_A10460ResParPie[0] ;
         n10460ResParPie = P00NZ9_n10460ResParPie[0] ;
         A10446ResTipCol = P00NZ9_A10446ResTipCol[0] ;
         n10446ResTipCol = P00NZ9_n10446ResTipCol[0] ;
         A10445ResColNum = P00NZ9_A10445ResColNum[0] ;
         n10445ResColNum = P00NZ9_n10445ResColNum[0] ;
         A10444ResColNom = P00NZ9_A10444ResColNom[0] ;
         n10444ResColNom = P00NZ9_n10444ResColNom[0] ;
         A10442ResArtCod = P00NZ9_A10442ResArtCod[0] ;
         A10440ResCliCod = P00NZ9_A10440ResCliCod[0] ;
         n10440ResCliCod = P00NZ9_n10440ResCliCod[0] ;
         A10457ResParCod = P00NZ9_A10457ResParCod[0] ;
         A10433ResCod = P00NZ9_A10433ResCod[0] ;
         A10455ResUni = P00NZ9_A10455ResUni[0] ;
         n10455ResUni = P00NZ9_n10455ResUni[0] ;
         A10446ResTipCol = P00NZ9_A10446ResTipCol[0] ;
         n10446ResTipCol = P00NZ9_n10446ResTipCol[0] ;
         A10445ResColNum = P00NZ9_A10445ResColNum[0] ;
         n10445ResColNum = P00NZ9_n10445ResColNum[0] ;
         A10444ResColNom = P00NZ9_A10444ResColNom[0] ;
         n10444ResColNom = P00NZ9_n10444ResColNom[0] ;
         A10440ResCliCod = P00NZ9_A10440ResCliCod[0] ;
         n10440ResCliCod = P00NZ9_n10440ResCliCod[0] ;
         A10442ResArtCod = P00NZ9_A10442ResArtCod[0] ;
         Gx_msg += httpContext.getMessage( "Encontré la Reserva.", "") + GXutil.newLine( ) ;
         AV28Salir = (byte)(0) ;
         /* Using cursor P00NZ10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A10464ResLin = P00NZ10_A10464ResLin[0] ;
            Gx_msg += httpContext.getMessage( "-> Borrando Línea : ", "") + GXutil.trim( GXutil.str( A10464ResLin, 10, 0)) + GXutil.newLine( ) ;
            if ( AV27Forzado == 1 )
            {
               /* Using cursor P00NZ11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFas");
            }
            else
            {
               AV28Salir = (byte)(1) ;
            }
            pr_default.readNext(8);
         }
         pr_default.close(8);
         if ( AV28Salir == 0 )
         {
            AV38GXLvl59 = (byte)(0) ;
            /* Using cursor P00NZ12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod, Boolean.valueOf(n10444ResColNom), A10444ResColNom, Boolean.valueOf(n10445ResColNum), Integer.valueOf(A10445ResColNum), Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A252CliCod = P00NZ12_A252CliCod[0] ;
               A494ForSer = P00NZ12_A494ForSer[0] ;
               A482ForColNom = P00NZ12_A482ForColNom[0] ;
               A483ForColNum = P00NZ12_A483ForColNum[0] ;
               A831TipColCod = P00NZ12_A831TipColCod[0] ;
               AV38GXLvl59 = (byte)(1) ;
               GXt_int7 = AV20TiempoT ;
               GXv_char3[0] = A396EmprCod ;
               GXv_int4[0] = A10440ResCliCod ;
               GXv_char2[0] = A10442ResArtCod ;
               GXv_char8[0] = A10444ResColNom ;
               GXv_int9[0] = A10445ResColNum ;
               GXv_int6[0] = A10446ResTipCol ;
               GXv_int10[0] = GXt_int7 ;
               new app.pfortie(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char8, GXv_int9, GXv_int6, GXv_int10) ;
               pmodton.this.A396EmprCod = GXv_char3[0] ;
               pmodton.this.A10440ResCliCod = GXv_int4[0] ;
               pmodton.this.A10442ResArtCod = GXv_char2[0] ;
               pmodton.this.A10444ResColNom = GXv_char8[0] ;
               pmodton.this.A10445ResColNum = GXv_int9[0] ;
               pmodton.this.A10446ResTipCol = GXv_int6[0] ;
               pmodton.this.GXt_int7 = GXv_int10[0] ;
               AV20TiempoT = (byte)(GXt_int7) ;
               AV21ExColor = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(10);
            if ( AV38GXLvl59 == 0 )
            {
               /* Using cursor P00NZ13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n10446ResTipCol), Byte.valueOf(A10446ResTipCol)});
               while ( (pr_default.getStatus(11) != 101) )
               {
                  A831TipColCod = P00NZ13_A831TipColCod[0] ;
                  A4999TipColTie = P00NZ13_A4999TipColTie[0] ;
                  n4999TipColTie = P00NZ13_n4999TipColTie[0] ;
                  AV23TiempoTC = (short)(A4999TipColTie) ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(11);
               AV21ExColor = (byte)(2) ;
            }
            Gx_msg += httpContext.getMessage( "Verifique color: ", "") + ((AV21ExColor==1) ? httpContext.getMessage( "Existe", "") : httpContext.getMessage( "No Existe", "")) + httpContext.getMessage( ", el tiempo de tintura será de : ", "") + GXutil.trim( GXutil.str( ((AV21ExColor==1) ? AV20TiempoT : AV23TiempoTC), 10, 0)) + "." + GXutil.newLine( ) ;
            AV16ResLin = 0 ;
            /* Using cursor P00NZ14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n10440ResCliCod), Integer.valueOf(A10440ResCliCod), A10442ResArtCod});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A252CliCod = P00NZ14_A252CliCod[0] ;
               A65ArtCod = P00NZ14_A65ArtCod[0] ;
               Gx_msg += httpContext.getMessage( "->Existe Artículo : ", "") + GXutil.trim( GXutil.str( A252CliCod, 10, 0)) + "/" + GXutil.trim( A65ArtCod) + GXutil.newLine( ) ;
               /* Using cursor P00NZ15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
               while ( (pr_default.getStatus(13) != 101) )
               {
                  A95ArtRen = P00NZ15_A95ArtRen[0] ;
                  n95ArtRen = P00NZ15_n95ArtRen[0] ;
                  A758ProCod = P00NZ15_A758ProCod[0] ;
                  A95ArtRen = P00NZ15_A95ArtRen[0] ;
                  n95ArtRen = P00NZ15_n95ArtRen[0] ;
                  Gx_msg += httpContext.getMessage( "-->Existe Proceso : ", "") + GXutil.trim( A758ProCod) + GXutil.newLine( ) ;
                  /* Using cursor P00NZ16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod});
                  while ( (pr_default.getStatus(14) != 101) )
                  {
                     A457FasCod = P00NZ16_A457FasCod[0] ;
                     A602MaqCod = P00NZ16_A602MaqCod[0] ;
                     n602MaqCod = P00NZ16_n602MaqCod[0] ;
                     A4299FasConPla = P00NZ16_A4299FasConPla[0] ;
                     n4299FasConPla = P00NZ16_n4299FasConPla[0] ;
                     A464FasNumPas = P00NZ16_A464FasNumPas[0] ;
                     n464FasNumPas = P00NZ16_n464FasNumPas[0] ;
                     A472FasVelPro = P00NZ16_A472FasVelPro[0] ;
                     n472FasVelPro = P00NZ16_n472FasVelPro[0] ;
                     A4286FasForMul = P00NZ16_A4286FasForMul[0] ;
                     n4286FasForMul = P00NZ16_n4286FasForMul[0] ;
                     A456FasActTin = P00NZ16_A456FasActTin[0] ;
                     n456FasActTin = P00NZ16_n456FasActTin[0] ;
                     A468FasPrePie = P00NZ16_A468FasPrePie[0] ;
                     n468FasPrePie = P00NZ16_n468FasPrePie[0] ;
                     A469FasPreSal = P00NZ16_A469FasPreSal[0] ;
                     n469FasPreSal = P00NZ16_n469FasPreSal[0] ;
                     A5990FasDec2 = P00NZ16_A5990FasDec2[0] ;
                     n5990FasDec2 = P00NZ16_n5990FasDec2[0] ;
                     A459FasDec = P00NZ16_A459FasDec[0] ;
                     n459FasDec = P00NZ16_n459FasDec[0] ;
                     A774ProNumLin = P00NZ16_A774ProNumLin[0] ;
                     A602MaqCod = P00NZ16_A602MaqCod[0] ;
                     n602MaqCod = P00NZ16_n602MaqCod[0] ;
                     A4299FasConPla = P00NZ16_A4299FasConPla[0] ;
                     n4299FasConPla = P00NZ16_n4299FasConPla[0] ;
                     A464FasNumPas = P00NZ16_A464FasNumPas[0] ;
                     n464FasNumPas = P00NZ16_n464FasNumPas[0] ;
                     A472FasVelPro = P00NZ16_A472FasVelPro[0] ;
                     n472FasVelPro = P00NZ16_n472FasVelPro[0] ;
                     A4286FasForMul = P00NZ16_A4286FasForMul[0] ;
                     n4286FasForMul = P00NZ16_n4286FasForMul[0] ;
                     A456FasActTin = P00NZ16_A456FasActTin[0] ;
                     n456FasActTin = P00NZ16_n456FasActTin[0] ;
                     A468FasPrePie = P00NZ16_A468FasPrePie[0] ;
                     n468FasPrePie = P00NZ16_n468FasPrePie[0] ;
                     A469FasPreSal = P00NZ16_A469FasPreSal[0] ;
                     n469FasPreSal = P00NZ16_n469FasPreSal[0] ;
                     A5990FasDec2 = P00NZ16_A5990FasDec2[0] ;
                     n5990FasDec2 = P00NZ16_n5990FasDec2[0] ;
                     A459FasDec = P00NZ16_A459FasDec[0] ;
                     n459FasDec = P00NZ16_n459FasDec[0] ;
                     GXt_int7 = AV22TiempoA ;
                     GXv_char8[0] = A396EmprCod ;
                     GXv_int9[0] = A10440ResCliCod ;
                     GXv_char3[0] = A10442ResArtCod ;
                     GXv_char2[0] = A758ProCod ;
                     GXv_char11[0] = A457FasCod ;
                     GXv_int10[0] = GXt_int7 ;
                     new app.pfortie1(remoteHandle, context).execute( GXv_char8, GXv_int9, GXv_char3, GXv_char2, GXv_char11, GXv_int10) ;
                     pmodton.this.A396EmprCod = GXv_char8[0] ;
                     pmodton.this.A10440ResCliCod = GXv_int9[0] ;
                     pmodton.this.A10442ResArtCod = GXv_char3[0] ;
                     pmodton.this.A758ProCod = GXv_char2[0] ;
                     pmodton.this.A457FasCod = GXv_char11[0] ;
                     pmodton.this.GXt_int7 = GXv_int10[0] ;
                     AV22TiempoA = GXt_int7 ;
                     Gx_msg += httpContext.getMessage( "---> Linea ", "") + GXutil.trim( GXutil.str( A774ProNumLin, 10, 0)) + httpContext.getMessage( ", Tiempo Acabado : ", "") + GXutil.trim( GXutil.str( AV22TiempoA, 10, 0)) + GXutil.newLine( ) ;
                     AV16ResLin = (int)(AV16ResLin+100) ;
                     /*
                        INSERT RECORD ON TABLE TXPResFas

                     */
                     A10464ResLin = AV16ResLin ;
                     A10465ResProCod = A758ProCod ;
                     n10465ResProCod = false ;
                     A10467ResFasCod = A457FasCod ;
                     n10467ResFasCod = false ;
                     A10472ResFasMaq = A602MaqCod ;
                     n10472ResFasMaq = false ;
                     A10469ResFasPla = A4299FasConPla ;
                     n10469ResFasPla = false ;
                     A10474ResFasPri = (byte)(0) ;
                     n10474ResFasPri = false ;
                     A10471ResFasDur = (int)(A469FasPreSal+(A468FasPrePie*A10460ResParPie)+((AV21ExColor==1)&&(GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", ""))==0) ? AV20TiempoT : ((GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", ""))==0) ? ((AV23TiempoTC==0) ? AV19MinTint : AV23TiempoTC) : ((GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", ""))==0) ? AV20TiempoT : ((A472FasVelPro.doubleValue()==0) ? 0 : (int)(DecimalUtil.decToDouble(((GXutil.strcmp(A10455ResUni, httpContext.getMessage( "M", ""))==0)||(AV17SoloMtr==1) ? ((A10459ResParMtr.divide(A472FasVelPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A464FasNumPas))) : ((AV18SoloKgm==1) ? ((A10458ResParKgm.divide(A472FasVelPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A464FasNumPas))) : ((A95ArtRen.doubleValue()>0) ? ((A10458ResParKgm.multiply(A95ArtRen).divide(A472FasVelPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A464FasNumPas))) : ((A10459ResParMtr.divide(A472FasVelPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A464FasNumPas))))))))))))/ (double) (AV24MedTie)) ;
                     n10471ResFasDur = false ;
                     A10475ResFasDec = (int)(DecimalUtil.decToDouble(A459FasDec.multiply(DecimalUtil.doubleToDec(1440)).add(A5990FasDec2.multiply(DecimalUtil.doubleToDec(60))))) ;
                     n10475ResFasDec = false ;
                     Gx_msg += httpContext.getMessage( "---> Duración ", "") + GXutil.trim( GXutil.str( A10471ResFasDur, 10, 0)) + GXutil.newLine( ) ;
                     /* Using cursor P00NZ17 */
                     pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod), A10457ResParCod, Integer.valueOf(A10464ResLin), Boolean.valueOf(n10465ResProCod), A10465ResProCod, Boolean.valueOf(n10467ResFasCod), A10467ResFasCod, Boolean.valueOf(n10469ResFasPla), A10469ResFasPla, Boolean.valueOf(n10471ResFasDur), Integer.valueOf(A10471ResFasDur), Boolean.valueOf(n10472ResFasMaq), A10472ResFasMaq, Boolean.valueOf(n10474ResFasPri), Byte.valueOf(A10474ResFasPri), Boolean.valueOf(n10475ResFasDec), Integer.valueOf(A10475ResFasDec)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFas");
                     if ( (pr_default.getStatus(15) == 1) )
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
                     pr_default.readNext(14);
                  }
                  pr_default.close(14);
                  pr_default.readNext(13);
               }
               pr_default.close(13);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(12);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodton.this.A396EmprCod;
      this.aP1[0] = pmodton.this.AV15ResCodChar;
      this.aP2[0] = pmodton.this.AV25ResParCod;
      this.aP3[0] = pmodton.this.AV27Forzado;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodton");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P00NZ2_A396EmprCod = new String[] {""} ;
      P00NZ2_A10452ResKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ2_n10452ResKgm = new boolean[] {false} ;
      P00NZ2_A10453ResMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ2_n10453ResMtr = new boolean[] {false} ;
      P00NZ2_A10454ResPie = new int[1] ;
      P00NZ2_n10454ResPie = new boolean[] {false} ;
      P00NZ2_A10433ResCod = new int[1] ;
      P00NZ2_A10456ResPar = new byte[1] ;
      P00NZ2_n10456ResPar = new boolean[] {false} ;
      A10452ResKgm = DecimalUtil.ZERO ;
      A10453ResMtr = DecimalUtil.ZERO ;
      P00NZ3_A396EmprCod = new String[] {""} ;
      P00NZ3_A10433ResCod = new int[1] ;
      P00NZ3_A10457ResParCod = new String[] {""} ;
      P00NZ3_A10475ResFasDec = new int[1] ;
      P00NZ3_n10475ResFasDec = new boolean[] {false} ;
      P00NZ3_A10464ResLin = new int[1] ;
      A10457ResParCod = "" ;
      P00NZ5_A396EmprCod = new String[] {""} ;
      P00NZ5_A10433ResCod = new int[1] ;
      P00NZ5_A10457ResParCod = new String[] {""} ;
      P00NZ7_A396EmprCod = new String[] {""} ;
      P00NZ7_A10433ResCod = new int[1] ;
      P00NZ7_A10457ResParCod = new String[] {""} ;
      A10458ResParKgm = DecimalUtil.ZERO ;
      A10459ResParMtr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P00NZ9_A396EmprCod = new String[] {""} ;
      P00NZ9_A10458ResParKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ9_n10458ResParKgm = new boolean[] {false} ;
      P00NZ9_A10459ResParMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ9_n10459ResParMtr = new boolean[] {false} ;
      P00NZ9_A10455ResUni = new String[] {""} ;
      P00NZ9_n10455ResUni = new boolean[] {false} ;
      P00NZ9_A10460ResParPie = new int[1] ;
      P00NZ9_n10460ResParPie = new boolean[] {false} ;
      P00NZ9_A10446ResTipCol = new byte[1] ;
      P00NZ9_n10446ResTipCol = new boolean[] {false} ;
      P00NZ9_A10445ResColNum = new int[1] ;
      P00NZ9_n10445ResColNum = new boolean[] {false} ;
      P00NZ9_A10444ResColNom = new String[] {""} ;
      P00NZ9_n10444ResColNom = new boolean[] {false} ;
      P00NZ9_A10442ResArtCod = new String[] {""} ;
      P00NZ9_A10440ResCliCod = new int[1] ;
      P00NZ9_n10440ResCliCod = new boolean[] {false} ;
      P00NZ9_A10457ResParCod = new String[] {""} ;
      P00NZ9_A10433ResCod = new int[1] ;
      A10455ResUni = "" ;
      A10444ResColNom = "" ;
      A10442ResArtCod = "" ;
      P00NZ10_A396EmprCod = new String[] {""} ;
      P00NZ10_A10433ResCod = new int[1] ;
      P00NZ10_A10457ResParCod = new String[] {""} ;
      P00NZ10_A10464ResLin = new int[1] ;
      P00NZ12_A396EmprCod = new String[] {""} ;
      P00NZ12_A252CliCod = new int[1] ;
      P00NZ12_A494ForSer = new String[] {""} ;
      P00NZ12_A482ForColNom = new String[] {""} ;
      P00NZ12_A483ForColNum = new int[1] ;
      P00NZ12_A831TipColCod = new byte[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      GXv_int4 = new int[1] ;
      GXv_int6 = new byte[1] ;
      P00NZ13_A396EmprCod = new String[] {""} ;
      P00NZ13_A831TipColCod = new byte[1] ;
      P00NZ13_A4999TipColTie = new int[1] ;
      P00NZ13_n4999TipColTie = new boolean[] {false} ;
      P00NZ14_A396EmprCod = new String[] {""} ;
      P00NZ14_A252CliCod = new int[1] ;
      P00NZ14_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      P00NZ15_A396EmprCod = new String[] {""} ;
      P00NZ15_A252CliCod = new int[1] ;
      P00NZ15_A65ArtCod = new String[] {""} ;
      P00NZ15_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ15_n95ArtRen = new boolean[] {false} ;
      P00NZ15_A758ProCod = new String[] {""} ;
      A95ArtRen = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      P00NZ16_A396EmprCod = new String[] {""} ;
      P00NZ16_A758ProCod = new String[] {""} ;
      P00NZ16_A457FasCod = new String[] {""} ;
      P00NZ16_A602MaqCod = new String[] {""} ;
      P00NZ16_n602MaqCod = new boolean[] {false} ;
      P00NZ16_A4299FasConPla = new String[] {""} ;
      P00NZ16_n4299FasConPla = new boolean[] {false} ;
      P00NZ16_A464FasNumPas = new short[1] ;
      P00NZ16_n464FasNumPas = new boolean[] {false} ;
      P00NZ16_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ16_n472FasVelPro = new boolean[] {false} ;
      P00NZ16_A4286FasForMul = new String[] {""} ;
      P00NZ16_n4286FasForMul = new boolean[] {false} ;
      P00NZ16_A456FasActTin = new String[] {""} ;
      P00NZ16_n456FasActTin = new boolean[] {false} ;
      P00NZ16_A468FasPrePie = new short[1] ;
      P00NZ16_n468FasPrePie = new boolean[] {false} ;
      P00NZ16_A469FasPreSal = new short[1] ;
      P00NZ16_n469FasPreSal = new boolean[] {false} ;
      P00NZ16_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ16_n5990FasDec2 = new boolean[] {false} ;
      P00NZ16_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NZ16_n459FasDec = new boolean[] {false} ;
      P00NZ16_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      A602MaqCod = "" ;
      A4299FasConPla = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A4286FasForMul = "" ;
      A456FasActTin = "" ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      A459FasDec = DecimalUtil.ZERO ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new short[1] ;
      A10465ResProCod = "" ;
      A10467ResFasCod = "" ;
      A10472ResFasMaq = "" ;
      A10469ResFasPla = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodton__default(),
         new Object[] {
             new Object[] {
            P00NZ2_A396EmprCod, P00NZ2_A10452ResKgm, P00NZ2_n10452ResKgm, P00NZ2_A10453ResMtr, P00NZ2_n10453ResMtr, P00NZ2_A10454ResPie, P00NZ2_n10454ResPie, P00NZ2_A10433ResCod, P00NZ2_A10456ResPar, P00NZ2_n10456ResPar
            }
            , new Object[] {
            P00NZ3_A396EmprCod, P00NZ3_A10433ResCod, P00NZ3_A10457ResParCod, P00NZ3_A10475ResFasDec, P00NZ3_n10475ResFasDec, P00NZ3_A10464ResLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00NZ5_A396EmprCod, P00NZ5_A10433ResCod, P00NZ5_A10457ResParCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00NZ7_A396EmprCod, P00NZ7_A10433ResCod, P00NZ7_A10457ResParCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00NZ9_A396EmprCod, P00NZ9_A10458ResParKgm, P00NZ9_n10458ResParKgm, P00NZ9_A10459ResParMtr, P00NZ9_n10459ResParMtr, P00NZ9_A10455ResUni, P00NZ9_n10455ResUni, P00NZ9_A10460ResParPie, P00NZ9_n10460ResParPie, P00NZ9_A10446ResTipCol,
            P00NZ9_n10446ResTipCol, P00NZ9_A10445ResColNum, P00NZ9_n10445ResColNum, P00NZ9_A10444ResColNom, P00NZ9_n10444ResColNom, P00NZ9_A10442ResArtCod, P00NZ9_A10440ResCliCod, P00NZ9_n10440ResCliCod, P00NZ9_A10457ResParCod, P00NZ9_A10433ResCod
            }
            , new Object[] {
            P00NZ10_A396EmprCod, P00NZ10_A10433ResCod, P00NZ10_A10457ResParCod, P00NZ10_A10464ResLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00NZ12_A396EmprCod, P00NZ12_A252CliCod, P00NZ12_A494ForSer, P00NZ12_A482ForColNom, P00NZ12_A483ForColNum, P00NZ12_A831TipColCod
            }
            , new Object[] {
            P00NZ13_A396EmprCod, P00NZ13_A831TipColCod, P00NZ13_A4999TipColTie, P00NZ13_n4999TipColTie
            }
            , new Object[] {
            P00NZ14_A396EmprCod, P00NZ14_A252CliCod, P00NZ14_A65ArtCod
            }
            , new Object[] {
            P00NZ15_A396EmprCod, P00NZ15_A252CliCod, P00NZ15_A65ArtCod, P00NZ15_A95ArtRen, P00NZ15_n95ArtRen, P00NZ15_A758ProCod
            }
            , new Object[] {
            P00NZ16_A396EmprCod, P00NZ16_A758ProCod, P00NZ16_A457FasCod, P00NZ16_A602MaqCod, P00NZ16_n602MaqCod, P00NZ16_A4299FasConPla, P00NZ16_n4299FasConPla, P00NZ16_A464FasNumPas, P00NZ16_n464FasNumPas, P00NZ16_A472FasVelPro,
            P00NZ16_n472FasVelPro, P00NZ16_A4286FasForMul, P00NZ16_n4286FasForMul, P00NZ16_A456FasActTin, P00NZ16_n456FasActTin, P00NZ16_A468FasPrePie, P00NZ16_n468FasPrePie, P00NZ16_A469FasPreSal, P00NZ16_n469FasPreSal, P00NZ16_A5990FasDec2,
            P00NZ16_n5990FasDec2, P00NZ16_A459FasDec, P00NZ16_n459FasDec, P00NZ16_A774ProNumLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27Forzado ;
   private byte AV17SoloMtr ;
   private byte AV18SoloKgm ;
   private byte GXt_int5 ;
   private byte A10456ResPar ;
   private byte AV35GXLvl28 ;
   private byte A10446ResTipCol ;
   private byte AV28Salir ;
   private byte AV38GXLvl59 ;
   private byte A831TipColCod ;
   private byte AV20TiempoT ;
   private byte GXv_int6[] ;
   private byte AV21ExColor ;
   private byte A10474ResFasPri ;
   private short AV19MinTint ;
   private short Gx_err ;
   private short AV23TiempoTC ;
   private short A464FasNumPas ;
   private short A468FasPrePie ;
   private short A469FasPreSal ;
   private short A774ProNumLin ;
   private short AV22TiempoA ;
   private short GXt_int7 ;
   private short GXv_int10[] ;
   private int AV26ResCod ;
   private int AV24MedTie ;
   private int GXt_int1 ;
   private int A10454ResPie ;
   private int A10433ResCod ;
   private int A10475ResFasDec ;
   private int A10464ResLin ;
   private int GX_INS1408 ;
   private int A10460ResParPie ;
   private int A10445ResColNum ;
   private int A10440ResCliCod ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int GXv_int4[] ;
   private int A4999TipColTie ;
   private int AV16ResLin ;
   private int GXv_int9[] ;
   private int GX_INS1409 ;
   private int A10471ResFasDur ;
   private java.math.BigDecimal A10452ResKgm ;
   private java.math.BigDecimal A10453ResMtr ;
   private java.math.BigDecimal A10458ResParKgm ;
   private java.math.BigDecimal A10459ResParMtr ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal A459FasDec ;
   private String A396EmprCod ;
   private String AV15ResCodChar ;
   private String AV25ResParCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A10457ResParCod ;
   private String Gx_emsg ;
   private String A10455ResUni ;
   private String A10444ResColNom ;
   private String A10442ResArtCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A602MaqCod ;
   private String A4299FasConPla ;
   private String A4286FasForMul ;
   private String A456FasActTin ;
   private String GXv_char8[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String A10465ResProCod ;
   private String A10467ResFasCod ;
   private String A10472ResFasMaq ;
   private String A10469ResFasPla ;
   private boolean n10452ResKgm ;
   private boolean n10453ResMtr ;
   private boolean n10454ResPie ;
   private boolean n10456ResPar ;
   private boolean n10475ResFasDec ;
   private boolean n10458ResParKgm ;
   private boolean n10459ResParMtr ;
   private boolean n10460ResParPie ;
   private boolean n10455ResUni ;
   private boolean n10446ResTipCol ;
   private boolean n10445ResColNum ;
   private boolean n10444ResColNom ;
   private boolean n10440ResCliCod ;
   private boolean n4999TipColTie ;
   private boolean n95ArtRen ;
   private boolean n602MaqCod ;
   private boolean n4299FasConPla ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n4286FasForMul ;
   private boolean n456FasActTin ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n5990FasDec2 ;
   private boolean n459FasDec ;
   private boolean n10465ResProCod ;
   private boolean n10467ResFasCod ;
   private boolean n10472ResFasMaq ;
   private boolean n10469ResFasPla ;
   private boolean n10474ResFasPri ;
   private boolean n10471ResFasDur ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NZ2_A396EmprCod ;
   private java.math.BigDecimal[] P00NZ2_A10452ResKgm ;
   private boolean[] P00NZ2_n10452ResKgm ;
   private java.math.BigDecimal[] P00NZ2_A10453ResMtr ;
   private boolean[] P00NZ2_n10453ResMtr ;
   private int[] P00NZ2_A10454ResPie ;
   private boolean[] P00NZ2_n10454ResPie ;
   private int[] P00NZ2_A10433ResCod ;
   private byte[] P00NZ2_A10456ResPar ;
   private boolean[] P00NZ2_n10456ResPar ;
   private String[] P00NZ3_A396EmprCod ;
   private int[] P00NZ3_A10433ResCod ;
   private String[] P00NZ3_A10457ResParCod ;
   private int[] P00NZ3_A10475ResFasDec ;
   private boolean[] P00NZ3_n10475ResFasDec ;
   private int[] P00NZ3_A10464ResLin ;
   private String[] P00NZ5_A396EmprCod ;
   private int[] P00NZ5_A10433ResCod ;
   private String[] P00NZ5_A10457ResParCod ;
   private String[] P00NZ7_A396EmprCod ;
   private int[] P00NZ7_A10433ResCod ;
   private String[] P00NZ7_A10457ResParCod ;
   private String[] P00NZ9_A396EmprCod ;
   private java.math.BigDecimal[] P00NZ9_A10458ResParKgm ;
   private boolean[] P00NZ9_n10458ResParKgm ;
   private java.math.BigDecimal[] P00NZ9_A10459ResParMtr ;
   private boolean[] P00NZ9_n10459ResParMtr ;
   private String[] P00NZ9_A10455ResUni ;
   private boolean[] P00NZ9_n10455ResUni ;
   private int[] P00NZ9_A10460ResParPie ;
   private boolean[] P00NZ9_n10460ResParPie ;
   private byte[] P00NZ9_A10446ResTipCol ;
   private boolean[] P00NZ9_n10446ResTipCol ;
   private int[] P00NZ9_A10445ResColNum ;
   private boolean[] P00NZ9_n10445ResColNum ;
   private String[] P00NZ9_A10444ResColNom ;
   private boolean[] P00NZ9_n10444ResColNom ;
   private String[] P00NZ9_A10442ResArtCod ;
   private int[] P00NZ9_A10440ResCliCod ;
   private boolean[] P00NZ9_n10440ResCliCod ;
   private String[] P00NZ9_A10457ResParCod ;
   private int[] P00NZ9_A10433ResCod ;
   private String[] P00NZ10_A396EmprCod ;
   private int[] P00NZ10_A10433ResCod ;
   private String[] P00NZ10_A10457ResParCod ;
   private int[] P00NZ10_A10464ResLin ;
   private String[] P00NZ12_A396EmprCod ;
   private int[] P00NZ12_A252CliCod ;
   private String[] P00NZ12_A494ForSer ;
   private String[] P00NZ12_A482ForColNom ;
   private int[] P00NZ12_A483ForColNum ;
   private byte[] P00NZ12_A831TipColCod ;
   private String[] P00NZ13_A396EmprCod ;
   private byte[] P00NZ13_A831TipColCod ;
   private int[] P00NZ13_A4999TipColTie ;
   private boolean[] P00NZ13_n4999TipColTie ;
   private String[] P00NZ14_A396EmprCod ;
   private int[] P00NZ14_A252CliCod ;
   private String[] P00NZ14_A65ArtCod ;
   private String[] P00NZ15_A396EmprCod ;
   private int[] P00NZ15_A252CliCod ;
   private String[] P00NZ15_A65ArtCod ;
   private java.math.BigDecimal[] P00NZ15_A95ArtRen ;
   private boolean[] P00NZ15_n95ArtRen ;
   private String[] P00NZ15_A758ProCod ;
   private String[] P00NZ16_A396EmprCod ;
   private String[] P00NZ16_A758ProCod ;
   private String[] P00NZ16_A457FasCod ;
   private String[] P00NZ16_A602MaqCod ;
   private boolean[] P00NZ16_n602MaqCod ;
   private String[] P00NZ16_A4299FasConPla ;
   private boolean[] P00NZ16_n4299FasConPla ;
   private short[] P00NZ16_A464FasNumPas ;
   private boolean[] P00NZ16_n464FasNumPas ;
   private java.math.BigDecimal[] P00NZ16_A472FasVelPro ;
   private boolean[] P00NZ16_n472FasVelPro ;
   private String[] P00NZ16_A4286FasForMul ;
   private boolean[] P00NZ16_n4286FasForMul ;
   private String[] P00NZ16_A456FasActTin ;
   private boolean[] P00NZ16_n456FasActTin ;
   private short[] P00NZ16_A468FasPrePie ;
   private boolean[] P00NZ16_n468FasPrePie ;
   private short[] P00NZ16_A469FasPreSal ;
   private boolean[] P00NZ16_n469FasPreSal ;
   private java.math.BigDecimal[] P00NZ16_A5990FasDec2 ;
   private boolean[] P00NZ16_n5990FasDec2 ;
   private java.math.BigDecimal[] P00NZ16_A459FasDec ;
   private boolean[] P00NZ16_n459FasDec ;
   private short[] P00NZ16_A774ProNumLin ;
}

final  class pmodton__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NZ2", "SELECT EmprCod, ResKgm, ResMtr, ResPie, ResCod, ResPar FROM TXPResFil WHERE EmprCod = ? and ResCod = ? ORDER BY EmprCod, ResCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00NZ3", "SELECT EmprCod, ResCod, ResParCod, ResFasDec, ResLin FROM TXPResFas WHERE EmprCod = ? and ResCod = ? and ResParCod = ' ' ORDER BY EmprCod, ResCod, ResParCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00NZ4", "DELETE FROM TXPResFas  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? AND ResLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPResFas")
         ,new ForEachCursor("P00NZ5", "SELECT EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? and ResCod = ? and ResParCod = ' ' ORDER BY EmprCod, ResCod, ResParCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00NZ6", "DELETE FROM TXPResPar  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPResPar")
         ,new ForEachCursor("P00NZ7", "SELECT EmprCod, ResCod, ResParCod FROM TXPResPar WHERE EmprCod = ? and ResCod = ? and ResParCod = ' ' ORDER BY EmprCod, ResCod, ResParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00NZ8", "INSERT INTO TXPResPar(EmprCod, ResCod, ResParCod, ResParKgm, ResParMtr, ResParPie, ResAgr, ResAgrCod, ResAgrPar) VALUES(?, ?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPResPar")
         ,new ForEachCursor("P00NZ9", "SELECT T1.EmprCod, T1.ResParKgm, T1.ResParMtr, T2.ResUni, T1.ResParPie, T2.ResTipCol, T2.ResColNum, T2.ResColNom AS ResColNom, T3.CliNom AS ResArtCod, T2.ResCliCod AS ResCliCod, T1.ResParCod, T1.ResCod FROM ((TXPResPar T1 INNER JOIN TXPResFil T2 ON T2.EmprCod = T1.EmprCod AND T2.ResCod = T1.ResCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T2.ResColNom AND T3.CliCod = T2.ResCliCod) WHERE T1.EmprCod = ? and T1.ResCod = ? and T1.ResParCod = ? ORDER BY T1.EmprCod, T1.ResCod, T1.ResParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00NZ10", "SELECT EmprCod, ResCod, ResParCod, ResLin FROM TXPResFas WHERE EmprCod = ? and ResCod = ? and ResParCod = ? ORDER BY EmprCod, ResCod, ResParCod, ResLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00NZ11", "DELETE FROM TXPResFas  WHERE EmprCod = ? AND ResCod = ? AND ResParCod = ? AND ResLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPResFas")
         ,new ForEachCursor("P00NZ12", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00NZ13", "SELECT EmprCod, TipColCod, TipColTie FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00NZ14", "SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00NZ15", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T2.ArtRen, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPARTICU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00NZ16", "SELECT T1.EmprCod, T1.ProCod, T1.FasCod, T2.MaqCod, T2.FasConPla, T2.FasNumPas, T2.FasVelPro, T2.FasForMul, T2.FasActTin, T2.FasPrePie, T2.FasPreSal, T2.FasDec2, T2.FasDec, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00NZ17", "INSERT INTO TXPResFas(EmprCod, ResCod, ResParCod, ResLin, ResProCod, ResFasCod, ResFasPla, ResFasDur, ResFasMaq, ResFasPri, ResFasDec, ResFasFch) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPResFas")
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 30);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[9]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 30);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

