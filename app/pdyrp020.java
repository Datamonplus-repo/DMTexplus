package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp020 extends GXProcedure
{
   public pdyrp020( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp020.class ), "" );
   }

   public pdyrp020( int remoteHandle ,
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
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pdyrp020.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      pdyrp020.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp020.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdyrp020.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pdyrp020.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pdyrp020.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pdyrp020.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pdyrp020.this.AV8ForPro = aP6[0];
      this.aP6 = aP6;
      pdyrp020.this.AV9ForRelBan = aP7[0];
      this.aP7 = aP7;
      pdyrp020.this.AV10Forblo = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForPro = " " ;
      AV10Forblo = httpContext.getMessage( "N", "") ;
      AV9ForRelBan = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P099D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2749ForPro = P099D2_A2749ForPro[0] ;
         n2749ForPro = P099D2_n2749ForPro[0] ;
         A2838ForRelBan = P099D2_A2838ForRelBan[0] ;
         n2838ForRelBan = P099D2_n2838ForRelBan[0] ;
         A7781ForBlo = P099D2_A7781ForBlo[0] ;
         n7781ForBlo = P099D2_n7781ForBlo[0] ;
         AV8ForPro = A2749ForPro ;
         AV9ForRelBan = A2838ForRelBan ;
         AV10Forblo = A7781ForBlo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp020.this.A396EmprCod;
      this.aP1[0] = pdyrp020.this.A252CliCod;
      this.aP2[0] = pdyrp020.this.A494ForSer;
      this.aP3[0] = pdyrp020.this.A482ForColNom;
      this.aP4[0] = pdyrp020.this.A483ForColNum;
      this.aP5[0] = pdyrp020.this.A831TipColCod;
      this.aP6[0] = pdyrp020.this.AV8ForPro;
      this.aP7[0] = pdyrp020.this.AV9ForRelBan;
      this.aP8[0] = pdyrp020.this.AV10Forblo;
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
      P099D2_A396EmprCod = new String[] {""} ;
      P099D2_A252CliCod = new int[1] ;
      P099D2_A494ForSer = new String[] {""} ;
      P099D2_A482ForColNom = new String[] {""} ;
      P099D2_A483ForColNum = new int[1] ;
      P099D2_A831TipColCod = new byte[1] ;
      P099D2_A2749ForPro = new String[] {""} ;
      P099D2_n2749ForPro = new boolean[] {false} ;
      P099D2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099D2_n2838ForRelBan = new boolean[] {false} ;
      P099D2_A7781ForBlo = new String[] {""} ;
      P099D2_n7781ForBlo = new boolean[] {false} ;
      A2749ForPro = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A7781ForBlo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp020__default(),
         new Object[] {
             new Object[] {
            P099D2_A396EmprCod, P099D2_A252CliCod, P099D2_A494ForSer, P099D2_A482ForColNom, P099D2_A483ForColNum, P099D2_A831TipColCod, P099D2_A2749ForPro, P099D2_n2749ForPro, P099D2_A2838ForRelBan, P099D2_n2838ForRelBan,
            P099D2_A7781ForBlo, P099D2_n7781ForBlo
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
   private java.math.BigDecimal AV9ForRelBan ;
   private java.math.BigDecimal A2838ForRelBan ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV8ForPro ;
   private String AV10Forblo ;
   private String scmdbuf ;
   private String A2749ForPro ;
   private String A7781ForBlo ;
   private boolean n2749ForPro ;
   private boolean n2838ForRelBan ;
   private boolean n7781ForBlo ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P099D2_A396EmprCod ;
   private int[] P099D2_A252CliCod ;
   private String[] P099D2_A494ForSer ;
   private String[] P099D2_A482ForColNom ;
   private int[] P099D2_A483ForColNum ;
   private byte[] P099D2_A831TipColCod ;
   private String[] P099D2_A2749ForPro ;
   private boolean[] P099D2_n2749ForPro ;
   private java.math.BigDecimal[] P099D2_A2838ForRelBan ;
   private boolean[] P099D2_n2838ForRelBan ;
   private String[] P099D2_A7781ForBlo ;
   private boolean[] P099D2_n7781ForBlo ;
}

final  class pdyrp020__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099D2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForPro, ForRelBan, ForBlo FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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

