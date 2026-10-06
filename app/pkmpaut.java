package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkmpaut extends GXProcedure
{
   public pkmpaut( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkmpaut.class ), "" );
   }

   public pkmpaut( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pkmpaut.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pkmpaut.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkmpaut.this.AV16Barcod = aP1[0];
      this.aP1 = aP1;
      pkmpaut.this.AV17barcodreo = aP2[0];
      this.aP2 = aP2;
      pkmpaut.this.AV18barcodpar = aP3[0];
      this.aP3 = aP3;
      pkmpaut.this.AV19Barordlin = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25UsurCod = "" ;
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pkmpaut.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      pkmpaut.this.A396EmprCod = GXv_char2[0] ;
      pkmpaut.this.AV27EmprNom = GXv_char3[0] ;
      pkmpaut.this.AV25UsurCod = GXv_char4[0] ;
      AV20Barmtsaut = DecimalUtil.doubleToDec(0) ;
      AV21Barkgsaut = DecimalUtil.doubleToDec(0) ;
      AV22barpieaut = (short)(0) ;
      /* Using cursor P04FI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16Barcod), Byte.valueOf(AV17barcodreo), AV18barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04FI2_A130BarCodPar[0] ;
         A132BarCodReo = P04FI2_A132BarCodReo[0] ;
         A129BarCod = P04FI2_A129BarCod[0] ;
         A4917MetPieObs = P04FI2_A4917MetPieObs[0] ;
         A2814MetPieKil = P04FI2_A2814MetPieKil[0] ;
         A2815MetPieMet = P04FI2_A2815MetPieMet[0] ;
         A2813MetPieCod = P04FI2_A2813MetPieCod[0] ;
         A2809MetTerCod = P04FI2_A2809MetTerCod[0] ;
         AV24VarAux = GXutil.gxgetmli( A4917MetPieObs, (short)(1), (short)(30)) ;
         if ( GXutil.strcmp(AV24VarAux, " ") != 0 )
         {
            if ( CommonUtil.decimalVal( GXutil.substring( AV24VarAux, 18, 8), ".").doubleValue() == AV19Barordlin )
            {
               AV21Barkgsaut = AV21Barkgsaut.add(A2814MetPieKil) ;
               AV20Barmtsaut = AV20Barmtsaut.add(A2815MetPieMet) ;
               AV22barpieaut = (short)(AV22barpieaut+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04FI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16Barcod), Byte.valueOf(AV17barcodreo), AV18barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P04FI3_A130BarCodPar[0] ;
         A132BarCodReo = P04FI3_A132BarCodReo[0] ;
         A129BarCod = P04FI3_A129BarCod[0] ;
         A3275BarKgsAut = P04FI3_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P04FI3_n3275BarKgsAut[0] ;
         A3276BarMtsAut = P04FI3_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P04FI3_n3276BarMtsAut[0] ;
         A3277BarPieAut = P04FI3_A3277BarPieAut[0] ;
         n3277BarPieAut = P04FI3_n3277BarPieAut[0] ;
         A200BarPieCod = P04FI3_A200BarPieCod[0] ;
         AV28Inc_obs = httpContext.getMessage( "Fin Fase.Actualizo Kgs,Mts f(LMETPI)", "") + GXutil.newLine( ) ;
         AV28Inc_obs += httpContext.getMessage( "Kilos  Aut ", "") + GXutil.str( A3275BarKgsAut, 9, 2) + httpContext.getMessage( " pasa a ", "") + GXutil.str( AV21Barkgsaut, 9, 2) + GXutil.newLine( ) ;
         AV28Inc_obs += httpContext.getMessage( "Metros Aut ", "") + GXutil.str( A3276BarMtsAut, 9, 2) + httpContext.getMessage( " pasa a ", "") + GXutil.str( AV20Barmtsaut, 9, 2) + GXutil.newLine( ) ;
         AV28Inc_obs += httpContext.getMessage( "Piezas Aut ", "") + GXutil.str( A3277BarPieAut, 4, 0) + httpContext.getMessage( " pasa a ", "") + GXutil.str( AV22barpieaut, 4, 0) + GXutil.newLine( ) ;
         A3277BarPieAut = AV22barpieaut ;
         n3277BarPieAut = false ;
         A3276BarMtsAut = AV20Barmtsaut ;
         n3276BarMtsAut = false ;
         A3275BarKgsAut = AV21Barkgsaut ;
         n3275BarKgsAut = false ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV25UsurCod, AV26Station, AV28Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P04FI4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if (true) break;
         /* Using cursor P04FI5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkmpaut.this.A396EmprCod;
      this.aP1[0] = pkmpaut.this.AV16Barcod;
      this.aP2[0] = pkmpaut.this.AV17barcodreo;
      this.aP3[0] = pkmpaut.this.AV18barcodpar;
      this.aP4[0] = pkmpaut.this.AV19Barordlin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkmpaut");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25UsurCod = "" ;
      AV26Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV27EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV20Barmtsaut = DecimalUtil.ZERO ;
      AV21Barkgsaut = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04FI2_A396EmprCod = new String[] {""} ;
      P04FI2_A130BarCodPar = new String[] {""} ;
      P04FI2_A132BarCodReo = new byte[1] ;
      P04FI2_A129BarCod = new int[1] ;
      P04FI2_A4917MetPieObs = new String[] {""} ;
      P04FI2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FI2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FI2_A2813MetPieCod = new String[] {""} ;
      P04FI2_A2809MetTerCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A4917MetPieObs = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV24VarAux = "" ;
      P04FI3_A396EmprCod = new String[] {""} ;
      P04FI3_A130BarCodPar = new String[] {""} ;
      P04FI3_A132BarCodReo = new byte[1] ;
      P04FI3_A129BarCod = new int[1] ;
      P04FI3_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FI3_n3275BarKgsAut = new boolean[] {false} ;
      P04FI3_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FI3_n3276BarMtsAut = new boolean[] {false} ;
      P04FI3_A3277BarPieAut = new short[1] ;
      P04FI3_n3277BarPieAut = new boolean[] {false} ;
      P04FI3_A200BarPieCod = new String[] {""} ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV28Inc_obs = "" ;
      AV33Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkmpaut__default(),
         new Object[] {
             new Object[] {
            P04FI2_A396EmprCod, P04FI2_A130BarCodPar, P04FI2_A132BarCodReo, P04FI2_A129BarCod, P04FI2_A4917MetPieObs, P04FI2_A2814MetPieKil, P04FI2_A2815MetPieMet, P04FI2_A2813MetPieCod, P04FI2_A2809MetTerCod
            }
            , new Object[] {
            P04FI3_A396EmprCod, P04FI3_A130BarCodPar, P04FI3_A132BarCodReo, P04FI3_A129BarCod, P04FI3_A3275BarKgsAut, P04FI3_n3275BarKgsAut, P04FI3_A3276BarMtsAut, P04FI3_n3276BarMtsAut, P04FI3_A3277BarPieAut, P04FI3_n3277BarPieAut,
            P04FI3_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV33Pgmname = "PKMPAUT" ;
      /* GeneXus formulas. */
      AV33Pgmname = "PKMPAUT" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17barcodreo ;
   private byte A132BarCodReo ;
   private short AV19Barordlin ;
   private short AV22barpieaut ;
   private short A3277BarPieAut ;
   private short Gx_err ;
   private int AV16Barcod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV20Barmtsaut ;
   private java.math.BigDecimal AV21Barkgsaut ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private String A396EmprCod ;
   private String AV18barcodpar ;
   private String AV25UsurCod ;
   private String AV26Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV27EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV24VarAux ;
   private String A200BarPieCod ;
   private String AV33Pgmname ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3277BarPieAut ;
   private String A4917MetPieObs ;
   private String AV28Inc_obs ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04FI2_A396EmprCod ;
   private String[] P04FI2_A130BarCodPar ;
   private byte[] P04FI2_A132BarCodReo ;
   private int[] P04FI2_A129BarCod ;
   private String[] P04FI2_A4917MetPieObs ;
   private java.math.BigDecimal[] P04FI2_A2814MetPieKil ;
   private java.math.BigDecimal[] P04FI2_A2815MetPieMet ;
   private String[] P04FI2_A2813MetPieCod ;
   private String[] P04FI2_A2809MetTerCod ;
   private String[] P04FI3_A396EmprCod ;
   private String[] P04FI3_A130BarCodPar ;
   private byte[] P04FI3_A132BarCodReo ;
   private int[] P04FI3_A129BarCod ;
   private java.math.BigDecimal[] P04FI3_A3275BarKgsAut ;
   private boolean[] P04FI3_n3275BarKgsAut ;
   private java.math.BigDecimal[] P04FI3_A3276BarMtsAut ;
   private boolean[] P04FI3_n3276BarMtsAut ;
   private short[] P04FI3_A3277BarPieAut ;
   private boolean[] P04FI3_n3277BarPieAut ;
   private String[] P04FI3_A200BarPieCod ;
}

final  class pkmpaut__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04FI2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, MetPieObs, MetPieKil, MetPieMet, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04FI3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarKgsAut, BarMtsAut, BarPieAut, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04FI4", "UPDATE TXPBARPIE SET BarKgsAut=?, BarMtsAut=?, BarPieAut=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P04FI5", "UPDATE TXPBARPIE SET BarKgsAut=?, BarMtsAut=?, BarPieAut=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setString(8, (String)parms[10], 9);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setString(8, (String)parms[10], 9);
               return;
      }
   }

}

