package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcompie extends GXProcedure
{
   public pcompie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcompie.class ), "" );
   }

   public pcompie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pcompie.this.aP2 = new byte[] {0};
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
      pcompie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcompie.this.A360DisCliNum = aP1[0];
      this.aP1 = aP1;
      pcompie.this.AV15Ok = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18GXLvl1 = (byte)(0) ;
      /* Using cursor P005S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A360DisCliNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P005S2_A361DisCod[0] ;
         AV18GXLvl1 = (byte)(1) ;
         AV15Ok = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18GXLvl1 == 0 )
      {
         AV15Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcompie.this.A396EmprCod;
      this.aP1[0] = pcompie.this.A360DisCliNum;
      this.aP2[0] = pcompie.this.AV15Ok;
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
      P005S2_A396EmprCod = new String[] {""} ;
      P005S2_A360DisCliNum = new String[] {""} ;
      P005S2_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcompie__default(),
         new Object[] {
             new Object[] {
            P005S2_A396EmprCod, P005S2_A360DisCliNum, P005S2_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Ok ;
   private byte AV18GXLvl1 ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A360DisCliNum ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P005S2_A396EmprCod ;
   private String[] P005S2_A360DisCliNum ;
   private int[] P005S2_A361DisCod ;
}

final  class pcompie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005S2", "SELECT * FROM (SELECT EmprCod, DisCliNum, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCliNum = ? ORDER BY EmprCod, DisCliNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

