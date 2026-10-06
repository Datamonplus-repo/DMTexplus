package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdispq0 extends GXProcedure
{
   public pdispq0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdispq0.class ), "" );
   }

   public pdispq0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pdispq0.this.aP2 = new byte[] {0};
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
      pdispq0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdispq0.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pdispq0.this.AV8PrdUniCom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PrdUniCom = (byte)(0) ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P050T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A742PrdUniCom = P050T2_A742PrdUniCom[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8PrdUniCom = A742PrdUniCom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8PrdUniCom = (byte)(9) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdispq0.this.A396EmprCod;
      this.aP1[0] = pdispq0.this.A719PrdNum;
      this.aP2[0] = pdispq0.this.AV8PrdUniCom;
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
      P050T2_A396EmprCod = new String[] {""} ;
      P050T2_A719PrdNum = new String[] {""} ;
      P050T2_A742PrdUniCom = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdispq0__default(),
         new Object[] {
             new Object[] {
            P050T2_A396EmprCod, P050T2_A719PrdNum, P050T2_A742PrdUniCom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8PrdUniCom ;
   private byte AV11GXLvl2 ;
   private byte A742PrdUniCom ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P050T2_A396EmprCod ;
   private String[] P050T2_A719PrdNum ;
   private byte[] P050T2_A742PrdUniCom ;
}

final  class pdispq0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P050T2", "SELECT EmprCod, PrdNum, PrdUniCom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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

