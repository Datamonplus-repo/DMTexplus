package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaitd extends GXProcedure
{
   public pclaitd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaitd.class ), "" );
   }

   public pclaitd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pclaitd.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      pclaitd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaitd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaitd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaitd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaitd.this.AV114Discod = aP4[0];
      this.aP4 = aP4;
      pclaitd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclaitd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclaitd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclaitd.this.AV112Opi = aP8[0];
      this.aP8 = aP8;
      pclaitd.this.AV113BarFactin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
      AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
      /* Using cursor P026Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV114Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026Z2_A361DisCod[0] ;
         A252CliCod = P026Z2_A252CliCod[0] ;
         A335DisArtCod = P026Z2_A335DisArtCod[0] ;
         A362DisColNom = P026Z2_A362DisColNom[0] ;
         n362DisColNom = P026Z2_n362DisColNom[0] ;
         A363DisColNum = P026Z2_A363DisColNum[0] ;
         n363DisColNum = P026Z2_n363DisColNum[0] ;
         A390DisTipCol = P026Z2_A390DisTipCol[0] ;
         n390DisTipCol = P026Z2_n390DisTipCol[0] ;
         AV41BarCliCod = A252CliCod ;
         AV46ForSer = A335DisArtCod ;
         AV47ForColNom = A362DisColNom ;
         AV48ForColNum = A363DisColNum ;
         AV49TipColCod = A390DisTipCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P026Z3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Byte.valueOf(AV51IntCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A583IntCod = P026Z3_A583IntCod[0] ;
         A831TipColCod = P026Z3_A831TipColCod[0] ;
         A483ForColNum = P026Z3_A483ForColNum[0] ;
         A482ForColNom = P026Z3_A482ForColNom[0] ;
         A494ForSer = P026Z3_A494ForSer[0] ;
         A252CliCod = P026Z3_A252CliCod[0] ;
         AV17PrdVal = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaitd.this.A396EmprCod;
      this.aP1[0] = pclaitd.this.AV15Descrip;
      this.aP2[0] = pclaitd.this.AV16Clave;
      this.aP3[0] = pclaitd.this.AV17PrdVal;
      this.aP4[0] = pclaitd.this.AV114Discod;
      this.aP5[0] = pclaitd.this.AV21TotKil;
      this.aP6[0] = pclaitd.this.AV22PrdDesc;
      this.aP7[0] = pclaitd.this.AV23Accion;
      this.aP8[0] = pclaitd.this.AV112Opi;
      this.aP9[0] = pclaitd.this.AV113BarFactin;
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
      P026Z2_A396EmprCod = new String[] {""} ;
      P026Z2_A361DisCod = new int[1] ;
      P026Z2_A252CliCod = new int[1] ;
      P026Z2_A335DisArtCod = new String[] {""} ;
      P026Z2_A362DisColNom = new String[] {""} ;
      P026Z2_n362DisColNom = new boolean[] {false} ;
      P026Z2_A363DisColNum = new int[1] ;
      P026Z2_n363DisColNum = new boolean[] {false} ;
      P026Z2_A390DisTipCol = new byte[1] ;
      P026Z2_n390DisTipCol = new boolean[] {false} ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      P026Z3_A396EmprCod = new String[] {""} ;
      P026Z3_A583IntCod = new byte[1] ;
      P026Z3_A831TipColCod = new byte[1] ;
      P026Z3_A483ForColNum = new int[1] ;
      P026Z3_A482ForColNom = new String[] {""} ;
      P026Z3_A494ForSer = new String[] {""} ;
      P026Z3_A252CliCod = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaitd__default(),
         new Object[] {
             new Object[] {
            P026Z2_A396EmprCod, P026Z2_A361DisCod, P026Z2_A252CliCod, P026Z2_A335DisArtCod, P026Z2_A362DisColNom, P026Z2_n362DisColNom, P026Z2_A363DisColNum, P026Z2_n363DisColNum, P026Z2_A390DisTipCol, P026Z2_n390DisTipCol
            }
            , new Object[] {
            P026Z3_A396EmprCod, P026Z3_A583IntCod, P026Z3_A831TipColCod, P026Z3_A483ForColNum, P026Z3_A482ForColNom, P026Z3_A494ForSer, P026Z3_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV112Opi ;
   private byte AV51IntCod ;
   private byte A390DisTipCol ;
   private byte AV49TipColCod ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV114Discod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int AV41BarCliCod ;
   private int AV48ForColNum ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV113BarFactin ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P026Z2_A396EmprCod ;
   private int[] P026Z2_A361DisCod ;
   private int[] P026Z2_A252CliCod ;
   private String[] P026Z2_A335DisArtCod ;
   private String[] P026Z2_A362DisColNom ;
   private boolean[] P026Z2_n362DisColNom ;
   private int[] P026Z2_A363DisColNum ;
   private boolean[] P026Z2_n363DisColNum ;
   private byte[] P026Z2_A390DisTipCol ;
   private boolean[] P026Z2_n390DisTipCol ;
   private String[] P026Z3_A396EmprCod ;
   private byte[] P026Z3_A583IntCod ;
   private byte[] P026Z3_A831TipColCod ;
   private int[] P026Z3_A483ForColNum ;
   private String[] P026Z3_A482ForColNom ;
   private String[] P026Z3_A494ForSer ;
   private int[] P026Z3_A252CliCod ;
}

final  class pclaitd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026Z2", "SELECT EmprCod, DisCod, CliCod, DisArtCod, DisColNom, DisColNum, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P026Z3", "SELECT EmprCod, IntCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (IntCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

