package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpz2 extends GXProcedure
{
   public pnumpz2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpz2.class ), "" );
   }

   public pnumpz2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            java.math.BigDecimal[] aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 ,
                            short[] aP6 ,
                            java.math.BigDecimal[] aP7 )
   {
      pnumpz2.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 )
   {
      pnumpz2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpz2.this.AV20AlbCod = aP1[0];
      this.aP1 = aP1;
      pnumpz2.this.AV38TotUniKM = aP2[0];
      this.aP2 = aP2;
      pnumpz2.this.AV50TotUniSec = aP3[0];
      this.aP3 = aP3;
      pnumpz2.this.AV39TotPzas = aP4[0];
      this.aP4 = aP4;
      pnumpz2.this.AV40FlagUni = aP5[0];
      this.aP5 = aP5;
      pnumpz2.this.AV59Anc = aP6[0];
      this.aP6 = aP6;
      pnumpz2.this.AV47Rdo = aP7[0];
      this.aP7 = aP7;
      pnumpz2.this.AV65Barpes = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV43Texknit ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int1) ;
      pnumpz2.this.AV43Texknit = GXv_int1[0] ;
      GXv_int1[0] = AV45Martex ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int1) ;
      pnumpz2.this.AV45Martex = GXv_int1[0] ;
      GXv_int1[0] = AV46PzaAut ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PZAAUT", ""), GXv_int1) ;
      pnumpz2.this.AV46PzaAut = GXv_int1[0] ;
      GXv_int1[0] = AV58Np1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NP0000", ""), GXv_int1) ;
      pnumpz2.this.AV58Np1 = GXv_int1[0] ;
      GXt_int2 = AV61termilenio ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int1) ;
      pnumpz2.this.GXt_int2 = GXv_int1[0] ;
      AV61termilenio = GXt_int2 ;
      GXt_int2 = AV62NumPzCli ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NUPZCL", ""), GXv_int1) ;
      pnumpz2.this.GXt_int2 = GXv_int1[0] ;
      AV62NumPzCli = GXt_int2 ;
      GXt_int2 = AV63AjustarUltPza ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "AJULPZ", ""), GXv_int1) ;
      pnumpz2.this.GXt_int2 = GXv_int1[0] ;
      AV63AjustarUltPza = GXt_int2 ;
      GXt_int2 = AV66Stamperia ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int1) ;
      pnumpz2.this.GXt_int2 = GXv_int1[0] ;
      AV66Stamperia = GXt_int2 ;
      GXt_int2 = AV68estampamos ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int1) ;
      pnumpz2.this.GXt_int2 = GXv_int1[0] ;
      AV68estampamos = GXt_int2 ;
      AV60CliUltNPz = 0 ;
      if ( AV62NumPzCli == 1 )
      {
         /* Using cursor P012Y2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV20AlbCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A44AlbRecCod = P012Y2_A44AlbRecCod[0] ;
            A396EmprCod = P012Y2_A396EmprCod[0] ;
            A252CliCod = P012Y2_A252CliCod[0] ;
            A11761CliUltNPz = P012Y2_A11761CliUltNPz[0] ;
            A11761CliUltNPz = P012Y2_A11761CliUltNPz[0] ;
            AV49CliCod = A252CliCod ;
            AV60CliUltNPz = A11761CliUltNPz ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( ( AV43Texknit == 1 ) || ( AV45Martex == 1 ) )
      {
         AV44AlbRecIdPz = httpContext.getMessage( "AUTOMATICO", "") ;
      }
      else
      {
         AV44AlbRecIdPz = "" ;
      }
      if ( AV63AjustarUltPza == 0 )
      {
         AV42UniPieza = AV38TotUniKM.divide(DecimalUtil.doubleToDec(AV39TotPzas), 18, java.math.RoundingMode.DOWN) ;
         AV64FaltaKM = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         AV42UniPieza = GXutil.truncDecimal( AV38TotUniKM.divide(DecimalUtil.doubleToDec(AV39TotPzas), 18, java.math.RoundingMode.DOWN), 2) ;
         AV64FaltaKM = AV38TotUniKM.subtract((AV42UniPieza.multiply(DecimalUtil.doubleToDec(AV39TotPzas)))) ;
      }
      if ( AV46PzaAut == 1 )
      {
         AV51UniSec = AV50TotUniSec.divide(DecimalUtil.doubleToDec(AV39TotPzas), 18, java.math.RoundingMode.DOWN) ;
      }
      AV52AlbUltP = (short)(0) ;
      AV53Nrecp6 = AV20AlbCod ;
      AV54Nrecp6a = GXutil.padl( GXutil.trim( GXutil.str( AV53Nrecp6, 6, 0)), (short)(6), "0") ;
      AV55Np = (short)(1) ;
      while ( AV41i < AV39TotPzas )
      {
         GXv_int3[0] = AV28ConVal ;
         new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "031600", GXv_int3) ;
         pnumpz2.this.AV28ConVal = GXv_int3[0] ;
         AV52AlbUltP = (short)(AV52AlbUltP+1) ;
         AV56NpA = GXutil.padl( GXutil.trim( GXutil.str( AV55Np, 3, 0)), (short)(3), "0") ;
         AV57Npza = AV54Nrecp6a + AV56NpA ;
         /*
            INSERT RECORD ON TABLE TXPALBDET

         */
         A396EmprCod = AV15EmprCod ;
         A44AlbRecCod = AV20AlbCod ;
         if ( ( ( AV61termilenio == 0 ) ) || ( ( AV61termilenio == 1 ) && ( AV62NumPzCli == 0 ) ) )
         {
            if ( AV58Np1 == 0 )
            {
               A2159AlbRecPie = GXutil.ltrim( GXutil.str( AV28ConVal, 8, 0)) ;
            }
            else
            {
               A2159AlbRecPie = AV57Npza ;
            }
         }
         if ( ( AV61termilenio == 1 ) && ( AV62NumPzCli == 1 ) )
         {
            AV60CliUltNPz = (int)(AV60CliUltNPz+1) ;
            A2159AlbRecPie = GXutil.ltrim( GXutil.str( AV60CliUltNPz, 8, 0)) ;
         }
         if ( GXutil.strcmp(AV40FlagUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2155AlbRecKgm = AV42UniPieza ;
            A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
            A2157AlbRecMtr = ((AV46PzaAut==1) ? AV51UniSec : AV42UniPieza.multiply(AV47Rdo)) ;
            A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A2157AlbRecMtr = AV42UniPieza ;
            A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
            AV67kgs = (((AV66Stamperia==1)||(AV68estampamos==1))&&(AV47Rdo.doubleValue()>0) ? AV42UniPieza.divide(AV47Rdo, 18, java.math.RoundingMode.DOWN) : (AV42UniPieza.multiply(DecimalUtil.doubleToDec(AV65Barpes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            A2155AlbRecKgm = ((AV46PzaAut==1) ? AV51UniSec : AV67kgs) ;
            A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
         }
         A2154AlbRecAnh = AV59Anc ;
         A3730AlbRecCol = (short)(0) ;
         A3731AlbRecIdPz = AV44AlbRecIdPz ;
         A3732AlbRecIdRc = 0 ;
         A10762AlbPCont = AV52AlbUltP ;
         if ( ( AV55Np == AV39TotPzas ) && ( AV63AjustarUltPza == 1 ) )
         {
            if ( AV64FaltaKM.doubleValue() > 0 )
            {
               if ( GXutil.strcmp(AV40FlagUni, httpContext.getMessage( "K", "")) == 0 )
               {
                  A2155AlbRecKgm = AV42UniPieza.add(AV64FaltaKM) ;
                  A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
                  A2157AlbRecMtr = ((AV46PzaAut==1) ? AV51UniSec : (AV42UniPieza.add(AV64FaltaKM)).multiply(AV47Rdo)) ;
                  A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A2157AlbRecMtr = AV42UniPieza.add(AV64FaltaKM) ;
                  A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
                  AV67kgs = (((AV66Stamperia==1)||(AV68estampamos==1))&&(AV47Rdo.doubleValue()>0) ? A2157AlbRecMtr.divide(AV47Rdo, 18, java.math.RoundingMode.DOWN) : (A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(AV65Barpes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  A2155AlbRecKgm = ((AV46PzaAut==1) ? AV51UniSec : AV67kgs) ;
                  A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
         /* Using cursor P012Y3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A2154AlbRecAnh), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, Short.valueOf(A3730AlbRecCol), A3731AlbRecIdPz, Integer.valueOf(A3732AlbRecIdRc), Short.valueOf(A10762AlbPCont)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         if ( (pr_default.getStatus(1) == 1) )
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
         AV41i = (short)(AV41i+1) ;
         AV55Np = (short)(AV55Np+1) ;
      }
      if ( ( AV61termilenio == 1 ) && ( AV62NumPzCli == 1 ) )
      {
         /* Optimized UPDATE. */
         /* Using cursor P012Y4 */
         pr_default.execute(2, new Object[] {Integer.valueOf(AV60CliUltNPz), AV15EmprCod, Integer.valueOf(AV49CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         /* End optimized UPDATE. */
      }
      n10761AlbUltP = false ;
      /* Optimized UPDATE. */
      /* Using cursor P012Y5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n10761AlbUltP), Short.valueOf(AV52AlbUltP), Integer.valueOf(AV20AlbCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpz2.this.AV15EmprCod;
      this.aP1[0] = pnumpz2.this.AV20AlbCod;
      this.aP2[0] = pnumpz2.this.AV38TotUniKM;
      this.aP3[0] = pnumpz2.this.AV50TotUniSec;
      this.aP4[0] = pnumpz2.this.AV39TotPzas;
      this.aP5[0] = pnumpz2.this.AV40FlagUni;
      this.aP6[0] = pnumpz2.this.AV59Anc;
      this.aP7[0] = pnumpz2.this.AV47Rdo;
      this.aP8[0] = pnumpz2.this.AV65Barpes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumpz2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P012Y2_A44AlbRecCod = new int[1] ;
      P012Y2_A396EmprCod = new String[] {""} ;
      P012Y2_A252CliCod = new int[1] ;
      P012Y2_A11761CliUltNPz = new int[1] ;
      A396EmprCod = "" ;
      AV44AlbRecIdPz = "" ;
      AV42UniPieza = DecimalUtil.ZERO ;
      AV64FaltaKM = DecimalUtil.ZERO ;
      AV51UniSec = DecimalUtil.ZERO ;
      AV54Nrecp6a = "" ;
      GXv_int3 = new int[1] ;
      AV56NpA = "" ;
      AV57Npza = "" ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      AV67kgs = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpz2__default(),
         new Object[] {
             new Object[] {
            P012Y2_A44AlbRecCod, P012Y2_A396EmprCod, P012Y2_A252CliCod, P012Y2_A11761CliUltNPz
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV43Texknit ;
   private byte AV45Martex ;
   private byte AV46PzaAut ;
   private byte AV58Np1 ;
   private byte AV61termilenio ;
   private byte AV62NumPzCli ;
   private byte AV63AjustarUltPza ;
   private byte AV66Stamperia ;
   private byte AV68estampamos ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private short AV39TotPzas ;
   private short AV59Anc ;
   private short AV65Barpes ;
   private short AV52AlbUltP ;
   private short AV55Np ;
   private short AV41i ;
   private short A2154AlbRecAnh ;
   private short A3730AlbRecCol ;
   private short A10762AlbPCont ;
   private short Gx_err ;
   private short A10761AlbUltP ;
   private int AV20AlbCod ;
   private int AV60CliUltNPz ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A11761CliUltNPz ;
   private int AV49CliCod ;
   private int AV53Nrecp6 ;
   private int AV28ConVal ;
   private int GXv_int3[] ;
   private int GX_INS299 ;
   private int A3732AlbRecIdRc ;
   private java.math.BigDecimal AV38TotUniKM ;
   private java.math.BigDecimal AV50TotUniSec ;
   private java.math.BigDecimal AV47Rdo ;
   private java.math.BigDecimal AV42UniPieza ;
   private java.math.BigDecimal AV64FaltaKM ;
   private java.math.BigDecimal AV51UniSec ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal AV67kgs ;
   private String AV15EmprCod ;
   private String AV40FlagUni ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV44AlbRecIdPz ;
   private String AV54Nrecp6a ;
   private String AV56NpA ;
   private String AV57Npza ;
   private String A2159AlbRecPie ;
   private String A3731AlbRecIdPz ;
   private String Gx_emsg ;
   private boolean n10761AlbUltP ;
   private short[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private int[] P012Y2_A44AlbRecCod ;
   private String[] P012Y2_A396EmprCod ;
   private int[] P012Y2_A252CliCod ;
   private int[] P012Y2_A11761CliUltNPz ;
}

final  class pnumpz2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012Y2", "SELECT T1.AlbRecCod, T1.EmprCod, T1.CliCod, T2.CliUltNPz FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012Y3", "INSERT INTO TXPALBDET(EmprCod, AlbRecCod, AlbRecPie, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbPCont, AlbRecPal, AlRPieCal, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRPieDefC, AlRExp1, AlRExp2, AlbRecFec, AlbRecPar, AlbRecCue, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new UpdateCursor("P012Y4", "UPDATE TXPCLIENT SET CliUltNPz=?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new UpdateCursor("P012Y5", "UPDATE TXPALBREC SET AlbUltP=?  WHERE AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(3, (String)parms[2], 9);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 15);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
      }
   }

}

