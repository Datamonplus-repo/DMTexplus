package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprecmp extends GXProcedure
{
   public pprecmp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprecmp.class ), "" );
   }

   public pprecmp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pprecmp.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pprecmp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprecmp.this.AV8Prdnum = aP1[0];
      this.aP1 = aP1;
      pprecmp.this.AV9PrdPreAct = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03602 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P03602_A719PrdNum[0] ;
         A1186PrdPrec = P03602_A1186PrdPrec[0] ;
         A690PrdComFN = P03602_A690PrdComFN[0] ;
         A692PrdComVal = P03602_A692PrdComVal[0] ;
         A688PrdComCod = P03602_A688PrdComCod[0] ;
         A1186PrdPrec = AV9PrdPreAct ;
         GXt_decimal1 = A692PrdComVal ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.core.pcomval(remoteHandle, context).execute( A396EmprCod, AV9PrdPreAct, A690PrdComFN, GXv_decimal2) ;
         pprecmp.this.GXt_decimal1 = GXv_decimal2[0] ;
         A692PrdComVal = GXt_decimal1 ;
         /* Using cursor P03603 */
         pr_default.execute(1, new Object[] {A1186PrdPrec, A692PrdComVal, A396EmprCod, A719PrdNum, A688PrdComCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDCO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Cambio de Precio en Compuesto", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprecmp.this.A396EmprCod;
      this.aP1[0] = pprecmp.this.AV8Prdnum;
      this.aP2[0] = pprecmp.this.AV9PrdPreAct;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprecmp");
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
      P03602_A396EmprCod = new String[] {""} ;
      P03602_A719PrdNum = new String[] {""} ;
      P03602_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03602_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03602_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03602_A688PrdComCod = new String[] {""} ;
      A719PrdNum = "" ;
      A1186PrdPrec = DecimalUtil.ZERO ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A692PrdComVal = DecimalUtil.ZERO ;
      A688PrdComCod = "" ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprecmp__default(),
         new Object[] {
             new Object[] {
            P03602_A396EmprCod, P03602_A719PrdNum, P03602_A1186PrdPrec, P03602_A690PrdComFN, P03602_A692PrdComVal, P03602_A688PrdComCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV9PrdPreAct ;
   private java.math.BigDecimal A1186PrdPrec ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal A692PrdComVal ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String A396EmprCod ;
   private String AV8Prdnum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A688PrdComCod ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03602_A396EmprCod ;
   private String[] P03602_A719PrdNum ;
   private java.math.BigDecimal[] P03602_A1186PrdPrec ;
   private java.math.BigDecimal[] P03602_A690PrdComFN ;
   private java.math.BigDecimal[] P03602_A692PrdComVal ;
   private String[] P03602_A688PrdComCod ;
}

final  class pprecmp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03602", "SELECT EmprCod, PrdNum, PrdPrec, PrdComFN, PrdComVal, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03603", "UPDATE TXPLPRDCO SET PrdPrec=?, PrdComVal=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDCO")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

