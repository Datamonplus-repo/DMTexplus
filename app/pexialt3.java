package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexialt3 extends GXProcedure
{
   public pexialt3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexialt3.class ), "" );
   }

   public pexialt3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 )
   {
      pexialt3.this.aP3 = new byte[] {0};
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
      pexialt3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexialt3.this.AV15NumPrd = aP1[0];
      this.aP1 = aP1;
      pexialt3.this.AV13CanTeo = aP2[0];
      this.aP2 = aP2;
      pexialt3.this.AV12FlagExis2 = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Consumos = (byte)(0) ;
      GXv_int1[0] = AV17Consumos ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int1) ;
      pexialt3.this.AV17Consumos = (byte)((byte)(GXv_int1[0])) ;
      AV16TeoCant = AV13CanTeo ;
      AV12FlagExis2 = (byte)(0) ;
      /* Using cursor P012W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15NumPrd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P012W2_A719PrdNum[0] ;
         A680PrdAltNum = P012W2_A680PrdAltNum[0] ;
         A678PrdAltFac = P012W2_A678PrdAltFac[0] ;
         A704PrdExiAlm = P012W2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P012W2_A705PrdExiCC[0] ;
         A856ValCod = P012W2_A856ValCod[0] ;
         A685PrdCanRes = P012W2_A685PrdCanRes[0] ;
         A719PrdNum = P012W2_A719PrdNum[0] ;
         A704PrdExiAlm = P012W2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P012W2_A705PrdExiCC[0] ;
         A856ValCod = P012W2_A856ValCod[0] ;
         A685PrdCanRes = P012W2_A685PrdCanRes[0] ;
         AV16TeoCant = AV16TeoCant.multiply(A678PrdAltFac) ;
         AV18Exis = A704PrdExiAlm ;
         if ( AV17Consumos == 0 )
         {
            AV18Exis = A705PrdExiCC ;
         }
         if ( A856ValCod == 1 )
         {
            AV14ExiRes = AV18Exis.subtract(A685PrdCanRes) ;
            if ( DecimalUtil.compareTo(AV14ExiRes, AV16TeoCant) >= 0 )
            {
               AV12FlagExis2 = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexialt3.this.A396EmprCod;
      this.aP1[0] = pexialt3.this.AV15NumPrd;
      this.aP2[0] = pexialt3.this.AV13CanTeo;
      this.aP3[0] = pexialt3.this.AV12FlagExis2;
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
      AV16TeoCant = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P012W2_A719PrdNum = new String[] {""} ;
      P012W2_A396EmprCod = new String[] {""} ;
      P012W2_A680PrdAltNum = new String[] {""} ;
      P012W2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012W2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012W2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012W2_A856ValCod = new byte[1] ;
      P012W2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV18Exis = DecimalUtil.ZERO ;
      AV14ExiRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexialt3__default(),
         new Object[] {
             new Object[] {
            P012W2_A719PrdNum, P012W2_A396EmprCod, P012W2_A680PrdAltNum, P012W2_A678PrdAltFac, P012W2_A704PrdExiAlm, P012W2_A705PrdExiCC, P012W2_A856ValCod, P012W2_A685PrdCanRes, P012W2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12FlagExis2 ;
   private byte AV17Consumos ;
   private byte A856ValCod ;
   private short Gx_err ;
   private int GXv_int1[] ;
   private java.math.BigDecimal AV13CanTeo ;
   private java.math.BigDecimal AV16TeoCant ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV18Exis ;
   private java.math.BigDecimal AV14ExiRes ;
   private String A396EmprCod ;
   private String AV15NumPrd ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A680PrdAltNum ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P012W2_A719PrdNum ;
   private String[] P012W2_A396EmprCod ;
   private String[] P012W2_A680PrdAltNum ;
   private java.math.BigDecimal[] P012W2_A678PrdAltFac ;
   private java.math.BigDecimal[] P012W2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P012W2_A705PrdExiCC ;
   private byte[] P012W2_A856ValCod ;
   private java.math.BigDecimal[] P012W2_A685PrdCanRes ;
}

final  class pexialt3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012W2", "SELECT T2.PrdNum, T1.EmprCod, T1.PrdAltNum, T1.PrdAltFac, T2.PrdExiAlm, T2.PrdExiCC, T2.ValCod, T2.PrdCanRes, T1.PrdNum FROM (TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE T1.EmprCod = ? and T1.PrdAltNum = ? ORDER BY T1.EmprCod, T1.PrdAltNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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

