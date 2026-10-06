package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getstatusreceitatinte extends GXProcedure
{
   public getstatusreceitatinte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getstatusreceitatinte.class ), "" );
   }

   public getstatusreceitatinte( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            short aP4 ,
                            short[] aP5 )
   {
      getstatusreceitatinte.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        short[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             short[] aP5 ,
                             short[] aP6 )
   {
      getstatusreceitatinte.this.AV8Emprcod = aP0;
      getstatusreceitatinte.this.AV9Barcod = aP1;
      getstatusreceitatinte.this.AV10Barcodreo = aP2;
      getstatusreceitatinte.this.AV11Barcodpar = aP3;
      getstatusreceitatinte.this.AV12reclinmaq = aP4;
      getstatusreceitatinte.this.aP5 = aP5;
      getstatusreceitatinte.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Lconti = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P0ADS2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar});
      cV15Lconti = P0ADS2_AV15Lconti[0] ;
      pr_default.close(0);
      AV15Lconti = (short)(AV15Lconti+cV15Lconti*1) ;
      /* End optimized group. */
      AV14Hisreh = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P0ADS3 */
      pr_default.execute(1, new Object[] {AV8Emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar});
      cV14Hisreh = P0ADS3_AV14Hisreh[0] ;
      pr_default.close(1);
      AV14Hisreh = (short)(AV14Hisreh+cV14Hisreh*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = getstatusreceitatinte.this.AV15Lconti;
      this.aP6[0] = getstatusreceitatinte.this.AV14Hisreh;
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
      P0ADS2_AV15Lconti = new short[1] ;
      P0ADS3_AV14Hisreh = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.getstatusreceitatinte__default(),
         new Object[] {
             new Object[] {
            P0ADS2_AV15Lconti
            }
            , new Object[] {
            P0ADS3_AV14Hisreh
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private short AV12reclinmaq ;
   private short AV15Lconti ;
   private short AV14Hisreh ;
   private short cV15Lconti ;
   private short cV14Hisreh ;
   private short Gx_err ;
   private int AV9Barcod ;
   private String AV8Emprcod ;
   private String AV11Barcodpar ;
   private String scmdbuf ;
   private short[] aP6 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P0ADS2_AV15Lconti ;
   private short[] P0ADS3_AV14Hisreh ;
}

final  class getstatusreceitatinte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADS2", "SELECT COUNT(*) FROM TXPLCONTI WHERE (EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ?) AND (BarRecAcb <> 'S') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADS3", "SELECT COUNT(*) FROM TXPHISREH WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?) AND (HreRacab <> 'S') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
      }
   }

}

