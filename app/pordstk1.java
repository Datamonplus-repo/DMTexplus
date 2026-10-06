package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordstk1 extends GXProcedure
{
   public pordstk1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordstk1.class ), "" );
   }

   public pordstk1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           byte[] aP1 )
   {
      pordstk1.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 )
   {
      pordstk1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pordstk1.this.AV15PreMed = aP1[0];
      this.aP1 = aP1;
      pordstk1.this.AV16CC = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P039N2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A724PrdPreAct = P039N2_A724PrdPreAct[0] ;
         A726PrdPreMed = P039N2_A726PrdPreMed[0] ;
         A704PrdExiAlm = P039N2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P039N2_A705PrdExiCC[0] ;
         A332DifValStk = P039N2_A332DifValStk[0] ;
         A719PrdNum = P039N2_A719PrdNum[0] ;
         AV17PrdPre = (short)(DecimalUtil.decToDouble(((AV15PreMed==1) ? A726PrdPreMed : A724PrdPreAct))) ;
         AV18PrdExi = (byte)(DecimalUtil.decToDouble(((AV16CC==1) ? A705PrdExiCC : A704PrdExiAlm))) ;
         AV19DifValStk = DecimalUtil.stringToDec("99999999.99").subtract(DecimalUtil.doubleToDec((AV18PrdExi*AV17PrdPre))) ;
         A332DifValStk = ((DecimalUtil.compareTo(AV19DifValStk, DecimalUtil.stringToDec("99999999.99"))>0) ? DecimalUtil.stringToDec("99999999.99") : DecimalUtil.stringToDec("99999999.99").subtract(DecimalUtil.doubleToDec((AV18PrdExi*AV17PrdPre)))) ;
         /* Using cursor P039N3 */
         pr_default.execute(1, new Object[] {A332DifValStk, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pordstk1.this.A396EmprCod;
      this.aP1[0] = pordstk1.this.AV15PreMed;
      this.aP2[0] = pordstk1.this.AV16CC;
      Application.commitDataStores(context, remoteHandle, pr_default, "pordstk1");
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
      P039N2_A396EmprCod = new String[] {""} ;
      P039N2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039N2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039N2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039N2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039N2_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039N2_A719PrdNum = new String[] {""} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV19DifValStk = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pordstk1__default(),
         new Object[] {
             new Object[] {
            P039N2_A396EmprCod, P039N2_A724PrdPreAct, P039N2_A726PrdPreMed, P039N2_A704PrdExiAlm, P039N2_A705PrdExiCC, P039N2_A332DifValStk, P039N2_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15PreMed ;
   private byte AV16CC ;
   private byte AV18PrdExi ;
   private short AV17PrdPre ;
   private short Gx_err ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal AV19DifValStk ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P039N2_A396EmprCod ;
   private java.math.BigDecimal[] P039N2_A724PrdPreAct ;
   private java.math.BigDecimal[] P039N2_A726PrdPreMed ;
   private java.math.BigDecimal[] P039N2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P039N2_A705PrdExiCC ;
   private java.math.BigDecimal[] P039N2_A332DifValStk ;
   private String[] P039N2_A719PrdNum ;
}

final  class pordstk1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039N2", "SELECT EmprCod, PrdPreAct, PrdPreMed, PrdExiAlm, PrdExiCC, DifValStk, PrdNum FROM TXPPRODUC WHERE EmprCod = ? ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P039N3", "UPDATE TXPPRODUC SET DifValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

