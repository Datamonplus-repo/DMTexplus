package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plotescall extends GXProcedure
{
   public plotescall( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plotescall.class ), "" );
   }

   public plotescall( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      plotescall.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      plotescall.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plotescall.this.AV10Prdnum = aP1[0];
      this.aP1 = aP1;
      plotescall.this.AV9CCStkLin = aP2[0];
      this.aP2 = aP2;
      plotescall.this.AV11CCStkBar = aP3[0];
      this.aP3 = aP3;
      plotescall.this.AV12CCStkReo = aP4[0];
      this.aP4 = aP4;
      plotescall.this.AV13CCStkpar = aP5[0];
      this.aP5 = aP5;
      plotescall.this.AV8Hrelote = aP6[0];
      this.aP6 = aP6;
      plotescall.this.AV14usurcod = aP7[0];
      this.aP7 = aP7;
      plotescall.this.AV15station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05SI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10Prdnum, Integer.valueOf(AV11CCStkBar), Byte.valueOf(AV12CCStkReo), AV13CCStkpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4558HrePrdNum = P05SI2_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P05SI2_n4558HrePrdNum[0] ;
         A4492HreBarCod = P05SI2_A4492HreBarCod[0] ;
         A4493HreBarReo = P05SI2_A4493HreBarReo[0] ;
         A4494HreBarPar = P05SI2_A4494HreBarPar[0] ;
         A4495HreNumCie = P05SI2_A4495HreNumCie[0] ;
         A4545HreLinMaq = P05SI2_A4545HreLinMaq[0] ;
         A4550HreLinPro = P05SI2_A4550HreLinPro[0] ;
         A4557HreRecLin = P05SI2_A4557HreRecLin[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A4492HreBarCod ;
         GXv_int3[0] = A4493HreBarReo ;
         GXv_char4[0] = A4494HreBarPar ;
         GXv_int5[0] = A4495HreNumCie ;
         GXv_int6[0] = A4545HreLinMaq ;
         GXv_int7[0] = A4550HreLinPro ;
         GXv_int8[0] = A4557HreRecLin ;
         GXv_char9[0] = A4558HrePrdNum ;
         GXv_char10[0] = AV8Hrelote ;
         GXv_char11[0] = AV14usurcod ;
         GXv_char12[0] = AV15station ;
         new app.plotescupdate(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_int8, GXv_char9, GXv_char10, GXv_char11, GXv_char12) ;
         plotescall.this.A396EmprCod = GXv_char1[0] ;
         plotescall.this.A4492HreBarCod = GXv_int2[0] ;
         plotescall.this.A4493HreBarReo = GXv_int3[0] ;
         plotescall.this.A4494HreBarPar = GXv_char4[0] ;
         plotescall.this.A4495HreNumCie = GXv_int5[0] ;
         plotescall.this.A4545HreLinMaq = GXv_int6[0] ;
         plotescall.this.A4550HreLinPro = GXv_int7[0] ;
         plotescall.this.A4557HreRecLin = GXv_int8[0] ;
         plotescall.this.A4558HrePrdNum = GXv_char9[0] ;
         plotescall.this.AV8Hrelote = GXv_char10[0] ;
         plotescall.this.AV14usurcod = GXv_char11[0] ;
         plotescall.this.AV15station = GXv_char12[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P05SI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV10Prdnum, Long.valueOf(AV9CCStkLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3342CCStkLin = P05SI3_A3342CCStkLin[0] ;
         A719PrdNum = P05SI3_A719PrdNum[0] ;
         A5722CCStkLot = P05SI3_A5722CCStkLot[0] ;
         AV16Inc_obs = httpContext.getMessage( "CCSTKS.Producto", "") + AV10Prdnum + GXutil.newLine( ) ;
         AV16Inc_obs += "#           " + GXutil.str( A3342CCStkLin, 12, 0) + GXutil.newLine( ) ;
         AV16Inc_obs += httpContext.getMessage( "Cambio Lote ", "") + A5722CCStkLot + httpContext.getMessage( " por ", "") + AV8Hrelote + GXutil.newLine( ) ;
         A5722CCStkLot = AV8Hrelote ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV21Pgmname, 1, 10), AV14usurcod, AV15station, AV16Inc_obs, AV11CCStkBar, AV12CCStkReo, AV13CCStkpar) ;
         /* Using cursor P05SI4 */
         pr_default.execute(2, new Object[] {A5722CCStkLot, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plotescall.this.A396EmprCod;
      this.aP1[0] = plotescall.this.AV10Prdnum;
      this.aP2[0] = plotescall.this.AV9CCStkLin;
      this.aP3[0] = plotescall.this.AV11CCStkBar;
      this.aP4[0] = plotescall.this.AV12CCStkReo;
      this.aP5[0] = plotescall.this.AV13CCStkpar;
      this.aP6[0] = plotescall.this.AV8Hrelote;
      this.aP7[0] = plotescall.this.AV14usurcod;
      this.aP8[0] = plotescall.this.AV15station;
      Application.commitDataStores(context, remoteHandle, pr_default, "plotescall");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05SI2_A396EmprCod = new String[] {""} ;
      P05SI2_A4558HrePrdNum = new String[] {""} ;
      P05SI2_n4558HrePrdNum = new boolean[] {false} ;
      P05SI2_A4492HreBarCod = new int[1] ;
      P05SI2_A4493HreBarReo = new byte[1] ;
      P05SI2_A4494HreBarPar = new String[] {""} ;
      P05SI2_A4495HreNumCie = new byte[1] ;
      P05SI2_A4545HreLinMaq = new short[1] ;
      P05SI2_A4550HreLinPro = new byte[1] ;
      P05SI2_A4557HreRecLin = new short[1] ;
      A4558HrePrdNum = "" ;
      A4494HreBarPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new short[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      P05SI3_A396EmprCod = new String[] {""} ;
      P05SI3_A3342CCStkLin = new long[1] ;
      P05SI3_A719PrdNum = new String[] {""} ;
      P05SI3_A5722CCStkLot = new String[] {""} ;
      A719PrdNum = "" ;
      A5722CCStkLot = "" ;
      AV16Inc_obs = "" ;
      AV21Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plotescall__default(),
         new Object[] {
             new Object[] {
            P05SI2_A396EmprCod, P05SI2_A4558HrePrdNum, P05SI2_n4558HrePrdNum, P05SI2_A4492HreBarCod, P05SI2_A4493HreBarReo, P05SI2_A4494HreBarPar, P05SI2_A4495HreNumCie, P05SI2_A4545HreLinMaq, P05SI2_A4550HreLinPro, P05SI2_A4557HreRecLin
            }
            , new Object[] {
            P05SI3_A396EmprCod, P05SI3_A3342CCStkLin, P05SI3_A719PrdNum, P05SI3_A5722CCStkLot
            }
            , new Object[] {
            }
         }
      );
      AV21Pgmname = "PLoteSCAll" ;
      /* GeneXus formulas. */
      AV21Pgmname = "PLoteSCAll" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12CCStkReo ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private byte GXv_int3[] ;
   private byte GXv_int5[] ;
   private byte GXv_int7[] ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short GXv_int6[] ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV11CCStkBar ;
   private int A4492HreBarCod ;
   private int GXv_int2[] ;
   private long AV9CCStkLin ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String AV10Prdnum ;
   private String AV13CCStkpar ;
   private String AV8Hrelote ;
   private String AV14usurcod ;
   private String AV15station ;
   private String scmdbuf ;
   private String A4558HrePrdNum ;
   private String A4494HreBarPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String A719PrdNum ;
   private String A5722CCStkLot ;
   private String AV21Pgmname ;
   private boolean n4558HrePrdNum ;
   private String AV16Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05SI2_A396EmprCod ;
   private String[] P05SI2_A4558HrePrdNum ;
   private boolean[] P05SI2_n4558HrePrdNum ;
   private int[] P05SI2_A4492HreBarCod ;
   private byte[] P05SI2_A4493HreBarReo ;
   private String[] P05SI2_A4494HreBarPar ;
   private byte[] P05SI2_A4495HreNumCie ;
   private short[] P05SI2_A4545HreLinMaq ;
   private byte[] P05SI2_A4550HreLinPro ;
   private short[] P05SI2_A4557HreRecLin ;
   private String[] P05SI3_A396EmprCod ;
   private long[] P05SI3_A3342CCStkLin ;
   private String[] P05SI3_A719PrdNum ;
   private String[] P05SI3_A5722CCStkLot ;
}

final  class plotescall__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SI2", "SELECT EmprCod, HrePrdNum, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? and HrePrdNum = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HrePrdNum, HreBarCod, HreBarReo, HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05SI3", "SELECT EmprCod, CCStkLin, PrdNum, CCStkLot FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLin = ? ORDER BY EmprCod, PrdNum, CCStkLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05SI4", "UPDATE TXPCCSTKS SET CCStkLot=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

