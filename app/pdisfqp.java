package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisfqp extends GXProcedure
{
   public pdisfqp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisfqp.class ), "" );
   }

   public pdisfqp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 )
   {
      pdisfqp.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      pdisfqp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisfqp.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisfqp.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      pdisfqp.this.A368DisFasLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02JB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5376DisQuiUl = P02JB2_A5376DisQuiUl[0] ;
         AV8DISQUIUL = (short)(0) ;
         /* Optimized group. */
         /* Using cursor P02JB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         cV8DISQUIUL = P02JB3_AV8DISQUIUL[0] ;
         pr_default.close(1);
         AV8DISQUIUL = (short)(AV8DISQUIUL+cV8DISQUIUL*1) ;
         /* End optimized group. */
         A5376DisQuiUl = AV8DISQUIUL ;
         /* Using cursor P02JB4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A5376DisQuiUl), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisfqp.this.A396EmprCod;
      this.aP1[0] = pdisfqp.this.A361DisCod;
      this.aP2[0] = pdisfqp.this.A758ProCod;
      this.aP3[0] = pdisfqp.this.A368DisFasLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisfqp");
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
      P02JB2_A396EmprCod = new String[] {""} ;
      P02JB2_A361DisCod = new int[1] ;
      P02JB2_A758ProCod = new String[] {""} ;
      P02JB2_A368DisFasLin = new short[1] ;
      P02JB2_A5376DisQuiUl = new short[1] ;
      P02JB3_AV8DISQUIUL = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisfqp__default(),
         new Object[] {
             new Object[] {
            P02JB2_A396EmprCod, P02JB2_A361DisCod, P02JB2_A758ProCod, P02JB2_A368DisFasLin, P02JB2_A5376DisQuiUl
            }
            , new Object[] {
            P02JB3_AV8DISQUIUL
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A368DisFasLin ;
   private short A5376DisQuiUl ;
   private short AV8DISQUIUL ;
   private short cV8DISQUIUL ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02JB2_A396EmprCod ;
   private int[] P02JB2_A361DisCod ;
   private String[] P02JB2_A758ProCod ;
   private short[] P02JB2_A368DisFasLin ;
   private short[] P02JB2_A5376DisQuiUl ;
   private short[] P02JB3_AV8DISQUIUL ;
}

final  class pdisfqp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02JB2", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiUl FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JB3", "SELECT COUNT(*) FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02JB4", "UPDATE TXPDISFAS SET DisQuiUl=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

