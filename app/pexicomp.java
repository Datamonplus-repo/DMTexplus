package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexicomp extends GXProcedure
{
   public pexicomp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexicomp.class ), "" );
   }

   public pexicomp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           java.math.BigDecimal[] aP3 )
   {
      pexicomp.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 )
   {
      pexicomp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexicomp.this.AV10PrdComCod = aP1[0];
      this.aP1 = aP1;
      pexicomp.this.AV8Stkfis = aP2[0];
      this.aP2 = aP2;
      pexicomp.this.AV9stkteo = aP3[0];
      this.aP3 = aP3;
      pexicomp.this.AV11Flag1 = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Stkfis = DecimalUtil.ZERO ;
      AV9stkteo = DecimalUtil.ZERO ;
      /* Using cursor P02UI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10PrdComCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P02UI2_A719PrdNum[0] ;
         A688PrdComCod = P02UI2_A688PrdComCod[0] ;
         A705PrdExiCC = P02UI2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P02UI2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P02UI2_A685PrdCanRes[0] ;
         A684PrdCanPen = P02UI2_A684PrdCanPen[0] ;
         A705PrdExiCC = P02UI2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P02UI2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P02UI2_A685PrdCanRes[0] ;
         A684PrdCanPen = P02UI2_A684PrdCanPen[0] ;
         AV8Stkfis = A704PrdExiAlm.add(A705PrdExiCC) ;
         if ( (0==AV11Flag1) )
         {
            AV9stkteo = AV8Stkfis.add(A684PrdCanPen).subtract(A685PrdCanRes) ;
         }
         else
         {
            AV9stkteo = AV8Stkfis.subtract(A685PrdCanRes) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexicomp.this.A396EmprCod;
      this.aP1[0] = pexicomp.this.AV10PrdComCod;
      this.aP2[0] = pexicomp.this.AV8Stkfis;
      this.aP3[0] = pexicomp.this.AV9stkteo;
      this.aP4[0] = pexicomp.this.AV11Flag1;
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
      P02UI2_A719PrdNum = new String[] {""} ;
      P02UI2_A396EmprCod = new String[] {""} ;
      P02UI2_A688PrdComCod = new String[] {""} ;
      P02UI2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02UI2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02UI2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02UI2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A688PrdComCod = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexicomp__default(),
         new Object[] {
             new Object[] {
            P02UI2_A719PrdNum, P02UI2_A396EmprCod, P02UI2_A688PrdComCod, P02UI2_A705PrdExiCC, P02UI2_A704PrdExiAlm, P02UI2_A685PrdCanRes, P02UI2_A684PrdCanPen
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Flag1 ;
   private short Gx_err ;
   private java.math.BigDecimal AV8Stkfis ;
   private java.math.BigDecimal AV9stkteo ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private String A396EmprCod ;
   private String AV10PrdComCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A688PrdComCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02UI2_A719PrdNum ;
   private String[] P02UI2_A396EmprCod ;
   private String[] P02UI2_A688PrdComCod ;
   private java.math.BigDecimal[] P02UI2_A705PrdExiCC ;
   private java.math.BigDecimal[] P02UI2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P02UI2_A685PrdCanRes ;
   private java.math.BigDecimal[] P02UI2_A684PrdCanPen ;
}

final  class pexicomp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UI2", "SELECT T1.PrdNum, T1.EmprCod, T1.PrdComCod, T2.PrdExiCC, T2.PrdExiAlm, T2.PrdCanRes, T2.PrdCanPen FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdComCod = ? ORDER BY T1.EmprCod, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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

