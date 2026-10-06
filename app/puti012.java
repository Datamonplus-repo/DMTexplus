package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puti012 extends GXProcedure
{
   public puti012( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puti012.class ), "" );
   }

   public puti012( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 )
   {
      puti012.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        long[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 ,
                             String[] aP4 )
   {
      puti012.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puti012.this.A597LinEnt = aP1[0];
      this.aP1 = aP1;
      puti012.this.AV10Prdnum = aP2[0];
      this.aP2 = aP2;
      puti012.this.AV11CCstklin = aP3[0];
      this.aP3 = aP3;
      puti012.this.AV8HreLote = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P051Y2 */
      pr_default.execute(0, new Object[] {AV8HreLote, A396EmprCod, AV10Prdnum, Short.valueOf(A597LinEnt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
      /* End optimized UPDATE. */
      /* Optimized UPDATE. */
      /* Using cursor P051Y3 */
      pr_default.execute(1, new Object[] {AV8HreLote, A396EmprCod, AV10Prdnum, Long.valueOf(AV11CCstklin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = puti012.this.A396EmprCod;
      this.aP1[0] = puti012.this.A597LinEnt;
      this.aP2[0] = puti012.this.AV10Prdnum;
      this.aP3[0] = puti012.this.AV11CCstklin;
      this.aP4[0] = puti012.this.AV8HreLote;
      Application.commitDataStores(context, remoteHandle, pr_default, "puti012");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A5686EntLotN = "" ;
      A5722CCStkLot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puti012__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A597LinEnt ;
   private short Gx_err ;
   private long AV11CCstklin ;
   private String A396EmprCod ;
   private String AV10Prdnum ;
   private String AV8HreLote ;
   private String A5686EntLotN ;
   private String A5722CCStkLot ;
   private String[] aP4 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private long[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class puti012__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P051Y2", "UPDATE TXPENTALM SET EntLotN=?  WHERE EmprCod = ? and PrdNum = ? and LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P051Y3", "UPDATE TXPCCSTKS SET CCStkLot=?  WHERE EmprCod = ? and PrdNum = ? and CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

