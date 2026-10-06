package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcccnodelete extends GXProcedure
{
   public pcccnodelete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcccnodelete.class ), "" );
   }

   public pcccnodelete( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          short[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          String[] aP5 ,
                          int[] aP6 ,
                          byte[] aP7 ,
                          short[] aP8 )
   {
      pcccnodelete.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             int[] aP9 )
   {
      pcccnodelete.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcccnodelete.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcccnodelete.this.A9713Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pcccnodelete.this.AV10ArtCod = aP3[0];
      this.aP3 = aP3;
      pcccnodelete.this.AV14TipArtiId = aP4[0];
      this.aP4 = aP4;
      pcccnodelete.this.AV11CCFColNom = aP5[0];
      this.aP5 = aP5;
      pcccnodelete.this.AV12CCFColNum = aP6[0];
      this.aP6 = aP6;
      pcccnodelete.this.AV15ccctc = aP7[0];
      this.aP7 = aP7;
      pcccnodelete.this.AV16IntId = aP8[0];
      this.aP8 = aP8;
      pcccnodelete.this.A4031CCTCod = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV10ArtCod ,
                                           AV11CCFColNom ,
                                           Integer.valueOf(AV12CCFColNum) ,
                                           A11736CCArtCod ,
                                           A11737CCColNom ,
                                           Integer.valueOf(A11738CCColNum) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(A9713Tb1_Cod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT
                                           }
      });
      /* Using cursor P04TT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), Integer.valueOf(A4031CCTCod), AV10ArtCod, AV11CCFColNom, Integer.valueOf(AV12CCFColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4034CCTLin = P04TT2_A4034CCTLin[0] ;
         A11750IntId = P04TT2_A11750IntId[0] ;
         A11749CCCTc = P04TT2_A11749CCCTc[0] ;
         A11738CCColNum = P04TT2_A11738CCColNum[0] ;
         A11737CCColNom = P04TT2_A11737CCColNom[0] ;
         A11748TipArtiId = P04TT2_A11748TipArtiId[0] ;
         A11736CCArtCod = P04TT2_A11736CCArtCod[0] ;
         /* Using cursor P04TT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), Short.valueOf(A11750IntId), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCNOS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcccnodelete.this.A396EmprCod;
      this.aP1[0] = pcccnodelete.this.A252CliCod;
      this.aP2[0] = pcccnodelete.this.A9713Tb1_Cod;
      this.aP3[0] = pcccnodelete.this.AV10ArtCod;
      this.aP4[0] = pcccnodelete.this.AV14TipArtiId;
      this.aP5[0] = pcccnodelete.this.AV11CCFColNom;
      this.aP6[0] = pcccnodelete.this.AV12CCFColNum;
      this.aP7[0] = pcccnodelete.this.AV15ccctc;
      this.aP8[0] = pcccnodelete.this.AV16IntId;
      this.aP9[0] = pcccnodelete.this.A4031CCTCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcccnodelete");
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
      A11736CCArtCod = "" ;
      A11737CCColNom = "" ;
      P04TT2_A396EmprCod = new String[] {""} ;
      P04TT2_A252CliCod = new int[1] ;
      P04TT2_A9713Tb1_Cod = new short[1] ;
      P04TT2_A4031CCTCod = new int[1] ;
      P04TT2_A4034CCTLin = new short[1] ;
      P04TT2_A11750IntId = new short[1] ;
      P04TT2_A11749CCCTc = new byte[1] ;
      P04TT2_A11738CCColNum = new int[1] ;
      P04TT2_A11737CCColNom = new String[] {""} ;
      P04TT2_A11748TipArtiId = new short[1] ;
      P04TT2_A11736CCArtCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcccnodelete__default(),
         new Object[] {
             new Object[] {
            P04TT2_A396EmprCod, P04TT2_A252CliCod, P04TT2_A9713Tb1_Cod, P04TT2_A4031CCTCod, P04TT2_A4034CCTLin, P04TT2_A11750IntId, P04TT2_A11749CCCTc, P04TT2_A11738CCColNum, P04TT2_A11737CCColNom, P04TT2_A11748TipArtiId,
            P04TT2_A11736CCArtCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15ccctc ;
   private byte A11749CCCTc ;
   private short A9713Tb1_Cod ;
   private short AV14TipArtiId ;
   private short AV16IntId ;
   private short A4034CCTLin ;
   private short A11750IntId ;
   private short A11748TipArtiId ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV12CCFColNum ;
   private int A4031CCTCod ;
   private int A11738CCColNum ;
   private String A396EmprCod ;
   private String AV10ArtCod ;
   private String AV11CCFColNom ;
   private String scmdbuf ;
   private String A11736CCArtCod ;
   private String A11737CCColNom ;
   private int[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P04TT2_A396EmprCod ;
   private int[] P04TT2_A252CliCod ;
   private short[] P04TT2_A9713Tb1_Cod ;
   private int[] P04TT2_A4031CCTCod ;
   private short[] P04TT2_A4034CCTLin ;
   private short[] P04TT2_A11750IntId ;
   private byte[] P04TT2_A11749CCCTc ;
   private int[] P04TT2_A11738CCColNum ;
   private String[] P04TT2_A11737CCColNom ;
   private short[] P04TT2_A11748TipArtiId ;
   private String[] P04TT2_A11736CCArtCod ;
}

final  class pcccnodelete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P04TT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV10ArtCod ,
                                          String AV11CCFColNom ,
                                          int AV12CCFColNum ,
                                          String A11736CCArtCod ,
                                          String A11737CCColNom ,
                                          int A11738CCColNum ,
                                          int A4031CCTCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          short A9713Tb1_Cod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, Tb1_Cod, CCTCod, CCTLin, IntId, CCCTc, CCColNum, CCColNom, TipArtiId, CCArtCod FROM TXPCCCNOS" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and Tb1_Cod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (GXutil.strcmp("", AV10ArtCod)==0) )
      {
         addWhere(sWhereString, "(CCArtCod = ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11CCFColNom)==0) )
      {
         addWhere(sWhereString, "(CCColNom = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV12CCFColNum) )
      {
         addWhere(sWhereString, "(CCColNum = ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod, CCTLin" ;
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
                  return conditional_P04TT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04TT2", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04TT3", "DELETE FROM TXPCCCNOS  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? AND IntId = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCCNOS")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
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
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

