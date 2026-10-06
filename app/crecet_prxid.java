package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class crecet_prxid extends GXProcedure
{
   public crecet_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crecet_prxid.class ), "" );
   }

   public crecet_prxid( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 ,
                           short aP4 )
   {
      crecet_prxid.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte[] aP5 )
   {
      crecet_prxid.this.AV8EmprCod = aP0;
      crecet_prxid.this.AV11Barcod = aP1;
      crecet_prxid.this.AV12Barcodreo = aP2;
      crecet_prxid.this.AV13Barcodpar = aP3;
      crecet_prxid.this.AV14Reclinmaq = aP4;
      crecet_prxid.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09VS3 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV12Barcodreo), AV13Barcodpar});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09VS3_A40000GXC1[0] ;
         n40000GXC1 = P09VS3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (byte)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV10Reclinpro = (byte)(A40000GXC1+5) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = crecet_prxid.this.AV10Reclinpro;
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
      P09VS3_A40000GXC1 = new byte[1] ;
      P09VS3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.crecet_prxid__default(),
         new Object[] {
             new Object[] {
            P09VS3_A40000GXC1, P09VS3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Barcodreo ;
   private byte AV10Reclinpro ;
   private byte A40000GXC1 ;
   private short AV14Reclinmaq ;
   private short Gx_err ;
   private int AV11Barcod ;
   private String AV8EmprCod ;
   private String AV13Barcodpar ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09VS3_A40000GXC1 ;
   private boolean[] P09VS3_n40000GXC1 ;
}

final  class crecet_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VS3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(RecLinPro) AS GXC1 FROM TXPCRECET WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
      }
   }

}

