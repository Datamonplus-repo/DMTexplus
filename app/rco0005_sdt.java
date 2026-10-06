package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rco0005_sdt extends GXProcedure
{
   public rco0005_sdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rco0005_sdt.class ), "" );
   }

   public rco0005_sdt( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             short aP3 ,
                             byte aP4 )
   {
      rco0005_sdt.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        short aP3 ,
                        byte aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             short aP3 ,
                             byte aP4 ,
                             String[] aP5 )
   {
      rco0005_sdt.this.AV61EmprCod = aP0;
      rco0005_sdt.this.AV9PProv = aP1;
      rco0005_sdt.this.AV10UProv = aP2;
      rco0005_sdt.this.AV11Any = aP3;
      rco0005_sdt.this.AV12Prioridad = aP4;
      rco0005_sdt.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19TotGen = DecimalUtil.ZERO ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9PProv) ,
                                           Integer.valueOf(AV10UProv) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           AV61EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09GK2 */
      pr_default.execute(0, new Object[] {AV61EmprCod, Integer.valueOf(AV9PProv), Integer.valueOf(AV10UProv)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P09GK2_A795PrvNum[0] ;
         A396EmprCod = P09GK2_A396EmprCod[0] ;
         A794PrvNom = P09GK2_A794PrvNom[0] ;
         n794PrvNom = P09GK2_n794PrvNom[0] ;
         AV18TotUniCpr = DecimalUtil.ZERO ;
         GX_I = 1 ;
         while ( GX_I <= 12 )
         {
            AV15UniCprMes[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         AV58PrvNum = A795PrvNum ;
         AV57PrvNom = A794PrvNom ;
         /* Using cursor P09GK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(AV11Any)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A779PrvAny = P09GK3_A779PrvAny[0] ;
            A796PrvNumLin = P09GK3_A796PrvNumLin[0] ;
            A791PrvEstCm1 = P09GK3_A791PrvEstCm1[0] ;
            n791PrvEstCm1 = P09GK3_n791PrvEstCm1[0] ;
            A790PrvEstCm0 = P09GK3_A790PrvEstCm0[0] ;
            n790PrvEstCm0 = P09GK3_n790PrvEstCm0[0] ;
            AV17I = A796PrvNumLin ;
            if ( AV12Prioridad == 1 )
            {
               AV15UniCprMes[AV17I-1] = A791PrvEstCm1 ;
               AV18TotUniCpr = AV18TotUniCpr.add(A791PrvEstCm1) ;
               AV20UniCprTot[AV17I-1] = AV20UniCprTot[AV17I-1].add(A791PrvEstCm1) ;
            }
            else if ( AV12Prioridad == 0 )
            {
               AV15UniCprMes[AV17I-1] = A790PrvEstCm0 ;
               AV18TotUniCpr = AV18TotUniCpr.add(A790PrvEstCm0) ;
               AV20UniCprTot[AV17I-1] = AV20UniCprTot[AV17I-1].add(A790PrvEstCm0) ;
            }
            else if ( AV12Prioridad == 2 )
            {
               AV15UniCprMes[AV17I-1] = A791PrvEstCm1.add(A790PrvEstCm0) ;
               AV18TotUniCpr = AV18TotUniCpr.add(A791PrvEstCm1).add(A790PrvEstCm0) ;
               AV20UniCprTot[AV17I-1] = AV20UniCprTot[AV17I-1].add(A791PrvEstCm1).add(A790PrvEstCm0) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'CARGA DE DATOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19TotGen = AV19TotGen.add(AV18TotUniCpr) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV59sdtpco0005 = (app.SdtSdtPCO0005)new app.SdtSdtPCO0005(remoteHandle, context);
      AV17I = (byte)(0) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Proveedor( "Totales" );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Enero( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Febrero( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Marzo( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Abril( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Mayo( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Junio( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Julio( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Agosto( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Septiembre( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Octubre( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Noviembre( AV20UniCprTot[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Diciembre( AV20UniCprTot[AV17I-1] );
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Total( AV19TotGen );
      AV60sdtpco0005Collection.add(AV59sdtpco0005, 0);
      AV62JSon = AV60sdtpco0005Collection.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'CARGA DE DATOS' Routine */
      returnInSub = false ;
      AV59sdtpco0005 = (app.SdtSdtPCO0005)new app.SdtSdtPCO0005(remoteHandle, context);
      AV17I = (byte)(0) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Proveedor( GXutil.trim( GXutil.str( AV58PrvNum, 6, 0))+" - "+GXutil.trim( AV57PrvNom) );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Enero( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Febrero( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Marzo( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Abril( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Mayo( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Junio( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Julio( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Agosto( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Septiembre( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Octubre( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Noviembre( AV15UniCprMes[AV17I-1] );
      AV17I = (byte)(AV17I+1) ;
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Diciembre( AV15UniCprMes[AV17I-1] );
      AV59sdtpco0005.setgxTv_SdtSdtPCO0005_Total( AV18TotUniCpr );
      AV60sdtpco0005Collection.add(AV59sdtpco0005, 0);
   }

   protected void cleanup( )
   {
      this.aP5[0] = rco0005_sdt.this.AV62JSon;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62JSon = "" ;
      AV19TotGen = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A396EmprCod = "" ;
      P09GK2_A795PrvNum = new int[1] ;
      P09GK2_A396EmprCod = new String[] {""} ;
      P09GK2_A794PrvNom = new String[] {""} ;
      P09GK2_n794PrvNom = new boolean[] {false} ;
      A794PrvNom = "" ;
      AV18TotUniCpr = DecimalUtil.ZERO ;
      AV15UniCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV15UniCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV57PrvNom = "" ;
      P09GK3_A396EmprCod = new String[] {""} ;
      P09GK3_A795PrvNum = new int[1] ;
      P09GK3_A779PrvAny = new short[1] ;
      P09GK3_A796PrvNumLin = new byte[1] ;
      P09GK3_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GK3_n791PrvEstCm1 = new boolean[] {false} ;
      P09GK3_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GK3_n790PrvEstCm0 = new boolean[] {false} ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      AV20UniCprTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV20UniCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV59sdtpco0005 = new app.SdtSdtPCO0005(remoteHandle, context);
      AV60sdtpco0005Collection = new GXBaseCollection<app.SdtSdtPCO0005>(app.SdtSdtPCO0005.class, "SdtPCO0005", "TexplusNET", remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0005_sdt__default(),
         new Object[] {
             new Object[] {
            P09GK2_A795PrvNum, P09GK2_A396EmprCod, P09GK2_A794PrvNom, P09GK2_n794PrvNom
            }
            , new Object[] {
            P09GK3_A396EmprCod, P09GK3_A795PrvNum, P09GK3_A779PrvAny, P09GK3_A796PrvNumLin, P09GK3_A791PrvEstCm1, P09GK3_n791PrvEstCm1, P09GK3_A790PrvEstCm0, P09GK3_n790PrvEstCm0
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Prioridad ;
   private byte A796PrvNumLin ;
   private byte AV17I ;
   private short AV11Any ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int AV9PProv ;
   private int AV10UProv ;
   private int A795PrvNum ;
   private int GX_I ;
   private int AV58PrvNum ;
   private java.math.BigDecimal AV19TotGen ;
   private java.math.BigDecimal AV18TotUniCpr ;
   private java.math.BigDecimal AV15UniCprMes[] ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal AV20UniCprTot[] ;
   private String AV61EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A794PrvNom ;
   private String AV57PrvNom ;
   private boolean n794PrvNom ;
   private boolean n791PrvEstCm1 ;
   private boolean n790PrvEstCm0 ;
   private boolean returnInSub ;
   private String AV62JSon ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P09GK2_A795PrvNum ;
   private String[] P09GK2_A396EmprCod ;
   private String[] P09GK2_A794PrvNom ;
   private boolean[] P09GK2_n794PrvNom ;
   private String[] P09GK3_A396EmprCod ;
   private int[] P09GK3_A795PrvNum ;
   private short[] P09GK3_A779PrvAny ;
   private byte[] P09GK3_A796PrvNumLin ;
   private java.math.BigDecimal[] P09GK3_A791PrvEstCm1 ;
   private boolean[] P09GK3_n791PrvEstCm1 ;
   private java.math.BigDecimal[] P09GK3_A790PrvEstCm0 ;
   private boolean[] P09GK3_n790PrvEstCm0 ;
   private GXBaseCollection<app.SdtSdtPCO0005> AV60sdtpco0005Collection ;
   private app.SdtSdtPCO0005 AV59sdtpco0005 ;
}

final  class rco0005_sdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9PProv ,
                                          int AV10UProv ,
                                          int A795PrvNum ,
                                          String AV61EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[3];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT PrvNum, EmprCod, PrvNom FROM TXPPRVGEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (0==AV9PProv) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV10UProv) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrvNum" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P09GK2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GK3", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm1, PrvEstCm0 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? ORDER BY EmprCod, PrvNum, PrvAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

