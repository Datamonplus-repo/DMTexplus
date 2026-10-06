package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuston extends GXProcedure
{
   public pbuston( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuston.class ), "" );
   }

   public pbuston( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pbuston.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pbuston.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuston.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbuston.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pbuston.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pbuston.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pbuston.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pbuston.this.AV17Tonalidad = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Flag = (byte)(0) ;
      /* Using cursor P00NG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A995ForTonal = P00NG2_A995ForTonal[0] ;
         n995ForTonal = P00NG2_n995ForTonal[0] ;
         AV17Tonalidad = A995ForTonal ;
         AV18Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18Flag == 0 )
      {
         AV17Tonalidad = "" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuston.this.A396EmprCod;
      this.aP1[0] = pbuston.this.A252CliCod;
      this.aP2[0] = pbuston.this.A494ForSer;
      this.aP3[0] = pbuston.this.A482ForColNom;
      this.aP4[0] = pbuston.this.A483ForColNum;
      this.aP5[0] = pbuston.this.A831TipColCod;
      this.aP6[0] = pbuston.this.AV17Tonalidad;
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
      P00NG2_A396EmprCod = new String[] {""} ;
      P00NG2_A252CliCod = new int[1] ;
      P00NG2_A494ForSer = new String[] {""} ;
      P00NG2_A482ForColNom = new String[] {""} ;
      P00NG2_A483ForColNum = new int[1] ;
      P00NG2_A831TipColCod = new byte[1] ;
      P00NG2_A995ForTonal = new String[] {""} ;
      P00NG2_n995ForTonal = new boolean[] {false} ;
      A995ForTonal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuston__default(),
         new Object[] {
             new Object[] {
            P00NG2_A396EmprCod, P00NG2_A252CliCod, P00NG2_A494ForSer, P00NG2_A482ForColNom, P00NG2_A483ForColNum, P00NG2_A831TipColCod, P00NG2_A995ForTonal, P00NG2_n995ForTonal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV18Flag ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV17Tonalidad ;
   private String scmdbuf ;
   private String A995ForTonal ;
   private boolean n995ForTonal ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NG2_A396EmprCod ;
   private int[] P00NG2_A252CliCod ;
   private String[] P00NG2_A494ForSer ;
   private String[] P00NG2_A482ForColNom ;
   private int[] P00NG2_A483ForColNum ;
   private byte[] P00NG2_A831TipColCod ;
   private String[] P00NG2_A995ForTonal ;
   private boolean[] P00NG2_n995ForTonal ;
}

final  class pbuston__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NG2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForTonal FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

