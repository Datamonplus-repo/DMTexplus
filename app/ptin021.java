package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptin021 extends GXProcedure
{
   public ptin021( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptin021.class ), "" );
   }

   public ptin021( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 )
   {
      ptin021.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      ptin021.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      ptin021.this.AV9Clicod = aP1[0];
      this.aP1 = aP1;
      ptin021.this.AV10Forser = aP2[0];
      this.aP2 = aP2;
      ptin021.this.AV11Forcolnom = aP3[0];
      this.aP3 = aP3;
      ptin021.this.AV12Forcolnum = aP4[0];
      this.aP4 = aP4;
      ptin021.this.AV13TipColcod = aP5[0];
      this.aP5 = aP5;
      ptin021.this.AV14Existe = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Existe = (byte)(0) ;
      AV13TipColcod = (byte)(10) ;
      /* Using cursor P02YC2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9Clicod), AV10Forser, AV11Forcolnom, Integer.valueOf(AV12Forcolnum), Byte.valueOf(AV13TipColcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02YC2_A831TipColCod[0] ;
         A483ForColNum = P02YC2_A483ForColNum[0] ;
         A482ForColNom = P02YC2_A482ForColNom[0] ;
         A494ForSer = P02YC2_A494ForSer[0] ;
         A252CliCod = P02YC2_A252CliCod[0] ;
         A396EmprCod = P02YC2_A396EmprCod[0] ;
         AV14Existe = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptin021.this.AV8Emprcod;
      this.aP1[0] = ptin021.this.AV9Clicod;
      this.aP2[0] = ptin021.this.AV10Forser;
      this.aP3[0] = ptin021.this.AV11Forcolnom;
      this.aP4[0] = ptin021.this.AV12Forcolnum;
      this.aP5[0] = ptin021.this.AV13TipColcod;
      this.aP6[0] = ptin021.this.AV14Existe;
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
      P02YC2_A831TipColCod = new byte[1] ;
      P02YC2_A483ForColNum = new int[1] ;
      P02YC2_A482ForColNom = new String[] {""} ;
      P02YC2_A494ForSer = new String[] {""} ;
      P02YC2_A252CliCod = new int[1] ;
      P02YC2_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptin021__default(),
         new Object[] {
             new Object[] {
            P02YC2_A831TipColCod, P02YC2_A483ForColNum, P02YC2_A482ForColNom, P02YC2_A494ForSer, P02YC2_A252CliCod, P02YC2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13TipColcod ;
   private byte AV14Existe ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int AV12Forcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV8Emprcod ;
   private String AV10Forser ;
   private String AV11Forcolnom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P02YC2_A831TipColCod ;
   private int[] P02YC2_A483ForColNum ;
   private String[] P02YC2_A482ForColNom ;
   private String[] P02YC2_A494ForSer ;
   private int[] P02YC2_A252CliCod ;
   private String[] P02YC2_A396EmprCod ;
}

final  class ptin021__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YC2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

