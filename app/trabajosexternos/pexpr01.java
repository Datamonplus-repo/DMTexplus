package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexpr01 extends GXProcedure
{
   public pexpr01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexpr01.class ), "" );
   }

   public pexpr01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            short aP1 ,
                            String aP2 ,
                            int aP3 ,
                            byte aP4 ,
                            String aP5 ,
                            java.util.Date[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            java.math.BigDecimal[] aP8 )
   {
      pexpr01.this.aP9 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        java.util.Date[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String aP5 ,
                             java.util.Date[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 )
   {
      pexpr01.this.A396EmprCod = aP0;
      pexpr01.this.A2248ManCod = aP1;
      pexpr01.this.A2689ExHdrFas = aP2;
      pexpr01.this.A129BarCod = aP3;
      pexpr01.this.A132BarCodReo = aP4;
      pexpr01.this.A130BarCodPar = aP5;
      pexpr01.this.aP6 = aP6;
      pexpr01.this.aP7 = aP7;
      pexpr01.this.aP8 = aP8;
      pexpr01.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EXHDRFEE = GXutil.nullDate() ;
      AV9EXHDRKGE = DecimalUtil.doubleToDec(0) ;
      AV10EXHDRMTE = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01UI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2248ManCod), A2689ExHdrFas});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2693ExHdrTip = P01UI2_A2693ExHdrTip[0] ;
         n2693ExHdrTip = P01UI2_n2693ExHdrTip[0] ;
         A2697ExHdrFeE = P01UI2_A2697ExHdrFeE[0] ;
         n2697ExHdrFeE = P01UI2_n2697ExHdrFeE[0] ;
         A2695ExHdrKgE = P01UI2_A2695ExHdrKgE[0] ;
         n2695ExHdrKgE = P01UI2_n2695ExHdrKgE[0] ;
         A2844ExHdrMtE = P01UI2_A2844ExHdrMtE[0] ;
         n2844ExHdrMtE = P01UI2_n2844ExHdrMtE[0] ;
         A2696ExHdrCnE = P01UI2_A2696ExHdrCnE[0] ;
         n2696ExHdrCnE = P01UI2_n2696ExHdrCnE[0] ;
         A2692ExHdrLin = P01UI2_A2692ExHdrLin[0] ;
         AV8EXHDRFEE = A2697ExHdrFeE ;
         AV9EXHDRKGE = A2695ExHdrKgE ;
         AV10EXHDRMTE = A2844ExHdrMtE ;
         AV11EXHDRCNE = A2696ExHdrCnE ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = pexpr01.this.AV8EXHDRFEE;
      this.aP7[0] = pexpr01.this.AV9EXHDRKGE;
      this.aP8[0] = pexpr01.this.AV10EXHDRMTE;
      this.aP9[0] = pexpr01.this.AV11EXHDRCNE;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8EXHDRFEE = GXutil.nullDate() ;
      AV9EXHDRKGE = DecimalUtil.ZERO ;
      AV10EXHDRMTE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01UI2_A396EmprCod = new String[] {""} ;
      P01UI2_A2248ManCod = new short[1] ;
      P01UI2_A2689ExHdrFas = new String[] {""} ;
      P01UI2_A129BarCod = new int[1] ;
      P01UI2_n129BarCod = new boolean[] {false} ;
      P01UI2_A132BarCodReo = new byte[1] ;
      P01UI2_n132BarCodReo = new boolean[] {false} ;
      P01UI2_A130BarCodPar = new String[] {""} ;
      P01UI2_n130BarCodPar = new boolean[] {false} ;
      P01UI2_A2693ExHdrTip = new String[] {""} ;
      P01UI2_n2693ExHdrTip = new boolean[] {false} ;
      P01UI2_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P01UI2_n2697ExHdrFeE = new boolean[] {false} ;
      P01UI2_A2695ExHdrKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UI2_n2695ExHdrKgE = new boolean[] {false} ;
      P01UI2_A2844ExHdrMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01UI2_n2844ExHdrMtE = new boolean[] {false} ;
      P01UI2_A2696ExHdrCnE = new short[1] ;
      P01UI2_n2696ExHdrCnE = new boolean[] {false} ;
      P01UI2_A2692ExHdrLin = new int[1] ;
      A2693ExHdrTip = "" ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2695ExHdrKgE = DecimalUtil.ZERO ;
      A2844ExHdrMtE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pexpr01__default(),
         new Object[] {
             new Object[] {
            P01UI2_A396EmprCod, P01UI2_A2248ManCod, P01UI2_A2689ExHdrFas, P01UI2_A129BarCod, P01UI2_n129BarCod, P01UI2_A132BarCodReo, P01UI2_n132BarCodReo, P01UI2_A130BarCodPar, P01UI2_n130BarCodPar, P01UI2_A2693ExHdrTip,
            P01UI2_n2693ExHdrTip, P01UI2_A2697ExHdrFeE, P01UI2_n2697ExHdrFeE, P01UI2_A2695ExHdrKgE, P01UI2_n2695ExHdrKgE, P01UI2_A2844ExHdrMtE, P01UI2_n2844ExHdrMtE, P01UI2_A2696ExHdrCnE, P01UI2_n2696ExHdrCnE, P01UI2_A2692ExHdrLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2248ManCod ;
   private short AV11EXHDRCNE ;
   private short A2696ExHdrCnE ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A2692ExHdrLin ;
   private java.math.BigDecimal AV9EXHDRKGE ;
   private java.math.BigDecimal AV10EXHDRMTE ;
   private java.math.BigDecimal A2695ExHdrKgE ;
   private java.math.BigDecimal A2844ExHdrMtE ;
   private String A396EmprCod ;
   private String A2689ExHdrFas ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2693ExHdrTip ;
   private java.util.Date AV8EXHDRFEE ;
   private java.util.Date A2697ExHdrFeE ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n2693ExHdrTip ;
   private boolean n2697ExHdrFeE ;
   private boolean n2695ExHdrKgE ;
   private boolean n2844ExHdrMtE ;
   private boolean n2696ExHdrCnE ;
   private short[] aP9 ;
   private java.util.Date[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P01UI2_A396EmprCod ;
   private short[] P01UI2_A2248ManCod ;
   private String[] P01UI2_A2689ExHdrFas ;
   private int[] P01UI2_A129BarCod ;
   private boolean[] P01UI2_n129BarCod ;
   private byte[] P01UI2_A132BarCodReo ;
   private boolean[] P01UI2_n132BarCodReo ;
   private String[] P01UI2_A130BarCodPar ;
   private boolean[] P01UI2_n130BarCodPar ;
   private String[] P01UI2_A2693ExHdrTip ;
   private boolean[] P01UI2_n2693ExHdrTip ;
   private java.util.Date[] P01UI2_A2697ExHdrFeE ;
   private boolean[] P01UI2_n2697ExHdrFeE ;
   private java.math.BigDecimal[] P01UI2_A2695ExHdrKgE ;
   private boolean[] P01UI2_n2695ExHdrKgE ;
   private java.math.BigDecimal[] P01UI2_A2844ExHdrMtE ;
   private boolean[] P01UI2_n2844ExHdrMtE ;
   private short[] P01UI2_A2696ExHdrCnE ;
   private boolean[] P01UI2_n2696ExHdrCnE ;
   private int[] P01UI2_A2692ExHdrLin ;
}

final  class pexpr01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01UI2", "SELECT EmprCod, ManCod, ExHdrFas, BarCod, BarCodReo, BarCodPar, ExHdrTip, ExHdrFeE, ExHdrKgE, ExHdrMtE, ExHdrCnE, ExHdrLin FROM TXPLEXMVH WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (ManCod = ?) AND (ExHdrFas = ?) AND (ExHdrTip = 'E') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setString(6, (String)parms[8], 8);
               return;
      }
   }

}

