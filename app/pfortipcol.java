package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfortipcol extends GXProcedure
{
   public pfortipcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfortipcol.class ), "" );
   }

   public pfortipcol( int remoteHandle ,
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
      pfortipcol.this.aP6 = new byte[] {0};
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
      pfortipcol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfortipcol.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfortipcol.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pfortipcol.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pfortipcol.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pfortipcol.this.AV8TipColCod = aP5[0];
      this.aP5 = aP5;
      pfortipcol.this.AV9Ok = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Ok = (byte)(0) ;
      /* Using cursor P01GY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P01GY2_A831TipColCod[0] ;
         AV8TipColCod = A831TipColCod ;
         AV9Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfortipcol.this.A396EmprCod;
      this.aP1[0] = pfortipcol.this.A252CliCod;
      this.aP2[0] = pfortipcol.this.A494ForSer;
      this.aP3[0] = pfortipcol.this.A482ForColNom;
      this.aP4[0] = pfortipcol.this.A483ForColNum;
      this.aP5[0] = pfortipcol.this.AV8TipColCod;
      this.aP6[0] = pfortipcol.this.AV9Ok;
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
      P01GY2_A396EmprCod = new String[] {""} ;
      P01GY2_A252CliCod = new int[1] ;
      P01GY2_A494ForSer = new String[] {""} ;
      P01GY2_A482ForColNom = new String[] {""} ;
      P01GY2_A483ForColNum = new int[1] ;
      P01GY2_A831TipColCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfortipcol__default(),
         new Object[] {
             new Object[] {
            P01GY2_A396EmprCod, P01GY2_A252CliCod, P01GY2_A494ForSer, P01GY2_A482ForColNom, P01GY2_A483ForColNum, P01GY2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8TipColCod ;
   private byte AV9Ok ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01GY2_A396EmprCod ;
   private int[] P01GY2_A252CliCod ;
   private String[] P01GY2_A494ForSer ;
   private String[] P01GY2_A482ForColNom ;
   private int[] P01GY2_A483ForColNum ;
   private byte[] P01GY2_A831TipColCod ;
}

final  class pfortipcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01GY2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

