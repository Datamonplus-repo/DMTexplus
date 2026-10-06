package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchkcolcc extends GXProcedure
{
   public pchkcolcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchkcolcc.class ), "" );
   }

   public pchkcolcc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 ,
                           String aP3 ,
                           int aP4 ,
                           byte aP5 )
   {
      pchkcolcc.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             byte[] aP6 )
   {
      pchkcolcc.this.A396EmprCod = aP0;
      pchkcolcc.this.A252CliCod = aP1;
      pchkcolcc.this.AV9ForSer = aP2;
      pchkcolcc.this.AV12ForColNom = aP3;
      pchkcolcc.this.AV10ForColNum = aP4;
      pchkcolcc.this.AV11Tipcolcod = aP5;
      pchkcolcc.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15GXLvl1 = (byte)(0) ;
      /* Using cursor P04U12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV9ForSer, AV9ForSer, AV12ForColNom, AV12ForColNom, Integer.valueOf(AV10ForColNum), Integer.valueOf(AV10ForColNum), Byte.valueOf(AV11Tipcolcod), Byte.valueOf(AV11Tipcolcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P04U12_A831TipColCod[0] ;
         A483ForColNum = P04U12_A483ForColNum[0] ;
         A482ForColNom = P04U12_A482ForColNom[0] ;
         A494ForSer = P04U12_A494ForSer[0] ;
         AV15GXLvl1 = (byte)(1) ;
         AV8Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15GXLvl1 == 0 )
      {
         AV8Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = pchkcolcc.this.AV8Ok;
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
      P04U12_A396EmprCod = new String[] {""} ;
      P04U12_A252CliCod = new int[1] ;
      P04U12_A831TipColCod = new byte[1] ;
      P04U12_A483ForColNum = new int[1] ;
      P04U12_A482ForColNom = new String[] {""} ;
      P04U12_A494ForSer = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchkcolcc__default(),
         new Object[] {
             new Object[] {
            P04U12_A396EmprCod, P04U12_A252CliCod, P04U12_A831TipColCod, P04U12_A483ForColNum, P04U12_A482ForColNom, P04U12_A494ForSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Tipcolcod ;
   private byte AV8Ok ;
   private byte AV15GXLvl1 ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV10ForColNum ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String AV9ForSer ;
   private String AV12ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04U12_A396EmprCod ;
   private int[] P04U12_A252CliCod ;
   private byte[] P04U12_A831TipColCod ;
   private int[] P04U12_A483ForColNum ;
   private String[] P04U12_A482ForColNom ;
   private String[] P04U12_A494ForSer ;
}

final  class pchkcolcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04U12", "SELECT EmprCod, CliCod, TipColCod, ForColNum, ForColNom, ForSer FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ?) AND (ForSer = ? or (rtrim(?) IS NULL)) AND (ForColNom = ? or (rtrim(?) IS NULL)) AND (ForColNum = ? or (? = 0)) AND (TipColCod = ? or (? = 0)) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
      }
   }

}

