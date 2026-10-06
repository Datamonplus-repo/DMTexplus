package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdexialmc extends GXProcedure
{
   public pprdexialmc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdexialmc.class ), "" );
   }

   public pprdexialmc( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pprdexialmc.this.aP1 = new String[] {""};
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
      pprdexialmc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdexialmc.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Prdexialmc = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P05DU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      c8665Almc_Rem = P05DU2_A8665Almc_Rem[0] ;
      n8665Almc_Rem = P05DU2_n8665Almc_Rem[0] ;
      pr_default.close(0);
      AV8Prdexialmc = AV8Prdexialmc.add(c8665Almc_Rem) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P05DU3 */
      pr_default.execute(1, new Object[] {AV8Prdexialmc, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdexialmc.this.A396EmprCod;
      this.aP1[0] = pprdexialmc.this.A719PrdNum;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Prdexialmc = DecimalUtil.ZERO ;
      c8665Almc_Rem = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05DU2_A8665Almc_Rem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DU2_n8665Almc_Rem = new boolean[] {false} ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdexialmc__default(),
         new Object[] {
             new Object[] {
            P05DU2_A8665Almc_Rem, P05DU2_n8665Almc_Rem
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV8Prdexialmc ;
   private java.math.BigDecimal c8665Almc_Rem ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private boolean n8665Almc_Rem ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P05DU2_A8665Almc_Rem ;
   private boolean[] P05DU2_n8665Almc_Rem ;
}

final  class pprdexialmc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DU2", "SELECT SUM(Almc_Rem) FROM TXPALMCON WHERE (EmprCod = ? and PrdNum = ?) AND (Almc_Con = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05DU3", "UPDATE TXPPRODUC SET PrdExiAlmc=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

