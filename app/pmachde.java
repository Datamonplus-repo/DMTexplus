package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmachde extends GXProcedure
{
   public pmachde( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmachde.class ), "" );
   }

   public pmachde( int remoteHandle ,
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
      pmachde.this.aP5 = new byte[] {0};
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
      pmachde.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmachde.this.AV10MacCod = aP1[0];
      this.aP1 = aP1;
      pmachde.this.AV11BarCod = aP2[0];
      this.aP2 = aP2;
      pmachde.this.AV12barCodreo = aP3[0];
      this.aP3 = aP3;
      pmachde.this.AV13barcodpar = aP4[0];
      this.aP4 = aP4;
      pmachde.this.AV9Err_hdr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Err_hdr = (byte)(0) ;
      /* Using cursor P02G32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10MacCod), Integer.valueOf(AV11BarCod), Byte.valueOf(AV12barCodreo), AV13barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P02G32_A1199MacCod[0] ;
         A1203MacBarCod = P02G32_A1203MacBarCod[0] ;
         A1204MacBarReo = P02G32_A1204MacBarReo[0] ;
         A1205MacBarPar = P02G32_A1205MacBarPar[0] ;
         A1201MacLin = P02G32_A1201MacLin[0] ;
         AV9Err_hdr = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmachde.this.A396EmprCod;
      this.aP1[0] = pmachde.this.AV10MacCod;
      this.aP2[0] = pmachde.this.AV11BarCod;
      this.aP3[0] = pmachde.this.AV12barCodreo;
      this.aP4[0] = pmachde.this.AV13barcodpar;
      this.aP5[0] = pmachde.this.AV9Err_hdr;
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
      P02G32_A396EmprCod = new String[] {""} ;
      P02G32_A1199MacCod = new int[1] ;
      P02G32_A1203MacBarCod = new int[1] ;
      P02G32_A1204MacBarReo = new byte[1] ;
      P02G32_A1205MacBarPar = new String[] {""} ;
      P02G32_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmachde__default(),
         new Object[] {
             new Object[] {
            P02G32_A396EmprCod, P02G32_A1199MacCod, P02G32_A1203MacBarCod, P02G32_A1204MacBarReo, P02G32_A1205MacBarPar, P02G32_A1201MacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12barCodreo ;
   private byte AV9Err_hdr ;
   private byte A1204MacBarReo ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int AV10MacCod ;
   private int AV11BarCod ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private String A396EmprCod ;
   private String AV13barcodpar ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02G32_A396EmprCod ;
   private int[] P02G32_A1199MacCod ;
   private int[] P02G32_A1203MacBarCod ;
   private byte[] P02G32_A1204MacBarReo ;
   private String[] P02G32_A1205MacBarPar ;
   private short[] P02G32_A1201MacLin ;
}

final  class pmachde__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02G32", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? and MacBarCod = ? and MacBarReo = ? and MacBarPar = ? ORDER BY EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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

