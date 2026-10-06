package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinvprdd extends GXProcedure
{
   public pinvprdd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinvprdd.class ), "" );
   }

   public pinvprdd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 ,
                           int[] aP4 )
   {
      pinvprdd.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pinvprdd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinvprdd.this.AV15PProd = aP1[0];
      this.aP1 = aP1;
      pinvprdd.this.AV16UProd = aP2[0];
      this.aP2 = aP2;
      pinvprdd.this.AV17PProv = aP3[0];
      this.aP3 = aP3;
      pinvprdd.this.AV18UProv = aP4[0];
      this.aP4 = aP4;
      pinvprdd.this.AV19FlagStk = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "PINVPRDd.Inicio", "") );
      /* Optimized DELETE. */
      /* Using cursor P03JS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15PProd, AV16UProd});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVPRD");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P03JS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV15PProd, AV16UProd});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P03JS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV15PProd, AV16UProd});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVALM");
      /* End optimized DELETE. */
      System.out.println( httpContext.getMessage( "PINVPRDd.Fin", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinvprdd.this.A396EmprCod;
      this.aP1[0] = pinvprdd.this.AV15PProd;
      this.aP2[0] = pinvprdd.this.AV16UProd;
      this.aP3[0] = pinvprdd.this.AV17PProv;
      this.aP4[0] = pinvprdd.this.AV18UProv;
      this.aP5[0] = pinvprdd.this.AV19FlagStk;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinvprdd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinvprdd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19FlagStk ;
   private short Gx_err ;
   private int AV17PProv ;
   private int AV18UProv ;
   private String A396EmprCod ;
   private String AV15PProd ;
   private String AV16UProd ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pinvprdd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03JS2", "DELETE FROM TXPINVPRD  WHERE (EmprCod = ? and PrdNum >= ?) AND (RecInvSt = 0) AND (PrdNum <= ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVPRD")
         ,new UpdateCursor("P03JS3", "DELETE FROM TXPRECALM  WHERE (EmprCod = ? and PrdNum >= ?) AND (CC_Estado = 0) AND (PrdNum <= ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECALM")
         ,new UpdateCursor("P03JS4", "DELETE FROM TXPINVALM  WHERE (EmprCod = ? and PrdNum >= ?) AND (Inv_Status = 0) AND (PrdNum <= ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVALM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

