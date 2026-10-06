package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioproductoadicionado extends GXProcedure
{
   public precioproductoadicionado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioproductoadicionado.class ), "" );
   }

   public precioproductoadicionado( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           byte[] aP4 ,
                                           short[] aP5 ,
                                           String[] aP6 )
   {
      precioproductoadicionado.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      precioproductoadicionado.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      precioproductoadicionado.this.AV9HreBarCod = aP1[0];
      this.aP1 = aP1;
      precioproductoadicionado.this.AV10HreBarReo = aP2[0];
      this.aP2 = aP2;
      precioproductoadicionado.this.AV11HreBarPar = aP3[0];
      this.aP3 = aP3;
      precioproductoadicionado.this.AV12HreNumCie = aP4[0];
      this.aP4 = aP4;
      precioproductoadicionado.this.AV13HreLinMaq = aP5[0];
      this.aP5 = aP5;
      precioproductoadicionado.this.AV15Prdnum = aP6[0];
      this.aP6 = aP6;
      precioproductoadicionado.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14PrdPreAct = DecimalUtil.doubleToDec(0) ;
      AV18GXLvl2 = (byte)(0) ;
      /* Using cursor P08LK2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9HreBarCod), Byte.valueOf(AV10HreBarReo), AV11HreBarPar, Byte.valueOf(AV12HreNumCie), Short.valueOf(AV13HreLinMaq), AV15Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08LK2_A396EmprCod[0] ;
         A4492HreBarCod = P08LK2_A4492HreBarCod[0] ;
         A4493HreBarReo = P08LK2_A4493HreBarReo[0] ;
         A4494HreBarPar = P08LK2_A4494HreBarPar[0] ;
         A4495HreNumCie = P08LK2_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08LK2_A4545HreLinMaq[0] ;
         A719PrdNum = P08LK2_A719PrdNum[0] ;
         n719PrdNum = P08LK2_n719PrdNum[0] ;
         A4967HrePrePrd = P08LK2_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P08LK2_n4967HrePrePrd[0] ;
         A4550HreLinPro = P08LK2_A4550HreLinPro[0] ;
         A4557HreRecLin = P08LK2_A4557HreRecLin[0] ;
         AV18GXLvl2 = (byte)(1) ;
         AV14PrdPreAct = A4967HrePrePrd ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18GXLvl2 == 0 )
      {
         /* Using cursor P08LK3 */
         pr_default.execute(1, new Object[] {AV8EmprCod, AV15Prdnum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P08LK3_A719PrdNum[0] ;
            n719PrdNum = P08LK3_n719PrdNum[0] ;
            A396EmprCod = P08LK3_A396EmprCod[0] ;
            A724PrdPreAct = P08LK3_A724PrdPreAct[0] ;
            AV14PrdPreAct = A724PrdPreAct ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precioproductoadicionado.this.AV8EmprCod;
      this.aP1[0] = precioproductoadicionado.this.AV9HreBarCod;
      this.aP2[0] = precioproductoadicionado.this.AV10HreBarReo;
      this.aP3[0] = precioproductoadicionado.this.AV11HreBarPar;
      this.aP4[0] = precioproductoadicionado.this.AV12HreNumCie;
      this.aP5[0] = precioproductoadicionado.this.AV13HreLinMaq;
      this.aP6[0] = precioproductoadicionado.this.AV15Prdnum;
      this.aP7[0] = precioproductoadicionado.this.AV14PrdPreAct;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14PrdPreAct = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08LK2_A396EmprCod = new String[] {""} ;
      P08LK2_A4492HreBarCod = new int[1] ;
      P08LK2_A4493HreBarReo = new byte[1] ;
      P08LK2_A4494HreBarPar = new String[] {""} ;
      P08LK2_A4495HreNumCie = new byte[1] ;
      P08LK2_A4545HreLinMaq = new short[1] ;
      P08LK2_A719PrdNum = new String[] {""} ;
      P08LK2_n719PrdNum = new boolean[] {false} ;
      P08LK2_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LK2_n4967HrePrePrd = new boolean[] {false} ;
      P08LK2_A4550HreLinPro = new byte[1] ;
      P08LK2_A4557HreRecLin = new short[1] ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A719PrdNum = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      P08LK3_A719PrdNum = new String[] {""} ;
      P08LK3_n719PrdNum = new boolean[] {false} ;
      P08LK3_A396EmprCod = new String[] {""} ;
      P08LK3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precioproductoadicionado__default(),
         new Object[] {
             new Object[] {
            P08LK2_A396EmprCod, P08LK2_A4492HreBarCod, P08LK2_A4493HreBarReo, P08LK2_A4494HreBarPar, P08LK2_A4495HreNumCie, P08LK2_A4545HreLinMaq, P08LK2_A719PrdNum, P08LK2_n719PrdNum, P08LK2_A4967HrePrePrd, P08LK2_n4967HrePrePrd,
            P08LK2_A4550HreLinPro, P08LK2_A4557HreRecLin
            }
            , new Object[] {
            P08LK3_A719PrdNum, P08LK3_A396EmprCod, P08LK3_A724PrdPreAct
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10HreBarReo ;
   private byte AV12HreNumCie ;
   private byte AV18GXLvl2 ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV13HreLinMaq ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV9HreBarCod ;
   private int A4492HreBarCod ;
   private java.math.BigDecimal AV14PrdPreAct ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV8EmprCod ;
   private String AV11HreBarPar ;
   private String AV15Prdnum ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String A719PrdNum ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P08LK2_A396EmprCod ;
   private int[] P08LK2_A4492HreBarCod ;
   private byte[] P08LK2_A4493HreBarReo ;
   private String[] P08LK2_A4494HreBarPar ;
   private byte[] P08LK2_A4495HreNumCie ;
   private short[] P08LK2_A4545HreLinMaq ;
   private String[] P08LK2_A719PrdNum ;
   private boolean[] P08LK2_n719PrdNum ;
   private java.math.BigDecimal[] P08LK2_A4967HrePrePrd ;
   private boolean[] P08LK2_n4967HrePrePrd ;
   private byte[] P08LK2_A4550HreLinPro ;
   private short[] P08LK2_A4557HreRecLin ;
   private String[] P08LK3_A719PrdNum ;
   private boolean[] P08LK3_n719PrdNum ;
   private String[] P08LK3_A396EmprCod ;
   private java.math.BigDecimal[] P08LK3_A724PrdPreAct ;
}

final  class precioproductoadicionado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LK2", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, PrdNum, HrePrePrd, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and PrdNum = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08LK3", "SELECT PrdNum, EmprCod, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

