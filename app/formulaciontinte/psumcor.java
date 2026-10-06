package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psumcor extends GXProcedure
{
   public psumcor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psumcor.class ), "" );
   }

   public psumcor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           java.math.BigDecimal[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           byte[] aP4 ,
                           byte[] aP5 )
   {
      psumcor.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      psumcor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psumcor.this.AV21ForCanSum = aP1[0];
      this.aP1 = aP1;
      psumcor.this.AV22ForNUmcol = aP2[0];
      this.aP2 = aP2;
      psumcor.this.AV23Lb_fam1 = aP3[0];
      this.aP3 = aP3;
      psumcor.this.AV24Lb_fam2 = aP4[0];
      this.aP4 = aP4;
      psumcor.this.AV25Lb_fam3 = aP5[0];
      this.aP5 = aP5;
      psumcor.this.AV27Err_sumc = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV29fam1d1 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FAM1D1", ""), GXv_int2) ;
      psumcor.this.GXt_int1 = GXv_int2[0] ;
      AV29fam1d1 = GXt_int1 ;
      AV27Err_sumc = (byte)(0) ;
      AV30Fam1 = GXutil.trim( GXutil.str( AV23Lb_fam1, 2, 0)) ;
      AV31Fam2 = GXutil.trim( GXutil.str( AV24Lb_fam2, 2, 0)) ;
      AV32Fam3 = GXutil.trim( GXutil.str( AV25Lb_fam3, 2, 0)) ;
      if ( ( AV23Lb_fam1 == 0 ) && ( AV24Lb_fam2 == 0 ) && ( AV25Lb_fam3 == 0 ) )
      {
         AV21ForCanSum = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02FP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV22ForNUmcol)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P02FP2_A719PrdNum[0] ;
            A486ForNumCol = P02FP2_A486ForNumCol[0] ;
            A5417PrdConcS = P02FP2_A5417PrdConcS[0] ;
            A481ForCan = P02FP2_A481ForCan[0] ;
            A309ColLin = P02FP2_A309ColLin[0] ;
            A5417PrdConcS = P02FP2_A5417PrdConcS[0] ;
            AV28PrdConcS = A5417PrdConcS ;
            if ( AV28PrdConcS.doubleValue() == 0 )
            {
               AV28PrdConcS = DecimalUtil.doubleToDec(1) ;
            }
            AV21ForCanSum = AV21ForCanSum.add(((A481ForCan.multiply(AV28PrdConcS)))) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV27Err_sumc = (byte)(1) ;
      }
      else
      {
         AV21ForCanSum = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02FP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV22ForNUmcol)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A486ForNumCol = P02FP3_A486ForNumCol[0] ;
            A5417PrdConcS = P02FP3_A5417PrdConcS[0] ;
            A719PrdNum = P02FP3_A719PrdNum[0] ;
            A481ForCan = P02FP3_A481ForCan[0] ;
            A309ColLin = P02FP3_A309ColLin[0] ;
            A5417PrdConcS = P02FP3_A5417PrdConcS[0] ;
            AV28PrdConcS = A5417PrdConcS ;
            if ( AV28PrdConcS.doubleValue() == 0 )
            {
               AV28PrdConcS = DecimalUtil.doubleToDec(1) ;
            }
            AV26Length = (byte)(GXutil.len( A719PrdNum)) ;
            if ( AV26Length > 5 )
            {
               if ( AV29fam1d1 == 0 )
               {
                  if ( ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV23Lb_fam1 ) ) || ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV24Lb_fam2 ) ) || ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV25Lb_fam3 ) ) )
                  {
                     AV21ForCanSum = AV21ForCanSum.add(((A481ForCan.multiply(AV28PrdConcS)))) ;
                     AV27Err_sumc = (byte)(1) ;
                  }
               }
               else
               {
                  if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), GXutil.substring( AV30Fam1, 1, 1)) == 0 ) || ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), GXutil.substring( AV31Fam2, 1, 1)) == 0 ) || ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), GXutil.substring( AV32Fam3, 1, 1)) == 0 ) )
                  {
                     AV21ForCanSum = AV21ForCanSum.add(((A481ForCan.multiply(AV28PrdConcS)))) ;
                     AV27Err_sumc = (byte)(1) ;
                  }
               }
            }
            else
            {
               if ( ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV23Lb_fam1 ) ) || ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV24Lb_fam2 ) ) || ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV25Lb_fam3 ) ) )
               {
                  AV21ForCanSum = AV21ForCanSum.add(((A481ForCan.multiply(AV28PrdConcS)))) ;
                  AV27Err_sumc = (byte)(1) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psumcor.this.A396EmprCod;
      this.aP1[0] = psumcor.this.AV21ForCanSum;
      this.aP2[0] = psumcor.this.AV22ForNUmcol;
      this.aP3[0] = psumcor.this.AV23Lb_fam1;
      this.aP4[0] = psumcor.this.AV24Lb_fam2;
      this.aP5[0] = psumcor.this.AV25Lb_fam3;
      this.aP6[0] = psumcor.this.AV27Err_sumc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV30Fam1 = "" ;
      AV31Fam2 = "" ;
      AV32Fam3 = "" ;
      scmdbuf = "" ;
      P02FP2_A719PrdNum = new String[] {""} ;
      P02FP2_A396EmprCod = new String[] {""} ;
      P02FP2_A486ForNumCol = new int[1] ;
      P02FP2_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FP2_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FP2_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A481ForCan = DecimalUtil.ZERO ;
      AV28PrdConcS = DecimalUtil.ZERO ;
      P02FP3_A396EmprCod = new String[] {""} ;
      P02FP3_A486ForNumCol = new int[1] ;
      P02FP3_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FP3_A719PrdNum = new String[] {""} ;
      P02FP3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FP3_A309ColLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.psumcor__default(),
         new Object[] {
             new Object[] {
            P02FP2_A719PrdNum, P02FP2_A396EmprCod, P02FP2_A486ForNumCol, P02FP2_A5417PrdConcS, P02FP2_A481ForCan, P02FP2_A309ColLin
            }
            , new Object[] {
            P02FP3_A396EmprCod, P02FP3_A486ForNumCol, P02FP3_A5417PrdConcS, P02FP3_A719PrdNum, P02FP3_A481ForCan, P02FP3_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23Lb_fam1 ;
   private byte AV24Lb_fam2 ;
   private byte AV25Lb_fam3 ;
   private byte AV27Err_sumc ;
   private byte AV29fam1d1 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV26Length ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV22ForNUmcol ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV21ForCanSum ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV28PrdConcS ;
   private String A396EmprCod ;
   private String AV30Fam1 ;
   private String AV31Fam2 ;
   private String AV32Fam3 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02FP2_A719PrdNum ;
   private String[] P02FP2_A396EmprCod ;
   private int[] P02FP2_A486ForNumCol ;
   private java.math.BigDecimal[] P02FP2_A5417PrdConcS ;
   private java.math.BigDecimal[] P02FP2_A481ForCan ;
   private short[] P02FP2_A309ColLin ;
   private String[] P02FP3_A396EmprCod ;
   private int[] P02FP3_A486ForNumCol ;
   private java.math.BigDecimal[] P02FP3_A5417PrdConcS ;
   private String[] P02FP3_A719PrdNum ;
   private java.math.BigDecimal[] P02FP3_A481ForCan ;
   private short[] P02FP3_A309ColLin ;
}

final  class psumcor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02FP2", "SELECT T1.PrdNum, T1.EmprCod, T1.ForNumCol, T2.PrdConcS, T1.ForCan, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02FP3", "SELECT T1.EmprCod, T1.ForNumCol, T2.PrdConcS, T1.PrdNum, T1.ForCan, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

