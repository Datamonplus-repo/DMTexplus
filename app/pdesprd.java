package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdesprd extends GXProcedure
{
   public pdesprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdesprd.class ), "" );
   }

   public pdesprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pdesprd.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pdesprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdesprd.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pdesprd.this.AV15PrdComDsc = aP2[0];
      this.aP2 = aP2;
      pdesprd.this.AV16Flag = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Flag = (byte)(0) ;
      /* Using cursor P007B2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A718PrdNom = P007B2_A718PrdNom[0] ;
         AV16Flag = (byte)(1) ;
         AV15PrdComDsc = A718PrdNom ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdesprd.this.A396EmprCod;
      this.aP1[0] = pdesprd.this.A719PrdNum;
      this.aP2[0] = pdesprd.this.AV15PrdComDsc;
      this.aP3[0] = pdesprd.this.AV16Flag;
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
      P007B2_A396EmprCod = new String[] {""} ;
      P007B2_A719PrdNum = new String[] {""} ;
      P007B2_A718PrdNom = new String[] {""} ;
      A718PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdesprd__default(),
         new Object[] {
             new Object[] {
            P007B2_A396EmprCod, P007B2_A719PrdNum, P007B2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV15PrdComDsc ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P007B2_A396EmprCod ;
   private String[] P007B2_A719PrdNum ;
   private String[] P007B2_A718PrdNom ;
}

final  class pdesprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007B2", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE (EmprCod = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
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
               return;
      }
   }

}

