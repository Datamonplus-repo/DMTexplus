package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phisreo extends GXProcedure
{
   public phisreo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phisreo.class ), "" );
   }

   public phisreo( int remoteHandle ,
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
                             short[] aP6 )
   {
      phisreo.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      phisreo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phisreo.this.AV15BarCodDes = aP1[0];
      this.aP1 = aP1;
      phisreo.this.AV16BarReoDes = aP2[0];
      this.aP2 = aP2;
      phisreo.this.AV17BarParDes = aP3[0];
      this.aP3 = aP3;
      phisreo.this.AV18KgmOri = aP4[0];
      this.aP4 = aP4;
      phisreo.this.AV19MtrOri = aP5[0];
      this.aP5 = aP5;
      phisreo.this.AV24CodCausa = aP6[0];
      this.aP6 = aP6;
      phisreo.this.AV25Maqcod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Num_fic = 0 ;
      GXv_int1[0] = AV23Num_fic ;
      new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTAI", ""), GXv_int1) ;
      phisreo.this.AV23Num_fic = GXv_int1[0] ;
      /* Using cursor P00563 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodDes), Byte.valueOf(AV16BarReoDes), AV17BarParDes});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P00563_A129BarCod[0] ;
         A132BarCodReo = P00563_A132BarCodReo[0] ;
         A130BarCodPar = P00563_A130BarCodPar[0] ;
         A217BarTipArt = P00563_A217BarTipArt[0] ;
         n217BarTipArt = P00563_n217BarTipArt[0] ;
         A212BarSer = P00563_A212BarSer[0] ;
         A135BarColNom = P00563_A135BarColNom[0] ;
         A136BarColNum = P00563_A136BarColNum[0] ;
         A218BarTipCol = P00563_A218BarTipCol[0] ;
         A1652BarSerDsc = P00563_A1652BarSerDsc[0] ;
         A1234BarNomCli = P00563_A1234BarNomCli[0] ;
         A1235BarNumCli = P00563_A1235BarNumCli[0] ;
         A252CliCod = P00563_A252CliCod[0] ;
         n252CliCod = P00563_n252CliCod[0] ;
         A833TipDefCod = P00563_A833TipDefCod[0] ;
         n833TipDefCod = P00563_n833TipDefCod[0] ;
         A166BarKgm = P00563_A166BarKgm[0] ;
         A184BarMtr = P00563_A184BarMtr[0] ;
         A199BarPie1 = P00563_A199BarPie1[0] ;
         A365DisDes = P00563_A365DisDes[0] ;
         A898BarPieNDes = P00563_A898BarPieNDes[0] ;
         A166BarKgm = P00563_A166BarKgm[0] ;
         A184BarMtr = P00563_A184BarMtr[0] ;
         A199BarPie1 = P00563_A199BarPie1[0] ;
         A898BarPieNDes = P00563_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPHISREO

         */
         W396EmprCod = A396EmprCod ;
         W833TipDefCod = A833TipDefCod ;
         n833TipDefCod = false ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         W602MaqCod = A602MaqCod ;
         n602MaqCod = false ;
         A539HisBarCod = A129BarCod ;
         A545HisCodReo = A132BarCodReo ;
         A544HisCodPar = A130BarCodPar ;
         n833TipDefCod = false ;
         A571HisTipArt = A217BarTipArt ;
         n571HisTipArt = false ;
         n252CliCod = false ;
         A542HisBarSer = A212BarSer ;
         n542HisBarSer = false ;
         A546HisColNom = A135BarColNom ;
         n546HisColNom = false ;
         A547HisColNum = A136BarColNum ;
         n547HisColNum = false ;
         A572HisTipCol = A218BarTipCol ;
         n572HisTipCol = false ;
         A553HisNumPie = (short)(A198BarPie) ;
         n553HisNumPie = false ;
         A540HisBarKgm = A166BarKgm ;
         n540HisBarKgm = false ;
         A541HisBarMtr = A184BarMtr ;
         n541HisBarMtr = false ;
         A602MaqCod = AV25Maqcod ;
         n602MaqCod = false ;
         A569HisReoFec = GXutil.today( ) ;
         n569HisReoFec = false ;
         A549HisKgmOri = AV18KgmOri ;
         n549HisKgmOri = false ;
         A552HisMtrOri = AV19MtrOri ;
         n552HisMtrOri = false ;
         A554HisOrdReo = A132BarCodReo ;
         n554HisOrdReo = false ;
         A548HisEstReo = (byte)(1) ;
         n548HisEstReo = false ;
         A2297HisReoTn = AV23Num_fic ;
         n2297HisReoTn = false ;
         A5085CodCausa = AV24CodCausa ;
         n5085CodCausa = false ;
         A2299HisReoDsc = A1652BarSerDsc ;
         n2299HisReoDsc = false ;
         A8567HisHorReo = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
         n8567HisHorReo = false ;
         A8889HisNomCli = A1234BarNomCli ;
         n8889HisNomCli = false ;
         A8890HisNumCli = A1235BarNumCli ;
         n8890HisNumCli = false ;
         /* Using cursor P00564 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n552HisMtrOri), A552HisMtrOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n8567HisHorReo), A8567HisHorReo, Boolean.valueOf(n8889HisNomCli), A8889HisNomCli, Boolean.valueOf(n8890HisNumCli), Integer.valueOf(A8890HisNumCli)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P00565 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P00565_A396EmprCod[0] ;
               A539HisBarCod = P00565_A539HisBarCod[0] ;
               A545HisCodReo = P00565_A545HisCodReo[0] ;
               A544HisCodPar = P00565_A544HisCodPar[0] ;
               A833TipDefCod = P00565_A833TipDefCod[0] ;
               n833TipDefCod = P00565_n833TipDefCod[0] ;
               A553HisNumPie = P00565_A553HisNumPie[0] ;
               n553HisNumPie = P00565_n553HisNumPie[0] ;
               A540HisBarKgm = P00565_A540HisBarKgm[0] ;
               n540HisBarKgm = P00565_n540HisBarKgm[0] ;
               A541HisBarMtr = P00565_A541HisBarMtr[0] ;
               n541HisBarMtr = P00565_n541HisBarMtr[0] ;
               A553HisNumPie = (short)(A198BarPie) ;
               n553HisNumPie = false ;
               A540HisBarKgm = A166BarKgm ;
               n540HisBarKgm = false ;
               A541HisBarMtr = A184BarMtr ;
               n541HisBarMtr = false ;
               /* Using cursor P00566 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n541HisBarMtr), A541HisBarMtr, A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
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
         A396EmprCod = W396EmprCod ;
         A833TipDefCod = W833TipDefCod ;
         n833TipDefCod = false ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         A602MaqCod = W602MaqCod ;
         n602MaqCod = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phisreo.this.A396EmprCod;
      this.aP1[0] = phisreo.this.AV15BarCodDes;
      this.aP2[0] = phisreo.this.AV16BarReoDes;
      this.aP3[0] = phisreo.this.AV17BarParDes;
      this.aP4[0] = phisreo.this.AV18KgmOri;
      this.aP5[0] = phisreo.this.AV19MtrOri;
      this.aP6[0] = phisreo.this.AV24CodCausa;
      this.aP7[0] = phisreo.this.AV25Maqcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "phisreo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      scmdbuf = "" ;
      P00563_A396EmprCod = new String[] {""} ;
      P00563_A129BarCod = new int[1] ;
      P00563_A132BarCodReo = new byte[1] ;
      P00563_A130BarCodPar = new String[] {""} ;
      P00563_A217BarTipArt = new short[1] ;
      P00563_n217BarTipArt = new boolean[] {false} ;
      P00563_A212BarSer = new String[] {""} ;
      P00563_A135BarColNom = new String[] {""} ;
      P00563_A136BarColNum = new int[1] ;
      P00563_A218BarTipCol = new byte[1] ;
      P00563_A1652BarSerDsc = new String[] {""} ;
      P00563_A1234BarNomCli = new String[] {""} ;
      P00563_A1235BarNumCli = new int[1] ;
      P00563_A252CliCod = new int[1] ;
      P00563_n252CliCod = new boolean[] {false} ;
      P00563_A833TipDefCod = new short[1] ;
      P00563_n833TipDefCod = new boolean[] {false} ;
      P00563_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00563_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00563_A199BarPie1 = new short[1] ;
      P00563_A365DisDes = new String[] {""} ;
      P00563_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      W396EmprCod = "" ;
      W602MaqCod = "" ;
      A602MaqCod = "" ;
      A544HisCodPar = "" ;
      A542HisBarSer = "" ;
      A546HisColNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A552HisMtrOri = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      A8567HisHorReo = GXutil.resetTime( GXutil.nullDate() );
      A8889HisNomCli = "" ;
      Gx_emsg = "" ;
      P00565_A396EmprCod = new String[] {""} ;
      P00565_A539HisBarCod = new int[1] ;
      P00565_A545HisCodReo = new byte[1] ;
      P00565_A544HisCodPar = new String[] {""} ;
      P00565_A833TipDefCod = new short[1] ;
      P00565_n833TipDefCod = new boolean[] {false} ;
      P00565_A553HisNumPie = new short[1] ;
      P00565_n553HisNumPie = new boolean[] {false} ;
      P00565_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00565_n540HisBarKgm = new boolean[] {false} ;
      P00565_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00565_n541HisBarMtr = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phisreo__default(),
         new Object[] {
             new Object[] {
            P00563_A396EmprCod, P00563_A129BarCod, P00563_A132BarCodReo, P00563_A130BarCodPar, P00563_A217BarTipArt, P00563_n217BarTipArt, P00563_A212BarSer, P00563_A135BarColNom, P00563_A136BarColNum, P00563_A218BarTipCol,
            P00563_A1652BarSerDsc, P00563_A1234BarNomCli, P00563_A1235BarNumCli, P00563_A252CliCod, P00563_n252CliCod, P00563_A833TipDefCod, P00563_n833TipDefCod, P00563_A166BarKgm, P00563_A184BarMtr, P00563_A199BarPie1,
            P00563_A365DisDes, P00563_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P00565_A396EmprCod, P00565_A539HisBarCod, P00565_A545HisCodReo, P00565_A544HisCodPar, P00565_A833TipDefCod, P00565_A553HisNumPie, P00565_n553HisNumPie, P00565_A540HisBarKgm, P00565_n540HisBarKgm, P00565_A541HisBarMtr,
            P00565_n541HisBarMtr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarReoDes ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private short AV24CodCausa ;
   private short A217BarTipArt ;
   private short A833TipDefCod ;
   private short A199BarPie1 ;
   private short W833TipDefCod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private short A5085CodCausa ;
   private short Gx_err ;
   private int AV15BarCodDes ;
   private int AV23Num_fic ;
   private int GXv_int1[] ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GX_INS60 ;
   private int W252CliCod ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int A2297HisReoTn ;
   private int A8890HisNumCli ;
   private java.math.BigDecimal AV18KgmOri ;
   private java.math.BigDecimal AV19MtrOri ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A549HisKgmOri ;
   private java.math.BigDecimal A552HisMtrOri ;
   private String A396EmprCod ;
   private String AV17BarParDes ;
   private String AV25Maqcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A365DisDes ;
   private String W396EmprCod ;
   private String W602MaqCod ;
   private String A602MaqCod ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String A2299HisReoDsc ;
   private String A8889HisNomCli ;
   private String Gx_emsg ;
   private java.util.Date A8567HisHorReo ;
   private java.util.Date A569HisReoFec ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean n602MaqCod ;
   private boolean n571HisTipArt ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n572HisTipCol ;
   private boolean n553HisNumPie ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n569HisReoFec ;
   private boolean n549HisKgmOri ;
   private boolean n552HisMtrOri ;
   private boolean n554HisOrdReo ;
   private boolean n548HisEstReo ;
   private boolean n2297HisReoTn ;
   private boolean n5085CodCausa ;
   private boolean n2299HisReoDsc ;
   private boolean n8567HisHorReo ;
   private boolean n8889HisNomCli ;
   private boolean n8890HisNumCli ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00563_A396EmprCod ;
   private int[] P00563_A129BarCod ;
   private byte[] P00563_A132BarCodReo ;
   private String[] P00563_A130BarCodPar ;
   private short[] P00563_A217BarTipArt ;
   private boolean[] P00563_n217BarTipArt ;
   private String[] P00563_A212BarSer ;
   private String[] P00563_A135BarColNom ;
   private int[] P00563_A136BarColNum ;
   private byte[] P00563_A218BarTipCol ;
   private String[] P00563_A1652BarSerDsc ;
   private String[] P00563_A1234BarNomCli ;
   private int[] P00563_A1235BarNumCli ;
   private int[] P00563_A252CliCod ;
   private boolean[] P00563_n252CliCod ;
   private short[] P00563_A833TipDefCod ;
   private boolean[] P00563_n833TipDefCod ;
   private java.math.BigDecimal[] P00563_A166BarKgm ;
   private java.math.BigDecimal[] P00563_A184BarMtr ;
   private short[] P00563_A199BarPie1 ;
   private String[] P00563_A365DisDes ;
   private int[] P00563_A898BarPieNDes ;
   private String[] P00565_A396EmprCod ;
   private int[] P00565_A539HisBarCod ;
   private byte[] P00565_A545HisCodReo ;
   private String[] P00565_A544HisCodPar ;
   private short[] P00565_A833TipDefCod ;
   private boolean[] P00565_n833TipDefCod ;
   private short[] P00565_A553HisNumPie ;
   private boolean[] P00565_n553HisNumPie ;
   private java.math.BigDecimal[] P00565_A540HisBarKgm ;
   private boolean[] P00565_n540HisBarKgm ;
   private java.math.BigDecimal[] P00565_A541HisBarMtr ;
   private boolean[] P00565_n541HisBarMtr ;
}

final  class phisreo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00563", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTipArt, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarSerDsc, T1.BarNomCli, T1.BarNumCli, T1.CliCod, T1.TipDefCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00564", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, HisBarMtr, MaqCod, HisReoFec, HisKgmOri, HisMtrOri, HisOrdReo, HisEstReo, HisReoTn, HisReoDsc, CodCausa, HisHorReo, HisNomCli, HisNumCli, HisReoPza, Hisoperar, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, Rps_Cod, HisUsu, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P00565", "SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisNumPie, HisBarKgm, HisBarMtr FROM TXPHISREO WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ? and TipDefCod = ? ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00566", "UPDATE TXPHISREO SET HisNumPie=?, HisBarKgm=?, HisBarMtr=?  WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 1);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 26);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[43], true);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 13);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[47]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               return;
      }
   }

}

