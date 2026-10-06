package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pppmd21 extends GXProcedure
{
   public pppmd21( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pppmd21.class ), "" );
   }

   public pppmd21( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        byte[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        java.math.BigDecimal aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             byte[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.math.BigDecimal aP15 )
   {
      pppmd21.this.A396EmprCod = aP0;
      pppmd21.this.A129BarCod = aP1;
      pppmd21.this.A132BarCodReo = aP2;
      pppmd21.this.A130BarCodPar = aP3;
      pppmd21.this.aP4 = aP4;
      pppmd21.this.aP5 = aP5;
      pppmd21.this.AV9Tipo = aP6;
      pppmd21.this.aP7 = aP7;
      pppmd21.this.aP8 = aP8;
      pppmd21.this.aP9 = aP9;
      pppmd21.this.aP10 = aP10;
      pppmd21.this.aP11 = aP11;
      pppmd21.this.aP12 = aP12;
      pppmd21.this.aP13 = aP13;
      pppmd21.this.aP14 = aP14;
      pppmd21.this.AV25BarPreKgm = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14PMDDsc = "" ;
      AV13PMDAcaPrc = DecimalUtil.doubleToDec(0) ;
      AV15PMDDtoAca = DecimalUtil.doubleToDec(0) ;
      AV16PMDDtoTin = DecimalUtil.doubleToDec(0) ;
      AV17PMDTinPrc = DecimalUtil.doubleToDec(0) ;
      AV23OkKgMin = (byte)(0) ;
      AV24PMDPreUni = DecimalUtil.doubleToDec(0) ;
      AV32KilosIni = AV10Kilos ;
      /* Using cursor P037P3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3311BarManCod1 = P037P3_A3311BarManCod1[0] ;
         A4836BarAudSup = P037P3_A4836BarAudSup[0] ;
         A252CliCod = P037P3_A252CliCod[0] ;
         n252CliCod = P037P3_n252CliCod[0] ;
         A361DisCod = P037P3_A361DisCod[0] ;
         A8400PMDPreLim = P037P3_A8400PMDPreLim[0] ;
         n8400PMDPreLim = P037P3_n8400PMDPreLim[0] ;
         A8401PMDPreMin = P037P3_A8401PMDPreMin[0] ;
         n8401PMDPreMin = P037P3_n8401PMDPreMin[0] ;
         A166BarKgm = P037P3_A166BarKgm[0] ;
         n166BarKgm = P037P3_n166BarKgm[0] ;
         A8400PMDPreLim = P037P3_A8400PMDPreLim[0] ;
         n8400PMDPreLim = P037P3_n8400PMDPreLim[0] ;
         A8401PMDPreMin = P037P3_A8401PMDPreMin[0] ;
         n8401PMDPreMin = P037P3_n8401PMDPreMin[0] ;
         A166BarKgm = P037P3_A166BarKgm[0] ;
         n166BarKgm = P037P3_n166BarKgm[0] ;
         GXv_int1[0] = AV19MacCod ;
         new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int1) ;
         pppmd21.this.AV19MacCod = GXv_int1[0] ;
         AV20TotKgMacro = DecimalUtil.doubleToDec(0) ;
         AV22MayorKg = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P037P4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19MacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1199MacCod = P037P4_A1199MacCod[0] ;
            A1203MacBarCod = P037P4_A1203MacBarCod[0] ;
            A1204MacBarReo = P037P4_A1204MacBarReo[0] ;
            A1205MacBarPar = P037P4_A1205MacBarPar[0] ;
            A1201MacLin = P037P4_A1201MacLin[0] ;
            GXv_decimal2[0] = AV21KgmAgr ;
            GXv_char3[0] = " " ;
            GXv_char4[0] = " " ;
            GXv_int1[0] = 0 ;
            new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal2, GXv_char3, GXv_char4, GXv_int1) ;
            pppmd21.this.AV21KgmAgr = GXv_decimal2[0] ;
            AV20TotKgMacro = AV20TotKgMacro.add(AV21KgmAgr) ;
            if ( DecimalUtil.compareTo(AV21KgmAgr, AV22MayorKg) > 0 )
            {
               AV22MayorKg = AV21KgmAgr ;
            }
            AV36Lastkilos = AV21KgmAgr ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV20TotKgMacro.doubleValue() == 0 )
         {
            AV20TotKgMacro = A166BarKgm ;
            AV22MayorKg = A166BarKgm ;
         }
         if ( A3311BarManCod1 == 0 )
         {
            AV14PMDDsc = httpContext.getMessage( "Nao existe", "") ;
            /* Using cursor P037P5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV20TotKgMacro, AV20TotKgMacro});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A8405PMDKgmMax = P037P5_A8405PMDKgmMax[0] ;
               A8404PMDKgmMin = P037P5_A8404PMDKgmMin[0] ;
               A8407PMDAcaPrc = P037P5_A8407PMDAcaPrc[0] ;
               A8406PMDTinPrc = P037P5_A8406PMDTinPrc[0] ;
               A8408PMDKgmMinS = P037P5_A8408PMDKgmMinS[0] ;
               A8403PMDLin = P037P5_A8403PMDLin[0] ;
               AV13PMDAcaPrc = A8407PMDAcaPrc ;
               AV17PMDTinPrc = A8406PMDTinPrc ;
               if ( ( DecimalUtil.compareTo(AV10Kilos, A8408PMDKgmMinS) < 0 ) && ( A8408PMDKgmMinS.doubleValue() != 0 ) )
               {
                  AV23OkKgMin = (byte)(1) ;
                  AV18PMDKgmMinS = DecimalUtil.doubleToDec(0) ;
                  if ( DecimalUtil.compareTo(A166BarKgm, AV22MayorKg) == 0 )
                  {
                     AV18PMDKgmMinS = A8408PMDKgmMinS ;
                  }
                  AV10Kilos = AV18PMDKgmMinS ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV8Precio = AV25BarPreKgm.add(((AV25BarPreKgm.multiply(AV17PMDTinPrc)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
            if ( DecimalUtil.compareTo(AV8Precio.multiply(((DecimalUtil.doubleToDec(100).subtract(((GXutil.strcmp(AV9Tipo, httpContext.getMessage( "A", ""))==0) ? AV13PMDAcaPrc : AV17PMDTinPrc))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(AV10Kilos), A8400PMDPreLim) < 0 )
            {
               AV13PMDAcaPrc = DecimalUtil.doubleToDec(0) ;
               AV17PMDTinPrc = DecimalUtil.doubleToDec(0) ;
               AV8Precio = ((AV10Kilos.doubleValue()>0) ? A8401PMDPreMin.divide(AV10Kilos, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            }
         }
         else
         {
            AV42GXLvl85 = (byte)(0) ;
            /* Using cursor P037P6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A3311BarManCod1), Integer.valueOf(A4836BarAudSup)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A8393PMDColNum = P037P6_A8393PMDColNum[0] ;
               A8391PMDCod = P037P6_A8391PMDCod[0] ;
               A8392PMDDsc = P037P6_A8392PMDDsc[0] ;
               n8392PMDDsc = P037P6_n8392PMDDsc[0] ;
               A8398PMDDtoAca = P037P6_A8398PMDDtoAca[0] ;
               A8397PMDDtoTin = P037P6_A8397PMDDtoTin[0] ;
               A8532PMDPreUni = P037P6_A8532PMDPreUni[0] ;
               A8392PMDDsc = P037P6_A8392PMDDsc[0] ;
               n8392PMDDsc = P037P6_n8392PMDDsc[0] ;
               AV42GXLvl85 = (byte)(1) ;
               AV14PMDDsc = A8392PMDDsc ;
               AV15PMDDtoAca = A8398PMDDtoAca ;
               AV16PMDDtoTin = A8397PMDDtoTin ;
               AV8Precio = A8532PMDPreUni ;
               AV33c = A8532PMDPreUni ;
               AV24PMDPreUni = A8532PMDPreUni ;
               if ( A8532PMDPreUni.doubleValue() == 0 )
               {
                  AV8Precio = AV25BarPreKgm.subtract(((AV25BarPreKgm.multiply(A8397PMDDtoTin)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            if ( AV42GXLvl85 == 0 )
            {
               AV14PMDDsc = httpContext.getMessage( "Nao existe", "") ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pppmd21.this.AV8Precio;
      this.aP5[0] = pppmd21.this.AV10Kilos;
      this.aP7[0] = pppmd21.this.AV14PMDDsc;
      this.aP8[0] = pppmd21.this.AV16PMDDtoTin;
      this.aP9[0] = pppmd21.this.AV15PMDDtoAca;
      this.aP10[0] = pppmd21.this.AV17PMDTinPrc;
      this.aP11[0] = pppmd21.this.AV13PMDAcaPrc;
      this.aP12[0] = pppmd21.this.AV18PMDKgmMinS;
      this.aP13[0] = pppmd21.this.AV23OkKgMin;
      this.aP14[0] = pppmd21.this.AV24PMDPreUni;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Precio = DecimalUtil.ZERO ;
      AV10Kilos = DecimalUtil.ZERO ;
      AV14PMDDsc = "" ;
      AV16PMDDtoTin = DecimalUtil.ZERO ;
      AV15PMDDtoAca = DecimalUtil.ZERO ;
      AV17PMDTinPrc = DecimalUtil.ZERO ;
      AV13PMDAcaPrc = DecimalUtil.ZERO ;
      AV18PMDKgmMinS = DecimalUtil.ZERO ;
      AV24PMDPreUni = DecimalUtil.ZERO ;
      AV32KilosIni = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P037P3_A396EmprCod = new String[] {""} ;
      P037P3_A129BarCod = new int[1] ;
      P037P3_A132BarCodReo = new byte[1] ;
      P037P3_A130BarCodPar = new String[] {""} ;
      P037P3_A3311BarManCod1 = new short[1] ;
      P037P3_A4836BarAudSup = new int[1] ;
      P037P3_A252CliCod = new int[1] ;
      P037P3_n252CliCod = new boolean[] {false} ;
      P037P3_A361DisCod = new int[1] ;
      P037P3_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P3_n8400PMDPreLim = new boolean[] {false} ;
      P037P3_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P3_n8401PMDPreMin = new boolean[] {false} ;
      P037P3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P3_n166BarKgm = new boolean[] {false} ;
      A8400PMDPreLim = DecimalUtil.ZERO ;
      A8401PMDPreMin = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV20TotKgMacro = DecimalUtil.ZERO ;
      AV22MayorKg = DecimalUtil.ZERO ;
      P037P4_A396EmprCod = new String[] {""} ;
      P037P4_A1199MacCod = new int[1] ;
      P037P4_A1203MacBarCod = new int[1] ;
      P037P4_A1204MacBarReo = new byte[1] ;
      P037P4_A1205MacBarPar = new String[] {""} ;
      P037P4_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV21KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int1 = new int[1] ;
      AV36Lastkilos = DecimalUtil.ZERO ;
      P037P5_A396EmprCod = new String[] {""} ;
      P037P5_A252CliCod = new int[1] ;
      P037P5_n252CliCod = new boolean[] {false} ;
      P037P5_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P5_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P5_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P5_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P5_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P5_A8403PMDLin = new short[1] ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
      P037P6_A396EmprCod = new String[] {""} ;
      P037P6_A252CliCod = new int[1] ;
      P037P6_n252CliCod = new boolean[] {false} ;
      P037P6_A8393PMDColNum = new int[1] ;
      P037P6_A8391PMDCod = new short[1] ;
      P037P6_A8392PMDDsc = new String[] {""} ;
      P037P6_n8392PMDDsc = new boolean[] {false} ;
      P037P6_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P6_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037P6_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A8392PMDDsc = "" ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      AV33c = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pppmd21__default(),
         new Object[] {
             new Object[] {
            P037P3_A396EmprCod, P037P3_A129BarCod, P037P3_A132BarCodReo, P037P3_A130BarCodPar, P037P3_A3311BarManCod1, P037P3_A4836BarAudSup, P037P3_A252CliCod, P037P3_n252CliCod, P037P3_A361DisCod, P037P3_A8400PMDPreLim,
            P037P3_n8400PMDPreLim, P037P3_A8401PMDPreMin, P037P3_n8401PMDPreMin, P037P3_A166BarKgm, P037P3_n166BarKgm
            }
            , new Object[] {
            P037P4_A396EmprCod, P037P4_A1199MacCod, P037P4_A1203MacBarCod, P037P4_A1204MacBarReo, P037P4_A1205MacBarPar, P037P4_A1201MacLin
            }
            , new Object[] {
            P037P5_A396EmprCod, P037P5_A252CliCod, P037P5_A8405PMDKgmMax, P037P5_A8404PMDKgmMin, P037P5_A8407PMDAcaPrc, P037P5_A8406PMDTinPrc, P037P5_A8408PMDKgmMinS, P037P5_A8403PMDLin
            }
            , new Object[] {
            P037P6_A396EmprCod, P037P6_A252CliCod, P037P6_A8393PMDColNum, P037P6_A8391PMDCod, P037P6_A8392PMDDsc, P037P6_n8392PMDDsc, P037P6_A8398PMDDtoAca, P037P6_A8397PMDDtoTin, P037P6_A8532PMDPreUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV23OkKgMin ;
   private byte A1204MacBarReo ;
   private byte AV42GXLvl85 ;
   private short A3311BarManCod1 ;
   private short A1201MacLin ;
   private short A8403PMDLin ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4836BarAudSup ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int AV19MacCod ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int1[] ;
   private int A8393PMDColNum ;
   private java.math.BigDecimal AV8Precio ;
   private java.math.BigDecimal AV10Kilos ;
   private java.math.BigDecimal AV16PMDDtoTin ;
   private java.math.BigDecimal AV15PMDDtoAca ;
   private java.math.BigDecimal AV17PMDTinPrc ;
   private java.math.BigDecimal AV13PMDAcaPrc ;
   private java.math.BigDecimal AV18PMDKgmMinS ;
   private java.math.BigDecimal AV24PMDPreUni ;
   private java.math.BigDecimal AV25BarPreKgm ;
   private java.math.BigDecimal AV32KilosIni ;
   private java.math.BigDecimal A8400PMDPreLim ;
   private java.math.BigDecimal A8401PMDPreMin ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV20TotKgMacro ;
   private java.math.BigDecimal AV22MayorKg ;
   private java.math.BigDecimal AV21KgmAgr ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private java.math.BigDecimal AV36Lastkilos ;
   private java.math.BigDecimal A8405PMDKgmMax ;
   private java.math.BigDecimal A8404PMDKgmMin ;
   private java.math.BigDecimal A8407PMDAcaPrc ;
   private java.math.BigDecimal A8406PMDTinPrc ;
   private java.math.BigDecimal A8408PMDKgmMinS ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private java.math.BigDecimal AV33c ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9Tipo ;
   private String AV14PMDDsc ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String A8392PMDDsc ;
   private boolean n252CliCod ;
   private boolean n8400PMDPreLim ;
   private boolean n8401PMDPreMin ;
   private boolean n166BarKgm ;
   private boolean n8392PMDDsc ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private byte[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P037P3_A396EmprCod ;
   private int[] P037P3_A129BarCod ;
   private byte[] P037P3_A132BarCodReo ;
   private String[] P037P3_A130BarCodPar ;
   private short[] P037P3_A3311BarManCod1 ;
   private int[] P037P3_A4836BarAudSup ;
   private int[] P037P3_A252CliCod ;
   private boolean[] P037P3_n252CliCod ;
   private int[] P037P3_A361DisCod ;
   private java.math.BigDecimal[] P037P3_A8400PMDPreLim ;
   private boolean[] P037P3_n8400PMDPreLim ;
   private java.math.BigDecimal[] P037P3_A8401PMDPreMin ;
   private boolean[] P037P3_n8401PMDPreMin ;
   private java.math.BigDecimal[] P037P3_A166BarKgm ;
   private boolean[] P037P3_n166BarKgm ;
   private String[] P037P4_A396EmprCod ;
   private int[] P037P4_A1199MacCod ;
   private int[] P037P4_A1203MacBarCod ;
   private byte[] P037P4_A1204MacBarReo ;
   private String[] P037P4_A1205MacBarPar ;
   private short[] P037P4_A1201MacLin ;
   private String[] P037P5_A396EmprCod ;
   private int[] P037P5_A252CliCod ;
   private boolean[] P037P5_n252CliCod ;
   private java.math.BigDecimal[] P037P5_A8405PMDKgmMax ;
   private java.math.BigDecimal[] P037P5_A8404PMDKgmMin ;
   private java.math.BigDecimal[] P037P5_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] P037P5_A8406PMDTinPrc ;
   private java.math.BigDecimal[] P037P5_A8408PMDKgmMinS ;
   private short[] P037P5_A8403PMDLin ;
   private String[] P037P6_A396EmprCod ;
   private int[] P037P6_A252CliCod ;
   private boolean[] P037P6_n252CliCod ;
   private int[] P037P6_A8393PMDColNum ;
   private short[] P037P6_A8391PMDCod ;
   private String[] P037P6_A8392PMDDsc ;
   private boolean[] P037P6_n8392PMDDsc ;
   private java.math.BigDecimal[] P037P6_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P037P6_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P037P6_A8532PMDPreUni ;
}

final  class pppmd21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037P3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarManCod1, T1.BarAudSup, T1.CliCod, T1.DisCod, T2.PMDPreLim, T2.PMDPreMin, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037P4", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037P5", "SELECT EmprCod, CliCod, PMDKgmMax, PMDKgmMin, PMDAcaPrc, PMDTinPrc, PMDKgmMinS, PMDLin FROM TXPPenMD WHERE (EmprCod = ? and CliCod = ?) AND (? > PMDKgmMin) AND (? <= PMDKgmMax) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037P6", "SELECT T1.EmprCod, T1.CliCod, T1.PMDColNum, T1.PMDCod, T2.PMDDsc, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDPreUni FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.PMDCod = ? and T1.PMDColNum = ? ORDER BY T1.EmprCod, T1.CliCod, T1.PMDCod, T1.PMDColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

