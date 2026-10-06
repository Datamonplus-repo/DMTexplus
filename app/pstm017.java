package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstm017 extends GXProcedure
{
   public pstm017( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstm017.class ), "" );
   }

   public pstm017( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pstm017.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pstm017.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pstm017.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Consumos = (byte)(0) ;
      GXv_int1[0] = AV28Consumos ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int1) ;
      pstm017.this.AV28Consumos = (byte)((byte)(GXv_int1[0])) ;
      /* Using cursor P00XI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A704PrdExiAlm = P00XI2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P00XI2_A705PrdExiCC[0] ;
         A750PrdValStk = P00XI2_A750PrdValStk[0] ;
         A726PrdPreMed = P00XI2_A726PrdPreMed[0] ;
         Gx_msg = A719PrdNum + " " + httpContext.getMessage( " In PSTM017.Act PRODUC", "") ;
         System.out.println( Gx_msg );
         if ( A704PrdExiAlm.doubleValue() > 0 )
         {
            if ( AV28Consumos == 0 )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 2) ;
            }
            else
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 2) ;
            }
         }
         else
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         Gx_msg = A719PrdNum + " " + httpContext.getMessage( " End PSTM017.Act PRODUC", "") ;
         System.out.println( Gx_msg );
         /* Using cursor P00XI3 */
         pr_default.execute(1, new Object[] {A726PrdPreMed, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pstm017.this.A396EmprCod;
      this.aP1[0] = pstm017.this.A719PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pstm017");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      scmdbuf = "" ;
      P00XI2_A396EmprCod = new String[] {""} ;
      P00XI2_A719PrdNum = new String[] {""} ;
      P00XI2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00XI2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00XI2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00XI2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pstm017__default(),
         new Object[] {
             new Object[] {
            P00XI2_A396EmprCod, P00XI2_A719PrdNum, P00XI2_A704PrdExiAlm, P00XI2_A705PrdExiCC, P00XI2_A750PrdValStk, P00XI2_A726PrdPreMed
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28Consumos ;
   private short Gx_err ;
   private int GXv_int1[] ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A726PrdPreMed ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00XI2_A396EmprCod ;
   private String[] P00XI2_A719PrdNum ;
   private java.math.BigDecimal[] P00XI2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00XI2_A705PrdExiCC ;
   private java.math.BigDecimal[] P00XI2_A750PrdValStk ;
   private java.math.BigDecimal[] P00XI2_A726PrdPreMed ;
}

final  class pstm017__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00XI2", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdExiCC, PrdValStk, PrdPreMed FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00XI3", "UPDATE TXPPRODUC SET PrdPreMed=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

