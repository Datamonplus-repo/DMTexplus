package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlfe extends GXProcedure
{
   public pctrlfe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlfe.class ), "" );
   }

   public pctrlfe( int remoteHandle ,
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
                           String[] aP5 ,
                           String[] aP6 ,
                           byte[] aP7 ,
                           byte[] aP8 )
   {
      pctrlfe.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 )
   {
      pctrlfe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlfe.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pctrlfe.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      pctrlfe.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      pctrlfe.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      pctrlfe.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      pctrlfe.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      pctrlfe.this.A2098MolCod = aP7[0];
      this.aP7 = aP7;
      pctrlfe.this.AV11RECPR2 = aP8[0];
      this.aP8 = aP8;
      pctrlfe.this.AV12Pasfor = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11RECPR2 = (byte)(0) ;
      AV12Pasfor = (byte)(0) ;
      /* Using cursor P03P02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2100MolCon = P03P02_A2100MolCon[0] ;
         n2100MolCon = P03P02_n2100MolCon[0] ;
         AV11RECPR2 = (byte)(0) ;
         /* Using cursor P03P03 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2116PrdForCan = P03P03_A2116PrdForCan[0] ;
            n2116PrdForCan = P03P03_n2116PrdForCan[0] ;
            A2535ForPrdLin = P03P03_A2535ForPrdLin[0] ;
            AV11RECPR2 = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV12Pasfor = (byte)(0) ;
         /* Using cursor P03P04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2654PasForLin = P03P04_A2654PasForLin[0] ;
            AV12Pasfor = (byte)(1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "&RECPR2 =", "") + GXutil.str( AV11RECPR2, 1, 0) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "&Pasfor =", "") + GXutil.str( AV12Pasfor, 1, 0) + GXutil.chr( (short)(13)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlfe.this.A396EmprCod;
      this.aP1[0] = pctrlfe.this.A252CliCod;
      this.aP2[0] = pctrlfe.this.A2141SerEst;
      this.aP3[0] = pctrlfe.this.A1013DibCli;
      this.aP4[0] = pctrlfe.this.A1014DibInt;
      this.aP5[0] = pctrlfe.this.A2074ColCom;
      this.aP6[0] = pctrlfe.this.A2078ColFon;
      this.aP7[0] = pctrlfe.this.A2098MolCod;
      this.aP8[0] = pctrlfe.this.AV11RECPR2;
      this.aP9[0] = pctrlfe.this.AV12Pasfor;
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
      P03P02_A396EmprCod = new String[] {""} ;
      P03P02_A252CliCod = new int[1] ;
      P03P02_A2141SerEst = new String[] {""} ;
      P03P02_A1013DibCli = new String[] {""} ;
      P03P02_A1014DibInt = new int[1] ;
      P03P02_A2074ColCom = new String[] {""} ;
      P03P02_A2078ColFon = new String[] {""} ;
      P03P02_A2098MolCod = new byte[1] ;
      P03P02_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03P02_n2100MolCon = new boolean[] {false} ;
      A2100MolCon = DecimalUtil.ZERO ;
      P03P03_A396EmprCod = new String[] {""} ;
      P03P03_A252CliCod = new int[1] ;
      P03P03_A2141SerEst = new String[] {""} ;
      P03P03_A1013DibCli = new String[] {""} ;
      P03P03_A1014DibInt = new int[1] ;
      P03P03_A2074ColCom = new String[] {""} ;
      P03P03_A2078ColFon = new String[] {""} ;
      P03P03_A2098MolCod = new byte[1] ;
      P03P03_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03P03_n2116PrdForCan = new boolean[] {false} ;
      P03P03_A2535ForPrdLin = new short[1] ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      P03P04_A396EmprCod = new String[] {""} ;
      P03P04_A252CliCod = new int[1] ;
      P03P04_A2141SerEst = new String[] {""} ;
      P03P04_A1013DibCli = new String[] {""} ;
      P03P04_A1014DibInt = new int[1] ;
      P03P04_A2074ColCom = new String[] {""} ;
      P03P04_A2078ColFon = new String[] {""} ;
      P03P04_A2098MolCod = new byte[1] ;
      P03P04_A2654PasForLin = new short[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlfe__default(),
         new Object[] {
             new Object[] {
            P03P02_A396EmprCod, P03P02_A252CliCod, P03P02_A2141SerEst, P03P02_A1013DibCli, P03P02_A1014DibInt, P03P02_A2074ColCom, P03P02_A2078ColFon, P03P02_A2098MolCod, P03P02_A2100MolCon, P03P02_n2100MolCon
            }
            , new Object[] {
            P03P03_A396EmprCod, P03P03_A252CliCod, P03P03_A2141SerEst, P03P03_A1013DibCli, P03P03_A1014DibInt, P03P03_A2074ColCom, P03P03_A2078ColFon, P03P03_A2098MolCod, P03P03_A2116PrdForCan, P03P03_n2116PrdForCan,
            P03P03_A2535ForPrdLin
            }
            , new Object[] {
            P03P04_A396EmprCod, P03P04_A252CliCod, P03P04_A2141SerEst, P03P04_A1013DibCli, P03P04_A1014DibInt, P03P04_A2074ColCom, P03P04_A2078ColFon, P03P04_A2098MolCod, P03P04_A2654PasForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2098MolCod ;
   private byte AV11RECPR2 ;
   private byte AV12Pasfor ;
   private short A2535ForPrdLin ;
   private short A2654PasForLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A2116PrdForCan ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String scmdbuf ;
   private String Gx_msg ;
   private boolean n2100MolCon ;
   private boolean n2116PrdForCan ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P03P02_A396EmprCod ;
   private int[] P03P02_A252CliCod ;
   private String[] P03P02_A2141SerEst ;
   private String[] P03P02_A1013DibCli ;
   private int[] P03P02_A1014DibInt ;
   private String[] P03P02_A2074ColCom ;
   private String[] P03P02_A2078ColFon ;
   private byte[] P03P02_A2098MolCod ;
   private java.math.BigDecimal[] P03P02_A2100MolCon ;
   private boolean[] P03P02_n2100MolCon ;
   private String[] P03P03_A396EmprCod ;
   private int[] P03P03_A252CliCod ;
   private String[] P03P03_A2141SerEst ;
   private String[] P03P03_A1013DibCli ;
   private int[] P03P03_A1014DibInt ;
   private String[] P03P03_A2074ColCom ;
   private String[] P03P03_A2078ColFon ;
   private byte[] P03P03_A2098MolCod ;
   private java.math.BigDecimal[] P03P03_A2116PrdForCan ;
   private boolean[] P03P03_n2116PrdForCan ;
   private short[] P03P03_A2535ForPrdLin ;
   private String[] P03P04_A396EmprCod ;
   private int[] P03P04_A252CliCod ;
   private String[] P03P04_A2141SerEst ;
   private String[] P03P04_A1013DibCli ;
   private int[] P03P04_A1014DibInt ;
   private String[] P03P04_A2074ColCom ;
   private String[] P03P04_A2078ColFon ;
   private byte[] P03P04_A2098MolCod ;
   private short[] P03P04_A2654PasForLin ;
}

final  class pctrlfe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03P02", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCon FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03P03", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PrdForCan, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03P04", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

