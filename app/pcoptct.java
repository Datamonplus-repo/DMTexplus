package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoptct extends GXProcedure
{
   public pcoptct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoptct.class ), "" );
   }

   public pcoptct( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] AV33Tab_p ,
                             short[] AV34Tab_l ,
                             int[] aP11 ,
                             byte[] aP12 )
   {
      pcoptct.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, AV33Tab_p, AV34Tab_l, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] AV33Tab_p ,
                        short[] AV34Tab_l ,
                        int[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, AV33Tab_p, AV34Tab_l, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] AV33Tab_p ,
                             short[] AV34Tab_l ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 )
   {
      pcoptct.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoptct.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pcoptct.this.AV16ForSer = aP2[0];
      this.aP2 = aP2;
      pcoptct.this.AV17ForColNom = aP3[0];
      this.aP3 = aP3;
      pcoptct.this.AV18ForColNum = aP4[0];
      this.aP4 = aP4;
      pcoptct.this.AV19TipColCod = aP5[0];
      this.aP5 = aP5;
      pcoptct.this.AV31BarAnt = aP6[0];
      this.aP6 = aP6;
      pcoptct.this.AV32BarAcc = aP7[0];
      this.aP7 = aP7;
      pcoptct.this.AV38BarAntpT = aP8[0];
      this.aP8 = aP8;
      pcoptct.this.AV33Tab_p = AV33Tab_p;
      pcoptct.this.AV34Tab_l = AV34Tab_l;
      pcoptct.this.AV41BarCod = aP11[0];
      this.aP11 = aP11;
      pcoptct.this.AV42BarCodReo = aP12[0];
      this.aP12 = aP12;
      pcoptct.this.AV43BarCodPar = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV37F_coptct ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COPTCT", ""), GXv_int1) ;
      pcoptct.this.AV37F_coptct = GXv_int1[0] ;
      /* Using cursor P01PS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCod), Byte.valueOf(AV42BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01PS2_A130BarCodPar[0] ;
         A132BarCodReo = P01PS2_A132BarCodReo[0] ;
         A129BarCod = P01PS2_A129BarCod[0] ;
         A2010BarTipDis = P01PS2_A2010BarTipDis[0] ;
         AV44BarTipDis = A2010BarTipDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'LIMPIAR_TABLA' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV35i = (short)(1) ;
      /* Using cursor P01PS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P01PS3_A831TipColCod[0] ;
         A483ForColNum = P01PS3_A483ForColNum[0] ;
         A482ForColNom = P01PS3_A482ForColNom[0] ;
         A494ForSer = P01PS3_A494ForSer[0] ;
         A252CliCod = P01PS3_A252CliCod[0] ;
         A626MatCod = P01PS3_A626MatCod[0] ;
         A583IntCod = P01PS3_A583IntCod[0] ;
         AV26MatCod = A626MatCod ;
         AV27IntCod = A583IntCod ;
         /* Execute user subroutine: 'TIPART' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P01PS4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A764ProForCod = P01PS4_A764ProForCod[0] ;
            A8656ProForrbn = P01PS4_A8656ProForrbn[0] ;
            A1160ProForL = P01PS4_A1160ProForL[0] ;
            AV34Tab_l[AV35i-1] = A1160ProForL ;
            AV33Tab_p[AV35i-1] = A764ProForCod ;
            AV45Tab_rb[AV35i-1] = A8656ProForrbn ;
            AV35i = (short)(AV35i+1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( ( AV37F_coptct == 0 ) || ( GXutil.strcmp(AV44BarTipDis, httpContext.getMessage( "L", "")) == 0 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LIMPIAR_TABLA' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV35i = (short)(1) ;
      /* Using cursor P01PS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod), Integer.valueOf(AV41BarCod), Byte.valueOf(AV42BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A5581XCodParf = P01PS5_A5581XCodParf[0] ;
         A5580XCodReof = P01PS5_A5580XCodReof[0] ;
         A5579XBarCodf = P01PS5_A5579XBarCodf[0] ;
         A5575XTipColCod = P01PS5_A5575XTipColCod[0] ;
         A5574XForColNum = P01PS5_A5574XForColNum[0] ;
         A5573XForColNom = P01PS5_A5573XForColNom[0] ;
         A5572XForSer = P01PS5_A5572XForSer[0] ;
         A5571XCliCodf = P01PS5_A5571XCliCodf[0] ;
         A5576XProForCod = P01PS5_A5576XProForCod[0] ;
         n5576XProForCod = P01PS5_n5576XProForCod[0] ;
         A5578XProForLn = P01PS5_A5578XProForLn[0] ;
         AV34Tab_l[AV35i-1] = A5578XProForLn ;
         AV33Tab_p[AV35i-1] = A5576XProForCod ;
         AV35i = (short)(AV35i+1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   public void S111( )
   {
      /* 'LIMPIAR_TABLA' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV34Tab_l[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV33Tab_p[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV45Tab_rb[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
   }

   public void S121( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      /* Using cursor P01PS6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65ArtCod = P01PS6_A65ArtCod[0] ;
         A252CliCod = P01PS6_A252CliCod[0] ;
         A829TipArtCod = P01PS6_A829TipArtCod[0] ;
         AV29TipArtFor = A829TipArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoptct.this.A396EmprCod;
      this.aP1[0] = pcoptct.this.AV15CliCod;
      this.aP2[0] = pcoptct.this.AV16ForSer;
      this.aP3[0] = pcoptct.this.AV17ForColNom;
      this.aP4[0] = pcoptct.this.AV18ForColNum;
      this.aP5[0] = pcoptct.this.AV19TipColCod;
      this.aP6[0] = pcoptct.this.AV31BarAnt;
      this.aP7[0] = pcoptct.this.AV32BarAcc;
      this.aP8[0] = pcoptct.this.AV38BarAntpT;
      this.aP11[0] = pcoptct.this.AV41BarCod;
      this.aP12[0] = pcoptct.this.AV42BarCodReo;
      this.aP13[0] = pcoptct.this.AV43BarCodPar;
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
      P01PS2_A396EmprCod = new String[] {""} ;
      P01PS2_A130BarCodPar = new String[] {""} ;
      P01PS2_A132BarCodReo = new byte[1] ;
      P01PS2_A129BarCod = new int[1] ;
      P01PS2_A2010BarTipDis = new String[] {""} ;
      A130BarCodPar = "" ;
      A2010BarTipDis = "" ;
      AV44BarTipDis = "" ;
      P01PS3_A396EmprCod = new String[] {""} ;
      P01PS3_A831TipColCod = new byte[1] ;
      P01PS3_A483ForColNum = new int[1] ;
      P01PS3_A482ForColNom = new String[] {""} ;
      P01PS3_A494ForSer = new String[] {""} ;
      P01PS3_A252CliCod = new int[1] ;
      P01PS3_A626MatCod = new short[1] ;
      P01PS3_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P01PS4_A396EmprCod = new String[] {""} ;
      P01PS4_A252CliCod = new int[1] ;
      P01PS4_A494ForSer = new String[] {""} ;
      P01PS4_A482ForColNom = new String[] {""} ;
      P01PS4_A483ForColNum = new int[1] ;
      P01PS4_A831TipColCod = new byte[1] ;
      P01PS4_A764ProForCod = new String[] {""} ;
      P01PS4_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01PS4_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      AV45Tab_rb = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV45Tab_rb[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P01PS5_A396EmprCod = new String[] {""} ;
      P01PS5_A5581XCodParf = new String[] {""} ;
      P01PS5_A5580XCodReof = new byte[1] ;
      P01PS5_A5579XBarCodf = new int[1] ;
      P01PS5_A5575XTipColCod = new byte[1] ;
      P01PS5_A5574XForColNum = new int[1] ;
      P01PS5_A5573XForColNom = new String[] {""} ;
      P01PS5_A5572XForSer = new String[] {""} ;
      P01PS5_A5571XCliCodf = new int[1] ;
      P01PS5_A5576XProForCod = new String[] {""} ;
      P01PS5_n5576XProForCod = new boolean[] {false} ;
      P01PS5_A5578XProForLn = new short[1] ;
      A5581XCodParf = "" ;
      A5573XForColNom = "" ;
      A5572XForSer = "" ;
      A5576XProForCod = "" ;
      P01PS6_A396EmprCod = new String[] {""} ;
      P01PS6_A65ArtCod = new String[] {""} ;
      P01PS6_A252CliCod = new int[1] ;
      P01PS6_A829TipArtCod = new short[1] ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoptct__default(),
         new Object[] {
             new Object[] {
            P01PS2_A396EmprCod, P01PS2_A130BarCodPar, P01PS2_A132BarCodReo, P01PS2_A129BarCod, P01PS2_A2010BarTipDis
            }
            , new Object[] {
            P01PS3_A396EmprCod, P01PS3_A831TipColCod, P01PS3_A483ForColNum, P01PS3_A482ForColNom, P01PS3_A494ForSer, P01PS3_A252CliCod, P01PS3_A626MatCod, P01PS3_A583IntCod
            }
            , new Object[] {
            P01PS4_A396EmprCod, P01PS4_A252CliCod, P01PS4_A494ForSer, P01PS4_A482ForColNom, P01PS4_A483ForColNum, P01PS4_A831TipColCod, P01PS4_A764ProForCod, P01PS4_A8656ProForrbn, P01PS4_A1160ProForL
            }
            , new Object[] {
            P01PS5_A396EmprCod, P01PS5_A5581XCodParf, P01PS5_A5580XCodReof, P01PS5_A5579XBarCodf, P01PS5_A5575XTipColCod, P01PS5_A5574XForColNum, P01PS5_A5573XForColNom, P01PS5_A5572XForSer, P01PS5_A5571XCliCodf, P01PS5_A5576XProForCod,
            P01PS5_n5576XProForCod, P01PS5_A5578XProForLn
            }
            , new Object[] {
            P01PS6_A396EmprCod, P01PS6_A65ArtCod, P01PS6_A252CliCod, P01PS6_A829TipArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte AV42BarCodReo ;
   private byte AV37F_coptct ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV27IntCod ;
   private byte A5580XCodReof ;
   private byte A5575XTipColCod ;
   private short AV34Tab_l[] ;
   private short AV35i ;
   private short A626MatCod ;
   private short AV26MatCod ;
   private short A1160ProForL ;
   private short A5578XProForLn ;
   private short A829TipArtCod ;
   private short AV29TipArtFor ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int AV41BarCod ;
   private int A129BarCod ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A5579XBarCodf ;
   private int A5574XForColNum ;
   private int A5571XCliCodf ;
   private int GX_I ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal AV45Tab_rb[] ;
   private String A396EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String AV31BarAnt ;
   private String AV32BarAcc ;
   private String AV38BarAntpT ;
   private String AV33Tab_p[] ;
   private String AV43BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2010BarTipDis ;
   private String AV44BarTipDis ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String A5581XCodParf ;
   private String A5573XForColNom ;
   private String A5572XForSer ;
   private String A5576XProForCod ;
   private String A65ArtCod ;
   private boolean returnInSub ;
   private boolean n5576XProForCod ;
   private String[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private int[] aP11 ;
   private byte[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PS2_A396EmprCod ;
   private String[] P01PS2_A130BarCodPar ;
   private byte[] P01PS2_A132BarCodReo ;
   private int[] P01PS2_A129BarCod ;
   private String[] P01PS2_A2010BarTipDis ;
   private String[] P01PS3_A396EmprCod ;
   private byte[] P01PS3_A831TipColCod ;
   private int[] P01PS3_A483ForColNum ;
   private String[] P01PS3_A482ForColNom ;
   private String[] P01PS3_A494ForSer ;
   private int[] P01PS3_A252CliCod ;
   private short[] P01PS3_A626MatCod ;
   private byte[] P01PS3_A583IntCod ;
   private String[] P01PS4_A396EmprCod ;
   private int[] P01PS4_A252CliCod ;
   private String[] P01PS4_A494ForSer ;
   private String[] P01PS4_A482ForColNom ;
   private int[] P01PS4_A483ForColNum ;
   private byte[] P01PS4_A831TipColCod ;
   private String[] P01PS4_A764ProForCod ;
   private java.math.BigDecimal[] P01PS4_A8656ProForrbn ;
   private short[] P01PS4_A1160ProForL ;
   private String[] P01PS5_A396EmprCod ;
   private String[] P01PS5_A5581XCodParf ;
   private byte[] P01PS5_A5580XCodReof ;
   private int[] P01PS5_A5579XBarCodf ;
   private byte[] P01PS5_A5575XTipColCod ;
   private int[] P01PS5_A5574XForColNum ;
   private String[] P01PS5_A5573XForColNom ;
   private String[] P01PS5_A5572XForSer ;
   private int[] P01PS5_A5571XCliCodf ;
   private String[] P01PS5_A5576XProForCod ;
   private boolean[] P01PS5_n5576XProForCod ;
   private short[] P01PS5_A5578XProForLn ;
   private String[] P01PS6_A396EmprCod ;
   private String[] P01PS6_A65ArtCod ;
   private int[] P01PS6_A252CliCod ;
   private short[] P01PS6_A829TipArtCod ;
}

final  class pcoptct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PS2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTipDis FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01PS3", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, MatCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01PS4", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForrbn, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01PS5", "SELECT EmprCod, XCodParf, XCodReof, XBarCodf, XTipColCod, XForColNum, XForColNom, XForSer, XCliCodf, XProForCod, XProForLn FROM TXPXLFOR1 WHERE EmprCod = ? and XCliCodf = ? and XForSer = ? and XForColNom = ? and XForColNum = ? and XTipColCod = ? and XBarCodf = ? and XCodReof = ? and XCodParf = ? ORDER BY EmprCod, XCliCodf, XForSer, XForColNom, XForColNum, XTipColCod, XBarCodf, XCodReof, XCodParf, XProForLn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01PS6", "SELECT EmprCod, ArtCod, CliCod, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

