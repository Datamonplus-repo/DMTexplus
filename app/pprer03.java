package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprer03 extends GXProcedure
{
   public pprer03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprer03.class ), "" );
   }

   public pprer03( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pprer03.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pprer03.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprer03.this.A4744RecPreCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV88FlagExiPro = (byte)(0) ;
      GXv_int1[0] = AV88FlagExiPro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXIPRO", ""), GXv_int1) ;
      pprer03.this.AV88FlagExiPro = GXv_int1[0] ;
      GXv_int1[0] = AV51ExiCon ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "999999", GXv_int1) ;
      pprer03.this.AV51ExiCon = GXv_int1[0] ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int4[0] = AV20ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pprer03.this.A396EmprCod = GXv_char2[0] ;
      pprer03.this.AV20ValCos = GXv_int4[0] ;
      GXv_int1[0] = AV38Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "037001", GXv_int1) ;
      pprer03.this.AV38Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV39Flag2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int1) ;
      pprer03.this.AV39Flag2 = GXv_int1[0] ;
      AV85FlagRenNro = (byte)(0) ;
      GXv_int1[0] = AV85FlagRenNro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RENNRO", ""), GXv_int1) ;
      pprer03.this.AV85FlagRenNro = GXv_int1[0] ;
      AV87FlagCen = (byte)(0) ;
      GXv_int1[0] = AV87FlagCen ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int1) ;
      pprer03.this.AV87FlagCen = GXv_int1[0] ;
      AV54FlagComp = (byte)(0) ;
      GXt_char5 = AV47msg0 ;
      GXv_char3[0] = GXt_char5 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG251_", ""), (byte)(99), GXv_char3) ;
      pprer03.this.GXt_char5 = GXv_char3[0] ;
      AV47msg0 = GXt_char5 ;
      AV19TotKil = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01CA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4744RecPreCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4747RecPreVol = P01CA2_A4747RecPreVol[0] ;
         n4747RecPreVol = P01CA2_n4747RecPreVol[0] ;
         AV22LinRec = (short)(0) ;
         AV19TotKil = DecimalUtil.doubleToDec(0) ;
         AV24Flag = (byte)(0) ;
         AV92RecPreCod = A4744RecPreCod ;
         AV17BarVol = A4747RecPreVol ;
         AV59EmprCod = A396EmprCod ;
         AV62RecLinMaq = (short)(0) ;
         AV45Mensaje = GXutil.concat( httpContext.getMessage( "Criando Receita Preparaçao...", ""), GXutil.str( A4744RecPreCod, 8, 0), " ") ;
         System.out.println( AV45Mensaje );
         AV26FlagPro = (byte)(0) ;
         AV49Linea = (byte)(0) ;
         /* Using cursor P01CA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4744RecPreCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P01CA3_A764ProForCod[0] ;
            n764ProForCod = P01CA3_n764ProForCod[0] ;
            A4762RecPreLin = P01CA3_A4762RecPreLin[0] ;
            AV26FlagPro = (byte)(1) ;
            AV54FlagComp = (byte)(0) ;
            AV67BarLinMaq = (short)(0) ;
            AV81RecLinPro = (byte)(A4762RecPreLin) ;
            AV49Linea = (byte)(A4762RecPreLin) ;
            AV37ProForCod = A764ProForCod ;
            /* Execute user subroutine: 'PROCESOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESOS' Routine */
      returnInSub = false ;
      AV48FlagTemp = (byte)(0) ;
      /* Using cursor P01CA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV37ProForCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A764ProForCod = P01CA4_A764ProForCod[0] ;
         n764ProForCod = P01CA4_n764ProForCod[0] ;
         A1645ProForNro = P01CA4_A1645ProForNro[0] ;
         A770ProForPrd = P01CA4_A770ProForPrd[0] ;
         A765ProForDes = P01CA4_A765ProForDes[0] ;
         A762ProForCan = P01CA4_A762ProForCan[0] ;
         A5358ProForClv = P01CA4_A5358ProForClv[0] ;
         A490ForPrdUMe = P01CA4_A490ForPrdUMe[0] ;
         A767ProForLin = P01CA4_A767ProForLin[0] ;
         AV63RecForNro = A1645ProForNro ;
         AV73ProForDes = "" ;
         if ( (GXutil.strcmp("", A770ProForPrd)==0) )
         {
            AV25PrdDesc = A765ProForDes ;
            AV27Producto = "" ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV92RecPreCod ;
            GXv_int6[0] = AV22LinRec ;
            GXv_char2[0] = AV25PrdDesc ;
            GXv_char7[0] = AV27Producto ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_int1[0] = AV49Linea ;
            GXv_int9[0] = AV62RecLinMaq ;
            GXv_int10[0] = AV46RecLinIni ;
            new app.pprer02(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int6, GXv_char2, GXv_char7, GXv_decimal8, GXv_int1, GXv_int9, GXv_int10) ;
            pprer03.this.A396EmprCod = GXv_char3[0] ;
            pprer03.this.AV92RecPreCod = GXv_int4[0] ;
            pprer03.this.AV22LinRec = GXv_int6[0] ;
            pprer03.this.AV25PrdDesc = GXv_char2[0] ;
            pprer03.this.AV27Producto = GXv_char7[0] ;
            pprer03.this.AV49Linea = GXv_int1[0] ;
            pprer03.this.AV62RecLinMaq = GXv_int9[0] ;
            pprer03.this.AV46RecLinIni = GXv_int10[0] ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
            {
               AV29NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
               AV27Producto = "" ;
               AV50ForPrdUme = (byte)(0) ;
               /* Execute user subroutine: 'ESPECIALES' */
               S124 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  if (true) return;
               }
            }
            else
            {
               AV44Produc = GXutil.substring( A770ProForPrd, 3, 1) ;
               if ( GXutil.strcmp(AV44Produc, " ") == 0 )
               {
                  if ( A762ProForCan.doubleValue() == 0 )
                  {
                     AV31Cantidad = DecimalUtil.doubleToDec(1) ;
                  }
                  else
                  {
                     AV31Cantidad = A762ProForCan ;
                  }
                  AV44Produc = GXutil.substring( A770ProForPrd, 2, 1) ;
                  if ( GXutil.strcmp(AV44Produc, "") == 0 )
                  {
                     AV30Ncar = (byte)(1) ;
                  }
                  else
                  {
                     AV30Ncar = (byte)(2) ;
                  }
                  AV42ProForPrd = A770ProForPrd ;
                  /* Execute user subroutine: 'COLORANTES' */
                  S134 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               else
               {
                  if ( (GXutil.strcmp("", A5358ProForClv)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                     {
                        AV27Producto = A770ProForPrd ;
                        AV31Cantidad = A762ProForCan ;
                        AV50ForPrdUme = A490ForPrdUMe ;
                        AV54FlagComp = (byte)(0) ;
                        AV73ProForDes = A765ProForDes ;
                        GXv_char7[0] = A396EmprCod ;
                        GXv_char3[0] = A770ProForPrd ;
                        GXv_decimal8[0] = A762ProForCan ;
                        GXv_int1[0] = A490ForPrdUMe ;
                        GXv_decimal11[0] = AV19TotKil ;
                        GXv_int4[0] = AV17BarVol ;
                        GXv_int12[0] = AV20ValCos ;
                        GXv_int10[0] = AV22LinRec ;
                        GXv_int13[0] = AV92RecPreCod ;
                        GXv_int14[0] = AV38Flag1 ;
                        GXv_int15[0] = AV39Flag2 ;
                        GXv_int9[0] = AV46RecLinIni ;
                        GXv_int16[0] = AV49Linea ;
                        GXv_int17[0] = AV51ExiCon ;
                        GXv_int18[0] = AV54FlagComp ;
                        GXv_int19[0] = AV63RecForNro ;
                        GXv_int6[0] = AV62RecLinMaq ;
                        GXv_int20[0] = AV71TanqueN ;
                        GXv_char2[0] = AV73ProForDes ;
                        new app.pprer04(remoteHandle, context).execute( GXv_char7, GXv_char3, GXv_decimal8, GXv_int1, GXv_decimal11, GXv_int4, GXv_int12, GXv_int10, GXv_int13, GXv_int14, GXv_int15, GXv_int9, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int6, GXv_int20, GXv_char2) ;
                        pprer03.this.A396EmprCod = GXv_char7[0] ;
                        pprer03.this.A770ProForPrd = GXv_char3[0] ;
                        pprer03.this.A762ProForCan = GXv_decimal8[0] ;
                        pprer03.this.A490ForPrdUMe = GXv_int1[0] ;
                        pprer03.this.AV19TotKil = GXv_decimal11[0] ;
                        pprer03.this.AV17BarVol = GXv_int4[0] ;
                        pprer03.this.AV20ValCos = GXv_int12[0] ;
                        pprer03.this.AV22LinRec = GXv_int10[0] ;
                        pprer03.this.AV92RecPreCod = GXv_int13[0] ;
                        pprer03.this.AV38Flag1 = GXv_int14[0] ;
                        pprer03.this.AV39Flag2 = GXv_int15[0] ;
                        pprer03.this.AV46RecLinIni = GXv_int9[0] ;
                        pprer03.this.AV49Linea = GXv_int16[0] ;
                        pprer03.this.AV51ExiCon = GXv_int17[0] ;
                        pprer03.this.AV54FlagComp = GXv_int18[0] ;
                        pprer03.this.AV63RecForNro = GXv_int19[0] ;
                        pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
                        pprer03.this.AV71TanqueN = GXv_int20[0] ;
                        pprer03.this.AV73ProForDes = GXv_char2[0] ;
                        if ( AV88FlagExiPro == 0 )
                        {
                           /* Execute user subroutine: 'COMPUESTOS' */
                           S144 ();
                           if ( returnInSub )
                           {
                              pr_default.close(2);
                              returnInSub = true;
                              if (true) return;
                           }
                        }
                        AV54FlagComp = (byte)(0) ;
                     }
                     else
                     {
                        AV73ProForDes = A765ProForDes ;
                        GXv_char7[0] = A396EmprCod ;
                        GXv_char3[0] = A770ProForPrd ;
                        GXv_decimal11[0] = A762ProForCan ;
                        GXv_int20[0] = A490ForPrdUMe ;
                        GXv_decimal8[0] = AV19TotKil ;
                        GXv_int13[0] = AV17BarVol ;
                        GXv_int12[0] = AV20ValCos ;
                        GXv_int10[0] = AV22LinRec ;
                        GXv_int4[0] = AV92RecPreCod ;
                        GXv_int19[0] = AV38Flag1 ;
                        GXv_int18[0] = AV39Flag2 ;
                        GXv_int9[0] = AV46RecLinIni ;
                        GXv_int17[0] = AV49Linea ;
                        GXv_int16[0] = AV51ExiCon ;
                        GXv_int15[0] = AV54FlagComp ;
                        GXv_int14[0] = AV63RecForNro ;
                        GXv_int6[0] = AV62RecLinMaq ;
                        GXv_int1[0] = AV71TanqueN ;
                        GXv_char2[0] = AV73ProForDes ;
                        new app.pprer04(remoteHandle, context).execute( GXv_char7, GXv_char3, GXv_decimal11, GXv_int20, GXv_decimal8, GXv_int13, GXv_int12, GXv_int10, GXv_int4, GXv_int19, GXv_int18, GXv_int9, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int6, GXv_int1, GXv_char2) ;
                        pprer03.this.A396EmprCod = GXv_char7[0] ;
                        pprer03.this.A770ProForPrd = GXv_char3[0] ;
                        pprer03.this.A762ProForCan = GXv_decimal11[0] ;
                        pprer03.this.A490ForPrdUMe = GXv_int20[0] ;
                        pprer03.this.AV19TotKil = GXv_decimal8[0] ;
                        pprer03.this.AV17BarVol = GXv_int13[0] ;
                        pprer03.this.AV20ValCos = GXv_int12[0] ;
                        pprer03.this.AV22LinRec = GXv_int10[0] ;
                        pprer03.this.AV92RecPreCod = GXv_int4[0] ;
                        pprer03.this.AV38Flag1 = GXv_int19[0] ;
                        pprer03.this.AV39Flag2 = GXv_int18[0] ;
                        pprer03.this.AV46RecLinIni = GXv_int9[0] ;
                        pprer03.this.AV49Linea = GXv_int17[0] ;
                        pprer03.this.AV51ExiCon = GXv_int16[0] ;
                        pprer03.this.AV54FlagComp = GXv_int15[0] ;
                        pprer03.this.AV63RecForNro = GXv_int14[0] ;
                        pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
                        pprer03.this.AV71TanqueN = GXv_int1[0] ;
                        pprer03.this.AV73ProForDes = GXv_char2[0] ;
                     }
                  }
                  else
                  {
                     AV82Calve = A5358ProForClv ;
                     AV32PrdVal = (byte)(0) ;
                     AV25PrdDesc = A765ProForDes ;
                     AV27Producto = A770ProForPrd ;
                     GXv_char7[0] = A396EmprCod ;
                     GXv_char3[0] = AV27Producto ;
                     GXv_char2[0] = A5358ProForClv ;
                     GXv_int20[0] = AV32PrdVal ;
                     GXv_int13[0] = AV34BarCod ;
                     GXv_int19[0] = AV35BarCodReo ;
                     GXv_char21[0] = AV36BarCodPar ;
                     GXv_decimal11[0] = AV19TotKil ;
                     GXv_char22[0] = AV25PrdDesc ;
                     GXv_char23[0] = AV33Accion ;
                     GXv_int10[0] = AV67BarLinMaq ;
                     GXv_int18[0] = (byte)(0) ;
                     GXv_char24[0] = "" ;
                     GXv_char25[0] = "" ;
                     new app.pclaespl(remoteHandle, context).execute( GXv_char7, GXv_char3, GXv_char2, GXv_int20, GXv_int13, GXv_int19, GXv_char21, GXv_decimal11, GXv_char22, GXv_char23, GXv_int10, GXv_int18, GXv_char24, GXv_char25) ;
                     pprer03.this.A396EmprCod = GXv_char7[0] ;
                     pprer03.this.AV27Producto = GXv_char3[0] ;
                     pprer03.this.A5358ProForClv = GXv_char2[0] ;
                     pprer03.this.AV32PrdVal = GXv_int20[0] ;
                     pprer03.this.AV34BarCod = GXv_int13[0] ;
                     pprer03.this.AV35BarCodReo = GXv_int19[0] ;
                     pprer03.this.AV36BarCodPar = GXv_char21[0] ;
                     pprer03.this.AV19TotKil = GXv_decimal11[0] ;
                     pprer03.this.AV25PrdDesc = GXv_char22[0] ;
                     pprer03.this.AV33Accion = GXv_char23[0] ;
                     pprer03.this.AV67BarLinMaq = GXv_int10[0] ;
                     if ( AV32PrdVal == 1 )
                     {
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           GXv_char25[0] = A396EmprCod ;
                           GXv_int13[0] = AV34BarCod ;
                           GXv_int20[0] = AV35BarCodReo ;
                           GXv_char24[0] = AV36BarCodPar ;
                           GXv_int10[0] = AV22LinRec ;
                           GXv_int9[0] = AV46RecLinIni ;
                           GXv_int6[0] = AV62RecLinMaq ;
                           GXv_int19[0] = AV81RecLinPro ;
                           new app.pelirec(remoteHandle, context).execute( GXv_char25, GXv_int13, GXv_int20, GXv_char24, GXv_int10, GXv_int9, GXv_int6, GXv_int19) ;
                           pprer03.this.A396EmprCod = GXv_char25[0] ;
                           pprer03.this.AV34BarCod = GXv_int13[0] ;
                           pprer03.this.AV35BarCodReo = GXv_int20[0] ;
                           pprer03.this.AV36BarCodPar = GXv_char24[0] ;
                           pprer03.this.AV22LinRec = GXv_int10[0] ;
                           pprer03.this.AV46RecLinIni = GXv_int9[0] ;
                           pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
                           pprer03.this.AV81RecLinPro = GXv_int19[0] ;
                        }
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                           {
                              AV27Producto = A770ProForPrd ;
                              AV31Cantidad = A762ProForCan ;
                              AV50ForPrdUme = A490ForPrdUMe ;
                              AV54FlagComp = (byte)(0) ;
                              AV73ProForDes = A765ProForDes ;
                              GXv_char25[0] = A396EmprCod ;
                              GXv_char24[0] = A770ProForPrd ;
                              GXv_decimal11[0] = A762ProForCan ;
                              GXv_int20[0] = A490ForPrdUMe ;
                              GXv_decimal8[0] = AV19TotKil ;
                              GXv_int13[0] = AV17BarVol ;
                              GXv_int12[0] = AV20ValCos ;
                              GXv_int10[0] = AV22LinRec ;
                              GXv_int4[0] = AV92RecPreCod ;
                              GXv_int19[0] = AV38Flag1 ;
                              GXv_int18[0] = AV39Flag2 ;
                              GXv_int9[0] = AV46RecLinIni ;
                              GXv_int17[0] = AV49Linea ;
                              GXv_int16[0] = AV51ExiCon ;
                              GXv_int15[0] = AV54FlagComp ;
                              GXv_int14[0] = AV63RecForNro ;
                              GXv_int6[0] = AV62RecLinMaq ;
                              GXv_int1[0] = AV71TanqueN ;
                              GXv_char23[0] = AV73ProForDes ;
                              new app.pprer04(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal11, GXv_int20, GXv_decimal8, GXv_int13, GXv_int12, GXv_int10, GXv_int4, GXv_int19, GXv_int18, GXv_int9, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int6, GXv_int1, GXv_char23) ;
                              pprer03.this.A396EmprCod = GXv_char25[0] ;
                              pprer03.this.A770ProForPrd = GXv_char24[0] ;
                              pprer03.this.A762ProForCan = GXv_decimal11[0] ;
                              pprer03.this.A490ForPrdUMe = GXv_int20[0] ;
                              pprer03.this.AV19TotKil = GXv_decimal8[0] ;
                              pprer03.this.AV17BarVol = GXv_int13[0] ;
                              pprer03.this.AV20ValCos = GXv_int12[0] ;
                              pprer03.this.AV22LinRec = GXv_int10[0] ;
                              pprer03.this.AV92RecPreCod = GXv_int4[0] ;
                              pprer03.this.AV38Flag1 = GXv_int19[0] ;
                              pprer03.this.AV39Flag2 = GXv_int18[0] ;
                              pprer03.this.AV46RecLinIni = GXv_int9[0] ;
                              pprer03.this.AV49Linea = GXv_int17[0] ;
                              pprer03.this.AV51ExiCon = GXv_int16[0] ;
                              pprer03.this.AV54FlagComp = GXv_int15[0] ;
                              pprer03.this.AV63RecForNro = GXv_int14[0] ;
                              pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
                              pprer03.this.AV71TanqueN = GXv_int1[0] ;
                              pprer03.this.AV73ProForDes = GXv_char23[0] ;
                              if ( AV88FlagExiPro == 0 )
                              {
                                 /* Execute user subroutine: 'COMPUESTOS' */
                                 S144 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(2);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                              }
                              AV54FlagComp = (byte)(0) ;
                           }
                           else
                           {
                              AV73ProForDes = A765ProForDes ;
                              AV27Producto = A770ProForPrd ;
                              AV83LineaRec = GXutil.str( AV22LinRec, 4, 0) ;
                              GXv_char25[0] = A396EmprCod ;
                              GXv_char24[0] = A770ProForPrd ;
                              GXv_decimal11[0] = A762ProForCan ;
                              GXv_int20[0] = A490ForPrdUMe ;
                              GXv_decimal8[0] = AV19TotKil ;
                              GXv_int13[0] = AV17BarVol ;
                              GXv_int12[0] = AV20ValCos ;
                              GXv_int10[0] = AV22LinRec ;
                              GXv_int4[0] = AV92RecPreCod ;
                              GXv_int19[0] = AV38Flag1 ;
                              GXv_int18[0] = AV39Flag2 ;
                              GXv_int9[0] = AV46RecLinIni ;
                              GXv_int17[0] = AV49Linea ;
                              GXv_int16[0] = AV51ExiCon ;
                              GXv_int15[0] = AV54FlagComp ;
                              GXv_int14[0] = AV63RecForNro ;
                              GXv_int6[0] = AV62RecLinMaq ;
                              GXv_int1[0] = AV71TanqueN ;
                              GXv_char23[0] = AV73ProForDes ;
                              new app.pprer04(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal11, GXv_int20, GXv_decimal8, GXv_int13, GXv_int12, GXv_int10, GXv_int4, GXv_int19, GXv_int18, GXv_int9, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int6, GXv_int1, GXv_char23) ;
                              pprer03.this.A396EmprCod = GXv_char25[0] ;
                              pprer03.this.A770ProForPrd = GXv_char24[0] ;
                              pprer03.this.A762ProForCan = GXv_decimal11[0] ;
                              pprer03.this.A490ForPrdUMe = GXv_int20[0] ;
                              pprer03.this.AV19TotKil = GXv_decimal8[0] ;
                              pprer03.this.AV17BarVol = GXv_int13[0] ;
                              pprer03.this.AV20ValCos = GXv_int12[0] ;
                              pprer03.this.AV22LinRec = GXv_int10[0] ;
                              pprer03.this.AV92RecPreCod = GXv_int4[0] ;
                              pprer03.this.AV38Flag1 = GXv_int19[0] ;
                              pprer03.this.AV39Flag2 = GXv_int18[0] ;
                              pprer03.this.AV46RecLinIni = GXv_int9[0] ;
                              pprer03.this.AV49Linea = GXv_int17[0] ;
                              pprer03.this.AV51ExiCon = GXv_int16[0] ;
                              pprer03.this.AV54FlagComp = GXv_int15[0] ;
                              pprer03.this.AV63RecForNro = GXv_int14[0] ;
                              pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
                              pprer03.this.AV71TanqueN = GXv_int1[0] ;
                              pprer03.this.AV73ProForDes = GXv_char23[0] ;
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S134( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P01CA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV28NumColFor), Byte.valueOf(AV30Ncar), AV42ProForPrd, Byte.valueOf(AV30Ncar)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P01CA5_A719PrdNum[0] ;
         A486ForNumCol = P01CA5_A486ForNumCol[0] ;
         A481ForCan = P01CA5_A481ForCan[0] ;
         A490ForPrdUMe = P01CA5_A490ForPrdUMe[0] ;
         A309ColLin = P01CA5_A309ColLin[0] ;
         GXv_char25[0] = A396EmprCod ;
         GXv_char24[0] = A719PrdNum ;
         GXv_decimal11[0] = A481ForCan ;
         GXv_int20[0] = A490ForPrdUMe ;
         GXv_decimal8[0] = AV19TotKil ;
         GXv_int13[0] = AV17BarVol ;
         GXv_int12[0] = AV20ValCos ;
         GXv_int10[0] = AV22LinRec ;
         GXv_int4[0] = AV92RecPreCod ;
         GXv_int19[0] = AV38Flag1 ;
         GXv_int18[0] = AV39Flag2 ;
         GXv_int9[0] = AV46RecLinIni ;
         GXv_int17[0] = AV49Linea ;
         GXv_int16[0] = AV51ExiCon ;
         GXv_int15[0] = AV54FlagComp ;
         GXv_int14[0] = AV63RecForNro ;
         GXv_int6[0] = AV62RecLinMaq ;
         GXv_int1[0] = AV71TanqueN ;
         GXv_char23[0] = AV73ProForDes ;
         new app.pprer04(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal11, GXv_int20, GXv_decimal8, GXv_int13, GXv_int12, GXv_int10, GXv_int4, GXv_int19, GXv_int18, GXv_int9, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int6, GXv_int1, GXv_char23) ;
         pprer03.this.A396EmprCod = GXv_char25[0] ;
         pprer03.this.A719PrdNum = GXv_char24[0] ;
         pprer03.this.A481ForCan = GXv_decimal11[0] ;
         pprer03.this.A490ForPrdUMe = GXv_int20[0] ;
         pprer03.this.AV19TotKil = GXv_decimal8[0] ;
         pprer03.this.AV17BarVol = GXv_int13[0] ;
         pprer03.this.AV20ValCos = GXv_int12[0] ;
         pprer03.this.AV22LinRec = GXv_int10[0] ;
         pprer03.this.AV92RecPreCod = GXv_int4[0] ;
         pprer03.this.AV38Flag1 = GXv_int19[0] ;
         pprer03.this.AV39Flag2 = GXv_int18[0] ;
         pprer03.this.AV46RecLinIni = GXv_int9[0] ;
         pprer03.this.AV49Linea = GXv_int17[0] ;
         pprer03.this.AV51ExiCon = GXv_int16[0] ;
         pprer03.this.AV54FlagComp = GXv_int15[0] ;
         pprer03.this.AV63RecForNro = GXv_int14[0] ;
         pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
         pprer03.this.AV71TanqueN = GXv_int1[0] ;
         pprer03.this.AV73ProForDes = GXv_char23[0] ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S144( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P01CA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV27Producto});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A688PrdComCod = P01CA6_A688PrdComCod[0] ;
         A690PrdComFN = P01CA6_A690PrdComFN[0] ;
         A719PrdNum = P01CA6_A719PrdNum[0] ;
         AV53ProForCan = AV31Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV54FlagComp = (byte)(1) ;
         AV73ProForDes = "" ;
         GXv_char25[0] = A396EmprCod ;
         GXv_char24[0] = A719PrdNum ;
         GXv_decimal11[0] = AV53ProForCan ;
         GXv_int20[0] = AV50ForPrdUme ;
         GXv_decimal8[0] = AV19TotKil ;
         GXv_int13[0] = AV17BarVol ;
         GXv_int12[0] = AV20ValCos ;
         GXv_int10[0] = AV22LinRec ;
         GXv_int4[0] = AV92RecPreCod ;
         GXv_int19[0] = AV38Flag1 ;
         GXv_int18[0] = AV39Flag2 ;
         GXv_int9[0] = AV46RecLinIni ;
         GXv_int17[0] = AV49Linea ;
         GXv_int16[0] = AV51ExiCon ;
         GXv_int15[0] = AV54FlagComp ;
         GXv_int14[0] = AV63RecForNro ;
         GXv_int6[0] = AV62RecLinMaq ;
         GXv_int1[0] = AV71TanqueN ;
         GXv_char23[0] = AV73ProForDes ;
         new app.pprer04(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal11, GXv_int20, GXv_decimal8, GXv_int13, GXv_int12, GXv_int10, GXv_int4, GXv_int19, GXv_int18, GXv_int9, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int6, GXv_int1, GXv_char23) ;
         pprer03.this.A396EmprCod = GXv_char25[0] ;
         pprer03.this.A719PrdNum = GXv_char24[0] ;
         pprer03.this.AV53ProForCan = GXv_decimal11[0] ;
         pprer03.this.AV50ForPrdUme = GXv_int20[0] ;
         pprer03.this.AV19TotKil = GXv_decimal8[0] ;
         pprer03.this.AV17BarVol = GXv_int13[0] ;
         pprer03.this.AV20ValCos = GXv_int12[0] ;
         pprer03.this.AV22LinRec = GXv_int10[0] ;
         pprer03.this.AV92RecPreCod = GXv_int4[0] ;
         pprer03.this.AV38Flag1 = GXv_int19[0] ;
         pprer03.this.AV39Flag2 = GXv_int18[0] ;
         pprer03.this.AV46RecLinIni = GXv_int9[0] ;
         pprer03.this.AV49Linea = GXv_int17[0] ;
         pprer03.this.AV51ExiCon = GXv_int16[0] ;
         pprer03.this.AV54FlagComp = GXv_int15[0] ;
         pprer03.this.AV63RecForNro = GXv_int14[0] ;
         pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
         pprer03.this.AV71TanqueN = GXv_int1[0] ;
         pprer03.this.AV73ProForDes = GXv_char23[0] ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S124( )
   {
      /* 'ESPECIALES' Routine */
      returnInSub = false ;
      /* Using cursor P01CA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV28NumColFor), Short.valueOf(AV29NumOrd)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A489ForPrdNor = P01CA7_A489ForPrdNor[0] ;
         A486ForNumCol = P01CA7_A486ForNumCol[0] ;
         A719PrdNum = P01CA7_A719PrdNum[0] ;
         A487ForPrdCan = P01CA7_A487ForPrdCan[0] ;
         A490ForPrdUMe = P01CA7_A490ForPrdUMe[0] ;
         A715PrdLin = P01CA7_A715PrdLin[0] ;
         AV27Producto = A719PrdNum ;
         AV43ForPrdCan = A487ForPrdCan ;
         AV50ForPrdUme = A490ForPrdUMe ;
         if ( ! (GXutil.strcmp("", AV27Producto)==0) )
         {
            GXv_char25[0] = A396EmprCod ;
            GXv_char24[0] = AV27Producto ;
            GXv_decimal11[0] = AV43ForPrdCan ;
            GXv_int20[0] = AV50ForPrdUme ;
            GXv_decimal8[0] = AV19TotKil ;
            GXv_int13[0] = AV17BarVol ;
            GXv_int12[0] = AV20ValCos ;
            GXv_int10[0] = AV22LinRec ;
            GXv_int4[0] = AV92RecPreCod ;
            GXv_int19[0] = AV38Flag1 ;
            GXv_int18[0] = AV39Flag2 ;
            GXv_int9[0] = AV46RecLinIni ;
            GXv_int17[0] = AV49Linea ;
            GXv_int16[0] = AV51ExiCon ;
            GXv_int15[0] = AV54FlagComp ;
            GXv_int14[0] = AV63RecForNro ;
            GXv_int6[0] = AV62RecLinMaq ;
            GXv_int1[0] = AV71TanqueN ;
            GXv_char23[0] = AV73ProForDes ;
            new app.pprer04(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal11, GXv_int20, GXv_decimal8, GXv_int13, GXv_int12, GXv_int10, GXv_int4, GXv_int19, GXv_int18, GXv_int9, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int6, GXv_int1, GXv_char23) ;
            pprer03.this.A396EmprCod = GXv_char25[0] ;
            pprer03.this.AV27Producto = GXv_char24[0] ;
            pprer03.this.AV43ForPrdCan = GXv_decimal11[0] ;
            pprer03.this.AV50ForPrdUme = GXv_int20[0] ;
            pprer03.this.AV19TotKil = GXv_decimal8[0] ;
            pprer03.this.AV17BarVol = GXv_int13[0] ;
            pprer03.this.AV20ValCos = GXv_int12[0] ;
            pprer03.this.AV22LinRec = GXv_int10[0] ;
            pprer03.this.AV92RecPreCod = GXv_int4[0] ;
            pprer03.this.AV38Flag1 = GXv_int19[0] ;
            pprer03.this.AV39Flag2 = GXv_int18[0] ;
            pprer03.this.AV46RecLinIni = GXv_int9[0] ;
            pprer03.this.AV49Linea = GXv_int17[0] ;
            pprer03.this.AV51ExiCon = GXv_int16[0] ;
            pprer03.this.AV54FlagComp = GXv_int15[0] ;
            pprer03.this.AV63RecForNro = GXv_int14[0] ;
            pprer03.this.AV62RecLinMaq = GXv_int6[0] ;
            pprer03.this.AV71TanqueN = GXv_int1[0] ;
            pprer03.this.AV73ProForDes = GXv_char23[0] ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprer03.this.A396EmprCod;
      this.aP1[0] = pprer03.this.A4744RecPreCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47msg0 = "" ;
      GXt_char5 = "" ;
      AV19TotKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01CA2_A396EmprCod = new String[] {""} ;
      P01CA2_A4744RecPreCod = new int[1] ;
      P01CA2_A4747RecPreVol = new int[1] ;
      P01CA2_n4747RecPreVol = new boolean[] {false} ;
      AV59EmprCod = "" ;
      AV45Mensaje = "" ;
      P01CA3_A396EmprCod = new String[] {""} ;
      P01CA3_A4744RecPreCod = new int[1] ;
      P01CA3_A764ProForCod = new String[] {""} ;
      P01CA3_n764ProForCod = new boolean[] {false} ;
      P01CA3_A4762RecPreLin = new short[1] ;
      A764ProForCod = "" ;
      AV37ProForCod = "" ;
      P01CA4_A396EmprCod = new String[] {""} ;
      P01CA4_A764ProForCod = new String[] {""} ;
      P01CA4_n764ProForCod = new boolean[] {false} ;
      P01CA4_A1645ProForNro = new byte[1] ;
      P01CA4_A770ProForPrd = new String[] {""} ;
      P01CA4_A765ProForDes = new String[] {""} ;
      P01CA4_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01CA4_A5358ProForClv = new String[] {""} ;
      P01CA4_A490ForPrdUMe = new byte[1] ;
      P01CA4_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A5358ProForClv = "" ;
      AV73ProForDes = "" ;
      AV25PrdDesc = "" ;
      AV27Producto = "" ;
      AV44Produc = "" ;
      AV31Cantidad = DecimalUtil.ZERO ;
      AV42ProForPrd = "" ;
      AV82Calve = "" ;
      GXv_char7 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV36BarCodPar = "" ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      AV33Accion = "" ;
      AV83LineaRec = "" ;
      P01CA5_A396EmprCod = new String[] {""} ;
      P01CA5_A719PrdNum = new String[] {""} ;
      P01CA5_A486ForNumCol = new int[1] ;
      P01CA5_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01CA5_A490ForPrdUMe = new byte[1] ;
      P01CA5_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      P01CA6_A396EmprCod = new String[] {""} ;
      P01CA6_A688PrdComCod = new String[] {""} ;
      P01CA6_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01CA6_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      AV53ProForCan = DecimalUtil.ZERO ;
      P01CA7_A396EmprCod = new String[] {""} ;
      P01CA7_A489ForPrdNor = new short[1] ;
      P01CA7_A486ForNumCol = new int[1] ;
      P01CA7_A719PrdNum = new String[] {""} ;
      P01CA7_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01CA7_A490ForPrdUMe = new byte[1] ;
      P01CA7_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV43ForPrdCan = DecimalUtil.ZERO ;
      GXv_char25 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int20 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int13 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int10 = new short[1] ;
      GXv_int4 = new int[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int18 = new byte[1] ;
      GXv_int9 = new short[1] ;
      GXv_int17 = new byte[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int6 = new short[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char23 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprer03__default(),
         new Object[] {
             new Object[] {
            P01CA2_A396EmprCod, P01CA2_A4744RecPreCod, P01CA2_A4747RecPreVol, P01CA2_n4747RecPreVol
            }
            , new Object[] {
            P01CA3_A396EmprCod, P01CA3_A4744RecPreCod, P01CA3_A764ProForCod, P01CA3_n764ProForCod, P01CA3_A4762RecPreLin
            }
            , new Object[] {
            P01CA4_A396EmprCod, P01CA4_A764ProForCod, P01CA4_A1645ProForNro, P01CA4_A770ProForPrd, P01CA4_A765ProForDes, P01CA4_A762ProForCan, P01CA4_A5358ProForClv, P01CA4_A490ForPrdUMe, P01CA4_A767ProForLin
            }
            , new Object[] {
            P01CA5_A396EmprCod, P01CA5_A719PrdNum, P01CA5_A486ForNumCol, P01CA5_A481ForCan, P01CA5_A490ForPrdUMe, P01CA5_A309ColLin
            }
            , new Object[] {
            P01CA6_A396EmprCod, P01CA6_A688PrdComCod, P01CA6_A690PrdComFN, P01CA6_A719PrdNum
            }
            , new Object[] {
            P01CA7_A396EmprCod, P01CA7_A489ForPrdNor, P01CA7_A486ForNumCol, P01CA7_A719PrdNum, P01CA7_A487ForPrdCan, P01CA7_A490ForPrdUMe, P01CA7_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV88FlagExiPro ;
   private byte AV51ExiCon ;
   private byte AV38Flag1 ;
   private byte AV39Flag2 ;
   private byte AV85FlagRenNro ;
   private byte AV87FlagCen ;
   private byte AV54FlagComp ;
   private byte AV24Flag ;
   private byte AV26FlagPro ;
   private byte AV49Linea ;
   private byte AV81RecLinPro ;
   private byte AV48FlagTemp ;
   private byte A1645ProForNro ;
   private byte A490ForPrdUMe ;
   private byte AV63RecForNro ;
   private byte AV50ForPrdUme ;
   private byte AV30Ncar ;
   private byte AV71TanqueN ;
   private byte AV32PrdVal ;
   private byte AV35BarCodReo ;
   private byte GXv_int20[] ;
   private byte GXv_int19[] ;
   private byte GXv_int18[] ;
   private byte GXv_int17[] ;
   private byte GXv_int16[] ;
   private byte GXv_int15[] ;
   private byte GXv_int14[] ;
   private byte GXv_int1[] ;
   private short AV22LinRec ;
   private short AV62RecLinMaq ;
   private short A4762RecPreLin ;
   private short AV67BarLinMaq ;
   private short A767ProForLin ;
   private short AV46RecLinIni ;
   private short AV29NumOrd ;
   private short A309ColLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short GXv_int10[] ;
   private short GXv_int9[] ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int A4744RecPreCod ;
   private int AV20ValCos ;
   private int A4747RecPreVol ;
   private int AV92RecPreCod ;
   private int AV17BarVol ;
   private int AV34BarCod ;
   private int AV28NumColFor ;
   private int A486ForNumCol ;
   private int GXv_int13[] ;
   private int GXv_int12[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV19TotKil ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV31Cantidad ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV53ProForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV43ForPrdCan ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV47msg0 ;
   private String GXt_char5 ;
   private String scmdbuf ;
   private String AV59EmprCod ;
   private String AV45Mensaje ;
   private String A764ProForCod ;
   private String AV37ProForCod ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A5358ProForClv ;
   private String AV73ProForDes ;
   private String AV25PrdDesc ;
   private String AV27Producto ;
   private String AV44Produc ;
   private String AV42ProForPrd ;
   private String AV82Calve ;
   private String GXv_char7[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV36BarCodPar ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String AV33Accion ;
   private String AV83LineaRec ;
   private String A719PrdNum ;
   private String A688PrdComCod ;
   private String GXv_char25[] ;
   private String GXv_char24[] ;
   private String GXv_char23[] ;
   private boolean n4747RecPreVol ;
   private boolean n764ProForCod ;
   private boolean returnInSub ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01CA2_A396EmprCod ;
   private int[] P01CA2_A4744RecPreCod ;
   private int[] P01CA2_A4747RecPreVol ;
   private boolean[] P01CA2_n4747RecPreVol ;
   private String[] P01CA3_A396EmprCod ;
   private int[] P01CA3_A4744RecPreCod ;
   private String[] P01CA3_A764ProForCod ;
   private boolean[] P01CA3_n764ProForCod ;
   private short[] P01CA3_A4762RecPreLin ;
   private String[] P01CA4_A396EmprCod ;
   private String[] P01CA4_A764ProForCod ;
   private boolean[] P01CA4_n764ProForCod ;
   private byte[] P01CA4_A1645ProForNro ;
   private String[] P01CA4_A770ProForPrd ;
   private String[] P01CA4_A765ProForDes ;
   private java.math.BigDecimal[] P01CA4_A762ProForCan ;
   private String[] P01CA4_A5358ProForClv ;
   private byte[] P01CA4_A490ForPrdUMe ;
   private short[] P01CA4_A767ProForLin ;
   private String[] P01CA5_A396EmprCod ;
   private String[] P01CA5_A719PrdNum ;
   private int[] P01CA5_A486ForNumCol ;
   private java.math.BigDecimal[] P01CA5_A481ForCan ;
   private byte[] P01CA5_A490ForPrdUMe ;
   private short[] P01CA5_A309ColLin ;
   private String[] P01CA6_A396EmprCod ;
   private String[] P01CA6_A688PrdComCod ;
   private java.math.BigDecimal[] P01CA6_A690PrdComFN ;
   private String[] P01CA6_A719PrdNum ;
   private String[] P01CA7_A396EmprCod ;
   private short[] P01CA7_A489ForPrdNor ;
   private int[] P01CA7_A486ForNumCol ;
   private String[] P01CA7_A719PrdNum ;
   private java.math.BigDecimal[] P01CA7_A487ForPrdCan ;
   private byte[] P01CA7_A490ForPrdUMe ;
   private short[] P01CA7_A715PrdLin ;
}

final  class pprer03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01CA2", "SELECT EmprCod, RecPreCod, RecPreVol FROM TXPPREREC WHERE EmprCod = ? and RecPreCod = ? ORDER BY EmprCod, RecPreCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01CA3", "SELECT EmprCod, RecPreCod, ProForCod, RecPreLin FROM TXPPRERE1 WHERE EmprCod = ? and RecPreCod = ? ORDER BY EmprCod, RecPreCod, RecPreLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01CA4", "SELECT EmprCod, ProForCod, ProForNro, ProForPrd, ProForDes, ProForCan, ProForClv, ForPrdUMe, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01CA5", "SELECT EmprCod, PrdNum, ForNumCol, ForCan, ForPrdUMe, ColLin FROM TXPLDFORM WHERE (EmprCod = ? and ForNumCol = ?) AND (SUBSTR(PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01CA6", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND (PrdComCod = ?) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01CA7", "SELECT EmprCod, ForPrdNor, ForNumCol, PrdNum, ForPrdCan, ForPrdUMe, PrdLin FROM TXPLPRFOR WHERE (EmprCod = ? and ForNumCol = ?) AND (ForPrdNor = ?) ORDER BY EmprCod, ForNumCol, PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

