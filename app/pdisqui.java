package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisqui extends GXProcedure
{
   public pdisqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisqui.class ), "" );
   }

   public pdisqui( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdisqui.this.aP1 = new int[] {0};
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
      pdisqui.this.AV24EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisqui.this.AV22DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34DisQuiUl = (short)(0) ;
      /* Using cursor P01OU2 */
      pr_default.execute(0, new Object[] {AV24EmprCod, Integer.valueOf(AV22DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01OU2_A361DisCod[0] ;
         A396EmprCod = P01OU2_A396EmprCod[0] ;
         A365DisDes = P01OU2_A365DisDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         AV31Kgs_for = A381DisPieKgm ;
         /* Using cursor P01OU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5368FasGral = P01OU3_A5368FasGral[0] ;
            n5368FasGral = P01OU3_n5368FasGral[0] ;
            A457FasCod = P01OU3_A457FasCod[0] ;
            A456FasActTin = P01OU3_A456FasActTin[0] ;
            n456FasActTin = P01OU3_n456FasActTin[0] ;
            A5376DisQuiUl = P01OU3_A5376DisQuiUl[0] ;
            A368DisFasLin = P01OU3_A368DisFasLin[0] ;
            A758ProCod = P01OU3_A758ProCod[0] ;
            A5368FasGral = P01OU3_A5368FasGral[0] ;
            n5368FasGral = P01OU3_n5368FasGral[0] ;
            A456FasActTin = P01OU3_A456FasActTin[0] ;
            n456FasActTin = P01OU3_n456FasActTin[0] ;
            if ( GXutil.strcmp(A5368FasGral, httpContext.getMessage( "S", "")) == 0 )
            {
               AV23ProCod = A758ProCod ;
               AV25FasCod = A457FasCod ;
               AV28FASACTTIN = A456FasActTin ;
               AV26DisFasLin = A368DisFasLin ;
               /* Execute user subroutine: 'CREO_DISQUI' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            A5376DisQuiUl = AV34DisQuiUl ;
            /* Using cursor P01OU4 */
            pr_default.execute(2, new Object[] {Short.valueOf(A5376DisQuiUl), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisqui");
      /* Using cursor P01OU5 */
      pr_default.execute(3, new Object[] {AV24EmprCod, Integer.valueOf(AV22DisCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A457FasCod = P01OU5_A457FasCod[0] ;
         A361DisCod = P01OU5_A361DisCod[0] ;
         A396EmprCod = P01OU5_A396EmprCod[0] ;
         A5368FasGral = P01OU5_A5368FasGral[0] ;
         n5368FasGral = P01OU5_n5368FasGral[0] ;
         A368DisFasLin = P01OU5_A368DisFasLin[0] ;
         A758ProCod = P01OU5_A758ProCod[0] ;
         A5368FasGral = P01OU5_A5368FasGral[0] ;
         n5368FasGral = P01OU5_n5368FasGral[0] ;
         if ( GXutil.strcmp(A5368FasGral, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.wjLoc = formatLink("app.tdisqui", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"})  ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   public void S111( )
   {
      /* 'CREO_DISQUI' Routine */
      returnInSub = false ;
      AV33FasPr1 = (byte)(0) ;
      /* Using cursor P01OU6 */
      pr_default.execute(4, new Object[] {AV24EmprCod, AV25FasCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A764ProForCod = P01OU6_A764ProForCod[0] ;
         A4650FasForLin = P01OU6_A4650FasForLin[0] ;
         A4651FasForNPro = P01OU6_A4651FasForNPro[0] ;
         n4651FasForNPro = P01OU6_n4651FasForNPro[0] ;
         A4652FasForTPau = P01OU6_A4652FasForTPau[0] ;
         n4652FasForTPau = P01OU6_n4652FasForTPau[0] ;
         A4653FasForRb = P01OU6_A4653FasForRb[0] ;
         n4653FasForRb = P01OU6_n4653FasForRb[0] ;
         A5523ProForTip = P01OU6_A5523ProForTip[0] ;
         A766ProForDsc = P01OU6_A766ProForDsc[0] ;
         A457FasCod = P01OU6_A457FasCod[0] ;
         A396EmprCod = P01OU6_A396EmprCod[0] ;
         A6017FasClave = P01OU6_A6017FasClave[0] ;
         n6017FasClave = P01OU6_n6017FasClave[0] ;
         A5523ProForTip = P01OU6_A5523ProForTip[0] ;
         A766ProForDsc = P01OU6_A766ProForDsc[0] ;
         W396EmprCod = A396EmprCod ;
         AV33FasPr1 = (byte)(1) ;
         AV34DisQuiUl = A4650FasForLin ;
         if ( (GXutil.strcmp("", A6017FasClave)==0) )
         {
            /*
               INSERT RECORD ON TABLE TXPDISQUI

            */
            W396EmprCod = A396EmprCod ;
            W764ProForCod = A764ProForCod ;
            W764ProForCod = A764ProForCod ;
            A396EmprCod = AV24EmprCod ;
            A361DisCod = AV22DisCod ;
            A758ProCod = AV23ProCod ;
            A368DisFasLin = AV26DisFasLin ;
            A5377DisQuiLin = A4650FasForLin ;
            A5378DisQuiNp = A4651FasForNPro ;
            A5379DisQuiTp = A4652FasForTPau ;
            A5380DisQuiRb = A4653FasForRb ;
            if ( GXutil.strcmp(A5523ProForTip, "X") == 0 )
            {
               A5489DisQuiDsc = A766ProForDsc ;
               A764ProForCod = "" ;
            }
            else
            {
               A5489DisQuiDsc = "@" ;
            }
            /* Using cursor P01OU7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
            if ( (pr_default.getStatus(5) == 1) )
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
            A764ProForCod = W764ProForCod ;
            A764ProForCod = W764ProForCod ;
            /* End Insert */
         }
         else
         {
            AV29Flag_ctrl = (byte)(0) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = " " ;
            GXv_char3[0] = A6017FasClave ;
            GXv_int4[0] = AV29Flag_ctrl ;
            GXv_int5[0] = AV22DisCod ;
            GXv_decimal6[0] = AV31Kgs_for ;
            GXv_char7[0] = " " ;
            GXv_char8[0] = AV30Accion ;
            GXv_int9[0] = (byte)(0) ;
            GXv_char10[0] = AV28FASACTTIN ;
            new app.pclaespec(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_decimal6, GXv_char7, GXv_char8, GXv_int9, GXv_char10) ;
            pdisqui.this.A396EmprCod = GXv_char1[0] ;
            pdisqui.this.A6017FasClave = GXv_char3[0] ;
            pdisqui.this.AV29Flag_ctrl = GXv_int4[0] ;
            pdisqui.this.AV22DisCod = GXv_int5[0] ;
            pdisqui.this.AV31Kgs_for = GXv_decimal6[0] ;
            pdisqui.this.AV30Accion = GXv_char8[0] ;
            pdisqui.this.AV28FASACTTIN = GXv_char10[0] ;
            if ( AV29Flag_ctrl == 1 )
            {
               if ( ( GXutil.strcmp(AV30Accion, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV30Accion, httpContext.getMessage( "E", "")) == 0 ) )
               {
                  AV27Linea_ant = AV32LastLin ;
                  /* Execute user subroutine: 'ELIMINO_ANT' */
                  S125 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     pr_default.close(4);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               /*
                  INSERT RECORD ON TABLE TXPDISQUI

               */
               W396EmprCod = A396EmprCod ;
               W764ProForCod = A764ProForCod ;
               W764ProForCod = A764ProForCod ;
               A396EmprCod = AV24EmprCod ;
               A361DisCod = AV22DisCod ;
               A758ProCod = AV23ProCod ;
               A368DisFasLin = AV26DisFasLin ;
               A5377DisQuiLin = A4650FasForLin ;
               A5378DisQuiNp = A4651FasForNPro ;
               A5379DisQuiTp = A4652FasForTPau ;
               A5380DisQuiRb = A4653FasForRb ;
               if ( GXutil.strcmp(A5523ProForTip, "X") == 0 )
               {
                  A5489DisQuiDsc = A766ProForDsc ;
                  A764ProForCod = "" ;
               }
               else
               {
                  A5489DisQuiDsc = "@" ;
               }
               /* Using cursor P01OU8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
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
               A764ProForCod = W764ProForCod ;
               A764ProForCod = W764ProForCod ;
               /* End Insert */
               if ( GXutil.strcmp(AV30Accion, httpContext.getMessage( "E", "")) == 0 )
               {
                  AV27Linea_ant = A4650FasForLin ;
                  /* Execute user subroutine: 'ELIMINO_ANT' */
                  S125 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     pr_default.close(4);
                     returnInSub = true;
                     if (true) return;
                  }
               }
            }
         }
         AV32LastLin = A4650FasForLin ;
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV33FasPr1 == 0 )
      {
         AV34DisQuiUl = (short)(10) ;
         /*
            INSERT RECORD ON TABLE TXPDISQUI

         */
         A396EmprCod = AV24EmprCod ;
         A361DisCod = AV22DisCod ;
         A758ProCod = AV23ProCod ;
         A368DisFasLin = AV26DisFasLin ;
         A5377DisQuiLin = (short)(10) ;
         A764ProForCod = "" ;
         A5378DisQuiNp = (short)(0) ;
         A5379DisQuiTp = (short)(0) ;
         A5380DisQuiRb = (short)(0) ;
         A5489DisQuiDsc = "" ;
         /* Using cursor P01OU9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
         if ( (pr_default.getStatus(7) == 1) )
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

   public void S125( )
   {
      /* 'ELIMINO_ANT' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P01OU10 */
      pr_default.execute(8, new Object[] {AV24EmprCod, Integer.valueOf(AV22DisCod), AV23ProCod, Short.valueOf(AV26DisFasLin), Short.valueOf(AV27Linea_ant)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisqui.this.AV24EmprCod;
      this.aP1[0] = pdisqui.this.AV22DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisqui");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P01OU11 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         X595Kilos = P01OU11_A595Kilos[0] ;
      }
      pr_default.close(9);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P01OU12 */
      pr_default.execute(10, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         X382DisPieKil = P01OU12_A382DisPieKil[0] ;
      }
      pr_default.close(10);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P01OU2_A361DisCod = new int[1] ;
      P01OU2_A396EmprCod = new String[] {""} ;
      P01OU2_A365DisDes = new String[] {""} ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      AV31Kgs_for = DecimalUtil.ZERO ;
      P01OU3_A396EmprCod = new String[] {""} ;
      P01OU3_A361DisCod = new int[1] ;
      P01OU3_A5368FasGral = new String[] {""} ;
      P01OU3_n5368FasGral = new boolean[] {false} ;
      P01OU3_A457FasCod = new String[] {""} ;
      P01OU3_A456FasActTin = new String[] {""} ;
      P01OU3_n456FasActTin = new boolean[] {false} ;
      P01OU3_A5376DisQuiUl = new short[1] ;
      P01OU3_A368DisFasLin = new short[1] ;
      P01OU3_A758ProCod = new String[] {""} ;
      A5368FasGral = "" ;
      A457FasCod = "" ;
      A456FasActTin = "" ;
      A758ProCod = "" ;
      AV23ProCod = "" ;
      AV25FasCod = "" ;
      AV28FASACTTIN = "" ;
      P01OU5_A457FasCod = new String[] {""} ;
      P01OU5_A361DisCod = new int[1] ;
      P01OU5_A396EmprCod = new String[] {""} ;
      P01OU5_A5368FasGral = new String[] {""} ;
      P01OU5_n5368FasGral = new boolean[] {false} ;
      P01OU5_A368DisFasLin = new short[1] ;
      P01OU5_A758ProCod = new String[] {""} ;
      P01OU6_A764ProForCod = new String[] {""} ;
      P01OU6_A4650FasForLin = new short[1] ;
      P01OU6_A4651FasForNPro = new short[1] ;
      P01OU6_n4651FasForNPro = new boolean[] {false} ;
      P01OU6_A4652FasForTPau = new short[1] ;
      P01OU6_n4652FasForTPau = new boolean[] {false} ;
      P01OU6_A4653FasForRb = new short[1] ;
      P01OU6_n4653FasForRb = new boolean[] {false} ;
      P01OU6_A5523ProForTip = new String[] {""} ;
      P01OU6_A766ProForDsc = new String[] {""} ;
      P01OU6_A457FasCod = new String[] {""} ;
      P01OU6_A396EmprCod = new String[] {""} ;
      P01OU6_A6017FasClave = new String[] {""} ;
      P01OU6_n6017FasClave = new boolean[] {false} ;
      A764ProForCod = "" ;
      A5523ProForTip = "" ;
      A766ProForDsc = "" ;
      A6017FasClave = "" ;
      W396EmprCod = "" ;
      W764ProForCod = "" ;
      A5489DisQuiDsc = "" ;
      Gx_emsg = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_char7 = new String[1] ;
      AV30Accion = "" ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char10 = new String[1] ;
      X595Kilos = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P01OU11_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P01OU12_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pdisqui__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pdisqui__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pdisqui__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisqui__default(),
         new Object[] {
             new Object[] {
            P01OU2_A361DisCod, P01OU2_A396EmprCod, P01OU2_A365DisDes
            }
            , new Object[] {
            P01OU3_A396EmprCod, P01OU3_A361DisCod, P01OU3_A5368FasGral, P01OU3_n5368FasGral, P01OU3_A457FasCod, P01OU3_A456FasActTin, P01OU3_n456FasActTin, P01OU3_A5376DisQuiUl, P01OU3_A368DisFasLin, P01OU3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01OU5_A457FasCod, P01OU5_A361DisCod, P01OU5_A396EmprCod, P01OU5_A5368FasGral, P01OU5_n5368FasGral, P01OU5_A368DisFasLin, P01OU5_A758ProCod
            }
            , new Object[] {
            P01OU6_A764ProForCod, P01OU6_A4650FasForLin, P01OU6_A4651FasForNPro, P01OU6_n4651FasForNPro, P01OU6_A4652FasForTPau, P01OU6_n4652FasForTPau, P01OU6_A4653FasForRb, P01OU6_n4653FasForRb, P01OU6_A5523ProForTip, P01OU6_A766ProForDsc,
            P01OU6_A457FasCod, P01OU6_A396EmprCod, P01OU6_A6017FasClave, P01OU6_n6017FasClave
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01OU11_A595Kilos
            }
            , new Object[] {
            P01OU12_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33FasPr1 ;
   private byte AV29Flag_ctrl ;
   private byte GXv_int4[] ;
   private byte GXv_int9[] ;
   private short AV34DisQuiUl ;
   private short A5376DisQuiUl ;
   private short A368DisFasLin ;
   private short AV26DisFasLin ;
   private short A4650FasForLin ;
   private short A4651FasForNPro ;
   private short A4652FasForTPau ;
   private short A4653FasForRb ;
   private short A5377DisQuiLin ;
   private short A5378DisQuiNp ;
   private short A5379DisQuiTp ;
   private short A5380DisQuiRb ;
   private short Gx_err ;
   private short AV27Linea_ant ;
   private short AV32LastLin ;
   private int AV22DisCod ;
   private int A361DisCod ;
   private int GX_INS780 ;
   private int GXv_int5[] ;
   private int E361DisCod ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal AV31Kgs_for ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String AV24EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String A5368FasGral ;
   private String A457FasCod ;
   private String A456FasActTin ;
   private String A758ProCod ;
   private String AV23ProCod ;
   private String AV25FasCod ;
   private String AV28FASACTTIN ;
   private String A764ProForCod ;
   private String A5523ProForTip ;
   private String A766ProForDsc ;
   private String A6017FasClave ;
   private String W396EmprCod ;
   private String W764ProForCod ;
   private String A5489DisQuiDsc ;
   private String Gx_emsg ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String AV30Accion ;
   private String GXv_char8[] ;
   private String GXv_char10[] ;
   private String E396EmprCod ;
   private boolean n5368FasGral ;
   private boolean n456FasActTin ;
   private boolean returnInSub ;
   private boolean n4651FasForNPro ;
   private boolean n4652FasForTPau ;
   private boolean n4653FasForRb ;
   private boolean n6017FasClave ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P01OU2_A361DisCod ;
   private String[] P01OU2_A396EmprCod ;
   private String[] P01OU2_A365DisDes ;
   private String[] P01OU3_A396EmprCod ;
   private int[] P01OU3_A361DisCod ;
   private String[] P01OU3_A5368FasGral ;
   private boolean[] P01OU3_n5368FasGral ;
   private String[] P01OU3_A457FasCod ;
   private String[] P01OU3_A456FasActTin ;
   private boolean[] P01OU3_n456FasActTin ;
   private short[] P01OU3_A5376DisQuiUl ;
   private short[] P01OU3_A368DisFasLin ;
   private String[] P01OU3_A758ProCod ;
   private String[] P01OU5_A457FasCod ;
   private int[] P01OU5_A361DisCod ;
   private String[] P01OU5_A396EmprCod ;
   private String[] P01OU5_A5368FasGral ;
   private boolean[] P01OU5_n5368FasGral ;
   private short[] P01OU5_A368DisFasLin ;
   private String[] P01OU5_A758ProCod ;
   private String[] P01OU6_A764ProForCod ;
   private short[] P01OU6_A4650FasForLin ;
   private short[] P01OU6_A4651FasForNPro ;
   private boolean[] P01OU6_n4651FasForNPro ;
   private short[] P01OU6_A4652FasForTPau ;
   private boolean[] P01OU6_n4652FasForTPau ;
   private short[] P01OU6_A4653FasForRb ;
   private boolean[] P01OU6_n4653FasForRb ;
   private String[] P01OU6_A5523ProForTip ;
   private String[] P01OU6_A766ProForDsc ;
   private String[] P01OU6_A457FasCod ;
   private String[] P01OU6_A396EmprCod ;
   private String[] P01OU6_A6017FasClave ;
   private boolean[] P01OU6_n6017FasClave ;
   private java.math.BigDecimal[] P01OU11_A595Kilos ;
   private java.math.BigDecimal[] P01OU12_A382DisPieKil ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pdisqui__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pdisqui__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pdisqui__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pdisqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01OU2", "SELECT DisCod, EmprCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OU3", "SELECT T1.EmprCod, T1.DisCod, T2.FasGral, T1.FasCod, T2.FasActTin, T1.DisQuiUl, T1.DisFasLin, T1.ProCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01OU4", "UPDATE TXPDISFAS SET DisQuiUl=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P01OU5", "SELECT T1.FasCod, T1.DisCod, T1.EmprCod, T2.FasGral, T1.DisFasLin, T1.ProCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01OU6", "SELECT T1.ProForCod, T1.FasForLin, T1.FasForNPro, T1.FasForTPau, T1.FasForRb, T2.ProForTip, T2.ProForDsc, T1.FasCod, T1.EmprCod, T1.FasClave FROM (TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01OU7", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new UpdateCursor("P01OU8", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new UpdateCursor("P01OU9", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new UpdateCursor("P01OU10", "DELETE FROM TXPDISQUI  WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and DisQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new ForEachCursor("P01OU11", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OU12", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
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
            case 6 :
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
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

