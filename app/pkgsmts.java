package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgsmts extends GXProcedure
{
   public pkgsmts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgsmts.class ), "" );
   }

   public pkgsmts( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          java.math.BigDecimal[] aP6 ,
                          java.math.BigDecimal[] aP7 ,
                          int[] aP8 )
   {
      pkgsmts.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 )
   {
      pkgsmts.this.A396EmprCod = aP0;
      pkgsmts.this.A129BarCod = aP1;
      pkgsmts.this.A132BarCodReo = aP2;
      pkgsmts.this.A130BarCodPar = aP3;
      pkgsmts.this.aP4 = aP4;
      pkgsmts.this.aP5 = aP5;
      pkgsmts.this.aP6 = aP6;
      pkgsmts.this.aP7 = aP7;
      pkgsmts.this.aP8 = aP8;
      pkgsmts.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Metros = DecimalUtil.ZERO ;
      AV17BarKgm = DecimalUtil.ZERO ;
      AV19PzasLan = 0 ;
      AV24FlagModa = (byte)(0) ;
      GXv_int1[0] = AV24FlagModa ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pkgsmts.this.AV24FlagModa = GXv_int1[0] ;
      GXt_int2 = AV29Suprema ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int1) ;
      pkgsmts.this.GXt_int2 = GXv_int1[0] ;
      AV29Suprema = GXt_int2 ;
      GXt_int2 = AV30carvema ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
      pkgsmts.this.GXt_int2 = GXv_int1[0] ;
      AV30carvema = GXt_int2 ;
      GXt_int2 = AV31RounMts ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ROUNMT", ""), GXv_int1) ;
      pkgsmts.this.GXt_int2 = GXv_int1[0] ;
      AV31RounMts = GXt_int2 ;
      GXt_int2 = AV32carvitin ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int1) ;
      pkgsmts.this.GXt_int2 = GXv_int1[0] ;
      AV32carvitin = GXt_int2 ;
      AV18BarKgm2 = DecimalUtil.doubleToDec(0) ;
      AV16Metros2 = DecimalUtil.doubleToDec(0) ;
      AV22BarKgm1 = DecimalUtil.doubleToDec(0) ;
      AV21Metros1 = DecimalUtil.doubleToDec(0) ;
      AV23PzasLan1 = 0 ;
      if ( AV32carvitin == 1 )
      {
         AV33lmetpi = (byte)(0) ;
         /* Using cursor P00L62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A2814MetPieKil = P00L62_A2814MetPieKil[0] ;
            A2815MetPieMet = P00L62_A2815MetPieMet[0] ;
            A2809MetTerCod = P00L62_A2809MetTerCod[0] ;
            A2813MetPieCod = P00L62_A2813MetPieCod[0] ;
            AV23PzasLan1 = (int)(AV23PzasLan1+1) ;
            AV22BarKgm1 = AV22BarKgm1.add(A2814MetPieKil) ;
            AV21Metros1 = AV21Metros1.add(A2815MetPieMet) ;
            AV33lmetpi = (byte)(1) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P00L63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1909BarGraAca = P00L63_A1909BarGraAca[0] ;
            A125BarAncAca1 = P00L63_A125BarAncAca1[0] ;
            AV25BarGraAca = A1909BarGraAca ;
            AV26BarAncAca1 = A125BarAncAca1 ;
            /* Using cursor P00L64 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A170BarKilLan = P00L64_A170BarKilLan[0] ;
               A183BarMetLan = P00L64_A183BarMetLan[0] ;
               A203BarPieKil = P00L64_A203BarPieKil[0] ;
               A205BarPieMet = P00L64_A205BarPieMet[0] ;
               A1501BarPiePie = P00L64_A1501BarPiePie[0] ;
               A200BarPieCod = P00L64_A200BarPieCod[0] ;
               AV18BarKgm2 = AV18BarKgm2.add(A170BarKilLan) ;
               AV16Metros2 = AV16Metros2.add(A183BarMetLan) ;
               if ( AV33lmetpi == 0 )
               {
                  AV22BarKgm1 = AV22BarKgm1.add(A203BarPieKil) ;
                  AV21Metros1 = AV21Metros1.add(A205BarPieMet) ;
                  AV23PzasLan1 = (int)(AV23PzasLan1+A1501BarPiePie) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P00L65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1909BarGraAca = P00L65_A1909BarGraAca[0] ;
            A125BarAncAca1 = P00L65_A125BarAncAca1[0] ;
            AV25BarGraAca = A1909BarGraAca ;
            AV26BarAncAca1 = A125BarAncAca1 ;
            /* Using cursor P00L66 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A3277BarPieAut = P00L66_A3277BarPieAut[0] ;
               n3277BarPieAut = P00L66_n3277BarPieAut[0] ;
               A1501BarPiePie = P00L66_A1501BarPiePie[0] ;
               A3275BarKgsAut = P00L66_A3275BarKgsAut[0] ;
               n3275BarKgsAut = P00L66_n3275BarKgsAut[0] ;
               A203BarPieKil = P00L66_A203BarPieKil[0] ;
               A3276BarMtsAut = P00L66_A3276BarMtsAut[0] ;
               n3276BarMtsAut = P00L66_n3276BarMtsAut[0] ;
               A205BarPieMet = P00L66_A205BarPieMet[0] ;
               A170BarKilLan = P00L66_A170BarKilLan[0] ;
               A183BarMetLan = P00L66_A183BarMetLan[0] ;
               A200BarPieCod = P00L66_A200BarPieCod[0] ;
               if ( (0==A3277BarPieAut) )
               {
                  AV23PzasLan1 = (int)(AV23PzasLan1+A1501BarPiePie) ;
               }
               else
               {
                  AV23PzasLan1 = (int)(AV23PzasLan1+A3277BarPieAut) ;
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3275BarKgsAut)==0) )
               {
                  AV22BarKgm1 = AV22BarKgm1.add(A203BarPieKil) ;
               }
               else
               {
                  AV22BarKgm1 = AV22BarKgm1.add(A3275BarKgsAut) ;
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3276BarMtsAut)==0) )
               {
                  AV21Metros1 = AV21Metros1.add(A205BarPieMet) ;
               }
               else
               {
                  AV21Metros1 = AV21Metros1.add(A3276BarMtsAut) ;
               }
               AV18BarKgm2 = AV18BarKgm2.add(A170BarKilLan) ;
               AV16Metros2 = AV16Metros2.add(A183BarMetLan) ;
               if ( ( AV30carvema == 1 ) && ( ( A3275BarKgsAut.doubleValue() > 0 ) || ( A3276BarMtsAut.doubleValue() > 0 ) ) )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      AV15Metros = AV21Metros1.subtract(AV16Metros2) ;
      if ( AV31RounMts == 1 )
      {
         AV15Metros = GXutil.roundDecimal( AV15Metros, 0) ;
      }
      AV17BarKgm = AV22BarKgm1.subtract(AV18BarKgm2) ;
      if ( AV24FlagModa == 1 )
      {
         AV27Ancho = DecimalUtil.doubleToDec(AV26BarAncAca1/ (double) (100)) ;
         if ( (DecimalUtil.doubleToDec(AV25BarGraAca).multiply(AV27Ancho)).doubleValue() > 0 )
         {
            AV15Metros = (AV22BarKgm1.divide((DecimalUtil.doubleToDec(AV25BarGraAca).multiply(AV27Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
         }
      }
      AV19PzasLan = (int)(AV23PzasLan1-AV20PzasLan2) ;
      if ( AV29Suprema == 1 )
      {
         AV28Su_und = 0 ;
         /* Optimized group. */
         /* Using cursor P00L67 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c7563Su_Und = P00L67_A7563Su_Und[0] ;
         n7563Su_Und = P00L67_n7563Su_Und[0] ;
         pr_default.close(5);
         AV28Su_und = (int)(AV28Su_und+c7563Su_Und) ;
         /* End optimized group. */
         AV19PzasLan = (int)(AV19PzasLan-AV28Su_und) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pkgsmts.this.AV15Metros;
      this.aP5[0] = pkgsmts.this.AV16Metros2;
      this.aP6[0] = pkgsmts.this.AV17BarKgm;
      this.aP7[0] = pkgsmts.this.AV18BarKgm2;
      this.aP8[0] = pkgsmts.this.AV19PzasLan;
      this.aP9[0] = pkgsmts.this.AV20PzasLan2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Metros = DecimalUtil.ZERO ;
      AV16Metros2 = DecimalUtil.ZERO ;
      AV17BarKgm = DecimalUtil.ZERO ;
      AV18BarKgm2 = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      AV22BarKgm1 = DecimalUtil.ZERO ;
      AV21Metros1 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00L62_A396EmprCod = new String[] {""} ;
      P00L62_A129BarCod = new int[1] ;
      P00L62_A132BarCodReo = new byte[1] ;
      P00L62_A130BarCodPar = new String[] {""} ;
      P00L62_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L62_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L62_A2809MetTerCod = new String[] {""} ;
      P00L62_A2813MetPieCod = new String[] {""} ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2809MetTerCod = "" ;
      A2813MetPieCod = "" ;
      P00L63_A396EmprCod = new String[] {""} ;
      P00L63_A129BarCod = new int[1] ;
      P00L63_A132BarCodReo = new byte[1] ;
      P00L63_A130BarCodPar = new String[] {""} ;
      P00L63_A1909BarGraAca = new short[1] ;
      P00L63_A125BarAncAca1 = new short[1] ;
      P00L64_A396EmprCod = new String[] {""} ;
      P00L64_A129BarCod = new int[1] ;
      P00L64_A132BarCodReo = new byte[1] ;
      P00L64_A130BarCodPar = new String[] {""} ;
      P00L64_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L64_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L64_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L64_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L64_A1501BarPiePie = new int[1] ;
      P00L64_A200BarPieCod = new String[] {""} ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P00L65_A396EmprCod = new String[] {""} ;
      P00L65_A129BarCod = new int[1] ;
      P00L65_A132BarCodReo = new byte[1] ;
      P00L65_A130BarCodPar = new String[] {""} ;
      P00L65_A1909BarGraAca = new short[1] ;
      P00L65_A125BarAncAca1 = new short[1] ;
      P00L66_A396EmprCod = new String[] {""} ;
      P00L66_A129BarCod = new int[1] ;
      P00L66_A132BarCodReo = new byte[1] ;
      P00L66_A130BarCodPar = new String[] {""} ;
      P00L66_A3277BarPieAut = new short[1] ;
      P00L66_n3277BarPieAut = new boolean[] {false} ;
      P00L66_A1501BarPiePie = new int[1] ;
      P00L66_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L66_n3275BarKgsAut = new boolean[] {false} ;
      P00L66_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L66_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L66_n3276BarMtsAut = new boolean[] {false} ;
      P00L66_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L66_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L66_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00L66_A200BarPieCod = new String[] {""} ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      AV27Ancho = DecimalUtil.ZERO ;
      P00L67_A7563Su_Und = new int[1] ;
      P00L67_n7563Su_Und = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgsmts__default(),
         new Object[] {
             new Object[] {
            P00L62_A396EmprCod, P00L62_A129BarCod, P00L62_A132BarCodReo, P00L62_A130BarCodPar, P00L62_A2814MetPieKil, P00L62_A2815MetPieMet, P00L62_A2809MetTerCod, P00L62_A2813MetPieCod
            }
            , new Object[] {
            P00L63_A396EmprCod, P00L63_A129BarCod, P00L63_A132BarCodReo, P00L63_A130BarCodPar, P00L63_A1909BarGraAca, P00L63_A125BarAncAca1
            }
            , new Object[] {
            P00L64_A396EmprCod, P00L64_A129BarCod, P00L64_A132BarCodReo, P00L64_A130BarCodPar, P00L64_A170BarKilLan, P00L64_A183BarMetLan, P00L64_A203BarPieKil, P00L64_A205BarPieMet, P00L64_A1501BarPiePie, P00L64_A200BarPieCod
            }
            , new Object[] {
            P00L65_A396EmprCod, P00L65_A129BarCod, P00L65_A132BarCodReo, P00L65_A130BarCodPar, P00L65_A1909BarGraAca, P00L65_A125BarAncAca1
            }
            , new Object[] {
            P00L66_A396EmprCod, P00L66_A129BarCod, P00L66_A132BarCodReo, P00L66_A130BarCodPar, P00L66_A3277BarPieAut, P00L66_n3277BarPieAut, P00L66_A1501BarPiePie, P00L66_A3275BarKgsAut, P00L66_n3275BarKgsAut, P00L66_A203BarPieKil,
            P00L66_A3276BarMtsAut, P00L66_n3276BarMtsAut, P00L66_A205BarPieMet, P00L66_A170BarKilLan, P00L66_A183BarMetLan, P00L66_A200BarPieCod
            }
            , new Object[] {
            P00L67_A7563Su_Und, P00L67_n7563Su_Und
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV24FlagModa ;
   private byte AV29Suprema ;
   private byte AV30carvema ;
   private byte AV31RounMts ;
   private byte AV32carvitin ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private byte AV33lmetpi ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short AV25BarGraAca ;
   private short AV26BarAncAca1 ;
   private short A3277BarPieAut ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV19PzasLan ;
   private int AV20PzasLan2 ;
   private int AV23PzasLan1 ;
   private int A1501BarPiePie ;
   private int AV28Su_und ;
   private int c7563Su_Und ;
   private java.math.BigDecimal AV15Metros ;
   private java.math.BigDecimal AV16Metros2 ;
   private java.math.BigDecimal AV17BarKgm ;
   private java.math.BigDecimal AV18BarKgm2 ;
   private java.math.BigDecimal AV22BarKgm1 ;
   private java.math.BigDecimal AV21Metros1 ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal AV27Ancho ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2809MetTerCod ;
   private String A2813MetPieCod ;
   private String A200BarPieCod ;
   private boolean n3277BarPieAut ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n7563Su_Und ;
   private int[] aP9 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00L62_A396EmprCod ;
   private int[] P00L62_A129BarCod ;
   private byte[] P00L62_A132BarCodReo ;
   private String[] P00L62_A130BarCodPar ;
   private java.math.BigDecimal[] P00L62_A2814MetPieKil ;
   private java.math.BigDecimal[] P00L62_A2815MetPieMet ;
   private String[] P00L62_A2809MetTerCod ;
   private String[] P00L62_A2813MetPieCod ;
   private String[] P00L63_A396EmprCod ;
   private int[] P00L63_A129BarCod ;
   private byte[] P00L63_A132BarCodReo ;
   private String[] P00L63_A130BarCodPar ;
   private short[] P00L63_A1909BarGraAca ;
   private short[] P00L63_A125BarAncAca1 ;
   private String[] P00L64_A396EmprCod ;
   private int[] P00L64_A129BarCod ;
   private byte[] P00L64_A132BarCodReo ;
   private String[] P00L64_A130BarCodPar ;
   private java.math.BigDecimal[] P00L64_A170BarKilLan ;
   private java.math.BigDecimal[] P00L64_A183BarMetLan ;
   private java.math.BigDecimal[] P00L64_A203BarPieKil ;
   private java.math.BigDecimal[] P00L64_A205BarPieMet ;
   private int[] P00L64_A1501BarPiePie ;
   private String[] P00L64_A200BarPieCod ;
   private String[] P00L65_A396EmprCod ;
   private int[] P00L65_A129BarCod ;
   private byte[] P00L65_A132BarCodReo ;
   private String[] P00L65_A130BarCodPar ;
   private short[] P00L65_A1909BarGraAca ;
   private short[] P00L65_A125BarAncAca1 ;
   private String[] P00L66_A396EmprCod ;
   private int[] P00L66_A129BarCod ;
   private byte[] P00L66_A132BarCodReo ;
   private String[] P00L66_A130BarCodPar ;
   private short[] P00L66_A3277BarPieAut ;
   private boolean[] P00L66_n3277BarPieAut ;
   private int[] P00L66_A1501BarPiePie ;
   private java.math.BigDecimal[] P00L66_A3275BarKgsAut ;
   private boolean[] P00L66_n3275BarKgsAut ;
   private java.math.BigDecimal[] P00L66_A203BarPieKil ;
   private java.math.BigDecimal[] P00L66_A3276BarMtsAut ;
   private boolean[] P00L66_n3276BarMtsAut ;
   private java.math.BigDecimal[] P00L66_A205BarPieMet ;
   private java.math.BigDecimal[] P00L66_A170BarKilLan ;
   private java.math.BigDecimal[] P00L66_A183BarMetLan ;
   private String[] P00L66_A200BarPieCod ;
   private int[] P00L67_A7563Su_Und ;
   private boolean[] P00L67_n7563Su_Und ;
}

final  class pkgsmts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00L62", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieKil, MetPieMet, MetTerCod, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00L63", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarGraAca, BarAncAca1 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00L64", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarKilLan, BarMetLan, BarPieKil, BarPieMet, BarPiePie, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00L65", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarGraAca, BarAncAca1 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00L66", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieAut, BarPiePie, BarKgsAut, BarPieKil, BarMtsAut, BarPieMet, BarKilLan, BarMetLan, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00L67", "SELECT SUM(Su_Und) FROM TXPSU0001 WHERE EmprCod = ? and Su_Barcod = ? and Su_Barreo = ? and Su_Barpar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[15])[0] = rslt.getString(13, 9);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

