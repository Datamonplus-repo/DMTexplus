package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciepar extends GXProcedure
{
   public pciepar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciepar.class ), "" );
   }

   public pciepar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 )
   {
      pciepar.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 )
   {
      pciepar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pciepar.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pciepar.this.AV15Fecha = aP2[0];
      this.aP2 = aP2;
      pciepar.this.AV16BarCod = aP3[0];
      this.aP3 = aP3;
      pciepar.this.AV17BarReo = aP4[0];
      this.aP4 = aP4;
      pciepar.this.AV18BarPar = aP5[0];
      this.aP5 = aP5;
      pciepar.this.AV19BarOrdLin = aP6[0];
      this.aP6 = aP6;
      pciepar.this.AV20FasCod = aP7[0];
      this.aP7 = aP7;
      pciepar.this.AV21Paro = aP8[0];
      this.aP8 = aP8;
      pciepar.this.AV22Hora = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV31NCLEC ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pciepar.this.GXt_int1 = GXv_int2[0] ;
      AV31NCLEC = GXt_int1 ;
      /* Using cursor P007L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar, A602MaqCod, Short.valueOf(AV19BarOrdLin), AV20FasCod, Short.valueOf(AV21Paro)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A656ParCod = P007L2_A656ParCod[0] ;
         n656ParCod = P007L2_n656ParCod[0] ;
         A461Fase = P007L2_A461Fase[0] ;
         A194BarOrdLin = P007L2_A194BarOrdLin[0] ;
         A130BarCodPar = P007L2_A130BarCodPar[0] ;
         A132BarCodReo = P007L2_A132BarCodReo[0] ;
         A129BarCod = P007L2_A129BarCod[0] ;
         A559HisProHfi = P007L2_A559HisProHfi[0] ;
         A562HisProMfi = P007L2_A562HisProMfi[0] ;
         A556HisProEst = P007L2_A556HisProEst[0] ;
         A4441HisProDTF = P007L2_A4441HisProDTF[0] ;
         n4441HisProDTF = P007L2_n4441HisProDTF[0] ;
         A5608HisProDf = P007L2_A5608HisProDf[0] ;
         A5609HisProHf = P007L2_A5609HisProHf[0] ;
         A3610HisProLot = P007L2_A3610HisProLot[0] ;
         A4440HisProDTI = P007L2_A4440HisProDTI[0] ;
         n4440HisProDTI = P007L2_n4440HisProDTI[0] ;
         A6680HisproTdab = P007L2_A6680HisproTdab[0] ;
         A558HisProFec = P007L2_A558HisProFec[0] ;
         A561HisProLin = P007L2_A561HisProLin[0] ;
         AV32Hisprolot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         if ( (0==A559HisProHfi) )
         {
            A559HisProHfi = (byte)(GXutil.lval( GXutil.substring( GXutil.time( ), 1, 2))) ;
            A562HisProMfi = (byte)(GXutil.lval( GXutil.substring( GXutil.time( ), 4, 2))) ;
            A556HisProEst = (byte)(1) ;
         }
         if ( GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) )
         {
            AV30HisProDti = GXutil.serverNow( context, remoteHandle, pr_default) ;
            AV27HorCar = GXutil.str( GXutil.hour( AV30HisProDti), 10, 0) + ":" + GXutil.str( GXutil.minute( AV30HisProDti), 10, 0) + ":" + GXutil.str( GXutil.second( AV30HisProDti), 10, 0) ;
            AV28HoraServ = localUtil.ctot( AV27HorCar, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV29FecServ = GXutil.resetTime( AV30HisProDti) ;
            A4441HisProDTF = AV30HisProDti ;
            n4441HisProDTF = false ;
            A5608HisProDf = AV29FecServ ;
            A5609HisProHf = GXutil.resetDate(AV28HoraServ) ;
         }
         if ( ! GXutil.dateCompare(GXutil.nullDate(), AV30HisProDti) && ( GXutil.strcmp(A3610HisProLot, AV32Hisprolot) == 0 ) )
         {
            if ( ( GXutil.dtdiff( AV30HisProDti, A4440HisProDTI) / (double) ( 60 ) > 9999 ) )
            {
               A6680HisproTdab = (short)(9999) ;
            }
            else
            {
               A6680HisproTdab = (short)(GXutil.dtdiff( AV30HisProDti, A4440HisProDTI)/ (double) (60)) ;
            }
         }
         /* Using cursor P007L3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), Byte.valueOf(A556HisProEst), Boolean.valueOf(n4441HisProDTF), A4441HisProDTF, A5608HisProDf, A5609HisProHf, Short.valueOf(A6680HisproTdab), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV31NCLEC == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pciepar");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciepar.this.A396EmprCod;
      this.aP1[0] = pciepar.this.A602MaqCod;
      this.aP2[0] = pciepar.this.AV15Fecha;
      this.aP3[0] = pciepar.this.AV16BarCod;
      this.aP4[0] = pciepar.this.AV17BarReo;
      this.aP5[0] = pciepar.this.AV18BarPar;
      this.aP6[0] = pciepar.this.AV19BarOrdLin;
      this.aP7[0] = pciepar.this.AV20FasCod;
      this.aP8[0] = pciepar.this.AV21Paro;
      this.aP9[0] = pciepar.this.AV22Hora;
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
      P007L2_A396EmprCod = new String[] {""} ;
      P007L2_A602MaqCod = new String[] {""} ;
      P007L2_A656ParCod = new short[1] ;
      P007L2_n656ParCod = new boolean[] {false} ;
      P007L2_A461Fase = new String[] {""} ;
      P007L2_A194BarOrdLin = new short[1] ;
      P007L2_A130BarCodPar = new String[] {""} ;
      P007L2_A132BarCodReo = new byte[1] ;
      P007L2_A129BarCod = new int[1] ;
      P007L2_A559HisProHfi = new byte[1] ;
      P007L2_A562HisProMfi = new byte[1] ;
      P007L2_A556HisProEst = new byte[1] ;
      P007L2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P007L2_n4441HisProDTF = new boolean[] {false} ;
      P007L2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P007L2_A5609HisProHf = new java.util.Date[] {GXutil.nullDate()} ;
      P007L2_A3610HisProLot = new String[] {""} ;
      P007L2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P007L2_n4440HisProDTI = new boolean[] {false} ;
      P007L2_A6680HisproTdab = new short[1] ;
      P007L2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P007L2_A561HisProLin = new int[1] ;
      A461Fase = "" ;
      A130BarCodPar = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A5608HisProDf = GXutil.nullDate() ;
      A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      A3610HisProLot = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV32Hisprolot = "" ;
      AV30HisProDti = GXutil.resetTime( GXutil.nullDate() );
      AV27HorCar = "" ;
      AV28HoraServ = GXutil.resetTime( GXutil.nullDate() );
      AV29FecServ = GXutil.nullDate() ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pciepar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pciepar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pciepar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciepar__default(),
         new Object[] {
             new Object[] {
            P007L2_A396EmprCod, P007L2_A602MaqCod, P007L2_A656ParCod, P007L2_n656ParCod, P007L2_A461Fase, P007L2_A194BarOrdLin, P007L2_A130BarCodPar, P007L2_A132BarCodReo, P007L2_A129BarCod, P007L2_A559HisProHfi,
            P007L2_A562HisProMfi, P007L2_A556HisProEst, P007L2_A4441HisProDTF, P007L2_n4441HisProDTF, P007L2_A5608HisProDf, P007L2_A5609HisProHf, P007L2_A3610HisProLot, P007L2_A4440HisProDTI, P007L2_n4440HisProDTI, P007L2_A6680HisproTdab,
            P007L2_A558HisProFec, P007L2_A561HisProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV31NCLEC ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A559HisProHfi ;
   private byte A562HisProMfi ;
   private byte A556HisProEst ;
   private short AV19BarOrdLin ;
   private short AV21Paro ;
   private short A656ParCod ;
   private short A194BarOrdLin ;
   private short A6680HisproTdab ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV18BarPar ;
   private String AV20FasCod ;
   private String AV22Hora ;
   private String scmdbuf ;
   private String A461Fase ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String AV32Hisprolot ;
   private String AV27HorCar ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A5609HisProHf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV30HisProDti ;
   private java.util.Date AV28HoraServ ;
   private java.util.Date AV15Fecha ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV29FecServ ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P007L2_A396EmprCod ;
   private String[] P007L2_A602MaqCod ;
   private short[] P007L2_A656ParCod ;
   private boolean[] P007L2_n656ParCod ;
   private String[] P007L2_A461Fase ;
   private short[] P007L2_A194BarOrdLin ;
   private String[] P007L2_A130BarCodPar ;
   private byte[] P007L2_A132BarCodReo ;
   private int[] P007L2_A129BarCod ;
   private byte[] P007L2_A559HisProHfi ;
   private byte[] P007L2_A562HisProMfi ;
   private byte[] P007L2_A556HisProEst ;
   private java.util.Date[] P007L2_A4441HisProDTF ;
   private boolean[] P007L2_n4441HisProDTF ;
   private java.util.Date[] P007L2_A5608HisProDf ;
   private java.util.Date[] P007L2_A5609HisProHf ;
   private String[] P007L2_A3610HisProLot ;
   private java.util.Date[] P007L2_A4440HisProDTI ;
   private boolean[] P007L2_n4440HisProDTI ;
   private short[] P007L2_A6680HisproTdab ;
   private java.util.Date[] P007L2_A558HisProFec ;
   private int[] P007L2_A561HisProLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pciepar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pciepar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pciepar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pciepar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007L2", "SELECT EmprCod, MaqCod, ParCod, Fase, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProHfi, HisProMfi, HisProEst, HisProDTF, HisProDf, HisProHf, HisProLot, HisProDTI, HisproTdab, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MaqCod = ?) AND (BarOrdLin = ?) AND (Fase = ?) AND (ParCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P007L3", "UPDATE TXPLHIPRO SET HisProHfi=?, HisProMfi=?, HisProEst=?, HisProDTF=?, HisProDf=?, HisProHf=?, HisproTdab=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(14));
               ((String[]) buf[16])[0] = rslt.getString(15, 10);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
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
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               stmt.setDate(5, (java.util.Date)parms[5]);
               stmt.setDateTime(6, (java.util.Date)parms[6], true);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 3);
               stmt.setString(9, (String)parms[9], 6);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setInt(11, ((Number) parms[11]).intValue());
               return;
      }
   }

}

