package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppesfor extends GXProcedure
{
   public ppesfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppesfor.class ), "" );
   }

   public ppesfor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      ppesfor.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      ppesfor.this.AV16ForClaCod = aP0[0];
      this.aP0 = aP0;
      ppesfor.this.AV17ForClaFor = aP1[0];
      this.aP1 = aP1;
      ppesfor.this.AV15Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P02VC2 */
      pr_default.execute(0, new Object[] {AV16ForClaCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7373ForClaCod = P02VC2_A7373ForClaCod[0] ;
         A7375ForClaFor = P02VC2_A7375ForClaFor[0] ;
         n7375ForClaFor = P02VC2_n7375ForClaFor[0] ;
         AV17ForClaFor = A7375ForClaFor ;
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppesfor.this.AV16ForClaCod;
      this.aP1[0] = ppesfor.this.AV17ForClaFor;
      this.aP2[0] = ppesfor.this.AV15Flag;
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
      P02VC2_A7373ForClaCod = new String[] {""} ;
      P02VC2_A7375ForClaFor = new String[] {""} ;
      P02VC2_n7375ForClaFor = new boolean[] {false} ;
      A7373ForClaCod = "" ;
      A7375ForClaFor = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppesfor__default(),
         new Object[] {
             new Object[] {
            P02VC2_A7373ForClaCod, P02VC2_A7375ForClaFor, P02VC2_n7375ForClaFor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private String AV16ForClaCod ;
   private String AV17ForClaFor ;
   private String scmdbuf ;
   private String A7373ForClaCod ;
   private String A7375ForClaFor ;
   private boolean n7375ForClaFor ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02VC2_A7373ForClaCod ;
   private String[] P02VC2_A7375ForClaFor ;
   private boolean[] P02VC2_n7375ForClaFor ;
}

final  class ppesfor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VC2", "SELECT ForClaCod, ForClaFor FROM TXPForCla WHERE ForClaCod = ? ORDER BY ForClaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
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
               stmt.setString(1, (String)parms[0], 2);
               return;
      }
   }

}

