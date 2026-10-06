package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens003x extends GXProcedure
{
   public pens003x( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens003x.class ), "" );
   }

   public pens003x( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           int[] aP4 ,
                                           String[] aP5 )
   {
      pens003x.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pens003x.this.AV78EmprCod = aP0[0];
      this.aP0 = aP0;
      pens003x.this.AV90Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens003x.this.AV89Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens003x.this.AV56TotKgs = aP3[0];
      this.aP3 = aP3;
      pens003x.this.AV57Volumen = aP4[0];
      this.aP4 = aP4;
      pens003x.this.AV70MaqCod = aP5[0];
      this.aP5 = aP5;
      pens003x.this.AV86Incre = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV92NoProf ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV78EmprCod, httpContext.getMessage( "NOPROF", ""), GXv_int2) ;
      pens003x.this.GXt_int1 = GXv_int2[0] ;
      AV92NoProf = GXt_int1 ;
      AV97ClaveColor = (byte)(0) ;
      GXv_int2[0] = AV97ClaveColor ;
      new app.pexicon(remoteHandle, context).execute( AV78EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int2) ;
      pens003x.this.AV97ClaveColor = GXv_int2[0] ;
      GXt_int1 = AV96CdpPor ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV78EmprCod, httpContext.getMessage( "%CDP", ""), GXv_int2) ;
      pens003x.this.GXt_int1 = GXv_int2[0] ;
      AV96CdpPor = GXt_int1 ;
      GXv_char3[0] = AV78EmprCod ;
      GXv_char4[0] = "030100" ;
      GXv_int5[0] = AV58ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5) ;
      pens003x.this.AV78EmprCod = GXv_char3[0] ;
      pens003x.this.AV58ValCos = GXv_int5[0] ;
      GXt_int1 = (byte)(AV110Wrkst) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV78EmprCod, httpContext.getMessage( "0WRKST", ""), GXv_int2) ;
      pens003x.this.GXt_int1 = GXv_int2[0] ;
      AV110Wrkst = GXt_int1 ;
      AV111Workstat = GXutil.str( AV90Lb_numero, 8, 0) + AV89Lb_opcion ;
      GXt_char6 = AV62Station ;
      GXv_char4[0] = GXt_char6 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pens003x.this.GXt_char6 = GXv_char4[0] ;
      AV62Station = GXt_char6 ;
      /* Optimized DELETE. */
      /* Using cursor P02YK2 */
      pr_default.execute(0, new Object[] {AV78EmprCod, AV62Station});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
      /* End optimized DELETE. */
      GXv_char4[0] = AV78EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int5[0] = AV58ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
      pens003x.this.AV78EmprCod = GXv_char4[0] ;
      pens003x.this.AV58ValCos = GXv_int5[0] ;
      AV79LinRec = (short)(0) ;
      AV64FlagComp = (byte)(0) ;
      AV94FlagProc = (byte)(0) ;
      if ( AV92NoProf == 0 )
      {
         /* Using cursor P02YK3 */
         pr_default.execute(1, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5532Lb_numero = P02YK3_A5532Lb_numero[0] ;
            A396EmprCod = P02YK3_A396EmprCod[0] ;
            A626MatCod = P02YK3_A626MatCod[0] ;
            n626MatCod = P02YK3_n626MatCod[0] ;
            A583IntCod = P02YK3_A583IntCod[0] ;
            n583IntCod = P02YK3_n583IntCod[0] ;
            A5553Lb_ForCod = P02YK3_A5553Lb_ForCod[0] ;
            A252CliCod = P02YK3_A252CliCod[0] ;
            A5533Lb_ArtCod = P02YK3_A5533Lb_ArtCod[0] ;
            A5536Lb_ColNom = P02YK3_A5536Lb_ColNom[0] ;
            A5537Lb_ColNum = P02YK3_A5537Lb_ColNum[0] ;
            A831TipColCod = P02YK3_A831TipColCod[0] ;
            n831TipColCod = P02YK3_n831TipColCod[0] ;
            A5551Lb_lineaPq = P02YK3_A5551Lb_lineaPq[0] ;
            A626MatCod = P02YK3_A626MatCod[0] ;
            n626MatCod = P02YK3_n626MatCod[0] ;
            A583IntCod = P02YK3_A583IntCod[0] ;
            n583IntCod = P02YK3_n583IntCod[0] ;
            A252CliCod = P02YK3_A252CliCod[0] ;
            A5533Lb_ArtCod = P02YK3_A5533Lb_ArtCod[0] ;
            A5536Lb_ColNom = P02YK3_A5536Lb_ColNom[0] ;
            A5537Lb_ColNum = P02YK3_A5537Lb_ColNum[0] ;
            A831TipColCod = P02YK3_A831TipColCod[0] ;
            n831TipColCod = P02YK3_n831TipColCod[0] ;
            AV90Lb_numero = A5532Lb_numero ;
            AV68MatCod = A626MatCod ;
            AV69IntCod = A583IntCod ;
            AV50ProForCod = A5553Lb_ForCod ;
            AV71CliCod = A252CliCod ;
            AV72ForSer = A5533Lb_ArtCod ;
            AV73ForColNom = A5536Lb_ColNom ;
            AV74ForColNum = A5537Lb_ColNum ;
            AV75TipColCod = A831TipColCod ;
            /* Execute user subroutine: 'LPROFO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV94FlagProc = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P02YK4 */
         pr_default.execute(2, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5532Lb_numero = P02YK4_A5532Lb_numero[0] ;
            A396EmprCod = P02YK4_A396EmprCod[0] ;
            A626MatCod = P02YK4_A626MatCod[0] ;
            n626MatCod = P02YK4_n626MatCod[0] ;
            A583IntCod = P02YK4_A583IntCod[0] ;
            n583IntCod = P02YK4_n583IntCod[0] ;
            A5547Lb_Rb = P02YK4_A5547Lb_Rb[0] ;
            AV90Lb_numero = A5532Lb_numero ;
            AV68MatCod = A626MatCod ;
            AV69IntCod = A583IntCod ;
            AV87EscMRb = (short)(DecimalUtil.decToDouble(A5547Lb_Rb)) ;
            /* Execute user subroutine: 'PRODU' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'COLOR' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LPROFO' Routine */
      returnInSub = false ;
      /* Using cursor P02YK5 */
      pr_default.execute(3, new Object[] {AV78EmprCod, AV50ProForCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P02YK5_A764ProForCod[0] ;
         A396EmprCod = P02YK5_A396EmprCod[0] ;
         A4706ProForRb = P02YK5_A4706ProForRb[0] ;
         A6062ProForCPo = P02YK5_A6062ProForCPo[0] ;
         A770ProForPrd = P02YK5_A770ProForPrd[0] ;
         A5358ProForClv = P02YK5_A5358ProForClv[0] ;
         A763ProForCla = P02YK5_A763ProForCla[0] ;
         A765ProForDes = P02YK5_A765ProForDes[0] ;
         A762ProForCan = P02YK5_A762ProForCan[0] ;
         A490ForPrdUMe = P02YK5_A490ForPrdUMe[0] ;
         A767ProForLin = P02YK5_A767ProForLin[0] ;
         A4706ProForRb = P02YK5_A4706ProForRb[0] ;
         AV87EscMRb = A4706ProForRb ;
         AV107Proforcpo = A6062ProForCPo ;
         if ( ! (GXutil.strcmp("", A770ProForPrd)==0) )
         {
            if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
            {
               AV51NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
               AV52Producto = "" ;
               AV53ForPrdUme = (byte)(0) ;
               /* Execute user subroutine: 'CTRL_PE' */
               S125 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  if (true) return;
               }
               AV82PrdVal = (byte)(0) ;
               AV109Llamo_pe = httpContext.getMessage( "S", "") ;
               if ( ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV98Existe_p == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV98Existe_p == 1 ) ) )
               {
                  if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                  {
                     AV85CalVe = A763ProForCla ;
                  }
                  else
                  {
                     AV85CalVe = A5358ProForClv ;
                  }
                  AV76PrdDesc = A765ProForDes ;
                  AV52Producto = A770ProForPrd ;
                  AV99Dosi_pp = (byte)(0) ;
                  if ( GXutil.strcmp(A5358ProForClv, " ") == 0 )
                  {
                     AV109Llamo_pe = httpContext.getMessage( "S", "") ;
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = AV52Producto ;
                     GXv_char7[0] = A763ProForCla ;
                     GXv_int2[0] = AV82PrdVal ;
                     GXv_int5[0] = AV71CliCod ;
                     GXv_char8[0] = AV72ForSer ;
                     GXv_decimal9[0] = AV56TotKgs ;
                     GXv_char10[0] = AV76PrdDesc ;
                     GXv_char11[0] = AV81Accion ;
                     GXv_int12[0] = (short)(0) ;
                     GXv_int13[0] = AV57Volumen ;
                     GXv_char14[0] = AV70MaqCod ;
                     GXv_int15[0] = AV68MatCod ;
                     GXv_char16[0] = AV73ForColNom ;
                     GXv_int17[0] = AV74ForColNum ;
                     GXv_int18[0] = AV75TipColCod ;
                     GXv_int19[0] = AV69IntCod ;
                     GXv_char20[0] = AV100Procod ;
                     new app.psimcla(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char7, GXv_int2, GXv_int5, GXv_char8, GXv_decimal9, GXv_char10, GXv_char11, GXv_int12, GXv_int13, GXv_char14, GXv_int15, GXv_char16, GXv_int17, GXv_int18, GXv_int19, GXv_char20) ;
                     pens003x.this.A396EmprCod = GXv_char4[0] ;
                     pens003x.this.AV52Producto = GXv_char3[0] ;
                     pens003x.this.A763ProForCla = GXv_char7[0] ;
                     pens003x.this.AV82PrdVal = GXv_int2[0] ;
                     pens003x.this.AV71CliCod = GXv_int5[0] ;
                     pens003x.this.AV72ForSer = GXv_char8[0] ;
                     pens003x.this.AV56TotKgs = GXv_decimal9[0] ;
                     pens003x.this.AV76PrdDesc = GXv_char10[0] ;
                     pens003x.this.AV81Accion = GXv_char11[0] ;
                     pens003x.this.AV57Volumen = GXv_int13[0] ;
                     pens003x.this.AV70MaqCod = GXv_char14[0] ;
                     pens003x.this.AV68MatCod = GXv_int15[0] ;
                     pens003x.this.AV73ForColNom = GXv_char16[0] ;
                     pens003x.this.AV74ForColNum = GXv_int17[0] ;
                     pens003x.this.AV75TipColCod = GXv_int18[0] ;
                     pens003x.this.AV69IntCod = GXv_int19[0] ;
                     pens003x.this.AV100Procod = GXv_char20[0] ;
                  }
                  if ( ! (GXutil.strcmp("", A5358ProForClv)==0) )
                  {
                     AV109Llamo_pe = httpContext.getMessage( "N", "") ;
                     GXv_char20[0] = A396EmprCod ;
                     GXv_char16[0] = AV52Producto ;
                     GXv_char14[0] = A5358ProForClv ;
                     GXv_int19[0] = AV82PrdVal ;
                     GXv_int17[0] = AV71CliCod ;
                     GXv_char11[0] = AV72ForSer ;
                     GXv_decimal9[0] = AV56TotKgs ;
                     GXv_char10[0] = AV76PrdDesc ;
                     GXv_char8[0] = AV81Accion ;
                     GXv_int15[0] = (short)(0) ;
                     GXv_int13[0] = AV57Volumen ;
                     GXv_char7[0] = AV70MaqCod ;
                     GXv_int12[0] = AV68MatCod ;
                     GXv_char4[0] = AV73ForColNom ;
                     GXv_int5[0] = AV74ForColNum ;
                     GXv_int18[0] = AV75TipColCod ;
                     GXv_int2[0] = AV69IntCod ;
                     GXv_char3[0] = AV100Procod ;
                     GXv_decimal21[0] = AV101Porc_p ;
                     GXv_int22[0] = AV90Lb_numero ;
                     GXv_char23[0] = AV89Lb_opcion ;
                     new app.psimcla3(remoteHandle, context).execute( GXv_char20, GXv_char16, GXv_char14, GXv_int19, GXv_int17, GXv_char11, GXv_decimal9, GXv_char10, GXv_char8, GXv_int15, GXv_int13, GXv_char7, GXv_int12, GXv_char4, GXv_int5, GXv_int18, GXv_int2, GXv_char3, GXv_decimal21, GXv_int22, GXv_char23) ;
                     pens003x.this.A396EmprCod = GXv_char20[0] ;
                     pens003x.this.AV52Producto = GXv_char16[0] ;
                     pens003x.this.A5358ProForClv = GXv_char14[0] ;
                     pens003x.this.AV82PrdVal = GXv_int19[0] ;
                     pens003x.this.AV71CliCod = GXv_int17[0] ;
                     pens003x.this.AV72ForSer = GXv_char11[0] ;
                     pens003x.this.AV56TotKgs = GXv_decimal9[0] ;
                     pens003x.this.AV76PrdDesc = GXv_char10[0] ;
                     pens003x.this.AV81Accion = GXv_char8[0] ;
                     pens003x.this.AV57Volumen = GXv_int13[0] ;
                     pens003x.this.AV70MaqCod = GXv_char7[0] ;
                     pens003x.this.AV68MatCod = GXv_int12[0] ;
                     pens003x.this.AV73ForColNom = GXv_char4[0] ;
                     pens003x.this.AV74ForColNum = GXv_int5[0] ;
                     pens003x.this.AV75TipColCod = GXv_int18[0] ;
                     pens003x.this.AV69IntCod = GXv_int2[0] ;
                     pens003x.this.AV100Procod = GXv_char3[0] ;
                     pens003x.this.AV101Porc_p = GXv_decimal21[0] ;
                     pens003x.this.AV90Lb_numero = GXv_int22[0] ;
                     pens003x.this.AV89Lb_opcion = GXv_char23[0] ;
                     Gx_msg = httpContext.getMessage( "Proforclv =", "") + A5358ProForClv + GXutil.newLine( ) + httpContext.getMessage( "&Porc_p   =", "") + GXutil.str( AV101Porc_p, 6, 2) + GXutil.newLine( ) + httpContext.getMessage( "&PrdVal   =", "") + GXutil.str( AV82PrdVal, 1, 0) + GXutil.newLine( ) + httpContext.getMessage( "&Llamo_pe =", "") + AV109Llamo_pe + GXutil.newLine( ) ;
                  }
                  if ( AV82PrdVal == 1 )
                  {
                     AV99Dosi_pp = (byte)(1) ;
                     AV109Llamo_pe = httpContext.getMessage( "S", "") ;
                  }
                  else
                  {
                     AV109Llamo_pe = httpContext.getMessage( "N", "") ;
                  }
                  if ( ( ( AV82PrdVal == 1 ) && ! (GXutil.strcmp("", A763ProForCla)==0) ) || ( ( AV82PrdVal == 1 ) && ! (GXutil.strcmp("", A5358ProForClv)==0) ) )
                  {
                     if ( ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "M", "")) == 0 ) )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_char20[0] = AV62Station ;
                        GXv_int15[0] = AV61NumLin ;
                        GXv_int12[0] = AV63UltNumLin ;
                        GXv_int24[0] = (short)(0) ;
                        GXv_int19[0] = (byte)(0) ;
                        new app.pelisim(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_int15, GXv_int12, GXv_int24, GXv_int19) ;
                        pens003x.this.A396EmprCod = GXv_char23[0] ;
                        pens003x.this.AV62Station = GXv_char20[0] ;
                        pens003x.this.AV61NumLin = GXv_int15[0] ;
                        pens003x.this.AV63UltNumLin = GXv_int12[0] ;
                     }
                     if ( ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "M", "")) == 0 ) )
                     {
                        Gx_msg = httpContext.getMessage( "Aplico Accion A o M", "") + GXutil.newLine( ) + httpContext.getMessage( "Proforclv =", "") + A5358ProForClv + GXutil.newLine( ) + httpContext.getMessage( "&Porc_p   =", "") + GXutil.str( AV101Porc_p, 6, 2) + GXutil.newLine( ) + httpContext.getMessage( "&PrdVal   =", "") + GXutil.str( AV82PrdVal, 1, 0) + GXutil.newLine( ) + httpContext.getMessage( "&Llamo_pe =", "") + AV109Llamo_pe + GXutil.newLine( ) ;
                        AV84ProForDes = A765ProForDes ;
                        AV52Producto = A770ProForPrd ;
                        AV83LineaRec = GXutil.str( AV61NumLin, 3, 0) ;
                        if ( GXutil.strcmp(GXutil.substring( AV52Producto, 1, 1), "#") != 0 )
                        {
                           GXv_char23[0] = A396EmprCod ;
                           GXv_char20[0] = A770ProForPrd ;
                           GXv_decimal21[0] = A762ProForCan ;
                           GXv_int19[0] = A490ForPrdUMe ;
                           GXv_decimal9[0] = AV56TotKgs ;
                           GXv_int22[0] = AV57Volumen ;
                           GXv_int17[0] = AV58ValCos ;
                           GXv_int24[0] = AV61NumLin ;
                           GXv_char16[0] = AV62Station ;
                           GXv_int15[0] = AV63UltNumLin ;
                           GXv_int18[0] = AV64FlagComp ;
                           GXv_char14[0] = AV50ProForCod ;
                           GXv_int12[0] = AV77ContLinea ;
                           GXv_decimal25[0] = AV86Incre ;
                           GXv_int26[0] = AV87EscMRb ;
                           new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal21, GXv_int19, GXv_decimal9, GXv_int22, GXv_int17, GXv_int24, GXv_char16, GXv_int15, GXv_int18, GXv_char14, GXv_int12, GXv_decimal25, GXv_int26) ;
                           pens003x.this.A396EmprCod = GXv_char23[0] ;
                           pens003x.this.A770ProForPrd = GXv_char20[0] ;
                           pens003x.this.A762ProForCan = GXv_decimal21[0] ;
                           pens003x.this.A490ForPrdUMe = GXv_int19[0] ;
                           pens003x.this.AV56TotKgs = GXv_decimal9[0] ;
                           pens003x.this.AV57Volumen = GXv_int22[0] ;
                           pens003x.this.AV58ValCos = GXv_int17[0] ;
                           pens003x.this.AV61NumLin = GXv_int24[0] ;
                           pens003x.this.AV62Station = GXv_char16[0] ;
                           pens003x.this.AV63UltNumLin = GXv_int15[0] ;
                           pens003x.this.AV64FlagComp = GXv_int18[0] ;
                           pens003x.this.AV50ProForCod = GXv_char14[0] ;
                           pens003x.this.AV77ContLinea = GXv_int12[0] ;
                           pens003x.this.AV86Incre = GXv_decimal25[0] ;
                           pens003x.this.AV87EscMRb = GXv_int26[0] ;
                        }
                     }
                  }
               }
               if ( ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) ) || ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV82PrdVal == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV82PrdVal == 1 ) ) )
               {
                  Gx_msg = httpContext.getMessage( "Do Especiales", "") + GXutil.newLine( ) + httpContext.getMessage( "Proforclv =", "") + A5358ProForClv + GXutil.newLine( ) + httpContext.getMessage( "&Porc_p   =", "") + GXutil.str( AV101Porc_p, 6, 2) + GXutil.newLine( ) + httpContext.getMessage( "&PrdVal   =", "") + GXutil.str( AV82PrdVal, 1, 0) + GXutil.newLine( ) + httpContext.getMessage( "&Llamo_pe =", "") + AV109Llamo_pe + GXutil.newLine( ) ;
                  AV105Por_cant = A762ProForCan ;
                  if ( GXutil.strcmp(AV109Llamo_pe, httpContext.getMessage( "S", "")) == 0 )
                  {
                     /* Execute user subroutine: 'ESPECIALES' */
                     S135 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(3);
                        returnInSub = true;
                        if (true) return;
                     }
                  }
               }
            }
            else
            {
               AV59Produc = GXutil.substring( A770ProForPrd, 3, 1) ;
               if ( GXutil.strcmp(AV59Produc, " ") == 0 )
               {
                  if ( A762ProForCan.doubleValue() == 0 )
                  {
                     AV66Cantidad = DecimalUtil.doubleToDec(1) ;
                  }
                  else
                  {
                     AV66Cantidad = A762ProForCan ;
                  }
                  AV59Produc = GXutil.substring( A770ProForPrd, 2, 1) ;
                  if ( GXutil.strcmp(AV59Produc, "") == 0 )
                  {
                     AV60Ncar = (byte)(1) ;
                  }
                  else
                  {
                     AV60Ncar = (byte)(2) ;
                  }
                  AV65ProForPrd = A770ProForPrd ;
                  if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                  {
                     AV85CalVe = A763ProForCla ;
                     AV108Proforcla = A763ProForCla ;
                  }
                  else
                  {
                     AV85CalVe = A5358ProForClv ;
                     AV108Proforcla = A5358ProForClv ;
                  }
                  AV82PrdVal = (byte)(0) ;
                  AV76PrdDesc = A765ProForDes ;
                  AV52Producto = A770ProForPrd ;
                  /* Execute user subroutine: 'COLORANTES' */
                  S145 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(3);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               else
               {
                  if ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                     {
                        AV52Producto = A770ProForPrd ;
                        AV66Cantidad = A762ProForCan ;
                        AV53ForPrdUme = A490ForPrdUMe ;
                        AV64FlagComp = (byte)(0) ;
                        AV106canfor = A762ProForCan ;
                        if ( ( AV96CdpPor == 1 ) && ( AV107Proforcpo.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV107Proforcpo, DecimalUtil.stringToDec("100.00")) <= 0 ) )
                        {
                           AV106canfor = (A762ProForCan.multiply(AV107Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        }
                        GXv_char23[0] = A396EmprCod ;
                        GXv_char20[0] = A770ProForPrd ;
                        GXv_decimal25[0] = AV106canfor ;
                        GXv_int19[0] = A490ForPrdUMe ;
                        GXv_decimal21[0] = AV56TotKgs ;
                        GXv_int22[0] = AV57Volumen ;
                        GXv_int17[0] = AV58ValCos ;
                        GXv_int26[0] = AV61NumLin ;
                        GXv_char16[0] = AV62Station ;
                        GXv_int24[0] = AV63UltNumLin ;
                        GXv_int18[0] = AV64FlagComp ;
                        GXv_char14[0] = AV50ProForCod ;
                        GXv_int15[0] = AV77ContLinea ;
                        GXv_decimal9[0] = AV86Incre ;
                        GXv_int12[0] = AV87EscMRb ;
                        new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal25, GXv_int19, GXv_decimal21, GXv_int22, GXv_int17, GXv_int26, GXv_char16, GXv_int24, GXv_int18, GXv_char14, GXv_int15, GXv_decimal9, GXv_int12) ;
                        pens003x.this.A396EmprCod = GXv_char23[0] ;
                        pens003x.this.A770ProForPrd = GXv_char20[0] ;
                        pens003x.this.AV106canfor = GXv_decimal25[0] ;
                        pens003x.this.A490ForPrdUMe = GXv_int19[0] ;
                        pens003x.this.AV56TotKgs = GXv_decimal21[0] ;
                        pens003x.this.AV57Volumen = GXv_int22[0] ;
                        pens003x.this.AV58ValCos = GXv_int17[0] ;
                        pens003x.this.AV61NumLin = GXv_int26[0] ;
                        pens003x.this.AV62Station = GXv_char16[0] ;
                        pens003x.this.AV63UltNumLin = GXv_int24[0] ;
                        pens003x.this.AV64FlagComp = GXv_int18[0] ;
                        pens003x.this.AV50ProForCod = GXv_char14[0] ;
                        pens003x.this.AV77ContLinea = GXv_int15[0] ;
                        pens003x.this.AV86Incre = GXv_decimal9[0] ;
                        pens003x.this.AV87EscMRb = GXv_int12[0] ;
                        AV64FlagComp = (byte)(0) ;
                     }
                     else
                     {
                        AV106canfor = A762ProForCan ;
                        if ( ( AV96CdpPor == 1 ) && ( AV107Proforcpo.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV107Proforcpo, DecimalUtil.stringToDec("100.00")) <= 0 ) )
                        {
                           AV106canfor = (A762ProForCan.multiply(AV107Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        }
                        if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") != 0 )
                        {
                           GXv_char23[0] = A396EmprCod ;
                           GXv_char20[0] = A770ProForPrd ;
                           GXv_decimal25[0] = AV106canfor ;
                           GXv_int19[0] = A490ForPrdUMe ;
                           GXv_decimal21[0] = AV56TotKgs ;
                           GXv_int22[0] = AV57Volumen ;
                           GXv_int17[0] = AV58ValCos ;
                           GXv_int26[0] = AV61NumLin ;
                           GXv_char16[0] = AV62Station ;
                           GXv_int24[0] = AV63UltNumLin ;
                           GXv_int18[0] = AV64FlagComp ;
                           GXv_char14[0] = AV50ProForCod ;
                           GXv_int15[0] = AV77ContLinea ;
                           GXv_decimal9[0] = AV86Incre ;
                           GXv_int12[0] = AV87EscMRb ;
                           new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal25, GXv_int19, GXv_decimal21, GXv_int22, GXv_int17, GXv_int26, GXv_char16, GXv_int24, GXv_int18, GXv_char14, GXv_int15, GXv_decimal9, GXv_int12) ;
                           pens003x.this.A396EmprCod = GXv_char23[0] ;
                           pens003x.this.A770ProForPrd = GXv_char20[0] ;
                           pens003x.this.AV106canfor = GXv_decimal25[0] ;
                           pens003x.this.A490ForPrdUMe = GXv_int19[0] ;
                           pens003x.this.AV56TotKgs = GXv_decimal21[0] ;
                           pens003x.this.AV57Volumen = GXv_int22[0] ;
                           pens003x.this.AV58ValCos = GXv_int17[0] ;
                           pens003x.this.AV61NumLin = GXv_int26[0] ;
                           pens003x.this.AV62Station = GXv_char16[0] ;
                           pens003x.this.AV63UltNumLin = GXv_int24[0] ;
                           pens003x.this.AV64FlagComp = GXv_int18[0] ;
                           pens003x.this.AV50ProForCod = GXv_char14[0] ;
                           pens003x.this.AV77ContLinea = GXv_int15[0] ;
                           pens003x.this.AV86Incre = GXv_decimal9[0] ;
                           pens003x.this.AV87EscMRb = GXv_int12[0] ;
                        }
                     }
                  }
                  else
                  {
                     AV85CalVe = A763ProForCla ;
                     AV82PrdVal = (byte)(0) ;
                     AV76PrdDesc = A765ProForDes ;
                     AV52Producto = A770ProForPrd ;
                     if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_char20[0] = AV52Producto ;
                        GXv_char16[0] = A763ProForCla ;
                        GXv_int19[0] = AV82PrdVal ;
                        GXv_int22[0] = AV71CliCod ;
                        GXv_char14[0] = AV72ForSer ;
                        GXv_decimal25[0] = AV56TotKgs ;
                        GXv_char11[0] = AV76PrdDesc ;
                        GXv_char10[0] = AV81Accion ;
                        GXv_int26[0] = (short)(0) ;
                        GXv_int17[0] = AV57Volumen ;
                        GXv_char8[0] = AV70MaqCod ;
                        GXv_int24[0] = AV68MatCod ;
                        GXv_char7[0] = AV73ForColNom ;
                        GXv_int13[0] = AV74ForColNum ;
                        GXv_int18[0] = AV75TipColCod ;
                        GXv_int2[0] = AV69IntCod ;
                        GXv_char4[0] = AV100Procod ;
                        new app.psimcla(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_char16, GXv_int19, GXv_int22, GXv_char14, GXv_decimal25, GXv_char11, GXv_char10, GXv_int26, GXv_int17, GXv_char8, GXv_int24, GXv_char7, GXv_int13, GXv_int18, GXv_int2, GXv_char4) ;
                        pens003x.this.A396EmprCod = GXv_char23[0] ;
                        pens003x.this.AV52Producto = GXv_char20[0] ;
                        pens003x.this.A763ProForCla = GXv_char16[0] ;
                        pens003x.this.AV82PrdVal = GXv_int19[0] ;
                        pens003x.this.AV71CliCod = GXv_int22[0] ;
                        pens003x.this.AV72ForSer = GXv_char14[0] ;
                        pens003x.this.AV56TotKgs = GXv_decimal25[0] ;
                        pens003x.this.AV76PrdDesc = GXv_char11[0] ;
                        pens003x.this.AV81Accion = GXv_char10[0] ;
                        pens003x.this.AV57Volumen = GXv_int17[0] ;
                        pens003x.this.AV70MaqCod = GXv_char8[0] ;
                        pens003x.this.AV68MatCod = GXv_int24[0] ;
                        pens003x.this.AV73ForColNom = GXv_char7[0] ;
                        pens003x.this.AV74ForColNum = GXv_int13[0] ;
                        pens003x.this.AV75TipColCod = GXv_int18[0] ;
                        pens003x.this.AV69IntCod = GXv_int2[0] ;
                        pens003x.this.AV100Procod = GXv_char4[0] ;
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CX", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CF", "")) == 0 ) )
                        {
                           GXv_char23[0] = A396EmprCod ;
                           GXv_char20[0] = AV52Producto ;
                           GXv_char16[0] = A5358ProForClv ;
                           GXv_int19[0] = AV82PrdVal ;
                           GXv_int22[0] = AV71CliCod ;
                           GXv_char14[0] = AV72ForSer ;
                           GXv_decimal25[0] = AV56TotKgs ;
                           GXv_char11[0] = AV76PrdDesc ;
                           GXv_char10[0] = AV81Accion ;
                           GXv_int26[0] = (short)(0) ;
                           GXv_int17[0] = AV57Volumen ;
                           GXv_char8[0] = AV70MaqCod ;
                           GXv_int24[0] = AV68MatCod ;
                           GXv_char7[0] = AV73ForColNom ;
                           GXv_int13[0] = AV74ForColNum ;
                           GXv_int18[0] = AV75TipColCod ;
                           GXv_int2[0] = AV69IntCod ;
                           GXv_char4[0] = AV100Procod ;
                           GXv_decimal21[0] = AV101Porc_p ;
                           GXv_int5[0] = AV90Lb_numero ;
                           GXv_char3[0] = AV89Lb_opcion ;
                           new app.psimcla3(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_char16, GXv_int19, GXv_int22, GXv_char14, GXv_decimal25, GXv_char11, GXv_char10, GXv_int26, GXv_int17, GXv_char8, GXv_int24, GXv_char7, GXv_int13, GXv_int18, GXv_int2, GXv_char4, GXv_decimal21, GXv_int5, GXv_char3) ;
                           pens003x.this.A396EmprCod = GXv_char23[0] ;
                           pens003x.this.AV52Producto = GXv_char20[0] ;
                           pens003x.this.A5358ProForClv = GXv_char16[0] ;
                           pens003x.this.AV82PrdVal = GXv_int19[0] ;
                           pens003x.this.AV71CliCod = GXv_int22[0] ;
                           pens003x.this.AV72ForSer = GXv_char14[0] ;
                           pens003x.this.AV56TotKgs = GXv_decimal25[0] ;
                           pens003x.this.AV76PrdDesc = GXv_char11[0] ;
                           pens003x.this.AV81Accion = GXv_char10[0] ;
                           pens003x.this.AV57Volumen = GXv_int17[0] ;
                           pens003x.this.AV70MaqCod = GXv_char8[0] ;
                           pens003x.this.AV68MatCod = GXv_int24[0] ;
                           pens003x.this.AV73ForColNom = GXv_char7[0] ;
                           pens003x.this.AV74ForColNum = GXv_int13[0] ;
                           pens003x.this.AV75TipColCod = GXv_int18[0] ;
                           pens003x.this.AV69IntCod = GXv_int2[0] ;
                           pens003x.this.AV100Procod = GXv_char4[0] ;
                           pens003x.this.AV101Porc_p = GXv_decimal21[0] ;
                           pens003x.this.AV90Lb_numero = GXv_int5[0] ;
                           pens003x.this.AV89Lb_opcion = GXv_char3[0] ;
                        }
                        else
                        {
                           GXv_char23[0] = A396EmprCod ;
                           GXv_char20[0] = AV52Producto ;
                           GXv_char16[0] = A5358ProForClv ;
                           GXv_int19[0] = AV82PrdVal ;
                           GXv_int22[0] = AV71CliCod ;
                           GXv_char14[0] = AV72ForSer ;
                           GXv_decimal25[0] = AV56TotKgs ;
                           GXv_char11[0] = AV76PrdDesc ;
                           GXv_char10[0] = AV81Accion ;
                           GXv_int26[0] = (short)(0) ;
                           GXv_int17[0] = AV57Volumen ;
                           GXv_char8[0] = AV70MaqCod ;
                           GXv_int24[0] = AV68MatCod ;
                           GXv_char7[0] = AV73ForColNom ;
                           GXv_int13[0] = AV74ForColNum ;
                           GXv_int18[0] = AV75TipColCod ;
                           GXv_int2[0] = AV69IntCod ;
                           GXv_char4[0] = AV100Procod ;
                           new app.psimcla(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_char16, GXv_int19, GXv_int22, GXv_char14, GXv_decimal25, GXv_char11, GXv_char10, GXv_int26, GXv_int17, GXv_char8, GXv_int24, GXv_char7, GXv_int13, GXv_int18, GXv_int2, GXv_char4) ;
                           pens003x.this.A396EmprCod = GXv_char23[0] ;
                           pens003x.this.AV52Producto = GXv_char20[0] ;
                           pens003x.this.A5358ProForClv = GXv_char16[0] ;
                           pens003x.this.AV82PrdVal = GXv_int19[0] ;
                           pens003x.this.AV71CliCod = GXv_int22[0] ;
                           pens003x.this.AV72ForSer = GXv_char14[0] ;
                           pens003x.this.AV56TotKgs = GXv_decimal25[0] ;
                           pens003x.this.AV76PrdDesc = GXv_char11[0] ;
                           pens003x.this.AV81Accion = GXv_char10[0] ;
                           pens003x.this.AV57Volumen = GXv_int17[0] ;
                           pens003x.this.AV70MaqCod = GXv_char8[0] ;
                           pens003x.this.AV68MatCod = GXv_int24[0] ;
                           pens003x.this.AV73ForColNom = GXv_char7[0] ;
                           pens003x.this.AV74ForColNum = GXv_int13[0] ;
                           pens003x.this.AV75TipColCod = GXv_int18[0] ;
                           pens003x.this.AV69IntCod = GXv_int2[0] ;
                           pens003x.this.AV100Procod = GXv_char4[0] ;
                        }
                     }
                     if ( AV82PrdVal == 1 )
                     {
                        if ( ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           GXv_char23[0] = A396EmprCod ;
                           GXv_char20[0] = AV62Station ;
                           GXv_int26[0] = AV61NumLin ;
                           GXv_int24[0] = AV63UltNumLin ;
                           GXv_int15[0] = (short)(0) ;
                           GXv_int19[0] = (byte)(0) ;
                           new app.pelisim(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_int26, GXv_int24, GXv_int15, GXv_int19) ;
                           pens003x.this.A396EmprCod = GXv_char23[0] ;
                           pens003x.this.AV62Station = GXv_char20[0] ;
                           pens003x.this.AV61NumLin = GXv_int26[0] ;
                           pens003x.this.AV63UltNumLin = GXv_int24[0] ;
                        }
                        if ( ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           AV84ProForDes = A765ProForDes ;
                           AV52Producto = A770ProForPrd ;
                           AV83LineaRec = GXutil.str( AV61NumLin, 3, 0) ;
                           if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") != 0 )
                           {
                              GXv_char23[0] = A396EmprCod ;
                              GXv_char20[0] = A770ProForPrd ;
                              GXv_decimal25[0] = A762ProForCan ;
                              GXv_int19[0] = A490ForPrdUMe ;
                              GXv_decimal21[0] = AV56TotKgs ;
                              GXv_int22[0] = AV57Volumen ;
                              GXv_int17[0] = AV58ValCos ;
                              GXv_int26[0] = AV61NumLin ;
                              GXv_char16[0] = AV62Station ;
                              GXv_int24[0] = AV63UltNumLin ;
                              GXv_int18[0] = AV64FlagComp ;
                              GXv_char14[0] = AV50ProForCod ;
                              GXv_int15[0] = AV77ContLinea ;
                              GXv_decimal9[0] = AV86Incre ;
                              GXv_int12[0] = AV87EscMRb ;
                              new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal25, GXv_int19, GXv_decimal21, GXv_int22, GXv_int17, GXv_int26, GXv_char16, GXv_int24, GXv_int18, GXv_char14, GXv_int15, GXv_decimal9, GXv_int12) ;
                              pens003x.this.A396EmprCod = GXv_char23[0] ;
                              pens003x.this.A770ProForPrd = GXv_char20[0] ;
                              pens003x.this.A762ProForCan = GXv_decimal25[0] ;
                              pens003x.this.A490ForPrdUMe = GXv_int19[0] ;
                              pens003x.this.AV56TotKgs = GXv_decimal21[0] ;
                              pens003x.this.AV57Volumen = GXv_int22[0] ;
                              pens003x.this.AV58ValCos = GXv_int17[0] ;
                              pens003x.this.AV61NumLin = GXv_int26[0] ;
                              pens003x.this.AV62Station = GXv_char16[0] ;
                              pens003x.this.AV63UltNumLin = GXv_int24[0] ;
                              pens003x.this.AV64FlagComp = GXv_int18[0] ;
                              pens003x.this.AV50ProForCod = GXv_char14[0] ;
                              pens003x.this.AV77ContLinea = GXv_int15[0] ;
                              pens003x.this.AV86Incre = GXv_decimal9[0] ;
                              pens003x.this.AV87EscMRb = GXv_int12[0] ;
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S151( )
   {
      /* 'PRODU' Routine */
      returnInSub = false ;
      /* Using cursor P02YK6 */
      pr_default.execute(4, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A5555Lb_opcion = P02YK6_A5555Lb_opcion[0] ;
         A5532Lb_numero = P02YK6_A5532Lb_numero[0] ;
         A396EmprCod = P02YK6_A396EmprCod[0] ;
         A719PrdNum = P02YK6_A719PrdNum[0] ;
         A5561LB_CantP = P02YK6_A5561LB_CantP[0] ;
         A490ForPrdUMe = P02YK6_A490ForPrdUMe[0] ;
         A5560Lb_LineaPr = P02YK6_A5560Lb_LineaPr[0] ;
         AV52Producto = A719PrdNum ;
         AV55ForPrdCan = A5561LB_CantP ;
         AV53ForPrdUme = A490ForPrdUMe ;
         if ( ! (GXutil.strcmp("", AV52Producto)==0) )
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char20[0] = AV52Producto ;
            GXv_decimal25[0] = AV55ForPrdCan ;
            GXv_int19[0] = AV53ForPrdUme ;
            GXv_decimal21[0] = AV56TotKgs ;
            GXv_int22[0] = AV57Volumen ;
            GXv_int17[0] = AV58ValCos ;
            GXv_int26[0] = AV61NumLin ;
            GXv_char16[0] = AV62Station ;
            GXv_int24[0] = AV63UltNumLin ;
            GXv_int18[0] = AV64FlagComp ;
            GXv_char14[0] = AV50ProForCod ;
            GXv_int15[0] = AV77ContLinea ;
            GXv_decimal9[0] = AV86Incre ;
            GXv_int12[0] = AV87EscMRb ;
            new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal25, GXv_int19, GXv_decimal21, GXv_int22, GXv_int17, GXv_int26, GXv_char16, GXv_int24, GXv_int18, GXv_char14, GXv_int15, GXv_decimal9, GXv_int12) ;
            pens003x.this.A396EmprCod = GXv_char23[0] ;
            pens003x.this.AV52Producto = GXv_char20[0] ;
            pens003x.this.AV55ForPrdCan = GXv_decimal25[0] ;
            pens003x.this.AV53ForPrdUme = GXv_int19[0] ;
            pens003x.this.AV56TotKgs = GXv_decimal21[0] ;
            pens003x.this.AV57Volumen = GXv_int22[0] ;
            pens003x.this.AV58ValCos = GXv_int17[0] ;
            pens003x.this.AV61NumLin = GXv_int26[0] ;
            pens003x.this.AV62Station = GXv_char16[0] ;
            pens003x.this.AV63UltNumLin = GXv_int24[0] ;
            pens003x.this.AV64FlagComp = GXv_int18[0] ;
            pens003x.this.AV50ProForCod = GXv_char14[0] ;
            pens003x.this.AV77ContLinea = GXv_int15[0] ;
            pens003x.this.AV86Incre = GXv_decimal9[0] ;
            pens003x.this.AV87EscMRb = GXv_int12[0] ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S161( )
   {
      /* 'COLOR' Routine */
      returnInSub = false ;
      /* Using cursor P02YK7 */
      pr_default.execute(5, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A5555Lb_opcion = P02YK7_A5555Lb_opcion[0] ;
         A5532Lb_numero = P02YK7_A5532Lb_numero[0] ;
         A396EmprCod = P02YK7_A396EmprCod[0] ;
         A719PrdNum = P02YK7_A719PrdNum[0] ;
         A5558LB_CantC = P02YK7_A5558LB_CantC[0] ;
         A490ForPrdUMe = P02YK7_A490ForPrdUMe[0] ;
         A5557Lb_LineaC = P02YK7_A5557Lb_LineaC[0] ;
         GXv_char23[0] = A396EmprCod ;
         GXv_char20[0] = A719PrdNum ;
         GXv_decimal25[0] = A5558LB_CantC ;
         GXv_int19[0] = A490ForPrdUMe ;
         GXv_decimal21[0] = AV56TotKgs ;
         GXv_int22[0] = AV57Volumen ;
         GXv_int17[0] = AV58ValCos ;
         GXv_int26[0] = AV61NumLin ;
         GXv_char16[0] = AV62Station ;
         GXv_int24[0] = AV63UltNumLin ;
         GXv_int18[0] = AV64FlagComp ;
         GXv_char14[0] = AV50ProForCod ;
         GXv_int15[0] = AV77ContLinea ;
         GXv_decimal9[0] = AV86Incre ;
         GXv_int12[0] = AV87EscMRb ;
         new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal25, GXv_int19, GXv_decimal21, GXv_int22, GXv_int17, GXv_int26, GXv_char16, GXv_int24, GXv_int18, GXv_char14, GXv_int15, GXv_decimal9, GXv_int12) ;
         pens003x.this.A396EmprCod = GXv_char23[0] ;
         pens003x.this.A719PrdNum = GXv_char20[0] ;
         pens003x.this.A5558LB_CantC = GXv_decimal25[0] ;
         pens003x.this.A490ForPrdUMe = GXv_int19[0] ;
         pens003x.this.AV56TotKgs = GXv_decimal21[0] ;
         pens003x.this.AV57Volumen = GXv_int22[0] ;
         pens003x.this.AV58ValCos = GXv_int17[0] ;
         pens003x.this.AV61NumLin = GXv_int26[0] ;
         pens003x.this.AV62Station = GXv_char16[0] ;
         pens003x.this.AV63UltNumLin = GXv_int24[0] ;
         pens003x.this.AV64FlagComp = GXv_int18[0] ;
         pens003x.this.AV50ProForCod = GXv_char14[0] ;
         pens003x.this.AV77ContLinea = GXv_int15[0] ;
         pens003x.this.AV86Incre = GXv_decimal9[0] ;
         pens003x.this.AV87EscMRb = GXv_int12[0] ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S125( )
   {
      /* 'CTRL_PE' Routine */
      returnInSub = false ;
      AV98Existe_p = (byte)(0) ;
      /* Using cursor P02YK8 */
      pr_default.execute(6, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion, Short.valueOf(AV51NumOrd)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A5562Lb_orden = P02YK8_A5562Lb_orden[0] ;
         A5555Lb_opcion = P02YK8_A5555Lb_opcion[0] ;
         A5532Lb_numero = P02YK8_A5532Lb_numero[0] ;
         A396EmprCod = P02YK8_A396EmprCod[0] ;
         A5560Lb_LineaPr = P02YK8_A5560Lb_LineaPr[0] ;
         AV98Existe_p = (byte)(1) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S135( )
   {
      /* 'ESPECIALES' Routine */
      returnInSub = false ;
      /* Using cursor P02YK9 */
      pr_default.execute(7, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion, Short.valueOf(AV51NumOrd)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A5562Lb_orden = P02YK9_A5562Lb_orden[0] ;
         A5555Lb_opcion = P02YK9_A5555Lb_opcion[0] ;
         A5532Lb_numero = P02YK9_A5532Lb_numero[0] ;
         A396EmprCod = P02YK9_A396EmprCod[0] ;
         A719PrdNum = P02YK9_A719PrdNum[0] ;
         A5561LB_CantP = P02YK9_A5561LB_CantP[0] ;
         A490ForPrdUMe = P02YK9_A490ForPrdUMe[0] ;
         A5560Lb_LineaPr = P02YK9_A5560Lb_LineaPr[0] ;
         AV52Producto = A719PrdNum ;
         AV55ForPrdCan = A5561LB_CantP ;
         AV53ForPrdUme = A490ForPrdUMe ;
         if ( AV99Dosi_pp == 1 )
         {
            AV55ForPrdCan = (AV55ForPrdCan.multiply(AV101Porc_p).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( ( AV96CdpPor == 1 ) && ( AV107Proforcpo.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV107Proforcpo, DecimalUtil.stringToDec("100.00")) <= 0 ) )
            {
               AV55ForPrdCan = (AV55ForPrdCan.multiply(AV107Proforcpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
            if ( AV105Por_cant.doubleValue() > 0 )
            {
               AV55ForPrdCan = (AV55ForPrdCan.multiply(AV105Por_cant)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         if ( ! (GXutil.strcmp("", AV52Producto)==0) && ( GXutil.strcmp(GXutil.substring( AV52Producto, 1, 1), "#") != 0 ) )
         {
            GXv_char23[0] = A396EmprCod ;
            GXv_char20[0] = AV52Producto ;
            GXv_decimal25[0] = AV55ForPrdCan ;
            GXv_int19[0] = AV53ForPrdUme ;
            GXv_decimal21[0] = AV56TotKgs ;
            GXv_int22[0] = AV57Volumen ;
            GXv_int17[0] = AV58ValCos ;
            GXv_int26[0] = AV61NumLin ;
            GXv_char16[0] = AV62Station ;
            GXv_int24[0] = AV63UltNumLin ;
            GXv_int18[0] = AV64FlagComp ;
            GXv_char14[0] = AV50ProForCod ;
            GXv_int15[0] = AV77ContLinea ;
            GXv_decimal9[0] = AV86Incre ;
            GXv_int12[0] = AV87EscMRb ;
            new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal25, GXv_int19, GXv_decimal21, GXv_int22, GXv_int17, GXv_int26, GXv_char16, GXv_int24, GXv_int18, GXv_char14, GXv_int15, GXv_decimal9, GXv_int12) ;
            pens003x.this.A396EmprCod = GXv_char23[0] ;
            pens003x.this.AV52Producto = GXv_char20[0] ;
            pens003x.this.AV55ForPrdCan = GXv_decimal25[0] ;
            pens003x.this.AV53ForPrdUme = GXv_int19[0] ;
            pens003x.this.AV56TotKgs = GXv_decimal21[0] ;
            pens003x.this.AV57Volumen = GXv_int22[0] ;
            pens003x.this.AV58ValCos = GXv_int17[0] ;
            pens003x.this.AV61NumLin = GXv_int26[0] ;
            pens003x.this.AV62Station = GXv_char16[0] ;
            pens003x.this.AV63UltNumLin = GXv_int24[0] ;
            pens003x.this.AV64FlagComp = GXv_int18[0] ;
            pens003x.this.AV50ProForCod = GXv_char14[0] ;
            pens003x.this.AV77ContLinea = GXv_int15[0] ;
            pens003x.this.AV86Incre = GXv_decimal9[0] ;
            pens003x.this.AV87EscMRb = GXv_int12[0] ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S145( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P02YK10 */
      pr_default.execute(8, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion, Byte.valueOf(AV60Ncar), AV65ProForPrd, Byte.valueOf(AV60Ncar)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A719PrdNum = P02YK10_A719PrdNum[0] ;
         A5555Lb_opcion = P02YK10_A5555Lb_opcion[0] ;
         A5532Lb_numero = P02YK10_A5532Lb_numero[0] ;
         A396EmprCod = P02YK10_A396EmprCod[0] ;
         A5558LB_CantC = P02YK10_A5558LB_CantC[0] ;
         A490ForPrdUMe = P02YK10_A490ForPrdUMe[0] ;
         A5557Lb_LineaC = P02YK10_A5557Lb_LineaC[0] ;
         AV103Forcan = A5558LB_CantC ;
         GXv_char23[0] = A396EmprCod ;
         GXv_char20[0] = A719PrdNum ;
         GXv_decimal25[0] = AV103Forcan ;
         GXv_int19[0] = A490ForPrdUMe ;
         GXv_decimal21[0] = AV56TotKgs ;
         GXv_int22[0] = AV57Volumen ;
         GXv_int17[0] = AV58ValCos ;
         GXv_int26[0] = AV61NumLin ;
         GXv_char16[0] = AV62Station ;
         GXv_int24[0] = AV63UltNumLin ;
         GXv_int18[0] = AV64FlagComp ;
         GXv_char14[0] = AV50ProForCod ;
         GXv_int15[0] = AV77ContLinea ;
         GXv_decimal9[0] = AV86Incre ;
         GXv_int12[0] = AV87EscMRb ;
         new app.psimulay(remoteHandle, context).execute( GXv_char23, GXv_char20, GXv_decimal25, GXv_int19, GXv_decimal21, GXv_int22, GXv_int17, GXv_int26, GXv_char16, GXv_int24, GXv_int18, GXv_char14, GXv_int15, GXv_decimal9, GXv_int12) ;
         pens003x.this.A396EmprCod = GXv_char23[0] ;
         pens003x.this.A719PrdNum = GXv_char20[0] ;
         pens003x.this.AV103Forcan = GXv_decimal25[0] ;
         pens003x.this.A490ForPrdUMe = GXv_int19[0] ;
         pens003x.this.AV56TotKgs = GXv_decimal21[0] ;
         pens003x.this.AV57Volumen = GXv_int22[0] ;
         pens003x.this.AV58ValCos = GXv_int17[0] ;
         pens003x.this.AV61NumLin = GXv_int26[0] ;
         pens003x.this.AV62Station = GXv_char16[0] ;
         pens003x.this.AV63UltNumLin = GXv_int24[0] ;
         pens003x.this.AV64FlagComp = GXv_int18[0] ;
         pens003x.this.AV50ProForCod = GXv_char14[0] ;
         pens003x.this.AV77ContLinea = GXv_int15[0] ;
         pens003x.this.AV86Incre = GXv_decimal9[0] ;
         pens003x.this.AV87EscMRb = GXv_int12[0] ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens003x.this.AV78EmprCod;
      this.aP1[0] = pens003x.this.AV90Lb_numero;
      this.aP2[0] = pens003x.this.AV89Lb_opcion;
      this.aP3[0] = pens003x.this.AV56TotKgs;
      this.aP4[0] = pens003x.this.AV57Volumen;
      this.aP5[0] = pens003x.this.AV70MaqCod;
      this.aP6[0] = pens003x.this.AV86Incre;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens003x");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV111Workstat = "" ;
      AV62Station = "" ;
      GXt_char6 = "" ;
      scmdbuf = "" ;
      P02YK3_A5532Lb_numero = new int[1] ;
      P02YK3_A396EmprCod = new String[] {""} ;
      P02YK3_A626MatCod = new short[1] ;
      P02YK3_n626MatCod = new boolean[] {false} ;
      P02YK3_A583IntCod = new byte[1] ;
      P02YK3_n583IntCod = new boolean[] {false} ;
      P02YK3_A5553Lb_ForCod = new String[] {""} ;
      P02YK3_A252CliCod = new int[1] ;
      P02YK3_A5533Lb_ArtCod = new String[] {""} ;
      P02YK3_A5536Lb_ColNom = new String[] {""} ;
      P02YK3_A5537Lb_ColNum = new int[1] ;
      P02YK3_A831TipColCod = new byte[1] ;
      P02YK3_n831TipColCod = new boolean[] {false} ;
      P02YK3_A5551Lb_lineaPq = new short[1] ;
      A396EmprCod = "" ;
      A5553Lb_ForCod = "" ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      AV50ProForCod = "" ;
      AV72ForSer = "" ;
      AV73ForColNom = "" ;
      P02YK4_A5532Lb_numero = new int[1] ;
      P02YK4_A396EmprCod = new String[] {""} ;
      P02YK4_A626MatCod = new short[1] ;
      P02YK4_n626MatCod = new boolean[] {false} ;
      P02YK4_A583IntCod = new byte[1] ;
      P02YK4_n583IntCod = new boolean[] {false} ;
      P02YK4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      P02YK5_A764ProForCod = new String[] {""} ;
      P02YK5_A396EmprCod = new String[] {""} ;
      P02YK5_A4706ProForRb = new short[1] ;
      P02YK5_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02YK5_A770ProForPrd = new String[] {""} ;
      P02YK5_A5358ProForClv = new String[] {""} ;
      P02YK5_A763ProForCla = new String[] {""} ;
      P02YK5_A765ProForDes = new String[] {""} ;
      P02YK5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02YK5_A490ForPrdUMe = new byte[1] ;
      P02YK5_A767ProForLin = new short[1] ;
      A764ProForCod = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      A5358ProForClv = "" ;
      A763ProForCla = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      AV107Proforcpo = DecimalUtil.ZERO ;
      AV52Producto = "" ;
      AV109Llamo_pe = "" ;
      AV85CalVe = "" ;
      AV76PrdDesc = "" ;
      AV81Accion = "" ;
      AV100Procod = "" ;
      AV101Porc_p = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV84ProForDes = "" ;
      AV83LineaRec = "" ;
      AV105Por_cant = DecimalUtil.ZERO ;
      AV59Produc = "" ;
      AV66Cantidad = DecimalUtil.ZERO ;
      AV65ProForPrd = "" ;
      AV108Proforcla = "" ;
      AV106canfor = DecimalUtil.ZERO ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      P02YK6_A5555Lb_opcion = new String[] {""} ;
      P02YK6_A5532Lb_numero = new int[1] ;
      P02YK6_A396EmprCod = new String[] {""} ;
      P02YK6_A719PrdNum = new String[] {""} ;
      P02YK6_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02YK6_A490ForPrdUMe = new byte[1] ;
      P02YK6_A5560Lb_LineaPr = new short[1] ;
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      AV55ForPrdCan = DecimalUtil.ZERO ;
      P02YK7_A5555Lb_opcion = new String[] {""} ;
      P02YK7_A5532Lb_numero = new int[1] ;
      P02YK7_A396EmprCod = new String[] {""} ;
      P02YK7_A719PrdNum = new String[] {""} ;
      P02YK7_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02YK7_A490ForPrdUMe = new byte[1] ;
      P02YK7_A5557Lb_LineaC = new short[1] ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      P02YK8_A5562Lb_orden = new short[1] ;
      P02YK8_A5555Lb_opcion = new String[] {""} ;
      P02YK8_A5532Lb_numero = new int[1] ;
      P02YK8_A396EmprCod = new String[] {""} ;
      P02YK8_A5560Lb_LineaPr = new short[1] ;
      P02YK9_A5562Lb_orden = new short[1] ;
      P02YK9_A5555Lb_opcion = new String[] {""} ;
      P02YK9_A5532Lb_numero = new int[1] ;
      P02YK9_A396EmprCod = new String[] {""} ;
      P02YK9_A719PrdNum = new String[] {""} ;
      P02YK9_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02YK9_A490ForPrdUMe = new byte[1] ;
      P02YK9_A5560Lb_LineaPr = new short[1] ;
      P02YK10_A719PrdNum = new String[] {""} ;
      P02YK10_A5555Lb_opcion = new String[] {""} ;
      P02YK10_A5532Lb_numero = new int[1] ;
      P02YK10_A396EmprCod = new String[] {""} ;
      P02YK10_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02YK10_A490ForPrdUMe = new byte[1] ;
      P02YK10_A5557Lb_LineaC = new short[1] ;
      AV103Forcan = DecimalUtil.ZERO ;
      GXv_char23 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_int19 = new byte[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_int22 = new int[1] ;
      GXv_int17 = new int[1] ;
      GXv_int26 = new short[1] ;
      GXv_char16 = new String[1] ;
      GXv_int24 = new short[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens003x__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P02YK3_A5532Lb_numero, P02YK3_A396EmprCod, P02YK3_A626MatCod, P02YK3_n626MatCod, P02YK3_A583IntCod, P02YK3_n583IntCod, P02YK3_A5553Lb_ForCod, P02YK3_A252CliCod, P02YK3_A5533Lb_ArtCod, P02YK3_A5536Lb_ColNom,
            P02YK3_A5537Lb_ColNum, P02YK3_A831TipColCod, P02YK3_n831TipColCod, P02YK3_A5551Lb_lineaPq
            }
            , new Object[] {
            P02YK4_A5532Lb_numero, P02YK4_A396EmprCod, P02YK4_A626MatCod, P02YK4_n626MatCod, P02YK4_A583IntCod, P02YK4_n583IntCod, P02YK4_A5547Lb_Rb
            }
            , new Object[] {
            P02YK5_A764ProForCod, P02YK5_A396EmprCod, P02YK5_A4706ProForRb, P02YK5_A6062ProForCPo, P02YK5_A770ProForPrd, P02YK5_A5358ProForClv, P02YK5_A763ProForCla, P02YK5_A765ProForDes, P02YK5_A762ProForCan, P02YK5_A490ForPrdUMe,
            P02YK5_A767ProForLin
            }
            , new Object[] {
            P02YK6_A5555Lb_opcion, P02YK6_A5532Lb_numero, P02YK6_A396EmprCod, P02YK6_A719PrdNum, P02YK6_A5561LB_CantP, P02YK6_A490ForPrdUMe, P02YK6_A5560Lb_LineaPr
            }
            , new Object[] {
            P02YK7_A5555Lb_opcion, P02YK7_A5532Lb_numero, P02YK7_A396EmprCod, P02YK7_A719PrdNum, P02YK7_A5558LB_CantC, P02YK7_A490ForPrdUMe, P02YK7_A5557Lb_LineaC
            }
            , new Object[] {
            P02YK8_A5562Lb_orden, P02YK8_A5555Lb_opcion, P02YK8_A5532Lb_numero, P02YK8_A396EmprCod, P02YK8_A5560Lb_LineaPr
            }
            , new Object[] {
            P02YK9_A5562Lb_orden, P02YK9_A5555Lb_opcion, P02YK9_A5532Lb_numero, P02YK9_A396EmprCod, P02YK9_A719PrdNum, P02YK9_A5561LB_CantP, P02YK9_A490ForPrdUMe, P02YK9_A5560Lb_LineaPr
            }
            , new Object[] {
            P02YK10_A719PrdNum, P02YK10_A5555Lb_opcion, P02YK10_A5532Lb_numero, P02YK10_A396EmprCod, P02YK10_A5558LB_CantC, P02YK10_A490ForPrdUMe, P02YK10_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV92NoProf ;
   private byte AV97ClaveColor ;
   private byte AV96CdpPor ;
   private byte GXt_int1 ;
   private byte AV64FlagComp ;
   private byte AV94FlagProc ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV69IntCod ;
   private byte AV75TipColCod ;
   private byte A490ForPrdUMe ;
   private byte AV53ForPrdUme ;
   private byte AV82PrdVal ;
   private byte AV98Existe_p ;
   private byte AV99Dosi_pp ;
   private byte AV60Ncar ;
   private byte GXv_int2[] ;
   private byte GXv_int19[] ;
   private byte GXv_int18[] ;
   private short AV110Wrkst ;
   private short AV79LinRec ;
   private short A626MatCod ;
   private short A5551Lb_lineaPq ;
   private short AV68MatCod ;
   private short AV87EscMRb ;
   private short A4706ProForRb ;
   private short A767ProForLin ;
   private short AV51NumOrd ;
   private short AV61NumLin ;
   private short AV63UltNumLin ;
   private short AV77ContLinea ;
   private short A5560Lb_LineaPr ;
   private short A5557Lb_LineaC ;
   private short A5562Lb_orden ;
   private short GXv_int26[] ;
   private short GXv_int24[] ;
   private short GXv_int15[] ;
   private short GXv_int12[] ;
   private short Gx_err ;
   private int AV90Lb_numero ;
   private int AV57Volumen ;
   private int AV58ValCos ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV71CliCod ;
   private int AV74ForColNum ;
   private int GXv_int5[] ;
   private int GXv_int13[] ;
   private int GXv_int22[] ;
   private int GXv_int17[] ;
   private java.math.BigDecimal AV56TotKgs ;
   private java.math.BigDecimal AV86Incre ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV107Proforcpo ;
   private java.math.BigDecimal AV101Porc_p ;
   private java.math.BigDecimal AV105Por_cant ;
   private java.math.BigDecimal AV66Cantidad ;
   private java.math.BigDecimal AV106canfor ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal AV55ForPrdCan ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV103Forcan ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV78EmprCod ;
   private String AV89Lb_opcion ;
   private String AV70MaqCod ;
   private String AV111Workstat ;
   private String AV62Station ;
   private String GXt_char6 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5553Lb_ForCod ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String AV50ProForCod ;
   private String AV72ForSer ;
   private String AV73ForColNom ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private String A5358ProForClv ;
   private String A763ProForCla ;
   private String A765ProForDes ;
   private String AV52Producto ;
   private String AV109Llamo_pe ;
   private String AV85CalVe ;
   private String AV76PrdDesc ;
   private String AV81Accion ;
   private String AV100Procod ;
   private String Gx_msg ;
   private String AV84ProForDes ;
   private String AV83LineaRec ;
   private String AV59Produc ;
   private String AV65ProForPrd ;
   private String AV108Proforcla ;
   private String GXv_char3[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String GXv_char23[] ;
   private String GXv_char20[] ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private boolean n626MatCod ;
   private boolean n583IntCod ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P02YK3_A5532Lb_numero ;
   private String[] P02YK3_A396EmprCod ;
   private short[] P02YK3_A626MatCod ;
   private boolean[] P02YK3_n626MatCod ;
   private byte[] P02YK3_A583IntCod ;
   private boolean[] P02YK3_n583IntCod ;
   private String[] P02YK3_A5553Lb_ForCod ;
   private int[] P02YK3_A252CliCod ;
   private String[] P02YK3_A5533Lb_ArtCod ;
   private String[] P02YK3_A5536Lb_ColNom ;
   private int[] P02YK3_A5537Lb_ColNum ;
   private byte[] P02YK3_A831TipColCod ;
   private boolean[] P02YK3_n831TipColCod ;
   private short[] P02YK3_A5551Lb_lineaPq ;
   private int[] P02YK4_A5532Lb_numero ;
   private String[] P02YK4_A396EmprCod ;
   private short[] P02YK4_A626MatCod ;
   private boolean[] P02YK4_n626MatCod ;
   private byte[] P02YK4_A583IntCod ;
   private boolean[] P02YK4_n583IntCod ;
   private java.math.BigDecimal[] P02YK4_A5547Lb_Rb ;
   private String[] P02YK5_A764ProForCod ;
   private String[] P02YK5_A396EmprCod ;
   private short[] P02YK5_A4706ProForRb ;
   private java.math.BigDecimal[] P02YK5_A6062ProForCPo ;
   private String[] P02YK5_A770ProForPrd ;
   private String[] P02YK5_A5358ProForClv ;
   private String[] P02YK5_A763ProForCla ;
   private String[] P02YK5_A765ProForDes ;
   private java.math.BigDecimal[] P02YK5_A762ProForCan ;
   private byte[] P02YK5_A490ForPrdUMe ;
   private short[] P02YK5_A767ProForLin ;
   private String[] P02YK6_A5555Lb_opcion ;
   private int[] P02YK6_A5532Lb_numero ;
   private String[] P02YK6_A396EmprCod ;
   private String[] P02YK6_A719PrdNum ;
   private java.math.BigDecimal[] P02YK6_A5561LB_CantP ;
   private byte[] P02YK6_A490ForPrdUMe ;
   private short[] P02YK6_A5560Lb_LineaPr ;
   private String[] P02YK7_A5555Lb_opcion ;
   private int[] P02YK7_A5532Lb_numero ;
   private String[] P02YK7_A396EmprCod ;
   private String[] P02YK7_A719PrdNum ;
   private java.math.BigDecimal[] P02YK7_A5558LB_CantC ;
   private byte[] P02YK7_A490ForPrdUMe ;
   private short[] P02YK7_A5557Lb_LineaC ;
   private short[] P02YK8_A5562Lb_orden ;
   private String[] P02YK8_A5555Lb_opcion ;
   private int[] P02YK8_A5532Lb_numero ;
   private String[] P02YK8_A396EmprCod ;
   private short[] P02YK8_A5560Lb_LineaPr ;
   private short[] P02YK9_A5562Lb_orden ;
   private String[] P02YK9_A5555Lb_opcion ;
   private int[] P02YK9_A5532Lb_numero ;
   private String[] P02YK9_A396EmprCod ;
   private String[] P02YK9_A719PrdNum ;
   private java.math.BigDecimal[] P02YK9_A5561LB_CantP ;
   private byte[] P02YK9_A490ForPrdUMe ;
   private short[] P02YK9_A5560Lb_LineaPr ;
   private String[] P02YK10_A719PrdNum ;
   private String[] P02YK10_A5555Lb_opcion ;
   private int[] P02YK10_A5532Lb_numero ;
   private String[] P02YK10_A396EmprCod ;
   private java.math.BigDecimal[] P02YK10_A5558LB_CantC ;
   private byte[] P02YK10_A490ForPrdUMe ;
   private short[] P02YK10_A5557Lb_LineaC ;
}

final  class pens003x__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02YK2", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? and Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
         ,new ForEachCursor("P02YK3", "SELECT T1.Lb_numero, T1.EmprCod, T2.MatCod, T2.IntCod, T1.Lb_ForCod, T2.CliCod, T2.Lb_ArtCod, T2.Lb_ColNom, T2.Lb_ColNum, T2.TipColCod, T1.Lb_lineaPq FROM (TXPENS000 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YK4", "SELECT Lb_numero, EmprCod, MatCod, IntCod, Lb_Rb FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02YK5", "SELECT T1.ProForCod, T1.EmprCod, T2.ProForRb, T1.ProForCPo, T1.ProForPrd, T1.ProForClv, T1.ProForCla, T1.ProForDes, T1.ProForCan, T1.ForPrdUMe, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YK6", "SELECT Lb_opcion, Lb_numero, EmprCod, PrdNum, LB_CantP, ForPrdUMe, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YK7", "SELECT Lb_opcion, Lb_numero, EmprCod, PrdNum, LB_CantC, ForPrdUMe, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YK8", "SELECT Lb_orden, Lb_opcion, Lb_numero, EmprCod, Lb_LineaPr FROM TXPENS004 WHERE (EmprCod = ? and Lb_numero = ? and Lb_opcion = ?) AND (Lb_orden = ?) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YK9", "SELECT Lb_orden, Lb_opcion, Lb_numero, EmprCod, PrdNum, LB_CantP, ForPrdUMe, Lb_LineaPr FROM TXPENS004 WHERE (EmprCod = ? and Lb_numero = ? and Lb_opcion = ?) AND (Lb_orden = ?) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YK10", "SELECT PrdNum, Lb_opcion, Lb_numero, EmprCod, LB_CantC, ForPrdUMe, Lb_LineaC FROM TXPENS003 WHERE (EmprCod = ? and Lb_numero = ? and Lb_opcion = ?) AND (SUBSTR(PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

