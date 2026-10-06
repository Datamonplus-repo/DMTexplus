package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusagr extends GXProcedure
{
   public pbusagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusagr.class ), "" );
   }

   public pbusagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pbusagr.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pbusagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusagr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbusagr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbusagr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbusagr.this.AV15MaqCod = aP4[0];
      this.aP4 = aP4;
      pbusagr.this.AV16OrdLinAnt = aP5[0];
      this.aP5 = aP5;
      pbusagr.this.AV17FasCodAnt = aP6[0];
      this.aP6 = aP6;
      pbusagr.this.AV18FlagMFas = aP7[0];
      this.aP7 = aP7;
      pbusagr.this.AV19IniProd = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV23NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pbusagr.this.GXt_int1 = GXv_int2[0] ;
      AV23NCLec = GXt_int1 ;
      AV16OrdLinAnt = (short)(0) ;
      AV17FasCodAnt = "" ;
      AV18FlagMFas = (byte)(0) ;
      /* Using cursor P00882 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P00882_A457FasCod[0] ;
         A150BarFacTin = P00882_A150BarFacTin[0] ;
         A12360BarFasTOb = P00882_A12360BarFasTOb[0] ;
         n12360BarFasTOb = P00882_n12360BarFasTOb[0] ;
         A153BarFasEst = P00882_A153BarFasEst[0] ;
         A164BarHorFin = P00882_A164BarHorFin[0] ;
         A165BarHorIni = P00882_A165BarHorIni[0] ;
         A160BarFecRea = P00882_A160BarFecRea[0] ;
         A3298BarFecRIni = P00882_A3298BarFecRIni[0] ;
         A603MaqCodBis = P00882_A603MaqCodBis[0] ;
         A4442BarFasDTI = P00882_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P00882_n4442BarFasDTI[0] ;
         A194BarOrdLin = P00882_A194BarOrdLin[0] ;
         A758ProCod = P00882_A758ProCod[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( ( A153BarFasEst == 2 ) && ( GXutil.strcmp(A12360BarFasTOb, "X") == 0 ) || ( A153BarFasEst < 2 ) )
            {
               /* Using cursor P00883 */
               pr_default.execute(1, new Object[] {A396EmprCod, AV15MaqCod, A457FasCod});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A1142MaqFCod = P00883_A1142MaqFCod[0] ;
                  A602MaqCod = P00883_A602MaqCod[0] ;
                  AV18FlagMFas = (byte)(1) ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
               if ( AV18FlagMFas == 1 )
               {
                  AV16OrdLinAnt = A194BarOrdLin ;
                  AV17FasCodAnt = A457FasCod ;
                  if ( GXutil.strcmp(AV19IniProd, httpContext.getMessage( "S", "")) == 0 )
                  {
                     if ( (0==A165BarHorIni) && (0==A164BarHorFin) )
                     {
                        if ( A153BarFasEst == 0 )
                        {
                           A153BarFasEst = (byte)(1) ;
                           A165BarHorIni = (short)(GXutil.lval( GXutil.concat( GXutil.substring( GXutil.time( ), 1, 2), GXutil.substring( GXutil.time( ), 4, 2), ""))) ;
                           A160BarFecRea = GXutil.today( ) ;
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) )
                           {
                              A3298BarFecRIni = GXutil.today( ) ;
                           }
                           A603MaqCodBis = AV15MaqCod ;
                           AV22HisProDti = GXutil.serverNow( context, remoteHandle, pr_default) ;
                           A4442BarFasDTI = AV22HisProDti ;
                           n4442BarFasDTI = false ;
                        }
                     }
                  }
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  /* Using cursor P00884 */
                  pr_default.execute(2, new Object[] {Byte.valueOf(A153BarFasEst), Short.valueOf(A165BarHorIni), A160BarFecRea, A3298BarFecRIni, A603MaqCodBis, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if (true) break;
               }
            }
            /* Using cursor P00885 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), Short.valueOf(A165BarHorIni), A160BarFecRea, A3298BarFecRIni, A603MaqCodBis, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pbusagr");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusagr.this.A396EmprCod;
      this.aP1[0] = pbusagr.this.A129BarCod;
      this.aP2[0] = pbusagr.this.A132BarCodReo;
      this.aP3[0] = pbusagr.this.A130BarCodPar;
      this.aP4[0] = pbusagr.this.AV15MaqCod;
      this.aP5[0] = pbusagr.this.AV16OrdLinAnt;
      this.aP6[0] = pbusagr.this.AV17FasCodAnt;
      this.aP7[0] = pbusagr.this.AV18FlagMFas;
      this.aP8[0] = pbusagr.this.AV19IniProd;
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
      scmdbuf = "" ;
      P00882_A396EmprCod = new String[] {""} ;
      P00882_A129BarCod = new int[1] ;
      P00882_A132BarCodReo = new byte[1] ;
      P00882_A130BarCodPar = new String[] {""} ;
      P00882_A457FasCod = new String[] {""} ;
      P00882_A150BarFacTin = new String[] {""} ;
      P00882_A12360BarFasTOb = new String[] {""} ;
      P00882_n12360BarFasTOb = new boolean[] {false} ;
      P00882_A153BarFasEst = new byte[1] ;
      P00882_A164BarHorFin = new short[1] ;
      P00882_A165BarHorIni = new short[1] ;
      P00882_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P00882_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P00882_A603MaqCodBis = new String[] {""} ;
      P00882_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P00882_n4442BarFasDTI = new boolean[] {false} ;
      P00882_A194BarOrdLin = new short[1] ;
      P00882_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A150BarFacTin = "" ;
      A12360BarFasTOb = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A603MaqCodBis = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      P00883_A396EmprCod = new String[] {""} ;
      P00883_A1142MaqFCod = new String[] {""} ;
      P00883_A602MaqCod = new String[] {""} ;
      A1142MaqFCod = "" ;
      A602MaqCod = "" ;
      AV22HisProDti = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pbusagr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pbusagr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pbusagr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusagr__default(),
         new Object[] {
             new Object[] {
            P00882_A396EmprCod, P00882_A129BarCod, P00882_A132BarCodReo, P00882_A130BarCodPar, P00882_A457FasCod, P00882_A150BarFacTin, P00882_A12360BarFasTOb, P00882_n12360BarFasTOb, P00882_A153BarFasEst, P00882_A164BarHorFin,
            P00882_A165BarHorIni, P00882_A160BarFecRea, P00882_A3298BarFecRIni, P00882_A603MaqCodBis, P00882_A4442BarFasDTI, P00882_n4442BarFasDTI, P00882_A194BarOrdLin, P00882_A758ProCod
            }
            , new Object[] {
            P00883_A396EmprCod, P00883_A1142MaqFCod, P00883_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18FlagMFas ;
   private byte AV23NCLec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A153BarFasEst ;
   private short AV16OrdLinAnt ;
   private short A164BarHorFin ;
   private short A165BarHorIni ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15MaqCod ;
   private String AV17FasCodAnt ;
   private String AV19IniProd ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A150BarFacTin ;
   private String A12360BarFasTOb ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String A1142MaqFCod ;
   private String A602MaqCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV22HisProDti ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n12360BarFasTOb ;
   private boolean n4442BarFasDTI ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00882_A396EmprCod ;
   private int[] P00882_A129BarCod ;
   private byte[] P00882_A132BarCodReo ;
   private String[] P00882_A130BarCodPar ;
   private String[] P00882_A457FasCod ;
   private String[] P00882_A150BarFacTin ;
   private String[] P00882_A12360BarFasTOb ;
   private boolean[] P00882_n12360BarFasTOb ;
   private byte[] P00882_A153BarFasEst ;
   private short[] P00882_A164BarHorFin ;
   private short[] P00882_A165BarHorIni ;
   private java.util.Date[] P00882_A160BarFecRea ;
   private java.util.Date[] P00882_A3298BarFecRIni ;
   private String[] P00882_A603MaqCodBis ;
   private java.util.Date[] P00882_A4442BarFasDTI ;
   private boolean[] P00882_n4442BarFasDTI ;
   private short[] P00882_A194BarOrdLin ;
   private String[] P00882_A758ProCod ;
   private String[] P00883_A396EmprCod ;
   private String[] P00883_A1142MaqFCod ;
   private String[] P00883_A602MaqCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pbusagr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbusagr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbusagr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbusagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00882", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFacTin, BarFasTOb, BarFasEst, BarHorFin, BarHorIni, BarFecRea, BarFecRIni, MaqCodBis, BarFasDTI, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00883", "SELECT EmprCod, MaqFCod, MaqCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00884", "UPDATE TXPBARFAS SET BarFasEst=?, BarHorIni=?, BarFecRea=?, BarFecRIni=?, MaqCodBis=?, BarFasDTI=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P00885", "UPDATE TXPBARFAS SET BarFasEst=?, BarHorIni=?, BarFecRea=?, BarFecRIni=?, MaqCodBis=?, BarFasDTI=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], false);
               }
               stmt.setString(7, (String)parms[7], 3);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 1);
               stmt.setString(11, (String)parms[11], 8);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], false);
               }
               stmt.setString(7, (String)parms[7], 3);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 1);
               stmt.setString(11, (String)parms[11], 8);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               return;
      }
   }

}

