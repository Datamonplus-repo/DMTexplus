package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprueba extends GXProcedure
{
   public pprueba( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprueba.class ), "" );
   }

   public pprueba( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      pprueba.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      pprueba.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprueba.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pprueba.this.AV8AlbRUniEnt = aP2[0];
      this.aP2 = aP2;
      pprueba.this.AV9AlbRPieEnt = aP3[0];
      this.aP3 = aP3;
      pprueba.this.AV10AlbRUniUti = aP4[0];
      this.aP4 = aP4;
      pprueba.this.AV12AlbRPieUti = aP5[0];
      this.aP5 = aP5;
      pprueba.this.AV11AlbRUniDis = aP6[0];
      this.aP6 = aP6;
      pprueba.this.AV13AlbRPieDis = aP7[0];
      this.aP7 = aP7;
      pprueba.this.AV15AlbREst = aP8[0];
      this.aP8 = aP8;
      pprueba.this.AV16AlbCum = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P011P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A56AlbRUni = P011P2_A56AlbRUni[0] ;
         A58AlbRUniEnt = P011P2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P011P2_A60AlbRUniUti[0] ;
         A47AlbREst = P011P2_A47AlbREst[0] ;
         A52AlbRPieEnt = P011P2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P011P2_A54AlbRPieUti[0] ;
         A2182HisEmpTPu = getHisEmpTPu0( A396EmprCod, A44AlbRecCod) ;
         A2181HisEmpTPe = getHisEmpTPe0( A396EmprCod, A44AlbRecCod) ;
         A2176HisEmpTKu = getHisEmpTKu0( A396EmprCod, A44AlbRecCod) ;
         A2175HisEmpTKe = getHisEmpTKe0( A396EmprCod, A44AlbRecCod) ;
         A2179HisEmpTMu = getHisEmpTMu0( A396EmprCod, A44AlbRecCod) ;
         A2178HisEmpTMe = getHisEmpTMe0( A396EmprCod, A44AlbRecCod) ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A58AlbRUniEnt = A2178HisEmpTMe ;
            A60AlbRUniUti = A2179HisEmpTMu ;
            A47AlbREst = (byte)(0) ;
            if ( A2178HisEmpTMe.subtract(A2179HisEmpTMu).doubleValue() <= 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A58AlbRUniEnt = A2175HisEmpTKe ;
            A60AlbRUniUti = A2176HisEmpTKu ;
            A47AlbREst = (byte)(0) ;
            if ( A2175HisEmpTKe.subtract(A2176HisEmpTKu).doubleValue() <= 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
         }
         A52AlbRPieEnt = A2181HisEmpTPe ;
         A54AlbRPieUti = A2182HisEmpTPu ;
         AV8AlbRUniEnt = A58AlbRUniEnt ;
         AV9AlbRPieEnt = A52AlbRPieEnt ;
         AV10AlbRUniUti = A60AlbRUniUti ;
         AV12AlbRPieUti = A54AlbRPieUti ;
         AV15AlbREst = A47AlbREst ;
         AV11AlbRUniDis = AV8AlbRUniEnt.subtract(AV10AlbRUniUti) ;
         AV13AlbRPieDis = (int)(AV9AlbRPieEnt-AV12AlbRPieUti) ;
         AV16AlbCum = httpContext.getMessage( "N", "") ;
         if ( A47AlbREst == 1 )
         {
            AV16AlbCum = httpContext.getMessage( "S", "") ;
         }
         /* Using cursor P011P3 */
         pr_default.execute(1, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Byte.valueOf(A47AlbREst), Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprueba.this.A396EmprCod;
      this.aP1[0] = pprueba.this.A44AlbRecCod;
      this.aP2[0] = pprueba.this.AV8AlbRUniEnt;
      this.aP3[0] = pprueba.this.AV9AlbRPieEnt;
      this.aP4[0] = pprueba.this.AV10AlbRUniUti;
      this.aP5[0] = pprueba.this.AV12AlbRPieUti;
      this.aP6[0] = pprueba.this.AV11AlbRUniDis;
      this.aP7[0] = pprueba.this.AV13AlbRPieDis;
      this.aP8[0] = pprueba.this.AV15AlbREst;
      this.aP9[0] = pprueba.this.AV16AlbCum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprueba");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getHisEmpTMe0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2168HisEmpMe = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P011P4 */
      pr_default.execute(2, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( ( ( GXutil.strcmp(P011P4_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2168HisEmpMe = P011P4_A2168HisEmpMe[0] ;
               nX2168HisEmpMe = false ;
               Gx_first = false ;
            }
            else
            {
               X2168HisEmpMe = X2168HisEmpMe.add(P011P4_A2168HisEmpMe[0]) ;
               nX2168HisEmpMe = false ;
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      return X2168HisEmpMe ;
   }

   public java.math.BigDecimal getHisEmpTMu0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2169HisEmpMu = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor P011P5 */
      pr_default.execute(3, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( ( ( ( GXutil.strcmp(P011P5_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "B", ""), "")) == 0 ) || ( GXutil.strcmp(P011P5_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2169HisEmpMu = P011P5_A2169HisEmpMu[0] ;
               nX2169HisEmpMu = false ;
               Gx_first = false ;
            }
            else
            {
               X2169HisEmpMu = X2169HisEmpMu.add(P011P5_A2169HisEmpMu[0]) ;
               nX2169HisEmpMu = false ;
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      return X2169HisEmpMu ;
   }

   public java.math.BigDecimal getHisEmpTKe0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2163HisEmpKe = DecimalUtil.doubleToDec(0) ;
      nX2163HisEmpKe = false ;
      Gx_first = true ;
      /* Using cursor P011P6 */
      pr_default.execute(4, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( ( ( GXutil.strcmp(P011P6_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2163HisEmpKe = P011P6_A2163HisEmpKe[0] ;
               nX2163HisEmpKe = false ;
               Gx_first = false ;
            }
            else
            {
               X2163HisEmpKe = X2163HisEmpKe.add(P011P6_A2163HisEmpKe[0]) ;
               nX2163HisEmpKe = false ;
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      return X2163HisEmpKe ;
   }

   public java.math.BigDecimal getHisEmpTKu0( String E396EmprCod ,
                                              int E44AlbRecCod )
   {
      X2164HisEmpKu = DecimalUtil.doubleToDec(0) ;
      nX2164HisEmpKu = false ;
      Gx_first = true ;
      /* Using cursor P011P7 */
      pr_default.execute(5, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( ( ( ( GXutil.strcmp(P011P7_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "B", ""), "")) == 0 ) || ( GXutil.strcmp(P011P7_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2164HisEmpKu = P011P7_A2164HisEmpKu[0] ;
               nX2164HisEmpKu = false ;
               Gx_first = false ;
            }
            else
            {
               X2164HisEmpKu = X2164HisEmpKu.add(P011P7_A2164HisEmpKu[0]) ;
               nX2164HisEmpKu = false ;
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      return X2164HisEmpKu ;
   }

   public int getHisEmpTPe0( String E396EmprCod ,
                             int E44AlbRecCod )
   {
      X2171HisEmpPe = (short)(0) ;
      nX2171HisEmpPe = false ;
      Gx_first = true ;
      /* Using cursor P011P8 */
      pr_default.execute(6, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( ( ( GXutil.strcmp(P011P8_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "E", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2171HisEmpPe = P011P8_A2171HisEmpPe[0] ;
               nX2171HisEmpPe = false ;
               Gx_first = false ;
            }
            else
            {
               X2171HisEmpPe = (short)(X2171HisEmpPe+P011P8_A2171HisEmpPe[0]) ;
               nX2171HisEmpPe = false ;
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      return X2171HisEmpPe ;
   }

   public int getHisEmpTPu0( String E396EmprCod ,
                             int E44AlbRecCod )
   {
      X2172HisEmpPu = (short)(0) ;
      nX2172HisEmpPu = false ;
      Gx_first = true ;
      /* Using cursor P011P9 */
      pr_default.execute(7, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         if ( ( ( ( GXutil.strcmp(P011P9_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "B", ""), "")) == 0 ) || ( GXutil.strcmp(P011P9_A2166HisEmpLTip[0], httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 ) ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E44AlbRecCod == E44AlbRecCod ) ) )
         {
            if ( Gx_first )
            {
               X2172HisEmpPu = P011P9_A2172HisEmpPu[0] ;
               nX2172HisEmpPu = false ;
               Gx_first = false ;
            }
            else
            {
               X2172HisEmpPu = (short)(X2172HisEmpPu+P011P9_A2172HisEmpPu[0]) ;
               nX2172HisEmpPu = false ;
            }
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
      return X2172HisEmpPu ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P011P2_A396EmprCod = new String[] {""} ;
      P011P2_A44AlbRecCod = new int[1] ;
      P011P2_A56AlbRUni = new String[] {""} ;
      P011P2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011P2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011P2_A47AlbREst = new byte[1] ;
      P011P2_A52AlbRPieEnt = new int[1] ;
      P011P2_A54AlbRPieUti = new int[1] ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A2176HisEmpTKu = DecimalUtil.ZERO ;
      A2175HisEmpTKe = DecimalUtil.ZERO ;
      A2179HisEmpTMu = DecimalUtil.ZERO ;
      A2178HisEmpTMe = DecimalUtil.ZERO ;
      X2168HisEmpMe = DecimalUtil.ZERO ;
      P011P4_A396EmprCod = new String[] {""} ;
      P011P4_A44AlbRecCod = new int[1] ;
      P011P4_A2165HisEmpLin = new short[1] ;
      P011P4_A2168HisEmpMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011P4_n2168HisEmpMe = new boolean[] {false} ;
      P011P4_A2166HisEmpLTip = new String[] {""} ;
      P011P4_n2166HisEmpLTip = new boolean[] {false} ;
      X2169HisEmpMu = DecimalUtil.ZERO ;
      P011P5_A396EmprCod = new String[] {""} ;
      P011P5_A44AlbRecCod = new int[1] ;
      P011P5_A2165HisEmpLin = new short[1] ;
      P011P5_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011P5_n2169HisEmpMu = new boolean[] {false} ;
      P011P5_A2166HisEmpLTip = new String[] {""} ;
      P011P5_n2166HisEmpLTip = new boolean[] {false} ;
      X2163HisEmpKe = DecimalUtil.ZERO ;
      P011P6_A396EmprCod = new String[] {""} ;
      P011P6_A44AlbRecCod = new int[1] ;
      P011P6_A2165HisEmpLin = new short[1] ;
      P011P6_A2163HisEmpKe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011P6_n2163HisEmpKe = new boolean[] {false} ;
      P011P6_A2166HisEmpLTip = new String[] {""} ;
      P011P6_n2166HisEmpLTip = new boolean[] {false} ;
      X2164HisEmpKu = DecimalUtil.ZERO ;
      P011P7_A396EmprCod = new String[] {""} ;
      P011P7_A44AlbRecCod = new int[1] ;
      P011P7_A2165HisEmpLin = new short[1] ;
      P011P7_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P011P7_n2164HisEmpKu = new boolean[] {false} ;
      P011P7_A2166HisEmpLTip = new String[] {""} ;
      P011P7_n2166HisEmpLTip = new boolean[] {false} ;
      P011P8_A396EmprCod = new String[] {""} ;
      P011P8_A44AlbRecCod = new int[1] ;
      P011P8_A2165HisEmpLin = new short[1] ;
      P011P8_A2171HisEmpPe = new short[1] ;
      P011P8_n2171HisEmpPe = new boolean[] {false} ;
      P011P8_A2166HisEmpLTip = new String[] {""} ;
      P011P8_n2166HisEmpLTip = new boolean[] {false} ;
      P011P9_A396EmprCod = new String[] {""} ;
      P011P9_A44AlbRecCod = new int[1] ;
      P011P9_A2165HisEmpLin = new short[1] ;
      P011P9_A2172HisEmpPu = new short[1] ;
      P011P9_n2172HisEmpPu = new boolean[] {false} ;
      P011P9_A2166HisEmpLTip = new String[] {""} ;
      P011P9_n2166HisEmpLTip = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprueba__default(),
         new Object[] {
             new Object[] {
            P011P2_A396EmprCod, P011P2_A44AlbRecCod, P011P2_A56AlbRUni, P011P2_A58AlbRUniEnt, P011P2_A60AlbRUniUti, P011P2_A47AlbREst, P011P2_A52AlbRPieEnt, P011P2_A54AlbRPieUti
            }
            , new Object[] {
            }
            , new Object[] {
            P011P4_A396EmprCod, P011P4_A44AlbRecCod, P011P4_A2165HisEmpLin, P011P4_A2168HisEmpMe, P011P4_n2168HisEmpMe, P011P4_A2166HisEmpLTip, P011P4_n2166HisEmpLTip
            }
            , new Object[] {
            P011P5_A396EmprCod, P011P5_A44AlbRecCod, P011P5_A2165HisEmpLin, P011P5_A2169HisEmpMu, P011P5_n2169HisEmpMu, P011P5_A2166HisEmpLTip, P011P5_n2166HisEmpLTip
            }
            , new Object[] {
            P011P6_A396EmprCod, P011P6_A44AlbRecCod, P011P6_A2165HisEmpLin, P011P6_A2163HisEmpKe, P011P6_n2163HisEmpKe, P011P6_A2166HisEmpLTip, P011P6_n2166HisEmpLTip
            }
            , new Object[] {
            P011P7_A396EmprCod, P011P7_A44AlbRecCod, P011P7_A2165HisEmpLin, P011P7_A2164HisEmpKu, P011P7_n2164HisEmpKu, P011P7_A2166HisEmpLTip, P011P7_n2166HisEmpLTip
            }
            , new Object[] {
            P011P8_A396EmprCod, P011P8_A44AlbRecCod, P011P8_A2165HisEmpLin, P011P8_A2171HisEmpPe, P011P8_n2171HisEmpPe, P011P8_A2166HisEmpLTip, P011P8_n2166HisEmpLTip
            }
            , new Object[] {
            P011P9_A396EmprCod, P011P9_A44AlbRecCod, P011P9_A2165HisEmpLin, P011P9_A2172HisEmpPu, P011P9_n2172HisEmpPu, P011P9_A2166HisEmpLTip, P011P9_n2166HisEmpLTip
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15AlbREst ;
   private byte A47AlbREst ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV9AlbRPieEnt ;
   private int AV12AlbRPieUti ;
   private int AV13AlbRPieDis ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A2182HisEmpTPu ;
   private int A2181HisEmpTPe ;
   private int E44AlbRecCod ;
   private int X2171HisEmpPe ;
   private int X2172HisEmpPu ;
   private java.math.BigDecimal AV8AlbRUniEnt ;
   private java.math.BigDecimal AV10AlbRUniUti ;
   private java.math.BigDecimal AV11AlbRUniDis ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A2176HisEmpTKu ;
   private java.math.BigDecimal A2175HisEmpTKe ;
   private java.math.BigDecimal A2179HisEmpTMu ;
   private java.math.BigDecimal A2178HisEmpTMe ;
   private java.math.BigDecimal X2168HisEmpMe ;
   private java.math.BigDecimal X2169HisEmpMu ;
   private java.math.BigDecimal X2163HisEmpKe ;
   private java.math.BigDecimal X2164HisEmpKu ;
   private String A396EmprCod ;
   private String AV16AlbCum ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String E396EmprCod ;
   private boolean Gx_first ;
   private boolean nX2168HisEmpMe ;
   private boolean nX2169HisEmpMu ;
   private boolean nX2163HisEmpKe ;
   private boolean nX2164HisEmpKu ;
   private boolean nX2171HisEmpPe ;
   private boolean nX2172HisEmpPu ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P011P2_A396EmprCod ;
   private int[] P011P2_A44AlbRecCod ;
   private String[] P011P2_A56AlbRUni ;
   private java.math.BigDecimal[] P011P2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P011P2_A60AlbRUniUti ;
   private byte[] P011P2_A47AlbREst ;
   private int[] P011P2_A52AlbRPieEnt ;
   private int[] P011P2_A54AlbRPieUti ;
   private String[] P011P4_A396EmprCod ;
   private int[] P011P4_A44AlbRecCod ;
   private short[] P011P4_A2165HisEmpLin ;
   private java.math.BigDecimal[] P011P4_A2168HisEmpMe ;
   private boolean[] P011P4_n2168HisEmpMe ;
   private String[] P011P4_A2166HisEmpLTip ;
   private boolean[] P011P4_n2166HisEmpLTip ;
   private String[] P011P5_A396EmprCod ;
   private int[] P011P5_A44AlbRecCod ;
   private short[] P011P5_A2165HisEmpLin ;
   private java.math.BigDecimal[] P011P5_A2169HisEmpMu ;
   private boolean[] P011P5_n2169HisEmpMu ;
   private String[] P011P5_A2166HisEmpLTip ;
   private boolean[] P011P5_n2166HisEmpLTip ;
   private String[] P011P6_A396EmprCod ;
   private int[] P011P6_A44AlbRecCod ;
   private short[] P011P6_A2165HisEmpLin ;
   private java.math.BigDecimal[] P011P6_A2163HisEmpKe ;
   private boolean[] P011P6_n2163HisEmpKe ;
   private String[] P011P6_A2166HisEmpLTip ;
   private boolean[] P011P6_n2166HisEmpLTip ;
   private String[] P011P7_A396EmprCod ;
   private int[] P011P7_A44AlbRecCod ;
   private short[] P011P7_A2165HisEmpLin ;
   private java.math.BigDecimal[] P011P7_A2164HisEmpKu ;
   private boolean[] P011P7_n2164HisEmpKu ;
   private String[] P011P7_A2166HisEmpLTip ;
   private boolean[] P011P7_n2166HisEmpLTip ;
   private String[] P011P8_A396EmprCod ;
   private int[] P011P8_A44AlbRecCod ;
   private short[] P011P8_A2165HisEmpLin ;
   private short[] P011P8_A2171HisEmpPe ;
   private boolean[] P011P8_n2171HisEmpPe ;
   private String[] P011P8_A2166HisEmpLTip ;
   private boolean[] P011P8_n2166HisEmpLTip ;
   private String[] P011P9_A396EmprCod ;
   private int[] P011P9_A44AlbRecCod ;
   private short[] P011P9_A2165HisEmpLin ;
   private short[] P011P9_A2172HisEmpPu ;
   private boolean[] P011P9_n2172HisEmpPu ;
   private String[] P011P9_A2166HisEmpLTip ;
   private boolean[] P011P9_n2166HisEmpLTip ;
}

final  class pprueba__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P011P2", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniEnt, AlbRUniUti, AlbREst, AlbRPieEnt, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P011P3", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbREst=?, AlbRPieEnt=?, AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P011P4", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpMe, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011P5", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpMu, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011P6", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpKe, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011P7", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpKu, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011P8", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpPe, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P011P9", "SELECT EmprCod, AlbRecCod, HisEmpLin, HisEmpPu, HisEmpLTip FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

