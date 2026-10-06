package app.asyncbatch ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getjobpar extends GXProcedure
{
   public getjobpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getjobpar.class ), "" );
   }

   public getjobpar( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.UUID aP0 ,
                             String aP1 )
   {
      getjobpar.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.util.UUID aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.UUID aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      getjobpar.this.AV8JobId = aP0;
      getjobpar.this.AV9ParKey = aP1;
      getjobpar.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AOV2 */
      pr_default.execute(0, new Object[] {AV8JobId, AV9ParKey});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14478ParKey = P0AOV2_A14478ParKey[0] ;
         A14423JobId = P0AOV2_A14423JobId[0] ;
         A14479ParVal = P0AOV2_A14479ParVal[0] ;
         n14479ParVal = P0AOV2_n14479ParVal[0] ;
         AV10ParVal = A14479ParVal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = getjobpar.this.AV10ParVal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ParVal = "" ;
      scmdbuf = "" ;
      P0AOV2_A14478ParKey = new String[] {""} ;
      P0AOV2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOV2_A14479ParVal = new String[] {""} ;
      P0AOV2_n14479ParVal = new boolean[] {false} ;
      A14478ParKey = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14479ParVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.getjobpar__default(),
         new Object[] {
             new Object[] {
            P0AOV2_A14478ParKey, P0AOV2_A14423JobId, P0AOV2_A14479ParVal, P0AOV2_n14479ParVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String scmdbuf ;
   private boolean n14479ParVal ;
   private String AV9ParKey ;
   private String AV10ParVal ;
   private String A14478ParKey ;
   private String A14479ParVal ;
   private java.util.UUID AV8JobId ;
   private java.util.UUID A14423JobId ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOV2_A14478ParKey ;
   private java.util.UUID[] P0AOV2_A14423JobId ;
   private String[] P0AOV2_A14479ParVal ;
   private boolean[] P0AOV2_n14479ParVal ;
}

final  class getjobpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOV2", "SELECT ParKey, JobId, ParVal FROM TXPJOBPAR WHERE JobId = ? and ParKey = ? ORDER BY JobId, ParKey ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
      }
   }

}

