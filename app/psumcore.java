package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psumcore extends GXProcedure
{
   public psumcore( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psumcore.class ), "" );
   }

   public psumcore( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           java.math.BigDecimal[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 ,
                           byte[] aP4 ,
                           byte[] aP5 ,
                           byte[] aP6 )
   {
      psumcore.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 )
   {
      psumcore.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psumcore.this.AV8ForCanSum = aP1[0];
      this.aP1 = aP1;
      psumcore.this.AV14Lb_numero = aP2[0];
      this.aP2 = aP2;
      psumcore.this.AV15Lb_opcion = aP3[0];
      this.aP3 = aP3;
      psumcore.this.AV10Lb_fam1 = aP4[0];
      this.aP4 = aP4;
      psumcore.this.AV11Lb_fam2 = aP5[0];
      this.aP5 = aP5;
      psumcore.this.AV12Lb_fam3 = aP6[0];
      this.aP6 = aP6;
      psumcore.this.AV17Err_sumc = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Err_sumc = (byte)(0) ;
      if ( ( AV10Lb_fam1 == 0 ) && ( AV11Lb_fam2 == 0 ) && ( AV12Lb_fam3 == 0 ) )
      {
         AV8ForCanSum = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02FQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14Lb_numero), AV15Lb_opcion});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P02FQ2_A719PrdNum[0] ;
            A5555Lb_opcion = P02FQ2_A5555Lb_opcion[0] ;
            A5532Lb_numero = P02FQ2_A5532Lb_numero[0] ;
            A5417PrdConcS = P02FQ2_A5417PrdConcS[0] ;
            A5558LB_CantC = P02FQ2_A5558LB_CantC[0] ;
            A5557Lb_LineaC = P02FQ2_A5557Lb_LineaC[0] ;
            A5417PrdConcS = P02FQ2_A5417PrdConcS[0] ;
            AV16PrdConcS = A5417PrdConcS ;
            if ( AV16PrdConcS.doubleValue() == 0 )
            {
               AV16PrdConcS = DecimalUtil.doubleToDec(1) ;
            }
            AV8ForCanSum = AV8ForCanSum.add(((A5558LB_CantC.multiply(AV16PrdConcS)))) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV17Err_sumc = (byte)(1) ;
      }
      else
      {
         AV8ForCanSum = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02FQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14Lb_numero), AV15Lb_opcion});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5555Lb_opcion = P02FQ3_A5555Lb_opcion[0] ;
            A5532Lb_numero = P02FQ3_A5532Lb_numero[0] ;
            A5417PrdConcS = P02FQ3_A5417PrdConcS[0] ;
            A719PrdNum = P02FQ3_A719PrdNum[0] ;
            A5558LB_CantC = P02FQ3_A5558LB_CantC[0] ;
            A5557Lb_LineaC = P02FQ3_A5557Lb_LineaC[0] ;
            A5417PrdConcS = P02FQ3_A5417PrdConcS[0] ;
            AV16PrdConcS = A5417PrdConcS ;
            if ( AV16PrdConcS.doubleValue() == 0 )
            {
               AV16PrdConcS = DecimalUtil.doubleToDec(1) ;
            }
            AV13Length = (byte)(GXutil.len( A719PrdNum)) ;
            AV18Ok = httpContext.getMessage( "N", "") ;
            if ( AV13Length > 5 )
            {
               if ( AV10Lb_fam1 <= 9 )
               {
                  if ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV10Lb_fam1 )
                  {
                     AV18Ok = httpContext.getMessage( "S", "") ;
                  }
               }
               else
               {
                  if ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV10Lb_fam1 )
                  {
                     AV18Ok = httpContext.getMessage( "S", "") ;
                  }
               }
               if ( AV11Lb_fam2 <= 9 )
               {
                  if ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV11Lb_fam2 )
                  {
                     AV18Ok = httpContext.getMessage( "S", "") ;
                  }
               }
               else
               {
                  if ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV11Lb_fam2 )
                  {
                     AV18Ok = httpContext.getMessage( "S", "") ;
                  }
               }
               if ( AV12Lb_fam3 <= 9 )
               {
                  if ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV12Lb_fam3 )
                  {
                     AV18Ok = httpContext.getMessage( "S", "") ;
                  }
               }
               else
               {
                  if ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV12Lb_fam3 )
                  {
                     AV18Ok = httpContext.getMessage( "S", "") ;
                  }
               }
               if ( GXutil.strcmp(AV18Ok, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV8ForCanSum = AV8ForCanSum.add(((A5558LB_CantC.multiply(AV16PrdConcS)))) ;
                  AV17Err_sumc = (byte)(1) ;
               }
            }
            else
            {
               if ( ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV10Lb_fam1 ) ) || ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV11Lb_fam2 ) ) || ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 1), ".").doubleValue() == AV12Lb_fam3 ) ) )
               {
                  AV8ForCanSum = AV8ForCanSum.add(((A5558LB_CantC.multiply(AV16PrdConcS)))) ;
                  AV17Err_sumc = (byte)(1) ;
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
      this.aP0[0] = psumcore.this.A396EmprCod;
      this.aP1[0] = psumcore.this.AV8ForCanSum;
      this.aP2[0] = psumcore.this.AV14Lb_numero;
      this.aP3[0] = psumcore.this.AV15Lb_opcion;
      this.aP4[0] = psumcore.this.AV10Lb_fam1;
      this.aP5[0] = psumcore.this.AV11Lb_fam2;
      this.aP6[0] = psumcore.this.AV12Lb_fam3;
      this.aP7[0] = psumcore.this.AV17Err_sumc;
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
      P02FQ2_A719PrdNum = new String[] {""} ;
      P02FQ2_A396EmprCod = new String[] {""} ;
      P02FQ2_A5555Lb_opcion = new String[] {""} ;
      P02FQ2_A5532Lb_numero = new int[1] ;
      P02FQ2_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FQ2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FQ2_A5557Lb_LineaC = new short[1] ;
      A719PrdNum = "" ;
      A5555Lb_opcion = "" ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      AV16PrdConcS = DecimalUtil.ZERO ;
      P02FQ3_A396EmprCod = new String[] {""} ;
      P02FQ3_A5555Lb_opcion = new String[] {""} ;
      P02FQ3_A5532Lb_numero = new int[1] ;
      P02FQ3_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FQ3_A719PrdNum = new String[] {""} ;
      P02FQ3_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02FQ3_A5557Lb_LineaC = new short[1] ;
      AV18Ok = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psumcore__default(),
         new Object[] {
             new Object[] {
            P02FQ2_A719PrdNum, P02FQ2_A396EmprCod, P02FQ2_A5555Lb_opcion, P02FQ2_A5532Lb_numero, P02FQ2_A5417PrdConcS, P02FQ2_A5558LB_CantC, P02FQ2_A5557Lb_LineaC
            }
            , new Object[] {
            P02FQ3_A396EmprCod, P02FQ3_A5555Lb_opcion, P02FQ3_A5532Lb_numero, P02FQ3_A5417PrdConcS, P02FQ3_A719PrdNum, P02FQ3_A5558LB_CantC, P02FQ3_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Lb_fam1 ;
   private byte AV11Lb_fam2 ;
   private byte AV12Lb_fam3 ;
   private byte AV17Err_sumc ;
   private byte AV13Length ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int AV14Lb_numero ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV8ForCanSum ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV16PrdConcS ;
   private String A396EmprCod ;
   private String AV15Lb_opcion ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A5555Lb_opcion ;
   private String AV18Ok ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02FQ2_A719PrdNum ;
   private String[] P02FQ2_A396EmprCod ;
   private String[] P02FQ2_A5555Lb_opcion ;
   private int[] P02FQ2_A5532Lb_numero ;
   private java.math.BigDecimal[] P02FQ2_A5417PrdConcS ;
   private java.math.BigDecimal[] P02FQ2_A5558LB_CantC ;
   private short[] P02FQ2_A5557Lb_LineaC ;
   private String[] P02FQ3_A396EmprCod ;
   private String[] P02FQ3_A5555Lb_opcion ;
   private int[] P02FQ3_A5532Lb_numero ;
   private java.math.BigDecimal[] P02FQ3_A5417PrdConcS ;
   private String[] P02FQ3_A719PrdNum ;
   private java.math.BigDecimal[] P02FQ3_A5558LB_CantC ;
   private short[] P02FQ3_A5557Lb_LineaC ;
}

final  class psumcore__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02FQ2", "SELECT T1.PrdNum, T1.EmprCod, T1.Lb_opcion, T1.Lb_numero, T2.PrdConcS, T1.LB_CantC, T1.Lb_LineaC FROM (TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02FQ3", "SELECT T1.EmprCod, T1.Lb_opcion, T1.Lb_numero, T2.PrdConcS, T1.PrdNum, T1.LB_CantC, T1.Lb_LineaC FROM (TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

