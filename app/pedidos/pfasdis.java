package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasdis extends GXProcedure
{
   public pfasdis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasdis.class ), "" );
   }

   public pfasdis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int aP1 )
   {
      pfasdis.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      pfasdis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasdis.this.AV15DisCod = aP1;
      pfasdis.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20JBP ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBP", ""), GXv_int2) ;
      pfasdis.this.GXt_int1 = GXv_int2[0] ;
      AV20JBP = GXt_int1 ;
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV21Artextil)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pfasdis.this.GXt_int1 = GXv_int2[0] ;
      AV21Artextil = DecimalUtil.doubleToDec(GXt_int1) ;
      GXt_int1 = AV27Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      pfasdis.this.GXt_int1 = GXv_int2[0] ;
      AV27Torient = GXt_int1 ;
      GXt_int1 = AV29Parfss ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PARFSS", ""), GXv_int2) ;
      pfasdis.this.GXt_int1 = GXv_int2[0] ;
      AV29Parfss = GXt_int1 ;
      GXt_int3 = AV30Valor ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PARFSS", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pfasdis.this.A396EmprCod = GXv_char4[0] ;
      pfasdis.this.GXt_int3 = GXv_int6[0] ;
      AV30Valor = GXt_int3 ;
      GXt_int1 = AV31Acabats2013 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int2) ;
      pfasdis.this.GXt_int1 = GXv_int2[0] ;
      AV31Acabats2013 = GXt_int1 ;
      GXt_int1 = AV33PqfdesdeFases ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQFRFS", ""), GXv_int2) ;
      pfasdis.this.GXt_int1 = GXv_int2[0] ;
      AV33PqfdesdeFases = GXt_int1 ;
      /* Using cursor P000T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P000T2_A361DisCod[0] ;
         A252CliCod = P000T2_A252CliCod[0] ;
         A335DisArtCod = P000T2_A335DisArtCod[0] ;
         AV17CliCod = A252CliCod ;
         AV18DisartCod = A335DisArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV28Act_nrq = (byte)(0) ;
      /* Using cursor P000T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5735ProFasNot = P000T3_A5735ProFasNot[0] ;
         n5735ProFasNot = P000T3_n5735ProFasNot[0] ;
         A774ProNumLin = P000T3_A774ProNumLin[0] ;
         A7744FasPreObl = P000T3_A7744FasPreObl[0] ;
         n7744FasPreObl = P000T3_n7744FasPreObl[0] ;
         A457FasCod = P000T3_A457FasCod[0] ;
         A602MaqCod = P000T3_A602MaqCod[0] ;
         n602MaqCod = P000T3_n602MaqCod[0] ;
         A7744FasPreObl = P000T3_A7744FasPreObl[0] ;
         n7744FasPreObl = P000T3_n7744FasPreObl[0] ;
         A602MaqCod = P000T3_A602MaqCod[0] ;
         n602MaqCod = P000T3_n602MaqCod[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         AV16FasCod = A457FasCod ;
         AV32MaqCod = A602MaqCod ;
         AV19ProNumLin = A774ProNumLin ;
         AV24Procod = A758ProCod ;
         AV25Emprcod = A396EmprCod ;
         /* Execute user subroutine: 'ARTFOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV26Num_rq > 1 )
         {
            AV28Act_nrq = (byte)(1) ;
         }
         /*
            INSERT RECORD ON TABLE TXPDISFAS

         */
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         A361DisCod = AV15DisCod ;
         A368DisFasLin = A774ProNumLin ;
         A457FasCod = AV16FasCod ;
         A3697FasApr = httpContext.getMessage( "N", "") ;
         A5304DisPreSal = (short)(0) ;
         n5304DisPreSal = false ;
         A5305DisPrePie = (short)(0) ;
         n5305DisPrePie = false ;
         A5306DisVelPro = DecimalUtil.doubleToDec(0) ;
         n5306DisVelPro = false ;
         A5307DisNumPas = (short)(0) ;
         n5307DisNumPas = false ;
         A5376DisQuiUl = (short)(0) ;
         /* Using cursor P000T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, A3697FasApr, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A758ProCod = W758ProCod ;
         A457FasCod = W457FasCod ;
         /* End Insert */
         if ( AV21Artextil.doubleValue() == 1 )
         {
            AV19ProNumLin = A774ProNumLin ;
            /* Using cursor P000T5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV15DisCod), A758ProCod, Short.valueOf(AV19ProNumLin), A457FasCod, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A368DisFasLin = P000T5_A368DisFasLin[0] ;
               A361DisCod = P000T5_A361DisCod[0] ;
               A7740DisFasPre = P000T5_A7740DisFasPre[0] ;
               n7740DisFasPre = P000T5_n7740DisFasPre[0] ;
               A7742DisFasDto = P000T5_A7742DisFasDto[0] ;
               n7742DisFasDto = P000T5_n7742DisFasDto[0] ;
               A7741DisFasUni = P000T5_A7741DisFasUni[0] ;
               n7741DisFasUni = P000T5_n7741DisFasUni[0] ;
               GXt_int7 = (long)(DecimalUtil.decToDouble(A7740DisFasPre)) ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A361DisCod ;
               GXv_char4[0] = A457FasCod ;
               GXv_int8[0] = (short)(0) ;
               GXv_char9[0] = httpContext.getMessage( "P", "") ;
               GXv_int10[0] = GXt_int7 ;
               new app.partpre(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char4, GXv_int8, GXv_char9, GXv_int10) ;
               pfasdis.this.A396EmprCod = GXv_char5[0] ;
               pfasdis.this.A361DisCod = GXv_int6[0] ;
               pfasdis.this.A457FasCod = GXv_char4[0] ;
               pfasdis.this.GXt_int7 = GXv_int10[0] ;
               A7740DisFasPre = DecimalUtil.doubleToDec(GXt_int7) ;
               n7740DisFasPre = false ;
               GXt_int7 = (long)(DecimalUtil.decToDouble(A7742DisFasDto)) ;
               GXv_char9[0] = A396EmprCod ;
               GXv_int6[0] = A361DisCod ;
               GXv_char5[0] = A457FasCod ;
               GXv_int8[0] = (short)(0) ;
               GXv_char4[0] = httpContext.getMessage( "D", "") ;
               GXv_int10[0] = GXt_int7 ;
               new app.partpre(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char5, GXv_int8, GXv_char4, GXv_int10) ;
               pfasdis.this.A396EmprCod = GXv_char9[0] ;
               pfasdis.this.A361DisCod = GXv_int6[0] ;
               pfasdis.this.A457FasCod = GXv_char5[0] ;
               pfasdis.this.GXt_int7 = GXv_int10[0] ;
               A7742DisFasDto = DecimalUtil.doubleToDec(GXt_int7) ;
               n7742DisFasDto = false ;
               GXt_char11 = A7741DisFasUni ;
               GXv_char9[0] = A396EmprCod ;
               GXv_int6[0] = A361DisCod ;
               GXv_char5[0] = A457FasCod ;
               GXv_int8[0] = (short)(0) ;
               GXv_char4[0] = httpContext.getMessage( "T", "") ;
               GXv_char12[0] = GXt_char11 ;
               new app.partpre2(remoteHandle, context).execute( GXv_char9, GXv_int6, GXv_char5, GXv_int8, GXv_char4, GXv_char12) ;
               pfasdis.this.A396EmprCod = GXv_char9[0] ;
               pfasdis.this.A361DisCod = GXv_int6[0] ;
               pfasdis.this.A457FasCod = GXv_char5[0] ;
               pfasdis.this.GXt_char11 = GXv_char12[0] ;
               A7741DisFasUni = GXt_char11 ;
               n7741DisFasUni = false ;
               /* Using cursor P000T6 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
         }
         if ( ( AV29Parfss == 1 ) && ( AV30Valor == 1 ) )
         {
            if ( AV31Acabats2013 == 1 )
            {
               /* Using cursor P000T7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV17CliCod), AV18DisartCod, AV24Procod, AV16FasCod, AV32MaqCod});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A9828ParFMVal = P000T7_A9828ParFMVal[0] ;
                  A9829ParFMObs = P000T7_A9829ParFMObs[0] ;
                  A14077ParFMVal2 = P000T7_A14077ParFMVal2[0] ;
                  A14075ParFMVMin = P000T7_A14075ParFMVMin[0] ;
                  A14076ParFMVMax = P000T7_A14076ParFMVMax[0] ;
                  A14080ParFasPLC = P000T7_A14080ParFasPLC[0] ;
                  A1664ParFasCod = P000T7_A1664ParFasCod[0] ;
                  A9830MaqCodC = P000T7_A9830MaqCodC[0] ;
                  A9836FasCodM = P000T7_A9836FasCodM[0] ;
                  A758ProCod = P000T7_A758ProCod[0] ;
                  A65ArtCod = P000T7_A65ArtCod[0] ;
                  A252CliCod = P000T7_A252CliCod[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  /*
                     INSERT RECORD ON TABLE TXPDISPAR

                  */
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  W1664ParFasCod = A1664ParFasCod ;
                  A396EmprCod = AV25Emprcod ;
                  A361DisCod = AV15DisCod ;
                  A758ProCod = AV24Procod ;
                  A368DisFasLin = AV19ProNumLin ;
                  A3685DisParVal = A9828ParFMVal ;
                  A3686DisParObs = A9829ParFMObs ;
                  A12672DisParVl2 = A14077ParFMVal2 ;
                  A13989DisParVMn = A14075ParFMVMin ;
                  A13990DisParVMx = A14076ParFMVMax ;
                  A14078DisParPLC = A14080ParFasPLC ;
                  /* Using cursor P000T8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs, A12672DisParVl2, A13989DisParVMn, A13990DisParVMx, A14078DisParPLC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
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
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  A1664ParFasCod = W1664ParFasCod ;
                  /* End Insert */
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
            }
         }
         else
         {
            /* Using cursor P000T9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV17CliCod), AV18DisartCod, A758ProCod, A457FasCod});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A1668ParFasVal = P000T9_A1668ParFasVal[0] ;
               A1673ParFasObs = P000T9_A1673ParFasObs[0] ;
               A12670ParFasVl2 = P000T9_A12670ParFasVl2[0] ;
               A13220ParOrden = P000T9_A13220ParOrden[0] ;
               A1664ParFasCod = P000T9_A1664ParFasCod[0] ;
               A65ArtCod = P000T9_A65ArtCod[0] ;
               A252CliCod = P000T9_A252CliCod[0] ;
               /*
                  INSERT RECORD ON TABLE TXPDISPAR

               */
               A361DisCod = AV15DisCod ;
               A368DisFasLin = A774ProNumLin ;
               A3685DisParVal = A1668ParFasVal ;
               A3686DisParObs = A1673ParFasObs ;
               A12672DisParVl2 = A12670ParFasVl2 ;
               A6557DisParOrd = A13220ParOrden ;
               /* Using cursor P000T10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs, Short.valueOf(A6557DisParOrd), A12672DisParVl2});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
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
               pr_default.readNext(7);
            }
            pr_default.close(7);
         }
         if ( ( AV20JBP == 1 ) && ! (GXutil.strcmp("", A5735ProFasNot)==0) )
         {
            /*
               INSERT RECORD ON TABLE TXPDISPAR

            */
            A361DisCod = AV15DisCod ;
            A368DisFasLin = A774ProNumLin ;
            A1664ParFasCod = (short)(111) ;
            A3687DisParTxt = A5735ProFasNot ;
            /* Using cursor P000T11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3687DisParTxt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
            if ( (pr_default.getStatus(9) == 1) )
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
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( ( AV27Torient == 1 ) && ( AV28Act_nrq == 1 ) )
      {
         Gx_msg = httpContext.getMessage( "ATENCION. Hay una FASE con mas de UN METODO ¡¡¡", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      if ( AV20JBP == 1 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P000T12 */
         pr_default.execute(10, new Object[] {Short.valueOf(AV19ProNumLin), A396EmprCod, Integer.valueOf(AV15DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      if ( AV33PqfdesdeFases == 1 )
      {
         AV23Disquilin = (short)(1) ;
         /* Using cursor P000T13 */
         pr_default.execute(11, new Object[] {AV25Emprcod, AV16FasCod});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A456FasActTin = P000T13_A456FasActTin[0] ;
            n456FasActTin = P000T13_n456FasActTin[0] ;
            A4286FasForMul = P000T13_A4286FasForMul[0] ;
            n4286FasForMul = P000T13_n4286FasForMul[0] ;
            A457FasCod = P000T13_A457FasCod[0] ;
            A764ProForCod = P000T13_A764ProForCod[0] ;
            A4650FasForLin = P000T13_A4650FasForLin[0] ;
            A456FasActTin = P000T13_A456FasActTin[0] ;
            n456FasActTin = P000T13_n456FasActTin[0] ;
            A4286FasForMul = P000T13_A4286FasForMul[0] ;
            n4286FasForMul = P000T13_n4286FasForMul[0] ;
            if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
            {
               AV22ARTPROCOD = A764ProForCod ;
               /* Execute user subroutine: 'CREODISQUI' */
               S1212 ();
               if ( returnInSub )
               {
                  pr_default.close(11);
                  pr_default.close(11);
                  returnInSub = true;
                  if (true) return;
               }
            }
            pr_default.readNext(11);
         }
         pr_default.close(11);
      }
      else
      {
         AV22ARTPROCOD = " " ;
         AV23Disquilin = (short)(1) ;
         AV26Num_rq = (short)(0) ;
         /* Using cursor P000T14 */
         pr_default.execute(12, new Object[] {AV25Emprcod, Integer.valueOf(AV17CliCod), AV18DisartCod, AV24Procod});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A65ArtCod = P000T14_A65ArtCod[0] ;
            A252CliCod = P000T14_A252CliCod[0] ;
            A4898ArtProCod = P000T14_A4898ArtProCod[0] ;
            A457FasCod = P000T14_A457FasCod[0] ;
            A456FasActTin = P000T14_A456FasActTin[0] ;
            n456FasActTin = P000T14_n456FasActTin[0] ;
            A4286FasForMul = P000T14_A4286FasForMul[0] ;
            n4286FasForMul = P000T14_n4286FasForMul[0] ;
            A4897ArtProLin = P000T14_A4897ArtProLin[0] ;
            A456FasActTin = P000T14_A456FasActTin[0] ;
            n456FasActTin = P000T14_n456FasActTin[0] ;
            A4286FasForMul = P000T14_A4286FasForMul[0] ;
            n4286FasForMul = P000T14_n4286FasForMul[0] ;
            AV22ARTPROCOD = A4898ArtProCod ;
            if ( GXutil.strcmp(AV16FasCod, A457FasCod) == 0 )
            {
               if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
               {
                  /* Execute user subroutine: 'CREODISQUI' */
                  S1212 ();
                  if ( returnInSub )
                  {
                     pr_default.close(12);
                     pr_default.close(12);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV26Num_rq = (short)(AV26Num_rq+1) ;
               }
            }
            pr_default.readNext(12);
         }
         pr_default.close(12);
      }
   }

   public void S1212( )
   {
      /* 'CREODISQUI' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPDISQUI

      */
      A396EmprCod = AV25Emprcod ;
      A361DisCod = AV15DisCod ;
      A758ProCod = AV24Procod ;
      A368DisFasLin = AV19ProNumLin ;
      A5377DisQuiLin = AV23Disquilin ;
      A764ProForCod = AV22ARTPROCOD ;
      A5378DisQuiNp = (short)(0) ;
      A5379DisQuiTp = (short)(0) ;
      A5380DisQuiRb = (short)(0) ;
      A5489DisQuiDsc = " " ;
      /* Using cursor P000T15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
      if ( (pr_default.getStatus(13) == 1) )
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
      AV23Disquilin = (short)(AV23Disquilin+1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasdis.this.A396EmprCod;
      this.aP2[0] = pfasdis.this.A758ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.pfasdis");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Artextil = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P000T2_A396EmprCod = new String[] {""} ;
      P000T2_A361DisCod = new int[1] ;
      P000T2_A252CliCod = new int[1] ;
      P000T2_A335DisArtCod = new String[] {""} ;
      A335DisArtCod = "" ;
      AV18DisartCod = "" ;
      P000T3_A396EmprCod = new String[] {""} ;
      P000T3_A758ProCod = new String[] {""} ;
      P000T3_A5735ProFasNot = new String[] {""} ;
      P000T3_n5735ProFasNot = new boolean[] {false} ;
      P000T3_A774ProNumLin = new short[1] ;
      P000T3_A7744FasPreObl = new byte[1] ;
      P000T3_n7744FasPreObl = new boolean[] {false} ;
      P000T3_A457FasCod = new String[] {""} ;
      P000T3_A602MaqCod = new String[] {""} ;
      P000T3_n602MaqCod = new boolean[] {false} ;
      A5735ProFasNot = "" ;
      A457FasCod = "" ;
      A602MaqCod = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      AV16FasCod = "" ;
      AV32MaqCod = "" ;
      AV24Procod = "" ;
      AV25Emprcod = "" ;
      W457FasCod = "" ;
      A3697FasApr = "" ;
      A5306DisVelPro = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P000T5_A396EmprCod = new String[] {""} ;
      P000T5_A758ProCod = new String[] {""} ;
      P000T5_A457FasCod = new String[] {""} ;
      P000T5_A7744FasPreObl = new byte[1] ;
      P000T5_n7744FasPreObl = new boolean[] {false} ;
      P000T5_A368DisFasLin = new short[1] ;
      P000T5_A361DisCod = new int[1] ;
      P000T5_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000T5_n7740DisFasPre = new boolean[] {false} ;
      P000T5_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000T5_n7742DisFasDto = new boolean[] {false} ;
      P000T5_A7741DisFasUni = new String[] {""} ;
      P000T5_n7741DisFasUni = new boolean[] {false} ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      GXv_int10 = new long[1] ;
      GXt_char11 = "" ;
      GXv_char9 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char12 = new String[1] ;
      P000T7_A396EmprCod = new String[] {""} ;
      P000T7_A9828ParFMVal = new String[] {""} ;
      P000T7_A9829ParFMObs = new String[] {""} ;
      P000T7_A14077ParFMVal2 = new String[] {""} ;
      P000T7_A14075ParFMVMin = new String[] {""} ;
      P000T7_A14076ParFMVMax = new String[] {""} ;
      P000T7_A14080ParFasPLC = new String[] {""} ;
      P000T7_A1664ParFasCod = new short[1] ;
      P000T7_A9830MaqCodC = new String[] {""} ;
      P000T7_A9836FasCodM = new String[] {""} ;
      P000T7_A758ProCod = new String[] {""} ;
      P000T7_A65ArtCod = new String[] {""} ;
      P000T7_A252CliCod = new int[1] ;
      A9828ParFMVal = "" ;
      A9829ParFMObs = "" ;
      A14077ParFMVal2 = "" ;
      A14075ParFMVMin = "" ;
      A14076ParFMVMax = "" ;
      A14080ParFasPLC = "" ;
      A9830MaqCodC = "" ;
      A9836FasCodM = "" ;
      A65ArtCod = "" ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
      A12672DisParVl2 = "" ;
      A13989DisParVMn = "" ;
      A13990DisParVMx = "" ;
      A14078DisParPLC = "" ;
      P000T9_A396EmprCod = new String[] {""} ;
      P000T9_A758ProCod = new String[] {""} ;
      P000T9_A457FasCod = new String[] {""} ;
      P000T9_A1668ParFasVal = new String[] {""} ;
      P000T9_A1673ParFasObs = new String[] {""} ;
      P000T9_A12670ParFasVl2 = new String[] {""} ;
      P000T9_A13220ParOrden = new short[1] ;
      P000T9_A1664ParFasCod = new short[1] ;
      P000T9_A65ArtCod = new String[] {""} ;
      P000T9_A252CliCod = new int[1] ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A12670ParFasVl2 = "" ;
      A3687DisParTxt = "" ;
      Gx_msg = "" ;
      P000T13_A456FasActTin = new String[] {""} ;
      P000T13_n456FasActTin = new boolean[] {false} ;
      P000T13_A4286FasForMul = new String[] {""} ;
      P000T13_n4286FasForMul = new boolean[] {false} ;
      P000T13_A457FasCod = new String[] {""} ;
      P000T13_A396EmprCod = new String[] {""} ;
      P000T13_A764ProForCod = new String[] {""} ;
      P000T13_A4650FasForLin = new short[1] ;
      A456FasActTin = "" ;
      A4286FasForMul = "" ;
      A764ProForCod = "" ;
      AV22ARTPROCOD = "" ;
      P000T14_A758ProCod = new String[] {""} ;
      P000T14_A65ArtCod = new String[] {""} ;
      P000T14_A252CliCod = new int[1] ;
      P000T14_A396EmprCod = new String[] {""} ;
      P000T14_A4898ArtProCod = new String[] {""} ;
      P000T14_A457FasCod = new String[] {""} ;
      P000T14_A456FasActTin = new String[] {""} ;
      P000T14_n456FasActTin = new boolean[] {false} ;
      P000T14_A4286FasForMul = new String[] {""} ;
      P000T14_n4286FasForMul = new boolean[] {false} ;
      P000T14_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      A5489DisQuiDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.pfasdis__default(),
         new Object[] {
             new Object[] {
            P000T2_A396EmprCod, P000T2_A361DisCod, P000T2_A252CliCod, P000T2_A335DisArtCod
            }
            , new Object[] {
            P000T3_A396EmprCod, P000T3_A758ProCod, P000T3_A5735ProFasNot, P000T3_n5735ProFasNot, P000T3_A774ProNumLin, P000T3_A7744FasPreObl, P000T3_n7744FasPreObl, P000T3_A457FasCod, P000T3_A602MaqCod, P000T3_n602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000T5_A396EmprCod, P000T5_A758ProCod, P000T5_A457FasCod, P000T5_A7744FasPreObl, P000T5_n7744FasPreObl, P000T5_A368DisFasLin, P000T5_A361DisCod, P000T5_A7740DisFasPre, P000T5_n7740DisFasPre, P000T5_A7742DisFasDto,
            P000T5_n7742DisFasDto, P000T5_A7741DisFasUni, P000T5_n7741DisFasUni
            }
            , new Object[] {
            }
            , new Object[] {
            P000T7_A396EmprCod, P000T7_A9828ParFMVal, P000T7_A9829ParFMObs, P000T7_A14077ParFMVal2, P000T7_A14075ParFMVMin, P000T7_A14076ParFMVMax, P000T7_A14080ParFasPLC, P000T7_A1664ParFasCod, P000T7_A9830MaqCodC, P000T7_A9836FasCodM,
            P000T7_A758ProCod, P000T7_A65ArtCod, P000T7_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000T9_A396EmprCod, P000T9_A758ProCod, P000T9_A457FasCod, P000T9_A1668ParFasVal, P000T9_A1673ParFasObs, P000T9_A12670ParFasVl2, P000T9_A13220ParOrden, P000T9_A1664ParFasCod, P000T9_A65ArtCod, P000T9_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000T13_A456FasActTin, P000T13_n456FasActTin, P000T13_A4286FasForMul, P000T13_n4286FasForMul, P000T13_A457FasCod, P000T13_A396EmprCod, P000T13_A764ProForCod, P000T13_A4650FasForLin
            }
            , new Object[] {
            P000T14_A758ProCod, P000T14_A65ArtCod, P000T14_A252CliCod, P000T14_A396EmprCod, P000T14_A4898ArtProCod, P000T14_A457FasCod, P000T14_A456FasActTin, P000T14_n456FasActTin, P000T14_A4286FasForMul, P000T14_n4286FasForMul,
            P000T14_A4897ArtProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20JBP ;
   private byte AV27Torient ;
   private byte AV29Parfss ;
   private byte AV31Acabats2013 ;
   private byte AV33PqfdesdeFases ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV28Act_nrq ;
   private byte A7744FasPreObl ;
   private short A774ProNumLin ;
   private short AV19ProNumLin ;
   private short AV26Num_rq ;
   private short A368DisFasLin ;
   private short A5304DisPreSal ;
   private short A5305DisPrePie ;
   private short A5307DisNumPas ;
   private short A5376DisQuiUl ;
   private short Gx_err ;
   private short GXv_int8[] ;
   private short A1664ParFasCod ;
   private short W1664ParFasCod ;
   private short A13220ParOrden ;
   private short A6557DisParOrd ;
   private short A846UltFasLin ;
   private short AV23Disquilin ;
   private short A4650FasForLin ;
   private short A4897ArtProLin ;
   private short A5377DisQuiLin ;
   private short A5378DisQuiNp ;
   private short A5379DisQuiTp ;
   private short A5380DisQuiRb ;
   private int AV15DisCod ;
   private int AV30Valor ;
   private int GXt_int3 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV17CliCod ;
   private int GX_INS39 ;
   private int GXv_int6[] ;
   private int GX_INS517 ;
   private int GX_INS780 ;
   private long GXt_int7 ;
   private long GXv_int10[] ;
   private java.math.BigDecimal AV21Artextil ;
   private java.math.BigDecimal A5306DisVelPro ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A7742DisFasDto ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String AV18DisartCod ;
   private String A457FasCod ;
   private String A602MaqCod ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String AV16FasCod ;
   private String AV32MaqCod ;
   private String AV24Procod ;
   private String AV25Emprcod ;
   private String W457FasCod ;
   private String A3697FasApr ;
   private String Gx_emsg ;
   private String A7741DisFasUni ;
   private String GXt_char11 ;
   private String GXv_char9[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char12[] ;
   private String A9828ParFMVal ;
   private String A14077ParFMVal2 ;
   private String A14075ParFMVMin ;
   private String A14076ParFMVMax ;
   private String A9830MaqCodC ;
   private String A9836FasCodM ;
   private String A65ArtCod ;
   private String A3685DisParVal ;
   private String A3686DisParObs ;
   private String A12672DisParVl2 ;
   private String A13989DisParVMn ;
   private String A13990DisParVMx ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A12670ParFasVl2 ;
   private String Gx_msg ;
   private String A456FasActTin ;
   private String A4286FasForMul ;
   private String A764ProForCod ;
   private String AV22ARTPROCOD ;
   private String A4898ArtProCod ;
   private String A5489DisQuiDsc ;
   private boolean n5735ProFasNot ;
   private boolean n7744FasPreObl ;
   private boolean n602MaqCod ;
   private boolean returnInSub ;
   private boolean n5304DisPreSal ;
   private boolean n5305DisPrePie ;
   private boolean n5306DisVelPro ;
   private boolean n5307DisNumPas ;
   private boolean n7740DisFasPre ;
   private boolean n7742DisFasDto ;
   private boolean n7741DisFasUni ;
   private boolean n456FasActTin ;
   private boolean n4286FasForMul ;
   private String A3687DisParTxt ;
   private String A5735ProFasNot ;
   private String A9829ParFMObs ;
   private String A14080ParFasPLC ;
   private String A14078DisParPLC ;
   private String[] aP2 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P000T2_A396EmprCod ;
   private int[] P000T2_A361DisCod ;
   private int[] P000T2_A252CliCod ;
   private String[] P000T2_A335DisArtCod ;
   private String[] P000T3_A396EmprCod ;
   private String[] P000T3_A758ProCod ;
   private String[] P000T3_A5735ProFasNot ;
   private boolean[] P000T3_n5735ProFasNot ;
   private short[] P000T3_A774ProNumLin ;
   private byte[] P000T3_A7744FasPreObl ;
   private boolean[] P000T3_n7744FasPreObl ;
   private String[] P000T3_A457FasCod ;
   private String[] P000T3_A602MaqCod ;
   private boolean[] P000T3_n602MaqCod ;
   private String[] P000T5_A396EmprCod ;
   private String[] P000T5_A758ProCod ;
   private String[] P000T5_A457FasCod ;
   private byte[] P000T5_A7744FasPreObl ;
   private boolean[] P000T5_n7744FasPreObl ;
   private short[] P000T5_A368DisFasLin ;
   private int[] P000T5_A361DisCod ;
   private java.math.BigDecimal[] P000T5_A7740DisFasPre ;
   private boolean[] P000T5_n7740DisFasPre ;
   private java.math.BigDecimal[] P000T5_A7742DisFasDto ;
   private boolean[] P000T5_n7742DisFasDto ;
   private String[] P000T5_A7741DisFasUni ;
   private boolean[] P000T5_n7741DisFasUni ;
   private String[] P000T7_A396EmprCod ;
   private String[] P000T7_A9828ParFMVal ;
   private String[] P000T7_A9829ParFMObs ;
   private String[] P000T7_A14077ParFMVal2 ;
   private String[] P000T7_A14075ParFMVMin ;
   private String[] P000T7_A14076ParFMVMax ;
   private String[] P000T7_A14080ParFasPLC ;
   private short[] P000T7_A1664ParFasCod ;
   private String[] P000T7_A9830MaqCodC ;
   private String[] P000T7_A9836FasCodM ;
   private String[] P000T7_A758ProCod ;
   private String[] P000T7_A65ArtCod ;
   private int[] P000T7_A252CliCod ;
   private String[] P000T9_A396EmprCod ;
   private String[] P000T9_A758ProCod ;
   private String[] P000T9_A457FasCod ;
   private String[] P000T9_A1668ParFasVal ;
   private String[] P000T9_A1673ParFasObs ;
   private String[] P000T9_A12670ParFasVl2 ;
   private short[] P000T9_A13220ParOrden ;
   private short[] P000T9_A1664ParFasCod ;
   private String[] P000T9_A65ArtCod ;
   private int[] P000T9_A252CliCod ;
   private String[] P000T13_A456FasActTin ;
   private boolean[] P000T13_n456FasActTin ;
   private String[] P000T13_A4286FasForMul ;
   private boolean[] P000T13_n4286FasForMul ;
   private String[] P000T13_A457FasCod ;
   private String[] P000T13_A396EmprCod ;
   private String[] P000T13_A764ProForCod ;
   private short[] P000T13_A4650FasForLin ;
   private String[] P000T14_A758ProCod ;
   private String[] P000T14_A65ArtCod ;
   private int[] P000T14_A252CliCod ;
   private String[] P000T14_A396EmprCod ;
   private String[] P000T14_A4898ArtProCod ;
   private String[] P000T14_A457FasCod ;
   private String[] P000T14_A456FasActTin ;
   private boolean[] P000T14_n456FasActTin ;
   private String[] P000T14_A4286FasForMul ;
   private boolean[] P000T14_n4286FasForMul ;
   private short[] P000T14_A4897ArtProLin ;
}

final  class pfasdis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000T2", "SELECT EmprCod, DisCod, CliCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000T3", "SELECT T1.EmprCod, T1.ProCod, T1.ProFasNot, T1.ProNumLin, T2.FasPreObl, T1.FasCod, T2.MaqCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000T4", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisQuiUl, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl, DisMaqPru, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P000T5", "SELECT EmprCod, ProCod, FasCod, FasPreObl, DisFasLin, DisCod, DisFasPre, DisFasDto, DisFasUni FROM TXPDISFAS WHERE (EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?) AND (FasCod = ?) AND (FasPreObl = ?) ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P000T6", "UPDATE TXPDISFAS SET DisFasPre=?, DisFasDto=?, DisFasUni=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P000T7", "SELECT EmprCod, ParFMVal, ParFMObs, ParFMVal2, ParFMVMin, ParFMVMax, ParFasPLC, ParFasCod, MaqCodC, FasCodM, ProCod, ArtCod, CliCod FROM TXPCAPFM2 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000T8", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParVl2, DisParVMn, DisParVMx, DisParPLC, DisParTxt, DisParOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P000T9", "SELECT EmprCod, ProCod, FasCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000T10", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParOrd, DisParVl2, DisParTxt, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P000T11", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParTxt, DisParVal, DisParObs, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P000T12", "UPDATE TXPDISLIN SET UltFasLin=?  WHERE EmprCod = ? and DisCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P000T13", "SELECT T2.FasActTin, T2.FasForMul, T1.FasCod, T1.EmprCod, T1.ProForCod, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000T14", "SELECT T1.ProCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtProCod, T1.FasCod, T2.FasActTin, T2.FasForMul, T1.ArtProLin FROM (TXPArtFor T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000T15", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[16]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 8);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setString(9, (String)parms[8], 12);
               stmt.setString(10, (String)parms[9], 12);
               stmt.setVarchar(11, (String)parms[10], 100, false);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLongVarchar(6, (String)parms[5], false);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 20);
               return;
      }
   }

}

