package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getdisobsdisobslin extends GXProcedure
{
   public getdisobsdisobslin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getdisobsdisobslin.class ), "" );
   }

   public getdisobsdisobslin( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 )
   {
      getdisobsdisobslin.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte[] aP3 )
   {
      getdisobsdisobslin.this.AV8EmprCod = aP0;
      getdisobsdisobslin.this.AV9DisCod = aP1;
      getdisobsdisobslin.this.AV10BarPri = aP2;
      getdisobsdisobslin.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0ADG2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9DisCod), AV10BarPri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A757PriCod = P0ADG2_A757PriCod[0] ;
         A361DisCod = P0ADG2_A361DisCod[0] ;
         A396EmprCod = P0ADG2_A396EmprCod[0] ;
         A376DisObsLin = P0ADG2_A376DisObsLin[0] ;
         A757PriCod = P0ADG2_A757PriCod[0] ;
         AV11DisObsLin = A376DisObsLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV11DisObsLin = (byte)(AV11DisObsLin+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = getdisobsdisobslin.this.AV11DisObsLin;
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
      P0ADG2_A757PriCod = new String[] {""} ;
      P0ADG2_A361DisCod = new int[1] ;
      P0ADG2_A396EmprCod = new String[] {""} ;
      P0ADG2_A376DisObsLin = new byte[1] ;
      A757PriCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.getdisobsdisobslin__default(),
         new Object[] {
             new Object[] {
            P0ADG2_A757PriCod, P0ADG2_A361DisCod, P0ADG2_A396EmprCod, P0ADG2_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11DisObsLin ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV9DisCod ;
   private int A361DisCod ;
   private String AV8EmprCod ;
   private String AV10BarPri ;
   private String scmdbuf ;
   private String A757PriCod ;
   private String A396EmprCod ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADG2_A757PriCod ;
   private int[] P0ADG2_A361DisCod ;
   private String[] P0ADG2_A396EmprCod ;
   private byte[] P0ADG2_A376DisObsLin ;
}

final  class getdisobsdisobslin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADG2", "SELECT * FROM (SELECT T2.PriCod, T1.DisCod, T1.EmprCod, T1.DisObsLin FROM (TXPOBSERV T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T2.PriCod = ?) ORDER BY T1.EmprCod DESC, T1.DisCod DESC, T1.DisObsLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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

