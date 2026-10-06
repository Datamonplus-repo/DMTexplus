package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfdnumcolor extends GXProcedure
{
   public pfdnumcolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfdnumcolor.class ), "" );
   }

   public pfdnumcolor( int remoteHandle ,
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
      pfdnumcolor.this.aP6 = new int[] {0};
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
      pfdnumcolor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfdnumcolor.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfdnumcolor.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pfdnumcolor.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pfdnumcolor.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pfdnumcolor.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pfdnumcolor.this.AV8ForNumcol = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForNumcol = 0 ;
      /* Using cursor P05SM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5742ForSerDsc = P05SM2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P05SM2_n5742ForSerDsc[0] ;
         A486ForNumCol = P05SM2_A486ForNumCol[0] ;
         AV8ForNumcol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfdnumcolor.this.A396EmprCod;
      this.aP1[0] = pfdnumcolor.this.A252CliCod;
      this.aP2[0] = pfdnumcolor.this.A494ForSer;
      this.aP3[0] = pfdnumcolor.this.A482ForColNom;
      this.aP4[0] = pfdnumcolor.this.A483ForColNum;
      this.aP5[0] = pfdnumcolor.this.A831TipColCod;
      this.aP6[0] = pfdnumcolor.this.AV8ForNumcol;
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
      P05SM2_A396EmprCod = new String[] {""} ;
      P05SM2_A252CliCod = new int[1] ;
      P05SM2_A494ForSer = new String[] {""} ;
      P05SM2_A482ForColNom = new String[] {""} ;
      P05SM2_A483ForColNum = new int[1] ;
      P05SM2_A831TipColCod = new byte[1] ;
      P05SM2_A5742ForSerDsc = new String[] {""} ;
      P05SM2_n5742ForSerDsc = new boolean[] {false} ;
      P05SM2_A486ForNumCol = new int[1] ;
      A5742ForSerDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfdnumcolor__default(),
         new Object[] {
             new Object[] {
            P05SM2_A396EmprCod, P05SM2_A252CliCod, P05SM2_A494ForSer, P05SM2_A482ForColNom, P05SM2_A483ForColNum, P05SM2_A831TipColCod, P05SM2_A5742ForSerDsc, P05SM2_n5742ForSerDsc, P05SM2_A486ForNumCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV8ForNumcol ;
   private int A486ForNumCol ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private String A5742ForSerDsc ;
   private boolean n5742ForSerDsc ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05SM2_A396EmprCod ;
   private int[] P05SM2_A252CliCod ;
   private String[] P05SM2_A494ForSer ;
   private String[] P05SM2_A482ForColNom ;
   private int[] P05SM2_A483ForColNum ;
   private byte[] P05SM2_A831TipColCod ;
   private String[] P05SM2_A5742ForSerDsc ;
   private boolean[] P05SM2_n5742ForSerDsc ;
   private int[] P05SM2_A486ForNumCol ;
}

final  class pfdnumcolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SM2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForSerDsc, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
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

