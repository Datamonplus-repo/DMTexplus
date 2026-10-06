package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtsvalor extends GXProcedure
{
   public pmtsvalor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtsvalor.class ), "" );
   }

   public pmtsvalor( int remoteHandle ,
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
      pmtsvalor.this.aP6 = new byte[] {0};
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
      pmtsvalor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtsvalor.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmtsvalor.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pmtsvalor.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pmtsvalor.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pmtsvalor.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pmtsvalor.this.AV8ForMt = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForMt = (byte)(0) ;
      /* Using cursor P057L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12399ForMT = P057L2_A12399ForMT[0] ;
         n12399ForMT = P057L2_n12399ForMT[0] ;
         AV8ForMt = A12399ForMT ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtsvalor.this.A396EmprCod;
      this.aP1[0] = pmtsvalor.this.A252CliCod;
      this.aP2[0] = pmtsvalor.this.A494ForSer;
      this.aP3[0] = pmtsvalor.this.A482ForColNom;
      this.aP4[0] = pmtsvalor.this.A483ForColNum;
      this.aP5[0] = pmtsvalor.this.A831TipColCod;
      this.aP6[0] = pmtsvalor.this.AV8ForMt;
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
      P057L2_A396EmprCod = new String[] {""} ;
      P057L2_A252CliCod = new int[1] ;
      P057L2_A494ForSer = new String[] {""} ;
      P057L2_A482ForColNom = new String[] {""} ;
      P057L2_A483ForColNum = new int[1] ;
      P057L2_A831TipColCod = new byte[1] ;
      P057L2_A12399ForMT = new byte[1] ;
      P057L2_n12399ForMT = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtsvalor__default(),
         new Object[] {
             new Object[] {
            P057L2_A396EmprCod, P057L2_A252CliCod, P057L2_A494ForSer, P057L2_A482ForColNom, P057L2_A483ForColNum, P057L2_A831TipColCod, P057L2_A12399ForMT, P057L2_n12399ForMT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8ForMt ;
   private byte A12399ForMT ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private boolean n12399ForMT ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P057L2_A396EmprCod ;
   private int[] P057L2_A252CliCod ;
   private String[] P057L2_A494ForSer ;
   private String[] P057L2_A482ForColNom ;
   private int[] P057L2_A483ForColNum ;
   private byte[] P057L2_A831TipColCod ;
   private byte[] P057L2_A12399ForMT ;
   private boolean[] P057L2_n12399ForMT ;
}

final  class pmtsvalor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P057L2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForMT FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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

