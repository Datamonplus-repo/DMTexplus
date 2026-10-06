package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class plchproceso extends GXReportText
{
   public plchproceso( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plchproceso.class ), "" );
   }

   public plchproceso( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          String[] aP5 ,
                          byte[] aP6 ,
                          String[] aP7 )
   {
      plchproceso.this.aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 )
   {
      plchproceso.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plchproceso.this.AV34BarCod = aP1[0];
      this.aP1 = aP1;
      plchproceso.this.AV35BarCodReo = aP2[0];
      this.aP2 = aP2;
      plchproceso.this.AV36BarCodPar = aP3[0];
      this.aP3 = aP3;
      plchproceso.this.AV62RecLinMaq = aP4[0];
      this.aP4 = aP4;
      plchproceso.this.AV37ProForCod = aP5[0];
      this.aP5 = aP5;
      plchproceso.this.AV49Linea = aP6[0];
      this.aP6 = aP6;
      plchproceso.this.AV15BarMaqCod = aP7[0];
      this.aP7 = aP7;
      plchproceso.this.AV17BarVol = aP8[0];
      this.aP8 = aP8;
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
      Gx_line = (int)(P_lines+1) ;
      Gx_out = "FIL" ;
      if ( GXutil.strcmp(Gx_out, "PRN") == 0 )
      {
         setOutput( "plchproceso.prn" );
      }
      else
      {
         if ( GXutil.strcmp(Gx_out, "SCR") == 0 )
         {
            setOutput(System.out);
         }
         else
         {
            if ( GXutil.strcmp(Gx_out, "FIL") == 0 )
            {
               setOutput( "plchproceso.prn" );
            }
         }
      }
      /* Execute user subroutine: 'PROCESOS' */
      S111 ();
      if ( returnInSub )
      {
      }
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      h5Z90( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PROCESOS' Routine */
      returnInSub = false ;
      AV189GXLvl7 = (byte)(0) ;
      /* Using cursor P05Z92 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV37ProForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P05Z92_A764ProForCod[0] ;
         A1645ProForNro = P05Z92_A1645ProForNro[0] ;
         A6062ProForCPo = P05Z92_A6062ProForCPo[0] ;
         A3379ProForTnq = P05Z92_A3379ProForTnq[0] ;
         A772ProForTmx = P05Z92_A772ProForTmx[0] ;
         A770ProForPrd = P05Z92_A770ProForPrd[0] ;
         A765ProForDes = P05Z92_A765ProForDes[0] ;
         A5358ProForClv = P05Z92_A5358ProForClv[0] ;
         A763ProForCla = P05Z92_A763ProForCla[0] ;
         A762ProForCan = P05Z92_A762ProForCan[0] ;
         A490ForPrdUMe = P05Z92_A490ForPrdUMe[0] ;
         A767ProForLin = P05Z92_A767ProForLin[0] ;
         A772ProForTmx = P05Z92_A772ProForTmx[0] ;
         AV189GXLvl7 = (byte)(1) ;
         ToSkip = 1 ;
         AV63RecForNro = A1645ProForNro ;
         AV119ProForCpo = A6062ProForCPo ;
         AV73ProForDes = "" ;
         if ( AV75TnqPro == 1 )
         {
            AV71TanqueN = (byte)(0) ;
            AV71TanqueN = A3379ProForTnq ;
         }
         if ( ( A772ProForTmx > AV23TempMax ) && ( A772ProForTmx != 0 ) && ( AV23TempMax != 0 ) && ( AV48FlagTemp == 0 ) )
         {
            AV25PrdDesc = httpContext.getMessage( "ATENCION MAQ. INADECUADA", "") ;
            AV27Producto = "" ;
            Gx_msg = httpContext.getMessage( "Lanzo PRECLI1..", "") + AV27Producto + " " + AV25PrdDesc ;
            System.out.println( Gx_msg );
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = AV34BarCod ;
            GXv_int3[0] = AV35BarCodReo ;
            GXv_char4[0] = AV36BarCodPar ;
            GXv_int5[0] = AV22LinRec ;
            GXv_char6[0] = AV25PrdDesc ;
            GXv_char7[0] = AV27Producto ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_int9[0] = AV49Linea ;
            GXv_int10[0] = AV62RecLinMaq ;
            GXv_int11[0] = AV46RecLinIni ;
            new app.precli1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_decimal8, GXv_int9, GXv_int10, GXv_int11) ;
            plchproceso.this.A396EmprCod = GXv_char1[0] ;
            plchproceso.this.AV34BarCod = GXv_int2[0] ;
            plchproceso.this.AV35BarCodReo = GXv_int3[0] ;
            plchproceso.this.AV36BarCodPar = GXv_char4[0] ;
            plchproceso.this.AV22LinRec = GXv_int5[0] ;
            plchproceso.this.AV25PrdDesc = GXv_char6[0] ;
            plchproceso.this.AV27Producto = GXv_char7[0] ;
            plchproceso.this.AV49Linea = GXv_int9[0] ;
            plchproceso.this.AV62RecLinMaq = GXv_int10[0] ;
            plchproceso.this.AV46RecLinIni = GXv_int11[0] ;
            AV48FlagTemp = (byte)(1) ;
         }
         if ( (GXutil.strcmp("", A770ProForPrd)==0) )
         {
            AV25PrdDesc = A765ProForDes ;
            AV27Producto = "" ;
            Gx_msg = httpContext.getMessage( "Lanzo PRECLI1..", "") + AV27Producto + " " + AV25PrdDesc ;
            System.out.println( Gx_msg );
            GXv_char7[0] = A396EmprCod ;
            GXv_int2[0] = AV34BarCod ;
            GXv_int9[0] = AV35BarCodReo ;
            GXv_char6[0] = AV36BarCodPar ;
            GXv_int11[0] = AV22LinRec ;
            GXv_char4[0] = AV25PrdDesc ;
            GXv_char1[0] = AV27Producto ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_int3[0] = AV49Linea ;
            GXv_int10[0] = AV62RecLinMaq ;
            GXv_int5[0] = AV46RecLinIni ;
            new app.precli1(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_int9, GXv_char6, GXv_int11, GXv_char4, GXv_char1, GXv_decimal8, GXv_int3, GXv_int10, GXv_int5) ;
            plchproceso.this.A396EmprCod = GXv_char7[0] ;
            plchproceso.this.AV34BarCod = GXv_int2[0] ;
            plchproceso.this.AV35BarCodReo = GXv_int9[0] ;
            plchproceso.this.AV36BarCodPar = GXv_char6[0] ;
            plchproceso.this.AV22LinRec = GXv_int11[0] ;
            plchproceso.this.AV25PrdDesc = GXv_char4[0] ;
            plchproceso.this.AV27Producto = GXv_char1[0] ;
            plchproceso.this.AV49Linea = GXv_int3[0] ;
            plchproceso.this.AV62RecLinMaq = GXv_int10[0] ;
            plchproceso.this.AV46RecLinIni = GXv_int5[0] ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
            {
               AV29NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
               AV27Producto = "" ;
               AV50ForPrdUme = (byte)(0) ;
               /* Execute user subroutine: 'CTRL_PE' */
               S122 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  /* Close printer file */
                  /* Close text printer */
                  out.close();
                  returnInSub = true;
                  if (true) return;
               }
               AV32PrdVal = (byte)(0) ;
               AV132llamo_pe = httpContext.getMessage( "S", "") ;
               AV134Dosi_pp = (byte)(0) ;
               if ( ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV118Existe_p == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV118Existe_p == 1 ) ) )
               {
                  AV25PrdDesc = A765ProForDes ;
                  AV27Producto = A770ProForPrd ;
                  if ( GXutil.strcmp(A5358ProForClv, " ") == 0 )
                  {
                     AV132llamo_pe = httpContext.getMessage( "S", "") ;
                     Gx_msg = httpContext.getMessage( "Lanzo PCLAESP..", "") + A763ProForCla + " " + httpContext.getMessage( "Producto ", "") + AV27Producto ;
                     System.out.println( Gx_msg );
                     GXv_char7[0] = A396EmprCod ;
                     GXv_char6[0] = AV27Producto ;
                     GXv_char4[0] = A763ProForCla ;
                     GXv_int9[0] = AV32PrdVal ;
                     GXv_int2[0] = AV34BarCod ;
                     GXv_int3[0] = AV35BarCodReo ;
                     GXv_char1[0] = AV36BarCodPar ;
                     GXv_decimal8[0] = AV19TotKil ;
                     GXv_char12[0] = AV25PrdDesc ;
                     GXv_char13[0] = AV33Accion ;
                     GXv_int11[0] = AV67BarLinMaq ;
                     new app.pclaesp(remoteHandle, context).execute( GXv_char7, GXv_char6, GXv_char4, GXv_int9, GXv_int2, GXv_int3, GXv_char1, GXv_decimal8, GXv_char12, GXv_char13, GXv_int11) ;
                     plchproceso.this.A396EmprCod = GXv_char7[0] ;
                     plchproceso.this.AV27Producto = GXv_char6[0] ;
                     plchproceso.this.A763ProForCla = GXv_char4[0] ;
                     plchproceso.this.AV32PrdVal = GXv_int9[0] ;
                     plchproceso.this.AV34BarCod = GXv_int2[0] ;
                     plchproceso.this.AV35BarCodReo = GXv_int3[0] ;
                     plchproceso.this.AV36BarCodPar = GXv_char1[0] ;
                     plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
                     plchproceso.this.AV25PrdDesc = GXv_char12[0] ;
                     plchproceso.this.AV33Accion = GXv_char13[0] ;
                     plchproceso.this.AV67BarLinMaq = GXv_int11[0] ;
                  }
                  if ( ! (GXutil.strcmp("", A5358ProForClv)==0) )
                  {
                     AV132llamo_pe = httpContext.getMessage( "N", "") ;
                     Gx_msg = httpContext.getMessage( "Lanzo PCLAESPi..", "") + A5358ProForClv + " " + httpContext.getMessage( "Producto ", "") + AV27Producto ;
                     System.out.println( Gx_msg );
                     GXv_char13[0] = A396EmprCod ;
                     GXv_char12[0] = AV27Producto ;
                     GXv_char7[0] = A5358ProForClv ;
                     GXv_int9[0] = AV32PrdVal ;
                     GXv_int2[0] = AV34BarCod ;
                     GXv_int3[0] = AV35BarCodReo ;
                     GXv_char6[0] = AV36BarCodPar ;
                     GXv_decimal8[0] = AV19TotKil ;
                     GXv_char4[0] = AV25PrdDesc ;
                     GXv_char1[0] = AV33Accion ;
                     GXv_int11[0] = AV67BarLinMaq ;
                     GXv_decimal14[0] = AV133Porc_p ;
                     new app.pclaespi(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_char7, GXv_int9, GXv_int2, GXv_int3, GXv_char6, GXv_decimal8, GXv_char4, GXv_char1, GXv_int11, GXv_decimal14) ;
                     plchproceso.this.A396EmprCod = GXv_char13[0] ;
                     plchproceso.this.AV27Producto = GXv_char12[0] ;
                     plchproceso.this.A5358ProForClv = GXv_char7[0] ;
                     plchproceso.this.AV32PrdVal = GXv_int9[0] ;
                     plchproceso.this.AV34BarCod = GXv_int2[0] ;
                     plchproceso.this.AV35BarCodReo = GXv_int3[0] ;
                     plchproceso.this.AV36BarCodPar = GXv_char6[0] ;
                     plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
                     plchproceso.this.AV25PrdDesc = GXv_char4[0] ;
                     plchproceso.this.AV33Accion = GXv_char1[0] ;
                     plchproceso.this.AV67BarLinMaq = GXv_int11[0] ;
                     plchproceso.this.AV133Porc_p = GXv_decimal14[0] ;
                     if ( AV32PrdVal == 1 )
                     {
                        AV134Dosi_pp = (byte)(1) ;
                        AV132llamo_pe = httpContext.getMessage( "S", "") ;
                     }
                     else
                     {
                        AV132llamo_pe = httpContext.getMessage( "N", "") ;
                     }
                  }
                  if ( AV32PrdVal == 1 )
                  {
                     if ( GXutil.strcmp(A5358ProForClv, " ") == 0 )
                     {
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "E", "")) == 0 ) )
                        {
                           Gx_msg = httpContext.getMessage( "Lanzo ELIREC..", "") ;
                           System.out.println( Gx_msg );
                           GXv_char13[0] = A396EmprCod ;
                           GXv_int2[0] = AV34BarCod ;
                           GXv_int9[0] = AV35BarCodReo ;
                           GXv_char12[0] = AV36BarCodPar ;
                           GXv_int11[0] = AV22LinRec ;
                           GXv_int10[0] = AV46RecLinIni ;
                           GXv_int5[0] = AV62RecLinMaq ;
                           GXv_int3[0] = AV81RecLinPro ;
                           new app.pelirec(remoteHandle, context).execute( GXv_char13, GXv_int2, GXv_int9, GXv_char12, GXv_int11, GXv_int10, GXv_int5, GXv_int3) ;
                           plchproceso.this.A396EmprCod = GXv_char13[0] ;
                           plchproceso.this.AV34BarCod = GXv_int2[0] ;
                           plchproceso.this.AV35BarCodReo = GXv_int9[0] ;
                           plchproceso.this.AV36BarCodPar = GXv_char12[0] ;
                           plchproceso.this.AV22LinRec = GXv_int11[0] ;
                           plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                           plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                           plchproceso.this.AV81RecLinPro = GXv_int3[0] ;
                           AV63RecForNro = A1645ProForNro ;
                        }
                     }
                  }
               }
               if ( ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) ) || ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV32PrdVal == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV32PrdVal == 1 ) ) )
               {
                  AV125Por_can = A762ProForCan ;
                  if ( GXutil.strcmp(AV132llamo_pe, httpContext.getMessage( "S", "")) == 0 )
                  {
                     /* Execute user subroutine: 'ESPECIALES' */
                     S132 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        pr_default.close(0);
                        /* Close printer file */
                        /* Close text printer */
                        out.close();
                        returnInSub = true;
                        if (true) return;
                     }
                  }
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
                  if ( (GXutil.strcmp("", A763ProForCla)==0) )
                  {
                     /* Execute user subroutine: 'COLORANTES' */
                     S142 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        pr_default.close(0);
                        /* Close printer file */
                        /* Close text printer */
                        out.close();
                        returnInSub = true;
                        if (true) return;
                     }
                  }
                  else
                  {
                     AV82Calve = A763ProForCla ;
                     AV32PrdVal = (byte)(0) ;
                     AV25PrdDesc = A765ProForDes ;
                     AV27Producto = A770ProForPrd ;
                     Gx_msg = httpContext.getMessage( "Lanzo PCLAESP..", "") + A763ProForCla + " " + httpContext.getMessage( "Producto ", "") + AV27Producto ;
                     System.out.println( Gx_msg );
                     GXv_char13[0] = A396EmprCod ;
                     GXv_char12[0] = AV27Producto ;
                     GXv_char7[0] = A763ProForCla ;
                     GXv_int9[0] = AV32PrdVal ;
                     GXv_int2[0] = AV34BarCod ;
                     GXv_int3[0] = AV35BarCodReo ;
                     GXv_char6[0] = AV36BarCodPar ;
                     GXv_decimal14[0] = AV19TotKil ;
                     GXv_char4[0] = AV25PrdDesc ;
                     GXv_char1[0] = AV33Accion ;
                     GXv_int11[0] = AV67BarLinMaq ;
                     new app.pclaesp(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_char7, GXv_int9, GXv_int2, GXv_int3, GXv_char6, GXv_decimal14, GXv_char4, GXv_char1, GXv_int11) ;
                     plchproceso.this.A396EmprCod = GXv_char13[0] ;
                     plchproceso.this.AV27Producto = GXv_char12[0] ;
                     plchproceso.this.A763ProForCla = GXv_char7[0] ;
                     plchproceso.this.AV32PrdVal = GXv_int9[0] ;
                     plchproceso.this.AV34BarCod = GXv_int2[0] ;
                     plchproceso.this.AV35BarCodReo = GXv_int3[0] ;
                     plchproceso.this.AV36BarCodPar = GXv_char6[0] ;
                     plchproceso.this.AV19TotKil = GXv_decimal14[0] ;
                     plchproceso.this.AV25PrdDesc = GXv_char4[0] ;
                     plchproceso.this.AV33Accion = GXv_char1[0] ;
                     plchproceso.this.AV67BarLinMaq = GXv_int11[0] ;
                     if ( AV32PrdVal == 1 )
                     {
                        if ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "E", "")) == 0 )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "No permitido Clave Tipo \"E\" en colorantes", ""));
                        }
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           /* Execute user subroutine: 'COLORANTES' */
                           S142 ();
                           if ( returnInSub )
                           {
                              pr_default.close(0);
                              pr_default.close(0);
                              /* Close printer file */
                              /* Close text printer */
                              out.close();
                              returnInSub = true;
                              if (true) return;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                     {
                        AV27Producto = A770ProForPrd ;
                        AV31Cantidad = A762ProForCan ;
                        AV50ForPrdUme = A490ForPrdUMe ;
                        AV54FlagComp = (byte)(0) ;
                        AV73ProForDes = A765ProForDes ;
                        if ( AV68FlagLw == 1 )
                        {
                           AV71TanqueN = (byte)(1) ;
                        }
                        if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                        {
                           AV127MaqTipPrd = httpContext.getMessage( "C", "") ;
                        }
                        else
                        {
                           AV127MaqTipPrd = httpContext.getMessage( "P", "") ;
                        }
                        /* Execute user subroutine: 'MAQTNQ' */
                        S152 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           pr_default.close(0);
                           /* Close printer file */
                           /* Close text printer */
                           out.close();
                           returnInSub = true;
                           if (true) return;
                        }
                        if ( AV128MaqTqn > 0 )
                        {
                           AV71TanqueN = AV128MaqTqn ;
                        }
                        AV121Canfor = A762ProForCan ;
                        if ( ( AV120CdpPor == 1 ) && ( AV119ProForCpo.doubleValue() > 0 ) && ( AV119ProForCpo.doubleValue() <= 100 ) )
                        {
                           AV121Canfor = (AV121Canfor.multiply(AV119ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        }
                        Gx_msg = httpContext.getMessage( "Lanzo EXIPRO..", "") + httpContext.getMessage( "Producto ", "") + A770ProForPrd ;
                        System.out.println( Gx_msg );
                        GXv_char13[0] = A396EmprCod ;
                        GXv_char12[0] = A770ProForPrd ;
                        GXv_decimal14[0] = AV121Canfor ;
                        GXv_int9[0] = A490ForPrdUMe ;
                        GXv_decimal8[0] = AV19TotKil ;
                        GXv_int2[0] = AV17BarVol ;
                        GXv_int15[0] = AV20ValCos ;
                        GXv_int11[0] = AV22LinRec ;
                        GXv_int16[0] = AV34BarCod ;
                        GXv_int3[0] = AV35BarCodReo ;
                        GXv_char7[0] = AV36BarCodPar ;
                        GXv_int17[0] = AV38Flag1 ;
                        GXv_int18[0] = AV39Flag2 ;
                        GXv_int10[0] = AV46RecLinIni ;
                        GXv_int19[0] = AV49Linea ;
                        GXv_int20[0] = AV51ExiCon ;
                        GXv_int21[0] = AV54FlagComp ;
                        GXv_int22[0] = AV63RecForNro ;
                        GXv_int5[0] = AV62RecLinMaq ;
                        GXv_int23[0] = AV71TanqueN ;
                        GXv_char6[0] = AV73ProForDes ;
                        new app.pexipro(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal14, GXv_int9, GXv_decimal8, GXv_int2, GXv_int15, GXv_int11, GXv_int16, GXv_int3, GXv_char7, GXv_int17, GXv_int18, GXv_int10, GXv_int19, GXv_int20, GXv_int21, GXv_int22, GXv_int5, GXv_int23, GXv_char6) ;
                        plchproceso.this.A396EmprCod = GXv_char13[0] ;
                        plchproceso.this.A770ProForPrd = GXv_char12[0] ;
                        plchproceso.this.AV121Canfor = GXv_decimal14[0] ;
                        plchproceso.this.A490ForPrdUMe = GXv_int9[0] ;
                        plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
                        plchproceso.this.AV17BarVol = GXv_int2[0] ;
                        plchproceso.this.AV20ValCos = GXv_int15[0] ;
                        plchproceso.this.AV22LinRec = GXv_int11[0] ;
                        plchproceso.this.AV34BarCod = GXv_int16[0] ;
                        plchproceso.this.AV35BarCodReo = GXv_int3[0] ;
                        plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
                        plchproceso.this.AV38Flag1 = GXv_int17[0] ;
                        plchproceso.this.AV39Flag2 = GXv_int18[0] ;
                        plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                        plchproceso.this.AV49Linea = GXv_int19[0] ;
                        plchproceso.this.AV51ExiCon = GXv_int20[0] ;
                        plchproceso.this.AV54FlagComp = GXv_int21[0] ;
                        plchproceso.this.AV63RecForNro = GXv_int22[0] ;
                        plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                        plchproceso.this.AV71TanqueN = GXv_int23[0] ;
                        plchproceso.this.AV73ProForDes = GXv_char6[0] ;
                        if ( AV88FlagExiPro == 0 )
                        {
                           /* Execute user subroutine: 'COMPUESTOS' */
                           S162 ();
                           if ( returnInSub )
                           {
                              pr_default.close(0);
                              pr_default.close(0);
                              /* Close printer file */
                              /* Close text printer */
                              out.close();
                              returnInSub = true;
                              if (true) return;
                           }
                        }
                        AV54FlagComp = (byte)(0) ;
                     }
                     else
                     {
                        AV73ProForDes = A765ProForDes ;
                        if ( AV68FlagLw == 1 )
                        {
                           AV71TanqueN = (byte)(1) ;
                        }
                        if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                        {
                           AV127MaqTipPrd = httpContext.getMessage( "C", "") ;
                        }
                        else
                        {
                           AV127MaqTipPrd = httpContext.getMessage( "P", "") ;
                        }
                        /* Execute user subroutine: 'MAQTNQ' */
                        S152 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           pr_default.close(0);
                           /* Close printer file */
                           /* Close text printer */
                           out.close();
                           returnInSub = true;
                           if (true) return;
                        }
                        if ( AV128MaqTqn > 0 )
                        {
                           AV71TanqueN = AV128MaqTqn ;
                        }
                        AV121Canfor = A762ProForCan ;
                        if ( ( AV120CdpPor == 1 ) && ( AV119ProForCpo.doubleValue() > 0 ) && ( AV119ProForCpo.doubleValue() <= 100 ) )
                        {
                           AV121Canfor = (AV121Canfor.multiply(AV119ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        }
                        Gx_msg = httpContext.getMessage( "Lanzo EXIPRO..", "") + httpContext.getMessage( "Producto ", "") + A770ProForPrd ;
                        System.out.println( Gx_msg );
                        GXv_char13[0] = A396EmprCod ;
                        GXv_char12[0] = A770ProForPrd ;
                        GXv_decimal14[0] = AV121Canfor ;
                        GXv_int23[0] = A490ForPrdUMe ;
                        GXv_decimal8[0] = AV19TotKil ;
                        GXv_int16[0] = AV17BarVol ;
                        GXv_int15[0] = AV20ValCos ;
                        GXv_int11[0] = AV22LinRec ;
                        GXv_int2[0] = AV34BarCod ;
                        GXv_int22[0] = AV35BarCodReo ;
                        GXv_char7[0] = AV36BarCodPar ;
                        GXv_int21[0] = AV38Flag1 ;
                        GXv_int20[0] = AV39Flag2 ;
                        GXv_int10[0] = AV46RecLinIni ;
                        GXv_int19[0] = AV49Linea ;
                        GXv_int18[0] = AV51ExiCon ;
                        GXv_int17[0] = AV54FlagComp ;
                        GXv_int9[0] = AV63RecForNro ;
                        GXv_int5[0] = AV62RecLinMaq ;
                        GXv_int3[0] = AV71TanqueN ;
                        GXv_char6[0] = AV73ProForDes ;
                        new app.pexipro(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal14, GXv_int23, GXv_decimal8, GXv_int16, GXv_int15, GXv_int11, GXv_int2, GXv_int22, GXv_char7, GXv_int21, GXv_int20, GXv_int10, GXv_int19, GXv_int18, GXv_int17, GXv_int9, GXv_int5, GXv_int3, GXv_char6) ;
                        plchproceso.this.A396EmprCod = GXv_char13[0] ;
                        plchproceso.this.A770ProForPrd = GXv_char12[0] ;
                        plchproceso.this.AV121Canfor = GXv_decimal14[0] ;
                        plchproceso.this.A490ForPrdUMe = GXv_int23[0] ;
                        plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
                        plchproceso.this.AV17BarVol = GXv_int16[0] ;
                        plchproceso.this.AV20ValCos = GXv_int15[0] ;
                        plchproceso.this.AV22LinRec = GXv_int11[0] ;
                        plchproceso.this.AV34BarCod = GXv_int2[0] ;
                        plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
                        plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
                        plchproceso.this.AV38Flag1 = GXv_int21[0] ;
                        plchproceso.this.AV39Flag2 = GXv_int20[0] ;
                        plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                        plchproceso.this.AV49Linea = GXv_int19[0] ;
                        plchproceso.this.AV51ExiCon = GXv_int18[0] ;
                        plchproceso.this.AV54FlagComp = GXv_int17[0] ;
                        plchproceso.this.AV63RecForNro = GXv_int9[0] ;
                        plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                        plchproceso.this.AV71TanqueN = GXv_int3[0] ;
                        plchproceso.this.AV73ProForDes = GXv_char6[0] ;
                     }
                  }
                  else
                  {
                     AV82Calve = A763ProForCla ;
                     AV32PrdVal = (byte)(0) ;
                     AV25PrdDesc = A765ProForDes ;
                     AV27Producto = A770ProForPrd ;
                     if ( ( GXutil.strcmp(A5358ProForClv, " ") != 0 ) && ( ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CX", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CF", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "DA", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CP", "")) == 0 ) ) )
                     {
                        AV25PrdDesc = A765ProForDes ;
                        AV27Producto = A770ProForPrd ;
                        Gx_msg = httpContext.getMessage( "Lanzo PCLAESPx..", "") + "" + A5358ProForClv + httpContext.getMessage( " Producto ", "") + AV27Producto ;
                        System.out.println( Gx_msg );
                        GXv_char13[0] = A396EmprCod ;
                        GXv_char12[0] = AV27Producto ;
                        GXv_char7[0] = A5358ProForClv ;
                        GXv_int23[0] = AV32PrdVal ;
                        GXv_int16[0] = AV34BarCod ;
                        GXv_int22[0] = AV35BarCodReo ;
                        GXv_char6[0] = AV36BarCodPar ;
                        GXv_decimal14[0] = AV19TotKil ;
                        GXv_char4[0] = AV25PrdDesc ;
                        GXv_char1[0] = AV33Accion ;
                        GXv_int11[0] = AV67BarLinMaq ;
                        GXv_decimal8[0] = AV133Porc_p ;
                        new app.pclaespx(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_char7, GXv_int23, GXv_int16, GXv_int22, GXv_char6, GXv_decimal14, GXv_char4, GXv_char1, GXv_int11, GXv_decimal8) ;
                        plchproceso.this.A396EmprCod = GXv_char13[0] ;
                        plchproceso.this.AV27Producto = GXv_char12[0] ;
                        plchproceso.this.A5358ProForClv = GXv_char7[0] ;
                        plchproceso.this.AV32PrdVal = GXv_int23[0] ;
                        plchproceso.this.AV34BarCod = GXv_int16[0] ;
                        plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
                        plchproceso.this.AV36BarCodPar = GXv_char6[0] ;
                        plchproceso.this.AV19TotKil = GXv_decimal14[0] ;
                        plchproceso.this.AV25PrdDesc = GXv_char4[0] ;
                        plchproceso.this.AV33Accion = GXv_char1[0] ;
                        plchproceso.this.AV67BarLinMaq = GXv_int11[0] ;
                        plchproceso.this.AV133Porc_p = GXv_decimal8[0] ;
                     }
                     else
                     {
                        Gx_msg = httpContext.getMessage( "Lanzo PCLAESP..", "") + "" + A763ProForCla + httpContext.getMessage( " Producto ", "") + AV27Producto ;
                        System.out.println( Gx_msg );
                        GXv_char13[0] = A396EmprCod ;
                        GXv_char12[0] = AV27Producto ;
                        GXv_char7[0] = A763ProForCla ;
                        GXv_int23[0] = AV32PrdVal ;
                        GXv_int16[0] = AV34BarCod ;
                        GXv_int22[0] = AV35BarCodReo ;
                        GXv_char6[0] = AV36BarCodPar ;
                        GXv_decimal14[0] = AV19TotKil ;
                        GXv_char4[0] = AV25PrdDesc ;
                        GXv_char1[0] = AV33Accion ;
                        GXv_int11[0] = AV67BarLinMaq ;
                        new app.pclaesp(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_char7, GXv_int23, GXv_int16, GXv_int22, GXv_char6, GXv_decimal14, GXv_char4, GXv_char1, GXv_int11) ;
                        plchproceso.this.A396EmprCod = GXv_char13[0] ;
                        plchproceso.this.AV27Producto = GXv_char12[0] ;
                        plchproceso.this.A763ProForCla = GXv_char7[0] ;
                        plchproceso.this.AV32PrdVal = GXv_int23[0] ;
                        plchproceso.this.AV34BarCod = GXv_int16[0] ;
                        plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
                        plchproceso.this.AV36BarCodPar = GXv_char6[0] ;
                        plchproceso.this.AV19TotKil = GXv_decimal14[0] ;
                        plchproceso.this.AV25PrdDesc = GXv_char4[0] ;
                        plchproceso.this.AV33Accion = GXv_char1[0] ;
                        plchproceso.this.AV67BarLinMaq = GXv_int11[0] ;
                     }
                     if ( AV32PrdVal == 1 )
                     {
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           AV137LinRecAnt = AV22LinRec ;
                           Gx_msg = httpContext.getMessage( "Lanzo PELIREC..", "") ;
                           System.out.println( Gx_msg );
                           GXv_char13[0] = A396EmprCod ;
                           GXv_int16[0] = AV34BarCod ;
                           GXv_int23[0] = AV35BarCodReo ;
                           GXv_char12[0] = AV36BarCodPar ;
                           GXv_int11[0] = AV22LinRec ;
                           GXv_int10[0] = AV46RecLinIni ;
                           GXv_int5[0] = AV62RecLinMaq ;
                           GXv_int22[0] = AV81RecLinPro ;
                           new app.pelirec(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int23, GXv_char12, GXv_int11, GXv_int10, GXv_int5, GXv_int22) ;
                           plchproceso.this.A396EmprCod = GXv_char13[0] ;
                           plchproceso.this.AV34BarCod = GXv_int16[0] ;
                           plchproceso.this.AV35BarCodReo = GXv_int23[0] ;
                           plchproceso.this.AV36BarCodPar = GXv_char12[0] ;
                           plchproceso.this.AV22LinRec = GXv_int11[0] ;
                           plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                           plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                           plchproceso.this.AV81RecLinPro = GXv_int22[0] ;
                        }
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) && ( ( AV84vFlagMB == 0 ) || ( AV137LinRecAnt != AV22LinRec ) ) )
                        {
                           if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                           {
                              AV27Producto = A770ProForPrd ;
                              AV31Cantidad = A762ProForCan ;
                              AV50ForPrdUme = A490ForPrdUMe ;
                              AV54FlagComp = (byte)(0) ;
                              AV73ProForDes = A765ProForDes ;
                              if ( AV68FlagLw == 1 )
                              {
                                 AV71TanqueN = (byte)(1) ;
                              }
                              if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                              {
                                 AV127MaqTipPrd = httpContext.getMessage( "C", "") ;
                              }
                              else
                              {
                                 AV127MaqTipPrd = httpContext.getMessage( "P", "") ;
                              }
                              /* Execute user subroutine: 'MAQTNQ' */
                              S152 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 /* Close printer file */
                                 /* Close text printer */
                                 out.close();
                                 returnInSub = true;
                                 if (true) return;
                              }
                              if ( AV128MaqTqn > 0 )
                              {
                                 AV71TanqueN = AV128MaqTqn ;
                              }
                              AV121Canfor = A762ProForCan ;
                              if ( ( AV120CdpPor == 1 ) && ( AV119ProForCpo.doubleValue() > 0 ) && ( AV119ProForCpo.doubleValue() <= 100 ) )
                              {
                                 AV121Canfor = (AV121Canfor.multiply(AV119ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                              }
                              Gx_msg = httpContext.getMessage( "Lanzo PEXIPRO..", "") + httpContext.getMessage( "Producto ", "") + A770ProForPrd ;
                              System.out.println( Gx_msg );
                              GXv_char13[0] = A396EmprCod ;
                              GXv_char12[0] = A770ProForPrd ;
                              GXv_decimal14[0] = AV121Canfor ;
                              GXv_int23[0] = A490ForPrdUMe ;
                              GXv_decimal8[0] = AV19TotKil ;
                              GXv_int16[0] = AV17BarVol ;
                              GXv_int15[0] = AV20ValCos ;
                              GXv_int11[0] = AV22LinRec ;
                              GXv_int2[0] = AV34BarCod ;
                              GXv_int22[0] = AV35BarCodReo ;
                              GXv_char7[0] = AV36BarCodPar ;
                              GXv_int21[0] = AV38Flag1 ;
                              GXv_int20[0] = AV39Flag2 ;
                              GXv_int10[0] = AV46RecLinIni ;
                              GXv_int19[0] = AV49Linea ;
                              GXv_int18[0] = AV51ExiCon ;
                              GXv_int17[0] = AV54FlagComp ;
                              GXv_int9[0] = AV63RecForNro ;
                              GXv_int5[0] = AV62RecLinMaq ;
                              GXv_int3[0] = AV71TanqueN ;
                              GXv_char6[0] = AV73ProForDes ;
                              new app.pexipro(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal14, GXv_int23, GXv_decimal8, GXv_int16, GXv_int15, GXv_int11, GXv_int2, GXv_int22, GXv_char7, GXv_int21, GXv_int20, GXv_int10, GXv_int19, GXv_int18, GXv_int17, GXv_int9, GXv_int5, GXv_int3, GXv_char6) ;
                              plchproceso.this.A396EmprCod = GXv_char13[0] ;
                              plchproceso.this.A770ProForPrd = GXv_char12[0] ;
                              plchproceso.this.AV121Canfor = GXv_decimal14[0] ;
                              plchproceso.this.A490ForPrdUMe = GXv_int23[0] ;
                              plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
                              plchproceso.this.AV17BarVol = GXv_int16[0] ;
                              plchproceso.this.AV20ValCos = GXv_int15[0] ;
                              plchproceso.this.AV22LinRec = GXv_int11[0] ;
                              plchproceso.this.AV34BarCod = GXv_int2[0] ;
                              plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
                              plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
                              plchproceso.this.AV38Flag1 = GXv_int21[0] ;
                              plchproceso.this.AV39Flag2 = GXv_int20[0] ;
                              plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                              plchproceso.this.AV49Linea = GXv_int19[0] ;
                              plchproceso.this.AV51ExiCon = GXv_int18[0] ;
                              plchproceso.this.AV54FlagComp = GXv_int17[0] ;
                              plchproceso.this.AV63RecForNro = GXv_int9[0] ;
                              plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                              plchproceso.this.AV71TanqueN = GXv_int3[0] ;
                              plchproceso.this.AV73ProForDes = GXv_char6[0] ;
                              if ( AV88FlagExiPro == 0 )
                              {
                                 /* Execute user subroutine: 'COMPUESTOS' */
                                 S162 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    /* Close printer file */
                                    /* Close text printer */
                                    out.close();
                                    returnInSub = true;
                                    if (true) return;
                                 }
                              }
                              AV54FlagComp = (byte)(0) ;
                           }
                           else
                           {
                              AV73ProForDes = A765ProForDes ;
                              if ( AV68FlagLw == 1 )
                              {
                                 AV71TanqueN = (byte)(1) ;
                              }
                              if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                              {
                                 AV127MaqTipPrd = httpContext.getMessage( "C", "") ;
                              }
                              else
                              {
                                 AV127MaqTipPrd = httpContext.getMessage( "P", "") ;
                              }
                              /* Execute user subroutine: 'MAQTNQ' */
                              S152 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(0);
                                 pr_default.close(0);
                                 /* Close printer file */
                                 /* Close text printer */
                                 out.close();
                                 returnInSub = true;
                                 if (true) return;
                              }
                              if ( AV128MaqTqn > 0 )
                              {
                                 AV71TanqueN = AV128MaqTqn ;
                              }
                              AV27Producto = A770ProForPrd ;
                              AV83LineaRec = GXutil.str( AV22LinRec, 4, 0) ;
                              AV121Canfor = A762ProForCan ;
                              if ( ( AV120CdpPor == 1 ) && ( AV119ProForCpo.doubleValue() > 0 ) && ( AV119ProForCpo.doubleValue() <= 100 ) )
                              {
                                 AV121Canfor = (AV121Canfor.multiply(AV119ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                              }
                              Gx_msg = httpContext.getMessage( "Lanzo PEXIPRO..", "") + httpContext.getMessage( "Producto ", "") + A770ProForPrd ;
                              System.out.println( Gx_msg );
                              GXv_char13[0] = A396EmprCod ;
                              GXv_char12[0] = A770ProForPrd ;
                              GXv_decimal14[0] = AV121Canfor ;
                              GXv_int23[0] = A490ForPrdUMe ;
                              GXv_decimal8[0] = AV19TotKil ;
                              GXv_int16[0] = AV17BarVol ;
                              GXv_int15[0] = AV20ValCos ;
                              GXv_int11[0] = AV22LinRec ;
                              GXv_int2[0] = AV34BarCod ;
                              GXv_int22[0] = AV35BarCodReo ;
                              GXv_char7[0] = AV36BarCodPar ;
                              GXv_int21[0] = AV38Flag1 ;
                              GXv_int20[0] = AV39Flag2 ;
                              GXv_int10[0] = AV46RecLinIni ;
                              GXv_int19[0] = AV49Linea ;
                              GXv_int18[0] = AV51ExiCon ;
                              GXv_int17[0] = AV54FlagComp ;
                              GXv_int9[0] = AV63RecForNro ;
                              GXv_int5[0] = AV62RecLinMaq ;
                              GXv_int3[0] = AV71TanqueN ;
                              GXv_char6[0] = AV73ProForDes ;
                              new app.pexipro(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal14, GXv_int23, GXv_decimal8, GXv_int16, GXv_int15, GXv_int11, GXv_int2, GXv_int22, GXv_char7, GXv_int21, GXv_int20, GXv_int10, GXv_int19, GXv_int18, GXv_int17, GXv_int9, GXv_int5, GXv_int3, GXv_char6) ;
                              plchproceso.this.A396EmprCod = GXv_char13[0] ;
                              plchproceso.this.A770ProForPrd = GXv_char12[0] ;
                              plchproceso.this.AV121Canfor = GXv_decimal14[0] ;
                              plchproceso.this.A490ForPrdUMe = GXv_int23[0] ;
                              plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
                              plchproceso.this.AV17BarVol = GXv_int16[0] ;
                              plchproceso.this.AV20ValCos = GXv_int15[0] ;
                              plchproceso.this.AV22LinRec = GXv_int11[0] ;
                              plchproceso.this.AV34BarCod = GXv_int2[0] ;
                              plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
                              plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
                              plchproceso.this.AV38Flag1 = GXv_int21[0] ;
                              plchproceso.this.AV39Flag2 = GXv_int20[0] ;
                              plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                              plchproceso.this.AV49Linea = GXv_int19[0] ;
                              plchproceso.this.AV51ExiCon = GXv_int18[0] ;
                              plchproceso.this.AV54FlagComp = GXv_int17[0] ;
                              plchproceso.this.AV63RecForNro = GXv_int9[0] ;
                              plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                              plchproceso.this.AV71TanqueN = GXv_int3[0] ;
                              plchproceso.this.AV73ProForDes = GXv_char6[0] ;
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV189GXLvl7 == 0 )
      {
         ToSkip = 1 ;
         AV25PrdDesc = ".." ;
         AV27Producto = "" ;
         Gx_msg = httpContext.getMessage( "Lanzo PRECLI1..", "") + AV27Producto + " " + AV25PrdDesc ;
         System.out.println( Gx_msg );
         GXv_char13[0] = A396EmprCod ;
         GXv_int16[0] = AV34BarCod ;
         GXv_int23[0] = AV35BarCodReo ;
         GXv_char12[0] = AV36BarCodPar ;
         GXv_int11[0] = AV22LinRec ;
         GXv_char7[0] = AV25PrdDesc ;
         GXv_char6[0] = AV27Producto ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int22[0] = AV49Linea ;
         GXv_int10[0] = AV62RecLinMaq ;
         GXv_int5[0] = AV46RecLinIni ;
         new app.precli1(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int23, GXv_char12, GXv_int11, GXv_char7, GXv_char6, GXv_decimal14, GXv_int22, GXv_int10, GXv_int5) ;
         plchproceso.this.A396EmprCod = GXv_char13[0] ;
         plchproceso.this.AV34BarCod = GXv_int16[0] ;
         plchproceso.this.AV35BarCodReo = GXv_int23[0] ;
         plchproceso.this.AV36BarCodPar = GXv_char12[0] ;
         plchproceso.this.AV22LinRec = GXv_int11[0] ;
         plchproceso.this.AV25PrdDesc = GXv_char7[0] ;
         plchproceso.this.AV27Producto = GXv_char6[0] ;
         plchproceso.this.AV49Linea = GXv_int22[0] ;
         plchproceso.this.AV62RecLinMaq = GXv_int10[0] ;
         plchproceso.this.AV46RecLinIni = GXv_int5[0] ;
      }
   }

   public void S142( ) throws ProcessInterruptedException
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P05Z93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV28NumColFor), Byte.valueOf(AV30Ncar), AV42ProForPrd, Byte.valueOf(AV30Ncar)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P05Z93_A719PrdNum[0] ;
         A486ForNumCol = P05Z93_A486ForNumCol[0] ;
         A481ForCan = P05Z93_A481ForCan[0] ;
         A6193ForClaCol = P05Z93_A6193ForClaCol[0] ;
         A718PrdNom = P05Z93_A718PrdNom[0] ;
         A490ForPrdUMe = P05Z93_A490ForPrdUMe[0] ;
         A309ColLin = P05Z93_A309ColLin[0] ;
         A718PrdNom = P05Z93_A718PrdNom[0] ;
         if ( AV68FlagLw == 1 )
         {
            if ( AV70NroTanN == 2 )
            {
               AV71TanqueN = (byte)(2) ;
            }
            else
            {
               AV71TanqueN = (byte)(1) ;
            }
         }
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
         {
            AV127MaqTipPrd = httpContext.getMessage( "C", "") ;
         }
         else
         {
            AV127MaqTipPrd = httpContext.getMessage( "P", "") ;
         }
         /* Execute user subroutine: 'MAQTNQ' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            if (true) return;
         }
         if ( AV128MaqTqn > 0 )
         {
            AV71TanqueN = AV128MaqTqn ;
         }
         AV104ForCan = A481ForCan ;
         if ( AV103FlagTintto == 1 )
         {
            AV104ForCan = A481ForCan.multiply(AV31Cantidad) ;
         }
         if ( AV140Rontaltex.doubleValue() == 1 )
         {
            AV104ForCan = AV104ForCan.add(AV104ForCan.multiply(AV141PartCoef).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         }
         if ( ( AV120CdpPor == 1 ) && ( AV119ProForCpo.doubleValue() > 0 ) && ( AV119ProForCpo.doubleValue() <= 100 ) )
         {
            AV104ForCan = (AV104ForCan.multiply(AV119ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         }
         if ( ( AV126ClaveColor == 1 ) && ! (GXutil.strcmp("", A6193ForClaCol)==0) )
         {
            AV32PrdVal = (byte)(0) ;
            AV25PrdDesc = A718PrdNom ;
            AV27Producto = A719PrdNum ;
            GXv_char13[0] = A396EmprCod ;
            GXv_char12[0] = AV27Producto ;
            GXv_char7[0] = A6193ForClaCol ;
            GXv_int23[0] = AV32PrdVal ;
            GXv_int16[0] = AV34BarCod ;
            GXv_int22[0] = AV35BarCodReo ;
            GXv_char6[0] = AV36BarCodPar ;
            GXv_decimal14[0] = AV19TotKil ;
            GXv_char4[0] = AV25PrdDesc ;
            GXv_char1[0] = AV33Accion ;
            GXv_int11[0] = AV67BarLinMaq ;
            new app.pclaesp(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_char7, GXv_int23, GXv_int16, GXv_int22, GXv_char6, GXv_decimal14, GXv_char4, GXv_char1, GXv_int11) ;
            plchproceso.this.A396EmprCod = GXv_char13[0] ;
            plchproceso.this.AV27Producto = GXv_char12[0] ;
            plchproceso.this.A6193ForClaCol = GXv_char7[0] ;
            plchproceso.this.AV32PrdVal = GXv_int23[0] ;
            plchproceso.this.AV34BarCod = GXv_int16[0] ;
            plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
            plchproceso.this.AV36BarCodPar = GXv_char6[0] ;
            plchproceso.this.AV19TotKil = GXv_decimal14[0] ;
            plchproceso.this.AV25PrdDesc = GXv_char4[0] ;
            plchproceso.this.AV33Accion = GXv_char1[0] ;
            plchproceso.this.AV67BarLinMaq = GXv_int11[0] ;
            if ( AV32PrdVal == 1 )
            {
               if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  GXv_char13[0] = A396EmprCod ;
                  GXv_int16[0] = AV34BarCod ;
                  GXv_int23[0] = AV35BarCodReo ;
                  GXv_char12[0] = AV36BarCodPar ;
                  GXv_int11[0] = AV22LinRec ;
                  GXv_int10[0] = AV46RecLinIni ;
                  GXv_int5[0] = AV62RecLinMaq ;
                  GXv_int22[0] = AV81RecLinPro ;
                  new app.pelirec(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int23, GXv_char12, GXv_int11, GXv_int10, GXv_int5, GXv_int22) ;
                  plchproceso.this.A396EmprCod = GXv_char13[0] ;
                  plchproceso.this.AV34BarCod = GXv_int16[0] ;
                  plchproceso.this.AV35BarCodReo = GXv_int23[0] ;
                  plchproceso.this.AV36BarCodPar = GXv_char12[0] ;
                  plchproceso.this.AV22LinRec = GXv_int11[0] ;
                  plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                  plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                  plchproceso.this.AV81RecLinPro = GXv_int22[0] ;
               }
               if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  AV73ProForDes = A718PrdNom ;
                  if ( AV68FlagLw == 1 )
                  {
                     AV71TanqueN = (byte)(1) ;
                  }
                  AV27Producto = A719PrdNum ;
                  AV83LineaRec = GXutil.str( AV22LinRec, 4, 0) ;
                  Gx_msg = httpContext.getMessage( "Lanzo PEXIPRO..Colorantes", "") + httpContext.getMessage( "Producto ", "") + AV27Producto ;
                  System.out.println( Gx_msg );
                  GXv_char13[0] = A396EmprCod ;
                  GXv_char12[0] = AV27Producto ;
                  GXv_decimal14[0] = AV104ForCan ;
                  GXv_int23[0] = A490ForPrdUMe ;
                  GXv_decimal8[0] = AV19TotKil ;
                  GXv_int16[0] = AV17BarVol ;
                  GXv_int15[0] = AV20ValCos ;
                  GXv_int11[0] = AV22LinRec ;
                  GXv_int2[0] = AV34BarCod ;
                  GXv_int22[0] = AV35BarCodReo ;
                  GXv_char7[0] = AV36BarCodPar ;
                  GXv_int21[0] = AV38Flag1 ;
                  GXv_int20[0] = AV39Flag2 ;
                  GXv_int10[0] = AV46RecLinIni ;
                  GXv_int19[0] = AV49Linea ;
                  GXv_int18[0] = AV51ExiCon ;
                  GXv_int17[0] = AV54FlagComp ;
                  GXv_int9[0] = AV63RecForNro ;
                  GXv_int5[0] = AV62RecLinMaq ;
                  GXv_int3[0] = AV71TanqueN ;
                  GXv_char6[0] = AV73ProForDes ;
                  new app.pexipro(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal14, GXv_int23, GXv_decimal8, GXv_int16, GXv_int15, GXv_int11, GXv_int2, GXv_int22, GXv_char7, GXv_int21, GXv_int20, GXv_int10, GXv_int19, GXv_int18, GXv_int17, GXv_int9, GXv_int5, GXv_int3, GXv_char6) ;
                  plchproceso.this.A396EmprCod = GXv_char13[0] ;
                  plchproceso.this.AV27Producto = GXv_char12[0] ;
                  plchproceso.this.AV104ForCan = GXv_decimal14[0] ;
                  plchproceso.this.A490ForPrdUMe = GXv_int23[0] ;
                  plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
                  plchproceso.this.AV17BarVol = GXv_int16[0] ;
                  plchproceso.this.AV20ValCos = GXv_int15[0] ;
                  plchproceso.this.AV22LinRec = GXv_int11[0] ;
                  plchproceso.this.AV34BarCod = GXv_int2[0] ;
                  plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
                  plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
                  plchproceso.this.AV38Flag1 = GXv_int21[0] ;
                  plchproceso.this.AV39Flag2 = GXv_int20[0] ;
                  plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
                  plchproceso.this.AV49Linea = GXv_int19[0] ;
                  plchproceso.this.AV51ExiCon = GXv_int18[0] ;
                  plchproceso.this.AV54FlagComp = GXv_int17[0] ;
                  plchproceso.this.AV63RecForNro = GXv_int9[0] ;
                  plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
                  plchproceso.this.AV71TanqueN = GXv_int3[0] ;
                  plchproceso.this.AV73ProForDes = GXv_char6[0] ;
               }
            }
         }
         else
         {
            if ( AV105FlagExiSup == 1 )
            {
               GXv_char13[0] = A396EmprCod ;
               GXv_char12[0] = A719PrdNum ;
               GXv_decimal14[0] = AV104ForCan ;
               GXv_int23[0] = A490ForPrdUMe ;
               GXv_decimal8[0] = AV19TotKil ;
               GXv_int16[0] = AV17BarVol ;
               GXv_int15[0] = AV20ValCos ;
               GXv_int11[0] = AV22LinRec ;
               GXv_int2[0] = AV34BarCod ;
               GXv_int22[0] = AV35BarCodReo ;
               GXv_char7[0] = AV36BarCodPar ;
               GXv_int21[0] = AV38Flag1 ;
               GXv_int20[0] = AV39Flag2 ;
               GXv_int10[0] = AV46RecLinIni ;
               GXv_int19[0] = AV49Linea ;
               GXv_int18[0] = AV51ExiCon ;
               GXv_int17[0] = AV54FlagComp ;
               GXv_int9[0] = AV63RecForNro ;
               GXv_int5[0] = AV62RecLinMaq ;
               GXv_int3[0] = AV71TanqueN ;
               GXv_char6[0] = AV73ProForDes ;
               GXv_decimal24[0] = A481ForCan ;
               new app.pexipro3(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal14, GXv_int23, GXv_decimal8, GXv_int16, GXv_int15, GXv_int11, GXv_int2, GXv_int22, GXv_char7, GXv_int21, GXv_int20, GXv_int10, GXv_int19, GXv_int18, GXv_int17, GXv_int9, GXv_int5, GXv_int3, GXv_char6, GXv_decimal24) ;
               plchproceso.this.A396EmprCod = GXv_char13[0] ;
               plchproceso.this.A719PrdNum = GXv_char12[0] ;
               plchproceso.this.AV104ForCan = GXv_decimal14[0] ;
               plchproceso.this.A490ForPrdUMe = GXv_int23[0] ;
               plchproceso.this.AV19TotKil = GXv_decimal8[0] ;
               plchproceso.this.AV17BarVol = GXv_int16[0] ;
               plchproceso.this.AV20ValCos = GXv_int15[0] ;
               plchproceso.this.AV22LinRec = GXv_int11[0] ;
               plchproceso.this.AV34BarCod = GXv_int2[0] ;
               plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
               plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
               plchproceso.this.AV38Flag1 = GXv_int21[0] ;
               plchproceso.this.AV39Flag2 = GXv_int20[0] ;
               plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
               plchproceso.this.AV49Linea = GXv_int19[0] ;
               plchproceso.this.AV51ExiCon = GXv_int18[0] ;
               plchproceso.this.AV54FlagComp = GXv_int17[0] ;
               plchproceso.this.AV63RecForNro = GXv_int9[0] ;
               plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
               plchproceso.this.AV71TanqueN = GXv_int3[0] ;
               plchproceso.this.AV73ProForDes = GXv_char6[0] ;
               plchproceso.this.A481ForCan = GXv_decimal24[0] ;
            }
            else
            {
               Gx_msg = httpContext.getMessage( "Lanzo PEXIPRO..Colorantes", "") + httpContext.getMessage( "Producto ", "") + A719PrdNum ;
               System.out.println( Gx_msg );
               GXv_char13[0] = A396EmprCod ;
               GXv_char12[0] = A719PrdNum ;
               GXv_decimal24[0] = AV104ForCan ;
               GXv_int23[0] = A490ForPrdUMe ;
               GXv_decimal14[0] = AV19TotKil ;
               GXv_int16[0] = AV17BarVol ;
               GXv_int15[0] = AV20ValCos ;
               GXv_int11[0] = AV22LinRec ;
               GXv_int2[0] = AV34BarCod ;
               GXv_int22[0] = AV35BarCodReo ;
               GXv_char7[0] = AV36BarCodPar ;
               GXv_int21[0] = AV38Flag1 ;
               GXv_int20[0] = AV39Flag2 ;
               GXv_int10[0] = AV46RecLinIni ;
               GXv_int19[0] = AV49Linea ;
               GXv_int18[0] = AV51ExiCon ;
               GXv_int17[0] = AV54FlagComp ;
               GXv_int9[0] = AV63RecForNro ;
               GXv_int5[0] = AV62RecLinMaq ;
               GXv_int3[0] = AV71TanqueN ;
               GXv_char6[0] = AV73ProForDes ;
               new app.pexipro(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal24, GXv_int23, GXv_decimal14, GXv_int16, GXv_int15, GXv_int11, GXv_int2, GXv_int22, GXv_char7, GXv_int21, GXv_int20, GXv_int10, GXv_int19, GXv_int18, GXv_int17, GXv_int9, GXv_int5, GXv_int3, GXv_char6) ;
               plchproceso.this.A396EmprCod = GXv_char13[0] ;
               plchproceso.this.A719PrdNum = GXv_char12[0] ;
               plchproceso.this.AV104ForCan = GXv_decimal24[0] ;
               plchproceso.this.A490ForPrdUMe = GXv_int23[0] ;
               plchproceso.this.AV19TotKil = GXv_decimal14[0] ;
               plchproceso.this.AV17BarVol = GXv_int16[0] ;
               plchproceso.this.AV20ValCos = GXv_int15[0] ;
               plchproceso.this.AV22LinRec = GXv_int11[0] ;
               plchproceso.this.AV34BarCod = GXv_int2[0] ;
               plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
               plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
               plchproceso.this.AV38Flag1 = GXv_int21[0] ;
               plchproceso.this.AV39Flag2 = GXv_int20[0] ;
               plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
               plchproceso.this.AV49Linea = GXv_int19[0] ;
               plchproceso.this.AV51ExiCon = GXv_int18[0] ;
               plchproceso.this.AV54FlagComp = GXv_int17[0] ;
               plchproceso.this.AV63RecForNro = GXv_int9[0] ;
               plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
               plchproceso.this.AV71TanqueN = GXv_int3[0] ;
               plchproceso.this.AV73ProForDes = GXv_char6[0] ;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S162( ) throws ProcessInterruptedException
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P05Z94 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV27Producto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A688PrdComCod = P05Z94_A688PrdComCod[0] ;
         A690PrdComFN = P05Z94_A690PrdComFN[0] ;
         A719PrdNum = P05Z94_A719PrdNum[0] ;
         AV53ProForCan = AV31Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV54FlagComp = (byte)(1) ;
         AV73ProForDes = "" ;
         if ( AV50ForPrdUme == 3 )
         {
            AV53ProForCan = AV53ProForCan.multiply(AV19TotKil).multiply(DecimalUtil.doubleToDec(AV20ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV53ProForCan = AV53ProForCan.multiply(DecimalUtil.doubleToDec(AV17BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         GXv_char13[0] = A396EmprCod ;
         GXv_char12[0] = A719PrdNum ;
         GXv_decimal24[0] = AV53ProForCan ;
         new app.pactres(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal24) ;
         plchproceso.this.A396EmprCod = GXv_char13[0] ;
         plchproceso.this.A719PrdNum = GXv_char12[0] ;
         plchproceso.this.AV53ProForCan = GXv_decimal24[0] ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S122( ) throws ProcessInterruptedException
   {
      /* 'CTRL_PE' Routine */
      returnInSub = false ;
      AV118Existe_p = (byte)(0) ;
      /* Using cursor P05Z95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV28NumColFor), Short.valueOf(AV29NumOrd)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A486ForNumCol = P05Z95_A486ForNumCol[0] ;
         A489ForPrdNor = P05Z95_A489ForPrdNor[0] ;
         A715PrdLin = P05Z95_A715PrdLin[0] ;
         AV118Existe_p = (byte)(1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S132( ) throws ProcessInterruptedException
   {
      /* 'ESPECIALES' Routine */
      returnInSub = false ;
      /* Using cursor P05Z96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV28NumColFor), Short.valueOf(AV29NumOrd)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A489ForPrdNor = P05Z96_A489ForPrdNor[0] ;
         A486ForNumCol = P05Z96_A486ForNumCol[0] ;
         A719PrdNum = P05Z96_A719PrdNum[0] ;
         A487ForPrdCan = P05Z96_A487ForPrdCan[0] ;
         A490ForPrdUMe = P05Z96_A490ForPrdUMe[0] ;
         A715PrdLin = P05Z96_A715PrdLin[0] ;
         AV27Producto = A719PrdNum ;
         AV43ForPrdCan = A487ForPrdCan ;
         AV50ForPrdUme = A490ForPrdUMe ;
         if ( AV134Dosi_pp == 1 )
         {
            AV43ForPrdCan = (AV43ForPrdCan.multiply(AV133Porc_p).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( ( AV120CdpPor == 1 ) && ( AV119ProForCpo.doubleValue() > 0 ) && ( AV119ProForCpo.doubleValue() <= 100 ) )
            {
               AV43ForPrdCan = (AV43ForPrdCan.multiply(AV119ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
            if ( AV125Por_can.doubleValue() > 0 )
            {
               AV43ForPrdCan = (AV43ForPrdCan.multiply(AV125Por_can)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         if ( AV68FlagLw == 1 )
         {
            AV71TanqueN = (byte)(1) ;
         }
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
         {
            AV127MaqTipPrd = httpContext.getMessage( "C", "") ;
         }
         else
         {
            AV127MaqTipPrd = httpContext.getMessage( "P", "") ;
         }
         /* Execute user subroutine: 'MAQTNQ' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            if (true) return;
         }
         if ( AV128MaqTqn > 0 )
         {
            AV71TanqueN = AV128MaqTqn ;
         }
         h5Z90( false, 0) ;
         out.print( "" + " " );
         ToSkip = 1 ;
         if ( ! (GXutil.strcmp("", AV27Producto)==0) )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_char12[0] = AV27Producto ;
            GXv_decimal24[0] = AV43ForPrdCan ;
            GXv_int23[0] = AV50ForPrdUme ;
            GXv_decimal14[0] = AV19TotKil ;
            GXv_int16[0] = AV17BarVol ;
            GXv_int15[0] = AV20ValCos ;
            GXv_int11[0] = AV22LinRec ;
            GXv_int2[0] = AV34BarCod ;
            GXv_int22[0] = AV35BarCodReo ;
            GXv_char7[0] = AV36BarCodPar ;
            GXv_int21[0] = AV38Flag1 ;
            GXv_int20[0] = AV39Flag2 ;
            GXv_int10[0] = AV46RecLinIni ;
            GXv_int19[0] = AV49Linea ;
            GXv_int18[0] = AV51ExiCon ;
            GXv_int17[0] = AV54FlagComp ;
            GXv_int9[0] = AV63RecForNro ;
            GXv_int5[0] = AV62RecLinMaq ;
            GXv_int3[0] = AV71TanqueN ;
            GXv_char6[0] = AV73ProForDes ;
            new app.pexipro(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal24, GXv_int23, GXv_decimal14, GXv_int16, GXv_int15, GXv_int11, GXv_int2, GXv_int22, GXv_char7, GXv_int21, GXv_int20, GXv_int10, GXv_int19, GXv_int18, GXv_int17, GXv_int9, GXv_int5, GXv_int3, GXv_char6) ;
            plchproceso.this.A396EmprCod = GXv_char13[0] ;
            plchproceso.this.AV27Producto = GXv_char12[0] ;
            plchproceso.this.AV43ForPrdCan = GXv_decimal24[0] ;
            plchproceso.this.AV50ForPrdUme = GXv_int23[0] ;
            plchproceso.this.AV19TotKil = GXv_decimal14[0] ;
            plchproceso.this.AV17BarVol = GXv_int16[0] ;
            plchproceso.this.AV20ValCos = GXv_int15[0] ;
            plchproceso.this.AV22LinRec = GXv_int11[0] ;
            plchproceso.this.AV34BarCod = GXv_int2[0] ;
            plchproceso.this.AV35BarCodReo = GXv_int22[0] ;
            plchproceso.this.AV36BarCodPar = GXv_char7[0] ;
            plchproceso.this.AV38Flag1 = GXv_int21[0] ;
            plchproceso.this.AV39Flag2 = GXv_int20[0] ;
            plchproceso.this.AV46RecLinIni = GXv_int10[0] ;
            plchproceso.this.AV49Linea = GXv_int19[0] ;
            plchproceso.this.AV51ExiCon = GXv_int18[0] ;
            plchproceso.this.AV54FlagComp = GXv_int17[0] ;
            plchproceso.this.AV63RecForNro = GXv_int9[0] ;
            plchproceso.this.AV62RecLinMaq = GXv_int5[0] ;
            plchproceso.this.AV71TanqueN = GXv_int3[0] ;
            plchproceso.this.AV73ProForDes = GXv_char6[0] ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S152( ) throws ProcessInterruptedException
   {
      /* 'MAQTNQ' Routine */
      returnInSub = false ;
      AV128MaqTqn = (byte)(0) ;
      /* Using cursor P05Z97 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV15BarMaqCod, AV127MaqTipPrd});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A602MaqCod = P05Z97_A602MaqCod[0] ;
         A6261MaqTipPrd = P05Z97_A6261MaqTipPrd[0] ;
         n6261MaqTipPrd = P05Z97_n6261MaqTipPrd[0] ;
         A6260MaqTqn = P05Z97_A6260MaqTqn[0] ;
         AV128MaqTqn = A6260MaqTqn ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void h5Z90( boolean bFoot ,
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
               out.print("\f");
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top)) ;
            /* Print headers */
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            out.print( "\n" );
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = plchproceso.this.A396EmprCod;
      this.aP1[0] = plchproceso.this.AV34BarCod;
      this.aP2[0] = plchproceso.this.AV35BarCodReo;
      this.aP3[0] = plchproceso.this.AV36BarCodPar;
      this.aP4[0] = plchproceso.this.AV62RecLinMaq;
      this.aP5[0] = plchproceso.this.AV37ProForCod;
      this.aP6[0] = plchproceso.this.AV49Linea;
      this.aP7[0] = plchproceso.this.AV15BarMaqCod;
      this.aP8[0] = plchproceso.this.AV17BarVol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A6062ProForCPo = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05Z92_A396EmprCod = new String[] {""} ;
      P05Z92_A764ProForCod = new String[] {""} ;
      P05Z92_A1645ProForNro = new byte[1] ;
      P05Z92_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Z92_A3379ProForTnq = new byte[1] ;
      P05Z92_A772ProForTmx = new short[1] ;
      P05Z92_A770ProForPrd = new String[] {""} ;
      P05Z92_A765ProForDes = new String[] {""} ;
      P05Z92_A5358ProForClv = new String[] {""} ;
      P05Z92_A763ProForCla = new String[] {""} ;
      P05Z92_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Z92_A490ForPrdUMe = new byte[1] ;
      P05Z92_A767ProForLin = new short[1] ;
      A764ProForCod = "" ;
      AV119ProForCpo = DecimalUtil.ZERO ;
      AV73ProForDes = "" ;
      AV25PrdDesc = "" ;
      AV27Producto = "" ;
      Gx_msg = "" ;
      AV132llamo_pe = "" ;
      AV19TotKil = DecimalUtil.ZERO ;
      AV33Accion = "" ;
      AV133Porc_p = DecimalUtil.ZERO ;
      AV125Por_can = DecimalUtil.ZERO ;
      AV44Produc = "" ;
      AV31Cantidad = DecimalUtil.ZERO ;
      AV42ProForPrd = "" ;
      AV82Calve = "" ;
      AV127MaqTipPrd = "" ;
      AV121Canfor = DecimalUtil.ZERO ;
      AV83LineaRec = "" ;
      P05Z93_A396EmprCod = new String[] {""} ;
      P05Z93_A719PrdNum = new String[] {""} ;
      P05Z93_A486ForNumCol = new int[1] ;
      P05Z93_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Z93_A6193ForClaCol = new String[] {""} ;
      P05Z93_A718PrdNom = new String[] {""} ;
      P05Z93_A490ForPrdUMe = new byte[1] ;
      P05Z93_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A6193ForClaCol = "" ;
      A718PrdNom = "" ;
      AV104ForCan = DecimalUtil.ZERO ;
      AV140Rontaltex = DecimalUtil.ZERO ;
      AV141PartCoef = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      P05Z94_A396EmprCod = new String[] {""} ;
      P05Z94_A688PrdComCod = new String[] {""} ;
      P05Z94_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Z94_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      AV53ProForCan = DecimalUtil.ZERO ;
      P05Z95_A396EmprCod = new String[] {""} ;
      P05Z95_A486ForNumCol = new int[1] ;
      P05Z95_A489ForPrdNor = new short[1] ;
      P05Z95_A715PrdLin = new short[1] ;
      P05Z96_A396EmprCod = new String[] {""} ;
      P05Z96_A489ForPrdNor = new short[1] ;
      P05Z96_A486ForNumCol = new int[1] ;
      P05Z96_A719PrdNum = new String[] {""} ;
      P05Z96_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Z96_A490ForPrdUMe = new byte[1] ;
      P05Z96_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV43ForPrdCan = DecimalUtil.ZERO ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_int23 = new byte[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int16 = new int[1] ;
      GXv_int15 = new int[1] ;
      GXv_int11 = new short[1] ;
      GXv_int2 = new int[1] ;
      GXv_int22 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int21 = new byte[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int10 = new short[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int18 = new byte[1] ;
      GXv_int17 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int5 = new short[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char6 = new String[1] ;
      P05Z97_A396EmprCod = new String[] {""} ;
      P05Z97_A602MaqCod = new String[] {""} ;
      P05Z97_A6261MaqTipPrd = new String[] {""} ;
      P05Z97_n6261MaqTipPrd = new boolean[] {false} ;
      P05Z97_A6260MaqTqn = new byte[1] ;
      A602MaqCod = "" ;
      A6261MaqTipPrd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plchproceso__default(),
         new Object[] {
             new Object[] {
            P05Z92_A396EmprCod, P05Z92_A764ProForCod, P05Z92_A1645ProForNro, P05Z92_A6062ProForCPo, P05Z92_A3379ProForTnq, P05Z92_A772ProForTmx, P05Z92_A770ProForPrd, P05Z92_A765ProForDes, P05Z92_A5358ProForClv, P05Z92_A763ProForCla,
            P05Z92_A762ProForCan, P05Z92_A490ForPrdUMe, P05Z92_A767ProForLin
            }
            , new Object[] {
            P05Z93_A396EmprCod, P05Z93_A719PrdNum, P05Z93_A486ForNumCol, P05Z93_A481ForCan, P05Z93_A6193ForClaCol, P05Z93_A718PrdNom, P05Z93_A490ForPrdUMe, P05Z93_A309ColLin
            }
            , new Object[] {
            P05Z94_A396EmprCod, P05Z94_A688PrdComCod, P05Z94_A690PrdComFN, P05Z94_A719PrdNum
            }
            , new Object[] {
            P05Z95_A396EmprCod, P05Z95_A486ForNumCol, P05Z95_A489ForPrdNor, P05Z95_A715PrdLin
            }
            , new Object[] {
            P05Z96_A396EmprCod, P05Z96_A489ForPrdNor, P05Z96_A486ForNumCol, P05Z96_A719PrdNum, P05Z96_A487ForPrdCan, P05Z96_A490ForPrdUMe, P05Z96_A715PrdLin
            }
            , new Object[] {
            P05Z97_A396EmprCod, P05Z97_A602MaqCod, P05Z97_A6261MaqTipPrd, P05Z97_n6261MaqTipPrd, P05Z97_A6260MaqTqn
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV35BarCodReo ;
   private byte AV49Linea ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte A490ForPrdUMe ;
   private byte AV189GXLvl7 ;
   private byte AV63RecForNro ;
   private byte AV75TnqPro ;
   private byte AV71TanqueN ;
   private byte AV48FlagTemp ;
   private byte AV50ForPrdUme ;
   private byte AV32PrdVal ;
   private byte AV134Dosi_pp ;
   private byte AV118Existe_p ;
   private byte AV81RecLinPro ;
   private byte AV30Ncar ;
   private byte AV54FlagComp ;
   private byte AV68FlagLw ;
   private byte AV128MaqTqn ;
   private byte AV120CdpPor ;
   private byte AV38Flag1 ;
   private byte AV39Flag2 ;
   private byte AV51ExiCon ;
   private byte AV88FlagExiPro ;
   private byte AV84vFlagMB ;
   private byte AV70NroTanN ;
   private byte AV103FlagTintto ;
   private byte AV126ClaveColor ;
   private byte AV105FlagExiSup ;
   private byte GXv_int23[] ;
   private byte GXv_int22[] ;
   private byte GXv_int21[] ;
   private byte GXv_int20[] ;
   private byte GXv_int19[] ;
   private byte GXv_int18[] ;
   private byte GXv_int17[] ;
   private byte GXv_int9[] ;
   private byte GXv_int3[] ;
   private byte A6260MaqTqn ;
   private short AV62RecLinMaq ;
   private short A772ProForTmx ;
   private short A767ProForLin ;
   private short AV23TempMax ;
   private short AV22LinRec ;
   private short AV46RecLinIni ;
   private short AV29NumOrd ;
   private short AV67BarLinMaq ;
   private short AV137LinRecAnt ;
   private short A309ColLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short GXv_int11[] ;
   private short GXv_int10[] ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV34BarCod ;
   private int AV17BarVol ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int AV20ValCos ;
   private int AV28NumColFor ;
   private int A486ForNumCol ;
   private int GXv_int16[] ;
   private int GXv_int15[] ;
   private int GXv_int2[] ;
   private int Gx_page ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV119ProForCpo ;
   private java.math.BigDecimal AV19TotKil ;
   private java.math.BigDecimal AV133Porc_p ;
   private java.math.BigDecimal AV125Por_can ;
   private java.math.BigDecimal AV31Cantidad ;
   private java.math.BigDecimal AV121Canfor ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV104ForCan ;
   private java.math.BigDecimal AV140Rontaltex ;
   private java.math.BigDecimal AV141PartCoef ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV53ProForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV43ForPrdCan ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String A396EmprCod ;
   private String AV36BarCodPar ;
   private String AV37ProForCod ;
   private String AV15BarMaqCod ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String AV73ProForDes ;
   private String AV25PrdDesc ;
   private String AV27Producto ;
   private String Gx_msg ;
   private String AV132llamo_pe ;
   private String AV33Accion ;
   private String AV44Produc ;
   private String AV42ProForPrd ;
   private String AV82Calve ;
   private String AV127MaqTipPrd ;
   private String AV83LineaRec ;
   private String A719PrdNum ;
   private String A6193ForClaCol ;
   private String A718PrdNom ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String A688PrdComCod ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String A602MaqCod ;
   private String A6261MaqTipPrd ;
   private boolean returnInSub ;
   private boolean n6261MaqTipPrd ;
   private int[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05Z92_A396EmprCod ;
   private String[] P05Z92_A764ProForCod ;
   private byte[] P05Z92_A1645ProForNro ;
   private java.math.BigDecimal[] P05Z92_A6062ProForCPo ;
   private byte[] P05Z92_A3379ProForTnq ;
   private short[] P05Z92_A772ProForTmx ;
   private String[] P05Z92_A770ProForPrd ;
   private String[] P05Z92_A765ProForDes ;
   private String[] P05Z92_A5358ProForClv ;
   private String[] P05Z92_A763ProForCla ;
   private java.math.BigDecimal[] P05Z92_A762ProForCan ;
   private byte[] P05Z92_A490ForPrdUMe ;
   private short[] P05Z92_A767ProForLin ;
   private String[] P05Z93_A396EmprCod ;
   private String[] P05Z93_A719PrdNum ;
   private int[] P05Z93_A486ForNumCol ;
   private java.math.BigDecimal[] P05Z93_A481ForCan ;
   private String[] P05Z93_A6193ForClaCol ;
   private String[] P05Z93_A718PrdNom ;
   private byte[] P05Z93_A490ForPrdUMe ;
   private short[] P05Z93_A309ColLin ;
   private String[] P05Z94_A396EmprCod ;
   private String[] P05Z94_A688PrdComCod ;
   private java.math.BigDecimal[] P05Z94_A690PrdComFN ;
   private String[] P05Z94_A719PrdNum ;
   private String[] P05Z95_A396EmprCod ;
   private int[] P05Z95_A486ForNumCol ;
   private short[] P05Z95_A489ForPrdNor ;
   private short[] P05Z95_A715PrdLin ;
   private String[] P05Z96_A396EmprCod ;
   private short[] P05Z96_A489ForPrdNor ;
   private int[] P05Z96_A486ForNumCol ;
   private String[] P05Z96_A719PrdNum ;
   private java.math.BigDecimal[] P05Z96_A487ForPrdCan ;
   private byte[] P05Z96_A490ForPrdUMe ;
   private short[] P05Z96_A715PrdLin ;
   private String[] P05Z97_A396EmprCod ;
   private String[] P05Z97_A602MaqCod ;
   private String[] P05Z97_A6261MaqTipPrd ;
   private boolean[] P05Z97_n6261MaqTipPrd ;
   private byte[] P05Z97_A6260MaqTqn ;
}

final  class plchproceso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Z92", "SELECT T1.EmprCod, T1.ProForCod, T1.ProForNro, T1.ProForCPo, T1.ProForTnq, T2.ProForTmx, T1.ProForPrd, T1.ProForDes, T1.ProForClv, T1.ProForCla, T1.ProForCan, T1.ForPrdUMe, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Z93", "SELECT T1.EmprCod, T1.PrdNum, T1.ForNumCol, T1.ForCan, T1.ForClaCol, T2.PrdNom, T1.ForPrdUMe, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Z94", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND (PrdComCod = ?) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Z95", "SELECT EmprCod, ForNumCol, ForPrdNor, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? and ForPrdNor = ? ORDER BY EmprCod, ForNumCol, ForPrdNor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Z96", "SELECT EmprCod, ForPrdNor, ForNumCol, PrdNum, ForPrdCan, ForPrdUMe, PrdLin FROM TXPLPRFOR WHERE (EmprCod = ? and ForNumCol = ?) AND (ForPrdNor = ?) ORDER BY EmprCod, ForNumCol, PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Z97", "SELECT EmprCod, MaqCod, MaqTipPrd, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? and MaqCod = ? and MaqTipPrd = ? ORDER BY EmprCod, MaqCod, MaqTipPrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

