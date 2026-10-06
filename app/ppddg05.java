package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg05 extends GXProcedure
{
   public ppddg05( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg05.class ), "" );
   }

   public ppddg05( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 )
   {
      ppddg05.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 )
   {
      ppddg05.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg05.this.AV15ProCod = aP1[0];
      this.aP1 = aP1;
      ppddg05.this.AV19PedDGId = aP2[0];
      this.aP2 = aP2;
      ppddg05.this.AV16DisFasLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05P32 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV19PedDGId), AV15ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P05P32_A758ProCod[0] ;
         A13026PedDGId = P05P32_A13026PedDGId[0] ;
         A396EmprCod = P05P32_A396EmprCod[0] ;
         A13044PedDGUltFa = P05P32_A13044PedDGUltFa[0] ;
         if ( ( A13044PedDGUltFa + 100 ) <= 9900 )
         {
            A13044PedDGUltFa = (short)(A13044PedDGUltFa+100) ;
            AV16DisFasLin = A13044PedDGUltFa ;
         }
         else
         {
            AV16DisFasLin = (short)(9999) ;
         }
         /* Using cursor P05P33 */
         pr_default.execute(1, new Object[] {Short.valueOf(A13044PedDGUltFa), A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG4");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg05.this.AV17EmprCod;
      this.aP1[0] = ppddg05.this.AV15ProCod;
      this.aP2[0] = ppddg05.this.AV19PedDGId;
      this.aP3[0] = ppddg05.this.AV16DisFasLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppddg05");
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
      P05P32_A758ProCod = new String[] {""} ;
      P05P32_A13026PedDGId = new int[1] ;
      P05P32_A396EmprCod = new String[] {""} ;
      P05P32_A13044PedDGUltFa = new short[1] ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg05__default(),
         new Object[] {
             new Object[] {
            P05P32_A758ProCod, P05P32_A13026PedDGId, P05P32_A396EmprCod, P05P32_A13044PedDGUltFa
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16DisFasLin ;
   private short A13044PedDGUltFa ;
   private short Gx_err ;
   private int AV19PedDGId ;
   private int A13026PedDGId ;
   private String AV17EmprCod ;
   private String AV15ProCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P32_A758ProCod ;
   private int[] P05P32_A13026PedDGId ;
   private String[] P05P32_A396EmprCod ;
   private short[] P05P32_A13044PedDGUltFa ;
}

final  class ppddg05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P32", "SELECT ProCod, PedDGId, EmprCod, PedDGUltFa FROM TXPPEDDG4 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? ORDER BY EmprCod, PedDGId, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05P33", "UPDATE TXPPEDDG4 SET PedDGUltFa=?  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG4")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

