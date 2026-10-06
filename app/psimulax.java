package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimulax extends GXProcedure
{
   public psimulax( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimulax.class ), "" );
   }

   public psimulax( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           int[] aP7 ,
                                           String[] aP8 )
   {
      psimulax.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      psimulax.this.AV88EmprCod = aP0[0];
      this.aP0 = aP0;
      psimulax.this.AV81CliCod = aP1[0];
      this.aP1 = aP1;
      psimulax.this.AV82ForSer = aP2[0];
      this.aP2 = aP2;
      psimulax.this.AV83ForColNom = aP3[0];
      this.aP3 = aP3;
      psimulax.this.AV84ForColNum = aP4[0];
      this.aP4 = aP4;
      psimulax.this.AV85TipColCod = aP5[0];
      this.aP5 = aP5;
      psimulax.this.AV66TotKgs = aP6[0];
      this.aP6 = aP6;
      psimulax.this.AV67Volumen = aP7[0];
      this.aP7 = aP7;
      psimulax.this.AV80MaqCod = aP8[0];
      this.aP8 = aP8;
      psimulax.this.AV96Incre = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV105ClaveColor = (byte)(0) ;
      GXv_int1[0] = AV105ClaveColor ;
      new app.pexicon(remoteHandle, context).execute( AV88EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int1) ;
      psimulax.this.AV105ClaveColor = GXv_int1[0] ;
      GXt_char2 = AV72Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      psimulax.this.GXt_char2 = GXv_char3[0] ;
      AV72Station = GXt_char2 ;
      /* Optimized DELETE. */
      /* Using cursor P00VU2 */
      pr_default.execute(0, new Object[] {AV88EmprCod, AV72Station});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
      /* End optimized DELETE. */
      AV113ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV113ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV113ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV113ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV113ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso 1...", ""));
      AV113ProgressIndicator.show();
      AV114CantidadRegistrosAProcesar = (short)(0) ;
      AV120GXLvl26 = (byte)(0) ;
      /* Using cursor P00VU3 */
      pr_default.execute(1, new Object[] {AV88EmprCod, Integer.valueOf(AV81CliCod), AV82ForSer, AV83ForColNom, Integer.valueOf(AV84ForColNum), Byte.valueOf(AV85TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P00VU3_A831TipColCod[0] ;
         A483ForColNum = P00VU3_A483ForColNum[0] ;
         A482ForColNom = P00VU3_A482ForColNom[0] ;
         A494ForSer = P00VU3_A494ForSer[0] ;
         A252CliCod = P00VU3_A252CliCod[0] ;
         A396EmprCod = P00VU3_A396EmprCod[0] ;
         A1160ProForL = P00VU3_A1160ProForL[0] ;
         AV120GXLvl26 = (byte)(1) ;
         AV114CantidadRegistrosAProcesar = (short)(AV114CantidadRegistrosAProcesar+1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV120GXLvl26 == 0 )
      {
      }
      if ( AV114CantidadRegistrosAProcesar == 0 )
      {
         AV114CantidadRegistrosAProcesar = (short)(1) ;
      }
      GXt_int4 = AV99CdpPor ;
      GXv_int1[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV88EmprCod, httpContext.getMessage( "%CDP", ""), GXv_int1) ;
      psimulax.this.GXt_int4 = GXv_int1[0] ;
      AV99CdpPor = GXt_int4 ;
      GXv_char3[0] = AV88EmprCod ;
      GXv_char5[0] = "030100" ;
      GXv_int6[0] = AV68ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char5, GXv_int6) ;
      psimulax.this.AV88EmprCod = GXv_char3[0] ;
      psimulax.this.AV68ValCos = GXv_int6[0] ;
      GXt_char2 = AV72Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      psimulax.this.GXt_char2 = GXv_char5[0] ;
      AV72Station = GXt_char2 ;
      AV89LinRec = (short)(0) ;
      AV74FlagComp = (byte)(0) ;
      AV115CantidadRegistrosProcesados = (short)(0) ;
      AV121GXLvl55 = (byte)(0) ;
      /* Using cursor P00VU4 */
      pr_default.execute(2, new Object[] {AV88EmprCod, Integer.valueOf(AV81CliCod), AV82ForSer, AV83ForColNom, Integer.valueOf(AV84ForColNum), Byte.valueOf(AV85TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4706ProForRb = P00VU4_A4706ProForRb[0] ;
         A766ProForDsc = P00VU4_A766ProForDsc[0] ;
         A396EmprCod = P00VU4_A396EmprCod[0] ;
         A831TipColCod = P00VU4_A831TipColCod[0] ;
         A483ForColNum = P00VU4_A483ForColNum[0] ;
         A482ForColNom = P00VU4_A482ForColNom[0] ;
         A494ForSer = P00VU4_A494ForSer[0] ;
         A252CliCod = P00VU4_A252CliCod[0] ;
         A486ForNumCol = P00VU4_A486ForNumCol[0] ;
         A764ProForCod = P00VU4_A764ProForCod[0] ;
         A626MatCod = P00VU4_A626MatCod[0] ;
         A583IntCod = P00VU4_A583IntCod[0] ;
         A1160ProForL = P00VU4_A1160ProForL[0] ;
         A486ForNumCol = P00VU4_A486ForNumCol[0] ;
         A626MatCod = P00VU4_A626MatCod[0] ;
         A583IntCod = P00VU4_A583IntCod[0] ;
         A4706ProForRb = P00VU4_A4706ProForRb[0] ;
         A766ProForDsc = P00VU4_A766ProForDsc[0] ;
         AV121GXLvl55 = (byte)(1) ;
         AV64NumColFor = A486ForNumCol ;
         AV60ProForCod = A764ProForCod ;
         AV78MatCod = A626MatCod ;
         AV79IntCod = A583IntCod ;
         /* Using cursor P00VU5 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV60ProForCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A764ProForCod = P00VU5_A764ProForCod[0] ;
            A6062ProForCPo = P00VU5_A6062ProForCPo[0] ;
            A770ProForPrd = P00VU5_A770ProForPrd[0] ;
            A5358ProForClv = P00VU5_A5358ProForClv[0] ;
            A763ProForCla = P00VU5_A763ProForCla[0] ;
            A765ProForDes = P00VU5_A765ProForDes[0] ;
            A762ProForCan = P00VU5_A762ProForCan[0] ;
            A490ForPrdUMe = P00VU5_A490ForPrdUMe[0] ;
            A767ProForLin = P00VU5_A767ProForLin[0] ;
            AV97EscMRb = A4706ProForRb ;
            AV100ProForCPo = A6062ProForCPo ;
            if ( ! (GXutil.strcmp("", A770ProForPrd)==0) )
            {
               if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
               {
                  AV61NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
                  AV62Producto = "" ;
                  AV63ForPrdUme = (byte)(0) ;
                  /* Execute user subroutine: 'CTRL_PE' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(2);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV92PrdVal = (byte)(0) ;
                  AV111Llamo_pe = httpContext.getMessage( "S", "") ;
                  AV109Dosi_pp = (byte)(0) ;
                  if ( ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV103Existe_p == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV103Existe_p == 1 ) ) )
                  {
                     if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                     {
                        AV95CalVe = A763ProForCla ;
                     }
                     else
                     {
                        AV95CalVe = A5358ProForClv ;
                     }
                     AV86PrdDesc = A765ProForDes ;
                     AV62Producto = A770ProForPrd ;
                     AV109Dosi_pp = (byte)(0) ;
                     if ( GXutil.strcmp(A5358ProForClv, " ") == 0 )
                     {
                        AV111Llamo_pe = httpContext.getMessage( "S", "") ;
                        GXv_char5[0] = A396EmprCod ;
                        GXv_char3[0] = AV62Producto ;
                        GXv_char7[0] = A763ProForCla ;
                        GXv_int1[0] = AV92PrdVal ;
                        GXv_int6[0] = AV81CliCod ;
                        GXv_char8[0] = AV82ForSer ;
                        GXv_decimal9[0] = AV66TotKgs ;
                        GXv_char10[0] = AV86PrdDesc ;
                        GXv_char11[0] = AV91Accion ;
                        GXv_int12[0] = (short)(0) ;
                        GXv_int13[0] = AV67Volumen ;
                        GXv_char14[0] = AV80MaqCod ;
                        GXv_int15[0] = AV78MatCod ;
                        GXv_char16[0] = AV83ForColNom ;
                        GXv_int17[0] = AV84ForColNum ;
                        GXv_int18[0] = AV85TipColCod ;
                        GXv_int19[0] = AV79IntCod ;
                        GXv_char20[0] = AV107Procod ;
                        new app.psimcla(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_char7, GXv_int1, GXv_int6, GXv_char8, GXv_decimal9, GXv_char10, GXv_char11, GXv_int12, GXv_int13, GXv_char14, GXv_int15, GXv_char16, GXv_int17, GXv_int18, GXv_int19, GXv_char20) ;
                        psimulax.this.A396EmprCod = GXv_char5[0] ;
                        psimulax.this.AV62Producto = GXv_char3[0] ;
                        psimulax.this.A763ProForCla = GXv_char7[0] ;
                        psimulax.this.AV92PrdVal = GXv_int1[0] ;
                        psimulax.this.AV81CliCod = GXv_int6[0] ;
                        psimulax.this.AV82ForSer = GXv_char8[0] ;
                        psimulax.this.AV66TotKgs = GXv_decimal9[0] ;
                        psimulax.this.AV86PrdDesc = GXv_char10[0] ;
                        psimulax.this.AV91Accion = GXv_char11[0] ;
                        psimulax.this.AV67Volumen = GXv_int13[0] ;
                        psimulax.this.AV80MaqCod = GXv_char14[0] ;
                        psimulax.this.AV78MatCod = GXv_int15[0] ;
                        psimulax.this.AV83ForColNom = GXv_char16[0] ;
                        psimulax.this.AV84ForColNum = GXv_int17[0] ;
                        psimulax.this.AV85TipColCod = GXv_int18[0] ;
                        psimulax.this.AV79IntCod = GXv_int19[0] ;
                        psimulax.this.AV107Procod = GXv_char20[0] ;
                     }
                     if ( ! (GXutil.strcmp("", A5358ProForClv)==0) )
                     {
                        AV111Llamo_pe = httpContext.getMessage( "N", "") ;
                        GXv_char20[0] = A396EmprCod ;
                        GXv_char16[0] = AV62Producto ;
                        GXv_char14[0] = A5358ProForClv ;
                        GXv_int19[0] = AV92PrdVal ;
                        GXv_int17[0] = AV81CliCod ;
                        GXv_char11[0] = AV82ForSer ;
                        GXv_decimal9[0] = AV66TotKgs ;
                        GXv_char10[0] = AV86PrdDesc ;
                        GXv_char8[0] = AV91Accion ;
                        GXv_int15[0] = (short)(0) ;
                        GXv_int13[0] = AV67Volumen ;
                        GXv_char7[0] = AV80MaqCod ;
                        GXv_int12[0] = AV78MatCod ;
                        GXv_char5[0] = AV83ForColNom ;
                        GXv_int6[0] = AV84ForColNum ;
                        GXv_int18[0] = AV85TipColCod ;
                        GXv_int1[0] = AV79IntCod ;
                        GXv_char3[0] = AV107Procod ;
                        GXv_decimal21[0] = AV108Porc_p ;
                        new app.psimcla2(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_char14, GXv_int19, GXv_int17, GXv_char11, GXv_decimal9, GXv_char10, GXv_char8, GXv_int15, GXv_int13, GXv_char7, GXv_int12, GXv_char5, GXv_int6, GXv_int18, GXv_int1, GXv_char3, GXv_decimal21) ;
                        psimulax.this.A396EmprCod = GXv_char20[0] ;
                        psimulax.this.AV62Producto = GXv_char16[0] ;
                        psimulax.this.A5358ProForClv = GXv_char14[0] ;
                        psimulax.this.AV92PrdVal = GXv_int19[0] ;
                        psimulax.this.AV81CliCod = GXv_int17[0] ;
                        psimulax.this.AV82ForSer = GXv_char11[0] ;
                        psimulax.this.AV66TotKgs = GXv_decimal9[0] ;
                        psimulax.this.AV86PrdDesc = GXv_char10[0] ;
                        psimulax.this.AV91Accion = GXv_char8[0] ;
                        psimulax.this.AV67Volumen = GXv_int13[0] ;
                        psimulax.this.AV80MaqCod = GXv_char7[0] ;
                        psimulax.this.AV78MatCod = GXv_int12[0] ;
                        psimulax.this.AV83ForColNom = GXv_char5[0] ;
                        psimulax.this.AV84ForColNum = GXv_int6[0] ;
                        psimulax.this.AV85TipColCod = GXv_int18[0] ;
                        psimulax.this.AV79IntCod = GXv_int1[0] ;
                        psimulax.this.AV107Procod = GXv_char3[0] ;
                        psimulax.this.AV108Porc_p = GXv_decimal21[0] ;
                     }
                     if ( AV92PrdVal == 1 )
                     {
                        AV109Dosi_pp = (byte)(1) ;
                        AV111Llamo_pe = httpContext.getMessage( "S", "") ;
                     }
                     else
                     {
                        AV111Llamo_pe = httpContext.getMessage( "N", "") ;
                     }
                     if ( ( ( AV92PrdVal == 1 ) && ! (GXutil.strcmp("", A763ProForCla)==0) ) || ( ( AV92PrdVal == 1 ) && ! (GXutil.strcmp("", A5358ProForClv)==0) ) )
                     {
                        if ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           GXv_char20[0] = A396EmprCod ;
                           GXv_char16[0] = AV72Station ;
                           GXv_int15[0] = AV71NumLin ;
                           GXv_int12[0] = AV73UltNumLin ;
                           GXv_int22[0] = (short)(0) ;
                           GXv_int19[0] = (byte)(0) ;
                           new app.pelisim(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_int15, GXv_int12, GXv_int22, GXv_int19) ;
                           psimulax.this.A396EmprCod = GXv_char20[0] ;
                           psimulax.this.AV72Station = GXv_char16[0] ;
                           psimulax.this.AV71NumLin = GXv_int15[0] ;
                           psimulax.this.AV73UltNumLin = GXv_int12[0] ;
                        }
                        if ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           AV94ProForDes = A765ProForDes ;
                           AV62Producto = A770ProForPrd ;
                           AV93LineaRec = GXutil.str( AV71NumLin, 3, 0) ;
                           if ( GXutil.strcmp(GXutil.substring( AV62Producto, 1, 1), "#") != 0 )
                           {
                              GXv_char20[0] = A396EmprCod ;
                              GXv_char16[0] = A770ProForPrd ;
                              GXv_decimal21[0] = A762ProForCan ;
                              GXv_int19[0] = A490ForPrdUMe ;
                              GXv_decimal9[0] = AV66TotKgs ;
                              GXv_int17[0] = AV67Volumen ;
                              GXv_int13[0] = AV68ValCos ;
                              GXv_int22[0] = AV71NumLin ;
                              GXv_char14[0] = AV72Station ;
                              GXv_int15[0] = AV73UltNumLin ;
                              GXv_int18[0] = AV74FlagComp ;
                              GXv_char11[0] = AV60ProForCod ;
                              GXv_int12[0] = AV87ContLinea ;
                              GXv_decimal23[0] = AV96Incre ;
                              GXv_int24[0] = AV97EscMRb ;
                              new app.psimulay(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal21, GXv_int19, GXv_decimal9, GXv_int17, GXv_int13, GXv_int22, GXv_char14, GXv_int15, GXv_int18, GXv_char11, GXv_int12, GXv_decimal23, GXv_int24) ;
                              psimulax.this.A396EmprCod = GXv_char20[0] ;
                              psimulax.this.A770ProForPrd = GXv_char16[0] ;
                              psimulax.this.A762ProForCan = GXv_decimal21[0] ;
                              psimulax.this.A490ForPrdUMe = GXv_int19[0] ;
                              psimulax.this.AV66TotKgs = GXv_decimal9[0] ;
                              psimulax.this.AV67Volumen = GXv_int17[0] ;
                              psimulax.this.AV68ValCos = GXv_int13[0] ;
                              psimulax.this.AV71NumLin = GXv_int22[0] ;
                              psimulax.this.AV72Station = GXv_char14[0] ;
                              psimulax.this.AV73UltNumLin = GXv_int15[0] ;
                              psimulax.this.AV74FlagComp = GXv_int18[0] ;
                              psimulax.this.AV60ProForCod = GXv_char11[0] ;
                              psimulax.this.AV87ContLinea = GXv_int12[0] ;
                              psimulax.this.AV96Incre = GXv_decimal23[0] ;
                              psimulax.this.AV97EscMRb = GXv_int24[0] ;
                           }
                        }
                     }
                  }
                  if ( ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) ) || ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV92PrdVal == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV92PrdVal == 1 ) ) )
                  {
                     AV104Por_cant = A762ProForCan ;
                     if ( GXutil.strcmp(AV111Llamo_pe, httpContext.getMessage( "S", "")) == 0 )
                     {
                        /* Execute user subroutine: 'ESPECIALES' */
                        S121 ();
                        if ( returnInSub )
                        {
                           pr_default.close(3);
                           pr_default.close(2);
                           pr_default.close(2);
                           pr_default.close(2);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                  }
               }
               else
               {
                  AV69Produc = GXutil.substring( A770ProForPrd, 3, 1) ;
                  if ( GXutil.strcmp(AV69Produc, " ") == 0 )
                  {
                     if ( A762ProForCan.doubleValue() == 0 )
                     {
                        AV76Cantidad = DecimalUtil.doubleToDec(1) ;
                     }
                     else
                     {
                        AV76Cantidad = A762ProForCan ;
                     }
                     AV69Produc = GXutil.substring( A770ProForPrd, 2, 1) ;
                     if ( GXutil.strcmp(AV69Produc, "") == 0 )
                     {
                        AV70Ncar = (byte)(1) ;
                     }
                     else
                     {
                        AV70Ncar = (byte)(2) ;
                     }
                     AV75ProForPrd = A770ProForPrd ;
                     if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                     {
                        AV95CalVe = A763ProForCla ;
                        AV110ProForCla = A763ProForCla ;
                     }
                     else
                     {
                        AV95CalVe = A5358ProForClv ;
                        AV110ProForCla = A5358ProForClv ;
                     }
                     AV92PrdVal = (byte)(0) ;
                     AV86PrdDesc = A765ProForDes ;
                     AV62Producto = A770ProForPrd ;
                     /* Execute user subroutine: 'COLORANTES' */
                     S131 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  else
                  {
                     if ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) )
                     {
                        if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                        {
                           AV62Producto = A770ProForPrd ;
                           AV76Cantidad = A762ProForCan ;
                           AV63ForPrdUme = A490ForPrdUMe ;
                           AV74FlagComp = (byte)(0) ;
                           AV101CanFor = A762ProForCan ;
                           if ( ( AV99CdpPor == 1 ) && ( AV100ProForCPo.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV100ProForCPo, DecimalUtil.stringToDec("100.00")) <= 0 ) )
                           {
                              AV101CanFor = (A762ProForCan.multiply(AV100ProForCPo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                           }
                           GXv_char20[0] = A396EmprCod ;
                           GXv_char16[0] = A770ProForPrd ;
                           GXv_decimal23[0] = AV101CanFor ;
                           GXv_int19[0] = A490ForPrdUMe ;
                           GXv_decimal21[0] = AV66TotKgs ;
                           GXv_int17[0] = AV67Volumen ;
                           GXv_int13[0] = AV68ValCos ;
                           GXv_int24[0] = AV71NumLin ;
                           GXv_char14[0] = AV72Station ;
                           GXv_int22[0] = AV73UltNumLin ;
                           GXv_int18[0] = AV74FlagComp ;
                           GXv_char11[0] = AV60ProForCod ;
                           GXv_int15[0] = AV87ContLinea ;
                           GXv_decimal9[0] = AV96Incre ;
                           GXv_int12[0] = AV97EscMRb ;
                           new app.psimulay(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal23, GXv_int19, GXv_decimal21, GXv_int17, GXv_int13, GXv_int24, GXv_char14, GXv_int22, GXv_int18, GXv_char11, GXv_int15, GXv_decimal9, GXv_int12) ;
                           psimulax.this.A396EmprCod = GXv_char20[0] ;
                           psimulax.this.A770ProForPrd = GXv_char16[0] ;
                           psimulax.this.AV101CanFor = GXv_decimal23[0] ;
                           psimulax.this.A490ForPrdUMe = GXv_int19[0] ;
                           psimulax.this.AV66TotKgs = GXv_decimal21[0] ;
                           psimulax.this.AV67Volumen = GXv_int17[0] ;
                           psimulax.this.AV68ValCos = GXv_int13[0] ;
                           psimulax.this.AV71NumLin = GXv_int24[0] ;
                           psimulax.this.AV72Station = GXv_char14[0] ;
                           psimulax.this.AV73UltNumLin = GXv_int22[0] ;
                           psimulax.this.AV74FlagComp = GXv_int18[0] ;
                           psimulax.this.AV60ProForCod = GXv_char11[0] ;
                           psimulax.this.AV87ContLinea = GXv_int15[0] ;
                           psimulax.this.AV96Incre = GXv_decimal9[0] ;
                           psimulax.this.AV97EscMRb = GXv_int12[0] ;
                           AV74FlagComp = (byte)(0) ;
                        }
                        else
                        {
                           AV101CanFor = A762ProForCan ;
                           if ( ( AV99CdpPor == 1 ) && ( AV100ProForCPo.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV100ProForCPo, DecimalUtil.stringToDec("100.00")) <= 0 ) )
                           {
                              AV101CanFor = (A762ProForCan.multiply(AV100ProForCPo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                           }
                           if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") != 0 )
                           {
                              GXv_char20[0] = A396EmprCod ;
                              GXv_char16[0] = A770ProForPrd ;
                              GXv_decimal23[0] = AV101CanFor ;
                              GXv_int19[0] = A490ForPrdUMe ;
                              GXv_decimal21[0] = AV66TotKgs ;
                              GXv_int17[0] = AV67Volumen ;
                              GXv_int13[0] = AV68ValCos ;
                              GXv_int24[0] = AV71NumLin ;
                              GXv_char14[0] = AV72Station ;
                              GXv_int22[0] = AV73UltNumLin ;
                              GXv_int18[0] = AV74FlagComp ;
                              GXv_char11[0] = AV60ProForCod ;
                              GXv_int15[0] = AV87ContLinea ;
                              GXv_decimal9[0] = AV96Incre ;
                              GXv_int12[0] = AV97EscMRb ;
                              new app.psimulay(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal23, GXv_int19, GXv_decimal21, GXv_int17, GXv_int13, GXv_int24, GXv_char14, GXv_int22, GXv_int18, GXv_char11, GXv_int15, GXv_decimal9, GXv_int12) ;
                              psimulax.this.A396EmprCod = GXv_char20[0] ;
                              psimulax.this.A770ProForPrd = GXv_char16[0] ;
                              psimulax.this.AV101CanFor = GXv_decimal23[0] ;
                              psimulax.this.A490ForPrdUMe = GXv_int19[0] ;
                              psimulax.this.AV66TotKgs = GXv_decimal21[0] ;
                              psimulax.this.AV67Volumen = GXv_int17[0] ;
                              psimulax.this.AV68ValCos = GXv_int13[0] ;
                              psimulax.this.AV71NumLin = GXv_int24[0] ;
                              psimulax.this.AV72Station = GXv_char14[0] ;
                              psimulax.this.AV73UltNumLin = GXv_int22[0] ;
                              psimulax.this.AV74FlagComp = GXv_int18[0] ;
                              psimulax.this.AV60ProForCod = GXv_char11[0] ;
                              psimulax.this.AV87ContLinea = GXv_int15[0] ;
                              psimulax.this.AV96Incre = GXv_decimal9[0] ;
                              psimulax.this.AV97EscMRb = GXv_int12[0] ;
                           }
                        }
                     }
                     else
                     {
                        AV95CalVe = A763ProForCla ;
                        AV92PrdVal = (byte)(0) ;
                        AV86PrdDesc = A765ProForDes ;
                        AV62Producto = A770ProForPrd ;
                        if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                        {
                           GXv_char20[0] = A396EmprCod ;
                           GXv_char16[0] = AV62Producto ;
                           GXv_char14[0] = A763ProForCla ;
                           GXv_int19[0] = AV92PrdVal ;
                           GXv_int17[0] = AV81CliCod ;
                           GXv_char11[0] = AV82ForSer ;
                           GXv_decimal23[0] = AV66TotKgs ;
                           GXv_char10[0] = AV86PrdDesc ;
                           GXv_char8[0] = AV91Accion ;
                           GXv_int24[0] = (short)(0) ;
                           GXv_int13[0] = AV67Volumen ;
                           GXv_char7[0] = AV80MaqCod ;
                           GXv_int22[0] = AV78MatCod ;
                           GXv_char5[0] = AV83ForColNom ;
                           GXv_int6[0] = AV84ForColNum ;
                           GXv_int18[0] = AV85TipColCod ;
                           GXv_int1[0] = AV79IntCod ;
                           GXv_char3[0] = AV107Procod ;
                           new app.psimcla(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_char14, GXv_int19, GXv_int17, GXv_char11, GXv_decimal23, GXv_char10, GXv_char8, GXv_int24, GXv_int13, GXv_char7, GXv_int22, GXv_char5, GXv_int6, GXv_int18, GXv_int1, GXv_char3) ;
                           psimulax.this.A396EmprCod = GXv_char20[0] ;
                           psimulax.this.AV62Producto = GXv_char16[0] ;
                           psimulax.this.A763ProForCla = GXv_char14[0] ;
                           psimulax.this.AV92PrdVal = GXv_int19[0] ;
                           psimulax.this.AV81CliCod = GXv_int17[0] ;
                           psimulax.this.AV82ForSer = GXv_char11[0] ;
                           psimulax.this.AV66TotKgs = GXv_decimal23[0] ;
                           psimulax.this.AV86PrdDesc = GXv_char10[0] ;
                           psimulax.this.AV91Accion = GXv_char8[0] ;
                           psimulax.this.AV67Volumen = GXv_int13[0] ;
                           psimulax.this.AV80MaqCod = GXv_char7[0] ;
                           psimulax.this.AV78MatCod = GXv_int22[0] ;
                           psimulax.this.AV83ForColNom = GXv_char5[0] ;
                           psimulax.this.AV84ForColNum = GXv_int6[0] ;
                           psimulax.this.AV85TipColCod = GXv_int18[0] ;
                           psimulax.this.AV79IntCod = GXv_int1[0] ;
                           psimulax.this.AV107Procod = GXv_char3[0] ;
                        }
                        else
                        {
                           if ( ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CX", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CF", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "DA", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CP", "")) == 0 ) )
                           {
                              GXv_char20[0] = A396EmprCod ;
                              GXv_char16[0] = AV62Producto ;
                              GXv_char14[0] = A5358ProForClv ;
                              GXv_int19[0] = AV92PrdVal ;
                              GXv_int17[0] = AV81CliCod ;
                              GXv_char11[0] = AV82ForSer ;
                              GXv_decimal23[0] = AV66TotKgs ;
                              GXv_char10[0] = AV86PrdDesc ;
                              GXv_char8[0] = AV91Accion ;
                              GXv_int24[0] = (short)(0) ;
                              GXv_int13[0] = AV67Volumen ;
                              GXv_char7[0] = AV80MaqCod ;
                              GXv_int22[0] = AV78MatCod ;
                              GXv_char5[0] = AV83ForColNom ;
                              GXv_int6[0] = AV84ForColNum ;
                              GXv_int18[0] = AV85TipColCod ;
                              GXv_int1[0] = AV79IntCod ;
                              GXv_char3[0] = AV107Procod ;
                              GXv_decimal21[0] = AV108Porc_p ;
                              new app.psimcla2(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_char14, GXv_int19, GXv_int17, GXv_char11, GXv_decimal23, GXv_char10, GXv_char8, GXv_int24, GXv_int13, GXv_char7, GXv_int22, GXv_char5, GXv_int6, GXv_int18, GXv_int1, GXv_char3, GXv_decimal21) ;
                              psimulax.this.A396EmprCod = GXv_char20[0] ;
                              psimulax.this.AV62Producto = GXv_char16[0] ;
                              psimulax.this.A5358ProForClv = GXv_char14[0] ;
                              psimulax.this.AV92PrdVal = GXv_int19[0] ;
                              psimulax.this.AV81CliCod = GXv_int17[0] ;
                              psimulax.this.AV82ForSer = GXv_char11[0] ;
                              psimulax.this.AV66TotKgs = GXv_decimal23[0] ;
                              psimulax.this.AV86PrdDesc = GXv_char10[0] ;
                              psimulax.this.AV91Accion = GXv_char8[0] ;
                              psimulax.this.AV67Volumen = GXv_int13[0] ;
                              psimulax.this.AV80MaqCod = GXv_char7[0] ;
                              psimulax.this.AV78MatCod = GXv_int22[0] ;
                              psimulax.this.AV83ForColNom = GXv_char5[0] ;
                              psimulax.this.AV84ForColNum = GXv_int6[0] ;
                              psimulax.this.AV85TipColCod = GXv_int18[0] ;
                              psimulax.this.AV79IntCod = GXv_int1[0] ;
                              psimulax.this.AV107Procod = GXv_char3[0] ;
                              psimulax.this.AV108Porc_p = GXv_decimal21[0] ;
                           }
                           else
                           {
                              GXv_char20[0] = A396EmprCod ;
                              GXv_char16[0] = AV62Producto ;
                              GXv_char14[0] = A5358ProForClv ;
                              GXv_int19[0] = AV92PrdVal ;
                              GXv_int17[0] = AV81CliCod ;
                              GXv_char11[0] = AV82ForSer ;
                              GXv_decimal23[0] = AV66TotKgs ;
                              GXv_char10[0] = AV86PrdDesc ;
                              GXv_char8[0] = AV91Accion ;
                              GXv_int24[0] = (short)(0) ;
                              GXv_int13[0] = AV67Volumen ;
                              GXv_char7[0] = AV80MaqCod ;
                              GXv_int22[0] = AV78MatCod ;
                              GXv_char5[0] = AV83ForColNom ;
                              GXv_int6[0] = AV84ForColNum ;
                              GXv_int18[0] = AV85TipColCod ;
                              GXv_int1[0] = AV79IntCod ;
                              GXv_char3[0] = AV107Procod ;
                              new app.psimcla(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_char14, GXv_int19, GXv_int17, GXv_char11, GXv_decimal23, GXv_char10, GXv_char8, GXv_int24, GXv_int13, GXv_char7, GXv_int22, GXv_char5, GXv_int6, GXv_int18, GXv_int1, GXv_char3) ;
                              psimulax.this.A396EmprCod = GXv_char20[0] ;
                              psimulax.this.AV62Producto = GXv_char16[0] ;
                              psimulax.this.A5358ProForClv = GXv_char14[0] ;
                              psimulax.this.AV92PrdVal = GXv_int19[0] ;
                              psimulax.this.AV81CliCod = GXv_int17[0] ;
                              psimulax.this.AV82ForSer = GXv_char11[0] ;
                              psimulax.this.AV66TotKgs = GXv_decimal23[0] ;
                              psimulax.this.AV86PrdDesc = GXv_char10[0] ;
                              psimulax.this.AV91Accion = GXv_char8[0] ;
                              psimulax.this.AV67Volumen = GXv_int13[0] ;
                              psimulax.this.AV80MaqCod = GXv_char7[0] ;
                              psimulax.this.AV78MatCod = GXv_int22[0] ;
                              psimulax.this.AV83ForColNom = GXv_char5[0] ;
                              psimulax.this.AV84ForColNum = GXv_int6[0] ;
                              psimulax.this.AV85TipColCod = GXv_int18[0] ;
                              psimulax.this.AV79IntCod = GXv_int1[0] ;
                              psimulax.this.AV107Procod = GXv_char3[0] ;
                           }
                        }
                        if ( AV92PrdVal == 1 )
                        {
                           if ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "M", "")) == 0 ) )
                           {
                              GXv_char20[0] = A396EmprCod ;
                              GXv_char16[0] = AV72Station ;
                              GXv_int24[0] = AV71NumLin ;
                              GXv_int22[0] = AV73UltNumLin ;
                              GXv_int15[0] = (short)(0) ;
                              GXv_int19[0] = (byte)(0) ;
                              new app.pelisim(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_int24, GXv_int22, GXv_int15, GXv_int19) ;
                              psimulax.this.A396EmprCod = GXv_char20[0] ;
                              psimulax.this.AV72Station = GXv_char16[0] ;
                              psimulax.this.AV71NumLin = GXv_int24[0] ;
                              psimulax.this.AV73UltNumLin = GXv_int22[0] ;
                           }
                           if ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "M", "")) == 0 ) )
                           {
                              AV94ProForDes = A765ProForDes ;
                              AV62Producto = A770ProForPrd ;
                              AV93LineaRec = GXutil.str( AV71NumLin, 3, 0) ;
                              if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") != 0 )
                              {
                                 GXv_char20[0] = A396EmprCod ;
                                 GXv_char16[0] = A770ProForPrd ;
                                 GXv_decimal23[0] = A762ProForCan ;
                                 GXv_int19[0] = A490ForPrdUMe ;
                                 GXv_decimal21[0] = AV66TotKgs ;
                                 GXv_int17[0] = AV67Volumen ;
                                 GXv_int13[0] = AV68ValCos ;
                                 GXv_int24[0] = AV71NumLin ;
                                 GXv_char14[0] = AV72Station ;
                                 GXv_int22[0] = AV73UltNumLin ;
                                 GXv_int18[0] = AV74FlagComp ;
                                 GXv_char11[0] = AV60ProForCod ;
                                 GXv_int15[0] = AV87ContLinea ;
                                 GXv_decimal9[0] = AV96Incre ;
                                 GXv_int12[0] = AV97EscMRb ;
                                 new app.psimulay(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal23, GXv_int19, GXv_decimal21, GXv_int17, GXv_int13, GXv_int24, GXv_char14, GXv_int22, GXv_int18, GXv_char11, GXv_int15, GXv_decimal9, GXv_int12) ;
                                 psimulax.this.A396EmprCod = GXv_char20[0] ;
                                 psimulax.this.A770ProForPrd = GXv_char16[0] ;
                                 psimulax.this.A762ProForCan = GXv_decimal23[0] ;
                                 psimulax.this.A490ForPrdUMe = GXv_int19[0] ;
                                 psimulax.this.AV66TotKgs = GXv_decimal21[0] ;
                                 psimulax.this.AV67Volumen = GXv_int17[0] ;
                                 psimulax.this.AV68ValCos = GXv_int13[0] ;
                                 psimulax.this.AV71NumLin = GXv_int24[0] ;
                                 psimulax.this.AV72Station = GXv_char14[0] ;
                                 psimulax.this.AV73UltNumLin = GXv_int22[0] ;
                                 psimulax.this.AV74FlagComp = GXv_int18[0] ;
                                 psimulax.this.AV60ProForCod = GXv_char11[0] ;
                                 psimulax.this.AV87ContLinea = GXv_int15[0] ;
                                 psimulax.this.AV96Incre = GXv_decimal9[0] ;
                                 psimulax.this.AV97EscMRb = GXv_int12[0] ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            AV115CantidadRegistrosProcesados = (short)(AV115CantidadRegistrosProcesados+1) ;
            AV116Porcentaje = (short)((AV115CantidadRegistrosProcesados/ (double) (AV114CantidadRegistrosAProcesar))*100) ;
            AV113ProgressIndicator.setgxTv_SdtProgress_Value( AV116Porcentaje );
            AV113ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV115CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV114CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( A764ProForCod), GXutil.trim( A766ProForDsc), "", "", "", "", ""));
            pr_default.readNext(3);
         }
         pr_default.close(3);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV121GXLvl55 == 0 )
      {
      }
      AV113ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso 1 finalizado.", ""));
      AV113ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV113ProgressIndicator.hide();
      cleanup();
   }

   public void S111( )
   {
      /* 'CTRL_PE' Routine */
      returnInSub = false ;
      AV103Existe_p = (byte)(0) ;
      /* Using cursor P00VU6 */
      pr_default.execute(4, new Object[] {AV88EmprCod, Integer.valueOf(AV64NumColFor), Short.valueOf(AV61NumOrd)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P00VU6_A396EmprCod[0] ;
         A486ForNumCol = P00VU6_A486ForNumCol[0] ;
         A489ForPrdNor = P00VU6_A489ForPrdNor[0] ;
         A715PrdLin = P00VU6_A715PrdLin[0] ;
         AV103Existe_p = (byte)(1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'ESPECIALES' Routine */
      returnInSub = false ;
      /* Using cursor P00VU7 */
      pr_default.execute(5, new Object[] {AV88EmprCod, Integer.valueOf(AV64NumColFor), Short.valueOf(AV61NumOrd)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P00VU7_A396EmprCod[0] ;
         A486ForNumCol = P00VU7_A486ForNumCol[0] ;
         A489ForPrdNor = P00VU7_A489ForPrdNor[0] ;
         A719PrdNum = P00VU7_A719PrdNum[0] ;
         A487ForPrdCan = P00VU7_A487ForPrdCan[0] ;
         A490ForPrdUMe = P00VU7_A490ForPrdUMe[0] ;
         A715PrdLin = P00VU7_A715PrdLin[0] ;
         AV62Producto = A719PrdNum ;
         AV65ForPrdCan = A487ForPrdCan ;
         AV63ForPrdUme = A490ForPrdUMe ;
         if ( AV109Dosi_pp == 1 )
         {
            AV65ForPrdCan = (AV65ForPrdCan.multiply(AV108Porc_p).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( ( AV99CdpPor == 1 ) && ( AV100ProForCPo.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV100ProForCPo, DecimalUtil.stringToDec("100.00")) <= 0 ) )
            {
               AV65ForPrdCan = (AV65ForPrdCan.multiply(AV100ProForCPo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
            if ( AV104Por_cant.doubleValue() > 0 )
            {
               AV65ForPrdCan = (AV65ForPrdCan.multiply(AV104Por_cant)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         if ( ! (GXutil.strcmp("", AV62Producto)==0) && ( GXutil.strcmp(GXutil.substring( AV62Producto, 1, 1), "#") != 0 ) )
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_char16[0] = AV62Producto ;
            GXv_decimal23[0] = AV65ForPrdCan ;
            GXv_int19[0] = AV63ForPrdUme ;
            GXv_decimal21[0] = AV66TotKgs ;
            GXv_int17[0] = AV67Volumen ;
            GXv_int13[0] = AV68ValCos ;
            GXv_int24[0] = AV71NumLin ;
            GXv_char14[0] = AV72Station ;
            GXv_int22[0] = AV73UltNumLin ;
            GXv_int18[0] = AV74FlagComp ;
            GXv_char11[0] = AV60ProForCod ;
            GXv_int15[0] = AV87ContLinea ;
            GXv_decimal9[0] = AV96Incre ;
            GXv_int12[0] = AV97EscMRb ;
            GXv_int25[0] = A489ForPrdNor ;
            new app.psimulas(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal23, GXv_int19, GXv_decimal21, GXv_int17, GXv_int13, GXv_int24, GXv_char14, GXv_int22, GXv_int18, GXv_char11, GXv_int15, GXv_decimal9, GXv_int12, GXv_int25) ;
            psimulax.this.A396EmprCod = GXv_char20[0] ;
            psimulax.this.AV62Producto = GXv_char16[0] ;
            psimulax.this.AV65ForPrdCan = GXv_decimal23[0] ;
            psimulax.this.AV63ForPrdUme = GXv_int19[0] ;
            psimulax.this.AV66TotKgs = GXv_decimal21[0] ;
            psimulax.this.AV67Volumen = GXv_int17[0] ;
            psimulax.this.AV68ValCos = GXv_int13[0] ;
            psimulax.this.AV71NumLin = GXv_int24[0] ;
            psimulax.this.AV72Station = GXv_char14[0] ;
            psimulax.this.AV73UltNumLin = GXv_int22[0] ;
            psimulax.this.AV74FlagComp = GXv_int18[0] ;
            psimulax.this.AV60ProForCod = GXv_char11[0] ;
            psimulax.this.AV87ContLinea = GXv_int15[0] ;
            psimulax.this.AV96Incre = GXv_decimal9[0] ;
            psimulax.this.AV97EscMRb = GXv_int12[0] ;
            psimulax.this.A489ForPrdNor = GXv_int25[0] ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S131( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      GXv_char20[0] = A396EmprCod ;
      GXv_char16[0] = AV62Producto ;
      GXv_char14[0] = AV110ProForCla ;
      GXv_int19[0] = AV92PrdVal ;
      GXv_int17[0] = AV81CliCod ;
      GXv_char11[0] = AV82ForSer ;
      GXv_decimal23[0] = AV66TotKgs ;
      GXv_char10[0] = AV86PrdDesc ;
      GXv_char8[0] = AV91Accion ;
      GXv_int25[0] = (short)(0) ;
      GXv_int13[0] = AV67Volumen ;
      GXv_char7[0] = AV80MaqCod ;
      GXv_int24[0] = AV78MatCod ;
      GXv_char5[0] = AV83ForColNom ;
      GXv_int6[0] = AV84ForColNum ;
      GXv_int18[0] = AV85TipColCod ;
      GXv_int1[0] = AV79IntCod ;
      GXv_char3[0] = AV107Procod ;
      new app.psimcla(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_char14, GXv_int19, GXv_int17, GXv_char11, GXv_decimal23, GXv_char10, GXv_char8, GXv_int25, GXv_int13, GXv_char7, GXv_int24, GXv_char5, GXv_int6, GXv_int18, GXv_int1, GXv_char3) ;
      psimulax.this.A396EmprCod = GXv_char20[0] ;
      psimulax.this.AV62Producto = GXv_char16[0] ;
      psimulax.this.AV110ProForCla = GXv_char14[0] ;
      psimulax.this.AV92PrdVal = GXv_int19[0] ;
      psimulax.this.AV81CliCod = GXv_int17[0] ;
      psimulax.this.AV82ForSer = GXv_char11[0] ;
      psimulax.this.AV66TotKgs = GXv_decimal23[0] ;
      psimulax.this.AV86PrdDesc = GXv_char10[0] ;
      psimulax.this.AV91Accion = GXv_char8[0] ;
      psimulax.this.AV67Volumen = GXv_int13[0] ;
      psimulax.this.AV80MaqCod = GXv_char7[0] ;
      psimulax.this.AV78MatCod = GXv_int24[0] ;
      psimulax.this.AV83ForColNom = GXv_char5[0] ;
      psimulax.this.AV84ForColNum = GXv_int6[0] ;
      psimulax.this.AV85TipColCod = GXv_int18[0] ;
      psimulax.this.AV79IntCod = GXv_int1[0] ;
      psimulax.this.AV107Procod = GXv_char3[0] ;
      if ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "A", "")) != 0 ) && ! (GXutil.strcmp("", AV110ProForCla)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error: Hay una clave especial en línea de colorantes, con acción distinta a 'Agregar'. Linea Ignorada.", ""));
      }
      if ( ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "A", "")) == 0 ) && ! (GXutil.strcmp("", AV110ProForCla)==0) && ( AV92PrdVal == 1 ) ) || (GXutil.strcmp("", AV110ProForCla)==0) )
      {
         /* Using cursor P00VU8 */
         pr_default.execute(6, new Object[] {Byte.valueOf(AV70Ncar), AV75ProForPrd, Byte.valueOf(AV70Ncar), Integer.valueOf(AV64NumColFor)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A719PrdNum = P00VU8_A719PrdNum[0] ;
            A486ForNumCol = P00VU8_A486ForNumCol[0] ;
            A481ForCan = P00VU8_A481ForCan[0] ;
            A6193ForClaCol = P00VU8_A6193ForClaCol[0] ;
            A718PrdNom = P00VU8_A718PrdNom[0] ;
            A396EmprCod = P00VU8_A396EmprCod[0] ;
            A490ForPrdUMe = P00VU8_A490ForPrdUMe[0] ;
            A309ColLin = P00VU8_A309ColLin[0] ;
            A718PrdNom = P00VU8_A718PrdNom[0] ;
            AV102ForCan = A481ForCan ;
            if ( ( AV99CdpPor == 1 ) && ( AV100ProForCPo.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV100ProForCPo, DecimalUtil.stringToDec("100.00")) <= 0 ) )
            {
               AV102ForCan = (AV102ForCan.multiply(AV100ProForCPo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
            if ( ( AV105ClaveColor == 1 ) && ! (GXutil.strcmp("", A6193ForClaCol)==0) )
            {
               AV92PrdVal = (byte)(0) ;
               AV86PrdDesc = A718PrdNom ;
               AV62Producto = A719PrdNum ;
               GXv_char20[0] = A396EmprCod ;
               GXv_char16[0] = AV62Producto ;
               GXv_char14[0] = A6193ForClaCol ;
               GXv_int19[0] = AV92PrdVal ;
               GXv_int17[0] = AV81CliCod ;
               GXv_char11[0] = AV82ForSer ;
               GXv_decimal23[0] = AV66TotKgs ;
               GXv_char10[0] = AV86PrdDesc ;
               GXv_char8[0] = AV91Accion ;
               GXv_int25[0] = (short)(0) ;
               GXv_int13[0] = AV67Volumen ;
               GXv_char7[0] = AV80MaqCod ;
               GXv_int24[0] = AV78MatCod ;
               GXv_char5[0] = AV83ForColNom ;
               GXv_int6[0] = AV84ForColNum ;
               GXv_int18[0] = AV85TipColCod ;
               GXv_int1[0] = AV79IntCod ;
               GXv_char3[0] = AV107Procod ;
               new app.psimcla(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_char14, GXv_int19, GXv_int17, GXv_char11, GXv_decimal23, GXv_char10, GXv_char8, GXv_int25, GXv_int13, GXv_char7, GXv_int24, GXv_char5, GXv_int6, GXv_int18, GXv_int1, GXv_char3) ;
               psimulax.this.A396EmprCod = GXv_char20[0] ;
               psimulax.this.AV62Producto = GXv_char16[0] ;
               psimulax.this.A6193ForClaCol = GXv_char14[0] ;
               psimulax.this.AV92PrdVal = GXv_int19[0] ;
               psimulax.this.AV81CliCod = GXv_int17[0] ;
               psimulax.this.AV82ForSer = GXv_char11[0] ;
               psimulax.this.AV66TotKgs = GXv_decimal23[0] ;
               psimulax.this.AV86PrdDesc = GXv_char10[0] ;
               psimulax.this.AV91Accion = GXv_char8[0] ;
               psimulax.this.AV67Volumen = GXv_int13[0] ;
               psimulax.this.AV80MaqCod = GXv_char7[0] ;
               psimulax.this.AV78MatCod = GXv_int24[0] ;
               psimulax.this.AV83ForColNom = GXv_char5[0] ;
               psimulax.this.AV84ForColNum = GXv_int6[0] ;
               psimulax.this.AV85TipColCod = GXv_int18[0] ;
               psimulax.this.AV79IntCod = GXv_int1[0] ;
               psimulax.this.AV107Procod = GXv_char3[0] ;
               if ( AV92PrdVal == 1 )
               {
                  if ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     GXv_char20[0] = A396EmprCod ;
                     GXv_char16[0] = AV72Station ;
                     GXv_int25[0] = AV71NumLin ;
                     GXv_int24[0] = AV73UltNumLin ;
                     GXv_int22[0] = (short)(0) ;
                     GXv_int19[0] = (byte)(0) ;
                     new app.pelisim(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_int25, GXv_int24, GXv_int22, GXv_int19) ;
                     psimulax.this.A396EmprCod = GXv_char20[0] ;
                     psimulax.this.AV72Station = GXv_char16[0] ;
                     psimulax.this.AV71NumLin = GXv_int25[0] ;
                     psimulax.this.AV73UltNumLin = GXv_int24[0] ;
                  }
                  if ( ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV91Accion, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     AV94ProForDes = A718PrdNom ;
                     AV62Producto = A719PrdNum ;
                     AV93LineaRec = GXutil.str( AV71NumLin, 3, 0) ;
                     GXv_char20[0] = A396EmprCod ;
                     GXv_char16[0] = AV62Producto ;
                     GXv_decimal23[0] = AV102ForCan ;
                     GXv_int19[0] = A490ForPrdUMe ;
                     GXv_decimal21[0] = AV66TotKgs ;
                     GXv_int17[0] = AV67Volumen ;
                     GXv_int13[0] = AV68ValCos ;
                     GXv_int25[0] = AV71NumLin ;
                     GXv_char14[0] = AV72Station ;
                     GXv_int24[0] = AV73UltNumLin ;
                     GXv_int18[0] = AV74FlagComp ;
                     GXv_char11[0] = AV60ProForCod ;
                     GXv_int22[0] = AV87ContLinea ;
                     GXv_decimal9[0] = AV96Incre ;
                     GXv_int15[0] = AV97EscMRb ;
                     new app.psimulay(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal23, GXv_int19, GXv_decimal21, GXv_int17, GXv_int13, GXv_int25, GXv_char14, GXv_int24, GXv_int18, GXv_char11, GXv_int22, GXv_decimal9, GXv_int15) ;
                     psimulax.this.A396EmprCod = GXv_char20[0] ;
                     psimulax.this.AV62Producto = GXv_char16[0] ;
                     psimulax.this.AV102ForCan = GXv_decimal23[0] ;
                     psimulax.this.A490ForPrdUMe = GXv_int19[0] ;
                     psimulax.this.AV66TotKgs = GXv_decimal21[0] ;
                     psimulax.this.AV67Volumen = GXv_int17[0] ;
                     psimulax.this.AV68ValCos = GXv_int13[0] ;
                     psimulax.this.AV71NumLin = GXv_int25[0] ;
                     psimulax.this.AV72Station = GXv_char14[0] ;
                     psimulax.this.AV73UltNumLin = GXv_int24[0] ;
                     psimulax.this.AV74FlagComp = GXv_int18[0] ;
                     psimulax.this.AV60ProForCod = GXv_char11[0] ;
                     psimulax.this.AV87ContLinea = GXv_int22[0] ;
                     psimulax.this.AV96Incre = GXv_decimal9[0] ;
                     psimulax.this.AV97EscMRb = GXv_int15[0] ;
                  }
               }
            }
            else
            {
               GXv_char20[0] = A396EmprCod ;
               GXv_char16[0] = A719PrdNum ;
               GXv_decimal23[0] = AV102ForCan ;
               GXv_int19[0] = A490ForPrdUMe ;
               GXv_decimal21[0] = AV66TotKgs ;
               GXv_int17[0] = AV67Volumen ;
               GXv_int13[0] = AV68ValCos ;
               GXv_int25[0] = AV71NumLin ;
               GXv_char14[0] = AV72Station ;
               GXv_int24[0] = AV73UltNumLin ;
               GXv_int18[0] = AV74FlagComp ;
               GXv_char11[0] = AV60ProForCod ;
               GXv_int22[0] = AV87ContLinea ;
               GXv_decimal9[0] = AV96Incre ;
               GXv_int15[0] = AV97EscMRb ;
               new app.psimulay(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal23, GXv_int19, GXv_decimal21, GXv_int17, GXv_int13, GXv_int25, GXv_char14, GXv_int24, GXv_int18, GXv_char11, GXv_int22, GXv_decimal9, GXv_int15) ;
               psimulax.this.A396EmprCod = GXv_char20[0] ;
               psimulax.this.A719PrdNum = GXv_char16[0] ;
               psimulax.this.AV102ForCan = GXv_decimal23[0] ;
               psimulax.this.A490ForPrdUMe = GXv_int19[0] ;
               psimulax.this.AV66TotKgs = GXv_decimal21[0] ;
               psimulax.this.AV67Volumen = GXv_int17[0] ;
               psimulax.this.AV68ValCos = GXv_int13[0] ;
               psimulax.this.AV71NumLin = GXv_int25[0] ;
               psimulax.this.AV72Station = GXv_char14[0] ;
               psimulax.this.AV73UltNumLin = GXv_int24[0] ;
               psimulax.this.AV74FlagComp = GXv_int18[0] ;
               psimulax.this.AV60ProForCod = GXv_char11[0] ;
               psimulax.this.AV87ContLinea = GXv_int22[0] ;
               psimulax.this.AV96Incre = GXv_decimal9[0] ;
               psimulax.this.AV97EscMRb = GXv_int15[0] ;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
   }

   public void S141( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P00VU9 */
      pr_default.execute(7, new Object[] {AV88EmprCod, AV62Producto});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A688PrdComCod = P00VU9_A688PrdComCod[0] ;
         A396EmprCod = P00VU9_A396EmprCod[0] ;
         A690PrdComFN = P00VU9_A690PrdComFN[0] ;
         A719PrdNum = P00VU9_A719PrdNum[0] ;
         AV77ProForCan = AV76Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV74FlagComp = (byte)(1) ;
         GXv_char20[0] = A396EmprCod ;
         GXv_char16[0] = A719PrdNum ;
         GXv_decimal23[0] = AV77ProForCan ;
         GXv_int19[0] = AV63ForPrdUme ;
         GXv_decimal21[0] = AV66TotKgs ;
         GXv_int17[0] = AV67Volumen ;
         GXv_int13[0] = AV68ValCos ;
         GXv_int25[0] = AV71NumLin ;
         GXv_char14[0] = AV72Station ;
         GXv_int24[0] = AV73UltNumLin ;
         GXv_int18[0] = AV74FlagComp ;
         GXv_char11[0] = AV60ProForCod ;
         GXv_int22[0] = AV87ContLinea ;
         GXv_decimal9[0] = AV96Incre ;
         GXv_int15[0] = AV97EscMRb ;
         new app.psimulay(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_decimal23, GXv_int19, GXv_decimal21, GXv_int17, GXv_int13, GXv_int25, GXv_char14, GXv_int24, GXv_int18, GXv_char11, GXv_int22, GXv_decimal9, GXv_int15) ;
         psimulax.this.A396EmprCod = GXv_char20[0] ;
         psimulax.this.A719PrdNum = GXv_char16[0] ;
         psimulax.this.AV77ProForCan = GXv_decimal23[0] ;
         psimulax.this.AV63ForPrdUme = GXv_int19[0] ;
         psimulax.this.AV66TotKgs = GXv_decimal21[0] ;
         psimulax.this.AV67Volumen = GXv_int17[0] ;
         psimulax.this.AV68ValCos = GXv_int13[0] ;
         psimulax.this.AV71NumLin = GXv_int25[0] ;
         psimulax.this.AV72Station = GXv_char14[0] ;
         psimulax.this.AV73UltNumLin = GXv_int24[0] ;
         psimulax.this.AV74FlagComp = GXv_int18[0] ;
         psimulax.this.AV60ProForCod = GXv_char11[0] ;
         psimulax.this.AV87ContLinea = GXv_int22[0] ;
         psimulax.this.AV96Incre = GXv_decimal9[0] ;
         psimulax.this.AV97EscMRb = GXv_int15[0] ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimulax.this.AV88EmprCod;
      this.aP1[0] = psimulax.this.AV81CliCod;
      this.aP2[0] = psimulax.this.AV82ForSer;
      this.aP3[0] = psimulax.this.AV83ForColNom;
      this.aP4[0] = psimulax.this.AV84ForColNum;
      this.aP5[0] = psimulax.this.AV85TipColCod;
      this.aP6[0] = psimulax.this.AV66TotKgs;
      this.aP7[0] = psimulax.this.AV67Volumen;
      this.aP8[0] = psimulax.this.AV80MaqCod;
      this.aP9[0] = psimulax.this.AV96Incre;
      Application.commitDataStores(context, remoteHandle, pr_default, "psimulax");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV72Station = "" ;
      AV113ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      P00VU3_A831TipColCod = new byte[1] ;
      P00VU3_A483ForColNum = new int[1] ;
      P00VU3_A482ForColNom = new String[] {""} ;
      P00VU3_A494ForSer = new String[] {""} ;
      P00VU3_A252CliCod = new int[1] ;
      P00VU3_A396EmprCod = new String[] {""} ;
      P00VU3_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      P00VU4_A4706ProForRb = new short[1] ;
      P00VU4_A766ProForDsc = new String[] {""} ;
      P00VU4_A396EmprCod = new String[] {""} ;
      P00VU4_A831TipColCod = new byte[1] ;
      P00VU4_A483ForColNum = new int[1] ;
      P00VU4_A482ForColNom = new String[] {""} ;
      P00VU4_A494ForSer = new String[] {""} ;
      P00VU4_A252CliCod = new int[1] ;
      P00VU4_A486ForNumCol = new int[1] ;
      P00VU4_A764ProForCod = new String[] {""} ;
      P00VU4_A626MatCod = new short[1] ;
      P00VU4_A583IntCod = new byte[1] ;
      P00VU4_A1160ProForL = new short[1] ;
      A766ProForDsc = "" ;
      A764ProForCod = "" ;
      AV60ProForCod = "" ;
      P00VU5_A396EmprCod = new String[] {""} ;
      P00VU5_A764ProForCod = new String[] {""} ;
      P00VU5_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VU5_A770ProForPrd = new String[] {""} ;
      P00VU5_A5358ProForClv = new String[] {""} ;
      P00VU5_A763ProForCla = new String[] {""} ;
      P00VU5_A765ProForDes = new String[] {""} ;
      P00VU5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VU5_A490ForPrdUMe = new byte[1] ;
      P00VU5_A767ProForLin = new short[1] ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      A5358ProForClv = "" ;
      A763ProForCla = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      AV100ProForCPo = DecimalUtil.ZERO ;
      AV62Producto = "" ;
      AV111Llamo_pe = "" ;
      AV95CalVe = "" ;
      AV86PrdDesc = "" ;
      AV91Accion = "" ;
      AV107Procod = "" ;
      AV108Porc_p = DecimalUtil.ZERO ;
      AV94ProForDes = "" ;
      AV93LineaRec = "" ;
      AV104Por_cant = DecimalUtil.ZERO ;
      AV69Produc = "" ;
      AV76Cantidad = DecimalUtil.ZERO ;
      AV75ProForPrd = "" ;
      AV110ProForCla = "" ;
      AV101CanFor = DecimalUtil.ZERO ;
      P00VU6_A396EmprCod = new String[] {""} ;
      P00VU6_A486ForNumCol = new int[1] ;
      P00VU6_A489ForPrdNor = new short[1] ;
      P00VU6_A715PrdLin = new short[1] ;
      P00VU7_A396EmprCod = new String[] {""} ;
      P00VU7_A486ForNumCol = new int[1] ;
      P00VU7_A489ForPrdNor = new short[1] ;
      P00VU7_A719PrdNum = new String[] {""} ;
      P00VU7_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VU7_A490ForPrdUMe = new byte[1] ;
      P00VU7_A715PrdLin = new short[1] ;
      A719PrdNum = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV65ForPrdCan = DecimalUtil.ZERO ;
      GXv_int12 = new short[1] ;
      P00VU8_A719PrdNum = new String[] {""} ;
      P00VU8_A486ForNumCol = new int[1] ;
      P00VU8_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VU8_A6193ForClaCol = new String[] {""} ;
      P00VU8_A718PrdNom = new String[] {""} ;
      P00VU8_A396EmprCod = new String[] {""} ;
      P00VU8_A490ForPrdUMe = new byte[1] ;
      P00VU8_A309ColLin = new short[1] ;
      A481ForCan = DecimalUtil.ZERO ;
      A6193ForClaCol = "" ;
      A718PrdNom = "" ;
      AV102ForCan = DecimalUtil.ZERO ;
      GXv_char10 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char3 = new String[1] ;
      P00VU9_A688PrdComCod = new String[] {""} ;
      P00VU9_A396EmprCod = new String[] {""} ;
      P00VU9_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VU9_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      AV77ProForCan = DecimalUtil.ZERO ;
      GXv_char20 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      GXv_int19 = new byte[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_int17 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_int25 = new short[1] ;
      GXv_char14 = new String[1] ;
      GXv_int24 = new short[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int22 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int15 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psimulax__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00VU3_A831TipColCod, P00VU3_A483ForColNum, P00VU3_A482ForColNom, P00VU3_A494ForSer, P00VU3_A252CliCod, P00VU3_A396EmprCod, P00VU3_A1160ProForL
            }
            , new Object[] {
            P00VU4_A4706ProForRb, P00VU4_A766ProForDsc, P00VU4_A396EmprCod, P00VU4_A831TipColCod, P00VU4_A483ForColNum, P00VU4_A482ForColNom, P00VU4_A494ForSer, P00VU4_A252CliCod, P00VU4_A486ForNumCol, P00VU4_A764ProForCod,
            P00VU4_A626MatCod, P00VU4_A583IntCod, P00VU4_A1160ProForL
            }
            , new Object[] {
            P00VU5_A396EmprCod, P00VU5_A764ProForCod, P00VU5_A6062ProForCPo, P00VU5_A770ProForPrd, P00VU5_A5358ProForClv, P00VU5_A763ProForCla, P00VU5_A765ProForDes, P00VU5_A762ProForCan, P00VU5_A490ForPrdUMe, P00VU5_A767ProForLin
            }
            , new Object[] {
            P00VU6_A396EmprCod, P00VU6_A486ForNumCol, P00VU6_A489ForPrdNor, P00VU6_A715PrdLin
            }
            , new Object[] {
            P00VU7_A396EmprCod, P00VU7_A486ForNumCol, P00VU7_A489ForPrdNor, P00VU7_A719PrdNum, P00VU7_A487ForPrdCan, P00VU7_A490ForPrdUMe, P00VU7_A715PrdLin
            }
            , new Object[] {
            P00VU8_A719PrdNum, P00VU8_A486ForNumCol, P00VU8_A481ForCan, P00VU8_A6193ForClaCol, P00VU8_A718PrdNom, P00VU8_A396EmprCod, P00VU8_A490ForPrdUMe, P00VU8_A309ColLin
            }
            , new Object[] {
            P00VU9_A688PrdComCod, P00VU9_A396EmprCod, P00VU9_A690PrdComFN, P00VU9_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV85TipColCod ;
   private byte AV105ClaveColor ;
   private byte AV120GXLvl26 ;
   private byte A831TipColCod ;
   private byte AV99CdpPor ;
   private byte GXt_int4 ;
   private byte AV74FlagComp ;
   private byte AV121GXLvl55 ;
   private byte A583IntCod ;
   private byte AV79IntCod ;
   private byte A490ForPrdUMe ;
   private byte AV63ForPrdUme ;
   private byte AV92PrdVal ;
   private byte AV109Dosi_pp ;
   private byte AV103Existe_p ;
   private byte AV70Ncar ;
   private byte GXv_int1[] ;
   private byte GXv_int19[] ;
   private byte GXv_int18[] ;
   private short AV114CantidadRegistrosAProcesar ;
   private short A1160ProForL ;
   private short AV89LinRec ;
   private short AV115CantidadRegistrosProcesados ;
   private short A4706ProForRb ;
   private short A626MatCod ;
   private short AV78MatCod ;
   private short A767ProForLin ;
   private short AV97EscMRb ;
   private short AV61NumOrd ;
   private short AV71NumLin ;
   private short AV73UltNumLin ;
   private short AV87ContLinea ;
   private short AV116Porcentaje ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short GXv_int12[] ;
   private short A309ColLin ;
   private short GXv_int25[] ;
   private short GXv_int24[] ;
   private short GXv_int22[] ;
   private short GXv_int15[] ;
   private short Gx_err ;
   private int AV81CliCod ;
   private int AV84ForColNum ;
   private int AV67Volumen ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV68ValCos ;
   private int A486ForNumCol ;
   private int AV64NumColFor ;
   private int GXv_int6[] ;
   private int GXv_int17[] ;
   private int GXv_int13[] ;
   private java.math.BigDecimal AV66TotKgs ;
   private java.math.BigDecimal AV96Incre ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV100ProForCPo ;
   private java.math.BigDecimal AV108Porc_p ;
   private java.math.BigDecimal AV104Por_cant ;
   private java.math.BigDecimal AV76Cantidad ;
   private java.math.BigDecimal AV101CanFor ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV65ForPrdCan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV102ForCan ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV77ProForCan ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV88EmprCod ;
   private String AV82ForSer ;
   private String AV83ForColNom ;
   private String AV80MaqCod ;
   private String AV72Station ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String A766ProForDsc ;
   private String A764ProForCod ;
   private String AV60ProForCod ;
   private String A770ProForPrd ;
   private String A5358ProForClv ;
   private String A763ProForCla ;
   private String A765ProForDes ;
   private String AV62Producto ;
   private String AV111Llamo_pe ;
   private String AV95CalVe ;
   private String AV86PrdDesc ;
   private String AV91Accion ;
   private String AV107Procod ;
   private String AV94ProForDes ;
   private String AV93LineaRec ;
   private String AV69Produc ;
   private String AV75ProForPrd ;
   private String AV110ProForCla ;
   private String A719PrdNum ;
   private String A6193ForClaCol ;
   private String A718PrdNom ;
   private String GXv_char10[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String A688PrdComCod ;
   private String GXv_char20[] ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String GXv_char11[] ;
   private boolean returnInSub ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV113ProgressIndicator ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00VU3_A831TipColCod ;
   private int[] P00VU3_A483ForColNum ;
   private String[] P00VU3_A482ForColNom ;
   private String[] P00VU3_A494ForSer ;
   private int[] P00VU3_A252CliCod ;
   private String[] P00VU3_A396EmprCod ;
   private short[] P00VU3_A1160ProForL ;
   private short[] P00VU4_A4706ProForRb ;
   private String[] P00VU4_A766ProForDsc ;
   private String[] P00VU4_A396EmprCod ;
   private byte[] P00VU4_A831TipColCod ;
   private int[] P00VU4_A483ForColNum ;
   private String[] P00VU4_A482ForColNom ;
   private String[] P00VU4_A494ForSer ;
   private int[] P00VU4_A252CliCod ;
   private int[] P00VU4_A486ForNumCol ;
   private String[] P00VU4_A764ProForCod ;
   private short[] P00VU4_A626MatCod ;
   private byte[] P00VU4_A583IntCod ;
   private short[] P00VU4_A1160ProForL ;
   private String[] P00VU5_A396EmprCod ;
   private String[] P00VU5_A764ProForCod ;
   private java.math.BigDecimal[] P00VU5_A6062ProForCPo ;
   private String[] P00VU5_A770ProForPrd ;
   private String[] P00VU5_A5358ProForClv ;
   private String[] P00VU5_A763ProForCla ;
   private String[] P00VU5_A765ProForDes ;
   private java.math.BigDecimal[] P00VU5_A762ProForCan ;
   private byte[] P00VU5_A490ForPrdUMe ;
   private short[] P00VU5_A767ProForLin ;
   private String[] P00VU6_A396EmprCod ;
   private int[] P00VU6_A486ForNumCol ;
   private short[] P00VU6_A489ForPrdNor ;
   private short[] P00VU6_A715PrdLin ;
   private String[] P00VU7_A396EmprCod ;
   private int[] P00VU7_A486ForNumCol ;
   private short[] P00VU7_A489ForPrdNor ;
   private String[] P00VU7_A719PrdNum ;
   private java.math.BigDecimal[] P00VU7_A487ForPrdCan ;
   private byte[] P00VU7_A490ForPrdUMe ;
   private short[] P00VU7_A715PrdLin ;
   private String[] P00VU8_A719PrdNum ;
   private int[] P00VU8_A486ForNumCol ;
   private java.math.BigDecimal[] P00VU8_A481ForCan ;
   private String[] P00VU8_A6193ForClaCol ;
   private String[] P00VU8_A718PrdNom ;
   private String[] P00VU8_A396EmprCod ;
   private byte[] P00VU8_A490ForPrdUMe ;
   private short[] P00VU8_A309ColLin ;
   private String[] P00VU9_A688PrdComCod ;
   private String[] P00VU9_A396EmprCod ;
   private java.math.BigDecimal[] P00VU9_A690PrdComFN ;
   private String[] P00VU9_A719PrdNum ;
}

final  class psimulax__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00VU2", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? and Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
         ,new ForEachCursor("P00VU3", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VU4", "SELECT T3.ProForRb, T3.ProForDsc, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.ForNumCol, T1.ProForCod, T2.MatCod, T2.IntCod, T1.ProForL FROM ((TXPLFORMU T1 INNER JOIN TXPCFORMU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VU5", "SELECT EmprCod, ProForCod, ProForCPo, ProForPrd, ProForClv, ProForCla, ProForDes, ProForCan, ForPrdUMe, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VU6", "SELECT EmprCod, ForNumCol, ForPrdNor, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? and ForPrdNor = ? ORDER BY EmprCod, ForNumCol, ForPrdNor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VU7", "SELECT EmprCod, ForNumCol, ForPrdNor, PrdNum, ForPrdCan, ForPrdUMe, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? and ForPrdNor = ? ORDER BY EmprCod, ForNumCol, ForPrdNor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VU8", "SELECT T1.PrdNum, T1.ForNumCol, T1.ForCan, T1.ForClaCol, T2.PrdNom, T1.EmprCod, T1.ForPrdUMe, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) AND (T1.ForNumCol = ?) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VU9", "SELECT PrdComCod, EmprCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND (PrdComCod = ?) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

