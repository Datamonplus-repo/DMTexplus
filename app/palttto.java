package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palttto extends GXProcedure
{
   public palttto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palttto.class ), "" );
   }

   public palttto( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 )
   {
      palttto.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 )
   {
      palttto.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palttto.this.AV38Producto = aP1[0];
      this.aP1 = aP1;
      palttto.this.AV44CanTeo1 = aP2[0];
      this.aP2 = aP2;
      palttto.this.AV60FaltaStk = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV52Consumos = (byte)(0) ;
      GXv_int1[0] = AV52Consumos ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int1) ;
      palttto.this.AV52Consumos = (byte)((byte)(GXv_int1[0])) ;
      AV37Flag = (byte)(0) ;
      AV59PrdIni = AV38Producto ;
      AV27CanTeo = AV44CanTeo1 ;
      AV60FaltaStk = (byte)(0) ;
      /* Using cursor P01MG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV59PrdIni});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P01MG2_A856ValCod[0] ;
         A719PrdNum = P01MG2_A719PrdNum[0] ;
         A680PrdAltNum = P01MG2_A680PrdAltNum[0] ;
         A678PrdAltFac = P01MG2_A678PrdAltFac[0] ;
         A705PrdExiCC = P01MG2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P01MG2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P01MG2_A685PrdCanRes[0] ;
         A856ValCod = P01MG2_A856ValCod[0] ;
         A705PrdExiCC = P01MG2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P01MG2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P01MG2_A685PrdCanRes[0] ;
         AV37Flag = (byte)(1) ;
         AV27CanTeo = AV27CanTeo.multiply(A678PrdAltFac) ;
         if ( AV52Consumos == 0 )
         {
            AV53Existencia = A705PrdExiCC ;
         }
         else
         {
            AV53Existencia = A704PrdExiAlm ;
         }
         AV33ExiRes = AV53Existencia.subtract(A685PrdCanRes) ;
         if ( DecimalUtil.compareTo(AV33ExiRes, AV27CanTeo) >= 0 )
         {
            AV60FaltaStk = (byte)(0) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         else
         {
            AV27CanTeo = AV27CanTeo.subtract(AV33ExiRes) ;
            AV60FaltaStk = (byte)(1) ;
         }
         AV27CanTeo = AV27CanTeo.divide(A678PrdAltFac, 18, java.math.RoundingMode.DOWN) ;
         if ( AV27CanTeo.doubleValue() <= 0 )
         {
            AV60FaltaStk = (byte)(0) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV37Flag == 0 )
      {
         AV60FaltaStk = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palttto.this.A396EmprCod;
      this.aP1[0] = palttto.this.AV38Producto;
      this.aP2[0] = palttto.this.AV44CanTeo1;
      this.aP3[0] = palttto.this.AV60FaltaStk;
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
      AV59PrdIni = "" ;
      AV27CanTeo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01MG2_A396EmprCod = new String[] {""} ;
      P01MG2_A856ValCod = new byte[1] ;
      P01MG2_A719PrdNum = new String[] {""} ;
      P01MG2_A680PrdAltNum = new String[] {""} ;
      P01MG2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MG2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MG2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MG2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV53Existencia = DecimalUtil.ZERO ;
      AV33ExiRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palttto__default(),
         new Object[] {
             new Object[] {
            P01MG2_A396EmprCod, P01MG2_A856ValCod, P01MG2_A719PrdNum, P01MG2_A680PrdAltNum, P01MG2_A678PrdAltFac, P01MG2_A705PrdExiCC, P01MG2_A704PrdExiAlm, P01MG2_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60FaltaStk ;
   private byte AV52Consumos ;
   private byte AV37Flag ;
   private byte A856ValCod ;
   private short Gx_err ;
   private int GXv_int1[] ;
   private java.math.BigDecimal AV44CanTeo1 ;
   private java.math.BigDecimal AV27CanTeo ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV53Existencia ;
   private java.math.BigDecimal AV33ExiRes ;
   private String A396EmprCod ;
   private String AV38Producto ;
   private String AV59PrdIni ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A680PrdAltNum ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01MG2_A396EmprCod ;
   private byte[] P01MG2_A856ValCod ;
   private String[] P01MG2_A719PrdNum ;
   private String[] P01MG2_A680PrdAltNum ;
   private java.math.BigDecimal[] P01MG2_A678PrdAltFac ;
   private java.math.BigDecimal[] P01MG2_A705PrdExiCC ;
   private java.math.BigDecimal[] P01MG2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P01MG2_A685PrdCanRes ;
}

final  class palttto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01MG2", "SELECT T1.EmprCod, T2.ValCod, T1.PrdNum, T1.PrdAltNum, T1.PrdAltFac, T2.PrdExiCC, T2.PrdExiAlm, T2.PrdCanRes FROM (TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T2.ValCod <> 3) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
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

