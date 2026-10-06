package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens003 extends GXProcedure
{
   public pens003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens003.class ), "" );
   }

   public pens003( int remoteHandle ,
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
      pens003.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pens003.this.AV78EmprCod = aP0[0];
      this.aP0 = aP0;
      pens003.this.AV90Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens003.this.AV89Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens003.this.AV56TotKgs = aP3[0];
      this.aP3 = aP3;
      pens003.this.AV57Volumen = aP4[0];
      this.aP4 = aP4;
      pens003.this.AV70MaqCod = aP5[0];
      this.aP5 = aP5;
      pens003.this.AV86Incre = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV96Pens003x ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV78EmprCod, httpContext.getMessage( "ENS00x", ""), GXv_int2) ;
      pens003.this.GXt_int1 = GXv_int2[0] ;
      AV96Pens003x = GXt_int1 ;
      if ( AV96Pens003x == 1 )
      {
         GXv_char3[0] = AV78EmprCod ;
         GXv_int4[0] = AV90Lb_numero ;
         GXv_char5[0] = AV89Lb_opcion ;
         GXv_decimal6[0] = AV56TotKgs ;
         GXv_int7[0] = AV57Volumen ;
         GXv_char8[0] = AV70MaqCod ;
         GXv_decimal9[0] = AV86Incre ;
         new app.gestionlaboratorio.pens003x(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_decimal6, GXv_int7, GXv_char8, GXv_decimal9) ;
         pens003.this.AV78EmprCod = GXv_char3[0] ;
         pens003.this.AV90Lb_numero = GXv_int4[0] ;
         pens003.this.AV89Lb_opcion = GXv_char5[0] ;
         pens003.this.AV56TotKgs = GXv_decimal6[0] ;
         pens003.this.AV57Volumen = GXv_int7[0] ;
         pens003.this.AV70MaqCod = GXv_char8[0] ;
         pens003.this.AV86Incre = GXv_decimal9[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_int1 = AV92NoProf ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV78EmprCod, httpContext.getMessage( "NOPROF", ""), GXv_int2) ;
      pens003.this.GXt_int1 = GXv_int2[0] ;
      AV92NoProf = GXt_int1 ;
      GXt_char10 = AV62Station ;
      GXv_char8[0] = GXt_char10 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char8) ;
      pens003.this.GXt_char10 = GXv_char8[0] ;
      AV62Station = GXt_char10 ;
      /* Optimized DELETE. */
      /* Using cursor P01T62 */
      pr_default.execute(0, new Object[] {AV78EmprCod, AV62Station});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
      /* End optimized DELETE. */
      GXv_char8[0] = AV78EmprCod ;
      GXv_char5[0] = "030100" ;
      GXv_int7[0] = AV58ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_int7) ;
      pens003.this.AV78EmprCod = GXv_char8[0] ;
      pens003.this.AV58ValCos = GXv_int7[0] ;
      GXt_char10 = AV62Station ;
      GXv_char8[0] = GXt_char10 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char8) ;
      pens003.this.GXt_char10 = GXv_char8[0] ;
      AV62Station = GXt_char10 ;
      GXv_char8[0] = AV78EmprCod ;
      GXv_char5[0] = AV101EmprNom ;
      GXv_char3[0] = AV100Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char8, GXv_char5, GXv_char3) ;
      pens003.this.AV78EmprCod = GXv_char8[0] ;
      pens003.this.AV101EmprNom = GXv_char5[0] ;
      pens003.this.AV100Usurcod = GXv_char3[0] ;
      AV79LinRec = (short)(0) ;
      AV64FlagComp = (byte)(0) ;
      AV94FlagProc = (byte)(0) ;
      if ( AV92NoProf == 0 )
      {
         /* Using cursor P01T63 */
         pr_default.execute(1, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5532Lb_numero = P01T63_A5532Lb_numero[0] ;
            A396EmprCod = P01T63_A396EmprCod[0] ;
            A626MatCod = P01T63_A626MatCod[0] ;
            n626MatCod = P01T63_n626MatCod[0] ;
            A583IntCod = P01T63_A583IntCod[0] ;
            n583IntCod = P01T63_n583IntCod[0] ;
            A5553Lb_ForCod = P01T63_A5553Lb_ForCod[0] ;
            A252CliCod = P01T63_A252CliCod[0] ;
            A5533Lb_ArtCod = P01T63_A5533Lb_ArtCod[0] ;
            A5536Lb_ColNom = P01T63_A5536Lb_ColNom[0] ;
            A5537Lb_ColNum = P01T63_A5537Lb_ColNum[0] ;
            A831TipColCod = P01T63_A831TipColCod[0] ;
            n831TipColCod = P01T63_n831TipColCod[0] ;
            A5551Lb_lineaPq = P01T63_A5551Lb_lineaPq[0] ;
            A626MatCod = P01T63_A626MatCod[0] ;
            n626MatCod = P01T63_n626MatCod[0] ;
            A583IntCod = P01T63_A583IntCod[0] ;
            n583IntCod = P01T63_n583IntCod[0] ;
            A252CliCod = P01T63_A252CliCod[0] ;
            A5533Lb_ArtCod = P01T63_A5533Lb_ArtCod[0] ;
            A5536Lb_ColNom = P01T63_A5536Lb_ColNom[0] ;
            A5537Lb_ColNum = P01T63_A5537Lb_ColNum[0] ;
            A831TipColCod = P01T63_A831TipColCod[0] ;
            n831TipColCod = P01T63_n831TipColCod[0] ;
            AV90Lb_numero = A5532Lb_numero ;
            AV68MatCod = A626MatCod ;
            AV69IntCod = A583IntCod ;
            AV50ProForCod = A5553Lb_ForCod ;
            AV71CliCod = A252CliCod ;
            AV72ForSer = A5533Lb_ArtCod ;
            AV73ForColNom = A5536Lb_ColNom ;
            AV74ForColNum = A5537Lb_ColNum ;
            AV75TipColCod = A831TipColCod ;
            AV99Inc_obs = httpContext.getMessage( "Simulacion Coste Ensayos.", "") + GXutil.newLine( ) ;
            AV99Inc_obs += httpContext.getMessage( "N Ensayo= ", "") + GXutil.str( AV90Lb_numero, 8, 0) + GXutil.newLine( ) ;
            AV99Inc_obs += httpContext.getMessage( "Opcion  = ", "") + GXutil.trim( AV89Lb_opcion) + GXutil.newLine( ) ;
            AV99Inc_obs += httpContext.getMessage( "Proceso = ", "") + GXutil.trim( AV50ProForCod) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( AV78EmprCod, AV106Pgmname, AV100Usurcod, AV62Station, AV99Inc_obs, AV90Lb_numero, (byte)(0), " ") ;
            System.out.println( httpContext.getMessage( "Go Sub Lprofo", "") );
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
            System.out.println( httpContext.getMessage( "Ret Sub Lprofo", "") );
            AV94FlagProc = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01T64 */
         pr_default.execute(2, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5532Lb_numero = P01T64_A5532Lb_numero[0] ;
            A396EmprCod = P01T64_A396EmprCod[0] ;
            A626MatCod = P01T64_A626MatCod[0] ;
            n626MatCod = P01T64_n626MatCod[0] ;
            A583IntCod = P01T64_A583IntCod[0] ;
            n583IntCod = P01T64_n583IntCod[0] ;
            A5547Lb_Rb = P01T64_A5547Lb_Rb[0] ;
            AV90Lb_numero = A5532Lb_numero ;
            AV68MatCod = A626MatCod ;
            AV69IntCod = A583IntCod ;
            AV87EscMRb = (short)(DecimalUtil.decToDouble(A5547Lb_Rb)) ;
            /* Execute user subroutine: 'PRODU' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'COLOR' */
            S151 ();
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
      /* Using cursor P01T65 */
      pr_default.execute(3, new Object[] {AV50ProForCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P01T65_A764ProForCod[0] ;
         A767ProForLin = P01T65_A767ProForLin[0] ;
         A4706ProForRb = P01T65_A4706ProForRb[0] ;
         A770ProForPrd = P01T65_A770ProForPrd[0] ;
         A763ProForCla = P01T65_A763ProForCla[0] ;
         A762ProForCan = P01T65_A762ProForCan[0] ;
         A490ForPrdUMe = P01T65_A490ForPrdUMe[0] ;
         A765ProForDes = P01T65_A765ProForDes[0] ;
         A5358ProForClv = P01T65_A5358ProForClv[0] ;
         A396EmprCod = P01T65_A396EmprCod[0] ;
         A4706ProForRb = P01T65_A4706ProForRb[0] ;
         AV87EscMRb = A4706ProForRb ;
         if ( ! (GXutil.strcmp("", A770ProForPrd)==0) )
         {
            if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
            {
               AV51NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
               AV52Producto = "" ;
               AV53ForPrdUme = (byte)(0) ;
               if ( GXutil.strcmp(A763ProForCla, GXutil.space( (short)(16))) == 0 )
               {
                  /* Execute user subroutine: 'ESPECIALES' */
                  S125 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(3);
                     returnInSub = true;
                     if (true) return;
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
                  /* Execute user subroutine: 'COLORANTES' */
                  S135 ();
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
                  if ( (GXutil.strcmp("", A763ProForCla)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                     {
                        AV52Producto = A770ProForPrd ;
                        AV66Cantidad = A762ProForCan ;
                        AV53ForPrdUme = A490ForPrdUMe ;
                        AV64FlagComp = (byte)(0) ;
                        System.out.println( httpContext.getMessage( "Compuestos.Go PSIMULAY", "") );
                        GXv_char8[0] = A396EmprCod ;
                        GXv_char5[0] = A770ProForPrd ;
                        GXv_decimal9[0] = A762ProForCan ;
                        GXv_int2[0] = A490ForPrdUMe ;
                        GXv_decimal6[0] = AV56TotKgs ;
                        GXv_int7[0] = AV57Volumen ;
                        GXv_int4[0] = AV58ValCos ;
                        GXv_int11[0] = AV61NumLin ;
                        GXv_char3[0] = AV62Station ;
                        GXv_int12[0] = AV63UltNumLin ;
                        GXv_int13[0] = AV64FlagComp ;
                        GXv_char14[0] = AV50ProForCod ;
                        GXv_int15[0] = AV77ContLinea ;
                        GXv_decimal16[0] = AV86Incre ;
                        GXv_int17[0] = AV87EscMRb ;
                        new app.psimulay(remoteHandle, context).execute( GXv_char8, GXv_char5, GXv_decimal9, GXv_int2, GXv_decimal6, GXv_int7, GXv_int4, GXv_int11, GXv_char3, GXv_int12, GXv_int13, GXv_char14, GXv_int15, GXv_decimal16, GXv_int17) ;
                        pens003.this.A396EmprCod = GXv_char8[0] ;
                        pens003.this.A770ProForPrd = GXv_char5[0] ;
                        pens003.this.A762ProForCan = GXv_decimal9[0] ;
                        pens003.this.A490ForPrdUMe = GXv_int2[0] ;
                        pens003.this.AV56TotKgs = GXv_decimal6[0] ;
                        pens003.this.AV57Volumen = GXv_int7[0] ;
                        pens003.this.AV58ValCos = GXv_int4[0] ;
                        pens003.this.AV61NumLin = GXv_int11[0] ;
                        pens003.this.AV62Station = GXv_char3[0] ;
                        pens003.this.AV63UltNumLin = GXv_int12[0] ;
                        pens003.this.AV64FlagComp = GXv_int13[0] ;
                        pens003.this.AV50ProForCod = GXv_char14[0] ;
                        pens003.this.AV77ContLinea = GXv_int15[0] ;
                        pens003.this.AV86Incre = GXv_decimal16[0] ;
                        pens003.this.AV87EscMRb = GXv_int17[0] ;
                        System.out.println( httpContext.getMessage( "Compuestos.Ret PSIMULAY", "") );
                        AV64FlagComp = (byte)(0) ;
                     }
                     else
                     {
                        System.out.println( httpContext.getMessage( "1Productos.Go PSIMULAY", "") );
                        GXv_char14[0] = A396EmprCod ;
                        GXv_char8[0] = A770ProForPrd ;
                        GXv_decimal16[0] = A762ProForCan ;
                        GXv_int13[0] = A490ForPrdUMe ;
                        GXv_decimal9[0] = AV56TotKgs ;
                        GXv_int7[0] = AV57Volumen ;
                        GXv_int4[0] = AV58ValCos ;
                        GXv_int17[0] = AV61NumLin ;
                        GXv_char5[0] = AV62Station ;
                        GXv_int15[0] = AV63UltNumLin ;
                        GXv_int2[0] = AV64FlagComp ;
                        GXv_char3[0] = AV50ProForCod ;
                        GXv_int12[0] = AV77ContLinea ;
                        GXv_decimal6[0] = AV86Incre ;
                        GXv_int11[0] = AV87EscMRb ;
                        new app.psimulay(remoteHandle, context).execute( GXv_char14, GXv_char8, GXv_decimal16, GXv_int13, GXv_decimal9, GXv_int7, GXv_int4, GXv_int17, GXv_char5, GXv_int15, GXv_int2, GXv_char3, GXv_int12, GXv_decimal6, GXv_int11) ;
                        pens003.this.A396EmprCod = GXv_char14[0] ;
                        pens003.this.A770ProForPrd = GXv_char8[0] ;
                        pens003.this.A762ProForCan = GXv_decimal16[0] ;
                        pens003.this.A490ForPrdUMe = GXv_int13[0] ;
                        pens003.this.AV56TotKgs = GXv_decimal9[0] ;
                        pens003.this.AV57Volumen = GXv_int7[0] ;
                        pens003.this.AV58ValCos = GXv_int4[0] ;
                        pens003.this.AV61NumLin = GXv_int17[0] ;
                        pens003.this.AV62Station = GXv_char5[0] ;
                        pens003.this.AV63UltNumLin = GXv_int15[0] ;
                        pens003.this.AV64FlagComp = GXv_int2[0] ;
                        pens003.this.AV50ProForCod = GXv_char3[0] ;
                        pens003.this.AV77ContLinea = GXv_int12[0] ;
                        pens003.this.AV86Incre = GXv_decimal6[0] ;
                        pens003.this.AV87EscMRb = GXv_int11[0] ;
                        System.out.println( httpContext.getMessage( "1Productos.Ret PSIMULAY", "") );
                     }
                  }
                  else
                  {
                     AV85CalVe = A763ProForCla ;
                     AV82PrdVal = (byte)(0) ;
                     AV76PrdDesc = A765ProForDes ;
                     AV52Producto = A770ProForPrd ;
                     if ( GXutil.strcmp(A5358ProForClv, " ") == 0 )
                     {
                        GXv_char14[0] = A396EmprCod ;
                        GXv_char8[0] = AV52Producto ;
                        GXv_char5[0] = A763ProForCla ;
                        GXv_int13[0] = AV82PrdVal ;
                        GXv_int7[0] = AV71CliCod ;
                        GXv_char3[0] = AV72ForSer ;
                        GXv_decimal16[0] = AV56TotKgs ;
                        GXv_char18[0] = AV76PrdDesc ;
                        GXv_char19[0] = AV81Accion ;
                        GXv_int17[0] = (short)(0) ;
                        GXv_int4[0] = AV57Volumen ;
                        GXv_char20[0] = AV70MaqCod ;
                        GXv_int15[0] = AV68MatCod ;
                        GXv_char21[0] = AV73ForColNom ;
                        GXv_int22[0] = AV74ForColNum ;
                        GXv_int2[0] = AV75TipColCod ;
                        GXv_int23[0] = AV69IntCod ;
                        GXv_int24[0] = AV90Lb_numero ;
                        GXv_char25[0] = AV89Lb_opcion ;
                        new app.pens041(remoteHandle, context).execute( GXv_char14, GXv_char8, GXv_char5, GXv_int13, GXv_int7, GXv_char3, GXv_decimal16, GXv_char18, GXv_char19, GXv_int17, GXv_int4, GXv_char20, GXv_int15, GXv_char21, GXv_int22, GXv_int2, GXv_int23, GXv_int24, GXv_char25) ;
                        pens003.this.A396EmprCod = GXv_char14[0] ;
                        pens003.this.AV52Producto = GXv_char8[0] ;
                        pens003.this.A763ProForCla = GXv_char5[0] ;
                        pens003.this.AV82PrdVal = GXv_int13[0] ;
                        pens003.this.AV71CliCod = GXv_int7[0] ;
                        pens003.this.AV72ForSer = GXv_char3[0] ;
                        pens003.this.AV56TotKgs = GXv_decimal16[0] ;
                        pens003.this.AV76PrdDesc = GXv_char18[0] ;
                        pens003.this.AV81Accion = GXv_char19[0] ;
                        pens003.this.AV57Volumen = GXv_int4[0] ;
                        pens003.this.AV70MaqCod = GXv_char20[0] ;
                        pens003.this.AV68MatCod = GXv_int15[0] ;
                        pens003.this.AV73ForColNom = GXv_char21[0] ;
                        pens003.this.AV74ForColNum = GXv_int22[0] ;
                        pens003.this.AV75TipColCod = GXv_int2[0] ;
                        pens003.this.AV69IntCod = GXv_int23[0] ;
                        pens003.this.AV90Lb_numero = GXv_int24[0] ;
                        pens003.this.AV89Lb_opcion = GXv_char25[0] ;
                     }
                     if ( ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CX", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CF", "")) == 0 ) )
                     {
                        GXv_char25[0] = A396EmprCod ;
                        GXv_char21[0] = AV52Producto ;
                        GXv_char20[0] = A5358ProForClv ;
                        GXv_int23[0] = AV82PrdVal ;
                        GXv_int24[0] = AV71CliCod ;
                        GXv_char19[0] = AV72ForSer ;
                        GXv_decimal16[0] = AV56TotKgs ;
                        GXv_char18[0] = AV76PrdDesc ;
                        GXv_char14[0] = AV81Accion ;
                        GXv_int17[0] = (short)(0) ;
                        GXv_int22[0] = AV57Volumen ;
                        GXv_char8[0] = AV70MaqCod ;
                        GXv_int15[0] = AV68MatCod ;
                        GXv_char5[0] = AV73ForColNom ;
                        GXv_int7[0] = AV74ForColNum ;
                        GXv_int13[0] = AV75TipColCod ;
                        GXv_int2[0] = AV69IntCod ;
                        GXv_int4[0] = AV90Lb_numero ;
                        GXv_char3[0] = AV89Lb_opcion ;
                        GXv_decimal9[0] = AV97Porc_p ;
                        new app.pens041x(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_char20, GXv_int23, GXv_int24, GXv_char19, GXv_decimal16, GXv_char18, GXv_char14, GXv_int17, GXv_int22, GXv_char8, GXv_int15, GXv_char5, GXv_int7, GXv_int13, GXv_int2, GXv_int4, GXv_char3, GXv_decimal9) ;
                        pens003.this.A396EmprCod = GXv_char25[0] ;
                        pens003.this.AV52Producto = GXv_char21[0] ;
                        pens003.this.A5358ProForClv = GXv_char20[0] ;
                        pens003.this.AV82PrdVal = GXv_int23[0] ;
                        pens003.this.AV71CliCod = GXv_int24[0] ;
                        pens003.this.AV72ForSer = GXv_char19[0] ;
                        pens003.this.AV56TotKgs = GXv_decimal16[0] ;
                        pens003.this.AV76PrdDesc = GXv_char18[0] ;
                        pens003.this.AV81Accion = GXv_char14[0] ;
                        pens003.this.AV57Volumen = GXv_int22[0] ;
                        pens003.this.AV70MaqCod = GXv_char8[0] ;
                        pens003.this.AV68MatCod = GXv_int15[0] ;
                        pens003.this.AV73ForColNom = GXv_char5[0] ;
                        pens003.this.AV74ForColNum = GXv_int7[0] ;
                        pens003.this.AV75TipColCod = GXv_int13[0] ;
                        pens003.this.AV69IntCod = GXv_int2[0] ;
                        pens003.this.AV90Lb_numero = GXv_int4[0] ;
                        pens003.this.AV89Lb_opcion = GXv_char3[0] ;
                        pens003.this.AV97Porc_p = GXv_decimal9[0] ;
                     }
                     if ( ( AV82PrdVal == 1 ) || ( AV82PrdVal == 2 ) )
                     {
                        if ( ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           GXv_char25[0] = A396EmprCod ;
                           GXv_char21[0] = AV62Station ;
                           GXv_int17[0] = AV61NumLin ;
                           GXv_int15[0] = AV63UltNumLin ;
                           GXv_int12[0] = (short)(0) ;
                           GXv_int23[0] = (byte)(0) ;
                           new app.pelisim(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_int17, GXv_int15, GXv_int12, GXv_int23) ;
                           pens003.this.A396EmprCod = GXv_char25[0] ;
                           pens003.this.AV62Station = GXv_char21[0] ;
                           pens003.this.AV61NumLin = GXv_int17[0] ;
                           pens003.this.AV63UltNumLin = GXv_int15[0] ;
                        }
                        if ( ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV81Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           AV84ProForDes = A765ProForDes ;
                           AV52Producto = A770ProForPrd ;
                           AV83LineaRec = GXutil.str( AV61NumLin, 3, 0) ;
                           AV98Cantidad0 = A762ProForCan ;
                           if ( AV82PrdVal == 2 )
                           {
                              AV98Cantidad0 = DecimalUtil.doubleToDec(0) ;
                           }
                           System.out.println( httpContext.getMessage( "2Productos.Go PSIMULAY", "") );
                           GXv_char25[0] = A396EmprCod ;
                           GXv_char21[0] = A770ProForPrd ;
                           GXv_decimal16[0] = AV98Cantidad0 ;
                           GXv_int23[0] = A490ForPrdUMe ;
                           GXv_decimal9[0] = AV56TotKgs ;
                           GXv_int24[0] = AV57Volumen ;
                           GXv_int22[0] = AV58ValCos ;
                           GXv_int17[0] = AV61NumLin ;
                           GXv_char20[0] = AV62Station ;
                           GXv_int15[0] = AV63UltNumLin ;
                           GXv_int13[0] = AV64FlagComp ;
                           GXv_char19[0] = AV50ProForCod ;
                           GXv_int12[0] = AV77ContLinea ;
                           GXv_decimal6[0] = AV86Incre ;
                           GXv_int11[0] = AV87EscMRb ;
                           new app.psimulay(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_decimal16, GXv_int23, GXv_decimal9, GXv_int24, GXv_int22, GXv_int17, GXv_char20, GXv_int15, GXv_int13, GXv_char19, GXv_int12, GXv_decimal6, GXv_int11) ;
                           pens003.this.A396EmprCod = GXv_char25[0] ;
                           pens003.this.A770ProForPrd = GXv_char21[0] ;
                           pens003.this.AV98Cantidad0 = GXv_decimal16[0] ;
                           pens003.this.A490ForPrdUMe = GXv_int23[0] ;
                           pens003.this.AV56TotKgs = GXv_decimal9[0] ;
                           pens003.this.AV57Volumen = GXv_int24[0] ;
                           pens003.this.AV58ValCos = GXv_int22[0] ;
                           pens003.this.AV61NumLin = GXv_int17[0] ;
                           pens003.this.AV62Station = GXv_char20[0] ;
                           pens003.this.AV63UltNumLin = GXv_int15[0] ;
                           pens003.this.AV64FlagComp = GXv_int13[0] ;
                           pens003.this.AV50ProForCod = GXv_char19[0] ;
                           pens003.this.AV77ContLinea = GXv_int12[0] ;
                           pens003.this.AV86Incre = GXv_decimal6[0] ;
                           pens003.this.AV87EscMRb = GXv_int11[0] ;
                           System.out.println( httpContext.getMessage( "2Productos.Ret PSIMULAY", "") );
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      System.out.println( httpContext.getMessage( "End For Each Lprofo.PSIMULAY", "") );
   }

   public void S125( )
   {
      /* 'ESPECIALES' Routine */
      returnInSub = false ;
      /* Using cursor P01T66 */
      pr_default.execute(4, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion, Short.valueOf(AV51NumOrd)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A5562Lb_orden = P01T66_A5562Lb_orden[0] ;
         A5555Lb_opcion = P01T66_A5555Lb_opcion[0] ;
         A5532Lb_numero = P01T66_A5532Lb_numero[0] ;
         A396EmprCod = P01T66_A396EmprCod[0] ;
         A719PrdNum = P01T66_A719PrdNum[0] ;
         A5561LB_CantP = P01T66_A5561LB_CantP[0] ;
         A490ForPrdUMe = P01T66_A490ForPrdUMe[0] ;
         A5560Lb_LineaPr = P01T66_A5560Lb_LineaPr[0] ;
         AV52Producto = A719PrdNum ;
         AV55ForPrdCan = A5561LB_CantP ;
         AV53ForPrdUme = A490ForPrdUMe ;
         if ( ! (GXutil.strcmp("", AV52Producto)==0) )
         {
            System.out.println( httpContext.getMessage( "Productos#.Go PSIMULAY", "") );
            GXv_char25[0] = A396EmprCod ;
            GXv_char21[0] = AV52Producto ;
            GXv_decimal16[0] = AV55ForPrdCan ;
            GXv_int23[0] = AV53ForPrdUme ;
            GXv_decimal9[0] = AV56TotKgs ;
            GXv_int24[0] = AV57Volumen ;
            GXv_int22[0] = AV58ValCos ;
            GXv_int17[0] = AV61NumLin ;
            GXv_char20[0] = AV62Station ;
            GXv_int15[0] = AV63UltNumLin ;
            GXv_int13[0] = AV64FlagComp ;
            GXv_char19[0] = AV50ProForCod ;
            GXv_int12[0] = AV77ContLinea ;
            GXv_decimal6[0] = AV86Incre ;
            GXv_int11[0] = AV87EscMRb ;
            new app.psimulay(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_decimal16, GXv_int23, GXv_decimal9, GXv_int24, GXv_int22, GXv_int17, GXv_char20, GXv_int15, GXv_int13, GXv_char19, GXv_int12, GXv_decimal6, GXv_int11) ;
            pens003.this.A396EmprCod = GXv_char25[0] ;
            pens003.this.AV52Producto = GXv_char21[0] ;
            pens003.this.AV55ForPrdCan = GXv_decimal16[0] ;
            pens003.this.AV53ForPrdUme = GXv_int23[0] ;
            pens003.this.AV56TotKgs = GXv_decimal9[0] ;
            pens003.this.AV57Volumen = GXv_int24[0] ;
            pens003.this.AV58ValCos = GXv_int22[0] ;
            pens003.this.AV61NumLin = GXv_int17[0] ;
            pens003.this.AV62Station = GXv_char20[0] ;
            pens003.this.AV63UltNumLin = GXv_int15[0] ;
            pens003.this.AV64FlagComp = GXv_int13[0] ;
            pens003.this.AV50ProForCod = GXv_char19[0] ;
            pens003.this.AV77ContLinea = GXv_int12[0] ;
            pens003.this.AV86Incre = GXv_decimal6[0] ;
            pens003.this.AV87EscMRb = GXv_int11[0] ;
            System.out.println( httpContext.getMessage( "Productos#.Ret PSIMULAY", "") );
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S141( )
   {
      /* 'PRODU' Routine */
      returnInSub = false ;
      /* Using cursor P01T67 */
      pr_default.execute(5, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A5555Lb_opcion = P01T67_A5555Lb_opcion[0] ;
         A5532Lb_numero = P01T67_A5532Lb_numero[0] ;
         A396EmprCod = P01T67_A396EmprCod[0] ;
         A719PrdNum = P01T67_A719PrdNum[0] ;
         A5561LB_CantP = P01T67_A5561LB_CantP[0] ;
         A490ForPrdUMe = P01T67_A490ForPrdUMe[0] ;
         A5560Lb_LineaPr = P01T67_A5560Lb_LineaPr[0] ;
         AV52Producto = A719PrdNum ;
         AV55ForPrdCan = A5561LB_CantP ;
         AV53ForPrdUme = A490ForPrdUMe ;
         if ( ! (GXutil.strcmp("", AV52Producto)==0) )
         {
            System.out.println( httpContext.getMessage( "Sub Produ.Go PSIMULAY", "") );
            GXv_char25[0] = A396EmprCod ;
            GXv_char21[0] = AV52Producto ;
            GXv_decimal16[0] = AV55ForPrdCan ;
            GXv_int23[0] = AV53ForPrdUme ;
            GXv_decimal9[0] = AV56TotKgs ;
            GXv_int24[0] = AV57Volumen ;
            GXv_int22[0] = AV58ValCos ;
            GXv_int17[0] = AV61NumLin ;
            GXv_char20[0] = AV62Station ;
            GXv_int15[0] = AV63UltNumLin ;
            GXv_int13[0] = AV64FlagComp ;
            GXv_char19[0] = AV50ProForCod ;
            GXv_int12[0] = AV77ContLinea ;
            GXv_decimal6[0] = AV86Incre ;
            GXv_int11[0] = AV87EscMRb ;
            new app.psimulay(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_decimal16, GXv_int23, GXv_decimal9, GXv_int24, GXv_int22, GXv_int17, GXv_char20, GXv_int15, GXv_int13, GXv_char19, GXv_int12, GXv_decimal6, GXv_int11) ;
            pens003.this.A396EmprCod = GXv_char25[0] ;
            pens003.this.AV52Producto = GXv_char21[0] ;
            pens003.this.AV55ForPrdCan = GXv_decimal16[0] ;
            pens003.this.AV53ForPrdUme = GXv_int23[0] ;
            pens003.this.AV56TotKgs = GXv_decimal9[0] ;
            pens003.this.AV57Volumen = GXv_int24[0] ;
            pens003.this.AV58ValCos = GXv_int22[0] ;
            pens003.this.AV61NumLin = GXv_int17[0] ;
            pens003.this.AV62Station = GXv_char20[0] ;
            pens003.this.AV63UltNumLin = GXv_int15[0] ;
            pens003.this.AV64FlagComp = GXv_int13[0] ;
            pens003.this.AV50ProForCod = GXv_char19[0] ;
            pens003.this.AV77ContLinea = GXv_int12[0] ;
            pens003.this.AV86Incre = GXv_decimal6[0] ;
            pens003.this.AV87EscMRb = GXv_int11[0] ;
            System.out.println( httpContext.getMessage( "Sub Produ.Ret PSIMULAY", "") );
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S135( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P01T68 */
      pr_default.execute(6, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion, Byte.valueOf(AV60Ncar), AV65ProForPrd, Byte.valueOf(AV60Ncar)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A719PrdNum = P01T68_A719PrdNum[0] ;
         A5555Lb_opcion = P01T68_A5555Lb_opcion[0] ;
         A5532Lb_numero = P01T68_A5532Lb_numero[0] ;
         A396EmprCod = P01T68_A396EmprCod[0] ;
         A5558LB_CantC = P01T68_A5558LB_CantC[0] ;
         A490ForPrdUMe = P01T68_A490ForPrdUMe[0] ;
         A5557Lb_LineaC = P01T68_A5557Lb_LineaC[0] ;
         System.out.println( httpContext.getMessage( "Sub Colorantes.Go PSIMULAY", "") );
         GXv_char25[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_decimal16[0] = A5558LB_CantC ;
         GXv_int23[0] = A490ForPrdUMe ;
         GXv_decimal9[0] = AV56TotKgs ;
         GXv_int24[0] = AV57Volumen ;
         GXv_int22[0] = AV58ValCos ;
         GXv_int17[0] = AV61NumLin ;
         GXv_char20[0] = AV62Station ;
         GXv_int15[0] = AV63UltNumLin ;
         GXv_int13[0] = AV64FlagComp ;
         GXv_char19[0] = AV50ProForCod ;
         GXv_int12[0] = AV77ContLinea ;
         GXv_decimal6[0] = AV86Incre ;
         GXv_int11[0] = AV87EscMRb ;
         new app.psimulay(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_decimal16, GXv_int23, GXv_decimal9, GXv_int24, GXv_int22, GXv_int17, GXv_char20, GXv_int15, GXv_int13, GXv_char19, GXv_int12, GXv_decimal6, GXv_int11) ;
         pens003.this.A396EmprCod = GXv_char25[0] ;
         pens003.this.A719PrdNum = GXv_char21[0] ;
         pens003.this.A5558LB_CantC = GXv_decimal16[0] ;
         pens003.this.A490ForPrdUMe = GXv_int23[0] ;
         pens003.this.AV56TotKgs = GXv_decimal9[0] ;
         pens003.this.AV57Volumen = GXv_int24[0] ;
         pens003.this.AV58ValCos = GXv_int22[0] ;
         pens003.this.AV61NumLin = GXv_int17[0] ;
         pens003.this.AV62Station = GXv_char20[0] ;
         pens003.this.AV63UltNumLin = GXv_int15[0] ;
         pens003.this.AV64FlagComp = GXv_int13[0] ;
         pens003.this.AV50ProForCod = GXv_char19[0] ;
         pens003.this.AV77ContLinea = GXv_int12[0] ;
         pens003.this.AV86Incre = GXv_decimal6[0] ;
         pens003.this.AV87EscMRb = GXv_int11[0] ;
         System.out.println( httpContext.getMessage( "Sub Colorantes.Ret PSIMULAY", "") );
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S151( )
   {
      /* 'COLOR' Routine */
      returnInSub = false ;
      /* Using cursor P01T69 */
      pr_default.execute(7, new Object[] {AV78EmprCod, Integer.valueOf(AV90Lb_numero), AV89Lb_opcion});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A5555Lb_opcion = P01T69_A5555Lb_opcion[0] ;
         A5532Lb_numero = P01T69_A5532Lb_numero[0] ;
         A396EmprCod = P01T69_A396EmprCod[0] ;
         A719PrdNum = P01T69_A719PrdNum[0] ;
         A5558LB_CantC = P01T69_A5558LB_CantC[0] ;
         A490ForPrdUMe = P01T69_A490ForPrdUMe[0] ;
         A5557Lb_LineaC = P01T69_A5557Lb_LineaC[0] ;
         System.out.println( httpContext.getMessage( "Sub Color.Go PSIMULAY", "") );
         GXv_char25[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_decimal16[0] = A5558LB_CantC ;
         GXv_int23[0] = A490ForPrdUMe ;
         GXv_decimal9[0] = AV56TotKgs ;
         GXv_int24[0] = AV57Volumen ;
         GXv_int22[0] = AV58ValCos ;
         GXv_int17[0] = AV61NumLin ;
         GXv_char20[0] = AV62Station ;
         GXv_int15[0] = AV63UltNumLin ;
         GXv_int13[0] = AV64FlagComp ;
         GXv_char19[0] = AV50ProForCod ;
         GXv_int12[0] = AV77ContLinea ;
         GXv_decimal6[0] = AV86Incre ;
         GXv_int11[0] = AV87EscMRb ;
         new app.psimulay(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_decimal16, GXv_int23, GXv_decimal9, GXv_int24, GXv_int22, GXv_int17, GXv_char20, GXv_int15, GXv_int13, GXv_char19, GXv_int12, GXv_decimal6, GXv_int11) ;
         pens003.this.A396EmprCod = GXv_char25[0] ;
         pens003.this.A719PrdNum = GXv_char21[0] ;
         pens003.this.A5558LB_CantC = GXv_decimal16[0] ;
         pens003.this.A490ForPrdUMe = GXv_int23[0] ;
         pens003.this.AV56TotKgs = GXv_decimal9[0] ;
         pens003.this.AV57Volumen = GXv_int24[0] ;
         pens003.this.AV58ValCos = GXv_int22[0] ;
         pens003.this.AV61NumLin = GXv_int17[0] ;
         pens003.this.AV62Station = GXv_char20[0] ;
         pens003.this.AV63UltNumLin = GXv_int15[0] ;
         pens003.this.AV64FlagComp = GXv_int13[0] ;
         pens003.this.AV50ProForCod = GXv_char19[0] ;
         pens003.this.AV77ContLinea = GXv_int12[0] ;
         pens003.this.AV86Incre = GXv_decimal6[0] ;
         pens003.this.AV87EscMRb = GXv_int11[0] ;
         System.out.println( httpContext.getMessage( "Sub Color.Ret PSIMULAY", "") );
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens003.this.AV78EmprCod;
      this.aP1[0] = pens003.this.AV90Lb_numero;
      this.aP2[0] = pens003.this.AV89Lb_opcion;
      this.aP3[0] = pens003.this.AV56TotKgs;
      this.aP4[0] = pens003.this.AV57Volumen;
      this.aP5[0] = pens003.this.AV70MaqCod;
      this.aP6[0] = pens003.this.AV86Incre;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens003");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62Station = "" ;
      GXt_char10 = "" ;
      AV101EmprNom = "" ;
      AV100Usurcod = "" ;
      scmdbuf = "" ;
      P01T63_A5532Lb_numero = new int[1] ;
      P01T63_A396EmprCod = new String[] {""} ;
      P01T63_A626MatCod = new short[1] ;
      P01T63_n626MatCod = new boolean[] {false} ;
      P01T63_A583IntCod = new byte[1] ;
      P01T63_n583IntCod = new boolean[] {false} ;
      P01T63_A5553Lb_ForCod = new String[] {""} ;
      P01T63_A252CliCod = new int[1] ;
      P01T63_A5533Lb_ArtCod = new String[] {""} ;
      P01T63_A5536Lb_ColNom = new String[] {""} ;
      P01T63_A5537Lb_ColNum = new int[1] ;
      P01T63_A831TipColCod = new byte[1] ;
      P01T63_n831TipColCod = new boolean[] {false} ;
      P01T63_A5551Lb_lineaPq = new short[1] ;
      A396EmprCod = "" ;
      A5553Lb_ForCod = "" ;
      A5533Lb_ArtCod = "" ;
      A5536Lb_ColNom = "" ;
      AV50ProForCod = "" ;
      AV72ForSer = "" ;
      AV73ForColNom = "" ;
      AV99Inc_obs = "" ;
      AV106Pgmname = "" ;
      P01T64_A5532Lb_numero = new int[1] ;
      P01T64_A396EmprCod = new String[] {""} ;
      P01T64_A626MatCod = new short[1] ;
      P01T64_n626MatCod = new boolean[] {false} ;
      P01T64_A583IntCod = new byte[1] ;
      P01T64_n583IntCod = new boolean[] {false} ;
      P01T64_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      P01T65_A764ProForCod = new String[] {""} ;
      P01T65_A767ProForLin = new short[1] ;
      P01T65_A4706ProForRb = new short[1] ;
      P01T65_A770ProForPrd = new String[] {""} ;
      P01T65_A763ProForCla = new String[] {""} ;
      P01T65_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01T65_A490ForPrdUMe = new byte[1] ;
      P01T65_A765ProForDes = new String[] {""} ;
      P01T65_A5358ProForClv = new String[] {""} ;
      P01T65_A396EmprCod = new String[] {""} ;
      A764ProForCod = "" ;
      A770ProForPrd = "" ;
      A763ProForCla = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A765ProForDes = "" ;
      A5358ProForClv = "" ;
      AV52Producto = "" ;
      AV59Produc = "" ;
      AV66Cantidad = DecimalUtil.ZERO ;
      AV65ProForPrd = "" ;
      AV85CalVe = "" ;
      AV76PrdDesc = "" ;
      AV81Accion = "" ;
      GXv_char18 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      AV97Porc_p = DecimalUtil.ZERO ;
      AV84ProForDes = "" ;
      AV83LineaRec = "" ;
      AV98Cantidad0 = DecimalUtil.ZERO ;
      P01T66_A5562Lb_orden = new short[1] ;
      P01T66_A5555Lb_opcion = new String[] {""} ;
      P01T66_A5532Lb_numero = new int[1] ;
      P01T66_A396EmprCod = new String[] {""} ;
      P01T66_A719PrdNum = new String[] {""} ;
      P01T66_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01T66_A490ForPrdUMe = new byte[1] ;
      P01T66_A5560Lb_LineaPr = new short[1] ;
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      AV55ForPrdCan = DecimalUtil.ZERO ;
      P01T67_A5555Lb_opcion = new String[] {""} ;
      P01T67_A5532Lb_numero = new int[1] ;
      P01T67_A396EmprCod = new String[] {""} ;
      P01T67_A719PrdNum = new String[] {""} ;
      P01T67_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01T67_A490ForPrdUMe = new byte[1] ;
      P01T67_A5560Lb_LineaPr = new short[1] ;
      P01T68_A719PrdNum = new String[] {""} ;
      P01T68_A5555Lb_opcion = new String[] {""} ;
      P01T68_A5532Lb_numero = new int[1] ;
      P01T68_A396EmprCod = new String[] {""} ;
      P01T68_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01T68_A490ForPrdUMe = new byte[1] ;
      P01T68_A5557Lb_LineaC = new short[1] ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      P01T69_A5555Lb_opcion = new String[] {""} ;
      P01T69_A5532Lb_numero = new int[1] ;
      P01T69_A396EmprCod = new String[] {""} ;
      P01T69_A719PrdNum = new String[] {""} ;
      P01T69_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01T69_A490ForPrdUMe = new byte[1] ;
      P01T69_A5557Lb_LineaC = new short[1] ;
      GXv_char25 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int23 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int24 = new int[1] ;
      GXv_int22 = new int[1] ;
      GXv_int17 = new short[1] ;
      GXv_char20 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char19 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens003__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P01T63_A5532Lb_numero, P01T63_A396EmprCod, P01T63_A626MatCod, P01T63_n626MatCod, P01T63_A583IntCod, P01T63_n583IntCod, P01T63_A5553Lb_ForCod, P01T63_A252CliCod, P01T63_A5533Lb_ArtCod, P01T63_A5536Lb_ColNom,
            P01T63_A5537Lb_ColNum, P01T63_A831TipColCod, P01T63_n831TipColCod, P01T63_A5551Lb_lineaPq
            }
            , new Object[] {
            P01T64_A5532Lb_numero, P01T64_A396EmprCod, P01T64_A626MatCod, P01T64_n626MatCod, P01T64_A583IntCod, P01T64_n583IntCod, P01T64_A5547Lb_Rb
            }
            , new Object[] {
            P01T65_A764ProForCod, P01T65_A767ProForLin, P01T65_A4706ProForRb, P01T65_A770ProForPrd, P01T65_A763ProForCla, P01T65_A762ProForCan, P01T65_A490ForPrdUMe, P01T65_A765ProForDes, P01T65_A5358ProForClv, P01T65_A396EmprCod
            }
            , new Object[] {
            P01T66_A5562Lb_orden, P01T66_A5555Lb_opcion, P01T66_A5532Lb_numero, P01T66_A396EmprCod, P01T66_A719PrdNum, P01T66_A5561LB_CantP, P01T66_A490ForPrdUMe, P01T66_A5560Lb_LineaPr
            }
            , new Object[] {
            P01T67_A5555Lb_opcion, P01T67_A5532Lb_numero, P01T67_A396EmprCod, P01T67_A719PrdNum, P01T67_A5561LB_CantP, P01T67_A490ForPrdUMe, P01T67_A5560Lb_LineaPr
            }
            , new Object[] {
            P01T68_A719PrdNum, P01T68_A5555Lb_opcion, P01T68_A5532Lb_numero, P01T68_A396EmprCod, P01T68_A5558LB_CantC, P01T68_A490ForPrdUMe, P01T68_A5557Lb_LineaC
            }
            , new Object[] {
            P01T69_A5555Lb_opcion, P01T69_A5532Lb_numero, P01T69_A396EmprCod, P01T69_A719PrdNum, P01T69_A5558LB_CantC, P01T69_A490ForPrdUMe, P01T69_A5557Lb_LineaC
            }
         }
      );
      AV106Pgmname = "GestionLaboratorio.PENS003" ;
      /* GeneXus formulas. */
      AV106Pgmname = "GestionLaboratorio.PENS003" ;
      Gx_err = (short)(0) ;
   }

   private byte AV96Pens003x ;
   private byte AV92NoProf ;
   private byte GXt_int1 ;
   private byte AV64FlagComp ;
   private byte AV94FlagProc ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV69IntCod ;
   private byte AV75TipColCod ;
   private byte A490ForPrdUMe ;
   private byte AV53ForPrdUme ;
   private byte AV60Ncar ;
   private byte AV82PrdVal ;
   private byte GXv_int2[] ;
   private byte GXv_int23[] ;
   private byte GXv_int13[] ;
   private short AV79LinRec ;
   private short A626MatCod ;
   private short A5551Lb_lineaPq ;
   private short AV68MatCod ;
   private short AV87EscMRb ;
   private short A767ProForLin ;
   private short A4706ProForRb ;
   private short AV51NumOrd ;
   private short AV61NumLin ;
   private short AV63UltNumLin ;
   private short AV77ContLinea ;
   private short A5562Lb_orden ;
   private short A5560Lb_LineaPr ;
   private short A5557Lb_LineaC ;
   private short GXv_int17[] ;
   private short GXv_int15[] ;
   private short GXv_int12[] ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV90Lb_numero ;
   private int AV57Volumen ;
   private int AV58ValCos ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV71CliCod ;
   private int AV74ForColNum ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private int GXv_int24[] ;
   private int GXv_int22[] ;
   private java.math.BigDecimal AV56TotKgs ;
   private java.math.BigDecimal AV86Incre ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV66Cantidad ;
   private java.math.BigDecimal AV97Porc_p ;
   private java.math.BigDecimal AV98Cantidad0 ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal AV55ForPrdCan ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String AV78EmprCod ;
   private String AV89Lb_opcion ;
   private String AV70MaqCod ;
   private String AV62Station ;
   private String GXt_char10 ;
   private String AV101EmprNom ;
   private String AV100Usurcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5553Lb_ForCod ;
   private String A5533Lb_ArtCod ;
   private String A5536Lb_ColNom ;
   private String AV50ProForCod ;
   private String AV72ForSer ;
   private String AV73ForColNom ;
   private String AV106Pgmname ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private String A763ProForCla ;
   private String A765ProForDes ;
   private String A5358ProForClv ;
   private String AV52Producto ;
   private String AV59Produc ;
   private String AV65ProForPrd ;
   private String AV85CalVe ;
   private String AV76PrdDesc ;
   private String AV81Accion ;
   private String GXv_char18[] ;
   private String GXv_char14[] ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String AV84ProForDes ;
   private String AV83LineaRec ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String GXv_char25[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private boolean returnInSub ;
   private boolean n626MatCod ;
   private boolean n583IntCod ;
   private boolean n831TipColCod ;
   private String AV99Inc_obs ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P01T63_A5532Lb_numero ;
   private String[] P01T63_A396EmprCod ;
   private short[] P01T63_A626MatCod ;
   private boolean[] P01T63_n626MatCod ;
   private byte[] P01T63_A583IntCod ;
   private boolean[] P01T63_n583IntCod ;
   private String[] P01T63_A5553Lb_ForCod ;
   private int[] P01T63_A252CliCod ;
   private String[] P01T63_A5533Lb_ArtCod ;
   private String[] P01T63_A5536Lb_ColNom ;
   private int[] P01T63_A5537Lb_ColNum ;
   private byte[] P01T63_A831TipColCod ;
   private boolean[] P01T63_n831TipColCod ;
   private short[] P01T63_A5551Lb_lineaPq ;
   private int[] P01T64_A5532Lb_numero ;
   private String[] P01T64_A396EmprCod ;
   private short[] P01T64_A626MatCod ;
   private boolean[] P01T64_n626MatCod ;
   private byte[] P01T64_A583IntCod ;
   private boolean[] P01T64_n583IntCod ;
   private java.math.BigDecimal[] P01T64_A5547Lb_Rb ;
   private String[] P01T65_A764ProForCod ;
   private short[] P01T65_A767ProForLin ;
   private short[] P01T65_A4706ProForRb ;
   private String[] P01T65_A770ProForPrd ;
   private String[] P01T65_A763ProForCla ;
   private java.math.BigDecimal[] P01T65_A762ProForCan ;
   private byte[] P01T65_A490ForPrdUMe ;
   private String[] P01T65_A765ProForDes ;
   private String[] P01T65_A5358ProForClv ;
   private String[] P01T65_A396EmprCod ;
   private short[] P01T66_A5562Lb_orden ;
   private String[] P01T66_A5555Lb_opcion ;
   private int[] P01T66_A5532Lb_numero ;
   private String[] P01T66_A396EmprCod ;
   private String[] P01T66_A719PrdNum ;
   private java.math.BigDecimal[] P01T66_A5561LB_CantP ;
   private byte[] P01T66_A490ForPrdUMe ;
   private short[] P01T66_A5560Lb_LineaPr ;
   private String[] P01T67_A5555Lb_opcion ;
   private int[] P01T67_A5532Lb_numero ;
   private String[] P01T67_A396EmprCod ;
   private String[] P01T67_A719PrdNum ;
   private java.math.BigDecimal[] P01T67_A5561LB_CantP ;
   private byte[] P01T67_A490ForPrdUMe ;
   private short[] P01T67_A5560Lb_LineaPr ;
   private String[] P01T68_A719PrdNum ;
   private String[] P01T68_A5555Lb_opcion ;
   private int[] P01T68_A5532Lb_numero ;
   private String[] P01T68_A396EmprCod ;
   private java.math.BigDecimal[] P01T68_A5558LB_CantC ;
   private byte[] P01T68_A490ForPrdUMe ;
   private short[] P01T68_A5557Lb_LineaC ;
   private String[] P01T69_A5555Lb_opcion ;
   private int[] P01T69_A5532Lb_numero ;
   private String[] P01T69_A396EmprCod ;
   private String[] P01T69_A719PrdNum ;
   private java.math.BigDecimal[] P01T69_A5558LB_CantC ;
   private byte[] P01T69_A490ForPrdUMe ;
   private short[] P01T69_A5557Lb_LineaC ;
}

final  class pens003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01T62", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? and Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
         ,new ForEachCursor("P01T63", "SELECT T1.Lb_numero, T1.EmprCod, T2.MatCod, T2.IntCod, T1.Lb_ForCod, T2.CliCod, T2.Lb_ArtCod, T2.Lb_ColNom, T2.Lb_ColNum, T2.TipColCod, T1.Lb_lineaPq FROM (TXPENS000 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01T64", "SELECT Lb_numero, EmprCod, MatCod, IntCod, Lb_Rb FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01T65", "SELECT T1.ProForCod, T1.ProForLin, T2.ProForRb, T1.ProForPrd, T1.ProForCla, T1.ProForCan, T1.ForPrdUMe, T1.ProForDes, T1.ProForClv, T1.EmprCod FROM (TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01T66", "SELECT Lb_orden, Lb_opcion, Lb_numero, EmprCod, PrdNum, LB_CantP, ForPrdUMe, Lb_LineaPr FROM TXPENS004 WHERE (EmprCod = ? and Lb_numero = ? and Lb_opcion = ?) AND (Lb_orden = ?) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01T67", "SELECT Lb_opcion, Lb_numero, EmprCod, PrdNum, LB_CantP, ForPrdUMe, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01T68", "SELECT PrdNum, Lb_opcion, Lb_numero, EmprCod, LB_CantC, ForPrdUMe, Lb_LineaC FROM TXPENS003 WHERE (EmprCod = ? and Lb_numero = ? and Lb_opcion = ?) AND (SUBSTR(PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01T69", "SELECT Lb_opcion, Lb_numero, EmprCod, PrdNum, LB_CantC, ForPrdUMe, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

