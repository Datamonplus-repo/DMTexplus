package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palttes extends GXProcedure
{
   public palttes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palttes.class ), "" );
   }

   public palttes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      palttes.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 )
   {
      palttes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palttes.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      palttes.this.AV10PrdCnt = aP2[0];
      this.aP2 = aP2;
      palttes.this.AV14UniEstCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV12AltTes ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALTTES", ""), GXv_int2) ;
      palttes.this.GXt_int1 = GXv_int2[0] ;
      AV12AltTes = GXt_int1 ;
      AV9PrdNumAlt = AV8PrdNum ;
      AV13PrdCntAlt = ((GXutil.strcmp(AV14UniEstCod, httpContext.getMessage( "GRS", ""))==0) ? AV10PrdCnt.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV10PrdCnt) ;
      AV17GXLvl4 = (byte)(0) ;
      /* Using cursor P01IZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum, Byte.valueOf(AV12AltTes)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P01IZ2_A719PrdNum[0] ;
         A685PrdCanRes = P01IZ2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P01IZ2_A704PrdExiAlm[0] ;
         AV17GXLvl4 = (byte)(1) ;
         if ( DecimalUtil.compareTo(AV13PrdCntAlt, A704PrdExiAlm.subtract(A685PrdCanRes)) > 0 )
         {
            AV18GXLvl8 = (byte)(0) ;
            /* Using cursor P01IZ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A680PrdAltNum = P01IZ3_A680PrdAltNum[0] ;
               A678PrdAltFac = P01IZ3_A678PrdAltFac[0] ;
               AV18GXLvl8 = (byte)(1) ;
               AV11Ok = (byte)(0) ;
               AV9PrdNumAlt = A680PrdAltNum ;
               AV13PrdCntAlt = ((GXutil.strcmp(AV14UniEstCod, httpContext.getMessage( "GRS", ""))==0) ? AV10PrdCnt.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV10PrdCnt).multiply(A678PrdAltFac) ;
               GXt_int1 = AV11Ok ;
               GXv_char3[0] = A396EmprCod ;
               GXv_char4[0] = AV9PrdNumAlt ;
               GXv_decimal5[0] = AV13PrdCntAlt ;
               GXv_int2[0] = GXt_int1 ;
               new app.palttes1(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5, GXv_int2) ;
               palttes.this.A396EmprCod = GXv_char3[0] ;
               palttes.this.AV9PrdNumAlt = GXv_char4[0] ;
               palttes.this.AV13PrdCntAlt = GXv_decimal5[0] ;
               palttes.this.GXt_int1 = GXv_int2[0] ;
               AV11Ok = GXt_int1 ;
               if ( AV11Ok == 1 )
               {
                  AV8PrdNum = A680PrdAltNum ;
                  AV10PrdCnt = ((GXutil.strcmp(AV14UniEstCod, httpContext.getMessage( "GRS", ""))==0) ? AV13PrdCntAlt.multiply(DecimalUtil.doubleToDec(1000)) : AV13PrdCntAlt) ;
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               else
               {
                  AV9PrdNumAlt = AV8PrdNum ;
                  AV13PrdCntAlt = ((GXutil.strcmp(AV14UniEstCod, httpContext.getMessage( "GRS", ""))==0) ? AV10PrdCnt.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV10PrdCnt) ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV18GXLvl8 == 0 )
            {
            }
         }
         else
         {
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl4 == 0 )
      {
      }
      AV8PrdNum = AV9PrdNumAlt ;
      AV10PrdCnt = ((GXutil.strcmp(AV14UniEstCod, httpContext.getMessage( "GRS", ""))==0) ? AV13PrdCntAlt.multiply(DecimalUtil.doubleToDec(1000)) : AV13PrdCntAlt) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palttes.this.A396EmprCod;
      this.aP1[0] = palttes.this.AV8PrdNum;
      this.aP2[0] = palttes.this.AV10PrdCnt;
      this.aP3[0] = palttes.this.AV14UniEstCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9PrdNumAlt = "" ;
      AV13PrdCntAlt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01IZ2_A396EmprCod = new String[] {""} ;
      P01IZ2_A719PrdNum = new String[] {""} ;
      P01IZ2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01IZ2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      P01IZ3_A396EmprCod = new String[] {""} ;
      P01IZ3_A680PrdAltNum = new String[] {""} ;
      P01IZ3_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01IZ3_A719PrdNum = new String[] {""} ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int2 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palttes__default(),
         new Object[] {
             new Object[] {
            P01IZ2_A396EmprCod, P01IZ2_A719PrdNum, P01IZ2_A685PrdCanRes, P01IZ2_A704PrdExiAlm
            }
            , new Object[] {
            P01IZ3_A396EmprCod, P01IZ3_A680PrdAltNum, P01IZ3_A678PrdAltFac, P01IZ3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12AltTes ;
   private byte AV17GXLvl4 ;
   private byte AV18GXLvl8 ;
   private byte AV11Ok ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private java.math.BigDecimal AV10PrdCnt ;
   private java.math.BigDecimal AV13PrdCntAlt ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV14UniEstCod ;
   private String AV9PrdNumAlt ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A680PrdAltNum ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private boolean returnInSub ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IZ2_A396EmprCod ;
   private String[] P01IZ2_A719PrdNum ;
   private java.math.BigDecimal[] P01IZ2_A685PrdCanRes ;
   private java.math.BigDecimal[] P01IZ2_A704PrdExiAlm ;
   private String[] P01IZ3_A396EmprCod ;
   private String[] P01IZ3_A680PrdAltNum ;
   private java.math.BigDecimal[] P01IZ3_A678PrdAltFac ;
   private String[] P01IZ3_A719PrdNum ;
}

final  class palttes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IZ2", "SELECT EmprCod, PrdNum, PrdCanRes, PrdExiAlm FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (? = 1) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01IZ3", "SELECT EmprCod, PrdAltNum, PrdAltFac, PrdNum FROM TXPPRDALT WHERE EmprCod = ? and PrdAltNum = ? ORDER BY EmprCod, PrdAltNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

