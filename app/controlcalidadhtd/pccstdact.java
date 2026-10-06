package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccstdact extends GXProcedure
{
   public pccstdact( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccstdact.class ), "" );
   }

   public pccstdact( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      pccstdact.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      pccstdact.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccstdact.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pccstdact.this.AV13ArtCod = aP2[0];
      this.aP2 = aP2;
      pccstdact.this.AV12CCFColNom = aP3[0];
      this.aP3 = aP3;
      pccstdact.this.AV11CCFColNum = aP4[0];
      this.aP4 = aP4;
      pccstdact.this.A4031CCTCod = aP5[0];
      this.aP5 = aP5;
      pccstdact.this.A4034CCTLin = aP6[0];
      this.aP6 = aP6;
      pccstdact.this.AV9CCSMin = aP7[0];
      this.aP7 = aP7;
      pccstdact.this.AV8CCVal = aP8[0];
      this.aP8 = aP8;
      pccstdact.this.AV10CCSMax = aP9[0];
      this.aP9 = aP9;
      pccstdact.this.AV15CCSAuto = aP10[0];
      this.aP10 = aP10;
      pccstdact.this.AV16CCSVCod = aP11[0];
      this.aP11 = aP11;
      pccstdact.this.AV17CCSVTol = aP12[0];
      this.aP12 = aP12;
      pccstdact.this.AV19CCSEspecif = aP13[0];
      this.aP13 = aP13;
      pccstdact.this.AV18CCSMetodo = aP14[0];
      this.aP14 = aP14;
      pccstdact.this.AV14Opc = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV13ArtCod ,
                                           AV14Opc ,
                                           AV12CCFColNom ,
                                           Integer.valueOf(AV11CCFColNum) ,
                                           A65ArtCod ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      /* Using cursor P013N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), AV13ArtCod, AV12CCFColNom, Integer.valueOf(AV11CCFColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11482CCSMin = P013N2_A11482CCSMin[0] ;
         n11482CCSMin = P013N2_n11482CCSMin[0] ;
         A4060CCSVal = P013N2_A4060CCSVal[0] ;
         n4060CCSVal = P013N2_n4060CCSVal[0] ;
         A11483CCSMax = P013N2_A11483CCSMax[0] ;
         n11483CCSMax = P013N2_n11483CCSMax[0] ;
         A11530CCSAuto = P013N2_A11530CCSAuto[0] ;
         A11531CCSVCod = P013N2_A11531CCSVCod[0] ;
         A11532CCSVTol = P013N2_A11532CCSVTol[0] ;
         A13248CCSEspecif = P013N2_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P013N2_n13248CCSEspecif[0] ;
         A13247CCSMetodo = P013N2_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P013N2_n13247CCSMetodo[0] ;
         A4059CCFColNum = P013N2_A4059CCFColNum[0] ;
         A4058CCFColNom = P013N2_A4058CCFColNom[0] ;
         A65ArtCod = P013N2_A65ArtCod[0] ;
         A11482CCSMin = AV9CCSMin ;
         n11482CCSMin = false ;
         A4060CCSVal = AV8CCVal ;
         n4060CCSVal = false ;
         A11483CCSMax = AV10CCSMax ;
         n11483CCSMax = false ;
         A11530CCSAuto = AV15CCSAuto ;
         A11531CCSVCod = AV16CCSVCod ;
         A11532CCSVTol = AV17CCSVTol ;
         A13248CCSEspecif = AV19CCSEspecif ;
         n13248CCSEspecif = false ;
         A13247CCSMetodo = AV18CCSMetodo ;
         n13247CCSMetodo = false ;
         /* Using cursor P013N3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11482CCSMin), A11482CCSMin, Boolean.valueOf(n4060CCSVal), A4060CCSVal, Boolean.valueOf(n11483CCSMax), A11483CCSMax, Byte.valueOf(A11530CCSAuto), A11531CCSVCod, A11532CCSVTol, Boolean.valueOf(n13248CCSEspecif), A13248CCSEspecif, Boolean.valueOf(n13247CCSMetodo), A13247CCSMetodo, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccstdact.this.A396EmprCod;
      this.aP1[0] = pccstdact.this.A252CliCod;
      this.aP2[0] = pccstdact.this.AV13ArtCod;
      this.aP3[0] = pccstdact.this.AV12CCFColNom;
      this.aP4[0] = pccstdact.this.AV11CCFColNum;
      this.aP5[0] = pccstdact.this.A4031CCTCod;
      this.aP6[0] = pccstdact.this.A4034CCTLin;
      this.aP7[0] = pccstdact.this.AV9CCSMin;
      this.aP8[0] = pccstdact.this.AV8CCVal;
      this.aP9[0] = pccstdact.this.AV10CCSMax;
      this.aP10[0] = pccstdact.this.AV15CCSAuto;
      this.aP11[0] = pccstdact.this.AV16CCSVCod;
      this.aP12[0] = pccstdact.this.AV17CCSVTol;
      this.aP13[0] = pccstdact.this.AV19CCSEspecif;
      this.aP14[0] = pccstdact.this.AV18CCSMetodo;
      this.aP15[0] = pccstdact.this.AV14Opc;
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.pccstdact");
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
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      P013N2_A396EmprCod = new String[] {""} ;
      P013N2_A252CliCod = new int[1] ;
      P013N2_A4031CCTCod = new int[1] ;
      P013N2_A4034CCTLin = new short[1] ;
      P013N2_A11482CCSMin = new String[] {""} ;
      P013N2_n11482CCSMin = new boolean[] {false} ;
      P013N2_A4060CCSVal = new String[] {""} ;
      P013N2_n4060CCSVal = new boolean[] {false} ;
      P013N2_A11483CCSMax = new String[] {""} ;
      P013N2_n11483CCSMax = new boolean[] {false} ;
      P013N2_A11530CCSAuto = new byte[1] ;
      P013N2_A11531CCSVCod = new String[] {""} ;
      P013N2_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013N2_A13248CCSEspecif = new String[] {""} ;
      P013N2_n13248CCSEspecif = new boolean[] {false} ;
      P013N2_A13247CCSMetodo = new String[] {""} ;
      P013N2_n13247CCSMetodo = new boolean[] {false} ;
      P013N2_A4059CCFColNum = new int[1] ;
      P013N2_A4058CCFColNom = new String[] {""} ;
      P013N2_A65ArtCod = new String[] {""} ;
      A11482CCSMin = "" ;
      A4060CCSVal = "" ;
      A11483CCSMax = "" ;
      A11531CCSVCod = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A13248CCSEspecif = "" ;
      A13247CCSMetodo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccstdact__default(),
         new Object[] {
             new Object[] {
            P013N2_A396EmprCod, P013N2_A252CliCod, P013N2_A4031CCTCod, P013N2_A4034CCTLin, P013N2_A11482CCSMin, P013N2_n11482CCSMin, P013N2_A4060CCSVal, P013N2_n4060CCSVal, P013N2_A11483CCSMax, P013N2_n11483CCSMax,
            P013N2_A11530CCSAuto, P013N2_A11531CCSVCod, P013N2_A11532CCSVTol, P013N2_A13248CCSEspecif, P013N2_n13248CCSEspecif, P013N2_A13247CCSMetodo, P013N2_n13247CCSMetodo, P013N2_A4059CCFColNum, P013N2_A4058CCFColNom, P013N2_A65ArtCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15CCSAuto ;
   private byte A11530CCSAuto ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV11CCFColNum ;
   private int A4031CCTCod ;
   private int A4059CCFColNum ;
   private java.math.BigDecimal AV17CCSVTol ;
   private java.math.BigDecimal A11532CCSVTol ;
   private String A396EmprCod ;
   private String AV13ArtCod ;
   private String AV12CCFColNom ;
   private String AV9CCSMin ;
   private String AV8CCVal ;
   private String AV10CCSMax ;
   private String AV16CCSVCod ;
   private String AV19CCSEspecif ;
   private String AV18CCSMetodo ;
   private String AV14Opc ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String A11482CCSMin ;
   private String A4060CCSVal ;
   private String A11483CCSMax ;
   private String A11531CCSVCod ;
   private String A13248CCSEspecif ;
   private String A13247CCSMetodo ;
   private boolean n11482CCSMin ;
   private boolean n4060CCSVal ;
   private boolean n11483CCSMax ;
   private boolean n13248CCSEspecif ;
   private boolean n13247CCSMetodo ;
   private String[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P013N2_A396EmprCod ;
   private int[] P013N2_A252CliCod ;
   private int[] P013N2_A4031CCTCod ;
   private short[] P013N2_A4034CCTLin ;
   private String[] P013N2_A11482CCSMin ;
   private boolean[] P013N2_n11482CCSMin ;
   private String[] P013N2_A4060CCSVal ;
   private boolean[] P013N2_n4060CCSVal ;
   private String[] P013N2_A11483CCSMax ;
   private boolean[] P013N2_n11483CCSMax ;
   private byte[] P013N2_A11530CCSAuto ;
   private String[] P013N2_A11531CCSVCod ;
   private java.math.BigDecimal[] P013N2_A11532CCSVTol ;
   private String[] P013N2_A13248CCSEspecif ;
   private boolean[] P013N2_n13248CCSEspecif ;
   private String[] P013N2_A13247CCSMetodo ;
   private boolean[] P013N2_n13247CCSMetodo ;
   private int[] P013N2_A4059CCFColNum ;
   private String[] P013N2_A4058CCFColNom ;
   private String[] P013N2_A65ArtCod ;
}

final  class pccstdact__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P013N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV13ArtCod ,
                                          String AV14Opc ,
                                          String AV12CCFColNom ,
                                          int AV11CCFColNum ,
                                          String A65ArtCod ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum ,
                                          int A4031CCTCod ,
                                          short A4034CCTLin ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, CCTCod, CCTLin, CCSMin, CCSVal, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSEspecif, CCSMetodo, CCFColNum, CCFColNom, ArtCod FROM TXPCCSta" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      addWhere(sWhereString, "(CCTLin = ?)");
      if ( ( ! (GXutil.strcmp("", AV13ArtCod)==0) && ( GXutil.strcmp(AV14Opc, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.strcmp(AV14Opc, httpContext.getMessage( "E", "")) == 0 ) )
      {
         addWhere(sWhereString, "(ArtCod = ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ( ! (GXutil.strcmp("", AV12CCFColNom)==0) && ( GXutil.strcmp(AV14Opc, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.strcmp(AV14Opc, httpContext.getMessage( "E", "")) == 0 ) )
      {
         addWhere(sWhereString, "(CCFColNom = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ( ! (0==AV11CCFColNum) && ( GXutil.strcmp(AV14Opc, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.strcmp(AV14Opc, httpContext.getMessage( "E", "")) == 0 ) )
      {
         addWhere(sWhereString, "(CCFColNum = ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin" ;
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
                  return conditional_P013N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P013N2", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P013N3", "UPDATE TXPCCSta SET CCSMin=?, CCSVal=?, CCSMax=?, CCSAuto=?, CCSVCod=?, CCSVTol=?, CCSEspecif=?, CCSMetodo=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSta")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 13);
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 40);
               }
               stmt.setByte(4, ((Number) parms[6]).byteValue());
               stmt.setString(5, (String)parms[7], 10);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 30);
               }
               stmt.setString(9, (String)parms[13], 3);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setString(11, (String)parms[15], 16);
               stmt.setString(12, (String)parms[16], 13);
               stmt.setInt(13, ((Number) parms[17]).intValue());
               stmt.setInt(14, ((Number) parms[18]).intValue());
               stmt.setShort(15, ((Number) parms[19]).shortValue());
               return;
      }
   }

}

