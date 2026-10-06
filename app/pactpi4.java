package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpi4 extends GXProcedure
{
   public pactpi4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpi4.class ), "" );
   }

   public pactpi4( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           int[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           int[] aP9 ,
                           String[] aP10 )
   {
      pactpi4.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
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
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
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
                             byte[] aP11 )
   {
      pactpi4.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpi4.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pactpi4.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pactpi4.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pactpi4.this.AV19Kilos = aP4[0];
      this.aP4 = aP4;
      pactpi4.this.AV20Metros = aP5[0];
      this.aP5 = aP5;
      pactpi4.this.AV21Piezas = aP6[0];
      this.aP6 = aP6;
      pactpi4.this.AV22KilAnt = aP7[0];
      this.aP7 = aP7;
      pactpi4.this.AV23MtrAnt = aP8[0];
      this.aP8 = aP8;
      pactpi4.this.AV24PieAnt = aP9[0];
      this.aP9 = aP9;
      pactpi4.this.AV25Modo = aP10[0];
      this.aP10 = aP10;
      pactpi4.this.AV26BarSit = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV15EmprCod ;
      GXv_int2[0] = AV16BarCod ;
      GXv_int3[0] = AV17BarCodReo ;
      GXv_char4[0] = AV18BarCodPar ;
      GXv_decimal5[0] = AV19Kilos ;
      GXv_decimal6[0] = AV20Metros ;
      GXv_int7[0] = AV21Piezas ;
      GXv_decimal8[0] = AV22KilAnt ;
      GXv_decimal9[0] = AV23MtrAnt ;
      GXv_int10[0] = AV24PieAnt ;
      GXv_char11[0] = AV25Modo ;
      new app.pcampie(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char11) ;
      pactpi4.this.AV15EmprCod = GXv_char1[0] ;
      pactpi4.this.AV16BarCod = GXv_int2[0] ;
      pactpi4.this.AV17BarCodReo = GXv_int3[0] ;
      pactpi4.this.AV18BarCodPar = GXv_char4[0] ;
      pactpi4.this.AV19Kilos = GXv_decimal5[0] ;
      pactpi4.this.AV20Metros = GXv_decimal6[0] ;
      pactpi4.this.AV21Piezas = GXv_int7[0] ;
      pactpi4.this.AV22KilAnt = GXv_decimal8[0] ;
      pactpi4.this.AV23MtrAnt = GXv_decimal9[0] ;
      pactpi4.this.AV24PieAnt = GXv_int10[0] ;
      pactpi4.this.AV25Modo = GXv_char11[0] ;
      AV37FlagHilo = (byte)(0) ;
      GXv_int3[0] = AV37FlagHilo ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "HILO", ""), GXv_int3) ;
      pactpi4.this.AV37FlagHilo = GXv_int3[0] ;
      AV40FlagBros = (byte)(0) ;
      GXv_int3[0] = AV40FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int3) ;
      pactpi4.this.AV40FlagBros = GXv_int3[0] ;
      AV41FlagSalt = (byte)(0) ;
      GXv_int3[0] = AV41FlagSalt ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SALTIN", ""), GXv_int3) ;
      pactpi4.this.AV41FlagSalt = GXv_int3[0] ;
      AV42FlagHss = (byte)(0) ;
      GXv_int3[0] = AV42FlagHss ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "HSS", ""), GXv_int3) ;
      pactpi4.this.AV42FlagHss = GXv_int3[0] ;
      /* Using cursor P00JU3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00JU3_A130BarCodPar[0] ;
         A132BarCodReo = P00JU3_A132BarCodReo[0] ;
         A129BarCod = P00JU3_A129BarCod[0] ;
         A396EmprCod = P00JU3_A396EmprCod[0] ;
         A252CliCod = P00JU3_A252CliCod[0] ;
         n252CliCod = P00JU3_n252CliCod[0] ;
         A212BarSer = P00JU3_A212BarSer[0] ;
         A3133BarNumCor = P00JU3_A3133BarNumCor[0] ;
         A166BarKgm = P00JU3_A166BarKgm[0] ;
         A184BarMtr = P00JU3_A184BarMtr[0] ;
         A186BarMtrLan = P00JU3_A186BarMtrLan[0] ;
         A1462BarAlbTar = P00JU3_A1462BarAlbTar[0] ;
         n1462BarAlbTar = P00JU3_n1462BarAlbTar[0] ;
         A2026BarAlbPbr = P00JU3_A2026BarAlbPbr[0] ;
         n2026BarAlbPbr = P00JU3_n2026BarAlbPbr[0] ;
         A30AlbProCod = P00JU3_A30AlbProCod[0] ;
         A252CliCod = P00JU3_A252CliCod[0] ;
         n252CliCod = P00JU3_n252CliCod[0] ;
         A212BarSer = P00JU3_A212BarSer[0] ;
         A3133BarNumCor = P00JU3_A3133BarNumCor[0] ;
         A166BarKgm = P00JU3_A166BarKgm[0] ;
         A184BarMtr = P00JU3_A184BarMtr[0] ;
         A186BarMtrLan = P00JU3_A186BarMtrLan[0] ;
         A2027BarAlbPne = (A2026BarAlbPbr.subtract(A1462BarAlbTar)) ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_decimal9[0] = AV29ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_char4, GXv_decimal9) ;
         pactpi4.this.A396EmprCod = GXv_char11[0] ;
         pactpi4.this.A252CliCod = GXv_int10[0] ;
         pactpi4.this.A212BarSer = GXv_char4[0] ;
         pactpi4.this.AV29ArtMer = GXv_decimal9[0] ;
         AV30BarKgm = A166BarKgm ;
         AV31BarMtr = A184BarMtr ;
         AV32BarKgmLan = AV32BarKgmLan.add(A2027BarAlbPne) ;
         AV33BarMtrLan = A186BarMtrLan ;
         AV34DifKgm = AV30BarKgm.subtract(AV32BarKgmLan) ;
         AV35DifMtr = AV31BarMtr.subtract(AV33BarMtrLan) ;
         AV36vCortes = (short)(A3133BarNumCor+1) ;
         if ( ( AV40FlagBros == 1 ) || ( AV41FlagSalt == 1 ) )
         {
            /* Using cursor P00JU4 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A457FasCod = P00JU4_A457FasCod[0] ;
               A153BarFasEst = P00JU4_A153BarFasEst[0] ;
               A227BarUni = P00JU4_A227BarUni[0] ;
               A160BarFecRea = P00JU4_A160BarFecRea[0] ;
               A194BarOrdLin = P00JU4_A194BarOrdLin[0] ;
               A758ProCod = P00JU4_A758ProCod[0] ;
               if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "SALIDA", "")) == 0 )
               {
                  A153BarFasEst = (byte)(2) ;
                  A227BarUni = A166BarKgm ;
                  A160BarFecRea = Gx_date ;
                  /* Using cursor P00JU5 */
                  pr_default.execute(2, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV27OK = " " ;
      if ( AV40FlagBros == 1 )
      {
         AV27OK = httpContext.getMessage( "S", "") ;
      }
      if ( AV26BarSit != 9 )
      {
         if ( GXutil.strcmp(AV25Modo, httpContext.getMessage( "DEL", "")) != 0 )
         {
            while ( ( GXutil.strcmp(AV27OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV27OK, httpContext.getMessage( "S", "")) != 0 ) )
            {
               if ( ( AV37FlagHilo == 1 ) || ( AV42FlagHss == 1 ) )
               {
               }
               else
               {
                  if ( AV36vCortes == 0 )
                  {
                  }
                  else
                  {
                  }
               }
            }
         }
         else
         {
            AV27OK = httpContext.getMessage( "N", "") ;
         }
      }
      if ( GXutil.strcmp(AV27OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char11[0] = AV15EmprCod ;
         GXv_int10[0] = AV16BarCod ;
         GXv_int3[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         GXv_char1[0] = httpContext.getMessage( "C", "") ;
         new app.pciebar(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int3, GXv_char4, GXv_char1) ;
         pactpi4.this.AV15EmprCod = GXv_char11[0] ;
         pactpi4.this.AV16BarCod = GXv_int10[0] ;
         pactpi4.this.AV17BarCodReo = GXv_int3[0] ;
         pactpi4.this.AV18BarCodPar = GXv_char4[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpi4.this.AV15EmprCod;
      this.aP1[0] = pactpi4.this.AV16BarCod;
      this.aP2[0] = pactpi4.this.AV17BarCodReo;
      this.aP3[0] = pactpi4.this.AV18BarCodPar;
      this.aP4[0] = pactpi4.this.AV19Kilos;
      this.aP5[0] = pactpi4.this.AV20Metros;
      this.aP6[0] = pactpi4.this.AV21Piezas;
      this.aP7[0] = pactpi4.this.AV22KilAnt;
      this.aP8[0] = pactpi4.this.AV23MtrAnt;
      this.aP9[0] = pactpi4.this.AV24PieAnt;
      this.aP10[0] = pactpi4.this.AV25Modo;
      this.aP11[0] = pactpi4.this.AV26BarSit;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      scmdbuf = "" ;
      P00JU3_A130BarCodPar = new String[] {""} ;
      P00JU3_A132BarCodReo = new byte[1] ;
      P00JU3_A129BarCod = new int[1] ;
      P00JU3_A396EmprCod = new String[] {""} ;
      P00JU3_A252CliCod = new int[1] ;
      P00JU3_n252CliCod = new boolean[] {false} ;
      P00JU3_A212BarSer = new String[] {""} ;
      P00JU3_A3133BarNumCor = new short[1] ;
      P00JU3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JU3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JU3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JU3_A1462BarAlbTar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JU3_n1462BarAlbTar = new boolean[] {false} ;
      P00JU3_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JU3_n2026BarAlbPbr = new boolean[] {false} ;
      P00JU3_A30AlbProCod = new long[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      A1462BarAlbTar = DecimalUtil.ZERO ;
      A2026BarAlbPbr = DecimalUtil.ZERO ;
      A2027BarAlbPne = DecimalUtil.ZERO ;
      AV29ArtMer = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV30BarKgm = DecimalUtil.ZERO ;
      AV31BarMtr = DecimalUtil.ZERO ;
      AV32BarKgmLan = DecimalUtil.ZERO ;
      AV33BarMtrLan = DecimalUtil.ZERO ;
      AV34DifKgm = DecimalUtil.ZERO ;
      AV35DifMtr = DecimalUtil.ZERO ;
      P00JU4_A396EmprCod = new String[] {""} ;
      P00JU4_A129BarCod = new int[1] ;
      P00JU4_A132BarCodReo = new byte[1] ;
      P00JU4_A130BarCodPar = new String[] {""} ;
      P00JU4_A457FasCod = new String[] {""} ;
      P00JU4_A153BarFasEst = new byte[1] ;
      P00JU4_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JU4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P00JU4_A194BarOrdLin = new short[1] ;
      P00JU4_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A758ProCod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV27OK = "" ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpi4__default(),
         new Object[] {
             new Object[] {
            P00JU3_A130BarCodPar, P00JU3_A132BarCodReo, P00JU3_A129BarCod, P00JU3_A396EmprCod, P00JU3_A252CliCod, P00JU3_n252CliCod, P00JU3_A212BarSer, P00JU3_A3133BarNumCor, P00JU3_A166BarKgm, P00JU3_A184BarMtr,
            P00JU3_A186BarMtrLan, P00JU3_A1462BarAlbTar, P00JU3_n1462BarAlbTar, P00JU3_A2026BarAlbPbr, P00JU3_n2026BarAlbPbr, P00JU3_A30AlbProCod
            }
            , new Object[] {
            P00JU4_A396EmprCod, P00JU4_A129BarCod, P00JU4_A132BarCodReo, P00JU4_A130BarCodPar, P00JU4_A457FasCod, P00JU4_A153BarFasEst, P00JU4_A227BarUni, P00JU4_A160BarFecRea, P00JU4_A194BarOrdLin, P00JU4_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV26BarSit ;
   private byte AV37FlagHilo ;
   private byte AV40FlagBros ;
   private byte AV41FlagSalt ;
   private byte AV42FlagHss ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte GXv_int3[] ;
   private short A3133BarNumCor ;
   private short AV36vCortes ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV21Piezas ;
   private int AV24PieAnt ;
   private int GXv_int2[] ;
   private int GXv_int7[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int10[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV19Kilos ;
   private java.math.BigDecimal AV20Metros ;
   private java.math.BigDecimal AV22KilAnt ;
   private java.math.BigDecimal AV23MtrAnt ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal A1462BarAlbTar ;
   private java.math.BigDecimal A2026BarAlbPbr ;
   private java.math.BigDecimal A2027BarAlbPne ;
   private java.math.BigDecimal AV29ArtMer ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV30BarKgm ;
   private java.math.BigDecimal AV31BarMtr ;
   private java.math.BigDecimal AV32BarKgmLan ;
   private java.math.BigDecimal AV33BarMtrLan ;
   private java.math.BigDecimal AV34DifKgm ;
   private java.math.BigDecimal AV35DifMtr ;
   private java.math.BigDecimal A227BarUni ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV25Modo ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV27OK ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n1462BarAlbTar ;
   private boolean n2026BarAlbPbr ;
   private byte[] aP11 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P00JU3_A130BarCodPar ;
   private byte[] P00JU3_A132BarCodReo ;
   private int[] P00JU3_A129BarCod ;
   private String[] P00JU3_A396EmprCod ;
   private int[] P00JU3_A252CliCod ;
   private boolean[] P00JU3_n252CliCod ;
   private String[] P00JU3_A212BarSer ;
   private short[] P00JU3_A3133BarNumCor ;
   private java.math.BigDecimal[] P00JU3_A166BarKgm ;
   private java.math.BigDecimal[] P00JU3_A184BarMtr ;
   private java.math.BigDecimal[] P00JU3_A186BarMtrLan ;
   private java.math.BigDecimal[] P00JU3_A1462BarAlbTar ;
   private boolean[] P00JU3_n1462BarAlbTar ;
   private java.math.BigDecimal[] P00JU3_A2026BarAlbPbr ;
   private boolean[] P00JU3_n2026BarAlbPbr ;
   private long[] P00JU3_A30AlbProCod ;
   private String[] P00JU4_A396EmprCod ;
   private int[] P00JU4_A129BarCod ;
   private byte[] P00JU4_A132BarCodReo ;
   private String[] P00JU4_A130BarCodPar ;
   private String[] P00JU4_A457FasCod ;
   private byte[] P00JU4_A153BarFasEst ;
   private java.math.BigDecimal[] P00JU4_A227BarUni ;
   private java.util.Date[] P00JU4_A160BarFecRea ;
   private short[] P00JU4_A194BarOrdLin ;
   private String[] P00JU4_A758ProCod ;
}

final  class pactpi4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00JU3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.CliCod, T2.BarSer, T2.BarNumCor, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarMtrLan, 0) AS BarMtrLan, T1.BarAlbTar, T1.BarAlbPbr, T1.AlbProCod FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00JU4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarUni, BarFecRea, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00JU5", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
      }
   }

}

