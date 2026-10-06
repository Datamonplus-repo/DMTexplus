package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbufedip extends GXProcedure
{
   public pbufedip( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbufedip.class ), "" );
   }

   public pbufedip( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pbufedip.this.aP2 = new byte[] {0};
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
      pbufedip.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbufedip.this.A2107PasCod = aP1[0];
      this.aP1 = aP1;
      pbufedip.this.AV8Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Flag = (byte)(0) ;
      /* Using cursor P04ME2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2107PasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbufedip.this.A396EmprCod;
      this.aP1[0] = pbufedip.this.A2107PasCod;
      this.aP2[0] = pbufedip.this.AV8Flag;
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
      P04ME2_A396EmprCod = new String[] {""} ;
      P04ME2_A2107PasCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbufedip__default(),
         new Object[] {
             new Object[] {
            P04ME2_A396EmprCod, P04ME2_A2107PasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A2107PasCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ME2_A396EmprCod ;
   private String[] P04ME2_A2107PasCod ;
}

final  class pbufedip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ME2", "SELECT EmprCod, PasCod FROM TXPCPASTA WHERE EmprCod = ? and PasCod = ? ORDER BY EmprCod, PasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

