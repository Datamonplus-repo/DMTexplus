package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpi1parcialtotal extends GXProcedure
{
   public pactpi1parcialtotal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpi1parcialtotal.class ), "" );
   }

   public pactpi1parcialtotal( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
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
      pactpi1parcialtotal.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
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
                        java.util.Date[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
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
                             java.util.Date[] aP12 ,
                             String[] aP13 )
   {
      pactpi1parcialtotal.this.AV54EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpi1parcialtotal.this.AV55BarCod = aP1[0];
      this.aP1 = aP1;
      pactpi1parcialtotal.this.AV56BarCodReo = aP2[0];
      this.aP2 = aP2;
      pactpi1parcialtotal.this.AV57BarCodPar = aP3[0];
      this.aP3 = aP3;
      pactpi1parcialtotal.this.AV58Kilos = aP4[0];
      this.aP4 = aP4;
      pactpi1parcialtotal.this.AV59Metros = aP5[0];
      this.aP5 = aP5;
      pactpi1parcialtotal.this.AV60Piezas = aP6[0];
      this.aP6 = aP6;
      pactpi1parcialtotal.this.AV61KilAnt = aP7[0];
      this.aP7 = aP7;
      pactpi1parcialtotal.this.AV62MtrAnt = aP8[0];
      this.aP8 = aP8;
      pactpi1parcialtotal.this.AV63PieAnt = aP9[0];
      this.aP9 = aP9;
      pactpi1parcialtotal.this.AV64Modo = aP10[0];
      this.aP10 = aP10;
      pactpi1parcialtotal.this.AV65BarSit = aP11[0];
      this.aP11 = aP11;
      pactpi1parcialtotal.this.AV78FecSal = aP12[0];
      this.aP12 = aP12;
      pactpi1parcialtotal.this.AV93AlbTipEnt = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV90Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pactpi1parcialtotal.this.GXt_char1 = GXv_char2[0] ;
      AV90Station = GXt_char1 ;
      GXv_char2[0] = AV54EmprCod ;
      GXv_char3[0] = AV91EmprNom ;
      GXv_char4[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV90Station, GXv_char2, GXv_char3, GXv_char4) ;
      pactpi1parcialtotal.this.AV54EmprCod = GXv_char2[0] ;
      pactpi1parcialtotal.this.AV91EmprNom = GXv_char3[0] ;
      pactpi1parcialtotal.this.AV92UsurCod = GXv_char4[0] ;
      GXv_int5[0] = AV79FlagFini ;
      new app.pexicon(remoteHandle, context).execute( AV54EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int5) ;
      pactpi1parcialtotal.this.AV79FlagFini = GXv_int5[0] ;
      GXv_int5[0] = AV82CieHoj ;
      new app.pexicon(remoteHandle, context).execute( AV54EmprCod, httpContext.getMessage( "SIECER", ""), GXv_int5) ;
      pactpi1parcialtotal.this.AV82CieHoj = GXv_int5[0] ;
      GXv_int5[0] = AV83Erfoc ;
      new app.pexicon(remoteHandle, context).execute( AV54EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int5) ;
      pactpi1parcialtotal.this.AV83Erfoc = GXv_int5[0] ;
      GXt_int6 = AV86Contval ;
      GXv_char4[0] = AV54EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "QBR000", "") ;
      GXv_int7[0] = GXt_int6 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      pactpi1parcialtotal.this.AV54EmprCod = GXv_char4[0] ;
      pactpi1parcialtotal.this.GXt_int6 = GXv_int7[0] ;
      AV86Contval = GXt_int6 ;
      AV85CtrlQuebra = DecimalUtil.doubleToDec(AV86Contval/ (double) (100)) ;
      GXt_int8 = AV88Carvema ;
      GXv_int5[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV54EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      pactpi1parcialtotal.this.GXt_int8 = GXv_int5[0] ;
      AV88Carvema = GXt_int8 ;
      GXv_char4[0] = AV54EmprCod ;
      GXv_int7[0] = AV55BarCod ;
      GXv_int5[0] = AV56BarCodReo ;
      GXv_char3[0] = AV57BarCodPar ;
      GXv_decimal9[0] = AV58Kilos ;
      GXv_decimal10[0] = AV59Metros ;
      GXv_int11[0] = AV60Piezas ;
      GXv_decimal12[0] = AV61KilAnt ;
      GXv_decimal13[0] = AV62MtrAnt ;
      GXv_int14[0] = AV63PieAnt ;
      GXv_char2[0] = AV64Modo ;
      new app.pcampie(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int5, GXv_char3, GXv_decimal9, GXv_decimal10, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_int14, GXv_char2) ;
      pactpi1parcialtotal.this.AV54EmprCod = GXv_char4[0] ;
      pactpi1parcialtotal.this.AV55BarCod = GXv_int7[0] ;
      pactpi1parcialtotal.this.AV56BarCodReo = GXv_int5[0] ;
      pactpi1parcialtotal.this.AV57BarCodPar = GXv_char3[0] ;
      pactpi1parcialtotal.this.AV58Kilos = GXv_decimal9[0] ;
      pactpi1parcialtotal.this.AV59Metros = GXv_decimal10[0] ;
      pactpi1parcialtotal.this.AV60Piezas = GXv_int11[0] ;
      pactpi1parcialtotal.this.AV61KilAnt = GXv_decimal12[0] ;
      pactpi1parcialtotal.this.AV62MtrAnt = GXv_decimal13[0] ;
      pactpi1parcialtotal.this.AV63PieAnt = GXv_int14[0] ;
      pactpi1parcialtotal.this.AV64Modo = GXv_char2[0] ;
      /* Using cursor P08F43 */
      pr_default.execute(0, new Object[] {AV54EmprCod, Integer.valueOf(AV55BarCod), Byte.valueOf(AV56BarCodReo), AV57BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P08F43_A361DisCod[0] ;
         A130BarCodPar = P08F43_A130BarCodPar[0] ;
         A132BarCodReo = P08F43_A132BarCodReo[0] ;
         A129BarCod = P08F43_A129BarCod[0] ;
         A396EmprCod = P08F43_A396EmprCod[0] ;
         A252CliCod = P08F43_A252CliCod[0] ;
         n252CliCod = P08F43_n252CliCod[0] ;
         A212BarSer = P08F43_A212BarSer[0] ;
         A3133BarNumCor = P08F43_A3133BarNumCor[0] ;
         A2010BarTipDis = P08F43_A2010BarTipDis[0] ;
         A3841DisArtMer = P08F43_A3841DisArtMer[0] ;
         A166BarKgm = P08F43_A166BarKgm[0] ;
         A184BarMtr = P08F43_A184BarMtr[0] ;
         A168BarKgmLan = P08F43_A168BarKgmLan[0] ;
         A186BarMtrLan = P08F43_A186BarMtrLan[0] ;
         A3841DisArtMer = P08F43_A3841DisArtMer[0] ;
         A166BarKgm = P08F43_A166BarKgm[0] ;
         A184BarMtr = P08F43_A184BarMtr[0] ;
         A168BarKgmLan = P08F43_A168BarKgmLan[0] ;
         A186BarMtrLan = P08F43_A186BarMtrLan[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_decimal13[0] = AV68ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_char3, GXv_decimal13) ;
         pactpi1parcialtotal.this.A396EmprCod = GXv_char4[0] ;
         pactpi1parcialtotal.this.A252CliCod = GXv_int14[0] ;
         pactpi1parcialtotal.this.A212BarSer = GXv_char3[0] ;
         pactpi1parcialtotal.this.AV68ArtMer = GXv_decimal13[0] ;
         AV69BarKgm = A166BarKgm ;
         AV70BarMtr = A184BarMtr ;
         AV71BarKgmLan = A168BarKgmLan ;
         AV72BarMtrLan = A186BarMtrLan ;
         AV73DifKgm = AV69BarKgm.subtract(AV71BarKgmLan) ;
         AV74DifMtr = AV70BarMtr.subtract(AV72BarMtrLan) ;
         AV75vCortes = (short)(A3133BarNumCor+1) ;
         AV76BarTipDis = A2010BarTipDis ;
         if ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "A", "")) != 0 ) && ( AV83Erfoc == 1 ) )
         {
            AV68ArtMer = A3841DisArtMer ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV66OK = " " ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69BarKgm)==0) )
      {
         AV87MerKgm = (AV73DifKgm.divide(AV69BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
      }
      else
      {
         AV87MerKgm = DecimalUtil.doubleToDec(0) ;
      }
      AV66OK = ((GXutil.strcmp(AV93AlbTipEnt, httpContext.getMessage( "T", ""))==0) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
      if ( AV82CieHoj == 1 )
      {
         AV66OK = httpContext.getMessage( "S", "") ;
      }
      else
      {
         if ( AV65BarSit != 9 )
         {
            if ( GXutil.strcmp(AV64Modo, httpContext.getMessage( "DEL", "")) != 0 )
            {
               while ( ( GXutil.strcmp(AV66OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV66OK, httpContext.getMessage( "S", "")) != 0 ) )
               {
                  if ( AV75vCortes == 1 )
                  {
                     if ( AV88Carvema == 1 )
                     {
                        if ( ( DecimalUtil.compareTo(AV87MerKgm, AV85CtrlQuebra) > 0 ) && ( AV85CtrlQuebra.doubleValue() > 0 ) )
                        {
                           Gx_msg = httpContext.getMessage( "Atenção!. Quebra calculada ", "") + GXutil.trim( GXutil.str( AV87MerKgm, 9, 2)) + httpContext.getMessage( " superior a ", "") + GXutil.trim( GXutil.str( AV85CtrlQuebra, 6, 2)) ;
                           GXv_char4[0] = AV54EmprCod ;
                           GXv_int14[0] = AV55BarCod ;
                           GXv_int5[0] = AV56BarCodReo ;
                           GXv_char3[0] = AV57BarCodPar ;
                           GXv_char2[0] = Gx_msg ;
                           GXv_date15[0] = AV78FecSal ;
                           new app.pctrlmerma(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int5, GXv_char3, GXv_char2, GXv_date15) ;
                           pactpi1parcialtotal.this.AV54EmprCod = GXv_char4[0] ;
                           pactpi1parcialtotal.this.AV55BarCod = GXv_int14[0] ;
                           pactpi1parcialtotal.this.AV56BarCodReo = GXv_int5[0] ;
                           pactpi1parcialtotal.this.AV57BarCodPar = GXv_char3[0] ;
                           pactpi1parcialtotal.this.Gx_msg = GXv_char2[0] ;
                           pactpi1parcialtotal.this.AV78FecSal = GXv_date15[0] ;
                           AV89Inc_obs = Gx_msg ;
                           new app.pctrinc(remoteHandle, context).execute( AV54EmprCod, GXutil.substring( AV98Pgmname, 1, 10), AV92UsurCod, AV90Station, AV89Inc_obs, AV55BarCod, AV56BarCodReo, AV57BarCodPar) ;
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
               AV66OK = httpContext.getMessage( "N", "") ;
            }
         }
      }
      if ( GXutil.strcmp(AV66OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char4[0] = AV54EmprCod ;
         GXv_int14[0] = AV55BarCod ;
         GXv_int5[0] = AV56BarCodReo ;
         GXv_char3[0] = AV57BarCodPar ;
         GXv_char2[0] = httpContext.getMessage( "C", "") ;
         new app.pciebar(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int5, GXv_char3, GXv_char2) ;
         pactpi1parcialtotal.this.AV54EmprCod = GXv_char4[0] ;
         pactpi1parcialtotal.this.AV55BarCod = GXv_int14[0] ;
         pactpi1parcialtotal.this.AV56BarCodReo = GXv_int5[0] ;
         pactpi1parcialtotal.this.AV57BarCodPar = GXv_char3[0] ;
         if ( AV79FlagFini == 1 )
         {
            GXv_char4[0] = AV54EmprCod ;
            GXv_int14[0] = AV55BarCod ;
            GXv_int5[0] = AV56BarCodReo ;
            GXv_char3[0] = AV57BarCodPar ;
            new app.pciefas(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int5, GXv_char3) ;
            pactpi1parcialtotal.this.AV54EmprCod = GXv_char4[0] ;
            pactpi1parcialtotal.this.AV55BarCod = GXv_int14[0] ;
            pactpi1parcialtotal.this.AV56BarCodReo = GXv_int5[0] ;
            pactpi1parcialtotal.this.AV57BarCodPar = GXv_char3[0] ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpi1parcialtotal.this.AV54EmprCod;
      this.aP1[0] = pactpi1parcialtotal.this.AV55BarCod;
      this.aP2[0] = pactpi1parcialtotal.this.AV56BarCodReo;
      this.aP3[0] = pactpi1parcialtotal.this.AV57BarCodPar;
      this.aP4[0] = pactpi1parcialtotal.this.AV58Kilos;
      this.aP5[0] = pactpi1parcialtotal.this.AV59Metros;
      this.aP6[0] = pactpi1parcialtotal.this.AV60Piezas;
      this.aP7[0] = pactpi1parcialtotal.this.AV61KilAnt;
      this.aP8[0] = pactpi1parcialtotal.this.AV62MtrAnt;
      this.aP9[0] = pactpi1parcialtotal.this.AV63PieAnt;
      this.aP10[0] = pactpi1parcialtotal.this.AV64Modo;
      this.aP11[0] = pactpi1parcialtotal.this.AV65BarSit;
      this.aP12[0] = pactpi1parcialtotal.this.AV78FecSal;
      this.aP13[0] = pactpi1parcialtotal.this.AV93AlbTipEnt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV90Station = "" ;
      GXt_char1 = "" ;
      AV91EmprNom = "" ;
      AV92UsurCod = "" ;
      AV85CtrlQuebra = DecimalUtil.ZERO ;
      GXv_int7 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      scmdbuf = "" ;
      P08F43_A361DisCod = new int[1] ;
      P08F43_A130BarCodPar = new String[] {""} ;
      P08F43_A132BarCodReo = new byte[1] ;
      P08F43_A129BarCod = new int[1] ;
      P08F43_A396EmprCod = new String[] {""} ;
      P08F43_A252CliCod = new int[1] ;
      P08F43_n252CliCod = new boolean[] {false} ;
      P08F43_A212BarSer = new String[] {""} ;
      P08F43_A3133BarNumCor = new short[1] ;
      P08F43_A2010BarTipDis = new String[] {""} ;
      P08F43_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F43_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F43_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F43_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08F43_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A2010BarTipDis = "" ;
      A3841DisArtMer = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      AV68ArtMer = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV69BarKgm = DecimalUtil.ZERO ;
      AV70BarMtr = DecimalUtil.ZERO ;
      AV71BarKgmLan = DecimalUtil.ZERO ;
      AV72BarMtrLan = DecimalUtil.ZERO ;
      AV73DifKgm = DecimalUtil.ZERO ;
      AV74DifMtr = DecimalUtil.ZERO ;
      AV76BarTipDis = "" ;
      AV66OK = "" ;
      AV87MerKgm = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      GXv_date15 = new java.util.Date[1] ;
      AV89Inc_obs = "" ;
      AV98Pgmname = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpi1parcialtotal__default(),
         new Object[] {
             new Object[] {
            P08F43_A361DisCod, P08F43_A130BarCodPar, P08F43_A132BarCodReo, P08F43_A129BarCod, P08F43_A396EmprCod, P08F43_A252CliCod, P08F43_n252CliCod, P08F43_A212BarSer, P08F43_A3133BarNumCor, P08F43_A2010BarTipDis,
            P08F43_A3841DisArtMer, P08F43_A166BarKgm, P08F43_A184BarMtr, P08F43_A168BarKgmLan, P08F43_A186BarMtrLan
            }
         }
      );
      AV98Pgmname = "PACTPI1ParcialTotal" ;
      /* GeneXus formulas. */
      AV98Pgmname = "PACTPI1ParcialTotal" ;
      Gx_err = (short)(0) ;
   }

   private byte AV56BarCodReo ;
   private byte AV65BarSit ;
   private byte AV79FlagFini ;
   private byte AV82CieHoj ;
   private byte AV83Erfoc ;
   private byte AV88Carvema ;
   private byte GXt_int8 ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short A3133BarNumCor ;
   private short AV75vCortes ;
   private short Gx_err ;
   private int AV55BarCod ;
   private int AV60Piezas ;
   private int AV63PieAnt ;
   private int AV86Contval ;
   private int GXt_int6 ;
   private int GXv_int7[] ;
   private int GXv_int11[] ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int14[] ;
   private java.math.BigDecimal AV58Kilos ;
   private java.math.BigDecimal AV59Metros ;
   private java.math.BigDecimal AV61KilAnt ;
   private java.math.BigDecimal AV62MtrAnt ;
   private java.math.BigDecimal AV85CtrlQuebra ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal AV68ArtMer ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal AV69BarKgm ;
   private java.math.BigDecimal AV70BarMtr ;
   private java.math.BigDecimal AV71BarKgmLan ;
   private java.math.BigDecimal AV72BarMtrLan ;
   private java.math.BigDecimal AV73DifKgm ;
   private java.math.BigDecimal AV74DifMtr ;
   private java.math.BigDecimal AV87MerKgm ;
   private String AV54EmprCod ;
   private String AV57BarCodPar ;
   private String AV64Modo ;
   private String AV93AlbTipEnt ;
   private String AV90Station ;
   private String GXt_char1 ;
   private String AV91EmprNom ;
   private String AV92UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A2010BarTipDis ;
   private String AV76BarTipDis ;
   private String AV66OK ;
   private String Gx_msg ;
   private String AV98Pgmname ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV78FecSal ;
   private java.util.Date GXv_date15[] ;
   private boolean n252CliCod ;
   private String AV89Inc_obs ;
   private String[] aP13 ;
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
   private java.util.Date[] aP12 ;
   private IDataStoreProvider pr_default ;
   private int[] P08F43_A361DisCod ;
   private String[] P08F43_A130BarCodPar ;
   private byte[] P08F43_A132BarCodReo ;
   private int[] P08F43_A129BarCod ;
   private String[] P08F43_A396EmprCod ;
   private int[] P08F43_A252CliCod ;
   private boolean[] P08F43_n252CliCod ;
   private String[] P08F43_A212BarSer ;
   private short[] P08F43_A3133BarNumCor ;
   private String[] P08F43_A2010BarTipDis ;
   private java.math.BigDecimal[] P08F43_A3841DisArtMer ;
   private java.math.BigDecimal[] P08F43_A166BarKgm ;
   private java.math.BigDecimal[] P08F43_A184BarMtr ;
   private java.math.BigDecimal[] P08F43_A168BarKgmLan ;
   private java.math.BigDecimal[] P08F43_A186BarMtrLan ;
}

final  class pactpi1parcialtotal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08F43", "SELECT T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarNumCor, T1.BarTipDis, T2.DisArtMer, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgmLan, 0) AS BarKgmLan, COALESCE( T3.BarMtrLan, 0) AS BarMtrLan FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

