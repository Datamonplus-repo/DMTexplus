package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plxpda extends GXProcedure
{
   public plxpda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plxpda.class ), "" );
   }

   public plxpda( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          short[] aP5 ,
                          String[] aP6 )
   {
      plxpda.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      plxpda.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plxpda.this.A4771XHdr = aP1[0];
      this.aP1 = aP1;
      plxpda.this.A4772XHdrr = aP2[0];
      this.aP2 = aP2;
      plxpda.this.A4773XHdrp = aP3[0];
      this.aP3 = aP3;
      plxpda.this.A4774XProCod = aP4[0];
      this.aP4 = aP4;
      plxpda.this.A4775XOrden = aP5[0];
      this.aP5 = aP5;
      plxpda.this.A4777XMaqCod = aP6[0];
      this.aP6 = aP6;
      plxpda.this.AV16XNumPda = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P024L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4771XHdr), Byte.valueOf(A4772XHdrr), A4773XHdrp, A4774XProCod, Short.valueOf(A4775XOrden), A4777XMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4778XNumPdaU = P024L2_A4778XNumPdaU[0] ;
         n4778XNumPdaU = P024L2_n4778XNumPdaU[0] ;
         if ( ( A4778XNumPdaU + 1 ) <= 999999 )
         {
            A4778XNumPdaU = (int)(A4778XNumPdaU+1) ;
            n4778XNumPdaU = false ;
            AV16XNumPda = A4778XNumPdaU ;
         }
         else
         {
            AV16XNumPda = 999999 ;
         }
         /* Using cursor P024L3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4778XNumPdaU), Integer.valueOf(A4778XNumPdaU), A396EmprCod, Integer.valueOf(A4771XHdr), Byte.valueOf(A4772XHdrr), A4773XHdrp, A4774XProCod, Short.valueOf(A4775XOrden), A4777XMaqCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXPDAF2");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plxpda.this.A396EmprCod;
      this.aP1[0] = plxpda.this.A4771XHdr;
      this.aP2[0] = plxpda.this.A4772XHdrr;
      this.aP3[0] = plxpda.this.A4773XHdrp;
      this.aP4[0] = plxpda.this.A4774XProCod;
      this.aP5[0] = plxpda.this.A4775XOrden;
      this.aP6[0] = plxpda.this.A4777XMaqCod;
      this.aP7[0] = plxpda.this.AV16XNumPda;
      Application.commitDataStores(context, remoteHandle, pr_default, "plxpda");
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
      P024L2_A396EmprCod = new String[] {""} ;
      P024L2_A4771XHdr = new int[1] ;
      P024L2_A4772XHdrr = new byte[1] ;
      P024L2_A4773XHdrp = new String[] {""} ;
      P024L2_A4774XProCod = new String[] {""} ;
      P024L2_A4775XOrden = new short[1] ;
      P024L2_A4777XMaqCod = new String[] {""} ;
      P024L2_A4778XNumPdaU = new int[1] ;
      P024L2_n4778XNumPdaU = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plxpda__default(),
         new Object[] {
             new Object[] {
            P024L2_A396EmprCod, P024L2_A4771XHdr, P024L2_A4772XHdrr, P024L2_A4773XHdrp, P024L2_A4774XProCod, P024L2_A4775XOrden, P024L2_A4777XMaqCod, P024L2_A4778XNumPdaU, P024L2_n4778XNumPdaU
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4772XHdrr ;
   private short A4775XOrden ;
   private short Gx_err ;
   private int A4771XHdr ;
   private int AV16XNumPda ;
   private int A4778XNumPdaU ;
   private String A396EmprCod ;
   private String A4773XHdrp ;
   private String A4774XProCod ;
   private String A4777XMaqCod ;
   private String scmdbuf ;
   private boolean n4778XNumPdaU ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P024L2_A396EmprCod ;
   private int[] P024L2_A4771XHdr ;
   private byte[] P024L2_A4772XHdrr ;
   private String[] P024L2_A4773XHdrp ;
   private String[] P024L2_A4774XProCod ;
   private short[] P024L2_A4775XOrden ;
   private String[] P024L2_A4777XMaqCod ;
   private int[] P024L2_A4778XNumPdaU ;
   private boolean[] P024L2_n4778XNumPdaU ;
}

final  class plxpda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024L2", "SELECT EmprCod, XHdr, XHdrr, XHdrp, XProCod, XOrden, XMaqCod, XNumPdaU FROM TXPXPDAF2 WHERE EmprCod = ? and XHdr = ? and XHdrr = ? and XHdrp = ? and XProCod = ? and XOrden = ? and XMaqCod = ? ORDER BY EmprCod, XHdr, XHdrr, XHdrp, XProCod, XOrden, XMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P024L3", "UPDATE TXPXPDAF2 SET XNumPdaU=?  WHERE EmprCod = ? AND XHdr = ? AND XHdrr = ? AND XHdrp = ? AND XProCod = ? AND XOrden = ? AND XMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXPDAF2")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 6);
               return;
      }
   }

}

