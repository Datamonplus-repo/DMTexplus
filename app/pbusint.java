package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusint extends GXProcedure
{
   public pbusint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusint.class ), "" );
   }

   public pbusint( int remoteHandle ,
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
                          byte[] aP5 ,
                          byte[] aP6 ,
                          String[] aP7 ,
                          String[] aP8 )
   {
      pbusint.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 )
   {
      pbusint.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusint.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pbusint.this.AV16ForSer = aP2[0];
      this.aP2 = aP2;
      pbusint.this.AV17ForColNom = aP3[0];
      this.aP3 = aP3;
      pbusint.this.AV18ForColNum = aP4[0];
      this.aP4 = aP4;
      pbusint.this.AV19TipColCod = aP5[0];
      this.aP5 = aP5;
      pbusint.this.AV20IntCod = aP6[0];
      this.aP6 = aP6;
      pbusint.this.AV21IntDsc = aP7[0];
      this.aP7 = aP7;
      pbusint.this.AV22NomColCli = aP8[0];
      this.aP8 = aP8;
      pbusint.this.AV23NumColCli = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P006Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P006Y2_A831TipColCod[0] ;
         A483ForColNum = P006Y2_A483ForColNum[0] ;
         A482ForColNom = P006Y2_A482ForColNom[0] ;
         A494ForSer = P006Y2_A494ForSer[0] ;
         A252CliCod = P006Y2_A252CliCod[0] ;
         A486ForNumCol = P006Y2_A486ForNumCol[0] ;
         A583IntCod = P006Y2_A583IntCod[0] ;
         A584IntDsc = P006Y2_A584IntDsc[0] ;
         n584IntDsc = P006Y2_n584IntDsc[0] ;
         A1191ForNomCli = P006Y2_A1191ForNomCli[0] ;
         n1191ForNomCli = P006Y2_n1191ForNomCli[0] ;
         A1192ForNumCli = P006Y2_A1192ForNumCli[0] ;
         n1192ForNumCli = P006Y2_n1192ForNumCli[0] ;
         A584IntDsc = P006Y2_A584IntDsc[0] ;
         n584IntDsc = P006Y2_n584IntDsc[0] ;
         AV20IntCod = A583IntCod ;
         AV21IntDsc = A584IntDsc ;
         AV22NomColCli = A1191ForNomCli ;
         AV23NumColCli = A1192ForNumCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusint.this.A396EmprCod;
      this.aP1[0] = pbusint.this.AV15CliCod;
      this.aP2[0] = pbusint.this.AV16ForSer;
      this.aP3[0] = pbusint.this.AV17ForColNom;
      this.aP4[0] = pbusint.this.AV18ForColNum;
      this.aP5[0] = pbusint.this.AV19TipColCod;
      this.aP6[0] = pbusint.this.AV20IntCod;
      this.aP7[0] = pbusint.this.AV21IntDsc;
      this.aP8[0] = pbusint.this.AV22NomColCli;
      this.aP9[0] = pbusint.this.AV23NumColCli;
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
      P006Y2_A396EmprCod = new String[] {""} ;
      P006Y2_A831TipColCod = new byte[1] ;
      P006Y2_A483ForColNum = new int[1] ;
      P006Y2_A482ForColNom = new String[] {""} ;
      P006Y2_A494ForSer = new String[] {""} ;
      P006Y2_A252CliCod = new int[1] ;
      P006Y2_A486ForNumCol = new int[1] ;
      P006Y2_A583IntCod = new byte[1] ;
      P006Y2_A584IntDsc = new String[] {""} ;
      P006Y2_n584IntDsc = new boolean[] {false} ;
      P006Y2_A1191ForNomCli = new String[] {""} ;
      P006Y2_n1191ForNomCli = new boolean[] {false} ;
      P006Y2_A1192ForNumCli = new int[1] ;
      P006Y2_n1192ForNumCli = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A584IntDsc = "" ;
      A1191ForNomCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusint__default(),
         new Object[] {
             new Object[] {
            P006Y2_A396EmprCod, P006Y2_A831TipColCod, P006Y2_A483ForColNum, P006Y2_A482ForColNom, P006Y2_A494ForSer, P006Y2_A252CliCod, P006Y2_A486ForNumCol, P006Y2_A583IntCod, P006Y2_A584IntDsc, P006Y2_n584IntDsc,
            P006Y2_A1191ForNomCli, P006Y2_n1191ForNomCli, P006Y2_A1192ForNumCli, P006Y2_n1192ForNumCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte AV20IntCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int AV23NumColCli ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int A1192ForNumCli ;
   private String A396EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String AV21IntDsc ;
   private String AV22NomColCli ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A584IntDsc ;
   private String A1191ForNomCli ;
   private boolean n584IntDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private int[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P006Y2_A396EmprCod ;
   private byte[] P006Y2_A831TipColCod ;
   private int[] P006Y2_A483ForColNum ;
   private String[] P006Y2_A482ForColNom ;
   private String[] P006Y2_A494ForSer ;
   private int[] P006Y2_A252CliCod ;
   private int[] P006Y2_A486ForNumCol ;
   private byte[] P006Y2_A583IntCod ;
   private String[] P006Y2_A584IntDsc ;
   private boolean[] P006Y2_n584IntDsc ;
   private String[] P006Y2_A1191ForNomCli ;
   private boolean[] P006Y2_n1191ForNomCli ;
   private int[] P006Y2_A1192ForNumCli ;
   private boolean[] P006Y2_n1192ForNumCli ;
}

final  class pbusint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006Y2", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForNumCol, T1.IntCod, T2.IntDsc, T1.ForNomCli, T1.ForNumCli FROM (TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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

