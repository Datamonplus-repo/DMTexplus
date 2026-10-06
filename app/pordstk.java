package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordstk extends GXProcedure
{
   public pordstk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordstk.class ), "" );
   }

   public pordstk( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      pordstk.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      pordstk.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00422 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P00422_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00422_n3915EmpNumDec[0] ;
         A724PrdPreAct = P00422_A724PrdPreAct[0] ;
         A704PrdExiAlm = P00422_A704PrdExiAlm[0] ;
         A332DifValStk = P00422_A332DifValStk[0] ;
         A719PrdNum = P00422_A719PrdNum[0] ;
         A3915EmpNumDec = P00422_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00422_n3915EmpNumDec[0] ;
         if ( A3915EmpNumDec == 0 )
         {
            A332DifValStk = DecimalUtil.doubleToDec(99999999).subtract((A704PrdExiAlm.multiply(A724PrdPreAct))) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A332DifValStk = DecimalUtil.stringToDec("99999999.99").subtract((A704PrdExiAlm.multiply(A724PrdPreAct))) ;
            }
         }
         /* Using cursor P00423 */
         pr_default.execute(1, new Object[] {A332DifValStk, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pordstk.this.A396EmprCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pordstk");
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
      P00422_A396EmprCod = new String[] {""} ;
      P00422_A3915EmpNumDec = new byte[1] ;
      P00422_n3915EmpNumDec = new boolean[] {false} ;
      P00422_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00422_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00422_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00422_A719PrdNum = new String[] {""} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pordstk__default(),
         new Object[] {
             new Object[] {
            P00422_A396EmprCod, P00422_A3915EmpNumDec, P00422_n3915EmpNumDec, P00422_A724PrdPreAct, P00422_A704PrdExiAlm, P00422_A332DifValStk, P00422_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private short Gx_err ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A332DifValStk ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private boolean n3915EmpNumDec ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00422_A396EmprCod ;
   private byte[] P00422_A3915EmpNumDec ;
   private boolean[] P00422_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00422_A724PrdPreAct ;
   private java.math.BigDecimal[] P00422_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00422_A332DifValStk ;
   private String[] P00422_A719PrdNum ;
}

final  class pordstk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00422", "SELECT T1.EmprCod, T2.EmpNumDec, T1.PrdPreAct, T1.PrdExiAlm, T1.DifValStk, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod  FOR UPDATE OF T1.DifValStk NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00423", "UPDATE TXPPRODUC SET DifValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
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

