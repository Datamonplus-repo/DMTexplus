package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexprograma extends GXProcedure
{
   public pexprograma( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexprograma.class ), "" );
   }

   public pexprograma( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pexprograma.this.aP2 = new byte[] {0};
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
      pexprograma.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexprograma.this.AV8MacProCod = aP1[0];
      this.aP1 = aP1;
      pexprograma.this.AV9Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Flag = (byte)(0) ;
      /* Using cursor P062Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8MacProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1514MacProCod = P062Q2_A1514MacProCod[0] ;
         AV9Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexprograma.this.A396EmprCod;
      this.aP1[0] = pexprograma.this.AV8MacProCod;
      this.aP2[0] = pexprograma.this.AV9Flag;
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
      P062Q2_A396EmprCod = new String[] {""} ;
      P062Q2_A1514MacProCod = new String[] {""} ;
      A1514MacProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexprograma__default(),
         new Object[] {
             new Object[] {
            P062Q2_A396EmprCod, P062Q2_A1514MacProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8MacProCod ;
   private String scmdbuf ;
   private String A1514MacProCod ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P062Q2_A396EmprCod ;
   private String[] P062Q2_A1514MacProCod ;
}

final  class pexprograma__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P062Q2", "SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

