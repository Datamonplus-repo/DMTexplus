package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpi1 extends GXProcedure
{
   public pactpi1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpi1.class ), "" );
   }

   public pactpi1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     java.math.BigDecimal[] aP4 ,
                                     java.math.BigDecimal[] aP5 ,
                                     int[] aP6 ,
                                     java.math.BigDecimal[] aP7 ,
                                     java.math.BigDecimal[] aP8 ,
                                     int[] aP9 ,
                                     String[] aP10 ,
                                     byte[] aP11 )
   {
      pactpi1.this.aP12 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        java.util.Date[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             java.util.Date[] aP12 )
   {
      pactpi1.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpi1.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pactpi1.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pactpi1.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pactpi1.this.AV19Kilos = aP4[0];
      this.aP4 = aP4;
      pactpi1.this.AV20Metros = aP5[0];
      this.aP5 = aP5;
      pactpi1.this.AV21Piezas = aP6[0];
      this.aP6 = aP6;
      pactpi1.this.AV22KilAnt = aP7[0];
      this.aP7 = aP7;
      pactpi1.this.AV23MtrAnt = aP8[0];
      this.aP8 = aP8;
      pactpi1.this.AV24PieAnt = aP9[0];
      this.aP9 = aP9;
      pactpi1.this.AV25Modo = aP10[0];
      this.aP10 = aP10;
      pactpi1.this.AV26BarSit = aP11[0];
      this.aP11 = aP11;
      pactpi1.this.AV39FecSal = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV51Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pactpi1.this.GXt_char1 = GXv_char2[0] ;
      AV51Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV52EmprNom ;
      GXv_char4[0] = AV53UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV51Station, GXv_char2, GXv_char3, GXv_char4) ;
      pactpi1.this.AV15EmprCod = GXv_char2[0] ;
      pactpi1.this.AV52EmprNom = GXv_char3[0] ;
      pactpi1.this.AV53UsurCod = GXv_char4[0] ;
      GXv_int5[0] = AV40FlagFini ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int5) ;
      pactpi1.this.AV40FlagFini = GXv_int5[0] ;
      GXv_int5[0] = AV43CieHoj ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SIECER", ""), GXv_int5) ;
      pactpi1.this.AV43CieHoj = GXv_int5[0] ;
      GXv_int5[0] = AV44Erfoc ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int5) ;
      pactpi1.this.AV44Erfoc = GXv_int5[0] ;
      GXt_int6 = AV47Contval ;
      GXv_char4[0] = AV15EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "QBR000", "") ;
      GXv_int7[0] = GXt_int6 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      pactpi1.this.AV15EmprCod = GXv_char4[0] ;
      pactpi1.this.GXt_int6 = GXv_int7[0] ;
      AV47Contval = GXt_int6 ;
      AV46CtrlQuebra = DecimalUtil.doubleToDec(AV47Contval/ (double) (100)) ;
      GXt_int8 = AV49Carvema ;
      GXv_int5[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      pactpi1.this.GXt_int8 = GXv_int5[0] ;
      AV49Carvema = GXt_int8 ;
      GXv_char4[0] = AV15EmprCod ;
      GXv_int7[0] = AV16BarCod ;
      GXv_int5[0] = AV17BarCodReo ;
      GXv_char3[0] = AV18BarCodPar ;
      GXv_decimal9[0] = AV19Kilos ;
      GXv_decimal10[0] = AV20Metros ;
      GXv_int11[0] = AV21Piezas ;
      GXv_decimal12[0] = AV22KilAnt ;
      GXv_decimal13[0] = AV23MtrAnt ;
      GXv_int14[0] = AV24PieAnt ;
      GXv_char2[0] = AV25Modo ;
      new app.pcampie(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int5, GXv_char3, GXv_decimal9, GXv_decimal10, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_int14, GXv_char2) ;
      pactpi1.this.AV15EmprCod = GXv_char4[0] ;
      pactpi1.this.AV16BarCod = GXv_int7[0] ;
      pactpi1.this.AV17BarCodReo = GXv_int5[0] ;
      pactpi1.this.AV18BarCodPar = GXv_char3[0] ;
      pactpi1.this.AV19Kilos = GXv_decimal9[0] ;
      pactpi1.this.AV20Metros = GXv_decimal10[0] ;
      pactpi1.this.AV21Piezas = GXv_int11[0] ;
      pactpi1.this.AV22KilAnt = GXv_decimal12[0] ;
      pactpi1.this.AV23MtrAnt = GXv_decimal13[0] ;
      pactpi1.this.AV24PieAnt = GXv_int14[0] ;
      pactpi1.this.AV25Modo = GXv_char2[0] ;
      /* Using cursor P008C3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P008C3_A361DisCod[0] ;
         A130BarCodPar = P008C3_A130BarCodPar[0] ;
         A132BarCodReo = P008C3_A132BarCodReo[0] ;
         A129BarCod = P008C3_A129BarCod[0] ;
         A396EmprCod = P008C3_A396EmprCod[0] ;
         A252CliCod = P008C3_A252CliCod[0] ;
         n252CliCod = P008C3_n252CliCod[0] ;
         A212BarSer = P008C3_A212BarSer[0] ;
         A3133BarNumCor = P008C3_A3133BarNumCor[0] ;
         A2010BarTipDis = P008C3_A2010BarTipDis[0] ;
         A3841DisArtMer = P008C3_A3841DisArtMer[0] ;
         A166BarKgm = P008C3_A166BarKgm[0] ;
         A184BarMtr = P008C3_A184BarMtr[0] ;
         A168BarKgmLan = P008C3_A168BarKgmLan[0] ;
         A186BarMtrLan = P008C3_A186BarMtrLan[0] ;
         A3841DisArtMer = P008C3_A3841DisArtMer[0] ;
         A166BarKgm = P008C3_A166BarKgm[0] ;
         A184BarMtr = P008C3_A184BarMtr[0] ;
         A168BarKgmLan = P008C3_A168BarKgmLan[0] ;
         A186BarMtrLan = P008C3_A186BarMtrLan[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_decimal13[0] = AV29ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_char3, GXv_decimal13) ;
         pactpi1.this.A396EmprCod = GXv_char4[0] ;
         pactpi1.this.A252CliCod = GXv_int14[0] ;
         pactpi1.this.A212BarSer = GXv_char3[0] ;
         pactpi1.this.AV29ArtMer = GXv_decimal13[0] ;
         AV30BarKgm = A166BarKgm ;
         AV31BarMtr = A184BarMtr ;
         AV32BarKgmLan = A168BarKgmLan ;
         AV33BarMtrLan = A186BarMtrLan ;
         AV34DifKgm = AV30BarKgm.subtract(AV32BarKgmLan) ;
         AV35DifMtr = AV31BarMtr.subtract(AV33BarMtrLan) ;
         AV36vCortes = (short)(A3133BarNumCor+1) ;
         AV37BarTipDis = A2010BarTipDis ;
         if ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "A", "")) != 0 ) && ( AV44Erfoc == 1 ) )
         {
            AV29ArtMer = A3841DisArtMer ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV27OK = " " ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30BarKgm)==0) )
      {
         AV48MerKgm = (AV34DifKgm.divide(AV30BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
      }
      else
      {
         AV48MerKgm = DecimalUtil.doubleToDec(0) ;
      }
      if ( AV43CieHoj == 1 )
      {
         AV27OK = httpContext.getMessage( "S", "") ;
      }
      else
      {
         if ( AV26BarSit != 9 )
         {
            if ( GXutil.strcmp(AV25Modo, httpContext.getMessage( "DEL", "")) != 0 )
            {
               while ( ( GXutil.strcmp(AV27OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV27OK, httpContext.getMessage( "S", "")) != 0 ) )
               {
                  if ( AV36vCortes == 1 )
                  {
                     if ( AV49Carvema == 1 )
                     {
                        if ( ( DecimalUtil.compareTo(AV48MerKgm, AV46CtrlQuebra) > 0 ) && ( AV46CtrlQuebra.doubleValue() > 0 ) )
                        {
                           Gx_msg = httpContext.getMessage( "Atenção!. Quebra calculada ", "") + GXutil.trim( GXutil.str( AV48MerKgm, 9, 2)) + httpContext.getMessage( " superior a ", "") + GXutil.trim( GXutil.str( AV46CtrlQuebra, 6, 2)) ;
                           GXv_char4[0] = AV15EmprCod ;
                           GXv_int14[0] = AV16BarCod ;
                           GXv_int5[0] = AV17BarCodReo ;
                           GXv_char3[0] = AV18BarCodPar ;
                           GXv_char2[0] = Gx_msg ;
                           GXv_date15[0] = AV39FecSal ;
                           new app.pctrlmerma(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int5, GXv_char3, GXv_char2, GXv_date15) ;
                           pactpi1.this.AV15EmprCod = GXv_char4[0] ;
                           pactpi1.this.AV16BarCod = GXv_int14[0] ;
                           pactpi1.this.AV17BarCodReo = GXv_int5[0] ;
                           pactpi1.this.AV18BarCodPar = GXv_char3[0] ;
                           pactpi1.this.Gx_msg = GXv_char2[0] ;
                           pactpi1.this.AV39FecSal = GXv_date15[0] ;
                           AV50Inc_obs = Gx_msg ;
                           new app.pctrinc(remoteHandle, context).execute( AV15EmprCod, AV58Pgmname, AV53UsurCod, AV51Station, AV50Inc_obs, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
                        }
                     }
                  }
                  else
                  {
                  }
               }
            }
            else
            {
               AV27OK = httpContext.getMessage( "N", "") ;
            }
         }
      }
      if ( GXutil.strcmp(AV27OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char4[0] = AV15EmprCod ;
         GXv_int14[0] = AV16BarCod ;
         GXv_int5[0] = AV17BarCodReo ;
         GXv_char3[0] = AV18BarCodPar ;
         GXv_char2[0] = httpContext.getMessage( "C", "") ;
         new app.pciebar(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int5, GXv_char3, GXv_char2) ;
         pactpi1.this.AV15EmprCod = GXv_char4[0] ;
         pactpi1.this.AV16BarCod = GXv_int14[0] ;
         pactpi1.this.AV17BarCodReo = GXv_int5[0] ;
         pactpi1.this.AV18BarCodPar = GXv_char3[0] ;
         if ( AV40FlagFini == 1 )
         {
            GXv_char4[0] = AV15EmprCod ;
            GXv_int14[0] = AV16BarCod ;
            GXv_int5[0] = AV17BarCodReo ;
            GXv_char3[0] = AV18BarCodPar ;
            new app.pciefas(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int5, GXv_char3) ;
            pactpi1.this.AV15EmprCod = GXv_char4[0] ;
            pactpi1.this.AV16BarCod = GXv_int14[0] ;
            pactpi1.this.AV17BarCodReo = GXv_int5[0] ;
            pactpi1.this.AV18BarCodPar = GXv_char3[0] ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpi1.this.AV15EmprCod;
      this.aP1[0] = pactpi1.this.AV16BarCod;
      this.aP2[0] = pactpi1.this.AV17BarCodReo;
      this.aP3[0] = pactpi1.this.AV18BarCodPar;
      this.aP4[0] = pactpi1.this.AV19Kilos;
      this.aP5[0] = pactpi1.this.AV20Metros;
      this.aP6[0] = pactpi1.this.AV21Piezas;
      this.aP7[0] = pactpi1.this.AV22KilAnt;
      this.aP8[0] = pactpi1.this.AV23MtrAnt;
      this.aP9[0] = pactpi1.this.AV24PieAnt;
      this.aP10[0] = pactpi1.this.AV25Modo;
      this.aP11[0] = pactpi1.this.AV26BarSit;
      this.aP12[0] = pactpi1.this.AV39FecSal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51Station = "" ;
      GXt_char1 = "" ;
      AV52EmprNom = "" ;
      AV53UsurCod = "" ;
      AV46CtrlQuebra = DecimalUtil.ZERO ;
      GXv_int7 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      scmdbuf = "" ;
      P008C3_A361DisCod = new int[1] ;
      P008C3_A130BarCodPar = new String[] {""} ;
      P008C3_A132BarCodReo = new byte[1] ;
      P008C3_A129BarCod = new int[1] ;
      P008C3_A396EmprCod = new String[] {""} ;
      P008C3_A252CliCod = new int[1] ;
      P008C3_n252CliCod = new boolean[] {false} ;
      P008C3_A212BarSer = new String[] {""} ;
      P008C3_A3133BarNumCor = new short[1] ;
      P008C3_A2010BarTipDis = new String[] {""} ;
      P008C3_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008C3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008C3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008C3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008C3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A2010BarTipDis = "" ;
      A3841DisArtMer = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      AV29ArtMer = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV30BarKgm = DecimalUtil.ZERO ;
      AV31BarMtr = DecimalUtil.ZERO ;
      AV32BarKgmLan = DecimalUtil.ZERO ;
      AV33BarMtrLan = DecimalUtil.ZERO ;
      AV34DifKgm = DecimalUtil.ZERO ;
      AV35DifMtr = DecimalUtil.ZERO ;
      AV37BarTipDis = "" ;
      AV27OK = "" ;
      AV48MerKgm = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      GXv_date15 = new java.util.Date[1] ;
      AV50Inc_obs = "" ;
      AV58Pgmname = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpi1__default(),
         new Object[] {
             new Object[] {
            P008C3_A361DisCod, P008C3_A130BarCodPar, P008C3_A132BarCodReo, P008C3_A129BarCod, P008C3_A396EmprCod, P008C3_A252CliCod, P008C3_n252CliCod, P008C3_A212BarSer, P008C3_A3133BarNumCor, P008C3_A2010BarTipDis,
            P008C3_A3841DisArtMer, P008C3_A166BarKgm, P008C3_A184BarMtr, P008C3_A168BarKgmLan, P008C3_A186BarMtrLan
            }
         }
      );
      AV58Pgmname = "PACTPI1" ;
      /* GeneXus formulas. */
      AV58Pgmname = "PACTPI1" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV26BarSit ;
   private byte AV40FlagFini ;
   private byte AV43CieHoj ;
   private byte AV44Erfoc ;
   private byte AV49Carvema ;
   private byte GXt_int8 ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short A3133BarNumCor ;
   private short AV36vCortes ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV21Piezas ;
   private int AV24PieAnt ;
   private int AV47Contval ;
   private int GXt_int6 ;
   private int GXv_int7[] ;
   private int GXv_int11[] ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int14[] ;
   private java.math.BigDecimal AV19Kilos ;
   private java.math.BigDecimal AV20Metros ;
   private java.math.BigDecimal AV22KilAnt ;
   private java.math.BigDecimal AV23MtrAnt ;
   private java.math.BigDecimal AV46CtrlQuebra ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal AV29ArtMer ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal AV30BarKgm ;
   private java.math.BigDecimal AV31BarMtr ;
   private java.math.BigDecimal AV32BarKgmLan ;
   private java.math.BigDecimal AV33BarMtrLan ;
   private java.math.BigDecimal AV34DifKgm ;
   private java.math.BigDecimal AV35DifMtr ;
   private java.math.BigDecimal AV48MerKgm ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV25Modo ;
   private String AV51Station ;
   private String GXt_char1 ;
   private String AV52EmprNom ;
   private String AV53UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A2010BarTipDis ;
   private String AV37BarTipDis ;
   private String AV27OK ;
   private String Gx_msg ;
   private String AV58Pgmname ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV39FecSal ;
   private java.util.Date GXv_date15[] ;
   private boolean n252CliCod ;
   private String AV50Inc_obs ;
   private java.util.Date[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private IDataStoreProvider pr_default ;
   private int[] P008C3_A361DisCod ;
   private String[] P008C3_A130BarCodPar ;
   private byte[] P008C3_A132BarCodReo ;
   private int[] P008C3_A129BarCod ;
   private String[] P008C3_A396EmprCod ;
   private int[] P008C3_A252CliCod ;
   private boolean[] P008C3_n252CliCod ;
   private String[] P008C3_A212BarSer ;
   private short[] P008C3_A3133BarNumCor ;
   private String[] P008C3_A2010BarTipDis ;
   private java.math.BigDecimal[] P008C3_A3841DisArtMer ;
   private java.math.BigDecimal[] P008C3_A166BarKgm ;
   private java.math.BigDecimal[] P008C3_A184BarMtr ;
   private java.math.BigDecimal[] P008C3_A168BarKgmLan ;
   private java.math.BigDecimal[] P008C3_A186BarMtrLan ;
}

final  class pactpi1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008C3", "SELECT T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarNumCor, T1.BarTipDis, T2.DisArtMer, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgmLan, 0) AS BarKgmLan, COALESCE( T3.BarMtrLan, 0) AS BarMtrLan FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
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
      }
   }

}

