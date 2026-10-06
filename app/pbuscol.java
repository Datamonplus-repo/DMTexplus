package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscol extends GXProcedure
{
   public pbuscol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscol.class ), "" );
   }

   public pbuscol( int remoteHandle ,
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
      pbuscol.this.aP6 = new byte[] {0};
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
      pbuscol.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuscol.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pbuscol.this.AV17ForSer = aP2[0];
      this.aP2 = aP2;
      pbuscol.this.AV18ForColNom = aP3[0];
      this.aP3 = aP3;
      pbuscol.this.AV19ForColNum = aP4[0];
      this.aP4 = aP4;
      pbuscol.this.AV20TipColCod = aP5[0];
      this.aP5 = aP5;
      pbuscol.this.AV21FlagCol = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00G82 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P00G82_A831TipColCod[0] ;
         A483ForColNum = P00G82_A483ForColNum[0] ;
         A482ForColNom = P00G82_A482ForColNom[0] ;
         A494ForSer = P00G82_A494ForSer[0] ;
         A252CliCod = P00G82_A252CliCod[0] ;
         A396EmprCod = P00G82_A396EmprCod[0] ;
         A492ForPreKgm = P00G82_A492ForPreKgm[0] ;
         n492ForPreKgm = P00G82_n492ForPreKgm[0] ;
         AV21FlagCol = (byte)(1) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A492ForPreKgm)==0) )
         {
            AV21FlagCol = (byte)(2) ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuscol.this.AV15EmprCod;
      this.aP1[0] = pbuscol.this.AV16CliCod;
      this.aP2[0] = pbuscol.this.AV17ForSer;
      this.aP3[0] = pbuscol.this.AV18ForColNom;
      this.aP4[0] = pbuscol.this.AV19ForColNum;
      this.aP5[0] = pbuscol.this.AV20TipColCod;
      this.aP6[0] = pbuscol.this.AV21FlagCol;
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
      P00G82_A831TipColCod = new byte[1] ;
      P00G82_A483ForColNum = new int[1] ;
      P00G82_A482ForColNom = new String[] {""} ;
      P00G82_A494ForSer = new String[] {""} ;
      P00G82_A252CliCod = new int[1] ;
      P00G82_A396EmprCod = new String[] {""} ;
      P00G82_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G82_n492ForPreKgm = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuscol__default(),
         new Object[] {
             new Object[] {
            P00G82_A831TipColCod, P00G82_A483ForColNum, P00G82_A482ForColNom, P00G82_A494ForSer, P00G82_A252CliCod, P00G82_A396EmprCod, P00G82_A492ForPreKgm, P00G82_n492ForPreKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte AV21FlagCol ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV19ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private java.math.BigDecimal A492ForPreKgm ;
   private String AV15EmprCod ;
   private String AV17ForSer ;
   private String AV18ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private boolean n492ForPreKgm ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00G82_A831TipColCod ;
   private int[] P00G82_A483ForColNum ;
   private String[] P00G82_A482ForColNom ;
   private String[] P00G82_A494ForSer ;
   private int[] P00G82_A252CliCod ;
   private String[] P00G82_A396EmprCod ;
   private java.math.BigDecimal[] P00G82_A492ForPreKgm ;
   private boolean[] P00G82_n492ForPreKgm ;
}

final  class pbuscol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00G82", "SELECT * FROM (SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForPreKgm FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
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

