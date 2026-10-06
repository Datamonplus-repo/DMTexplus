package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleoarc extends GXProcedure
{
   public pleoarc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleoarc.class ), "" );
   }

   public pleoarc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 )
   {
      pleoarc.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 )
   {
      pleoarc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pleoarc.this.AV15Cliente = aP1[0];
      this.aP1 = aP1;
      pleoarc.this.AV24ForSer = aP2[0];
      this.aP2 = aP2;
      pleoarc.this.AV25ForColNom = aP3[0];
      this.aP3 = aP3;
      pleoarc.this.AV26ForColNum = aP4[0];
      this.aP4 = aP4;
      pleoarc.this.AV18TipColCod = aP5[0];
      this.aP5 = aP5;
      pleoarc.this.AV30ForNumArc = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30ForNumArc = 0 ;
      /* Using cursor P01IS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15Cliente), AV24ForSer, AV25ForColNom, Integer.valueOf(AV26ForColNum), Byte.valueOf(AV18TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P01IS2_A831TipColCod[0] ;
         A483ForColNum = P01IS2_A483ForColNum[0] ;
         A482ForColNom = P01IS2_A482ForColNom[0] ;
         A494ForSer = P01IS2_A494ForSer[0] ;
         A252CliCod = P01IS2_A252CliCod[0] ;
         A3315ForNumArc = P01IS2_A3315ForNumArc[0] ;
         n3315ForNumArc = P01IS2_n3315ForNumArc[0] ;
         AV30ForNumArc = A3315ForNumArc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleoarc.this.A396EmprCod;
      this.aP1[0] = pleoarc.this.AV15Cliente;
      this.aP2[0] = pleoarc.this.AV24ForSer;
      this.aP3[0] = pleoarc.this.AV25ForColNom;
      this.aP4[0] = pleoarc.this.AV26ForColNum;
      this.aP5[0] = pleoarc.this.AV18TipColCod;
      this.aP6[0] = pleoarc.this.AV30ForNumArc;
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
      P01IS2_A396EmprCod = new String[] {""} ;
      P01IS2_A831TipColCod = new byte[1] ;
      P01IS2_A483ForColNum = new int[1] ;
      P01IS2_A482ForColNom = new String[] {""} ;
      P01IS2_A494ForSer = new String[] {""} ;
      P01IS2_A252CliCod = new int[1] ;
      P01IS2_A3315ForNumArc = new int[1] ;
      P01IS2_n3315ForNumArc = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pleoarc__default(),
         new Object[] {
             new Object[] {
            P01IS2_A396EmprCod, P01IS2_A831TipColCod, P01IS2_A483ForColNum, P01IS2_A482ForColNom, P01IS2_A494ForSer, P01IS2_A252CliCod, P01IS2_A3315ForNumArc, P01IS2_n3315ForNumArc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TipColCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV15Cliente ;
   private int AV26ForColNum ;
   private int AV30ForNumArc ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A3315ForNumArc ;
   private String A396EmprCod ;
   private String AV24ForSer ;
   private String AV25ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n3315ForNumArc ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IS2_A396EmprCod ;
   private byte[] P01IS2_A831TipColCod ;
   private int[] P01IS2_A483ForColNum ;
   private String[] P01IS2_A482ForColNom ;
   private String[] P01IS2_A494ForSer ;
   private int[] P01IS2_A252CliCod ;
   private int[] P01IS2_A3315ForNumArc ;
   private boolean[] P01IS2_n3315ForNumArc ;
}

final  class pleoarc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IS2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumArc FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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

