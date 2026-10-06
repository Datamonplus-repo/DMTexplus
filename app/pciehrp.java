package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciehrp extends GXProcedure
{
   public pciehrp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciehrp.class ), "" );
   }

   public pciehrp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pciehrp.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pciehrp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pciehrp.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pciehrp.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pciehrp.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV15NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pciehrp.this.AV15NCLec = GXv_int1[0] ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      pciehrp.this.A396EmprCod = GXv_char2[0] ;
      pciehrp.this.AV19EmprNom = GXv_char3[0] ;
      pciehrp.this.AV20usurcod = GXv_char4[0] ;
      /* Using cursor P01YO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A152BarFasCon = P01YO2_A152BarFasCon[0] ;
         A153BarFasEst = P01YO2_A153BarFasEst[0] ;
         A194BarOrdLin = P01YO2_A194BarOrdLin[0] ;
         A758ProCod = P01YO2_A758ProCod[0] ;
         /* Using cursor P01YO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A213BarSit = P01YO3_A213BarSit[0] ;
         A161BarFecSal = P01YO3_A161BarFecSal[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            AV9BarOrdLin = A194BarOrdLin ;
            if ( A153BarFasEst == 2 )
            {
               if ( A213BarSit < 9 )
               {
                  AV17Sit = A213BarSit ;
                  A213BarSit = (byte)(9) ;
                  A161BarFecSal = GXutil.today( ) ;
                  AV16Texto_i = httpContext.getMessage( "Programa, pCIEHRP-CAMBIO SITUACION HR= ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.chr( (short)(13)) ;
                  AV16Texto_i += httpContext.getMessage( "Situacion Actual es ", "") + GXutil.str( AV17Sit, 2, 0) + GXutil.chr( (short)(13)) ;
                  AV16Texto_i += httpContext.getMessage( "Situacion Final  es ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.newLine( ) + GXutil.chr( (short)(13)) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV20usurcod, AV18Station, AV16Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P01YO4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            if (true) break;
            /* Using cursor P01YO5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      if ( AV15NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pciehrp");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciehrp.this.A396EmprCod;
      this.aP1[0] = pciehrp.this.A129BarCod;
      this.aP2[0] = pciehrp.this.A132BarCodReo;
      this.aP3[0] = pciehrp.this.A130BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV18Station = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV20usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P01YO2_A396EmprCod = new String[] {""} ;
      P01YO2_A129BarCod = new int[1] ;
      P01YO2_A132BarCodReo = new byte[1] ;
      P01YO2_A130BarCodPar = new String[] {""} ;
      P01YO2_A152BarFasCon = new String[] {""} ;
      P01YO2_A153BarFasEst = new byte[1] ;
      P01YO2_A194BarOrdLin = new short[1] ;
      P01YO2_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      A758ProCod = "" ;
      P01YO3_A213BarSit = new byte[1] ;
      P01YO3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A161BarFecSal = GXutil.nullDate() ;
      AV16Texto_i = "" ;
      AV24Pgmname = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pciehrp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pciehrp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pciehrp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciehrp__default(),
         new Object[] {
             new Object[] {
            P01YO2_A396EmprCod, P01YO2_A129BarCod, P01YO2_A132BarCodReo, P01YO2_A130BarCodPar, P01YO2_A152BarFasCon, P01YO2_A153BarFasEst, P01YO2_A194BarOrdLin, P01YO2_A758ProCod
            }
            , new Object[] {
            P01YO3_A213BarSit, P01YO3_A161BarFecSal
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmname = "PCIEHRP" ;
      /* GeneXus formulas. */
      AV24Pgmname = "PCIEHRP" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15NCLec ;
   private byte GXv_int1[] ;
   private byte A153BarFasEst ;
   private byte A213BarSit ;
   private byte AV17Sit ;
   private short A194BarOrdLin ;
   private short AV9BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV18Station ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV20usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A152BarFasCon ;
   private String A758ProCod ;
   private String AV24Pgmname ;
   private java.util.Date A161BarFecSal ;
   private String AV16Texto_i ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YO2_A396EmprCod ;
   private int[] P01YO2_A129BarCod ;
   private byte[] P01YO2_A132BarCodReo ;
   private String[] P01YO2_A130BarCodPar ;
   private String[] P01YO2_A152BarFasCon ;
   private byte[] P01YO2_A153BarFasEst ;
   private short[] P01YO2_A194BarOrdLin ;
   private String[] P01YO2_A758ProCod ;
   private byte[] P01YO3_A213BarSit ;
   private java.util.Date[] P01YO3_A161BarFecSal ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pciehrp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pciehrp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pciehrp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pciehrp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YO2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasCon, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01YO3", "SELECT BarSit, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01YO4", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P01YO5", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
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
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

