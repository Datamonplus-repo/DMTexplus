package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppropvp extends GXProcedure
{
   public ppropvp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppropvp.class ), "" );
   }

   public ppropvp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      ppropvp.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ppropvp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppropvp.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ppropvp.this.AV8vPrecio = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pPROPVP", "") );
      /* Using cursor P00WJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A724PrdPreAct = P00WJ2_A724PrdPreAct[0] ;
         Gx_msg = httpContext.getMessage( "pPROPVP.Producto= ", "") + A719PrdNum ;
         System.out.println( Gx_msg );
         AV8vPrecio = A724PrdPreAct ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppropvp.this.A396EmprCod;
      this.aP1[0] = ppropvp.this.A719PrdNum;
      this.aP2[0] = ppropvp.this.AV8vPrecio;
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
      P00WJ2_A396EmprCod = new String[] {""} ;
      P00WJ2_A719PrdNum = new String[] {""} ;
      P00WJ2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppropvp__default(),
         new Object[] {
             new Object[] {
            P00WJ2_A396EmprCod, P00WJ2_A719PrdNum, P00WJ2_A724PrdPreAct
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV8vPrecio ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String Gx_msg ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WJ2_A396EmprCod ;
   private String[] P00WJ2_A719PrdNum ;
   private java.math.BigDecimal[] P00WJ2_A724PrdPreAct ;
}

final  class ppropvp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WJ2", "SELECT EmprCod, PrdNum, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

