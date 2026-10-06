package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacesta extends GXProcedure
{
   public pacesta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacesta.class ), "" );
   }

   public pacesta( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           java.util.Date[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           short[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           java.math.BigDecimal[] aP9 ,
                           java.math.BigDecimal[] aP10 ,
                           java.math.BigDecimal[] aP11 )
   {
      pacesta.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             byte[] aP12 )
   {
      pacesta.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacesta.this.AV53CliCod = aP1[0];
      this.aP1 = aP1;
      pacesta.this.AV56BarSer = aP2[0];
      this.aP2 = aP2;
      pacesta.this.AV41FacSerNum = aP3[0];
      this.aP3 = aP3;
      pacesta.this.AV60BarFecSal = aP4[0];
      this.aP4 = aP4;
      pacesta.this.AV20FlagTin = aP5[0];
      this.aP5 = aP5;
      pacesta.this.AV29BarPri = aP6[0];
      this.aP6 = aP6;
      pacesta.this.AV57BarTipArt = aP7[0];
      this.aP7 = aP7;
      pacesta.this.AV58BarKgm = aP8[0];
      this.aP8 = aP8;
      pacesta.this.AV43BarKgmLan = aP9[0];
      this.aP9 = aP9;
      pacesta.this.AV59BarMtr = aP10[0];
      this.aP10 = aP10;
      pacesta.this.AV47BarMtrLan = aP11[0];
      this.aP11 = aP11;
      pacesta.this.AV61BarEstReo = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "In PACESTA", "") );
      /*
         INSERT RECORD ON TABLE TXPCESCLI

      */
      A252CliCod = AV53CliCod ;
      A425EstAny = (short)(GXutil.year( AV60BarFecSal)) ;
      A2755EstSerFac = AV41FacSerNum ;
      /* Using cursor P01WF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCLI");
      if ( (pr_default.getStatus(0) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPLESCLI

      */
      A252CliCod = AV53CliCod ;
      A425EstAny = (short)(GXutil.year( AV60BarFecSal)) ;
      A2755EstSerFac = AV41FacSerNum ;
      A426EstMes = (byte)(GXutil.month( AV60BarFecSal)) ;
      if ( AV61BarEstReo == 2 )
      {
         A591KgmRex = AV58BarKgm ;
         n591KgmRex = false ;
         A937MtrRex = AV59BarMtr ;
         n937MtrRex = false ;
      }
      else if ( AV61BarEstReo == 1 )
      {
         A592KgmRin = AV58BarKgm ;
         n592KgmRin = false ;
         A938MtrRin = AV59BarMtr ;
         n938MtrRin = false ;
      }
      else if ( GXutil.strcmp(AV20FlagTin, httpContext.getMessage( "S", "")) == 0 )
      {
         A593KgmTin = AV58BarKgm ;
         n593KgmTin = false ;
         A939MtrTin = AV59BarMtr ;
         n939MtrTin = false ;
      }
      else
      {
      }
      A594KgmTra = AV43BarKgmLan ;
      n594KgmTra = false ;
      A940MtrTra = AV47BarMtrLan ;
      n940MtrTra = false ;
      /* Using cursor P01WF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(A426EstMes), Boolean.valueOf(n594KgmTra), A594KgmTra, Boolean.valueOf(n593KgmTin), A593KgmTin, Boolean.valueOf(n592KgmRin), A592KgmRin, Boolean.valueOf(n591KgmRex), A591KgmRex, Boolean.valueOf(n940MtrTra), A940MtrTra, Boolean.valueOf(n939MtrTin), A939MtrTin, Boolean.valueOf(n938MtrRin), A938MtrRin, Boolean.valueOf(n937MtrRex), A937MtrRex});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCLI");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P01WF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(A426EstMes)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A396EmprCod = P01WF4_A396EmprCod[0] ;
            A252CliCod = P01WF4_A252CliCod[0] ;
            A425EstAny = P01WF4_A425EstAny[0] ;
            A2755EstSerFac = P01WF4_A2755EstSerFac[0] ;
            A426EstMes = P01WF4_A426EstMes[0] ;
            A591KgmRex = P01WF4_A591KgmRex[0] ;
            n591KgmRex = P01WF4_n591KgmRex[0] ;
            A937MtrRex = P01WF4_A937MtrRex[0] ;
            n937MtrRex = P01WF4_n937MtrRex[0] ;
            A592KgmRin = P01WF4_A592KgmRin[0] ;
            n592KgmRin = P01WF4_n592KgmRin[0] ;
            A938MtrRin = P01WF4_A938MtrRin[0] ;
            n938MtrRin = P01WF4_n938MtrRin[0] ;
            A593KgmTin = P01WF4_A593KgmTin[0] ;
            n593KgmTin = P01WF4_n593KgmTin[0] ;
            A939MtrTin = P01WF4_A939MtrTin[0] ;
            n939MtrTin = P01WF4_n939MtrTin[0] ;
            A594KgmTra = P01WF4_A594KgmTra[0] ;
            n594KgmTra = P01WF4_n594KgmTra[0] ;
            A940MtrTra = P01WF4_A940MtrTra[0] ;
            n940MtrTra = P01WF4_n940MtrTra[0] ;
            if ( AV61BarEstReo == 2 )
            {
               A591KgmRex = A591KgmRex.add(AV58BarKgm) ;
               n591KgmRex = false ;
               A937MtrRex = A937MtrRex.add(AV59BarMtr) ;
               n937MtrRex = false ;
            }
            else if ( AV61BarEstReo == 1 )
            {
               A592KgmRin = A592KgmRin.add(AV58BarKgm) ;
               n592KgmRin = false ;
               A938MtrRin = A938MtrRin.add(AV59BarMtr) ;
               n938MtrRin = false ;
            }
            else if ( GXutil.strcmp(AV20FlagTin, httpContext.getMessage( "S", "")) == 0 )
            {
               A593KgmTin = A593KgmTin.add(AV58BarKgm) ;
               n593KgmTin = false ;
               A939MtrTin = A939MtrTin.add(AV59BarMtr) ;
               n939MtrTin = false ;
            }
            else
            {
            }
            A594KgmTra = A594KgmTra.add(AV43BarKgmLan) ;
            n594KgmTra = false ;
            A940MtrTra = A940MtrTra.add(AV47BarMtrLan) ;
            n940MtrTra = false ;
            /* Using cursor P01WF5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n591KgmRex), A591KgmRex, Boolean.valueOf(n937MtrRex), A937MtrRex, Boolean.valueOf(n592KgmRin), A592KgmRin, Boolean.valueOf(n938MtrRin), A938MtrRin, Boolean.valueOf(n593KgmTin), A593KgmTin, Boolean.valueOf(n939MtrTin), A939MtrTin, Boolean.valueOf(n594KgmTra), A594KgmTra, Boolean.valueOf(n940MtrTra), A940MtrTra, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(A426EstMes)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCLI");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCESART

      */
      A252CliCod = AV53CliCod ;
      A65ArtCod = AV56BarSer ;
      A71ArtEstAny = (short)(GXutil.year( AV60BarFecSal)) ;
      A2756ArtEstSer = AV41FacSerNum ;
      A829TipArtCod = AV57BarTipArt ;
      /* Using cursor P01WF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Short.valueOf(A829TipArtCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESART");
      if ( (pr_default.getStatus(4) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPLESART

      */
      A252CliCod = AV53CliCod ;
      A65ArtCod = AV56BarSer ;
      A71ArtEstAny = (short)(GXutil.year( AV60BarFecSal)) ;
      A2756ArtEstSer = AV41FacSerNum ;
      A72ArtEstMes = (byte)(GXutil.month( AV60BarFecSal)) ;
      A5342ArtEstTart = AV57BarTipArt ;
      n5342ArtEstTart = false ;
      if ( AV61BarEstReo == 2 )
      {
         A83ArtKilRex = AV58BarKgm ;
         n83ArtKilRex = false ;
         A930ArtMtrRex = AV59BarMtr ;
         n930ArtMtrRex = false ;
      }
      else if ( AV61BarEstReo == 1 )
      {
         A84ArtKilRin = AV58BarKgm ;
         n84ArtKilRin = false ;
         A931ArtMtrRin = AV59BarMtr ;
         n931ArtMtrRin = false ;
      }
      else if ( GXutil.strcmp(AV20FlagTin, httpContext.getMessage( "S", "")) == 0 )
      {
         A85ArtKilTin = AV58BarKgm ;
         n85ArtKilTin = false ;
         A932ArtMtrTin = AV59BarMtr ;
         n932ArtMtrTin = false ;
      }
      else
      {
      }
      A86ArtKilTra = AV43BarKgmLan ;
      n86ArtKilTra = false ;
      A933ArtMtrTra = AV47BarMtrLan ;
      n933ArtMtrTra = false ;
      /* Using cursor P01WF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Byte.valueOf(A72ArtEstMes), Boolean.valueOf(n86ArtKilTra), A86ArtKilTra, Boolean.valueOf(n85ArtKilTin), A85ArtKilTin, Boolean.valueOf(n84ArtKilRin), A84ArtKilRin, Boolean.valueOf(n83ArtKilRex), A83ArtKilRex, Boolean.valueOf(n933ArtMtrTra), A933ArtMtrTra, Boolean.valueOf(n932ArtMtrTin), A932ArtMtrTin, Boolean.valueOf(n931ArtMtrRin), A931ArtMtrRin, Boolean.valueOf(n930ArtMtrRex), A930ArtMtrRex, Boolean.valueOf(n5342ArtEstTart), Short.valueOf(A5342ArtEstTart)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESART");
      if ( (pr_default.getStatus(5) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P01WF8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Byte.valueOf(A72ArtEstMes)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A396EmprCod = P01WF8_A396EmprCod[0] ;
            A252CliCod = P01WF8_A252CliCod[0] ;
            A65ArtCod = P01WF8_A65ArtCod[0] ;
            A71ArtEstAny = P01WF8_A71ArtEstAny[0] ;
            A2756ArtEstSer = P01WF8_A2756ArtEstSer[0] ;
            A72ArtEstMes = P01WF8_A72ArtEstMes[0] ;
            A83ArtKilRex = P01WF8_A83ArtKilRex[0] ;
            n83ArtKilRex = P01WF8_n83ArtKilRex[0] ;
            A930ArtMtrRex = P01WF8_A930ArtMtrRex[0] ;
            n930ArtMtrRex = P01WF8_n930ArtMtrRex[0] ;
            A84ArtKilRin = P01WF8_A84ArtKilRin[0] ;
            n84ArtKilRin = P01WF8_n84ArtKilRin[0] ;
            A931ArtMtrRin = P01WF8_A931ArtMtrRin[0] ;
            n931ArtMtrRin = P01WF8_n931ArtMtrRin[0] ;
            A85ArtKilTin = P01WF8_A85ArtKilTin[0] ;
            n85ArtKilTin = P01WF8_n85ArtKilTin[0] ;
            A932ArtMtrTin = P01WF8_A932ArtMtrTin[0] ;
            n932ArtMtrTin = P01WF8_n932ArtMtrTin[0] ;
            A86ArtKilTra = P01WF8_A86ArtKilTra[0] ;
            n86ArtKilTra = P01WF8_n86ArtKilTra[0] ;
            A933ArtMtrTra = P01WF8_A933ArtMtrTra[0] ;
            n933ArtMtrTra = P01WF8_n933ArtMtrTra[0] ;
            if ( AV61BarEstReo == 2 )
            {
               A83ArtKilRex = A83ArtKilRex.add(AV58BarKgm) ;
               n83ArtKilRex = false ;
               A930ArtMtrRex = A930ArtMtrRex.add(AV59BarMtr) ;
               n930ArtMtrRex = false ;
            }
            else if ( AV61BarEstReo == 1 )
            {
               A84ArtKilRin = A84ArtKilRin.add(AV58BarKgm) ;
               n84ArtKilRin = false ;
               A931ArtMtrRin = A931ArtMtrRin.add(AV59BarMtr) ;
               n931ArtMtrRin = false ;
            }
            else if ( GXutil.strcmp(AV20FlagTin, httpContext.getMessage( "S", "")) == 0 )
            {
               A85ArtKilTin = A85ArtKilTin.add(AV58BarKgm) ;
               n85ArtKilTin = false ;
               A932ArtMtrTin = A932ArtMtrTin.add(AV59BarMtr) ;
               n932ArtMtrTin = false ;
            }
            else
            {
            }
            A86ArtKilTra = A86ArtKilTra.add(AV43BarKgmLan) ;
            n86ArtKilTra = false ;
            A933ArtMtrTra = A933ArtMtrTra.add(AV47BarMtrLan) ;
            n933ArtMtrTra = false ;
            /* Using cursor P01WF9 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n83ArtKilRex), A83ArtKilRex, Boolean.valueOf(n930ArtMtrRex), A930ArtMtrRex, Boolean.valueOf(n84ArtKilRin), A84ArtKilRin, Boolean.valueOf(n931ArtMtrRin), A931ArtMtrRin, Boolean.valueOf(n85ArtKilTin), A85ArtKilTin, Boolean.valueOf(n932ArtMtrTin), A932ArtMtrTin, Boolean.valueOf(n86ArtKilTra), A86ArtKilTra, Boolean.valueOf(n933ArtMtrTra), A933ArtMtrTra, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), A2756ArtEstSer, Byte.valueOf(A72ArtEstMes)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESART");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacesta.this.A396EmprCod;
      this.aP1[0] = pacesta.this.AV53CliCod;
      this.aP2[0] = pacesta.this.AV56BarSer;
      this.aP3[0] = pacesta.this.AV41FacSerNum;
      this.aP4[0] = pacesta.this.AV60BarFecSal;
      this.aP5[0] = pacesta.this.AV20FlagTin;
      this.aP6[0] = pacesta.this.AV29BarPri;
      this.aP7[0] = pacesta.this.AV57BarTipArt;
      this.aP8[0] = pacesta.this.AV58BarKgm;
      this.aP9[0] = pacesta.this.AV43BarKgmLan;
      this.aP10[0] = pacesta.this.AV59BarMtr;
      this.aP11[0] = pacesta.this.AV47BarMtrLan;
      this.aP12[0] = pacesta.this.AV61BarEstReo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A2755EstSerFac = "" ;
      Gx_emsg = "" ;
      A591KgmRex = DecimalUtil.ZERO ;
      A937MtrRex = DecimalUtil.ZERO ;
      A592KgmRin = DecimalUtil.ZERO ;
      A938MtrRin = DecimalUtil.ZERO ;
      A593KgmTin = DecimalUtil.ZERO ;
      A939MtrTin = DecimalUtil.ZERO ;
      A594KgmTra = DecimalUtil.ZERO ;
      A940MtrTra = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01WF4_A396EmprCod = new String[] {""} ;
      P01WF4_A252CliCod = new int[1] ;
      P01WF4_A425EstAny = new short[1] ;
      P01WF4_A2755EstSerFac = new String[] {""} ;
      P01WF4_A426EstMes = new byte[1] ;
      P01WF4_A591KgmRex = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n591KgmRex = new boolean[] {false} ;
      P01WF4_A937MtrRex = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n937MtrRex = new boolean[] {false} ;
      P01WF4_A592KgmRin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n592KgmRin = new boolean[] {false} ;
      P01WF4_A938MtrRin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n938MtrRin = new boolean[] {false} ;
      P01WF4_A593KgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n593KgmTin = new boolean[] {false} ;
      P01WF4_A939MtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n939MtrTin = new boolean[] {false} ;
      P01WF4_A594KgmTra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n594KgmTra = new boolean[] {false} ;
      P01WF4_A940MtrTra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF4_n940MtrTra = new boolean[] {false} ;
      A65ArtCod = "" ;
      A2756ArtEstSer = "" ;
      A83ArtKilRex = DecimalUtil.ZERO ;
      A930ArtMtrRex = DecimalUtil.ZERO ;
      A84ArtKilRin = DecimalUtil.ZERO ;
      A931ArtMtrRin = DecimalUtil.ZERO ;
      A85ArtKilTin = DecimalUtil.ZERO ;
      A932ArtMtrTin = DecimalUtil.ZERO ;
      A86ArtKilTra = DecimalUtil.ZERO ;
      A933ArtMtrTra = DecimalUtil.ZERO ;
      P01WF8_A396EmprCod = new String[] {""} ;
      P01WF8_A252CliCod = new int[1] ;
      P01WF8_A65ArtCod = new String[] {""} ;
      P01WF8_A71ArtEstAny = new short[1] ;
      P01WF8_A2756ArtEstSer = new String[] {""} ;
      P01WF8_A72ArtEstMes = new byte[1] ;
      P01WF8_A83ArtKilRex = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n83ArtKilRex = new boolean[] {false} ;
      P01WF8_A930ArtMtrRex = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n930ArtMtrRex = new boolean[] {false} ;
      P01WF8_A84ArtKilRin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n84ArtKilRin = new boolean[] {false} ;
      P01WF8_A931ArtMtrRin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n931ArtMtrRin = new boolean[] {false} ;
      P01WF8_A85ArtKilTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n85ArtKilTin = new boolean[] {false} ;
      P01WF8_A932ArtMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n932ArtMtrTin = new boolean[] {false} ;
      P01WF8_A86ArtKilTra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n86ArtKilTra = new boolean[] {false} ;
      P01WF8_A933ArtMtrTra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WF8_n933ArtMtrTra = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacesta__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WF4_A396EmprCod, P01WF4_A252CliCod, P01WF4_A425EstAny, P01WF4_A2755EstSerFac, P01WF4_A426EstMes, P01WF4_A591KgmRex, P01WF4_n591KgmRex, P01WF4_A937MtrRex, P01WF4_n937MtrRex, P01WF4_A592KgmRin,
            P01WF4_n592KgmRin, P01WF4_A938MtrRin, P01WF4_n938MtrRin, P01WF4_A593KgmTin, P01WF4_n593KgmTin, P01WF4_A939MtrTin, P01WF4_n939MtrTin, P01WF4_A594KgmTra, P01WF4_n594KgmTra, P01WF4_A940MtrTra,
            P01WF4_n940MtrTra
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WF8_A396EmprCod, P01WF8_A252CliCod, P01WF8_A65ArtCod, P01WF8_A71ArtEstAny, P01WF8_A2756ArtEstSer, P01WF8_A72ArtEstMes, P01WF8_A83ArtKilRex, P01WF8_n83ArtKilRex, P01WF8_A930ArtMtrRex, P01WF8_n930ArtMtrRex,
            P01WF8_A84ArtKilRin, P01WF8_n84ArtKilRin, P01WF8_A931ArtMtrRin, P01WF8_n931ArtMtrRin, P01WF8_A85ArtKilTin, P01WF8_n85ArtKilTin, P01WF8_A932ArtMtrTin, P01WF8_n932ArtMtrTin, P01WF8_A86ArtKilTra, P01WF8_n86ArtKilTra,
            P01WF8_A933ArtMtrTra, P01WF8_n933ArtMtrTra
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV61BarEstReo ;
   private byte A426EstMes ;
   private byte A72ArtEstMes ;
   private short AV57BarTipArt ;
   private short A425EstAny ;
   private short Gx_err ;
   private short A71ArtEstAny ;
   private short A829TipArtCod ;
   private short A5342ArtEstTart ;
   private int AV53CliCod ;
   private int GX_INS394 ;
   private int A252CliCod ;
   private int GX_INS395 ;
   private int GX_INS396 ;
   private int GX_INS397 ;
   private java.math.BigDecimal AV58BarKgm ;
   private java.math.BigDecimal AV43BarKgmLan ;
   private java.math.BigDecimal AV59BarMtr ;
   private java.math.BigDecimal AV47BarMtrLan ;
   private java.math.BigDecimal A591KgmRex ;
   private java.math.BigDecimal A937MtrRex ;
   private java.math.BigDecimal A592KgmRin ;
   private java.math.BigDecimal A938MtrRin ;
   private java.math.BigDecimal A593KgmTin ;
   private java.math.BigDecimal A939MtrTin ;
   private java.math.BigDecimal A594KgmTra ;
   private java.math.BigDecimal A940MtrTra ;
   private java.math.BigDecimal A83ArtKilRex ;
   private java.math.BigDecimal A930ArtMtrRex ;
   private java.math.BigDecimal A84ArtKilRin ;
   private java.math.BigDecimal A931ArtMtrRin ;
   private java.math.BigDecimal A85ArtKilTin ;
   private java.math.BigDecimal A932ArtMtrTin ;
   private java.math.BigDecimal A86ArtKilTra ;
   private java.math.BigDecimal A933ArtMtrTra ;
   private String A396EmprCod ;
   private String AV56BarSer ;
   private String AV41FacSerNum ;
   private String AV20FlagTin ;
   private String AV29BarPri ;
   private String A2755EstSerFac ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A2756ArtEstSer ;
   private java.util.Date AV60BarFecSal ;
   private boolean n591KgmRex ;
   private boolean n937MtrRex ;
   private boolean n592KgmRin ;
   private boolean n938MtrRin ;
   private boolean n593KgmTin ;
   private boolean n939MtrTin ;
   private boolean n594KgmTra ;
   private boolean n940MtrTra ;
   private boolean n5342ArtEstTart ;
   private boolean n83ArtKilRex ;
   private boolean n930ArtMtrRex ;
   private boolean n84ArtKilRin ;
   private boolean n931ArtMtrRin ;
   private boolean n85ArtKilTin ;
   private boolean n932ArtMtrTin ;
   private boolean n86ArtKilTra ;
   private boolean n933ArtMtrTra ;
   private byte[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WF4_A396EmprCod ;
   private int[] P01WF4_A252CliCod ;
   private short[] P01WF4_A425EstAny ;
   private String[] P01WF4_A2755EstSerFac ;
   private byte[] P01WF4_A426EstMes ;
   private java.math.BigDecimal[] P01WF4_A591KgmRex ;
   private boolean[] P01WF4_n591KgmRex ;
   private java.math.BigDecimal[] P01WF4_A937MtrRex ;
   private boolean[] P01WF4_n937MtrRex ;
   private java.math.BigDecimal[] P01WF4_A592KgmRin ;
   private boolean[] P01WF4_n592KgmRin ;
   private java.math.BigDecimal[] P01WF4_A938MtrRin ;
   private boolean[] P01WF4_n938MtrRin ;
   private java.math.BigDecimal[] P01WF4_A593KgmTin ;
   private boolean[] P01WF4_n593KgmTin ;
   private java.math.BigDecimal[] P01WF4_A939MtrTin ;
   private boolean[] P01WF4_n939MtrTin ;
   private java.math.BigDecimal[] P01WF4_A594KgmTra ;
   private boolean[] P01WF4_n594KgmTra ;
   private java.math.BigDecimal[] P01WF4_A940MtrTra ;
   private boolean[] P01WF4_n940MtrTra ;
   private String[] P01WF8_A396EmprCod ;
   private int[] P01WF8_A252CliCod ;
   private String[] P01WF8_A65ArtCod ;
   private short[] P01WF8_A71ArtEstAny ;
   private String[] P01WF8_A2756ArtEstSer ;
   private byte[] P01WF8_A72ArtEstMes ;
   private java.math.BigDecimal[] P01WF8_A83ArtKilRex ;
   private boolean[] P01WF8_n83ArtKilRex ;
   private java.math.BigDecimal[] P01WF8_A930ArtMtrRex ;
   private boolean[] P01WF8_n930ArtMtrRex ;
   private java.math.BigDecimal[] P01WF8_A84ArtKilRin ;
   private boolean[] P01WF8_n84ArtKilRin ;
   private java.math.BigDecimal[] P01WF8_A931ArtMtrRin ;
   private boolean[] P01WF8_n931ArtMtrRin ;
   private java.math.BigDecimal[] P01WF8_A85ArtKilTin ;
   private boolean[] P01WF8_n85ArtKilTin ;
   private java.math.BigDecimal[] P01WF8_A932ArtMtrTin ;
   private boolean[] P01WF8_n932ArtMtrTin ;
   private java.math.BigDecimal[] P01WF8_A86ArtKilTra ;
   private boolean[] P01WF8_n86ArtKilTra ;
   private java.math.BigDecimal[] P01WF8_A933ArtMtrTra ;
   private boolean[] P01WF8_n933ArtMtrTra ;
}

final  class pacesta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01WF2", "INSERT INTO TXPCESCLI(EmprCod, CliCod, EstAny, EstSerFac, AcuImpDev, AcuImpImp, AcuNroImp, AcuNroDev, AcuOrd0) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESCLI")
         ,new UpdateCursor("P01WF3", "INSERT INTO TXPLESCLI(EmprCod, CliCod, EstAny, EstSerFac, EstMes, KgmTra, KgmTin, KgmRin, KgmRex, MtrTra, MtrTin, MtrRin, MtrRex, FacMt0, FacMt1, FacKg0, FacKg1, ImpCli0, ImpCli1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESCLI")
         ,new ForEachCursor("P01WF4", "SELECT EmprCod, CliCod, EstAny, EstSerFac, EstMes, KgmRex, MtrRex, KgmRin, MtrRin, KgmTin, MtrTin, KgmTra, MtrTra FROM TXPLESCLI WHERE EmprCod = ? and CliCod = ? and EstAny = ? and EstSerFac = ? and EstMes = ? ORDER BY EmprCod, CliCod, EstAny, EstSerFac, EstMes ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WF5", "UPDATE TXPLESCLI SET KgmRex=?, MtrRex=?, KgmRin=?, MtrRin=?, KgmTin=?, MtrTin=?, KgmTra=?, MtrTra=?  WHERE EmprCod = ? AND CliCod = ? AND EstAny = ? AND EstSerFac = ? AND EstMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESCLI")
         ,new UpdateCursor("P01WF6", "INSERT INTO TXPCESART(EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, TipArtCod, ArtRdto, ArtOrd0) VALUES(?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESART")
         ,new UpdateCursor("P01WF7", "INSERT INTO TXPLESART(EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes, ArtKilTra, ArtKilTin, ArtKilRin, ArtKilRex, ArtMtrTra, ArtMtrTin, ArtMtrRin, ArtMtrRex, ArtEstTart, ArtFacMt0, ArtFacMt1, ArtFacKg0, ArtFacKg1, ArtImp0, ArtImp1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESART")
         ,new ForEachCursor("P01WF8", "SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes, ArtKilRex, ArtMtrRex, ArtKilRin, ArtMtrRin, ArtKilTin, ArtMtrTin, ArtKilTra, ArtMtrTra FROM TXPLESART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtEstAny = ? and ArtEstSer = ? and ArtEstMes = ? ORDER BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WF9", "UPDATE TXPLESART SET ArtKilRex=?, ArtMtrRex=?, ArtKilRin=?, ArtMtrRin=?, ArtKilTin=?, ArtMtrTin=?, ArtKilTra=?, ArtMtrTra=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ArtEstAny = ? AND ArtEstSer = ? AND ArtEstMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESART")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               stmt.setString(12, (String)parms[19], 3);
               stmt.setByte(13, ((Number) parms[20]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[23]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setString(11, (String)parms[18], 16);
               stmt.setShort(12, ((Number) parms[19]).shortValue());
               stmt.setString(13, (String)parms[20], 3);
               stmt.setByte(14, ((Number) parms[21]).byteValue());
               return;
      }
   }

}

