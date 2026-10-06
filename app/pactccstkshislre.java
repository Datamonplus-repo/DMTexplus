package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactccstkshislre extends GXProcedure
{
   public pactccstkshislre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactccstkshislre.class ), "" );
   }

   public pactccstkshislre( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      pactccstkshislre.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pactccstkshislre.this.AV45EmprCod = aP0[0];
      this.aP0 = aP0;
      pactccstkshislre.this.AV59Hrebarcod = aP1[0];
      this.aP1 = aP1;
      pactccstkshislre.this.AV60HreBarreo = aP2[0];
      this.aP2 = aP2;
      pactccstkshislre.this.AV61Hrebarpar = aP3[0];
      this.aP3 = aP3;
      pactccstkshislre.this.AV73CantHislre = aP4[0];
      this.aP4 = aP4;
      pactccstkshislre.this.AV68CCStkCanS = aP5[0];
      this.aP5 = aP5;
      pactccstkshislre.this.AV76OldCant = aP6[0];
      this.aP6 = aP6;
      pactccstkshislre.this.AV62PrdNum = aP7[0];
      this.aP7 = aP7;
      pactccstkshislre.this.AV72Nveces = aP8[0];
      this.aP8 = aP8;
      pactccstkshislre.this.AV77Op = aP9[0];
      this.aP9 = aP9;
      pactccstkshislre.this.Gx_msg = aP10[0];
      this.aP10 = aP10;
      pactccstkshislre.this.AV74Inc_obs = aP11[0];
      this.aP11 = aP11;
      pactccstkshislre.this.AV42UsurCod = aP12[0];
      this.aP12 = aP12;
      pactccstkshislre.this.AV43Station = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV72Nveces = (short)(0) ;
      Gx_msg = "" ;
      AV74Inc_obs = "" ;
      /* Optimized group. */
      /* Using cursor P04N12 */
      pr_default.execute(0, new Object[] {AV45EmprCod, AV62PrdNum, Integer.valueOf(AV59Hrebarcod), Byte.valueOf(AV60HreBarreo), AV61Hrebarpar});
      cV72Nveces = P04N12_AV72Nveces[0] ;
      c3344CCStkCanS = P04N12_A3344CCStkCanS[0] ;
      pr_default.close(0);
      AV72Nveces = (short)(AV72Nveces+cV72Nveces*1) ;
      AV68CCStkCanS = AV68CCStkCanS.add(c3344CCStkCanS) ;
      /* End optimized group. */
      if ( ( AV72Nveces > 1 ) && ( GXutil.strcmp(AV77Op, httpContext.getMessage( "S", "")) == 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Error. Este Producto ", "") + GXutil.trim( AV62PrdNum) + httpContext.getMessage( " para esta Hdr", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "tiene ", "") + GXutil.trim( GXutil.str( AV72Nveces, 4, 0)) + " " + httpContext.getMessage( "registros", "") + " " + httpContext.getMessage( "en tabla CCSTKS", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "NO puedo actualizar", "") ;
         AV74Inc_obs = Gx_msg ;
      }
      else
      {
         AV68CCStkCanS = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P04N13 */
         pr_default.execute(1, new Object[] {AV45EmprCod, AV62PrdNum, Integer.valueOf(AV59Hrebarcod), Byte.valueOf(AV60HreBarreo), AV61Hrebarpar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P04N13_A396EmprCod[0] ;
            A719PrdNum = P04N13_A719PrdNum[0] ;
            A3350CCStkBar = P04N13_A3350CCStkBar[0] ;
            A3351CCStkReo = P04N13_A3351CCStkReo[0] ;
            A3352CCStkPar = P04N13_A3352CCStkPar[0] ;
            A718PrdNom = P04N13_A718PrdNom[0] ;
            A3342CCStkLin = P04N13_A3342CCStkLin[0] ;
            A3344CCStkCanS = P04N13_A3344CCStkCanS[0] ;
            A718PrdNom = P04N13_A718PrdNom[0] ;
            if ( GXutil.strcmp(AV77Op, httpContext.getMessage( "S", "")) == 0 )
            {
               AV74Inc_obs = httpContext.getMessage( "Actualizo CCSTKS. ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
               AV74Inc_obs += httpContext.getMessage( "Linea= ", "") + GXutil.str( A3342CCStkLin, 12, 0) + GXutil.newLine( ) ;
               AV74Inc_obs += httpContext.getMessage( "Cantidad  Old ", "") + GXutil.str( A3344CCStkCanS, 12, 4) + " -> " + GXutil.str( AV73CantHislre, 12, 4) ;
               A3344CCStkCanS = A3344CCStkCanS.subtract(AV76OldCant).add(AV73CantHislre) ;
            }
            else
            {
               AV68CCStkCanS = AV68CCStkCanS.add(A3344CCStkCanS) ;
            }
            /* Using cursor P04N14 */
            pr_default.execute(2, new Object[] {A3344CCStkCanS, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactccstkshislre.this.AV45EmprCod;
      this.aP1[0] = pactccstkshislre.this.AV59Hrebarcod;
      this.aP2[0] = pactccstkshislre.this.AV60HreBarreo;
      this.aP3[0] = pactccstkshislre.this.AV61Hrebarpar;
      this.aP4[0] = pactccstkshislre.this.AV73CantHislre;
      this.aP5[0] = pactccstkshislre.this.AV68CCStkCanS;
      this.aP6[0] = pactccstkshislre.this.AV76OldCant;
      this.aP7[0] = pactccstkshislre.this.AV62PrdNum;
      this.aP8[0] = pactccstkshislre.this.AV72Nveces;
      this.aP9[0] = pactccstkshislre.this.AV77Op;
      this.aP10[0] = pactccstkshislre.this.Gx_msg;
      this.aP11[0] = pactccstkshislre.this.AV74Inc_obs;
      this.aP12[0] = pactccstkshislre.this.AV42UsurCod;
      this.aP13[0] = pactccstkshislre.this.AV43Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactccstkshislre");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c3344CCStkCanS = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04N12_AV72Nveces = new short[1] ;
      P04N12_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04N13_A396EmprCod = new String[] {""} ;
      P04N13_A719PrdNum = new String[] {""} ;
      P04N13_A3350CCStkBar = new int[1] ;
      P04N13_A3351CCStkReo = new byte[1] ;
      P04N13_A3352CCStkPar = new String[] {""} ;
      P04N13_A718PrdNom = new String[] {""} ;
      P04N13_A3342CCStkLin = new long[1] ;
      P04N13_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3352CCStkPar = "" ;
      A718PrdNom = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactccstkshislre__default(),
         new Object[] {
             new Object[] {
            P04N12_AV72Nveces, P04N12_A3344CCStkCanS
            }
            , new Object[] {
            P04N13_A396EmprCod, P04N13_A719PrdNum, P04N13_A3350CCStkBar, P04N13_A3351CCStkReo, P04N13_A3352CCStkPar, P04N13_A718PrdNom, P04N13_A3342CCStkLin, P04N13_A3344CCStkCanS
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60HreBarreo ;
   private byte A3351CCStkReo ;
   private short AV72Nveces ;
   private short cV72Nveces ;
   private short Gx_err ;
   private int AV59Hrebarcod ;
   private int A3350CCStkBar ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV73CantHislre ;
   private java.math.BigDecimal AV68CCStkCanS ;
   private java.math.BigDecimal AV76OldCant ;
   private java.math.BigDecimal c3344CCStkCanS ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String AV45EmprCod ;
   private String AV61Hrebarpar ;
   private String AV62PrdNum ;
   private String AV77Op ;
   private String Gx_msg ;
   private String AV42UsurCod ;
   private String AV43Station ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3352CCStkPar ;
   private String A718PrdNom ;
   private String AV74Inc_obs ;
   private String[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private short[] P04N12_AV72Nveces ;
   private java.math.BigDecimal[] P04N12_A3344CCStkCanS ;
   private String[] P04N13_A396EmprCod ;
   private String[] P04N13_A719PrdNum ;
   private int[] P04N13_A3350CCStkBar ;
   private byte[] P04N13_A3351CCStkReo ;
   private String[] P04N13_A3352CCStkPar ;
   private String[] P04N13_A718PrdNom ;
   private long[] P04N13_A3342CCStkLin ;
   private java.math.BigDecimal[] P04N13_A3344CCStkCanS ;
}

final  class pactccstkshislre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04N12", "SELECT COUNT(*), SUM(CCStkCanS) FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkBar = ? and CCStkReo = ? and CCStkPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04N13", "SELECT T1.EmprCod, T1.PrdNum, T1.CCStkBar, T1.CCStkReo, T1.CCStkPar, T2.PrdNom, T1.CCStkLin, T1.CCStkCanS FROM (TXPCCSTKS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.CCStkBar = ? and T1.CCStkReo = ? and T1.CCStkPar = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.CCStkBar, T1.CCStkReo, T1.CCStkPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04N14", "UPDATE TXPCCSTKS SET CCStkCanS=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

