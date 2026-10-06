package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxroeac extends GXProcedure
{
   public pvxroeac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxroeac.class ), "" );
   }

   public pvxroeac( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 )
   {
      pvxroeac.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             byte[] aP1 )
   {
      pvxroeac.this.AV11BarPieCod = aP0;
      pvxroeac.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12VxLotId = (int)(GXutil.lval( AV11BarPieCod)) ;
      AV13PasoaTXP = (byte)(0) ;
      /* Using cursor P05W02 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV12VxLotId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6224VxLotId = P05W02_A6224VxLotId[0] ;
         A12720VxStMTMov = P05W02_A12720VxStMTMov[0] ;
         n12720VxStMTMov = P05W02_n12720VxStMTMov[0] ;
         A12730VxStMFec = P05W02_A12730VxStMFec[0] ;
         if ( GXutil.strcmp(A12720VxStMTMov, httpContext.getMessage( "EAC", "")) == 0 )
         {
            AV13PasoaTXP = (byte)(1) ;
         }
         if ( GXutil.strcmp(A12720VxStMTMov, httpContext.getMessage( "BAC", "")) == 0 )
         {
            AV13PasoaTXP = (byte)(0) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pvxroeac.this.AV13PasoaTXP;
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
      P05W02_A6224VxLotId = new int[1] ;
      P05W02_A12720VxStMTMov = new String[] {""} ;
      P05W02_n12720VxStMTMov = new boolean[] {false} ;
      P05W02_A12730VxStMFec = new java.util.Date[] {GXutil.nullDate()} ;
      A12720VxStMTMov = "" ;
      A12730VxStMFec = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxroeac__default(),
         new Object[] {
             new Object[] {
            P05W02_A6224VxLotId, P05W02_A12720VxStMTMov, P05W02_n12720VxStMTMov, P05W02_A12730VxStMFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13PasoaTXP ;
   private short Gx_err ;
   private int AV12VxLotId ;
   private int A6224VxLotId ;
   private String AV11BarPieCod ;
   private String scmdbuf ;
   private String A12720VxStMTMov ;
   private java.util.Date A12730VxStMFec ;
   private boolean n12720VxStMTMov ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P05W02_A6224VxLotId ;
   private String[] P05W02_A12720VxStMTMov ;
   private boolean[] P05W02_n12720VxStMTMov ;
   private java.util.Date[] P05W02_A12730VxStMFec ;
}

final  class pvxroeac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05W02", "SELECT SteLotId, SteMTMov, SteMFec FROM VTXSTKTEMOV WHERE SteLotId = ? ORDER BY SteLotId, SteMFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

