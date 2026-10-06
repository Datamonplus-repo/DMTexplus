package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalstksr extends GXProcedure
{
   public pvalstksr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalstksr.class ), "" );
   }

   public pvalstksr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      pvalstksr.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pvalstksr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvalstksr.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pvalstksr.this.AV8Cant_mov = aP2[0];
      this.aP2 = aP2;
      pvalstksr.this.AV9Precio_mov = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03LK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A750PrdValStk = P03LK2_A750PrdValStk[0] ;
         Gx_msg = A719PrdNum + " " + httpContext.getMessage( " In PVALSTKs.Act PRODUC", "") ;
         System.out.println( Gx_msg );
         A750PrdValStk = GXutil.roundDecimal( AV9Precio_mov.multiply(AV8Cant_mov), 2) ;
         Gx_msg = A719PrdNum + " " + httpContext.getMessage( " End PVALSTKs.Act PRODUC", "") ;
         System.out.println( Gx_msg );
         /* Using cursor P03LK3 */
         pr_default.execute(1, new Object[] {A750PrdValStk, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalstksr.this.A396EmprCod;
      this.aP1[0] = pvalstksr.this.A719PrdNum;
      this.aP2[0] = pvalstksr.this.AV8Cant_mov;
      this.aP3[0] = pvalstksr.this.AV9Precio_mov;
      Application.commitDataStores(context, remoteHandle, pr_default, "pvalstksr");
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
      P03LK2_A396EmprCod = new String[] {""} ;
      P03LK2_A719PrdNum = new String[] {""} ;
      P03LK2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A750PrdValStk = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvalstksr__default(),
         new Object[] {
             new Object[] {
            P03LK2_A396EmprCod, P03LK2_A719PrdNum, P03LK2_A750PrdValStk
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV8Cant_mov ;
   private java.math.BigDecimal AV9Precio_mov ;
   private java.math.BigDecimal A750PrdValStk ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String Gx_msg ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03LK2_A396EmprCod ;
   private String[] P03LK2_A719PrdNum ;
   private java.math.BigDecimal[] P03LK2_A750PrdValStk ;
}

final  class pvalstksr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03LK2", "SELECT EmprCod, PrdNum, PrdValStk FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03LK3", "UPDATE TXPPRODUC SET PrdValStk=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

