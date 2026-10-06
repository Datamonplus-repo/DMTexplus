package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens001 extends GXProcedure
{
   public pens001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens001.class ), "" );
   }

   public pens001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pens001.this.aP2 = new byte[] {0};
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
      pens001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens001.this.A764ProForCod = aP1[0];
      this.aP1 = aP1;
      pens001.this.AV8F_cprofo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8F_cprofo = (byte)(0) ;
      /* Using cursor P01T42 */
      pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8F_cprofo = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens001.this.A396EmprCod;
      this.aP1[0] = pens001.this.A764ProForCod;
      this.aP2[0] = pens001.this.AV8F_cprofo;
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
      P01T42_A396EmprCod = new String[] {""} ;
      P01T42_A764ProForCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens001__default(),
         new Object[] {
             new Object[] {
            P01T42_A396EmprCod, P01T42_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8F_cprofo ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01T42_A396EmprCod ;
   private String[] P01T42_A764ProForCod ;
}

final  class pens001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01T42", "SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

