package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbustico extends GXProcedure
{
   public pbustico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbustico.class ), "" );
   }

   public pbustico( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           byte[] aP1 )
   {
      pbustico.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 )
   {
      pbustico.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbustico.this.AV8TipColCod = aP1[0];
      this.aP1 = aP1;
      pbustico.this.AV9Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Flag = (byte)(0) ;
      /* Using cursor P00WY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(AV8TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P00WY2_A831TipColCod[0] ;
         AV9Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbustico.this.A396EmprCod;
      this.aP1[0] = pbustico.this.AV8TipColCod;
      this.aP2[0] = pbustico.this.AV9Flag;
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
      P00WY2_A396EmprCod = new String[] {""} ;
      P00WY2_A831TipColCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbustico__default(),
         new Object[] {
             new Object[] {
            P00WY2_A396EmprCod, P00WY2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8TipColCod ;
   private byte AV9Flag ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WY2_A396EmprCod ;
   private byte[] P00WY2_A831TipColCod ;
}

final  class pbustico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WY2", "SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

