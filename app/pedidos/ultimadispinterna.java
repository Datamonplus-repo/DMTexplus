package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ultimadispinterna extends GXProcedure
{
   public ultimadispinterna( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ultimadispinterna.class ), "" );
   }

   public ultimadispinterna( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 )
   {
      ultimadispinterna.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             int[] aP3 )
   {
      ultimadispinterna.this.AV10emprcod = aP0;
      ultimadispinterna.this.AV11discod = aP1;
      ultimadispinterna.this.AV9Pricod = aP2;
      ultimadispinterna.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8anterior_discod = 0 ;
      /* Using cursor P0A292 */
      pr_default.execute(0, new Object[] {AV10emprcod, Integer.valueOf(AV11discod), AV9Pricod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A292_A396EmprCod[0] ;
         A757PriCod = P0A292_A757PriCod[0] ;
         A361DisCod = P0A292_A361DisCod[0] ;
         AV8anterior_discod = A361DisCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = ultimadispinterna.this.AV8anterior_discod;
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
      P0A292_A396EmprCod = new String[] {""} ;
      P0A292_A757PriCod = new String[] {""} ;
      P0A292_A361DisCod = new int[1] ;
      A396EmprCod = "" ;
      A757PriCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.ultimadispinterna__default(),
         new Object[] {
             new Object[] {
            P0A292_A396EmprCod, P0A292_A757PriCod, P0A292_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV11discod ;
   private int AV8anterior_discod ;
   private int A361DisCod ;
   private String AV10emprcod ;
   private String AV9Pricod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A757PriCod ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A292_A396EmprCod ;
   private String[] P0A292_A757PriCod ;
   private int[] P0A292_A361DisCod ;
}

final  class ultimadispinterna__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A292", "SELECT * FROM (SELECT EmprCod, PriCod, DisCod FROM TXPDISPOS WHERE (EmprCod = ? and DisCod < ?) AND (PriCod = ?) ORDER BY EmprCod, DisCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

