package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puti017 extends GXProcedure
{
   public puti017( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puti017.class ), "" );
   }

   public puti017( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 )
   {
      puti017.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        long[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 ,
                             String[] aP4 )
   {
      puti017.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puti017.this.A810RecFec = aP1[0];
      this.aP1 = aP1;
      puti017.this.AV10Prdnum = aP2[0];
      this.aP2 = aP2;
      puti017.this.AV11CCstklin = aP3[0];
      this.aP3 = aP3;
      puti017.this.AV8HreLote = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P05232 */
      pr_default.execute(0, new Object[] {AV8HreLote, A396EmprCod, AV10Prdnum, A810RecFec});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
      /* End optimized UPDATE. */
      /* Optimized UPDATE. */
      /* Using cursor P05233 */
      pr_default.execute(1, new Object[] {AV8HreLote, A396EmprCod, AV10Prdnum, Long.valueOf(AV11CCstklin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = puti017.this.A396EmprCod;
      this.aP1[0] = puti017.this.A810RecFec;
      this.aP2[0] = puti017.this.AV10Prdnum;
      this.aP3[0] = puti017.this.AV11CCstklin;
      this.aP4[0] = puti017.this.AV8HreLote;
      Application.commitDataStores(context, remoteHandle, pr_default, "puti017");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A5722CCStkLot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puti017__default(),
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

   private short Gx_err ;
   private long AV11CCstklin ;
   private String A396EmprCod ;
   private String AV10Prdnum ;
   private String AV8HreLote ;
   private String A5722CCStkLot ;
   private java.util.Date A810RecFec ;
   private String[] aP4 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private long[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class puti017__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05232", "UPDATE TXPRECUEN SET RecLot=RTRIM(LTRIM(SUBSTR(?, 1, 20)))  WHERE EmprCod = ? and PrdNum = ? and RecFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECUEN")
         ,new UpdateCursor("P05233", "UPDATE TXPCCSTKS SET CCStkLot=?  WHERE EmprCod = ? and PrdNum = ? and CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               stmt.setDate(4, (java.util.Date)parms[3]);
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

