package app.asyncbatch ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class jobdelete extends GXProcedure
{
   public jobdelete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( jobdelete.class ), "" );
   }

   public jobdelete( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( java.util.UUID aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.UUID aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      jobdelete.this.AV8JobId = aP0;
      jobdelete.this.AV9EmprCod = aP1;
      jobdelete.this.AV10UsurCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0APO2 */
      pr_default.execute(0, new Object[] {AV8JobId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14423JobId = P0APO2_A14423JobId[0] ;
         A14474OutFile = P0APO2_A14474OutFile[0] ;
         n14474OutFile = P0APO2_n14474OutFile[0] ;
         A14468ItmId = P0APO2_A14468ItmId[0] ;
         AV11File.setSource( A14474OutFile );
         AV11File.delete();
         AV11File.close();
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P0APO3 */
      pr_default.execute(1, new Object[] {AV8JobId});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P0APO4 */
      pr_default.execute(2, new Object[] {AV8JobId});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBPAR");
      /* End optimized DELETE. */
      /* Using cursor P0APO5 */
      pr_default.execute(3, new Object[] {AV8JobId});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14423JobId = P0APO5_A14423JobId[0] ;
         A14463ZipPath = P0APO5_A14463ZipPath[0] ;
         n14463ZipPath = P0APO5_n14463ZipPath[0] ;
         AV11File.setSource( A14463ZipPath );
         AV11File.delete();
         AV11File.close();
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Optimized DELETE. */
      /* Using cursor P0APO6 */
      pr_default.execute(4, new Object[] {AV8JobId});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "asyncbatch.jobdelete");
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
      P0APO2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0APO2_A14474OutFile = new String[] {""} ;
      P0APO2_n14474OutFile = new boolean[] {false} ;
      P0APO2_A14468ItmId = new long[1] ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14474OutFile = "" ;
      AV11File = new com.genexus.util.GXFile();
      P0APO5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0APO5_A14463ZipPath = new String[] {""} ;
      P0APO5_n14463ZipPath = new boolean[] {false} ;
      A14463ZipPath = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobdelete__default(),
         new Object[] {
             new Object[] {
            P0APO2_A14423JobId, P0APO2_A14474OutFile, P0APO2_n14474OutFile, P0APO2_A14468ItmId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0APO5_A14423JobId, P0APO5_A14463ZipPath, P0APO5_n14463ZipPath
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A14468ItmId ;
   private String AV9EmprCod ;
   private String AV10UsurCod ;
   private String scmdbuf ;
   private boolean n14474OutFile ;
   private boolean n14463ZipPath ;
   private String A14474OutFile ;
   private String A14463ZipPath ;
   private java.util.UUID AV8JobId ;
   private java.util.UUID A14423JobId ;
   private com.genexus.util.GXFile AV11File ;
   private IDataStoreProvider pr_default ;
   private java.util.UUID[] P0APO2_A14423JobId ;
   private String[] P0APO2_A14474OutFile ;
   private boolean[] P0APO2_n14474OutFile ;
   private long[] P0APO2_A14468ItmId ;
   private java.util.UUID[] P0APO5_A14423JobId ;
   private String[] P0APO5_A14463ZipPath ;
   private boolean[] P0APO5_n14463ZipPath ;
}

final  class jobdelete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APO2", "SELECT JobId, OutFile, ItmId FROM TXPJOBITE WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0APO3", "DELETE FROM TXPJOBITE  WHERE JobId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOBITE")
         ,new UpdateCursor("P0APO4", "DELETE FROM TXPJOBPAR  WHERE JobId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOBPAR")
         ,new ForEachCursor("P0APO5", "SELECT JobId, ZipPath FROM TXPJOB WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0APO6", "DELETE FROM TXPJOB  WHERE JobId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOB")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3);
               return;
            case 3 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 2 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 3 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 4 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

