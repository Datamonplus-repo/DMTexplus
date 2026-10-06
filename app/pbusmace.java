package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmace extends GXProcedure
{
   public pbusmace( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmace.class ), "" );
   }

   public pbusmace( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 )
   {
      pbusmace.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 )
   {
      pbusmace.this.A396EmprCod = aP0;
      pbusmace.this.AV11MacBarCod = aP1;
      pbusmace.this.AV12Macbarreo = aP2;
      pbusmace.this.AV13Macbarpar = aP3;
      pbusmace.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10MacCod = 0 ;
      /* Using cursor P02JH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11MacBarCod), Byte.valueOf(AV12Macbarreo), AV13Macbarpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1203MacBarCod = P02JH2_A1203MacBarCod[0] ;
         A1204MacBarReo = P02JH2_A1204MacBarReo[0] ;
         A1205MacBarPar = P02JH2_A1205MacBarPar[0] ;
         A1199MacCod = P02JH2_A1199MacCod[0] ;
         A1201MacLin = P02JH2_A1201MacLin[0] ;
         AV10MacCod = A1199MacCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pbusmace.this.AV10MacCod;
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
      P02JH2_A396EmprCod = new String[] {""} ;
      P02JH2_A1203MacBarCod = new int[1] ;
      P02JH2_A1204MacBarReo = new byte[1] ;
      P02JH2_A1205MacBarPar = new String[] {""} ;
      P02JH2_A1199MacCod = new int[1] ;
      P02JH2_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmace__default(),
         new Object[] {
             new Object[] {
            P02JH2_A396EmprCod, P02JH2_A1203MacBarCod, P02JH2_A1204MacBarReo, P02JH2_A1205MacBarPar, P02JH2_A1199MacCod, P02JH2_A1201MacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Macbarreo ;
   private byte A1204MacBarReo ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int AV11MacBarCod ;
   private int AV10MacCod ;
   private int A1203MacBarCod ;
   private int A1199MacCod ;
   private String A396EmprCod ;
   private String AV13Macbarpar ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02JH2_A396EmprCod ;
   private int[] P02JH2_A1203MacBarCod ;
   private byte[] P02JH2_A1204MacBarReo ;
   private String[] P02JH2_A1205MacBarPar ;
   private int[] P02JH2_A1199MacCod ;
   private short[] P02JH2_A1201MacLin ;
}

final  class pbusmace__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02JH2", "SELECT EmprCod, MacBarCod, MacBarReo, MacBarPar, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacBarCod = ? and MacBarReo = ? and MacBarPar = ? ORDER BY EmprCod, MacBarCod, MacBarReo, MacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

