package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacar3 extends GXProcedure
{
   public pmacar3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacar3.class ), "" );
   }

   public pmacar3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 )
   {
      pmacar3.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pmacar3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmacar3.this.AV10MacCod = aP1[0];
      this.aP1 = aP1;
      pmacar3.this.AV11BarCod = aP2[0];
      this.aP2 = aP2;
      pmacar3.this.AV12barCodreo = aP3[0];
      this.aP3 = aP3;
      pmacar3.this.AV13barcodpar = aP4[0];
      this.aP4 = aP4;
      pmacar3.this.AV9Err_hdr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Err_hdr = (byte)(0) ;
      /* Using cursor P04ZH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10MacCod), Integer.valueOf(AV11BarCod), Byte.valueOf(AV12barCodreo), AV13barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12139MacCodId = P04ZH2_A12139MacCodId[0] ;
         A12134MacArtHd = P04ZH2_A12134MacArtHd[0] ;
         n12134MacArtHd = P04ZH2_n12134MacArtHd[0] ;
         A12135MacArtR = P04ZH2_A12135MacArtR[0] ;
         n12135MacArtR = P04ZH2_n12135MacArtR[0] ;
         A12136MacArtP = P04ZH2_A12136MacArtP[0] ;
         n12136MacArtP = P04ZH2_n12136MacArtP[0] ;
         A12140MacLinId = P04ZH2_A12140MacLinId[0] ;
         AV9Err_hdr = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmacar3.this.A396EmprCod;
      this.aP1[0] = pmacar3.this.AV10MacCod;
      this.aP2[0] = pmacar3.this.AV11BarCod;
      this.aP3[0] = pmacar3.this.AV12barCodreo;
      this.aP4[0] = pmacar3.this.AV13barcodpar;
      this.aP5[0] = pmacar3.this.AV9Err_hdr;
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
      P04ZH2_A396EmprCod = new String[] {""} ;
      P04ZH2_A12139MacCodId = new int[1] ;
      P04ZH2_A12134MacArtHd = new int[1] ;
      P04ZH2_n12134MacArtHd = new boolean[] {false} ;
      P04ZH2_A12135MacArtR = new byte[1] ;
      P04ZH2_n12135MacArtR = new boolean[] {false} ;
      P04ZH2_A12136MacArtP = new String[] {""} ;
      P04ZH2_n12136MacArtP = new boolean[] {false} ;
      P04ZH2_A12140MacLinId = new short[1] ;
      A12136MacArtP = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmacar3__default(),
         new Object[] {
             new Object[] {
            P04ZH2_A396EmprCod, P04ZH2_A12139MacCodId, P04ZH2_A12134MacArtHd, P04ZH2_n12134MacArtHd, P04ZH2_A12135MacArtR, P04ZH2_n12135MacArtR, P04ZH2_A12136MacArtP, P04ZH2_n12136MacArtP, P04ZH2_A12140MacLinId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12barCodreo ;
   private byte AV9Err_hdr ;
   private byte A12135MacArtR ;
   private short A12140MacLinId ;
   private short Gx_err ;
   private int AV10MacCod ;
   private int AV11BarCod ;
   private int A12139MacCodId ;
   private int A12134MacArtHd ;
   private String A396EmprCod ;
   private String AV13barcodpar ;
   private String scmdbuf ;
   private String A12136MacArtP ;
   private boolean n12134MacArtHd ;
   private boolean n12135MacArtR ;
   private boolean n12136MacArtP ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZH2_A396EmprCod ;
   private int[] P04ZH2_A12139MacCodId ;
   private int[] P04ZH2_A12134MacArtHd ;
   private boolean[] P04ZH2_n12134MacArtHd ;
   private byte[] P04ZH2_A12135MacArtR ;
   private boolean[] P04ZH2_n12135MacArtR ;
   private String[] P04ZH2_A12136MacArtP ;
   private boolean[] P04ZH2_n12136MacArtP ;
   private short[] P04ZH2_A12140MacLinId ;
}

final  class pmacar3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZH2", "SELECT EmprCod, MacCodId, MacArtHd, MacArtR, MacArtP, MacLinId FROM TXPMACAR1 WHERE EmprCod = ? and MacCodId = ? and MacArtHd = ? and MacArtR = ? and MacArtP = ? ORDER BY EmprCod, MacCodId, MacArtHd, MacArtR, MacArtP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

