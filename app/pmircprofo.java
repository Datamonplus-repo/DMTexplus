package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmircprofo extends GXProcedure
{
   public pmircprofo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmircprofo.class ), "" );
   }

   public pmircprofo( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pmircprofo.this.aP2 = new byte[] {0};
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
      pmircprofo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmircprofo.this.AV8proforcod = aP1[0];
      this.aP1 = aP1;
      pmircprofo.this.AV9enc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9enc = (byte)(0) ;
      AV10t = httpContext.getMessage( "NO encontrado", "") ;
      /* Using cursor P04RO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8proforcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P04RO2_A764ProForCod[0] ;
         AV9enc = (byte)(1) ;
         AV10t = httpContext.getMessage( "SI encontrado", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmircprofo.this.A396EmprCod;
      this.aP1[0] = pmircprofo.this.AV8proforcod;
      this.aP2[0] = pmircprofo.this.AV9enc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10t = "" ;
      scmdbuf = "" ;
      P04RO2_A396EmprCod = new String[] {""} ;
      P04RO2_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmircprofo__default(),
         new Object[] {
             new Object[] {
            P04RO2_A396EmprCod, P04RO2_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9enc ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8proforcod ;
   private String AV10t ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04RO2_A396EmprCod ;
   private String[] P04RO2_A764ProForCod ;
}

final  class pmircprofo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04RO2", "SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

