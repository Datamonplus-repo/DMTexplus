package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdispq36 extends GXProcedure
{
   public pdispq36( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdispq36.class ), "" );
   }

   public pdispq36( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pdispq36.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 )
   {
      pdispq36.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdispq36.this.AV10Prdnum = aP1[0];
      this.aP1 = aP1;
      pdispq36.this.AV11Cnt = aP2[0];
      this.aP2 = aP2;
      pdispq36.this.AV14cnti = aP3[0];
      this.aP3 = aP3;
      pdispq36.this.AV9PrdPreact = aP4[0];
      this.aP4 = aP4;
      pdispq36.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PrdExialm = DecimalUtil.doubleToDec(0) ;
      AV9PrdPreact = DecimalUtil.doubleToDec(0) ;
      Gx_msg = " " ;
      /* Using cursor P057M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P057M2_A719PrdNum[0] ;
         A704PrdExiAlm = P057M2_A704PrdExiAlm[0] ;
         A724PrdPreAct = P057M2_A724PrdPreAct[0] ;
         A718PrdNom = P057M2_A718PrdNom[0] ;
         AV8PrdExialm = A704PrdExiAlm ;
         AV9PrdPreact = A724PrdPreAct ;
         AV13PrdNom = A718PrdNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.like( AV13PrdNom , GXutil.padr( httpContext.getMessage( "%AGUA%", "") , 254 , "%"),  ' ' ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( DecimalUtil.compareTo((AV11Cnt.add(AV14cnti)), AV8PrdExialm) > 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. La cantidad ", "") + GXutil.trim( GXutil.str( AV11Cnt, 9, 2)) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "es superior a las existencias ", "") + GXutil.trim( GXutil.str( AV8PrdExialm, 12, 4)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdispq36.this.A396EmprCod;
      this.aP1[0] = pdispq36.this.AV10Prdnum;
      this.aP2[0] = pdispq36.this.AV11Cnt;
      this.aP3[0] = pdispq36.this.AV14cnti;
      this.aP4[0] = pdispq36.this.AV9PrdPreact;
      this.aP5[0] = pdispq36.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PrdExialm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P057M2_A396EmprCod = new String[] {""} ;
      P057M2_A719PrdNum = new String[] {""} ;
      P057M2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057M2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057M2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV13PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdispq36__default(),
         new Object[] {
             new Object[] {
            P057M2_A396EmprCod, P057M2_A719PrdNum, P057M2_A704PrdExiAlm, P057M2_A724PrdPreAct, P057M2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV11Cnt ;
   private java.math.BigDecimal AV14cnti ;
   private java.math.BigDecimal AV9PrdPreact ;
   private java.math.BigDecimal AV8PrdExialm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String A396EmprCod ;
   private String AV10Prdnum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV13PrdNom ;
   private boolean returnInSub ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P057M2_A396EmprCod ;
   private String[] P057M2_A719PrdNum ;
   private java.math.BigDecimal[] P057M2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P057M2_A724PrdPreAct ;
   private String[] P057M2_A718PrdNom ;
}

final  class pdispq36__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P057M2", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdPreAct, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
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

